package p3;

import N3.C3660k;
import android.net.Uri;
import android.system.ErrnoException;
import android.system.OsConstants;
import android.text.TextUtils;
import com.google.android.gms.location.GeofenceStatusCodes;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;
import m3.N;
import p3.InterfaceC8846f;
import ru.ozon.app.android.video.manager.CacheTransferInfoProvider;

/* loaded from: classes.dex */
public final class n extends AbstractC8842b {

    /* renamed from: a, reason: collision with root package name */
    private RandomAccessFile f80113a;

    /* renamed from: b, reason: collision with root package name */
    private Uri f80114b;

    /* renamed from: c, reason: collision with root package name */
    private long f80115c;

    /* renamed from: d, reason: collision with root package name */
    private boolean f80116d;

    public static final class a implements InterfaceC8846f.a {

        /* renamed from: a, reason: collision with root package name */
        private CacheTransferInfoProvider f80117a;

        public final void a(CacheTransferInfoProvider cacheTransferInfoProvider) {
            this.f80117a = cacheTransferInfoProvider;
        }

        @Override // p3.InterfaceC8846f.a
        public final InterfaceC8846f createDataSource() {
            n nVar = new n(false);
            CacheTransferInfoProvider cacheTransferInfoProvider = this.f80117a;
            if (cacheTransferInfoProvider != null) {
                nVar.addTransferListener(cacheTransferInfoProvider);
            }
            return nVar;
        }
    }

    public static class b extends C8847g {
    }

    @Override // p3.InterfaceC8846f
    public final void close() throws b {
        this.f80114b = null;
        try {
            try {
                RandomAccessFile randomAccessFile = this.f80113a;
                if (randomAccessFile != null) {
                    randomAccessFile.close();
                }
            } catch (IOException e11) {
                throw new b(2000, e11);
            }
        } finally {
            this.f80113a = null;
            if (this.f80116d) {
                this.f80116d = false;
                transferEnded();
            }
        }
    }

    @Override // p3.InterfaceC8846f
    public final Uri getUri() {
        return this.f80114b;
    }

    @Override // p3.InterfaceC8846f
    public final long open(i iVar) throws b {
        Uri uri = iVar.f80066a;
        long j11 = iVar.f80071f;
        this.f80114b = uri;
        transferInitializing(iVar);
        try {
            String path = uri.getPath();
            path.getClass();
            RandomAccessFile randomAccessFile = new RandomAccessFile(path, "r");
            this.f80113a = randomAccessFile;
            try {
                randomAccessFile.seek(j11);
                long j12 = iVar.f80072g;
                if (j12 == -1) {
                    j12 = this.f80113a.length() - j11;
                }
                this.f80115c = j12;
                if (j12 < 0) {
                    throw new b(2008, null, null);
                }
                this.f80116d = true;
                transferStarted(iVar);
                return this.f80115c;
            } catch (IOException e11) {
                throw new b(2000, e11);
            }
        } catch (FileNotFoundException e12) {
            if (TextUtils.isEmpty(uri.getQuery()) && TextUtils.isEmpty(uri.getFragment())) {
                throw new b(((e12.getCause() instanceof ErrnoException) && ((ErrnoException) e12.getCause()).errno == OsConstants.EACCES) ? 2006 : 2005, e12);
            }
            String path2 = uri.getPath();
            String query = uri.getQuery();
            String fragment = uri.getFragment();
            StringBuilder d11 = C3660k.d("uri has query and/or fragment, which are not supported. Did you call Uri.parse() on a string containing '?' or '#'? Use Uri.fromFile(new File(path)) to avoid this. path=", path2, ",query=", query, ",fragment=");
            d11.append(fragment);
            throw new b(GeofenceStatusCodes.GEOFENCE_INSUFFICIENT_LOCATION_PERMISSION, e12, d11.toString());
        } catch (SecurityException e13) {
            throw new b(2006, e13);
        } catch (RuntimeException e14) {
            throw new b(2000, e14);
        }
    }

    @Override // j3.InterfaceC7268j
    public final int read(byte[] bArr, int i11, int i12) throws b {
        if (i12 == 0) {
            return 0;
        }
        long j11 = this.f80115c;
        if (j11 == 0) {
            return -1;
        }
        try {
            RandomAccessFile randomAccessFile = this.f80113a;
            int i13 = N.f74289a;
            int read = randomAccessFile.read(bArr, i11, (int) Math.min(j11, i12));
            if (read > 0) {
                this.f80115c -= read;
                bytesTransferred(read);
            }
            return read;
        } catch (IOException e11) {
            throw new b(2000, e11);
        }
    }
}
