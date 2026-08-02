package com.inmobi.media;

import android.app.Activity;
import android.content.ActivityNotFoundException;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import com.unity3d.services.core.network.model.HttpRequest;
import defpackage.km5;
import java.net.URISyntaxException;
import java.util.ArrayList;
import java.util.List;
import kotlin.text.StringsKt;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes4.dex */
public abstract class F3 {
    public static final /* synthetic */ int a = 0;

    public static int a(Context context, String str, Eh eh, String str2) {
        str.getClass();
        eh.getClass();
        str2.getClass();
        if (context == null) {
            return 7;
        }
        if (!eh.c()) {
            eh.a("EX_" + str2);
            return 8;
        }
        try {
            Intent parseUri = Intent.parseUri(str, 0);
            parseUri.setFlags(268435456);
            F5.a.getClass();
            if (F5.v() && parseUri.getAction() == null) {
                parseUri.setAction("android.intent.action.VIEW");
            }
            context.startActivity(parseUri);
            return 0;
        } catch (ActivityNotFoundException e) {
            Uri parse = Uri.parse(str);
            parse.getClass();
            String a2 = a(str);
            if (!"intent".equals(parse.getScheme()) || a2 == null || a2.length() == 0) {
                throw e;
            }
            return a(context, a2, eh, str2);
        } catch (NullPointerException e2) {
            Uri parse2 = Uri.parse(str);
            parse2.getClass();
            String a3 = a(str);
            if (!"intent".equals(parse2.getScheme()) || a3 == null || a3.length() == 0) {
                throw e2;
            }
            return a(context, a3, eh, str2);
        }
    }

    public static int a(Context context, String str, ResolveInfo resolveInfo, Eh eh, String str2) {
        str.getClass();
        eh.getClass();
        str2.getClass();
        if (context == null) {
            return 7;
        }
        if (!eh.c()) {
            eh.a("EX_" + str2);
            return 8;
        }
        Intent parseUri = Intent.parseUri(str, 3);
        parseUri.getClass();
        F5.a.getClass();
        if (F5.v() && parseUri.getAction() == null) {
            parseUri.setAction("android.intent.action.VIEW");
        }
        if ((resolveInfo != null ? resolveInfo.activityInfo : null) != null) {
            ActivityInfo activityInfo = resolveInfo.activityInfo;
            if ((activityInfo != null ? activityInfo.packageName : null) != null) {
                if ((activityInfo != null ? activityInfo.name : null) != null) {
                    parseUri.setClassName(activityInfo.packageName, activityInfo.name);
                }
            }
        }
        parseUri.setFlags(268435456);
        context.startActivity(parseUri);
        return 0;
    }

    public static String a(String str) {
        try {
            Intent parseUri = Intent.parseUri(str, 1);
            F5.a.getClass();
            if (F5.v() && parseUri.getAction() == null) {
                parseUri.setAction("android.intent.action.VIEW");
            }
            return parseUri.getStringExtra("browser_fallback_url");
        } catch (URISyntaxException e) {
            e.getMessage();
            return null;
        }
    }

    public static boolean a(Uri uri) {
        uri.getClass();
        return "http".equals(uri.getScheme()) || HttpRequest.DEFAULT_SCHEME.equals(uri.getScheme());
    }

    public static List a(Context context, String str) {
        str.getClass();
        if (str.length() == 0 || context == null) {
            return km5.a;
        }
        Intent parseUri = Intent.parseUri(str, 3);
        parseUri.getClass();
        F5.a.getClass();
        if (F5.v() && parseUri.getAction() == null) {
            parseUri.setAction("android.intent.action.VIEW");
        }
        List<ResolveInfo> queryIntentActivityOptions = context.getPackageManager().queryIntentActivityOptions((ComponentName) null, (Intent[]) null, parseUri, 0);
        queryIntentActivityOptions.getClass();
        ArrayList arrayList = new ArrayList();
        for (Object obj : queryIntentActivityOptions) {
            if (((ResolveInfo) obj).activityInfo.exported) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    public static int a(C3390eb c3390eb) {
        PackageManager packageManager;
        c3390eb.getClass();
        Activity activity = c3390eb.a;
        String str = c3390eb.b;
        if (StringsKt.R(str)) {
            return 2;
        }
        Intent intent = new Intent("android.intent.action.VIEW");
        intent.setPackage("com.android.vending");
        intent.setData(Uri.parse(str));
        try {
            packageManager = activity.getPackageManager();
        } catch (Exception unused) {
            packageManager = null;
        }
        if (packageManager == null || intent.resolveActivity(packageManager) == null) {
            return 6;
        }
        try {
            activity.startActivityForResult(intent, 0);
            intent.toString();
            return 0;
        } catch (ActivityNotFoundException unused2) {
            return 6;
        } catch (NullPointerException unused3) {
            return 13;
        } catch (SecurityException unused4) {
            return 12;
        } catch (URISyntaxException unused5) {
            return 5;
        } catch (Exception unused6) {
            return 9;
        }
    }
}
