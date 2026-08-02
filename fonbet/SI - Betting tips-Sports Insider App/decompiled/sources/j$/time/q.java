package j$.time;

import j$.time.temporal.ChronoUnit;
import j$.util.Objects;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.regex.Pattern;

/* loaded from: classes2.dex */
public final class q implements j$.time.temporal.o, Serializable {

    /* renamed from: d, reason: collision with root package name */
    public static final q f17497d = new q(0, 0, 0);
    private static final long serialVersionUID = -3587258372562876L;

    /* renamed from: a, reason: collision with root package name */
    public final int f17498a;

    /* renamed from: b, reason: collision with root package name */
    public final int f17499b;

    /* renamed from: c, reason: collision with root package name */
    public final int f17500c;

    static {
        Pattern.compile("([-+]?)P(?:([-+]?[0-9]+)Y)?(?:([-+]?[0-9]+)M)?(?:([-+]?[0-9]+)W)?(?:([-+]?[0-9]+)D)?", 2);
        j$.com.android.tools.r8.a.O(new Object[]{ChronoUnit.YEARS, ChronoUnit.MONTHS, ChronoUnit.DAYS});
    }

    public static q a(int i5, int i10, int i11) {
        if ((i5 | i10 | i11) == 0) {
            return f17497d;
        }
        return new q(i5, i10, i11);
    }

    public q(int i5, int i10, int i11) {
        this.f17498a = i5;
        this.f17499b = i10;
        this.f17500c = i11;
    }

    @Override // j$.time.temporal.o
    public final j$.time.temporal.l i(j$.time.temporal.l lVar) {
        Objects.requireNonNull(lVar, "temporal");
        j$.time.chrono.k kVar = (j$.time.chrono.k) lVar.z(j$.time.temporal.q.f17531b);
        if (kVar == null || j$.time.chrono.r.f17346c.equals(kVar)) {
            int i5 = this.f17499b;
            if (i5 != 0) {
                long j = (this.f17498a * 12) + i5;
                if (j != 0) {
                    lVar = lVar.d(j, ChronoUnit.MONTHS);
                }
            } else {
                int i10 = this.f17498a;
                if (i10 != 0) {
                    lVar = lVar.d(i10, ChronoUnit.YEARS);
                }
            }
            int i11 = this.f17500c;
            return i11 != 0 ? lVar.d(i11, ChronoUnit.DAYS) : lVar;
        }
        throw new b("Chronology mismatch, expected: ISO, actual: " + kVar.getId());
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof q) {
            q qVar = (q) obj;
            if (this.f17498a == qVar.f17498a && this.f17499b == qVar.f17499b && this.f17500c == qVar.f17500c) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Integer.rotateLeft(this.f17500c, 16) + Integer.rotateLeft(this.f17499b, 8) + this.f17498a;
    }

    public final String toString() {
        if (this == f17497d) {
            return "P0D";
        }
        StringBuilder sb2 = new StringBuilder("P");
        int i5 = this.f17498a;
        if (i5 != 0) {
            sb2.append(i5);
            sb2.append('Y');
        }
        int i10 = this.f17499b;
        if (i10 != 0) {
            sb2.append(i10);
            sb2.append('M');
        }
        int i11 = this.f17500c;
        if (i11 != 0) {
            sb2.append(i11);
            sb2.append('D');
        }
        return sb2.toString();
    }

    private Object writeReplace() {
        return new r((byte) 14, this);
    }

    private void readObject(ObjectInputStream objectInputStream) {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }
}
