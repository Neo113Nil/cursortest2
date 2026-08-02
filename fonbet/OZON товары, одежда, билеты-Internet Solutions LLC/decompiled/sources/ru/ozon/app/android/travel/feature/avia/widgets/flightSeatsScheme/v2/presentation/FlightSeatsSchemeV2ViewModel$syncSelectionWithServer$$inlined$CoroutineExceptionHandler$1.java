package ru.ozon.app.android.travel.feature.avia.widgets.flightSeatsScheme.v2.presentation;

import androidx.lifecycle.x0;
import java.util.Deque;
import kotlin.Metadata;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.a;
import xe.C10727i;
import xe.J;

@Metadata(d1 = {"\u0000!\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u00012\u00020\u0002J\u001f\u0010\b\u001a\u00020\u00072\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"ru/ozon/app/android/travel/feature/avia/widgets/flightSeatsScheme/v2/presentation/FlightSeatsSchemeV2ViewModel$syncSelectionWithServer$$inlined$CoroutineExceptionHandler$1", "Lkotlin/coroutines/a;", "Lxe/J;", "Lkotlin/coroutines/CoroutineContext;", "context", "", "exception", "", "handleException", "(Lkotlin/coroutines/CoroutineContext;Ljava/lang/Throwable;)V", "kotlinx-coroutines-core"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class FlightSeatsSchemeV2ViewModel$syncSelectionWithServer$$inlined$CoroutineExceptionHandler$1 extends a implements J {
    final /* synthetic */ Deque $undoOperations$inlined;
    final /* synthetic */ FlightSeatsSchemeV2ViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FlightSeatsSchemeV2ViewModel$syncSelectionWithServer$$inlined$CoroutineExceptionHandler$1(J.a aVar, FlightSeatsSchemeV2ViewModel flightSeatsSchemeV2ViewModel, Deque deque) {
        super(aVar);
        this.this$0 = flightSeatsSchemeV2ViewModel;
        this.$undoOperations$inlined = deque;
    }

    @Override // xe.J
    public void handleException(CoroutineContext context, Throwable exception) {
        C10727i.c(x0.a(this.this$0), null, null, new FlightSeatsSchemeV2ViewModel$syncSelectionWithServer$exceptionHandler$1$1(this.$undoOperations$inlined, exception, this.this$0, null), 3);
    }
}
