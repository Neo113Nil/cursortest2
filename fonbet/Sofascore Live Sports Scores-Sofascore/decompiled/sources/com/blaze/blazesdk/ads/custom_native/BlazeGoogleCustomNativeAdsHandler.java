package com.blaze.blazesdk.ads.custom_native;

import androidx.annotation.Keep;
import com.blaze.blazesdk.ads.custom_native.models.BlazeAdRequestData;
import com.blaze.blazesdk.ads.custom_native.models.BlazeGoogleCustomNativeAdModel;
import defpackage.gz8;
import defpackage.jp5;
import defpackage.rq3;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Keep
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bg\u0018\u00002\u00020\u0001:\u0001\rJ\u001f\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H&¢\u0006\u0004\b\u0007\u0010\bJ\u001a\u0010\u000b\u001a\u0004\u0018\u00010\u00042\u0006\u0010\n\u001a\u00020\tH¦@¢\u0006\u0004\b\u000b\u0010\fø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u000eÀ\u0006\u0001"}, d2 = {"Lcom/blaze/blazesdk/ads/custom_native/BlazeGoogleCustomNativeAdsHandler;", "", "Lcom/blaze/blazesdk/ads/custom_native/BlazeGoogleCustomNativeAdsHandler$EventType;", "eventType", "Lcom/blaze/blazesdk/ads/custom_native/models/BlazeGoogleCustomNativeAdModel;", "adModel", "", "onAdEvent", "(Lcom/blaze/blazesdk/ads/custom_native/BlazeGoogleCustomNativeAdsHandler$EventType;Lcom/blaze/blazesdk/ads/custom_native/models/BlazeGoogleCustomNativeAdModel;)V", "Lcom/blaze/blazesdk/ads/custom_native/models/BlazeAdRequestData;", "adRequestData", "provideAd", "(Lcom/blaze/blazesdk/ads/custom_native/models/BlazeAdRequestData;Lrq3;)Ljava/lang/Object;", "EventType", "blazesdk_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public interface BlazeGoogleCustomNativeAdsHandler {

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    @Keep
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\f\b\u0087\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\f¨\u0006\r"}, d2 = {"Lcom/blaze/blazesdk/ads/custom_native/BlazeGoogleCustomNativeAdsHandler$EventType;", "", "<init>", "(Ljava/lang/String;I)V", "OPENED_AD", "AD_PAGE_START", "AD_PAGE_FIRST_QUARTER", "AD_PAGE_THIRD", "AD_PAGE_MID", "AD_PAGE_COMPLETE", "PAUSED_AD_PAGE", "RESUMED_AD_PAGE", "CTA_CLICKED", "blazesdk_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class EventType {
        private static final /* synthetic */ jp5 $ENTRIES;
        private static final /* synthetic */ EventType[] $VALUES;
        public static final EventType OPENED_AD = new EventType("OPENED_AD", 0);
        public static final EventType AD_PAGE_START = new EventType("AD_PAGE_START", 1);
        public static final EventType AD_PAGE_FIRST_QUARTER = new EventType("AD_PAGE_FIRST_QUARTER", 2);
        public static final EventType AD_PAGE_THIRD = new EventType("AD_PAGE_THIRD", 3);
        public static final EventType AD_PAGE_MID = new EventType("AD_PAGE_MID", 4);
        public static final EventType AD_PAGE_COMPLETE = new EventType("AD_PAGE_COMPLETE", 5);
        public static final EventType PAUSED_AD_PAGE = new EventType("PAUSED_AD_PAGE", 6);
        public static final EventType RESUMED_AD_PAGE = new EventType("RESUMED_AD_PAGE", 7);
        public static final EventType CTA_CLICKED = new EventType("CTA_CLICKED", 8);

        private static final /* synthetic */ EventType[] $values() {
            return new EventType[]{OPENED_AD, AD_PAGE_START, AD_PAGE_FIRST_QUARTER, AD_PAGE_THIRD, AD_PAGE_MID, AD_PAGE_COMPLETE, PAUSED_AD_PAGE, RESUMED_AD_PAGE, CTA_CLICKED};
        }

        static {
            EventType[] $values = $values();
            $VALUES = $values;
            $ENTRIES = gz8.G($values);
        }

        private EventType(String str, int i) {
        }

        @NotNull
        public static jp5 getEntries() {
            return $ENTRIES;
        }

        public static EventType valueOf(String str) {
            return (EventType) Enum.valueOf(EventType.class, str);
        }

        public static EventType[] values() {
            return (EventType[]) $VALUES.clone();
        }
    }

    void onAdEvent(@NotNull EventType eventType, @NotNull BlazeGoogleCustomNativeAdModel adModel);

    @Nullable
    Object provideAd(@NotNull BlazeAdRequestData blazeAdRequestData, @NotNull rq3<? super BlazeGoogleCustomNativeAdModel> rq3Var);
}
