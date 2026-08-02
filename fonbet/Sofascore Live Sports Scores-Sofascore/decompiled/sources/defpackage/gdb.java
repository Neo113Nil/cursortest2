package defpackage;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class gdb extends jdb {
    public final md4 a = md4.b;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || gdb.class != obj.getClass()) {
            return false;
        }
        return this.a.equals(((gdb) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode() + (gdb.class.getName().hashCode() * 31);
    }

    public final String toString() {
        return "Failure {mOutputData=" + this.a + '}';
    }
}
