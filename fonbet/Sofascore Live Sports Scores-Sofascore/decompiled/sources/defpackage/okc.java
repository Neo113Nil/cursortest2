package defpackage;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes7.dex */
public final class okc extends yck {
    public final k3e e;

    public okc(k3e k3eVar) {
        super(lhj.b, k3eVar == k3e.b ? 2 : 1, k3eVar == k3e.c ? 2 : null);
        this.e = k3eVar;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof okc) {
            return this.e == ((okc) obj).e;
        }
        return false;
    }

    public final int hashCode() {
        return this.e.hashCode();
    }
}
