package com.appsflyer.share;

import com.ironsource.mediationsdk.j;
import defpackage.jp5;
import defpackage.kp5;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0007\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\b"}, d2 = {"Lcom/appsflyer/share/AppsFlyerAdNetworkEventType;", "", "<init>", "(Ljava/lang/String;I)V", j.a, "INTERSTITIAL", "NATIVE", "REWARDED", "APP_OPEN"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public final class AppsFlyerAdNetworkEventType {
    private static final /* synthetic */ jp5 AFLogger;
    public static final AppsFlyerAdNetworkEventType APP_OPEN;
    public static final AppsFlyerAdNetworkEventType BANNER;
    public static final AppsFlyerAdNetworkEventType INTERSTITIAL;
    public static final AppsFlyerAdNetworkEventType NATIVE;
    public static final AppsFlyerAdNetworkEventType REWARDED;
    private static final /* synthetic */ AppsFlyerAdNetworkEventType[] registerClient;

    static {
        AppsFlyerAdNetworkEventType appsFlyerAdNetworkEventType = new AppsFlyerAdNetworkEventType(j.a, 0);
        BANNER = appsFlyerAdNetworkEventType;
        AppsFlyerAdNetworkEventType appsFlyerAdNetworkEventType2 = new AppsFlyerAdNetworkEventType("INTERSTITIAL", 1);
        INTERSTITIAL = appsFlyerAdNetworkEventType2;
        AppsFlyerAdNetworkEventType appsFlyerAdNetworkEventType3 = new AppsFlyerAdNetworkEventType("NATIVE", 2);
        NATIVE = appsFlyerAdNetworkEventType3;
        AppsFlyerAdNetworkEventType appsFlyerAdNetworkEventType4 = new AppsFlyerAdNetworkEventType("REWARDED", 3);
        REWARDED = appsFlyerAdNetworkEventType4;
        AppsFlyerAdNetworkEventType appsFlyerAdNetworkEventType5 = new AppsFlyerAdNetworkEventType("APP_OPEN", 4);
        APP_OPEN = appsFlyerAdNetworkEventType5;
        AppsFlyerAdNetworkEventType[] appsFlyerAdNetworkEventTypeArr = {appsFlyerAdNetworkEventType, appsFlyerAdNetworkEventType2, appsFlyerAdNetworkEventType3, appsFlyerAdNetworkEventType4, appsFlyerAdNetworkEventType5};
        registerClient = appsFlyerAdNetworkEventTypeArr;
        AFLogger = new kp5(appsFlyerAdNetworkEventTypeArr);
    }

    private AppsFlyerAdNetworkEventType(String str, int i) {
    }

    @NotNull
    public static jp5 getEntries() {
        return AFLogger;
    }

    public static AppsFlyerAdNetworkEventType valueOf(String str) {
        return (AppsFlyerAdNetworkEventType) Enum.valueOf(AppsFlyerAdNetworkEventType.class, str);
    }

    public static AppsFlyerAdNetworkEventType[] values() {
        return (AppsFlyerAdNetworkEventType[]) registerClient.clone();
    }
}
