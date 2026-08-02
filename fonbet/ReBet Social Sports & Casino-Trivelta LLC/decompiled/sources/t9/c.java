package t9;

import java.lang.ref.WeakReference;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

/* loaded from: classes2.dex */
public final class c extends Thread {

    /* renamed from: a, reason: collision with root package name */
    public final WeakReference f65788a;

    /* renamed from: b, reason: collision with root package name */
    public final long f65789b;

    /* renamed from: c, reason: collision with root package name */
    public final CountDownLatch f65790c;

    public c(C6452a c6452a, long j10) {
        super("AdIdClientAutoDisconnectThread");
        this.f65788a = new WeakReference(c6452a);
        this.f65789b = j10;
        this.f65790c = new CountDownLatch(1);
        start();
    }

    public final void a() {
        C6452a c6452a = (C6452a) this.f65788a.get();
        if (c6452a != null) {
            c6452a.c();
        }
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        try {
            if (this.f65790c.await(this.f65789b, TimeUnit.MILLISECONDS)) {
                return;
            }
            a();
        } catch (InterruptedException unused) {
            a();
        }
    }
}
