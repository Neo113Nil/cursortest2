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
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0007\b\u0087\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007¨\u0006\b"}, d2 = {"Lcom/blaze/blazesdk/ads/models/ui/BlazeStoriesAdsConfigType;", "", "<init>", "(Ljava/lang/String;I)V", "FIRST_AVAILABLE_ADS_CONFIG", "EVERY_X_STORIES", "FIXED_PAGES_INDEX", "NONE", "blazesdk_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public final class BlazeStoriesAdsConfigType {
    private static final /* synthetic */ jp5 $ENTRIES;
    private static final /* synthetic */ BlazeStoriesAdsConfigType[] $VALUES;
    public static final BlazeStoriesAdsConfigType FIRST_AVAILABLE_ADS_CONFIG = new BlazeStoriesAdsConfigType("FIRST_AVAILABLE_ADS_CONFIG", 0);
    public static final BlazeStoriesAdsConfigType EVERY_X_STORIES = new BlazeStoriesAdsConfigType("EVERY_X_STORIES", 1);
    public static final BlazeStoriesAdsConfigType FIXED_PAGES_INDEX = new BlazeStoriesAdsConfigType("FIXED_PAGES_INDEX", 2);
    public static final BlazeStoriesAdsConfigType NONE = new BlazeStoriesAdsConfigType("NONE", 3);

    private static final /* synthetic */ BlazeStoriesAdsConfigType[] $values() {
        return new BlazeStoriesAdsConfigType[]{FIRST_AVAILABLE_ADS_CONFIG, EVERY_X_STORIES, FIXED_PAGES_INDEX, NONE};
    }

    static {
        BlazeStoriesAdsConfigType[] $values = $values();
        $VALUES = $values;
        $ENTRIES = gz8.G($values);
    }

    private BlazeStoriesAdsConfigType(String str, int i) {
    }

    @NotNull
    public static jp5 getEntries() {
        return $ENTRIES;
    }

    public static BlazeStoriesAdsConfigType valueOf(String str) {
        return (BlazeStoriesAdsConfigType) Enum.valueOf(BlazeStoriesAdsConfigType.class, str);
    }

    public static BlazeStoriesAdsConfigType[] values() {
        return (BlazeStoriesAdsConfigType[]) $VALUES.clone();
    }
}
