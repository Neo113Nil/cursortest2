package ig;

import Fm.C3051a;
import java.io.DataOutput;
import java.io.IOException;
import java.io.InvalidObjectException;
import java.io.ObjectInput;
import java.io.ObjectStreamException;
import java.io.Serializable;
import mg.EnumC8145a;
import ru.ozon.app.android.sellerproducts.sellerProducts.data.model.ProductContainerDTO;

/* loaded from: classes10.dex */
public final class h extends Lf.a implements mg.d, mg.f, Comparable<h>, Serializable {

    /* renamed from: f, reason: collision with root package name */
    public static final h f66422f;

    /* renamed from: g, reason: collision with root package name */
    public static final h f66423g;

    /* renamed from: h, reason: collision with root package name */
    private static final h[] f66424h = new h[24];

    /* renamed from: b, reason: collision with root package name */
    private final byte f66425b;

    /* renamed from: c, reason: collision with root package name */
    private final byte f66426c;

    /* renamed from: d, reason: collision with root package name */
    private final byte f66427d;

    /* renamed from: e, reason: collision with root package name */
    private final int f66428e;

    static /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f66429a;

        /* renamed from: b, reason: collision with root package name */
        static final /* synthetic */ int[] f66430b;

        static {
            int[] iArr = new int[mg.b.values().length];
            f66430b = iArr;
            try {
                iArr[mg.b.NANOS.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f66430b[mg.b.MICROS.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f66430b[mg.b.MILLIS.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f66430b[mg.b.SECONDS.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f66430b[mg.b.MINUTES.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f66430b[mg.b.HOURS.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f66430b[mg.b.HALF_DAYS.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            int[] iArr2 = new int[EnumC8145a.values().length];
            f66429a = iArr2;
            try {
                iArr2[EnumC8145a.NANO_OF_SECOND.ordinal()] = 1;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f66429a[EnumC8145a.NANO_OF_DAY.ordinal()] = 2;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f66429a[EnumC8145a.MICRO_OF_SECOND.ordinal()] = 3;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                f66429a[EnumC8145a.MICRO_OF_DAY.ordinal()] = 4;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                f66429a[EnumC8145a.MILLI_OF_SECOND.ordinal()] = 5;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                f66429a[EnumC8145a.MILLI_OF_DAY.ordinal()] = 6;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                f66429a[EnumC8145a.SECOND_OF_MINUTE.ordinal()] = 7;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                f66429a[EnumC8145a.SECOND_OF_DAY.ordinal()] = 8;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                f66429a[EnumC8145a.MINUTE_OF_HOUR.ordinal()] = 9;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                f66429a[EnumC8145a.MINUTE_OF_DAY.ordinal()] = 10;
            } catch (NoSuchFieldError unused17) {
            }
            try {
                f66429a[EnumC8145a.HOUR_OF_AMPM.ordinal()] = 11;
            } catch (NoSuchFieldError unused18) {
            }
            try {
                f66429a[EnumC8145a.CLOCK_HOUR_OF_AMPM.ordinal()] = 12;
            } catch (NoSuchFieldError unused19) {
            }
            try {
                f66429a[EnumC8145a.HOUR_OF_DAY.ordinal()] = 13;
            } catch (NoSuchFieldError unused20) {
            }
            try {
                f66429a[EnumC8145a.CLOCK_HOUR_OF_DAY.ordinal()] = 14;
            } catch (NoSuchFieldError unused21) {
            }
            try {
                f66429a[EnumC8145a.AMPM_OF_DAY.ordinal()] = 15;
            } catch (NoSuchFieldError unused22) {
            }
        }
    }

    static {
        int i11 = 0;
        while (true) {
            h[] hVarArr = f66424h;
            if (i11 >= hVarArr.length) {
                h hVar = hVarArr[0];
                h hVar2 = hVarArr[12];
                f66422f = hVar;
                f66423g = new h(23, 59, 59, 999999999);
                return;
            }
            hVarArr[i11] = new h(i11, 0, 0, 0);
            i11++;
        }
    }

    private h(int i11, int i12, int i13, int i14) {
        super(false);
        this.f66425b = (byte) i11;
        this.f66426c = (byte) i12;
        this.f66427d = (byte) i13;
        this.f66428e = i14;
    }

    private static h H0(int i11, int i12, int i13, int i14) {
        return ((i12 | i13) | i14) == 0 ? f66424h[i11] : new h(i11, i12, i13, i14);
    }

    public static h L0(mg.e eVar) {
        h hVar = (h) eVar.d(mg.i.c());
        if (hVar != null) {
            return hVar;
        }
        throw new C7073b("Unable to obtain LocalTime from TemporalAccessor: " + eVar + ", type " + eVar.getClass().getName());
    }

    private int M0(mg.h hVar) {
        int i11 = a.f66429a[((EnumC8145a) hVar).ordinal()];
        byte b11 = this.f66426c;
        int i12 = this.f66428e;
        byte b12 = this.f66425b;
        switch (i11) {
            case 1:
                return i12;
            case 2:
                throw new C7073b(C3051a.c("Field too large for an int: ", hVar));
            case 3:
                return i12 / 1000;
            case 4:
                throw new C7073b(C3051a.c("Field too large for an int: ", hVar));
            case 5:
                return i12 / 1000000;
            case 6:
                return (int) (u1() / 1000000);
            case 7:
                return this.f66427d;
            case 8:
                return v1();
            case 9:
                return b11;
            case 10:
                return (b12 * 60) + b11;
            case 11:
                return b12 % 12;
            case 12:
                int i13 = b12 % 12;
                if (i13 % 12 == 0) {
                    return 12;
                }
                return i13;
            case 14:
                if (b12 == 0) {
                    return 24;
                }
            case 13:
                return b12;
            case 15:
                return b12 / 12;
            default:
                throw new mg.l(C3051a.c("Unsupported field: ", hVar));
        }
    }

    public static h c1(long j11) {
        EnumC8145a.NANO_OF_DAY.i(j11);
        int i11 = (int) (j11 / 3600000000000L);
        long j12 = j11 - (i11 * 3600000000000L);
        int i12 = (int) (j12 / 60000000000L);
        long j13 = j12 - (i12 * 60000000000L);
        int i13 = (int) (j13 / 1000000000);
        return H0(i11, i12, i13, (int) (j13 - (i13 * 1000000000)));
    }

    static h d1(int i11, long j11) {
        EnumC8145a.SECOND_OF_DAY.i(j11);
        EnumC8145a.NANO_OF_SECOND.i(i11);
        int i12 = (int) (j11 / 3600);
        long j12 = j11 - (i12 * 3600);
        return H0(i12, (int) (j12 / 60), (int) (j12 - (r1 * 60)), i11);
    }

    public static h j1(long j11) {
        EnumC8145a.SECOND_OF_DAY.i(j11);
        int i11 = (int) (j11 / 3600);
        long j12 = j11 - (i11 * 3600);
        return H0(i11, (int) (j12 / 60), (int) (j12 - (r1 * 60)), 0);
    }

    private Object readResolve() throws ObjectStreamException {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r7v4, types: [int] */
    static h t1(ObjectInput objectInput) throws IOException {
        int readInt;
        int i11;
        int readByte = objectInput.readByte();
        byte b11 = 0;
        if (readByte < 0) {
            readByte = ~readByte;
            i11 = 0;
            readInt = 0;
        } else {
            byte readByte2 = objectInput.readByte();
            if (readByte2 < 0) {
                ?? r72 = ~readByte2;
                readInt = 0;
                b11 = r72;
                i11 = 0;
            } else {
                byte readByte3 = objectInput.readByte();
                if (readByte3 < 0) {
                    i11 = ~readByte3;
                    readInt = 0;
                    b11 = readByte2;
                } else {
                    readInt = objectInput.readInt();
                    b11 = readByte2;
                    i11 = readByte3;
                }
            }
        }
        EnumC8145a.HOUR_OF_DAY.i(readByte);
        EnumC8145a.MINUTE_OF_HOUR.i(b11);
        EnumC8145a.SECOND_OF_MINUTE.i(i11);
        EnumC8145a.NANO_OF_SECOND.i(readInt);
        return H0(readByte, b11, i11, readInt);
    }

    private Object writeReplace() {
        return new m((byte) 5, this);
    }

    final void B1(DataOutput dataOutput) throws IOException {
        byte b11 = this.f66427d;
        byte b12 = this.f66425b;
        byte b13 = this.f66426c;
        int i11 = this.f66428e;
        if (i11 != 0) {
            dataOutput.writeByte(b12);
            dataOutput.writeByte(b13);
            dataOutput.writeByte(b11);
            dataOutput.writeInt(i11);
            return;
        }
        if (b11 != 0) {
            dataOutput.writeByte(b12);
            dataOutput.writeByte(b13);
            dataOutput.writeByte(~b11);
        } else if (b13 == 0) {
            dataOutput.writeByte(~b12);
        } else {
            dataOutput.writeByte(b12);
            dataOutput.writeByte(~b13);
        }
    }

    @Override // java.lang.Comparable
    /* renamed from: E0, reason: merged with bridge method [inline-methods] */
    public final int compareTo(h hVar) {
        byte b11 = hVar.f66425b;
        byte b12 = this.f66425b;
        int i11 = b12 < b11 ? -1 : b12 > b11 ? 1 : 0;
        if (i11 == 0) {
            byte b13 = this.f66426c;
            byte b14 = hVar.f66426c;
            i11 = b13 < b14 ? -1 : b13 > b14 ? 1 : 0;
            if (i11 == 0) {
                byte b15 = this.f66427d;
                byte b16 = hVar.f66427d;
                i11 = b15 < b16 ? -1 : b15 > b16 ? 1 : 0;
                if (i11 == 0) {
                    int i12 = this.f66428e;
                    int i13 = hVar.f66428e;
                    if (i12 < i13) {
                        return -1;
                    }
                    return i12 > i13 ? 1 : 0;
                }
            }
        }
        return i11;
    }

    @Override // mg.e
    public final boolean L(mg.h hVar) {
        return hVar instanceof EnumC8145a ? ((EnumC8145a) hVar).j() : hVar != null && hVar.a(this);
    }

    @Override // Lf.a, mg.e
    public final int Q(mg.h hVar) {
        return hVar instanceof EnumC8145a ? M0(hVar) : super.Q(hVar);
    }

    @Override // mg.f
    public final mg.d R(mg.d dVar) {
        return dVar.j1(u1(), EnumC8145a.NANO_OF_DAY);
    }

    public final int T0() {
        return this.f66425b;
    }

    public final int W0() {
        return this.f66428e;
    }

    public final int a1() {
        return this.f66427d;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // Lf.a, mg.e
    public final <R> R d(mg.j<R> jVar) {
        if (jVar == mg.i.e()) {
            return (R) mg.b.NANOS;
        }
        if (jVar == mg.i.c()) {
            return this;
        }
        if (jVar == mg.i.a() || jVar == mg.i.g() || jVar == mg.i.f() || jVar == mg.i.d() || jVar == mg.i.b()) {
            return null;
        }
        return jVar.a(this);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof h) {
            h hVar = (h) obj;
            if (this.f66425b == hVar.f66425b && this.f66426c == hVar.f66426c && this.f66427d == hVar.f66427d && this.f66428e == hVar.f66428e) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        long u12 = u1();
        return (int) (u12 ^ (u12 >>> 32));
    }

    @Override // mg.d
    /* renamed from: j */
    public final mg.d k1(f fVar) {
        return (h) fVar.R(this);
    }

    @Override // mg.d
    /* renamed from: k1, reason: merged with bridge method [inline-methods] */
    public final h T0(long j11, mg.k kVar) {
        if (!(kVar instanceof mg.b)) {
            return (h) kVar.a(this, j11);
        }
        switch (a.f66430b[((mg.b) kVar).ordinal()]) {
            case 1:
                return n1(j11);
            case 2:
                return n1((j11 % 86400000000L) * 1000);
            case 3:
                return n1((j11 % 86400000) * 1000000);
            case 4:
                return q1(j11);
            case 5:
                return m1(j11);
            case 6:
                return l1(j11);
            case 7:
                return l1((j11 % 2) * 12);
            default:
                throw new mg.l("Unsupported unit: " + kVar);
        }
    }

    public final h l1(long j11) {
        if (j11 == 0) {
            return this;
        }
        return H0(((((int) (j11 % 24)) + this.f66425b) + 24) % 24, this.f66426c, this.f66427d, this.f66428e);
    }

    @Override // mg.e
    public final long m(mg.h hVar) {
        return hVar instanceof EnumC8145a ? hVar == EnumC8145a.NANO_OF_DAY ? u1() : hVar == EnumC8145a.MICRO_OF_DAY ? u1() / 1000 : M0(hVar) : hVar.f(this);
    }

    public final h m1(long j11) {
        if (j11 != 0) {
            int i11 = (this.f66425b * 60) + this.f66426c;
            int i12 = ((((int) (j11 % 1440)) + i11) + 1440) % 1440;
            if (i11 != i12) {
                return H0(i12 / 60, i12 % 60, this.f66427d, this.f66428e);
            }
        }
        return this;
    }

    public final h n1(long j11) {
        if (j11 != 0) {
            long u12 = u1();
            long j12 = (((j11 % 86400000000000L) + u12) + 86400000000000L) % 86400000000000L;
            if (u12 != j12) {
                return H0((int) (j12 / 3600000000000L), (int) ((j12 / 60000000000L) % 60), (int) ((j12 / 1000000000) % 60), (int) (j12 % 1000000000));
            }
        }
        return this;
    }

    public final h q1(long j11) {
        if (j11 != 0) {
            int i11 = (this.f66426c * 60) + (this.f66425b * 3600) + this.f66427d;
            int i12 = ((((int) (j11 % 86400)) + i11) + 86400) % 86400;
            if (i11 != i12) {
                return H0(i12 / 3600, (i12 / 60) % 60, i12 % 60, this.f66428e);
            }
        }
        return this;
    }

    @Override // mg.d
    public final mg.d s(long j11, mg.k kVar) {
        return j11 == Long.MIN_VALUE ? W0(Long.MAX_VALUE, kVar).W0(1L, kVar) : W0(-j11, kVar);
    }

    @Override // Lf.a
    public final String toString() {
        StringBuilder sb2 = new StringBuilder(18);
        byte b11 = this.f66425b;
        sb2.append(b11 < 10 ? "0" : "");
        sb2.append((int) b11);
        String str = ProductContainerDTO.RATIO_DELIMITER;
        byte b12 = this.f66426c;
        sb2.append(b12 < 10 ? ":0" : ProductContainerDTO.RATIO_DELIMITER);
        sb2.append((int) b12);
        byte b13 = this.f66427d;
        int i11 = this.f66428e;
        if (b13 > 0 || i11 > 0) {
            if (b13 < 10) {
                str = ":0";
            }
            sb2.append(str);
            sb2.append((int) b13);
            if (i11 > 0) {
                sb2.append('.');
                if (i11 % 1000000 == 0) {
                    sb2.append(Integer.toString((i11 / 1000000) + 1000).substring(1));
                } else if (i11 % 1000 == 0) {
                    sb2.append(Integer.toString((i11 / 1000) + 1000000).substring(1));
                } else {
                    sb2.append(Integer.toString(i11 + 1000000000).substring(1));
                }
            }
        }
        return sb2.toString();
    }

    public final long u1() {
        return (this.f66427d * 1000000000) + (this.f66426c * 60000000000L) + (this.f66425b * 3600000000000L) + this.f66428e;
    }

    public final int v1() {
        return (this.f66426c * 60) + (this.f66425b * 3600) + this.f66427d;
    }

    @Override // mg.d
    /* renamed from: x1, reason: merged with bridge method [inline-methods] */
    public final h j1(long j11, mg.h hVar) {
        if (!(hVar instanceof EnumC8145a)) {
            return (h) hVar.e(this, j11);
        }
        EnumC8145a enumC8145a = (EnumC8145a) hVar;
        enumC8145a.i(j11);
        int i11 = a.f66429a[enumC8145a.ordinal()];
        byte b11 = this.f66426c;
        byte b12 = this.f66427d;
        int i12 = this.f66428e;
        byte b13 = this.f66425b;
        switch (i11) {
            case 1:
                return y1((int) j11);
            case 2:
                return c1(j11);
            case 3:
                return y1(((int) j11) * 1000);
            case 4:
                return c1(j11 * 1000);
            case 5:
                return y1(((int) j11) * 1000000);
            case 6:
                return c1(j11 * 1000000);
            case 7:
                int i13 = (int) j11;
                if (b12 != i13) {
                    EnumC8145a.SECOND_OF_MINUTE.i(i13);
                    return H0(b13, b11, i13, i12);
                }
                return this;
            case 8:
                return q1(j11 - v1());
            case 9:
                int i14 = (int) j11;
                if (b11 != i14) {
                    EnumC8145a.MINUTE_OF_HOUR.i(i14);
                    return H0(b13, i14, b12, i12);
                }
                return this;
            case 10:
                return m1(j11 - ((b13 * 60) + b11));
            case 11:
                return l1(j11 - (b13 % 12));
            case 12:
                if (j11 == 12) {
                    j11 = 0;
                }
                return l1(j11 - (b13 % 12));
            case 13:
                int i15 = (int) j11;
                if (b13 != i15) {
                    EnumC8145a.HOUR_OF_DAY.i(i15);
                    return H0(i15, b11, b12, i12);
                }
                return this;
            case 14:
                if (j11 == 24) {
                    j11 = 0;
                }
                int i16 = (int) j11;
                if (b13 != i16) {
                    EnumC8145a.HOUR_OF_DAY.i(i16);
                    return H0(i16, b11, b12, i12);
                }
                return this;
            case 15:
                return l1((j11 - (b13 / 12)) * 12);
            default:
                throw new mg.l(C3051a.c("Unsupported field: ", hVar));
        }
    }

    public final h y1(int i11) {
        if (this.f66428e == i11) {
            return this;
        }
        EnumC8145a.NANO_OF_SECOND.i(i11);
        return H0(this.f66425b, this.f66426c, this.f66427d, i11);
    }
}
