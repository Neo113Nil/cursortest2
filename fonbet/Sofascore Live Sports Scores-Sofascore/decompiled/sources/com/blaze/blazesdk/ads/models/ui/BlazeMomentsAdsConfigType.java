package com.blaze.blazesdk.ads.models.ui;

import androidx.annotation.Keep;
import defpackage.gz8;
import defpackage.jp5;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Keep
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0087\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"Lcom/blaze/blazesdk/ads/models/ui/BlazeMomentsAdsConfigType;", "", "<init>", "(Ljava/lang/String;I)V", "FIRST_AVAILABLE_ADS_CONFIG", "EVERY_X_MOMENTS", "NONE", "blazesdk_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public final class BlazeMomentsAdsConfigType {
    private static final /* synthetic */ jp5 $ENTRIES;
    private static final /* synthetic */ BlazeMomentsAdsConfigType[] $VALUES;
    public static final BlazeMomentsAdsConfigType FIRST_AVAILABLE_ADS_CONFIG = new BlazeMomentsAdsConfigType("FIRST_AVAILABLE_ADS_CONFIG", 0);
    public static final BlazeMomentsAdsConfigType EVERY_X_MOMENTS = new BlazeMomentsAdsConfigType("EVERY_X_MOMENTS", 1);
    public static final BlazeMomentsAdsConfigType NONE = new BlazeMomentsAdsConfigType("NONE", 2);

    private static final /* synthetic */ BlazeMomentsAdsConfigType[] $values() {
        return new BlazeMomentsAdsConfigType[]{FIRST_AVAILABLE_ADS_CONFIG, EVERY_X_MOMENTS, NONE};
    }

    static {
        BlazeMomentsAdsConfigType[] $values = $values();
        $VALUES = $values;
        $ENTRIES = gz8.G($values);
    }

    private BlazeMomentsAdsConfigType(String str, int i) {
    }

    @NotNull
    public static jp5 getEntries() {
        return $ENTRIES;
    }

    public static BlazeMomentsAdsConfigType valueOf(String str) {
        return (BlazeMomentsAdsConfigType) Enum.valueOf(BlazeMomentsAdsConfigType.class, str);
    }

    public static BlazeMomentsAdsConfigType[] values() {
        return (BlazeMomentsAdsConfigType[]) $VALUES.clone();
    }
}
