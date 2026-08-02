package ru.ozon.app.android.travel.feature.railway.widgets.travelRailwaySeatSelectWithScheme.v2.presentation.scheme;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.app.android.travel.feature.railway.widgets.travelRailwaySeatSelectWithScheme.v2.presentation.TravelRailwaySeatSelectWidgetViewModel;
import ru.ozon.uni.atoms.af.AtomAction;

@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "action", "Lru/ozon/uni/atoms/af/AtomAction$ComposerAction;", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
final class TravelRailwaySeatSelectWithSchemeWidgetViewHolder$actionHandler$2 extends AbstractC7737t implements Function1<AtomAction.ComposerAction, Unit> {
    final /* synthetic */ TravelRailwaySeatSelectWithSchemeWidgetViewHolder this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    TravelRailwaySeatSelectWithSchemeWidgetViewHolder$actionHandler$2(TravelRailwaySeatSelectWithSchemeWidgetViewHolder travelRailwaySeatSelectWithSchemeWidgetViewHolder) {
        super(1);
        this.this$0 = travelRailwaySeatSelectWithSchemeWidgetViewHolder;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(AtomAction.ComposerAction composerAction) {
        invoke2(composerAction);
        return Unit.f71690a;
    }

    /* JADX WARN: Code restructure failed: missing block: B:3:0x0011, code lost:
    
        r0 = r3.this$0.getWidgetViewModel();
     */
    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void invoke2(AtomAction.ComposerAction action) {
        TravelRailwaySeatSelectWidgetViewModel widgetViewModel;
        Intrinsics.checkNotNullParameter(action, "action");
        if (!Intrinsics.d(action.getId(), "changeSchemeSeatsV2") || widgetViewModel == null) {
            return;
        }
        widgetViewModel.changeSchemeSeatsV2(action.getActionName(), action.getParams(), this.this$0.getTrackingData());
    }
}
