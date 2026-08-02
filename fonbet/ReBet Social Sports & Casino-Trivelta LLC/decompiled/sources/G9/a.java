package G9;

import android.util.Log;
import com.google.android.gms.common.internal.C3183g;
import java.util.Locale;

/* loaded from: classes2.dex */
public class a {

    /* renamed from: a, reason: collision with root package name */
    public final String f3916a;

    /* renamed from: b, reason: collision with root package name */
    public final String f3917b;

    /* renamed from: c, reason: collision with root package name */
    public final C3183g f3918c;

    /* renamed from: d, reason: collision with root package name */
    public final int f3919d;

    public a(String str, String... strArr) {
        String sb2;
        if (strArr.length == 0) {
            sb2 = "";
        } else {
            StringBuilder sb3 = new StringBuilder();
            sb3.append('[');
            for (String str2 : strArr) {
                if (sb3.length() > 1) {
                    sb3.append(",");
                }
                sb3.append(str2);
            }
            sb3.append("] ");
            sb2 = sb3.toString();
        }
        this.f3917b = sb2;
        this.f3916a = str;
        this.f3918c = new C3183g(str);
        int i10 = 2;
        while (i10 <= 7 && !Log.isLoggable(this.f3916a, i10)) {
            i10++;
        }
        this.f3919d = i10;
    }

    public void a(String str, Object... objArr) {
        if (f(3)) {
            d(str, objArr);
        }
    }

    public void b(String str, Throwable th2, Object... objArr) {
        Log.e(this.f3916a, d(str, objArr), th2);
    }

    public void c(String str, Object... objArr) {
        Log.e(this.f3916a, d(str, objArr));
    }

    public String d(String str, Object... objArr) {
        if (objArr != null && objArr.length > 0) {
            str = String.format(Locale.US, str, objArr);
        }
        return this.f3917b.concat(str);
    }

    public void e(String str, Object... objArr) {
        Log.i(this.f3916a, d(str, objArr));
    }

    public boolean f(int i10) {
        return this.f3919d <= i10;
    }

    public void g(String str, Object... objArr) {
        if (f(2)) {
            d(str, objArr);
        }
    }

    public void h(String str, Object... objArr) {
        Log.w(this.f3916a, d(str, objArr));
    }

    public void i(String str, Throwable th2, Object... objArr) {
        Log.wtf(this.f3916a, d(str, objArr), th2);
    }

    public void j(Throwable th2) {
        Log.wtf(this.f3916a, th2);
    }
}
