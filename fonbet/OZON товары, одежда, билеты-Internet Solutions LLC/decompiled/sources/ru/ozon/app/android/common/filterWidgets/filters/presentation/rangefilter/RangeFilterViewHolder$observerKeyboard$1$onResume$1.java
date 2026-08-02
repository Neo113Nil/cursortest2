package ru.ozon.app.android.common.filterWidgets.filters.presentation.rangefilter;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.app.android.common.filterWidgets.common.DelayedKeyboardVisibilityAction;
import ru.ozon.app.android.common.filterWidgets.filters.presentation.RangeFilterComposerActionHandler;

@Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\n¢\u0006\u0002\b\u0006"}, d2 = {"<anonymous>", "", "isKeyboardVisible", "", "delayedAction", "Lru/ozon/app/android/common/filterWidgets/common/DelayedKeyboardVisibilityAction;", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
final class RangeFilterViewHolder$observerKeyboard$1$onResume$1 extends AbstractC7737t implements Function2<Boolean, DelayedKeyboardVisibilityAction, Unit> {
    final /* synthetic */ RangeFilterViewHolder this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    RangeFilterViewHolder$observerKeyboard$1$onResume$1(RangeFilterViewHolder rangeFilterViewHolder) {
        super(2);
        this.this$0 = rangeFilterViewHolder;
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Unit invoke(Boolean bool, DelayedKeyboardVisibilityAction delayedKeyboardVisibilityAction) {
        invoke(bool.booleanValue(), delayedKeyboardVisibilityAction);
        return Unit.f71690a;
    }

    public final void invoke(boolean z11, DelayedKeyboardVisibilityAction delayedAction) {
        RangeFilterComposerActionHandler rangeFilterComposerActionHandler;
        Intrinsics.checkNotNullParameter(delayedAction, "delayedAction");
        if (z11) {
            return;
        }
        rangeFilterComposerActionHandler = this.this$0.composerActionHandler;
        rangeFilterComposerActionHandler.handle(delayedAction.getAction(), delayedAction.getOriginalUrl(), delayedAction.getScrollWidgetKey(), delayedAction.getScrollY());
    }
}
