package androidx.media3.datasource.cache;

import androidx.annotation.Nullable;
import androidx.media3.datasource.cache.Cache;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import xsna.ahn;
import xsna.evk;
import xsna.fxc0;
import xsna.pfg0;
import xsna.wuk;
import xsna.y2r0;

/* loaded from: classes12.dex */
public final class CacheDataSink implements wuk {
    public final Cache a;
    public final long b;
    public final int c;

    @Nullable
    public evk d;
    public long e;

    @Nullable
    public File f;

    @Nullable
    public OutputStream g;
    public long h;
    public long i;
    public pfg0 j;

    public static final class CacheDataSinkException extends Cache.CacheException {
    }

    public static final class a implements wuk.a {
        public Cache a;
        public long b = 5242880;

        public final void a(Cache cache) {
            this.a = cache;
        }

        @Override // xsna.wuk.a
        public final CacheDataSink createDataSink() {
            Cache cache = this.a;
            cache.getClass();
            return new CacheDataSink(cache, this.b);
        }
    }

    public CacheDataSink(Cache cache, long j) {
        fxc0.A(j > 0 || j == -1, "fragmentSize must be positive or C.LENGTH_UNSET.");
        if (j != -1 && j < 2097152) {
            ahn.F("fragmentSize is below the minimum recommended value of 2097152. This may cause poor cache performance.");
        }
        cache.getClass();
        this.a = cache;
        this.b = j == -1 ? Long.MAX_VALUE : j;
        this.c = com.mbridge.msdk.playercommon.exoplayer2.upstream.cache.CacheDataSink.DEFAULT_BUFFER_SIZE;
    }

    public final void a() throws IOException {
        OutputStream outputStream = this.g;
        if (outputStream == null) {
            return;
        }
        try {
            outputStream.flush();
            y2r0.h(this.g);
            this.g = null;
            File file = this.f;
            this.f = null;
            this.a.e(file, this.h);
        } catch (Throwable th) {
            y2r0.h(this.g);
            this.g = null;
            File file2 = this.f;
            this.f = null;
            file2.delete();
            throw th;
        }
    }

    public final void b(evk evkVar) throws IOException {
        long j = evkVar.h;
        long min = j != -1 ? Math.min(j - this.i, this.e) : -1L;
        String str = evkVar.i;
        String str2 = y2r0.a;
        this.f = this.a.startFile(str, evkVar.g + this.i, min);
        FileOutputStream fileOutputStream = new FileOutputStream(this.f);
        int i = this.c;
        if (i > 0) {
            pfg0 pfg0Var = this.j;
            if (pfg0Var == null) {
                this.j = new pfg0(fileOutputStream, i);
            } else {
                pfg0Var.b(fileOutputStream);
            }
            this.g = this.j;
        } else {
            this.g = fileOutputStream;
        }
        this.h = 0L;
    }

    @Override // xsna.wuk
    public final void close() throws CacheDataSinkException {
        if (this.d == null) {
            return;
        }
        try {
            a();
        } catch (IOException e) {
            throw new CacheDataSinkException(e);
        }
    }

    @Override // xsna.wuk
    public final void open(evk evkVar) throws CacheDataSinkException {
        evkVar.i.getClass();
        if (evkVar.h == -1 && evkVar.c(2)) {
            this.d = null;
            return;
        }
        this.d = evkVar;
        this.e = evkVar.c(4) ? this.b : Long.MAX_VALUE;
        this.i = 0L;
        try {
            b(evkVar);
        } catch (IOException e) {
            throw new CacheDataSinkException(e);
        }
    }

    @Override // xsna.wuk
    public final void write(byte[] bArr, int i, int i2) throws CacheDataSinkException {
        evk evkVar = this.d;
        if (evkVar == null) {
            return;
        }
        int i3 = 0;
        while (i3 < i2) {
            try {
                if (this.h == this.e) {
                    a();
                    b(evkVar);
                }
                int min = (int) Math.min(i2 - i3, this.e - this.h);
                OutputStream outputStream = this.g;
                String str = y2r0.a;
                outputStream.write(bArr, i + i3, min);
                i3 += min;
                long j = min;
                this.h += j;
                this.i += j;
            } catch (IOException e) {
                throw new CacheDataSinkException(e);
            }
        }
    }
}
