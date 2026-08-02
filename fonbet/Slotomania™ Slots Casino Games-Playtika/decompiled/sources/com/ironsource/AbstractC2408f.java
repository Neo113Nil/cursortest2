package com.ironsource;

import java.util.Timer;
import java.util.TimerTask;

/* renamed from: com.ironsource.f, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC2408f<T> {
    private Object a = new Object();
    private Timer b;
    protected long c;
    protected T d;

    /* renamed from: com.ironsource.f$a */
    class a extends TimerTask {
        a() {
        }

        @Override // java.util.TimerTask, java.lang.Runnable
        public void run() {
            AbstractC2408f.this.b();
        }
    }

    public AbstractC2408f() {
    }

    protected boolean a() {
        return this.c <= 0;
    }

    protected abstract void b();

    protected void c() {
        synchronized (this.a) {
            Timer timer = this.b;
            if (timer != null) {
                timer.cancel();
                this.b = null;
            }
        }
    }

    public void d() {
        this.d = null;
    }

    protected void a(T t) {
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

    public AbstractC2408f(long j) {
        this.c = j;
    }
}
