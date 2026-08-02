package ru.ozon.app.android.ugc.widgets.reviewFormMobile.reviewFormPointsProgress;

import D40.c;
import G.g;
import Xc.a;
import Xc.b;
import com.squareup.moshi.j;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.ugc.widgets.reviewFormMobile.presentation.HigherPointsTerms;
import ru.ozon.uni.atoms.data.dsCell.CellDTO;

@j(generateAdapter = true)
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0081\b\u0018\u00002\u00020\u0001:\u0001 B5\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t0\u0007\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\f\u0010\rJ\t\u0010\u0016\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0017\u001a\u00020\u0005HÆ\u0003J\u0015\u0010\u0018\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t0\u0007HÆ\u0003J\u000b\u0010\u0019\u001a\u0004\u0018\u00010\u000bHÆ\u0003J?\u0010\u001a\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\u0014\b\u0002\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t0\u00072\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000bHÆ\u0001J\u0013\u0010\u001b\u001a\u00020\u001c2\b\u0010\u001d\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001e\u001a\u00020\tHÖ\u0001J\t\u0010\u001f\u001a\u00020\u0005HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u001d\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t0\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0013\u0010\n\u001a\u0004\u0018\u00010\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015¨\u0006!"}, d2 = {"Lru/ozon/app/android/ugc/widgets/reviewFormMobile/reviewFormPointsProgress/ReviewFormPointsProgressDTO;", "", "pointsCell", "Lru/ozon/uni/atoms/data/dsCell/CellDTO;", "progressBarColor", "", "pointsMap", "", "Lru/ozon/app/android/ugc/widgets/reviewFormMobile/reviewFormPointsProgress/ReviewFormPointsProgressDTO$FieldType;", "", "higherPointsTerms", "Lru/ozon/app/android/ugc/widgets/reviewFormMobile/presentation/HigherPointsTerms;", "<init>", "(Lru/ozon/uni/atoms/data/dsCell/CellDTO;Ljava/lang/String;Ljava/util/Map;Lru/ozon/app/android/ugc/widgets/reviewFormMobile/presentation/HigherPointsTerms;)V", "getPointsCell", "()Lru/ozon/uni/atoms/data/dsCell/CellDTO;", "getProgressBarColor", "()Ljava/lang/String;", "getPointsMap", "()Ljava/util/Map;", "getHigherPointsTerms", "()Lru/ozon/app/android/ugc/widgets/reviewFormMobile/presentation/HigherPointsTerms;", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "toString", "FieldType", "ugc_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class ReviewFormPointsProgressDTO {
    public static final int $stable = 8;
    private final HigherPointsTerms higherPointsTerms;

    @NotNull
    private final CellDTO pointsCell;

    @NotNull
    private final Map<FieldType, Integer> pointsMap;

    @NotNull
    private final String progressBarColor;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\t\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\t¨\u0006\n"}, d2 = {"Lru/ozon/app/android/ugc/widgets/reviewFormMobile/reviewFormPointsProgress/ReviewFormPointsProgressDTO$FieldType;", "", "<init>", "(Ljava/lang/String;I)V", "EMPTY", "COMMENT", "PHOTO", "VIDEO", "DETAILED_REVIEW", "RATING", "ugc_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class FieldType {
        private static final /* synthetic */ a $ENTRIES;
        private static final /* synthetic */ FieldType[] $VALUES;
        public static final FieldType EMPTY = new FieldType("EMPTY", 0);
        public static final FieldType COMMENT = new FieldType("COMMENT", 1);
        public static final FieldType PHOTO = new FieldType("PHOTO", 2);
        public static final FieldType VIDEO = new FieldType("VIDEO", 3);
        public static final FieldType DETAILED_REVIEW = new FieldType("DETAILED_REVIEW", 4);
        public static final FieldType RATING = new FieldType("RATING", 5);

        private static final /* synthetic */ FieldType[] $values() {
            return new FieldType[]{EMPTY, COMMENT, PHOTO, VIDEO, DETAILED_REVIEW, RATING};
        }

        static {
            FieldType[] $values = $values();
            $VALUES = $values;
            $ENTRIES = b.a($values);
        }

        private FieldType(String str, int i11) {
        }

        public static FieldType valueOf(String str) {
            return (FieldType) Enum.valueOf(FieldType.class, str);
        }

        public static FieldType[] values() {
            return (FieldType[]) $VALUES.clone();
        }
    }

    public ReviewFormPointsProgressDTO(@NotNull CellDTO pointsCell, @NotNull String progressBarColor, @NotNull Map<FieldType, Integer> pointsMap, HigherPointsTerms higherPointsTerms) {
        Intrinsics.checkNotNullParameter(pointsCell, "pointsCell");
        Intrinsics.checkNotNullParameter(progressBarColor, "progressBarColor");
        Intrinsics.checkNotNullParameter(pointsMap, "pointsMap");
        this.pointsCell = pointsCell;
        this.progressBarColor = progressBarColor;
        this.pointsMap = pointsMap;
        this.higherPointsTerms = higherPointsTerms;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ ReviewFormPointsProgressDTO copy$default(ReviewFormPointsProgressDTO reviewFormPointsProgressDTO, CellDTO cellDTO, String str, Map map, HigherPointsTerms higherPointsTerms, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            cellDTO = reviewFormPointsProgressDTO.pointsCell;
        }
        if ((i11 & 2) != 0) {
            str = reviewFormPointsProgressDTO.progressBarColor;
        }
        if ((i11 & 4) != 0) {
            map = reviewFormPointsProgressDTO.pointsMap;
        }
        if ((i11 & 8) != 0) {
            higherPointsTerms = reviewFormPointsProgressDTO.higherPointsTerms;
        }
        return reviewFormPointsProgressDTO.copy(cellDTO, str, map, higherPointsTerms);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final CellDTO getPointsCell() {
        return this.pointsCell;
    }

    @NotNull
    /* renamed from: component2, reason: from getter */
    public final String getProgressBarColor() {
        return this.progressBarColor;
    }

    @NotNull
    public final Map<FieldType, Integer> component3() {
        return this.pointsMap;
    }

    /* renamed from: component4, reason: from getter */
    public final HigherPointsTerms getHigherPointsTerms() {
        return this.higherPointsTerms;
    }

    @NotNull
    public final ReviewFormPointsProgressDTO copy(@NotNull CellDTO pointsCell, @NotNull String progressBarColor, @NotNull Map<FieldType, Integer> pointsMap, HigherPointsTerms higherPointsTerms) {
        Intrinsics.checkNotNullParameter(pointsCell, "pointsCell");
        Intrinsics.checkNotNullParameter(progressBarColor, "progressBarColor");
        Intrinsics.checkNotNullParameter(pointsMap, "pointsMap");
        return new ReviewFormPointsProgressDTO(pointsCell, progressBarColor, pointsMap, higherPointsTerms);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ReviewFormPointsProgressDTO)) {
            return false;
        }
        ReviewFormPointsProgressDTO reviewFormPointsProgressDTO = (ReviewFormPointsProgressDTO) other;
        return Intrinsics.d(this.pointsCell, reviewFormPointsProgressDTO.pointsCell) && Intrinsics.d(this.progressBarColor, reviewFormPointsProgressDTO.progressBarColor) && Intrinsics.d(this.pointsMap, reviewFormPointsProgressDTO.pointsMap) && Intrinsics.d(this.higherPointsTerms, reviewFormPointsProgressDTO.higherPointsTerms);
    }

    public final HigherPointsTerms getHigherPointsTerms() {
        return this.higherPointsTerms;
    }

    @NotNull
    public final CellDTO getPointsCell() {
        return this.pointsCell;
    }

    @NotNull
    public final Map<FieldType, Integer> getPointsMap() {
        return this.pointsMap;
    }

    @NotNull
    public final String getProgressBarColor() {
        return this.progressBarColor;
    }

    public int hashCode() {
        int a11 = c.a(this.pointsMap, g.a(this.pointsCell.hashCode() * 31, 31, this.progressBarColor), 31);
        HigherPointsTerms higherPointsTerms = this.higherPointsTerms;
        return a11 + (higherPointsTerms == null ? 0 : higherPointsTerms.hashCode());
    }

    @NotNull
    public String toString() {
        return "ReviewFormPointsProgressDTO(pointsCell=" + this.pointsCell + ", progressBarColor=" + this.progressBarColor + ", pointsMap=" + this.pointsMap + ", higherPointsTerms=" + this.higherPointsTerms + ")";
    }
}
