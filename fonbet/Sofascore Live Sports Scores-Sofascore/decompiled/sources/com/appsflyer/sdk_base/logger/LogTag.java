package com.appsflyer.sdk_base.logger;

import com.fyber.inneractive.sdk.external.NativeAdContent;
import com.sofascore.model.mvvm.model.PlayerKt;
import defpackage.gz8;
import defpackage.jp5;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b+\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013j\u0002\b\u0014j\u0002\b\u0015j\u0002\b\u0016j\u0002\b\u0017j\u0002\b\u0018j\u0002\b\u0019j\u0002\b\u001aj\u0002\b\u001bj\u0002\b\u001cj\u0002\b\u001dj\u0002\b\u001ej\u0002\b\u001fj\u0002\b j\u0002\b!j\u0002\b\"j\u0002\b#j\u0002\b$j\u0002\b%j\u0002\b&j\u0002\b'j\u0002\b(j\u0002\b)j\u0002\b*j\u0002\b+j\u0002\b,j\u0002\b-¨\u0006."}, d2 = {"Lcom/appsflyer/sdk_base/logger/LogTag;", "", "tagName", "", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "getTagName", "()Ljava/lang/String;", "INIT_BY_CONFIG", "SDK_LIFECYCLE", "GCD", "PLAY_INTEGRITY_API", NativeAdContent.ViewTag.OTHER, "HTTP_CLIENT", "QUEUE", "CACHE", "PREFERENCES", "REMOTE_CONTROL", "DDL", "REFERRER", "META_REFERRER", "SAMSUNG_PRELOAD_REFERRER", "ADVERTISING_ID", "CROSS_PROMOTION", "EXCEPTION_MANAGER", "ATTRIBUTION", PlayerKt.ICE_HOCKEY_RIGHT_DEFENSEMAN, "ENGAGEMENT", "ANTI_FRAUD", "PUBLIC_API", "AD_REVENUE", "SDK_SETTERS", "PREDICT", "DEVICE_DATA", "SECURITY", "SECURITY_SDK", "GENERAL", "PREINSTALL", "UNINSTALL", "PURCHASE_VALIDATION", "DMA", "PROXY", "AF_EXECUTOR", "APP_SET_ID", "RFR_INIT_PROVIDER", "PLUGIN_BRIDGE", "sdk_base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public final class LogTag {
    private static final /* synthetic */ jp5 $ENTRIES;
    private static final /* synthetic */ LogTag[] $VALUES;

    @NotNull
    private final String tagName;
    public static final LogTag INIT_BY_CONFIG = new LogTag("INIT_BY_CONFIG", 0, "Config Init Helper");
    public static final LogTag SDK_LIFECYCLE = new LogTag("SDK_LIFECYCLE", 1, "SDK Lifecycle");
    public static final LogTag GCD = new LogTag("GCD", 2, "GCD");
    public static final LogTag PLAY_INTEGRITY_API = new LogTag("PLAY_INTEGRITY_API", 3, "Play Integrity Api");
    public static final LogTag OTHER = new LogTag(NativeAdContent.ViewTag.OTHER, 4, "Other");
    public static final LogTag HTTP_CLIENT = new LogTag("HTTP_CLIENT", 5, "HTTP Client");
    public static final LogTag QUEUE = new LogTag("QUEUE", 6, "Queue");
    public static final LogTag CACHE = new LogTag("CACHE", 7, "Cache");
    public static final LogTag PREFERENCES = new LogTag("PREFERENCES", 8, "Preferences");
    public static final LogTag REMOTE_CONTROL = new LogTag("REMOTE_CONTROL", 9, "CFG");
    public static final LogTag DDL = new LogTag("DDL", 10, "DDL");
    public static final LogTag REFERRER = new LogTag("REFERRER", 11, "Referrer");
    public static final LogTag META_REFERRER = new LogTag("META_REFERRER", 12, "Meta Referrer");
    public static final LogTag SAMSUNG_PRELOAD_REFERRER = new LogTag("SAMSUNG_PRELOAD_REFERRER", 13, "Samsung Preload Referrer");
    public static final LogTag ADVERTISING_ID = new LogTag("ADVERTISING_ID", 14, "Advertising Id");
    public static final LogTag CROSS_PROMOTION = new LogTag("CROSS_PROMOTION", 15, "Cross Promotion");
    public static final LogTag EXCEPTION_MANAGER = new LogTag("EXCEPTION_MANAGER", 16, "Exception Manager");
    public static final LogTag ATTRIBUTION = new LogTag("ATTRIBUTION", 17, "Attribution");
    public static final LogTag RD = new LogTag(PlayerKt.ICE_HOCKEY_RIGHT_DEFENSEMAN, 18, PlayerKt.ICE_HOCKEY_RIGHT_DEFENSEMAN);
    public static final LogTag ENGAGEMENT = new LogTag("ENGAGEMENT", 19, "Engagement");
    public static final LogTag ANTI_FRAUD = new LogTag("ANTI_FRAUD", 20, "Anti Fraud");
    public static final LogTag PUBLIC_API = new LogTag("PUBLIC_API", 21, "Public API");
    public static final LogTag AD_REVENUE = new LogTag("AD_REVENUE", 22, "Ad Revenue");
    public static final LogTag SDK_SETTERS = new LogTag("SDK_SETTERS", 23, "Setter");
    public static final LogTag PREDICT = new LogTag("PREDICT", 24, "Predict");
    public static final LogTag DEVICE_DATA = new LogTag("DEVICE_DATA", 25, "Device Data");
    public static final LogTag SECURITY = new LogTag("SECURITY", 26, "Security");
    public static final LogTag SECURITY_SDK = new LogTag("SECURITY_SDK", 27, "SIG_N");
    public static final LogTag GENERAL = new LogTag("GENERAL", 28, "General");
    public static final LogTag PREINSTALL = new LogTag("PREINSTALL", 29, "Preinstall");
    public static final LogTag UNINSTALL = new LogTag("UNINSTALL", 30, "Uninstall");
    public static final LogTag PURCHASE_VALIDATION = new LogTag("PURCHASE_VALIDATION", 31, "Purchase Validation");
    public static final LogTag DMA = new LogTag("DMA", 32, "DMA");
    public static final LogTag PROXY = new LogTag("PROXY", 33, "PROXY");
    public static final LogTag AF_EXECUTOR = new LogTag("AF_EXECUTOR", 34, "AF Executor");
    public static final LogTag APP_SET_ID = new LogTag("APP_SET_ID", 35, "App set ID");
    public static final LogTag RFR_INIT_PROVIDER = new LogTag("RFR_INIT_PROVIDER", 36, "Referrer_Init_Provider");
    public static final LogTag PLUGIN_BRIDGE = new LogTag("PLUGIN_BRIDGE", 37, "Plugin Bridge");

    private static final /* synthetic */ LogTag[] $values() {
        return new LogTag[]{INIT_BY_CONFIG, SDK_LIFECYCLE, GCD, PLAY_INTEGRITY_API, OTHER, HTTP_CLIENT, QUEUE, CACHE, PREFERENCES, REMOTE_CONTROL, DDL, REFERRER, META_REFERRER, SAMSUNG_PRELOAD_REFERRER, ADVERTISING_ID, CROSS_PROMOTION, EXCEPTION_MANAGER, ATTRIBUTION, RD, ENGAGEMENT, ANTI_FRAUD, PUBLIC_API, AD_REVENUE, SDK_SETTERS, PREDICT, DEVICE_DATA, SECURITY, SECURITY_SDK, GENERAL, PREINSTALL, UNINSTALL, PURCHASE_VALIDATION, DMA, PROXY, AF_EXECUTOR, APP_SET_ID, RFR_INIT_PROVIDER, PLUGIN_BRIDGE};
    }

    static {
        LogTag[] $values = $values();
        $VALUES = $values;
        $ENTRIES = gz8.G($values);
    }

    private LogTag(String str, int i, String str2) {
        this.tagName = str2;
    }

    @NotNull
    public static jp5 getEntries() {
        return $ENTRIES;
    }

    public static LogTag valueOf(String str) {
        return (LogTag) Enum.valueOf(LogTag.class, str);
    }

    public static LogTag[] values() {
        return (LogTag[]) $VALUES.clone();
    }

    @NotNull
    public final String getTagName() {
        return this.tagName;
    }
}
