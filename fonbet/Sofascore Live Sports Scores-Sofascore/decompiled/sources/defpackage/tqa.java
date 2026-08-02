package defpackage;

import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class tqa {
    public final mpg a;
    public final v30 b;
    public final x0d c;

    public tqa(mpg mpgVar, v30 v30Var) {
        this.a = mpgVar;
        this.b = v30Var;
        long[] jArr = qrg.a;
        this.c = new x0d();
    }

    public final Function2 a(int i, Object obj, Object obj2) {
        x0d x0dVar = this.c;
        sqa sqaVar = (sqa) x0dVar.g(obj);
        int i2 = 8;
        if (sqaVar != null && sqaVar.c == i && Intrinsics.c(sqaVar.b, obj2)) {
            tc3 tc3Var = sqaVar.d;
            if (tc3Var != null) {
                return tc3Var;
            }
            tc3 tc3Var2 = new tc3(818252804, new op9(i2, sqaVar.e, sqaVar), true);
            sqaVar.d = tc3Var2;
            return tc3Var2;
        }
        sqa sqaVar2 = new sqa(this, i, obj, obj2);
        x0dVar.m(obj, sqaVar2);
        tc3 tc3Var3 = sqaVar2.d;
        if (tc3Var3 != null) {
            return tc3Var3;
        }
        tc3 tc3Var4 = new tc3(818252804, new op9(i2, this, sqaVar2), true);
        sqaVar2.d = tc3Var4;
        return tc3Var4;
    }

    public final Object b(Object obj) {
        if (obj == null) {
            return null;
        }
        sqa sqaVar = (sqa) this.c.g(obj);
        if (sqaVar != null) {
            return sqaVar.b;
        }
        uqa uqaVar = (uqa) this.b.invoke();
        int c = uqaVar.c(obj);
        if (c != -1) {
            return uqaVar.b(c);
        }
        return null;
    }
}
