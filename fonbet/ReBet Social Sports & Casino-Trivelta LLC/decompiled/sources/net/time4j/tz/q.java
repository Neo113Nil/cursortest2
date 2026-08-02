package net.time4j.tz;

import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;

/* loaded from: classes5.dex */
public final class q implements Comparable, Serializable {
    private static final long serialVersionUID = 4594838367057225304L;
    private final int dst;
    private final long posix;
    private final int previous;
    private final int total;

    public q(long j10, int i10, int i11, int i12) {
        this.posix = j10;
        this.previous = i10;
        this.total = i11;
        this.dst = i12;
        b(i10);
        b(i11);
        a(i12);
    }

    public static void a(int i10) {
        if (i10 != Integer.MAX_VALUE) {
            b(i10);
        }
    }

    public static void b(int i10) {
        if (i10 < -64800 || i10 > 64800) {
            throw new IllegalArgumentException("Offset out of range: " + i10);
        }
    }

    private void readObject(ObjectInputStream objectInputStream) {
        objectInputStream.defaultReadObject();
        try {
            b(this.previous);
            b(this.total);
            a(this.dst);
        } catch (IllegalArgumentException e10) {
            throw new InvalidObjectException(e10.getMessage());
        }
    }

    @Override // java.lang.Comparable
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public int compareTo(q qVar) {
        long j10 = this.posix - qVar.posix;
        if (j10 == 0) {
            j10 = this.previous - qVar.previous;
            if (j10 == 0) {
                j10 = this.total - qVar.total;
                if (j10 == 0) {
                    j10 = d() - qVar.d();
                    if (j10 == 0) {
                        return 0;
                    }
                }
            }
        }
        return j10 < 0 ? -1 : 1;
    }

    public int d() {
        int i10 = this.dst;
        if (i10 == Integer.MAX_VALUE) {
            return 0;
        }
        return i10;
    }

    public long e() {
        return this.posix;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof q) {
            q qVar = (q) obj;
            if (this.posix == qVar.posix && this.previous == qVar.previous && this.total == qVar.total && d() == qVar.d()) {
                return true;
            }
        }
        return false;
    }

    public int f() {
        return this.previous;
    }

    public int g() {
        return this.total - this.previous;
    }

    public int h() {
        return this.total - d();
    }

    public int hashCode() {
        long j10 = this.posix;
        return (int) (j10 ^ (j10 >>> 32));
    }

    public int i() {
        return this.total;
    }

    public boolean j() {
        return this.total > this.previous;
    }

    public boolean k() {
        return this.total < this.previous;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder(128);
        sb2.append("[POSIX=");
        sb2.append(this.posix);
        sb2.append(", previous-offset=");
        sb2.append(this.previous);
        sb2.append(", total-offset=");
        sb2.append(this.total);
        sb2.append(", dst-offset=");
        sb2.append(d());
        sb2.append(']');
        return sb2.toString();
    }
}
