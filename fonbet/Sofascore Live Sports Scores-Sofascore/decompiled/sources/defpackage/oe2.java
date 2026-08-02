package defpackage;

import com.mbridge.msdk.playercommon.exoplayer2.C;
import com.mbridge.msdk.playercommon.exoplayer2.upstream.cache.CacheDataSink;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class oe2 {
    public final he2 a;
    public final long b;
    public xe4 c;
    public long d;
    public File e;
    public OutputStream f;
    public long g;
    public long h;
    public d4g i;

    public oe2(he2 he2Var) {
        he2Var.getClass();
        this.a = he2Var;
        this.b = 5242880L;
    }

    public final void a() {
        OutputStream outputStream = this.f;
        if (outputStream == null) {
            return;
        }
        try {
            outputStream.flush();
            nik.h(this.f);
            this.f = null;
            File file = this.e;
            this.e = null;
            he2 he2Var = this.a;
            long j = this.g;
            ghh ghhVar = (ghh) he2Var;
            synchronized (ghhVar) {
                if (file.exists()) {
                    if (j == 0) {
                        file.delete();
                        return;
                    }
                    hhh b = hhh.b(file, j, C.TIME_UNSET, ghhVar.c);
                    b.getClass();
                    lf2 J = ghhVar.c.J(b.a);
                    J.getClass();
                    z1a.E(J.c(b.b, b.c));
                    long a = ep3.a(J.e);
                    if (a != -1) {
                        z1a.E(b.b + b.c <= a);
                    }
                    if (ghhVar.d != null) {
                        try {
                            ghhVar.d.w(b.c, b.f, file.getName());
                        } catch (IOException e) {
                            throw new ce2(e);
                        }
                    }
                    ghhVar.a(b);
                    try {
                        ghhVar.c.n0();
                        ghhVar.notifyAll();
                    } catch (IOException e2) {
                        throw new ce2(e2);
                    }
                }
            }
        } catch (Throwable th) {
            nik.h(this.f);
            this.f = null;
            File file2 = this.e;
            this.e = null;
            file2.delete();
            throw th;
        }
    }

    public final void b(xe4 xe4Var) {
        File c;
        long j = xe4Var.g;
        long min = j == -1 ? -1L : Math.min(j - this.h, this.d);
        he2 he2Var = this.a;
        String str = xe4Var.h;
        String str2 = nik.a;
        long j2 = xe4Var.f + this.h;
        ghh ghhVar = (ghh) he2Var;
        synchronized (ghhVar) {
            try {
                ghhVar.c();
                lf2 J = ghhVar.c.J(str);
                J.getClass();
                z1a.E(J.c(j2, min));
                if (!ghhVar.a.exists()) {
                    ghh.d(ghhVar.a);
                    ghhVar.l();
                }
                h5b h5bVar = ghhVar.b;
                if (min != -1) {
                    h5bVar.a(ghhVar, min);
                } else {
                    h5bVar.getClass();
                }
                File file = new File(ghhVar.a, Integer.toString(ghhVar.f.nextInt(10)));
                if (!file.exists()) {
                    ghh.d(file);
                }
                c = hhh.c(file, J.a, j2, System.currentTimeMillis());
            } catch (Throwable th) {
                throw th;
            }
        }
        this.e = c;
        FileOutputStream fileOutputStream = new FileOutputStream(this.e);
        d4g d4gVar = this.i;
        if (d4gVar == null) {
            this.i = new d4g(fileOutputStream, CacheDataSink.DEFAULT_BUFFER_SIZE);
        } else {
            d4gVar.e(fileOutputStream);
        }
        this.f = this.i;
        this.g = 0L;
    }
}
