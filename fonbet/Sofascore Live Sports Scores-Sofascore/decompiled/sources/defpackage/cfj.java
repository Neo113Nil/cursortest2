package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class cfj {
    public final e23 a;
    public final lfj b;
    public final vg8 c;
    public final o7j d;

    public cfj(e23 e23Var, lfj lfjVar, vg8 vg8Var, o7j o7jVar) {
        this.a = e23Var;
        this.b = lfjVar;
        this.c = vg8Var;
        this.d = o7jVar;
    }

    public static cfj a(cfj cfjVar, o7j o7jVar) {
        return new cfj(cfjVar.a, cfjVar.b, cfjVar.c, o7jVar);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cfj)) {
            return false;
        }
        cfj cfjVar = (cfj) obj;
        return Intrinsics.c(this.a, cfjVar.a) && Intrinsics.c(this.b, cfjVar.b) && Intrinsics.c(this.c, cfjVar.c) && Intrinsics.c(this.d, cfjVar.d);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        lfj lfjVar = this.b;
        int hashCode2 = (hashCode + (lfjVar != null ? Long.hashCode(lfjVar.a) : 0)) * 31;
        vg8 vg8Var = this.c;
        int hashCode3 = (hashCode2 + (vg8Var != null ? Integer.hashCode(vg8Var.a) : 0)) * 29791;
        o7j o7jVar = this.d;
        return (hashCode3 + (o7jVar != null ? Integer.hashCode(o7jVar.a) : 0)) * 31;
    }

    public final String toString() {
        return "TextStyle(color=" + this.a + ", fontSize=" + this.b + ", fontWeight=" + this.c + ", fontStyle=null, textDecoration=null, textAlign=" + this.d + ", fontFamily=null)";
    }
}
