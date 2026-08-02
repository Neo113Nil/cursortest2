package org.brotli.dec;

import java.io.IOException;
import java.io.InputStream;

/* loaded from: classes5.dex */
public final class a {

    /* renamed from: b, reason: collision with root package name */
    public InputStream f62150b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f62151c;

    /* renamed from: d, reason: collision with root package name */
    public long f62152d;

    /* renamed from: e, reason: collision with root package name */
    public int f62153e;

    /* renamed from: f, reason: collision with root package name */
    public int f62154f;
    private final byte[] byteBuffer = new byte[4160];
    private final int[] intBuffer = new int[1040];

    /* renamed from: a, reason: collision with root package name */
    public final i f62149a = new i();

    /* renamed from: g, reason: collision with root package name */
    public int f62155g = 0;

    public static void a(a aVar, boolean z10) {
        if (aVar.f62151c) {
            int i10 = ((aVar.f62154f << 2) + ((aVar.f62153e + 7) >> 3)) - 8;
            int i11 = aVar.f62155g;
            if (i10 > i11) {
                throw new c("Read after end");
            }
            if (z10 && i10 != i11) {
                throw new c("Unused bytes after end");
            }
        }
    }

    public static void b(a aVar) {
        InputStream inputStream = aVar.f62150b;
        aVar.f62150b = null;
        if (inputStream != null) {
            inputStream.close();
        }
    }

    public static void c(a aVar, byte[] bArr, int i10, int i11) {
        if ((aVar.f62153e & 7) != 0) {
            throw new c("Unaligned copyBytes");
        }
        while (true) {
            int i12 = aVar.f62153e;
            if (i12 == 64 || i11 == 0) {
                break;
            }
            bArr[i10] = (byte) (aVar.f62152d >>> i12);
            aVar.f62153e = i12 + 8;
            i11--;
            i10++;
        }
        if (i11 == 0) {
            return;
        }
        int min = Math.min(f(aVar), i11 >> 2);
        if (min > 0) {
            int i13 = min << 2;
            System.arraycopy(aVar.byteBuffer, aVar.f62154f << 2, bArr, i10, i13);
            i10 += i13;
            i11 -= i13;
            aVar.f62154f += min;
        }
        if (i11 == 0) {
            return;
        }
        if (f(aVar) <= 0) {
            while (i11 > 0) {
                try {
                    int read = aVar.f62150b.read(bArr, i10, i11);
                    if (read == -1) {
                        throw new c("Unexpected end of input");
                    }
                    i10 += read;
                    i11 -= read;
                } catch (IOException e10) {
                    throw new c("Failed to read input", e10);
                }
            }
            return;
        }
        d(aVar);
        while (i11 != 0) {
            long j10 = aVar.f62152d;
            int i14 = aVar.f62153e;
            bArr[i10] = (byte) (j10 >>> i14);
            aVar.f62153e = i14 + 8;
            i11--;
            i10++;
        }
        a(aVar, false);
    }

    public static void d(a aVar) {
        int i10 = aVar.f62153e;
        if (i10 >= 32) {
            int[] iArr = aVar.intBuffer;
            aVar.f62154f = aVar.f62154f + 1;
            aVar.f62152d = (iArr[r3] << 32) | (aVar.f62152d >>> 32);
            aVar.f62153e = i10 - 32;
        }
    }

    public static void e(a aVar, InputStream inputStream) {
        if (aVar.f62150b != null) {
            throw new IllegalStateException("Bit reader already has associated input stream");
        }
        i.b(aVar.f62149a, aVar.byteBuffer, aVar.intBuffer);
        aVar.f62150b = inputStream;
        aVar.f62152d = 0L;
        aVar.f62153e = 64;
        aVar.f62154f = 1024;
        aVar.f62151c = false;
        h(aVar);
    }

    public static int f(a aVar) {
        return (aVar.f62151c ? (aVar.f62155g + 3) >> 2 : 1024) - aVar.f62154f;
    }

    public static void g(a aVar) {
        int i10 = (64 - aVar.f62153e) & 7;
        if (i10 != 0 && i(aVar, i10) != 0) {
            throw new c("Corrupted padding bits");
        }
    }

    public static void h(a aVar) {
        j(aVar);
        a(aVar, false);
        d(aVar);
        d(aVar);
    }

    public static int i(a aVar, int i10) {
        d(aVar);
        long j10 = aVar.f62152d;
        int i11 = aVar.f62153e;
        int i12 = ((int) (j10 >>> i11)) & ((1 << i10) - 1);
        aVar.f62153e = i11 + i10;
        return i12;
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0037, code lost:
    
        r4.f62151c = true;
        r4.f62155g = r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x003c, code lost:
    
        r1 = r1 + 3;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void j(a aVar) {
        int i10 = aVar.f62154f;
        if (i10 <= 1015) {
            return;
        }
        if (aVar.f62151c) {
            if (f(aVar) < -2) {
                throw new c("No more input");
            }
            return;
        }
        int i11 = i10 << 2;
        int i12 = 4096 - i11;
        byte[] bArr = aVar.byteBuffer;
        System.arraycopy(bArr, i11, bArr, 0, i12);
        aVar.f62154f = 0;
        while (true) {
            if (i12 >= 4096) {
                break;
            }
            try {
                int read = aVar.f62150b.read(aVar.byteBuffer, i12, 4096 - i12);
                if (read <= 0) {
                    break;
                } else {
                    i12 += read;
                }
            } catch (IOException e10) {
                throw new c("Failed to read input", e10);
            }
        }
        i.a(aVar.f62149a, i12 >> 2);
    }

    public static void k(a aVar) {
        if (aVar.f62153e == 64) {
            h(aVar);
        }
    }
}
