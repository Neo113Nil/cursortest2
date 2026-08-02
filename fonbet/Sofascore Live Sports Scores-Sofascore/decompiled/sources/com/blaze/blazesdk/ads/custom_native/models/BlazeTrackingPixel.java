package com.blaze.blazesdk.ads.custom_native.models;

import androidx.annotation.Keep;
import defpackage.dmi;
import defpackage.gz8;
import defpackage.jp5;
import defpackage.lnb;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Keep
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u001aB+\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\tJ\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\u000f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0003J\u000b\u0010\u0012\u001a\u0004\u0018\u00010\u0006HÆ\u0003J/\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006HÆ\u0001J\u0013\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0017\u001a\u00020\u0018HÖ\u0001J\t\u0010\u0019\u001a\u00020\u0006HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0017\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u001b"}, d2 = {"Lcom/blaze/blazesdk/ads/custom_native/models/BlazeTrackingPixel;", "", "eventType", "Lcom/blaze/blazesdk/ads/custom_native/models/BlazeTrackingPixel$PixelAdsEvents;", "urls", "", "", "customUserAgent", "<init>", "(Lcom/blaze/blazesdk/ads/custom_native/models/BlazeTrackingPixel$PixelAdsEvents;Ljava/util/List;Ljava/lang/String;)V", "getEventType", "()Lcom/blaze/blazesdk/ads/custom_native/models/BlazeTrackingPixel$PixelAdsEvents;", "getUrls", "()Ljava/util/List;", "getCustomUserAgent", "()Ljava/lang/String;", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "PixelAdsEvents", "blazesdk_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public final /* data */ class BlazeTrackingPixel {
    public static final int $stable = 8;

    @Nullable
    private final String customUserAgent;

    @NotNull
    private final PixelAdsEvents eventType;

    @NotNull
    private final List<String> urls;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    @Keep
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\f\b\u0087\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\f¨\u0006\r"}, d2 = {"Lcom/blaze/blazesdk/ads/custom_native/models/BlazeTrackingPixel$PixelAdsEvents;", "", "<init>", "(Ljava/lang/String;I)V", "OPENED_AD", "AD_PAGE_START", "AD_PAGE_FIRST_QUARTER", "AD_PAGE_MID", "AD_PAGE_THIRD", "AD_PAGE_COMPLETE", "PAUSED_AD_PAGE", "RESUMED_AD_PAGE", "CTA_CLICKED", "blazesdk_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class PixelAdsEvents {
        private static final /* synthetic */ jp5 $ENTRIES;
        private static final /* synthetic */ PixelAdsEvents[] $VALUES;
        public static final PixelAdsEvents OPENED_AD = new PixelAdsEvents("OPENED_AD", 0);
        public static final PixelAdsEvents AD_PAGE_START = new PixelAdsEvents("AD_PAGE_START", 1);
        public static final PixelAdsEvents AD_PAGE_FIRST_QUARTER = new PixelAdsEvents("AD_PAGE_FIRST_QUARTER", 2);
        public static final PixelAdsEvents AD_PAGE_MID = new PixelAdsEvents("AD_PAGE_MID", 3);
        public static final PixelAdsEvents AD_PAGE_THIRD = new PixelAdsEvents("AD_PAGE_THIRD", 4);
        public static final PixelAdsEvents AD_PAGE_COMPLETE = new PixelAdsEvents("AD_PAGE_COMPLETE", 5);
        public static final PixelAdsEvents PAUSED_AD_PAGE = new PixelAdsEvents("PAUSED_AD_PAGE", 6);
        public static final PixelAdsEvents RESUMED_AD_PAGE = new PixelAdsEvents("RESUMED_AD_PAGE", 7);
        public static final PixelAdsEvents CTA_CLICKED = new PixelAdsEvents("CTA_CLICKED", 8);

        private static final /* synthetic */ PixelAdsEvents[] $values() {
            return new PixelAdsEvents[]{OPENED_AD, AD_PAGE_START, AD_PAGE_FIRST_QUARTER, AD_PAGE_MID, AD_PAGE_THIRD, AD_PAGE_COMPLETE, PAUSED_AD_PAGE, RESUMED_AD_PAGE, CTA_CLICKED};
        }

        static {
            PixelAdsEvents[] $values = $values();
            $VALUES = $values;
            $ENTRIES = gz8.G($values);
        }

        private PixelAdsEvents(String str, int i) {
        }

        @NotNull
        public static jp5 getEntries() {
            return $ENTRIES;
        }

        public static PixelAdsEvents valueOf(String str) {
            return (PixelAdsEvents) Enum.valueOf(PixelAdsEvents.class, str);
        }

        public static PixelAdsEvents[] values() {
            return (PixelAdsEvents[]) $VALUES.clone();
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @Keep
    public BlazeTrackingPixel(@NotNull PixelAdsEvents pixelAdsEvents, @NotNull List<String> list) {
        this(pixelAdsEvents, list, null, 4, null);
        pixelAdsEvents.getClass();
        list.getClass();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ BlazeTrackingPixel copy$default(BlazeTrackingPixel blazeTrackingPixel, PixelAdsEvents pixelAdsEvents, List list, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            pixelAdsEvents = blazeTrackingPixel.eventType;
        }
        if ((i & 2) != 0) {
            list = blazeTrackingPixel.urls;
        }
        if ((i & 4) != 0) {
            str = blazeTrackingPixel.customUserAgent;
        }
        return blazeTrackingPixel.copy(pixelAdsEvents, list, str);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final PixelAdsEvents getEventType() {
        return this.eventType;
    }

    @NotNull
    public final List<String> component2() {
        return this.urls;
    }

    @Nullable
    /* renamed from: component3, reason: from getter */
    public final String getCustomUserAgent() {
        return this.customUserAgent;
    }

    @NotNull
    public final BlazeTrackingPixel copy(@NotNull PixelAdsEvents eventType, @NotNull List<String> urls, @Nullable String customUserAgent) {
        eventType.getClass();
        urls.getClass();
        return new BlazeTrackingPixel(eventType, urls, customUserAgent);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof BlazeTrackingPixel)) {
            return false;
        }
        BlazeTrackingPixel blazeTrackingPixel = (BlazeTrackingPixel) other;
        return this.eventType == blazeTrackingPixel.eventType && Intrinsics.c(this.urls, blazeTrackingPixel.urls) && Intrinsics.c(this.customUserAgent, blazeTrackingPixel.customUserAgent);
    }

    @Nullable
    public final String getCustomUserAgent() {
        return this.customUserAgent;
    }

    @NotNull
    public final PixelAdsEvents getEventType() {
        return this.eventType;
    }

    @NotNull
    public final List<String> getUrls() {
        return this.urls;
    }

    public int hashCode() {
        int d = dmi.d(this.eventType.hashCode() * 31, 31, this.urls);
        String str = this.customUserAgent;
        return d + (str == null ? 0 : str.hashCode());
    }

    @NotNull
    public String toString() {
        StringBuilder sb = new StringBuilder("BlazeTrackingPixel(eventType=");
        sb.append(this.eventType);
        sb.append(", urls=");
        sb.append(this.urls);
        sb.append(", customUserAgent=");
        return lnb.q(sb, this.customUserAgent, ')');
    }

    @Keep
    public BlazeTrackingPixel(@NotNull PixelAdsEvents pixelAdsEvents, @NotNull List<String> list, @Nullable String str) {
        pixelAdsEvents.getClass();
        list.getClass();
        this.eventType = pixelAdsEvents;
        this.urls = list;
        this.customUserAgent = str;
    }

    public /* synthetic */ BlazeTrackingPixel(PixelAdsEvents pixelAdsEvents, List list, String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(pixelAdsEvents, list, (i & 4) != 0 ? null : str);
    }
}
