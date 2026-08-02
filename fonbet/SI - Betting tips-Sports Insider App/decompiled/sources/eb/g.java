package eb;

import com.google.android.gms.internal.measurement.y3;
import com.sports.insider.MyApp;
import com.sports.insider.data.repository.room.billing.SkuDetailsTable;
import eg.c0;
import eg.m0;
import eg.z;
import f3.x;
import ic.e0;
import ic.u;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class g extends mf.i implements Function2 {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f8811b;

    /* renamed from: c, reason: collision with root package name */
    public int f8812c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ m3.f f8813d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ String f8814e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ g(m3.f fVar, String str, Continuation continuation, int i5) {
        super(2, continuation);
        this.f8811b = i5;
        this.f8813d = fVar;
        this.f8814e = str;
    }

    @Override // mf.a
    public final Continuation create(Object obj, Continuation continuation) {
        switch (this.f8811b) {
            case 0:
                return new g(this.f8813d, this.f8814e, continuation, 0);
            default:
                return new g(this.f8813d, this.f8814e, continuation, 1);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        z zVar = (z) obj;
        Continuation continuation = (Continuation) obj2;
        switch (this.f8811b) {
        }
        return ((g) create(zVar, continuation)).invokeSuspend(Unit.f19194a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:29:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0118  */
    /* JADX WARN: Removed duplicated region for block: B:58:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r0v13, types: [ic.a] */
    /* JADX WARN: Type inference failed for: r0v28, types: [ic.o] */
    @Override // mf.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Exception ex;
        String str;
        Exception ex2;
        String str2;
        int i5 = this.f8811b;
        String sku = this.f8814e;
        int i10 = 6;
        lf.a aVar = lf.a.f20034a;
        switch (i5) {
            case 0:
                int i11 = this.f8812c;
                if (i11 != 0) {
                    if (i11 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    h8.b.B(obj);
                    return obj;
                }
                h8.b.B(obj);
                Continuation continuation = null;
                m mVar = (m) y3.m(m.class, null, 6);
                this.f8812c = 1;
                mVar.getClass();
                try {
                    e eVar = mVar.f8830a;
                    eVar.getClass();
                    Intrinsics.checkNotNullParameter(sku, "sku");
                    SkuDetailsTable skuDetailsTable = (SkuDetailsTable) x.n0(eVar.f8809a, true, false, new a2.k(sku, i10));
                    if (skuDetailsTable != null) {
                        str = skuDetailsTable.getJsonString();
                        try {
                            if (!StringsKt.A(str, "typeInt", false)) {
                                continuation = y3.B(str);
                            }
                        } catch (Exception e7) {
                            ex = e7;
                            io.sentry.e eVar2 = new io.sentry.e(r4.k.l(sku, str));
                            Intrinsics.checkNotNullParameter(ex, "ex");
                            jg.d dVar = MyApp.f6830c;
                            lg.e eVar3 = m0.f9201a;
                            c0.t(dVar, lg.d.f20063c, null, new ge.f((Object) ex, (Comparable) eVar2, "getSkuDetails", continuation, 18), 2);
                            continuation = null;
                            if (continuation != aVar) {
                            }
                        }
                    }
                } catch (Exception e9) {
                    ex = e9;
                    str = null;
                }
                return continuation != aVar ? aVar : continuation;
            default:
                int i12 = this.f8812c;
                if (i12 != 0) {
                    if (i12 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    h8.b.B(obj);
                    return obj;
                }
                h8.b.B(obj);
                Continuation continuation2 = null;
                m mVar2 = (m) y3.m(m.class, null, 6);
                this.f8812c = 1;
                mVar2.getClass();
                try {
                    e eVar4 = mVar2.f8830a;
                    String sku2 = "ProductDetails" + sku;
                    eVar4.getClass();
                    Intrinsics.checkNotNullParameter(sku2, "sku");
                    SkuDetailsTable skuDetailsTable2 = (SkuDetailsTable) x.n0(eVar4.f8809a, true, false, new a2.k(sku2, i10));
                    if (skuDetailsTable2 != null) {
                        str2 = skuDetailsTable2.getJsonString();
                        try {
                            if (StringsKt.A(str2, "typeInt", false)) {
                                e0.Companion.getClass();
                                continuation2 = u.a(str2);
                            }
                        } catch (Exception e10) {
                            ex2 = e10;
                            io.sentry.e eVar5 = new io.sentry.e(r4.k.l(sku, str2));
                            Intrinsics.checkNotNullParameter(ex2, "ex");
                            jg.d dVar2 = MyApp.f6830c;
                            lg.e eVar6 = m0.f9201a;
                            c0.t(dVar2, lg.d.f20063c, null, new ge.f((Object) ex2, (Comparable) eVar5, "getSkuDetailsP", continuation2, 18), 2);
                            continuation2 = null;
                            if (continuation2 != aVar) {
                            }
                        }
                    }
                } catch (Exception e11) {
                    ex2 = e11;
                    str2 = null;
                }
                return continuation2 != aVar ? aVar : continuation2;
        }
    }
}
