package ru.ozon.uni.android.ds.compose.component.selectionControls.checkbox;

import J1.a;
import S0.InterfaceC3967k;
import Sc.o;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.uni.android.ds.compose.component.selectionControls.checkbox.DsCheckboxSize;
import ru.ozon.uni.android.ds.compose.component.selectionControls.checkbox.DsCheckboxStyle;
import ru.ozon.uni.atoms.data.selectionControls.checkbox.CheckBoxDTO;
import ru.ozon.uni.core.compose.tokens.TokenParserKt;

@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a\u0015\u0010\u0002\u001a\u00020\u0001*\u0004\u0018\u00010\u0000H\u0000¢\u0006\u0004\b\u0002\u0010\u0003\u001a\u0015\u0010\u0002\u001a\u00020\u0005*\u0004\u0018\u00010\u0004H\u0000¢\u0006\u0004\b\u0002\u0010\u0006\u001a\u0015\u0010\u0002\u001a\u00020\b*\u0004\u0018\u00010\u0007H\u0000¢\u0006\u0004\b\u0002\u0010\t\u001a\u0013\u0010\u000b\u001a\u00020\n*\u00020\u0001H\u0000¢\u0006\u0004\b\u000b\u0010\f\u001a-\u0010\u0012\u001a\u00020\u00112\b\u0010\u000e\u001a\u0004\u0018\u00010\r2\b\u0010\u000f\u001a\u0004\u0018\u00010\r2\b\u0010\u0010\u001a\u0004\u0018\u00010\rH\u0001¢\u0006\u0004\b\u0012\u0010\u0013\u001a\u001d\u0010\u0016\u001a\u00020\u0014*\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\rH\u0003¢\u0006\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, d2 = {"Lru/ozon/uni/atoms/data/selectionControls/checkbox/CheckBoxDTO$CheckboxStatus;", "Lru/ozon/uni/android/ds/compose/component/selectionControls/checkbox/DsCheckboxStatus;", "toVo", "(Lru/ozon/uni/atoms/data/selectionControls/checkbox/CheckBoxDTO$CheckboxStatus;)Lru/ozon/uni/android/ds/compose/component/selectionControls/checkbox/DsCheckboxStatus;", "Lru/ozon/uni/atoms/data/selectionControls/checkbox/CheckBoxDTO$CheckboxState;", "Lru/ozon/uni/android/ds/compose/component/selectionControls/checkbox/DsCheckboxState;", "(Lru/ozon/uni/atoms/data/selectionControls/checkbox/CheckBoxDTO$CheckboxState;)Lru/ozon/uni/android/ds/compose/component/selectionControls/checkbox/DsCheckboxState;", "Lru/ozon/uni/atoms/data/selectionControls/checkbox/CheckBoxDTO$CheckBoxSize;", "Lru/ozon/uni/android/ds/compose/component/selectionControls/checkbox/DsCheckboxSize;", "(Lru/ozon/uni/atoms/data/selectionControls/checkbox/CheckBoxDTO$CheckBoxSize;)Lru/ozon/uni/android/ds/compose/component/selectionControls/checkbox/DsCheckboxSize;", "LJ1/a;", "toToggleableState", "(Lru/ozon/uni/android/ds/compose/component/selectionControls/checkbox/DsCheckboxStatus;)LJ1/a;", "Lru/ozon/uni/atoms/data/selectionControls/checkbox/CheckBoxDTO$Style;", "customEnabledColors", "customErrorColors", "customDisabledColors", "Lru/ozon/uni/android/ds/compose/component/selectionControls/checkbox/DsCheckboxStyle;", "checkboxStyle", "(Lru/ozon/uni/atoms/data/selectionControls/checkbox/CheckBoxDTO$Style;Lru/ozon/uni/atoms/data/selectionControls/checkbox/CheckBoxDTO$Style;Lru/ozon/uni/atoms/data/selectionControls/checkbox/CheckBoxDTO$Style;LS0/k;I)Lru/ozon/uni/android/ds/compose/component/selectionControls/checkbox/DsCheckboxStyle;", "Lru/ozon/uni/android/ds/compose/component/selectionControls/checkbox/DsCheckboxStyle$DSCheckboxColoredProps;", "customColorProps", "mergeWithCustom", "(Lru/ozon/uni/android/ds/compose/component/selectionControls/checkbox/DsCheckboxStyle$DSCheckboxColoredProps;Lru/ozon/uni/atoms/data/selectionControls/checkbox/CheckBoxDTO$Style;LS0/k;I)Lru/ozon/uni/android/ds/compose/component/selectionControls/checkbox/DsCheckboxStyle$DSCheckboxColoredProps;", "uni_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class CheckboxMappersKt {

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;
        public static final /* synthetic */ int[] $EnumSwitchMapping$2;
        public static final /* synthetic */ int[] $EnumSwitchMapping$3;

        static {
            int[] iArr = new int[CheckBoxDTO.CheckboxStatus.values().length];
            try {
                iArr[CheckBoxDTO.CheckboxStatus.SELECTED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[CheckBoxDTO.CheckboxStatus.INDETERMINATE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[CheckBoxDTO.CheckboxState.values().length];
            try {
                iArr2[CheckBoxDTO.CheckboxState.DISABLED.ordinal()] = 1;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr2[CheckBoxDTO.CheckboxState.ERROR.ordinal()] = 2;
            } catch (NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$1 = iArr2;
            int[] iArr3 = new int[CheckBoxDTO.CheckBoxSize.values().length];
            try {
                iArr3[CheckBoxDTO.CheckBoxSize.SIZE_600.ordinal()] = 1;
            } catch (NoSuchFieldError unused5) {
            }
            $EnumSwitchMapping$2 = iArr3;
            int[] iArr4 = new int[DsCheckboxStatus.values().length];
            try {
                iArr4[DsCheckboxStatus.EMPTY.ordinal()] = 1;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr4[DsCheckboxStatus.SELECTED.ordinal()] = 2;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr4[DsCheckboxStatus.INDETERMINATE.ordinal()] = 3;
            } catch (NoSuchFieldError unused8) {
            }
            $EnumSwitchMapping$3 = iArr4;
        }
    }

    @NotNull
    public static final DsCheckboxStyle checkboxStyle(CheckBoxDTO.Style style, CheckBoxDTO.Style style2, CheckBoxDTO.Style style3, InterfaceC3967k interfaceC3967k, int i11) {
        DsCheckboxStyle base = DsCheckboxStyle.INSTANCE.base(interfaceC3967k, 6);
        return (style == null && style2 == null && style3 == null) ? base : new DsCheckboxStyle(mergeWithCustom(base.getEnabledColors(), style, interfaceC3967k, (i11 << 3) & 112), mergeWithCustom(base.getErrorColors(), style2, interfaceC3967k, i11 & 112), mergeWithCustom(base.getDisabledColors(), style3, interfaceC3967k, (i11 >> 3) & 112));
    }

    private static final DsCheckboxStyle.DSCheckboxColoredProps mergeWithCustom(DsCheckboxStyle.DSCheckboxColoredProps dSCheckboxColoredProps, CheckBoxDTO.Style style, InterfaceC3967k interfaceC3967k, int i11) {
        DsCheckboxStyle.DSCheckboxColoredProps dSCheckboxColoredProps2;
        DsCheckboxStyle.DSCheckboxColoredProps m1785customzVxc6go;
        if (style == null) {
            m1785customzVxc6go = null;
            dSCheckboxColoredProps2 = dSCheckboxColoredProps;
        } else {
            dSCheckboxColoredProps2 = dSCheckboxColoredProps;
            m1785customzVxc6go = DsCheckboxStyle.DSCheckboxColoredProps.INSTANCE.m1785customzVxc6go(dSCheckboxColoredProps2, TokenParserKt.parseColorToken(style.getBackgroundColor(), interfaceC3967k, 0), TokenParserKt.parseColorToken(style.getBorderColor(), interfaceC3967k, 0), TokenParserKt.parseColorToken(style.getColor(), interfaceC3967k, 0), TokenParserKt.parseColorToken(style.getIconColor(), interfaceC3967k, 0), TokenParserKt.parseColorToken(style.getTextColor(), interfaceC3967k, 0), interfaceC3967k, (i11 & 14) | 1572864, 0);
        }
        return m1785customzVxc6go == null ? dSCheckboxColoredProps2 : m1785customzVxc6go;
    }

    @NotNull
    public static final a toToggleableState(@NotNull DsCheckboxStatus dsCheckboxStatus) {
        Intrinsics.checkNotNullParameter(dsCheckboxStatus, "<this>");
        int i11 = WhenMappings.$EnumSwitchMapping$3[dsCheckboxStatus.ordinal()];
        if (i11 == 1) {
            return a.Off;
        }
        if (i11 == 2) {
            return a.On;
        }
        if (i11 == 3) {
            return a.Indeterminate;
        }
        throw new o();
    }

    @NotNull
    public static final DsCheckboxStatus toVo(CheckBoxDTO.CheckboxStatus checkboxStatus) {
        int i11 = checkboxStatus == null ? -1 : WhenMappings.$EnumSwitchMapping$0[checkboxStatus.ordinal()];
        return i11 != 1 ? i11 != 2 ? DsCheckboxStatus.EMPTY : DsCheckboxStatus.INDETERMINATE : DsCheckboxStatus.SELECTED;
    }

    @NotNull
    public static final DsCheckboxState toVo(CheckBoxDTO.CheckboxState checkboxState) {
        int i11 = checkboxState == null ? -1 : WhenMappings.$EnumSwitchMapping$1[checkboxState.ordinal()];
        if (i11 == 1) {
            return DsCheckboxState.DISABLED;
        }
        if (i11 != 2) {
            return DsCheckboxState.ENABLED;
        }
        return DsCheckboxState.ERROR;
    }

    @NotNull
    public static final DsCheckboxSize toVo(CheckBoxDTO.CheckBoxSize checkBoxSize) {
        if ((checkBoxSize == null ? -1 : WhenMappings.$EnumSwitchMapping$2[checkBoxSize.ordinal()]) == 1) {
            return DsCheckboxSize.Size600.INSTANCE;
        }
        return DsCheckboxSize.Size500.INSTANCE;
    }
}
