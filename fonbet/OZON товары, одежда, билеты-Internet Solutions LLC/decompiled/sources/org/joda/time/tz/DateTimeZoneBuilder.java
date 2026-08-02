package org.joda.time.tz;

import Pk0.i;
import java.io.DataInput;
import java.io.IOException;
import java.util.Arrays;
import org.joda.time.DateTimeZone;
import org.joda.time.chrono.ISOChronology;

/* loaded from: classes6.dex */
public final class DateTimeZoneBuilder {

    /* loaded from: classes10.dex */
    private static final class DSTZone extends DateTimeZone {
        private static final long serialVersionUID = 6941492635554961361L;
        final b iEndRecurrence;
        final int iStandardOffset;
        final b iStartRecurrence;

        DSTZone(String str, int i11, b bVar, b bVar2) {
            super(str);
            this.iStandardOffset = i11;
            this.iStartRecurrence = bVar;
            this.iEndRecurrence = bVar2;
        }

        private b G(long j11) {
            long j12;
            int i11 = this.iStandardOffset;
            b bVar = this.iStartRecurrence;
            b bVar2 = this.iEndRecurrence;
            try {
                j12 = bVar.f79398a.a(i11, bVar2.f79400c, j11);
            } catch (ArithmeticException | IllegalArgumentException unused) {
                j12 = j11;
            }
            try {
                j11 = bVar2.f79398a.a(i11, bVar.f79400c, j11);
            } catch (ArithmeticException | IllegalArgumentException unused2) {
            }
            return j12 > j11 ? bVar : bVar2;
        }

        static DSTZone H(DataInput dataInput, String str) throws IOException {
            return new DSTZone(str, (int) DateTimeZoneBuilder.b(dataInput), b.a(dataInput), b.a(dataInput));
        }

        /* JADX WARN: Code restructure failed: missing block: B:7:0x0016, code lost:
        
            if (r5 < 0) goto L8;
         */
        /* JADX WARN: Removed duplicated region for block: B:17:0x002f  */
        /* JADX WARN: Removed duplicated region for block: B:20:? A[RETURN, SYNTHETIC] */
        @Override // org.joda.time.DateTimeZone
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final long A(long j11) {
            long j12;
            long a11;
            int i11 = this.iStandardOffset;
            b bVar = this.iStartRecurrence;
            b bVar2 = this.iEndRecurrence;
            try {
                j12 = bVar.f79398a.a(i11, bVar2.f79400c, j11);
                if (j11 > 0) {
                }
            } catch (ArithmeticException | IllegalArgumentException unused) {
            }
            try {
                a11 = bVar2.f79398a.a(i11, bVar.f79400c, j11);
                if (j11 > 0 || a11 >= 0) {
                    j11 = a11;
                }
            } catch (ArithmeticException | IllegalArgumentException unused2) {
            }
            return j12 <= j11 ? j11 : j12;
            j12 = j11;
            a11 = bVar2.f79398a.a(i11, bVar.f79400c, j11);
            if (j11 > 0) {
            }
            j11 = a11;
            if (j12 <= j11) {
            }
        }

        /* JADX WARN: Code restructure failed: missing block: B:7:0x0019, code lost:
        
            if (r7 > 0) goto L8;
         */
        /* JADX WARN: Removed duplicated region for block: B:17:0x0033  */
        @Override // org.joda.time.DateTimeZone
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final long B(long j11) {
            long j12;
            long b11;
            long j13 = j11 + 1;
            int i11 = this.iStandardOffset;
            b bVar = this.iStartRecurrence;
            b bVar2 = this.iEndRecurrence;
            try {
                j12 = bVar.f79398a.b(i11, bVar2.f79400c, j13);
                if (j13 < 0) {
                }
            } catch (ArithmeticException | IllegalArgumentException unused) {
            }
            try {
                b11 = bVar2.f79398a.b(i11, bVar.f79400c, j13);
                if (j13 < 0 || b11 <= 0) {
                    j13 = b11;
                }
            } catch (ArithmeticException | IllegalArgumentException unused2) {
            }
            if (j12 <= j13) {
                j12 = j13;
            }
            return j12 - 1;
            j12 = j13;
            b11 = bVar2.f79398a.b(i11, bVar.f79400c, j13);
            if (j13 < 0) {
            }
            j13 = b11;
            if (j12 <= j13) {
            }
            return j12 - 1;
        }

        @Override // org.joda.time.DateTimeZone
        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof DSTZone) {
                DSTZone dSTZone = (DSTZone) obj;
                if (h().equals(dSTZone.h()) && this.iStandardOffset == dSTZone.iStandardOffset && this.iStartRecurrence.equals(dSTZone.iStartRecurrence) && this.iEndRecurrence.equals(dSTZone.iEndRecurrence)) {
                    return true;
                }
            }
            return false;
        }

        @Override // org.joda.time.DateTimeZone
        public final int hashCode() {
            return Arrays.hashCode(new Object[]{Integer.valueOf(this.iStandardOffset), this.iStartRecurrence, this.iEndRecurrence});
        }

        @Override // org.joda.time.DateTimeZone
        public final String l(long j11) {
            return G(j11).f79399b;
        }

        @Override // org.joda.time.DateTimeZone
        public final int n(long j11) {
            return this.iStandardOffset + G(j11).f79400c;
        }

        @Override // org.joda.time.DateTimeZone
        public final int v(long j11) {
            return this.iStandardOffset;
        }

        @Override // org.joda.time.DateTimeZone
        public final boolean y() {
            return false;
        }
    }

    private static final class PrecalculatedZone extends DateTimeZone {
        private static final long serialVersionUID = 7811976468055766265L;
        private final String[] iNameKeys;
        private final int[] iStandardOffsets;
        private final DSTZone iTailZone;
        private final long[] iTransitions;
        private final int[] iWallOffsets;

        private PrecalculatedZone(String str, long[] jArr, int[] iArr, int[] iArr2, String[] strArr, DSTZone dSTZone) {
            super(str);
            this.iTransitions = jArr;
            this.iWallOffsets = iArr;
            this.iStandardOffsets = iArr2;
            this.iNameKeys = strArr;
            this.iTailZone = dSTZone;
        }

        static PrecalculatedZone G(DataInput dataInput, String str) throws IOException {
            int readUnsignedByte;
            int readUnsignedShort = dataInput.readUnsignedShort();
            String[] strArr = new String[readUnsignedShort];
            for (int i11 = 0; i11 < readUnsignedShort; i11++) {
                strArr[i11] = dataInput.readUTF();
            }
            int readInt = dataInput.readInt();
            long[] jArr = new long[readInt];
            int[] iArr = new int[readInt];
            int[] iArr2 = new int[readInt];
            String[] strArr2 = new String[readInt];
            for (int i12 = 0; i12 < readInt; i12++) {
                jArr[i12] = DateTimeZoneBuilder.b(dataInput);
                iArr[i12] = (int) DateTimeZoneBuilder.b(dataInput);
                iArr2[i12] = (int) DateTimeZoneBuilder.b(dataInput);
                if (readUnsignedShort < 256) {
                    try {
                        readUnsignedByte = dataInput.readUnsignedByte();
                    } catch (ArrayIndexOutOfBoundsException unused) {
                        throw new IOException("Invalid encoding");
                    }
                } else {
                    readUnsignedByte = dataInput.readUnsignedShort();
                }
                strArr2[i12] = strArr[readUnsignedByte];
            }
            return new PrecalculatedZone(str, jArr, iArr, iArr2, strArr2, dataInput.readBoolean() ? DSTZone.H(dataInput, str) : null);
        }

        @Override // org.joda.time.DateTimeZone
        public final long A(long j11) {
            long[] jArr = this.iTransitions;
            int binarySearch = Arrays.binarySearch(jArr, j11);
            int i11 = binarySearch >= 0 ? binarySearch + 1 : ~binarySearch;
            if (i11 < jArr.length) {
                return jArr[i11];
            }
            DSTZone dSTZone = this.iTailZone;
            if (dSTZone == null) {
                return j11;
            }
            long j12 = jArr[jArr.length - 1];
            if (j11 < j12) {
                j11 = j12;
            }
            return dSTZone.A(j11);
        }

        @Override // org.joda.time.DateTimeZone
        public final long B(long j11) {
            long[] jArr = this.iTransitions;
            int binarySearch = Arrays.binarySearch(jArr, j11);
            if (binarySearch < 0) {
                int i11 = ~binarySearch;
                if (i11 >= jArr.length) {
                    DSTZone dSTZone = this.iTailZone;
                    if (dSTZone != null) {
                        long B11 = dSTZone.B(j11);
                        if (B11 < j11) {
                            return B11;
                        }
                    }
                    long j12 = jArr[i11 - 1];
                    if (j12 > Long.MIN_VALUE) {
                        return j12 - 1;
                    }
                } else if (i11 > 0) {
                    long j13 = jArr[i11 - 1];
                    if (j13 > Long.MIN_VALUE) {
                        return j13 - 1;
                    }
                }
            } else if (j11 > Long.MIN_VALUE) {
                return j11 - 1;
            }
            return j11;
        }

        @Override // org.joda.time.DateTimeZone
        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof PrecalculatedZone) {
                PrecalculatedZone precalculatedZone = (PrecalculatedZone) obj;
                if (h().equals(precalculatedZone.h()) && Arrays.equals(this.iTransitions, precalculatedZone.iTransitions) && Arrays.equals(this.iNameKeys, precalculatedZone.iNameKeys) && Arrays.equals(this.iWallOffsets, precalculatedZone.iWallOffsets) && Arrays.equals(this.iStandardOffsets, precalculatedZone.iStandardOffsets)) {
                    DSTZone dSTZone = this.iTailZone;
                    DSTZone dSTZone2 = precalculatedZone.iTailZone;
                    if (dSTZone != null ? dSTZone.equals(dSTZone2) : dSTZone2 == null) {
                        return true;
                    }
                }
            }
            return false;
        }

        @Override // org.joda.time.DateTimeZone
        public final int hashCode() {
            return h().hashCode();
        }

        @Override // org.joda.time.DateTimeZone
        public final String l(long j11) {
            long[] jArr = this.iTransitions;
            int binarySearch = Arrays.binarySearch(jArr, j11);
            if (binarySearch >= 0) {
                return this.iNameKeys[binarySearch];
            }
            int i11 = ~binarySearch;
            if (i11 < jArr.length) {
                return i11 > 0 ? this.iNameKeys[i11 - 1] : "UTC";
            }
            DSTZone dSTZone = this.iTailZone;
            return dSTZone == null ? this.iNameKeys[i11 - 1] : dSTZone.l(j11);
        }

        @Override // org.joda.time.DateTimeZone
        public final int n(long j11) {
            long[] jArr = this.iTransitions;
            int binarySearch = Arrays.binarySearch(jArr, j11);
            if (binarySearch >= 0) {
                return this.iWallOffsets[binarySearch];
            }
            int i11 = ~binarySearch;
            if (i11 >= jArr.length) {
                DSTZone dSTZone = this.iTailZone;
                return dSTZone == null ? this.iWallOffsets[i11 - 1] : dSTZone.n(j11);
            }
            if (i11 > 0) {
                return this.iWallOffsets[i11 - 1];
            }
            return 0;
        }

        @Override // org.joda.time.DateTimeZone
        public final int v(long j11) {
            long[] jArr = this.iTransitions;
            int binarySearch = Arrays.binarySearch(jArr, j11);
            if (binarySearch >= 0) {
                return this.iStandardOffsets[binarySearch];
            }
            int i11 = ~binarySearch;
            if (i11 >= jArr.length) {
                DSTZone dSTZone = this.iTailZone;
                return dSTZone == null ? this.iStandardOffsets[i11 - 1] : dSTZone.v(j11);
            }
            if (i11 > 0) {
                return this.iStandardOffsets[i11 - 1];
            }
            return 0;
        }

        @Override // org.joda.time.DateTimeZone
        public final boolean y() {
            return false;
        }
    }

    /* loaded from: classes10.dex */
    private static final class a {

        /* renamed from: a, reason: collision with root package name */
        final char f79392a;

        /* renamed from: b, reason: collision with root package name */
        final int f79393b;

        /* renamed from: c, reason: collision with root package name */
        final int f79394c;

        /* renamed from: d, reason: collision with root package name */
        final int f79395d;

        /* renamed from: e, reason: collision with root package name */
        final boolean f79396e;

        /* renamed from: f, reason: collision with root package name */
        final int f79397f;

        a(char c11, int i11, int i12, int i13, boolean z11, int i14) {
            if (c11 != 'u' && c11 != 'w' && c11 != 's') {
                throw new IllegalArgumentException(i.a("Unknown mode: ", c11));
            }
            this.f79392a = c11;
            this.f79393b = i11;
            this.f79394c = i12;
            this.f79395d = i13;
            this.f79396e = z11;
            this.f79397f = i14;
        }

        private long c(ISOChronology iSOChronology, long j11) {
            int i11 = this.f79394c;
            if (i11 >= 0) {
                return iSOChronology.g().M(i11, j11);
            }
            return iSOChronology.g().a(i11, iSOChronology.L().a(1, iSOChronology.g().M(1, j11)));
        }

        private long d(ISOChronology iSOChronology, long j11) {
            try {
                return c(iSOChronology, j11);
            } catch (IllegalArgumentException e11) {
                if (this.f79393b != 2 || this.f79394c != 29) {
                    throw e11;
                }
                while (!iSOChronology.Y().D(j11)) {
                    j11 = iSOChronology.Y().a(1, j11);
                }
                return c(iSOChronology, j11);
            }
        }

        private long e(ISOChronology iSOChronology, long j11) {
            try {
                return c(iSOChronology, j11);
            } catch (IllegalArgumentException e11) {
                if (this.f79393b != 2 || this.f79394c != 29) {
                    throw e11;
                }
                while (!iSOChronology.Y().D(j11)) {
                    j11 = iSOChronology.Y().a(-1, j11);
                }
                return c(iSOChronology, j11);
            }
        }

        private long f(ISOChronology iSOChronology, long j11) {
            int d11 = this.f79395d - iSOChronology.h().d(j11);
            if (d11 == 0) {
                return j11;
            }
            if (this.f79396e) {
                if (d11 < 0) {
                    d11 += 7;
                }
            } else if (d11 > 0) {
                d11 -= 7;
            }
            return iSOChronology.h().a(d11, j11);
        }

        public final long a(int i11, int i12, long j11) {
            char c11 = this.f79392a;
            if (c11 == 'w') {
                i11 += i12;
            } else if (c11 != 's') {
                i11 = 0;
            }
            long j12 = i11;
            long j13 = j11 + j12;
            ISOChronology i02 = ISOChronology.i0();
            org.joda.time.b L11 = i02.L();
            int i13 = this.f79393b;
            long M11 = i02.G().M(0, L11.M(i13, j13));
            org.joda.time.b G11 = i02.G();
            int i14 = this.f79397f;
            long d11 = d(i02, G11.a(Math.min(i14, 86399999), M11));
            if (this.f79395d != 0) {
                d11 = f(i02, d11);
                if (d11 <= j13) {
                    d11 = f(i02, d(i02, i02.L().M(i13, i02.Y().a(1, d11))));
                }
            } else if (d11 <= j13) {
                d11 = d(i02, i02.Y().a(1, d11));
            }
            return i02.G().a(i14, i02.G().M(0, d11)) - j12;
        }

        public final long b(int i11, int i12, long j11) {
            char c11 = this.f79392a;
            if (c11 == 'w') {
                i11 += i12;
            } else if (c11 != 's') {
                i11 = 0;
            }
            long j12 = i11;
            long j13 = j11 + j12;
            ISOChronology i02 = ISOChronology.i0();
            org.joda.time.b L11 = i02.L();
            int i13 = this.f79393b;
            long M11 = i02.G().M(0, L11.M(i13, j13));
            org.joda.time.b G11 = i02.G();
            int i14 = this.f79397f;
            long e11 = e(i02, G11.a(i14, M11));
            if (this.f79395d != 0) {
                e11 = f(i02, e11);
                if (e11 >= j13) {
                    e11 = f(i02, e(i02, i02.L().M(i13, i02.Y().a(-1, e11))));
                }
            } else if (e11 >= j13) {
                e11 = e(i02, i02.Y().a(-1, e11));
            }
            return i02.G().a(i14, i02.G().M(0, e11)) - j12;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof a) {
                a aVar = (a) obj;
                if (this.f79392a == aVar.f79392a && this.f79393b == aVar.f79393b && this.f79394c == aVar.f79394c && this.f79395d == aVar.f79395d && this.f79396e == aVar.f79396e && this.f79397f == aVar.f79397f) {
                    return true;
                }
            }
            return false;
        }

        public final int hashCode() {
            return Arrays.hashCode(new Object[]{Character.valueOf(this.f79392a), Integer.valueOf(this.f79393b), Integer.valueOf(this.f79394c), Integer.valueOf(this.f79395d), Boolean.valueOf(this.f79396e), Integer.valueOf(this.f79397f)});
        }

        public final String toString() {
            StringBuilder sb2 = new StringBuilder("[OfYear]\nMode: ");
            sb2.append(this.f79392a);
            sb2.append("\nMonthOfYear: ");
            sb2.append(this.f79393b);
            sb2.append("\nDayOfMonth: ");
            sb2.append(this.f79394c);
            sb2.append("\nDayOfWeek: ");
            sb2.append(this.f79395d);
            sb2.append("\nAdvanceDayOfWeek: ");
            sb2.append(this.f79396e);
            sb2.append("\nMillisOfDay: ");
            return Ek.a.d(sb2, this.f79397f, '\n');
        }
    }

    /* loaded from: classes10.dex */
    private static final class b {

        /* renamed from: a, reason: collision with root package name */
        final a f79398a;

        /* renamed from: b, reason: collision with root package name */
        final String f79399b;

        /* renamed from: c, reason: collision with root package name */
        final int f79400c;

        b(a aVar, String str, int i11) {
            this.f79398a = aVar;
            this.f79399b = str;
            this.f79400c = i11;
        }

        static b a(DataInput dataInput) throws IOException {
            return new b(new a((char) dataInput.readUnsignedByte(), dataInput.readUnsignedByte(), dataInput.readByte(), dataInput.readUnsignedByte(), dataInput.readBoolean(), (int) DateTimeZoneBuilder.b(dataInput)), dataInput.readUTF(), (int) DateTimeZoneBuilder.b(dataInput));
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof b) {
                b bVar = (b) obj;
                if (this.f79400c == bVar.f79400c && this.f79399b.equals(bVar.f79399b) && this.f79398a.equals(bVar.f79398a)) {
                    return true;
                }
            }
            return false;
        }

        public final int hashCode() {
            return Arrays.hashCode(new Object[]{Integer.valueOf(this.f79400c), this.f79399b, this.f79398a});
        }

        public final String toString() {
            return this.f79398a + " named " + this.f79399b + " at " + this.f79400c;
        }
    }

    public static DateTimeZone a(DataInput dataInput, String str) throws IOException {
        int readUnsignedByte = dataInput.readUnsignedByte();
        if (readUnsignedByte == 67) {
            return CachedDateTimeZone.G(PrecalculatedZone.G(dataInput, str));
        }
        if (readUnsignedByte != 70) {
            if (readUnsignedByte == 80) {
                return PrecalculatedZone.G(dataInput, str);
            }
            throw new IOException("Invalid encoding");
        }
        FixedDateTimeZone fixedDateTimeZone = new FixedDateTimeZone(str, dataInput.readUTF(), (int) b(dataInput), (int) b(dataInput));
        DateTimeZone dateTimeZone = DateTimeZone.f78989a;
        return fixedDateTimeZone.equals(dateTimeZone) ? dateTimeZone : fixedDateTimeZone;
    }

    static long b(DataInput dataInput) throws IOException {
        long readUnsignedByte;
        long j11;
        int readUnsignedByte2 = dataInput.readUnsignedByte();
        int i11 = readUnsignedByte2 >> 6;
        if (i11 == 1) {
            readUnsignedByte = dataInput.readUnsignedByte() | ((readUnsignedByte2 << 26) >> 2) | (dataInput.readUnsignedByte() << 16) | (dataInput.readUnsignedByte() << 8);
            j11 = 60000;
        } else if (i11 == 2) {
            readUnsignedByte = ((readUnsignedByte2 << 58) >> 26) | (dataInput.readUnsignedByte() << 24) | (dataInput.readUnsignedByte() << 16) | (dataInput.readUnsignedByte() << 8) | dataInput.readUnsignedByte();
            j11 = 1000;
        } else {
            if (i11 == 3) {
                return dataInput.readLong();
            }
            readUnsignedByte = (readUnsignedByte2 << 26) >> 26;
            j11 = 1800000;
        }
        return readUnsignedByte * j11;
    }
}
