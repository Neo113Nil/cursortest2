package ru.ozon.app.android.travel.feature.general.main.widgets.searchForm.v4.presentation;

import Sc.s;
import Wc.a;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.e;
import kotlin.coroutines.jvm.internal.j;
import kotlin.jvm.functions.Function2;
import ru.ozon.app.android.travel.feature.general.main.widgets.searchForm.v4.presentation.SearchFormV4ViewModel;
import xe.M;
import xe.Y;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lxe/M;", "", "<anonymous>", "(Lxe/M;)V"}, k = 3, mv = {2, 0, 0})
@e(c = "ru.ozon.app.android.travel.feature.general.main.widgets.searchForm.v4.presentation.SearchFormV4ViewModel$onStartTimer$1", f = "SearchFormV4ViewModel.kt", l = {51}, m = "invokeSuspend")
/* loaded from: classes4.dex */
final class SearchFormV4ViewModel$onStartTimer$1 extends j implements Function2<M, d<? super Unit>, Object> {
    final /* synthetic */ int $delay;
    int label;
    final /* synthetic */ SearchFormV4ViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    SearchFormV4ViewModel$onStartTimer$1(SearchFormV4ViewModel searchFormV4ViewModel, int i11, d<? super SearchFormV4ViewModel$onStartTimer$1> dVar) {
        super(2, dVar);
        this.this$0 = searchFormV4ViewModel;
        this.$delay = i11;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final d<Unit> create(Object obj, d<?> dVar) {
        return new SearchFormV4ViewModel$onStartTimer$1(this.this$0, this.$delay, dVar);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        a aVar = a.COROUTINE_SUSPENDED;
        int i11 = this.label;
        if (i11 == 0) {
            s.b(obj);
            this.this$0.timerState = SearchFormV4ViewModel.TimerState.STARTED;
            long millis = TimeUnit.SECONDS.toMillis(this.$delay);
            this.label = 1;
            if (Y.b(millis, this) == aVar) {
                return aVar;
            }
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            s.b(obj);
        }
        this.this$0.timerState = SearchFormV4ViewModel.TimerState.STOPPED;
        return Unit.f71690a;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(M m11, d<? super Unit> dVar) {
        return ((SearchFormV4ViewModel$onStartTimer$1) create(m11, dVar)).invokeSuspend(Unit.f71690a);
    }
}
