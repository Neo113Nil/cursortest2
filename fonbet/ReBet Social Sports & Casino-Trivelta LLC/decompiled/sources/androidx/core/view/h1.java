package androidx.core.view;

import android.os.Build;
import android.view.View;
import android.view.Window;
import android.view.WindowInsetsController;
import io.agora.rtc2.internal.AudioRoutingController;

/* loaded from: classes.dex */
public final class h1 {

    /* renamed from: a, reason: collision with root package name */
    public final g f19226a;

    public static class a extends g {

        /* renamed from: a, reason: collision with root package name */
        public final Window f19227a;

        /* renamed from: b, reason: collision with root package name */
        public final Q f19228b;

        public a(Window window, Q q10) {
            this.f19227a = window;
            this.f19228b = q10;
        }

        @Override // androidx.core.view.h1.g
        public int a() {
            Object tag = this.f19227a.getDecorView().getTag(356039078);
            if (tag != null) {
                return ((Integer) tag).intValue();
            }
            return 1;
        }

        @Override // androidx.core.view.h1.g
        public void b(int i10) {
            for (int i11 = 1; i11 <= 512; i11 <<= 1) {
                if ((i10 & i11) != 0) {
                    h(i11);
                }
            }
        }

        @Override // androidx.core.view.h1.g
        public void f(int i10) {
            this.f19227a.getDecorView().setTag(356039078, Integer.valueOf(i10));
            if (i10 == 0) {
                l(6144);
                return;
            }
            if (i10 == 1) {
                l(4096);
                i(2048);
            } else {
                if (i10 != 2) {
                    return;
                }
                l(2048);
                i(4096);
            }
        }

        @Override // androidx.core.view.h1.g
        public void g(int i10) {
            for (int i11 = 1; i11 <= 512; i11 <<= 1) {
                if ((i10 & i11) != 0) {
                    k(i11);
                }
            }
        }

        public final void h(int i10) {
            if (i10 == 1) {
                i(4);
            } else if (i10 == 2) {
                i(2);
            } else {
                if (i10 != 8) {
                    return;
                }
                this.f19228b.a();
            }
        }

        public void i(int i10) {
            View decorView = this.f19227a.getDecorView();
            decorView.setSystemUiVisibility(i10 | decorView.getSystemUiVisibility());
        }

        public void j(int i10) {
            this.f19227a.addFlags(i10);
        }

        public final void k(int i10) {
            if (i10 == 1) {
                l(4);
                m(1024);
            } else if (i10 == 2) {
                l(2);
            } else {
                if (i10 != 8) {
                    return;
                }
                this.f19228b.b();
            }
        }

        public void l(int i10) {
            View decorView = this.f19227a.getDecorView();
            decorView.setSystemUiVisibility((~i10) & decorView.getSystemUiVisibility());
        }

        public void m(int i10) {
            this.f19227a.clearFlags(i10);
        }
    }

    public static class b extends a {
        public b(Window window, Q q10) {
            super(window, q10);
        }

        @Override // androidx.core.view.h1.g
        public boolean c() {
            return (this.f19227a.getDecorView().getSystemUiVisibility() & 8192) != 0;
        }

        @Override // androidx.core.view.h1.g
        public void e(boolean z10) {
            if (!z10) {
                l(8192);
                return;
            }
            m(AudioRoutingController.DEVICE_OUT_USB_HEADSET);
            j(Integer.MIN_VALUE);
            i(8192);
        }
    }

    public static class c extends b {
        public c(Window window, Q q10) {
            super(window, q10);
        }

        @Override // androidx.core.view.h1.g
        public void d(boolean z10) {
            if (!z10) {
                l(16);
                return;
            }
            m(134217728);
            j(Integer.MIN_VALUE);
            i(16);
        }
    }

    public static class e extends d {
        public e(Window window, h1 h1Var, Q q10) {
            super(window, h1Var, q10);
        }

        @Override // androidx.core.view.h1.d, androidx.core.view.h1.g
        public int a() {
            int systemBarsBehavior;
            systemBarsBehavior = this.f19230b.getSystemBarsBehavior();
            return systemBarsBehavior;
        }

        @Override // androidx.core.view.h1.d, androidx.core.view.h1.g
        public void f(int i10) {
            this.f19230b.setSystemBarsBehavior(i10);
        }

        public e(WindowInsetsController windowInsetsController, h1 h1Var, Q q10) {
            super(windowInsetsController, h1Var, q10);
        }
    }

    public static class f extends e {
        public f(Window window, h1 h1Var, Q q10) {
            super(window, h1Var, q10);
        }

        @Override // androidx.core.view.h1.d, androidx.core.view.h1.g
        public boolean c() {
            int systemBarsAppearance;
            systemBarsAppearance = this.f19230b.getSystemBarsAppearance();
            return (systemBarsAppearance & 8) != 0;
        }

        public f(WindowInsetsController windowInsetsController, h1 h1Var, Q q10) {
            super(windowInsetsController, h1Var, q10);
        }
    }

    public static class g {
        public abstract int a();

        public abstract void b(int i10);

        public abstract boolean c();

        public void d(boolean z10) {
        }

        public abstract void e(boolean z10);

        public abstract void f(int i10);

        public abstract void g(int i10);
    }

    public h1(WindowInsetsController windowInsetsController) {
        if (Build.VERSION.SDK_INT >= 35) {
            this.f19226a = new f(windowInsetsController, this, new Q(windowInsetsController));
        } else {
            this.f19226a = new d(windowInsetsController, this, new Q(windowInsetsController));
        }
    }

    public static h1 h(WindowInsetsController windowInsetsController) {
        return new h1(windowInsetsController);
    }

    public int a() {
        return this.f19226a.a();
    }

    public void b(int i10) {
        this.f19226a.b(i10);
    }

    public boolean c() {
        return this.f19226a.c();
    }

    public void d(boolean z10) {
        this.f19226a.d(z10);
    }

    public void e(boolean z10) {
        this.f19226a.e(z10);
    }

    public void f(int i10) {
        this.f19226a.f(i10);
    }

    public void g(int i10) {
        this.f19226a.g(i10);
    }

    public static class d extends g {

        /* renamed from: a, reason: collision with root package name */
        public final h1 f19229a;

        /* renamed from: b, reason: collision with root package name */
        public final WindowInsetsController f19230b;

        /* renamed from: c, reason: collision with root package name */
        public final Q f19231c;

        /* renamed from: d, reason: collision with root package name */
        public final z.r f19232d;

        /* renamed from: e, reason: collision with root package name */
        public Window f19233e;

        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public d(Window window, h1 h1Var, Q q10) {
            this(r0, h1Var, q10);
            WindowInsetsController insetsController;
            insetsController = window.getInsetsController();
            this.f19233e = window;
        }

        @Override // androidx.core.view.h1.g
        public int a() {
            int systemBarsBehavior;
            Window window = this.f19233e;
            if (window == null) {
                systemBarsBehavior = this.f19230b.getSystemBarsBehavior();
                return systemBarsBehavior;
            }
            Object tag = window.getDecorView().getTag(356039078);
            if (tag != null) {
                return ((Integer) tag).intValue();
            }
            return 1;
        }

        @Override // androidx.core.view.h1.g
        public void b(int i10) {
            if ((i10 & 8) != 0) {
                this.f19231c.a();
            }
            this.f19230b.hide(i10 & (-9));
        }

        @Override // androidx.core.view.h1.g
        public boolean c() {
            int systemBarsAppearance;
            this.f19230b.setSystemBarsAppearance(0, 0);
            systemBarsAppearance = this.f19230b.getSystemBarsAppearance();
            return (systemBarsAppearance & 8) != 0;
        }

        @Override // androidx.core.view.h1.g
        public void d(boolean z10) {
            if (z10) {
                if (this.f19233e != null) {
                    h(16);
                }
                this.f19230b.setSystemBarsAppearance(16, 16);
            } else {
                if (this.f19233e != null) {
                    i(16);
                }
                this.f19230b.setSystemBarsAppearance(0, 16);
            }
        }

        @Override // androidx.core.view.h1.g
        public void e(boolean z10) {
            if (z10) {
                if (this.f19233e != null) {
                    h(8192);
                }
                this.f19230b.setSystemBarsAppearance(8, 8);
            } else {
                if (this.f19233e != null) {
                    i(8192);
                }
                this.f19230b.setSystemBarsAppearance(0, 8);
            }
        }

        @Override // androidx.core.view.h1.g
        public void f(int i10) {
            Window window = this.f19233e;
            if (window == null) {
                this.f19230b.setSystemBarsBehavior(i10);
                return;
            }
            window.getDecorView().setTag(356039078, Integer.valueOf(i10));
            if (i10 == 0) {
                i(6144);
                return;
            }
            if (i10 == 1) {
                i(4096);
                h(2048);
            } else {
                if (i10 != 2) {
                    return;
                }
                i(2048);
                h(4096);
            }
        }

        @Override // androidx.core.view.h1.g
        public void g(int i10) {
            if ((i10 & 8) != 0) {
                this.f19231c.b();
            }
            this.f19230b.show(i10 & (-9));
        }

        public void h(int i10) {
            View decorView = this.f19233e.getDecorView();
            decorView.setSystemUiVisibility(i10 | decorView.getSystemUiVisibility());
        }

        public void i(int i10) {
            View decorView = this.f19233e.getDecorView();
            decorView.setSystemUiVisibility((~i10) & decorView.getSystemUiVisibility());
        }

        public d(WindowInsetsController windowInsetsController, h1 h1Var, Q q10) {
            this.f19232d = new z.r();
            this.f19230b = windowInsetsController;
            this.f19229a = h1Var;
            this.f19231c = q10;
        }
    }

    public h1(Window window, View view) {
        Q q10 = new Q(view);
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 35) {
            this.f19226a = new f(window, this, q10);
            return;
        }
        if (i10 >= 30) {
            this.f19226a = new d(window, this, q10);
        } else if (i10 >= 26) {
            this.f19226a = new c(window, q10);
        } else {
            this.f19226a = new b(window, q10);
        }
    }
}
