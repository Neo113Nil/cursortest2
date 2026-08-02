package ru.ozon.app.android.action.sheet;

import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.app.android.action.sheet.ActionSheetEventHandler;
import ru.ozon.uni.atoms.af.AtomAction;

@Metadata(d1 = {"\u0000\u0016\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u00012\u000b\u0010\u0003\u001a\u00070\u0004¢\u0006\u0002\b\u0005H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"<anonymous>", "Lru/ozon/uni/atoms/af/AtomAction;", "kotlin.jvm.PlatformType", "it", "Lru/ozon/app/android/action/sheet/ActionSheetEventHandler$ActionDTO;", "Lkotlin/jvm/internal/EnhancedNullability;", "invoke", "(Lru/ozon/app/android/action/sheet/ActionSheetEventHandler$ActionDTO;)Lru/ozon/uni/atoms/af/AtomAction;"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
final class ActionSheetEventHandler$handle$2 extends AbstractC7737t implements Function1<ActionSheetEventHandler.ActionDTO, AtomAction> {
    public static final ActionSheetEventHandler$handle$2 INSTANCE = new ActionSheetEventHandler$handle$2();

    ActionSheetEventHandler$handle$2() {
        super(1);
    }

    @Override // kotlin.jvm.functions.Function1
    public final AtomAction invoke(ActionSheetEventHandler.ActionDTO it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return it.getAction();
    }
}
