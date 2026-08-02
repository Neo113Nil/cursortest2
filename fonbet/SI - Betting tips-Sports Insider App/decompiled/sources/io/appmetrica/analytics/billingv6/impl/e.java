package io.appmetrica.analytics.billingv6.impl;

import io.appmetrica.analytics.billinginterface.internal.library.UtilsProvider;
import io.appmetrica.analytics.coreutils.internal.executors.SafeRunnable;
import java.util.List;
import kotlin.jvm.functions.Function0;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class e extends SafeRunnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ f f11519a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.android.billingclient.api.k f11520b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ List f11521c;

    public e(f fVar, com.android.billingclient.api.k kVar, List list) {
        this.f11519a = fVar;
        this.f11520b = kVar;
        this.f11521c = list;
    }

    @Override // io.appmetrica.analytics.coreutils.internal.executors.SafeRunnable
    public final void runSafety() {
        f fVar = this.f11519a;
        com.android.billingclient.api.k kVar = this.f11520b;
        List list = this.f11521c;
        fVar.getClass();
        if (kVar.f4037a != 0 || list.isEmpty()) {
            fVar.f11528g.onUpdateFinished();
        } else {
            UtilsProvider utilsProvider = fVar.f11524c;
            Function0 function0 = fVar.f11525d;
            List list2 = fVar.f11526e;
            d dVar = fVar.f11527f;
            k kVar2 = new k(utilsProvider, function0, list2, list, dVar, fVar.f11528g);
            dVar.f11518b.add(kVar2);
            if (fVar.f11523b.b()) {
                com.android.billingclient.api.c cVar = fVar.f11523b;
                com.android.billingclient.api.a aVar = new com.android.billingclient.api.a(4);
                aVar.f3966b = fVar.f11522a;
                com.android.billingclient.api.a c2 = aVar.c();
                com.android.billingclient.api.d dVar2 = (com.android.billingclient.api.d) cVar;
                dVar2.getClass();
                dVar2.s(c2.f3966b, kVar2);
            } else {
                fVar.f11527f.a(kVar2);
                fVar.f11528g.onUpdateFinished();
            }
        }
        f fVar2 = this.f11519a;
        fVar2.f11527f.a(fVar2);
    }
}
