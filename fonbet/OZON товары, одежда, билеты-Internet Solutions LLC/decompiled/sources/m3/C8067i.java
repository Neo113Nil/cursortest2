package m3;

import android.os.SystemClock;

/* renamed from: m3.i, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C8067i {

    /* renamed from: a, reason: collision with root package name */
    private final C8053F f74324a;

    /* renamed from: b, reason: collision with root package name */
    private boolean f74325b;

    public C8067i() {
        this(InterfaceC8064f.f74315a);
    }

    public final synchronized void a() throws InterruptedException {
        while (!this.f74325b) {
            this.f74324a.getClass();
            wait();
        }
    }

    public final synchronized boolean b(long j11) throws InterruptedException {
        if (j11 <= 0) {
            return this.f74325b;
        }
        this.f74324a.getClass();
        long elapsedRealtime = SystemClock.elapsedRealtime();
        long j12 = j11 + elapsedRealtime;
        if (j12 < elapsedRealtime) {
            a();
        } else {
            while (!this.f74325b && elapsedRealtime < j12) {
                this.f74324a.getClass();
                wait(j12 - elapsedRealtime);
                this.f74324a.getClass();
                elapsedRealtime = SystemClock.elapsedRealtime();
            }
        }
        return this.f74325b;
    }

    public final synchronized void c() {
        boolean z11 = false;
        while (!this.f74325b) {
            try {
                this.f74324a.getClass();
                wait();
            } catch (InterruptedException unused) {
                z11 = true;
            }
        }
        if (z11) {
            Thread.currentThread().interrupt();
        }
    }

    public final synchronized boolean d(long j11) {
        if (j11 <= 0) {
            return this.f74325b;
        }
        this.f74324a.getClass();
        long elapsedRealtime = SystemClock.elapsedRealtime();
        long j12 = j11 + elapsedRealtime;
        if (j12 < elapsedRealtime) {
            c();
        } else {
            boolean z11 = false;
            while (!this.f74325b && elapsedRealtime < j12) {
                try {
                    this.f74324a.getClass();
                    wait(j12 - elapsedRealtime);
                } catch (InterruptedException unused) {
                    z11 = true;
                }
                this.f74324a.getClass();
                elapsedRealtime = SystemClock.elapsedRealtime();
            }
            if (z11) {
                Thread.currentThread().interrupt();
            }
        }
        return this.f74325b;
    }

    public final synchronized void e() {
        this.f74325b = false;
    }

    public final synchronized boolean f() {
        return this.f74325b;
    }

    public final synchronized boolean g() {
        if (this.f74325b) {
            return false;
        }
        this.f74325b = true;
        notifyAll();
        return true;
    }

    public C8067i(C8053F c8053f) {
        this.f74324a = c8053f;
    }
}
