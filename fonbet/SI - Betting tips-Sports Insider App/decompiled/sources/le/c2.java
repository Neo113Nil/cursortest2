package le;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class c2 implements hg.h {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f19721a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ f2 f19722b;

    public /* synthetic */ c2(f2 f2Var, int i5) {
        this.f19721a = i5;
        this.f19722b = f2Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object a(int i5, Continuation continuation) {
        b2 b2Var;
        Object obj;
        int i10;
        String str;
        f2 f2Var = this.f19722b;
        wc.j0 j0Var = f2Var.f19769f;
        if (continuation instanceof b2) {
            b2Var = (b2) continuation;
            int i11 = b2Var.f19710c;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                b2Var.f19710c = i11 - Integer.MIN_VALUE;
                obj = b2Var.f19708a;
                lf.a aVar = lf.a.f20034a;
                i10 = b2Var.f19710c;
                if (i10 != 0) {
                    h8.b.B(obj);
                    if (i5 != -3 && i5 != -2) {
                        j0Var.getClass();
                        wc.d0.b().getClass();
                        if (i5 != 1 && i5 != 2 && i5 != 3 && i5 != 4 && i5 != 5 && i5 != 6 && i5 != 8) {
                            if (i5 == 0) {
                                da.r.a(1);
                            }
                            return Unit.f19194a;
                        }
                    }
                    b2Var.f19710c = 1;
                    obj = j0Var.a(b2Var);
                    if (obj == aVar) {
                        return aVar;
                    }
                } else {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    h8.b.B(obj);
                }
                if (((Boolean) obj).booleanValue() || (str = f2Var.f19770g) == null) {
                    int i12 = f2Var.j;
                    j0Var.getClass();
                    f3.x.q0(Integer.valueOf(i12), "userCancelPayPremiumAction");
                } else {
                    f2.q(f2Var, str);
                }
                return Unit.f19194a;
            }
        }
        b2Var = new b2(this, continuation);
        obj = b2Var.f19708a;
        lf.a aVar2 = lf.a.f20034a;
        i10 = b2Var.f19710c;
        if (i10 != 0) {
        }
        if (((Boolean) obj).booleanValue()) {
        }
        int i122 = f2Var.j;
        j0Var.getClass();
        f3.x.q0(Integer.valueOf(i122), "userCancelPayPremiumAction");
        return Unit.f19194a;
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x00a1, code lost:
    
        if (wc.d0.k(r11, r2) == r3) goto L43;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x005f, code lost:
    
        if (r12 == r3) goto L43;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x0088, code lost:
    
        if (r12 == r3) goto L43;
     */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0046  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object c(ic.h0 h0Var, Continuation continuation) {
        d2 d2Var;
        int i5;
        f2 f2Var = this.f19722b;
        wc.j0 j0Var = f2Var.f19769f;
        if (continuation instanceof d2) {
            d2Var = (d2) continuation;
            int i10 = d2Var.f19751c;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                d2Var.f19751c = i10 - Integer.MIN_VALUE;
                Object obj = d2Var.f19749a;
                lf.a aVar = lf.a.f20034a;
                i5 = d2Var.f19751c;
                if (i5 != 0) {
                    h8.b.B(obj);
                    if (h0Var != null) {
                        String str = h0Var.f11122b;
                        if (Intrinsics.areEqual(str, f2Var.f19776n)) {
                            ic.a aVar2 = f2Var.f19781t;
                            int i11 = f2Var.j;
                            d2Var.f19751c = 1;
                            obj = j0Var.p(h0Var, aVar2, i11, d2Var);
                        } else if (Intrinsics.areEqual(str, f2Var.q)) {
                            d2Var.f19751c = 2;
                            j0Var.getClass();
                            obj = wc.d0.m(h0Var, d2Var);
                        }
                        return aVar;
                    }
                    return Unit.f19194a;
                }
                if (i5 == 1) {
                    h8.b.B(obj);
                    int intValue = ((Number) obj).intValue();
                    if (intValue == 200 || intValue == 201 || intValue == 204) {
                        f2.s(f2Var, f2Var.j);
                    }
                    return Unit.f19194a;
                }
                if (i5 != 2) {
                    if (i5 != 3) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    h8.b.B(obj);
                    f2.s(f2Var, f2Var.j);
                    return Unit.f19194a;
                }
                h8.b.B(obj);
                int intValue2 = ((Number) obj).intValue();
                if (intValue2 == 200 || intValue2 == 204) {
                    int i12 = f2Var.j;
                    d2Var.f19751c = 3;
                    j0Var.getClass();
                }
                return Unit.f19194a;
            }
        }
        d2Var = new d2(this, continuation);
        Object obj2 = d2Var.f19749a;
        lf.a aVar3 = lf.a.f20034a;
        i5 = d2Var.f19751c;
        if (i5 != 0) {
        }
    }

    @Override // hg.h
    public final /* bridge */ /* synthetic */ Object d(Object obj, Continuation continuation) {
        switch (this.f19721a) {
            case 0:
                return a(((Number) obj).intValue(), continuation);
            default:
                return c((ic.h0) obj, continuation);
        }
    }
}
