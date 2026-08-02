package defpackage;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.Signature;
import android.os.Build;
import android.os.Bundle;
import android.util.Base64;
import android.util.Log;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.HashMap;
import java.util.Map;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class t3p {
    public static final f79 e = new f79("AppUpdateService", 7);
    public static final Intent f = new Intent("com.google.android.play.core.install.BIND_UPDATE_SERVICE").setPackage("com.android.vending");
    public final qbp a;
    public final String b;
    public final Context c;
    public final h6p d;

    public t3p(Context context, h6p h6pVar) {
        String str;
        this.b = context.getPackageName();
        this.c = context;
        this.d = h6pVar;
        f79 f79Var = k6n.a;
        try {
            if (context.getPackageManager().getApplicationInfo("com.android.vending", 0).enabled) {
                Signature[] signatureArr = context.getPackageManager().getPackageInfo("com.android.vending", 64).signatures;
                if (signatureArr == null || (signatureArr.length) == 0) {
                    f79 f79Var2 = k6n.a;
                    Object[] objArr = new Object[0];
                    if (Log.isLoggable("PlayCore", 5)) {
                        f79.g(f79Var2.b, "Phonesky package is not signed -- possibly self-built package. Could not verify.", objArr);
                        return;
                    } else {
                        f79Var2.getClass();
                        return;
                    }
                }
                for (Signature signature : signatureArr) {
                    byte[] byteArray = signature.toByteArray();
                    try {
                        MessageDigest messageDigest = MessageDigest.getInstance("SHA-256");
                        messageDigest.update(byteArray);
                        str = Base64.encodeToString(messageDigest.digest(), 11);
                    } catch (NoSuchAlgorithmException unused) {
                        str = "";
                    }
                    if (!"8P1sW0EPJcslw7UzRsiXL64w-O50Ed-RBICtay1g24M".equals(str)) {
                        String str2 = Build.TAGS;
                        if ((!str2.contains("dev-keys") && !str2.contains("test-keys")) || !"GXWy8XF3vIml3_MfnmSmyuKBpT3B0dWbHRR_4cgq-gA".equals(str)) {
                        }
                    }
                    Context applicationContext = context.getApplicationContext();
                    this.a = new qbp(applicationContext != null ? applicationContext : context, e, f);
                    return;
                }
            }
        } catch (PackageManager.NameNotFoundException unused2) {
        }
    }

    public static Bundle a(t3p t3pVar, String str) {
        Integer num;
        Bundle bundle = new Bundle();
        bundle.putAll(b());
        bundle.putString("package.name", str);
        try {
            num = Integer.valueOf(t3pVar.c.getPackageManager().getPackageInfo(t3pVar.c.getPackageName(), 0).versionCode);
        } catch (PackageManager.NameNotFoundException unused) {
            Object[] objArr = new Object[0];
            boolean isLoggable = Log.isLoggable("PlayCore", 6);
            f79 f79Var = e;
            if (isLoggable) {
                f79.g(f79Var.b, "The current version of the app could not be retrieved", objArr);
            } else {
                f79Var.getClass();
            }
            num = null;
        }
        if (num != null) {
            bundle.putInt("app.version.code", num.intValue());
        }
        return bundle;
    }

    public static Bundle b() {
        Map map;
        Bundle bundle = new Bundle();
        Bundle bundle2 = new Bundle();
        HashMap hashMap = goo.a;
        synchronized (goo.class) {
            try {
                HashMap hashMap2 = goo.a;
                if (!hashMap2.containsKey("app_update")) {
                    HashMap hashMap3 = new HashMap();
                    hashMap3.put("java", 11004);
                    hashMap2.put("app_update", hashMap3);
                }
                map = (Map) hashMap2.get("app_update");
            } catch (Throwable th) {
                throw th;
            }
        }
        bundle2.putInt("playcore_version_code", ((Integer) map.get("java")).intValue());
        if (map.containsKey(IronSourceConstants.EVENTS_NATIVE)) {
            bundle2.putInt("playcore_native_version", ((Integer) map.get(IronSourceConstants.EVENTS_NATIVE)).intValue());
        }
        if (map.containsKey("unity")) {
            bundle2.putInt("playcore_unity_version", ((Integer) map.get("unity")).intValue());
        }
        bundle.putAll(bundle2);
        bundle.putInt("playcore.version.code", 11004);
        return bundle;
    }
}
