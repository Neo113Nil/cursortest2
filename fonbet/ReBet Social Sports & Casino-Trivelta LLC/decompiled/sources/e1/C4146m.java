package e1;

/* renamed from: e1.m, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C4146m {

    /* renamed from: a, reason: collision with root package name */
    public final InterfaceC4143j f45536a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f45537b;

    public C4146m() {
        this(InterfaceC4143j.f45530a);
    }

    public synchronized void a() {
        while (!this.f45537b) {
            this.f45536a.e();
            wait();
        }
    }

    public synchronized void b() {
        boolean z10 = false;
        while (!this.f45537b) {
            try {
                this.f45536a.e();
                wait();
            } catch (InterruptedException unused) {
                z10 = true;
            }
        }
        if (z10) {
            Thread.currentThread().interrupt();
        }
    }

    public synchronized boolean c(long j10) {
        if (j10 <= 0) {
            return this.f45537b;
        }
        long b10 = this.f45536a.b();
        long j11 = j10 + b10;
        if (j11 < b10) {
            b();
        } else {
            boolean z10 = false;
            while (!this.f45537b && b10 < j11) {
                try {
                    this.f45536a.e();
                    wait(j11 - b10);
                } catch (InterruptedException unused) {
                    z10 = true;
                }
                b10 = this.f45536a.b();
            }
            if (z10) {
                Thread.currentThread().interrupt();
            }
        }
        return this.f45537b;
    }

    public synchronized boolean d() {
        boolean z10;
        z10 = this.f45537b;
        this.f45537b = false;
        return z10;
    }

    public synchronized boolean e() {
        return this.f45537b;
    }

    public synchronized boolean f() {
        if (this.f45537b) {
            return false;
        }
        this.f45537b = true;
        notifyAll();
        return true;
    }

    public C4146m(InterfaceC4143j interfaceC4143j) {
        this.f45536a = interfaceC4143j;
    }
}
