package com.vk.stories.design.view.stats.tabs.stickers.mvi;

import android.app.Dialog;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.Window;
import androidx.fragment.app.Fragment;
import com.vk.core.view.components.button.VkButton;
import com.vk.dto.common.id.UserId;
import com.vk.dto.polls.Poll;
import com.vk.dto.polls.PollOption;
import com.vk.dto.stories.model.StoryEntry;
import com.vk.dto.stories.model.StoryQuestionEntry;
import com.vk.dto.user.UserProfile;
import com.vk.mvi.androidx.MviImplFragment;
import com.vk.poll.fragments.PollVotersFragment;
import com.vk.stat.scheme.MobileOfficialAppsConStoriesStat$ViewEntryPoint;
import com.vk.stat.scheme.MobileOfficialAppsCoreNavStat$EventScreen;
import com.vk.stat.scheme.t0;
import com.vk.stories.design.view.stats.tabs.recycler.TabRecyclerPaginatedView;
import com.vk.stories.design.view.stats.tabs.stickers.mvi.a;
import com.vk.stories.design.view.stats.tabs.stickers.mvi.j;
import com.vkontakte.android.R;
import java.util.ArrayList;
import kotlin.LazyThreadSafetyMode;
import kotlin.NoWhenBranchMatchedException;
import xsna.ahm0;
import xsna.anm0;
import xsna.ao50;
import xsna.av20;
import xsna.bpn0;
import xsna.bwt0;
import xsna.cn70;
import xsna.dac0;
import xsna.dhr0;
import xsna.dw20;
import xsna.ejf0;
import xsna.epx;
import xsna.f4m;
import xsna.fkq0;
import xsna.fyd0;
import xsna.gm50;
import xsna.hri0;
import xsna.i0b0;
import xsna.iah0;
import xsna.ihm0;
import xsna.ikv0;
import xsna.jfm0;
import xsna.jz70;
import xsna.km50;
import xsna.l7s;
import xsna.lpj;
import xsna.mk50;
import xsna.mll0;
import xsna.msy;
import xsna.nm60;
import xsna.nub0;
import xsna.oz50;
import xsna.q43;
import xsna.qxi;
import xsna.s3q0;
import xsna.sbl0;
import xsna.sxl0;
import xsna.tbl0;
import xsna.tlo0;
import xsna.ubl0;
import xsna.vbl0;
import xsna.vk50;
import xsna.w8i;
import xsna.wmc;
import xsna.xkm0;
import xsna.xn50;
import xsna.yqd0;
import xsna.ysg0;
import xsna.z260;

/* compiled from: StoryStatisticsStickersFragment.kt */
/* loaded from: classes6.dex */
public final class StoryStatisticsStickersFragment extends MviImplFragment<com.vk.stories.design.view.stats.tabs.stickers.mvi.b, StoryStatisticsStickersViewState, com.vk.stories.design.view.stats.tabs.stickers.mvi.a> implements ihm0, w8i {
    public static final /* synthetic */ int X = 0;
    public final Object Q;
    public final bpn0 R;
    public final bpn0 S;
    public final Object T;
    public final Object U;
    public c V;
    public final b W;

    /* compiled from: StoryStatisticsStickersFragment.kt */
    public static final class a extends oz50 {
    }

    /* compiled from: StoryStatisticsStickersFragment.kt */
    public static final class b implements sbl0.a {
        public b() {
        }

        @Override // xsna.sbl0.a
        public final void a(int i) {
            xn50.a.c(StoryStatisticsStickersFragment.this, new a.c.C1813a(i));
        }

        @Override // xsna.sbl0.a
        public final void b(int i, UserId userId) {
            xn50.a.c(StoryStatisticsStickersFragment.this, new a.c.l(i, userId));
        }

        @Override // xsna.sbl0.a
        public final void c(int i, UserId userId) {
            xn50.a.c(StoryStatisticsStickersFragment.this, new a.c.m(i, userId));
        }
    }

    public StoryStatisticsStickersFragment() {
        z260 z260Var = new z260(this, 28);
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.NONE;
        this.Q = msy.a(lazyThreadSafetyMode, z260Var);
        this.R = new bpn0(new ejf0(this, 7));
        this.S = new bpn0(new fyd0(this, 11));
        this.T = msy.a(lazyThreadSafetyMode, new yqd0(this, 8));
        this.U = msy.a(lazyThreadSafetyMode, new jz70(this, 24));
        this.W = new b();
    }

    public static StoryEntry fo(StoryStatisticsStickersFragment storyStatisticsStickersFragment) {
        ahm0 ti = super.ti();
        StoryEntry Id = ti != null ? ti.Id() : null;
        if (Id != null) {
            return Id;
        }
        throw new IllegalArgumentException("Required value was null.");
    }

    public static MobileOfficialAppsConStoriesStat$ViewEntryPoint go(StoryStatisticsStickersFragment storyStatisticsStickersFragment) {
        ahm0 ti = super.ti();
        MobileOfficialAppsConStoriesStat$ViewEntryPoint viewEntryPoint = ti != null ? ti.getViewEntryPoint() : null;
        if (viewEntryPoint != null) {
            return viewEntryPoint;
        }
        throw new IllegalArgumentException("Required value was null.");
    }

    /* JADX WARN: Type inference failed for: r0v23, types: [java.lang.Object, kotlin.Lazy] */
    public static s3q0 ho(StoryStatisticsStickersFragment storyStatisticsStickersFragment, j jVar) {
        Dialog dialog;
        Window window;
        String obj;
        VkButton vkButton;
        Dialog dialog2;
        Window window2;
        if (jVar instanceof j.e) {
            j.e eVar = (j.e) jVar;
            Fragment parentFragment = storyStatisticsStickersFragment.getParentFragment();
            androidx.fragment.app.d dVar = parentFragment instanceof androidx.fragment.app.d ? (androidx.fragment.app.d) parentFragment : null;
            if (dVar != null && (dialog2 = dVar.s) != null && (window2 = dialog2.getWindow()) != null) {
                xkm0 xkm0Var = new xkm0(null, null, null, null, null);
                Context requireContext = storyStatisticsStickersFragment.requireContext();
                lpj lpjVar = requireContext instanceof lpj ? (lpj) requireContext : null;
                Integer valueOf = lpjVar != null ? Integer.valueOf(lpjVar.getThemeResId()) : null;
                dhr0.a.getClass();
                Context l7sVar = (valueOf != null && valueOf.intValue() == dhr0.u().c) ? requireContext : new l7s(requireContext, dhr0.u().c);
                StoryEntry storyEntry = eVar.b;
                StoryQuestionEntry storyQuestionEntry = eVar.a;
                sbl0 sbl0Var = new sbl0(l7sVar, window2, storyEntry, storyQuestionEntry, xkm0Var, storyStatisticsStickersFragment.W, storyStatisticsStickersFragment.getFeature().e, new nm60(storyStatisticsStickersFragment, 23), new dac0(storyStatisticsStickersFragment, 14), new hri0(storyStatisticsStickersFragment, 4), new mll0(storyStatisticsStickersFragment, 3));
                av20.a aVar = new av20.a();
                aVar.d(R.layout.actions_popup_item, LayoutInflater.from(l7sVar));
                aVar.d = new tbl0();
                aVar.e = new ubl0(sbl0Var);
                av20 b2 = aVar.b();
                ArrayList arrayList = new ArrayList();
                boolean a2 = sbl0Var.a();
                UserId userId = storyEntry.d;
                UserId userId2 = storyQuestionEntry.c;
                UserProfile userProfile = storyQuestionEntry.g;
                boolean f = epx.f(userId, userId2);
                if (!a2 && !f) {
                    if (fkq0.d(storyEntry.d) && userProfile != null && userProfile.d()) {
                        arrayList.add(vbl0.b.a.c);
                    }
                    String n = userProfile != null ? userProfile.n() : null;
                    if (n == null) {
                        n = userProfile != null ? userProfile.d : null;
                        if (n == null) {
                            n = "";
                        }
                    }
                    arrayList.add(new vbl0.b.C3882b(n));
                }
                if (!f) {
                    arrayList.add(vbl0.a.c.c);
                    if (storyQuestionEntry.f) {
                        arrayList.add(vbl0.a.d.c);
                    } else {
                        arrayList.add(vbl0.a.C3881a.c);
                    }
                }
                arrayList.add(vbl0.a.b.c);
                b2.setItems(arrayList);
                sbl0Var.p = ((dw20.b) dw20.a.k(new dw20.b(l7sVar, null), b2, 4)).Z(new q43(sbl0Var, 2)).I0("StickersQuestionOptionsBottomSheet");
                ((anm0) sbl0Var.m.getValue()).D();
            }
        } else if (jVar instanceof j.f) {
            j.f fVar = (j.f) jVar;
            qxi.a().k(storyStatisticsStickersFragment.requireContext(), t0.a(MobileOfficialAppsCoreNavStat$EventScreen.STORY_VIEWER), fVar.b, fVar.a, new xkm0(null, null, null, null, null));
        } else if (jVar instanceof j.a) {
            if (((j.a) jVar).a) {
                c cVar = storyStatisticsStickersFragment.V;
                if (cVar != null && (vkButton = cVar.f) != null) {
                    ahm0 ti = super.ti();
                    if (ti != null) {
                        ti.Jf(vkButton);
                    }
                    c cVar2 = storyStatisticsStickersFragment.V;
                    if (cVar2 != null) {
                        f4m.v(cn70.b(90), cVar2.e);
                    }
                }
            } else {
                ahm0 ti2 = super.ti();
                if (ti2 != null) {
                    ti2.rj();
                }
                c cVar3 = storyStatisticsStickersFragment.V;
                if (cVar3 != null) {
                    f4m.v(0, cVar3.e);
                }
            }
        } else if (jVar instanceof j.d) {
            j.d dVar2 = (j.d) jVar;
            Poll poll = dVar2.a;
            PollOption pollOption = dVar2.b;
            PollVotersFragment.a i = nub0.a().i(poll.b, pollOption.b, poll.c, pollOption.c);
            i.j.putInt("votes_count", pollOption.d);
            i.s(true);
            i.k(storyStatisticsStickersFragment.getActivity());
        } else if (jVar instanceof j.c) {
            ahm0 ti3 = super.ti();
            if (ti3 != null) {
                ti3.Ie();
            }
        } else if (jVar instanceof j.g) {
            j.g gVar = (j.g) jVar;
            Fragment parentFragment2 = storyStatisticsStickersFragment.getParentFragment();
            androidx.fragment.app.d dVar3 = parentFragment2 instanceof androidx.fragment.app.d ? (androidx.fragment.app.d) parentFragment2 : null;
            if (dVar3 != null && (dialog = dVar3.s) != null && (window = dialog.getWindow()) != null) {
                ikv0.a aVar2 = new ikv0.a(bwt0.u(storyStatisticsStickersFragment.requireContext()));
                aVar2.o = Integer.valueOf(iah0.a(8));
                tlo0.e eVar2 = gVar.a;
                Context requireContext2 = storyStatisticsStickersFragment.requireContext();
                eVar2.getClass();
                CharSequence a3 = tlo0.b.a(eVar2, requireContext2);
                if (a3 != null && (obj = a3.toString()) != null) {
                    aVar2.u = new ikv0.d(obj, (String) null, (ikv0.d.a) null, 6);
                }
                aVar2.p(window);
            }
        } else {
            if (!(jVar instanceof j.b)) {
                throw new NoWhenBranchMatchedException();
            }
            c cVar4 = storyStatisticsStickersFragment.V;
            if (cVar4 != null) {
                cVar4.h.e.clear();
            }
        }
        return s3q0.a;
    }

    @Override // xsna.xn50
    public final mk50 Fl() {
        return new mk50.b(R.layout.fragment_story_statistics_tab_stickers);
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.Object, kotlin.Lazy] */
    @Override // xsna.xn50
    public final void Jh(ao50 ao50Var, View view) {
        getFeature().j.a(new sxl0(this, 2), getViewLifecycleOwner());
        c cVar = new c(view, getViewLifecycleOwner(), (StoryEntry) this.T.getValue(), getFeature(), (jfm0) this.Q.getValue(), new wmc(1, this, StoryStatisticsStickersFragment.class, "sendAction", "sendAction(Lcom/vk/mvi/core/data/MviAction;)V", 0, 7));
        gm50.a.b(cVar, ((StoryStatisticsStickersViewState) ao50Var).a, new i0b0(cVar, 16));
        this.V = cVar;
        ahm0 ti = ti();
        if (ti != null) {
            ti.bc();
        }
    }

    @Override // xsna.ihm0
    public final void K8(StoryEntry storyEntry) {
        xn50.a.c(this, a.c.b.b);
        xn50.a.c(this, new a.e(storyEntry));
    }

    @Override // xsna.ihm0
    public final boolean f3() {
        xn50.a.c(this, a.C1811a.b);
        return true;
    }

    @Override // xsna.ihm0
    public final void ha(int i) {
        c cVar = this.V;
        if (cVar != null) {
            TabRecyclerPaginatedView tabRecyclerPaginatedView = cVar.e;
            c.a(i, tabRecyclerPaginatedView.getLoadingView());
            c.a(i, tabRecyclerPaginatedView.getErrorView());
            c.a(i, tabRecyclerPaginatedView.getEmptyView());
        }
    }

    @Override // xsna.ihm0
    public final void jj() {
        xn50.a.c(this, a.c.b.b);
    }

    @Override // com.vk.mvi.androidx.MviImplFragment, com.vk.core.fragments.FragmentImpl, androidx.fragment.app.d, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.o = false;
    }

    @Override // com.vk.core.fragments.FragmentImpl, androidx.fragment.app.d, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        c cVar = this.V;
        if (cVar != null) {
            cVar.h.d.e();
        }
        this.V = null;
        super.onDestroyView();
    }

    /* JADX WARN: Type inference failed for: r7v1, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r7v3, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r7v7, types: [java.lang.Object, kotlin.Lazy] */
    @Override // xsna.xn50
    public final vk50 x8(Bundle bundle, km50 km50Var) {
        return new com.vk.stories.design.view.stats.tabs.stickers.mvi.b((StoryEntry) this.T.getValue(), (jfm0) this.Q.getValue(), (anm0) this.R.getValue(), (MobileOfficialAppsConStoriesStat$ViewEntryPoint) this.U.getValue(), (ysg0) this.S.getValue());
    }
}
