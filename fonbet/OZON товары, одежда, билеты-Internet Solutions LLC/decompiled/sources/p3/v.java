package p3;

import android.net.Uri;
import java.io.IOException;

/* loaded from: classes8.dex */
public final class v implements InterfaceC8846f {

    /* renamed from: a, reason: collision with root package name */
    public static final v f80125a = new v();

    @Override // p3.InterfaceC8846f
    public final void addTransferListener(z zVar) {
    }

    @Override // p3.InterfaceC8846f
    public final void close() {
    }

    @Override // p3.InterfaceC8846f
    public final Uri getUri() {
        return null;
    }

    @Override // p3.InterfaceC8846f
    public final long open(i iVar) throws IOException {
        throw new IOException("PlaceholderDataSource cannot be opened");
    }

    @Override // j3.InterfaceC7268j
    public final int read(byte[] bArr, int i11, int i12) {
        throw new UnsupportedOperationException();
    }
}
