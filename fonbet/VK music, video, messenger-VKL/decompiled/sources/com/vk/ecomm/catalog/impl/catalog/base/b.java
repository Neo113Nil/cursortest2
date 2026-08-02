package com.vk.ecomm.catalog.impl.catalog.base;

import com.vk.catalog2.common.dto.api.market.CatalogClassifiedYoulaCity;
import com.vk.dto.common.id.UserId;
import com.vk.dto.market.catalog.CatalogMarketFilter;
import com.vk.dto.market.catalog.CatalogMarketSorting;
import com.vk.ecomm.api.analytics.MarketAnalyticsParams;
import io.reactivex.rxjava3.internal.operators.observable.i0;
import io.reactivex.rxjava3.subjects.f;
import xsna.cqv;
import xsna.gv;
import xsna.hg1;
import xsna.hv;
import xsna.kdn;
import xsna.l5a;
import xsna.lu00;
import xsna.q3a;

/* compiled from: MarketCatalogExternalEventHandlerDelegate.kt */
/* loaded from: classes18.dex */
public final class b extends l5a {
    public final String c;
    public final a<lu00> d;
    public final C0927b e;
    public final io.reactivex.rxjava3.disposables.b f;
    public CatalogMarketFilter g;
    public CatalogMarketSorting h;
    public CatalogClassifiedYoulaCity i;
    public boolean j;

    /* compiled from: MarketCatalogExternalEventHandlerDelegate.kt */
    public interface a<T> {
        f a();
    }

    /* compiled from: MarketCatalogExternalEventHandlerDelegate.kt */
    /* renamed from: com.vk.ecomm.catalog.impl.catalog.base.b$b, reason: collision with other inner class name */
    public static final class C0927b {
        public final String a;
        public final MarketAnalyticsParams b;
        public final UserId c;
        public final Integer d;
        public final boolean e;

        public C0927b(String str, MarketAnalyticsParams marketAnalyticsParams, UserId userId, Integer num, boolean z) {
            this.a = str;
            this.b = marketAnalyticsParams;
            this.c = userId;
            this.d = num;
            this.e = z;
        }
    }

    public b(String str, a<lu00> aVar, C0927b c0927b, q3a q3aVar) {
        super(q3aVar);
        this.c = str;
        this.d = aVar;
        this.e = c0927b;
        this.f = new io.reactivex.rxjava3.disposables.b();
    }

    @Override // xsna.l5a
    public final void a() {
        this.f.b(new i0(new i0(this.d.a().a0(io.reactivex.rxjava3.android.schedulers.a.b()), new hg1.e2()).U(new hg1.d2()), new gv(new cqv(this, 9), 26)).subscribe(new hv(new kdn(this, 15), 28)));
    }
}
