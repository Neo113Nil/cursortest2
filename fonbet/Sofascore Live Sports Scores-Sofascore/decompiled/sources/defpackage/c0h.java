package defpackage;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public final class c0h {
    public static final c0h c;
    public final long a;
    public final long b;

    static {
        c0h c0hVar = new c0h(0L, 0L);
        new c0h(Long.MAX_VALUE, Long.MAX_VALUE);
        new c0h(Long.MAX_VALUE, 0L);
        new c0h(0L, Long.MAX_VALUE);
        c = c0hVar;
    }

    public c0h(long j, long j2) {
        qx9.r(j >= 0);
        qx9.r(j2 >= 0);
        this.a = j;
        this.b = j2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && c0h.class == obj.getClass()) {
            c0h c0hVar = (c0h) obj;
            if (this.a == c0hVar.a && this.b == c0hVar.b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (((int) this.a) * 31) + ((int) this.b);
    }
}
