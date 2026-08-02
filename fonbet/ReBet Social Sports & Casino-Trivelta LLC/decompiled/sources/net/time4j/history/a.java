package net.time4j.history;

import java.util.Arrays;

/* loaded from: classes5.dex */
public final class a {
    private static final int[] SEQUENCE_SCALIGER;

    /* renamed from: b, reason: collision with root package name */
    public static final h f58152b = h.g(j.AD, 8, 1, 1);

    /* renamed from: c, reason: collision with root package name */
    public static final h f58153c = h.g(j.BC, 45, 1, 1);

    /* renamed from: d, reason: collision with root package name */
    public static final a f58154d;

    /* renamed from: a, reason: collision with root package name */
    public final b f58155a;
    private final int[] leaps;

    /* renamed from: net.time4j.history.a$a, reason: collision with other inner class name */
    public class C0844a implements b {
        public C0844a() {
        }

        @Override // net.time4j.history.b
        public long a(h hVar) {
            if (hVar.compareTo(a.f58152b) >= 0) {
                return c.f58158b.a(hVar);
            }
            if (hVar.compareTo(a.f58153c) < 0) {
                throw new IllegalArgumentException("Not valid before 45 BC: " + hVar);
            }
            int e10 = e(hVar);
            long j10 = -676021;
            for (int i10 = 7; i10 >= e10; i10--) {
                j10 -= f(i10) ? 366L : 365L;
            }
            for (int i11 = 1; i11 < hVar.d(); i11++) {
                j10 += d(e10, i11);
            }
            return (j10 + hVar.b()) - 1;
        }

        @Override // net.time4j.history.b
        public int b(h hVar) {
            if (hVar.compareTo(a.f58152b) >= 0) {
                return c.f58158b.b(hVar);
            }
            if (hVar.compareTo(a.f58153c) >= 0) {
                return d(e(hVar), hVar.d());
            }
            throw new IllegalArgumentException("Not valid before 45 BC: " + hVar);
        }

        @Override // net.time4j.history.b
        public h c(long j10) {
            long j11 = -676021;
            if (j10 >= -676021) {
                return c.f58158b.c(j10);
            }
            int i10 = 7;
            while (i10 >= -44) {
                j11 -= f(i10) ? 366L : 365L;
                if (j11 <= j10) {
                    int i11 = 1;
                    while (i11 <= 12) {
                        long d10 = d(i10, i11) + j11;
                        if (d10 > j10) {
                            j jVar = i10 <= 0 ? j.BC : j.AD;
                            if (i10 <= 0) {
                                i10 = 1 - i10;
                            }
                            return h.g(jVar, i10, i11, (int) ((j10 - j11) + 1));
                        }
                        i11++;
                        j11 = d10;
                    }
                }
                i10--;
            }
            throw new IllegalArgumentException("Not valid before 45 BC: " + j10);
        }

        public final int d(int i10, int i11) {
            switch (i11) {
                case 1:
                case 3:
                case 5:
                case 7:
                case 8:
                case 10:
                case 12:
                    return 31;
                case 2:
                    return f(i10) ? 29 : 28;
                case 4:
                case 6:
                case 9:
                case 11:
                    return 30;
                default:
                    throw new IllegalArgumentException("Invalid month: " + i11);
            }
        }

        public final int e(h hVar) {
            return hVar.c().a(hVar.e());
        }

        public final boolean f(int i10) {
            return Arrays.binarySearch(a.this.leaps, i10) >= 0;
        }

        @Override // net.time4j.history.b
        public boolean isValid(h hVar) {
            int e10;
            if (hVar != null && (e10 = e(hVar)) >= -44) {
                if (e10 >= 8) {
                    return c.f58158b.isValid(hVar);
                }
                if (hVar.b() <= d(e10, hVar.d())) {
                    return true;
                }
            }
            return false;
        }
    }

    static {
        int[] iArr = {42, 39, 36, 33, 30, 27, 24, 21, 18, 15, 12, 9};
        SEQUENCE_SCALIGER = iArr;
        f58154d = new a(iArr);
    }

    public a(int... iArr) {
        int i10;
        int[] iArr2 = new int[iArr.length];
        int i11 = 0;
        while (true) {
            i10 = 1;
            if (i11 >= iArr.length) {
                break;
            }
            iArr2[i11] = 1 - iArr[i11];
            i11++;
        }
        Arrays.sort(iArr2);
        this.leaps = iArr2;
        if (iArr2.length == 0) {
            throw new IllegalArgumentException("Missing leap years.");
        }
        int i12 = iArr2[0];
        if (i12 < -44 || iArr2[iArr2.length - 1] >= 8) {
            throw new IllegalArgumentException("Out of range: " + Arrays.toString(iArr));
        }
        while (i10 < iArr.length) {
            int i13 = iArr2[i10];
            if (i13 == i12) {
                throw new IllegalArgumentException("Contains duplicates: " + Arrays.toString(iArr));
            }
            i10++;
            i12 = i13;
        }
        this.f58155a = new C0844a();
    }

    public static a f(int... iArr) {
        return Arrays.equals(iArr, SEQUENCE_SCALIGER) ? f58154d : new a(iArr);
    }

    public b d() {
        return this.f58155a;
    }

    public int[] e() {
        return this.leaps;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof a) && this.leaps == ((a) obj).leaps;
    }

    public int hashCode() {
        return Arrays.hashCode(this.leaps);
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        for (int i10 = 0; i10 < this.leaps.length; i10++) {
            if (i10 > 0) {
                sb2.append(", ");
            }
            int i11 = 1 - this.leaps[i10];
            if (i11 > 0) {
                sb2.append("BC ");
                sb2.append(i11);
            } else {
                sb2.append("AD ");
                sb2.append(this.leaps[i10]);
            }
        }
        return sb2.toString();
    }
}
