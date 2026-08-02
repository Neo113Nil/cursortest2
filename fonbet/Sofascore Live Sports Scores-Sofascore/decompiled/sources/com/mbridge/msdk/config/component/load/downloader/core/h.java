package com.mbridge.msdk.config.component.load.downloader.core;

import com.mbridge.msdk.foundation.download.core.IDownloadTask;
import com.mbridge.msdk.foundation.tools.q0;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes4.dex */
public class h implements Runnable {
    public final int a;
    public final int b;
    public volatile d c;
    private volatile com.mbridge.msdk.config.component.load.downloader.b d;

    public h(d dVar) {
        this.c = dVar;
        this.a = dVar.d();
        this.b = dVar.h();
    }

    @Override // java.lang.Runnable
    public void run() {
        q0.a(IDownloadTask.TAG, "Start download task.");
        this.d = this.c.c();
        if (this.c.i() != 7) {
            this.c.d(this.d);
        }
        this.c.b(0);
        com.mbridge.msdk.config.component.load.downloader.c run = g.a(this.c, this.d, l.c().b()).run();
        if (run.c()) {
            this.c.e(this.d);
        } else if (run.a() != null) {
            this.c.a(this.d, run.a());
        } else if (run.b()) {
            this.c.b(this.d);
        }
    }
}
