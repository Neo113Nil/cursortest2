package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class zm6 {
    public final float a;
    public final j38 b;

    public zm6(float f, j38 j38Var) {
        this.a = f;
        this.b = j38Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zm6)) {
            return false;
        }
        zm6 zm6Var = (zm6) obj;
        return Float.compare(this.a, zm6Var.a) == 0 && Intrinsics.c(this.b, zm6Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (Float.hashCode(this.a) * 31);
    }

    public final String toString() {
        return "Fade(alpha=" + this.a + ", animationSpec=" + this.b + ')';
    }
}
