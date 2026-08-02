package androidx.media3.exoplayer.offline;

import android.net.Uri;
import android.util.SparseArray;
import androidx.media3.datasource.cache.a;
import androidx.media3.exoplayer.offline.DownloadRequest;
import java.util.concurrent.Executor;
import xsna.d9v;
import xsna.e5i0;
import xsna.fco;
import xsna.kr10;
import xsna.lhg;
import xsna.osk;
import xsna.y2r0;

/* compiled from: DefaultDownloaderFactory.java */
/* loaded from: classes.dex */
public class b implements fco {
    public final a.b b;
    public final Executor c;
    public final SparseArray<e5i0> d;

    public b(a.b bVar, Executor executor) {
        bVar.getClass();
        this.b = bVar;
        executor.getClass();
        this.c = executor;
        this.d = new SparseArray<>();
    }

    public static e5i0 b(Class<? extends e5i0> cls, a.b bVar) {
        try {
            return cls.getConstructor(a.b.class).newInstance(bVar);
        } catch (Exception e) {
            throw new IllegalStateException("Downloader factory missing", e);
        }
    }

    @Override // xsna.fco
    public d a(DownloadRequest downloadRequest) {
        e5i0 c;
        Uri uri = downloadRequest.c;
        String str = downloadRequest.g;
        int J = y2r0.J(uri, downloadRequest.d);
        if (J != 0 && J != 1 && J != 2) {
            if (J != 4) {
                throw new IllegalArgumentException(lhg.a(J, "Unsupported type: "));
            }
            DownloadRequest.ByteRange byteRange = downloadRequest.i;
            kr10.a aVar = new kr10.a();
            aVar.f(uri);
            aVar.b(str);
            return new e(aVar.a(), this.b, this.c, byteRange != null ? byteRange.b : 0L, byteRange != null ? byteRange.c : -1L);
        }
        a.b bVar = this.b;
        SparseArray<e5i0> sparseArray = this.d;
        if (y2r0.l(sparseArray, J)) {
            c = sparseArray.get(J);
        } else {
            try {
                c = c(J, bVar);
            } catch (ClassNotFoundException e) {
                throw new IllegalStateException(lhg.a(J, "Module missing for content type "), e);
            }
        }
        kr10.a aVar2 = new kr10.a();
        DownloadRequest.TimeRange timeRange = downloadRequest.j;
        aVar2.f(uri);
        aVar2.e(downloadRequest.e);
        aVar2.b(str);
        kr10 a = aVar2.a();
        if (timeRange != null) {
            c.a(timeRange.b).b(timeRange.c);
        }
        return c.d(this.c).c(a);
    }

    public final e5i0 c(int i, a.b bVar) throws ClassNotFoundException {
        e5i0 b;
        if (i == 0) {
            b = b(osk.a.class.asSubclass(e5i0.class), bVar);
        } else if (i == 1) {
            b = b(Class.forName("androidx.media3.exoplayer.smoothstreaming.offline.SsDownloader$Factory").asSubclass(e5i0.class), bVar);
        } else {
            if (i != 2) {
                throw new IllegalArgumentException(lhg.a(i, "Unsupported type: "));
            }
            b = b(d9v.a.class.asSubclass(e5i0.class), bVar);
        }
        this.d.put(i, b);
        return b;
    }
}
