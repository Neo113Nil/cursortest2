package com.blaze.blazesdk.ads.custom_native.models;

import androidx.annotation.Keep;
import com.ironsource.U3;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import com.mbridge.msdk.playercommon.exoplayer2.text.ttml.TtmlNode;
import com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer;
import defpackage.gz8;
import defpackage.jp5;
import defpackage.lnb;
import defpackage.o6a;
import defpackage.rm5;
import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Keep
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b%\b\u0087\b\u0018\u00002\u00020\u0001:\u0003EFGBQ\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\u000e\b\u0002\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0001\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0012\u0010\u0012\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u0012\u0010\u0013J\u0012\u0010\u0014\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b\u0014\u0010\u0015J\u0016\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\t0\bHÆ\u0003¢\u0006\u0004\b\u0016\u0010\u0017J\u0012\u0010\u0018\u001a\u0004\u0018\u00010\u0001HÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0019J\u0012\u0010\u001a\u001a\u0004\u0018\u00010\fHÆ\u0003¢\u0006\u0004\b\u001a\u0010\u001bJZ\u0010\u001c\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u000e\b\u0002\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\fHÆ\u0001¢\u0006\u0004\b\u001c\u0010\u001dJ\u0010\u0010\u001e\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u001e\u0010\u0013J\u0010\u0010 \u001a\u00020\u001fHÖ\u0001¢\u0006\u0004\b \u0010!J\u001a\u0010$\u001a\u00020#2\b\u0010\"\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b$\u0010%R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010&\u001a\u0004\b'\u0010\u0011R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010(\u001a\u0004\b)\u0010\u0013R\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010*\u001a\u0004\b+\u0010\u0015R(\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\n\u0010,\u001a\u0004\b-\u0010\u0017\"\u0004\b.\u0010/R$\u0010\u000b\u001a\u0004\u0018\u00010\u00018\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000b\u00100\u001a\u0004\b1\u0010\u0019\"\u0004\b2\u00103R\u0019\u0010\r\u001a\u0004\u0018\u00010\f8\u0006¢\u0006\f\n\u0004\b\r\u00104\u001a\u0004\b5\u0010\u001bR\"\u00106\u001a\u00020#8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b6\u00107\u001a\u0004\b6\u00108\"\u0004\b9\u0010:R$\u0010;\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b;\u0010(\u001a\u0004\b<\u0010\u0013\"\u0004\b=\u0010>R$\u0010?\u001a\u0004\u0018\u00010\u001f8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b?\u0010@\u001a\u0004\bA\u0010B\"\u0004\bC\u0010D¨\u0006H"}, d2 = {"Lcom/blaze/blazesdk/ads/custom_native/models/BlazeGoogleCustomNativeAdModel;", "", "Lcom/blaze/blazesdk/ads/custom_native/models/BlazeGoogleCustomNativeAdModel$Content;", HandleInvocationsFromAdViewer.KEY_PRIVACY_UPDATE_CONTENT, "", "title", "Lcom/blaze/blazesdk/ads/custom_native/models/BlazeGoogleCustomNativeAdModel$CtaModel;", U3.i.G0, "", "Lcom/blaze/blazesdk/ads/custom_native/models/BlazeTrackingPixel;", "trackingPixelAdList", "customAdditionalData", "Lcom/blaze/blazesdk/ads/custom_native/models/BlazeGoogleCustomNativeAdModel$AnalyticsData;", "analyticsData", "<init>", "(Lcom/blaze/blazesdk/ads/custom_native/models/BlazeGoogleCustomNativeAdModel$Content;Ljava/lang/String;Lcom/blaze/blazesdk/ads/custom_native/models/BlazeGoogleCustomNativeAdModel$CtaModel;Ljava/util/Set;Ljava/lang/Object;Lcom/blaze/blazesdk/ads/custom_native/models/BlazeGoogleCustomNativeAdModel$AnalyticsData;)V", "component1", "()Lcom/blaze/blazesdk/ads/custom_native/models/BlazeGoogleCustomNativeAdModel$Content;", "component2", "()Ljava/lang/String;", "component3", "()Lcom/blaze/blazesdk/ads/custom_native/models/BlazeGoogleCustomNativeAdModel$CtaModel;", "component4", "()Ljava/util/Set;", "component5", "()Ljava/lang/Object;", "component6", "()Lcom/blaze/blazesdk/ads/custom_native/models/BlazeGoogleCustomNativeAdModel$AnalyticsData;", "copy", "(Lcom/blaze/blazesdk/ads/custom_native/models/BlazeGoogleCustomNativeAdModel$Content;Ljava/lang/String;Lcom/blaze/blazesdk/ads/custom_native/models/BlazeGoogleCustomNativeAdModel$CtaModel;Ljava/util/Set;Ljava/lang/Object;Lcom/blaze/blazesdk/ads/custom_native/models/BlazeGoogleCustomNativeAdModel$AnalyticsData;)Lcom/blaze/blazesdk/ads/custom_native/models/BlazeGoogleCustomNativeAdModel;", "toString", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lcom/blaze/blazesdk/ads/custom_native/models/BlazeGoogleCustomNativeAdModel$Content;", "getContent", "Ljava/lang/String;", "getTitle", "Lcom/blaze/blazesdk/ads/custom_native/models/BlazeGoogleCustomNativeAdModel$CtaModel;", "getCta", "Ljava/util/Set;", "getTrackingPixelAdList", "setTrackingPixelAdList", "(Ljava/util/Set;)V", "Ljava/lang/Object;", "getCustomAdditionalData", "setCustomAdditionalData", "(Ljava/lang/Object;)V", "Lcom/blaze/blazesdk/ads/custom_native/models/BlazeGoogleCustomNativeAdModel$AnalyticsData;", "getAnalyticsData", "isValid", "Z", "()Z", "setValid", "(Z)V", "adInsertionLogicForAnalytics", "getAdInsertionLogicForAnalytics", "setAdInsertionLogicForAnalytics", "(Ljava/lang/String;)V", "adIndex", "Ljava/lang/Integer;", "getAdIndex", "()Ljava/lang/Integer;", "setAdIndex", "(Ljava/lang/Integer;)V", "Content", "AnalyticsData", "CtaModel", "blazesdk_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public final /* data */ class BlazeGoogleCustomNativeAdModel {
    public static final int $stable = 8;

    @Nullable
    private Integer adIndex;

    @Nullable
    private String adInsertionLogicForAnalytics;

    @Nullable
    private final AnalyticsData analyticsData;

    @NotNull
    private final Content content;

    @Nullable
    private final CtaModel cta;

    @Nullable
    private Object customAdditionalData;
    private boolean isValid;

    @Nullable
    private final String title;

    @NotNull
    private Set<BlazeTrackingPixel> trackingPixelAdList;

    public BlazeGoogleCustomNativeAdModel(Content content, String str, CtaModel ctaModel, Set set, Object obj, AnalyticsData analyticsData, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(content, (i & 2) != 0 ? null : str, (i & 4) != 0 ? null : ctaModel, (i & 8) != 0 ? rm5.a : set, (i & 16) != 0 ? null : obj, (i & 32) != 0 ? null : analyticsData);
    }

    public static /* synthetic */ BlazeGoogleCustomNativeAdModel copy$default(BlazeGoogleCustomNativeAdModel blazeGoogleCustomNativeAdModel, Content content, String str, CtaModel ctaModel, Set set, Object obj, AnalyticsData analyticsData, int i, Object obj2) {
        if ((i & 1) != 0) {
            content = blazeGoogleCustomNativeAdModel.content;
        }
        if ((i & 2) != 0) {
            str = blazeGoogleCustomNativeAdModel.title;
        }
        if ((i & 4) != 0) {
            ctaModel = blazeGoogleCustomNativeAdModel.cta;
        }
        if ((i & 8) != 0) {
            set = blazeGoogleCustomNativeAdModel.trackingPixelAdList;
        }
        if ((i & 16) != 0) {
            obj = blazeGoogleCustomNativeAdModel.customAdditionalData;
        }
        if ((i & 32) != 0) {
            analyticsData = blazeGoogleCustomNativeAdModel.analyticsData;
        }
        Object obj3 = obj;
        AnalyticsData analyticsData2 = analyticsData;
        return blazeGoogleCustomNativeAdModel.copy(content, str, ctaModel, set, obj3, analyticsData2);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final Content getContent() {
        return this.content;
    }

    @Nullable
    /* renamed from: component2, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    @Nullable
    /* renamed from: component3, reason: from getter */
    public final CtaModel getCta() {
        return this.cta;
    }

    @NotNull
    public final Set<BlazeTrackingPixel> component4() {
        return this.trackingPixelAdList;
    }

    @Nullable
    /* renamed from: component5, reason: from getter */
    public final Object getCustomAdditionalData() {
        return this.customAdditionalData;
    }

    @Nullable
    /* renamed from: component6, reason: from getter */
    public final AnalyticsData getAnalyticsData() {
        return this.analyticsData;
    }

    @NotNull
    public final BlazeGoogleCustomNativeAdModel copy(@NotNull Content content, @Nullable String title, @Nullable CtaModel cta, @NotNull Set<BlazeTrackingPixel> trackingPixelAdList, @Nullable Object customAdditionalData, @Nullable AnalyticsData analyticsData) {
        content.getClass();
        trackingPixelAdList.getClass();
        return new BlazeGoogleCustomNativeAdModel(content, title, cta, trackingPixelAdList, customAdditionalData, analyticsData);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof BlazeGoogleCustomNativeAdModel)) {
            return false;
        }
        BlazeGoogleCustomNativeAdModel blazeGoogleCustomNativeAdModel = (BlazeGoogleCustomNativeAdModel) other;
        return Intrinsics.c(this.content, blazeGoogleCustomNativeAdModel.content) && Intrinsics.c(this.title, blazeGoogleCustomNativeAdModel.title) && Intrinsics.c(this.cta, blazeGoogleCustomNativeAdModel.cta) && Intrinsics.c(this.trackingPixelAdList, blazeGoogleCustomNativeAdModel.trackingPixelAdList) && Intrinsics.c(this.customAdditionalData, blazeGoogleCustomNativeAdModel.customAdditionalData) && Intrinsics.c(this.analyticsData, blazeGoogleCustomNativeAdModel.analyticsData);
    }

    @Nullable
    public final Integer getAdIndex() {
        return this.adIndex;
    }

    @Nullable
    public final String getAdInsertionLogicForAnalytics() {
        return this.adInsertionLogicForAnalytics;
    }

    @Nullable
    public final AnalyticsData getAnalyticsData() {
        return this.analyticsData;
    }

    @NotNull
    public final Content getContent() {
        return this.content;
    }

    @Nullable
    public final CtaModel getCta() {
        return this.cta;
    }

    @Nullable
    public final Object getCustomAdditionalData() {
        return this.customAdditionalData;
    }

    @Nullable
    public final String getTitle() {
        return this.title;
    }

    @NotNull
    public final Set<BlazeTrackingPixel> getTrackingPixelAdList() {
        return this.trackingPixelAdList;
    }

    public int hashCode() {
        int hashCode = this.content.hashCode() * 31;
        String str = this.title;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        CtaModel ctaModel = this.cta;
        int hashCode3 = (this.trackingPixelAdList.hashCode() + ((hashCode2 + (ctaModel == null ? 0 : ctaModel.hashCode())) * 31)) * 31;
        Object obj = this.customAdditionalData;
        int hashCode4 = (hashCode3 + (obj == null ? 0 : obj.hashCode())) * 31;
        AnalyticsData analyticsData = this.analyticsData;
        return hashCode4 + (analyticsData != null ? analyticsData.hashCode() : 0);
    }

    /* renamed from: isValid, reason: from getter */
    public final boolean getIsValid() {
        return this.isValid;
    }

    public final void setAdIndex(@Nullable Integer num) {
        this.adIndex = num;
    }

    public final void setAdInsertionLogicForAnalytics(@Nullable String str) {
        this.adInsertionLogicForAnalytics = str;
    }

    public final void setCustomAdditionalData(@Nullable Object obj) {
        this.customAdditionalData = obj;
    }

    public final void setTrackingPixelAdList(@NotNull Set<BlazeTrackingPixel> set) {
        set.getClass();
        this.trackingPixelAdList = set;
    }

    public final void setValid(boolean z) {
        this.isValid = z;
    }

    @NotNull
    public String toString() {
        return "BlazeGoogleCustomNativeAdModel(content=" + this.content + ", title=" + this.title + ", cta=" + this.cta + ", trackingPixelAdList=" + this.trackingPixelAdList + ", customAdditionalData=" + this.customAdditionalData + ", analyticsData=" + this.analyticsData + ')';
    }

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    @Keep
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0002\u0006\u0007¨\u0006\b"}, d2 = {"Lcom/blaze/blazesdk/ads/custom_native/models/BlazeGoogleCustomNativeAdModel$Content;", "", "<init>", "()V", "Image", "Video", "Lcom/blaze/blazesdk/ads/custom_native/models/BlazeGoogleCustomNativeAdModel$Content$Image;", "Lcom/blaze/blazesdk/ads/custom_native/models/BlazeGoogleCustomNativeAdModel$Content$Video;", "blazesdk_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static abstract class Content {
        public static final int $stable = 0;

        /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
        @Keep
        @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0006\n\u0002\b\n\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0016"}, d2 = {"Lcom/blaze/blazesdk/ads/custom_native/models/BlazeGoogleCustomNativeAdModel$Content$Image;", "Lcom/blaze/blazesdk/ads/custom_native/models/BlazeGoogleCustomNativeAdModel$Content;", "urlString", "", IronSourceConstants.EVENTS_DURATION, "", "<init>", "(Ljava/lang/String;D)V", "getUrlString", "()Ljava/lang/String;", "getDuration", "()D", "component1", "component2", "copy", "equals", "", "other", "", "hashCode", "", "toString", "blazesdk_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final /* data */ class Image extends Content {
            public static final int $stable = 0;
            private final double duration;

            @NotNull
            private final String urlString;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public Image(@NotNull String str, double d) {
                super(null);
                str.getClass();
                this.urlString = str;
                this.duration = d;
            }

            public static /* synthetic */ Image copy$default(Image image, String str, double d, int i, Object obj) {
                if ((i & 1) != 0) {
                    str = image.urlString;
                }
                if ((i & 2) != 0) {
                    d = image.duration;
                }
                return image.copy(str, d);
            }

            @NotNull
            /* renamed from: component1, reason: from getter */
            public final String getUrlString() {
                return this.urlString;
            }

            /* renamed from: component2, reason: from getter */
            public final double getDuration() {
                return this.duration;
            }

            @NotNull
            public final Image copy(@NotNull String urlString, double duration) {
                urlString.getClass();
                return new Image(urlString, duration);
            }

            public boolean equals(@Nullable Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof Image)) {
                    return false;
                }
                Image image = (Image) other;
                return Intrinsics.c(this.urlString, image.urlString) && Double.compare(this.duration, image.duration) == 0;
            }

            public final double getDuration() {
                return this.duration;
            }

            @NotNull
            public final String getUrlString() {
                return this.urlString;
            }

            public int hashCode() {
                return Double.hashCode(this.duration) + (this.urlString.hashCode() * 31);
            }

            @NotNull
            public String toString() {
                return "Image(urlString=" + this.urlString + ", duration=" + this.duration + ')';
            }
        }

        /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
        @Keep
        @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u000b\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u001f\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010HÖ\u0003J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001J\t\u0010\u0013\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\b¨\u0006\u0014"}, d2 = {"Lcom/blaze/blazesdk/ads/custom_native/models/BlazeGoogleCustomNativeAdModel$Content$Video;", "Lcom/blaze/blazesdk/ads/custom_native/models/BlazeGoogleCustomNativeAdModel$Content;", "urlString", "", "loadingImageUrl", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "getUrlString", "()Ljava/lang/String;", "getLoadingImageUrl", "component1", "component2", "copy", "equals", "", "other", "", "hashCode", "", "toString", "blazesdk_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final /* data */ class Video extends Content {
            public static final int $stable = 0;

            @Nullable
            private final String loadingImageUrl;

            @NotNull
            private final String urlString;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public Video(@NotNull String str, @Nullable String str2) {
                super(null);
                str.getClass();
                this.urlString = str;
                this.loadingImageUrl = str2;
            }

            public static /* synthetic */ Video copy$default(Video video, String str, String str2, int i, Object obj) {
                if ((i & 1) != 0) {
                    str = video.urlString;
                }
                if ((i & 2) != 0) {
                    str2 = video.loadingImageUrl;
                }
                return video.copy(str, str2);
            }

            @NotNull
            /* renamed from: component1, reason: from getter */
            public final String getUrlString() {
                return this.urlString;
            }

            @Nullable
            /* renamed from: component2, reason: from getter */
            public final String getLoadingImageUrl() {
                return this.loadingImageUrl;
            }

            @NotNull
            public final Video copy(@NotNull String urlString, @Nullable String loadingImageUrl) {
                urlString.getClass();
                return new Video(urlString, loadingImageUrl);
            }

            public boolean equals(@Nullable Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof Video)) {
                    return false;
                }
                Video video = (Video) other;
                return Intrinsics.c(this.urlString, video.urlString) && Intrinsics.c(this.loadingImageUrl, video.loadingImageUrl);
            }

            @Nullable
            public final String getLoadingImageUrl() {
                return this.loadingImageUrl;
            }

            @NotNull
            public final String getUrlString() {
                return this.urlString;
            }

            public int hashCode() {
                int hashCode = this.urlString.hashCode() * 31;
                String str = this.loadingImageUrl;
                return hashCode + (str == null ? 0 : str.hashCode());
            }

            @NotNull
            public String toString() {
                StringBuilder sb = new StringBuilder("Video(urlString=");
                sb.append(this.urlString);
                sb.append(", loadingImageUrl=");
                return lnb.q(sb, this.loadingImageUrl, ')');
            }
        }

        public /* synthetic */ Content(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Content() {
        }
    }

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    @Keep
    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0013\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u001eB9\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\t\u0010\nJ\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0005HÆ\u0003J\u000b\u0010\u0015\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u0016\u001a\u0004\u0018\u00010\u0005HÆ\u0003J?\u0010\u0017\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0005HÆ\u0001J\u0013\u0010\u0018\u001a\u00020\u00192\b\u0010\u001a\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001b\u001a\u00020\u001cHÖ\u0001J\t\u0010\u001d\u001a\u00020\u0005HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000eR\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000eR\u0013\u0010\b\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u000e¨\u0006\u001f"}, d2 = {"Lcom/blaze/blazesdk/ads/custom_native/models/BlazeGoogleCustomNativeAdModel$CtaModel;", "", "type", "Lcom/blaze/blazesdk/ads/custom_native/models/BlazeGoogleCustomNativeAdModel$CtaModel$CTAType;", "url", "", "text", TtmlNode.ATTR_TTS_BACKGROUND_COLOR, "textColor", "<init>", "(Lcom/blaze/blazesdk/ads/custom_native/models/BlazeGoogleCustomNativeAdModel$CtaModel$CTAType;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getType", "()Lcom/blaze/blazesdk/ads/custom_native/models/BlazeGoogleCustomNativeAdModel$CtaModel$CTAType;", "getUrl", "()Ljava/lang/String;", "getText", "getBackgroundColor", "getTextColor", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", "other", "hashCode", "", "toString", "CTAType", "blazesdk_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class CtaModel {
        public static final int $stable = 0;

        @Nullable
        private final String backgroundColor;

        @NotNull
        private final String text;

        @Nullable
        private final String textColor;

        @NotNull
        private final CTAType type;

        @NotNull
        private final String url;

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
        @Keep
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0087\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lcom/blaze/blazesdk/ads/custom_native/models/BlazeGoogleCustomNativeAdModel$CtaModel$CTAType;", "", "<init>", "(Ljava/lang/String;I)V", "DEEPLINK", "WEB", "blazesdk_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final class CTAType {
            private static final /* synthetic */ jp5 $ENTRIES;
            private static final /* synthetic */ CTAType[] $VALUES;
            public static final CTAType DEEPLINK = new CTAType("DEEPLINK", 0);
            public static final CTAType WEB = new CTAType("WEB", 1);

            private static final /* synthetic */ CTAType[] $values() {
                return new CTAType[]{DEEPLINK, WEB};
            }

            static {
                CTAType[] $values = $values();
                $VALUES = $values;
                $ENTRIES = gz8.G($values);
            }

            private CTAType(String str, int i) {
            }

            @NotNull
            public static jp5 getEntries() {
                return $ENTRIES;
            }

            public static CTAType valueOf(String str) {
                return (CTAType) Enum.valueOf(CTAType.class, str);
            }

            public static CTAType[] values() {
                return (CTAType[]) $VALUES.clone();
            }
        }

        @Keep
        public CtaModel(@NotNull CTAType cTAType, @NotNull String str, @NotNull String str2, @Nullable String str3, @Nullable String str4) {
            cTAType.getClass();
            str.getClass();
            str2.getClass();
            this.type = cTAType;
            this.url = str;
            this.text = str2;
            this.backgroundColor = str3;
            this.textColor = str4;
        }

        public static /* synthetic */ CtaModel copy$default(CtaModel ctaModel, CTAType cTAType, String str, String str2, String str3, String str4, int i, Object obj) {
            if ((i & 1) != 0) {
                cTAType = ctaModel.type;
            }
            if ((i & 2) != 0) {
                str = ctaModel.url;
            }
            if ((i & 4) != 0) {
                str2 = ctaModel.text;
            }
            if ((i & 8) != 0) {
                str3 = ctaModel.backgroundColor;
            }
            if ((i & 16) != 0) {
                str4 = ctaModel.textColor;
            }
            String str5 = str4;
            String str6 = str2;
            return ctaModel.copy(cTAType, str, str6, str3, str5);
        }

        @NotNull
        /* renamed from: component1, reason: from getter */
        public final CTAType getType() {
            return this.type;
        }

        @NotNull
        /* renamed from: component2, reason: from getter */
        public final String getUrl() {
            return this.url;
        }

        @NotNull
        /* renamed from: component3, reason: from getter */
        public final String getText() {
            return this.text;
        }

        @Nullable
        /* renamed from: component4, reason: from getter */
        public final String getBackgroundColor() {
            return this.backgroundColor;
        }

        @Nullable
        /* renamed from: component5, reason: from getter */
        public final String getTextColor() {
            return this.textColor;
        }

        @NotNull
        public final CtaModel copy(@NotNull CTAType type, @NotNull String url, @NotNull String text, @Nullable String backgroundColor, @Nullable String textColor) {
            type.getClass();
            url.getClass();
            text.getClass();
            return new CtaModel(type, url, text, backgroundColor, textColor);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof CtaModel)) {
                return false;
            }
            CtaModel ctaModel = (CtaModel) other;
            return this.type == ctaModel.type && Intrinsics.c(this.url, ctaModel.url) && Intrinsics.c(this.text, ctaModel.text) && Intrinsics.c(this.backgroundColor, ctaModel.backgroundColor) && Intrinsics.c(this.textColor, ctaModel.textColor);
        }

        @Nullable
        public final String getBackgroundColor() {
            return this.backgroundColor;
        }

        @NotNull
        public final String getText() {
            return this.text;
        }

        @Nullable
        public final String getTextColor() {
            return this.textColor;
        }

        @NotNull
        public final CTAType getType() {
            return this.type;
        }

        @NotNull
        public final String getUrl() {
            return this.url;
        }

        public int hashCode() {
            int k = o6a.k(this.text, o6a.k(this.url, this.type.hashCode() * 31));
            String str = this.backgroundColor;
            int hashCode = (k + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.textColor;
            return hashCode + (str2 != null ? str2.hashCode() : 0);
        }

        @NotNull
        public String toString() {
            StringBuilder sb = new StringBuilder("CtaModel(type=");
            sb.append(this.type);
            sb.append(", url=");
            sb.append(this.url);
            sb.append(", text=");
            sb.append(this.text);
            sb.append(", backgroundColor=");
            sb.append(this.backgroundColor);
            sb.append(", textColor=");
            return lnb.q(sb, this.textColor, ')');
        }

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        @Keep
        public CtaModel(@NotNull CTAType cTAType, @NotNull String str, @NotNull String str2, @Nullable String str3) {
            this(cTAType, str, str2, str3, null, 16, null);
            cTAType.getClass();
            str.getClass();
            str2.getClass();
        }

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        @Keep
        public CtaModel(@NotNull CTAType cTAType, @NotNull String str, @NotNull String str2) {
            this(cTAType, str, str2, null, null, 24, null);
            cTAType.getClass();
            str.getClass();
            str2.getClass();
        }

        public /* synthetic */ CtaModel(CTAType cTAType, String str, String str2, String str3, String str4, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(cTAType, str, str2, (i & 8) != 0 ? null : str3, (i & 16) != 0 ? null : str4);
        }
    }

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    @Keep
    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0013\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001BE\b\u0007\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\b\u0010\tJ\u000b\u0010\u0010\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0011\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0012\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0013\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0014\u001a\u0004\u0018\u00010\u0003HÆ\u0003JE\u0010\u0015\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\u0016\u001a\u00020\u00172\b\u0010\u0018\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0019\u001a\u00020\u001aHÖ\u0001J\t\u0010\u001b\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000bR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000bR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000bR\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000b¨\u0006\u001c"}, d2 = {"Lcom/blaze/blazesdk/ads/custom_native/models/BlazeGoogleCustomNativeAdModel$AnalyticsData;", "", "advertiserId", "", "advertiserName", "campaignId", "campaignName", "adServer", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getAdvertiserId", "()Ljava/lang/String;", "getAdvertiserName", "getCampaignId", "getCampaignName", "getAdServer", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", "other", "hashCode", "", "toString", "blazesdk_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class AnalyticsData {
        public static final int $stable = 0;

        @Nullable
        private final String adServer;

        @Nullable
        private final String advertiserId;

        @Nullable
        private final String advertiserName;

        @Nullable
        private final String campaignId;

        @Nullable
        private final String campaignName;

        public /* synthetic */ AnalyticsData(String str, String str2, String str3, String str4, String str5, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3, (i & 8) != 0 ? null : str4, (i & 16) != 0 ? null : str5);
        }

        public static /* synthetic */ AnalyticsData copy$default(AnalyticsData analyticsData, String str, String str2, String str3, String str4, String str5, int i, Object obj) {
            if ((i & 1) != 0) {
                str = analyticsData.advertiserId;
            }
            if ((i & 2) != 0) {
                str2 = analyticsData.advertiserName;
            }
            if ((i & 4) != 0) {
                str3 = analyticsData.campaignId;
            }
            if ((i & 8) != 0) {
                str4 = analyticsData.campaignName;
            }
            if ((i & 16) != 0) {
                str5 = analyticsData.adServer;
            }
            String str6 = str5;
            String str7 = str3;
            return analyticsData.copy(str, str2, str7, str4, str6);
        }

        @Nullable
        /* renamed from: component1, reason: from getter */
        public final String getAdvertiserId() {
            return this.advertiserId;
        }

        @Nullable
        /* renamed from: component2, reason: from getter */
        public final String getAdvertiserName() {
            return this.advertiserName;
        }

        @Nullable
        /* renamed from: component3, reason: from getter */
        public final String getCampaignId() {
            return this.campaignId;
        }

        @Nullable
        /* renamed from: component4, reason: from getter */
        public final String getCampaignName() {
            return this.campaignName;
        }

        @Nullable
        /* renamed from: component5, reason: from getter */
        public final String getAdServer() {
            return this.adServer;
        }

        @NotNull
        public final AnalyticsData copy(@Nullable String advertiserId, @Nullable String advertiserName, @Nullable String campaignId, @Nullable String campaignName, @Nullable String adServer) {
            return new AnalyticsData(advertiserId, advertiserName, campaignId, campaignName, adServer);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof AnalyticsData)) {
                return false;
            }
            AnalyticsData analyticsData = (AnalyticsData) other;
            return Intrinsics.c(this.advertiserId, analyticsData.advertiserId) && Intrinsics.c(this.advertiserName, analyticsData.advertiserName) && Intrinsics.c(this.campaignId, analyticsData.campaignId) && Intrinsics.c(this.campaignName, analyticsData.campaignName) && Intrinsics.c(this.adServer, analyticsData.adServer);
        }

        @Nullable
        public final String getAdServer() {
            return this.adServer;
        }

        @Nullable
        public final String getAdvertiserId() {
            return this.advertiserId;
        }

        @Nullable
        public final String getAdvertiserName() {
            return this.advertiserName;
        }

        @Nullable
        public final String getCampaignId() {
            return this.campaignId;
        }

        @Nullable
        public final String getCampaignName() {
            return this.campaignName;
        }

        public int hashCode() {
            String str = this.advertiserId;
            int hashCode = (str == null ? 0 : str.hashCode()) * 31;
            String str2 = this.advertiserName;
            int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
            String str3 = this.campaignId;
            int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
            String str4 = this.campaignName;
            int hashCode4 = (hashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
            String str5 = this.adServer;
            return hashCode4 + (str5 != null ? str5.hashCode() : 0);
        }

        @NotNull
        public String toString() {
            StringBuilder sb = new StringBuilder("AnalyticsData(advertiserId=");
            sb.append(this.advertiserId);
            sb.append(", advertiserName=");
            sb.append(this.advertiserName);
            sb.append(", campaignId=");
            sb.append(this.campaignId);
            sb.append(", campaignName=");
            sb.append(this.campaignName);
            sb.append(", adServer=");
            return lnb.q(sb, this.adServer, ')');
        }

        @Keep
        public AnalyticsData(@Nullable String str) {
            this(str, null, null, null, null, 30, null);
        }

        @Keep
        public AnalyticsData(@Nullable String str, @Nullable String str2) {
            this(str, str2, null, null, null, 28, null);
        }

        @Keep
        public AnalyticsData(@Nullable String str, @Nullable String str2, @Nullable String str3) {
            this(str, str2, str3, null, null, 24, null);
        }

        @Keep
        public AnalyticsData(@Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable String str4) {
            this(str, str2, str3, str4, null, 16, null);
        }

        @Keep
        public AnalyticsData(@Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable String str4, @Nullable String str5) {
            this.advertiserId = str;
            this.advertiserName = str2;
            this.campaignId = str3;
            this.campaignName = str4;
            this.adServer = str5;
        }

        @Keep
        public AnalyticsData() {
            this(null, null, null, null, null, 31, null);
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @Keep
    public BlazeGoogleCustomNativeAdModel(@NotNull Content content, @Nullable String str) {
        this(content, str, null, null, null, null, 60, null);
        content.getClass();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @Keep
    public BlazeGoogleCustomNativeAdModel(@NotNull Content content, @Nullable String str, @Nullable CtaModel ctaModel) {
        this(content, str, ctaModel, null, null, null, 56, null);
        content.getClass();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @Keep
    public BlazeGoogleCustomNativeAdModel(@NotNull Content content, @Nullable String str, @Nullable CtaModel ctaModel, @NotNull Set<BlazeTrackingPixel> set) {
        this(content, str, ctaModel, set, null, null, 48, null);
        content.getClass();
        set.getClass();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @Keep
    public BlazeGoogleCustomNativeAdModel(@NotNull Content content, @Nullable String str, @Nullable CtaModel ctaModel, @NotNull Set<BlazeTrackingPixel> set, @Nullable Object obj) {
        this(content, str, ctaModel, set, obj, null, 32, null);
        content.getClass();
        set.getClass();
    }

    @Keep
    public BlazeGoogleCustomNativeAdModel(@NotNull Content content, @Nullable String str, @Nullable CtaModel ctaModel, @NotNull Set<BlazeTrackingPixel> set, @Nullable Object obj, @Nullable AnalyticsData analyticsData) {
        content.getClass();
        set.getClass();
        this.content = content;
        this.title = str;
        this.cta = ctaModel;
        this.trackingPixelAdList = set;
        this.customAdditionalData = obj;
        this.analyticsData = analyticsData;
        this.isValid = true;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @Keep
    public BlazeGoogleCustomNativeAdModel(@NotNull Content content) {
        this(content, null, null, null, null, null, 62, null);
        content.getClass();
    }
}
