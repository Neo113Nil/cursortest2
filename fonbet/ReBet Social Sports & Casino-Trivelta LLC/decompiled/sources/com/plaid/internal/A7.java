package com.plaid.internal;

import android.os.Handler;
import android.os.Looper;

/* loaded from: classes3.dex */
public final class A7 {

    /* renamed from: d, reason: collision with root package name */
    public static final C3784x0 f39155d;

    /* renamed from: a, reason: collision with root package name */
    public a f39156a;

    /* renamed from: b, reason: collision with root package name */
    public final Handler f39157b = new Handler(Looper.getMainLooper());

    /* renamed from: c, reason: collision with root package name */
    public final int f39158c = 120000;

    public static class a {

        /* renamed from: a, reason: collision with root package name */
        public final InterfaceC3731r1 f39159a;

        /* renamed from: b, reason: collision with root package name */
        public final RunnableC0544a f39160b = new RunnableC0544a();

        /* renamed from: c, reason: collision with root package name */
        public boolean f39161c = false;

        /* renamed from: com.plaid.internal.A7$a$a, reason: collision with other inner class name */
        public class RunnableC0544a implements Runnable {
            public RunnableC0544a() {
            }

            @Override // java.lang.Runnable
            public final void run() {
                a aVar = a.this;
                if (aVar.f39161c) {
                    return;
                }
                A7.f39155d.a(W3.INFO, "release http client", new Object[0]);
                aVar.f39161c = true;
                aVar.f39159a.a();
            }
        }

        public a(InterfaceC3731r1 interfaceC3731r1) {
            this.f39159a = interfaceC3731r1;
        }
    }

    static {
        W3 w32 = Z3.f39803a;
        f39155d = new C3784x0("reuse-network");
    }

    public final void a() {
        synchronized (this) {
            b();
        }
    }

    public final synchronized void b() {
        try {
            if (this.f39156a != null) {
                C3784x0 c3784x0 = f39155d;
                c3784x0.a(W3.DEBUG, "release cached http client", new Object[0]);
                this.f39157b.removeCallbacks(this.f39156a.f39160b);
                a aVar = this.f39156a;
                if (!aVar.f39161c) {
                    c3784x0.a(W3.INFO, "release http client", new Object[0]);
                    aVar.f39161c = true;
                    aVar.f39159a.a();
                }
                this.f39156a = null;
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0046 A[Catch: all -> 0x0007, TRY_LEAVE, TryCatch #0 {all -> 0x0007, blocks: (B:4:0x0003, B:8:0x0009, B:10:0x000e, B:14:0x0018, B:15:0x0042, B:17:0x0046, B:18:0x0014, B:19:0x002d), top: B:2:0x0001 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final synchronized void a(InterfaceC3731r1 interfaceC3731r1) {
        int i10;
        try {
            if (interfaceC3731r1 == null) {
                b();
            } else {
                a aVar = this.f39156a;
                if (aVar != null) {
                    if ((aVar.f39161c ? null : aVar.f39159a) == interfaceC3731r1) {
                        f39155d.a(W3.INFO, "reuse cached http client", new Object[0]);
                        this.f39157b.removeCallbacks(this.f39156a.f39160b);
                        i10 = this.f39158c;
                        if (i10 > 0) {
                            f39155d.a(W3.INFO, "schedule http client release in %d ms", Integer.valueOf(i10));
                            this.f39157b.postDelayed(this.f39156a.f39160b, this.f39158c);
                        }
                    }
                }
                b();
                f39155d.a(W3.INFO, "cache http client", new Object[0]);
                this.f39156a = new a(interfaceC3731r1);
                i10 = this.f39158c;
                if (i10 > 0) {
                }
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }
}
