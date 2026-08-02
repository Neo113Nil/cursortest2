package com.mbridge.msdk.foundation.download.download;

import com.mbridge.msdk.foundation.controller.c;
import com.mbridge.msdk.foundation.same.task.a;
import com.mbridge.msdk.foundation.same.task.b;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes4.dex */
public class DownloadTask {
    private b mLoader;

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    public static class DownloadTaskHolder {
        public static DownloadTask instance = new DownloadTask();

        private DownloadTaskHolder() {
        }
    }

    private DownloadTask() {
        init();
    }

    public static DownloadTask getInstance() {
        return DownloadTaskHolder.instance;
    }

    private void init() {
        if (c.n().d() != null) {
            this.mLoader = new b(c.n().d());
        }
    }

    public void runTask(a aVar) {
        b bVar = this.mLoader;
        if (bVar != null) {
            bVar.a(aVar);
        }
    }
}
