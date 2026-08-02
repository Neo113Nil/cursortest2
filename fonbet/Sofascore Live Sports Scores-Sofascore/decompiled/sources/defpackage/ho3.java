package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class ho3 {
    public final int a;
    public final long b;
    public final io3 c;
    public final yia d;

    public ho3(int i, long j, io3 io3Var, yia yiaVar) {
        this.a = i;
        this.b = j;
        this.c = io3Var;
        this.d = yiaVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ho3)) {
            return false;
        }
        ho3 ho3Var = (ho3) obj;
        return this.a == ho3Var.a && this.b == ho3Var.b && this.c == ho3Var.c && Intrinsics.c(this.d, ho3Var.d);
    }

    public final int hashCode() {
        int hashCode = (this.c.hashCode() + ljg.c(Integer.hashCode(this.a) * 31, 31, this.b)) * 31;
        yia yiaVar = this.d;
        return hashCode + (yiaVar == null ? 0 : yiaVar.hashCode());
    }

    public final String toString() {
        return "ContentCaptureEvent(id=" + this.a + ", timestamp=" + this.b + ", type=" + this.c + ", structureCompat=" + this.d + ')';
    }
}
