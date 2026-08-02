package h9;

import F3.G;

/* loaded from: classes9.dex */
public class s {

    /* renamed from: a, reason: collision with root package name */
    private final float f65125a;

    /* renamed from: b, reason: collision with root package name */
    private final float f65126b;

    public s(float f7, float f11) {
        this.f65125a = f7;
        this.f65126b = f11;
    }

    public static float a(s sVar, s sVar2) {
        return Ql0.h.b(sVar.f65125a, sVar.f65126b, sVar2.f65125a, sVar2.f65126b);
    }

    public static void d(s[] sVarArr) {
        s sVar;
        s sVar2;
        s sVar3;
        float a11 = a(sVarArr[0], sVarArr[1]);
        float a12 = a(sVarArr[1], sVarArr[2]);
        float a13 = a(sVarArr[0], sVarArr[2]);
        if (a12 >= a11 && a12 >= a13) {
            sVar = sVarArr[0];
            sVar2 = sVarArr[1];
            sVar3 = sVarArr[2];
        } else if (a13 < a12 || a13 < a11) {
            sVar = sVarArr[2];
            sVar2 = sVarArr[0];
            sVar3 = sVarArr[1];
        } else {
            sVar = sVarArr[1];
            sVar2 = sVarArr[0];
            sVar3 = sVarArr[2];
        }
        float f7 = sVar.f65125a;
        float f11 = sVar3.f65125a - f7;
        float f12 = sVar2.f65126b;
        float f13 = sVar.f65126b;
        if (((f12 - f13) * f11) - ((sVar2.f65125a - f7) * (sVar3.f65126b - f13)) < 0.0f) {
            s sVar4 = sVar3;
            sVar3 = sVar2;
            sVar2 = sVar4;
        }
        sVarArr[0] = sVar2;
        sVarArr[1] = sVar;
        sVarArr[2] = sVar3;
    }

    public final float b() {
        return this.f65125a;
    }

    public final float c() {
        return this.f65126b;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof s) {
            s sVar = (s) obj;
            if (this.f65125a == sVar.f65125a && this.f65126b == sVar.f65126b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Float.floatToIntBits(this.f65126b) + (Float.floatToIntBits(this.f65125a) * 31);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("(");
        sb2.append(this.f65125a);
        sb2.append(',');
        return G.a(sb2, this.f65126b, ')');
    }
}
