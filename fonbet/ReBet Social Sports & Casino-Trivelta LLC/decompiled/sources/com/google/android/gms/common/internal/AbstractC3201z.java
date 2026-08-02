package com.google.android.gms.common.internal;

import android.R;
import android.content.Context;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.common.AbstractC3174g;
import com.google.android.gms.common.AbstractC3204l;
import java.util.Locale;

/* renamed from: com.google.android.gms.common.internal.z, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC3201z {

    /* renamed from: a, reason: collision with root package name */
    public static final z.r f32756a = new z.r();

    /* renamed from: b, reason: collision with root package name */
    public static Locale f32757b;

    public static String a(Context context) {
        String packageName = context.getPackageName();
        try {
            return M9.e.a(context).d(packageName).toString();
        } catch (PackageManager.NameNotFoundException | NullPointerException unused) {
            String str = context.getApplicationInfo().name;
            return TextUtils.isEmpty(str) ? packageName : str;
        }
    }

    public static String b(Context context, int i10) {
        Resources resources = context.getResources();
        return i10 != 1 ? i10 != 2 ? i10 != 3 ? resources.getString(R.string.ok) : resources.getString(C9.c.f1520a) : resources.getString(C9.c.f1529j) : resources.getString(C9.c.f1523d);
    }

    public static String c(Context context, int i10) {
        Resources resources = context.getResources();
        String a10 = a(context);
        if (i10 == 1) {
            return resources.getString(C9.c.f1524e, a10);
        }
        if (i10 == 2) {
            return K9.i.d(context) ? resources.getString(C9.c.f1533n) : resources.getString(C9.c.f1530k, a10);
        }
        if (i10 == 3) {
            return resources.getString(C9.c.f1521b, a10);
        }
        if (i10 == 5) {
            return g(context, "common_google_play_services_invalid_account_text", a10);
        }
        if (i10 == 7) {
            return g(context, "common_google_play_services_network_error_text", a10);
        }
        if (i10 == 9) {
            return resources.getString(C9.c.f1528i, a10);
        }
        if (i10 == 20) {
            return g(context, "common_google_play_services_restricted_profile_text", a10);
        }
        switch (i10) {
            case 16:
                return g(context, "common_google_play_services_api_unavailable_text", a10);
            case 17:
                return g(context, "common_google_play_services_sign_in_failed_text", a10);
            case 18:
                return resources.getString(C9.c.f1532m, a10);
            default:
                return resources.getString(AbstractC3204l.f32776a, a10);
        }
    }

    public static String d(Context context, int i10) {
        return (i10 == 6 || i10 == 19) ? g(context, "common_google_play_services_resolution_required_text", a(context)) : c(context, i10);
    }

    public static String e(Context context, int i10) {
        String h10 = i10 == 6 ? h(context, "common_google_play_services_resolution_required_title") : f(context, i10);
        return h10 == null ? context.getResources().getString(C9.c.f1527h) : h10;
    }

    public static String f(Context context, int i10) {
        Resources resources = context.getResources();
        switch (i10) {
            case 1:
                return resources.getString(C9.c.f1525f);
            case 2:
                return resources.getString(C9.c.f1531l);
            case 3:
                return resources.getString(C9.c.f1522c);
            case 4:
            case 6:
            case 18:
                return null;
            case 5:
                Log.e("GoogleApiAvailability", "An invalid account was specified when connecting. Please provide a valid account.");
                return h(context, "common_google_play_services_invalid_account_title");
            case 7:
                Log.e("GoogleApiAvailability", "Network error occurred. Please retry request later.");
                return h(context, "common_google_play_services_network_error_title");
            case 8:
                Log.e("GoogleApiAvailability", "Internal error occurred. Please see logs for detailed information");
                return null;
            case 9:
                Log.e("GoogleApiAvailability", "Google Play services is invalid. Cannot recover.");
                return null;
            case 10:
                Log.e("GoogleApiAvailability", "Developer error occurred. Please see logs for detailed information");
                return null;
            case 11:
                Log.e("GoogleApiAvailability", "The application is not licensed to the user.");
                return null;
            case 12:
            case 13:
            case 14:
            case 15:
            case 19:
            default:
                Log.e("GoogleApiAvailability", "Unexpected error code " + i10);
                return null;
            case 16:
                Log.e("GoogleApiAvailability", "One of the API components you attempted to connect to is not available.");
                return null;
            case 17:
                Log.e("GoogleApiAvailability", "The specified account could not be signed in.");
                return h(context, "common_google_play_services_sign_in_failed_title");
            case 20:
                Log.e("GoogleApiAvailability", "The current user profile is restricted and could not use authenticated features.");
                return h(context, "common_google_play_services_restricted_profile_title");
        }
    }

    public static String g(Context context, String str, String str2) {
        Resources resources = context.getResources();
        String h10 = h(context, str);
        if (h10 == null) {
            h10 = resources.getString(AbstractC3204l.f32776a);
        }
        return String.format(resources.getConfiguration().locale, h10, str2);
    }

    public static String h(Context context, String str) {
        z.r rVar = f32756a;
        synchronized (rVar) {
            try {
                Locale c10 = u0.e.a(context.getResources().getConfiguration()).c(0);
                if (!c10.equals(f32757b)) {
                    rVar.clear();
                    f32757b = c10;
                }
                String str2 = (String) rVar.get(str);
                if (str2 != null) {
                    return str2;
                }
                Resources f10 = AbstractC3174g.f(context);
                if (f10 == null) {
                    return null;
                }
                int identifier = f10.getIdentifier(str, "string", "com.google.android.gms");
                if (identifier == 0) {
                    Log.w("GoogleApiAvailability", "Missing resource: " + str);
                    return null;
                }
                String string = f10.getString(identifier);
                if (!TextUtils.isEmpty(string)) {
                    rVar.put(str, string);
                    return string;
                }
                Log.w("GoogleApiAvailability", "Got empty resource: " + str);
                return null;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
