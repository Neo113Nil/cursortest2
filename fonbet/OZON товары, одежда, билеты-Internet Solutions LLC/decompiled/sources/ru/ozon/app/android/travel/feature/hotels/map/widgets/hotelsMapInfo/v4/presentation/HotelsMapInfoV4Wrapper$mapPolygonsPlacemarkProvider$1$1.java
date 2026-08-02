package ru.ozon.app.android.travel.feature.hotels.map.widgets.hotelsMapInfo.v4.presentation;

import WZ.t;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;
import ru.ozon.app.android.travel.feature.hotels.map.widgets.hotelsMapInfo.v4.presentation.MapEvent;
import ru.ozon.uni.atoms.af.AtomAction;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0007\u001a\u00020\u00042\b\u0010\u0001\u001a\u0004\u0018\u00010\u00002\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lru/ozon/uni/atoms/af/AtomAction;", "action", "LWZ/t;", "tokenizedEvent", "", "invoke", "(Lru/ozon/uni/atoms/af/AtomAction;LWZ/t;)V", "<anonymous>"}, k = 3, mv = {2, 0, 0})
/* loaded from: classes4.dex */
final class HotelsMapInfoV4Wrapper$mapPolygonsPlacemarkProvider$1$1 extends AbstractC7737t implements Function2<AtomAction, t, Unit> {
    final /* synthetic */ HotelsMapInfoV4Wrapper this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    HotelsMapInfoV4Wrapper$mapPolygonsPlacemarkProvider$1$1(HotelsMapInfoV4Wrapper hotelsMapInfoV4Wrapper) {
        super(2);
        this.this$0 = hotelsMapInfoV4Wrapper;
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Unit invoke(AtomAction atomAction, t tVar) {
        invoke2(atomAction, tVar);
        return Unit.f71690a;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(AtomAction atomAction, t tVar) {
        Function1 function1;
        this.this$0.viewModel.onEvent(new MapEvent.OnClickPolygonBadge(tVar));
        if (atomAction != null) {
            function1 = this.this$0.actionHandler;
            function1.invoke(atomAction);
        }
    }
}
