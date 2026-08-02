package com.huawei.hms.stats;

import android.os.Handler;
import android.os.Looper;
import com.huawei.hms.support.hianalytics.HiAnalyticsUtils;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: AnalyticsCacheManager.java */
/* loaded from: classes13.dex */
public class a {
    private static final a f = new a();
    private final Object a = new Object();
    private boolean b = false;
    private final List<Runnable> c = new ArrayList();
    private final Handler d = new Handler(Looper.getMainLooper());
    private final Runnable e = new RunnableC0167a();

    /* compiled from: AnalyticsCacheManager.java */
    /* renamed from: com.huawei.hms.stats.a$a, reason: collision with other inner class name */
    public class RunnableC0167a implements Runnable {
        public RunnableC0167a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            if (HiAnalyticsUtils.getInstance().getInitFlag()) {
                a.this.b();
            } else {
                a.this.a();
            }
        }
    }

    private a() {
    }

    public static a c() {
        return f;
    }

    public void a(Runnable runnable) {
        synchronized (this.a) {
            try {
                if (runnable == null) {
                    return;
                }
                if (this.b) {
                    return;
                }
                if (this.c.size() >= 60) {
                    return;
                }
                this.c.add(runnable);
                this.d.removeCallbacks(this.e);
                this.d.postDelayed(this.e, 10000L);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void b() {
        synchronized (this.a) {
            this.c.size();
            this.b = true;
            try {
                Iterator<Runnable> it = this.c.iterator();
                while (it.hasNext()) {
                    it.next().run();
                    it.remove();
                }
            } catch (Throwable th) {
                th.getMessage();
                a();
            }
            this.b = false;
        }
    }

    public void a() {
        synchronized (this.a) {
            this.c.clear();
        }
    }
}
