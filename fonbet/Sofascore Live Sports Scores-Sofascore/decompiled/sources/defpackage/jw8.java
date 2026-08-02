package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class jw8 {
    public final int a;
    public final vvk b;

    public jw8(int i, vvk vvkVar) {
        vvkVar.getClass();
        this.a = i;
        this.b = vvkVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jw8)) {
            return false;
        }
        jw8 jw8Var = (jw8) obj;
        return this.a == jw8Var.a && Intrinsics.c(this.b, jw8Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (Integer.hashCode(this.a) * 31);
    }

    public final String toString() {
        return "GenerationalViewportHint(generationId=" + this.a + ", hint=" + this.b + ')';
    }
}
