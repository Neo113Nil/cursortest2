package g6;

import android.content.Context;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.text.TextUtils;
import com.sports.insider.R;
import io.sentry.android.core.w0;
import java.util.Locale;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public abstract class k {

    /* renamed from: a, reason: collision with root package name */
    public static final s.n f9852a = new s.n(0);

    /* renamed from: b, reason: collision with root package name */
    public static Locale f9853b;

    public static String a(Context context, int i5) {
        Resources resources = context.getResources();
        switch (i5) {
            case 1:
                return resources.getString(R.string.common_google_play_services_install_title);
            case 2:
                return resources.getString(R.string.common_google_play_services_update_title);
            case 3:
                return resources.getString(R.string.common_google_play_services_enable_title);
            case 4:
                w0.d("GoogleApiAvailability", "Sign-in is required to use this API.");
                return resources.getString(R.string.common_google_play_services_signin_required_title);
            case 5:
                w0.d("GoogleApiAvailability", "An invalid account was specified when connecting. Please provide a valid account.");
                return e(context, "common_google_play_services_invalid_account_title");
            case 6:
                w0.d("GoogleApiAvailability", "Google Play services requires resolution.");
                return e(context, "common_google_play_services_resolution_required_title");
            case 7:
                w0.d("GoogleApiAvailability", "Network error occurred. Please retry request later.");
                return e(context, "common_google_play_services_network_error_title");
            case 8:
                w0.d("GoogleApiAvailability", "Internal error occurred. Please see logs for detailed information");
                return null;
            case 9:
                w0.d("GoogleApiAvailability", "Google Play services is invalid. Cannot recover.");
                return resources.getString(R.string.common_google_play_services_unsupported_title);
            case 10:
                w0.d("GoogleApiAvailability", "Developer error occurred. Please see logs for detailed information");
                return null;
            case 11:
                w0.d("GoogleApiAvailability", "The application is not licensed to the user.");
                return null;
            case 12:
            case 13:
            case 14:
            case 15:
            default:
                StringBuilder sb2 = new StringBuilder(String.valueOf(i5).length() + 22);
                sb2.append("Unexpected error code ");
                sb2.append(i5);
                w0.d("GoogleApiAvailability", sb2.toString());
                return null;
            case 16:
                w0.d("GoogleApiAvailability", "One of the API components you attempted to connect to is not available.");
                return null;
            case 17:
                w0.d("GoogleApiAvailability", "The specified account could not be signed in.");
                return e(context, "common_google_play_services_sign_in_failed_title");
            case 18:
                w0.d("GoogleApiAvailability", "Google Play services is updating.");
                return resources.getString(R.string.common_google_play_services_updating_client_title);
            case 19:
                w0.d("GoogleApiAvailability", "Google Play services is missing a required permission.");
                return e(context, "common_google_play_services_resolution_required_title");
            case 20:
                w0.d("GoogleApiAvailability", "The current user profile is restricted and could not use authenticated features.");
                return e(context, "common_google_play_services_restricted_profile_title");
        }
    }

    public static String b(Context context, int i5) {
        Resources resources = context.getResources();
        String c2 = c(context);
        if (i5 == 1) {
            return resources.getString(R.string.common_google_play_services_install_text, c2);
        }
        if (i5 == 2) {
            return q6.b.g(context) ? resources.getString(R.string.common_google_play_services_wear_update_text, c2) : resources.getString(R.string.common_google_play_services_update_text, c2);
        }
        if (i5 == 3) {
            return resources.getString(R.string.common_google_play_services_enable_text, c2);
        }
        if (i5 == 4) {
            return resources.getString(R.string.common_google_play_services_signin_required_text, c2);
        }
        if (i5 == 5) {
            return d(context, "common_google_play_services_invalid_account_text", c2);
        }
        if (i5 == 7) {
            return d(context, "common_google_play_services_network_error_text", c2);
        }
        if (i5 == 9) {
            return resources.getString(R.string.common_google_play_services_unsupported_text, c2);
        }
        if (i5 == 20) {
            return d(context, "common_google_play_services_restricted_profile_text", c2);
        }
        switch (i5) {
            case 16:
                return d(context, "common_google_play_services_api_unavailable_text", c2);
            case 17:
                return d(context, "common_google_play_services_sign_in_failed_text", c2);
            case 18:
                return resources.getString(R.string.common_google_play_services_updating_text, c2);
            default:
                return resources.getString(R.string.common_google_play_services_try_again_text, c2);
        }
    }

    public static String c(Context context) {
        String packageName = context.getPackageName();
        try {
            Context context2 = s6.c.a(context).f22629a;
            return context2.getPackageManager().getApplicationLabel(context2.getPackageManager().getApplicationInfo(packageName, 0)).toString();
        } catch (PackageManager.NameNotFoundException | NullPointerException unused) {
            String str = context.getApplicationInfo().name;
            return TextUtils.isEmpty(str) ? packageName : str;
        }
    }

    public static String d(Context context, String str, String str2) {
        Resources resources = context.getResources();
        String e7 = e(context, str);
        if (e7 == null) {
            e7 = resources.getString(R.string.common_google_play_services_unknown_issue);
        }
        return String.format(resources.getConfiguration().locale, e7, str2);
    }

    public static String e(Context context, String str) {
        Resources resources;
        s.n nVar = f9852a;
        synchronized (nVar) {
            try {
                Locale locale = ci.c.u(context.getResources().getConfiguration()).f19306a.get(0);
                if (!locale.equals(f9853b)) {
                    nVar.clear();
                    f9853b = locale;
                }
                String str2 = (String) nVar.get(str);
                if (str2 != null) {
                    return str2;
                }
                AtomicBoolean atomicBoolean = c6.g.f3661a;
                try {
                    resources = context.getPackageManager().getResourcesForApplication("com.google.android.gms");
                } catch (PackageManager.NameNotFoundException unused) {
                    resources = null;
                }
                if (resources != null) {
                    int identifier = resources.getIdentifier(str, "string", "com.google.android.gms");
                    if (identifier == 0) {
                        StringBuilder sb2 = new StringBuilder(str.length() + 18);
                        sb2.append("Missing resource: ");
                        sb2.append(str);
                        w0.m("GoogleApiAvailability", sb2.toString());
                    } else {
                        String string = resources.getString(identifier);
                        if (!TextUtils.isEmpty(string)) {
                            nVar.put(str, string);
                            return string;
                        }
                        StringBuilder sb3 = new StringBuilder(str.length() + 20);
                        sb3.append("Got empty resource: ");
                        sb3.append(str);
                        w0.m("GoogleApiAvailability", sb3.toString());
                    }
                }
                return null;
            } finally {
            }
        }
    }
}
