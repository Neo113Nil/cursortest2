package com.appsflyer.internal;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.telephony.TelephonyManager;
import androidx.autofill.HintConstants;
import com.appsflyer.AFLogger;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b&\u0018\u0000 \u00172\u00020\u0001:\u0001\u0017B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H%¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\n\u001a\u00020\tH\u0007¢\u0006\u0004\b\n\u0010\u000bJ\u0019\u0010\u000e\u001a\u00020\r2\b\u0010\u0003\u001a\u0004\u0018\u00010\fH\u0004¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0010\u001a\u00020\rH&¢\u0006\u0004\b\u0010\u0010\u0011R\u0018\u0010\u0014\u001a\u0004\u0018\u00010\u00128\u0005@\u0004X\u0085\f¢\u0006\u0006\n\u0004\b\n\u0010\u0013R\u0016\u0010\n\u001a\u0004\u0018\u00010\u00158\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0016"}, d2 = {"Lcom/appsflyer/internal/AFi1xSDK;", "", "Landroid/content/Context;", "p0", "<init>", "(Landroid/content/Context;)V", "", "getCurrencyIso4217Code", "()Ljava/lang/String;", "Lcom/appsflyer/internal/AFi1wSDK;", "getMediationNetwork", "()Lcom/appsflyer/internal/AFi1wSDK;", "Landroid/net/NetworkInfo;", "", "t_", "(Landroid/net/NetworkInfo;)Z", "AFAdRevenueData", "()Z", "Landroid/net/ConnectivityManager;", "Landroid/net/ConnectivityManager;", "getRevenue", "Landroid/telephony/TelephonyManager;", "Landroid/telephony/TelephonyManager;", "AFa1ySDK"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes6.dex */
public abstract class AFi1xSDK {

    /* renamed from: getMediationNetwork, reason: from kotlin metadata */
    ConnectivityManager getRevenue;

    /* renamed from: getRevenue, reason: from kotlin metadata */
    private final TelephonyManager getMediationNetwork;

    public abstract boolean AFAdRevenueData();

    protected abstract String getCurrencyIso4217Code();

    public AFi1xSDK(Context context) {
        Intrinsics.checkNotNullParameter(context, "");
        Object systemService = context.getSystemService("connectivity");
        this.getRevenue = systemService instanceof ConnectivityManager ? (ConnectivityManager) systemService : null;
        Object systemService2 = context.getSystemService(HintConstants.AUTOFILL_HINT_PHONE);
        this.getMediationNetwork = systemService2 instanceof TelephonyManager ? (TelephonyManager) systemService2 : null;
    }

    protected static boolean t_(NetworkInfo p0) {
        if (p0 != null) {
            return p0.isConnectedOrConnecting();
        }
        return false;
    }

    public final AFi1wSDK getMediationNetwork() {
        Throwable th;
        String str;
        String str2;
        String str3 = null;
        try {
            TelephonyManager telephonyManager = this.getMediationNetwork;
            if (telephonyManager != null) {
                str2 = telephonyManager.getSimOperatorName();
                try {
                    str3 = telephonyManager.getNetworkOperatorName();
                    String str4 = str3;
                    if (str4 == null || str4.length() == 0) {
                        if (telephonyManager.getPhoneType() == 2) {
                            str3 = "CDMA";
                        }
                    }
                } catch (Throwable th2) {
                    str = str3;
                    str3 = str2;
                    th = th2;
                    AFLogger.afErrorLog("Exception while collecting network info. ", th);
                    str2 = str3;
                    str3 = str;
                    return new AFi1wSDK(getCurrencyIso4217Code(), str3, str2, AFAdRevenueData());
                }
            } else {
                str2 = null;
            }
        } catch (Throwable th3) {
            th = th3;
            str = null;
        }
        return new AFi1wSDK(getCurrencyIso4217Code(), str3, str2, AFAdRevenueData());
    }
}
