package androidx.media3.exoplayer.upstream;

import androidx.annotation.Nullable;
import androidx.media3.common.ParserException;
import androidx.media3.datasource.DataSourceException;
import androidx.media3.datasource.HttpDataSource$CleartextNotPermittedException;
import androidx.media3.datasource.HttpDataSource$InvalidResponseCodeException;
import androidx.media3.exoplayer.upstream.Loader;
import androidx.media3.exoplayer.upstream.b;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import java.io.FileNotFoundException;
import java.io.IOException;

/* compiled from: DefaultLoadErrorHandlingPolicy.java */
/* loaded from: classes12.dex */
public class a implements b {
    @Override // androidx.media3.exoplayer.upstream.b
    @Nullable
    public final b.C0065b a(b.a aVar, b.c cVar) {
        if (!d(cVar.a)) {
            return null;
        }
        if (aVar.a(1)) {
            return new b.C0065b(1, 300000L);
        }
        if (aVar.a(2)) {
            return new b.C0065b(2, 60000L);
        }
        return null;
    }

    @Override // androidx.media3.exoplayer.upstream.b
    public final long b(b.c cVar) {
        for (Throwable th = cVar.a; th != null; th = th.getCause()) {
            if ((th instanceof ParserException) || (th instanceof FileNotFoundException) || (th instanceof HttpDataSource$CleartextNotPermittedException) || (th instanceof Loader.UnexpectedLoaderException)) {
                return C.TIME_UNSET;
            }
            if ((th instanceof DataSourceException) && ((DataSourceException) th).reason == 2008) {
                return C.TIME_UNSET;
            }
        }
        return Math.min((cVar.b - 1) * 1000, 5000);
    }

    @Override // androidx.media3.exoplayer.upstream.b
    public final int c(int i) {
        return i == 7 ? 6 : 3;
    }

    public boolean d(IOException iOException) {
        if (!(iOException instanceof HttpDataSource$InvalidResponseCodeException)) {
            return false;
        }
        int i = ((HttpDataSource$InvalidResponseCodeException) iOException).responseCode;
        return i == 403 || i == 404 || i == 410 || i == 416 || i == 500 || i == 503;
    }
}
