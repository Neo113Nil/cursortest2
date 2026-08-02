package com.vk.ecomm.cart.impl.cart.ui.emptycart;

import android.app.Activity;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import com.mbridge.msdk.playercommon.exoplayer2.extractor.ts.PsExtractor;
import com.vk.catalog2.common.dto.api.ui.UIBlock;
import com.vk.catalog2.common.dto.ui.actions.UIBlockActionOpenUrl;
import com.vk.catalog2.common.dto.ui.market.UIBlockMarketItem;
import com.vk.catalog2.common.ui.holders.ErrorStateVh;
import com.vk.catalog2.common.ui.holders.SwitchCatalogVh;
import com.vk.catalog2.common.ui.holders.api.CatalogStatesViewHolder;
import com.vk.catalog2.common.ui.mvp.holder.CatalogRootViewHolder;
import com.vk.catalog2.common.ui.mvp.holder.container.ViewPagerVh;
import com.vk.core.ui.tracking.UiTracker;
import com.vk.core.ui.tracking.UiTrackingScreen;
import com.vk.dto.common.actions.ActionOpenUrl;
import com.vk.dto.fave.MarketFavable;
import com.vk.ecomm.api.analytics.MarketAnalyticsParams;
import com.vk.ecomm.market.api.di.MarketComponent;
import com.vk.ecomm.storefront.api.di.StorefrontComponent;
import com.vk.stat.scheme.CommonMarketStat$TypeMarketTransitionToBookmarks;
import com.vk.stat.scheme.CommonMarketStat$TypeRefSource;
import com.vk.stat.scheme.MobileOfficialAppsMarketStat$TypeMarketClick;
import io.reactivex.rxjava3.disposables.c;
import io.reactivex.rxjava3.subjects.f;
import kotlin.Lazy;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.text.Regex;
import xsna.b5a;
import xsna.bnn0;
import xsna.cfp0;
import xsna.cnh;
import xsna.f5z;
import xsna.fpf0;
import xsna.g3a;
import xsna.g530;
import xsna.gmq;
import xsna.gzp0;
import xsna.hwg0;
import xsna.izs;
import xsna.k7m;
import xsna.ksd0;
import xsna.kwg0;
import xsna.l3a;
import xsna.ltz;
import xsna.m3a;
import xsna.m7m;
import xsna.mzp0;
import xsna.n0q0;
import xsna.nda;
import xsna.orp;
import xsna.ov;
import xsna.oz;
import xsna.pgc;
import xsna.q3a;
import xsna.q530;
import xsna.s3q0;
import xsna.swp;
import xsna.t8f0;
import xsna.tm0;
import xsna.u4a;
import xsna.u4e;
import xsna.up2;
import xsna.wv9;
import xsna.yw9;
import xsna.zfc;

/* compiled from: EmptyCartRootViewHolder.kt */
/* loaded from: classes18.dex */
public final class EmptyCartRootViewHolder extends CatalogRootViewHolder implements n0q0, g530, CatalogStatesViewHolder {
    public final mzp0 p;
    public final MarketAnalyticsParams q;
    public final zfc r;
    public final Regex s;
    public final g3a t;
    public final SwitchCatalogVh u;

    /* compiled from: EmptyCartRootViewHolder.kt */
    public static final /* synthetic */ class a extends FunctionReferenceImpl implements izs<l3a, s3q0> {
        @Override // xsna.izs
        public final s3q0 invoke(l3a l3aVar) {
            ((zfc) this.receiver).a(l3aVar);
            return s3q0.a;
        }
    }

    public EmptyCartRootViewHolder(FragmentActivity fragmentActivity, yw9 yw9Var, Bundle bundle, FragmentManager fragmentManager, EmptyCartFragment emptyCartFragment, mzp0 mzp0Var) {
        super(bundle, (Class<?>) null, (Activity) fragmentActivity, (nda) yw9Var, false, fragmentManager, (f5z) emptyCartFragment);
        this.p = mzp0Var;
        MarketAnalyticsParams marketAnalyticsParams = new MarketAnalyticsParams(null, null, CommonMarketStat$TypeRefSource.EMPTY_CART, null, null, null, null, false, null, false, false, null, false, 8187, null);
        this.q = marketAnalyticsParams;
        u4a.a aVar = this.m.b;
        b5a b5aVar = aVar.f;
        q3a q3aVar = aVar.e;
        Lazy<ksd0> lazy = aVar.N;
        ksd0 value = lazy != null ? lazy.getValue() : null;
        this.r = new zfc(b5aVar, q3aVar, value, fragmentActivity, marketAnalyticsParams, ((MarketComponent) ((k7m) m7m.f(this)).a(fpf0.a(MarketComponent.class))).Ob(), (tm0) null, ((MarketComponent) ((k7m) m7m.f(this)).a(fpf0.a(MarketComponent.class))).C3(), ((StorefrontComponent) ((k7m) m7m.f(this)).a(fpf0.a(StorefrontComponent.class))).a(), PsExtractor.AUDIO_STREAM);
        this.s = new Regex(".*(/bookmarks).*");
        u4a u4aVar = this.m;
        this.t = u4aVar.b.s.S(u4aVar, null);
        this.u = new SwitchCatalogVh(new ViewPagerVh(this.m, true, null, false, null, null, null, N(), null, null, 7164), null, new ErrorStateVh(this, new cnh(this, 6)), new EmptyCartShimmerVh(fragmentActivity), null, 0, this, null, false, false, null, 1970);
    }

    @Override // xsna.hha
    public final boolean A(String str) {
        return false;
    }

    @Override // xsna.g530
    public final void H2() {
        this.m.b.e.b(new t8f0(new u4e(this, 13), false), false);
    }

    @Override // com.vk.catalog2.common.ui.holders.api.CatalogViewHolder
    public final void N6(UIBlock uIBlock) {
        mzp0 mzp0Var = this.p;
        if (mzp0Var != null) {
            mzp0Var.c(false);
        }
        this.u.N6(uIBlock);
        if (mzp0Var != null) {
            mzp0Var.d(null);
        }
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
    public final void S(cfp0 cfp0Var) {
        ActionOpenUrl actionOpenUrl;
        String str;
        super.S(cfp0Var);
        UIBlock uIBlock = cfp0Var.a;
        UIBlockActionOpenUrl uIBlockActionOpenUrl = uIBlock instanceof UIBlockActionOpenUrl ? (UIBlockActionOpenUrl) uIBlock : null;
        if ((uIBlockActionOpenUrl == null || (actionOpenUrl = uIBlockActionOpenUrl.A) == null || (str = actionOpenUrl.c) == null) ? false : this.s.f(str)) {
            new wv9();
            CommonMarketStat$TypeRefSource commonMarketStat$TypeRefSource = this.q.d;
            UiTrackingScreen b = UiTracker.j.b();
            gzp0.a.c(MobileOfficialAppsMarketStat$TypeMarketClick.a.b(null, b != null ? b.a : null, commonMarketStat$TypeRefSource, null, null, new CommonMarketStat$TypeMarketTransitionToBookmarks(null, null, 1, null), 57));
        }
        if (uIBlock instanceof UIBlockMarketItem) {
            Object obj = cfp0Var.b;
            if (obj instanceof UIBlockMarketItem.b) {
                UIBlockMarketItem.b bVar = (UIBlockMarketItem.b) obj;
                Integer num = bVar.b;
                String str2 = ((UIBlockMarketItem) uIBlock).z;
                gmq gmqVar = bVar.a;
                if (gmqVar instanceof MarketFavable) {
                    MarketFavable marketFavable = (MarketFavable) gmqVar;
                    new wv9().c(marketFavable.f, marketFavable.c, marketFavable.b, str2, num, CommonMarketStat$TypeRefSource.EMPTY_CART);
                }
            }
        }
    }

    @Override // com.vk.catalog2.common.ui.mvp.holder.CatalogRootViewHolder
    public final View X(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View k5 = this.u.k5(layoutInflater, viewGroup, null);
        ya();
        k5.post(new ov(this, 6));
        return k5;
    }

    @Override // com.vk.catalog2.common.ui.mvp.holder.CatalogRootViewHolder
    public final c f0(m3a m3aVar) {
        f fVar = (f) m3aVar.b;
        oz ozVar = new oz(new a(1, this.r, zfc.class, "handleCatalogClickEvent", "handleCatalogClickEvent(Lcom/vk/catalog2/common/ui/core/events/click/CatalogClickEvent;)V", 0), 14);
        int i = kwg0.a;
        return fVar.subscribe(ozVar, new hwg0());
    }

    @Override // com.vk.catalog2.common.ui.holders.api.CatalogStatesViewHolder
    public final bnn0 getState() {
        return this.u.r;
    }

    @Override // com.vk.catalog2.common.ui.holders.api.CatalogStatesViewHolder
    public final void i8(bnn0 bnn0Var) {
        mzp0 mzp0Var;
        if ((bnn0Var instanceof swp) && (mzp0Var = this.p) != null) {
            mzp0Var.f();
        }
        this.u.i8(bnn0Var);
    }

    @Override // com.vk.catalog2.common.ui.holders.api.CatalogVh
    public final void rg(Throwable th) {
        i8(new swp(th));
    }

    @Override // com.vk.catalog2.common.ui.holders.api.CatalogVh
    public final void ya() {
        i8(ltz.a);
    }

    @Override // com.vk.catalog2.common.ui.mvp.holder.CatalogRootViewHolder
    public final void Y() {
    }

    @Override // xsna.g530
    public final void g3() {
    }

    @Override // xsna.g380
    public final void onConfigurationChanged(Configuration configuration) {
    }

    @Override // xsna.mba
    public final void z(int i, UIBlock uIBlock) {
    }

    @Override // xsna.tb0
    public final void onActivityResult(int i, int i2, Intent intent) {
    }
}
