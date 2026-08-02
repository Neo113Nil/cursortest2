package mg;

import ig.C7073b;
import java.io.Serializable;

/* loaded from: classes10.dex */
public final class m implements Serializable {

    /* renamed from: a, reason: collision with root package name */
    private final long f74859a;

    /* renamed from: b, reason: collision with root package name */
    private final long f74860b;

    /* renamed from: c, reason: collision with root package name */
    private final long f74861c;

    /* renamed from: d, reason: collision with root package name */
    private final long f74862d;

    private m(long j11, long j12, long j13, long j14) {
        this.f74859a = j11;
        this.f74860b = j12;
        this.f74861c = j13;
        this.f74862d = j14;
    }

    public static m h(long j11, long j12) {
        if (j11 <= j12) {
            return new m(j11, j11, j12, j12);
        }
        throw new IllegalArgumentException("Minimum value must be less than maximum value");
    }

    public static m i(long j11, long j12, long j13, long j14) {
        if (j11 > j12) {
            throw new IllegalArgumentException("Smallest minimum value must be less than largest minimum value");
        }
        if (j13 > j14) {
            throw new IllegalArgumentException("Smallest maximum value must be less than largest maximum value");
        }
        if (j12 <= j14) {
            return new m(j11, j12, j13, j14);
        }
        throw new IllegalArgumentException("Minimum value must be less than maximum value");
    }

    public final int a(long j11, h hVar) {
        if (this.f74859a >= -2147483648L && this.f74862d <= 2147483647L && g(j11)) {
            return (int) j11;
        }
        throw new C7073b("Invalid int value for " + hVar + ": " + j11);
    }

    public final void b(long j11, h hVar) {
        if (g(j11)) {
            return;
        }
        if (hVar == null) {
            throw new C7073b("Invalid value (valid values " + this + "): " + j11);
        }
        throw new C7073b("Invalid value for " + hVar + " (valid values " + this + "): " + j11);
    }

    public final long d() {
        return this.f74862d;
    }

    public final long e() {
        return this.f74859a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof m) {
            m mVar = (m) obj;
            if (this.f74859a == mVar.f74859a && this.f74860b == mVar.f74860b && this.f74861c == mVar.f74861c && this.f74862d == mVar.f74862d) {
                return true;
            }
        }
        return false;
    }

    public final boolean f() {
        return this.f74859a == this.f74860b && this.f74861c == this.f74862d;
    }

    public final boolean g(long j11) {
        return j11 >= this.f74859a && j11 <= this.f74862d;
    }

    public final int hashCode() {
        long j11 = this.f74859a;
        long j12 = this.f74860b;
        long j13 = (j11 + j12) << ((int) (j12 + 16));
        long j14 = this.f74861c;
        long j15 = (j13 >> ((int) (j14 + 48))) << ((int) (j14 + 32));
        long j16 = this.f74862d;
        long j17 = ((j15 >> ((int) (32 + j16))) << ((int) (j16 + 48))) >> 16;
        return (int) (j17 ^ (j17 >>> 32));
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder();
        long j11 = this.f74859a;
        sb2.append(j11);
        long j12 = this.f74860b;
        if (j11 != j12) {
            sb2.append('/');
            sb2.append(j12);
        }
        sb2.append(" - ");
        long j13 = this.f74861c;
        sb2.append(j13);
        long j14 = this.f74862d;
        if (j13 != j14) {
            sb2.append('/');
            sb2.append(j14);
        }
        return sb2.toString();
    }
}
