package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes7.dex */
public final class v98 implements z88 {
    public final /* synthetic */ int a;
    public final /* synthetic */ z88 b;
    public final /* synthetic */ Function2 c;

    public v98(Function2 function2, z88 z88Var) {
        this.a = 0;
        this.c = function2;
        this.b = z88Var;
    }

    /* JADX WARN: Code restructure failed: missing block: B:74:0x0111, code lost:
    
        if (r7.collect(r12, r0) != r13) goto L75;
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:?, code lost:
    
        return r13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x00ff, code lost:
    
        if (r2 == r13) goto L74;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00cc  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x00e6  */
    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r1v1, types: [sq3] */
    /* JADX WARN: Type inference failed for: r1v3, types: [sq3] */
    /* JADX WARN: Type inference failed for: r1v6 */
    /* JADX WARN: Type inference failed for: r1v7 */
    @Override // defpackage.z88
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object collect(b98 b98Var, rq3 rq3Var) {
        u98 u98Var;
        int i;
        int i2;
        ha8 ha8Var;
        int i3;
        ja8 ja8Var;
        f0 e;
        int i4 = this.a;
        ?? r1 = "call to 'resume' before 'invoke' with coroutine";
        Function2 function2 = this.c;
        z88 z88Var = this.b;
        switch (i4) {
            case 0:
                try {
                    if (rq3Var instanceof u98) {
                        u98Var = (u98) rq3Var;
                        int i5 = u98Var.s;
                        if ((i5 & Integer.MIN_VALUE) != 0) {
                            u98Var.s = i5 - Integer.MIN_VALUE;
                            Object obj = u98Var.r;
                            lu3 lu3Var = lu3.a;
                            i = u98Var.s;
                            if (i != 0) {
                                y6a.M(obj);
                                kog kogVar = new kog(b98Var, u98Var.getContext());
                                u98Var.u = b98Var;
                                u98Var.v = kogVar;
                                i2 = 0;
                                u98Var.w = 0;
                                u98Var.s = 1;
                                Object invoke = function2.invoke(kogVar, u98Var);
                                r1 = kogVar;
                                break;
                            } else {
                                if (i != 1) {
                                    if (i == 2) {
                                        y6a.M(obj);
                                        return Unit.a;
                                    }
                                    a70.r("call to 'resume' before 'invoke' with coroutine");
                                    return null;
                                }
                                int i6 = u98Var.w;
                                kog kogVar2 = u98Var.v;
                                b98 b98Var2 = u98Var.u;
                                y6a.M(obj);
                                i2 = i6;
                                b98Var = b98Var2;
                                r1 = kogVar2;
                            }
                            r1.releaseIntercepted();
                            u98Var.u = null;
                            u98Var.v = null;
                            u98Var.w = i2;
                            u98Var.s = 2;
                            break;
                        }
                    }
                    if (i != 0) {
                    }
                    r1.releaseIntercepted();
                    u98Var.u = null;
                    u98Var.v = null;
                    u98Var.w = i2;
                    u98Var.s = 2;
                } catch (Throwable th) {
                    r1.releaseIntercepted();
                    throw th;
                }
                u98Var = new u98(this, rq3Var);
                Object obj2 = u98Var.r;
                lu3 lu3Var2 = lu3.a;
                i = u98Var.s;
            case 1:
                Object collect = z88Var.collect(new m70(6, new asf(), b98Var, function2), rq3Var);
                return collect == lu3.a ? collect : Unit.a;
            case 2:
                if (rq3Var instanceof ha8) {
                    ha8Var = (ha8) rq3Var;
                    int i7 = ha8Var.s;
                    if ((i7 & Integer.MIN_VALUE) != 0) {
                        ha8Var.s = i7 - Integer.MIN_VALUE;
                        Object obj3 = ha8Var.r;
                        lu3 lu3Var3 = lu3.a;
                        i3 = ha8Var.s;
                        if (i3 != 0) {
                            y6a.M(obj3);
                            ja8 ja8Var2 = new ja8(b98Var, function2);
                            try {
                                ha8Var.u = ja8Var2;
                                ha8Var.s = 1;
                                if (z88Var.collect(ja8Var2, ha8Var) == lu3Var3) {
                                    return lu3Var3;
                                }
                            } catch (f0 e2) {
                                ja8Var = ja8Var2;
                                e = e2;
                                if (e.a == ja8Var) {
                                }
                            }
                        } else {
                            if (i3 != 1) {
                                a70.r("call to 'resume' before 'invoke' with coroutine");
                                return null;
                            }
                            ja8Var = ha8Var.u;
                            try {
                                y6a.M(obj3);
                            } catch (f0 e3) {
                                e = e3;
                                if (e.a == ja8Var) {
                                    throw e;
                                }
                                bea.u(ha8Var.getContext());
                                return Unit.a;
                            }
                        }
                        return Unit.a;
                    }
                }
                ha8Var = new ha8(this, rq3Var);
                Object obj32 = ha8Var.r;
                lu3 lu3Var32 = lu3.a;
                i3 = ha8Var.s;
                if (i3 != 0) {
                }
                return Unit.a;
            case 3:
                Object collect2 = z88Var.collect(new ja8(b98Var, function2, 1), rq3Var);
                return collect2 == lu3.a ? collect2 : Unit.a;
            case 4:
                Object collect3 = z88Var.collect(new ja8(b98Var, function2, 2), rq3Var);
                return collect3 == lu3.a ? collect3 : Unit.a;
            default:
                Object collect4 = z88Var.collect(new ja8(b98Var, function2, 3), rq3Var);
                return collect4 == lu3.a ? collect4 : Unit.a;
        }
    }

    public /* synthetic */ v98(z88 z88Var, Function2 function2, int i) {
        this.a = i;
        this.b = z88Var;
        this.c = function2;
    }
}
