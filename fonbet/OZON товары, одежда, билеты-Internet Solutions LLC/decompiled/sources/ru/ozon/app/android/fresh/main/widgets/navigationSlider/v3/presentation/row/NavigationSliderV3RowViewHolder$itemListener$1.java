package ru.ozon.app.android.fresh.main.widgets.navigationSlider.v3.presentation.row;

import WZ.l;
import WZ.t;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import ru.ozon.app.android.analytics.modules.tokenized.TokenizedAnalyticsExtensionsKt;
import ru.ozon.app.android.fresh.main.widgets.navigationSlider.v3.presentation.row.NavigationSliderV3ItemVO;
import ru.ozon.uni.atoms.af.AtomAction;

@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "item", "Lru/ozon/app/android/fresh/main/widgets/navigationSlider/v3/presentation/row/NavigationSliderV3ItemVO;", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
final class NavigationSliderV3RowViewHolder$itemListener$1 extends AbstractC7737t implements Function1<NavigationSliderV3ItemVO, Unit> {
    final /* synthetic */ NavigationSliderV3RowViewHolder this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    NavigationSliderV3RowViewHolder$itemListener$1(NavigationSliderV3RowViewHolder navigationSliderV3RowViewHolder) {
        super(1);
        this.this$0 = navigationSliderV3RowViewHolder;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(NavigationSliderV3ItemVO navigationSliderV3ItemVO) {
        invoke2(navigationSliderV3ItemVO);
        return Unit.f71690a;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(NavigationSliderV3ItemVO navigationSliderV3ItemVO) {
        t tokenizedEvent;
        l lVar;
        NavigationSliderV3ItemVO.Data data;
        AtomAction action;
        Function1 function1;
        if (navigationSliderV3ItemVO != null && (data = navigationSliderV3ItemVO.getData()) != null && (action = data.getAction()) != null) {
            function1 = this.this$0.actionHandler;
            function1.invoke(action);
        }
        if (navigationSliderV3ItemVO == null || (tokenizedEvent = navigationSliderV3ItemVO.getTokenizedEvent()) == null) {
            return;
        }
        lVar = this.this$0.tokenizedAnalytics;
        TokenizedAnalyticsExtensionsKt.processClickEvents$default(lVar, tokenizedEvent, null, 2, null);
    }
}
