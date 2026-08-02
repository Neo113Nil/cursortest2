package com.vk.ecomm.catalog.impl.catalog.root;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.util.LruCache;
import com.vk.bridges.di.BridgeComponent;
import com.vk.catalog2.common.ui.mvp.configuration.CatalogConfiguration;
import com.vk.catalog2.common.ui.mvp.holder.CatalogRootViewHolder;
import com.vk.core.performance.score.PerformanceScoreProduct;
import com.vk.core.ui.measuring.UiMeasuringScreen;
import com.vk.dto.search.SearchStatsLoggingInfo;
import com.vk.ecomm.api.analytics.MarketAnalyticsParams;
import com.vk.ecomm.catalog.api.di.ClassifiedsComponent;
import com.vk.ecomm.catalog.impl.catalog.base.ClassifiedsBaseCatalogFragment;
import java.util.UUID;
import kotlin.Pair;
import xsna.dhc;
import xsna.fpf0;
import xsna.lpg0;
import xsna.m7m;
import xsna.mzp0;
import xsna.ngc;
import xsna.o5a;
import xsna.rzp0;
import xsna.yfc;
import xsna.yw90;
import xsna.zrd0;

/* compiled from: ClassifiedsCatalogFragment.kt */
/* loaded from: classes18.dex */
public final class ClassifiedsCatalogFragment extends ClassifiedsBaseCatalogFragment {

    /* compiled from: ClassifiedsCatalogFragment.kt */
    public static final class a extends ClassifiedsBaseCatalogFragment.a {
        public final yfc n;

        public a() {
            super(ClassifiedsCatalogFragment.class);
            this.n = new yfc(this.j);
        }

        @Override // xsna.oz50
        public final void r(Intent intent) {
            LruCache<UUID, mzp0> lruCache = rzp0.a;
            Pair c = rzp0.c(UiMeasuringScreen.MARKETPLACE_MAIN, null, false, 62);
            UUID uuid = (UUID) c.d();
            ((mzp0) c.g()).init();
            zrd0 zrd0Var = zrd0.a;
            Pair a = zrd0.a(PerformanceScoreProduct.MARKETPLACE_MAIN);
            UUID uuid2 = (UUID) a.d();
            ((yw90) a.g()).init();
            Bundle bundleExtra = intent.getBundleExtra("args");
            if (bundleExtra != null) {
                rzp0.f(bundleExtra, uuid);
                zrd0.d(bundleExtra, uuid2);
            }
        }
    }

    /* compiled from: ClassifiedsCatalogFragment.kt */
    public static final class b extends o5a {
        public final dhc d;
        public final MarketAnalyticsParams e;

        public b(ClassifiedsCatalogFragment classifiedsCatalogFragment, dhc dhcVar, MarketAnalyticsParams marketAnalyticsParams) {
            super(classifiedsCatalogFragment);
            this.d = dhcVar;
            this.e = marketAnalyticsParams;
        }

        @Override // xsna.o5a, xsna.nda
        public final void d(Context context, CatalogConfiguration catalogConfiguration, String str, String str2, String str3, SearchStatsLoggingInfo searchStatsLoggingInfo, lpg0 lpg0Var) {
            this.d.d(context, new ngc(null, str, null, null, null, null, null, null, null, null, this.e, null, false, str2, 1507323));
        }
    }

    public ClassifiedsCatalogFragment() {
        super(ClassifiedsCatalogRootVh.class, false);
    }

    @Override // com.vk.catalog2.common.ui.mvp.fragment.BaseCatalogFragment
    public final CatalogRootViewHolder eo(Bundle bundle) {
        dhc dc = ((ClassifiedsComponent) m7m.d(this).a(fpf0.a(ClassifiedsComponent.class))).dc();
        Bundle arguments = getArguments();
        yfc yfcVar = arguments != null ? new yfc(arguments) : null;
        return new ClassifiedsCatalogRootVh(kn(), new b(this, dc, yfcVar != null ? yfcVar.b() : null), getArguments(), getChildFragmentManager(), this, this.J, On(), ((BridgeComponent) m7m.d(this).a(fpf0.a(BridgeComponent.class))).p().e());
    }

    @Override // com.vk.core.fragments.FragmentImpl, androidx.fragment.app.Fragment
    /* renamed from: getContext */
    public final Context mo2getContext() {
        return getActivity();
    }
}
