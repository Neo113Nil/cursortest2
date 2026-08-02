package ru.ozon.app.android.ugc.widgets.reviewFormMobile.reviewFormAnonymous;

import Bi.b;
import Pk0.a;
import com.squareup.moshi.j;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.uni.atoms.data.dsCell.CellDTO;

@j(generateAdapter = true)
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000e\n\u0002\u0010\b\n\u0002\b\u0002\b\u0081\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0007HÆ\u0003J'\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0007HÆ\u0001J\u0013\u0010\u0013\u001a\u00020\u00072\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001J\t\u0010\u0017\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u000e¨\u0006\u0018"}, d2 = {"Lru/ozon/app/android/ugc/widgets/reviewFormMobile/reviewFormAnonymous/ReviewFormAnonymousDTO;", "", "uploadKey", "", "anonymousCell", "Lru/ozon/uni/atoms/data/dsCell/CellDTO;", "isEditReview", "", "<init>", "(Ljava/lang/String;Lru/ozon/uni/atoms/data/dsCell/CellDTO;Z)V", "getUploadKey", "()Ljava/lang/String;", "getAnonymousCell", "()Lru/ozon/uni/atoms/data/dsCell/CellDTO;", "()Z", "component1", "component2", "component3", "copy", "equals", "other", "hashCode", "", "toString", "ugc_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class ReviewFormAnonymousDTO {
    public static final int $stable = CellDTO.$stable;

    @NotNull
    private final CellDTO anonymousCell;
    private final boolean isEditReview;

    @NotNull
    private final String uploadKey;

    public ReviewFormAnonymousDTO(@NotNull String uploadKey, @NotNull CellDTO anonymousCell, boolean z11) {
        Intrinsics.checkNotNullParameter(uploadKey, "uploadKey");
        Intrinsics.checkNotNullParameter(anonymousCell, "anonymousCell");
        this.uploadKey = uploadKey;
        this.anonymousCell = anonymousCell;
        this.isEditReview = z11;
    }

    public static /* synthetic */ ReviewFormAnonymousDTO copy$default(ReviewFormAnonymousDTO reviewFormAnonymousDTO, String str, CellDTO cellDTO, boolean z11, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = reviewFormAnonymousDTO.uploadKey;
        }
        if ((i11 & 2) != 0) {
            cellDTO = reviewFormAnonymousDTO.anonymousCell;
        }
        if ((i11 & 4) != 0) {
            z11 = reviewFormAnonymousDTO.isEditReview;
        }
        return reviewFormAnonymousDTO.copy(str, cellDTO, z11);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final String getUploadKey() {
        return this.uploadKey;
    }

    @NotNull
    /* renamed from: component2, reason: from getter */
    public final CellDTO getAnonymousCell() {
        return this.anonymousCell;
    }

    /* renamed from: component3, reason: from getter */
    public final boolean getIsEditReview() {
        return this.isEditReview;
    }

    @NotNull
    public final ReviewFormAnonymousDTO copy(@NotNull String uploadKey, @NotNull CellDTO anonymousCell, boolean isEditReview) {
        Intrinsics.checkNotNullParameter(uploadKey, "uploadKey");
        Intrinsics.checkNotNullParameter(anonymousCell, "anonymousCell");
        return new ReviewFormAnonymousDTO(uploadKey, anonymousCell, isEditReview);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ReviewFormAnonymousDTO)) {
            return false;
        }
        ReviewFormAnonymousDTO reviewFormAnonymousDTO = (ReviewFormAnonymousDTO) other;
        return Intrinsics.d(this.uploadKey, reviewFormAnonymousDTO.uploadKey) && Intrinsics.d(this.anonymousCell, reviewFormAnonymousDTO.anonymousCell) && this.isEditReview == reviewFormAnonymousDTO.isEditReview;
    }

    @NotNull
    public final CellDTO getAnonymousCell() {
        return this.anonymousCell;
    }

    @NotNull
    public final String getUploadKey() {
        return this.uploadKey;
    }

    public int hashCode() {
        return Boolean.hashCode(this.isEditReview) + b.c(this.anonymousCell, this.uploadKey.hashCode() * 31, 31);
    }

    public final boolean isEditReview() {
        return this.isEditReview;
    }

    @NotNull
    public String toString() {
        String str = this.uploadKey;
        CellDTO cellDTO = this.anonymousCell;
        boolean z11 = this.isEditReview;
        StringBuilder sb2 = new StringBuilder("ReviewFormAnonymousDTO(uploadKey=");
        sb2.append(str);
        sb2.append(", anonymousCell=");
        sb2.append(cellDTO);
        sb2.append(", isEditReview=");
        return a.a(")", sb2, z11);
    }
}
