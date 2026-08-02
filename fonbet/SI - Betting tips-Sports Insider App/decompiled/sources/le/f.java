package le;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class f implements hg.h {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f19763a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ h f19764b;

    public /* synthetic */ f(h hVar, int i5) {
        this.f19763a = i5;
        this.f19764b = hVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0027  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object a(int i5, Continuation continuation) {
        e eVar;
        int i10;
        boolean booleanValue;
        h hVar = this.f19764b;
        wc.e eVar2 = hVar.f19797f;
        if (continuation instanceof e) {
            eVar = (e) continuation;
            int i11 = eVar.f19754c;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                eVar.f19754c = i11 - Integer.MIN_VALUE;
                Object obj = eVar.f19752a;
                lf.a aVar = lf.a.f20034a;
                i10 = eVar.f19754c;
                int i12 = 4;
                if (i10 != 0) {
                    h8.b.B(obj);
                    if (i5 != -3 && i5 != -2) {
                        eVar2.getClass();
                        wc.d0.b().getClass();
                        if (i5 != 1 && i5 != 2 && i5 != 3 && i5 != 4 && i5 != 5 && i5 != 6 && i5 != 8) {
                            if (i5 == 0) {
                                da.r.a(1);
                            }
                            return Unit.f19194a;
                        }
                    }
                    eVar.f19754c = 1;
                    obj = eVar2.a(eVar);
                    if (obj == aVar) {
                        return aVar;
                    }
                } else {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    h8.b.B(obj);
                }
                booleanValue = ((Boolean) obj).booleanValue();
                Continuation continuation2 = null;
                if (booleanValue) {
                    eVar2.getClass();
                    f3.x.q0(null, "userCancelPayDiamondAction");
                } else {
                    u1.a i13 = androidx.lifecycle.d1.i(hVar);
                    lg.e eVar3 = eg.m0.f9201a;
                    eg.c0.t(i13, jg.q.f18523a, null, new b(hVar, continuation2, i12), 2);
                }
                return Unit.f19194a;
            }
        }
        eVar = new e(this, continuation);
        Object obj2 = eVar.f19752a;
        lf.a aVar2 = lf.a.f20034a;
        i10 = eVar.f19754c;
        int i122 = 4;
        if (i10 != 0) {
        }
        booleanValue = ((Boolean) obj2).booleanValue();
        Continuation continuation22 = null;
        if (booleanValue) {
        }
        return Unit.f19194a;
    }

    @Override // hg.h
    public final Object d(Object obj, Continuation continuation) {
        switch (this.f19763a) {
            case 0:
                return a(((Number) obj).intValue(), continuation);
            default:
                ic.h0 h0Var = (ic.h0) obj;
                if (h0Var == null) {
                    return Unit.f19194a;
                }
                String str = h0Var.f11122b;
                h hVar = this.f19764b;
                String str2 = hVar.f19806p;
                wc.e eVar = hVar.f19797f;
                if (Intrinsics.areEqual(str, str2) || Intrinsics.areEqual(str, hVar.q)) {
                    String str3 = hVar.f19798g;
                    eVar.f25079g.getClass();
                    if (str3 != null) {
                        sc.a[] aVarArr = sc.a.f23428a;
                        if (Intrinsics.areEqual(str3, "vip")) {
                            cd.g a7 = sc.b.a();
                            Intrinsics.checkNotNullParameter("vip", "bannerType");
                            a7.g("purchaseBanner", "vip");
                        } else if (Intrinsics.areEqual(str3, "push_vip")) {
                            cd.g a10 = sc.b.a();
                            Intrinsics.checkNotNullParameter("push_vip", "bannerType");
                            a10.g("purchaseBanner", "push_vip");
                        }
                    }
                }
                eVar.getClass();
                Object m6 = wc.d0.m(h0Var, continuation);
                return m6 == lf.a.f20034a ? m6 : Unit.f19194a;
        }
    }
}
