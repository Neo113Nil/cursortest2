package io.sentry;

import io.sentry.util.C4843a;
import java.io.File;

/* renamed from: io.sentry.u2, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C4841u2 {

    /* renamed from: d, reason: collision with root package name */
    public static final C4841u2 f52777d = new C4841u2();

    /* renamed from: a, reason: collision with root package name */
    public boolean f52778a;

    /* renamed from: b, reason: collision with root package name */
    public Boolean f52779b;

    /* renamed from: c, reason: collision with root package name */
    public final C4843a f52780c = new C4843a();

    public static C4841u2 a() {
        return f52777d;
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x004e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Boolean b(String str, boolean z10) {
        InterfaceC4765j0 d10 = this.f52780c.d();
        try {
            if (this.f52778a) {
                Boolean bool = this.f52779b;
                if (d10 != null) {
                    d10.close();
                }
                return bool;
            }
            if (str == null) {
                if (d10 != null) {
                    d10.close();
                }
                return null;
            }
            boolean z11 = true;
            this.f52778a = true;
            File file = new File(str, "last_crash");
            File file2 = new File(str, ".sentry-native/last_crash");
            if (!file.exists()) {
                if (file2.exists()) {
                    if (z10) {
                        file2.delete();
                    }
                    this.f52779b = Boolean.valueOf(z11);
                    if (d10 != null) {
                        d10.close();
                    }
                    return this.f52779b;
                }
                z11 = false;
                this.f52779b = Boolean.valueOf(z11);
                if (d10 != null) {
                }
                return this.f52779b;
            }
            file.delete();
            this.f52779b = Boolean.valueOf(z11);
            if (d10 != null) {
            }
            return this.f52779b;
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

    public void c() {
        InterfaceC4765j0 d10 = this.f52780c.d();
        try {
            this.f52778a = false;
            this.f52779b = null;
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

    public void d(boolean z10) {
        InterfaceC4765j0 d10 = this.f52780c.d();
        try {
            if (!this.f52778a) {
                this.f52779b = Boolean.valueOf(z10);
                this.f52778a = true;
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
}
