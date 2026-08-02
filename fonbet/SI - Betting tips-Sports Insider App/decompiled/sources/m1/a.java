package m1;

import android.media.MediaDataSource;
import java.io.IOException;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class a extends MediaDataSource {

    /* renamed from: a, reason: collision with root package name */
    public long f20137a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ f f20138b;

    public a(f fVar) {
        this.f20138b = fVar;
    }

    @Override // android.media.MediaDataSource
    public final long getSize() {
        return -1L;
    }

    @Override // android.media.MediaDataSource
    public final int readAt(long j, byte[] bArr, int i5, int i10) {
        if (i10 == 0) {
            return 0;
        }
        if (j < 0) {
            return -1;
        }
        try {
            long j6 = this.f20137a;
            f fVar = this.f20138b;
            if (j6 != j) {
                if (j6 >= 0 && j >= j6 + fVar.f20139a.available()) {
                    return -1;
                }
                fVar.k(j);
                this.f20137a = j;
            }
            if (i10 > fVar.f20139a.available()) {
                i10 = fVar.f20139a.available();
            }
            int read = fVar.read(bArr, i5, i10);
            if (read >= 0) {
                this.f20137a += read;
                return read;
            }
        } catch (IOException unused) {
        }
        this.f20137a = -1L;
        return -1;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
    }
}
