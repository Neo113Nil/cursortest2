package ru.ozon.app.android.ugc.widgets.common;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.action.sheet.ActionSheetVOKt;
import ru.ozon.app.android.action.sheet.data.ActionSheetDTO;
import ru.ozon.uni.atoms.data.button.ButtonV3Atom;

@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\u001a\u0012\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0004¨\u0006\u0005"}, d2 = {"toVO", "Lru/ozon/app/android/ugc/widgets/common/MenuVO;", "Lru/ozon/app/android/ugc/widgets/common/MenuDTO;", "widgetId", "", "ugc_prodGoogleAllVendorsRelease"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class MenuDTOKt {
    @NotNull
    public static final MenuVO toVO(@NotNull MenuDTO menuDTO, long j11) {
        Intrinsics.checkNotNullParameter(menuDTO, "<this>");
        ButtonV3Atom.SmallIconButton button = menuDTO.getButton();
        ActionSheetDTO actions = menuDTO.getActions();
        return new MenuVO(button, actions != null ? ActionSheetVOKt.toVO$default(actions, j11, false, 2, null) : null, menuDTO.getSubmitDialogsByActionIDs());
    }
}
