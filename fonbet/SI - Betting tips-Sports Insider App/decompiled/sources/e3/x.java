package e3;

import android.util.Log;
import io.sentry.android.core.w0;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class x {

    /* renamed from: b, reason: collision with root package name */
    public static final Object f8569b = new Object();

    /* renamed from: c, reason: collision with root package name */
    public static volatile x f8570c;

    /* renamed from: a, reason: collision with root package name */
    public final int f8571a;

    public x(int i5) {
        this.f8571a = i5;
    }

    public static x e() {
        x xVar;
        synchronized (f8569b) {
            try {
                if (f8570c == null) {
                    f8570c = new x(3);
                }
                xVar = f8570c;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return xVar;
    }

    public static String g(String str) {
        int length = str.length();
        StringBuilder sb2 = new StringBuilder(23);
        sb2.append("WM-");
        if (length >= 20) {
            sb2.append(str.substring(0, 20));
        } else {
            sb2.append(str);
        }
        return sb2.toString();
    }

    public final void a(String str, String str2) {
        if (this.f8571a <= 3) {
            Log.d(str, str2);
        }
    }

    public final void b(String str, String str2, Throwable th2) {
        if (this.f8571a <= 3) {
            Log.d(str, str2, th2);
        }
    }

    public final void c(String str, String str2) {
        if (this.f8571a <= 6) {
            w0.d(str, str2);
        }
    }

    public final void d(String str, String str2, Throwable th2) {
        if (this.f8571a <= 6) {
            w0.e(str, str2, th2);
        }
    }

    public final void f(String str, String str2) {
        if (this.f8571a <= 4) {
            Log.i(str, str2);
        }
    }

    public final void h(String str, String str2) {
        if (this.f8571a <= 5) {
            w0.m(str, str2);
        }
    }
}
