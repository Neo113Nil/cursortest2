package com.mbridge.msdk.config.component.load.downloader.core;

import android.os.Process;
import com.mbridge.msdk.foundation.tools.q0;
import defpackage.w1l;
import java.util.concurrent.ThreadFactory;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes4.dex */
public class o implements ThreadFactory {
    private final int a;

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    public class a implements Runnable {
        final /* synthetic */ Runnable a;

        public a(Runnable runnable) {
            this.a = runnable;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                Process.setThreadPriority(o.this.a);
            } catch (Throwable th) {
                q0.b("PriorityThreadFactory", "set thread priority error : " + th.getMessage());
            }
            try {
                this.a.run();
            } catch (Exception e) {
                w1l.v(e, new StringBuilder("runnable error : "), "PriorityThreadFactory");
            }
        }
    }

    public o(int i) {
        this.a = i;
    }

    @Override // java.util.concurrent.ThreadFactory
    public Thread newThread(Runnable runnable) {
        Thread thread = new Thread(new a(runnable));
        thread.setName("mb_download_thread");
        return thread;
    }
}
