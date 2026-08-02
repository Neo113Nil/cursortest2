package ru.ozon.app.android.travel.feature.hotels.map.widgets.hotelsMapInfo.v4.presentation;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C7735q;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.app.android.travel.feature.hotels.map.widgets.hotelsMapInfo.v4.presentation.HotelsMapInfoV4VO;

@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
/* synthetic */ class HotelsMapInfoV4Wrapper$cardsAdapter$1 extends C7735q implements Function1<HotelsMapInfoV4VO.Card, Unit> {
    HotelsMapInfoV4Wrapper$cardsAdapter$1(Object obj) {
        super(1, obj, HotelsMapInfoV4Wrapper.class, "processCardClickEvent", "processCardClickEvent(Lru/ozon/app/android/travel/feature/hotels/map/widgets/hotelsMapInfo/v4/presentation/HotelsMapInfoV4VO$Card;)V", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(HotelsMapInfoV4VO.Card card) {
        invoke2(card);
        return Unit.f71690a;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(HotelsMapInfoV4VO.Card p02) {
        Intrinsics.checkNotNullParameter(p02, "p0");
        ((HotelsMapInfoV4Wrapper) this.receiver).processCardClickEvent(p02);
    }
}
