package ru.ozon.app.android.ugc.widgets.reviewFormMobile.reviewFormPointsProgress;

import B0.C2454a;
import Bi.b;
import D3.h;
import G.g;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import l20.c;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.ugc.widgets.reviewFormMobile.presentation.HigherPointsTerms;
import ru.ozon.app.android.ugc.widgets.reviewFormMobile.reviewFormPointsProgress.ReviewFormPointsProgressDTO;
import ru.ozon.uni.atoms.data.dsCell.CellDTO;

@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0013\b\u0081\b\u0018\u00002\u00060\u0001j\u0002`\u0002BE\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0012\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b0\t\u0012\u0006\u0010\r\u001a\u00020\u000b\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u001a\u0010\u0019\u001a\u00020\u00182\b\u0010\u0017\u001a\u0004\u0018\u00010\u0016HÖ\u0003¢\u0006\u0004\b\u0019\u0010\u001aR\u001a\u0010\u0004\u001a\u00020\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u001e\u001a\u0004\b\u001f\u0010 R\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010!\u001a\u0004\b\"\u0010\u0013R#\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b0\t8\u0006¢\u0006\f\n\u0004\b\f\u0010#\u001a\u0004\b$\u0010%R\u0017\u0010\r\u001a\u00020\u000b8\u0006¢\u0006\f\n\u0004\b\r\u0010&\u001a\u0004\b'\u0010\u0015R\u0019\u0010\u000f\u001a\u0004\u0018\u00010\u000e8\u0006¢\u0006\f\n\u0004\b\u000f\u0010(\u001a\u0004\b)\u0010*¨\u0006+"}, d2 = {"Lru/ozon/app/android/ugc/widgets/reviewFormMobile/reviewFormPointsProgress/ReviewFormPointsProgressVO;", "Ll20/c;", "Lru/ozon/app/android/composer/view/ViewObject;", "", "id", "Lru/ozon/uni/atoms/data/dsCell/CellDTO;", "pointsCell", "", "progressBarColor", "", "Lru/ozon/app/android/ugc/widgets/reviewFormMobile/reviewFormPointsProgress/ReviewFormPointsProgressDTO$FieldType;", "", "pointsMap", "maxPoints", "Lru/ozon/app/android/ugc/widgets/reviewFormMobile/presentation/HigherPointsTerms;", "higherPointsTerms", "<init>", "(JLru/ozon/uni/atoms/data/dsCell/CellDTO;Ljava/lang/String;Ljava/util/Map;ILru/ozon/app/android/ugc/widgets/reviewFormMobile/presentation/HigherPointsTerms;)V", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "J", "getId", "()J", "Lru/ozon/uni/atoms/data/dsCell/CellDTO;", "getPointsCell", "()Lru/ozon/uni/atoms/data/dsCell/CellDTO;", "Ljava/lang/String;", "getProgressBarColor", "Ljava/util/Map;", "getPointsMap", "()Ljava/util/Map;", "I", "getMaxPoints", "Lru/ozon/app/android/ugc/widgets/reviewFormMobile/presentation/HigherPointsTerms;", "getHigherPointsTerms", "()Lru/ozon/app/android/ugc/widgets/reviewFormMobile/presentation/HigherPointsTerms;", "ugc_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class ReviewFormPointsProgressVO implements c {
    private final HigherPointsTerms higherPointsTerms;
    private final long id;
    private final int maxPoints;

    @NotNull
    private final CellDTO pointsCell;

    @NotNull
    private final Map<ReviewFormPointsProgressDTO.FieldType, Integer> pointsMap;

    @NotNull
    private final String progressBarColor;

    public ReviewFormPointsProgressVO(long j11, @NotNull CellDTO pointsCell, @NotNull String progressBarColor, @NotNull Map<ReviewFormPointsProgressDTO.FieldType, Integer> pointsMap, int i11, HigherPointsTerms higherPointsTerms) {
        Intrinsics.checkNotNullParameter(pointsCell, "pointsCell");
        Intrinsics.checkNotNullParameter(progressBarColor, "progressBarColor");
        Intrinsics.checkNotNullParameter(pointsMap, "pointsMap");
        this.id = j11;
        this.pointsCell = pointsCell;
        this.progressBarColor = progressBarColor;
        this.pointsMap = pointsMap;
        this.maxPoints = i11;
        this.higherPointsTerms = higherPointsTerms;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ReviewFormPointsProgressVO)) {
            return false;
        }
        ReviewFormPointsProgressVO reviewFormPointsProgressVO = (ReviewFormPointsProgressVO) other;
        return this.id == reviewFormPointsProgressVO.id && Intrinsics.d(this.pointsCell, reviewFormPointsProgressVO.pointsCell) && Intrinsics.d(this.progressBarColor, reviewFormPointsProgressVO.progressBarColor) && Intrinsics.d(this.pointsMap, reviewFormPointsProgressVO.pointsMap) && this.maxPoints == reviewFormPointsProgressVO.maxPoints && Intrinsics.d(this.higherPointsTerms, reviewFormPointsProgressVO.higherPointsTerms);
    }

    public final HigherPointsTerms getHigherPointsTerms() {
        return this.higherPointsTerms;
    }

    @Override // l20.c
    public long getId() {
        return this.id;
    }

    public final int getMaxPoints() {
        return this.maxPoints;
    }

    @NotNull
    public final CellDTO getPointsCell() {
        return this.pointsCell;
    }

    @NotNull
    public final Map<ReviewFormPointsProgressDTO.FieldType, Integer> getPointsMap() {
        return this.pointsMap;
    }

    @NotNull
    public final String getProgressBarColor() {
        return this.progressBarColor;
    }

    @Override // l20.c
    public Integer getScrollWidgetKey() {
        return null;
    }

    @Override // l20.c
    public int getViewItemKey() {
        return hashCode();
    }

    public int hashCode() {
        int a11 = C2454a.a(this.maxPoints, D40.c.a(this.pointsMap, g.a(b.c(this.pointsCell, Long.hashCode(this.id) * 31, 31), 31, this.progressBarColor), 31), 31);
        HigherPointsTerms higherPointsTerms = this.higherPointsTerms;
        return a11 + (higherPointsTerms == null ? 0 : higherPointsTerms.hashCode());
    }

    @NotNull
    public String toString() {
        long j11 = this.id;
        CellDTO cellDTO = this.pointsCell;
        String str = this.progressBarColor;
        Map<ReviewFormPointsProgressDTO.FieldType, Integer> map = this.pointsMap;
        int i11 = this.maxPoints;
        HigherPointsTerms higherPointsTerms = this.higherPointsTerms;
        StringBuilder e11 = h.e("ReviewFormPointsProgressVO(id=", j11, ", pointsCell=", cellDTO);
        e11.append(", progressBarColor=");
        e11.append(str);
        e11.append(", pointsMap=");
        e11.append(map);
        e11.append(", maxPoints=");
        e11.append(i11);
        e11.append(", higherPointsTerms=");
        e11.append(higherPointsTerms);
        e11.append(")");
        return e11.toString();
    }
}
