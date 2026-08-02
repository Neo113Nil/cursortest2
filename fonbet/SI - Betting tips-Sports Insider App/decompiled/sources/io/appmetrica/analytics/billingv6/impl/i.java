package io.appmetrica.analytics.billingv6.impl;

import com.android.billingclient.api.t;
import io.appmetrica.analytics.billinginterface.internal.config.BillingConfig;
import io.appmetrica.analytics.billinginterface.internal.library.UtilsProvider;
import java.util.List;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class i implements t {

    /* renamed from: a, reason: collision with root package name */
    public final BillingConfig f11535a;

    /* renamed from: b, reason: collision with root package name */
    public final com.android.billingclient.api.c f11536b;

    /* renamed from: c, reason: collision with root package name */
    public final UtilsProvider f11537c;

    /* renamed from: d, reason: collision with root package name */
    public final String f11538d;

    /* renamed from: e, reason: collision with root package name */
    public final d f11539e;

    /* renamed from: f, reason: collision with root package name */
    public final n f11540f;

    public i(BillingConfig billingConfig, com.android.billingclient.api.c cVar, UtilsProvider utilsProvider, String str, d dVar, n nVar) {
        this.f11535a = billingConfig;
        this.f11536b = cVar;
        this.f11537c = utilsProvider;
        this.f11538d = str;
        this.f11539e = dVar;
        this.f11540f = nVar;
    }

    @Override // com.android.billingclient.api.t
    public final void onPurchaseHistoryResponse(com.android.billingclient.api.k kVar, List list) {
        this.f11537c.getWorkerExecutor().execute(new g(this, kVar, list));
    }
}
