package ru.ozon.uni.android.ds.compose.component.rating;

import Sc.o;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.uni.atoms.data.rating.RatingDTO;

@Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u001a\f\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u0000¨\u0006\u0003"}, d2 = {"toDsSize", "Lru/ozon/uni/android/ds/compose/component/rating/DsRatingSize;", "Lru/ozon/uni/atoms/data/rating/RatingDTO$RatingSize;", "uni_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class DsRatingSizeKt {

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[RatingDTO.RatingSize.values().length];
            try {
                iArr[RatingDTO.RatingSize.SIZE_200.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[RatingDTO.RatingSize.SIZE_300.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[RatingDTO.RatingSize.SIZE_500.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[RatingDTO.RatingSize.SIZE_525.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[RatingDTO.RatingSize.SIZE_600.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[RatingDTO.RatingSize.SIZE_700.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    @NotNull
    public static final DsRatingSize toDsSize(@NotNull RatingDTO.RatingSize ratingSize) {
        Intrinsics.checkNotNullParameter(ratingSize, "<this>");
        switch (WhenMappings.$EnumSwitchMapping$0[ratingSize.ordinal()]) {
            case 1:
                return DsRatingSize.SIZE_200;
            case 2:
                return DsRatingSize.SIZE_300;
            case 3:
                return DsRatingSize.SIZE_500;
            case 4:
                return DsRatingSize.SIZE_525;
            case 5:
                return DsRatingSize.SIZE_600;
            case 6:
                return DsRatingSize.SIZE_700;
            default:
                throw new o();
        }
    }
}
