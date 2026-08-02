package ru.sberdevices.salutevision.core.data;

import B4.V;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.sberdevices.salutevision.core.data.SaluteVisionRecognition;

@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u001b\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007J\u000f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\t\u0010\f\u001a\u00020\u0006HÆ\u0003J#\u0010\r\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0006HÆ\u0001J\u0013\u0010\u000e\u001a\u00020\u00062\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010HÖ\u0003J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\n¨\u0006\u0015"}, d2 = {"Lru/sberdevices/salutevision/core/data/LoyaltyCardRecognitionInfo;", "Lru/sberdevices/salutevision/core/data/SaluteVisionRecognition$Info;", "brandProbs", "", "Lru/sberdevices/salutevision/core/data/BrandProb;", "isConfident", "", "(Ljava/util/List;Z)V", "getBrandProbs", "()Ljava/util/List;", "()Z", "component1", "component2", "copy", "equals", "other", "", "hashCode", "", "toString", "", "salutevision-core_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class LoyaltyCardRecognitionInfo implements SaluteVisionRecognition.Info {

    @NotNull
    private final List<BrandProb> brandProbs;
    private final boolean isConfident;

    public LoyaltyCardRecognitionInfo(@NotNull List<BrandProb> brandProbs, boolean z11) {
        Intrinsics.checkNotNullParameter(brandProbs, "brandProbs");
        this.brandProbs = brandProbs;
        this.isConfident = z11;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ LoyaltyCardRecognitionInfo copy$default(LoyaltyCardRecognitionInfo loyaltyCardRecognitionInfo, List list, boolean z11, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            list = loyaltyCardRecognitionInfo.brandProbs;
        }
        if ((i11 & 2) != 0) {
            z11 = loyaltyCardRecognitionInfo.isConfident;
        }
        return loyaltyCardRecognitionInfo.copy(list, z11);
    }

    @NotNull
    public final List<BrandProb> component1() {
        return this.brandProbs;
    }

    /* renamed from: component2, reason: from getter */
    public final boolean getIsConfident() {
        return this.isConfident;
    }

    @NotNull
    public final LoyaltyCardRecognitionInfo copy(@NotNull List<BrandProb> brandProbs, boolean isConfident) {
        Intrinsics.checkNotNullParameter(brandProbs, "brandProbs");
        return new LoyaltyCardRecognitionInfo(brandProbs, isConfident);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof LoyaltyCardRecognitionInfo)) {
            return false;
        }
        LoyaltyCardRecognitionInfo loyaltyCardRecognitionInfo = (LoyaltyCardRecognitionInfo) other;
        return Intrinsics.d(this.brandProbs, loyaltyCardRecognitionInfo.brandProbs) && this.isConfident == loyaltyCardRecognitionInfo.isConfident;
    }

    @NotNull
    public final List<BrandProb> getBrandProbs() {
        return this.brandProbs;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int hashCode() {
        int hashCode = this.brandProbs.hashCode() * 31;
        boolean z11 = this.isConfident;
        int i11 = z11;
        if (z11 != 0) {
            i11 = 1;
        }
        return hashCode + i11;
    }

    public final boolean isConfident() {
        return this.isConfident;
    }

    @NotNull
    public String toString() {
        StringBuilder sb2 = new StringBuilder("LoyaltyCardRecognitionInfo(brandProbs=");
        sb2.append(this.brandProbs);
        sb2.append(", isConfident=");
        return V.d(sb2, this.isConfident, ')');
    }
}
