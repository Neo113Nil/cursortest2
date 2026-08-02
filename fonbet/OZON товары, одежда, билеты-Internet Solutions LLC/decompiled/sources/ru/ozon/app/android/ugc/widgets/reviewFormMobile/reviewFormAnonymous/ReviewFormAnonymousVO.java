package ru.ozon.app.android.ugc.widgets.reviewFormMobile.reviewFormAnonymous;

import Ak.C2436a;
import G.g;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import l20.c;
import org.jetbrains.annotations.NotNull;
import ru.ozon.uni.atoms.data.dsCell.CellDTO;

@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000b\b\u0081\b\u0018\u00002\u00060\u0001j\u0002`\u0002B\u001f\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ.\u0010\u000b\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u0007HÆ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0015\u001a\u00020\u00142\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012HÖ\u0003¢\u0006\u0004\b\u0015\u0010\u0016R\u001a\u0010\u0004\u001a\u00020\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u001a\u001a\u0004\b\u001b\u0010\u000eR\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001e¨\u0006\u001f"}, d2 = {"Lru/ozon/app/android/ugc/widgets/reviewFormMobile/reviewFormAnonymous/ReviewFormAnonymousVO;", "Ll20/c;", "Lru/ozon/app/android/composer/view/ViewObject;", "", "id", "", "uploadKey", "Lru/ozon/uni/atoms/data/dsCell/CellDTO;", "anonymousCell", "<init>", "(JLjava/lang/String;Lru/ozon/uni/atoms/data/dsCell/CellDTO;)V", "copy", "(JLjava/lang/String;Lru/ozon/uni/atoms/data/dsCell/CellDTO;)Lru/ozon/app/android/ugc/widgets/reviewFormMobile/reviewFormAnonymous/ReviewFormAnonymousVO;", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "J", "getId", "()J", "Ljava/lang/String;", "getUploadKey", "Lru/ozon/uni/atoms/data/dsCell/CellDTO;", "getAnonymousCell", "()Lru/ozon/uni/atoms/data/dsCell/CellDTO;", "ugc_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class ReviewFormAnonymousVO implements c {
    public static final int $stable = CellDTO.$stable;

    @NotNull
    private final CellDTO anonymousCell;
    private final long id;

    @NotNull
    private final String uploadKey;

    public ReviewFormAnonymousVO(long j11, @NotNull String uploadKey, @NotNull CellDTO anonymousCell) {
        Intrinsics.checkNotNullParameter(uploadKey, "uploadKey");
        Intrinsics.checkNotNullParameter(anonymousCell, "anonymousCell");
        this.id = j11;
        this.uploadKey = uploadKey;
        this.anonymousCell = anonymousCell;
    }

    public static /* synthetic */ ReviewFormAnonymousVO copy$default(ReviewFormAnonymousVO reviewFormAnonymousVO, long j11, String str, CellDTO cellDTO, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            j11 = reviewFormAnonymousVO.id;
        }
        if ((i11 & 2) != 0) {
            str = reviewFormAnonymousVO.uploadKey;
        }
        if ((i11 & 4) != 0) {
            cellDTO = reviewFormAnonymousVO.anonymousCell;
        }
        return reviewFormAnonymousVO.copy(j11, str, cellDTO);
    }

    @NotNull
    public final ReviewFormAnonymousVO copy(long id2, @NotNull String uploadKey, @NotNull CellDTO anonymousCell) {
        Intrinsics.checkNotNullParameter(uploadKey, "uploadKey");
        Intrinsics.checkNotNullParameter(anonymousCell, "anonymousCell");
        return new ReviewFormAnonymousVO(id2, uploadKey, anonymousCell);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ReviewFormAnonymousVO)) {
            return false;
        }
        ReviewFormAnonymousVO reviewFormAnonymousVO = (ReviewFormAnonymousVO) other;
        return this.id == reviewFormAnonymousVO.id && Intrinsics.d(this.uploadKey, reviewFormAnonymousVO.uploadKey) && Intrinsics.d(this.anonymousCell, reviewFormAnonymousVO.anonymousCell);
    }

    @NotNull
    public final CellDTO getAnonymousCell() {
        return this.anonymousCell;
    }

    @Override // l20.c
    public long getId() {
        return this.id;
    }

    @Override // l20.c
    public Integer getScrollWidgetKey() {
        return null;
    }

    @NotNull
    public final String getUploadKey() {
        return this.uploadKey;
    }

    @Override // l20.c
    public int getViewItemKey() {
        return hashCode();
    }

    public int hashCode() {
        return this.anonymousCell.hashCode() + g.a(Long.hashCode(this.id) * 31, 31, this.uploadKey);
    }

    @NotNull
    public String toString() {
        long j11 = this.id;
        String str = this.uploadKey;
        CellDTO cellDTO = this.anonymousCell;
        StringBuilder c11 = C2436a.c(j11, "ReviewFormAnonymousVO(id=", ", uploadKey=", str);
        c11.append(", anonymousCell=");
        c11.append(cellDTO);
        c11.append(")");
        return c11.toString();
    }
}
