package uf;

import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import java.io.IOException;
import java.io.InputStream;

/* renamed from: uf.a, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
final class C10054a {

    /* renamed from: d, reason: collision with root package name */
    private InputStream f100687d;

    /* renamed from: e, reason: collision with root package name */
    private boolean f100688e;

    /* renamed from: f, reason: collision with root package name */
    long f100689f;

    /* renamed from: g, reason: collision with root package name */
    int f100690g;

    /* renamed from: h, reason: collision with root package name */
    private int f100691h;

    /* renamed from: a, reason: collision with root package name */
    private final byte[] f100684a = new byte[4160];

    /* renamed from: b, reason: collision with root package name */
    private final int[] f100685b = new int[1040];

    /* renamed from: c, reason: collision with root package name */
    private final i f100686c = new i();

    /* renamed from: i, reason: collision with root package name */
    private int f100692i = 0;

    C10054a() {
    }

    static void a(C10054a c10054a, boolean z11) {
        if (c10054a.f100688e) {
            int i11 = ((c10054a.f100691h << 2) + ((c10054a.f100690g + 7) >> 3)) - 8;
            int i12 = c10054a.f100692i;
            if (i11 > i12) {
                throw new c("Read after end");
            }
            if (z11 && i11 != i12) {
                throw new c("Unused bytes after end");
            }
        }
    }

    static void b(C10054a c10054a) throws IOException {
        InputStream inputStream = c10054a.f100687d;
        c10054a.f100687d = null;
        if (inputStream != null) {
            inputStream.close();
        }
    }

    static void c(C10054a c10054a, byte[] bArr, int i11, int i12) {
        if ((c10054a.f100690g & 7) != 0) {
            throw new c("Unaligned copyBytes");
        }
        while (true) {
            int i13 = c10054a.f100690g;
            if (i13 == 64 || i12 == 0) {
                break;
            }
            bArr[i11] = (byte) (c10054a.f100689f >>> i13);
            c10054a.f100690g = i13 + 8;
            i12--;
            i11++;
        }
        if (i12 == 0) {
            return;
        }
        int min = Math.min(f(c10054a), i12 >> 2);
        if (min > 0) {
            int i14 = min << 2;
            System.arraycopy(c10054a.f100684a, c10054a.f100691h << 2, bArr, i11, i14);
            i11 += i14;
            i12 -= i14;
            c10054a.f100691h += min;
        }
        if (i12 == 0) {
            return;
        }
        if (f(c10054a) <= 0) {
            while (i12 > 0) {
                try {
                    int read = c10054a.f100687d.read(bArr, i11, i12);
                    if (read == -1) {
                        throw new c("Unexpected end of input");
                    }
                    i11 += read;
                    i12 -= read;
                } catch (IOException e11) {
                    throw new c("Failed to read input", e11);
                }
            }
            return;
        }
        d(c10054a);
        while (i12 != 0) {
            long j11 = c10054a.f100689f;
            int i15 = c10054a.f100690g;
            bArr[i11] = (byte) (j11 >>> i15);
            c10054a.f100690g = i15 + 8;
            i12--;
            i11++;
        }
        a(c10054a, false);
    }

    static void d(C10054a c10054a) {
        int i11 = c10054a.f100690g;
        if (i11 >= 32) {
            c10054a.f100691h = c10054a.f100691h + 1;
            c10054a.f100689f = (c10054a.f100685b[r2] << 32) | (c10054a.f100689f >>> 32);
            c10054a.f100690g = i11 - 32;
        }
    }

    static void e(C10054a c10054a, InputStream inputStream) {
        if (c10054a.f100687d != null) {
            throw new IllegalStateException("Bit reader already has associated input stream");
        }
        i.b(c10054a.f100686c, c10054a.f100684a, c10054a.f100685b);
        c10054a.f100687d = inputStream;
        c10054a.f100689f = 0L;
        c10054a.f100690g = 64;
        c10054a.f100691h = UserVerificationMethods.USER_VERIFY_ALL;
        c10054a.f100688e = false;
        h(c10054a);
        a(c10054a, false);
        d(c10054a);
        d(c10054a);
    }

    static int f(C10054a c10054a) {
        return (c10054a.f100688e ? (c10054a.f100692i + 3) >> 2 : UserVerificationMethods.USER_VERIFY_ALL) - c10054a.f100691h;
    }

    static int g(C10054a c10054a, int i11) {
        d(c10054a);
        long j11 = c10054a.f100689f;
        int i12 = c10054a.f100690g;
        int i13 = ((int) (j11 >>> i12)) & ((1 << i11) - 1);
        c10054a.f100690g = i12 + i11;
        return i13;
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0035, code lost:
    
        r4.f100688e = true;
        r4.f100692i = r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x003a, code lost:
    
        r1 = r1 + 3;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    static void h(C10054a c10054a) {
        int i11 = c10054a.f100691h;
        if (i11 <= 1015) {
            return;
        }
        if (c10054a.f100688e) {
            if (f(c10054a) < -2) {
                throw new c("No more input");
            }
            return;
        }
        int i12 = i11 << 2;
        int i13 = 4096 - i12;
        byte[] bArr = c10054a.f100684a;
        System.arraycopy(bArr, i12, bArr, 0, i13);
        c10054a.f100691h = 0;
        while (true) {
            if (i13 >= 4096) {
                break;
            }
            try {
                int read = c10054a.f100687d.read(bArr, i13, 4096 - i13);
                if (read <= 0) {
                    break;
                } else {
                    i13 += read;
                }
            } catch (IOException e11) {
                throw new c("Failed to read input", e11);
            }
        }
        i.a(c10054a.f100686c, i13 >> 2);
    }

    static void i(C10054a c10054a) {
        if (c10054a.f100690g == 64) {
            h(c10054a);
            a(c10054a, false);
            d(c10054a);
            d(c10054a);
        }
    }
}
