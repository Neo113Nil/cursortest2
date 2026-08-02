package com.mbridge.msdk.config.component.load.downloader;

import com.mbridge.msdk.config.component.load.downloader.core.i;
import com.mbridge.msdk.config.component.load.downloader.core.l;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes4.dex */
public final class e {
    private boolean a;

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    public static final class b {
        private static final e a = new e();
    }

    private e() {
        this.a = false;
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

    public synchronized String b(String str) {
        return com.mbridge.msdk.config.component.load.downloader.resource.a.a().a(str);
    }

    public boolean b() {
        return this.a;
    }

    public synchronized void a(String str) {
        com.mbridge.msdk.config.component.load.downloader.core.f.a().a(str);
    }

    public synchronized com.mbridge.msdk.config.component.load.downloader.core.e a(com.mbridge.msdk.config.component.load.downloader.b bVar) {
        return new com.mbridge.msdk.config.component.load.downloader.core.e(bVar);
    }

    public static e a() {
        return b.a;
    }
}
