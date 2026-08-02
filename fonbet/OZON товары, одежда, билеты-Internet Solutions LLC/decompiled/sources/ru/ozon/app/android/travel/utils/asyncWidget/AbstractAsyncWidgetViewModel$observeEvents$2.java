package ru.ozon.app.android.travel.utils.asyncWidget;

import Sc.o;
import Sc.s;
import Wc.a;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.e;
import kotlin.coroutines.jvm.internal.j;
import kotlin.jvm.functions.Function2;
import ru.ozon.app.android.travel.utils.asyncWidget.AbstractAsyncWidgetViewModel;

/* JADX INFO: Add missing generic type declarations: [VO] */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u00022\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0004H\n"}, d2 = {"<anonymous>", "", "VO", "event", "Lru/ozon/app/android/travel/utils/asyncWidget/AbstractAsyncWidgetViewModel$Event;"}, k = 3, mv = {2, 0, 0}, xi = 48)
@e(c = "ru.ozon.app.android.travel.utils.asyncWidget.AbstractAsyncWidgetViewModel$observeEvents$2", f = "AbstractAsyncWidgetViewModel.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes2.dex */
final class AbstractAsyncWidgetViewModel$observeEvents$2<VO> extends j implements Function2<AbstractAsyncWidgetViewModel.Event<VO>, d<? super Unit>, Object> {
    final /* synthetic */ AsyncWidgetCallbacks<VO> $callbacksHolder;
    final /* synthetic */ AsyncWidgetTraceNameProvider $traceWidgetNameProvider;
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ AbstractAsyncWidgetViewModel<DTO, VO> this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    AbstractAsyncWidgetViewModel$observeEvents$2(AsyncWidgetCallbacks<VO> asyncWidgetCallbacks, AsyncWidgetTraceNameProvider asyncWidgetTraceNameProvider, AbstractAsyncWidgetViewModel<DTO, VO> abstractAsyncWidgetViewModel, d<? super AbstractAsyncWidgetViewModel$observeEvents$2> dVar) {
        super(2, dVar);
        this.$callbacksHolder = asyncWidgetCallbacks;
        this.$traceWidgetNameProvider = asyncWidgetTraceNameProvider;
        this.this$0 = abstractAsyncWidgetViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final d<Unit> create(Object obj, d<?> dVar) {
        AbstractAsyncWidgetViewModel$observeEvents$2 abstractAsyncWidgetViewModel$observeEvents$2 = new AbstractAsyncWidgetViewModel$observeEvents$2(this.$callbacksHolder, this.$traceWidgetNameProvider, this.this$0, dVar);
        abstractAsyncWidgetViewModel$observeEvents$2.L$0 = obj;
        return abstractAsyncWidgetViewModel$observeEvents$2;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        String provideTraceWidgetName;
        a aVar = a.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        s.b(obj);
        AbstractAsyncWidgetViewModel.Event event = (AbstractAsyncWidgetViewModel.Event) this.L$0;
        if (event instanceof AbstractAsyncWidgetViewModel.Event.OnWidgetFetched) {
            AbstractAsyncWidgetViewModel.Event.OnWidgetFetched onWidgetFetched = (AbstractAsyncWidgetViewModel.Event.OnWidgetFetched) event;
            this.$callbacksHolder.onAsyncWidgetFetched(onWidgetFetched.getFetchedModel());
            AsyncWidgetTraceNameProvider asyncWidgetTraceNameProvider = this.$traceWidgetNameProvider;
            if (asyncWidgetTraceNameProvider != null && (provideTraceWidgetName = asyncWidgetTraceNameProvider.provideTraceWidgetName()) != null) {
                this.this$0.trackPerformance(provideTraceWidgetName, onWidgetFetched.getFetchedModel());
            }
        } else if (event instanceof AbstractAsyncWidgetViewModel.Event.OnWidgetFetchingFailed) {
            this.$callbacksHolder.onAsyncWidgetFetchingFailed(((AbstractAsyncWidgetViewModel.Event.OnWidgetFetchingFailed) event).getThrowable());
        } else {
            if (!(event instanceof AbstractAsyncWidgetViewModel.Event.OnWidgetSkipped)) {
                throw new o();
            }
            this.$callbacksHolder.onAsyncWidgetSkipped();
        }
        return Unit.f71690a;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(AbstractAsyncWidgetViewModel.Event<VO> event, d<? super Unit> dVar) {
        return ((AbstractAsyncWidgetViewModel$observeEvents$2) create(event, dVar)).invokeSuspend(Unit.f71690a);
    }
}
