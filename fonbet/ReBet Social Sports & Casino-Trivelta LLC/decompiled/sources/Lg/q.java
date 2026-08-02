package Lg;

import android.content.SharedPreferences;

/* loaded from: classes3.dex */
public class q {

    /* renamed from: b, reason: collision with root package name */
    public static q f7199b = new q();

    /* renamed from: a, reason: collision with root package name */
    public SharedPreferences f7200a;

    public static q b() {
        return f7199b;
    }

    public final SharedPreferences a() {
        if (this.f7200a == null) {
            this.f7200a = Kg.a.a().getSharedPreferences("io.invertase.firebase", 0);
        }
        return this.f7200a;
    }

    public String c(String str, String str2) {
        return a().getString(str, str2);
    }

    public SharedPreferences.Editor d(String str) {
        return a().edit().remove(str);
    }

    public void e(String str, String str2) {
        a().edit().putString(str, str2).apply();
    }
}
