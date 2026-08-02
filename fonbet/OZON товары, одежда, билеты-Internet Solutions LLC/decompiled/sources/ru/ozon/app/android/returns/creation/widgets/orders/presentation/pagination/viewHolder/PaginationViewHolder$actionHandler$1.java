package ru.ozon.app.android.returns.creation.widgets.orders.presentation.pagination.viewHolder;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C7735q;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.uni.atoms.af.AtomAction;

@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
/* synthetic */ class PaginationViewHolder$actionHandler$1 extends C7735q implements Function1<AtomAction.ComposerAction, Unit> {
    PaginationViewHolder$actionHandler$1(Object obj) {
        super(1, obj, PaginationComposerActionWithActionHandler.class, "handle", "handle(Lru/ozon/uni/atoms/af/AtomAction$ComposerAction;)V", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(AtomAction.ComposerAction composerAction) {
        invoke2(composerAction);
        return Unit.f71690a;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(AtomAction.ComposerAction p02) {
        Intrinsics.checkNotNullParameter(p02, "p0");
        ((PaginationComposerActionWithActionHandler) this.receiver).handle(p02);
    }
}
