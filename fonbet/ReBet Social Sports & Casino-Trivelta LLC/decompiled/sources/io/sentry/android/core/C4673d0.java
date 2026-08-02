package io.sentry.android.core;

import io.sentry.AbstractC4856v2;
import io.sentry.InterfaceC4765j0;
import io.sentry.InterfaceC4780m0;
import io.sentry.InterfaceC4790o0;
import io.sentry.f4;
import io.sentry.util.C4843a;

/* renamed from: io.sentry.android.core.d0, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C4673d0 implements io.sentry.O {

    /* renamed from: a, reason: collision with root package name */
    public final io.sentry.android.core.performance.m f50945a;

    /* renamed from: b, reason: collision with root package name */
    public final C4843a f50946b = new C4843a();

    /* renamed from: c, reason: collision with root package name */
    public a f50947c;

    /* renamed from: d, reason: collision with root package name */
    public InterfaceC4780m0 f50948d;

    /* renamed from: e, reason: collision with root package name */
    public InterfaceC4790o0 f50949e;

    /* renamed from: io.sentry.android.core.d0$a */
    public interface a {
    }

    public C4673d0(io.sentry.android.core.performance.m mVar) {
        this.f50945a = mVar;
    }

    public void a() {
        InterfaceC4765j0 d10 = this.f50946b.d();
        try {
            this.f50948d = null;
            this.f50949e = null;
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

    public void b(AbstractC4856v2 abstractC4856v2) {
        InterfaceC4765j0 d10 = this.f50946b.d();
        try {
            InterfaceC4790o0 interfaceC4790o0 = this.f50949e;
            if (interfaceC4790o0 != null && !interfaceC4790o0.d()) {
                InterfaceC4780m0 interfaceC4780m0 = this.f50948d;
                AbstractC4856v2 s10 = interfaceC4780m0 == null ? null : interfaceC4780m0.s();
                if (s10 != null && s10.c(abstractC4856v2)) {
                    abstractC4856v2 = s10;
                }
                interfaceC4790o0.t(f4.OK, abstractC4856v2);
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

    public AbstractC4856v2 c() {
        InterfaceC4765j0 d10 = this.f50946b.d();
        try {
            InterfaceC4780m0 interfaceC4780m0 = this.f50948d;
            if (interfaceC4780m0 == null) {
                if (d10 != null) {
                    d10.close();
                }
                return null;
            }
            if (interfaceC4780m0.getStatus() == f4.DEADLINE_EXCEEDED) {
                if (d10 != null) {
                    d10.close();
                }
                return null;
            }
            AbstractC4856v2 s10 = interfaceC4780m0.s();
            if (d10 != null) {
                d10.close();
            }
            return s10;
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

    /* JADX WARN: Removed duplicated region for block: B:9:0x0017  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public boolean d() {
        boolean z10;
        InterfaceC4765j0 d10 = this.f50946b.d();
        try {
            InterfaceC4790o0 interfaceC4790o0 = this.f50949e;
            if (interfaceC4790o0 != null) {
                if (!interfaceC4790o0.d()) {
                    z10 = true;
                    if (d10 != null) {
                        d10.close();
                    }
                    return z10;
                }
            }
            z10 = false;
            if (d10 != null) {
            }
            return z10;
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

    public boolean e() {
        InterfaceC4765j0 d10 = this.f50946b.d();
        try {
            boolean z10 = this.f50948d != null;
            if (d10 != null) {
                d10.close();
            }
            return z10;
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

    public void f(String str, Object obj) {
        InterfaceC4765j0 d10 = this.f50946b.d();
        try {
            InterfaceC4790o0 interfaceC4790o0 = this.f50949e;
            if (interfaceC4790o0 != null && !interfaceC4790o0.d()) {
                this.f50949e.k(str, obj);
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

    public void g(a aVar) {
        InterfaceC4765j0 d10 = this.f50946b.d();
        try {
            this.f50947c = aVar;
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
