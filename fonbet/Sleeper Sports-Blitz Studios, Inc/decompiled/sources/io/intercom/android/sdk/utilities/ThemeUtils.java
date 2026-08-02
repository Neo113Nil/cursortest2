package io.intercom.android.sdk.utilities;

import android.content.Context;
import android.net.Uri;
import androidx.compose.foundation.DarkThemeKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.MutableState;
import io.intercom.android.sdk.ui.theme.ThemeManager;
import io.intercom.android.sdk.ui.theme.ThemeMode;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: ThemeUtils.kt */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u001a\n\u0002\u0018\u0002\bÁ\u0002\u0018\u00002\u00020\u0001B\t\b\u0003¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0001¢\u0006\u0002\b\bJ\u000f\u0010\t\u001a\u00020\u0005H\u0001¢\u0006\u0004\b\n\u0010\u000bJ&\u0010\f\u001a\u0004\u0018\u00010\r2\u0006\u0010\u0006\u001a\u00020\u00072\b\u0010\u000e\u001a\u0004\u0018\u00010\r2\b\u0010\u000f\u001a\u0004\u0018\u00010\rH\u0007J%\u0010\u0010\u001a\u0004\u0018\u00010\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\r2\b\u0010\u000f\u001a\u0004\u0018\u00010\rH\u0001¢\u0006\u0004\b\u0011\u0010\u0012J2\u0010\u0013\u001a\u0004\u0018\u00010\r2\u0006\u0010\u0006\u001a\u00020\u00072\b\u0010\u0014\u001a\u0004\u0018\u00010\r2\b\u0010\u0015\u001a\u0004\u0018\u00010\r2\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\rH\u0007J+\u0010\u0017\u001a\u0004\u0018\u00010\r2\u0006\u0010\u0006\u001a\u00020\u00072\b\u0010\u0018\u001a\u0004\u0018\u00010\r2\b\u0010\u0019\u001a\u0004\u0018\u00010\rH\u0001¢\u0006\u0002\b\u001aJ+\u0010\u001b\u001a\u0004\u0018\u00010\r2\u0006\u0010\u0006\u001a\u00020\u00072\b\u0010\u001c\u001a\u0004\u0018\u00010\r2\b\u0010\u001d\u001a\u0004\u0018\u00010\rH\u0001¢\u0006\u0002\b\u001eJ\"\u0010\u001f\u001a\u00020\r2\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010 \u001a\u00020\r2\b\u0010!\u001a\u0004\u0018\u00010\rH\u0007J!\u0010\"\u001a\u00020\r2\u0006\u0010 \u001a\u00020\r2\b\u0010!\u001a\u0004\u0018\u00010\rH\u0001¢\u0006\u0004\b#\u0010\u0012J\u0018\u0010$\u001a\u00020\r2\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010%\u001a\u00020\rH\u0007¨\u0006&²\u0006\n\u0010'\u001a\u00020(X\u008a\u0084\u0002"}, d2 = {"Lio/intercom/android/sdk/utilities/ThemeUtils;", "", "<init>", "()V", "isDarkMode", "", "context", "Landroid/content/Context;", "isDarkMode$intercom_sdk_base_release", "isDarkModeCompose", "isDarkModeCompose$intercom_sdk_base_release", "(Landroidx/compose/runtime/Composer;I)Z", "selectUrlForTheme", "", "lightUrl", "darkUrl", "selectUrlForThemeCompose", "selectUrlForThemeCompose$intercom_sdk_base_release", "(Ljava/lang/String;Ljava/lang/String;Landroidx/compose/runtime/Composer;I)Ljava/lang/String;", "selectLauncherLogoUrl", "launcherLogoUrl", "launcherLogoDarkUrl", "legacyLauncherLogoUrl", "selectHeaderLogoUrl", "logoUrl", "logoDarkUrl", "selectHeaderLogoUrl$intercom_sdk_base_release", "selectHeaderBackgroundImageUrl", "imageUrl", "imageDarkUrl", "selectHeaderBackgroundImageUrl$intercom_sdk_base_release", "selectColorForTheme", "lightColor", "darkColor", "selectColorForThemeCompose", "selectColorForThemeCompose$intercom_sdk_base_release", "appendInterfaceStyleToUrl", "url", "intercom-sdk-base_release", "currentThemeMode", "Lio/intercom/android/sdk/ui/theme/ThemeMode;"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes9.dex */
public final class ThemeUtils {
    public static final int $stable = 0;
    public static final ThemeUtils INSTANCE = new ThemeUtils();

    /* compiled from: ThemeUtils.kt */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[ThemeMode.values().length];
            try {
                iArr[ThemeMode.DARK.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[ThemeMode.LIGHT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[ThemeMode.SYSTEM.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    @JvmStatic
    public static final String selectLauncherLogoUrl(Context context, String str, String str2) {
        Intrinsics.checkNotNullParameter(context, "context");
        return selectLauncherLogoUrl$default(context, str, str2, null, 8, null);
    }

    private ThemeUtils() {
    }

    @JvmStatic
    public static final boolean isDarkMode$intercom_sdk_base_release(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        int i = WhenMappings.$EnumSwitchMapping$0[ThemeManager.INSTANCE.getCurrentThemeMode().ordinal()];
        if (i == 1) {
            return true;
        }
        if (i == 2) {
            return false;
        }
        if (i == 3) {
            return (context.getResources().getConfiguration().uiMode & 48) == 32;
        }
        throw new NoWhenBranchMatchedException();
    }

    private static final ThemeMode isDarkModeCompose$lambda$0(MutableState<ThemeMode> mutableState) {
        return mutableState.getValue();
    }

    public final boolean isDarkModeCompose$intercom_sdk_base_release(Composer composer, int i) {
        boolean isSystemInDarkTheme;
        composer.startReplaceGroup(121228161);
        ThemeMode isDarkModeCompose$lambda$0 = isDarkModeCompose$lambda$0(ThemeManager.INSTANCE.getThemeModeState());
        if (isDarkModeCompose$lambda$0 == ThemeMode.DARK) {
            isSystemInDarkTheme = true;
        } else if (isDarkModeCompose$lambda$0 == ThemeMode.LIGHT) {
            isSystemInDarkTheme = false;
        } else {
            if (isDarkModeCompose$lambda$0 != ThemeMode.SYSTEM) {
                throw new NoWhenBranchMatchedException();
            }
            isSystemInDarkTheme = DarkThemeKt.isSystemInDarkTheme(composer, 0);
        }
        composer.endReplaceGroup();
        return isSystemInDarkTheme;
    }

    @JvmStatic
    public static final String selectUrlForTheme(Context context, String lightUrl, String darkUrl) {
        String str;
        Intrinsics.checkNotNullParameter(context, "context");
        return (!isDarkMode$intercom_sdk_base_release(context) || (str = darkUrl) == null || str.length() == 0) ? lightUrl : darkUrl;
    }

    public final String selectUrlForThemeCompose$intercom_sdk_base_release(String str, String str2, Composer composer, int i) {
        String str3;
        composer.startReplaceGroup(1242850468);
        if (isDarkModeCompose$intercom_sdk_base_release(composer, (i >> 6) & 14) && (str3 = str2) != null && str3.length() != 0) {
            str = str2;
        }
        composer.endReplaceGroup();
        return str;
    }

    public static /* synthetic */ String selectLauncherLogoUrl$default(Context context, String str, String str2, String str3, int i, Object obj) {
        if ((i & 8) != 0) {
            str3 = null;
        }
        return selectLauncherLogoUrl(context, str, str2, str3);
    }

    @JvmStatic
    public static final String selectLauncherLogoUrl(Context context, String launcherLogoUrl, String launcherLogoDarkUrl, String legacyLauncherLogoUrl) {
        String str;
        Intrinsics.checkNotNullParameter(context, "context");
        if (isDarkMode$intercom_sdk_base_release(context) && (str = launcherLogoDarkUrl) != null && str.length() != 0) {
            return launcherLogoDarkUrl;
        }
        String str2 = launcherLogoUrl;
        return (str2 == null || str2.length() == 0) ? legacyLauncherLogoUrl : launcherLogoUrl;
    }

    @JvmStatic
    public static final String selectHeaderLogoUrl$intercom_sdk_base_release(Context context, String logoUrl, String logoDarkUrl) {
        Intrinsics.checkNotNullParameter(context, "context");
        return (!isDarkMode$intercom_sdk_base_release(context) || logoDarkUrl == null) ? logoUrl : logoDarkUrl;
    }

    @JvmStatic
    public static final String selectHeaderBackgroundImageUrl$intercom_sdk_base_release(Context context, String imageUrl, String imageDarkUrl) {
        Intrinsics.checkNotNullParameter(context, "context");
        return selectUrlForTheme(context, imageUrl, imageDarkUrl);
    }

    @JvmStatic
    public static final String selectColorForTheme(Context context, String lightColor, String darkColor) {
        String str;
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(lightColor, "lightColor");
        return (!isDarkMode$intercom_sdk_base_release(context) || (str = darkColor) == null || str.length() == 0) ? lightColor : darkColor;
    }

    public final String selectColorForThemeCompose$intercom_sdk_base_release(String lightColor, String str, Composer composer, int i) {
        String str2;
        Intrinsics.checkNotNullParameter(lightColor, "lightColor");
        composer.startReplaceGroup(-1398327784);
        if (isDarkModeCompose$intercom_sdk_base_release(composer, (i >> 6) & 14) && (str2 = str) != null && str2.length() != 0) {
            lightColor = str;
        }
        composer.endReplaceGroup();
        return lightColor;
    }

    @JvmStatic
    public static final String appendInterfaceStyleToUrl(Context context, String url) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(url, "url");
        String uri = Uri.parse(url).buildUpon().appendQueryParameter("theme", isDarkMode$intercom_sdk_base_release(context) ? "dark" : "light").build().toString();
        Intrinsics.checkNotNullExpressionValue(uri, "toString(...)");
        return uri;
    }
}
