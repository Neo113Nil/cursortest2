package defpackage;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class qvi implements vvi {
    public final int a;
    public final boolean b;

    public qvi(int i, boolean z) {
        this.a = i;
        this.b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qvi)) {
            return false;
        }
        qvi qviVar = (qvi) obj;
        return this.a == qviVar.a && this.b == qviVar.b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b) + (Integer.hashCode(this.a) * 31);
    }

    public final String toString() {
        return "Day(dayOfMonth=" + this.a + ", isToday=" + this.b + ")";
    }
}
