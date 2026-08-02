package defpackage;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class udb {
    public final Object a;
    public h78 b = new h78(1);
    public boolean c;
    public boolean d;

    public udb(Object obj) {
        this.a = obj;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || udb.class != obj.getClass()) {
            return false;
        }
        return this.a.equals(((udb) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
