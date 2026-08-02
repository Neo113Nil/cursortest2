package O2;

import P2.a;
import P2.h;
import P2.s;
import P2.t;
import P2.u;
import P2.v;
import android.os.Build;
import android.util.Log;
import android.webkit.WebSettings;

/* loaded from: classes.dex */
public abstract class d {
    public static s a(WebSettings webSettings) {
        try {
            return v.c().a(webSettings);
        } catch (ClassCastException e10) {
            if (Build.VERSION.SDK_INT != 30 || !"android.webkit.WebSettingsWrapper".equals(webSettings.getClass().getCanonicalName())) {
                throw e10;
            }
            Log.e("WebSettingsCompat", "Error converting WebSettings to Chrome implementation. All AndroidX method calls on this WebSettings instance will be no-op calls. See https://crbug.com/388824130 for more info.", e10);
            return new t();
        }
    }

    public static void b(WebSettings webSettings, boolean z10) {
        if (!u.f8739Q.c()) {
            throw u.a();
        }
        a(webSettings).a(z10);
    }

    public static void c(WebSettings webSettings, int i10) {
        a.h hVar = u.f8742T;
        if (hVar.b()) {
            h.a(webSettings, i10);
        } else {
            if (!hVar.c()) {
                throw u.a();
            }
            a(webSettings).b(i10);
        }
    }

    public static void d(WebSettings webSettings, int i10) {
        if (!u.f8743U.c()) {
            throw u.a();
        }
        a(webSettings).c(i10);
    }

    public static void e(WebSettings webSettings, boolean z10) {
        if (!u.f8788t0.c()) {
            throw u.a();
        }
        a(webSettings).d(z10);
    }
}
