package com.google.android.gms.common.internal;

import android.content.Context;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.text.TextUtils;
import com.google.android.gms.common.GooglePlayServicesUtil;
import com.google.android.gms.common.util.DeviceProperties;
import com.google.android.gms.common.wrappers.Wrappers;
import com.sofascore.results.R;
import defpackage.fhh;
import defpackage.fib;
import java.util.Locale;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zaf {
    public static final fhh a = new fhh(0);
    public static Locale b;

    public static String a(int i, Context context) {
        Resources resources = context.getResources();
        switch (i) {
            case 1:
                return resources.getString(R.string.common_google_play_services_install_title);
            case 2:
                return resources.getString(R.string.common_google_play_services_update_title);
            case 3:
                return resources.getString(R.string.common_google_play_services_enable_title);
            case 4:
            case 6:
            case 18:
                return null;
            case 5:
                return e(context, "common_google_play_services_invalid_account_title");
            case 7:
                return e(context, "common_google_play_services_network_error_title");
            case 8:
            case 9:
            case 10:
            case 11:
            case 16:
                return null;
            case 12:
            case 13:
            case 14:
            case 15:
            case 19:
            default:
                new StringBuilder(String.valueOf(i).length() + 22);
                return null;
            case 17:
                return e(context, "common_google_play_services_sign_in_failed_title");
            case 20:
                return e(context, "common_google_play_services_restricted_profile_title");
        }
    }

    public static String b(int i, Context context) {
        Resources resources = context.getResources();
        String c = c(context);
        if (i == 1) {
            return resources.getString(R.string.common_google_play_services_install_text, c);
        }
        if (i == 2) {
            return DeviceProperties.c(context) ? resources.getString(R.string.common_google_play_services_wear_update_text) : resources.getString(R.string.common_google_play_services_update_text, c);
        }
        if (i == 3) {
            return resources.getString(R.string.common_google_play_services_enable_text, c);
        }
        if (i == 5) {
            return d(context, "common_google_play_services_invalid_account_text", c);
        }
        if (i == 7) {
            return d(context, "common_google_play_services_network_error_text", c);
        }
        if (i == 9) {
            return resources.getString(R.string.common_google_play_services_unsupported_text, c);
        }
        if (i == 20) {
            return d(context, "common_google_play_services_restricted_profile_text", c);
        }
        switch (i) {
            case 16:
                return d(context, "common_google_play_services_api_unavailable_text", c);
            case 17:
                return d(context, "common_google_play_services_sign_in_failed_text", c);
            case 18:
                return resources.getString(R.string.common_google_play_services_updating_text, c);
            default:
                return resources.getString(R.string.common_google_play_services_unknown_issue, c);
        }
    }

    public static String c(Context context) {
        String packageName = context.getPackageName();
        try {
            Context context2 = Wrappers.a(context).a;
            return context2.getPackageManager().getApplicationLabel(context2.getPackageManager().getApplicationInfo(packageName, 0)).toString();
        } catch (PackageManager.NameNotFoundException | NullPointerException unused) {
            String str = context.getApplicationInfo().name;
            return TextUtils.isEmpty(str) ? packageName : str;
        }
    }

    public static String d(Context context, String str, String str2) {
        Resources resources = context.getResources();
        String e = e(context, str);
        if (e == null) {
            e = resources.getString(R.string.common_google_play_services_unknown_issue);
        }
        return String.format(resources.getConfiguration().locale, e, str2);
    }

    public static String e(Context context, String str) {
        Resources resources;
        fhh fhhVar = a;
        synchronized (fhhVar) {
            try {
                Locale b2 = fib.d(context.getResources().getConfiguration().getLocales()).b(0);
                if (!b2.equals(b)) {
                    fhhVar.clear();
                    b = b2;
                }
                String str2 = (String) fhhVar.get(str);
                if (str2 != null) {
                    return str2;
                }
                int i = GooglePlayServicesUtil.e;
                try {
                    resources = context.getPackageManager().getResourcesForApplication("com.google.android.gms");
                } catch (PackageManager.NameNotFoundException unused) {
                    resources = null;
                }
                if (resources != null) {
                    int identifier = resources.getIdentifier(str, "string", "com.google.android.gms");
                    if (identifier == 0) {
                        new StringBuilder(str.length() + 18);
                    } else {
                        String string = resources.getString(identifier);
                        if (!TextUtils.isEmpty(string)) {
                            fhhVar.put(str, string);
                            return string;
                        }
                        new StringBuilder(str.length() + 20);
                    }
                }
                return null;
            } finally {
            }
        }
    }
}
