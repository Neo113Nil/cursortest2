package ru.ozon.app.android.ugc.core.widgets.commentsListV3.presentation.commentV3;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.app.android.ugc.core.widgets.commentsListV3.data.CommentV3DTO;
import ru.ozon.uni.atoms.af.AtomAction;

@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "action", "Lru/ozon/uni/atoms/af/AtomAction;", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
final class CommentFooterView$updateButtons$2$2 extends AbstractC7737t implements Function1<AtomAction, Unit> {
    final /* synthetic */ Function2<Boolean, AtomAction, Unit> $actionHandler;
    final /* synthetic */ CommentV3DTO.Control $control;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    CommentFooterView$updateButtons$2$2(Function2<? super Boolean, ? super AtomAction, Unit> function2, CommentV3DTO.Control control) {
        super(1);
        this.$actionHandler = function2;
        this.$control = control;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(AtomAction atomAction) {
        invoke2(atomAction);
        return Unit.f71690a;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(AtomAction action) {
        Intrinsics.checkNotNullParameter(action, "action");
        this.$actionHandler.invoke(Boolean.valueOf(this.$control.isSelected()), action);
    }
}
