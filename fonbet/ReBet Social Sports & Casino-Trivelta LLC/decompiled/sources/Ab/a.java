package Ab;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.Bundle;
import eb.C4192b;
import l0.AbstractC5338c;
import tb.C6456a;
import tb.InterfaceC6458c;

/* loaded from: classes3.dex */
public class a {

    /* renamed from: a, reason: collision with root package name */
    public final Context f416a;

    /* renamed from: b, reason: collision with root package name */
    public final SharedPreferences f417b;

    /* renamed from: c, reason: collision with root package name */
    public final InterfaceC6458c f418c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f419d;

    public a(Context context, String str, InterfaceC6458c interfaceC6458c) {
        Context a10 = a(context);
        this.f416a = a10;
        this.f417b = a10.getSharedPreferences("com.google.firebase.common.prefs:" + str, 0);
        this.f418c = interfaceC6458c;
        this.f419d = c();
    }

    public static Context a(Context context) {
        return AbstractC5338c.createDeviceProtectedStorageContext(context);
    }

    public synchronized boolean b() {
        return this.f419d;
    }

    public final boolean c() {
        return this.f417b.contains("firebase_data_collection_default_enabled") ? this.f417b.getBoolean("firebase_data_collection_default_enabled", true) : d();
    }

    public final boolean d() {
        ApplicationInfo applicationInfo;
        Bundle bundle;
        try {
            PackageManager packageManager = this.f416a.getPackageManager();
            if (packageManager == null || (applicationInfo = packageManager.getApplicationInfo(this.f416a.getPackageName(), 128)) == null || (bundle = applicationInfo.metaData) == null || !bundle.containsKey("firebase_data_collection_default_enabled")) {
                return true;
            }
            return applicationInfo.metaData.getBoolean("firebase_data_collection_default_enabled");
        } catch (PackageManager.NameNotFoundException unused) {
            return true;
        }
    }

    public synchronized void e(Boolean bool) {
        try {
            if (bool == null) {
                this.f417b.edit().remove("firebase_data_collection_default_enabled").apply();
                f(d());
            } else {
                boolean equals = Boolean.TRUE.equals(bool);
                this.f417b.edit().putBoolean("firebase_data_collection_default_enabled", equals).apply();
                f(equals);
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public final synchronized void f(boolean z10) {
        if (this.f419d != z10) {
            this.f419d = z10;
            this.f418c.b(new C6456a(C4192b.class, new C4192b(z10)));
        }
    }
}
