package j$.time.chrono;

import j$.time.temporal.ChronoUnit;
import j$.util.Objects;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;

/* loaded from: classes2.dex */
public final class g implements j$.time.temporal.o, Serializable {

    /* renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ int f17317e = 0;
    private static final long serialVersionUID = 57387258289L;

    /* renamed from: a, reason: collision with root package name */
    public final k f17318a;

    /* renamed from: b, reason: collision with root package name */
    public final int f17319b;

    /* renamed from: c, reason: collision with root package name */
    public final int f17320c;

    /* renamed from: d, reason: collision with root package name */
    public final int f17321d;

    static {
        j$.com.android.tools.r8.a.O(new Object[]{ChronoUnit.YEARS, ChronoUnit.MONTHS, ChronoUnit.DAYS});
    }

    public g(k kVar, int i5, int i10, int i11) {
        Objects.requireNonNull(kVar, "chrono");
        this.f17318a = kVar;
        this.f17319b = i5;
        this.f17320c = i10;
        this.f17321d = i11;
    }

    public final String toString() {
        if (this.f17319b == 0 && this.f17320c == 0 && this.f17321d == 0) {
            return this.f17318a.toString() + " P0D";
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append(this.f17318a.toString());
        sb2.append(" P");
        int i5 = this.f17319b;
        if (i5 != 0) {
            sb2.append(i5);
            sb2.append('Y');
        }
        int i10 = this.f17320c;
        if (i10 != 0) {
            sb2.append(i10);
            sb2.append('M');
        }
        int i11 = this.f17321d;
        if (i11 != 0) {
            sb2.append(i11);
            sb2.append('D');
        }
        return sb2.toString();
    }

    @Override // j$.time.temporal.o
    public final j$.time.temporal.l i(j$.time.temporal.l lVar) {
        Objects.requireNonNull(lVar, "temporal");
        k kVar = (k) lVar.z(j$.time.temporal.q.f17531b);
        if (kVar == null || this.f17318a.equals(kVar)) {
            if (this.f17320c != 0) {
                j$.time.temporal.s q = this.f17318a.q(j$.time.temporal.a.MONTH_OF_YEAR);
                long j = (q.f17537a == q.f17538b && q.f17539c == q.f17540d && q.d()) ? (q.f17540d - q.f17537a) + 1 : -1L;
                if (j > 0) {
                    lVar = lVar.d((this.f17319b * j) + this.f17320c, ChronoUnit.MONTHS);
                } else {
                    int i5 = this.f17319b;
                    if (i5 != 0) {
                        lVar = lVar.d(i5, ChronoUnit.YEARS);
                    }
                    lVar = lVar.d(this.f17320c, ChronoUnit.MONTHS);
                }
            } else {
                int i10 = this.f17319b;
                if (i10 != 0) {
                    lVar = lVar.d(i10, ChronoUnit.YEARS);
                }
            }
            int i11 = this.f17321d;
            return i11 != 0 ? lVar.d(i11, ChronoUnit.DAYS) : lVar;
        }
        throw new j$.time.b("Chronology mismatch, expected: " + this.f17318a.getId() + ", actual: " + kVar.getId());
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof g) {
            g gVar = (g) obj;
            if (this.f17319b == gVar.f17319b && this.f17320c == gVar.f17320c && this.f17321d == gVar.f17321d && this.f17318a.equals(gVar.f17318a)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (Integer.rotateLeft(this.f17321d, 16) + (Integer.rotateLeft(this.f17320c, 8) + this.f17319b)) ^ this.f17318a.hashCode();
    }

    public Object writeReplace() {
        return new d0((byte) 9, this);
    }

    private void readObject(ObjectInputStream objectInputStream) {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }
}
