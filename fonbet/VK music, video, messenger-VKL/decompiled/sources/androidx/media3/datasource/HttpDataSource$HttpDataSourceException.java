package androidx.media3.datasource;

import androidx.annotation.Nullable;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.net.SocketTimeoutException;
import xsna.evk;
import xsna.o19;

/* loaded from: classes12.dex */
public class HttpDataSource$HttpDataSourceException extends DataSourceException {
    public final evk dataSpec;
    public final int type;

    public HttpDataSource$HttpDataSourceException(evk evkVar, int i) {
        super(i == 2000 ? 2001 : i);
        this.dataSpec = evkVar;
        this.type = 1;
    }

    public static HttpDataSource$HttpDataSourceException a(IOException iOException, evk evkVar, int i) {
        String message = iOException.getMessage();
        int i2 = iOException instanceof SocketTimeoutException ? 2002 : iOException instanceof InterruptedIOException ? 1004 : (message == null || !o19.u(message).matches("cleartext.*not permitted.*")) ? 2001 : 2007;
        return i2 == 2007 ? new HttpDataSource$CleartextNotPermittedException("Cleartext HTTP traffic not permitted. See https://developer.android.com/guide/topics/media/issues/cleartext-not-permitted", iOException, evkVar, 2007) : new HttpDataSource$HttpDataSourceException(iOException, evkVar, i2, i);
    }

    public HttpDataSource$HttpDataSourceException(String str, evk evkVar, int i) {
        super(str, i == 2000 ? 2001 : i);
        this.dataSpec = evkVar;
        this.type = 1;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public HttpDataSource$HttpDataSourceException(IOException iOException, evk evkVar, int i, int i2) {
        super(iOException, i);
        if (i == 2000 && i2 == 1) {
            i = 2001;
        }
        this.dataSpec = evkVar;
        this.type = i2;
    }

    public HttpDataSource$HttpDataSourceException(String str, @Nullable IOException iOException, evk evkVar, int i) {
        super(str, iOException, i == 2000 ? 2001 : i);
        this.dataSpec = evkVar;
        this.type = 1;
    }
}
