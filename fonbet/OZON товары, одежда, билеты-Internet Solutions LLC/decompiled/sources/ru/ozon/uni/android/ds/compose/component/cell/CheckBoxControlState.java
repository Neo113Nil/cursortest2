package ru.ozon.uni.android.ds.compose.component.cell;

import S0.C3991w0;
import S0.D1;
import S0.InterfaceC3978p0;
import S0.n1;
import Sc.o;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.uni.atoms.data.selectionControls.checkbox.CheckBoxDTO;

@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\n\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0007\u0010\bR+\u0010\u000f\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\u00028V@RX\u0096\u008e\u0002¢\u0006\u0012\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u0005¨\u0006\u0010"}, d2 = {"Lru/ozon/uni/android/ds/compose/component/cell/CheckBoxControlState;", "Lru/ozon/uni/android/ds/compose/component/cell/ControlState;", "Lru/ozon/uni/atoms/data/selectionControls/checkbox/CheckBoxDTO$CheckboxStatus;", "initialValue", "<init>", "(Lru/ozon/uni/atoms/data/selectionControls/checkbox/CheckBoxDTO$CheckboxStatus;)V", "", "toggle", "()V", "<set-?>", "state$delegate", "LS0/p0;", "getState", "()Lru/ozon/uni/atoms/data/selectionControls/checkbox/CheckBoxDTO$CheckboxStatus;", "setState", "state", "uni_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
final class CheckBoxControlState implements ControlState<CheckBoxDTO.CheckboxStatus> {

    /* renamed from: state$delegate, reason: from kotlin metadata */
    @NotNull
    private final InterfaceC3978p0 state;

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[CheckBoxDTO.CheckboxStatus.values().length];
            try {
                iArr[CheckBoxDTO.CheckboxStatus.EMPTY.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[CheckBoxDTO.CheckboxStatus.SELECTED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[CheckBoxDTO.CheckboxStatus.INDETERMINATE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public CheckBoxControlState(@NotNull CheckBoxDTO.CheckboxStatus initialValue) {
        C3991w0 f7;
        Intrinsics.checkNotNullParameter(initialValue, "initialValue");
        f7 = n1.f(initialValue, D1.f25195a);
        this.state = f7;
    }

    private void setState(CheckBoxDTO.CheckboxStatus checkboxStatus) {
        this.state.setValue(checkboxStatus);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @NotNull
    public CheckBoxDTO.CheckboxStatus getState() {
        return (CheckBoxDTO.CheckboxStatus) this.state.getValue();
    }

    @Override // ru.ozon.uni.android.ds.compose.component.cell.ControlState
    public void toggle() {
        CheckBoxDTO.CheckboxStatus checkboxStatus;
        int i11 = WhenMappings.$EnumSwitchMapping$0[getState().ordinal()];
        if (i11 == 1) {
            checkboxStatus = CheckBoxDTO.CheckboxStatus.SELECTED;
        } else if (i11 == 2) {
            checkboxStatus = CheckBoxDTO.CheckboxStatus.EMPTY;
        } else {
            if (i11 != 3) {
                throw new o();
            }
            checkboxStatus = CheckBoxDTO.CheckboxStatus.SELECTED;
        }
        setState(checkboxStatus);
    }
}
