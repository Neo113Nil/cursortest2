package defpackage;

import kotlin.Unit;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class ef9 {
    public int a;
    public float b;
    public final Object c;

    public ef9(ydj ydjVar) {
        this.c = ydjVar;
        this.a = -1;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0028  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public float a(boolean z, boolean z2, boolean z3, int i) {
        boolean z4;
        int i2;
        ydj ydjVar = (ydj) this.c;
        int i3 = 1;
        if (z) {
            int p = f6a.p(ydjVar.f, i, z);
            int lineStart = ydjVar.f.getLineStart(p);
            int f = ydjVar.f(p);
            if (i == lineStart || i == f) {
                z4 = true;
                int i4 = i * 4;
                if (z3) {
                    i3 = z4 ? 2 : 3;
                } else if (z4) {
                    i3 = 0;
                }
                i2 = i4 + i3;
                if (this.a != i2) {
                    return this.b;
                }
                float i5 = z3 ? ydjVar.i(i, z) : ydjVar.j(i, z);
                if (z2) {
                    this.a = i2;
                    this.b = i5;
                }
                return i5;
            }
        }
        z4 = false;
        int i42 = i * 4;
        if (z3) {
        }
        i2 = i42 + i3;
        if (this.a != i2) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object b(float f, sq3 sq3Var) {
        owf owfVar;
        int i;
        if (sq3Var instanceof owf) {
            owfVar = (owf) sq3Var;
            int i2 = owfVar.t;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                owfVar.t = i2 - Integer.MIN_VALUE;
                Object obj = owfVar.r;
                lu3 lu3Var = lu3.a;
                i = owfVar.t;
                if (i != 0) {
                    y6a.M(obj);
                    we3 we3Var = (we3) this.c;
                    Float f2 = new Float(f);
                    owfVar.t = 1;
                    obj = we3Var.invoke(f2, owfVar);
                    if (obj == lu3Var) {
                        return lu3Var;
                    }
                } else {
                    if (i != 1) {
                        a70.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    y6a.M(obj);
                }
                this.b += ((Number) obj).floatValue();
                return Unit.a;
            }
        }
        owfVar = new owf(this, sq3Var);
        Object obj2 = owfVar.r;
        lu3 lu3Var2 = lu3.a;
        i = owfVar.t;
        if (i != 0) {
        }
        this.b += ((Number) obj2).floatValue();
        return Unit.a;
    }

    public ef9(int i, we3 we3Var) {
        this.a = i;
        this.c = we3Var;
    }
}
