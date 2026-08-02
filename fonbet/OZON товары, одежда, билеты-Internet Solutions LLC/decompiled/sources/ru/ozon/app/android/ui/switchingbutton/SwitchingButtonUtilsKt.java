package ru.ozon.app.android.ui.switchingbutton;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.ui.switchingbutton.state.SwitchingButtonState;

@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\f\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u0000\u001a\f\u0010\u0003\u001a\u00020\u0001*\u00020\u0002H\u0000¨\u0006\u0004"}, d2 = {"toggleState", "Lru/ozon/app/android/ui/switchingbutton/state/SwitchingButtonState;", "Lru/ozon/app/android/ui/switchingbutton/SwitchingButtonAction;", "mapToState", "switchingbutton_prodGoogleAllVendorsRelease"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class SwitchingButtonUtilsKt {
    @NotNull
    public static final SwitchingButtonState mapToState(@NotNull SwitchingButtonAction switchingButtonAction) {
        Intrinsics.checkNotNullParameter(switchingButtonAction, "<this>");
        if (switchingButtonAction.getSwitchingButton().getActiveButton() == null) {
            return SwitchingButtonState.Empty.INSTANCE;
        }
        if (switchingButtonAction.getSwitchingButton().isActive()) {
            String id2 = switchingButtonAction.getSwitchingButton().getId();
            return new SwitchingButtonState.ActiveButton(id2 != null ? id2 : "");
        }
        String id3 = switchingButtonAction.getSwitchingButton().getId();
        return new SwitchingButtonState.InActiveButton(id3 != null ? id3 : "");
    }

    @NotNull
    public static final SwitchingButtonState toggleState(@NotNull SwitchingButtonAction switchingButtonAction) {
        Intrinsics.checkNotNullParameter(switchingButtonAction, "<this>");
        if (switchingButtonAction.getSwitchingButton().getActiveButton() == null) {
            return SwitchingButtonState.Empty.INSTANCE;
        }
        if (switchingButtonAction.getSwitchingButton().isActive()) {
            String id2 = switchingButtonAction.getSwitchingButton().getId();
            return new SwitchingButtonState.InActiveButton(id2 != null ? id2 : "");
        }
        String id3 = switchingButtonAction.getSwitchingButton().getId();
        return new SwitchingButtonState.ActiveButton(id3 != null ? id3 : "");
    }
}
