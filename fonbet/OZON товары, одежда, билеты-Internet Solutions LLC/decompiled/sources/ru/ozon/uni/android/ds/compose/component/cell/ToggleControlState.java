package ru.ozon.uni.android.ds.compose.component.cell;

import S0.C3991w0;
import S0.D1;
import S0.InterfaceC3978p0;
import S0.n1;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\n\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0007\u0010\bR+\u0010\u000f\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\u00028V@RX\u0096\u008e\u0002¢\u0006\u0012\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u0005¨\u0006\u0010"}, d2 = {"Lru/ozon/uni/android/ds/compose/component/cell/ToggleControlState;", "Lru/ozon/uni/android/ds/compose/component/cell/ControlState;", "", "initialValue", "<init>", "(Z)V", "", "toggle", "()V", "<set-?>", "state$delegate", "LS0/p0;", "getState", "()Ljava/lang/Boolean;", "setState", "state", "uni_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
final class ToggleControlState implements ControlState<Boolean> {

    /* renamed from: state$delegate, reason: from kotlin metadata */
    @NotNull
    private final InterfaceC3978p0 state;

    public ToggleControlState(boolean z11) {
        C3991w0 f7;
        f7 = n1.f(Boolean.valueOf(z11), D1.f25195a);
        this.state = f7;
    }

    private void setState(boolean z11) {
        this.state.setValue(Boolean.valueOf(z11));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @NotNull
    public Boolean getState() {
        return (Boolean) this.state.getValue();
    }

    @Override // ru.ozon.uni.android.ds.compose.component.cell.ControlState
    public void toggle() {
        setState(!getState().booleanValue());
    }
}
