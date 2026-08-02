package com.vk.id.internal.auth;

import Sc.o;
import android.net.Uri;
import android.util.Base64;
import com.vk.id.OAuth;
import com.vk.id.auth.VKIDAuthParams;
import kotlin.Metadata;
import kotlin.collections.C7714v;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000,\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u001f\u0010\u0004\u001a\n \u0003*\u0004\u0018\u00010\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u0000¢\u0006\u0004\b\u0004\u0010\u0005\u001a\u0013\u0010\u0007\u001a\u00020\u0002*\u00020\u0006H\u0000¢\u0006\u0004\b\u0007\u0010\b\u001a\u001b\u0010\t\u001a\u00020\u0002*\u00020\u00062\u0006\u0010\u0001\u001a\u00020\u0000H\u0000¢\u0006\u0004\b\t\u0010\n\u001a\u0013\u0010\f\u001a\u00020\u0000*\u00020\u000bH\u0000¢\u0006\u0004\b\f\u0010\r\u001a\u0013\u0010\f\u001a\u00020\u0000*\u00020\u000eH\u0000¢\u0006\u0004\b\f\u0010\u000f\u001a\u0013\u0010\f\u001a\u00020\u0000*\u00020\u0010H\u0002¢\u0006\u0004\b\f\u0010\u0011¨\u0006\u0012"}, d2 = {"", "appPackage", "Landroid/net/Uri;", "kotlin.jvm.PlatformType", "basicCodeFlowUri", "(Ljava/lang/String;)Landroid/net/Uri;", "Lcom/vk/id/internal/auth/AuthOptions;", "toAuthUriBrowser", "(Lcom/vk/id/internal/auth/AuthOptions;)Landroid/net/Uri;", "toAuthUriCodeFlow", "(Lcom/vk/id/internal/auth/AuthOptions;Ljava/lang/String;)Landroid/net/Uri;", "Lcom/vk/id/auth/VKIDAuthParams$Locale;", "toQueryParam", "(Lcom/vk/id/auth/VKIDAuthParams$Locale;)Ljava/lang/String;", "Lcom/vk/id/auth/VKIDAuthParams$Theme;", "(Lcom/vk/id/auth/VKIDAuthParams$Theme;)Ljava/lang/String;", "Lcom/vk/id/OAuth;", "(Lcom/vk/id/OAuth;)Ljava/lang/String;", "vkid_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes9.dex */
public final class AuthOptionsKt {

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;

        static {
            int[] iArr = new int[VKIDAuthParams.Locale.values().length];
            try {
                iArr[VKIDAuthParams.Locale.RUS.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[VKIDAuthParams.Locale.UKR.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[VKIDAuthParams.Locale.ENG.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[VKIDAuthParams.Locale.SPA.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[VKIDAuthParams.Locale.GERMAN.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[VKIDAuthParams.Locale.POL.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[VKIDAuthParams.Locale.FRA.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr[VKIDAuthParams.Locale.TURKEY.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[VKIDAuthParams.Theme.values().length];
            try {
                iArr2[VKIDAuthParams.Theme.Light.ordinal()] = 1;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr2[VKIDAuthParams.Theme.Dark.ordinal()] = 2;
            } catch (NoSuchFieldError unused10) {
            }
            $EnumSwitchMapping$1 = iArr2;
        }
    }

    public static final Uri basicCodeFlowUri(@NotNull String appPackage) {
        Intrinsics.checkNotNullParameter(appPackage, "appPackage");
        return new Uri.Builder().scheme(appPackage).authority("vkcexternalauth-codeflow").build();
    }

    @NotNull
    public static final Uri toAuthUriBrowser(@NotNull AuthOptions authOptions) {
        Intrinsics.checkNotNullParameter(authOptions, "<this>");
        Uri.Builder appendQueryParameter = new Uri.Builder().appendQueryParameter("client_id", authOptions.getAppId()).appendQueryParameter("response_type", "code").appendQueryParameter("redirect_uri", authOptions.getRedirectUriBrowser()).appendQueryParameter("code_challenge_method", "s256").appendQueryParameter("code_challenge", authOptions.getCodeChallenge()).appendQueryParameter("state", authOptions.getState()).appendQueryParameter("prompt", authOptions.getPrompt()).appendQueryParameter("stats_info", authOptions.getStatsInfo()).appendQueryParameter("sdk_type", "vkid").appendQueryParameter("v", authOptions.getSdkVersion());
        if (!authOptions.getScopes().isEmpty()) {
            appendQueryParameter.appendQueryParameter("scope", C7714v.V(authOptions.getScopes(), " ", null, null, null, 62));
        }
        if (authOptions.getOAuth() != null) {
            appendQueryParameter.appendQueryParameter("action", toQueryParam(authOptions.getOAuth()));
            appendQueryParameter.appendQueryParameter("provider", authOptions.getOAuth().getServerName());
        }
        if (authOptions.getLocale() != null) {
            appendQueryParameter.appendQueryParameter("lang_id", authOptions.getLocale());
        }
        if (authOptions.getTheme() != null) {
            appendQueryParameter.appendQueryParameter("scheme", authOptions.getTheme());
        }
        if (authOptions.getWebAuthPhoneScreen()) {
            appendQueryParameter.appendQueryParameter("screen", "phone");
        }
        Uri build = appendQueryParameter.scheme("https").authority("id.vk.ru").path("authorize").build();
        Intrinsics.checkNotNullExpressionValue(build, "build(...)");
        return build;
    }

    @NotNull
    public static final Uri toAuthUriCodeFlow(@NotNull AuthOptions authOptions, @NotNull String appPackage) {
        Intrinsics.checkNotNullParameter(authOptions, "<this>");
        Intrinsics.checkNotNullParameter(appPackage, "appPackage");
        Uri.Builder appendQueryParameter = new Uri.Builder().appendQueryParameter("app_id", authOptions.getAppId()).appendQueryParameter("response_type", "code").appendQueryParameter("redirect_uri", authOptions.getRedirectUriCodeFlow()).appendQueryParameter("code_challenge_method", authOptions.getCodeChallengeMethod()).appendQueryParameter("code_challenge", authOptions.getCodeChallenge()).appendQueryParameter("state", authOptions.getState()).appendQueryParameter("uuid", authOptions.getState());
        if (authOptions.getOAuth() != null) {
            appendQueryParameter.appendQueryParameter("action", toQueryParam(authOptions.getOAuth()));
            appendQueryParameter.appendQueryParameter("provider", authOptions.getOAuth().getServerName());
        }
        if (authOptions.getLocale() != null) {
            appendQueryParameter.appendQueryParameter("lang_id", authOptions.getLocale());
        }
        if (authOptions.getTheme() != null) {
            appendQueryParameter.appendQueryParameter("scheme", authOptions.getTheme());
        }
        if (authOptions.getWebAuthPhoneScreen()) {
            appendQueryParameter.appendQueryParameter("screen", "phone");
        }
        Uri build = appendQueryParameter.scheme(appPackage).authority("vkcexternalauth-codeflow").build();
        Intrinsics.checkNotNullExpressionValue(build, "build(...)");
        return build;
    }

    @NotNull
    public static final String toQueryParam(@NotNull VKIDAuthParams.Locale locale) {
        int i11;
        Intrinsics.checkNotNullParameter(locale, "<this>");
        switch (WhenMappings.$EnumSwitchMapping$0[locale.ordinal()]) {
            case 1:
                i11 = 0;
                break;
            case 2:
                i11 = 1;
                break;
            case 3:
                i11 = 3;
                break;
            case 4:
                i11 = 4;
                break;
            case 5:
                i11 = 6;
                break;
            case 6:
                i11 = 15;
                break;
            case 7:
                i11 = 16;
                break;
            case 8:
                i11 = 82;
                break;
            default:
                throw new o();
        }
        return String.valueOf(i11);
    }

    @NotNull
    public static final String toQueryParam(@NotNull VKIDAuthParams.Theme theme) {
        Intrinsics.checkNotNullParameter(theme, "<this>");
        int i11 = WhenMappings.$EnumSwitchMapping$1[theme.ordinal()];
        if (i11 == 1) {
            return "bright_light";
        }
        if (i11 == 2) {
            return "space_gray";
        }
        throw new o();
    }

    private static final String toQueryParam(OAuth oAuth) {
        String str = "{\"name\":\"sdk_oauth\",\"params\":{\"oauth\":\"" + oAuth.getServerName() + "\"}}";
        Intrinsics.checkNotNullParameter(str, "<this>");
        byte[] bytes = str.getBytes(Charsets.UTF_8);
        Intrinsics.checkNotNullExpressionValue(bytes, "getBytes(...)");
        String encodeToString = Base64.encodeToString(bytes, 0);
        Intrinsics.checkNotNullExpressionValue(encodeToString, "encodeToString(...)");
        StringBuilder sb2 = new StringBuilder();
        int length = encodeToString.length();
        for (int i11 = 0; i11 < length; i11++) {
            char charAt = encodeToString.charAt(i11);
            if (charAt != '\n') {
                sb2.append(charAt);
            }
        }
        String sb3 = sb2.toString();
        Intrinsics.checkNotNullExpressionValue(sb3, "toString(...)");
        return sb3;
    }
}
