package ru.ozon.app.android.ugc.payout.widgets.pinnedReview.data;

import Kk.C3532b;
import Sh.b;
import com.squareup.moshi.j;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.tokenized.model.TokenizedTrackingInfo;
import ru.ozon.uni.atoms.data.AtomActionDTO;
import ru.ozon.uni.atoms.data.common.CornerRadius;

@j(generateAdapter = true)
@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u001a\n\u0002\u0010\b\n\u0002\b\u0002\b\u0081\b\u0018\u00002\u00020\u0001BQ\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u000b\u0012\u0014\u0010\f\u001a\u0010\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u000f\u0018\u00010\r\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011¢\u0006\u0004\b\u0012\u0010\u0013J\t\u0010!\u001a\u00020\u0003HÆ\u0003J\t\u0010\"\u001a\u00020\u0005HÆ\u0003J\t\u0010#\u001a\u00020\u0007HÆ\u0003J\t\u0010$\u001a\u00020\tHÆ\u0003J\u000b\u0010%\u001a\u0004\u0018\u00010\u000bHÆ\u0003J\u0017\u0010&\u001a\u0010\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u000f\u0018\u00010\rHÆ\u0003J\u000b\u0010'\u001a\u0004\u0018\u00010\u0011HÆ\u0003Ja\u0010(\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b2\u0016\b\u0002\u0010\f\u001a\u0010\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u000f\u0018\u00010\r2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u0011HÆ\u0001J\u0013\u0010)\u001a\u00020\t2\b\u0010*\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010+\u001a\u00020,HÖ\u0001J\t\u0010-\u001a\u00020\u000eHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u001aR\u0013\u0010\n\u001a\u0004\u0018\u00010\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001cR\u001f\u0010\f\u001a\u0010\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u000f\u0018\u00010\r¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001eR\u0013\u0010\u0010\u001a\u0004\u0018\u00010\u0011¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010 ¨\u0006."}, d2 = {"Lru/ozon/app/android/ugc/payout/widgets/pinnedReview/data/PinnedReviewDTO;", "", "reviewHeader", "Lru/ozon/app/android/ugc/payout/widgets/pinnedReview/data/ReviewHeaderDTO;", "reviewBody", "Lru/ozon/app/android/ugc/payout/widgets/pinnedReview/data/ReviewBodyDTO;", "reviewFooter", "Lru/ozon/app/android/ugc/payout/widgets/pinnedReview/data/ReviewLabelButtonFooterDTO;", "isCollapsed", "", "action", "Lru/ozon/uni/atoms/data/AtomActionDTO;", "trackingInfo", "", "", "Lru/ozon/android/tokenized/model/TokenizedTrackingInfo;", "cornerRadius", "Lru/ozon/uni/atoms/data/common/CornerRadius;", "<init>", "(Lru/ozon/app/android/ugc/payout/widgets/pinnedReview/data/ReviewHeaderDTO;Lru/ozon/app/android/ugc/payout/widgets/pinnedReview/data/ReviewBodyDTO;Lru/ozon/app/android/ugc/payout/widgets/pinnedReview/data/ReviewLabelButtonFooterDTO;ZLru/ozon/uni/atoms/data/AtomActionDTO;Ljava/util/Map;Lru/ozon/uni/atoms/data/common/CornerRadius;)V", "getReviewHeader", "()Lru/ozon/app/android/ugc/payout/widgets/pinnedReview/data/ReviewHeaderDTO;", "getReviewBody", "()Lru/ozon/app/android/ugc/payout/widgets/pinnedReview/data/ReviewBodyDTO;", "getReviewFooter", "()Lru/ozon/app/android/ugc/payout/widgets/pinnedReview/data/ReviewLabelButtonFooterDTO;", "()Z", "getAction", "()Lru/ozon/uni/atoms/data/AtomActionDTO;", "getTrackingInfo", "()Ljava/util/Map;", "getCornerRadius", "()Lru/ozon/uni/atoms/data/common/CornerRadius;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "equals", "other", "hashCode", "", "toString", "payout_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class PinnedReviewDTO {
    private final AtomActionDTO action;
    private final CornerRadius cornerRadius;
    private final boolean isCollapsed;

    @NotNull
    private final ReviewBodyDTO reviewBody;

    @NotNull
    private final ReviewLabelButtonFooterDTO reviewFooter;

    @NotNull
    private final ReviewHeaderDTO reviewHeader;
    private final Map<String, TokenizedTrackingInfo> trackingInfo;

    public PinnedReviewDTO(@NotNull ReviewHeaderDTO reviewHeader, @NotNull ReviewBodyDTO reviewBody, @NotNull ReviewLabelButtonFooterDTO reviewFooter, boolean z11, AtomActionDTO atomActionDTO, Map<String, TokenizedTrackingInfo> map, CornerRadius cornerRadius) {
        Intrinsics.checkNotNullParameter(reviewHeader, "reviewHeader");
        Intrinsics.checkNotNullParameter(reviewBody, "reviewBody");
        Intrinsics.checkNotNullParameter(reviewFooter, "reviewFooter");
        this.reviewHeader = reviewHeader;
        this.reviewBody = reviewBody;
        this.reviewFooter = reviewFooter;
        this.isCollapsed = z11;
        this.action = atomActionDTO;
        this.trackingInfo = map;
        this.cornerRadius = cornerRadius;
    }

    public static /* synthetic */ PinnedReviewDTO copy$default(PinnedReviewDTO pinnedReviewDTO, ReviewHeaderDTO reviewHeaderDTO, ReviewBodyDTO reviewBodyDTO, ReviewLabelButtonFooterDTO reviewLabelButtonFooterDTO, boolean z11, AtomActionDTO atomActionDTO, Map map, CornerRadius cornerRadius, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            reviewHeaderDTO = pinnedReviewDTO.reviewHeader;
        }
        if ((i11 & 2) != 0) {
            reviewBodyDTO = pinnedReviewDTO.reviewBody;
        }
        if ((i11 & 4) != 0) {
            reviewLabelButtonFooterDTO = pinnedReviewDTO.reviewFooter;
        }
        if ((i11 & 8) != 0) {
            z11 = pinnedReviewDTO.isCollapsed;
        }
        if ((i11 & 16) != 0) {
            atomActionDTO = pinnedReviewDTO.action;
        }
        if ((i11 & 32) != 0) {
            map = pinnedReviewDTO.trackingInfo;
        }
        if ((i11 & 64) != 0) {
            cornerRadius = pinnedReviewDTO.cornerRadius;
        }
        Map map2 = map;
        CornerRadius cornerRadius2 = cornerRadius;
        AtomActionDTO atomActionDTO2 = atomActionDTO;
        ReviewLabelButtonFooterDTO reviewLabelButtonFooterDTO2 = reviewLabelButtonFooterDTO;
        return pinnedReviewDTO.copy(reviewHeaderDTO, reviewBodyDTO, reviewLabelButtonFooterDTO2, z11, atomActionDTO2, map2, cornerRadius2);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final ReviewHeaderDTO getReviewHeader() {
        return this.reviewHeader;
    }

    @NotNull
    /* renamed from: component2, reason: from getter */
    public final ReviewBodyDTO getReviewBody() {
        return this.reviewBody;
    }

    @NotNull
    /* renamed from: component3, reason: from getter */
    public final ReviewLabelButtonFooterDTO getReviewFooter() {
        return this.reviewFooter;
    }

    /* renamed from: component4, reason: from getter */
    public final boolean getIsCollapsed() {
        return this.isCollapsed;
    }

    /* renamed from: component5, reason: from getter */
    public final AtomActionDTO getAction() {
        return this.action;
    }

    public final Map<String, TokenizedTrackingInfo> component6() {
        return this.trackingInfo;
    }

    /* renamed from: component7, reason: from getter */
    public final CornerRadius getCornerRadius() {
        return this.cornerRadius;
    }

    @NotNull
    public final PinnedReviewDTO copy(@NotNull ReviewHeaderDTO reviewHeader, @NotNull ReviewBodyDTO reviewBody, @NotNull ReviewLabelButtonFooterDTO reviewFooter, boolean isCollapsed, AtomActionDTO action, Map<String, TokenizedTrackingInfo> trackingInfo, CornerRadius cornerRadius) {
        Intrinsics.checkNotNullParameter(reviewHeader, "reviewHeader");
        Intrinsics.checkNotNullParameter(reviewBody, "reviewBody");
        Intrinsics.checkNotNullParameter(reviewFooter, "reviewFooter");
        return new PinnedReviewDTO(reviewHeader, reviewBody, reviewFooter, isCollapsed, action, trackingInfo, cornerRadius);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PinnedReviewDTO)) {
            return false;
        }
        PinnedReviewDTO pinnedReviewDTO = (PinnedReviewDTO) other;
        return Intrinsics.d(this.reviewHeader, pinnedReviewDTO.reviewHeader) && Intrinsics.d(this.reviewBody, pinnedReviewDTO.reviewBody) && Intrinsics.d(this.reviewFooter, pinnedReviewDTO.reviewFooter) && this.isCollapsed == pinnedReviewDTO.isCollapsed && Intrinsics.d(this.action, pinnedReviewDTO.action) && Intrinsics.d(this.trackingInfo, pinnedReviewDTO.trackingInfo) && this.cornerRadius == pinnedReviewDTO.cornerRadius;
    }

    public final AtomActionDTO getAction() {
        return this.action;
    }

    public final CornerRadius getCornerRadius() {
        return this.cornerRadius;
    }

    @NotNull
    public final ReviewBodyDTO getReviewBody() {
        return this.reviewBody;
    }

    @NotNull
    public final ReviewLabelButtonFooterDTO getReviewFooter() {
        return this.reviewFooter;
    }

    @NotNull
    public final ReviewHeaderDTO getReviewHeader() {
        return this.reviewHeader;
    }

    public final Map<String, TokenizedTrackingInfo> getTrackingInfo() {
        return this.trackingInfo;
    }

    public int hashCode() {
        int a11 = C3532b.a((this.reviewFooter.hashCode() + ((this.reviewBody.hashCode() + (this.reviewHeader.hashCode() * 31)) * 31)) * 31, 31, this.isCollapsed);
        AtomActionDTO atomActionDTO = this.action;
        int hashCode = (a11 + (atomActionDTO == null ? 0 : atomActionDTO.hashCode())) * 31;
        Map<String, TokenizedTrackingInfo> map = this.trackingInfo;
        int hashCode2 = (hashCode + (map == null ? 0 : map.hashCode())) * 31;
        CornerRadius cornerRadius = this.cornerRadius;
        return hashCode2 + (cornerRadius != null ? cornerRadius.hashCode() : 0);
    }

    public final boolean isCollapsed() {
        return this.isCollapsed;
    }

    @NotNull
    public String toString() {
        ReviewHeaderDTO reviewHeaderDTO = this.reviewHeader;
        ReviewBodyDTO reviewBodyDTO = this.reviewBody;
        ReviewLabelButtonFooterDTO reviewLabelButtonFooterDTO = this.reviewFooter;
        boolean z11 = this.isCollapsed;
        AtomActionDTO atomActionDTO = this.action;
        Map<String, TokenizedTrackingInfo> map = this.trackingInfo;
        CornerRadius cornerRadius = this.cornerRadius;
        StringBuilder sb2 = new StringBuilder("PinnedReviewDTO(reviewHeader=");
        sb2.append(reviewHeaderDTO);
        sb2.append(", reviewBody=");
        sb2.append(reviewBodyDTO);
        sb2.append(", reviewFooter=");
        sb2.append(reviewLabelButtonFooterDTO);
        sb2.append(", isCollapsed=");
        sb2.append(z11);
        sb2.append(", action=");
        b.f(sb2, atomActionDTO, ", trackingInfo=", map, ", cornerRadius=");
        sb2.append(cornerRadius);
        sb2.append(")");
        return sb2.toString();
    }
}
