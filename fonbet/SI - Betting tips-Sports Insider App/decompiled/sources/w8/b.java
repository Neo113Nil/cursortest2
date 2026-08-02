package w8;

import java.io.OutputStream;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class b extends OutputStream {

    /* renamed from: a, reason: collision with root package name */
    public long f25005a;

    @Override // java.io.OutputStream
    public final void write(int i5) {
        this.f25005a++;
    }

    @Override // java.io.OutputStream
    public final void write(byte[] bArr) {
        this.f25005a += bArr.length;
    }

    @Override // java.io.OutputStream
    public final void write(byte[] bArr, int i5, int i10) {
        int i11;
        if (i5 >= 0 && i5 <= bArr.length && i10 >= 0 && (i11 = i5 + i10) <= bArr.length && i11 >= 0) {
            this.f25005a += i10;
            return;
        }
        throw new IndexOutOfBoundsException();
    }
}
