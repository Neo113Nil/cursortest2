package com.vungle.ads.internal.platform;

import android.content.Context;
import android.hardware.SensorManager;
import android.net.ConnectivityManager;
import android.net.LinkProperties;
import android.net.Network;
import android.net.NetworkCapabilities;
import android.net.ProxyInfo;
import android.net.Uri;
import android.os.Build;
import android.provider.Settings;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.collections.ArraysKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* compiled from: DeviceCheckUtils.kt */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000e\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006J\u000e\u0010\u0007\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u0006J\u0006\u0010\t\u001a\u00020\bJ\u000e\u0010\n\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u0006J\u000e\u0010\u000b\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u0006J\u000e\u0010\f\u001a\u00020\b*\u0004\u0018\u00010\rH\u0002¨\u0006\u000e"}, d2 = {"Lcom/vungle/ads/internal/platform/DeviceCheckUtils;", "", "()V", "getSensorCount", "", "context", "Landroid/content/Context;", "hasSystemAlertWindowPermission", "", "isEmulator", "isProxyEnabled", "isVpnConnected", "isEnabled", "Landroid/net/ProxyInfo;", "vungle-ads_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
/* loaded from: classes8.dex */
public final class DeviceCheckUtils {
    public static final DeviceCheckUtils INSTANCE = new DeviceCheckUtils();

    private DeviceCheckUtils() {
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0031, code lost:
    
        if (r4 == null) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0041, code lost:
    
        if (r5 == null) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0051, code lost:
    
        if (r6 == null) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:4:0x0011, code lost:
    
        if (r0 == null) goto L6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0021, code lost:
    
        if (r3 == null) goto L11;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean isEmulator() {
        String str;
        String str2;
        String str3;
        String str4;
        String str5;
        String str6 = Build.FINGERPRINT;
        String str7 = "";
        if (str6 != null) {
            str = str6.toLowerCase(Locale.ROOT);
            Intrinsics.checkNotNullExpressionValue(str, "this as java.lang.String).toLowerCase(Locale.ROOT)");
        }
        str = "";
        String str8 = Build.MODEL;
        if (str8 != null) {
            str2 = str8.toLowerCase(Locale.ROOT);
            Intrinsics.checkNotNullExpressionValue(str2, "this as java.lang.String).toLowerCase(Locale.ROOT)");
        }
        str2 = "";
        String str9 = Build.PRODUCT;
        if (str9 != null) {
            str3 = str9.toLowerCase(Locale.ROOT);
            Intrinsics.checkNotNullExpressionValue(str3, "this as java.lang.String).toLowerCase(Locale.ROOT)");
        }
        str3 = "";
        String str10 = Build.BRAND;
        if (str10 != null) {
            str4 = str10.toLowerCase(Locale.ROOT);
            Intrinsics.checkNotNullExpressionValue(str4, "this as java.lang.String).toLowerCase(Locale.ROOT)");
        }
        str4 = "";
        String str11 = Build.MANUFACTURER;
        if (str11 != null) {
            str5 = str11.toLowerCase(Locale.ROOT);
            Intrinsics.checkNotNullExpressionValue(str5, "this as java.lang.String).toLowerCase(Locale.ROOT)");
        }
        str5 = "";
        String str12 = Build.BOARD;
        if (str12 != null) {
            String lowerCase = str12.toLowerCase(Locale.ROOT);
            Intrinsics.checkNotNullExpressionValue(lowerCase, "this as java.lang.String).toLowerCase(Locale.ROOT)");
            if (lowerCase != null) {
                str7 = lowerCase;
            }
        }
        String[] SUPPORTED_ABIS = Build.SUPPORTED_ABIS;
        Intrinsics.checkNotNullExpressionValue(SUPPORTED_ABIS, "SUPPORTED_ABIS");
        String lowerCase2 = ArraysKt.joinToString$default(SUPPORTED_ABIS, (CharSequence) null, (CharSequence) null, (CharSequence) null, 0, (CharSequence) null, (Function1) null, 63, (Object) null).toLowerCase(Locale.ROOT);
        Intrinsics.checkNotNullExpressionValue(lowerCase2, "this as java.lang.String).toLowerCase(Locale.ROOT)");
        String str13 = str;
        if (StringsKt.contains$default((CharSequence) str13, (CharSequence) "generic", false, 2, (Object) null) || StringsKt.contains$default((CharSequence) str13, (CharSequence) "emulator", false, 2, (Object) null)) {
            return true;
        }
        String str14 = str2;
        if (StringsKt.contains$default((CharSequence) str14, (CharSequence) "google_sdk", false, 2, (Object) null) || StringsKt.contains$default((CharSequence) str14, (CharSequence) "emulator", false, 2, (Object) null)) {
            return true;
        }
        String str15 = str3;
        return StringsKt.contains$default((CharSequence) str15, (CharSequence) "sdk", false, 2, (Object) null) || StringsKt.contains$default((CharSequence) str15, (CharSequence) "vbox", false, 2, (Object) null) || StringsKt.contains$default((CharSequence) str4, (CharSequence) "generic", false, 2, (Object) null) || StringsKt.contains$default((CharSequence) str5, (CharSequence) "genymotion", false, 2, (Object) null) || StringsKt.contains$default((CharSequence) str7, (CharSequence) "nox", false, 2, (Object) null) || StringsKt.contains$default((CharSequence) lowerCase2, (CharSequence) "x86", false, 2, (Object) null);
    }

    public final boolean isVpnConnected(Context context) {
        Object m11180constructorimpl;
        boolean z;
        Intrinsics.checkNotNullParameter(context, "context");
        try {
            Result.Companion companion = Result.INSTANCE;
            DeviceCheckUtils deviceCheckUtils = this;
            Object systemService = context.getSystemService("connectivity");
            Intrinsics.checkNotNull(systemService, "null cannot be cast to non-null type android.net.ConnectivityManager");
            ConnectivityManager connectivityManager = (ConnectivityManager) systemService;
            Network[] allNetworks = connectivityManager.getAllNetworks();
            Intrinsics.checkNotNullExpressionValue(allNetworks, "cm.allNetworks");
            Network[] networkArr = allNetworks;
            int length = networkArr.length;
            int i = 0;
            while (true) {
                if (i >= length) {
                    z = false;
                    break;
                }
                NetworkCapabilities networkCapabilities = connectivityManager.getNetworkCapabilities(networkArr[i]);
                if (networkCapabilities != null) {
                    z = true;
                    if (networkCapabilities.hasTransport(4)) {
                        break;
                    }
                }
                i++;
            }
            m11180constructorimpl = Result.m11180constructorimpl(Boolean.valueOf(z));
        } catch (Throwable th) {
            Result.Companion companion2 = Result.INSTANCE;
            m11180constructorimpl = Result.m11180constructorimpl(ResultKt.createFailure(th));
        }
        if (Result.m11186isFailureimpl(m11180constructorimpl)) {
            m11180constructorimpl = false;
        }
        return ((Boolean) m11180constructorimpl).booleanValue();
    }

    public final boolean hasSystemAlertWindowPermission(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        return Settings.canDrawOverlays(context);
    }

    public final int getSensorCount(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        Object systemService = context.getSystemService("sensor");
        Intrinsics.checkNotNull(systemService, "null cannot be cast to non-null type android.hardware.SensorManager");
        return ((SensorManager) systemService).getSensorList(-1).size();
    }

    private final boolean isEnabled(ProxyInfo proxyInfo) {
        if (proxyInfo == null) {
            return false;
        }
        String host = proxyInfo.getHost();
        return (host != null && host.length() > 0 && proxyInfo.getPort() > 0) || (proxyInfo.getPacFileUrl() != null && !Intrinsics.areEqual(proxyInfo.getPacFileUrl(), Uri.EMPTY));
    }

    public final boolean isProxyEnabled(Context context) {
        Object m11180constructorimpl;
        boolean isEnabled;
        Intrinsics.checkNotNullParameter(context, "context");
        try {
            Result.Companion companion = Result.INSTANCE;
            DeviceCheckUtils deviceCheckUtils = this;
            Object systemService = context.getSystemService("connectivity");
            Intrinsics.checkNotNull(systemService, "null cannot be cast to non-null type android.net.ConnectivityManager");
            ConnectivityManager connectivityManager = (ConnectivityManager) systemService;
            Network activeNetwork = connectivityManager.getActiveNetwork();
            if (activeNetwork == null) {
                isEnabled = false;
            } else {
                Intrinsics.checkNotNullExpressionValue(activeNetwork, "cm.activeNetwork ?: return@runCatching false");
                LinkProperties linkProperties = connectivityManager.getLinkProperties(activeNetwork);
                isEnabled = isEnabled(linkProperties != null ? linkProperties.getHttpProxy() : null);
            }
            m11180constructorimpl = Result.m11180constructorimpl(Boolean.valueOf(isEnabled));
        } catch (Throwable th) {
            Result.Companion companion2 = Result.INSTANCE;
            m11180constructorimpl = Result.m11180constructorimpl(ResultKt.createFailure(th));
        }
        if (Result.m11186isFailureimpl(m11180constructorimpl)) {
            m11180constructorimpl = false;
        }
        return ((Boolean) m11180constructorimpl).booleanValue();
    }
}
