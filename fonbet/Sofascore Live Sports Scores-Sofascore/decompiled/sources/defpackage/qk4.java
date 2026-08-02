package defpackage;

import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@r5h(with = dhj.class)
/* loaded from: classes7.dex */
public final class qk4 extends rk4 {

    @NotNull
    public static final pk4 Companion = new pk4();
    public final long b;
    public final String c;
    public final long d;

    public qk4(long j) {
        this.b = j;
        if (j <= 0) {
            ogj.h(vxd.m("Unit duration must be positive, but was ", j, " ns."));
            throw null;
        }
        if (j % 3600000000000L == 0) {
            this.c = "HOUR";
            this.d = j / 3600000000000L;
            return;
        }
        if (j % 60000000000L == 0) {
            this.c = "MINUTE";
            this.d = j / 60000000000L;
            return;
        }
        if (j % 1000000000 == 0) {
            this.c = "SECOND";
            this.d = j / 1000000000;
        } else if (j % 1000000 == 0) {
            this.c = "MILLISECOND";
            this.d = j / 1000000;
        } else if (j % 1000 == 0) {
            this.c = "MICROSECOND";
            this.d = j / 1000;
        } else {
            this.c = "NANOSECOND";
            this.d = j;
        }
    }

    public final qk4 b(int i) {
        return new qk4(Math.multiplyExact(this.b, i));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof qk4) {
            return this.b == ((qk4) obj).b;
        }
        return false;
    }

    public final int hashCode() {
        long j = this.b;
        return ((int) j) ^ ((int) (j >> 32));
    }

    public final String toString() {
        String str = this.c;
        str.getClass();
        long j = this.d;
        if (j == 1) {
            return str;
        }
        return j + '-' + str;
    }
}
