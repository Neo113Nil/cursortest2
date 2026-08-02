package ru.ozon.app.android.travel.feature.hotels.map.widgets.hotelsMapInfo.v4.presentation;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C7735q;
import ru.ozon.app.android.travel.feature.hotels.map.widgets.hotelsMapInfo.v4.view.HotelsMapInfoV4View;

@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
/* synthetic */ class HotelsMapInfoV4Wrapper$composerContainersUpdater$3 extends C7735q implements Function1<Integer, Unit> {
    HotelsMapInfoV4Wrapper$composerContainersUpdater$3(Object obj) {
        super(1, obj, HotelsMapInfoV4View.class, "updateBottomOffset", "updateBottomOffset(I)V", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(Integer num) {
        invoke(num.intValue());
        return Unit.f71690a;
    }

    public final void invoke(int i11) {
        ((HotelsMapInfoV4View) this.receiver).updateBottomOffset(i11);
    }
}
