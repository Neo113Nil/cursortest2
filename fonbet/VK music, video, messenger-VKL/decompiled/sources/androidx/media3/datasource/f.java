package androidx.media3.datasource;

import android.net.Uri;
import androidx.annotation.Nullable;
import java.io.IOException;
import xsna.evk;
import xsna.ksa0;
import xsna.mjp0;

/* compiled from: PlaceholderDataSource.java */
/* loaded from: classes12.dex */
public final class f implements a {
    public static final f a = new f();
    public static final ksa0 b = new ksa0();

    @Override // androidx.media3.datasource.a
    @Nullable
    public final Uri getUri() {
        return null;
    }

    @Override // androidx.media3.datasource.a
    public final long open(evk evkVar) throws IOException {
        throw new IOException("PlaceholderDataSource cannot be opened");
    }

    @Override // xsna.suk
    public final int read(byte[] bArr, int i, int i2) {
        throw new UnsupportedOperationException();
    }

    @Override // androidx.media3.datasource.a
    public final void close() {
    }

    @Override // androidx.media3.datasource.a
    public final void addTransferListener(mjp0 mjp0Var) {
    }
}
