package le;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class z0 implements hg.h {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f20028a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ d1 f20029b;

    public /* synthetic */ z0(d1 d1Var, int i5) {
        this.f20028a = i5;
        this.f20029b = d1Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object a(int i5, Continuation continuation) {
        y0 y0Var;
        Object obj;
        int i10;
        String str;
        d1 d1Var = this.f20029b;
        wc.v vVar = d1Var.f19730f;
        if (continuation instanceof y0) {
            y0Var = (y0) continuation;
            int i11 = y0Var.f20002c;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                y0Var.f20002c = i11 - Integer.MIN_VALUE;
                obj = y0Var.f20000a;
                lf.a aVar = lf.a.f20034a;
                i10 = y0Var.f20002c;
                if (i10 != 0) {
                    h8.b.B(obj);
                    if (i5 != -3 && i5 != -2) {
                        vVar.getClass();
                        wc.d0.b().getClass();
                        if (i5 != 1 && i5 != 2 && i5 != 3 && i5 != 4 && i5 != 5 && i5 != 6 && i5 != 8) {
                            if (i5 == 0) {
                                da.r.a(1);
                            }
                            return Unit.f19194a;
                        }
                    }
                    y0Var.f20002c = 1;
                    obj = vVar.a(y0Var);
                    if (obj == aVar) {
                        return aVar;
                    }
                } else {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    h8.b.B(obj);
                }
                if (((Boolean) obj).booleanValue() || (str = d1Var.f19731g) == null) {
                    int i12 = d1Var.j;
                    vVar.getClass();
                    f3.x.q0(Integer.valueOf(i12), "userCancelPayExpressAction");
                } else {
                    d1.q(d1Var, str);
                }
                return Unit.f19194a;
            }
        }
        y0Var = new y0(this, continuation);
        obj = y0Var.f20000a;
        lf.a aVar2 = lf.a.f20034a;
        i10 = y0Var.f20002c;
        if (i10 != 0) {
        }
        if (((Boolean) obj).booleanValue()) {
        }
        int i122 = d1Var.j;
        vVar.getClass();
        f3.x.q0(Integer.valueOf(i122), "userCancelPayExpressAction");
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
        a1 a1Var;
        int i5;
        d1 d1Var = this.f20029b;
        wc.v vVar = d1Var.f19730f;
        if (continuation instanceof a1) {
            a1Var = (a1) continuation;
            int i10 = a1Var.f19697c;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                a1Var.f19697c = i10 - Integer.MIN_VALUE;
                Object obj = a1Var.f19695a;
                lf.a aVar = lf.a.f20034a;
                i5 = a1Var.f19697c;
                if (i5 != 0) {
                    h8.b.B(obj);
                    if (h0Var != null) {
                        String str = h0Var.f11122b;
                        if (Intrinsics.areEqual(str, d1Var.f19736m)) {
                            ic.a aVar2 = d1Var.f19741s;
                            int i11 = d1Var.j;
                            a1Var.f19697c = 1;
                            obj = vVar.p(h0Var, aVar2, i11, a1Var);
                        } else if (Intrinsics.areEqual(str, d1Var.f19739p)) {
                            a1Var.f19697c = 2;
                            vVar.getClass();
                            obj = wc.d0.m(h0Var, a1Var);
                        }
                        return aVar;
                    }
                    return Unit.f19194a;
                }
                if (i5 == 1) {
                    h8.b.B(obj);
                    int intValue = ((Number) obj).intValue();
                    if (intValue == 200 || intValue == 201 || intValue == 204) {
                        d1.s(d1Var, d1Var.j);
                    }
                    return Unit.f19194a;
                }
                if (i5 != 2) {
                    if (i5 != 3) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    h8.b.B(obj);
                    d1.s(d1Var, d1Var.j);
                    return Unit.f19194a;
                }
                h8.b.B(obj);
                int intValue2 = ((Number) obj).intValue();
                if (intValue2 == 200 || intValue2 == 204) {
                    int i12 = d1Var.j;
                    a1Var.f19697c = 3;
                    vVar.getClass();
                }
                return Unit.f19194a;
            }
        }
        a1Var = new a1(this, continuation);
        Object obj2 = a1Var.f19695a;
        lf.a aVar3 = lf.a.f20034a;
        i5 = a1Var.f19697c;
        if (i5 != 0) {
        }
    }

    @Override // hg.h
    public final /* bridge */ /* synthetic */ Object d(Object obj, Continuation continuation) {
        switch (this.f20028a) {
            case 0:
                return a(((Number) obj).intValue(), continuation);
            default:
                return c((ic.h0) obj, continuation);
        }
    }
}
