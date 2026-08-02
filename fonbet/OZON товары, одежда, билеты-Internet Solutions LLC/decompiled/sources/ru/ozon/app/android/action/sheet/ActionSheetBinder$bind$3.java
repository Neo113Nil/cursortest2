package ru.ozon.app.android.action.sheet;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.C7714v;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.N;
import ru.ozon.app.android.action.sheet.ActionSheetBinder;
import ru.ozon.uni.atoms.af.AtomAction;

@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "action", "Lru/ozon/uni/atoms/af/AtomAction;", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
final class ActionSheetBinder$bind$3 extends AbstractC7737t implements Function1<AtomAction, Unit> {
    final /* synthetic */ ActionSheetBinder this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ActionSheetBinder$bind$3(ActionSheetBinder actionSheetBinder) {
        super(1);
        this.this$0 = actionSheetBinder;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(AtomAction atomAction) {
        invoke2(atomAction);
        return Unit.f71690a;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(AtomAction action) {
        ActionSheetBinder.Companion companion;
        ActionSheetBinder.Companion companion2;
        Intrinsics.checkNotNullParameter(action, "action");
        companion = ActionSheetBinder.Companion;
        boolean contains = companion.getUNSUPPORTED_ACTION_TYPES().contains(N.b(action.getClass()));
        companion2 = ActionSheetBinder.Companion;
        boolean A11 = C7714v.A(companion2.getUNSUPPORTED_ACTIONS(), N.b(action.getClass()));
        if (action instanceof AtomAction.ViewAction) {
            this.this$0.getHandler().accept(new AtomAction.IgnoreViewPoolViewAction((AtomAction.ViewAction) action), this.this$0.getRequestId());
        }
        if (contains) {
            return;
        }
        this.this$0.getFragment().dismiss();
        if (A11) {
            return;
        }
        this.this$0.getHandler().accept(action, this.this$0.getRequestId());
    }
}
