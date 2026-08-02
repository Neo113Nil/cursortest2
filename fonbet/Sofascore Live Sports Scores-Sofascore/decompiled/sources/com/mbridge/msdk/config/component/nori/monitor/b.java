package com.mbridge.msdk.config.component.nori.monitor;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import com.mbridge.msdk.foundation.tools.q0;
import defpackage.w1l;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes4.dex */
public class b {
    private long a;
    private boolean b = false;
    private Handler c;
    private HandlerThread d;
    private Runnable e;
    private com.mbridge.msdk.config.component.common.network.a f;
    private com.mbridge.msdk.config.component.common.network.result.a g;
    private com.mbridge.msdk.config.component.common.network.b h;
    private com.mbridge.msdk.config.component.common.network.retry.b i;

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    public class a implements Runnable {
        public a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            q0.b("MonitorNetworkTimeout", "超时结束触发");
            if (b.this.f != null && !b.this.g.h()) {
                b.this.a();
                b.this.f.d(b.this.g);
            }
            b.this.e();
        }
    }

    public b(long j) {
        if (this.a < 0) {
            this.a = 30L;
        } else {
            this.a = j;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a() {
        try {
            if (this.h != null) {
                q0.c("MonitorNetworkTimeout", "取消网络请求");
                this.h.a();
            }
            if (this.i != null) {
                q0.c("MonitorNetworkTimeout", "取消重试任务");
                this.i.a();
            }
        } catch (Exception e) {
            w1l.v(e, new StringBuilder("取消任务时发生异常："), "MonitorNetworkTimeout");
        }
    }

    private void c() {
        this.e = new a();
    }

    public void b() {
        try {
            e();
            Handler handler = this.c;
            if (handler != null) {
                handler.removeCallbacksAndMessages(null);
                this.c = null;
            }
            HandlerThread handlerThread = this.d;
            try {
                if (handlerThread != null) {
                    try {
                        try {
                            handlerThread.quitSafely();
                            this.d.join(1000L);
                        } catch (Exception e) {
                            q0.b("MonitorNetworkTimeout", "清理HandlerThread时发生异常：" + e.getMessage());
                        }
                    } catch (InterruptedException e2) {
                        q0.d("MonitorNetworkTimeout", "等待HandlerThread退出时被中断：" + e2.getMessage());
                        Thread.currentThread().interrupt();
                    }
                    this.d = null;
                }
                this.e = null;
                this.b = false;
                q0.c("MonitorNetworkTimeout", "MonitorNetworkTimeout资源已完全清理");
            } catch (Throwable th) {
                this.d = null;
                throw th;
            }
        } catch (Exception e3) {
            w1l.v(e3, new StringBuilder("销毁MonitorNetworkTimeout时发生异常："), "MonitorNetworkTimeout");
        }
    }

    public void d() {
        Runnable runnable;
        if (this.b) {
            q0.d("MonitorNetworkTimeout", "已经启动监控条件 不满足");
            return;
        }
        this.b = true;
        try {
            HandlerThread handlerThread = new HandlerThread("NetComponentThread");
            this.d = handlerThread;
            handlerThread.start();
            this.c = new Handler(this.d.getLooper());
            c();
        } catch (Exception e) {
            q0.b("MonitorNetworkTimeout", "初始化MonitorPlayerTimeout失败：" + e.getMessage());
            this.c = new Handler(Looper.getMainLooper());
            c();
        }
        if (this.c == null) {
            e();
            com.mbridge.msdk.config.component.common.network.a aVar = this.f;
            if (aVar != null) {
                aVar.d(this.g);
            }
        }
        q0.c("MonitorNetworkTimeout", "开始网络请求，超时时间：" + this.a + "ms");
        Handler handler = this.c;
        if (handler == null || (runnable = this.e) == null) {
            return;
        }
        handler.postDelayed(runnable, this.a * 1000);
    }

    public void e() {
        Runnable runnable;
        if (this.b) {
            this.b = false;
            Handler handler = this.c;
            if (handler != null && (runnable = this.e) != null) {
                handler.removeCallbacks(runnable);
            }
            q0.c("MonitorNetworkTimeout", "停止net超时监控");
        }
    }

    public void a(com.mbridge.msdk.config.component.common.network.b bVar) {
        this.h = bVar;
    }

    public void a(com.mbridge.msdk.config.component.common.network.retry.b bVar) {
        this.i = bVar;
    }

    public void a(com.mbridge.msdk.config.component.common.network.result.a aVar) {
        this.g = aVar;
    }

    public void a(com.mbridge.msdk.config.component.common.network.a aVar) {
        this.f = aVar;
    }
}
