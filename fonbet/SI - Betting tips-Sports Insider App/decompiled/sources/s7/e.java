package s7;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.text.TextUtils;
import java.lang.reflect.InvocationTargetException;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class e extends c0.x {

    /* renamed from: b, reason: collision with root package name */
    public Boolean f22689b;

    /* renamed from: c, reason: collision with root package name */
    public String f22690c;

    /* renamed from: d, reason: collision with root package name */
    public d f22691d;

    /* renamed from: e, reason: collision with root package name */
    public Boolean f22692e;

    public final boolean k(String str) {
        return "1".equals(this.f22691d.d(str, "gaia_collection_enabled"));
    }

    public final boolean l(String str) {
        return "1".equals(this.f22691d.d(str, "measurement.event_sampling_enabled"));
    }

    public final boolean m() {
        if (this.f22689b == null) {
            Boolean v5 = v("app_measurement_lite");
            this.f22689b = v5;
            if (v5 == null) {
                this.f22689b = Boolean.FALSE;
            }
        }
        return this.f22689b.booleanValue() || !((f1) this.f3328a).f22741b;
    }

    public final String n(String str) {
        f1 f1Var = (f1) this.f3328a;
        try {
            String str2 = (String) Class.forName("android.os.SystemProperties").getMethod("get", String.class, String.class).invoke(null, str, "");
            g6.v.h(str2);
            return str2;
        } catch (ClassNotFoundException e7) {
            n0 n0Var = f1Var.f22745f;
            f1.m(n0Var);
            n0Var.f22903f.b(e7, "Could not find SystemProperties class");
            return "";
        } catch (IllegalAccessException e9) {
            n0 n0Var2 = f1Var.f22745f;
            f1.m(n0Var2);
            n0Var2.f22903f.b(e9, "Could not access SystemProperties.get()");
            return "";
        } catch (NoSuchMethodException e10) {
            n0 n0Var3 = f1Var.f22745f;
            f1.m(n0Var3);
            n0Var3.f22903f.b(e10, "Could not find SystemProperties.get() method");
            return "";
        } catch (InvocationTargetException e11) {
            n0 n0Var4 = f1Var.f22745f;
            f1.m(n0Var4);
            n0Var4.f22903f.b(e11, "SystemProperties.get() threw an exception");
            return "";
        }
    }

    public final void o() {
        ((f1) this.f3328a).getClass();
    }

    public final String p(String str, w wVar) {
        return TextUtils.isEmpty(str) ? (String) wVar.a(null) : (String) wVar.a(this.f22691d.d(str, wVar.f23158a));
    }

    public final long q(String str, w wVar) {
        if (TextUtils.isEmpty(str)) {
            return ((Long) wVar.a(null)).longValue();
        }
        String d10 = this.f22691d.d(str, wVar.f23158a);
        if (TextUtils.isEmpty(d10)) {
            return ((Long) wVar.a(null)).longValue();
        }
        try {
            return ((Long) wVar.a(Long.valueOf(Long.parseLong(d10)))).longValue();
        } catch (NumberFormatException unused) {
            return ((Long) wVar.a(null)).longValue();
        }
    }

    public final int r(String str, w wVar) {
        if (TextUtils.isEmpty(str)) {
            return ((Integer) wVar.a(null)).intValue();
        }
        String d10 = this.f22691d.d(str, wVar.f23158a);
        if (TextUtils.isEmpty(d10)) {
            return ((Integer) wVar.a(null)).intValue();
        }
        try {
            return ((Integer) wVar.a(Integer.valueOf(Integer.parseInt(d10)))).intValue();
        } catch (NumberFormatException unused) {
            return ((Integer) wVar.a(null)).intValue();
        }
    }

    public final double s(String str, w wVar) {
        if (TextUtils.isEmpty(str)) {
            return ((Double) wVar.a(null)).doubleValue();
        }
        String d10 = this.f22691d.d(str, wVar.f23158a);
        if (TextUtils.isEmpty(d10)) {
            return ((Double) wVar.a(null)).doubleValue();
        }
        try {
            return ((Double) wVar.a(Double.valueOf(Double.parseDouble(d10)))).doubleValue();
        } catch (NumberFormatException unused) {
            return ((Double) wVar.a(null)).doubleValue();
        }
    }

    public final boolean t(String str, w wVar) {
        if (TextUtils.isEmpty(str)) {
            return ((Boolean) wVar.a(null)).booleanValue();
        }
        String d10 = this.f22691d.d(str, wVar.f23158a);
        return TextUtils.isEmpty(d10) ? ((Boolean) wVar.a(null)).booleanValue() : ((Boolean) wVar.a(Boolean.valueOf("1".equals(d10)))).booleanValue();
    }

    public final Bundle u() {
        f1 f1Var = (f1) this.f3328a;
        try {
            Context context = f1Var.f22740a;
            Context context2 = f1Var.f22740a;
            n0 n0Var = f1Var.f22745f;
            if (context.getPackageManager() == null) {
                f1.m(n0Var);
                n0Var.f22903f.a("Failed to load metadata: PackageManager is null");
                return null;
            }
            ApplicationInfo a7 = s6.c.a(context2).a(128, context2.getPackageName());
            if (a7 != null) {
                return a7.metaData;
            }
            f1.m(n0Var);
            n0Var.f22903f.a("Failed to load metadata: ApplicationInfo is null");
            return null;
        } catch (PackageManager.NameNotFoundException e7) {
            n0 n0Var2 = f1Var.f22745f;
            f1.m(n0Var2);
            n0Var2.f22903f.b(e7, "Failed to load metadata: Package name not found");
            return null;
        }
    }

    public final Boolean v(String str) {
        g6.v.e(str);
        Bundle u10 = u();
        if (u10 != null) {
            if (u10.containsKey(str)) {
                return Boolean.valueOf(u10.getBoolean(str));
            }
            return null;
        }
        n0 n0Var = ((f1) this.f3328a).f22745f;
        f1.m(n0Var);
        n0Var.f22903f.a("Failed to load metadata: Metadata bundle is null");
        return null;
    }

    public final boolean w() {
        ((f1) this.f3328a).getClass();
        Boolean v5 = v("firebase_analytics_collection_deactivated");
        return v5 != null && v5.booleanValue();
    }

    public final boolean x() {
        Boolean v5 = v("google_analytics_automatic_screen_reporting_enabled");
        return v5 == null || v5.booleanValue();
    }

    public final n1 y(String str, boolean z5) {
        Object obj;
        g6.v.e(str);
        f1 f1Var = (f1) this.f3328a;
        Bundle u10 = u();
        if (u10 == null) {
            n0 n0Var = f1Var.f22745f;
            f1.m(n0Var);
            n0Var.f22903f.a("Failed to load metadata: Metadata bundle is null");
            obj = null;
        } else {
            obj = u10.get(str);
        }
        n1 n1Var = n1.UNINITIALIZED;
        if (obj == null) {
            return n1Var;
        }
        if (Boolean.TRUE.equals(obj)) {
            return n1.GRANTED;
        }
        if (Boolean.FALSE.equals(obj)) {
            return n1.DENIED;
        }
        if (z5 && "eu_consent_policy".equals(obj)) {
            return n1.POLICY;
        }
        n0 n0Var2 = f1Var.f22745f;
        f1.m(n0Var2);
        n0Var2.f22906i.b(str, "Invalid manifest metadata for");
        return n1Var;
    }
}
