package defpackage;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class wij {
    public final int a;
    public final vij b;

    public wij(int i, vij vijVar) {
        this.a = i;
        this.b = vijVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wij)) {
            return false;
        }
        wij wijVar = (wij) obj;
        return this.a == wijVar.a && this.b == wijVar.b;
    }

    public final int hashCode() {
        return this.b.hashCode() + (Integer.hashCode(this.a) * 31);
    }

    public final String toString() {
        return "TimerComponentHolder(value=" + this.a + ", component=" + this.b + ")";
    }
}
