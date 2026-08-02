package androidx.media3.datasource;

import android.net.Uri;
import android.system.ErrnoException;
import android.system.OsConstants;
import android.text.TextUtils;
import androidx.annotation.Nullable;
import androidx.media3.datasource.a;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;
import xsna.evk;
import xsna.gc6;
import xsna.xe9;
import xsna.y2r0;

/* loaded from: classes12.dex */
public final class FileDataSource extends gc6 {

    @Nullable
    public RandomAccessFile r;

    @Nullable
    public Uri s;
    public long t;
    public boolean u;

    public static class FileDataSourceException extends DataSourceException {
    }

    /* loaded from: classes.dex */
    public static final class a implements a.InterfaceC0045a {
        @Override // androidx.media3.datasource.a.InterfaceC0045a
        public final androidx.media3.datasource.a createDataSource() {
            return new FileDataSource();
        }
    }

    public FileDataSource() {
        super(false);
    }

    @Override // androidx.media3.datasource.a
    public final void close() throws FileDataSourceException {
        this.s = null;
        try {
            try {
                RandomAccessFile randomAccessFile = this.r;
                if (randomAccessFile != null) {
                    randomAccessFile.close();
                }
            } catch (IOException e) {
                throw new FileDataSourceException(e, 2000);
            }
        } finally {
            this.r = null;
            if (this.u) {
                this.u = false;
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
    public final long open(evk evkVar) throws FileDataSourceException {
        Uri uri = evkVar.a;
        long j = evkVar.g;
        this.s = uri;
        transferInitializing(evkVar);
        try {
            String path = uri.getPath();
            path.getClass();
            RandomAccessFile randomAccessFile = new RandomAccessFile(path, "r");
            this.r = randomAccessFile;
            try {
                randomAccessFile.seek(j);
                long j2 = evkVar.h;
                if (j2 == -1) {
                    j2 = this.r.length() - j;
                }
                this.t = j2;
                if (j2 < 0) {
                    throw new FileDataSourceException(null, null, 2008);
                }
                this.u = true;
                transferStarted(evkVar);
                return this.t;
            } catch (IOException e) {
                throw new FileDataSourceException(e, 2000);
            }
        } catch (FileNotFoundException e2) {
            if (TextUtils.isEmpty(uri.getQuery()) && TextUtils.isEmpty(uri.getFragment())) {
                throw new FileDataSourceException(e2, ((e2.getCause() instanceof ErrnoException) && ((ErrnoException) e2.getCause()).errno == OsConstants.EACCES) ? 2006 : 2005);
            }
            String path2 = uri.getPath();
            String query = uri.getQuery();
            String fragment = uri.getFragment();
            StringBuilder a2 = xe9.a("uri has query and/or fragment, which are not supported. Did you call Uri.parse() on a string containing '?' or '#'? Use Uri.fromFile(new File(path)) to avoid this. path=", path2, ",query=", query, ",fragment=");
            a2.append(fragment);
            throw new FileDataSourceException(a2.toString(), e2, 1004);
        } catch (SecurityException e3) {
            throw new FileDataSourceException(e3, 2006);
        } catch (RuntimeException e4) {
            throw new FileDataSourceException(e4, 2000);
        }
    }

    @Override // xsna.suk
    public final int read(byte[] bArr, int i, int i2) throws FileDataSourceException {
        if (i2 == 0) {
            return 0;
        }
        long j = this.t;
        if (j == 0) {
            return -1;
        }
        try {
            RandomAccessFile randomAccessFile = this.r;
            String str = y2r0.a;
            int read = randomAccessFile.read(bArr, i, (int) Math.min(j, i2));
            if (read > 0) {
                this.t -= read;
                bytesTransferred(read);
            }
            return read;
        } catch (IOException e) {
            throw new FileDataSourceException(e, 2000);
        }
    }
}
