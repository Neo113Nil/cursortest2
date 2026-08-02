package j$.time.zone;

import j$.time.ZoneOffset;
import j$.time.j;
import j$.time.l;
import j$.util.Objects;
import java.io.DataInput;
import java.io.DataOutput;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;

/* loaded from: classes2.dex */
public final class e implements Serializable {
    private static final long serialVersionUID = 6889046316657758795L;

    /* renamed from: a, reason: collision with root package name */
    public final l f17577a;

    /* renamed from: b, reason: collision with root package name */
    public final byte f17578b;

    /* renamed from: c, reason: collision with root package name */
    public final j$.time.d f17579c;

    /* renamed from: d, reason: collision with root package name */
    public final j f17580d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f17581e;

    /* renamed from: f, reason: collision with root package name */
    public final d f17582f;

    /* renamed from: g, reason: collision with root package name */
    public final ZoneOffset f17583g;

    /* renamed from: h, reason: collision with root package name */
    public final ZoneOffset f17584h;

    /* renamed from: i, reason: collision with root package name */
    public final ZoneOffset f17585i;

    public e(l lVar, int i5, j$.time.d dVar, j jVar, boolean z5, d dVar2, ZoneOffset zoneOffset, ZoneOffset zoneOffset2, ZoneOffset zoneOffset3) {
        this.f17577a = lVar;
        this.f17578b = (byte) i5;
        this.f17579c = dVar;
        this.f17580d = jVar;
        this.f17581e = z5;
        this.f17582f = dVar2;
        this.f17583g = zoneOffset;
        this.f17584h = zoneOffset2;
        this.f17585i = zoneOffset3;
    }

    private void readObject(ObjectInputStream objectInputStream) {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    private Object writeReplace() {
        return new a((byte) 3, this);
    }

    public final void b(DataOutput dataOutput) {
        int c02 = this.f17581e ? 86400 : this.f17580d.c0();
        int i5 = this.f17583g.f17297b;
        int i10 = this.f17584h.f17297b - i5;
        int i11 = this.f17585i.f17297b - i5;
        byte b10 = c02 % 3600 == 0 ? this.f17581e ? (byte) 24 : this.f17580d.f17482a : (byte) 31;
        int i12 = i5 % 900 == 0 ? (i5 / 900) + 128 : 255;
        int i13 = (i10 == 0 || i10 == 1800 || i10 == 3600) ? i10 / 1800 : 3;
        int i14 = (i11 == 0 || i11 == 1800 || i11 == 3600) ? i11 / 1800 : 3;
        j$.time.d dVar = this.f17579c;
        dataOutput.writeInt((this.f17577a.getValue() << 28) + ((this.f17578b + 32) << 22) + ((dVar == null ? 0 : dVar.getValue()) << 19) + (b10 << 14) + (this.f17582f.ordinal() << 12) + (i12 << 4) + (i13 << 2) + i14);
        if (b10 == 31) {
            dataOutput.writeInt(c02);
        }
        if (i12 == 255) {
            dataOutput.writeInt(i5);
        }
        if (i13 == 3) {
            dataOutput.writeInt(this.f17584h.f17297b);
        }
        if (i14 == 3) {
            dataOutput.writeInt(this.f17585i.f17297b);
        }
    }

    public static e a(DataInput dataInput) {
        d dVar;
        j jVar;
        int i5;
        int i10;
        int readInt = dataInput.readInt();
        l S = l.S(readInt >>> 28);
        int i11 = ((264241152 & readInt) >>> 22) - 32;
        int i12 = (3670016 & readInt) >>> 19;
        j$.time.d P = i12 == 0 ? null : j$.time.d.P(i12);
        int i13 = (507904 & readInt) >>> 14;
        d dVar2 = d.values()[(readInt & 12288) >>> 12];
        int i14 = (readInt & 4080) >>> 4;
        int i15 = (readInt & 12) >>> 2;
        int i16 = readInt & 3;
        if (i13 == 31) {
            long readInt2 = dataInput.readInt();
            j jVar2 = j.f17478e;
            j$.time.temporal.a.SECOND_OF_DAY.C(readInt2);
            int i17 = (int) (readInt2 / 3600);
            long j = readInt2 - (i17 * 3600);
            dVar = dVar2;
            jVar = j.Q(i17, (int) (j / 60), (int) (j - (r14 * 60)), 0);
        } else {
            dVar = dVar2;
            int i18 = i13 % 24;
            j jVar3 = j.f17478e;
            j$.time.temporal.a.HOUR_OF_DAY.C(i18);
            jVar = j.f17481h[i18];
        }
        ZoneOffset X = ZoneOffset.X(i14 == 255 ? dataInput.readInt() : (i14 - 128) * 900);
        if (i15 == 3) {
            i5 = dataInput.readInt();
        } else {
            i5 = (i15 * 1800) + X.f17297b;
        }
        ZoneOffset X2 = ZoneOffset.X(i5);
        if (i16 == 3) {
            i10 = dataInput.readInt();
        } else {
            i10 = (i16 * 1800) + X.f17297b;
        }
        ZoneOffset X3 = ZoneOffset.X(i10);
        boolean z5 = i13 == 24;
        Objects.requireNonNull(S, "month");
        Objects.requireNonNull(jVar, "time");
        d dVar3 = dVar;
        Objects.requireNonNull(dVar3, "timeDefnition");
        Objects.requireNonNull(X, "standardOffset");
        Objects.requireNonNull(X2, "offsetBefore");
        Objects.requireNonNull(X3, "offsetAfter");
        if (i11 < -28 || i11 > 31 || i11 == 0) {
            throw new IllegalArgumentException("Day of month indicator must be between -28 and 31 inclusive excluding zero");
        }
        if (z5 && !jVar.equals(j.f17480g)) {
            throw new IllegalArgumentException("Time must be midnight when end of day flag is true");
        }
        if (jVar.f17485d != 0) {
            throw new IllegalArgumentException("Time's nano-of-second must be zero");
        }
        return new e(S, i11, P, jVar, z5, dVar3, X, X2, X3);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof e) {
            e eVar = (e) obj;
            if (this.f17577a == eVar.f17577a && this.f17578b == eVar.f17578b && this.f17579c == eVar.f17579c && this.f17582f == eVar.f17582f && this.f17580d.equals(eVar.f17580d) && this.f17581e == eVar.f17581e && this.f17583g.equals(eVar.f17583g) && this.f17584h.equals(eVar.f17584h) && this.f17585i.equals(eVar.f17585i)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int c02 = ((this.f17580d.c0() + (this.f17581e ? 1 : 0)) << 15) + (this.f17577a.ordinal() << 11) + ((this.f17578b + 32) << 5);
        j$.time.d dVar = this.f17579c;
        return ((this.f17583g.f17297b ^ (this.f17582f.ordinal() + (c02 + ((dVar == null ? 7 : dVar.ordinal()) << 2)))) ^ this.f17584h.f17297b) ^ this.f17585i.f17297b;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("TransitionRule[");
        sb2.append(this.f17585i.f17297b - this.f17584h.f17297b > 0 ? "Gap " : "Overlap ");
        sb2.append(this.f17584h);
        sb2.append(" to ");
        sb2.append(this.f17585i);
        sb2.append(", ");
        j$.time.d dVar = this.f17579c;
        if (dVar != null) {
            byte b10 = this.f17578b;
            if (b10 == -1) {
                sb2.append(dVar.name());
                sb2.append(" on or before last day of ");
                sb2.append(this.f17577a.name());
            } else if (b10 < 0) {
                sb2.append(dVar.name());
                sb2.append(" on or before last day minus ");
                sb2.append((-this.f17578b) - 1);
                sb2.append(" of ");
                sb2.append(this.f17577a.name());
            } else {
                sb2.append(dVar.name());
                sb2.append(" on or after ");
                sb2.append(this.f17577a.name());
                sb2.append(' ');
                sb2.append((int) this.f17578b);
            }
        } else {
            sb2.append(this.f17577a.name());
            sb2.append(' ');
            sb2.append((int) this.f17578b);
        }
        sb2.append(" at ");
        sb2.append(this.f17581e ? "24:00" : this.f17580d.toString());
        sb2.append(" ");
        sb2.append(this.f17582f);
        sb2.append(", standard offset ");
        sb2.append(this.f17583g);
        sb2.append(']');
        return sb2.toString();
    }
}
