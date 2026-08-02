package ru.ozon.app.android.ugc.widgets.selectionItemForm.header;

import WZ.l;
import WZ.m;
import WZ.t;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.android.tokenized.model.TokenizedTrackingInfo;
import ru.ozon.app.android.composer.TrackingInfoMapperKt;
import ru.ozon.uni.atoms.af.AtomAction;

@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "action", "Lru/ozon/uni/atoms/af/AtomAction;", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
final class SelectionFormHeaderVH$bind$1 extends AbstractC7737t implements Function1<AtomAction, Unit> {
    final /* synthetic */ SelectionFormHeaderVH this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    SelectionFormHeaderVH$bind$1(SelectionFormHeaderVH selectionFormHeaderVH) {
        super(1);
        this.this$0 = selectionFormHeaderVH;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(AtomAction atomAction) {
        invoke2(atomAction);
        return Unit.f71690a;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(AtomAction action) {
        Function1 function1;
        l lVar;
        Intrinsics.checkNotNullParameter(action, "action");
        if (!(action instanceof AtomAction.Dismiss)) {
            function1 = this.this$0.actionHandler;
            function1.invoke(action);
            return;
        }
        Map<String, TokenizedTrackingInfo> trackingInfo = ((AtomAction.Dismiss) action).getTrackingInfo();
        if (trackingInfo != null) {
            SelectionFormHeaderVO boundData = this.this$0.getBoundData();
            t mapToTokenizedEvent$default = TrackingInfoMapperKt.mapToTokenizedEvent$default(trackingInfo, boundData != null ? Long.valueOf(boundData.getId()) : null, null, 2, null);
            if (mapToTokenizedEvent$default != null) {
                lVar = this.this$0.tokenizedAnalytics;
                m.a(lVar, mapToTokenizedEvent$default, null);
            }
        }
        this.this$0.handleBackSubmitOrCloseForm();
    }
}
