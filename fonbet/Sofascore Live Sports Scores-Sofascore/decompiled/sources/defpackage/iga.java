package defpackage;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class iga extends pfa {
    public final nbb a;

    public iga() {
        se7 se7Var = nbb.i;
        this.a = new nbb(false);
    }

    public final boolean equals(Object obj) {
        if (obj != this) {
            return (obj instanceof iga) && ((iga) obj).a.equals(this.a);
        }
        return true;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
