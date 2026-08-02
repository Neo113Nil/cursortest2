package defpackage;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import android.os.RemoteException;
import java.util.ArrayList;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public abstract class ba4 {
    public final dm9 a;
    public final ComponentName b;
    public final Context c;

    public ba4(dm9 dm9Var, ComponentName componentName, Context context) {
        this.a = dm9Var;
        this.b = componentName;
        this.c = context;
    }

    public static boolean a(Context context, String str, ga4 ga4Var) {
        ga4Var.setApplicationContext(context.getApplicationContext());
        Intent intent = new Intent("android.support.customtabs.action.CustomTabsService");
        if (str.isEmpty()) {
            a70.p("Service Intents must be explicit");
            return false;
        }
        intent.setPackage(str);
        return context.bindService(intent, ga4Var, 33);
    }

    public static String b(Context context) {
        PackageManager packageManager = context.getPackageManager();
        ArrayList<String> arrayList = new ArrayList();
        ResolveInfo resolveActivity = packageManager.resolveActivity(new Intent("android.intent.action.VIEW", Uri.parse("http://")), 0);
        if (resolveActivity != null) {
            String str = resolveActivity.activityInfo.packageName;
            ArrayList arrayList2 = new ArrayList(arrayList.size() + 1);
            arrayList2.add(str);
            arrayList = arrayList2;
        }
        Intent intent = new Intent("android.support.customtabs.action.CustomTabsService");
        for (String str2 : arrayList) {
            intent.setPackage(str2);
            if (packageManager.resolveService(intent, 0) != null) {
                return str2;
            }
        }
        return null;
    }

    public final ja4 c(t94 t94Var) {
        dm9 dm9Var = this.a;
        aa4 aa4Var = new aa4(t94Var);
        try {
            if (((bm9) dm9Var).Z1(aa4Var)) {
                return new ja4(dm9Var, aa4Var, this.b);
            }
            return null;
        } catch (RemoteException unused) {
            return null;
        }
    }

    public final void d() {
        try {
            ((bm9) this.a).G4();
        } catch (RemoteException unused) {
        }
    }
}
