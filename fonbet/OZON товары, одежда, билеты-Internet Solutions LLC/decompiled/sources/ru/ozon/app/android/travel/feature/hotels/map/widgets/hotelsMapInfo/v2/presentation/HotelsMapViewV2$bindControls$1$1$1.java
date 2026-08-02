package ru.ozon.app.android.travel.feature.hotels.map.widgets.hotelsMapInfo.v2.presentation;

import WZ.t;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.C7735q;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.uni.atoms.af.AtomAction;

@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
/* synthetic */ class HotelsMapViewV2$bindControls$1$1$1 extends C7735q implements Function2<AtomAction, t, Unit> {
    HotelsMapViewV2$bindControls$1$1$1(Object obj) {
        super(2, obj, HotelsMapViewV2.class, "processFiltersAction", "processFiltersAction(Lru/ozon/uni/atoms/af/AtomAction;Lru/ozon/composer/analytics/tokenized/TokenizedEvent;)V", 0);
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Unit invoke(AtomAction atomAction, t tVar) {
        invoke2(atomAction, tVar);
        return Unit.f71690a;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(AtomAction p02, t tVar) {
        Intrinsics.checkNotNullParameter(p02, "p0");
        ((HotelsMapViewV2) this.receiver).processFiltersAction(p02, tVar);
    }
}
