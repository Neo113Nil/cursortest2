package J6;

import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;
import kotlin.UByte;

/* loaded from: classes2.dex */
public class b extends FilterInputStream {

    /* renamed from: a, reason: collision with root package name */
    public int f5949a;

    /* renamed from: b, reason: collision with root package name */
    public int f5950b;
    private final byte[] mTail;

    public b(InputStream inputStream, byte[] bArr) {
        super(inputStream);
        inputStream.getClass();
        bArr.getClass();
        this.mTail = bArr;
    }

    public final int d() {
        int i10 = this.f5949a;
        byte[] bArr = this.mTail;
        if (i10 >= bArr.length) {
            return -1;
        }
        this.f5949a = i10 + 1;
        return bArr[i10] & UByte.MAX_VALUE;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public void mark(int i10) {
        if (((FilterInputStream) this).in.markSupported()) {
            super.mark(i10);
            this.f5950b = this.f5949a;
        }
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public int read() {
        int read = ((FilterInputStream) this).in.read();
        return read != -1 ? read : d();
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public void reset() {
        if (!((FilterInputStream) this).in.markSupported()) {
            throw new IOException("mark is not supported");
        }
        ((FilterInputStream) this).in.reset();
        this.f5949a = this.f5950b;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public int read(byte[] bArr) {
        return read(bArr, 0, bArr.length);
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public int read(byte[] bArr, int i10, int i11) {
        int read = ((FilterInputStream) this).in.read(bArr, i10, i11);
        if (read != -1) {
            return read;
        }
        int i12 = 0;
        if (i11 == 0) {
            return 0;
        }
        while (i12 < i11) {
            int d10 = d();
            if (d10 == -1) {
                break;
            }
            bArr[i10 + i12] = (byte) d10;
            i12++;
        }
        if (i12 > 0) {
            return i12;
        }
        return -1;
    }
}
