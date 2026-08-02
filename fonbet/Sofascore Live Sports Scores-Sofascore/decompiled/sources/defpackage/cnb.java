package defpackage;

import android.app.Application;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.content.res.Configuration;
import android.media.AudioManager;
import android.net.ConnectivityManager;
import android.net.NetworkCapabilities;
import android.net.Uri;
import android.os.Build;
import android.os.VibrationEffect;
import android.os.Vibrator;
import android.os.VibratorManager;
import com.blaze.blazesdk.shared.BlazeSDK;
import com.blaze.blazesdk.shared.models.BlazeLayoutDirection;
import com.blaze.blazesdk.web_view.BlazeWebViewActivity;
import com.blaze.blazesdk.web_view.a;
import java.util.Locale;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public abstract class cnb {
    public static final Context a(Context context, BlazeLayoutDirection blazeLayoutDirection) {
        context.getClass();
        int i = blazeLayoutDirection == null ? -1 : mka.a[blazeLayoutDirection.ordinal()];
        Locale locale = null;
        if (i != -1) {
            if (i == 1) {
                locale = Locale.US;
            } else {
                if (i != 2) {
                    zzl.b();
                    return null;
                }
                locale = new Locale("ar");
            }
        }
        if (locale == null) {
            return context;
        }
        Configuration configuration = new Configuration(context.getResources().getConfiguration());
        configuration.setLayoutDirection(locale);
        Context createConfigurationContext = context.createConfigurationContext(configuration);
        createConfigurationContext.getClass();
        return createConfigurationContext;
    }

    public static final Integer b(Application application, String str) {
        int identifier = application.getResources().getIdentifier(str, "color", application.getPackageName());
        Integer valueOf = identifier == 0 ? null : Integer.valueOf(identifier);
        return valueOf == null ? ipl.rgbaToColorInt$default(ipl.a, str, null, 2, null) : valueOf;
    }

    public static final void c(Context context, lpl lplVar) {
        Vibrator vibrator;
        VibrationEffect createWaveform;
        context.getClass();
        lplVar.getClass();
        try {
            if (Build.VERSION.SDK_INT >= 31) {
                Object systemService = context.getSystemService("vibrator_manager");
                VibratorManager vibratorManager = systemService instanceof VibratorManager ? (VibratorManager) systemService : null;
                if (vibratorManager != null) {
                    vibrator = vibratorManager.getDefaultVibrator();
                }
                vibrator = null;
            } else {
                Object systemService2 = context.getSystemService("vibrator");
                if (systemService2 instanceof Vibrator) {
                    vibrator = (Vibrator) systemService2;
                }
                vibrator = null;
            }
            if (vibrator != null) {
                int ordinal = lplVar.ordinal();
                if (ordinal == 0) {
                    createWaveform = VibrationEffect.createWaveform(new long[]{0, 100, 50, 50}, new int[]{0, 255, 0, 255}, -1);
                } else if (ordinal == 1) {
                    createWaveform = VibrationEffect.createWaveform(new long[]{0, 200, 50, 200}, new int[]{0, 200, 0, 200}, -1);
                } else if (ordinal == 2) {
                    createWaveform = VibrationEffect.createWaveform(new long[]{0, 80}, new int[]{0, 200}, -1);
                } else {
                    if (ordinal != 3) {
                        throw new ndd();
                    }
                    createWaveform = VibrationEffect.createWaveform(new long[]{0, 50}, new int[]{0, 150}, -1);
                }
                vibrator.vibrate(createWaveform);
            }
        } catch (Throwable th) {
            BlazeSDK.INSTANCE.getGlobalThrowableCatcher$blazesdk_release().invoke(th, null);
        }
    }

    public static final void d(Context context, String str) {
        context.getClass();
        str.getClass();
        try {
            context.startActivity(new Intent("android.intent.action.VIEW", Uri.parse(str)));
        } catch (Exception e) {
            BlazeSDK.INSTANCE.getGlobalThrowableCatcher$blazesdk_release().invoke(e, null);
        }
    }

    public static final void e(Context context, String str, String str2) {
        context.getClass();
        str.getClass();
        str2.getClass();
        try {
            context.startActivity(new Intent(context, (Class<?>) BlazeWebViewActivity.class).putExtra("BlazeWebViewArgs", new a(str2, str)));
        } catch (Exception e) {
            BlazeSDK.INSTANCE.getGlobalThrowableCatcher$blazesdk_release().invoke(e, null);
        }
    }

    public static final int f(Context context) {
        try {
            Object systemService = context.getSystemService("audio");
            systemService.getClass();
            AudioManager audioManager = (AudioManager) systemService;
            return (audioManager.getStreamVolume(3) * 100) / audioManager.getStreamMaxVolume(3);
        } catch (Throwable th) {
            BlazeSDK.INSTANCE.getGlobalThrowableCatcher$blazesdk_release().invoke(th, null);
            return 0;
        }
    }

    public static final boolean g(Context context) {
        Object systemService = context.getSystemService("connectivity");
        NetworkCapabilities networkCapabilities = null;
        ConnectivityManager connectivityManager = systemService instanceof ConnectivityManager ? (ConnectivityManager) systemService : null;
        if (connectivityManager != null) {
            try {
                networkCapabilities = connectivityManager.getNetworkCapabilities(connectivityManager.getActiveNetwork());
            } catch (Exception e) {
                BlazeSDK.INSTANCE.getGlobalThrowableCatcher$blazesdk_release().invoke(e, null);
            }
        }
        return networkCapabilities != null && (networkCapabilities.hasTransport(0) || networkCapabilities.hasTransport(1) || networkCapabilities.hasTransport(3));
    }

    public static ApplicationInfo getApplicationInfoCompat$default(Context context, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = 0;
        }
        context.getClass();
        try {
            return Build.VERSION.SDK_INT >= 33 ? context.getPackageManager().getApplicationInfo(context.getPackageName(), PackageManager.ApplicationInfoFlags.of(i)) : context.getPackageManager().getApplicationInfo(context.getPackageName(), 128);
        } catch (PackageManager.NameNotFoundException unused) {
            return null;
        }
    }

    public static final boolean h(Context context) {
        context.getClass();
        int i = Build.VERSION.SDK_INT;
        if (i >= 36) {
            ApplicationInfo applicationInfoCompat$default = getApplicationInfoCompat$default(context, 0, 1, null);
            if ((applicationInfoCompat$default != null ? applicationInfoCompat$default.targetSdkVersion : 0) >= 36 && context.getResources().getConfiguration().smallestScreenWidthDp >= 600 && i >= 37) {
                return false;
            }
        }
        return true;
    }

    public static final boolean i(Context context) {
        context.getClass();
        return (context.getResources().getConfiguration().screenLayout & 15) >= 3;
    }

    public static /* synthetic */ void openWebLink$default(Context context, String str, String str2, int i, Object obj) {
        if ((i & 2) != 0) {
            str2 = "";
        }
        e(context, str, str2);
    }

    public static void promptNoInternetConnection$default(Context context, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            str = "No internet connection. Please check your connection.";
        }
        context.getClass();
        str.getClass();
    }

    public static /* synthetic */ void triggerHapticFeedback$default(Context context, lpl lplVar, int i, Object obj) {
        if ((i & 1) != 0) {
            lplVar = lpl.DEFAULT;
        }
        c(context, lplVar);
    }
}
