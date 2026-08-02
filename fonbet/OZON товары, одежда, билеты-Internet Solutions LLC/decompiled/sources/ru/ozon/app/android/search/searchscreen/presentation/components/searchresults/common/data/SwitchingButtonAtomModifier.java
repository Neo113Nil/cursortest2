package ru.ozon.app.android.search.searchscreen.presentation.components.searchresults.common.data;

import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.U;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.atoms.data.button.SwitchingButton;
import ru.ozon.uni.atoms.data.AtomActionDTO;
import ru.ozon.uni.atoms.data.AtomDTO;
import ru.ozon.uni.atoms.data.button.ButtonV3Atom;

@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0005J\f\u0010\u0007\u001a\u00020\u0005*\u00020\u0005H\u0002J\f\u0010\b\u001a\u00020\t*\u00020\tH\u0002¨\u0006\n"}, d2 = {"Lru/ozon/app/android/search/searchscreen/presentation/components/searchresults/common/data/SwitchingButtonAtomModifier;", "", "<init>", "()V", "modifyActionsIfNeedIt", "Lru/ozon/uni/atoms/data/AtomDTO;", "buttonAtom", "modifyButton", "modifyAction", "Lru/ozon/uni/atoms/data/AtomActionDTO;", "search_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class SwitchingButtonAtomModifier {
    private final AtomActionDTO modifyAction(AtomActionDTO atomActionDTO) {
        Map<String, String> params = atomActionDTO.getParams();
        LinkedHashMap u11 = params != null ? U.u(params) : new LinkedHashMap();
        u11.put("NOT_NEED_PRE_PROCESS_ACTION_PARAMS_ID", "true");
        Unit unit = Unit.f71690a;
        return AtomActionDTO.copy$default(atomActionDTO, null, null, null, u11, null, 23, null);
    }

    private final AtomDTO modifyButton(AtomDTO atomDTO) {
        if (!(atomDTO instanceof ButtonV3Atom.SmallButton)) {
            return atomDTO;
        }
        ButtonV3Atom.SmallButton smallButton = (ButtonV3Atom.SmallButton) atomDTO;
        AtomActionDTO action = smallButton.getAction();
        return ButtonV3Atom.SmallButton.copy$default(smallButton, null, null, null, action != null ? modifyAction(action) : null, null, null, null, 119, null);
    }

    @NotNull
    public final AtomDTO modifyActionsIfNeedIt(@NotNull AtomDTO buttonAtom) {
        Intrinsics.checkNotNullParameter(buttonAtom, "buttonAtom");
        if (!(buttonAtom instanceof SwitchingButton)) {
            return buttonAtom;
        }
        SwitchingButton switchingButton = (SwitchingButton) buttonAtom;
        AtomDTO modifyButton = modifyButton(switchingButton.getDefaultButton());
        AtomDTO activeButton = switchingButton.getActiveButton();
        return SwitchingButton.copy$default(switchingButton, null, false, modifyButton, activeButton != null ? modifyButton(activeButton) : null, null, null, 51, null);
    }
}
