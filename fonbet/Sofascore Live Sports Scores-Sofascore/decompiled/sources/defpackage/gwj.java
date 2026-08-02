package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class gwj {
    public final q80 a;
    public final nnd b;

    public gwj(q80 q80Var, nnd nndVar) {
        this.a = q80Var;
        this.b = nndVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gwj)) {
            return false;
        }
        gwj gwjVar = (gwj) obj;
        return Intrinsics.c(this.a, gwjVar.a) && this.b.equals(gwjVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "TransformedText(text=" + ((Object) this.a) + ", offsetMapping=" + this.b + ')';
    }
}
