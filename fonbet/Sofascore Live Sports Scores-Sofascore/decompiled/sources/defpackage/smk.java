package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class smk {
    public final j80 a;
    public final ig5 b;

    public smk(j80 j80Var, ig5 ig5Var) {
        this.a = j80Var;
        this.b = ig5Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof smk)) {
            return false;
        }
        smk smkVar = (smk) obj;
        return Intrinsics.c(this.a, smkVar.a) && Intrinsics.c(this.b, smkVar.b);
    }

    public final int hashCode() {
        return Integer.hashCode(0) + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31);
    }

    public final String toString() {
        return "VectorizedKeyframeSpecElementInfo(vectorValue=" + this.a + ", easing=" + this.b + ", arcMode=ArcMode(value=0))";
    }
}
