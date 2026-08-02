package ig;

import java.io.IOException;
import java.io.InvalidObjectException;
import java.io.ObjectOutput;
import java.io.ObjectStreamException;
import java.io.Serializable;
import java.math.BigInteger;
import java.util.regex.Pattern;

/* loaded from: classes10.dex */
public final class d implements Comparable<d>, Serializable {

    /* renamed from: c, reason: collision with root package name */
    public static final d f66402c = new d(0, 0);

    /* renamed from: a, reason: collision with root package name */
    private final long f66403a;

    /* renamed from: b, reason: collision with root package name */
    private final int f66404b;

    static {
        BigInteger.valueOf(1000000000L);
        Pattern.compile("([-+]?)P(?:([-+]?[0-9]+)D)?(T(?:([-+]?[0-9]+)H)?(?:([-+]?[0-9]+)M)?(?:([-+]?[0-9]+)(?:[.,]([0-9]{0,9}))?S)?)?", 2);
    }

    private d(long j11, int i11) {
        this.f66403a = j11;
        this.f66404b = i11;
    }

    private static d a(int i11, long j11) {
        return (((long) i11) | j11) == 0 ? f66402c : new d(j11, i11);
    }

    public static d d(long j11) {
        long j12 = j11 / 1000000000;
        int i11 = (int) (j11 % 1000000000);
        if (i11 < 0) {
            i11 += 1000000000;
            j12--;
        }
        return a(i11, j12);
    }

    public static d e(long j11) {
        return a(0, j11);
    }

    public static d f(long j11, long j12) {
        return a(lg.c.d(1000000000, j12), lg.c.g(j11, lg.c.b(j12, 1000000000L)));
    }

    private Object readResolve() throws ObjectStreamException {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    private Object writeReplace() {
        return new m((byte) 1, this);
    }

    public final long b() {
        return this.f66403a;
    }

    @Override // java.lang.Comparable
    public final int compareTo(d dVar) {
        d dVar2 = dVar;
        int a11 = lg.c.a(this.f66403a, dVar2.f66403a);
        return a11 != 0 ? a11 : this.f66404b - dVar2.f66404b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof d) {
            d dVar = (d) obj;
            if (this.f66403a == dVar.f66403a && this.f66404b == dVar.f66404b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        long j11 = this.f66403a;
        return (this.f66404b * 51) + ((int) (j11 ^ (j11 >>> 32)));
    }

    public final String toString() {
        if (this == f66402c) {
            return "PT0S";
        }
        long j11 = this.f66403a;
        long j12 = j11 / 3600;
        int i11 = (int) ((j11 % 3600) / 60);
        int i12 = (int) (j11 % 60);
        StringBuilder sb2 = new StringBuilder(24);
        sb2.append("PT");
        if (j12 != 0) {
            sb2.append(j12);
            sb2.append('H');
        }
        if (i11 != 0) {
            sb2.append(i11);
            sb2.append('M');
        }
        int i13 = this.f66404b;
        if (i12 == 0 && i13 == 0 && sb2.length() > 2) {
            return sb2.toString();
        }
        if (i12 >= 0 || i13 <= 0) {
            sb2.append(i12);
        } else if (i12 == -1) {
            sb2.append("-0");
        } else {
            sb2.append(i12 + 1);
        }
        if (i13 > 0) {
            int length = sb2.length();
            if (i12 < 0) {
                sb2.append(2000000000 - i13);
            } else {
                sb2.append(i13 + 1000000000);
            }
            while (sb2.charAt(sb2.length() - 1) == '0') {
                sb2.setLength(sb2.length() - 1);
            }
            sb2.setCharAt(length, '.');
        }
        sb2.append('S');
        return sb2.toString();
    }

    final void writeExternal(ObjectOutput objectOutput) throws IOException {
        objectOutput.writeLong(this.f66403a);
        objectOutput.writeInt(this.f66404b);
    }
}
