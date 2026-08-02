package com.vk.ecomm.checklist.impl.presentation;

import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.LruCache;
import android.util.TypedValue;
import android.view.View;
import androidx.fragment.app.FragmentManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import com.vk.core.performance.score.PerformanceScoreProduct;
import com.vk.core.ui.measuring.UiMeasuringScreen;
import com.vk.core.ui.tracking.UiTracker;
import com.vk.core.view.components.button.VkButton;
import com.vk.core.view.components.placeholder.VkPlaceholder;
import com.vk.core.view.components.spinner.VkScreenSpinner;
import com.vk.core.view.components.topbar.VkTopBar;
import com.vk.dto.common.id.UserId;
import com.vk.ecomm.checklist.impl.presentation.model.CommunityCheckListArgs;
import com.vk.ecomm.checklist.impl.presentation.model.CommunityCheckListSubscribeVkBusinessResult;
import com.vk.mvi.androidx.MviImplFragment;
import com.vk.stat.scheme.MobileOfficialAppsCoreNavStat$EventScreen;
import com.vk.stat.scheme.MobileOfficialAppsEcommStat$TypeBannerClick;
import com.vk.stat.scheme.MobileOfficialAppsEcommStat$TypeBannerView;
import com.vk.stat.scheme.SchemeStat$EventItem;
import com.vk.stat.scheme.SchemeStat$TypeClick;
import com.vkontakte.android.R;
import java.util.HashSet;
import java.util.UUID;
import kotlin.LazyThreadSafetyMode;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.FunctionReferenceImpl;
import xsna.ac;
import xsna.ao50;
import xsna.awg;
import xsna.bjc;
import xsna.bpn0;
import xsna.cwg;
import xsna.dvq0;
import xsna.ehk0;
import xsna.epx;
import xsna.ewg;
import xsna.f5;
import xsna.f55;
import xsna.fch;
import xsna.fnj;
import xsna.fpf0;
import xsna.fwg;
import xsna.g5;
import xsna.gko;
import xsna.gm50;
import xsna.gwg;
import xsna.hh1;
import xsna.htq0;
import xsna.hzp0;
import xsna.i70;
import xsna.iah0;
import xsna.izs;
import xsna.ji0;
import xsna.ju1;
import xsna.jwg;
import xsna.kf3;
import xsna.km50;
import xsna.krv0;
import xsna.mk50;
import xsna.msy;
import xsna.mvg;
import xsna.mzp0;
import xsna.ncg;
import xsna.ovg;
import xsna.oz50;
import xsna.ozl;
import xsna.ps2;
import xsna.pvg;
import xsna.pwg;
import xsna.qvg;
import xsna.qwg;
import xsna.rzp0;
import xsna.s3q0;
import xsna.swg;
import xsna.tlo0;
import xsna.tq;
import xsna.tw4;
import xsna.uzp0;
import xsna.vk50;
import xsna.xn50;
import xsna.xwg;
import xsna.yvg;
import xsna.yw90;
import xsna.ywg;
import xsna.zqu;
import xsna.zrd0;

/* compiled from: CommunityCheckListFragment.kt */
/* loaded from: classes18.dex */
public final class CommunityCheckListFragment extends MviImplFragment<yvg, xwg, mvg> {
    public static final /* synthetic */ int Y = 0;
    public final bpn0 Q = new bpn0(new ac(this, 23));
    public final Object R;
    public final Object S;
    public final Object T;
    public final Object U;
    public final bpn0 V;
    public VkPlaceholder W;
    public final awg X;

    /* compiled from: CommunityCheckListFragment.kt */
    public static final class a extends oz50 {
    }

    /* compiled from: CommunityCheckListFragment.kt */
    public static final /* synthetic */ class b extends FunctionReferenceImpl implements izs<qvg, s3q0> {
        @Override // xsna.izs
        public final s3q0 invoke(qvg qvgVar) {
            qvg qvgVar2 = qvgVar;
            CommunityCheckListFragment communityCheckListFragment = (CommunityCheckListFragment) this.receiver;
            int i = CommunityCheckListFragment.Y;
            communityCheckListFragment.getClass();
            if (qvgVar2 instanceof qvg.a) {
                SchemeStat$TypeClick b = SchemeStat$TypeClick.a.b(new SchemeStat$EventItem(SchemeStat$EventItem.Type.BANNER, null, null, null, null, null, 62, null), new MobileOfficialAppsEcommStat$TypeBannerClick(MobileOfficialAppsEcommStat$TypeBannerClick.Type.CLICK_MAJOR_LINK, ((qvg.a) qvgVar2).a), 2);
                UiTracker uiTracker = UiTracker.a;
                MobileOfficialAppsCoreNavStat$EventScreen c = UiTracker.c();
                uzp0 uzp0Var = UiTracker.h;
                uzp0Var.getClass();
                new bjc(c, b, uzp0Var.a).q();
            } else {
                if (!(qvgVar2 instanceof qvg.b)) {
                    throw new NoWhenBranchMatchedException();
                }
                new hzp0.q(new SchemeStat$EventItem(SchemeStat$EventItem.Type.BANNER, null, null, null, null, null, 62, null), new MobileOfficialAppsEcommStat$TypeBannerView(MobileOfficialAppsEcommStat$TypeBannerView.Type.SHOW_BANNER, ((qvg.b) qvgVar2).a)).a();
            }
            return s3q0.a;
        }
    }

    public CommunityCheckListFragment() {
        f5 f5Var = new f5(this, 29);
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.NONE;
        this.R = msy.a(lazyThreadSafetyMode, f5Var);
        this.S = msy.a(lazyThreadSafetyMode, new g5(this, 26));
        this.T = msy.a(lazyThreadSafetyMode, new i70(this, 28));
        this.U = msy.a(lazyThreadSafetyMode, new ncg(this, 3));
        this.V = new bpn0(new hh1(this, 25));
        this.X = new awg(this, 0);
        LruCache<UUID, mzp0> lruCache = rzp0.a;
        mzp0 mzp0Var = (mzp0) rzp0.c(UiMeasuringScreen.COMMUNITY_BIZ_CHECKLIST, null, false, 62).j();
        this.J = mzp0Var;
        if (mzp0Var != null) {
            mzp0Var.init();
        }
        zrd0 zrd0Var = zrd0.a;
        yw90 yw90Var = (yw90) zrd0.a(PerformanceScoreProduct.COMMUNITY_BIZ_CHECKLIST).j();
        yw90Var.init();
        this.L = yw90Var;
    }

    public static void fo(VkPlaceholder vkPlaceholder) {
        TypedValue typedValue = krv0.a;
        vkPlaceholder.setTop(new VkPlaceholder.c.b(new gko(epx.f(krv0.i(vkPlaceholder.getContext()), Boolean.TRUE) ? R.drawable.vk_icon_illustration_antenna_dark_56 : R.drawable.vk_icon_illustration_antenna_light_56), null, null, 30));
    }

    @Override // xsna.xn50
    public final mk50 Fl() {
        return new mk50.b(R.layout.community_check_list_fragment);
    }

    @Override // xsna.xn50
    public final void Jh(ao50 ao50Var, View view) {
        xwg xwgVar = (xwg) ao50Var;
        RecyclerView recyclerView = (RecyclerView) view.findViewById(R.id.list);
        recyclerView.setAdapter((ovg) this.Q.getValue());
        recyclerView.addItemDecoration(new ehk0(iah0.a(8), false));
        VkScreenSpinner vkScreenSpinner = (VkScreenSpinner) view.findViewById(R.id.progress_bar);
        SwipeRefreshLayout swipeRefreshLayout = (SwipeRefreshLayout) view.findViewById(R.id.swipe_refresh_layout);
        swipeRefreshLayout.setOnRefreshListener(new ewg(this, 0));
        gm50.a.b(this, xwgVar.b, new f55(this, vkScreenSpinner, swipeRefreshLayout, 2));
        gm50.a.b(this, xwgVar.a, new fwg(this, vkScreenSpinner, swipeRefreshLayout, recyclerView, 0));
        gm50.a.b(this, xwgVar.c, new gwg(vkScreenSpinner, swipeRefreshLayout, this, recyclerView, 0));
    }

    @Override // com.vk.mvi.androidx.MviImplFragment, xsna.xn50
    public final void R4(vk50 vk50Var) {
        ((yvg) vk50Var).l.a(new tw4(1, (swg) this.V.getValue(), swg.class, "handleEvent", "handleEvent(Lcom/vk/ecomm/checklist/impl/presentation/feature/CommunityCheckListNavigationEvent;)V", 0, 4), this);
    }

    @Override // com.vk.core.fragments.FragmentImpl, androidx.fragment.app.Fragment
    @ozl
    public final void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        xn50.a.c(this, new mvg.a(i, i2, intent));
    }

    @Override // com.vk.mvi.androidx.MviImplFragment, com.vk.core.fragments.FragmentImpl, androidx.fragment.app.d, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        FragmentManager supportFragmentManager = kn().getSupportFragmentManager();
        String l = fpf0.a(CommunityCheckListSubscribeVkBusinessResult.class).l();
        if (l == null) {
            l = "";
        }
        supportFragmentManager.l0(l, this, new ps2(this, 13));
    }

    @Override // com.vk.core.fragments.FragmentImpl, androidx.fragment.app.d, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        TypedValue typedValue = krv0.a;
        krv0.k(this.X);
        super.onDestroyView();
    }

    @Override // com.vk.core.fragments.FragmentImpl, androidx.fragment.app.Fragment
    public final void onResume() {
        super.onResume();
        xn50.a.c(this, mvg.g.b);
    }

    @Override // com.vk.mvi.androidx.MviImplFragment, com.vk.core.fragments.FragmentImpl, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        getChildFragmentManager().l0("RESULT_KEY", getViewLifecycleOwner(), new ju1(this, 17));
        getChildFragmentManager().l0("EDIT_SHORTNAME_RESULT_KEY", getViewLifecycleOwner(), new kf3(this, 13));
        VkPlaceholder vkPlaceholder = (VkPlaceholder) view.findViewById(R.id.placeholder);
        this.W = vkPlaceholder;
        fo(vkPlaceholder);
        vkPlaceholder.setMiddle(new VkPlaceholder.b(tq.h(tlo0.Companion, R.string.community_check_list_error_view_title), new tlo0.f(R.string.community_check_list_error_view_description), (com.vk.core.compose.component.semantics.a) null, 10));
        vkPlaceholder.setBottom(new VkPlaceholder.a(new VkPlaceholder.a.C0854a(new tlo0.f(R.string.community_check_list_error_view_retry), new cwg(this, 0), null, null, null, VkButton.Mode.Tertiary, null, false, null, 1916), (VkPlaceholder.a.C0854a) null, 6));
        TypedValue typedValue = krv0.a;
        krv0.a(this.X);
        ji0 ji0Var = new ji0(this, 24);
        VkTopBar vkTopBar = (VkTopBar) view.findViewById(R.id.top_bar);
        vkTopBar.setBack(new VkTopBar.b(ji0Var, new tlo0.f(R.string.community_check_list_accessibility_toolbar_back), null, null, null, 28));
        vkTopBar.setMiddle(new VkTopBar.Middle.Text(new VkTopBar.Middle.Text.Title(new tlo0.f(R.string.community_check_list_title), null, null, null, null, 30), null, null, null, 14));
        vkTopBar.setShowBottomDivider(true);
    }

    /* JADX WARN: Type inference failed for: r3v2, types: [java.lang.Object, kotlin.Lazy] */
    @Override // xsna.xn50
    public final vk50 x8(Bundle bundle, km50 km50Var) {
        Parcelable parcelable;
        Object parcelable2;
        jwg jwgVar = new jwg();
        zqu zquVar = new zqu();
        qwg qwgVar = new qwg(zquVar, jwgVar);
        fch fchVar = new fch(zquVar);
        Bundle requireArguments = requireArguments();
        String l = fpf0.a(CommunityCheckListArgs.class).l();
        if (l == null) {
            l = "";
        }
        if (Build.VERSION.SDK_INT >= 33) {
            parcelable2 = requireArguments.getParcelable(l, CommunityCheckListArgs.class);
            parcelable = (Parcelable) parcelable2;
        } else {
            Parcelable parcelable3 = requireArguments.getParcelable(l);
            if (!(parcelable3 instanceof CommunityCheckListArgs)) {
                parcelable3 = null;
            }
            parcelable = (CommunityCheckListArgs) parcelable3;
        }
        CommunityCheckListArgs communityCheckListArgs = (CommunityCheckListArgs) parcelable;
        UserId userId = communityCheckListArgs != null ? communityCheckListArgs.b : UserId.d;
        String nVar = toString();
        Context requireContext = requireContext();
        HashSet hashSet = iah0.a;
        return new yvg(new pwg(new ywg()), qwgVar, fchVar, userId, new htq0(nVar, null, null, null, fnj.b(requireContext), null, false, ((dvq0) this.S.getValue()).j(this), 16238), new pvg(), this.J, new mvg.c(communityCheckListArgs != null ? communityCheckListArgs.c : null));
    }
}
