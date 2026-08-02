package defpackage;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final class bw7 implements pw7 {
    public final int a;

    public bw7(int i) {
        this.a = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof bw7) && this.a == ((bw7) obj).a;
    }

    public final int hashCode() {
        return Boolean.hashCode(false) + (Integer.hashCode(this.a) * 31);
    }

    public final String toString() {
        return lnb.k(this.a, "OpenEventLineupsAction(eventId=", ", isGroupCard=false)");
    }
}
