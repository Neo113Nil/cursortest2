package com.vungle.ads.internal;

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Metadata(bv = {}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0003\u001a\u00020\u00028\u0006X\u0087D¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004¨\u0006\u0007"}, d2 = {"Lcom/vungle/ads/internal/Constants;", "", "", "DEFAULT_ADS_ENDPOINT", "Ljava/lang/String;", "<init>", "()V", "vungle-ads_release"}, k = 1, mv = {1, 7, 1})
/* loaded from: classes6.dex */
public final class Constants {

    @NotNull
    public static final Constants INSTANCE = new Constants();

    @NotNull
    public static final String DEFAULT_ADS_ENDPOINT = "https://adx.ads.vungle.com/api/v7/ads";
    public static final String a = "https://adx.ads.vungle.com/api/v7/csb";
    public static final String b = "https://logs.ads.vungle.com/sdk/error_logs";
    public static final String c = "https://logs.ads.vungle.com/sdk/metrics";

    private Constants() {
    }
}
