package x3;

import java.io.ByteArrayOutputStream;
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.StandardCharsets;
import kotlin.jvm.internal.ByteCompanionObject;

/* renamed from: x3.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C6794a {

    /* renamed from: a, reason: collision with root package name */
    public int f67828a;

    /* renamed from: b, reason: collision with root package name */
    public final int f67829b;
    private final byte[] buffer;

    public C6794a(byte[] bArr) {
        this(bArr, 0, bArr.length);
    }

    public static void a(int i10, int i11, int i12) {
        if (i11 == i12) {
            return;
        }
        throw new IOException("Field " + i10 + ": expected " + o(i11) + " (wire type " + i11 + ") but got " + o(i12) + " (wire type " + i12 + ")");
    }

    public static C6794a b(InputStream inputStream) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        byte[] bArr = new byte[8192];
        while (true) {
            int read = inputStream.read(bArr);
            if (read == -1) {
                return new C6794a(byteArrayOutputStream.toByteArray());
            }
            byteArrayOutputStream.write(bArr, 0, read);
        }
    }

    public static int c(int i10) {
        return i10 >>> 3;
    }

    public static int d(int i10) {
        return i10 & 7;
    }

    public static String o(int i10) {
        return i10 != 0 ? i10 != 1 ? i10 != 2 ? i10 != 5 ? "unknown" : "fixed32" : "length-delimited" : "fixed64" : "varint";
    }

    public boolean e() {
        return this.f67828a < this.f67829b;
    }

    public boolean f() {
        return k() != 0;
    }

    public byte[] g() {
        int l10 = l();
        if (l10 < 0) {
            throw new IOException("Negative length: " + l10);
        }
        if (m() < l10) {
            throw new EOFException("Not enough bytes for length-delimited field");
        }
        byte[] bArr = new byte[l10];
        System.arraycopy(this.buffer, this.f67828a, bArr, 0, l10);
        this.f67828a += l10;
        return bArr;
    }

    public C6794a h() {
        return new C6794a(g());
    }

    public String i() {
        return new String(g(), StandardCharsets.UTF_8);
    }

    public int j() {
        if (e()) {
            return (int) k();
        }
        return 0;
    }

    public long k() {
        long j10 = 0;
        for (int i10 = 0; i10 < 64; i10 += 7) {
            if (!e()) {
                throw new EOFException("Truncated varint");
            }
            byte[] bArr = this.buffer;
            int i11 = this.f67828a;
            this.f67828a = i11 + 1;
            j10 |= (r3 & ByteCompanionObject.MAX_VALUE) << i10;
            if ((bArr[i11] & ByteCompanionObject.MIN_VALUE) == 0) {
                return j10;
            }
        }
        throw new IOException("Malformed varint");
    }

    public int l() {
        return (int) k();
    }

    public int m() {
        return this.f67829b - this.f67828a;
    }

    public void n(int i10) {
        if (i10 == 0) {
            k();
            return;
        }
        if (i10 == 1) {
            if (m() < 8) {
                throw new EOFException("Not enough bytes to skip fixed64");
            }
            this.f67828a += 8;
        } else {
            if (i10 == 2) {
                int l10 = l();
                if (m() < l10) {
                    throw new EOFException("Not enough bytes to skip length-delimited");
                }
                this.f67828a += l10;
                return;
            }
            if (i10 == 5) {
                if (m() < 4) {
                    throw new EOFException("Not enough bytes to skip fixed32");
                }
                this.f67828a += 4;
            } else {
                throw new IOException("Unknown wire type: " + i10);
            }
        }
    }

    public C6794a(byte[] bArr, int i10, int i11) {
        this.buffer = bArr;
        this.f67828a = i10;
        this.f67829b = i10 + i11;
    }
}
