package defpackage;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public class k5c {
    public final long a;

    static {
        new k5c(new b78());
        nik.N(0);
        nik.N(1);
        nik.N(2);
        nik.N(3);
        nik.N(4);
        nik.N(5);
        nik.N(6);
        nik.N(7);
    }

    public k5c(b78 b78Var) {
        b78Var.getClass();
        String str = nik.a;
        this.a = b78Var.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof k5c) && this.a == ((k5c) obj).a;
    }

    public final int hashCode() {
        long j = this.a;
        return ((int) (j ^ (j >>> 32))) * 923521;
    }
}
