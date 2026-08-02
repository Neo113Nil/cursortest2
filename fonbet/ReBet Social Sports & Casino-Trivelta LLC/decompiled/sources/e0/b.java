package e0;

import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public final long f45449a;

    /* renamed from: b, reason: collision with root package name */
    public static final a f45448b = new a(null);

    @NotNull
    private static final int[] MinHeightOffsets = {18, 20, 17, 15};

    @NotNull
    private static final int[] WidthMask = {65535, 262143, 32767, 8191};

    @NotNull
    private static final int[] HeightMask = {32767, 8191, 65535, 262143};

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final int a(int i10) {
            if (i10 < 8191) {
                return 13;
            }
            if (i10 < 32767) {
                return 15;
            }
            if (i10 < 65535) {
                return 16;
            }
            if (i10 < 262143) {
                return 18;
            }
            throw new IllegalArgumentException("Can't represent a size of " + i10 + " in Constraints");
        }

        public final long b(int i10, int i11, int i12, int i13) {
            long j10;
            int i14 = i13 == Integer.MAX_VALUE ? i12 : i13;
            int a10 = a(i14);
            int i15 = i11 == Integer.MAX_VALUE ? i10 : i11;
            int a11 = a(i15);
            if (a10 + a11 > 31) {
                throw new IllegalArgumentException("Can't represent a width of " + i15 + " and height of " + i14 + " in Constraints");
            }
            if (a11 == 13) {
                j10 = 3;
            } else if (a11 == 18) {
                j10 = 1;
            } else if (a11 == 15) {
                j10 = 2;
            } else {
                if (a11 != 16) {
                    throw new IllegalStateException("Should only have the provided constants.");
                }
                j10 = 0;
            }
            int i16 = i11 == Integer.MAX_VALUE ? 0 : i11 + 1;
            int i17 = i13 != Integer.MAX_VALUE ? i13 + 1 : 0;
            int i18 = b.MinHeightOffsets[(int) j10];
            return b.c((i16 << 33) | j10 | (i10 << 2) | (i12 << i18) | (i17 << (i18 + 31)));
        }

        public a() {
        }
    }

    public /* synthetic */ b(long j10) {
        this.f45449a = j10;
    }

    public static final /* synthetic */ b b(long j10) {
        return new b(j10);
    }

    public static boolean d(long j10, Object obj) {
        return (obj instanceof b) && j10 == ((b) obj).m();
    }

    public static final boolean e(long j10, long j11) {
        return j10 == j11;
    }

    public static final int f(long j10) {
        return (int) (j10 & 3);
    }

    public static final int g(long j10) {
        int f10 = f(j10);
        int i10 = ((int) (j10 >> (MinHeightOffsets[f10] + 31))) & HeightMask[f10];
        if (i10 == 0) {
            return Integer.MAX_VALUE;
        }
        return i10 - 1;
    }

    public static final int h(long j10) {
        int i10 = ((int) (j10 >> 33)) & WidthMask[f(j10)];
        if (i10 == 0) {
            return Integer.MAX_VALUE;
        }
        return i10 - 1;
    }

    public static final int i(long j10) {
        int f10 = f(j10);
        return ((int) (j10 >> MinHeightOffsets[f10])) & HeightMask[f10];
    }

    public static final int j(long j10) {
        return ((int) (j10 >> 2)) & WidthMask[f(j10)];
    }

    public static int k(long j10) {
        return Long.hashCode(j10);
    }

    public static String l(long j10) {
        int h10 = h(j10);
        String valueOf = h10 == Integer.MAX_VALUE ? "Infinity" : String.valueOf(h10);
        int g10 = g(j10);
        return "Constraints(minWidth = " + j(j10) + ", maxWidth = " + valueOf + ", minHeight = " + i(j10) + ", maxHeight = " + (g10 != Integer.MAX_VALUE ? String.valueOf(g10) : "Infinity") + ')';
    }

    public boolean equals(Object obj) {
        return d(this.f45449a, obj);
    }

    public int hashCode() {
        return k(this.f45449a);
    }

    public final /* synthetic */ long m() {
        return this.f45449a;
    }

    public String toString() {
        return l(this.f45449a);
    }

    public static long c(long j10) {
        return j10;
    }
}
