package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final class an8 {
    public final d7e a;
    public final ay1 b;

    public an8(d7e d7eVar, ay1 ay1Var) {
        d7eVar.getClass();
        this.a = d7eVar;
        this.b = ay1Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof an8)) {
            return false;
        }
        an8 an8Var = (an8) obj;
        return Intrinsics.c(this.a, an8Var.a) && Intrinsics.c(this.b, an8Var.b);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        ay1 ay1Var = this.b;
        return hashCode + (ay1Var == null ? 0 : ay1Var.hashCode());
    }

    public final String toString() {
        return "ForwardingDrawInfo(painter=" + this.a + ", colorFilter=" + this.b + ")";
    }
}
