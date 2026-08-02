package com.appsflyer.internal;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.LinkAddress;
import android.net.LinkProperties;
import android.net.Network;
import android.net.NetworkCapabilities;
import android.os.Build;
import android.telephony.TelephonyManager;
import com.appsflyer.AFLogger;
import com.appsflyer.sdk_base.logger.AFLoggerBase;
import com.appsflyer.sdk_base.logger.LogTag;
import java.net.InetAddress;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Metadata(d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\b'\u0018\u0000 $2\u00020\u0001:\u0001$B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H%¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\n\u001a\u00020\tH&¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\r\u001a\u00020\fH\u0017¢\u0006\u0004\b\r\u0010\u000eJ\u0011\u0010\u0010\u001a\u0004\u0018\u00010\u000fH\u0017¢\u0006\u0004\b\u0010\u0010\u0011J\u0011\u0010\u0013\u001a\u0004\u0018\u00010\u0012H\u0015¢\u0006\u0004\b\u0013\u0010\u0014J\u0011\u0010\u0016\u001a\u0004\u0018\u00010\u0015H\u0015¢\u0006\u0004\b\u0016\u0010\u0017J\u001f\u0010\u0019\u001a\u0012\u0012\u0006\u0012\u0004\u0018\u00010\t\u0012\u0006\u0012\u0004\u0018\u00010\t0\u0018H\u0005¢\u0006\u0004\b\u0019\u0010\u001aJ\u0011\u0010\u001b\u001a\u0004\u0018\u00010\u0006H\u0005¢\u0006\u0004\b\u001b\u0010\bR\u0014\u0010\u0007\u001a\u00020\u00028\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u001cR\u001e\u0010!\u001a\u0004\u0018\u00010\u001d8\u0005@\u0004X\u0085\f¢\u0006\f\n\u0004\b\u0007\u0010\u001e\u001a\u0004\b\u001f\u0010 R\u0016\u0010\n\u001a\u0004\u0018\u00010\"8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\r\u0010#"}, d2 = {"Lcom/appsflyer/internal/AFh1iSDK;", "", "Landroid/content/Context;", "p0", "<init>", "(Landroid/content/Context;)V", "", "unregisterClient", "()Ljava/lang/String;", "", "AFLogger", "()Z", "Lcom/appsflyer/internal/AFh1gSDK;", "registerClient", "()Lcom/appsflyer/internal/AFh1gSDK;", "Lcom/appsflyer/internal/AFh1dSDK;", "AFKeystoreWrapper", "()Lcom/appsflyer/internal/AFh1dSDK;", "Landroid/net/NetworkCapabilities;", "H_", "()Landroid/net/NetworkCapabilities;", "Landroid/net/Network;", "G_", "()Landroid/net/Network;", "Lkotlin/Pair;", "e", "()Lkotlin/Pair;", "v", "Landroid/content/Context;", "Landroid/net/ConnectivityManager;", "Landroid/net/ConnectivityManager;", "A_", "()Landroid/net/ConnectivityManager;", "d", "Landroid/telephony/TelephonyManager;", "Landroid/telephony/TelephonyManager;", "AFa1tSDK"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public abstract class AFh1iSDK {

    /* renamed from: AFKeystoreWrapper, reason: from kotlin metadata */
    @NotNull
    private final Context unregisterClient;

    /* renamed from: registerClient, reason: from kotlin metadata */
    @Nullable
    private final TelephonyManager AFLogger;

    /* renamed from: unregisterClient, reason: from kotlin metadata */
    @Nullable
    private ConnectivityManager d;

    public AFh1iSDK(@NotNull Context context) {
        context.getClass();
        this.unregisterClient = context;
        Object systemService = context.getSystemService("connectivity");
        this.d = systemService instanceof ConnectivityManager ? (ConnectivityManager) systemService : null;
        Object systemService2 = context.getSystemService("phone");
        this.AFLogger = systemService2 instanceof TelephonyManager ? (TelephonyManager) systemService2 : null;
    }

    @NotNull
    private Pair<Boolean, Boolean> e() {
        try {
            ConnectivityManager connectivityManager = this.d;
            if (connectivityManager == null) {
                return new Pair<>(null, null);
            }
            Network activeNetwork = connectivityManager.getActiveNetwork();
            if (activeNetwork == null) {
                Boolean bool = Boolean.FALSE;
                return new Pair<>(bool, bool);
            }
            NetworkCapabilities networkCapabilities = connectivityManager.getNetworkCapabilities(activeNetwork);
            if (networkCapabilities == null) {
                Boolean bool2 = Boolean.FALSE;
                return new Pair<>(bool2, bool2);
            }
            return new Pair<>(Boolean.valueOf(networkCapabilities.hasCapability(12)), Boolean.valueOf(networkCapabilities.hasCapability(16)));
        } catch (Throwable th) {
            AFLoggerBase.e$default(AFLogger.INSTANCE, LogTag.DEVICE_DATA, "Exception while collecting internet capabilities. ", th, false, false, false, false, 120, null);
            return new Pair<>(null, null);
        }
    }

    @Nullable
    private String v() {
        try {
            TelephonyManager telephonyManager = this.AFLogger;
            if (telephonyManager == null) {
                return null;
            }
            int dataState = telephonyManager.getDataState();
            if (dataState == 0) {
                return "DISCONNECTED";
            }
            if (dataState == 1) {
                return "CONNECTING";
            }
            if (dataState == 2) {
                return "CONNECTED";
            }
            if (dataState == 3) {
                return "SUSPENDED";
            }
            return "UNKNOWN(" + dataState + ")";
        } catch (Throwable th) {
            AFLoggerBase.e$default(AFLogger.INSTANCE, LogTag.DEVICE_DATA, "Exception while collecting data state. ", th, false, false, false, false, 120, null);
            return null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:37:0x00a2  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00a9  */
    @Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final AFh1dSDK AFKeystoreWrapper() {
        String str;
        LinkProperties linkProperties;
        LinkProperties linkProperties2;
        String privateDnsServerName;
        Pair pair;
        Network G_;
        List<LinkAddress> linkAddresses;
        Object obj;
        InetAddress address;
        AFh1gSDK registerClient = registerClient();
        Pair<Boolean, Boolean> e = e();
        Boolean bool = (Boolean) e.a;
        Boolean bool2 = (Boolean) e.b;
        String v = v();
        NetworkCapabilities H_ = H_();
        int i = 0;
        String str2 = null;
        String str3 = (H_ == null || !H_.hasTransport(4) || H_.hasCapability(15)) ? null : H_.hasTransport(1) ? "WIFI" : H_.hasTransport(0) ? "MOBILE" : "UNKNOWN";
        NetworkCapabilities H_2 = H_();
        if (H_2 != null && H_2.hasTransport(4) && !H_2.hasCapability(15) && (G_ = G_()) != null) {
            ConnectivityManager connectivityManager = this.d;
            LinkProperties linkProperties3 = connectivityManager != null ? connectivityManager.getLinkProperties(G_) : null;
            if (linkProperties3 != null && (linkAddresses = linkProperties3.getLinkAddresses()) != null) {
                Iterator<T> it = linkAddresses.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        obj = null;
                        break;
                    }
                    obj = it.next();
                    if (!((LinkAddress) obj).getAddress().isLoopbackAddress()) {
                        break;
                    }
                }
                LinkAddress linkAddress = (LinkAddress) obj;
                if (linkAddress != null && (address = linkAddress.getAddress()) != null) {
                    str = address.getHostAddress();
                    if (Build.VERSION.SDK_INT >= 28) {
                        pair = new Pair(null, null);
                    } else {
                        ConnectivityManager connectivityManager2 = this.d;
                        if (connectivityManager2 == null) {
                            linkProperties = null;
                        } else {
                            Network G_2 = G_();
                            NetworkCapabilities H_3 = H_();
                            linkProperties = G_2 != null ? connectivityManager2.getLinkProperties(G_2) : null;
                            boolean z = (linkProperties == null || (privateDnsServerName = linkProperties.getPrivateDnsServerName()) == null || !(StringsKt.R(privateDnsServerName) ^ true)) ? false : true;
                            if ((linkProperties == null || (H_3 != null && H_3.hasTransport(4) && !H_3.hasCapability(15) && !z)) && H_3 != null && H_3.hasTransport(4) && !H_3.hasCapability(15)) {
                                Network[] allNetworks = connectivityManager2.getAllNetworks();
                                if (allNetworks == null) {
                                    allNetworks = new Network[0];
                                }
                                int length = allNetworks.length;
                                while (true) {
                                    if (i >= length) {
                                        break;
                                    }
                                    Network network = allNetworks[i];
                                    NetworkCapabilities networkCapabilities = connectivityManager2.getNetworkCapabilities(network);
                                    if (networkCapabilities != null && !networkCapabilities.hasTransport(4) && (linkProperties2 = connectivityManager2.getLinkProperties(network)) != null) {
                                        linkProperties = linkProperties2;
                                        break;
                                    }
                                    i++;
                                }
                            }
                        }
                        if (linkProperties == null) {
                            pair = new Pair(null, null);
                        } else {
                            String privateDnsServerName2 = linkProperties.getPrivateDnsServerName();
                            if (privateDnsServerName2 != null && !StringsKt.R(privateDnsServerName2)) {
                                str2 = privateDnsServerName2;
                            }
                            pair = new Pair(str2, Boolean.valueOf(linkProperties.isPrivateDnsActive()));
                        }
                    }
                    return new AFh1dSDK(registerClient.AFKeystoreWrapper, registerClient.unregisterClient, bool, bool2, v, str3, str, (String) pair.a, (Boolean) pair.b);
                }
            }
        }
        str = null;
        if (Build.VERSION.SDK_INT >= 28) {
        }
        return new AFh1dSDK(registerClient.AFKeystoreWrapper, registerClient.unregisterClient, bool, bool2, v, str3, str, (String) pair.a, (Boolean) pair.b);
    }

    public abstract boolean AFLogger();

    @Nullable
    /* renamed from: A_, reason: from getter */
    public final ConnectivityManager getD() {
        return this.d;
    }

    @Nullable
    public Network G_() {
        return null;
    }

    @Nullable
    public NetworkCapabilities H_() {
        return null;
    }

    @NotNull
    public final AFh1gSDK registerClient() {
        Throwable th;
        String str;
        String str2;
        TelephonyManager telephonyManager;
        String str3 = null;
        try {
            telephonyManager = this.AFLogger;
        } catch (Throwable th2) {
            th = th2;
            str = null;
        }
        if (telephonyManager != null) {
            str2 = telephonyManager.getSimOperatorName();
            try {
                str3 = telephonyManager.getNetworkOperatorName();
                if (str3 != null) {
                    if (str3.length() == 0) {
                    }
                }
            } catch (Throwable th3) {
                th = th3;
                str = str3;
                str3 = str2;
                AFLoggerBase.e$default(AFLogger.INSTANCE, LogTag.DEVICE_DATA, "Exception while collecting network info", th, false, false, false, false, 120, null);
                str2 = str3;
                str3 = str;
                return new AFh1gSDK(unregisterClient(), str3, str2, AFLogger());
            }
            if (telephonyManager.getPhoneType() == 2) {
                str = "CDMA";
                str3 = str;
            }
        } else {
            str2 = null;
        }
        return new AFh1gSDK(unregisterClient(), str3, str2, AFLogger());
    }

    @NotNull
    public abstract String unregisterClient();
}
