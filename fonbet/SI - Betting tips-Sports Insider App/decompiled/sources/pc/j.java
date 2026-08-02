package pc;

import android.app.Activity;
import com.android.billingclient.api.SkuDetails;
import com.android.billingclient.api.a0;
import eg.c0;
import eg.m0;
import eg.z;
import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import la.d1;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class j extends mf.i implements Function2 {

    /* renamed from: b, reason: collision with root package name */
    public Object f21647b;

    /* renamed from: c, reason: collision with root package name */
    public int f21648c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f21649d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ u f21650e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ String f21651f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f21652g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ Activity f21653h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ String f21654i;
    public final /* synthetic */ String j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(int i5, u uVar, String str, int i10, Activity activity, String str2, String str3, Continuation continuation) {
        super(2, continuation);
        this.f21649d = i5;
        this.f21650e = uVar;
        this.f21651f = str;
        this.f21652g = i10;
        this.f21653h = activity;
        this.f21654i = str2;
        this.j = str3;
    }

    public static final void c(Exception exc, int i5, String str) {
        u.r(exc, "launchBilling()", new io.sentry.e("announcementId:" + i5 + ", skuDetails:" + str));
    }

    @Override // mf.a
    public final Continuation create(Object obj, Continuation continuation) {
        return new j(this.f21649d, this.f21650e, this.f21651f, this.f21652g, this.f21653h, this.f21654i, this.j, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((j) create((z) obj, (Continuation) obj2)).invokeSuspend(Unit.f19194a);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x01ee A[Catch: Exception -> 0x0025, TRY_LEAVE, TryCatch #3 {Exception -> 0x0025, blocks: (B:9:0x0020, B:10:0x01e4, B:12:0x01ee), top: B:8:0x0020 }] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0192 A[Catch: Exception -> 0x01f6, TryCatch #2 {Exception -> 0x01f6, blocks: (B:27:0x0182, B:29:0x0192, B:33:0x019f, B:34:0x01b1, B:39:0x01a8, B:40:0x01ad), top: B:26:0x0182 }] */
    /* JADX WARN: Removed duplicated region for block: B:37:0x01e3  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x01ad A[Catch: Exception -> 0x01f6, TryCatch #2 {Exception -> 0x01f6, blocks: (B:27:0x0182, B:29:0x0192, B:33:0x019f, B:34:0x01b1, B:39:0x01a8, B:40:0x01ad), top: B:26:0x0182 }] */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0160 A[Catch: Exception -> 0x0033, TryCatch #4 {Exception -> 0x0033, blocks: (B:18:0x01f9, B:20:0x002d, B:22:0x0175, B:24:0x0179, B:43:0x0204, B:45:0x0037, B:47:0x015b, B:49:0x0160, B:61:0x0132, B:63:0x004f, B:65:0x00a4, B:93:0x013e, B:95:0x0054, B:97:0x008b, B:99:0x0090, B:103:0x005c, B:106:0x0065, B:110:0x0072, B:113:0x0141), top: B:2:0x0010 }] */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0126 A[Catch: Exception -> 0x0047, TRY_LEAVE, TryCatch #1 {Exception -> 0x0047, blocks: (B:54:0x0042, B:55:0x011c, B:57:0x0126), top: B:53:0x0042 }] */
    /* JADX WARN: Removed duplicated region for block: B:85:0x011b  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0090 A[Catch: Exception -> 0x0033, TryCatch #4 {Exception -> 0x0033, blocks: (B:18:0x01f9, B:20:0x002d, B:22:0x0175, B:24:0x0179, B:43:0x0204, B:45:0x0037, B:47:0x015b, B:49:0x0160, B:61:0x0132, B:63:0x004f, B:65:0x00a4, B:93:0x013e, B:95:0x0054, B:97:0x008b, B:99:0x0090, B:103:0x005c, B:106:0x0065, B:110:0x0072, B:113:0x0141), top: B:2:0x0010 }] */
    @Override // mf.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        u uVar;
        u uVar2;
        com.android.billingclient.api.s sVar;
        com.android.billingclient.api.q qVar;
        Exception exc;
        com.android.billingclient.api.q qVar2;
        com.android.billingclient.api.n a7;
        String str;
        fg.e eVar;
        d1 d1Var;
        ArrayList arrayList;
        com.android.billingclient.api.p pVar;
        com.android.billingclient.api.m mVar;
        ArrayList arrayList2;
        com.android.billingclient.api.o oVar;
        a0 a0Var;
        List list;
        SkuDetails skuDetails;
        Exception exc2;
        SkuDetails skuDetails2;
        long d10;
        fg.e eVar2;
        ge.f fVar;
        u uVar3 = this.f21650e;
        gf.t tVar = uVar3.f21701a;
        lf.a aVar = lf.a.f20034a;
        int i5 = this.f21648c;
        int i10 = this.f21652g;
        Continuation continuation = null;
        try {
        } catch (Exception e7) {
            u.r(e7, "LaunchBilling", new io.sentry.e(""));
        }
        switch (i5) {
            case 0:
                h8.b.B(obj);
                String str2 = this.f21649d == 2 ? "subs" : "inapp";
                boolean d11 = u.n().d();
                String str3 = this.f21651f;
                if (d11) {
                    uVar2 = uVar3;
                    List c2 = kotlin.collections.t.c(str3);
                    this.f21648c = 1;
                    lg.e eVar3 = m0.f9201a;
                    obj = c0.A(lg.d.f20063c, new h(c2, uVar2, str2, continuation, 0), this);
                    if (obj == aVar) {
                    }
                    sVar = (com.android.billingclient.api.s) obj;
                    if (sVar != null) {
                        int i11 = sVar.f4078a.f4037a;
                        ArrayList arrayList3 = sVar.f4079b;
                        this.f21647b = sVar;
                        this.f21648c = 2;
                        if (uVar2.s(i11, arrayList3, null, this) == aVar) {
                        }
                        if (sVar != null && (qVar = (com.android.billingclient.api.q) CollectionsKt.firstOrNull(sVar.f4079b)) != null) {
                            try {
                                vc.a aVar2 = (vc.a) tVar.getValue();
                                long g10 = u.g(uVar2, qVar);
                                String str4 = "nil";
                                if (Intrinsics.areEqual(qVar.f4070d, "subs") ? !((a7 = qVar.a()) == null || (str = a7.f4050c) == null) : !((arrayList = qVar.j) == null || (pVar = (com.android.billingclient.api.p) CollectionsKt.firstOrNull(arrayList)) == null || (mVar = pVar.f4065d) == null || (arrayList2 = mVar.f4046a) == null || (oVar = (com.android.billingclient.api.o) CollectionsKt.firstOrNull(arrayList2)) == null || (str = oVar.f4058c) == null)) {
                                    str4 = str;
                                }
                                String str5 = qVar.f4069c;
                                Intrinsics.checkNotNullExpressionValue(str5, "getProductId(...)");
                                aVar2.getClass();
                                vc.a.a(i10, g10, str4, str5);
                                lg.e eVar4 = m0.f9201a;
                                eVar = jg.q.f18523a;
                                d1Var = new d1(uVar2, this.f21653h, qVar, this.f21654i, this.j, null, 3);
                                this.f21647b = qVar;
                                this.f21648c = 3;
                            } catch (Exception e9) {
                                exc = e9;
                                qVar2 = qVar;
                                break;
                            }
                            if (c0.A(eVar, d1Var, this) != aVar) {
                                qVar2 = qVar;
                                if (!u.n().c()) {
                                    u.n().a();
                                }
                                return Unit.f19194a;
                            }
                        }
                    }
                    return Unit.f19194a;
                }
                uVar = uVar3;
                List c8 = kotlin.collections.t.c(str3);
                this.f21648c = 4;
                lg.e eVar5 = m0.f9201a;
                obj = c0.A(lg.d.f20063c, new h(c8, uVar, str2, continuation, 1), this);
                if (obj == aVar) {
                }
                a0Var = (a0) obj;
                if (a0Var != null) {
                    int i12 = a0Var.f3967a.f4037a;
                    List list2 = a0Var.f3968b;
                    this.f21647b = a0Var;
                    this.f21648c = 5;
                    if (uVar.s(i12, null, list2, this) == aVar) {
                    }
                    if (a0Var != null && (list = a0Var.f3968b) != null && (skuDetails = (SkuDetails) CollectionsKt.firstOrNull(list)) != null) {
                        try {
                            vc.a aVar3 = (vc.a) tVar.getValue();
                            if (Intrinsics.areEqual(skuDetails.g(), "subs")) {
                                d10 = skuDetails.d();
                            } else {
                                String a10 = skuDetails.a();
                                if (a10.length() == 0) {
                                    a10 = null;
                                }
                                d10 = a10 != null ? skuDetails.f3964b.optLong("introductoryPriceAmountMicros") : skuDetails.d();
                            }
                            String e10 = skuDetails.e();
                            Intrinsics.checkNotNullExpressionValue(e10, "getPriceCurrencyCode(...)");
                            String f6 = skuDetails.f();
                            Intrinsics.checkNotNullExpressionValue(f6, "getSku(...)");
                            aVar3.getClass();
                            vc.a.a(i10, d10, e10, f6);
                            lg.e eVar6 = m0.f9201a;
                            eVar2 = jg.q.f18523a;
                            fVar = new ge.f(uVar, this.f21653h, skuDetails, continuation, 11);
                            this.f21647b = skuDetails;
                            this.f21648c = 6;
                        } catch (Exception e11) {
                            exc2 = e11;
                            skuDetails2 = skuDetails;
                            String skuDetails3 = skuDetails2.toString();
                            Intrinsics.checkNotNullExpressionValue(skuDetails3, "toString(...)");
                            c(exc2, i10, skuDetails3);
                            return Unit.f19194a;
                        }
                        if (c0.A(eVar2, fVar, this) != aVar) {
                            skuDetails2 = skuDetails;
                            if (!u.n().c()) {
                                u.n().a();
                            }
                            return Unit.f19194a;
                        }
                    }
                }
                return Unit.f19194a;
                return aVar;
            case 1:
                h8.b.B(obj);
                uVar2 = uVar3;
                sVar = (com.android.billingclient.api.s) obj;
                if (sVar != null) {
                }
                return Unit.f19194a;
            case 2:
                sVar = (com.android.billingclient.api.s) this.f21647b;
                h8.b.B(obj);
                uVar2 = uVar3;
                if (sVar != null) {
                    vc.a aVar22 = (vc.a) tVar.getValue();
                    long g102 = u.g(uVar2, qVar);
                    String str42 = "nil";
                    if (Intrinsics.areEqual(qVar.f4070d, "subs")) {
                        String str52 = qVar.f4069c;
                        Intrinsics.checkNotNullExpressionValue(str52, "getProductId(...)");
                        aVar22.getClass();
                        vc.a.a(i10, g102, str42, str52);
                        lg.e eVar42 = m0.f9201a;
                        eVar = jg.q.f18523a;
                        d1Var = new d1(uVar2, this.f21653h, qVar, this.f21654i, this.j, null, 3);
                        this.f21647b = qVar;
                        this.f21648c = 3;
                        if (c0.A(eVar, d1Var, this) != aVar) {
                        }
                        return aVar;
                    }
                    String str522 = qVar.f4069c;
                    Intrinsics.checkNotNullExpressionValue(str522, "getProductId(...)");
                    aVar22.getClass();
                    vc.a.a(i10, g102, str42, str522);
                    lg.e eVar422 = m0.f9201a;
                    eVar = jg.q.f18523a;
                    d1Var = new d1(uVar2, this.f21653h, qVar, this.f21654i, this.j, null, 3);
                    this.f21647b = qVar;
                    this.f21648c = 3;
                    if (c0.A(eVar, d1Var, this) != aVar) {
                    }
                    return aVar;
                    exc = e;
                    String qVar3 = qVar2.toString();
                    Intrinsics.checkNotNullExpressionValue(qVar3, "toString(...)");
                    c(exc, i10, qVar3);
                    return Unit.f19194a;
                }
                return Unit.f19194a;
            case 3:
                qVar2 = (com.android.billingclient.api.q) this.f21647b;
                try {
                    h8.b.B(obj);
                    if (!u.n().c()) {
                    }
                } catch (Exception e12) {
                    exc = e12;
                    break;
                }
                return Unit.f19194a;
            case 4:
                h8.b.B(obj);
                uVar = uVar3;
                a0Var = (a0) obj;
                if (a0Var != null) {
                }
                return Unit.f19194a;
            case 5:
                a0Var = (a0) this.f21647b;
                h8.b.B(obj);
                uVar = uVar3;
                if (a0Var != null) {
                    vc.a aVar32 = (vc.a) tVar.getValue();
                    if (Intrinsics.areEqual(skuDetails.g(), "subs")) {
                    }
                    String e102 = skuDetails.e();
                    Intrinsics.checkNotNullExpressionValue(e102, "getPriceCurrencyCode(...)");
                    String f62 = skuDetails.f();
                    Intrinsics.checkNotNullExpressionValue(f62, "getSku(...)");
                    aVar32.getClass();
                    vc.a.a(i10, d10, e102, f62);
                    lg.e eVar62 = m0.f9201a;
                    eVar2 = jg.q.f18523a;
                    fVar = new ge.f(uVar, this.f21653h, skuDetails, continuation, 11);
                    this.f21647b = skuDetails;
                    this.f21648c = 6;
                    if (c0.A(eVar2, fVar, this) != aVar) {
                    }
                    return aVar;
                }
                return Unit.f19194a;
            case 6:
                skuDetails2 = (SkuDetails) this.f21647b;
                try {
                    h8.b.B(obj);
                    if (!u.n().c()) {
                    }
                } catch (Exception e13) {
                    exc2 = e13;
                    String skuDetails32 = skuDetails2.toString();
                    Intrinsics.checkNotNullExpressionValue(skuDetails32, "toString(...)");
                    c(exc2, i10, skuDetails32);
                    return Unit.f19194a;
                }
                return Unit.f19194a;
            default:
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }
}
