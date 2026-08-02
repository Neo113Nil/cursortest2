package ru.ozon.app.android.travel.feature.avia.widgets.flightSeatsScheme.v1.presentation.total;

import android.view.View;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C7735q;

@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes10.dex */
/* synthetic */ class FlightSeatsSchemeTotalWidgetViewHolder$hideOrderTotalView$1 extends C7735q implements Function1<Float, Unit> {
    FlightSeatsSchemeTotalWidgetViewHolder$hideOrderTotalView$1(Object obj) {
        super(1, obj, View.class, "setTranslationY", "setTranslationY(F)V", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(Float f7) {
        invoke(f7.floatValue());
        return Unit.f71690a;
    }

    public final void invoke(float f7) {
        ((View) this.receiver).setTranslationY(f7);
    }
}
