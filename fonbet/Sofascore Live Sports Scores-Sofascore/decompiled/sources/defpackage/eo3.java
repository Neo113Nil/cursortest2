package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class eo3 {
    public final foa a;
    public final int b;
    public final eo c;
    public final go d;

    public /* synthetic */ eo3(foa foaVar, int i, eo eoVar, go goVar, int i2) {
        this(foaVar, i, (i2 & 4) != 0 ? null : eoVar, (i2 & 8) != 0 ? null : goVar);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof eo3)) {
            return false;
        }
        eo3 eo3Var = (eo3) obj;
        return this.a == eo3Var.a && this.b == eo3Var.b && Intrinsics.c(this.c, eo3Var.c) && Intrinsics.c(this.d, eo3Var.d);
    }

    public final int hashCode() {
        int a = wv8.a(this.b, this.a.hashCode() * 31, 31);
        eo eoVar = this.c;
        int hashCode = (a + (eoVar == null ? 0 : Integer.hashCode(eoVar.a))) * 31;
        go goVar = this.d;
        return hashCode + (goVar != null ? Integer.hashCode(goVar.a) : 0);
    }

    public final String toString() {
        return "ContainerSelector(type=" + this.a + ", numChildren=" + this.b + ", horizontalAlignment=" + this.c + ", verticalAlignment=" + this.d + ')';
    }

    public eo3(foa foaVar, int i, eo eoVar, go goVar) {
        this.a = foaVar;
        this.b = i;
        this.c = eoVar;
        this.d = goVar;
    }
}
