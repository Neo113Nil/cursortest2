package ru.ozon.app.android.action.sheet;

import Sc.o;
import WZ.t;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import ru.ozon.app.android.action.sheet.ActionSheetViewModel;
import ru.ozon.app.android.analytics.modules.tokenized.TokenizedAnalyticsExtensionsKt;

@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"<anonymous>", "", "state", "Lru/ozon/app/android/action/sheet/ActionSheetViewModel$ScreenState;", "kotlin.jvm.PlatformType", "invoke", "(Lru/ozon/app/android/action/sheet/ActionSheetViewModel$ScreenState;)V"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
final class ActionSheetBinder$bind$1 extends AbstractC7737t implements Function1<ActionSheetViewModel.ScreenState, Unit> {
    final /* synthetic */ ActionSheetBinder this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ActionSheetBinder$bind$1(ActionSheetBinder actionSheetBinder) {
        super(1);
        this.this$0 = actionSheetBinder;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(ActionSheetViewModel.ScreenState screenState) {
        invoke2(screenState);
        return Unit.f71690a;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(ActionSheetViewModel.ScreenState screenState) {
        if (screenState instanceof ActionSheetViewModel.ScreenState.Loading) {
            this.this$0.getView().showLoader();
            return;
        }
        if (!(screenState instanceof ActionSheetViewModel.ScreenState.Content)) {
            if (!(screenState instanceof ActionSheetViewModel.ScreenState.Failure)) {
                throw new o();
            }
            this.this$0.getView().showError();
            return;
        }
        ActionSheetViewModel.ScreenState.Content content = (ActionSheetViewModel.ScreenState.Content) screenState;
        this.this$0.getView().showData(content.getActionSheetVO());
        Unit unit = Unit.f71690a;
        ActionSheetBinder actionSheetBinder = this.this$0;
        t tokenizedEvent = content.getActionSheetVO().getTokenizedEvent();
        if (tokenizedEvent != null) {
            TokenizedAnalyticsExtensionsKt.processViewEvents$default(actionSheetBinder.getTokenizedAnalytics(), tokenizedEvent, null, 2, null);
        }
    }
}
