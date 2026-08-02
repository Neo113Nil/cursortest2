package defpackage;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class idb extends jdb {
    public final md4 a;

    public idb(md4 md4Var) {
        this.a = md4Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || idb.class != obj.getClass()) {
            return false;
        }
        return this.a.equals(((idb) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode() + (idb.class.getName().hashCode() * 31);
    }

    public final String toString() {
        return "Success {mOutputData=" + this.a + '}';
    }
}
