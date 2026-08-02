package ru.ozon.app.android.travel.feature.hotels.widgets.cellWithTimer.presentation;

import Sc.s;
import Wc.a;
import androidx.lifecycle.V;
import com.google.protobuf.DescriptorProtos$FileOptions;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.e;
import kotlin.coroutines.jvm.internal.j;
import kotlin.jvm.functions.Function2;
import ru.ozon.app.android.travel.feature.hotels.widgets.cellWithTimer.data.CellWithTimerMapper;
import ru.ozon.app.android.utils.livedata.SingleLiveEvent;
import xe.M;
import xe.N;
import xe.Y;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lxe/M;", "", "<anonymous>", "(Lxe/M;)V"}, k = 3, mv = {2, 0, 0})
@e(c = "ru.ozon.app.android.travel.feature.hotels.widgets.cellWithTimer.presentation.CellWithTimerViewModel$startTimer$1", f = "CellWithTimerViewModel.kt", l = {DescriptorProtos$FileOptions.SWIFT_PREFIX_FIELD_NUMBER}, m = "invokeSuspend")
/* loaded from: classes4.dex */
final class CellWithTimerViewModel$startTimer$1 extends j implements Function2<M, d<? super Unit>, Object> {
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ CellWithTimerViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    CellWithTimerViewModel$startTimer$1(CellWithTimerViewModel cellWithTimerViewModel, d<? super CellWithTimerViewModel$startTimer$1> dVar) {
        super(2, dVar);
        this.this$0 = cellWithTimerViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final d<Unit> create(Object obj, d<?> dVar) {
        CellWithTimerViewModel$startTimer$1 cellWithTimerViewModel$startTimer$1 = new CellWithTimerViewModel$startTimer$1(this.this$0, dVar);
        cellWithTimerViewModel$startTimer$1.L$0 = obj;
        return cellWithTimerViewModel$startTimer$1;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        M m11;
        SingleLiveEvent singleLiveEvent;
        long j11;
        V v11;
        CellWithTimerMapper cellWithTimerMapper;
        long j12;
        long j13;
        a aVar = a.COROUTINE_SUSPENDED;
        int i11 = this.label;
        if (i11 == 0) {
            s.b(obj);
            m11 = (M) this.L$0;
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            m11 = (M) this.L$0;
            s.b(obj);
        }
        while (N.f(m11)) {
            j11 = this.this$0.remainingSeconds;
            if (j11 <= 0) {
                break;
            }
            v11 = this.this$0.timerTextLiveData;
            cellWithTimerMapper = this.this$0.mapper;
            j12 = this.this$0.remainingSeconds;
            v11.setValue(cellWithTimerMapper.formattedTimerText(j12));
            CellWithTimerViewModel cellWithTimerViewModel = this.this$0;
            j13 = cellWithTimerViewModel.remainingSeconds;
            cellWithTimerViewModel.remainingSeconds = j13 - 1;
            long millis = TimeUnit.SECONDS.toMillis(1L);
            this.L$0 = m11;
            this.label = 1;
            if (Y.b(millis, this) == aVar) {
                return aVar;
            }
        }
        if (N.f(m11)) {
            singleLiveEvent = this.this$0.timerStoppedLiveData;
            singleLiveEvent.setValue(Unit.f71690a);
        }
        return Unit.f71690a;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(M m11, d<? super Unit> dVar) {
        return ((CellWithTimerViewModel$startTimer$1) create(m11, dVar)).invokeSuspend(Unit.f71690a);
    }
}
