package s7;

import android.text.TextUtils;
import android.util.Log;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class n0 extends l1 {

    /* renamed from: c, reason: collision with root package name */
    public char f22900c;

    /* renamed from: d, reason: collision with root package name */
    public long f22901d;

    /* renamed from: e, reason: collision with root package name */
    public String f22902e;

    /* renamed from: f, reason: collision with root package name */
    public final l0 f22903f;

    /* renamed from: g, reason: collision with root package name */
    public final l0 f22904g;

    /* renamed from: h, reason: collision with root package name */
    public final l0 f22905h;

    /* renamed from: i, reason: collision with root package name */
    public final l0 f22906i;
    public final l0 j;

    /* renamed from: k, reason: collision with root package name */
    public final l0 f22907k;

    /* renamed from: l, reason: collision with root package name */
    public final l0 f22908l;

    /* renamed from: m, reason: collision with root package name */
    public final l0 f22909m;

    /* renamed from: n, reason: collision with root package name */
    public final l0 f22910n;

    public n0(f1 f1Var) {
        super(f1Var);
        this.f22900c = (char) 0;
        this.f22901d = -1L;
        this.f22903f = new l0(this, 6, false, false);
        this.f22904g = new l0(this, 6, true, false);
        this.f22905h = new l0(this, 6, false, true);
        this.f22906i = new l0(this, 5, false, false);
        this.j = new l0(this, 5, true, false);
        this.f22907k = new l0(this, 5, false, true);
        this.f22908l = new l0(this, 4, false, false);
        this.f22909m = new l0(this, 3, false, false);
        this.f22910n = new l0(this, 2, false, false);
    }

    public static m0 r(String str) {
        if (str == null) {
            return null;
        }
        return new m0(str);
    }

    public static String u(boolean z5, String str, Object obj, Object obj2, Object obj3) {
        String v5 = v(obj, z5);
        String v10 = v(obj2, z5);
        String v11 = v(obj3, z5);
        StringBuilder sb2 = new StringBuilder();
        String str2 = "";
        if (str == null) {
            str = "";
        }
        if (!TextUtils.isEmpty(str)) {
            sb2.append(str);
            str2 = ": ";
        }
        String str3 = ", ";
        if (!TextUtils.isEmpty(v5)) {
            sb2.append(str2);
            sb2.append(v5);
            str2 = ", ";
        }
        if (TextUtils.isEmpty(v10)) {
            str3 = str2;
        } else {
            sb2.append(str2);
            sb2.append(v10);
        }
        if (!TextUtils.isEmpty(v11)) {
            sb2.append(str3);
            sb2.append(v11);
        }
        return sb2.toString();
    }

    public static String v(Object obj, boolean z5) {
        int lastIndexOf;
        String className;
        int lastIndexOf2;
        if (obj == null) {
            return "";
        }
        if (obj instanceof Integer) {
            obj = Long.valueOf(((Integer) obj).intValue());
        }
        if (obj instanceof Long) {
            if (!z5) {
                return obj.toString();
            }
            Long l6 = (Long) obj;
            if (Math.abs(l6.longValue()) < 100) {
                return obj.toString();
            }
            char charAt = obj.toString().charAt(0);
            String valueOf = String.valueOf(Math.abs(l6.longValue()));
            long round = Math.round(Math.pow(10.0d, valueOf.length() - 1));
            long round2 = Math.round(Math.pow(10.0d, valueOf.length()) - 1.0d);
            int length = String.valueOf(round).length();
            String str = charAt == '-' ? "-" : "";
            StringBuilder sb2 = new StringBuilder(str.length() + str.length() + length + 3 + String.valueOf(round2).length());
            sb2.append(str);
            sb2.append(round);
            sb2.append("...");
            sb2.append(str);
            sb2.append(round2);
            return sb2.toString();
        }
        if (obj instanceof Boolean) {
            return obj.toString();
        }
        if (!(obj instanceof Throwable)) {
            return obj instanceof m0 ? ((m0) obj).f22880a : z5 ? "-" : obj.toString();
        }
        Throwable th2 = (Throwable) obj;
        StringBuilder sb3 = new StringBuilder(z5 ? th2.getClass().getName() : th2.toString());
        String canonicalName = f1.class.getCanonicalName();
        String substring = (TextUtils.isEmpty(canonicalName) || (lastIndexOf = canonicalName.lastIndexOf(46)) == -1) ? "" : canonicalName.substring(0, lastIndexOf);
        StackTraceElement[] stackTrace = th2.getStackTrace();
        int length2 = stackTrace.length;
        int i5 = 0;
        while (true) {
            if (i5 >= length2) {
                break;
            }
            StackTraceElement stackTraceElement = stackTrace[i5];
            if (!stackTraceElement.isNativeMethod() && (className = stackTraceElement.getClassName()) != null) {
                if (((TextUtils.isEmpty(className) || (lastIndexOf2 = className.lastIndexOf(46)) == -1) ? "" : className.substring(0, lastIndexOf2)).equals(substring)) {
                    sb3.append(": ");
                    sb3.append(stackTraceElement);
                    break;
                }
            }
            i5++;
        }
        return sb3.toString();
    }

    @Override // s7.l1
    public final boolean k() {
        return false;
    }

    public final l0 n() {
        return this.f22903f;
    }

    public final l0 o() {
        return this.f22906i;
    }

    public final l0 p() {
        return this.f22909m;
    }

    public final l0 q() {
        return this.f22910n;
    }

    public final void s(int i5, boolean z5, boolean z7, String str, Object obj, Object obj2, Object obj3) {
        if (!z5 && Log.isLoggable(t(), i5)) {
            Log.println(i5, t(), u(false, str, obj, obj2, obj3));
        }
        if (z7 || i5 < 5) {
            return;
        }
        g6.v.h(str);
        d1 d1Var = ((f1) this.f3328a).f22746g;
        if (d1Var == null) {
            Log.println(6, t(), "Scheduler not set. Not logging error/warn");
        } else {
            if (!d1Var.f22870b) {
                Log.println(6, t(), "Scheduler not initialized. Not logging error/warn");
                return;
            }
            if (i5 >= 9) {
                i5 = 8;
            }
            d1Var.s(new k0(this, i5, str, obj, obj2, obj3));
        }
    }

    public final String t() {
        String str;
        synchronized (this) {
            try {
                if (this.f22902e == null) {
                    ((f1) ((f1) this.f3328a).f22743d.f3328a).getClass();
                    this.f22902e = "FA";
                }
                g6.v.h(this.f22902e);
                str = this.f22902e;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return str;
    }
}
