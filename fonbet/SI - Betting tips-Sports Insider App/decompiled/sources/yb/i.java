package yb;

import android.content.Context;
import com.android.billingclient.api.a0;
import com.android.billingclient.api.p;
import com.android.billingclient.api.s;
import com.android.billingclient.api.u;
import com.android.billingclient.api.w;
import com.android.billingclient.api.x;
import com.android.billingclient.api.y;
import eg.c0;
import eg.r;
import hg.d1;
import hg.t0;
import hg.u0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Pair;
import kotlin.collections.v;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class i implements com.android.billingclient.api.f, x {

    /* renamed from: e, reason: collision with root package name */
    public static volatile com.android.billingclient.api.d f25817e;

    /* renamed from: a, reason: collision with root package name */
    public final Context f25818a;

    /* renamed from: b, reason: collision with root package name */
    public final d1 f25819b;

    /* renamed from: c, reason: collision with root package name */
    public final t0 f25820c;

    /* renamed from: d, reason: collision with root package name */
    public final t0 f25821d;

    public i(Context contextApp) {
        Intrinsics.checkNotNullParameter(contextApp, "contextApp");
        this.f25818a = contextApp;
        this.f25819b = u0.b(-1);
        gg.a aVar = gg.a.f10049b;
        this.f25820c = u0.a(0, 100, aVar);
        this.f25821d = u0.a(0, 50, aVar);
        com.android.billingclient.api.b bVar = new com.android.billingclient.api.b(contextApp);
        bVar.f3971c = this;
        bVar.f3970b = new m3.f(8);
        com.android.billingclient.api.d a7 = bVar.a();
        Intrinsics.checkNotNullExpressionValue(a7, "build(...)");
        f25817e = a7;
        a();
    }

    public static String l(ArrayList arrayList) {
        Object obj;
        Iterator it = arrayList.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (((p) obj).f4063b == null) {
                break;
            }
        }
        p pVar = (p) obj;
        if (pVar != null) {
            return pVar.f4064c;
        }
        return null;
    }

    public final void a() {
        if (c()) {
            return;
        }
        com.android.billingclient.api.d dVar = f25817e;
        if (dVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mBillingClient");
            dVar = null;
        }
        dVar.j(this);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object b(String str, mf.c cVar) {
        b bVar;
        int i5;
        if (cVar instanceof b) {
            bVar = (b) cVar;
            int i10 = bVar.f25798c;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                bVar.f25798c = i10 - Integer.MIN_VALUE;
                Object obj = bVar.f25796a;
                lf.a aVar = lf.a.f20034a;
                i5 = bVar.f25798c;
                if (i5 != 0) {
                    h8.b.B(obj);
                    com.android.billingclient.api.d dVar = f25817e;
                    if (dVar == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("mBillingClient");
                        dVar = null;
                    }
                    if (str == null) {
                        throw new IllegalArgumentException("Purchase token must be set");
                    }
                    com.android.billingclient.api.a aVar2 = new com.android.billingclient.api.a(1);
                    aVar2.f3966b = str;
                    Intrinsics.checkNotNullExpressionValue(aVar2, "build(...)");
                    bVar.f25798c = 1;
                    r a7 = c0.a();
                    com.android.billingclient.api.e eVar = new com.android.billingclient.api.e(3);
                    eVar.f4011b = a7;
                    dVar.e(aVar2, eVar);
                    obj = a7.m(bVar);
                    if (obj == aVar) {
                        return aVar;
                    }
                } else {
                    if (i5 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    h8.b.B(obj);
                }
                com.android.billingclient.api.k kVar = ((com.android.billingclient.api.l) obj).f4041a;
                e(kVar.f4037a, "OnServiceConsumePurchase", kVar.f4038b);
                return kVar;
            }
        }
        bVar = new b(this, cVar);
        Object obj2 = bVar.f25796a;
        lf.a aVar3 = lf.a.f20034a;
        i5 = bVar.f25798c;
        if (i5 != 0) {
        }
        com.android.billingclient.api.k kVar2 = ((com.android.billingclient.api.l) obj2).f4041a;
        e(kVar2.f4037a, "OnServiceConsumePurchase", kVar2.f4038b);
        return kVar2;
    }

    public final boolean c() {
        com.android.billingclient.api.d dVar = f25817e;
        if (dVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mBillingClient");
            dVar = null;
        }
        return dVar.b();
    }

    public final boolean d() {
        com.android.billingclient.api.d dVar = f25817e;
        if (dVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mBillingClient");
            dVar = null;
        }
        int i5 = dVar.f("fff").f4037a;
        boolean z5 = i5 == 0;
        if (i5 != -1 && i5 != 0) {
            zc.d.c("BillingClient.isFeatureSupported(FeatureType.PRODUCT_DETAILS)" + i5, "isSupportedProductDetails");
        }
        return z5;
    }

    public final void e(int i5, String name, String str) {
        Intrinsics.checkNotNullParameter(name, "name");
        a aVar = new a();
        aVar.f25793a = name;
        aVar.f25794b = i5;
        aVar.f25795c = str;
        this.f25821d.b(aVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object f(String str, mf.c cVar) {
        c cVar2;
        int i5;
        if (cVar instanceof c) {
            cVar2 = (c) cVar;
            int i10 = cVar2.f25801c;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                cVar2.f25801c = i10 - Integer.MIN_VALUE;
                Object obj = cVar2.f25799a;
                lf.a aVar = lf.a.f20034a;
                i5 = cVar2.f25801c;
                if (i5 != 0) {
                    h8.b.B(obj);
                    com.android.billingclient.api.d dVar = f25817e;
                    if (dVar == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("mBillingClient");
                        dVar = null;
                    }
                    com.android.billingclient.api.a aVar2 = new com.android.billingclient.api.a(2);
                    aVar2.f3966b = str;
                    if (str == null) {
                        throw new IllegalArgumentException("Product type must be set");
                    }
                    com.android.billingclient.api.a aVar3 = new com.android.billingclient.api.a(aVar2);
                    Intrinsics.checkNotNullExpressionValue(aVar3, "build(...)");
                    cVar2.f25801c = 1;
                    r a7 = c0.a();
                    com.android.billingclient.api.e eVar = new com.android.billingclient.api.e(6);
                    eVar.f4011b = a7;
                    dVar.getClass();
                    dVar.r(aVar3.f3966b, eVar);
                    obj = a7.m(cVar2);
                    if (obj == aVar) {
                        return aVar;
                    }
                } else {
                    if (i5 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    h8.b.B(obj);
                }
                com.android.billingclient.api.k kVar = ((u) obj).f4104a;
                e(kVar.f4037a, "OnServicePurchaseHistory", kVar.f4038b);
                return obj;
            }
        }
        cVar2 = new c(this, cVar);
        Object obj2 = cVar2.f25799a;
        lf.a aVar4 = lf.a.f20034a;
        i5 = cVar2.f25801c;
        if (i5 != 0) {
        }
        com.android.billingclient.api.k kVar2 = ((u) obj2).f4104a;
        e(kVar2.f4037a, "OnServicePurchaseHistory", kVar2.f4038b);
        return obj2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x004c, code lost:
    
        if (kotlin.jvm.internal.Intrinsics.areEqual(r6, "inapp") != false) goto L19;
     */
    /* JADX WARN: Removed duplicated region for block: B:15:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object g(String str, mf.c cVar) {
        d dVar;
        int i5;
        if (cVar instanceof d) {
            dVar = (d) cVar;
            int i10 = dVar.f25804c;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                dVar.f25804c = i10 - Integer.MIN_VALUE;
                Object obj = dVar.f25802a;
                lf.a aVar = lf.a.f20034a;
                i5 = dVar.f25804c;
                if (i5 != 0) {
                    h8.b.B(obj);
                    com.android.billingclient.api.d dVar2 = f25817e;
                    if (dVar2 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("mBillingClient");
                        dVar2 = null;
                    }
                    String str2 = Intrinsics.areEqual(str, "subs") ? "subs" : "inapp";
                    str = str2;
                    dVar.f25804c = 1;
                    r a7 = c0.a();
                    com.android.billingclient.api.e eVar = new com.android.billingclient.api.e(7);
                    eVar.f4011b = a7;
                    dVar2.r(str, eVar);
                    obj = a7.m(dVar);
                    if (obj == aVar) {
                        return aVar;
                    }
                } else {
                    if (i5 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    h8.b.B(obj);
                }
                com.android.billingclient.api.k kVar = ((u) obj).f4104a;
                e(kVar.f4037a, "OnServicePurchaseHistoryV4", kVar.f4038b);
                return obj;
            }
        }
        dVar = new d(this, cVar);
        Object obj2 = dVar.f25802a;
        lf.a aVar2 = lf.a.f20034a;
        i5 = dVar.f25804c;
        if (i5 != 0) {
        }
        com.android.billingclient.api.k kVar2 = ((u) obj2).f4104a;
        e(kVar2.f4037a, "OnServicePurchaseHistoryV4", kVar2.f4038b);
        return obj2;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object h(String str, mf.c cVar) {
        e eVar;
        int i5;
        if (cVar instanceof e) {
            eVar = (e) cVar;
            int i10 = eVar.f25807c;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                eVar.f25807c = i10 - Integer.MIN_VALUE;
                Object obj = eVar.f25805a;
                lf.a aVar = lf.a.f20034a;
                i5 = eVar.f25807c;
                if (i5 != 0) {
                    h8.b.B(obj);
                    com.android.billingclient.api.d dVar = f25817e;
                    if (dVar == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("mBillingClient");
                        dVar = null;
                    }
                    com.android.billingclient.api.a aVar2 = new com.android.billingclient.api.a(4);
                    aVar2.f3966b = str;
                    com.android.billingclient.api.a c2 = aVar2.c();
                    Intrinsics.checkNotNullExpressionValue(c2, "build(...)");
                    eVar.f25807c = 1;
                    r a7 = c0.a();
                    com.android.billingclient.api.e eVar2 = new com.android.billingclient.api.e(1);
                    eVar2.f4011b = a7;
                    dVar.getClass();
                    dVar.s(c2.f3966b, eVar2);
                    obj = a7.m(eVar);
                    if (obj == aVar) {
                        return aVar;
                    }
                } else {
                    if (i5 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    h8.b.B(obj);
                }
                com.android.billingclient.api.k kVar = ((w) obj).f4110a;
                e(kVar.f4037a, "OnServiceQueryPurchases", kVar.f4038b);
                return obj;
            }
        }
        eVar = new e(this, cVar);
        Object obj2 = eVar.f25805a;
        lf.a aVar3 = lf.a.f20034a;
        i5 = eVar.f25807c;
        if (i5 != 0) {
        }
        com.android.billingclient.api.k kVar2 = ((w) obj2).f4110a;
        e(kVar2.f4037a, "OnServiceQueryPurchases", kVar2.f4038b);
        return obj2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x004c, code lost:
    
        if (kotlin.jvm.internal.Intrinsics.areEqual(r6, "inapp") != false) goto L19;
     */
    /* JADX WARN: Removed duplicated region for block: B:15:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object i(String str, mf.c cVar) {
        f fVar;
        int i5;
        if (cVar instanceof f) {
            fVar = (f) cVar;
            int i10 = fVar.f25810c;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                fVar.f25810c = i10 - Integer.MIN_VALUE;
                Object obj = fVar.f25808a;
                lf.a aVar = lf.a.f20034a;
                i5 = fVar.f25810c;
                if (i5 != 0) {
                    h8.b.B(obj);
                    com.android.billingclient.api.d dVar = f25817e;
                    if (dVar == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("mBillingClient");
                        dVar = null;
                    }
                    String str2 = Intrinsics.areEqual(str, "subs") ? "subs" : "inapp";
                    str = str2;
                    fVar.f25810c = 1;
                    r a7 = c0.a();
                    com.android.billingclient.api.e eVar = new com.android.billingclient.api.e(0);
                    eVar.f4011b = a7;
                    dVar.s(str, eVar);
                    obj = a7.m(fVar);
                    if (obj == aVar) {
                        return aVar;
                    }
                } else {
                    if (i5 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    h8.b.B(obj);
                }
                com.android.billingclient.api.k kVar = ((w) obj).f4110a;
                e(kVar.f4037a, "OnServiceQueryPurchasesV4", kVar.f4038b);
                return obj;
            }
        }
        fVar = new f(this, cVar);
        Object obj2 = fVar.f25808a;
        lf.a aVar2 = lf.a.f20034a;
        i5 = fVar.f25810c;
        if (i5 != 0) {
        }
        com.android.billingclient.api.k kVar2 = ((w) obj2).f4110a;
        e(kVar2.f4037a, "OnServiceQueryPurchasesV4", kVar2.f4038b);
        return obj2;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object j(String str, List list, mf.c cVar) {
        g gVar;
        int i5;
        if (cVar instanceof g) {
            gVar = (g) cVar;
            int i10 = gVar.f25813c;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                gVar.f25813c = i10 - Integer.MIN_VALUE;
                Object obj = gVar.f25811a;
                lf.a aVar = lf.a.f20034a;
                i5 = gVar.f25813c;
                if (i5 != 0) {
                    h8.b.B(obj);
                    ArrayList arrayList = new ArrayList(v.k(list, 10));
                    Iterator it = list.iterator();
                    while (it.hasNext()) {
                        String str2 = (String) it.next();
                        io.sentry.internal.debugmeta.c cVar2 = new io.sentry.internal.debugmeta.c(3);
                        cVar2.f16517b = str2;
                        cVar2.f16518c = str;
                        arrayList.add(cVar2.c());
                    }
                    y yVar = new y();
                    yVar.b(arrayList);
                    y a7 = yVar.a();
                    Intrinsics.checkNotNullExpressionValue(a7, "build(...)");
                    com.android.billingclient.api.d dVar = f25817e;
                    if (dVar == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("mBillingClient");
                        dVar = null;
                    }
                    gVar.f25813c = 1;
                    r a10 = c0.a();
                    com.android.billingclient.api.e eVar = new com.android.billingclient.api.e(4);
                    eVar.f4011b = a10;
                    dVar.c(a7, eVar);
                    obj = a10.m(gVar);
                    lf.a aVar2 = lf.a.f20034a;
                    if (obj == aVar) {
                        return aVar;
                    }
                } else {
                    if (i5 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    h8.b.B(obj);
                }
                com.android.billingclient.api.k kVar = ((s) obj).f4078a;
                e(kVar.f4037a, "OnServiceDetails", kVar.f4038b);
                return obj;
            }
        }
        gVar = new g(this, cVar);
        Object obj2 = gVar.f25811a;
        lf.a aVar3 = lf.a.f20034a;
        i5 = gVar.f25813c;
        if (i5 != 0) {
        }
        com.android.billingclient.api.k kVar2 = ((s) obj2).f4078a;
        e(kVar2.f4037a, "OnServiceDetails", kVar2.f4038b);
        return obj2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:29:0x004c, code lost:
    
        if (kotlin.jvm.internal.Intrinsics.areEqual(r7, "inapp") != false) goto L19;
     */
    /* JADX WARN: Removed duplicated region for block: B:15:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object k(String str, List list, mf.c cVar) {
        h hVar;
        int i5;
        if (cVar instanceof h) {
            hVar = (h) cVar;
            int i10 = hVar.f25816c;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                hVar.f25816c = i10 - Integer.MIN_VALUE;
                Object obj = hVar.f25814a;
                lf.a aVar = lf.a.f20034a;
                i5 = hVar.f25816c;
                if (i5 != 0) {
                    h8.b.B(obj);
                    com.android.billingclient.api.d dVar = f25817e;
                    if (dVar == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("mBillingClient");
                        dVar = null;
                    }
                    String str2 = Intrinsics.areEqual(str, "subs") ? "subs" : "inapp";
                    str = str2;
                    ArrayList arrayList = new ArrayList(list);
                    if (str == null) {
                        throw new IllegalArgumentException("SKU type must be set");
                    }
                    l1.a aVar2 = new l1.a(7, false);
                    aVar2.f19314b = str;
                    aVar2.f19315c = arrayList;
                    Intrinsics.checkNotNullExpressionValue(aVar2, "build(...)");
                    hVar.f25816c = 1;
                    r a7 = c0.a();
                    com.android.billingclient.api.e eVar = new com.android.billingclient.api.e(2);
                    eVar.f4011b = a7;
                    dVar.h(aVar2, eVar);
                    obj = a7.m(hVar);
                    if (obj == aVar) {
                        return aVar;
                    }
                } else {
                    if (i5 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    h8.b.B(obj);
                }
                com.android.billingclient.api.k kVar = ((a0) obj).f3967a;
                e(kVar.f4037a, "OnServiceDetailsV4", kVar.f4038b);
                return obj;
            }
        }
        hVar = new h(this, cVar);
        Object obj2 = hVar.f25814a;
        lf.a aVar3 = lf.a.f20034a;
        i5 = hVar.f25816c;
        if (i5 != 0) {
        }
        com.android.billingclient.api.k kVar2 = ((a0) obj2).f3967a;
        e(kVar2.f4037a, "OnServiceDetailsV4", kVar2.f4038b);
        return obj2;
    }

    @Override // com.android.billingclient.api.f
    public final void onBillingServiceDisconnected() {
        e(-1, "OnServiceDisconnected", null);
    }

    @Override // com.android.billingclient.api.f
    public final void onBillingSetupFinished(com.android.billingclient.api.k billingResult) {
        Intrinsics.checkNotNullParameter(billingResult, "billingResult");
        int i5 = billingResult.f4037a;
        d1 d1Var = this.f25819b;
        Integer valueOf = Integer.valueOf(i5);
        d1Var.getClass();
        d1Var.k(null, valueOf);
        e(i5, "OnServiceSetup", billingResult.f4038b);
        if (i5 == 0 || i5 != 5 || c()) {
            return;
        }
        com.android.billingclient.api.b bVar = new com.android.billingclient.api.b(this.f25818a);
        bVar.f3971c = this;
        bVar.f3970b = new m3.f(8);
        com.android.billingclient.api.d a7 = bVar.a();
        Intrinsics.checkNotNullExpressionValue(a7, "build(...)");
        f25817e = a7;
        a();
    }

    @Override // com.android.billingclient.api.x
    public final void onPurchasesUpdated(com.android.billingclient.api.k billingResult, List list) {
        Intrinsics.checkNotNullParameter(billingResult, "billingResult");
        this.f25820c.b(new Pair(Integer.valueOf(billingResult.f4037a), list));
        e(billingResult.f4037a, "OnServicePurchases", billingResult.f4038b);
    }
}
