package ru.ozon.app.android.travel.feature.avia.widgets.flightSeatsScheme.v2.presentation;

import androidx.recyclerview.widget.LinearLayoutManager;
import kotlin.Metadata;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.c;
import kotlin.coroutines.jvm.internal.e;
import org.jetbrains.annotations.NotNull;

@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
@e(c = "ru.ozon.app.android.travel.feature.avia.widgets.flightSeatsScheme.v2.presentation.FlightSeatsSchemeV2ViewModel", f = "FlightSeatsSchemeV2ViewModel.kt", l = {317, 324, 325, 336}, m = "selectPassengerInternal")
/* loaded from: classes10.dex */
final class FlightSeatsSchemeV2ViewModel$selectPassengerInternal$1 extends c {
    int I$0;
    int I$1;
    Object L$0;
    Object L$1;
    Object L$2;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ FlightSeatsSchemeV2ViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    FlightSeatsSchemeV2ViewModel$selectPassengerInternal$1(FlightSeatsSchemeV2ViewModel flightSeatsSchemeV2ViewModel, d<? super FlightSeatsSchemeV2ViewModel$selectPassengerInternal$1> dVar) {
        super(dVar);
        this.this$0 = flightSeatsSchemeV2ViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(@NotNull Object obj) {
        Object selectPassengerInternal;
        this.result = obj;
        this.label |= LinearLayoutManager.INVALID_OFFSET;
        selectPassengerInternal = this.this$0.selectPassengerInternal(0, null, this);
        return selectPassengerInternal;
    }
}
