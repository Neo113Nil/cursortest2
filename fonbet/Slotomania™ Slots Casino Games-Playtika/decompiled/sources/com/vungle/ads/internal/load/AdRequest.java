package com.vungle.ads.internal.load;

import com.vungle.ads.VungleAdSize;
import com.vungle.ads.VungleCSBData;
import com.vungle.ads.internal.model.BidPayload;
import com.vungle.ads.internal.model.Placement;
import java.io.Serializable;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* compiled from: AdRequest.kt */
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\u0018\u00002\u00020\u0001B-\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\u0002\u0010\nJ\u0013\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0016H\u0096\u0002J\b\u0010\u0017\u001a\u00020\u0018H\u0016J\b\u0010\u0019\u001a\u00020\u001aH\u0016R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0013\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u001b"}, d2 = {"Lcom/vungle/ads/internal/load/AdRequest;", "Ljava/io/Serializable;", "placement", "Lcom/vungle/ads/internal/model/Placement;", "adMarkup", "Lcom/vungle/ads/internal/model/BidPayload;", "requestAdSize", "Lcom/vungle/ads/VungleAdSize;", "csbData", "Lcom/vungle/ads/VungleCSBData;", "(Lcom/vungle/ads/internal/model/Placement;Lcom/vungle/ads/internal/model/BidPayload;Lcom/vungle/ads/VungleAdSize;Lcom/vungle/ads/VungleCSBData;)V", "getAdMarkup", "()Lcom/vungle/ads/internal/model/BidPayload;", "getCsbData", "()Lcom/vungle/ads/VungleCSBData;", "getPlacement", "()Lcom/vungle/ads/internal/model/Placement;", "getRequestAdSize", "()Lcom/vungle/ads/VungleAdSize;", "equals", "", "other", "", "hashCode", "", "toString", "", "vungle-ads_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
/* loaded from: classes4.dex */
public final class AdRequest implements Serializable {
    private final BidPayload adMarkup;
    private final VungleCSBData csbData;
    private final Placement placement;
    private final VungleAdSize requestAdSize;

    public AdRequest(Placement placement, BidPayload bidPayload, VungleAdSize vungleAdSize, VungleCSBData vungleCSBData) {
        Intrinsics.checkNotNullParameter(placement, "placement");
        this.placement = placement;
        this.adMarkup = bidPayload;
        this.requestAdSize = vungleAdSize;
        this.csbData = vungleCSBData;
    }

    public /* synthetic */ AdRequest(Placement placement, BidPayload bidPayload, VungleAdSize vungleAdSize, VungleCSBData vungleCSBData, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(placement, bidPayload, vungleAdSize, (i & 8) != 0 ? null : vungleCSBData);
    }

    public final Placement getPlacement() {
        return this.placement;
    }

    public final BidPayload getAdMarkup() {
        return this.adMarkup;
    }

    public final VungleAdSize getRequestAdSize() {
        return this.requestAdSize;
    }

    public final VungleCSBData getCsbData() {
        return this.csbData;
    }

    public String toString() {
        return "AdRequest{placementId='" + this.placement.getReferenceId() + "', adMarkup=" + this.adMarkup + ", requestAdSize=" + this.requestAdSize + ", csbData=" + this.csbData + AbstractJsonLexerKt.END_OBJ;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (other != null && Intrinsics.areEqual(getClass(), other.getClass())) {
            AdRequest adRequest = (AdRequest) other;
            if (!Intrinsics.areEqual(this.placement.getReferenceId(), adRequest.placement.getReferenceId()) || !Intrinsics.areEqual(this.requestAdSize, adRequest.requestAdSize)) {
                return false;
            }
            BidPayload bidPayload = this.adMarkup;
            if (bidPayload != null) {
                if (!Intrinsics.areEqual(bidPayload, adRequest.adMarkup)) {
                    return false;
                }
            } else if (adRequest.adMarkup != null) {
                return false;
            }
            VungleCSBData vungleCSBData = this.csbData;
            VungleCSBData vungleCSBData2 = adRequest.csbData;
            if (vungleCSBData != null) {
                return Intrinsics.areEqual(vungleCSBData, vungleCSBData2);
            }
            if (vungleCSBData2 == null) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        int hashCode = this.placement.getReferenceId().hashCode() * 31;
        VungleAdSize vungleAdSize = this.requestAdSize;
        int hashCode2 = (hashCode + (vungleAdSize != null ? vungleAdSize.hashCode() : 0)) * 31;
        BidPayload bidPayload = this.adMarkup;
        int hashCode3 = (hashCode2 + (bidPayload != null ? bidPayload.hashCode() : 0)) * 31;
        VungleCSBData vungleCSBData = this.csbData;
        return hashCode3 + (vungleCSBData != null ? vungleCSBData.hashCode() : 0);
    }
}
