package ru.ozon.app.android.travel.molecules.view.tripLeg.v2;

import androidx.recyclerview.widget.LinearLayoutManager;
import kotlin.Metadata;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.c;
import kotlin.coroutines.jvm.internal.e;
import org.jetbrains.annotations.NotNull;

@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
@e(c = "ru.ozon.app.android.travel.molecules.view.tripLeg.v2.TripLegV2View", f = "TripLegV2View.kt", l = {172, 172}, m = "checkAirportWidth")
/* loaded from: classes2.dex */
final class TripLegV2View$checkAirportWidth$1 extends c {
    int I$0;
    int I$1;
    Object L$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ TripLegV2View this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    TripLegV2View$checkAirportWidth$1(TripLegV2View tripLegV2View, d<? super TripLegV2View$checkAirportWidth$1> dVar) {
        super(dVar);
        this.this$0 = tripLegV2View;
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
