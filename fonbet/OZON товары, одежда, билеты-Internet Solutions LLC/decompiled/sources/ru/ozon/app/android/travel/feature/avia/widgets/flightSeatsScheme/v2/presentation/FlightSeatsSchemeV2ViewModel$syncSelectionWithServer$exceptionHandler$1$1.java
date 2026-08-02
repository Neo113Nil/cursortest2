package ru.ozon.app.android.travel.feature.avia.widgets.flightSeatsScheme.v2.presentation;

import Ae.w0;
import Lm0.a;
import Sc.s;
import Wc.a;
import java.util.Deque;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.e;
import kotlin.coroutines.jvm.internal.j;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import ru.ozon.app.android.logger.LoggerExtKt;
import ru.ozon.app.android.travel.actionhandler.utils.extensions.ActionV2RepositoryError;
import ru.ozon.app.android.travel.logger.TravelActionLogger;
import ru.ozon.app.android.utils.buildUtils.BuildUtils;
import xe.M;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lxe/M;", "", "<anonymous>", "(Lxe/M;)V"}, k = 3, mv = {2, 0, 0})
@e(c = "ru.ozon.app.android.travel.feature.avia.widgets.flightSeatsScheme.v2.presentation.FlightSeatsSchemeV2ViewModel$syncSelectionWithServer$exceptionHandler$1$1", f = "FlightSeatsSchemeV2ViewModel.kt", l = {347}, m = "invokeSuspend")
/* loaded from: classes10.dex */
final class FlightSeatsSchemeV2ViewModel$syncSelectionWithServer$exceptionHandler$1$1 extends j implements Function2<M, d<? super Unit>, Object> {
    final /* synthetic */ Throwable $e;
    final /* synthetic */ Deque<Function0<Unit>> $undoOperations;
    int label;
    final /* synthetic */ FlightSeatsSchemeV2ViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    FlightSeatsSchemeV2ViewModel$syncSelectionWithServer$exceptionHandler$1$1(Deque<Function0<Unit>> deque, Throwable th2, FlightSeatsSchemeV2ViewModel flightSeatsSchemeV2ViewModel, d<? super FlightSeatsSchemeV2ViewModel$syncSelectionWithServer$exceptionHandler$1$1> dVar) {
        super(2, dVar);
        this.$undoOperations = deque;
        this.$e = th2;
        this.this$0 = flightSeatsSchemeV2ViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final d<Unit> create(Object obj, d<?> dVar) {
        return new FlightSeatsSchemeV2ViewModel$syncSelectionWithServer$exceptionHandler$1$1(this.$undoOperations, this.$e, this.this$0, dVar);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        w0 w0Var;
        a aVar = a.COROUTINE_SUSPENDED;
        int i11 = this.label;
        if (i11 == 0) {
            s.b(obj);
            while (!this.$undoOperations.isEmpty()) {
                this.$undoOperations.removeLast().invoke();
            }
            Throwable th2 = this.$e;
            if (th2 instanceof ActionV2RepositoryError) {
                TravelActionLogger.INSTANCE.logException(th2, "travel_flightSeatsScheme2_syncSelection");
            } else {
                LoggerExtKt.sendNonFatal$default(th2, null, "travel_flightSeatsScheme2_syncSelection", null, 10, null);
            }
            BuildUtils buildUtils = BuildUtils.INSTANCE;
            if (buildUtils.isQaFlavor() || buildUtils.isDebug()) {
                a.b bVar = Lm0.a.f17149a;
                bVar.b("travel_flightSeatsScheme2_syncSelection");
                bVar.e(th2);
            }
            w0Var = this.this$0._networkErrorFlow;
            Unit unit = Unit.f71690a;
            this.label = 1;
            if (w0Var.emit(unit, this) == aVar) {
                return aVar;
            }
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            s.b(obj);
        }
        return Unit.f71690a;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(M m11, d<? super Unit> dVar) {
        return ((FlightSeatsSchemeV2ViewModel$syncSelectionWithServer$exceptionHandler$1$1) create(m11, dVar)).invokeSuspend(Unit.f71690a);
    }
}
