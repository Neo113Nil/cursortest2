package ru.ozon.uni.android.ds.compose.component.rating;

import Sc.o;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.uni.atoms.data.rating.RatingDTO;

@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u0011\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u0000¢\u0006\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"toDsStyle", "Lru/ozon/uni/android/ds/compose/component/rating/DsRatingStyle;", "Lru/ozon/uni/atoms/data/rating/RatingDTO$RatingStyle;", "(Lru/ozon/uni/atoms/data/rating/RatingDTO$RatingStyle;)I", "uni_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class DsRatingStyleKt {

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[RatingDTO.RatingStyle.values().length];
            try {
                iArr[RatingDTO.RatingStyle.DEFAULT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[RatingDTO.RatingStyle.DEFAULT_ON_DARK.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[RatingDTO.RatingStyle.STATIC_ON_DARK.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[RatingDTO.RatingStyle.CUSTOM.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public static final int toDsStyle(@NotNull RatingDTO.RatingStyle ratingStyle) {
        Intrinsics.checkNotNullParameter(ratingStyle, "<this>");
        int i11 = WhenMappings.$EnumSwitchMapping$0[ratingStyle.ordinal()];
        if (i11 == 1) {
            return DsRatingStyle.INSTANCE.m1770getDEFAULTsnpJkgg();
        }
        if (i11 == 2) {
            return DsRatingStyle.INSTANCE.m1771getDEFAULT_ON_DARKsnpJkgg();
        }
        if (i11 == 3) {
            return DsRatingStyle.INSTANCE.m1772getSTATIC_ON_DARKsnpJkgg();
        }
        if (i11 == 4) {
            return DsRatingStyle.INSTANCE.m1769getCUSTOMsnpJkgg();
        }
        throw new o();
    }
}
