package defpackage;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes7.dex */
public final class xhk extends yck {
    public final k3e e;

    public xhk(k3e k3eVar) {
        super(lnd.a, k3eVar == k3e.b ? 2 : 1, k3eVar == k3e.c ? 2 : null);
        this.e = k3eVar;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof xhk) {
            return this.e == ((xhk) obj).e;
        }
        return false;
    }

    public final int hashCode() {
        return this.e.hashCode();
    }
}
