package ru.ozon.app.android.orderdetails.cancelReasons.presentation.reasons;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.app.android.orderdetails.cancelReasons.presentation.extensions.AtomActionExtKt;
import ru.ozon.app.android.orderdetails.cancelReasons.presentation.models.SelectCancelReasonVO;
import ru.ozon.app.android.utils.KeyboardUtilsKt;
import ru.ozon.uni.atoms.af.AtomAction;

@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "action", "Lru/ozon/uni/atoms/af/AtomAction;", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
final class SelectCancelReasonViewHolder$atomsAdapter$1$1 extends AbstractC7737t implements Function1<AtomAction, Unit> {
    final /* synthetic */ SelectCancelReasonViewHolder this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    SelectCancelReasonViewHolder$atomsAdapter$1$1(SelectCancelReasonViewHolder selectCancelReasonViewHolder) {
        super(1);
        this.this$0 = selectCancelReasonViewHolder;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(AtomAction atomAction) {
        invoke2(atomAction);
        return Unit.f71690a;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(AtomAction action) {
        boolean isKeyboardVisible;
        Function1 function1;
        SelectCancelReasonView selectCancelReasonView;
        Intrinsics.checkNotNullParameter(action, "action");
        SelectCancelReasonVO.SelectCancelReasonsVO boundData = this.this$0.getBoundData();
        if (boundData != null) {
            SelectCancelReasonViewHolder selectCancelReasonViewHolder = this.this$0;
            isKeyboardVisible = selectCancelReasonViewHolder.isKeyboardVisible();
            if (isKeyboardVisible) {
                selectCancelReasonViewHolder.isSkipUpdateAfterKeyboardHide = true;
                selectCancelReasonView = selectCancelReasonViewHolder.cancelReasonView;
                KeyboardUtilsKt.hideKeyboard(selectCancelReasonView);
            }
            function1 = selectCancelReasonViewHolder.actionHandler;
            function1.invoke(AtomActionExtKt.addState(action, boundData, selectCancelReasonViewHolder.getComment()));
        }
    }
}
