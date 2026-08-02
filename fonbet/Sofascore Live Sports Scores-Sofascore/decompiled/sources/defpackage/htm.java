package defpackage;

import android.content.Context;
import android.media.MediaDataSource;
import android.text.TextUtils;
import java.io.File;
import java.io.IOException;
import java.net.SocketTimeoutException;
import java.util.concurrent.ConcurrentHashMap;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public final class htm extends MediaDataSource {
    public static final ConcurrentHashMap e = new ConcurrentHashMap();
    public final qwm a;
    public long b = -2147483648L;
    public final Context c;
    public final nem d;

    public htm(Context context, nem nemVar) {
        this.c = context;
        this.d = nemVar;
        this.a = new qwm(nemVar);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.d.dax();
        qwm qwmVar = this.a;
        try {
            if (!qwmVar.h) {
                qwmVar.j.close();
            }
            File file = qwmVar.d;
            if (file != null) {
                file.setLastModified(System.currentTimeMillis());
            }
            File file2 = qwmVar.e;
            if (file2 != null) {
                file2.setLastModified(System.currentTimeMillis());
            }
        } catch (Throwable unused) {
        }
        qwmVar.h = true;
        e.remove(this.d.nac());
    }

    @Override // android.media.MediaDataSource
    public final long getSize() {
        long j = this.b;
        if (j != -2147483648L) {
            return j;
        }
        long j2 = -1;
        if (this.c == null || TextUtils.isEmpty(this.d.dax())) {
            return -1L;
        }
        qwm qwmVar = this.a;
        if (!qwmVar.e.exists()) {
            synchronized (qwmVar.c) {
                int i = 0;
                while (qwmVar.b == -2147483648L && !qwmVar.h) {
                    try {
                        i += 15;
                        try {
                            qwmVar.c.wait(5L);
                            if (i > 20000) {
                                break;
                            }
                        } catch (InterruptedException unused) {
                            throw new IOException("total length InterruptException");
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            }
            this.b = j2;
            return j2;
        }
        qwmVar.b = qwmVar.e.length();
        j2 = qwmVar.b;
        this.b = j2;
        return j2;
    }

    @Override // android.media.MediaDataSource
    public final int readAt(long j, byte[] bArr, int i, int i2) {
        qwm qwmVar = this.a;
        try {
            int i3 = -1;
            if (j != qwmVar.b) {
                int i4 = 0;
                int i5 = 0;
                do {
                    if (!qwmVar.h) {
                        synchronized (qwmVar.c) {
                            try {
                                File file = qwmVar.e;
                                if (j < (file.exists() ? file.length() : qwmVar.d.length())) {
                                    qwmVar.j.seek(j);
                                    i5 = qwmVar.j.read(bArr, i, i2);
                                } else {
                                    i4 += 33;
                                    qwmVar.l = j;
                                    qwmVar.c.wait(33L);
                                    qwmVar.l = -1L;
                                }
                            } finally {
                            }
                        }
                        if (i5 > 0) {
                            i3 = i5;
                        } else if (qwmVar.k.pcc() && qwmVar.g != -100 && (!qwmVar.i || qwmVar.b == -1)) {
                            throw new IOException();
                        }
                    }
                } while (i4 < 20000);
                throw new SocketTimeoutException();
            }
            int length = bArr.length;
            return i3;
        } catch (Throwable th) {
            if (th instanceof IOException) {
                throw th;
            }
            throw new IOException();
        }
    }
}
