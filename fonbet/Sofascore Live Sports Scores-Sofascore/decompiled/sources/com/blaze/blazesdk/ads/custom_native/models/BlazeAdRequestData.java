package com.blaze.blazesdk.ads.custom_native.models;

import androidx.annotation.Keep;
import com.blaze.blazesdk.ads.models.ui.BlazeAdInfoModel;
import com.blaze.blazesdk.ads.models.ui.BlazeContentExtraInfo;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Keep
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u001d\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u000b\u0010\u000e\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u000f\u001a\u0004\u0018\u00010\u0005HÆ\u0003J!\u0010\u0010\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005HÆ\u0001J\u0013\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\r¨\u0006\u0018"}, d2 = {"Lcom/blaze/blazesdk/ads/custom_native/models/BlazeAdRequestData;", "", "adInfo", "Lcom/blaze/blazesdk/ads/models/ui/BlazeAdInfoModel;", "extraInfo", "Lcom/blaze/blazesdk/ads/models/ui/BlazeContentExtraInfo;", "<init>", "(Lcom/blaze/blazesdk/ads/models/ui/BlazeAdInfoModel;Lcom/blaze/blazesdk/ads/models/ui/BlazeContentExtraInfo;)V", "getAdInfo", "()Lcom/blaze/blazesdk/ads/models/ui/BlazeAdInfoModel;", "getExtraInfo", "()Lcom/blaze/blazesdk/ads/models/ui/BlazeContentExtraInfo;", "setExtraInfo", "(Lcom/blaze/blazesdk/ads/models/ui/BlazeContentExtraInfo;)V", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "", "blazesdk_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public final /* data */ class BlazeAdRequestData {
    public static final int $stable = 8;

    @Nullable
    private final BlazeAdInfoModel adInfo;

    @Nullable
    private BlazeContentExtraInfo extraInfo;

    public /* synthetic */ BlazeAdRequestData(BlazeAdInfoModel blazeAdInfoModel, BlazeContentExtraInfo blazeContentExtraInfo, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(blazeAdInfoModel, (i & 2) != 0 ? null : blazeContentExtraInfo);
    }

    public static /* synthetic */ BlazeAdRequestData copy$default(BlazeAdRequestData blazeAdRequestData, BlazeAdInfoModel blazeAdInfoModel, BlazeContentExtraInfo blazeContentExtraInfo, int i, Object obj) {
        if ((i & 1) != 0) {
            blazeAdInfoModel = blazeAdRequestData.adInfo;
        }
        if ((i & 2) != 0) {
            blazeContentExtraInfo = blazeAdRequestData.extraInfo;
        }
        return blazeAdRequestData.copy(blazeAdInfoModel, blazeContentExtraInfo);
    }

    @Nullable
    /* renamed from: component1, reason: from getter */
    public final BlazeAdInfoModel getAdInfo() {
        return this.adInfo;
    }

    @Nullable
    /* renamed from: component2, reason: from getter */
    public final BlazeContentExtraInfo getExtraInfo() {
        return this.extraInfo;
    }

    @NotNull
    public final BlazeAdRequestData copy(@Nullable BlazeAdInfoModel adInfo, @Nullable BlazeContentExtraInfo extraInfo) {
        return new BlazeAdRequestData(adInfo, extraInfo);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof BlazeAdRequestData)) {
            return false;
        }
        BlazeAdRequestData blazeAdRequestData = (BlazeAdRequestData) other;
        return Intrinsics.c(this.adInfo, blazeAdRequestData.adInfo) && Intrinsics.c(this.extraInfo, blazeAdRequestData.extraInfo);
    }

    @Nullable
    public final BlazeAdInfoModel getAdInfo() {
        return this.adInfo;
    }

    @Nullable
    public final BlazeContentExtraInfo getExtraInfo() {
        return this.extraInfo;
    }

    public int hashCode() {
        BlazeAdInfoModel blazeAdInfoModel = this.adInfo;
        int hashCode = (blazeAdInfoModel == null ? 0 : blazeAdInfoModel.hashCode()) * 31;
        BlazeContentExtraInfo blazeContentExtraInfo = this.extraInfo;
        return hashCode + (blazeContentExtraInfo != null ? blazeContentExtraInfo.hashCode() : 0);
    }

    public final void setExtraInfo(@Nullable BlazeContentExtraInfo blazeContentExtraInfo) {
        this.extraInfo = blazeContentExtraInfo;
    }

    @NotNull
    public String toString() {
        return "BlazeAdRequestData(adInfo=" + this.adInfo + ", extraInfo=" + this.extraInfo + ')';
    }

    public BlazeAdRequestData(@Nullable BlazeAdInfoModel blazeAdInfoModel, @Nullable BlazeContentExtraInfo blazeContentExtraInfo) {
        this.adInfo = blazeAdInfoModel;
        this.extraInfo = blazeContentExtraInfo;
    }
}
