package com.mbridge.msdk.config.component.load.downloader.core;

import android.text.TextUtils;
import com.mbridge.msdk.config.component.load.downloader.DownloadProgress;
import com.mbridge.msdk.foundation.download.Command;
import com.mbridge.msdk.foundation.download.core.IDownloadTask;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.foundation.same.net.MBridgeHostnameVerifier;
import com.mbridge.msdk.foundation.tools.q0;
import com.mbridge.msdk.thrid.okhttp.a0;
import com.mbridge.msdk.thrid.okhttp.b0;
import com.mbridge.msdk.thrid.okhttp.c;
import com.mbridge.msdk.thrid.okhttp.v;
import com.mbridge.msdk.thrid.okhttp.y;
import defpackage.vxd;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.util.Locale;
import java.util.concurrent.TimeUnit;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes4.dex */
class n implements m {
    private final com.mbridge.msdk.config.component.load.downloader.database.c a;
    private final d b;
    private volatile com.mbridge.msdk.config.component.load.downloader.b c;
    private com.mbridge.msdk.config.component.load.downloader.database.b d;
    private com.mbridge.msdk.config.component.load.downloader.c e;
    private InputStream f;
    private com.mbridge.msdk.config.component.load.downloader.resource.stream.a g;
    private b0 h;
    private String i;

    private n(d dVar, com.mbridge.msdk.config.component.load.downloader.database.b bVar, com.mbridge.msdk.config.component.load.downloader.database.c cVar, com.mbridge.msdk.config.component.load.downloader.b bVar2) {
        this.b = dVar;
        this.d = bVar;
        this.a = cVar;
        this.c = bVar2;
    }

    private com.mbridge.msdk.config.component.load.downloader.c a(String str, String str2) throws IOException, IllegalAccessException {
        com.mbridge.msdk.config.component.load.downloader.c cVar = new com.mbridge.msdk.config.component.load.downloader.c();
        this.c.b(System.currentTimeMillis());
        com.mbridge.msdk.config.component.load.downloader.resource.stream.a b = com.mbridge.msdk.config.component.load.downloader.resource.a.a().b(new File(str));
        this.g = b;
        b.seek(this.b.f());
        byte[] bArr = new byte[l.c().a()];
        try {
            do {
                int read = this.f.read(bArr);
                if (read != -1) {
                    this.g.write(bArr, 0, read);
                    d dVar = this.b;
                    dVar.a(dVar.f() + read);
                    this.g.flushAndSync();
                    int a = com.mbridge.msdk.config.component.load.downloader.utils.b.a(this.b.k(), this.b.f());
                    this.c.a(a);
                    a(this.b, this.c, this.b.f(), this.b.k(), a);
                    if (this.c.e() == 100 || a < this.c.e()) {
                    }
                }
                break;
            } while (this.b.i() != 5);
            break;
            if (this.b.i() != 5 && this.b.k() == this.b.f()) {
                this.c.b(com.mbridge.msdk.config.component.common.file.a.d(this.c.h()));
                this.c.c(System.currentTimeMillis());
            }
        } catch (Throwable th) {
            q0.b(IDownloadTask.TAG, th.getMessage(), th);
        }
        cVar.a(true);
        if (!cVar.b()) {
            cVar.b(true);
        }
        return cVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:36:0x0171, code lost:
    
        if (r4.h() == false) goto L48;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x01be, code lost:
    
        return r19.e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x01b9, code lost:
    
        r4.cancel();
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x01b7, code lost:
    
        if (r4.h() != false) goto L49;
     */
    @Override // com.mbridge.msdk.config.component.load.downloader.core.m
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public com.mbridge.msdk.config.component.load.downloader.c run() {
        this.e = new com.mbridge.msdk.config.component.load.downloader.c();
        if (this.b.i() == 5) {
            this.e.a(true);
            return this.e;
        }
        long k = this.b.k();
        long f = this.b.f();
        String h = this.c.h();
        if (f != 0 && k == f) {
            if (TextUtils.isEmpty(h)) {
                this.e.b(false);
            } else if (new File(this.c.h()).exists()) {
                this.e.b(true);
                return this.e;
            }
        }
        String f2 = this.c.f();
        long j = this.b.j();
        long b = this.b.b();
        long g = this.b.g();
        long l = this.b.l();
        Locale locale = Locale.ENGLISH;
        String m = vxd.m("bytes=", f, "-");
        try {
            v.b s = l.c().d().s();
            TimeUnit timeUnit = TimeUnit.MILLISECONDS;
            com.mbridge.msdk.thrid.okhttp.d a = s.b(b, timeUnit).a(new MBridgeHostnameVerifier(f2)).d(g, timeUnit).e(l, timeUnit).a(Math.max(0L, j), timeUnit).b(true).a().a(new y.a().b(f2).a(new c.a().b().a()).a("Connection", CampaignEx.JSON_NATIVE_VIDEO_CLOSE).a(Command.HTTP_HEADER_RANGE, m).a(Command.HTTP_HEADER_USER_AGENT).a(Command.HTTP_HEADER_USER_AGENT, Command.DEFAULT_USER_AGENT).a());
            try {
                try {
                    a0 d = a.d();
                    if (!com.mbridge.msdk.config.component.load.downloader.utils.a.b(d) && !com.mbridge.msdk.config.component.load.downloader.utils.a.b(d.d())) {
                        int k2 = d.k();
                        if (!d.n()) {
                            this.e.a(new IOException("responseCode " + k2));
                            com.mbridge.msdk.config.component.load.downloader.c cVar = this.e;
                            com.mbridge.msdk.config.component.load.downloader.utils.a.a(this.f);
                            com.mbridge.msdk.config.component.load.downloader.utils.a.a(this.g);
                            com.mbridge.msdk.config.component.load.downloader.utils.a.a(d);
                            com.mbridge.msdk.config.component.load.downloader.utils.a.a(this.h);
                            if (!a.h()) {
                                a.cancel();
                            }
                            return cVar;
                        }
                        this.e = a(h, f2, d, k2);
                        com.mbridge.msdk.config.component.load.downloader.utils.a.a(this.f);
                        com.mbridge.msdk.config.component.load.downloader.utils.a.a(this.g);
                        com.mbridge.msdk.config.component.load.downloader.utils.a.a(d);
                        com.mbridge.msdk.config.component.load.downloader.utils.a.a(this.h);
                    }
                    this.e.a(new IOException("response is null"));
                    com.mbridge.msdk.config.component.load.downloader.c cVar2 = this.e;
                    com.mbridge.msdk.config.component.load.downloader.utils.a.a(this.f);
                    com.mbridge.msdk.config.component.load.downloader.utils.a.a(this.g);
                    com.mbridge.msdk.config.component.load.downloader.utils.a.a(d);
                    com.mbridge.msdk.config.component.load.downloader.utils.a.a(this.h);
                    if (!a.h()) {
                        a.cancel();
                    }
                    return cVar2;
                } catch (Throwable th) {
                    com.mbridge.msdk.config.component.load.downloader.utils.a.a(this.f);
                    com.mbridge.msdk.config.component.load.downloader.utils.a.a(this.g);
                    com.mbridge.msdk.config.component.load.downloader.utils.a.a((a0) null);
                    com.mbridge.msdk.config.component.load.downloader.utils.a.a(this.h);
                    if (!a.h()) {
                        a.cancel();
                    }
                    throw th;
                }
            } catch (Exception e) {
                a(e);
                com.mbridge.msdk.config.component.load.downloader.utils.a.a(this.f);
                com.mbridge.msdk.config.component.load.downloader.utils.a.a(this.g);
                com.mbridge.msdk.config.component.load.downloader.utils.a.a((a0) null);
                com.mbridge.msdk.config.component.load.downloader.utils.a.a(this.h);
            }
        } catch (Exception e2) {
            a(e2);
            this.e.b(false);
            return this.e;
        }
    }

    public static m a(d dVar, com.mbridge.msdk.config.component.load.downloader.database.b bVar, com.mbridge.msdk.config.component.load.downloader.database.c cVar, com.mbridge.msdk.config.component.load.downloader.b bVar2) {
        return new n(dVar, bVar, cVar, bVar2);
    }

    private com.mbridge.msdk.config.component.load.downloader.c a(String str, String str2, a0 a0Var, int i) throws IOException, IllegalAccessException {
        com.mbridge.msdk.config.component.load.downloader.c cVar = new com.mbridge.msdk.config.component.load.downloader.c();
        if (!a(i)) {
            this.b.a(0L);
            this.b.b(0L);
            com.mbridge.msdk.config.component.load.downloader.database.b bVar = this.d;
            if (bVar != null) {
                bVar.a(0);
                this.d.c(0L);
                this.d.b(0L);
            }
            com.mbridge.msdk.config.component.load.downloader.resource.a.a().a(new File(this.c.h()));
        }
        b0 d = a0Var.d();
        this.h = d;
        if (com.mbridge.msdk.config.component.load.downloader.utils.a.b(d)) {
            cVar.a(new IOException("response body is null"));
            this.b.b(0L);
            this.b.a(0L);
            return cVar;
        }
        long k = this.h.k();
        String a = a0Var.a("Content-Type", "");
        this.i = a;
        this.b.a(a);
        if (k <= 0) {
            cVar.a(new IOException("response content length is null"));
            return cVar;
        }
        if (this.b.k() == 0) {
            this.b.b(k);
        }
        InputStream d2 = this.h.d();
        this.f = d2;
        if (com.mbridge.msdk.config.component.load.downloader.utils.a.b(d2)) {
            cVar.a(new IOException("response inputStream is null"));
            return cVar;
        }
        this.c.a(this.b.k());
        this.b.c(this.c);
        return a(str, str2);
    }

    private void a(Exception exc) {
        this.e.a(exc);
    }

    private boolean a(int i) {
        return i == 206;
    }

    private void a(d dVar, com.mbridge.msdk.config.component.load.downloader.b bVar, long j, long j2, int i) {
        if (dVar.i() != 5) {
            if (bVar != null) {
                bVar.a(i);
                bVar.a(j2);
            }
            dVar.a(bVar, new DownloadProgress(j, j2, i));
        }
    }
}
