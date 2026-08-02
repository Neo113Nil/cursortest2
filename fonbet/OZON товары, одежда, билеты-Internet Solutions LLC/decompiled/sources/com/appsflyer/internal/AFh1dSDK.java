package com.appsflyer.internal;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.telephony.TelephonyManager;
import com.appsflyer.AFLogger;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b&\u0018\u0000 \u00172\u00020\u0001:\u0001\u0017B\u000f\u0012\u0006\u0010\t\u001a\u00020\u0014¢\u0006\u0004\b\u0015\u0010\u0016J\u000f\u0010\u0003\u001a\u00020\u0002H%¢\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\u0006\u001a\u00020\u0005H\u0007¢\u0006\u0004\b\u0006\u0010\u0007J\u0019\u0010\u000b\u001a\u00020\n2\b\u0010\t\u001a\u0004\u0018\u00010\bH\u0004¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\r\u001a\u00020\nH&¢\u0006\u0004\b\r\u0010\u000eR\u0014\u0010\u0011\u001a\u0004\u0018\u00010\u000fX\u0085\u0002¢\u0006\u0006\n\u0004\b\u0006\u0010\u0010R\u0016\u0010\r\u001a\u0004\u0018\u00010\u00128\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\u0013"}, d2 = {"Lcom/appsflyer/internal/AFh1dSDK;", "", "", "values", "()Ljava/lang/String;", "Lcom/appsflyer/internal/AFi1zSDK;", "AFInAppEventType", "()Lcom/appsflyer/internal/AFi1zSDK;", "Landroid/net/NetworkInfo;", "p0", "", "AFInAppEventParameterName", "(Landroid/net/NetworkInfo;)Z", "valueOf", "()Z", "Landroid/net/ConnectivityManager;", "Landroid/net/ConnectivityManager;", "AFKeystoreWrapper", "Landroid/telephony/TelephonyManager;", "Landroid/telephony/TelephonyManager;", "Landroid/content/Context;", "<init>", "(Landroid/content/Context;)V", "AFa1vSDK"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes.dex */
public abstract class AFh1dSDK {

    /* renamed from: AFInAppEventParameterName, reason: from kotlin metadata */
    private final TelephonyManager valueOf;

    /* renamed from: AFInAppEventType, reason: from kotlin metadata */
    ConnectivityManager AFKeystoreWrapper;

    public AFh1dSDK(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "");
        Object systemService = context.getSystemService("connectivity");
        this.AFKeystoreWrapper = systemService instanceof ConnectivityManager ? (ConnectivityManager) systemService : null;
        Object systemService2 = context.getSystemService("phone");
        this.valueOf = systemService2 instanceof TelephonyManager ? (TelephonyManager) systemService2 : null;
    }

    protected static boolean AFInAppEventParameterName(NetworkInfo p02) {
        if (p02 != null) {
            return p02.isConnectedOrConnecting();
        }
        return false;
    }

    @NotNull
    public final AFi1zSDK AFInAppEventType() {
        Throwable th2;
        String str;
        String str2;
        String str3 = null;
        try {
            TelephonyManager telephonyManager = this.valueOf;
            if (telephonyManager != null) {
                str2 = telephonyManager.getSimOperatorName();
                try {
                    str3 = telephonyManager.getNetworkOperatorName();
                    if (str3 != null) {
                        if (str3.length() == 0) {
                        }
                    }
                    if (telephonyManager.getPhoneType() == 2) {
                        str3 = "CDMA";
                    }
                } catch (Throwable th3) {
                    str = str3;
                    str3 = str2;
                    th2 = th3;
                    AFLogger.afErrorLog("Exception while collecting network info. ", th2);
                    str2 = str3;
                    str3 = str;
                    return new AFi1zSDK(values(), str3, str2, valueOf());
                }
            } else {
                str2 = null;
            }
        } catch (Throwable th4) {
            th2 = th4;
            str = null;
        }
        return new AFi1zSDK(values(), str3, str2, valueOf());
    }

    public abstract boolean valueOf();

    @NotNull
    protected abstract String values();
}
