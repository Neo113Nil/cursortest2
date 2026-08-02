package com.vk.ecomm.storefrontservices.impl;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.ui.platform.ComposeView;
import com.ironsource.X3;
import com.vk.common.links.LaunchContext;
import com.vk.core.fragments.FragmentImpl;
import com.vk.core.ui.tracking.UiTracker;
import com.vk.core.ui.tracking.UiTrackingScreen;
import com.vk.dto.common.data.CallProducerButton;
import com.vk.dto.common.data.InaccessibilityMessage;
import com.vk.dto.common.id.UserId;
import com.vk.ecomm.market.api.ctabutton.ProductTileCtaButtonType;
import com.vk.ecomm.storefrontservices.api.StorefrontServicesRefSource;
import com.vk.stat.scheme.CommonMarketStat$TypeRefSource;
import com.vk.stat.scheme.MobileOfficialAppsCoreNavStat$EventScreen;
import com.vk.stat.scheme.MobileOfficialAppsMarketStat$TypeMarketClick;
import com.vk.stat.scheme.MobileOfficialAppsMarketStat$TypeMarketOpenSectionClickItem;
import com.vk.stat.scheme.MobileOfficialAppsMarketStat$TypeMarketTransitionToMarketItem;
import com.vk.stat.scheme.SchemeStat$EventItem;
import com.vk.stat.scheme.SchemeStat$TypeClick;
import com.vk.stat.scheme.SchemeStat$TypeMarketService;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.PropertyReference1Impl;
import xsna.bjc;
import xsna.bpn0;
import xsna.cpu;
import xsna.dbj0;
import xsna.dck0;
import xsna.fkq0;
import xsna.fpf0;
import xsna.goi0;
import xsna.izs;
import xsna.j5g;
import xsna.jai;
import xsna.jnl0;
import xsna.ksd0;
import xsna.lnl0;
import xsna.maz;
import xsna.mnl0;
import xsna.mqe0;
import xsna.nc90;
import xsna.nzw;
import xsna.o4e;
import xsna.ool0;
import xsna.oz50;
import xsna.qcy;
import xsna.qz00;
import xsna.s3q0;
import xsna.sz00;
import xsna.t1q0;
import xsna.uoi0;
import xsna.uzp0;
import xsna.vpj0;
import xsna.vrq;
import xsna.wml0;

/* compiled from: StorefrontServicesFragment.kt */
/* loaded from: classes18.dex */
public final class StorefrontServicesFragment extends FragmentImpl {
    public static final /* synthetic */ qcy<Object>[] R;
    public final bpn0 N = new bpn0(new dck0(this, 3));
    public final bpn0 O = new bpn0(new mqe0(this, 15));
    public final nzw P = new nzw(fpf0.d(ool0.class).toString(), this, new dbj0(this, 5));
    public final bpn0 Q = new bpn0(new vpj0(this, 4));

    /* compiled from: StorefrontServicesFragment.kt */
    public static final class a extends oz50 {
        public final StorefrontServicesArgs m;
        public final StorefrontServicesRefSource n;
        public final boolean o;
        public final String p;

        /* compiled from: StorefrontServicesFragment.kt */
        /* renamed from: com.vk.ecomm.storefrontservices.impl.StorefrontServicesFragment$a$a, reason: collision with other inner class name */
        public static final /* synthetic */ class C1023a {
            public static final /* synthetic */ int[] $EnumSwitchMapping$0;

            static {
                int[] iArr = new int[StorefrontServicesRefSource.values().length];
                try {
                    iArr[StorefrontServicesRefSource.COMMUNITY_TAB_SERVICES.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[StorefrontServicesRefSource.COMMUNITY_PRIORITY_BLOCK_SERVICES.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[StorefrontServicesRefSource.COMMUNITY_TRUST_MARKS.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                $EnumSwitchMapping$0 = iArr;
            }
        }

        public a(StorefrontServicesArgs storefrontServicesArgs, StorefrontServicesRefSource storefrontServicesRefSource, boolean z, String str) {
            super(StorefrontServicesFragment.class, null, null);
            this.m = storefrontServicesArgs;
            this.n = storefrontServicesRefSource;
            this.o = z;
            this.p = str;
            this.j.putParcelable("arguments_storefront_services", storefrontServicesArgs);
        }

        @Override // xsna.oz50
        public final void r(Intent intent) {
            CommonMarketStat$TypeRefSource commonMarketStat$TypeRefSource;
            MobileOfficialAppsMarketStat$TypeMarketOpenSectionClickItem.BlockType blockType;
            CommonMarketStat$TypeRefSource commonMarketStat$TypeRefSource2;
            StorefrontServicesRefSource storefrontServicesRefSource = this.n;
            int i = storefrontServicesRefSource == null ? -1 : C1023a.$EnumSwitchMapping$0[storefrontServicesRefSource.ordinal()];
            if (i != -1) {
                if (i == 1) {
                    commonMarketStat$TypeRefSource2 = CommonMarketStat$TypeRefSource.COMMUNITY_TAB_SERVICES;
                } else if (i == 2) {
                    commonMarketStat$TypeRefSource2 = CommonMarketStat$TypeRefSource.COMMUNITY_PRIORITY_BLOCK_SERVICES;
                } else {
                    if (i != 3) {
                        throw new NoWhenBranchMatchedException();
                    }
                    commonMarketStat$TypeRefSource2 = CommonMarketStat$TypeRefSource.COMMUNITY_TRUST_MARKS;
                }
                commonMarketStat$TypeRefSource = commonMarketStat$TypeRefSource2;
            } else {
                commonMarketStat$TypeRefSource = null;
            }
            StorefrontServicesArgs storefrontServicesArgs = this.m;
            UserId userId = storefrontServicesArgs.b;
            String str = this.p;
            if (str == null) {
                str = "";
            }
            try {
                blockType = MobileOfficialAppsMarketStat$TypeMarketOpenSectionClickItem.BlockType.valueOf(str);
            } catch (IllegalArgumentException unused) {
                blockType = null;
            }
            SchemeStat$EventItem schemeStat$EventItem = new SchemeStat$EventItem(SchemeStat$EventItem.Type.GROUP, Long.valueOf(fkq0.a(userId).b), null, null, null, null, 60, null);
            t1q0 t1q0Var = UiTracker.j;
            UiTrackingScreen b = t1q0Var.b();
            SchemeStat$TypeClick b2 = SchemeStat$TypeClick.a.b(schemeStat$EventItem, MobileOfficialAppsMarketStat$TypeMarketClick.a.b(null, b != null ? b.a : null, commonMarketStat$TypeRefSource, null, null, new MobileOfficialAppsMarketStat$TypeMarketOpenSectionClickItem(MobileOfficialAppsMarketStat$TypeMarketOpenSectionClickItem.EventType.OPEN_COMMUNITY_SERVICE_GOODS, blockType), 57), 2);
            UiTracker uiTracker = UiTracker.a;
            MobileOfficialAppsCoreNavStat$EventScreen c = UiTracker.c();
            uzp0 uzp0Var = UiTracker.h;
            uzp0Var.getClass();
            new bjc(c, b2, uzp0Var.a).q();
            if (this.o) {
                SchemeStat$EventItem schemeStat$EventItem2 = new SchemeStat$EventItem(SchemeStat$EventItem.Type.CLICK_ITEM, null, Long.valueOf(storefrontServicesArgs.b.b), null, null, null, 58, null);
                UiTracker uiTracker2 = UiTracker.a;
                MobileOfficialAppsCoreNavStat$EventScreen c2 = UiTracker.c();
                UiTrackingScreen b3 = t1q0Var.b();
                SchemeStat$TypeClick b4 = SchemeStat$TypeClick.a.b(schemeStat$EventItem2, MobileOfficialAppsMarketStat$TypeMarketClick.a.b(1, b3 != null ? b3.a : null, commonMarketStat$TypeRefSource, c2, null, new MobileOfficialAppsMarketStat$TypeMarketTransitionToMarketItem(null, null, null, null, null, 31, null), 48), 2);
                UiTracker uiTracker3 = UiTracker.a;
                MobileOfficialAppsCoreNavStat$EventScreen c3 = UiTracker.c();
                uzp0 uzp0Var2 = UiTracker.h;
                uzp0Var2.getClass();
                new bjc(c3, b4, uzp0Var2.a).q();
            }
        }
    }

    /* compiled from: StorefrontServicesFragment.kt */
    public static final /* synthetic */ class b extends FunctionReferenceImpl implements izs<lnl0.a, s3q0> {
        /* JADX WARN: Type inference failed for: r0v10, types: [java.lang.Object, kotlin.Lazy] */
        /* JADX WARN: Type inference failed for: r1v5, types: [java.lang.Object, kotlin.Lazy] */
        /* JADX WARN: Type inference failed for: r3v1, types: [java.lang.Object, kotlin.Lazy] */
        @Override // xsna.izs
        public final s3q0 invoke(lnl0.a aVar) {
            CallProducerButton callProducerButton;
            lnl0.a aVar2 = aVar;
            mnl0 mnl0Var = (mnl0) this.receiver;
            jnl0 jnl0Var = mnl0Var.b;
            FragmentImpl fragmentImpl = mnl0Var.a;
            if (!(aVar2 instanceof lnl0.a.j)) {
                if (aVar2 instanceof lnl0.a.b) {
                    goi0 goi0Var = ((lnl0.a.b) aVar2).a;
                    com.vk.ecomm.storefrontservices.api.a.a((com.vk.ecomm.storefrontservices.api.a) jnl0Var.b.getValue(), fragmentImpl.requireContext(), goi0Var.b, Integer.valueOf(goi0Var.a), null, goi0Var.c, false, null, null, 488);
                } else if (aVar2 instanceof lnl0.a.c) {
                    com.vk.ecomm.storefrontservices.api.a.a((com.vk.ecomm.storefrontservices.api.a) jnl0Var.b.getValue(), fragmentImpl.requireContext(), ((lnl0.a.c) aVar2).a, null, null, null, true, null, null, 476);
                } else if (aVar2 instanceof lnl0.a.e) {
                    lnl0.a.e eVar = (lnl0.a.e) aVar2;
                    uoi0 uoi0Var = eVar.a;
                    ((sz00) jnl0Var.c.getValue()).d(fragmentImpl.requireContext(), new qz00(uoi0Var.i, uoi0Var.p, eVar.b, Integer.valueOf(eVar.c), null, null, null, null, null, null, null, null, null, 1048560));
                } else if (aVar2 instanceof lnl0.a.h) {
                    lnl0.a.h hVar = (lnl0.a.h) aVar2;
                    com.vk.ecomm.storefrontservices.api.a.a((com.vk.ecomm.storefrontservices.api.a) jnl0Var.b.getValue(), fragmentImpl.requireContext(), hVar.a, null, hVar.b, hVar.c, false, null, null, 484);
                } else if (aVar2 instanceof lnl0.a.i) {
                    lnl0.a.i iVar = (lnl0.a.i) aVar2;
                    uoi0 uoi0Var2 = iVar.a;
                    View requireView = fragmentImpl.requireView();
                    Integer valueOf = Integer.valueOf(iVar.b);
                    CommonMarketStat$TypeRefSource commonMarketStat$TypeRefSource = iVar.c;
                    List<CallProducerButton> list = uoi0Var2.e;
                    if (list != null && (callProducerButton = (CallProducerButton) j5g.a0(list)) != null) {
                        ksd0 ksd0Var = (ksd0) jnl0Var.e.getValue();
                        Context requireContext = fragmentImpl.requireContext();
                        ProductTileCtaButtonType.a aVar3 = ProductTileCtaButtonType.Companion;
                        int i = callProducerButton.b;
                        aVar3.getClass();
                        ProductTileCtaButtonType a = ProductTileCtaButtonType.a.a(i);
                        ksd0.b bVar = new ksd0.b(uoi0Var2.i, uoi0Var2.p, uoi0Var2.s, uoi0Var2.t, null, null, uoi0Var2.j, uoi0Var2.d, uoi0Var2.h.a);
                        String str = callProducerButton.k;
                        String str2 = callProducerButton.d;
                        UserId userId = callProducerButton.i;
                        InaccessibilityMessage inaccessibilityMessage = callProducerButton.j;
                        String str3 = inaccessibilityMessage != null ? inaccessibilityMessage.b : null;
                        String str4 = inaccessibilityMessage != null ? inaccessibilityMessage.c : null;
                        Boolean bool = callProducerButton.f;
                        ksd0Var.a(requireContext, new ksd0.c(requireView, a, bVar, str, new ksd0.c.b(userId, str2, str3, str4, callProducerButton.l, bool != null ? bool.booleanValue() : true), valueOf, new ksd0.c.a(commonMarketStat$TypeRefSource, null, null), new nc90(16), true));
                    }
                } else if (aVar2 instanceof lnl0.a.f) {
                    maz.c((maz) jnl0Var.h.getValue(), fragmentImpl.requireContext(), ((lnl0.a.f) aVar2).a, LaunchContext.A, null, null, 24);
                } else if (aVar2 instanceof lnl0.a.C3278a) {
                    fragmentImpl.finish();
                } else if (aVar2 instanceof lnl0.a.d) {
                    ((vrq) jnl0Var.g.getValue()).a(fragmentImpl.requireContext());
                } else {
                    if (!(aVar2 instanceof lnl0.a.g)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    ((cpu) jnl0Var.i.getValue()).j(fragmentImpl, fkq0.e(((lnl0.a.g) aVar2).a), (r19 & 4) != 0 ? null : null, (r19 & 8) != 0 ? null : "section_services", (r19 & 16) != 0 ? null : null, (r19 & 32) != 0 ? null : null, (r19 & 64) == 0 ? "community_page" : null, (r19 & 128) == 0);
                }
            }
            return s3q0.a;
        }
    }

    static {
        PropertyReference1Impl propertyReference1Impl = new PropertyReference1Impl(StorefrontServicesFragment.class, X3.i.U, "getStore()Lcom/vk/ecomm/storefrontservices/impl/presentation/feature/StorefrontServicesStore;", 0);
        fpf0.a.getClass();
        R = new qcy[]{propertyReference1Impl};
    }

    @Override // com.vk.core.fragments.FragmentImpl
    public final boolean a0() {
        qcy<Object> qcyVar = R[0];
        ((ool0) this.P.getValue()).b(wml0.a.d.b);
        return true;
    }

    public final StorefrontServicesArgs eo() {
        return (StorefrontServicesArgs) this.N.getValue();
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        ComposeView composeView = new ComposeView(requireContext(), null, 6);
        composeView.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        composeView.setContent(new jai(-351062121, new o4e(this, 12), true));
        return composeView;
    }

    @Override // com.vk.core.fragments.FragmentImpl, xsna.m0q0
    public final void y(UiTrackingScreen uiTrackingScreen) {
        SchemeStat$TypeMarketService schemeStat$TypeMarketService;
        uiTrackingScreen.a = MobileOfficialAppsCoreNavStat$EventScreen.MARKET_SERVICE;
        uiTrackingScreen.f = new SchemeStat$EventItem(SchemeStat$EventItem.Type.MARKET, null, Long.valueOf(eo().b.b), null, null, null, 58, null);
        if (eo().f) {
            schemeStat$TypeMarketService = new SchemeStat$TypeMarketService(SchemeStat$TypeMarketService.Subtype.TRANSITION_TO_SERVICES_ALBUM, null, null, 6, null);
        } else if (eo().c != null) {
            schemeStat$TypeMarketService = new SchemeStat$TypeMarketService(SchemeStat$TypeMarketService.Subtype.TRANSITION_TO_SERVICES_ALBUM, eo().c, null, 4, null);
        } else {
            String str = eo().d;
            schemeStat$TypeMarketService = (str == null || str.length() == 0) ? new SchemeStat$TypeMarketService(SchemeStat$TypeMarketService.Subtype.TRANSITION_TO_SERVICES, null, null, 6, null) : new SchemeStat$TypeMarketService(SchemeStat$TypeMarketService.Subtype.TRANSITION_TO_SERVICES_SECTION, null, eo().d, 2, null);
        }
        uiTrackingScreen.a(schemeStat$TypeMarketService);
    }
}
