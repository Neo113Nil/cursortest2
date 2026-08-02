package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes7.dex */
public final class ja8 implements b98 {
    public final /* synthetic */ int a;
    public final /* synthetic */ b98 b;
    public final /* synthetic */ Function2 c;

    public ja8(b98 b98Var, Function2 function2) {
        this.a = 0;
        this.c = function2;
        this.b = b98Var;
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x0059, code lost:
    
        if (r3.emit(r11, r0) != r13) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:?, code lost:
    
        return r13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x004e, code lost:
    
        if (r11 == r13) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x00a8, code lost:
    
        if (r3.emit(r11, r0) != r13) goto L44;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:?, code lost:
    
        return r13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x009d, code lost:
    
        if (r11 == r13) goto L43;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x0101, code lost:
    
        if (r3.emit(r12, r0) != r13) goto L65;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:?, code lost:
    
        return r13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x00f2, code lost:
    
        if (r2.invoke(r12, r0) == r13) goto L64;
     */
    /* JADX WARN: Code restructure failed: missing block: B:88:0x015c, code lost:
    
        if (r3.emit(r12, r0) == r5) goto L87;
     */
    /* JADX WARN: Code restructure failed: missing block: B:90:?, code lost:
    
        return r5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:94:0x0147, code lost:
    
        if (r13 == r5) goto L87;
     */
    /* JADX WARN: Removed duplicated region for block: B:10:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0041  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00cd  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00e3  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0126  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0152  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0163  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x013a  */
    @Override // defpackage.b98
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object emit(Object obj, rq3 rq3Var) {
        ia8 ia8Var;
        Object obj2;
        int i;
        ya8 ya8Var;
        int i2;
        n6e n6eVar;
        int i3;
        o6e o6eVar;
        int i4;
        int i5 = this.a;
        int i6 = 0;
        Function2 function2 = this.c;
        b98 b98Var = this.b;
        switch (i5) {
            case 0:
                if (rq3Var instanceof ia8) {
                    ia8Var = (ia8) rq3Var;
                    int i7 = ia8Var.s;
                    if ((i7 & Integer.MIN_VALUE) != 0) {
                        ia8Var.s = i7 - Integer.MIN_VALUE;
                        obj2 = ia8Var.r;
                        lu3 lu3Var = lu3.a;
                        i = ia8Var.s;
                        if (i != 0) {
                            y6a.M(obj2);
                            ia8Var.u = obj;
                            ia8Var.v = 0;
                            ia8Var.s = 1;
                            obj2 = function2.invoke(obj, ia8Var);
                            break;
                        } else {
                            if (i != 1) {
                                if (i == 2) {
                                    y6a.M(obj2);
                                    return Unit.a;
                                }
                                a70.r("call to 'resume' before 'invoke' with coroutine");
                                return null;
                            }
                            i6 = ia8Var.v;
                            obj = ia8Var.u;
                            y6a.M(obj2);
                        }
                        if (!((Boolean) obj2).booleanValue()) {
                            ia8Var.u = null;
                            ia8Var.v = i6;
                            ia8Var.s = 2;
                            break;
                        } else {
                            throw new f0(this);
                        }
                    }
                }
                ia8Var = new ia8(this, rq3Var);
                obj2 = ia8Var.r;
                lu3 lu3Var2 = lu3.a;
                i = ia8Var.s;
                if (i != 0) {
                }
                if (!((Boolean) obj2).booleanValue()) {
                }
            case 1:
                if (rq3Var instanceof ya8) {
                    ya8Var = (ya8) rq3Var;
                    int i8 = ya8Var.s;
                    if ((i8 & Integer.MIN_VALUE) != 0) {
                        ya8Var.s = i8 - Integer.MIN_VALUE;
                        Object obj3 = ya8Var.r;
                        lu3 lu3Var3 = lu3.a;
                        i2 = ya8Var.s;
                        if (i2 != 0) {
                            y6a.M(obj3);
                            ya8Var.u = obj;
                            ya8Var.v = b98Var;
                            ya8Var.w = 0;
                            ya8Var.s = 1;
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
                            i6 = ya8Var.w;
                            b98Var = ya8Var.v;
                            obj = ya8Var.u;
                            y6a.M(obj3);
                        }
                        ya8Var.u = null;
                        ya8Var.v = null;
                        ya8Var.w = i6;
                        ya8Var.s = 2;
                        break;
                    }
                }
                ya8Var = new ya8(this, rq3Var);
                Object obj32 = ya8Var.r;
                lu3 lu3Var32 = lu3.a;
                i2 = ya8Var.s;
                if (i2 != 0) {
                }
                ya8Var.u = null;
                ya8Var.v = null;
                ya8Var.w = i6;
                ya8Var.s = 2;
            case 2:
                if (rq3Var instanceof n6e) {
                    n6eVar = (n6e) rq3Var;
                    int i9 = n6eVar.s;
                    if ((i9 & Integer.MIN_VALUE) != 0) {
                        n6eVar.s = i9 - Integer.MIN_VALUE;
                        Object obj4 = n6eVar.r;
                        lu3 lu3Var4 = lu3.a;
                        i3 = n6eVar.s;
                        if (i3 != 0) {
                            y6a.M(obj4);
                            n6eVar.t = b98Var;
                            n6eVar.s = 1;
                            obj4 = ((e4e) obj).a(function2, n6eVar);
                            break;
                        } else {
                            if (i3 != 1) {
                                if (i3 == 2) {
                                    y6a.M(obj4);
                                    return Unit.a;
                                }
                                a70.r("call to 'resume' before 'invoke' with coroutine");
                                return null;
                            }
                            b98Var = n6eVar.t;
                            y6a.M(obj4);
                        }
                        n6eVar.t = null;
                        n6eVar.s = 2;
                        break;
                    }
                }
                n6eVar = new n6e(this, rq3Var);
                Object obj42 = n6eVar.r;
                lu3 lu3Var42 = lu3.a;
                i3 = n6eVar.s;
                if (i3 != 0) {
                }
                n6eVar.t = null;
                n6eVar.s = 2;
            default:
                if (rq3Var instanceof o6e) {
                    o6eVar = (o6e) rq3Var;
                    int i10 = o6eVar.s;
                    if ((i10 & Integer.MIN_VALUE) != 0) {
                        o6eVar.s = i10 - Integer.MIN_VALUE;
                        Object obj5 = o6eVar.r;
                        lu3 lu3Var5 = lu3.a;
                        i4 = o6eVar.s;
                        if (i4 != 0) {
                            y6a.M(obj5);
                            o6eVar.t = b98Var;
                            o6eVar.s = 1;
                            obj5 = ((e4e) obj).b(function2, o6eVar);
                            break;
                        } else {
                            if (i4 != 1) {
                                if (i4 == 2) {
                                    y6a.M(obj5);
                                    return Unit.a;
                                }
                                a70.r("call to 'resume' before 'invoke' with coroutine");
                                return null;
                            }
                            b98Var = o6eVar.t;
                            y6a.M(obj5);
                        }
                        o6eVar.t = null;
                        o6eVar.s = 2;
                        break;
                    }
                }
                o6eVar = new o6e(this, rq3Var);
                Object obj52 = o6eVar.r;
                lu3 lu3Var52 = lu3.a;
                i4 = o6eVar.s;
                if (i4 != 0) {
                }
                o6eVar.t = null;
                o6eVar.s = 2;
        }
    }

    public /* synthetic */ ja8(b98 b98Var, Function2 function2, int i) {
        this.a = i;
        this.b = b98Var;
        this.c = function2;
    }
}
