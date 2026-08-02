package m1;

import java.io.InputStream;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class f extends b {
    public f(byte[] bArr) {
        super(bArr);
        this.f20139a.mark(Integer.MAX_VALUE);
    }

    public final void k(long j) {
        int i5 = this.f20140b;
        if (i5 > j) {
            this.f20140b = 0;
            this.f20139a.reset();
        } else {
            j -= i5;
        }
        c((int) j);
    }

    public f(InputStream inputStream) {
        super(inputStream);
        if (inputStream.markSupported()) {
            this.f20139a.mark(Integer.MAX_VALUE);
            return;
        }
        throw new IllegalArgumentException("Cannot create SeekableByteOrderedDataInputStream with stream that does not support mark/reset");
    }
}
