package defpackage;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import kotlin.Unit;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes7.dex */
public final class lw0 {
    public static final /* synthetic */ AtomicIntegerFieldUpdater b = AtomicIntegerFieldUpdater.newUpdater(lw0.class, "notCompletedCount$volatile");
    public final zu4[] a;
    private volatile /* synthetic */ int notCompletedCount$volatile;

    public lw0(zu4[] zu4VarArr) {
        this.a = zu4VarArr;
        this.notCompletedCount$volatile = zu4VarArr.length;
    }

    public final Object a(rq3 rq3Var) {
        lj2 lj2Var = new lj2(1, z9a.b(rq3Var));
        lj2Var.t();
        yda[] ydaVarArr = this.a;
        int length = ydaVarArr.length;
        jw0[] jw0VarArr = new jw0[length];
        for (int i = 0; i < length; i++) {
            yda ydaVar = ydaVarArr[i];
            ((kea) ydaVar).start();
            jw0 jw0Var = new jw0(this, lj2Var);
            jw0Var.f = bea.A(ydaVar, true, jw0Var);
            Unit unit = Unit.a;
            jw0VarArr[i] = jw0Var;
        }
        kw0 kw0Var = new kw0(jw0VarArr);
        for (int i2 = 0; i2 < length; i2++) {
            jw0 jw0Var2 = jw0VarArr[i2];
            jw0Var2.getClass();
            rh0.a.putObjectVolatile(jw0Var2, jw0.h, kw0Var);
        }
        if (lj2Var.x()) {
            kw0Var.b();
        } else {
            lj2Var.w(kw0Var);
        }
        Object q = lj2Var.q();
        lu3 lu3Var = lu3.a;
        return q;
    }
}
