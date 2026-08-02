package com.ironsource;

import java.util.Timer;
import java.util.TimerTask;

/* renamed from: com.ironsource.f, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public abstract class AbstractC4304f<T> {
    private Object a = new Object();
    private Timer b;
    protected long c;
    protected T d;

    /* renamed from: com.ironsource.f$a */
    public class a extends TimerTask {
        public a() {
        }

        @Override // java.util.TimerTask, java.lang.Runnable
        public void run() {
            AbstractC4304f.this.b();
        }
    }

    public AbstractC4304f() {
    }

    public boolean a() {
        return this.c <= 0;
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

    public AbstractC4304f(long j) {
        this.c = j;
    }
}
