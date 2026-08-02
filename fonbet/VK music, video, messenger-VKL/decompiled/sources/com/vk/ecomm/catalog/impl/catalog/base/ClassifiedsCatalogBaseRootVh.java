package com.vk.ecomm.catalog.impl.catalog.base;

import android.app.Activity;
import android.os.Bundle;
import androidx.fragment.app.FragmentManager;
import com.vk.api.generated.market.dto.MarketProfileInfoDto;
import com.vk.catalog2.common.dto.api.ui.UIBlock;
import com.vk.catalog2.common.dto.ui.UIBlockGroup;
import com.vk.catalog2.common.dto.ui.UIBlockList;
import com.vk.catalog2.common.dto.ui.market.UIBlockMarketGroupInfoItem;
import com.vk.catalog2.common.dto.ui.market.UIBlockMarketItem;
import com.vk.catalog2.common.ui.core.analytics.tracking.GroupAnalyticsInfo;
import com.vk.catalog2.common.ui.mvp.holder.CatalogRootViewHolder;
import com.vk.core.ui.tracking.UiTracker;
import com.vk.core.ui.tracking.UiTrackingScreen;
import com.vk.dto.common.Good;
import com.vk.dto.common.id.UserId;
import com.vk.dto.fave.MarketFavable;
import com.vk.ecomm.api.analytics.MarketAnalyticsParams;
import com.vk.ecomm.cart.api.router.models.CartCounterState;
import com.vk.ecomm.catalog.impl.catalog.base.b;
import com.vk.ecomm.market.api.di.MarketComponent;
import com.vk.ecomm.storefront.api.di.StorefrontComponent;
import com.vk.movika.sdk.base.logic.processor.h;
import com.vk.stat.scheme.CommonMarketStat$TypeRefSource;
import com.vk.stat.scheme.MobileOfficialAppsCoreNavStat$EventScreen;
import com.vk.stat.scheme.MobileOfficialAppsMarketStat$TypeMarketClick;
import com.vk.stat.scheme.MobileOfficialAppsMarketStat$TypeMarketplaceMarketClickItem;
import com.vk.stat.scheme.MobileOfficialAppsMarketStat$TypeMarketplaceSubscribeMarketButtonClickItem;
import com.vk.stat.scheme.SchemeStat$EventItem;
import com.vk.stat.scheme.SchemeStat$TypeClick;
import io.reactivex.rxjava3.internal.operators.observable.m1;
import io.reactivex.rxjava3.subjects.f;
import java.util.Iterator;
import kotlin.Lazy;
import kotlin.jvm.internal.FunctionReferenceImpl;
import xsna.b5a;
import xsna.bjc;
import xsna.bpn0;
import xsna.bu1;
import xsna.cfp0;
import xsna.dfp0;
import xsna.f5z;
import xsna.fpf0;
import xsna.fy9;
import xsna.g3a;
import xsna.g530;
import xsna.gmq;
import xsna.gr3;
import xsna.hwg0;
import xsna.izs;
import xsna.jw00;
import xsna.k7m;
import xsna.ksd0;
import xsna.kw00;
import xsna.kwg0;
import xsna.l3a;
import xsna.m3a;
import xsna.m7m;
import xsna.mt00;
import xsna.n0q0;
import xsna.nda;
import xsna.o5a;
import xsna.orp;
import xsna.pgc;
import xsna.pp3;
import xsna.q3a;
import xsna.q530;
import xsna.qjg;
import xsna.rsg0;
import xsna.s3q0;
import xsna.sf1;
import xsna.t8f0;
import xsna.tfx;
import xsna.tm0;
import xsna.u4a;
import xsna.up;
import xsna.up2;
import xsna.uzp0;
import xsna.vp;
import xsna.wfc;
import xsna.y50;
import xsna.yd10;
import xsna.yfb;
import xsna.yfc;
import xsna.ze10;
import xsna.zfc;

/* compiled from: ClassifiedsCatalogBaseRootVh.kt */
/* loaded from: classes18.dex */
public abstract class ClassifiedsCatalogBaseRootVh extends CatalogRootViewHolder implements g530, n0q0 {
    public final wfc A;
    public final io.reactivex.rxjava3.disposables.b B;
    public final io.reactivex.rxjava3.disposables.b C;
    public MarketProfileInfoDto D;
    public final zfc E;
    public final com.vk.ecomm.catalog.impl.catalog.base.a F;
    public final com.vk.ecomm.catalog.impl.catalog.base.b G;
    public final yfc p;
    public final yd10 q;
    public final ze10 r;
    public final MarketComponent s;
    public final bpn0 t;
    public final bpn0 u;
    public final bpn0 v;
    public final String w;
    public final String x;
    public final MarketAnalyticsParams y;
    public final g3a z;

    /* compiled from: ClassifiedsCatalogBaseRootVh.kt */
    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[GroupAnalyticsInfo.ClickTarget.values().length];
            try {
                iArr[GroupAnalyticsInfo.ClickTarget.Join.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[GroupAnalyticsInfo.ClickTarget.Leave.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[GroupAnalyticsInfo.ClickTarget.Open.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* compiled from: ClassifiedsCatalogBaseRootVh.kt */
    public static final /* synthetic */ class b extends FunctionReferenceImpl implements izs<MarketProfileInfoDto, s3q0> {
        @Override // xsna.izs
        public final s3q0 invoke(MarketProfileInfoDto marketProfileInfoDto) {
            ((ClassifiedsCatalogBaseRootVh) this.receiver).i0(marketProfileInfoDto);
            return s3q0.a;
        }
    }

    /* compiled from: ClassifiedsCatalogBaseRootVh.kt */
    public static final /* synthetic */ class c extends FunctionReferenceImpl implements izs<l3a, s3q0> {
        @Override // xsna.izs
        public final s3q0 invoke(l3a l3aVar) {
            ((zfc) this.receiver).a(l3aVar);
            return s3q0.a;
        }
    }

    public ClassifiedsCatalogBaseRootVh(Bundle bundle, Activity activity, o5a o5aVar, FragmentManager fragmentManager, ClassifiedsBaseCatalogFragment classifiedsBaseCatalogFragment) {
        super(bundle, (Class<?>) null, activity, (nda) o5aVar, false, fragmentManager, (f5z) classifiedsBaseCatalogFragment);
        yfc yfcVar = bundle != null ? new yfc(bundle) : null;
        this.p = yfcVar;
        this.q = new yd10();
        this.r = new ze10();
        this.s = (MarketComponent) ((k7m) m7m.f(this)).a(fpf0.a(MarketComponent.class));
        this.t = new bpn0(new bu1(this, 10));
        this.u = new bpn0(new h(this, 12));
        this.v = new bpn0(new com.vk.movika.sdk.base.model.b(this, 15));
        this.w = qjg.a(this).concat("_carts");
        this.x = qjg.a(this).concat("_bookmarks");
        MarketAnalyticsParams b2 = yfcVar != null ? yfcVar.b() : null;
        this.y = b2;
        u4a u4aVar = this.m;
        this.z = u4aVar.b.s.S(u4aVar, null);
        this.A = new wfc();
        this.B = new io.reactivex.rxjava3.disposables.b();
        this.C = new io.reactivex.rxjava3.disposables.b();
        u4a.a aVar = this.m.b;
        b5a b5aVar = aVar.f;
        q3a q3aVar = aVar.e;
        Lazy<ksd0> lazy = aVar.N;
        this.E = new zfc(b5aVar, q3aVar, lazy != null ? lazy.getValue() : null, activity, b2, ((MarketComponent) ((k7m) m7m.f(this)).a(fpf0.a(MarketComponent.class))).Ob(), new tm0(this, 22), ((MarketComponent) ((k7m) m7m.f(this)).a(fpf0.a(MarketComponent.class))).C3(), ((StorefrontComponent) ((k7m) m7m.f(this)).a(fpf0.a(StorefrontComponent.class))).a(), 128);
        com.vk.ecomm.catalog.impl.catalog.base.a aVar2 = new com.vk.ecomm.catalog.impl.catalog.base.a();
        this.F = aVar2;
        b.C0927b j0 = j0(false);
        u4a.a aVar3 = this.m.b;
        this.G = new com.vk.ecomm.catalog.impl.catalog.base.b(aVar3.a, aVar2, j0, aVar3.e);
    }

    @Override // xsna.g530
    public final void H2() {
        this.m.b.e.b(new t8f0(new sf1(this, 21), false), false);
    }

    @Override // com.vk.catalog2.common.ui.mvp.holder.CatalogRootViewHolder
    public final orp Q() {
        f5z f5zVar = this.d;
        if (f5zVar == null) {
            return null;
        }
        q530 e = up2.e(this, this.b, f5zVar, false);
        e.d(this);
        return new pgc(e);
    }

    @Override // com.vk.catalog2.common.ui.mvp.holder.CatalogRootViewHolder
    public void S(cfp0 cfp0Var) {
        CommonMarketStat$TypeRefSource commonMarketStat$TypeRefSource;
        CommonMarketStat$TypeRefSource commonMarketStat$TypeRefSource2;
        CommonMarketStat$TypeRefSource commonMarketStat$TypeRefSource3;
        CommonMarketStat$TypeRefSource commonMarketStat$TypeRefSource4;
        UserId userId;
        Object obj = cfp0Var.b;
        UIBlock uIBlock = cfp0Var.a;
        boolean z = uIBlock instanceof UIBlockMarketItem;
        wfc wfcVar = this.A;
        MarketAnalyticsParams marketAnalyticsParams = this.y;
        if (z) {
            UIBlockMarketItem uIBlockMarketItem = (UIBlockMarketItem) uIBlock;
            if (obj == null) {
                return;
            }
            if (!(obj instanceof UIBlockMarketItem.a)) {
                if (obj instanceof UIBlockMarketItem.b) {
                    UIBlockMarketItem.b bVar = (UIBlockMarketItem.b) obj;
                    gmq gmqVar = bVar.a;
                    MarketFavable marketFavable = gmqVar instanceof MarketFavable ? (MarketFavable) gmqVar : null;
                    if (marketFavable == null) {
                        return;
                    }
                    mt00.h(new mt00.a((int) marketFavable.b, marketFavable.c, marketFavable.f, marketAnalyticsParams != null ? marketAnalyticsParams.d : null, null, bVar.b, marketAnalyticsParams != null ? marketAnalyticsParams.e : null, marketAnalyticsParams != null ? marketAnalyticsParams.f : null, marketAnalyticsParams != null ? marketAnalyticsParams.g : null, bVar.c, 2096));
                    return;
                }
                return;
            }
            UIBlockMarketItem.a aVar = (UIBlockMarketItem.a) obj;
            Good good = aVar.a;
            String str = uIBlockMarketItem.b;
            Long valueOf = good != null ? Long.valueOf(good.b) : null;
            Long valueOf2 = (good == null || (userId = good.c) == null) ? null : Long.valueOf(userId.b);
            String str2 = aVar.b;
            Integer num = aVar.c;
            if (marketAnalyticsParams == null || (commonMarketStat$TypeRefSource4 = marketAnalyticsParams.d) == null) {
                commonMarketStat$TypeRefSource4 = CommonMarketStat$TypeRefSource.MARKETPLACE;
            }
            wfc.a aVar2 = new wfc.a(valueOf, valueOf2, str, null, str2, num, commonMarketStat$TypeRefSource4, marketAnalyticsParams != null ? marketAnalyticsParams.j : null);
            wfcVar.getClass();
            wfc.c(aVar2);
            return;
        }
        if (uIBlock instanceof UIBlockMarketGroupInfoItem) {
            UIBlockMarketGroupInfoItem uIBlockMarketGroupInfoItem = (UIBlockMarketGroupInfoItem) uIBlock;
            UIBlockMarketGroupInfoItem.a aVar3 = obj instanceof UIBlockMarketGroupInfoItem.a ? (UIBlockMarketGroupInfoItem.a) obj : null;
            if (aVar3 == null) {
                return;
            }
            Good good2 = aVar3.b;
            if (good2 != null) {
                String str3 = uIBlockMarketGroupInfoItem.b;
                Long valueOf3 = Long.valueOf(good2.b);
                UserId userId2 = good2.c;
                Long valueOf4 = userId2 != null ? Long.valueOf(userId2.b) : null;
                String str4 = aVar3.c;
                String str5 = aVar3.d;
                if (marketAnalyticsParams == null || (commonMarketStat$TypeRefSource3 = marketAnalyticsParams.d) == null) {
                    commonMarketStat$TypeRefSource3 = CommonMarketStat$TypeRefSource.MARKETPLACE;
                }
                wfc.a aVar4 = new wfc.a(valueOf3, valueOf4, str3, str4, str5, null, commonMarketStat$TypeRefSource3, marketAnalyticsParams != null ? marketAnalyticsParams.j : null);
                wfcVar.getClass();
                wfc.c(aVar4);
                return;
            }
            String str6 = uIBlockMarketGroupInfoItem.b;
            Long valueOf5 = Long.valueOf(aVar3.a);
            String str7 = aVar3.c;
            String str8 = aVar3.d;
            if (marketAnalyticsParams == null || (commonMarketStat$TypeRefSource2 = marketAnalyticsParams.d) == null) {
                commonMarketStat$TypeRefSource2 = CommonMarketStat$TypeRefSource.MARKETPLACE;
            }
            String str9 = marketAnalyticsParams != null ? marketAnalyticsParams.j : null;
            wfcVar.getClass();
            if (commonMarketStat$TypeRefSource2 != wfc.a) {
                return;
            }
            SchemeStat$EventItem schemeStat$EventItem = new SchemeStat$EventItem(SchemeStat$EventItem.Type.GROUP, valueOf5, null, str7, str8, null, 36, null);
            UiTrackingScreen b2 = UiTracker.j.b();
            SchemeStat$TypeClick a2 = SchemeStat$TypeClick.a.a(schemeStat$EventItem, null, MobileOfficialAppsMarketStat$TypeMarketClick.a.b(1, b2 != null ? b2.a : null, null, null, str9, new MobileOfficialAppsMarketStat$TypeMarketplaceMarketClickItem(str6), 44));
            UiTracker uiTracker = UiTracker.a;
            MobileOfficialAppsCoreNavStat$EventScreen c2 = UiTracker.c();
            uzp0 uzp0Var = UiTracker.h;
            uzp0Var.getClass();
            new bjc(c2, a2, uzp0Var.a).q();
            return;
        }
        if (!(uIBlock instanceof UIBlockGroup)) {
            super.S(cfp0Var);
            return;
        }
        UIBlockGroup uIBlockGroup = (UIBlockGroup) uIBlock;
        GroupAnalyticsInfo groupAnalyticsInfo = obj instanceof GroupAnalyticsInfo ? (GroupAnalyticsInfo) obj : null;
        if (groupAnalyticsInfo == null) {
            return;
        }
        int i = a.$EnumSwitchMapping$0[groupAnalyticsInfo.a.ordinal()];
        ze10 ze10Var = this.r;
        if (i == 1) {
            ze10.a aVar5 = new ze10.a(MobileOfficialAppsMarketStat$TypeMarketplaceSubscribeMarketButtonClickItem.EventType.SUBSCRIBE, uIBlockGroup.y.c, uIBlockGroup.r(), uIBlockGroup.b);
            ze10Var.getClass();
            ze10.a(aVar5);
            return;
        }
        if (i == 2) {
            ze10.a aVar6 = new ze10.a(MobileOfficialAppsMarketStat$TypeMarketplaceSubscribeMarketButtonClickItem.EventType.UNSUBSCRIBE, uIBlockGroup.y.c, uIBlockGroup.r(), uIBlockGroup.b);
            ze10Var.getClass();
            ze10.a(aVar6);
            return;
        }
        if (i != 3) {
            return;
        }
        Long valueOf6 = Long.valueOf(uIBlockGroup.y.c.b);
        String str10 = uIBlockGroup.b;
        String r = uIBlockGroup.r();
        if (marketAnalyticsParams == null || (commonMarketStat$TypeRefSource = marketAnalyticsParams.d) == null) {
            commonMarketStat$TypeRefSource = CommonMarketStat$TypeRefSource.MARKETPLACE;
        }
        String str11 = marketAnalyticsParams != null ? marketAnalyticsParams.j : null;
        wfcVar.getClass();
        if (commonMarketStat$TypeRefSource != wfc.a) {
            return;
        }
        SchemeStat$EventItem schemeStat$EventItem2 = new SchemeStat$EventItem(SchemeStat$EventItem.Type.GROUP, valueOf6, null, null, r, null, 36, null);
        UiTrackingScreen b3 = UiTracker.j.b();
        SchemeStat$TypeClick a3 = SchemeStat$TypeClick.a.a(schemeStat$EventItem2, null, MobileOfficialAppsMarketStat$TypeMarketClick.a.b(1, b3 != null ? b3.a : null, null, null, str11, new MobileOfficialAppsMarketStat$TypeMarketplaceMarketClickItem(str10), 44));
        UiTracker uiTracker2 = UiTracker.a;
        MobileOfficialAppsCoreNavStat$EventScreen c3 = UiTracker.c();
        uzp0 uzp0Var2 = UiTracker.h;
        uzp0Var2.getClass();
        new bjc(c3, a3, uzp0Var2.a).q();
    }

    @Override // com.vk.catalog2.common.ui.mvp.holder.CatalogRootViewHolder
    public void Y() {
        k0().f.e();
        this.C.dispose();
    }

    @Override // com.vk.catalog2.common.ui.mvp.holder.CatalogRootViewHolder
    public final io.reactivex.rxjava3.disposables.c f0(m3a m3aVar) {
        f fVar = (f) m3aVar.b;
        y50 y50Var = new y50(new c(1, this.E, zfc.class, "handleCatalogClickEvent", "handleCatalogClickEvent(Lcom/vk/catalog2/common/ui/core/events/click/CatalogClickEvent;)V", 0), 12);
        int i = kwg0.a;
        return fVar.subscribe(y50Var, new hwg0());
    }

    public void i0(MarketProfileInfoDto marketProfileInfoDto) {
        this.D = marketProfileInfoDto;
    }

    public final b.C0927b j0(boolean z) {
        yfc yfcVar = this.p;
        return new b.C0927b(yfcVar != null ? yfcVar.a.getString("KEY_ITEM_ID") : null, this.y, yfcVar != null ? yfcVar.c() : null, yfcVar != null ? yfcVar.a() : null, z);
    }

    public com.vk.ecomm.catalog.impl.catalog.base.b k0() {
        return this.G;
    }

    public final void l0() {
        this.q.getClass();
        m1 y0 = rsg0.y0(yfb.x(new tfx("market.getProfileInfo", new up(18), new vp(22))), null, null, 3);
        pp3 pp3Var = new pp3(new b(1, this, ClassifiedsCatalogBaseRootVh.class, "bindProfileData", "bindProfileData(Lcom/vk/api/generated/market/dto/MarketProfileInfoDto;)V", 0), 7);
        int i = kwg0.a;
        this.B.b(y0.subscribe(pp3Var, new hwg0()));
    }

    public final void n0() {
        jw00 jw00Var = ((kw00) this.u.getValue()).d(new jw00.d[0]).get(jw00.a.c);
        fy9.a((fy9) this.v.getValue(), this.b, null, new CartCounterState(jw00Var != null ? jw00Var.a() : 0), null, 10);
    }

    public final void o0(UIBlockList uIBlockList) {
        CommonMarketStat$TypeRefSource commonMarketStat$TypeRefSource;
        Object obj;
        MarketAnalyticsParams b2;
        String str = uIBlockList.b;
        Iterator<T> it = uIBlockList.y.iterator();
        while (true) {
            commonMarketStat$TypeRefSource = null;
            if (!it.hasNext()) {
                obj = null;
                break;
            } else {
                obj = it.next();
                if (obj instanceof dfp0) {
                    break;
                }
            }
        }
        if (!(obj instanceof dfp0)) {
            obj = null;
        }
        dfp0 dfp0Var = (dfp0) obj;
        String r = dfp0Var != null ? dfp0Var.r() : null;
        yfc yfcVar = this.p;
        if (yfcVar != null && (b2 = yfcVar.b()) != null) {
            commonMarketStat$TypeRefSource = b2.d;
        }
        mt00.e(str, r, commonMarketStat$TypeRefSource);
    }

    @Override // com.vk.catalog2.common.ui.mvp.holder.CatalogRootViewHolder
    public void onPause() {
        this.B.e();
        bpn0 bpn0Var = this.u;
        ((kw00) bpn0Var.getValue()).b(this.w);
        ((kw00) bpn0Var.getValue()).b(this.x);
    }

    @Override // com.vk.catalog2.common.ui.mvp.holder.CatalogRootViewHolder
    public void onResume() {
        bpn0 bpn0Var = this.u;
        ((kw00) bpn0Var.getValue()).a(this.w, new jw00.d[]{jw00.a.c}, new gr3(this, 10));
        ((kw00) bpn0Var.getValue()).a(this.x, new jw00.d[]{jw00.c.c}, new com.vk.im.engine.internal.api_commands.messages.a(this, 15));
        l0();
    }

    @Override // xsna.g530
    public final void g3() {
    }

    public void p0(jw00.c cVar) {
    }

    public void q0(jw00.a aVar) {
    }
}
