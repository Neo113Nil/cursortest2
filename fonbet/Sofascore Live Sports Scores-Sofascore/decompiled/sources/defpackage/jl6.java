package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class jl6 {
    public final vy8 a;
    public final vy8 b;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public /* synthetic */ jl6(vy8 vy8Var, int i) {
        this(r0, r3 != 0 ? r0 : vy8Var);
        int i2 = i & 2;
        ty8 ty8Var = ty8.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jl6)) {
            return false;
        }
        jl6 jl6Var = (jl6) obj;
        return Intrinsics.c(this.a, jl6Var.a) && Intrinsics.c(this.b, jl6Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "ExtractedSizeModifiers(sizeModifiers=" + this.a + ", nonSizeModifiers=" + this.b + ')';
    }

    public jl6(vy8 vy8Var, vy8 vy8Var2) {
        this.a = vy8Var;
        this.b = vy8Var2;
    }
}
