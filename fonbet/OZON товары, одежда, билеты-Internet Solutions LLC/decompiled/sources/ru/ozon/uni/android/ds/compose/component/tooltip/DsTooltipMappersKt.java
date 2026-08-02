package ru.ozon.uni.android.ds.compose.component.tooltip;

import S0.InterfaceC3967k;
import Sc.o;
import U7.l;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.uni.android.ds.compose.component.tooltip.DsTooltipBeakPosition;
import ru.ozon.uni.atoms.data.common.TooltipDTO;

@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0013\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u0001¢\u0006\u0004\b\u0002\u0010\u0003\u001a#\u0010\t\u001a\u00020\b*\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0005H\u0000¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lru/ozon/uni/atoms/data/common/TooltipDTO$StyleType;", "Lru/ozon/uni/android/ds/compose/component/tooltip/DsTooltipStyle;", "toStyle", "(Lru/ozon/uni/atoms/data/common/TooltipDTO$StyleType;LS0/k;I)Lru/ozon/uni/android/ds/compose/component/tooltip/DsTooltipStyle;", "Lru/ozon/uni/atoms/data/common/TooltipDTO$BeakPosition;", "", "leftMargin", "rightMargin", "Lru/ozon/uni/android/ds/compose/component/tooltip/DsTooltipBeakPosition;", "toBeakPosition", "(Lru/ozon/uni/atoms/data/common/TooltipDTO$BeakPosition;II)Lru/ozon/uni/android/ds/compose/component/tooltip/DsTooltipBeakPosition;", "uni_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class DsTooltipMappersKt {

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;

        static {
            int[] iArr = new int[TooltipDTO.StyleType.values().length];
            try {
                iArr[TooltipDTO.StyleType.DEFAULT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[TooltipDTO.StyleType.STATIC_LIGHT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[TooltipDTO.StyleType.STATIC_DARK.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[TooltipDTO.BeakPosition.values().length];
            try {
                iArr2[TooltipDTO.BeakPosition.BOTTOM_CENTER.ordinal()] = 1;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr2[TooltipDTO.BeakPosition.TOP_CENTER.ordinal()] = 2;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr2[TooltipDTO.BeakPosition.LEFT_CENTER.ordinal()] = 3;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr2[TooltipDTO.BeakPosition.RIGHT_CENTER.ordinal()] = 4;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr2[TooltipDTO.BeakPosition.TOP_CUSTOM.ordinal()] = 5;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr2[TooltipDTO.BeakPosition.BOTTOM_CUSTOM.ordinal()] = 6;
            } catch (NoSuchFieldError unused9) {
            }
            $EnumSwitchMapping$1 = iArr2;
        }
    }

    @NotNull
    public static final DsTooltipBeakPosition toBeakPosition(@NotNull TooltipDTO.BeakPosition beakPosition, int i11, int i12) {
        Intrinsics.checkNotNullParameter(beakPosition, "<this>");
        switch (WhenMappings.$EnumSwitchMapping$1[beakPosition.ordinal()]) {
            case 1:
                return DsTooltipBeakPosition.BottomCenter.INSTANCE;
            case 2:
                return DsTooltipBeakPosition.TopCenter.INSTANCE;
            case 3:
                return DsTooltipBeakPosition.Left.INSTANCE;
            case 4:
                return DsTooltipBeakPosition.Right.INSTANCE;
            case 5:
                return new DsTooltipBeakPosition.TopCustom(i11, i12);
            case 6:
                return new DsTooltipBeakPosition.BottomCustom(i11, i12);
            default:
                throw new o();
        }
    }

    @NotNull
    public static final DsTooltipStyle toStyle(@NotNull TooltipDTO.StyleType styleType, InterfaceC3967k interfaceC3967k, int i11) {
        DsTooltipStyle m1835default;
        Intrinsics.checkNotNullParameter(styleType, "<this>");
        interfaceC3967k.o(2018865245);
        int i12 = WhenMappings.$EnumSwitchMapping$0[styleType.ordinal()];
        if (i12 == 1) {
            interfaceC3967k.o(1190720862);
            m1835default = DsTooltipStyle.INSTANCE.m1835default(interfaceC3967k, 6);
            interfaceC3967k.k();
        } else if (i12 == 2) {
            interfaceC3967k.o(1190722978);
            m1835default = DsTooltipStyle.INSTANCE.staticLight(interfaceC3967k, 6);
            interfaceC3967k.k();
        } else {
            if (i12 != 3) {
                throw l.c(interfaceC3967k, 1190718987);
            }
            interfaceC3967k.o(1190725185);
            m1835default = DsTooltipStyle.INSTANCE.staticDark(interfaceC3967k, 6);
            interfaceC3967k.k();
        }
        interfaceC3967k.k();
        return m1835default;
    }
}
