package ru.ozon.uni.android.atom.badge;

import Sc.o;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.uni.R$style;
import ru.ozon.uni.atoms.data.dsBadge.BadgeDTO;

@Metadata(d1 = {"\u0000\u0016\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0017\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u0000¢\u0006\u0004\b\u0003\u0010\u0004\u001a\u0013\u0010\u0006\u001a\u00020\u0000*\u00020\u0005H\u0000¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"", "resId", "Lru/ozon/uni/atoms/data/dsBadge/BadgeDTO$Style;", "getListStyleByResId", "(I)Lru/ozon/uni/atoms/data/dsBadge/BadgeDTO$Style;", "Lru/ozon/uni/atoms/data/dsBadge/BadgeDTO$BadgeSize;", "getSize", "(Lru/ozon/uni/atoms/data/dsBadge/BadgeDTO$BadgeSize;)I", "uni_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class BadgeCommonKt {

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;

        static {
            int[] iArr = new int[BadgeDTO.Style.values().length];
            try {
                iArr[BadgeDTO.Style.NEUTRAL_PRIMARY.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[BadgeDTO.Style.NEUTRAL_SECONDARY.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[BadgeDTO.Style.WARNING_PRIMARY.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[BadgeDTO.Style.WARNING_SECONDARY.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[BadgeDTO.Style.NEGATIVE_PRIMARY.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[BadgeDTO.Style.NEGATIVE_SECONDARY.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[BadgeDTO.Style.BIG_PROMO.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr[BadgeDTO.Style.NEUTRAL_STATIC_PRIMARY.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[BadgeDTO.BadgeSize.values().length];
            try {
                iArr2[BadgeDTO.BadgeSize.SIZE_200.ordinal()] = 1;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr2[BadgeDTO.BadgeSize.SIZE_300.ordinal()] = 2;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                iArr2[BadgeDTO.BadgeSize.SIZE_400.ordinal()] = 3;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                iArr2[BadgeDTO.BadgeSize.SIZE_500.ordinal()] = 4;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                iArr2[BadgeDTO.BadgeSize.SIZE_600.ordinal()] = 5;
            } catch (NoSuchFieldError unused13) {
            }
            $EnumSwitchMapping$1 = iArr2;
        }
    }

    @NotNull
    public static final BadgeDTO.Style getListStyleByResId(int i11) {
        return i11 == R$style.BadgeList_Neutral_Primary ? BadgeDTO.Style.NEUTRAL_PRIMARY : i11 == R$style.BadgeList_Neutral_Secondary ? BadgeDTO.Style.NEUTRAL_SECONDARY : i11 == R$style.BadgeList_Warning_Primary ? BadgeDTO.Style.WARNING_PRIMARY : i11 == R$style.BadgeList_Warning_Secondary ? BadgeDTO.Style.WARNING_SECONDARY : i11 == R$style.BadgeList_Negative_Primary ? BadgeDTO.Style.NEGATIVE_PRIMARY : i11 == R$style.BadgeList_Negative_Secondary ? BadgeDTO.Style.NEGATIVE_SECONDARY : BadgeDTO.Style.NEUTRAL_SECONDARY;
    }

    public static final int getSize(@NotNull BadgeDTO.BadgeSize badgeSize) {
        Intrinsics.checkNotNullParameter(badgeSize, "<this>");
        int i11 = WhenMappings.$EnumSwitchMapping$1[badgeSize.ordinal()];
        if (i11 == 1) {
            return 14;
        }
        if (i11 == 2) {
            return 16;
        }
        if (i11 == 3) {
            return 20;
        }
        if (i11 == 4) {
            return 24;
        }
        if (i11 == 5) {
            return 32;
        }
        throw new o();
    }
}
