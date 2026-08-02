package com.blaze.blazesdk.ads.ima;

import androidx.annotation.Keep;
import com.ironsource.U3;
import defpackage.gz8;
import defpackage.jp5;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Keep
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0012\b\u0087\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013j\u0002\b\u0014¨\u0006\u0015"}, d2 = {"Lcom/blaze/blazesdk/ads/ima/BlazeIMAHandlerEventType;", "", U3.i.X, "", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "getValue", "()Ljava/lang/String;", "ALL_ADS_COMPLETED", "AD_CLICKED", "AD_COMPLETED", "AD_LOADED", "AD_PAUSED", "AD_RESUMED", "AD_SKIPPED", "AD_STARTED", "AD_TAPPED", "AD_FIRST_QUARTILE", "AD_MIDPOINT", "AD_THIRD_QUARTILE", "AD_REQUESTED", "blazesdk_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public final class BlazeIMAHandlerEventType {
    private static final /* synthetic */ jp5 $ENTRIES;
    private static final /* synthetic */ BlazeIMAHandlerEventType[] $VALUES;

    @NotNull
    private final String value;
    public static final BlazeIMAHandlerEventType ALL_ADS_COMPLETED = new BlazeIMAHandlerEventType("ALL_ADS_COMPLETED", 0, "ima_all_ads_completed");
    public static final BlazeIMAHandlerEventType AD_CLICKED = new BlazeIMAHandlerEventType("AD_CLICKED", 1, "ima_ad_clicked");
    public static final BlazeIMAHandlerEventType AD_COMPLETED = new BlazeIMAHandlerEventType("AD_COMPLETED", 2, "ima_ad_completed");
    public static final BlazeIMAHandlerEventType AD_LOADED = new BlazeIMAHandlerEventType("AD_LOADED", 3, "ima_ad_loaded");
    public static final BlazeIMAHandlerEventType AD_PAUSED = new BlazeIMAHandlerEventType("AD_PAUSED", 4, "ima_ad_paused");
    public static final BlazeIMAHandlerEventType AD_RESUMED = new BlazeIMAHandlerEventType("AD_RESUMED", 5, "ima_ad_resumed");
    public static final BlazeIMAHandlerEventType AD_SKIPPED = new BlazeIMAHandlerEventType("AD_SKIPPED", 6, "ima_ad_skipped");
    public static final BlazeIMAHandlerEventType AD_STARTED = new BlazeIMAHandlerEventType("AD_STARTED", 7, "ima_ad_started");
    public static final BlazeIMAHandlerEventType AD_TAPPED = new BlazeIMAHandlerEventType("AD_TAPPED", 8, "ima_ad_tapped");
    public static final BlazeIMAHandlerEventType AD_FIRST_QUARTILE = new BlazeIMAHandlerEventType("AD_FIRST_QUARTILE", 9, "ima_ad_first_quartile");
    public static final BlazeIMAHandlerEventType AD_MIDPOINT = new BlazeIMAHandlerEventType("AD_MIDPOINT", 10, "ima_ad_midpoint");
    public static final BlazeIMAHandlerEventType AD_THIRD_QUARTILE = new BlazeIMAHandlerEventType("AD_THIRD_QUARTILE", 11, "ima_ad_third_quartile");
    public static final BlazeIMAHandlerEventType AD_REQUESTED = new BlazeIMAHandlerEventType("AD_REQUESTED", 12, "ima_ad_requested");

    private static final /* synthetic */ BlazeIMAHandlerEventType[] $values() {
        return new BlazeIMAHandlerEventType[]{ALL_ADS_COMPLETED, AD_CLICKED, AD_COMPLETED, AD_LOADED, AD_PAUSED, AD_RESUMED, AD_SKIPPED, AD_STARTED, AD_TAPPED, AD_FIRST_QUARTILE, AD_MIDPOINT, AD_THIRD_QUARTILE, AD_REQUESTED};
    }

    static {
        BlazeIMAHandlerEventType[] $values = $values();
        $VALUES = $values;
        $ENTRIES = gz8.G($values);
    }

    private BlazeIMAHandlerEventType(String str, int i, String str2) {
        this.value = str2;
    }

    @NotNull
    public static jp5 getEntries() {
        return $ENTRIES;
    }

    public static BlazeIMAHandlerEventType valueOf(String str) {
        return (BlazeIMAHandlerEventType) Enum.valueOf(BlazeIMAHandlerEventType.class, str);
    }

    public static BlazeIMAHandlerEventType[] values() {
        return (BlazeIMAHandlerEventType[]) $VALUES.clone();
    }

    @NotNull
    public final String getValue() {
        return this.value;
    }
}
