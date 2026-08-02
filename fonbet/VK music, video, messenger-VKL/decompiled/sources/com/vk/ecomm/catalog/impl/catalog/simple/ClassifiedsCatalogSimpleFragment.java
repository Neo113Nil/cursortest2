package com.vk.ecomm.catalog.impl.catalog.simple;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.util.LruCache;
import androidx.fragment.app.FragmentActivity;
import com.vk.bridges.di.BridgeComponent;
import com.vk.catalog2.common.ui.mvp.holder.CatalogRootViewHolder;
import com.vk.core.ui.measuring.UiMeasuringScreen;
import com.vk.core.ui.tracking.UiTracker;
import com.vk.dto.common.id.UserId;
import com.vk.ecomm.api.analytics.MarketAnalyticsParams;
import com.vk.ecomm.catalog.api.catalog.MarketCatalogSectionId;
import com.vk.ecomm.catalog.impl.catalog.base.ClassifiedsBaseCatalogFragment;
import com.vk.stat.scheme.MobileOfficialAppsCoreNavStat$EventScreen;
import com.vk.stat.scheme.SchemeStat$EventItem;
import com.vk.stat.scheme.SchemeStat$TypeClick;
import com.vk.stat.scheme.SchemeStat$TypeMarketItem;
import java.util.UUID;
import kotlin.Pair;
import xsna.bjc;
import xsna.bpn0;
import xsna.epx;
import xsna.fpf0;
import xsna.g5;
import xsna.jd4;
import xsna.m7m;
import xsna.mzp0;
import xsna.o5a;
import xsna.rzp0;
import xsna.uzp0;
import xsna.yfc;

/* compiled from: ClassifiedsCatalogSimpleFragment.kt */
/* loaded from: classes18.dex */
public final class ClassifiedsCatalogSimpleFragment extends ClassifiedsBaseCatalogFragment {
    public static final /* synthetic */ int R = 0;
    public final bpn0 Q;

    /* compiled from: ClassifiedsCatalogSimpleFragment.kt */
    public static final class a extends ClassifiedsBaseCatalogFragment.a {
        public final yfc n;

        public a() {
            super(ClassifiedsCatalogSimpleFragment.class);
            this.n = new yfc(this.j);
        }

        public final MobileOfficialAppsCoreNavStat$EventScreen G() {
            MobileOfficialAppsCoreNavStat$EventScreen mobileOfficialAppsCoreNavStat$EventScreen;
            yfc yfcVar = this.n;
            MarketAnalyticsParams b = yfcVar.b();
            return (b == null || (mobileOfficialAppsCoreNavStat$EventScreen = b.c) == null) ? epx.f(yfcVar.a.getString("KEY_SECTION_ID"), MarketCatalogSectionId.CATEGORY.h()) ? MobileOfficialAppsCoreNavStat$EventScreen.MARKETPLACE_SEARCH : MobileOfficialAppsCoreNavStat$EventScreen.MARKETPLACE_SECTION : mobileOfficialAppsCoreNavStat$EventScreen;
        }

        @Override // xsna.oz50
        public final void r(Intent intent) {
            LruCache<UUID, mzp0> lruCache = rzp0.a;
            Pair c = rzp0.c(UiMeasuringScreen.MARKETPLACE_SECTION, null, false, 62);
            UUID uuid = (UUID) c.d();
            mzp0 mzp0Var = (mzp0) c.g();
            mzp0Var.init();
            mzp0Var.k(G().name());
            Bundle bundleExtra = intent.getBundleExtra("args");
            if (bundleExtra != null) {
                rzp0.f(bundleExtra, uuid);
            }
            yfc yfcVar = this.n;
            MarketAnalyticsParams b = yfcVar.b();
            if (b == null || !b.n) {
                return;
            }
            SchemeStat$EventItem.Type type = SchemeStat$EventItem.Type.MARKET_ITEM_ALBUM;
            Long valueOf = yfcVar.a() != null ? Long.valueOf(r2.intValue()) : null;
            UserId c2 = yfcVar.c();
            SchemeStat$EventItem schemeStat$EventItem = new SchemeStat$EventItem(type, valueOf, c2 != null ? Long.valueOf(c2.b) : null, null, null, null, 56, null);
            Integer a = yfcVar.a();
            SchemeStat$TypeClick b2 = SchemeStat$TypeClick.a.b(schemeStat$EventItem, new SchemeStat$TypeMarketItem(SchemeStat$TypeMarketItem.Subtype.TRANSITION_TO_ALBUM, null, a != null ? a.toString() : null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 262138, null), 2);
            MobileOfficialAppsCoreNavStat$EventScreen G = G();
            uzp0 uzp0Var = UiTracker.h;
            uzp0Var.getClass();
            new bjc(G, b2, uzp0Var.a).q();
        }
    }

    public ClassifiedsCatalogSimpleFragment() {
        super(ClassifiedsCatalogSimpleRootVh.class, false);
        this.Q = new bpn0(new g5(this, 12));
    }

    @Override // com.vk.catalog2.common.ui.mvp.fragment.BaseCatalogFragment
    public final CatalogRootViewHolder eo(Bundle bundle) {
        FragmentActivity kn = kn();
        o5a o5aVar = new o5a(this);
        Bundle arguments = getArguments();
        Bundle arguments2 = getArguments();
        return new ClassifiedsCatalogSimpleRootVh(kn, o5aVar, arguments, arguments2 != null ? arguments2.getBoolean("is_show_all") : false, new jd4(this, 4), ((BridgeComponent) m7m.d(this).a(fpf0.a(BridgeComponent.class))).p().e(), this.J, this);
    }

    @Override // com.vk.core.fragments.FragmentImpl, androidx.fragment.app.Fragment
    /* renamed from: getContext */
    public final Context mo2getContext() {
        return getActivity();
    }

    public final yfc go() {
        return (yfc) this.Q.getValue();
    }
}
