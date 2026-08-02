package io.appmetrica.analytics.billingv8.impl;

import io.appmetrica.analytics.billinginterface.internal.config.BillingConfig;
import io.appmetrica.analytics.billinginterface.internal.library.UtilsProvider;
import io.appmetrica.analytics.coreutils.internal.executors.SafeRunnable;
import kotlin.collections.u;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class a extends SafeRunnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ b f11560a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.android.billingclient.api.k f11561b;

    public a(b bVar, com.android.billingclient.api.k kVar) {
        this.f11560a = bVar;
        this.f11561b = kVar;
    }

    @Override // io.appmetrica.analytics.coreutils.internal.executors.SafeRunnable
    public final void runSafety() {
        b bVar = this.f11560a;
        com.android.billingclient.api.k kVar = this.f11561b;
        bVar.getClass();
        if (kVar.f4037a != 0) {
            bVar.f11566e.onUpdateFinished();
            return;
        }
        if (!bVar.f11563b.b()) {
            bVar.f11566e.onUpdateFinished();
            return;
        }
        for (String str : u.f("inapp", "subs")) {
            BillingConfig billingConfig = bVar.f11562a;
            com.android.billingclient.api.c cVar = bVar.f11563b;
            UtilsProvider utilsProvider = bVar.f11564c;
            d dVar = bVar.f11565d;
            i iVar = new i(billingConfig, cVar, utilsProvider, str, dVar, bVar.f11566e);
            dVar.f11571b.add(iVar);
            com.android.billingclient.api.c cVar2 = bVar.f11563b;
            com.android.billingclient.api.a aVar = new com.android.billingclient.api.a(4);
            aVar.f3966b = str;
            com.android.billingclient.api.a c2 = aVar.c();
            com.android.billingclient.api.d dVar2 = (com.android.billingclient.api.d) cVar2;
            dVar2.getClass();
            dVar2.s(c2.f3966b, iVar);
        }
    }
}
