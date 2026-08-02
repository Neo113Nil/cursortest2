package ru.ozon.app.android.travel.feature.tours.widgets.toursSearchResult.presentation;

import androidx.lifecycle.T;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C7735q;

@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
/* synthetic */ class ToursSearchResultViewModel$pollHotels$1$2$2 extends C7735q implements Function1<Float, Unit> {
    ToursSearchResultViewModel$pollHotels$1$2$2(Object obj) {
        super(1, obj, T.class, "setValue", "setValue(Ljava/lang/Object;)V", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(Float f7) {
        invoke2(f7);
        return Unit.f71690a;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(Float f7) {
        ((T) this.receiver).setValue(f7);
    }
}
