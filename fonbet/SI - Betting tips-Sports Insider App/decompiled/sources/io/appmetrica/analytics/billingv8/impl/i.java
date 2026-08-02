package io.appmetrica.analytics.billingv8.impl;

import com.android.billingclient.api.v;
import io.appmetrica.analytics.billinginterface.internal.config.BillingConfig;
import io.appmetrica.analytics.billinginterface.internal.library.UtilsProvider;
import java.util.List;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class i implements v {

    /* renamed from: a, reason: collision with root package name */
    public final BillingConfig f11588a;

    /* renamed from: b, reason: collision with root package name */
    public final com.android.billingclient.api.c f11589b;

    /* renamed from: c, reason: collision with root package name */
    public final UtilsProvider f11590c;

    /* renamed from: d, reason: collision with root package name */
    public final String f11591d;

    /* renamed from: e, reason: collision with root package name */
    public final d f11592e;

    /* renamed from: f, reason: collision with root package name */
    public final n f11593f;

    public i(BillingConfig billingConfig, com.android.billingclient.api.c cVar, UtilsProvider utilsProvider, String str, d dVar, n nVar) {
        this.f11588a = billingConfig;
        this.f11589b = cVar;
        this.f11590c = utilsProvider;
        this.f11591d = str;
        this.f11592e = dVar;
        this.f11593f = nVar;
    }

    @Override // com.android.billingclient.api.v
    public final void onQueryPurchasesResponse(com.android.billingclient.api.k kVar, List list) {
        this.f11590c.getWorkerExecutor().execute(new g(this, kVar, list));
    }
}
