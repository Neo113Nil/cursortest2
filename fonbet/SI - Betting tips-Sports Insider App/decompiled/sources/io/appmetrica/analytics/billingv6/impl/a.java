package io.appmetrica.analytics.billingv6.impl;

import io.appmetrica.analytics.billinginterface.internal.config.BillingConfig;
import io.appmetrica.analytics.billinginterface.internal.library.UtilsProvider;
import io.appmetrica.analytics.coreutils.internal.executors.SafeRunnable;
import kotlin.collections.u;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class a extends SafeRunnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ b f11507a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.android.billingclient.api.k f11508b;

    public a(b bVar, com.android.billingclient.api.k kVar) {
        this.f11507a = bVar;
        this.f11508b = kVar;
    }

    @Override // io.appmetrica.analytics.coreutils.internal.executors.SafeRunnable
    public final void runSafety() {
        b bVar = this.f11507a;
        com.android.billingclient.api.k kVar = this.f11508b;
        bVar.getClass();
        if (kVar.f4037a != 0) {
            bVar.f11513e.onUpdateFinished();
            return;
        }
        for (String str : u.f("inapp", "subs")) {
            BillingConfig billingConfig = bVar.f11509a;
            com.android.billingclient.api.c cVar = bVar.f11510b;
            UtilsProvider utilsProvider = bVar.f11511c;
            d dVar = bVar.f11512d;
            i iVar = new i(billingConfig, cVar, utilsProvider, str, dVar, bVar.f11513e);
            dVar.f11518b.add(iVar);
            if (bVar.f11510b.b()) {
                com.android.billingclient.api.c cVar2 = bVar.f11510b;
                if (str == null) {
                    throw new IllegalArgumentException("Product type must be set");
                }
                com.android.billingclient.api.d dVar2 = (com.android.billingclient.api.d) cVar2;
                dVar2.getClass();
                dVar2.r(str, iVar);
            } else {
                bVar.f11512d.a(iVar);
                bVar.f11513e.onUpdateFinished();
            }
        }
    }
}
