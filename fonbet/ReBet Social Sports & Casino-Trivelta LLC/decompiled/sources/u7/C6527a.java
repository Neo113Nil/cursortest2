package u7;

import kotlin.UByte;
import kotlin.collections.ArraysKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import u7.c;

/* renamed from: u7.a, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C6527a implements c.b {

    @NotNull
    private static final byte[] AVIF_HEADER_PREFIX;

    @NotNull
    private static final byte[] AVIF_HEADER_SUFFIX;

    @NotNull
    private static final byte[] BINARY_XML_HEADER;

    @NotNull
    private static final byte[] BMP_HEADER;

    @NotNull
    private static final byte[] DNG_HEADER_II;

    @NotNull
    private static final byte[] DNG_HEADER_MM;

    @NotNull
    private static final byte[] HEIF_HEADER_PREFIX;

    @NotNull
    private static final byte[] ICO_HEADER;

    @NotNull
    private static final byte[] JPEG_HEADER;

    @NotNull
    private static final byte[] PNG_HEADER;

    /* renamed from: c, reason: collision with root package name */
    public static final int f66188c;

    /* renamed from: d, reason: collision with root package name */
    public static final int f66189d;

    /* renamed from: e, reason: collision with root package name */
    public static final int f66190e;

    /* renamed from: f, reason: collision with root package name */
    public static final int f66191f;

    /* renamed from: g, reason: collision with root package name */
    public static final byte[][] f66192g;

    /* renamed from: h, reason: collision with root package name */
    public static final int f66193h;

    /* renamed from: a, reason: collision with root package name */
    public final int f66194a;

    /* renamed from: b, reason: collision with root package name */
    public static final C0922a f66187b = new C0922a(null);

    @NotNull
    private static final byte[] GIF_HEADER_87A = f.a("GIF87a");

    @NotNull
    private static final byte[] GIF_HEADER_89A = f.a("GIF89a");

    /* renamed from: u7.a$a, reason: collision with other inner class name */
    public static final class C0922a {
        public /* synthetic */ C0922a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final int k(byte[] bArr) {
            if (bArr.length < 4) {
                return -1;
            }
            return (bArr[3] & UByte.MAX_VALUE) | ((bArr[0] & UByte.MAX_VALUE) << 24) | ((bArr[1] & UByte.MAX_VALUE) << 16) | ((bArr[2] & UByte.MAX_VALUE) << 8);
        }

        public final c l(byte[] bArr, int i10) {
            if (L6.c.h(bArr, 0, i10)) {
                return L6.c.g(bArr, 0) ? C6528b.f66201g : L6.c.f(bArr, 0) ? C6528b.f66202h : L6.c.c(bArr, 0, i10) ? L6.c.b(bArr, 0) ? C6528b.f66205k : L6.c.d(bArr, 0) ? C6528b.f66204j : C6528b.f66203i : c.f66212d;
            }
            throw new IllegalStateException("Check failed.");
        }

        public final boolean m(byte[] bArr, int i10) {
            if (i10 >= 12 && k(bArr) >= 8 && f.b(bArr, C6527a.AVIF_HEADER_PREFIX, 4)) {
                return f.b(bArr, C6527a.AVIF_HEADER_SUFFIX, 8);
            }
            return false;
        }

        public final boolean n(byte[] bArr, int i10) {
            return i10 >= 4 && f.c(bArr, C6527a.BINARY_XML_HEADER);
        }

        public final boolean o(byte[] bArr, int i10) {
            if (i10 < C6527a.BMP_HEADER.length) {
                return false;
            }
            return f.c(bArr, C6527a.BMP_HEADER);
        }

        public final boolean p(byte[] bArr, int i10) {
            if (i10 >= C6527a.f66193h) {
                return f.c(bArr, C6527a.DNG_HEADER_II) || f.c(bArr, C6527a.DNG_HEADER_MM);
            }
            return false;
        }

        public final boolean q(byte[] bArr, int i10) {
            if (i10 < 6) {
                return false;
            }
            return f.c(bArr, C6527a.GIF_HEADER_87A) || f.c(bArr, C6527a.GIF_HEADER_89A);
        }

        public final boolean r(byte[] bArr, int i10) {
            if (i10 < 12 || bArr[3] < 8 || !f.b(bArr, C6527a.HEIF_HEADER_PREFIX, 4)) {
                return false;
            }
            for (byte[] bArr2 : C6527a.f66192g) {
                if (f.b(bArr, bArr2, 8)) {
                    return true;
                }
            }
            return false;
        }

        public final boolean s(byte[] bArr, int i10) {
            if (i10 < C6527a.ICO_HEADER.length) {
                return false;
            }
            return f.c(bArr, C6527a.ICO_HEADER);
        }

        public final boolean t(byte[] bArr, int i10) {
            return i10 >= C6527a.JPEG_HEADER.length && f.c(bArr, C6527a.JPEG_HEADER);
        }

        public final boolean u(byte[] bArr, int i10) {
            return i10 >= C6527a.PNG_HEADER.length && f.c(bArr, C6527a.PNG_HEADER);
        }

        public C0922a() {
        }
    }

    static {
        byte[] bArr = {-1, -40, -1};
        JPEG_HEADER = bArr;
        f66188c = bArr.length;
        byte[] bArr2 = {-119, 80, 78, 71, 13, 10, 26, 10};
        PNG_HEADER = bArr2;
        f66189d = bArr2.length;
        byte[] a10 = f.a("BM");
        BMP_HEADER = a10;
        f66190e = a10.length;
        byte[] bArr3 = {0, 0, 1, 0};
        ICO_HEADER = bArr3;
        f66191f = bArr3.length;
        HEIF_HEADER_PREFIX = f.a("ftyp");
        f66192g = new byte[][]{f.a("heic"), f.a("heix"), f.a("hevc"), f.a("hevx"), f.a("mif1"), f.a("msf1")};
        byte[] bArr4 = {73, 73, 42, 0};
        DNG_HEADER_II = bArr4;
        DNG_HEADER_MM = new byte[]{77, 77, 0, 42};
        f66193h = bArr4.length;
        BINARY_XML_HEADER = new byte[]{3, 0, 8, 0};
        AVIF_HEADER_PREFIX = f.a("ftyp");
        AVIF_HEADER_SUFFIX = f.a("avif");
    }

    public C6527a() {
        Object maxOrNull = ArraysKt.maxOrNull(new Integer[]{21, 20, Integer.valueOf(f66188c), Integer.valueOf(f66189d), 6, Integer.valueOf(f66190e), Integer.valueOf(f66191f), 12, 4, 12});
        if (maxOrNull == null) {
            throw new IllegalStateException("Required value was null.");
        }
        this.f66194a = ((Number) maxOrNull).intValue();
    }

    @Override // u7.c.b
    public c a(byte[] headerBytes, int i10) {
        Intrinsics.checkNotNullParameter(headerBytes, "headerBytes");
        if (L6.c.h(headerBytes, 0, i10)) {
            return f66187b.l(headerBytes, i10);
        }
        C0922a c0922a = f66187b;
        return c0922a.t(headerBytes, i10) ? C6528b.f66196b : c0922a.u(headerBytes, i10) ? C6528b.f66197c : c0922a.q(headerBytes, i10) ? C6528b.f66198d : c0922a.o(headerBytes, i10) ? C6528b.f66199e : c0922a.s(headerBytes, i10) ? C6528b.f66200f : c0922a.m(headerBytes, i10) ? C6528b.f66209o : c0922a.r(headerBytes, i10) ? C6528b.f66206l : c0922a.n(headerBytes, i10) ? C6528b.f66208n : c0922a.p(headerBytes, i10) ? C6528b.f66207m : c.f66212d;
    }

    @Override // u7.c.b
    public int b() {
        return this.f66194a;
    }
}
