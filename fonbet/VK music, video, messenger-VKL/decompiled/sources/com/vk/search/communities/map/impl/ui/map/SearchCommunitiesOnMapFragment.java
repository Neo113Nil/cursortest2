package com.vk.search.communities.map.impl.ui.map;

import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewOutlineProvider;
import android.widget.FrameLayout;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.huawei.hms.framework.common.BundleUtil;
import com.ironsource.O6;
import com.unity3d.services.UnityAdsConstants;
import com.vk.core.fragments.BaseFragment;
import com.vk.core.fragments.FragmentImpl;
import com.vk.core.serialize.Serializer;
import com.vk.core.ui.tracking.UiTracker;
import com.vk.dto.common.id.UserId;
import com.vk.dto.group.Group;
import com.vk.dto.group.GroupCatalogItem;
import com.vk.dto.search.SearchStatsLoggingInfo;
import com.vk.geo.impl.presentation.GeoFragment;
import com.vk.permission.PermissionHelper;
import com.vk.search.communities.map.api.domain.LocationCoordinate;
import com.vk.search.communities.map.api.router.SearchMapPreviewStateWrapper;
import com.vk.search.communities.map.impl.ui.details.SearchCommunitiesOnMapDetailsFragment;
import com.vk.search.communities.map.impl.ui.list.SearchCommunitiesOnMapListFragment;
import com.vk.search.communities.map.impl.ui.map.SearchCommunitiesOnMapFragment;
import com.vk.search.ui.SearchLocationPermissionsController;
import com.vk.stat.scheme.MobileOfficialAppsCoreNavStat$EventScreen;
import com.vk.stat.scheme.MobileOfficialAppsSearchStat$TypeSearchClickItem;
import com.vk.stat.scheme.SchemeStat$EventItem;
import com.vk.stat.scheme.SchemeStat$TypeClick;
import com.vkontakte.android.R;
import java.util.Map;
import java.util.WeakHashMap;
import kotlin.LazyThreadSafetyMode;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.jvm.internal.Ref$IntRef;
import xsna.an10;
import xsna.arm0;
import xsna.awt0;
import xsna.b0u0;
import xsna.b6f0;
import xsna.bbb0;
import xsna.bjc;
import xsna.bwt0;
import xsna.d2y;
import xsna.drm0;
import xsna.e43;
import xsna.epx;
import xsna.fda;
import xsna.ge0;
import xsna.gl00;
import xsna.hyk0;
import xsna.iut0;
import xsna.j5g;
import xsna.jcf0;
import xsna.msy;
import xsna.oz50;
import xsna.pb00;
import xsna.sy50;
import xsna.t210;
import xsna.tk5;
import xsna.tkt;
import xsna.toh0;
import xsna.u080;
import xsna.uzp0;
import xsna.vds;
import xsna.yl00;
import xsna.z3g;

/* compiled from: SearchCommunitiesOnMapFragment.kt */
/* loaded from: classes5.dex */
public final class SearchCommunitiesOnMapFragment extends BaseFragment implements vds {
    public static final /* synthetic */ int e0 = 0;
    public final Object S;
    public final Object T;
    public final Object U;
    public i V;
    public final Object W;
    public int X;
    public final g Y;
    public final j Z;
    public double a0;
    public double b0;
    public float c0;
    public Fragment d0;

    /* compiled from: SearchCommunitiesOnMapFragment.kt */
    public static final class a {
        public final Bundle a;

        public a(Bundle bundle) {
            this.a = bundle;
        }

        public final SearchMapPreviewStateWrapper a() {
            Parcelable parcelable;
            Object parcelable2;
            int i = Build.VERSION.SDK_INT;
            Bundle bundle = this.a;
            if (i >= 33) {
                parcelable2 = bundle.getParcelable("preview_state", SearchMapPreviewStateWrapper.class);
                parcelable = (Parcelable) parcelable2;
            } else {
                Parcelable parcelable3 = bundle.getParcelable("preview_state");
                if (!(parcelable3 instanceof SearchMapPreviewStateWrapper)) {
                    parcelable3 = null;
                }
                parcelable = (SearchMapPreviewStateWrapper) parcelable3;
            }
            return (SearchMapPreviewStateWrapper) parcelable;
        }

        public final String b() {
            String string = this.a.getString("searchSectionId");
            return string == null ? "" : string;
        }
    }

    /* compiled from: SearchCommunitiesOnMapFragment.kt */
    public static final class b extends oz50 {
        public final Object m;

        public b() {
            super(SearchCommunitiesOnMapFragment.class, null, null);
            this.m = msy.a(LazyThreadSafetyMode.NONE, new jcf0(this, 1));
        }
    }

    /* compiled from: SearchCommunitiesOnMapFragment.kt */
    public final class c extends FragmentManager.m {
        public c() {
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // androidx.fragment.app.FragmentManager.m
        public final void a(FragmentManager fragmentManager, Fragment fragment) {
            boolean z = fragment instanceof fda;
            SearchCommunitiesOnMapFragment searchCommunitiesOnMapFragment = SearchCommunitiesOnMapFragment.this;
            if (z) {
                searchCommunitiesOnMapFragment.d0 = fragment;
                searchCommunitiesOnMapFragment.ko().d = new com.vk.search.communities.map.impl.ui.map.a((fda) fragment);
            }
            if (fragment instanceof toh0.a) {
                ((toh0.a) fragment).n3(searchCommunitiesOnMapFragment.new h());
            }
            if (epx.f(fragment.getTag(), "community_details") && (fragment instanceof z3g)) {
                ((z3g) fragment).e4(searchCommunitiesOnMapFragment.new e());
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // androidx.fragment.app.FragmentManager.m
        public final void d(FragmentManager fragmentManager, Fragment fragment) {
            SearchCommunitiesOnMapFragment searchCommunitiesOnMapFragment = SearchCommunitiesOnMapFragment.this;
            if (searchCommunitiesOnMapFragment.d0 == fragment) {
                searchCommunitiesOnMapFragment.ko().d = null;
            }
            if (fragment instanceof toh0.a) {
                ((toh0.a) fragment).n3(null);
            }
            if (epx.f(fragment.getTag(), "community_details") && (fragment instanceof z3g)) {
                ((z3g) fragment).e4(null);
            }
        }

        @Override // androidx.fragment.app.FragmentManager.m
        public final void g(Fragment fragment) {
            i iVar = SearchCommunitiesOnMapFragment.this.V;
            if (iVar == null || !epx.f(fragment.getTag(), "community_details")) {
                return;
            }
            iVar.f.X(3);
        }
    }

    /* compiled from: SearchCommunitiesOnMapFragment.kt */
    public final class d extends BottomSheetBehavior.d {
        public d() {
        }

        @Override // com.google.android.material.bottomsheet.BottomSheetBehavior.d
        public final void b(View view, float f) {
            int i = SearchCommunitiesOnMapFragment.e0;
            SearchCommunitiesOnMapFragment.this.no();
        }

        @Override // com.google.android.material.bottomsheet.BottomSheetBehavior.d
        public final void c(int i, View view) {
            if (i == 5) {
                SearchCommunitiesOnMapFragment searchCommunitiesOnMapFragment = SearchCommunitiesOnMapFragment.this;
                Fragment G = searchCommunitiesOnMapFragment.getChildFragmentManager().G(view.getId());
                if (G == null) {
                    return;
                }
                FragmentManager childFragmentManager = searchCommunitiesOnMapFragment.getChildFragmentManager();
                childFragmentManager.getClass();
                androidx.fragment.app.a aVar = new androidx.fragment.app.a(childFragmentManager);
                aVar.q(G);
                aVar.k(false);
                i iVar = searchCommunitiesOnMapFragment.V;
                if (iVar != null) {
                    iVar.j = 0;
                    iVar.h.Wk();
                }
            }
        }
    }

    /* compiled from: SearchCommunitiesOnMapFragment.kt */
    public final class e implements z3g.a {
        public e() {
        }

        @Override // xsna.z3g.a
        public final void a(int i, int i2) {
            SearchCommunitiesOnMapFragment searchCommunitiesOnMapFragment = SearchCommunitiesOnMapFragment.this;
            i iVar = searchCommunitiesOnMapFragment.V;
            if (iVar != null) {
                iVar.j = i;
            }
            searchCommunitiesOnMapFragment.lo(1 - (i2 > 0 ? i / i2 : UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT));
            searchCommunitiesOnMapFragment.no();
        }
    }

    /* compiled from: SearchCommunitiesOnMapFragment.kt */
    public final class f extends BottomSheetBehavior.d {
        public int a = 6;

        public f() {
        }

        @Override // com.google.android.material.bottomsheet.BottomSheetBehavior.d
        public final void b(View view, float f) {
            int i = SearchCommunitiesOnMapFragment.e0;
            SearchCommunitiesOnMapFragment searchCommunitiesOnMapFragment = SearchCommunitiesOnMapFragment.this;
            searchCommunitiesOnMapFragment.mo(f);
            searchCommunitiesOnMapFragment.lo(f);
        }

        @Override // com.google.android.material.bottomsheet.BottomSheetBehavior.d
        public final void c(int i, View view) {
            if (i == this.a || !e43.l(6, 3, 4).contains(Integer.valueOf(i))) {
                return;
            }
            int i2 = SearchCommunitiesOnMapFragment.e0;
            SearchCommunitiesOnMapFragment.this.no();
            this.a = i;
        }
    }

    /* compiled from: SearchCommunitiesOnMapFragment.kt */
    public final class g implements gl00 {
        public g() {
        }

        @Override // xsna.gl00
        public final void a() {
            int i = SearchCommunitiesOnMapFragment.e0;
            String b = SearchCommunitiesOnMapFragment.this.jo().b();
            MobileOfficialAppsSearchStat$TypeSearchClickItem.Action action = MobileOfficialAppsSearchStat$TypeSearchClickItem.Action.LOCATE_ME;
            SchemeStat$EventItem.Type type = SchemeStat$EventItem.Type.CATALOG_ITEM;
            SchemeStat$TypeClick b2 = SchemeStat$TypeClick.a.b(new SchemeStat$EventItem(type, null, null, null, b, null, 46, null), new MobileOfficialAppsSearchStat$TypeSearchClickItem(action, null, null, null, null, 30, null), 2);
            UiTracker uiTracker = UiTracker.a;
            MobileOfficialAppsCoreNavStat$EventScreen c = UiTracker.c();
            uzp0 uzp0Var = UiTracker.h;
            uzp0Var.getClass();
            new bjc(c, b2, uzp0Var.a).q();
        }

        @Override // xsna.gl00
        public final boolean b(String str) {
            Float l;
            String str2;
            Float l2;
            Serializer.c<GroupCatalogItem> cVar = GroupCatalogItem.CREATOR;
            String str3 = (String) j5g.a0(drm0.c0(str, new String[]{BundleUtil.UNDERLINE_TAG}, 0, 6));
            Pair pair = null;
            Long n = str3 != null ? arm0.n(str3) : null;
            if (n != null) {
                String str4 = (String) j5g.a0(j5g.S(drm0.c0(str, new String[]{BundleUtil.UNDERLINE_TAG}, 0, 6), 1));
                if (str4 != null && (l = arm0.l(str4)) != null && (str2 = (String) j5g.a0(j5g.S(drm0.c0(str, new String[]{BundleUtil.UNDERLINE_TAG}, 0, 6), 2))) != null && (l2 = arm0.l(str2)) != null) {
                    pair = new Pair(l2, l);
                }
                if (pair != null) {
                    float floatValue = ((Number) pair.d()).floatValue();
                    float floatValue2 = ((Number) pair.g()).floatValue();
                    int i = SearchCommunitiesOnMapFragment.e0;
                    SearchCommunitiesOnMapFragment searchCommunitiesOnMapFragment = SearchCommunitiesOnMapFragment.this;
                    Group group = searchCommunitiesOnMapFragment.ko().e.get(n);
                    if (group != null) {
                        SchemeStat$EventItem.Type type = SchemeStat$EventItem.Type.GROUP;
                        String str5 = group.O;
                        UiTracker uiTracker = UiTracker.a;
                        SearchStatsLoggingInfo searchStatsLoggingInfo = new SearchStatsLoggingInfo(null, 0, type, 0L, str5, UiTracker.c(), null, false, false, 459, null);
                        SchemeStat$TypeClick b = SchemeStat$TypeClick.a.b(new SchemeStat$EventItem(searchStatsLoggingInfo.d, null, null, null, searchStatsLoggingInfo.f, null, 46, null), new MobileOfficialAppsSearchStat$TypeSearchClickItem(MobileOfficialAppsSearchStat$TypeSearchClickItem.Action.TAP_ON_MAP, null, null, null, null, 30, null), 2);
                        UiTracker uiTracker2 = UiTracker.a;
                        MobileOfficialAppsCoreNavStat$EventScreen c = UiTracker.c();
                        uzp0 uzp0Var = UiTracker.h;
                        uzp0Var.getClass();
                        new bjc(c, b, uzp0Var.a).q();
                        SearchCommunitiesOnMapFragment.io(searchCommunitiesOnMapFragment, group, new LocationCoordinate(floatValue2, floatValue), searchStatsLoggingInfo);
                        return true;
                    }
                    return false;
                }
            }
            return false;
        }

        @Override // xsna.gl00
        public final boolean c(double d, double d2, double d3, double d4, float f, double d5, double d6) {
            SearchCommunitiesOnMapFragment searchCommunitiesOnMapFragment = SearchCommunitiesOnMapFragment.this;
            searchCommunitiesOnMapFragment.b0 = d6;
            searchCommunitiesOnMapFragment.a0 = d5;
            searchCommunitiesOnMapFragment.c0 = f;
            return false;
        }
    }

    /* compiled from: SearchCommunitiesOnMapFragment.kt */
    public final class h implements toh0 {
        public h() {
        }

        @Override // xsna.toh0
        public final void a(Group group, LocationCoordinate locationCoordinate, SearchStatsLoggingInfo searchStatsLoggingInfo) {
            SearchCommunitiesOnMapFragment.io(SearchCommunitiesOnMapFragment.this, group, locationCoordinate, searchStatsLoggingInfo);
        }
    }

    /* compiled from: SearchCommunitiesOnMapFragment.kt */
    public static final class i {
        public final View a;
        public final View b;
        public final FrameLayout c;
        public final BottomSheetBehavior<?> d;
        public final FrameLayout e;
        public final BottomSheetBehavior<?> f;
        public final View g;
        public final tkt.b h;
        public final View i;
        public int j;

        public i(View view, View view2, FrameLayout frameLayout, BottomSheetBehavior<?> bottomSheetBehavior, FrameLayout frameLayout2, BottomSheetBehavior<?> bottomSheetBehavior2, View view3, tkt.b bVar, View view4) {
            this.a = view;
            this.b = view2;
            this.c = frameLayout;
            this.d = bottomSheetBehavior;
            this.e = frameLayout2;
            this.f = bottomSheetBehavior2;
            this.g = view3;
            this.h = bVar;
            this.i = view4;
        }
    }

    /* compiled from: SearchCommunitiesOnMapFragment.kt */
    public static final class j implements yl00 {
        public boolean a;
        public boolean b;

        public j() {
        }

        @Override // xsna.yl00
        public final void a() {
            PermissionHelper permissionHelper = PermissionHelper.a;
            SearchCommunitiesOnMapFragment searchCommunitiesOnMapFragment = SearchCommunitiesOnMapFragment.this;
            Context requireContext = searchCommunitiesOnMapFragment.requireContext();
            permissionHelper.getClass();
            this.a = PermissionHelper.b(requireContext, PermissionHelper.h);
            this.b = PermissionHelper.b(searchCommunitiesOnMapFragment.requireContext(), PermissionHelper.i);
            String b = searchCommunitiesOnMapFragment.jo().b();
            boolean z = this.a;
            SearchLocationPermissionsController.a.a(z ? MobileOfficialAppsSearchStat$TypeSearchClickItem.Action.REQUEST_PRECISE_USER_GEO_OUT : z ? MobileOfficialAppsSearchStat$TypeSearchClickItem.Action.REQUEST_PRECISE_USER_GEO : MobileOfficialAppsSearchStat$TypeSearchClickItem.Action.REQUEST_USER_GEO_OUT, b);
        }

        @Override // xsna.yl00
        public final void b(Map<String, Boolean> map) {
            Boolean bool = map.get("android.permission.ACCESS_COARSE_LOCATION");
            boolean z = false;
            boolean booleanValue = bool != null ? bool.booleanValue() : false;
            Boolean bool2 = map.get("android.permission.ACCESS_FINE_LOCATION");
            boolean booleanValue2 = bool2 != null ? bool2.booleanValue() : false;
            int i = SearchCommunitiesOnMapFragment.e0;
            String b = SearchCommunitiesOnMapFragment.this.jo().b();
            boolean z2 = booleanValue && !this.a;
            if (booleanValue2 && !this.b) {
                z = true;
            }
            SearchLocationPermissionsController.a.b(b, z2, z, true);
        }

        @Override // xsna.yl00
        public final void c() {
            int i = SearchCommunitiesOnMapFragment.e0;
            String b = SearchCommunitiesOnMapFragment.this.jo().b();
            if (SearchLocationPermissionsController.a.C1775a.$EnumSwitchMapping$0[SearchLocationPermissionsController.PermissionSettingsAction.Open.ordinal()] != 1) {
                throw new NoWhenBranchMatchedException();
            }
            SearchLocationPermissionsController.a.a(MobileOfficialAppsSearchStat$TypeSearchClickItem.Action.OPEN_GEO_SETTINGS_OUT, b);
        }
    }

    public SearchCommunitiesOnMapFragment() {
        t210 t210Var = new t210(this, 29);
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.NONE;
        this.S = msy.a(lazyThreadSafetyMode, t210Var);
        this.T = msy.a(lazyThreadSafetyMode, new sy50(this, 28));
        this.U = msy.a(lazyThreadSafetyMode, new bbb0(this, 12));
        this.W = msy.a(lazyThreadSafetyMode, new b6f0(this, 2));
        this.X = 6;
        this.Y = new g();
        this.Z = new j();
        this.c0 = 16.0f;
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [java.lang.Object, kotlin.Lazy] */
    public static final void io(SearchCommunitiesOnMapFragment searchCommunitiesOnMapFragment, Group group, LocationCoordinate locationCoordinate, SearchStatsLoggingInfo searchStatsLoggingInfo) {
        i iVar = searchCommunitiesOnMapFragment.V;
        if (iVar != null) {
            BottomSheetBehavior<?> bottomSheetBehavior = iVar.d;
            if (locationCoordinate != null) {
                tkt.b bVar = iVar.h;
                Serializer.c<GroupCatalogItem> cVar = GroupCatalogItem.CREATOR;
                long j2 = group.c.b;
                float f2 = locationCoordinate.b;
                float f3 = locationCoordinate.c;
                StringBuilder sb = new StringBuilder();
                sb.append(j2);
                sb.append('_');
                sb.append(f2);
                sb.append('_');
                sb.append(f3);
                bVar.jc(sb.toString());
            }
            int i2 = bottomSheetBehavior.M;
            if (i2 == 6 || i2 == 3) {
                searchCommunitiesOnMapFragment.X = i2;
            }
            SearchCommunitiesOnMapDetailsFragment.b bVar2 = new SearchCommunitiesOnMapDetailsFragment.b();
            UserId userId = group.c;
            ?? r2 = bVar2.m;
            ((SearchCommunitiesOnMapDetailsFragment.a) r2.getValue()).a.putParcelable("group_id", userId);
            ((SearchCommunitiesOnMapDetailsFragment.a) r2.getValue()).a.putParcelable("location", locationCoordinate);
            ((SearchCommunitiesOnMapDetailsFragment.a) r2.getValue()).a.putParcelable("search_stats_logging_info", searchStatsLoggingInfo);
            FragmentImpl f4 = bVar2.f();
            FragmentManager childFragmentManager = searchCommunitiesOnMapFragment.getChildFragmentManager();
            childFragmentManager.getClass();
            androidx.fragment.app.a aVar = new androidx.fragment.app.a(childFragmentManager);
            aVar.g(R.id.details_container, f4, "community_details");
            aVar.k(false);
            bottomSheetBehavior.V(true);
            bottomSheetBehavior.X(5);
        }
    }

    @Override // xsna.vds
    public final int Q0() {
        return 1;
    }

    @Override // com.vk.core.fragments.BaseFragment, com.vk.core.fragments.FragmentImpl
    public final boolean a0() {
        if (getChildFragmentManager().H("community_details") == null) {
            SearchMapPreviewStateWrapper a2 = jo().a();
            if (a2 != null) {
                SearchMapPreviewStateWrapper.c.remove(a2.b);
            }
            return false;
        }
        i iVar = this.V;
        if (iVar == null) {
            return true;
        }
        BottomSheetBehavior<?> bottomSheetBehavior = iVar.d;
        iVar.f.X(5);
        bottomSheetBehavior.X(this.X);
        bottomSheetBehavior.V(false);
        return true;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    public final a jo() {
        return (a) this.T.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    public final com.vk.search.communities.map.impl.ui.map.d ko() {
        return (com.vk.search.communities.map.impl.ui.map.d) this.W.getValue();
    }

    public final void lo(float f2) {
        i iVar = this.V;
        if (iVar != null) {
            View view = iVar.i;
            float f3 = 1;
            if (f2 < UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                f2 = 0.0f;
            }
            view.setAlpha(f3 - f2);
        }
    }

    public final void mo(float f2) {
        i iVar = this.V;
        if (iVar != null) {
            BottomSheetBehavior<?> bottomSheetBehavior = iVar.d;
            int height = (iVar.c.getHeight() - bottomSheetBehavior.N()) - (bottomSheetBehavior.g ? -1 : bottomSheetBehavior.f);
            float f3 = 1;
            if (f2 < UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                f2 = 0.0f;
            }
            awt0.x(iVar.c, 0, 0, 0, an10.b((height * (f3 - f2)) + bottomSheetBehavior.N()), 7);
        }
    }

    public final void no() {
        i iVar = this.V;
        if (iVar != null) {
            int top = iVar.c.getTop();
            int top2 = iVar.e.getTop() + iVar.j;
            iVar.h.Lk(iVar.a.getHeight() - Math.min(top, top2), top2 < top);
        }
    }

    @Override // com.vk.core.fragments.BaseFragment, com.vk.core.fragments.FragmentImpl, androidx.fragment.app.d, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        com.vk.search.communities.map.impl.ui.map.d ko = ko();
        String string = jo().a.getString("query");
        if (string == null) {
            string = "";
        }
        ko.b.e = string;
        getChildFragmentManager().c0(new c(), false);
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return layoutInflater.inflate(R.layout.search_communities_on_map_fragment, viewGroup, false);
    }

    @Override // com.vk.core.fragments.BaseFragment, com.vk.core.fragments.FragmentImpl, androidx.fragment.app.d, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        super.onDestroyView();
        this.V = null;
    }

    @Override // com.vk.core.fragments.FragmentImpl, androidx.fragment.app.d, androidx.fragment.app.Fragment
    public final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putDouble(O6.s, this.a0);
        bundle.putDouble("lon", this.b0);
        bundle.putFloat("zoom", this.c0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v6, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r1v8, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.vk.core.fragments.FragmentImpl, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        View findViewById = view.findViewById(R.id.map_container);
        FrameLayout frameLayout = (FrameLayout) view.findViewById(R.id.communities_container);
        BottomSheetBehavior L = BottomSheetBehavior.L(frameLayout);
        FrameLayout frameLayout2 = (FrameLayout) view.findViewById(R.id.details_container);
        BottomSheetBehavior L2 = BottomSheetBehavior.L(frameLayout2);
        View findViewById2 = view.findViewById(R.id.bottom_gradient);
        tkt tktVar = (tkt) this.S.getValue();
        hyk0.a aVar = (hyk0.a) this.U.getValue();
        if (aVar == null) {
            aVar = new com.vk.search.communities.map.impl.ui.map.c();
        }
        tkt.b a2 = tktVar.a(ko(), aVar, this.Y, this.Z, new pb00(bundle, 22));
        this.V = new i(view, view.findViewById(R.id.back_btn), frameLayout, L, frameLayout2, L2, findViewById, a2, findViewById2);
        if (bundle == null) {
            SearchCommunitiesOnMapListFragment searchCommunitiesOnMapListFragment = new SearchCommunitiesOnMapListFragment();
            FragmentManager childFragmentManager = getChildFragmentManager();
            androidx.fragment.app.a b2 = tk5.b(childFragmentManager, childFragmentManager);
            b2.f(frameLayout.getId(), searchCommunitiesOnMapListFragment, "communities_list", 1);
            b2.k(false);
        } else {
            Fragment H = getChildFragmentManager().H("communities_list");
            this.d0 = H;
            if (H instanceof fda) {
                this.d0 = H;
                ko().d = new com.vk.search.communities.map.impl.ui.map.b((fda) H);
            }
            if (H instanceof toh0.a) {
                ((toh0.a) H).n3(new h());
            }
        }
        GeoFragment Kh = a2.Kh();
        if (getChildFragmentManager().H("map") != Kh) {
            FragmentManager childFragmentManager2 = getChildFragmentManager();
            androidx.fragment.app.a b3 = tk5.b(childFragmentManager2, childFragmentManager2);
            b3.g(findViewById.getId(), Kh, "map");
            b3.k(false);
        }
        i iVar = this.V;
        if (iVar != null) {
            View view2 = iVar.b;
            view2.setOutlineProvider(ViewOutlineProvider.BACKGROUND);
            view2.setClipToOutline(true);
            bwt0.i0(view2, new d2y(this, 29));
        }
        final i iVar2 = this.V;
        if (iVar2 != null) {
            ViewGroup.LayoutParams layoutParams = iVar2.b.getLayoutParams();
            ViewGroup.MarginLayoutParams marginLayoutParams = layoutParams instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams : null;
            final int i2 = marginLayoutParams != null ? marginLayoutParams.topMargin : 0;
            final Ref$IntRef ref$IntRef = new Ref$IntRef();
            View view3 = iVar2.a;
            u080 u080Var = new u080() { // from class: xsna.noh0
                @Override // xsna.u080
                public final bqx0 b(View view4, bqx0 bqx0Var) {
                    int i3 = SearchCommunitiesOnMapFragment.e0;
                    int a3 = wqx0.a(bqx0Var);
                    Ref$IntRef ref$IntRef2 = Ref$IntRef.this;
                    if (a3 == ref$IntRef2.element) {
                        return bqx0.b;
                    }
                    ref$IntRef2.element = wqx0.a(bqx0Var);
                    SearchCommunitiesOnMapFragment.i iVar3 = iVar2;
                    iVar3.d.S(wqx0.a(bqx0Var));
                    iVar3.g.setTranslationY(-wqx0.a(bqx0Var));
                    bwt0.f0(iVar3.g, 0, 0, 0, -wqx0.a(bqx0Var), 7);
                    bwt0.f0(iVar3.b, 0, wqx0.a(bqx0Var) + i2, 0, 0, 13);
                    return bqx0.b;
                }
            };
            WeakHashMap<View, b0u0> weakHashMap = iut0.a;
            iut0.d.c(view3, u080Var);
        }
        i iVar3 = this.V;
        if (iVar3 != null) {
            BottomSheetBehavior<?> bottomSheetBehavior = iVar3.f;
            BottomSheetBehavior<?> bottomSheetBehavior2 = iVar3.d;
            bottomSheetBehavior2.T(false);
            bottomSheetBehavior2.V(false);
            bottomSheetBehavior2.U(0.7f);
            bottomSheetBehavior.T(true);
            bottomSheetBehavior.V(true);
            bottomSheetBehavior.L = false;
            if (getChildFragmentManager().H("community_details") != null) {
                bottomSheetBehavior2.V(true);
                bottomSheetBehavior2.X(5);
                bottomSheetBehavior.X(3);
            } else {
                bottomSheetBehavior2.X(6);
                bottomSheetBehavior.X(5);
            }
            bottomSheetBehavior.D(new d());
            bottomSheetBehavior2.D(new f());
            go(new ge0(15, this, iVar3));
        }
        lo(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
    }
}
