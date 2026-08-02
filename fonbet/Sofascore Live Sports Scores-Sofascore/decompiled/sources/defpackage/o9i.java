package defpackage;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class o9i implements r9i {
    public final ip a;

    public o9i(ip ipVar) {
        ipVar.getClass();
        this.a = ipVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof o9i) && this.a == ((o9i) obj).a;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "AmFootball(type=" + this.a + ")";
    }
}
