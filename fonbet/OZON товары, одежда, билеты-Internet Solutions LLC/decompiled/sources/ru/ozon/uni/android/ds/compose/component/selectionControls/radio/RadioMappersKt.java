package ru.ozon.uni.android.ds.compose.component.selectionControls.radio;

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import ru.ozon.uni.android.ds.compose.component.selectionControls.radio.DsRadioSize;
import ru.ozon.uni.atoms.data.selectionControls.radiobutton.RadioDTO;

@Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u001a\u000e\u0010\u0000\u001a\u00020\u0001*\u0004\u0018\u00010\u0002H\u0000\u001a\u000e\u0010\u0000\u001a\u00020\u0003*\u0004\u0018\u00010\u0004H\u0000¨\u0006\u0005"}, d2 = {"toVo", "Lru/ozon/uni/android/ds/compose/component/selectionControls/radio/DsRadioSize;", "Lru/ozon/uni/atoms/data/selectionControls/radiobutton/RadioDTO$RadioSize;", "Lru/ozon/uni/android/ds/compose/component/selectionControls/radio/DsRadioState;", "Lru/ozon/uni/atoms/data/selectionControls/radiobutton/RadioDTO$RadioState;", "uni_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class RadioMappersKt {

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;

        static {
            int[] iArr = new int[RadioDTO.RadioSize.values().length];
            try {
                iArr[RadioDTO.RadioSize.SIZE_600.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[RadioDTO.RadioState.values().length];
            try {
                iArr2[RadioDTO.RadioState.DISABLED.ordinal()] = 1;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr2[RadioDTO.RadioState.ERROR.ordinal()] = 2;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$1 = iArr2;
        }
    }

    @NotNull
    public static final DsRadioSize toVo(RadioDTO.RadioSize radioSize) {
        return (radioSize == null ? -1 : WhenMappings.$EnumSwitchMapping$0[radioSize.ordinal()]) == 1 ? DsRadioSize.Size600.INSTANCE : DsRadioSize.Size500.INSTANCE;
    }

    @NotNull
    public static final DsRadioState toVo(RadioDTO.RadioState radioState) {
        int i11 = radioState == null ? -1 : WhenMappings.$EnumSwitchMapping$1[radioState.ordinal()];
        if (i11 == 1) {
            return DsRadioState.DISABLED;
        }
        if (i11 != 2) {
            return DsRadioState.ENABLED;
        }
        return DsRadioState.ERROR;
    }
}
