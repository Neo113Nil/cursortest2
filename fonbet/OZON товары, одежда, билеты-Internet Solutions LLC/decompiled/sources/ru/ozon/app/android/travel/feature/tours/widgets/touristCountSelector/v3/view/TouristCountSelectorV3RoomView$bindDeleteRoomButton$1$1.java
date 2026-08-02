package ru.ozon.app.android.travel.feature.tours.widgets.touristCountSelector.v3.view;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.uni.atoms.af.AtomAction;

@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "atomAction", "Lru/ozon/uni/atoms/af/AtomAction;", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes5.dex */
final class TouristCountSelectorV3RoomView$bindDeleteRoomButton$1$1 extends AbstractC7737t implements Function1<AtomAction, Unit> {
    final /* synthetic */ TouristCountSelectorV3RoomView this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    TouristCountSelectorV3RoomView$bindDeleteRoomButton$1$1(TouristCountSelectorV3RoomView touristCountSelectorV3RoomView) {
        super(1);
        this.this$0 = touristCountSelectorV3RoomView;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(AtomAction atomAction) {
        invoke2(atomAction);
        return Unit.f71690a;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(AtomAction atomAction) {
        Function1 function1;
        Intrinsics.checkNotNullParameter(atomAction, "atomAction");
        function1 = this.this$0.actionHandler;
        if (function1 != null) {
            function1.invoke(atomAction);
        }
    }
}
