package j$.time.temporal;

import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;

/* loaded from: classes2.dex */
public final class s implements Serializable {
    private static final long serialVersionUID = -7317881728594519368L;

    /* renamed from: a, reason: collision with root package name */
    public final long f17537a;

    /* renamed from: b, reason: collision with root package name */
    public final long f17538b;

    /* renamed from: c, reason: collision with root package name */
    public final long f17539c;

    /* renamed from: d, reason: collision with root package name */
    public final long f17540d;

    public static s f(long j, long j6) {
        if (j > j6) {
            throw new IllegalArgumentException("Minimum value must be less than maximum value");
        }
        return new s(j, j, j6, j6);
    }

    public static s g(long j, long j6, long j10) {
        if (j > 1) {
            throw new IllegalArgumentException("Smallest minimum value must be less than largest minimum value");
        }
        if (j6 > j10) {
            throw new IllegalArgumentException("Smallest maximum value must be less than largest maximum value");
        }
        if (1 > j10) {
            throw new IllegalArgumentException("Minimum value must be less than maximum value");
        }
        return new s(j, 1L, j6, j10);
    }

    public s(long j, long j6, long j10, long j11) {
        this.f17537a = j;
        this.f17538b = j6;
        this.f17539c = j10;
        this.f17540d = j11;
    }

    public final boolean d() {
        return this.f17537a >= -2147483648L && this.f17540d <= 2147483647L;
    }

    public final boolean e(long j) {
        return j >= this.f17537a && j <= this.f17540d;
    }

    public final int a(long j, p pVar) {
        if (d() && e(j)) {
            return (int) j;
        }
        throw new j$.time.b(c(j, pVar));
    }

    public final void b(long j, p pVar) {
        if (!e(j)) {
            throw new j$.time.b(c(j, pVar));
        }
    }

    public final String c(long j, p pVar) {
        if (pVar != null) {
            return "Invalid value for " + pVar + " (valid values " + this + "): " + j;
        }
        return "Invalid value (valid values " + this + "): " + j;
    }

    private void readObject(ObjectInputStream objectInputStream) {
        objectInputStream.defaultReadObject();
        long j = this.f17537a;
        long j6 = this.f17538b;
        if (j > j6) {
            throw new InvalidObjectException("Smallest minimum value must be less than largest minimum value");
        }
        long j10 = this.f17539c;
        long j11 = this.f17540d;
        if (j10 > j11) {
            throw new InvalidObjectException("Smallest maximum value must be less than largest maximum value");
        }
        if (j6 > j11) {
            throw new InvalidObjectException("Minimum value must be less than maximum value");
        }
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof s) {
            s sVar = (s) obj;
            if (this.f17537a == sVar.f17537a && this.f17538b == sVar.f17538b && this.f17539c == sVar.f17539c && this.f17540d == sVar.f17540d) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        long j = this.f17537a;
        long j6 = this.f17538b;
        long j10 = j + (j6 << 16) + (j6 >> 48);
        long j11 = this.f17539c;
        long j12 = j10 + (j11 << 32) + (j11 >> 32);
        long j13 = this.f17540d;
        long j14 = j12 + (j13 << 48) + (j13 >> 16);
        return (int) (j14 ^ (j14 >>> 32));
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(this.f17537a);
        if (this.f17537a != this.f17538b) {
            sb2.append('/');
            sb2.append(this.f17538b);
        }
        sb2.append(" - ");
        sb2.append(this.f17539c);
        if (this.f17539c != this.f17540d) {
            sb2.append('/');
            sb2.append(this.f17540d);
        }
        return sb2.toString();
    }
}
