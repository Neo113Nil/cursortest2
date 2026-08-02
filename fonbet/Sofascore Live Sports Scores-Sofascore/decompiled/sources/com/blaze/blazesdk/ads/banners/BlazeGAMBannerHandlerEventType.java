package com.blaze.blazesdk.ads.banners;

import androidx.annotation.Keep;
import com.blaze.blazesdk.analytics.enums.EventActionName;
import defpackage.gz8;
import defpackage.jp5;
import defpackage.kvl;
import defpackage.zzl;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Keep
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\b\u0087\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0006\u0010\b\u001a\u00020\tj\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007¨\u0006\n"}, d2 = {"Lcom/blaze/blazesdk/ads/banners/BlazeGAMBannerHandlerEventType;", "", "<init>", "(Ljava/lang/String;I)V", "AD_LOADED", "AD_CLICKED", "AD_IMPRESSION", "AD_REQUESTED", "toAnalyticEventActionName", "Lcom/blaze/blazesdk/analytics/enums/EventActionName;", "blazesdk_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public final class BlazeGAMBannerHandlerEventType {
    private static final /* synthetic */ jp5 $ENTRIES;
    private static final /* synthetic */ BlazeGAMBannerHandlerEventType[] $VALUES;
    public static final BlazeGAMBannerHandlerEventType AD_LOADED = new BlazeGAMBannerHandlerEventType("AD_LOADED", 0);
    public static final BlazeGAMBannerHandlerEventType AD_CLICKED = new BlazeGAMBannerHandlerEventType("AD_CLICKED", 1);
    public static final BlazeGAMBannerHandlerEventType AD_IMPRESSION = new BlazeGAMBannerHandlerEventType("AD_IMPRESSION", 2);
    public static final BlazeGAMBannerHandlerEventType AD_REQUESTED = new BlazeGAMBannerHandlerEventType("AD_REQUESTED", 3);

    private static final /* synthetic */ BlazeGAMBannerHandlerEventType[] $values() {
        return new BlazeGAMBannerHandlerEventType[]{AD_LOADED, AD_CLICKED, AD_IMPRESSION, AD_REQUESTED};
    }

    static {
        BlazeGAMBannerHandlerEventType[] $values = $values();
        $VALUES = $values;
        $ENTRIES = gz8.G($values);
    }

    private BlazeGAMBannerHandlerEventType(String str, int i) {
    }

    @NotNull
    public static jp5 getEntries() {
        return $ENTRIES;
    }

    public static BlazeGAMBannerHandlerEventType valueOf(String str) {
        return (BlazeGAMBannerHandlerEventType) Enum.valueOf(BlazeGAMBannerHandlerEventType.class, str);
    }

    public static BlazeGAMBannerHandlerEventType[] values() {
        return (BlazeGAMBannerHandlerEventType[]) $VALUES.clone();
    }

    @NotNull
    public final EventActionName toAnalyticEventActionName() {
        int i = kvl.a[ordinal()];
        if (i == 1) {
            return EventActionName.BANNER_AD_LOAD;
        }
        if (i == 2) {
            return EventActionName.BANNER_AD_CLICK;
        }
        if (i == 3) {
            return EventActionName.BANNER_AD_VIEW;
        }
        if (i == 4) {
            return EventActionName.BANNER_AD_REQUESTED;
        }
        zzl.b();
        return null;
    }
}
