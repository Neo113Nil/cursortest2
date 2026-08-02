package ru.ozon.app.android.common.filterWidgets.filters.presentation.rangefilter;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.app.android.common.filterWidgets.common.DelayedKeyboardVisibilityAction;
import ru.ozon.app.android.common.filterWidgets.common.KeyboardVisibilityActionHolder;
import ru.ozon.app.android.common.filterWidgets.filters.common.ExtKt;
import ru.ozon.app.android.common.filterWidgets.filters.presentation.RangeFilterComposerActionHandler;
import ru.ozon.app.android.storefront.filterWidgets.databinding.WidgetFiltersRangeFilterBinding;
import ru.ozon.uni.atoms.af.AtomAction;

@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "action", "Lru/ozon/uni/atoms/af/AtomAction$Click;", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
final class RangeFilterViewHolder$actionHandler$1 extends AbstractC7737t implements Function1<AtomAction.Click, Unit> {
    final /* synthetic */ RangeFilterViewHolder this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    RangeFilterViewHolder$actionHandler$1(RangeFilterViewHolder rangeFilterViewHolder) {
        super(1);
        this.this$0 = rangeFilterViewHolder;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(AtomAction.Click click) {
        invoke2(click);
        return Unit.f71690a;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(AtomAction.Click action) {
        RangeFilterComposerActionHandler rangeFilterComposerActionHandler;
        WidgetFiltersRangeFilterBinding widgetFiltersRangeFilterBinding;
        boolean isNeedToDelayAction;
        KeyboardVisibilityActionHolder keyboardVisibilityActionHolder;
        WidgetFiltersRangeFilterBinding widgetFiltersRangeFilterBinding2;
        Intrinsics.checkNotNullParameter(action, "action");
        RangeFilterVO boundedData = this.this$0.getBoundedData();
        if (boundedData != null) {
            RangeFilterViewHolder rangeFilterViewHolder = this.this$0;
            if (!ExtKt.shouldIgnoreKeyboard(action)) {
                isNeedToDelayAction = rangeFilterViewHolder.isNeedToDelayAction();
                if (isNeedToDelayAction) {
                    keyboardVisibilityActionHolder = rangeFilterViewHolder.delayedActionHolder;
                    String originalUrl = boundedData.getOriginalUrl();
                    Integer scrollWidgetKey = boundedData.getScrollWidgetKey();
                    widgetFiltersRangeFilterBinding2 = rangeFilterViewHolder.binding;
                    keyboardVisibilityActionHolder.delayActionUntilKeyboardHidden(new DelayedKeyboardVisibilityAction(action, originalUrl, scrollWidgetKey, (int) widgetFiltersRangeFilterBinding2.getConstraintLayout().getY()));
                    return;
                }
            }
            rangeFilterComposerActionHandler = rangeFilterViewHolder.composerActionHandler;
            String originalUrl2 = boundedData.getOriginalUrl();
            Integer scrollWidgetKey2 = boundedData.getScrollWidgetKey();
            widgetFiltersRangeFilterBinding = rangeFilterViewHolder.binding;
            rangeFilterComposerActionHandler.handle(action, originalUrl2, scrollWidgetKey2, (int) widgetFiltersRangeFilterBinding.getConstraintLayout().getY());
        }
    }
}
