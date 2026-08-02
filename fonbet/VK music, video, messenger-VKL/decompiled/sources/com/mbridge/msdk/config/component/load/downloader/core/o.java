package com.mbridge.msdk.config.component.load.downloader.core;

import android.os.Process;
import com.mbridge.msdk.foundation.tools.q0;
import java.util.concurrent.ThreadFactory;
import xsna.kft0;

/* compiled from: PriorityThreadFactory.java */
/* loaded from: classes13.dex */
public class o implements ThreadFactory {
    private final int a;

    /* compiled from: PriorityThreadFactory.java */
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
                kft0.a(e, new StringBuilder("runnable error : "), "PriorityThreadFactory");
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
