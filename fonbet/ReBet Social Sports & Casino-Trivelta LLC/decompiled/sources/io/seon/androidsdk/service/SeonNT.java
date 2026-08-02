package io.seon.androidsdk.service;

import android.content.Context;
import android.content.SharedPreferences;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes3.dex */
class SeonNT {

    /* renamed from: a, reason: collision with root package name */
    public static final AtomicBoolean f53138a = new AtomicBoolean(false);

    /* renamed from: b, reason: collision with root package name */
    public static boolean f53139b = false;

    /* renamed from: c, reason: collision with root package name */
    public static SharedPreferences f53140c = null;

    public SeonNT(Context context) {
        c(context);
    }

    /* JADX WARN: Code restructure failed: missing block: B:30:0x003b, code lost:
    
        if (r0.equals("0") != false) goto L21;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void c(final Context context) {
        String str = "";
        try {
            char c10 = 0;
            if (f53138a.compareAndSet(false, true)) {
                Runnable runnable = new Runnable() { // from class: io.seon.androidsdk.service.g
                    @Override // java.lang.Runnable
                    public final void run() {
                        SeonNT.f53140c = context.getSharedPreferences("seonLocalNtPreferences", 0);
                    }
                };
                AtomicInteger atomicInteger = V.f53166a;
                try {
                    runnable.run();
                } catch (Throwable unused) {
                }
                try {
                    str = f53140c.getString("seon2US", "");
                } catch (Exception unused2) {
                }
                int hashCode = str.hashCode();
                if (hashCode != 48) {
                    if (hashCode == 49 && str.equals("1")) {
                        c10 = 1;
                    }
                    c10 = 65535;
                }
                if (c10 == 0) {
                    C8.c.a(context, "seon2");
                    return;
                }
                if (c10 == 1) {
                    f53139b = true;
                    return;
                }
                SharedPreferences.Editor edit = f53140c.edit();
                edit.putString("seon2US", "1");
                edit.commit();
                C8.c.a(context, "seon2");
                edit.putString("seon2US", "0");
                edit.apply();
            }
        } catch (Throwable unused3) {
        }
    }

    public static boolean f() {
        return f53139b;
    }

    public native int a();

    public native String b();

    public native int d();

    public final synchronized int e() {
        try {
            SharedPreferences sharedPreferences = f53140c;
            if (sharedPreferences == null) {
                return a();
            }
            if (sharedPreferences.getString("seon2OS", "").equals("1")) {
                return 64;
            }
            SharedPreferences.Editor edit = f53140c.edit();
            edit.putString("seon2OS", "1");
            edit.commit();
            int a10 = a();
            edit.remove("seon2OS");
            edit.apply();
            return a10;
        } catch (Throwable unused) {
            return 64;
        }
    }
}
