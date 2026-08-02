package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class g0i implements j38 {
    public final float a;
    public final float b;
    public final Object c;

    public /* synthetic */ g0i(Object obj, int i) {
        this(1.0f, 1500.0f, (i & 4) != 0 ? null : obj);
    }

    @Override // defpackage.c80
    public final nmk a(q4k q4kVar) {
        Object obj = this.c;
        j80 j80Var = obj == null ? null : (j80) q4kVar.a.invoke(obj);
        int[] iArr = omk.a;
        float f = this.a;
        float f2 = this.b;
        k80 d4aVar = j80Var != null ? new d4a(j80Var, f, f2) : new e3c(f, f2);
        cqa cqaVar = new cqa();
        cqaVar.a = new ujg(d4aVar);
        return cqaVar;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof g0i) {
            g0i g0iVar = (g0i) obj;
            if (g0iVar.a == this.a && g0iVar.b == this.b && Intrinsics.c(g0iVar.c, this.c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        Object obj = this.c;
        return Float.hashCode(this.b) + fc6.a(this.a, (obj != null ? obj.hashCode() : 0) * 31, 31);
    }

    public g0i(float f, float f2, Object obj) {
        this.a = f;
        this.b = f2;
        this.c = obj;
    }
}
