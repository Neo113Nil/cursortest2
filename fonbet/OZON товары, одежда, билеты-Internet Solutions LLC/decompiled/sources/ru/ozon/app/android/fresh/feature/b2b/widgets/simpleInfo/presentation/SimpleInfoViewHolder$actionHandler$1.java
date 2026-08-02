package ru.ozon.app.android.fresh.feature.b2b.widgets.simpleInfo.presentation;

import Vg.c;
import Vg.d;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC7737t;
import ru.ozon.app.android.common.actionHandlers.CopyTextActionHandler;
import ru.ozon.app.android.fresh.feature.b2b.actionHandlers.b2bDeleteConsignee.B2bDeleteConsigneeActionHandler;
import ru.ozon.app.android.fresh.feature.b2b.actionHandlers.b2bRemoveLegal.B2bRemoveLegalActionHandler;
import ru.ozon.app.android.fresh.feature.b2b.actionHandlers.b2bResetEdoVerification.B2bResetEdoVerificationActionHandler;
import ru.ozon.app.android.fresh.feature.b2b.actionHandlers.b2bSelectConsignee.B2bSelectConsigneeActionHandler;
import ru.ozon.app.android.platform.customActionHandlers.PopActionHandler;
import ru.ozon.app.android.platform.customActionHandlers.composerActionWithAction.ComposerActionWithActionHandler;

@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"LVg/c;", "invoke", "()LVg/c;", "<anonymous>"}, k = 3, mv = {2, 0, 0})
/* loaded from: classes12.dex */
final class SimpleInfoViewHolder$actionHandler$1 extends AbstractC7737t implements Function0<c> {
    final /* synthetic */ d $customActionHandlersStoreFactory;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    SimpleInfoViewHolder$actionHandler$1(d dVar) {
        super(0);
        this.$customActionHandlersStoreFactory = dVar;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // kotlin.jvm.functions.Function0
    public final c invoke() {
        return this.$customActionHandlersStoreFactory.create(CopyTextActionHandler.class, B2bRemoveLegalActionHandler.class, PopActionHandler.class, B2bSelectConsigneeActionHandler.class, B2bDeleteConsigneeActionHandler.class, B2bResetEdoVerificationActionHandler.class, ComposerActionWithActionHandler.class);
    }
}
