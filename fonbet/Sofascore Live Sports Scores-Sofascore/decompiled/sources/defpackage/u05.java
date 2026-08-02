package defpackage;

import android.content.Context;
import android.content.SharedPreferences;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class u05 {
    public static final l10 c = l10.c();
    public static u05 d;
    public volatile SharedPreferences a;
    public final ExecutorService b;

    public u05(ExecutorService executorService) {
        this.b = executorService;
    }

    public static Context a() {
        try {
            r38.c();
            r38 c2 = r38.c();
            c2.a();
            return c2.a;
        } catch (IllegalStateException unused) {
            return null;
        }
    }

    public static synchronized u05 b() {
        u05 u05Var;
        synchronized (u05.class) {
            u05Var = d;
            if (u05Var == null) {
                u05Var = new u05(Executors.newSingleThreadExecutor());
                d = u05Var;
            }
        }
        return u05Var;
    }

    public final synchronized void c(Context context) {
        if (this.a == null && context != null) {
            this.b.execute(new mc3(26, this, context));
        }
    }

    public final void d(long j, String str) {
        if (this.a == null) {
            c(a());
            if (this.a == null) {
                return;
            }
        }
        this.a.edit().putLong(str, j).apply();
    }

    public final void e(String str, double d2) {
        if (this.a == null) {
            c(a());
            if (this.a == null) {
                return;
            }
        }
        this.a.edit().putLong(str, Double.doubleToRawLongBits(d2)).apply();
    }

    public final void f(String str, String str2) {
        if (this.a == null) {
            c(a());
            if (this.a == null) {
                return;
            }
        }
        SharedPreferences sharedPreferences = this.a;
        if (str2 == null) {
            sharedPreferences.edit().remove(str).apply();
        } else {
            sharedPreferences.edit().putString(str, str2).apply();
        }
    }

    public final void g(String str, boolean z) {
        if (this.a == null) {
            c(a());
            if (this.a == null) {
                return;
            }
        }
        this.a.edit().putBoolean(str, z).apply();
    }
}
