package defpackage;

import kotlin.Unit;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes7.dex */
public final class t98 implements z88 {
    public final /* synthetic */ int a;
    public final /* synthetic */ z88 b;
    public final /* synthetic */ ct8 c;

    public /* synthetic */ t98(z88 z88Var, ct8 ct8Var, int i) {
        this.a = i;
        this.b = z88Var;
        this.c = ct8Var;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(7:28|(6:(2:30|(10:32|33|34|(1:(1:(1:(5:39|40|41|42|43)(2:48|49))(2:50|51))(2:52|53))(2:65|66)|54|56|57|(3:59|42|43)|60|61))|56|57|(0)|60|61)|73|33|34|(0)(0)|54) */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0061, code lost:
    
        if (r1.invoke(r13, r12, r0) == r14) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:?, code lost:
    
        return r14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0050, code lost:
    
        if (r12 == r14) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x00bb, code lost:
    
        if (r2.collect(r13, r0) == r14) goto L66;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x00ab, code lost:
    
        r12 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x00e5, code lost:
    
        r12 = new defpackage.ngj(r12);
        r0.u = null;
        r0.v = r12;
        r0.w = r3;
        r0.s = 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x00f6, code lost:
    
        if (defpackage.kik.F(r12, r1, r12, r0) != r14) goto L79;
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:?, code lost:
    
        throw r12;
     */
    /* JADX WARN: Removed duplicated region for block: B:10:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0057  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0043  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0087  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00d6  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x00ae  */
    @Override // defpackage.z88
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object collect(b98 b98Var, rq3 rq3Var) {
        s98 s98Var;
        lu3 lu3Var;
        int i;
        kog kogVar;
        kog kogVar2;
        Throwable th;
        w98 w98Var;
        int i2;
        Throwable th2;
        int i3 = this.a;
        ct8 ct8Var = this.c;
        z88 z88Var = this.b;
        int i4 = 0;
        switch (i3) {
            case 0:
                try {
                    if (rq3Var instanceof s98) {
                        s98Var = (s98) rq3Var;
                        int i5 = s98Var.s;
                        if ((i5 & Integer.MIN_VALUE) != 0) {
                            s98Var.s = i5 - Integer.MIN_VALUE;
                            Object obj = s98Var.r;
                            lu3Var = lu3.a;
                            i = s98Var.s;
                            if (i != 0) {
                                y6a.M(obj);
                                s98Var.u = b98Var;
                                s98Var.w = 0;
                                s98Var.s = 1;
                                break;
                            } else {
                                if (i != 1) {
                                    if (i == 2) {
                                        Throwable th3 = (Throwable) s98Var.v;
                                        y6a.M(obj);
                                        throw th3;
                                    }
                                    if (i != 3) {
                                        a70.r("call to 'resume' before 'invoke' with coroutine");
                                        return null;
                                    }
                                    kogVar2 = (kog) s98Var.v;
                                    try {
                                        y6a.M(obj);
                                        kogVar2.releaseIntercepted();
                                        return Unit.a;
                                    } catch (Throwable th4) {
                                        th = th4;
                                        kogVar2.releaseIntercepted();
                                        throw th;
                                    }
                                }
                                i4 = s98Var.w;
                                b98Var = s98Var.u;
                                y6a.M(obj);
                            }
                            kogVar = new kog(b98Var, s98Var.getContext());
                            s98Var.u = null;
                            s98Var.v = kogVar;
                            s98Var.w = i4;
                            s98Var.s = 3;
                            if (ct8Var.invoke(kogVar, null, s98Var) != lu3Var) {
                                kogVar2 = kogVar;
                                kogVar2.releaseIntercepted();
                                return Unit.a;
                            }
                            return lu3Var;
                        }
                    }
                    s98Var.u = null;
                    s98Var.v = kogVar;
                    s98Var.w = i4;
                    s98Var.s = 3;
                    if (ct8Var.invoke(kogVar, null, s98Var) != lu3Var) {
                    }
                    return lu3Var;
                } catch (Throwable th5) {
                    kogVar2 = kogVar;
                    th = th5;
                    kogVar2.releaseIntercepted();
                    throw th;
                }
                s98Var = new s98(this, rq3Var);
                Object obj2 = s98Var.r;
                lu3Var = lu3.a;
                i = s98Var.s;
                if (i != 0) {
                }
                kogVar = new kog(b98Var, s98Var.getContext());
            default:
                if (rq3Var instanceof w98) {
                    w98Var = (w98) rq3Var;
                    int i6 = w98Var.s;
                    if ((i6 & Integer.MIN_VALUE) != 0) {
                        w98Var.s = i6 - Integer.MIN_VALUE;
                        Object obj3 = w98Var.r;
                        Object obj4 = lu3.a;
                        i2 = w98Var.s;
                        if (i2 != 0) {
                            y6a.M(obj3);
                            w98Var.u = b98Var;
                            w98Var.v = 0;
                            w98Var.s = 1;
                            obj3 = lz.B(z88Var, b98Var, w98Var);
                            break;
                        } else {
                            if (i2 != 1) {
                                if (i2 == 2) {
                                    y6a.M(obj3);
                                    return Unit.a;
                                }
                                a70.r("call to 'resume' before 'invoke' with coroutine");
                                return null;
                            }
                            i4 = w98Var.v;
                            b98Var = w98Var.u;
                            y6a.M(obj3);
                        }
                        th2 = (Throwable) obj3;
                        if (th2 != null) {
                            w98Var.u = null;
                            w98Var.v = i4;
                            w98Var.s = 2;
                            break;
                        }
                        return Unit.a;
                    }
                }
                w98Var = new w98(this, rq3Var);
                Object obj32 = w98Var.r;
                Object obj42 = lu3.a;
                i2 = w98Var.s;
                if (i2 != 0) {
                }
                th2 = (Throwable) obj32;
                if (th2 != null) {
                }
                return Unit.a;
        }
    }
}
