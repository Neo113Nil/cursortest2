package ru.ozon.app.android.travel.feature.hotels.map.widgets.hotelsMapInfo.v2.presentation;

import android.view.View;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C7735q;
import kotlin.jvm.internal.Intrinsics;

@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
/* synthetic */ class HotelsMapViewV2$bottomCardController$1 extends C7735q implements Function1<View, Unit> {
    HotelsMapViewV2$bottomCardController$1(Object obj) {
        super(1, obj, HotelsMapViewV2.class, "showLocationButton", "showLocationButton(Landroid/view/View;)V", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(View view) {
        invoke2(view);
        return Unit.f71690a;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(View p02) {
        Intrinsics.checkNotNullParameter(p02, "p0");
        ((HotelsMapViewV2) this.receiver).showLocationButton(p02);
    }
}
