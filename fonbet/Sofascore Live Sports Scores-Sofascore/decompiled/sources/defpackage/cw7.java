package defpackage;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final class cw7 implements pw7 {
    public final int a;
    public final boolean b;

    public cw7(int i, boolean z) {
        this.a = i;
        this.b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cw7)) {
            return false;
        }
        cw7 cw7Var = (cw7) obj;
        return this.a == cw7Var.a && this.b == cw7Var.b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b) + (Integer.hashCode(this.a) * 31);
    }

    public final String toString() {
        return "OpenEventStatisticAction(eventId=" + this.a + ", isGroupCard=" + this.b + ")";
    }
}
