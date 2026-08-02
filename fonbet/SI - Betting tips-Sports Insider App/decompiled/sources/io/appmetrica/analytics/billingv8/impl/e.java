package io.appmetrica.analytics.billingv8.impl;

import com.android.billingclient.api.QueryProductDetailsResult;
import io.appmetrica.analytics.billinginterface.internal.library.UtilsProvider;
import io.appmetrica.analytics.coreutils.internal.executors.SafeRunnable;
import java.util.List;
import kotlin.jvm.functions.Function0;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class e extends SafeRunnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ f f11572a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.android.billingclient.api.k f11573b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ QueryProductDetailsResult f11574c;

    public e(f fVar, com.android.billingclient.api.k kVar, QueryProductDetailsResult queryProductDetailsResult) {
        this.f11572a = fVar;
        this.f11573b = kVar;
        this.f11574c = queryProductDetailsResult;
    }

    @Override // io.appmetrica.analytics.coreutils.internal.executors.SafeRunnable
    public final void runSafety() {
        f fVar = this.f11572a;
        com.android.billingclient.api.k kVar = this.f11573b;
        List productDetailsList = this.f11574c.getProductDetailsList();
        fVar.getClass();
        if (kVar.f4037a != 0 || productDetailsList.isEmpty()) {
            fVar.f11581g.onUpdateFinished();
        } else {
            UtilsProvider utilsProvider = fVar.f11577c;
            Function0 function0 = fVar.f11578d;
            List list = fVar.f11579e;
            d dVar = fVar.f11580f;
            k kVar2 = new k(utilsProvider, function0, list, productDetailsList, dVar, fVar.f11581g);
            dVar.f11571b.add(kVar2);
            if (fVar.f11576b.b()) {
                com.android.billingclient.api.c cVar = fVar.f11576b;
                com.android.billingclient.api.a aVar = new com.android.billingclient.api.a(4);
                aVar.f3966b = fVar.f11575a;
                com.android.billingclient.api.a c2 = aVar.c();
                com.android.billingclient.api.d dVar2 = (com.android.billingclient.api.d) cVar;
                dVar2.getClass();
                dVar2.s(c2.f3966b, kVar2);
            } else {
                fVar.f11580f.a(kVar2);
                fVar.f11581g.onUpdateFinished();
            }
        }
        f fVar2 = this.f11572a;
        fVar2.f11580f.a(fVar2);
    }
}
