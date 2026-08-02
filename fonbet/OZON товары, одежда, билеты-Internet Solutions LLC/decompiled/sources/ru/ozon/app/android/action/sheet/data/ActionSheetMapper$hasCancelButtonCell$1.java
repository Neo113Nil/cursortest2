package ru.ozon.app.android.action.sheet.data;

import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.app.android.atoms.data.cells.CellAtom;
import ru.ozon.uni.atoms.data.AtomActionDTO;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lru/ozon/app/android/atoms/data/cells/CellAtom;", "it", "Lru/ozon/uni/atoms/data/AtomActionDTO$Behavior;", "invoke", "(Lru/ozon/app/android/atoms/data/cells/CellAtom;)Lru/ozon/uni/atoms/data/AtomActionDTO$Behavior;", "<anonymous>"}, k = 3, mv = {2, 0, 0})
/* loaded from: classes11.dex */
final class ActionSheetMapper$hasCancelButtonCell$1 extends AbstractC7737t implements Function1<CellAtom, AtomActionDTO.Behavior> {
    public static final ActionSheetMapper$hasCancelButtonCell$1 INSTANCE = new ActionSheetMapper$hasCancelButtonCell$1();

    ActionSheetMapper$hasCancelButtonCell$1() {
        super(1);
    }

    @Override // kotlin.jvm.functions.Function1
    public final AtomActionDTO.Behavior invoke(CellAtom it) {
        Intrinsics.checkNotNullParameter(it, "it");
        AtomActionDTO action = it.getAction();
        if (action != null) {
            return action.getBehavior();
        }
        return null;
    }
}
