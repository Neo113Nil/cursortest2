package Lh;

import android.util.Log;

/* loaded from: classes3.dex */
public class a {

    /* renamed from: c, reason: collision with root package name */
    public static Boolean f7201c = Boolean.FALSE;

    /* renamed from: a, reason: collision with root package name */
    public final String f7202a;

    /* renamed from: b, reason: collision with root package name */
    public final int f7203b = 3;

    public a(String str) {
        this.f7202a = str;
    }

    public static a d(Class cls) {
        return new a(cls.getName());
    }

    public a a(String str, int i10) {
        if (f7201c.booleanValue()) {
            Log.println(i10, this.f7202a, str);
        }
        return this;
    }

    public void b(Exception exc) {
        c(exc, this.f7203b);
    }

    public void c(Exception exc, int i10) {
        if (f7201c.booleanValue()) {
            Log.println(i10, this.f7202a, Log.getStackTraceString(exc));
        }
    }
}
