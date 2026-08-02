package N8;

import android.os.Build;
import com.twilio.voice.Constants;
import java.util.Locale;
import java.util.UUID;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public enum l {
    TIMESTAMP,
    CACHEBUSTER,
    SESSION_ID,
    APPBUNDLE,
    ISO_TIMESTAMP,
    OS_NAME,
    OS_VERSION,
    SDK_VERSION,
    DEVICE_LANGUAGE,
    TIMEZONE,
    GIPHY_SESSION_ID,
    APP_WINDOW_SIZE,
    AD_DISPLAY_SIZE,
    AD_DISPLAY_POSITION;

    public /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[l.values().length];
            try {
                iArr[l.TIMESTAMP.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[l.CACHEBUSTER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[l.SESSION_ID.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[l.APPBUNDLE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[l.ISO_TIMESTAMP.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[l.OS_NAME.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[l.OS_VERSION.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr[l.SDK_VERSION.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr[l.DEVICE_LANGUAGE.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr[l.TIMEZONE.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                iArr[l.GIPHY_SESSION_ID.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public final String b() {
        String h10;
        String g10;
        switch (a.$EnumSwitchMapping$0[ordinal()]) {
            case 1:
                return String.valueOf(System.currentTimeMillis());
            case 2:
            case 3:
                return UUID.randomUUID().toString();
            case 4:
                E8.a aVar = E8.a.f3012a;
                if (!aVar.g()) {
                    return "unknown";
                }
                String packageName = aVar.c().getPackageName();
                Intrinsics.checkNotNullExpressionValue(packageName, "GiphyPingbacks.context.packageName");
                Locale locale = Locale.getDefault();
                Intrinsics.checkNotNullExpressionValue(locale, "getDefault()");
                String lowerCase = packageName.toLowerCase(locale);
                Intrinsics.checkNotNullExpressionValue(lowerCase, "toLowerCase(...)");
                return lowerCase;
            case 5:
                h10 = i.h();
                return h10;
            case 6:
                return Constants.PLATFORM_ANDROID;
            case 7:
                return Build.VERSION.RELEASE;
            case 8:
                return J8.d.f5962a.f();
            case 9:
                String language = Locale.getDefault().getLanguage();
                Intrinsics.checkNotNullExpressionValue(language, "getDefault().language");
                Locale locale2 = Locale.getDefault();
                Intrinsics.checkNotNullExpressionValue(locale2, "getDefault()");
                String lowerCase2 = language.toLowerCase(locale2);
                Intrinsics.checkNotNullExpressionValue(lowerCase2, "toLowerCase(...)");
                return lowerCase2;
            case 10:
                g10 = i.g();
                return g10;
            case 11:
                return E8.a.f3012a.e().i().b();
            default:
                return null;
        }
    }
}
