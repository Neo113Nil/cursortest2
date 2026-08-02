package com.mbridge.msdk.config.component.load.downloader;

import com.mbridge.msdk.config.component.load.downloader.core.i;
import com.mbridge.msdk.config.component.load.downloader.core.l;

/* compiled from: MBDownloadManager.java */
/* loaded from: classes13.dex */
public final class e {
    private boolean a;

    /* compiled from: MBDownloadManager.java */
    public static final class b {
        private static final e a = new e();
    }

    public static e a() {
        return b.a;
    }

    public synchronized String b(String str) {
        return com.mbridge.msdk.config.component.load.downloader.resource.a.a().a(str);
    }

    private e() {
        this.a = false;
    }

    public synchronized void a(String str) {
        com.mbridge.msdk.config.component.load.downloader.core.f.a().a(str);
    }

    public boolean b() {
        return this.a;
    }

    public synchronized com.mbridge.msdk.config.component.load.downloader.core.e a(com.mbridge.msdk.config.component.load.downloader.b bVar) {
        return new com.mbridge.msdk.config.component.load.downloader.core.e(bVar);
    }

    public void a(d dVar) {
        if (this.a) {
            return;
        }
        l.c().a(dVar);
        i.b().a(dVar.e());
        com.mbridge.msdk.config.component.load.downloader.core.f.a().c();
        this.a = true;
    }
}
