package com.fyber.inneractive.sdk.player.exoplayer2.upstream;

import android.net.Uri;
import android.os.SystemClock;
import java.io.EOFException;
import java.io.IOException;
import java.io.RandomAccessFile;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public final class s implements h {
    public final m a;
    public RandomAccessFile b;
    public Uri c;
    public long d;
    public boolean e;

    public s(m mVar) {
        this.a = mVar;
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.upstream.h
    public final long a(k kVar) {
        try {
            this.c = kVar.a;
            RandomAccessFile randomAccessFile = new RandomAccessFile(kVar.a.getPath(), "r");
            this.b = randomAccessFile;
            randomAccessFile.seek(kVar.c);
            long j = kVar.d;
            if (j == -1) {
                j = this.b.length() - kVar.c;
            }
            this.d = j;
            if (j < 0) {
                throw new EOFException();
            }
            this.e = true;
            m mVar = this.a;
            if (mVar != null) {
                synchronized (mVar) {
                    try {
                        if (mVar.b == 0) {
                            mVar.c = SystemClock.elapsedRealtime();
                        }
                        mVar.b++;
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            }
            return this.d;
        } catch (IOException e) {
            throw new r(e);
        }
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.upstream.h
    public final void close() {
        this.c = null;
        try {
            try {
                RandomAccessFile randomAccessFile = this.b;
                if (randomAccessFile != null) {
                    randomAccessFile.close();
                }
            } catch (IOException e) {
                throw new r(e);
            }
        } finally {
            this.b = null;
            if (this.e) {
                this.e = false;
                m mVar = this.a;
                if (mVar != null) {
                    mVar.a();
                }
            }
        }
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.upstream.h
    public final int read(byte[] bArr, int i, int i2) {
        if (i2 == 0) {
            return 0;
        }
        long j = this.d;
        if (j == 0) {
            return -1;
        }
        try {
            int read = this.b.read(bArr, i, (int) Math.min(j, i2));
            if (read > 0) {
                long j2 = read;
                this.d -= j2;
                m mVar = this.a;
                if (mVar != null) {
                    synchronized (mVar) {
                        mVar.d += j2;
                    }
                    return read;
                }
            }
            return read;
        } catch (IOException e) {
            throw new r(e);
        }
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.upstream.h
    public final Uri a() {
        return this.c;
    }
}
