package G6;

import java.io.InputStream;
import kotlin.UByte;

/* loaded from: classes2.dex */
public class j extends InputStream {

    /* renamed from: a, reason: collision with root package name */
    public final h f3907a;

    /* renamed from: b, reason: collision with root package name */
    public int f3908b;

    /* renamed from: c, reason: collision with root package name */
    public int f3909c;

    public j(h hVar) {
        D6.k.b(Boolean.valueOf(!hVar.isClosed()));
        this.f3907a = (h) D6.k.g(hVar);
        this.f3908b = 0;
        this.f3909c = 0;
    }

    @Override // java.io.InputStream
    public int available() {
        return this.f3907a.size() - this.f3908b;
    }

    @Override // java.io.InputStream
    public void mark(int i10) {
        this.f3909c = this.f3908b;
    }

    @Override // java.io.InputStream
    public boolean markSupported() {
        return true;
    }

    @Override // java.io.InputStream
    public int read() {
        if (available() <= 0) {
            return -1;
        }
        h hVar = this.f3907a;
        int i10 = this.f3908b;
        this.f3908b = i10 + 1;
        return hVar.s(i10) & UByte.MAX_VALUE;
    }

    @Override // java.io.InputStream
    public void reset() {
        this.f3908b = this.f3909c;
    }

    @Override // java.io.InputStream
    public long skip(long j10) {
        D6.k.b(Boolean.valueOf(j10 >= 0));
        int min = Math.min((int) j10, available());
        this.f3908b += min;
        return min;
    }

    @Override // java.io.InputStream
    public int read(byte[] bArr) {
        return read(bArr, 0, bArr.length);
    }

    @Override // java.io.InputStream
    public int read(byte[] bArr, int i10, int i11) {
        if (i10 >= 0 && i11 >= 0 && i10 + i11 <= bArr.length) {
            int available = available();
            if (available <= 0) {
                return -1;
            }
            if (i11 <= 0) {
                return 0;
            }
            int min = Math.min(available, i11);
            this.f3907a.i(this.f3908b, bArr, i10, min);
            this.f3908b += min;
            return min;
        }
        throw new ArrayIndexOutOfBoundsException("length=" + bArr.length + "; regionStart=" + i10 + "; regionLength=" + i11);
    }
}
