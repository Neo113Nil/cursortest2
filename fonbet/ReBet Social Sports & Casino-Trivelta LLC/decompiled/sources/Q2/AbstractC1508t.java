package Q2;

import android.util.Log;

/* renamed from: Q2.t, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC1508t {

    /* renamed from: a, reason: collision with root package name */
    public static final Object f9305a = new Object();

    /* renamed from: b, reason: collision with root package name */
    public static volatile AbstractC1508t f9306b = null;

    /* renamed from: c, reason: collision with root package name */
    public static final int f9307c = 20;

    public AbstractC1508t(int i10) {
    }

    public static AbstractC1508t e() {
        AbstractC1508t abstractC1508t;
        synchronized (f9305a) {
            try {
                if (f9306b == null) {
                    f9306b = new a(3);
                }
                abstractC1508t = f9306b;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return abstractC1508t;
    }

    public static void h(AbstractC1508t abstractC1508t) {
        synchronized (f9305a) {
            try {
                if (f9306b == null) {
                    f9306b = abstractC1508t;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public static String i(String str) {
        int length = str.length();
        StringBuilder sb2 = new StringBuilder(23);
        sb2.append("WM-");
        int i10 = f9307c;
        if (length >= i10) {
            sb2.append(str.substring(0, i10));
        } else {
            sb2.append(str);
        }
        return sb2.toString();
    }

    public abstract void a(String str, String str2);

    public abstract void b(String str, String str2, Throwable th2);

    public abstract void c(String str, String str2);

    public abstract void d(String str, String str2, Throwable th2);

    public abstract void f(String str, String str2);

    public abstract void g(String str, String str2, Throwable th2);

    public abstract void j(String str, String str2);

    public abstract void k(String str, String str2);

    public abstract void l(String str, String str2, Throwable th2);

    /* renamed from: Q2.t$a */
    public static class a extends AbstractC1508t {

        /* renamed from: d, reason: collision with root package name */
        public final int f9308d;

        public a(int i10) {
            super(i10);
            this.f9308d = i10;
        }

        @Override // Q2.AbstractC1508t
        public void c(String str, String str2) {
            if (this.f9308d <= 6) {
                Log.e(str, str2);
            }
        }

        @Override // Q2.AbstractC1508t
        public void d(String str, String str2, Throwable th2) {
            if (this.f9308d <= 6) {
                Log.e(str, str2, th2);
            }
        }

        @Override // Q2.AbstractC1508t
        public void f(String str, String str2) {
            if (this.f9308d <= 4) {
                Log.i(str, str2);
            }
        }

        @Override // Q2.AbstractC1508t
        public void g(String str, String str2, Throwable th2) {
            if (this.f9308d <= 4) {
                Log.i(str, str2, th2);
            }
        }

        @Override // Q2.AbstractC1508t
        public void k(String str, String str2) {
            if (this.f9308d <= 5) {
                Log.w(str, str2);
            }
        }

        @Override // Q2.AbstractC1508t
        public void l(String str, String str2, Throwable th2) {
            if (this.f9308d <= 5) {
                Log.w(str, str2, th2);
            }
        }

        @Override // Q2.AbstractC1508t
        public void a(String str, String str2) {
        }

        @Override // Q2.AbstractC1508t
        public void j(String str, String str2) {
        }

        @Override // Q2.AbstractC1508t
        public void b(String str, String str2, Throwable th2) {
        }
    }
}
