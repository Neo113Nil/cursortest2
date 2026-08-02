package com.vk.topics.impl.fragments;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.os.Bundle;
import android.text.ClipboardManager;
import android.view.View;
import android.view.Window;
import android.widget.LinearLayout;
import androidx.fragment.app.FragmentActivity;
import androidx.recyclerview.widget.RecyclerView;
import com.vk.api.generated.base.dto.BaseUserGroupFieldsDto;
import com.vk.api.generated.board.dto.BoardGetTopicsExtendedPreviewDto;
import com.vk.api.generated.groups.dto.GroupsFieldsDto;
import com.vk.community.strikes.api.di.CommunityStrikesComponent;
import com.vk.core.view.components.formitem.VkInputSelect;
import com.vk.core.view.components.topbar.VkTopBar;
import com.vk.dto.common.data.VKList;
import com.vk.dto.common.id.UserId;
import com.vk.dto.group.Group;
import com.vk.topics.impl.fragments.BoardTopicViewFragment;
import com.vk.topics.impl.fragments.c;
import com.vkontakte.android.R;
import com.vkontakte.android.api.ExtendedCommunityProfile;
import com.vkontakte.android.fragments.CardRecyclerFragment;
import defpackage.f;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import kotlin.LazyThreadSafetyMode;
import xsna.a0a;
import xsna.abg0;
import xsna.bi7;
import xsna.bpn0;
import xsna.bv0;
import xsna.cvk;
import xsna.dhr0;
import xsna.di7;
import xsna.dz2;
import xsna.e43;
import xsna.epx;
import xsna.fj7;
import xsna.fkq0;
import xsna.fnj;
import xsna.fpf0;
import xsna.gi7;
import xsna.gj7;
import xsna.gko;
import xsna.h7u0;
import xsna.hg1;
import xsna.hi7;
import xsna.hj7;
import xsna.iah0;
import xsna.ii7;
import xsna.ij7;
import xsna.in0;
import xsna.itg0;
import xsna.ji0;
import xsna.jj7;
import xsna.jv;
import xsna.jx2;
import xsna.lj7;
import xsna.m7m;
import xsna.mh;
import xsna.mj7;
import xsna.msy;
import xsna.o25;
import xsna.oz50;
import xsna.p0e0;
import xsna.pro0;
import xsna.pu;
import xsna.pvo0;
import xsna.rl2;
import xsna.rpj0;
import xsna.rsg0;
import xsna.t6g0;
import xsna.th7;
import xsna.tlo0;
import xsna.tq;
import xsna.xqu;
import xsna.yfb;
import xsna.z4;

/* compiled from: BoardTopicsFragment.kt */
/* loaded from: classes6.dex */
public final class BoardTopicsFragment extends CardRecyclerFragment<ii7> implements c.d {
    public static final /* synthetic */ int S0 = 0;
    public boolean J0;
    public boolean K0;
    public Group L0;
    public int M0;
    public final Object N0;
    public final bpn0 O0;
    public final bpn0 P0;
    public final bpn0 Q0;
    public VkTopBar R0;

    /* compiled from: BoardTopicsFragment.kt */
    public final class a extends d {
        public a(ii7 ii7Var) {
            super(ii7Var);
        }

        @Override // com.vk.topics.impl.fragments.BoardTopicsFragment.d
        public final String[] a() {
            ArrayList arrayList = new ArrayList();
            int i = BoardTopicsFragment.S0;
            BoardTopicsFragment boardTopicsFragment = BoardTopicsFragment.this;
            arrayList.add(boardTopicsFragment.getResources().getString(R.string.delete));
            Resources resources = boardTopicsFragment.getResources();
            ii7 ii7Var = this.a;
            arrayList.add(resources.getString((ii7Var.g & 1) > 0 ? R.string.open_topic : R.string.close_topic));
            arrayList.add(boardTopicsFragment.getResources().getString((ii7Var.g & 2) > 0 ? R.string.unfix_topic : R.string.fix_topic));
            arrayList.add(boardTopicsFragment.getResources().getString(R.string.copy_link));
            return (String[]) arrayList.toArray(new String[0]);
        }

        /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, kotlin.Lazy] */
        @Override // com.vk.topics.impl.fragments.BoardTopicsFragment.d
        public final void b(int i) {
            BoardTopicsFragment boardTopicsFragment = BoardTopicsFragment.this;
            ?? r1 = boardTopicsFragment.N0;
            ii7 ii7Var = this.a;
            if (i == 0) {
                BoardTopicsFragment.Ko(boardTopicsFragment, ii7Var);
                return;
            }
            if (i != 1) {
                if (i == 2) {
                    int i2 = BoardTopicsFragment.S0;
                    boolean z = (ii7Var.g & 2) > 0;
                    itg0.c(hg1.n(rsg0.D0(yfb.x(z ? ((gi7) r1.getValue()).d(ii7Var.a, boardTopicsFragment.No()) : ((gi7) r1.getValue()).c(ii7Var.a, boardTopicsFragment.No()))), boardTopicsFragment.getActivity(), false, null, 62).subscribe(new jv(new jj7(boardTopicsFragment, ii7Var, z), 7), new gj7(mj7.b, 0)), boardTopicsFragment);
                    return;
                } else {
                    if (i != 3) {
                        return;
                    }
                    int i3 = BoardTopicsFragment.S0;
                    boardTopicsFragment.Lo(ii7Var);
                    return;
                }
            }
            int i4 = BoardTopicsFragment.S0;
            boolean z2 = (ii7Var.g & 1) > 0;
            UserId No = boardTopicsFragment.No();
            int i5 = ii7Var.a;
            th7 th7Var = new th7(!z2 ? "board.closeTopic" : "board.openTopic");
            th7Var.F(No, "group_id");
            th7Var.C(i5, "topic_id");
            jx2 jx2Var = new jx2(th7Var, new lj7(boardTopicsFragment, ii7Var, z2));
            jx2Var.g = boardTopicsFragment.getActivity();
            jx2Var.a();
        }
    }

    /* compiled from: BoardTopicsFragment.kt */
    public static final class b extends oz50 {
        public b(UserId userId) {
            super(BoardTopicsFragment.class, null, null);
            this.j.putParcelable("group_id", userId);
        }

        public final void y(boolean z) {
            this.j.putBoolean("open_for_add", z);
        }
    }

    /* compiled from: BoardTopicsFragment.kt */
    public final class c extends d {
        public c(ii7 ii7Var) {
            super(ii7Var);
        }

        @Override // com.vk.topics.impl.fragments.BoardTopicsFragment.d
        public final String[] a() {
            ArrayList arrayList = new ArrayList();
            int i = BoardTopicsFragment.S0;
            BoardTopicsFragment boardTopicsFragment = BoardTopicsFragment.this;
            arrayList.add(boardTopicsFragment.getResources().getString(R.string.delete));
            arrayList.add(boardTopicsFragment.getResources().getString(R.string.copy_link));
            return (String[]) arrayList.toArray(new String[0]);
        }

        @Override // com.vk.topics.impl.fragments.BoardTopicsFragment.d
        public final void b(int i) {
            ii7 ii7Var = this.a;
            BoardTopicsFragment boardTopicsFragment = BoardTopicsFragment.this;
            if (i == 0) {
                BoardTopicsFragment.Ko(boardTopicsFragment, ii7Var);
            } else {
                if (i != 1) {
                    return;
                }
                int i2 = BoardTopicsFragment.S0;
                boardTopicsFragment.Lo(ii7Var);
            }
        }
    }

    /* compiled from: BoardTopicsFragment.kt */
    public static abstract class d {
        public final ii7 a;

        public d(ii7 ii7Var) {
            this.a = ii7Var;
        }

        public abstract String[] a();

        public abstract void b(int i);
    }

    /* compiled from: BoardTopicsFragment.kt */
    public static final class e extends rpj0<di7> {
        public e() {
            super(BoardTopicsFragment.this);
        }

        @Override // xsna.hx2
        public final void b(Object obj) {
            VkTopBar vkTopBar;
            di7 di7Var = (di7) obj;
            fj7 fj7Var = di7Var.a;
            VKList<ii7> vKList = fj7Var.a;
            BoardTopicsFragment boardTopicsFragment = BoardTopicsFragment.this;
            boardTopicsFragment.zo(vKList);
            boardTopicsFragment.L0 = di7Var.b;
            boolean z = fj7Var.b;
            boardTopicsFragment.J0 = z;
            if (z && (vkTopBar = boardTopicsFragment.R0) != null) {
                vkTopBar.setAfter(VkTopBar.a.C0875a.a(new VkTopBar.a.c.f(new gko(R.drawable.vk_icon_add_outline_28), tq.h(tlo0.Companion, R.string.create), new f(boardTopicsFragment, 5), null, null, null, 56), null, 6));
            }
            boardTopicsFragment.M0 = fj7Var.c;
            boardTopicsFragment.i0 = null;
        }
    }

    public BoardTopicsFragment() {
        super(20);
        this.N0 = msy.a(LazyThreadSafetyMode.NONE, new bv0(3));
        this.O0 = new bpn0(new ji0(this, 9));
        this.P0 = new bpn0(new in0(this, 10));
        this.Q0 = new bpn0(new z4(this, 11));
    }

    public static final void Ko(BoardTopicsFragment boardTopicsFragment, ii7 ii7Var) {
        h7u0.a aVar = new h7u0.a(boardTopicsFragment.requireContext());
        aVar.g0(R.string.delete_topic_title);
        aVar.U(R.string.delete_topic_confirm);
        aVar.c0(R.string.yes, new hj7(0, boardTopicsFragment, ii7Var));
        aVar.W(R.string.no, null);
        aVar.m();
    }

    @Override // com.vk.topics.impl.fragments.c.d
    public final void L4(ii7 ii7Var) {
        Group group = this.L0;
        if (group == null) {
            group = t6g0.b().C0(fkq0.a(No()));
        }
        int i = group != null ? group.s : 0;
        if (i != 2 && i != 3 && (!this.J0 || !epx.f(ii7Var.h, o25.a().o().a))) {
            Lo(ii7Var);
            return;
        }
        d aVar = (i == 2 || i == 3) ? new a(ii7Var) : new c(ii7Var);
        h7u0.a aVar2 = new h7u0.a(requireContext());
        aVar2.T(aVar.a(), new ij7(aVar));
        aVar2.m();
    }

    public final void Lo(ii7 ii7Var) {
        ((ClipboardManager) requireContext().getSystemService("clipboard")).setText("https://" + a0a.d + "/topic" + (-No().b) + '_' + ii7Var.a);
        cvk.u(R.string.link_copied, false);
    }

    public final void Mo() {
        FragmentActivity activity;
        Window window;
        if (!((CommunityStrikesComponent) m7m.d(this).a(fpf0.a(CommunityStrikesComponent.class))).ge().b(requireContext(), fkq0.e(No()), ExtendedCommunityProfile.StrikesRestriction.StrikeRestrictionType.DISCUSSIONS) || (activity = getActivity()) == null) {
            return;
        }
        VkInputSelect vkInputSelect = new VkInputSelect(activity, null, 6);
        vkInputSelect.setHint(R.string.enter_topic_title);
        abg0 abg0Var = dhr0.t;
        vkInputSelect.setTextColor(abg0Var.c(R.attr.vk_ui_text_primary));
        vkInputSelect.setHintTextColor(abg0Var.c(R.attr.vk_ui_text_secondary));
        vkInputSelect.setMaxLines(5);
        VkInputSelect vkInputSelect2 = new VkInputSelect(activity, null, 6);
        vkInputSelect2.setHint(R.string.enter_topic_description);
        vkInputSelect2.setTextColor(abg0Var.c(R.attr.vk_ui_text_primary));
        vkInputSelect2.setHintTextColor(abg0Var.c(R.attr.vk_ui_text_secondary));
        vkInputSelect2.setMaxLines(5);
        View view = new View(activity);
        view.setBackgroundColor(abg0Var.c(R.attr.vk_ui_separator_primary_alpha));
        int a2 = iah0.a(1);
        LinearLayout linearLayout = new LinearLayout(requireContext());
        linearLayout.setOrientation(1);
        int a3 = iah0.a(10);
        int a4 = iah0.a(20);
        linearLayout.setPadding(a4, a3, a4, a3);
        linearLayout.addView(vkInputSelect);
        linearLayout.addView(view, new LinearLayout.LayoutParams(-1, a2));
        linearLayout.addView(vkInputSelect2);
        h7u0.a aVar = new h7u0.a(requireContext(), R.style.VkAlertDialogNewTheme, null, 4);
        aVar.g0(R.string.create_topic);
        aVar.f = linearLayout;
        aVar.c0(R.string.create_topic_button_ok, new com.vk.topics.impl.fragments.b(this, vkInputSelect, vkInputSelect2, activity));
        aVar.W(R.string.create_topic_button_cancel, null);
        androidx.appcompat.app.d m = aVar.m();
        if (m == null || (window = m.getWindow()) == null) {
            return;
        }
        window.clearFlags(131080);
    }

    public final UserId No() {
        return (UserId) this.Q0.getValue();
    }

    @Override // com.vk.topics.impl.fragments.c.d
    public final void a6(ii7 ii7Var, boolean z) {
        Group group = this.L0;
        if (group == null) {
            group = t6g0.b().C0(fkq0.a(No()));
        }
        boolean z2 = group != null && group.i;
        BoardTopicViewFragment.a aVar = new BoardTopicViewFragment.a(ii7Var.a, No(), ii7Var.b);
        aVar.y(z2);
        aVar.z((ii7Var.g & 1) > 0);
        aVar.A(ii7Var.c, z);
        aVar.k(getActivity());
    }

    @Override // com.vk.core.fragments.FragmentImpl, androidx.fragment.app.Fragment
    public final void onActivityResult(int i, int i2, Intent intent) {
        if (intent != null && i == 1 && i2 == -1) {
            int i3 = 0;
            ii7 ii7Var = new ii7(0);
            ii7Var.a = intent.getIntExtra("id", 0);
            int a2 = pvo0.a();
            ii7Var.d = a2;
            ii7Var.e = a2;
            ii7Var.b = intent.getStringExtra("title");
            ii7Var.f = o25.a().o().a;
            ii7Var.c = 1;
            ii7Var.h = o25.a().o().a;
            ArrayList<T> arrayList = this.v0;
            int size = arrayList.size();
            while (true) {
                if (i3 >= size) {
                    break;
                }
                if ((((ii7) arrayList.get(i3)).g & 2) == 0) {
                    arrayList.add(i3, ii7Var);
                    break;
                }
                i3++;
            }
            q();
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onAttach(Activity activity) {
        super.onAttach(activity);
        p0e0.b(fkq0.e(No()), "board_group");
        qo();
        setTitle(R.string.topics);
        t6g0 t6g0Var = t6g0.b;
        t6g0.d().h();
    }

    @Override // me.grishka.appkit.fragments.LoaderFragment, com.vk.core.fragments.FragmentImpl, androidx.fragment.app.Fragment
    public final void onDestroy() {
        super.onDestroy();
        io.reactivex.rxjava3.disposables.c cVar = this.i0;
        if (cVar != null) {
            cVar.dispose();
        }
    }

    @Override // com.vk.core.fragments.FragmentImpl, androidx.fragment.app.Fragment
    public final void onResume() {
        super.onResume();
        q();
        if (this.K0) {
            this.K0 = false;
            Do();
        }
    }

    @Override // com.vkontakte.android.fragments.CardRecyclerFragment, com.vkontakte.android.fragments.VKRecyclerFragment, me.grishka.appkit.fragments.AppKitFragment, com.vk.core.fragments.FragmentImpl, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        Bundle arguments = getArguments();
        if (arguments != null && arguments.getBoolean("open_for_add", false)) {
            Mo();
            arguments.remove("open_for_add");
        }
        VkTopBar vkTopBar = new VkTopBar(requireContext(), null, 6, 0);
        this.R0 = vkTopBar;
        Context requireContext = requireContext();
        HashSet hashSet = iah0.a;
        if (!fnj.d(requireContext)) {
            vkTopBar.setBack(new VkTopBar.b(new mh(this, 12), tq.h(tlo0.Companion, R.string.talkback_ic_back), null, null, null, 28));
        }
        vkTopBar.setMiddle(new VkTopBar.Middle.Text(new VkTopBar.Middle.Text.Title(tq.h(tlo0.Companion, R.string.topics), null, null, null, null, 30), null, null, null, 14));
        jo(vkTopBar);
    }

    @Override // me.grishka.appkit.fragments.BaseRecyclerFragment, xsna.w1d0.a
    public final void q() {
        pro0.f(new pu(this, 13));
    }

    @Override // me.grishka.appkit.fragments.BaseRecyclerFragment
    public final void vo(int i, int i2) {
        rsg0 y;
        boolean z = this.L0 == null;
        UserId No = No();
        if (z) {
            dz2 x = yfb.x(new hi7().b(No, Integer.valueOf(i), Integer.valueOf(i2), BoardGetTopicsExtendedPreviewDto.LAST, e43.l(BaseUserGroupFieldsDto.SEX, BaseUserGroupFieldsDto.ONLINE, BaseUserGroupFieldsDto.SCREEN_NAME, BaseUserGroupFieldsDto.PHOTO_BASE)));
            List singletonList = Collections.singletonList(No);
            List singletonList2 = Collections.singletonList(GroupsFieldsDto.MEMBER_STATUS);
            if ((4 & 2) != 0) {
                singletonList2 = null;
            }
            y = new bi7(x, yfb.x(xqu.a.a(null, singletonList, singletonList2)));
        } else {
            y = yfb.y(new hi7().b(No, Integer.valueOf(i), Integer.valueOf(i2), BoardGetTopicsExtendedPreviewDto.LAST, e43.l(BaseUserGroupFieldsDto.SEX, BaseUserGroupFieldsDto.ONLINE, BaseUserGroupFieldsDto.SCREEN_NAME, BaseUserGroupFieldsDto.PHOTO_BASE)), new rl2(3));
        }
        this.i0 = new jx2(y, new e()).a();
    }

    @Override // me.grishka.appkit.fragments.BaseRecyclerFragment
    public final RecyclerView.Adapter<?> wo() {
        return (com.vk.topics.impl.fragments.d) this.O0.getValue();
    }
}
