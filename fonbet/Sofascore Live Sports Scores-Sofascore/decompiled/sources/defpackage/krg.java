package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class krg {
    public final float a;
    public final long b;
    public final j38 c;

    public krg(float f, long j, j38 j38Var) {
        this.a = f;
        this.b = j;
        this.c = j38Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof krg)) {
            return false;
        }
        krg krgVar = (krg) obj;
        return Float.compare(this.a, krgVar.a) == 0 && xvj.a(this.b, krgVar.b) && Intrinsics.c(this.c, krgVar.c);
    }

    public final int hashCode() {
        int hashCode = Float.hashCode(this.a) * 31;
        int i = xvj.c;
        return this.c.hashCode() + ljg.c(hashCode, 31, this.b);
    }

    public final String toString() {
        return "Scale(scale=" + this.a + ", transformOrigin=" + ((Object) xvj.b(this.b)) + ", animationSpec=" + this.c + ')';
    }
}
