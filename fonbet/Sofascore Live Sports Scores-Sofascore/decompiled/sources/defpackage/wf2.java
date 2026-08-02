package defpackage;

import java.util.Iterator;
import kotlin.Unit;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes7.dex */
public final class wf2 implements z88 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ wf2(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x002c  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00bb  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00d8  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00ee  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00ce  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x010f  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0136  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0125  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:46:0x00e8 -> B:43:0x00ec). Please report as a decompilation issue!!! */
    @Override // defpackage.z88
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object collect(b98 b98Var, rq3 rq3Var) {
        m98 m98Var;
        int i;
        Iterator it;
        int i2;
        n98 n98Var;
        int i3;
        int length;
        b98 b98Var2;
        int i4;
        rci rciVar;
        int i5;
        int i6 = this.a;
        int i7 = 0;
        rq3 rq3Var2 = null;
        int i8 = 1;
        Object obj = this.b;
        switch (i6) {
            case 0:
                Object collect = ((pog) obj).collect(new vj0(b98Var, i8), rq3Var);
                return collect == lu3.a ? collect : Unit.a;
            case 1:
                Object collect2 = ((o63) obj).collect(new vj0(b98Var, 9), rq3Var);
                return collect2 == lu3.a ? collect2 : Unit.a;
            case 2:
                Object collect3 = ((v98) obj).collect(new vj0(b98Var, 10), rq3Var);
                return collect3 == lu3.a ? collect3 : Unit.a;
            case 3:
                zi7 zi7Var = new zi7((q98) obj, b98Var, rq3Var2, 7);
                f98 f98Var = new f98(rq3Var, rq3Var.getContext());
                Object L = y6a.L(f98Var, true, f98Var, zi7Var);
                return L == lu3.a ? L : Unit.a;
            case 4:
                if (rq3Var instanceof m98) {
                    m98Var = (m98) rq3Var;
                    int i9 = m98Var.s;
                    if ((i9 & Integer.MIN_VALUE) != 0) {
                        m98Var.s = i9 - Integer.MIN_VALUE;
                        Object obj2 = m98Var.r;
                        lu3 lu3Var = lu3.a;
                        i = m98Var.s;
                        if (i != 0) {
                            y6a.M(obj2);
                            it = ((Iterable) obj).iterator();
                            i2 = 0;
                        } else {
                            if (i != 1) {
                                a70.r("call to 'resume' before 'invoke' with coroutine");
                                return null;
                            }
                            int i10 = m98Var.x;
                            i7 = m98Var.w;
                            it = m98Var.v;
                            b98 b98Var3 = m98Var.u;
                            y6a.M(obj2);
                            i2 = i10;
                            b98Var = b98Var3;
                        }
                        while (it.hasNext()) {
                            Object next = it.next();
                            m98Var.u = b98Var;
                            m98Var.v = it;
                            m98Var.w = i7;
                            m98Var.x = i2;
                            m98Var.s = 1;
                            if (b98Var.emit(next, m98Var) == lu3Var) {
                                return lu3Var;
                            }
                        }
                        return Unit.a;
                    }
                }
                m98Var = new m98(this, rq3Var);
                Object obj22 = m98Var.r;
                lu3 lu3Var2 = lu3.a;
                i = m98Var.s;
                if (i != 0) {
                }
                while (it.hasNext()) {
                }
                return Unit.a;
            case 5:
                Object[] objArr = (Object[]) obj;
                if (rq3Var instanceof n98) {
                    n98Var = (n98) rq3Var;
                    int i11 = n98Var.s;
                    if ((i11 & Integer.MIN_VALUE) != 0) {
                        n98Var.s = i11 - Integer.MIN_VALUE;
                        Object obj3 = n98Var.r;
                        lu3 lu3Var3 = lu3.a;
                        i3 = n98Var.s;
                        if (i3 != 0) {
                            y6a.M(obj3);
                            length = objArr.length;
                            b98Var2 = b98Var;
                            i4 = 0;
                            if (i7 < length) {
                            }
                        } else {
                            if (i3 != 1) {
                                a70.r("call to 'resume' before 'invoke' with coroutine");
                                return null;
                            }
                            length = n98Var.x;
                            i7 = n98Var.w;
                            i4 = n98Var.v;
                            b98 b98Var4 = n98Var.u;
                            y6a.M(obj3);
                            b98Var2 = b98Var4;
                            i7++;
                            if (i7 < length) {
                                Object obj4 = objArr[i7];
                                n98Var.u = b98Var2;
                                n98Var.v = i4;
                                n98Var.w = i7;
                                n98Var.x = length;
                                n98Var.s = 1;
                                if (b98Var2.emit(obj4, n98Var) == lu3Var3) {
                                    return lu3Var3;
                                }
                                i7++;
                                if (i7 < length) {
                                    return Unit.a;
                                }
                            }
                        }
                    }
                }
                n98Var = new n98(this, rq3Var);
                Object obj32 = n98Var.r;
                lu3 lu3Var32 = lu3.a;
                i3 = n98Var.s;
                if (i3 != 0) {
                }
            case 6:
                Object emit = b98Var.emit(obj, rq3Var);
                return emit == lu3.a ? emit : Unit.a;
            case 7:
                Object collect4 = ((nd7) obj).collect(new vj0(b98Var, 22), rq3Var);
                return collect4 == lu3.a ? collect4 : Unit.a;
            case 8:
                Object collect5 = ((th2) obj).collect(new vj0(b98Var, 26), rq3Var);
                return collect5 == lu3.a ? collect5 : Unit.a;
            case 9:
                Object collect6 = ((hof) obj).a.collect(new k2e(b98Var, 2), rq3Var);
                return collect6 == lu3.a ? collect6 : Unit.a;
            default:
                if (rq3Var instanceof rci) {
                    rciVar = (rci) rq3Var;
                    int i12 = rciVar.s;
                    if ((i12 & Integer.MIN_VALUE) != 0) {
                        rciVar.s = i12 - Integer.MIN_VALUE;
                        Object obj5 = rciVar.r;
                        lu3 lu3Var4 = lu3.a;
                        i5 = rciVar.s;
                        if (i5 == 0) {
                            if (i5 == 1) {
                                throw wt3.i(obj5);
                            }
                            a70.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        y6a.M(obj5);
                        usf usfVar = new usf(8, new asf(), b98Var);
                        rciVar.s = 1;
                        ((kki) obj).collect(usfVar, rciVar);
                        return lu3Var4;
                    }
                }
                rciVar = new rci(this, rq3Var);
                Object obj52 = rciVar.r;
                lu3 lu3Var42 = lu3.a;
                i5 = rciVar.s;
                if (i5 == 0) {
                }
        }
    }
}
