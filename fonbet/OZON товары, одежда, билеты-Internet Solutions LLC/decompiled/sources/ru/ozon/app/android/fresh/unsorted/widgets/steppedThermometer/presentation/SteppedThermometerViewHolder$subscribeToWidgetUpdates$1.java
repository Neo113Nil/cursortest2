package ru.ozon.app.android.fresh.unsorted.widgets.steppedThermometer.presentation;

import Sc.s;
import Wc.a;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.e;
import kotlin.coroutines.jvm.internal.j;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, d2 = {"<anonymous>", "", "newVO", "Lru/ozon/app/android/fresh/unsorted/widgets/steppedThermometer/presentation/SteppedThermometerVO;"}, k = 3, mv = {2, 0, 0}, xi = 48)
@e(c = "ru.ozon.app.android.fresh.unsorted.widgets.steppedThermometer.presentation.SteppedThermometerViewHolder$subscribeToWidgetUpdates$1", f = "SteppedThermometerViewHolder.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes12.dex */
final class SteppedThermometerViewHolder$subscribeToWidgetUpdates$1 extends j implements Function2<SteppedThermometerVO, d<? super Unit>, Object> {
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ SteppedThermometerViewHolder this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    SteppedThermometerViewHolder$subscribeToWidgetUpdates$1(SteppedThermometerViewHolder steppedThermometerViewHolder, d<? super SteppedThermometerViewHolder$subscribeToWidgetUpdates$1> dVar) {
        super(2, dVar);
        this.this$0 = steppedThermometerViewHolder;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final d<Unit> create(Object obj, d<?> dVar) {
        SteppedThermometerViewHolder$subscribeToWidgetUpdates$1 steppedThermometerViewHolder$subscribeToWidgetUpdates$1 = new SteppedThermometerViewHolder$subscribeToWidgetUpdates$1(this.this$0, dVar);
        steppedThermometerViewHolder$subscribeToWidgetUpdates$1.L$0 = obj;
        return steppedThermometerViewHolder$subscribeToWidgetUpdates$1;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        a aVar = a.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        s.b(obj);
        SteppedThermometerVO steppedThermometerVO = (SteppedThermometerVO) this.L$0;
        if (!Intrinsics.d(steppedThermometerVO, this.this$0.getBoundData())) {
            this.this$0.updateSteppedThermometer(steppedThermometerVO);
        }
        return Unit.f71690a;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(SteppedThermometerVO steppedThermometerVO, d<? super Unit> dVar) {
        return ((SteppedThermometerViewHolder$subscribeToWidgetUpdates$1) create(steppedThermometerVO, dVar)).invokeSuspend(Unit.f71690a);
    }
}
