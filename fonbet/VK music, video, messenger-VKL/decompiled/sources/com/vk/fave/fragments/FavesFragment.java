package com.vk.fave.fragments;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ProgressBar;
import androidx.fragment.app.Fragment;
import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.tabs.TabLayout;
import com.ironsource.InterfaceC4319fe;
import com.vk.clips.favorites.api.di.ClipsFavoritesComponent;
import com.vk.core.fragments.BaseFragment;
import com.vk.core.fragments.FragmentImpl;
import com.vk.core.fragments.h;
import com.vk.core.view.VKViewPager;
import com.vk.core.view.components.topbar.VkTopBar;
import com.vk.dto.newsfeed.FaveTag;
import com.vk.fave.api.FaveLoadState;
import com.vk.fave.entities.FaveCategory;
import com.vk.fave.entities.FaveSearchType;
import com.vk.fave.entities.FaveSource;
import com.vk.fave.entities.FaveType;
import com.vk.fave.fragments.FavesTabSearchFragment;
import com.vk.log.L;
import com.vk.newsfeed.api.NewsfeedRouter;
import com.vk.newsfeed.api.di.NewsFeedComponent;
import com.vkontakte.android.R;
import kotlin.LazyThreadSafetyMode;
import kotlin.NoWhenBranchMatchedException;
import xsna.asu0;
import xsna.bwt0;
import xsna.cn3;
import xsna.dko;
import xsna.drg;
import xsna.enq;
import xsna.epx;
import xsna.gbj;
import xsna.gko;
import xsna.hvt0;
import xsna.iah0;
import xsna.jjc;
import xsna.l0i0;
import xsna.m5e;
import xsna.msy;
import xsna.mxj;
import xsna.nhe;
import xsna.o0q0;
import xsna.o25;
import xsna.ol;
import xsna.oz50;
import xsna.p870;
import xsna.pds;
import xsna.pt;
import xsna.qhh0;
import xsna.qo4;
import xsna.qsq;
import xsna.qt;
import xsna.rl3;
import xsna.rsq;
import xsna.srq;
import xsna.ssq;
import xsna.tlo0;
import xsna.tsq;
import xsna.usn0;
import xsna.vbs;
import xsna.w7;
import xsna.w8q;
import xsna.xmq;
import xsna.z1h0;

/* compiled from: FavesFragment.kt */
/* loaded from: classes.dex */
public final class FavesFragment extends BaseFragment implements o0q0, qhh0, srq {
    public static final int j0 = iah0.a(56);
    public TabLayout S;
    public VKViewPager T;
    public FaveTag U;
    public AppBarLayout V;
    public VkTopBar W;
    public ProgressBar X;
    public b Z;
    public boolean c0;
    public final Object h0;
    public final Object i0;
    public FaveLoadState Y = FaveLoadState.PROGRESS;
    public FaveCategory a0 = FaveCategory.ALL;
    public FaveSource b0 = FaveSource.MENU;
    public final io.reactivex.rxjava3.disposables.b d0 = new io.reactivex.rxjava3.disposables.b();
    public final rsq e0 = new rsq(this, 0);
    public final cn3 f0 = new cn3(this, 1);
    public final d g0 = new d();

    /* compiled from: FavesFragment.kt */
    /* loaded from: classes18.dex */
    public static final class a extends oz50 {
        public static final /* synthetic */ int m = 0;

        /* compiled from: FavesFragment.kt */
        /* renamed from: com.vk.fave.fragments.FavesFragment$a$a, reason: collision with other inner class name */
        public static final class C1025a {
            public static void a(Bundle bundle, FaveCategory faveCategory, FaveSource faveSource) {
                String str;
                qsq i = faveCategory.i();
                if (i == null || (str = i.h()) == null) {
                    str = "";
                }
                bundle.putString("select_tab", str);
                bundle.putString("source", faveSource.name());
            }
        }

        public a() {
            super(FavesFragment.class, null, null);
        }

        public final void y(FaveCategory faveCategory, FaveSource faveSource) {
            C1025a.a(this.j, faveCategory, faveSource);
        }
    }

    /* compiled from: FavesFragment.kt */
    /* loaded from: classes18.dex */
    public final class b extends h {
        public Fragment k;
        public int l;

        public b(vbs vbsVar) {
            super(vbsVar, false);
            this.l = -1;
        }

        /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, kotlin.Lazy] */
        /* JADX WARN: Type inference failed for: r5v21, types: [java.lang.Object, kotlin.Lazy] */
        @Override // com.vk.core.fragments.h
        public final FragmentImpl c(int i) {
            xmq xmqVar;
            FavesFragment favesFragment = FavesFragment.this;
            ?? r1 = favesFragment.i0;
            FaveCategory.Companion.getClass();
            FaveCategory faveCategory = FaveCategory.a.a()[i];
            qsq i2 = faveCategory.i();
            if (faveCategory == FaveCategory.ALL) {
                return NewsfeedRouter.Q(((NewsFeedComponent) r1.getValue()).l0(), favesFragment.U, favesFragment.b0, 1).f();
            }
            if (i2 == FaveType.CLIP) {
                return m5e.a(((ClipsFavoritesComponent) favesFragment.h0.getValue()).b8(), o25.a().c(), false, 16).f();
            }
            if (!(i2 instanceof FaveType)) {
                if (!(i2 instanceof FaveSearchType)) {
                    L.l("Can'd create fragment for " + i2);
                    return NewsfeedRouter.Q(((NewsFeedComponent) r1.getValue()).l0(), null, null, 7).f();
                }
                FavesTabSearchFragment.a aVar = new FavesTabSearchFragment.a(FavesTabSearchFragment.class, null, null);
                String h = ((FaveSearchType) i2).h();
                Bundle bundle = aVar.j;
                bundle.putSerializable("search_type_key", h);
                bundle.putParcelable("fave_tag", favesFragment.U);
                bundle.putString("source", favesFragment.b0.name());
                return aVar.f();
            }
            NewsfeedRouter l0 = ((NewsFeedComponent) r1.getValue()).l0();
            switch (c.$EnumSwitchMapping$0[((FaveType) i2).ordinal()]) {
                case 1:
                    xmqVar = xmq.f.a;
                    break;
                case 2:
                    xmqVar = xmq.a.a;
                    break;
                case 3:
                    xmqVar = xmq.c.a;
                    break;
                case 4:
                    xmqVar = xmq.e.a;
                    break;
                case 5:
                    xmqVar = xmq.h.a;
                    break;
                case 6:
                    xmqVar = xmq.b.a;
                    break;
                case 7:
                    xmqVar = xmq.g.a;
                    break;
                case 8:
                    xmqVar = xmq.d.a;
                    break;
                default:
                    throw new NoWhenBranchMatchedException();
            }
            return l0.h(xmqVar, favesFragment.U, favesFragment.b0).f();
        }

        public final Fragment g() {
            return this.k;
        }

        @Override // androidx.viewpager.widget.PagerAdapter
        public final int getCount() {
            FaveCategory.Companion.getClass();
            return FaveCategory.a.a().length;
        }

        @Override // androidx.viewpager.widget.PagerAdapter
        public final CharSequence getPageTitle(int i) {
            FaveCategory.Companion.getClass();
            return FavesFragment.this.getString(FaveCategory.a.a()[i].h());
        }

        @Override // com.vk.core.fragments.h, xsna.s1q0, androidx.viewpager.widget.PagerAdapter
        public final void setPrimaryItem(ViewGroup viewGroup, int i, Object obj) {
            int i2 = this.l;
            z1h0 z1h0Var = this.k;
            Fragment fragment = obj instanceof Fragment ? (Fragment) obj : null;
            this.k = fragment;
            this.l = i;
            if (i2 != i) {
                if (z1h0Var instanceof pds) {
                    ((pds) z1h0Var).J0();
                }
                if (fragment instanceof pds) {
                    ((pds) fragment).i5(new drg(fragment, 14));
                }
                enq enqVar = enq.a;
                FaveCategory.Companion.getClass();
                FaveCategory faveCategory = FaveCategory.a.a()[i];
                enqVar.getClass();
                asu0.a.getClass();
                asu0.o().submit(new qo4(faveCategory, 3));
            }
            super.setPrimaryItem(viewGroup, i, obj);
        }
    }

    /* compiled from: FavesFragment.kt */
    /* loaded from: classes18.dex */
    public static final /* synthetic */ class c {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[FaveType.values().length];
            try {
                iArr[FaveType.POST.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[FaveType.ARTICLE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[FaveType.LINK.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[FaveType.PODCAST.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[FaveType.VIDEO.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[FaveType.CLIP.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[FaveType.PRODUCT.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr[FaveType.NARRATIVE.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public FavesFragment() {
        mxj mxjVar = new mxj(this, 13);
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.NONE;
        this.h0 = msy.a(lazyThreadSafetyMode, mxjVar);
        this.i0 = msy.a(lazyThreadSafetyMode, new gbj(this, 10));
    }

    @Override // xsna.srq
    public final void Im(FaveLoadState faveLoadState) {
        this.Y = faveLoadState;
        io();
        jo();
    }

    @Override // com.vk.core.fragments.BaseFragment, com.vk.core.fragments.FragmentImpl
    public final boolean a0() {
        if (this.U == null) {
            return false;
        }
        enq.a.getClass();
        enq.e(null);
        return true;
    }

    @Override // xsna.o0q0
    public final Fragment getUiTrackingFragment() {
        b bVar = this.Z;
        if (bVar != null) {
            return bVar.g();
        }
        return null;
    }

    public final void io() {
        VKViewPager vKViewPager = this.T;
        boolean z = false;
        boolean z2 = (vKViewPager != null ? vKViewPager.getCurrentItem() : -1) == 0;
        boolean z3 = this.Y == FaveLoadState.PROGRESS;
        boolean z4 = this.U == null;
        if (z2 && z3 && z4) {
            z = true;
        }
        this.c0 = z;
    }

    public final void jo() {
        TabLayout tabLayout = this.S;
        if (tabLayout != null) {
            bwt0.p0(tabLayout, !this.c0);
        }
        VKViewPager vKViewPager = this.T;
        if (vKViewPager != null) {
            vKViewPager.setSupportSwipe(!this.c0);
        }
        ProgressBar progressBar = this.X;
        if (progressBar != null) {
            bwt0.p0(progressBar, false);
        }
    }

    public final void ko() {
        FaveTag faveTag = this.U;
        tlo0.Companion.getClass();
        VkTopBar.Middle.Text.Title title = new VkTopBar.Middle.Text.Title(tlo0.a.b(R.string.fave_title), null, null, null, null, 30);
        tlo0 d2 = faveTag != null ? tlo0.a.d(faveTag.getName()) : tlo0.a.b(R.string.fave_privacy_description);
        VkTopBar vkTopBar = this.W;
        if (vkTopBar != null) {
            vkTopBar.setMiddle(new VkTopBar.Middle.Text(title, new VkTopBar.Middle.Text.c(d2, null, null, 30), null, com.vk.core.compose.component.semantics.b.a(null, new ol(24), 3), 4));
        }
    }

    @Override // com.vk.core.fragments.BaseFragment, com.vk.core.fragments.FragmentImpl, androidx.fragment.app.d, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        FaveCategory.a aVar = FaveCategory.Companion;
        Bundle arguments = getArguments();
        String string = arguments != null ? arguments.getString("select_tab") : null;
        aVar.getClass();
        this.a0 = FaveCategory.a.b(string);
        FaveSource.a aVar2 = FaveSource.Companion;
        Bundle arguments2 = getArguments();
        String string2 = arguments2 != null ? arguments2.getString("source") : null;
        aVar2.getClass();
        FaveSource a2 = FaveSource.a.a(string2);
        if (a2 != null) {
            this.b0 = a2;
        }
        this.c0 = bundle != null ? bundle.getBoolean("hide_tab") : false;
        super.onCreate(bundle);
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        VKViewPager vKViewPager;
        View inflate = layoutInflater.inflate(R.layout.fave_tab_fragment, viewGroup, false);
        this.V = (AppBarLayout) hvt0.c(R.id.vk_app_bar, inflate);
        this.W = (VkTopBar) hvt0.c(R.id.main_toolbar, inflate);
        this.T = (VKViewPager) hvt0.c(R.id.viewpager, inflate);
        this.S = (TabLayout) hvt0.c(R.id.tabs, inflate);
        this.X = (ProgressBar) hvt0.c(R.id.pb_fave_loading, inflate);
        TabLayout tabLayout = this.S;
        if (tabLayout != null) {
            tabLayout.setupWithViewPager(this.T);
        }
        TabLayout tabLayout2 = this.S;
        if (tabLayout2 != null) {
            tabLayout2.g(new tsq(this, this.T));
        }
        TabLayout tabLayout3 = this.S;
        if (tabLayout3 != null) {
            usn0.a(tabLayout3);
        }
        b bVar = new b(In());
        this.Z = bVar;
        VKViewPager vKViewPager2 = this.T;
        if (vKViewPager2 != null) {
            vKViewPager2.setAdapter(bVar);
        }
        VKViewPager vKViewPager3 = this.T;
        if (vKViewPager3 != null) {
            vKViewPager3.setOffscreenPageLimit(3);
        }
        FaveCategory.Companion.getClass();
        int U = rl3.U(this.a0, FaveCategory.a.a());
        b bVar2 = this.Z;
        if (bVar2 != null) {
            bVar2.notifyDataSetChanged();
        }
        if (U > 0 && (vKViewPager = this.T) != null) {
            vKViewPager.setCurrentItem(U);
        }
        new l0i0(getActivity(), (l0i0.b) this.g0).b(new w7(this, 20));
        VkTopBar vkTopBar = this.W;
        if (vkTopBar != null) {
            vkTopBar.setBack(new VkTopBar.b(new w8q(this, 1), null, null, null, com.vk.core.compose.component.semantics.b.a(null, new pt(28), 3), 14));
            dko.a.a(R.drawable.vk_icon_tag_outline_28);
            gko c2 = gko.c(R.drawable.vk_icon_tag_outline_28);
            tlo0.Companion.getClass();
            vkTopBar.setAfter(VkTopBar.a.C0875a.a(new VkTopBar.a.c.f(c2, tlo0.a.b(R.string.fave_tag_icon_title), new ssq(this), null, null, com.vk.core.compose.component.semantics.b.a(null, new qt(29), 3), 24), null, 6));
            ko();
            jjc.g(vkTopBar, new nhe(this, 19));
        }
        if (bundle == null) {
            io();
        }
        jo();
        p870 f = p870.f();
        rsq rsqVar = this.e0;
        f.b(InterfaceC4319fe.a.b, rsqVar);
        p870.f().b(1204, rsqVar);
        p870.f().b(1205, rsqVar);
        p870.f().b(InterfaceC4319fe.a.g, this.f0);
        return inflate;
    }

    @Override // com.vk.core.fragments.BaseFragment, com.vk.core.fragments.FragmentImpl, androidx.fragment.app.Fragment
    public final void onDestroy() {
        this.d0.e();
        super.onDestroy();
    }

    @Override // com.vk.core.fragments.BaseFragment, com.vk.core.fragments.FragmentImpl, androidx.fragment.app.d, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        this.S = null;
        this.T = null;
        this.V = null;
        this.W = null;
        this.X = null;
        p870.f().g(this.e0);
        p870.f().g(this.f0);
        super.onDestroyView();
    }

    @Override // com.vk.core.fragments.BaseFragment, com.vk.core.fragments.FragmentImpl, androidx.fragment.app.Fragment
    public final void onPause() {
        super.onPause();
        b bVar = this.Z;
        z1h0 g = bVar != null ? bVar.g() : null;
        if (g instanceof pds) {
            ((pds) g).J0();
        }
    }

    @Override // com.vk.core.fragments.BaseFragment, com.vk.core.fragments.FragmentImpl, androidx.fragment.app.Fragment
    public final void onResume() {
        super.onResume();
        b bVar = this.Z;
        z1h0 g = bVar != null ? bVar.g() : null;
        if (g instanceof pds) {
            ((pds) g).o1();
        }
    }

    @Override // com.vk.core.fragments.FragmentImpl, androidx.fragment.app.d, androidx.fragment.app.Fragment
    public final void onSaveInstanceState(Bundle bundle) {
        bundle.putBoolean("hide_tab", this.c0);
        super.onSaveInstanceState(bundle);
    }

    @Override // xsna.qhh0
    public final boolean s() {
        b bVar = this.Z;
        z1h0 g = bVar != null ? bVar.g() : null;
        if (!(g instanceof qhh0)) {
            return true;
        }
        ((qhh0) g).s();
        return true;
    }

    /* compiled from: FavesFragment.kt */
    /* loaded from: classes18.dex */
    public static final class d implements l0i0.b {
        public d() {
        }

        @Override // xsna.l0i0.b
        public final void a(String str) {
            b bVar = FavesFragment.this.Z;
            z1h0 z1h0Var = bVar != null ? bVar.k : null;
            FavesTabSearchFragment favesTabSearchFragment = z1h0Var instanceof FavesTabSearchFragment ? (FavesTabSearchFragment) z1h0Var : null;
            if (favesTabSearchFragment == null || epx.f(favesTabSearchFragment.c0, str)) {
                return;
            }
            favesTabSearchFragment.c0 = str;
            com.vk.lists.c cVar = favesTabSearchFragment.X;
            if (cVar != null) {
                cVar.p(false);
            }
        }

        @Override // xsna.l0i0.b
        public final void b(String str) {
        }

        @Override // xsna.l0i0.b
        public final void c(String str) {
        }
    }
}
