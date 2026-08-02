package com.ironsource;

import java.util.Timer;
import java.util.TimerTask;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* renamed from: com.ironsource.f, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractC4063f<T> {
    private Object a = new Object();
    private Timer b;
    protected long c;
    protected T d;

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    /* renamed from: com.ironsource.f$a */
    public class a extends TimerTask {
        public a() {
        }

        @Override // java.util.TimerTask, java.lang.Runnable
        public void run() {
            AbstractC4063f.this.b();
        }
    }

    public AbstractC4063f(long j) {
        this.c = j;
    }

    public void a(T t) {
        if (a() || t == null) {
            return;
        }
        this.d = t;
        c();
        synchronized (this.a) {
            Timer timer = new Timer();
            this.b = timer;
            timer.schedule(new a(), this.c);
        }
    }

    public abstract void b();

    public void c() {
        synchronized (this.a) {
            try {
                Timer timer = this.b;
                if (timer != null) {
                    timer.cancel();
                    this.b = null;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void d() {
        this.d = null;
    }

    public AbstractC4063f() {
    }

    public boolean a() {
        return this.c <= 0;
    }
}
