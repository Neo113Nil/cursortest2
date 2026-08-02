package com.mbridge.msdk.config.component.load.downloader.core;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes4.dex */
public class i {
    private j a;

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    public static final class b {
        private static final i a = new i();
    }

    public static i b() {
        return b.a;
    }

    public j a() {
        j jVar = this.a;
        if (jVar != null) {
            return jVar;
        }
        com.mbridge.msdk.config.component.load.downloader.core.a aVar = new com.mbridge.msdk.config.component.load.downloader.core.a(10);
        this.a = aVar;
        return aVar;
    }

    private i() {
    }

    public void a(int i) {
        this.a = new com.mbridge.msdk.config.component.load.downloader.core.a(i);
    }
}
