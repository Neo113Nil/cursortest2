package ru.ozon.uni.android.ds.compose.component.badge;

import S0.InterfaceC3967k;
import Sc.o;
import android.content.Context;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.uni.android.ds.UniGlobalConfigKt;
import ru.ozon.uni.android.ds.compose.util.DsSpacings;
import ru.ozon.uni.atoms.data.dsBadge.BadgeDTO;

@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0013\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u0000¢\u0006\u0004\b\u0002\u0010\u0003\u001a#\u0010\b\u001a\u00020\u00072\u0006\u0010\u0004\u001a\u00020\u00012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005H\u0001¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lru/ozon/uni/atoms/data/dsBadge/BadgeDTO$BadgeSize;", "Lru/ozon/uni/android/ds/compose/component/badge/DsBadgeSize;", "toVo", "(Lru/ozon/uni/atoms/data/dsBadge/BadgeDTO$BadgeSize;)Lru/ozon/uni/android/ds/compose/component/badge/DsBadgeSize;", "size", "", "roundCorners", "LZ1/h;", "getBadgeCornerRadius", "(Lru/ozon/uni/android/ds/compose/component/badge/DsBadgeSize;Ljava/lang/Boolean;LS0/k;II)F", "uni_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class DsBadgeMappersKt {

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;

        static {
            int[] iArr = new int[BadgeDTO.BadgeSize.values().length];
            try {
                iArr[BadgeDTO.BadgeSize.SIZE_200.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[BadgeDTO.BadgeSize.SIZE_300.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[BadgeDTO.BadgeSize.SIZE_400.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[BadgeDTO.BadgeSize.SIZE_500.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[BadgeDTO.BadgeSize.SIZE_600.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[DsBadgeSize.values().length];
            try {
                iArr2[DsBadgeSize.SIZE_200.ordinal()] = 1;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr2[DsBadgeSize.SIZE_400.ordinal()] = 2;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr2[DsBadgeSize.SIZE_300.ordinal()] = 3;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr2[DsBadgeSize.SIZE_500.ordinal()] = 4;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr2[DsBadgeSize.SIZE_600.ordinal()] = 5;
            } catch (NoSuchFieldError unused10) {
            }
            $EnumSwitchMapping$1 = iArr2;
        }
    }

    public static final float getBadgeCornerRadius(@NotNull DsBadgeSize size, Boolean bool, InterfaceC3967k interfaceC3967k, int i11, int i12) {
        float m1859getDp6D9Ej5fM;
        Intrinsics.checkNotNullParameter(size, "size");
        interfaceC3967k.o(1361648452);
        if ((i12 & 2) != 0) {
            bool = null;
        }
        interfaceC3967k.o(-1453157270);
        boolean roundCornersFlag = bool == null ? UniGlobalConfigKt.getRoundCornersFlag((Context) interfaceC3967k.m(AndroidCompositionLocals_androidKt.d())) : bool.booleanValue();
        interfaceC3967k.k();
        if (roundCornersFlag) {
            m1859getDp6D9Ej5fM = 99;
        } else {
            int i13 = WhenMappings.$EnumSwitchMapping$1[size.ordinal()];
            if (i13 == 1 || i13 == 2) {
                m1859getDp6D9Ej5fM = DsSpacings.INSTANCE.m1859getDp6D9Ej5fM();
            } else if (i13 == 3) {
                m1859getDp6D9Ej5fM = DsSpacings.INSTANCE.m1857getDp5D9Ej5fM();
            } else if (i13 == 4) {
                m1859getDp6D9Ej5fM = DsSpacings.INSTANCE.m1861getDp8D9Ej5fM();
            } else {
                if (i13 != 5) {
                    throw new o();
                }
                m1859getDp6D9Ej5fM = DsSpacings.INSTANCE.m1842getDp12D9Ej5fM();
            }
        }
        interfaceC3967k.k();
        return m1859getDp6D9Ej5fM;
    }

    @NotNull
    public static final DsBadgeSize toVo(@NotNull BadgeDTO.BadgeSize badgeSize) {
        Intrinsics.checkNotNullParameter(badgeSize, "<this>");
        int i11 = WhenMappings.$EnumSwitchMapping$0[badgeSize.ordinal()];
        if (i11 == 1) {
            return DsBadgeSize.SIZE_200;
        }
        if (i11 == 2) {
            return DsBadgeSize.SIZE_300;
        }
        if (i11 == 3) {
            return DsBadgeSize.SIZE_400;
        }
        if (i11 == 4) {
            return DsBadgeSize.SIZE_500;
        }
        if (i11 == 5) {
            return DsBadgeSize.SIZE_600;
        }
        throw new o();
    }
}
