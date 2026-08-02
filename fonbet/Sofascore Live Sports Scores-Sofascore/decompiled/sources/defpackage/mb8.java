package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class mb8 implements b98 {
    public final /* synthetic */ b98 a;
    public final /* synthetic */ k6g b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ Function1 d;

    public mb8(b98 b98Var, k6g k6gVar, boolean z, Function1 function1) {
        this.a = b98Var;
        this.b = k6gVar;
        this.c = z;
        this.d = function1;
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0058, code lost:
    
        if (r6.emit(r8, r0) != r1) goto L23;
     */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    @Override // defpackage.b98
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object emit(Object obj, rq3 rq3Var) {
        lb8 lb8Var;
        int i;
        b98 b98Var;
        if (rq3Var instanceof lb8) {
            lb8Var = (lb8) rq3Var;
            int i2 = lb8Var.s;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                lb8Var.s = i2 - Integer.MIN_VALUE;
                Object obj2 = lb8Var.r;
                lu3 lu3Var = lu3.a;
                i = lb8Var.s;
                if (i != 0) {
                    y6a.M(obj2);
                    b98 b98Var2 = this.a;
                    lb8Var.t = b98Var2;
                    lb8Var.s = 1;
                    obj2 = gz8.U(lb8Var, this.b, true, this.c, this.d);
                    if (obj2 != lu3Var) {
                        b98Var = b98Var2;
                    }
                    return lu3Var;
                }
                if (i != 1) {
                    if (i == 2) {
                        y6a.M(obj2);
                        return Unit.a;
                    }
                    a70.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                b98Var = lb8Var.t;
                y6a.M(obj2);
                lb8Var.t = null;
                lb8Var.s = 2;
            }
        }
        lb8Var = new lb8(this, rq3Var);
        Object obj22 = lb8Var.r;
        lu3 lu3Var2 = lu3.a;
        i = lb8Var.s;
        if (i != 0) {
        }
        lb8Var.t = null;
        lb8Var.s = 2;
    }
}
