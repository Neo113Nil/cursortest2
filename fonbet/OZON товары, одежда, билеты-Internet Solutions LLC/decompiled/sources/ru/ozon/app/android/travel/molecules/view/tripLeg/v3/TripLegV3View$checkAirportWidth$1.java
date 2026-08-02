package ru.ozon.app.android.travel.molecules.view.tripLeg.v3;

import androidx.recyclerview.widget.LinearLayoutManager;
import kotlin.Metadata;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.c;
import kotlin.coroutines.jvm.internal.e;
import org.jetbrains.annotations.NotNull;

@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
@e(c = "ru.ozon.app.android.travel.molecules.view.tripLeg.v3.TripLegV3View", f = "TripLegV3View.kt", l = {192, 192}, m = "checkAirportWidth")
/* loaded from: classes2.dex */
final class TripLegV3View$checkAirportWidth$1 extends c {
    int I$0;
    int I$1;
    Object L$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ TripLegV3View this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    TripLegV3View$checkAirportWidth$1(TripLegV3View tripLegV3View, d<? super TripLegV3View$checkAirportWidth$1> dVar) {
        super(dVar);
        this.this$0 = tripLegV3View;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(@NotNull Object obj) {
        Object checkAirportWidth;
        this.result = obj;
        this.label |= LinearLayoutManager.INVALID_OFFSET;
        checkAirportWidth = this.this$0.checkAirportWidth(0, null, null, this);
        return checkAirportWidth;
    }
}
