package io.sentry.util;

import io.sentry.InterfaceC4765j0;

/* loaded from: classes3.dex */
public final class p {

    /* renamed from: b, reason: collision with root package name */
    public final a f52799b;

    /* renamed from: a, reason: collision with root package name */
    public volatile Object f52798a = null;

    /* renamed from: c, reason: collision with root package name */
    public final C4843a f52800c = new C4843a();

    public interface a {
        Object a();
    }

    public p(a aVar) {
        this.f52799b = aVar;
    }

    public Object a() {
        if (this.f52798a == null) {
            InterfaceC4765j0 d10 = this.f52800c.d();
            try {
                if (this.f52798a == null) {
                    this.f52798a = this.f52799b.a();
                }
                if (d10 != null) {
                    d10.close();
                }
            } catch (Throwable th2) {
                if (d10 != null) {
                    try {
                        d10.close();
                    } catch (Throwable th3) {
                        th2.addSuppressed(th3);
                    }
                }
                throw th2;
            }
        }
        return this.f52798a;
    }

    public void b() {
        InterfaceC4765j0 d10 = this.f52800c.d();
        try {
            this.f52798a = null;
            if (d10 != null) {
                d10.close();
            }
        } catch (Throwable th2) {
            if (d10 != null) {
                try {
                    d10.close();
                } catch (Throwable th3) {
                    th2.addSuppressed(th3);
                }
            }
            throw th2;
        }
    }

    public void c(Object obj) {
        InterfaceC4765j0 d10 = this.f52800c.d();
        try {
            this.f52798a = obj;
            if (d10 != null) {
                d10.close();
            }
        } catch (Throwable th2) {
            if (d10 != null) {
                try {
                    d10.close();
                } catch (Throwable th3) {
                    th2.addSuppressed(th3);
                }
            }
            throw th2;
        }
    }
}
