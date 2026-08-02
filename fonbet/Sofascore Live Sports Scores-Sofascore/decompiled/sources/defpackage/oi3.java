package defpackage;

import android.os.Bundle;
import com.google.firebase.perf.config.RemoteConfigManager;
import com.unity3d.services.UnityAdsConstants;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class oi3 {
    public static final l10 d = l10.c();
    public static volatile oi3 e;
    public final RemoteConfigManager a = RemoteConfigManager.getInstance();
    public tu9 b = new tu9();
    public final u05 c = u05.b();

    public static synchronized oi3 e() {
        oi3 oi3Var;
        synchronized (oi3.class) {
            try {
                if (e == null) {
                    e = new oi3();
                }
                oi3Var = e;
            } catch (Throwable th) {
                throw th;
            }
        }
        return oi3Var;
    }

    public static boolean l(long j) {
        return j >= 0;
    }

    public static boolean m(String str) {
        if (!str.trim().isEmpty()) {
            for (String str2 : str.split(";")) {
                if (str2.trim().equals("22.0.6")) {
                    return true;
                }
            }
        }
        return false;
    }

    public static boolean n(long j) {
        return j >= 0;
    }

    public static boolean p(double d2) {
        return 0.0d <= d2 && d2 <= 1.0d;
    }

    public final jvd a(c5n c5nVar) {
        u05 u05Var = this.c;
        String B = c5nVar.B();
        if (B == null) {
            u05Var.getClass();
            u05.c.getClass();
            return new jvd();
        }
        if (u05Var.a == null) {
            u05Var.c(u05.a());
            if (u05Var.a == null) {
                return new jvd();
            }
        }
        if (!u05Var.a.contains(B)) {
            return new jvd();
        }
        try {
            return new jvd(Boolean.valueOf(u05Var.a.getBoolean(B, false)));
        } catch (ClassCastException e2) {
            u05.c.a("Key %s from sharedPreferences has type other than long: %s", B, e2.getMessage());
            return new jvd();
        }
    }

    public final jvd b(c5n c5nVar) {
        u05 u05Var = this.c;
        String B = c5nVar.B();
        if (B == null) {
            u05Var.getClass();
            u05.c.getClass();
            return new jvd();
        }
        if (u05Var.a == null) {
            u05Var.c(u05.a());
            if (u05Var.a == null) {
                return new jvd();
            }
        }
        if (!u05Var.a.contains(B)) {
            return new jvd();
        }
        try {
            try {
                return new jvd(Double.valueOf(Double.longBitsToDouble(u05Var.a.getLong(B, 0L))));
            } catch (ClassCastException e2) {
                u05.c.a("Key %s from sharedPreferences has type other than double: %s", B, e2.getMessage());
                return new jvd();
            }
        } catch (ClassCastException unused) {
            return new jvd(Double.valueOf(Float.valueOf(u05Var.a.getFloat(B, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT)).doubleValue()));
        }
    }

    public final jvd c(c5n c5nVar) {
        u05 u05Var = this.c;
        String B = c5nVar.B();
        if (B == null) {
            u05Var.getClass();
            u05.c.getClass();
            return new jvd();
        }
        if (u05Var.a == null) {
            u05Var.c(u05.a());
            if (u05Var.a == null) {
                return new jvd();
            }
        }
        if (!u05Var.a.contains(B)) {
            return new jvd();
        }
        try {
            return new jvd(Long.valueOf(u05Var.a.getLong(B, 0L)));
        } catch (ClassCastException e2) {
            u05.c.a("Key %s from sharedPreferences has type other than long: %s", B, e2.getMessage());
            return new jvd();
        }
    }

    public final jvd d(c5n c5nVar) {
        u05 u05Var = this.c;
        String B = c5nVar.B();
        if (B == null) {
            u05Var.getClass();
            u05.c.getClass();
            return new jvd();
        }
        if (u05Var.a == null) {
            u05Var.c(u05.a());
            if (u05Var.a == null) {
                return new jvd();
            }
        }
        if (!u05Var.a.contains(B)) {
            return new jvd();
        }
        try {
            return new jvd(u05Var.a.getString(B, ""));
        } catch (ClassCastException e2) {
            u05.c.a("Key %s from sharedPreferences has type other than String: %s", B, e2.getMessage());
            return new jvd();
        }
    }

    public final Boolean f() {
        ui3 ui3Var;
        synchronized (ui3.class) {
            ui3Var = ui3.h;
            if (ui3Var == null) {
                ui3Var = new ui3();
                ui3.h = ui3Var;
            }
        }
        jvd h = h(ui3Var);
        return h.b() ? (Boolean) h.a() : Boolean.FALSE;
    }

    public final Boolean g() {
        if (f().booleanValue()) {
            return Boolean.FALSE;
        }
        vi3 Q = vi3.Q();
        jvd a = a(Q);
        if (a.b()) {
            return (Boolean) a.a();
        }
        jvd h = h(Q);
        if (h.b()) {
            return (Boolean) h.a();
        }
        return null;
    }

    public final jvd h(c5n c5nVar) {
        Bundle bundle = this.b.a;
        String E = c5nVar.E();
        if (E == null || !bundle.containsKey(E)) {
            return new jvd();
        }
        try {
            Boolean bool = (Boolean) bundle.get(E);
            return bool == null ? new jvd() : new jvd(bool);
        } catch (ClassCastException e2) {
            tu9.b.a("Metadata key %s contains type other than boolean: %s", E, e2.getMessage());
            return new jvd();
        }
    }

    public final jvd i(c5n c5nVar) {
        Bundle bundle = this.b.a;
        String E = c5nVar.E();
        if (E == null || !bundle.containsKey(E)) {
            return new jvd();
        }
        Object obj = bundle.get(E);
        if (obj == null) {
            return new jvd();
        }
        if (obj instanceof Float) {
            return new jvd(Double.valueOf(((Float) obj).doubleValue()));
        }
        if (obj instanceof Double) {
            return new jvd((Double) obj);
        }
        tu9.b.a("Metadata key %s contains type other than double: %s", E);
        return new jvd();
    }

    public final jvd j(c5n c5nVar) {
        jvd jvdVar;
        Bundle bundle = this.b.a;
        String E = c5nVar.E();
        if (E == null || !bundle.containsKey(E)) {
            jvdVar = new jvd();
        } else {
            try {
                Integer num = (Integer) bundle.get(E);
                jvdVar = num == null ? new jvd() : new jvd(num);
            } catch (ClassCastException e2) {
                tu9.b.a("Metadata key %s contains type other than int: %s", E, e2.getMessage());
                jvdVar = new jvd();
            }
        }
        return jvdVar.b() ? new jvd(Long.valueOf(((Integer) jvdVar.a()).intValue())) : new jvd();
    }

    public final long k() {
        dj3 dj3Var;
        synchronized (dj3.class) {
            dj3Var = dj3.h;
            if (dj3Var == null) {
                dj3Var = new dj3();
                dj3.h = dj3Var;
            }
        }
        jvd jvdVar = this.a.getLong("fpr_rl_time_limit_sec");
        if (jvdVar.b() && ((Long) jvdVar.a()).longValue() > 0) {
            this.c.d(((Long) jvdVar.a()).longValue(), "com.google.firebase.perf.TimeLimitSec");
            return ((Long) jvdVar.a()).longValue();
        }
        jvd c = c(dj3Var);
        if (!c.b() || ((Long) c.a()).longValue() <= 0) {
            return 600L;
        }
        return ((Long) c.a()).longValue();
    }

    public final boolean o() {
        fj3 fj3Var;
        boolean booleanValue;
        ej3 ej3Var;
        boolean m;
        Boolean g = g();
        if (g == null || g.booleanValue()) {
            synchronized (fj3.class) {
                fj3Var = fj3.h;
                if (fj3Var == null) {
                    fj3Var = new fj3();
                    fj3.h = fj3Var;
                }
            }
            jvd a = a(fj3Var);
            jvd jvdVar = this.a.getBoolean("fpr_enabled");
            if (!jvdVar.b()) {
                booleanValue = a.b() ? ((Boolean) a.a()).booleanValue() : true;
            } else if (this.a.isLastFetchFailed()) {
                booleanValue = false;
            } else {
                Boolean bool = (Boolean) jvdVar.a();
                if (!a.b() || a.a() != bool) {
                    this.c.g("com.google.firebase.perf.SdkEnabled", bool.booleanValue());
                }
                booleanValue = bool.booleanValue();
            }
            if (booleanValue) {
                synchronized (ej3.class) {
                    ej3Var = ej3.h;
                    if (ej3Var == null) {
                        ej3Var = new ej3();
                        ej3.h = ej3Var;
                    }
                }
                jvd d2 = d(ej3Var);
                jvd string = this.a.getString("fpr_disabled_android_versions");
                if (string.b()) {
                    String str = (String) string.a();
                    if (!d2.b() || !((String) d2.a()).equals(str)) {
                        this.c.f("com.google.firebase.perf.SdkDisabledVersions", str);
                    }
                    m = m(str);
                } else {
                    m = d2.b() ? m((String) d2.a()) : m("");
                }
                if (!m) {
                    return true;
                }
            }
        }
        return false;
    }
}
