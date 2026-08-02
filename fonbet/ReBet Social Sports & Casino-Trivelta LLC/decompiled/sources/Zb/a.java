package Zb;

import android.content.Context;
import android.content.SharedPreferences;
import com.learnium.RNDeviceInfo.RNDeviceModule;
import java.lang.reflect.InvocationTargetException;
import java.util.UUID;

/* loaded from: classes3.dex */
public class a {

    /* renamed from: a, reason: collision with root package name */
    public final Context f14753a;

    public a(Context context) {
        this.f14753a = context;
    }

    public String a() {
        Object invoke = Class.forName("com.google.firebase.iid.FirebaseInstanceId").getDeclaredMethod("getInstance", null).invoke(null, null);
        return (String) invoke.getClass().getMethod("getId", null).invoke(invoke, null);
    }

    public String b() {
        Object invoke = Class.forName("com.google.android.gms.iid.InstanceID").getDeclaredMethod("getInstance", Context.class).invoke(null, this.f14753a.getApplicationContext());
        return (String) invoke.getClass().getMethod("getId", null).invoke(invoke, null);
    }

    public String c() {
        return RNDeviceModule.getRNDISharedPreferences(this.f14753a).getString("instanceId", "unknown");
    }

    public String d() {
        String c10 = c();
        if (c10 != "unknown") {
            return c10;
        }
        try {
            String a10 = a();
            f(a10);
            return a10;
        } catch (ClassNotFoundException unused) {
            try {
                String b10 = b();
                f(b10);
                return b10;
            } catch (ClassNotFoundException unused2) {
                String e10 = e();
                f(e10);
                return e10;
            } catch (IllegalAccessException | NoSuchMethodException | SecurityException | InvocationTargetException unused3) {
                System.err.println("N/A: Unsupported version of com.google.android.gms.iid in your project.");
                String e102 = e();
                f(e102);
                return e102;
            }
        } catch (IllegalAccessException | NoSuchMethodException | SecurityException | InvocationTargetException unused4) {
            System.err.println("N/A: Unsupported version of com.google.firebase:firebase-iid in your project.");
            String b102 = b();
            f(b102);
            return b102;
        }
    }

    public String e() {
        return UUID.randomUUID().toString();
    }

    public void f(String str) {
        SharedPreferences.Editor edit = RNDeviceModule.getRNDISharedPreferences(this.f14753a).edit();
        edit.putString("instanceId", str);
        edit.apply();
    }
}
