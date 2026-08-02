package com.vk.profile.questions.impl;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.appbar.NonBouncedAppBarLayout;
import com.vk.api.generated.questions.dto.QuestionsQuestionDto;
import com.vk.core.fragments.BaseMvpFragment;
import com.vk.core.view.components.button.VkButton;
import com.vk.core.view.components.topbar.VkTopBar;
import com.vk.dto.common.id.UserId;
import com.vk.lists.AbstractPaginatedView;
import com.vk.lists.c;
import com.vk.profile.questions.impl.QuestionsListFragment;
import com.vk.profile.questions.impl.a;
import com.vk.stat.scheme.SchemeStat$TypeQuestionItem;
import com.vk.story.viewer.api.StoryViewerRouter;
import com.vkontakte.android.R;
import defpackage.k0;
import java.util.ArrayList;
import java.util.Arrays;
import kotlin.LazyThreadSafetyMode;
import xsna.a0a;
import xsna.b410;
import xsna.b8g;
import xsna.bi80;
import xsna.by20;
import xsna.c5g;
import xsna.cn70;
import xsna.cqm0;
import xsna.dhk0;
import xsna.dj60;
import xsna.e3m;
import xsna.epx;
import xsna.gd40;
import xsna.gko;
import xsna.gz30;
import xsna.h73;
import xsna.i0r;
import xsna.i73;
import xsna.j9x;
import xsna.k9x;
import xsna.kqe0;
import xsna.kr50;
import xsna.mpe0;
import xsna.mqe0;
import xsna.msy;
import xsna.nr4;
import xsna.o0r0;
import xsna.o25;
import xsna.oq;
import xsna.or1;
import xsna.or50;
import xsna.oz50;
import xsna.p870;
import xsna.pnz;
import xsna.qdz;
import xsna.qqe0;
import xsna.rf20;
import xsna.rzd0;
import xsna.spe0;
import xsna.tlo0;
import xsna.tq;
import xsna.tu80;
import xsna.u730;
import xsna.ue9;
import xsna.ulz;
import xsna.vdx;
import xsna.wmd0;
import xsna.y8g0;

/* compiled from: QuestionsListFragment.kt */
/* loaded from: classes5.dex */
public final class QuestionsListFragment extends BaseMvpFragment<kqe0> {
    public static final /* synthetic */ int f0 = 0;
    public QuestionsUsableRecyclerPaginatedView T;
    public com.vk.lists.c U;
    public VkTopBar V;
    public VkButton W;
    public final f X = new f(new b());
    public final vdx Y = new vdx(this, 1);
    public final rzd0 Z = new rzd0(this, 1);
    public final Object a0;
    public final Object b0;
    public final Object c0;
    public final Object d0;
    public final Object e0;

    /* compiled from: QuestionsListFragment.kt */
    public static final class a extends oz50 {
        public a() {
            super(QuestionsListFragment.class, null, null);
        }
    }

    /* compiled from: QuestionsListFragment.kt */
    public static final class b implements qqe0 {
        public b() {
        }

        /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, kotlin.Lazy] */
        @Override // xsna.qqe0
        public final void a(long j) {
            QuestionsListFragment questionsListFragment = QuestionsListFragment.this;
            ((qdz) questionsListFragment.d0.getValue()).f().a(questionsListFragment.requireContext(), k0.a(j, "https://vk.me/id"), false);
        }

        @Override // xsna.qqe0
        public final void b(final d dVar) {
            String e;
            int i = QuestionsListFragment.f0;
            final QuestionsListFragment questionsListFragment = QuestionsListFragment.this;
            or1 or1Var = new or1(questionsListFragment.requireContext());
            Boolean j = dVar.b().j();
            Boolean bool = Boolean.TRUE;
            boolean f = epx.f(j, bool);
            if (!f) {
                String N0 = dVar.a().N0();
                if (N0 == null) {
                    N0 = "";
                }
                or1Var.b(new ue9(3, questionsListFragment, dVar), y8g0.f(R.string.questions_menu_open_profile, N0));
            }
            or1Var.a(R.string.questions_report, new h73(5, questionsListFragment, dVar));
            final boolean f2 = epx.f(dVar.b().k(), bool);
            if (f2) {
                if (f) {
                    e = y8g0.e(R.string.questions_menu_unblock_anonymously);
                } else {
                    String N02 = dVar.a().N0();
                    e = y8g0.f(R.string.questions_menu_unblock, N02 != null ? N02 : "");
                }
            } else if (f) {
                e = y8g0.e(R.string.questions_menu_block_anonymously);
            } else {
                String N03 = dVar.a().N0();
                e = y8g0.f(R.string.questions_menu_block, N03 != null ? N03 : "");
            }
            or1Var.b(new Runnable() { // from class: xsna.lqe0
                @Override // java.lang.Runnable
                public final void run() {
                    int i2 = QuestionsListFragment.f0;
                    boolean z = f2;
                    QuestionsListFragment questionsListFragment2 = questionsListFragment;
                    com.vk.profile.questions.impl.d dVar2 = dVar;
                    if (z) {
                        kqe0 kqe0Var = (kqe0) questionsListFragment2.S;
                        if (kqe0Var != null) {
                            kqe0Var.kb(dVar2, false);
                        }
                        QuestionsListFragment.mo(SchemeStat$TypeQuestionItem.Type.UNBLOCK, dVar2.b());
                        return;
                    }
                    kqe0 kqe0Var2 = (kqe0) questionsListFragment2.S;
                    if (kqe0Var2 != null) {
                        kqe0Var2.kb(dVar2, true);
                    }
                    QuestionsListFragment.mo(SchemeStat$TypeQuestionItem.Type.BLOCK, dVar2.b());
                }
            }, e);
            or1Var.a(R.string.questions_menu_delete, new i73(6, questionsListFragment, dVar));
            or1Var.d();
        }

        @Override // xsna.qqe0
        public final void c(d dVar) {
            UserId s1 = dVar.a().s1();
            int i = QuestionsListFragment.f0;
            QuestionsListFragment.this.ko(s1);
        }

        @Override // xsna.qqe0
        public final void d(d dVar) {
            kqe0 kqe0Var = (kqe0) QuestionsListFragment.this.S;
            if (kqe0Var != null) {
                kqe0Var.Dl(dVar);
            }
        }

        @Override // xsna.qqe0
        public final void e(d dVar, AnswerSource answerSource) {
            new a.C1671a(QuestionsListFragment.this.requireContext(), dVar.a(), dVar.b(), answerSource).I0(null);
        }

        @Override // xsna.qqe0
        public final void f(d dVar) {
            kqe0 kqe0Var = (kqe0) QuestionsListFragment.this.S;
            if (kqe0Var != null) {
                kqe0Var.Mi(dVar);
            }
        }

        @Override // xsna.qqe0
        public final void g(d dVar) {
            QuestionsListFragment questionsListFragment = QuestionsListFragment.this;
            P p = questionsListFragment.S;
            com.vk.lists.c cVar = questionsListFragment.U;
            if (p == 0 || cVar == null) {
                return;
            }
            ((kqe0) p).an(dVar, cVar);
        }

        @Override // xsna.qqe0
        public final void l1(d dVar) {
            kqe0 kqe0Var = (kqe0) QuestionsListFragment.this.S;
            if (kqe0Var != null) {
                kqe0Var.l1(dVar);
            }
        }
    }

    public QuestionsListFragment() {
        tu80 tu80Var = new tu80(this, 16);
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.NONE;
        this.a0 = msy.a(lazyThreadSafetyMode, tu80Var);
        this.b0 = msy.a(lazyThreadSafetyMode, new dj60(this, 19));
        this.c0 = msy.a(lazyThreadSafetyMode, new bi80(this, 10));
        this.d0 = msy.a(lazyThreadSafetyMode, new wmd0(this, 3));
        this.e0 = msy.a(lazyThreadSafetyMode, new gd40(this, 18));
    }

    public static void mo(SchemeStat$TypeQuestionItem.Type type, QuestionsQuestionDto questionsQuestionDto) {
        mpe0.b(type, questionsQuestionDto != null ? questionsQuestionDto.g() : null, questionsQuestionDto != null ? questionsQuestionDto.i() : null, questionsQuestionDto != null ? Integer.valueOf(questionsQuestionDto.getId()) : null, null, null, 48);
    }

    public final VkTopBar.Middle.Text jo(String str) {
        return new VkTopBar.Middle.Text(new VkTopBar.Middle.Text.Title(oq.d(tlo0.Companion, getString(R.string.questions_list_title)), new mqe0(this, 0), null, null, null, 28), str != null ? new VkTopBar.Middle.Text.c(new tlo0.h(str), null, com.vk.core.compose.component.semantics.b.a(null, new or50(str, 14), 3), 14) : null, null, com.vk.core.compose.component.semantics.b.a(null, new ulz(20), 3), 4);
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, kotlin.Lazy] */
    public final void ko(UserId userId) {
        ((o0r0) this.c0.getValue()).m(requireContext(), userId, new o0r0.a(true, null, null, null, null, null, null, false, false, false, false, null, null, null, 65534));
    }

    public final void lo() {
        mpe0.b(SchemeStat$TypeQuestionItem.Type.SHARING, null, null, null, null, null, 48);
        nr4.b().v(requireContext(), String.format("https://%s/question/ask", Arrays.copyOf(new Object[]{a0a.d}, 1)) + o25.a().c().b, cqm0.m("PROFILE_QUESTION"));
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.vk.core.fragments.BaseFragment, com.vk.core.fragments.FragmentImpl, androidx.fragment.app.d, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.S = new h(this, (StoryViewerRouter) this.b0.getValue());
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return layoutInflater.inflate(R.layout.questions_list_fragment, viewGroup, false);
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.vk.core.fragments.BaseMvpFragment, com.vk.core.fragments.BaseFragment, com.vk.core.fragments.FragmentImpl, androidx.fragment.app.d, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        this.T = null;
        this.U = null;
        this.V = null;
        this.W = null;
        super.onDestroyView();
        ?? r0 = this.a0;
        ((p870) r0.getValue()).g(this.Y);
        ((p870) r0.getValue()).g(this.Z);
    }

    /* JADX WARN: Type inference failed for: r14v4, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.vk.core.fragments.BaseMvpFragment, com.vk.core.fragments.FragmentImpl, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        VkTopBar vkTopBar = (VkTopBar) view.findViewById(R.id.toolbar);
        int i = 19;
        if (vkTopBar != null) {
            vkTopBar.setTransitionHeaderColor(VkTopBar.m.b.a);
            vkTopBar.setBack(new VkTopBar.b(new rf20(this, i), tq.h(tlo0.Companion, R.string.accessibility_back), null, null, com.vk.core.compose.component.semantics.b.a(null, new i0r(15), 3), 12));
            vkTopBar.setMiddle(jo(null));
            gko.b bVar = gko.Companion;
            vkTopBar.setAfter(VkTopBar.a.C0875a.a(new VkTopBar.a.c.f(new gko(R.drawable.vk_icon_settings_outline_28), new tlo0.f(R.string.questions_accessibility_settings), new by20(this, 24), null, new b8g(e3m.f(R.attr.vk_ui_icon_accent, requireContext())), com.vk.core.compose.component.semantics.b.a(null, new gz30(12), 3), 8), null, 6));
        } else {
            vkTopBar = null;
        }
        this.V = vkTopBar;
        NonBouncedAppBarLayout nonBouncedAppBarLayout = (NonBouncedAppBarLayout) view.findViewById(R.id.questions_list_appbar);
        VkButton vkButton = (VkButton) view.findViewById(R.id.share_button);
        vkButton.setOnClickListener(new com.vk.im.video.d(this, 10));
        vkButton.post(new pnz(vkButton, this, nonBouncedAppBarLayout, 2));
        this.W = vkButton;
        QuestionsUsableRecyclerPaginatedView questionsUsableRecyclerPaginatedView = (QuestionsUsableRecyclerPaginatedView) view.findViewById(R.id.questions_list);
        AbstractPaginatedView.LayoutType layoutType = AbstractPaginatedView.LayoutType.LINEAR;
        questionsUsableRecyclerPaginatedView.getClass();
        new AbstractPaginatedView.d(layoutType, questionsUsableRecyclerPaginatedView).a();
        RecyclerView.o layoutManager = questionsUsableRecyclerPaginatedView.getRecyclerView().getLayoutManager();
        LinearLayoutManager linearLayoutManager = layoutManager instanceof LinearLayoutManager ? (LinearLayoutManager) layoutManager : null;
        if (linearLayoutManager != null) {
            linearLayoutManager.l = true;
        }
        f fVar = this.X;
        questionsUsableRecyclerPaginatedView.setAdapter(fVar);
        questionsUsableRecyclerPaginatedView.setSwipeRefreshEnabled(true);
        questionsUsableRecyclerPaginatedView.setOnEmptyViewRefreshListener(new u730(this, 9));
        questionsUsableRecyclerPaginatedView.setOnReloadRetryClickListener(new kr50(this, i));
        questionsUsableRecyclerPaginatedView.setItemDecoration(new dhk0(0, cn70.b(12), 0, 0));
        questionsUsableRecyclerPaginatedView.getRecyclerView().setPadding(0, cn70.b(4), 0, cn70.b(16));
        questionsUsableRecyclerPaginatedView.getRecyclerView().setClipToPadding(false);
        questionsUsableRecyclerPaginatedView.setOnClickInviteFriends(new b410(this, 21));
        this.T = questionsUsableRecyclerPaginatedView;
        c.h hVar = new c.h((c.m) this.S);
        hVar.i = 20;
        this.U = com.vk.lists.f.a(hVar, questionsUsableRecyclerPaginatedView);
        ?? r14 = this.a0;
        ((p870) r14.getValue()).b(102, this.Y);
        ((p870) r14.getValue()).b(123, this.Z);
        k9x k9xVar = new k9x(1, 10, 1);
        ArrayList arrayList = new ArrayList(c5g.u(k9xVar, 10));
        j9x it = k9xVar.iterator();
        while (it.d) {
            it.nextInt();
            arrayList.add(new spe0());
        }
        fVar.setItems(arrayList);
        QuestionsUsableRecyclerPaginatedView questionsUsableRecyclerPaginatedView2 = this.T;
        if (questionsUsableRecyclerPaginatedView2 != null) {
            questionsUsableRecyclerPaginatedView2.gl();
        }
        QuestionsUsableRecyclerPaginatedView questionsUsableRecyclerPaginatedView3 = this.T;
        if (questionsUsableRecyclerPaginatedView3 != null) {
            questionsUsableRecyclerPaginatedView3.f0();
        }
    }
}
