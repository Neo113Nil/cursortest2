package io.appmetrica.analytics.billingv8.impl;

import io.appmetrica.analytics.billinginterface.internal.config.BillingConfig;
import io.appmetrica.analytics.billinginterface.internal.library.UtilsProvider;
import io.appmetrica.analytics.billingv8.internal.BillingLibraryMonitor$updateBilling$1;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class b implements com.android.billingclient.api.f {

    /* renamed from: a, reason: collision with root package name */
    public final BillingConfig f11562a;

    /* renamed from: b, reason: collision with root package name */
    public final com.android.billingclient.api.c f11563b;

    /* renamed from: c, reason: collision with root package name */
    public final UtilsProvider f11564c;

    /* renamed from: d, reason: collision with root package name */
    public final d f11565d;

    /* renamed from: e, reason: collision with root package name */
    public final n f11566e;

    public b(BillingConfig billingConfig, com.android.billingclient.api.c cVar, BillingLibraryMonitor$updateBilling$1 billingLibraryMonitor$updateBilling$1, d dVar, n nVar) {
        this.f11562a = billingConfig;
        this.f11563b = cVar;
        this.f11564c = billingLibraryMonitor$updateBilling$1;
        this.f11565d = dVar;
        this.f11566e = nVar;
    }

    @Override // com.android.billingclient.api.f
    public final void onBillingSetupFinished(com.android.billingclient.api.k kVar) {
        this.f11564c.getWorkerExecutor().execute(new a(this, kVar));
    }

    @Override // com.android.billingclient.api.f
    public final void onBillingServiceDisconnected() {
    }
}
