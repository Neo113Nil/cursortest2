package b;

import java.io.EOFException;
import java.io.InputStream;

/* renamed from: b.k, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2314k extends AbstractC2322s {

    /* renamed from: c, reason: collision with root package name */
    public int f24125c;

    /* renamed from: d, reason: collision with root package name */
    public int f24126d;

    /* renamed from: f, reason: collision with root package name */
    public boolean f24127f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f24128g;

    public C2314k(InputStream inputStream, int i10) {
        super(inputStream, i10);
        this.f24127f = false;
        this.f24128g = true;
        this.f24125c = inputStream.read();
        int read = inputStream.read();
        this.f24126d = read;
        if (read < 0) {
            throw new EOFException();
        }
        k();
    }

    public final boolean k() {
        if (!this.f24127f && this.f24128g && this.f24125c == 0 && this.f24126d == 0) {
            this.f24127f = true;
            d();
        }
        return this.f24127f;
    }

    @Override // java.io.InputStream
    public final int read() {
        if (k()) {
            return -1;
        }
        int read = this.f24142a.read();
        if (read < 0) {
            throw new EOFException();
        }
        int i10 = this.f24125c;
        this.f24125c = this.f24126d;
        this.f24126d = read;
        return i10;
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr, int i10, int i11) {
        if (this.f24128g || i11 < 3) {
            return super.read(bArr, i10, i11);
        }
        if (this.f24127f) {
            return -1;
        }
        int read = this.f24142a.read(bArr, i10 + 2, i11 - 2);
        if (read < 0) {
            throw new EOFException();
        }
        bArr[i10] = (byte) this.f24125c;
        bArr[i10 + 1] = (byte) this.f24126d;
        this.f24125c = this.f24142a.read();
        int read2 = this.f24142a.read();
        this.f24126d = read2;
        if (read2 >= 0) {
            return read + 2;
        }
        throw new EOFException();
    }
}
