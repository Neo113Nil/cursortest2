package b;

import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;

/* renamed from: b.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2302c extends AbstractC2322s {

    /* renamed from: e, reason: collision with root package name */
    public static final byte[] f24090e = new byte[0];

    /* renamed from: c, reason: collision with root package name */
    public final int f24091c;

    /* renamed from: d, reason: collision with root package name */
    public int f24092d;

    public C2302c(InputStream inputStream, int i10, int i11) {
        super(inputStream, i11);
        if (i10 <= 0) {
            if (i10 < 0) {
                throw new IllegalArgumentException("negative lengths not allowed");
            }
            d();
        }
        this.f24091c = i10;
        this.f24092d = i10;
    }

    public final byte[] k() {
        int i10 = this.f24092d;
        if (i10 == 0) {
            return f24090e;
        }
        int i11 = this.f24143b;
        if (i10 >= i11) {
            throw new IOException("corrupted stream - out of bounds length found: " + this.f24092d + " >= " + i11);
        }
        byte[] bArr = new byte[i10];
        InputStream inputStream = this.f24142a;
        int i12 = 0;
        while (i12 < i10) {
            int read = inputStream.read(bArr, i12, i10 - i12);
            if (read < 0) {
                break;
            }
            i12 += read;
        }
        int i13 = i10 - i12;
        this.f24092d = i13;
        if (i13 == 0) {
            d();
            return bArr;
        }
        throw new EOFException("DEF length " + this.f24091c + " object truncated by " + this.f24092d);
    }

    @Override // java.io.InputStream
    public final int read() {
        if (this.f24092d == 0) {
            return -1;
        }
        int read = this.f24142a.read();
        if (read >= 0) {
            int i10 = this.f24092d - 1;
            this.f24092d = i10;
            if (i10 == 0) {
                d();
            }
            return read;
        }
        throw new EOFException("DEF length " + this.f24091c + " object truncated by " + this.f24092d);
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr, int i10, int i11) {
        int i12 = this.f24092d;
        if (i12 == 0) {
            return -1;
        }
        int read = this.f24142a.read(bArr, i10, Math.min(i11, i12));
        if (read >= 0) {
            int i13 = this.f24092d - read;
            this.f24092d = i13;
            if (i13 == 0) {
                d();
            }
            return read;
        }
        throw new EOFException("DEF length " + this.f24091c + " object truncated by " + this.f24092d);
    }
}
