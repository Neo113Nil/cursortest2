package com.blaze.gam.custom_native;

import androidx.annotation.Keep;
import com.blaze.blazesdk.ads.models.ui.BlazeContentExtraInfo;
import defpackage.dmi;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Keep
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010$\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B3\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b¢\u0006\u0004\b\t\u0010\nJ\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0003HÆ\u0003J\u0015\u0010\u0016\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u0006HÆ\u0003J\t\u0010\u0017\u001a\u00020\bHÆ\u0003J=\u0010\u0018\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\u0014\b\u0002\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u00062\b\b\u0002\u0010\u0007\u001a\u00020\bHÆ\u0001J\u0013\u0010\u0019\u001a\u00020\u001a2\b\u0010\u001b\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001c\u001a\u00020\u001dHÖ\u0001J\t\u0010\u001e\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\fR\u001d\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0007\u001a\u00020\bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013¨\u0006\u001f"}, d2 = {"Lcom/blaze/gam/custom_native/BlazeGamCustomNativeAdRequestInformation;", "", "adUnitId", "", "templateId", "adContext", "", "extraInfo", "Lcom/blaze/blazesdk/ads/models/ui/BlazeContentExtraInfo;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;Lcom/blaze/blazesdk/ads/models/ui/BlazeContentExtraInfo;)V", "getAdUnitId", "()Ljava/lang/String;", "getTemplateId", "getAdContext", "()Ljava/util/Map;", "getExtraInfo", "()Lcom/blaze/blazesdk/ads/models/ui/BlazeContentExtraInfo;", "setExtraInfo", "(Lcom/blaze/blazesdk/ads/models/ui/BlazeContentExtraInfo;)V", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "", "toString", "blaze_gam_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class BlazeGamCustomNativeAdRequestInformation {

    @NotNull
    private final Map<String, String> adContext;

    @NotNull
    private final String adUnitId;

    @NotNull
    private BlazeContentExtraInfo extraInfo;

    @NotNull
    private final String templateId;

    public BlazeGamCustomNativeAdRequestInformation(@NotNull String str, @NotNull String str2, @NotNull Map<String, String> map, @NotNull BlazeContentExtraInfo blazeContentExtraInfo) {
        str.getClass();
        str2.getClass();
        map.getClass();
        blazeContentExtraInfo.getClass();
        this.adUnitId = str;
        this.templateId = str2;
        this.adContext = map;
        this.extraInfo = blazeContentExtraInfo;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ BlazeGamCustomNativeAdRequestInformation copy$default(BlazeGamCustomNativeAdRequestInformation blazeGamCustomNativeAdRequestInformation, String str, String str2, Map map, BlazeContentExtraInfo blazeContentExtraInfo, int i, Object obj) {
        if ((i & 1) != 0) {
            str = blazeGamCustomNativeAdRequestInformation.adUnitId;
        }
        if ((i & 2) != 0) {
            str2 = blazeGamCustomNativeAdRequestInformation.templateId;
        }
        if ((i & 4) != 0) {
            map = blazeGamCustomNativeAdRequestInformation.adContext;
        }
        if ((i & 8) != 0) {
            blazeContentExtraInfo = blazeGamCustomNativeAdRequestInformation.extraInfo;
        }
        return blazeGamCustomNativeAdRequestInformation.copy(str, str2, map, blazeContentExtraInfo);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final String getAdUnitId() {
        return this.adUnitId;
    }

    @NotNull
    /* renamed from: component2, reason: from getter */
    public final String getTemplateId() {
        return this.templateId;
    }

    @NotNull
    public final Map<String, String> component3() {
        return this.adContext;
    }

    @NotNull
    /* renamed from: component4, reason: from getter */
    public final BlazeContentExtraInfo getExtraInfo() {
        return this.extraInfo;
    }

    @NotNull
    public final BlazeGamCustomNativeAdRequestInformation copy(@NotNull String adUnitId, @NotNull String templateId, @NotNull Map<String, String> adContext, @NotNull BlazeContentExtraInfo extraInfo) {
        adUnitId.getClass();
        templateId.getClass();
        adContext.getClass();
        extraInfo.getClass();
        return new BlazeGamCustomNativeAdRequestInformation(adUnitId, templateId, adContext, extraInfo);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof BlazeGamCustomNativeAdRequestInformation)) {
            return false;
        }
        BlazeGamCustomNativeAdRequestInformation blazeGamCustomNativeAdRequestInformation = (BlazeGamCustomNativeAdRequestInformation) other;
        return Intrinsics.c(this.adUnitId, blazeGamCustomNativeAdRequestInformation.adUnitId) && Intrinsics.c(this.templateId, blazeGamCustomNativeAdRequestInformation.templateId) && Intrinsics.c(this.adContext, blazeGamCustomNativeAdRequestInformation.adContext) && Intrinsics.c(this.extraInfo, blazeGamCustomNativeAdRequestInformation.extraInfo);
    }

    @NotNull
    public final Map<String, String> getAdContext() {
        return this.adContext;
    }

    @NotNull
    public final String getAdUnitId() {
        return this.adUnitId;
    }

    @NotNull
    public final BlazeContentExtraInfo getExtraInfo() {
        return this.extraInfo;
    }

    @NotNull
    public final String getTemplateId() {
        return this.templateId;
    }

    public int hashCode() {
        return this.extraInfo.hashCode() + dmi.g(this.adContext, dmi.c(this.adUnitId.hashCode() * 31, 31, this.templateId), 31);
    }

    public final void setExtraInfo(@NotNull BlazeContentExtraInfo blazeContentExtraInfo) {
        blazeContentExtraInfo.getClass();
        this.extraInfo = blazeContentExtraInfo;
    }

    @NotNull
    public String toString() {
        return "BlazeGamCustomNativeAdRequestInformation(adUnitId=" + this.adUnitId + ", templateId=" + this.templateId + ", adContext=" + this.adContext + ", extraInfo=" + this.extraInfo + ')';
    }
}
