package ru.ozon.app.android.common.filterWidgets.filters.presentation.multiplerangesfilter;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.app.android.common.filterWidgets.common.DelayedKeyboardVisibilityAction;
import ru.ozon.app.android.common.filterWidgets.common.KeyboardVisibilityActionHolder;
import ru.ozon.app.android.common.filterWidgets.filters.common.ExtKt;
import ru.ozon.app.android.common.filterWidgets.filters.presentation.RangeFilterComposerActionHandler;
import ru.ozon.app.android.common.filterWidgets.filters.presentation.rangefilter.RangeFilterVO;
import ru.ozon.app.android.storefront.filterWidgets.databinding.WidgetMultipleRangesFilterBinding;
import ru.ozon.uni.atoms.af.AtomAction;

@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "action", "Lru/ozon/uni/atoms/af/AtomAction$Click;", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
final class MultipleRangesFilterViewHolder$actionHandler$1 extends AbstractC7737t implements Function1<AtomAction.Click, Unit> {
    final /* synthetic */ MultipleRangesFilterViewHolder this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    MultipleRangesFilterViewHolder$actionHandler$1(MultipleRangesFilterViewHolder multipleRangesFilterViewHolder) {
        super(1);
        this.this$0 = multipleRangesFilterViewHolder;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(AtomAction.Click click) {
        invoke2(click);
        return Unit.f71690a;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(AtomAction.Click action) {
        RangeFilterComposerActionHandler rangeFilterComposerActionHandler;
        WidgetMultipleRangesFilterBinding widgetMultipleRangesFilterBinding;
        boolean isNeedToDelayAction;
        KeyboardVisibilityActionHolder keyboardVisibilityActionHolder;
        WidgetMultipleRangesFilterBinding widgetMultipleRangesFilterBinding2;
        Intrinsics.checkNotNullParameter(action, "action");
        MultipleRangesFilterVO boundData = this.this$0.getBoundData();
        if (boundData != null) {
            MultipleRangesFilterViewHolder multipleRangesFilterViewHolder = this.this$0;
            RangeFilterVO rangeFilterVO = boundData.getRangeFilterVO();
            if (rangeFilterVO != null) {
                if (!ExtKt.shouldIgnoreKeyboard(action)) {
                    isNeedToDelayAction = multipleRangesFilterViewHolder.isNeedToDelayAction();
                    if (isNeedToDelayAction) {
                        keyboardVisibilityActionHolder = multipleRangesFilterViewHolder.delayedActionHolder;
                        String originalUrl = rangeFilterVO.getOriginalUrl();
                        Integer scrollWidgetKey = boundData.getScrollWidgetKey();
                        widgetMultipleRangesFilterBinding2 = multipleRangesFilterViewHolder.widgetBinding;
                        keyboardVisibilityActionHolder.delayActionUntilKeyboardHidden(new DelayedKeyboardVisibilityAction(action, originalUrl, scrollWidgetKey, (int) widgetMultipleRangesFilterBinding2.getConstraintLayout().getY()));
                        return;
                    }
                }
                rangeFilterComposerActionHandler = multipleRangesFilterViewHolder.composerActionHandler;
                String originalUrl2 = rangeFilterVO.getOriginalUrl();
                Integer scrollWidgetKey2 = boundData.getScrollWidgetKey();
                widgetMultipleRangesFilterBinding = multipleRangesFilterViewHolder.widgetBinding;
                rangeFilterComposerActionHandler.handle(action, originalUrl2, scrollWidgetKey2, (int) widgetMultipleRangesFilterBinding.getConstraintLayout().getY());
            }
        }
    }
}
