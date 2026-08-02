package androidx.media3.datasource;

import android.content.Context;
import android.content.res.AssetManager;
import android.net.Uri;
import androidx.annotation.Nullable;
import androidx.credentials.exceptions.publickeycredential.DomExceptionUtils;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import xsna.evk;
import xsna.gc6;
import xsna.y2r0;

/* loaded from: classes12.dex */
public final class AssetDataSource extends gc6 {
    public final AssetManager r;

    @Nullable
    public Uri s;

    @Nullable
    public InputStream t;
    public long u;
    public boolean v;

    public static final class AssetDataSourceException extends DataSourceException {
    }

    public AssetDataSource(Context context) {
        super(false);
        this.r = context.getAssets();
    }

    @Override // androidx.media3.datasource.a
    public final void close() throws AssetDataSourceException {
        this.s = null;
        try {
            try {
                InputStream inputStream = this.t;
                if (inputStream != null) {
                    inputStream.close();
                }
            } catch (IOException e) {
                throw new AssetDataSourceException(e, 2000);
            }
        } finally {
            this.t = null;
            if (this.v) {
                this.v = false;
                transferEnded();
            }
        }
    }

    @Override // androidx.media3.datasource.a
    @Nullable
    public final Uri getUri() {
        return this.s;
    }

    @Override // androidx.media3.datasource.a
    public final long open(evk evkVar) throws AssetDataSourceException {
        try {
            Uri uri = evkVar.a;
            long j = evkVar.g;
            this.s = uri;
            String path = uri.getPath();
            path.getClass();
            if (path.startsWith("/android_asset/")) {
                path = path.substring(15);
            } else if (path.startsWith(DomExceptionUtils.SEPARATOR)) {
                path = path.substring(1);
            }
            transferInitializing(evkVar);
            InputStream open = this.r.open(path, 1);
            this.t = open;
            if (open.skip(j) < j) {
                throw new AssetDataSourceException(null, 2008);
            }
            long j2 = evkVar.h;
            if (j2 != -1) {
                this.u = j2;
            } else {
                long available = this.t.available();
                this.u = available;
                if (available == 2147483647L) {
                    this.u = -1L;
                }
            }
            this.v = true;
            transferStarted(evkVar);
            return this.u;
        } catch (AssetDataSourceException e) {
            throw e;
        } catch (IOException e2) {
            throw new AssetDataSourceException(e2, e2 instanceof FileNotFoundException ? 2005 : 2000);
        }
    }

    @Override // xsna.suk
    public final int read(byte[] bArr, int i, int i2) throws AssetDataSourceException {
        if (i2 == 0) {
            return 0;
        }
        long j = this.u;
        if (j != 0) {
            if (j != -1) {
                try {
                    i2 = (int) Math.min(j, i2);
                } catch (IOException e) {
                    throw new AssetDataSourceException(e, 2000);
                }
            }
            InputStream inputStream = this.t;
            String str = y2r0.a;
            int read = inputStream.read(bArr, i, i2);
            if (read != -1) {
                long j2 = this.u;
                if (j2 != -1) {
                    this.u = j2 - read;
                }
                bytesTransferred(read);
                return read;
            }
        }
        return -1;
    }
}
