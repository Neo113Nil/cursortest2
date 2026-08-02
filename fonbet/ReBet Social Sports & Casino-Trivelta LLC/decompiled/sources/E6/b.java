package E6;

import android.util.Log;

/* loaded from: classes2.dex */
public class b implements c {

    /* renamed from: c, reason: collision with root package name */
    public static final b f3009c = new b();

    /* renamed from: a, reason: collision with root package name */
    public String f3010a = "unknown";

    /* renamed from: b, reason: collision with root package name */
    public int f3011b = 5;

    public static b l() {
        return f3009c;
    }

    public static String m(String str, Throwable th2) {
        return str + '\n' + n(th2);
    }

    public static String n(Throwable th2) {
        return th2 == null ? "" : Log.getStackTraceString(th2);
    }

    @Override // E6.c
    public void a(String str, String str2, Throwable th2) {
        q(3, str, str2, th2);
    }

    @Override // E6.c
    public void b(String str, String str2, Throwable th2) {
        q(5, str, str2, th2);
    }

    @Override // E6.c
    public void c(String str, String str2, Throwable th2) {
        q(6, str, str2, th2);
    }

    @Override // E6.c
    public void d(String str, String str2) {
        p(5, str, str2);
    }

    @Override // E6.c
    public void e(String str, String str2) {
        p(6, str, str2);
    }

    @Override // E6.c
    public void f(String str, String str2) {
        p(2, str, str2);
    }

    @Override // E6.c
    public void g(String str, String str2) {
        p(6, str, str2);
    }

    @Override // E6.c
    public void h(String str, String str2) {
        p(3, str, str2);
    }

    @Override // E6.c
    public void i(String str, String str2, Throwable th2) {
        q(6, str, str2, th2);
    }

    @Override // E6.c
    public boolean j(int i10) {
        return this.f3011b <= i10;
    }

    @Override // E6.c
    public void k(String str, String str2) {
        p(4, str, str2);
    }

    public final String o(String str) {
        if (this.f3010a == null) {
            return str;
        }
        return this.f3010a + ":" + str;
    }

    public final void p(int i10, String str, String str2) {
        Log.println(i10, o(str), str2);
    }

    public final void q(int i10, String str, String str2, Throwable th2) {
        Log.println(i10, o(str), m(str2, th2));
    }
}
