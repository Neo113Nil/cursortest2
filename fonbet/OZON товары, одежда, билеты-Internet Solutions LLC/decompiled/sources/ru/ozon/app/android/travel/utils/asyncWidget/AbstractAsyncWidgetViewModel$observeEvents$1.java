package ru.ozon.app.android.travel.utils.asyncWidget;

import Sc.o;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import ru.ozon.app.android.travel.utils.asyncWidget.AbstractAsyncWidgetViewModel;

/* JADX INFO: Add missing generic type declarations: [VO] */
@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u00022\u001a\u0010\u0003\u001a\u0016\u0012\u0004\u0012\u0002H\u0002 \u0005*\n\u0012\u0004\u0012\u0002H\u0002\u0018\u00010\u00040\u0004H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"<anonymous>", "", "VO", "event", "Lru/ozon/app/android/travel/utils/asyncWidget/AbstractAsyncWidgetViewModel$Event;", "kotlin.jvm.PlatformType", "invoke", "(Lru/ozon/app/android/travel/utils/asyncWidget/AbstractAsyncWidgetViewModel$Event;)V"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
final class AbstractAsyncWidgetViewModel$observeEvents$1<VO> extends AbstractC7737t implements Function1<AbstractAsyncWidgetViewModel.Event<VO>, Unit> {
    final /* synthetic */ AsyncWidgetCallbacks<VO> $callbacksHolder;
    final /* synthetic */ AsyncWidgetTraceNameProvider $traceWidgetNameProvider;
    final /* synthetic */ AbstractAsyncWidgetViewModel<DTO, VO> this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    AbstractAsyncWidgetViewModel$observeEvents$1(AsyncWidgetCallbacks<VO> asyncWidgetCallbacks, AsyncWidgetTraceNameProvider asyncWidgetTraceNameProvider, AbstractAsyncWidgetViewModel<DTO, VO> abstractAsyncWidgetViewModel) {
        super(1);
        this.$callbacksHolder = asyncWidgetCallbacks;
        this.$traceWidgetNameProvider = asyncWidgetTraceNameProvider;
        this.this$0 = abstractAsyncWidgetViewModel;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(Object obj) {
        invoke((AbstractAsyncWidgetViewModel.Event) obj);
        return Unit.f71690a;
    }

    public final void invoke(AbstractAsyncWidgetViewModel.Event<VO> event) {
        String provideTraceWidgetName;
        if (!(event instanceof AbstractAsyncWidgetViewModel.Event.OnWidgetFetched)) {
            if (event instanceof AbstractAsyncWidgetViewModel.Event.OnWidgetFetchingFailed) {
                this.$callbacksHolder.onAsyncWidgetFetchingFailed(((AbstractAsyncWidgetViewModel.Event.OnWidgetFetchingFailed) event).getThrowable());
                return;
            } else {
                if (!(event instanceof AbstractAsyncWidgetViewModel.Event.OnWidgetSkipped)) {
                    throw new o();
                }
                this.$callbacksHolder.onAsyncWidgetSkipped();
                return;
            }
        }
        AbstractAsyncWidgetViewModel.Event.OnWidgetFetched onWidgetFetched = (AbstractAsyncWidgetViewModel.Event.OnWidgetFetched) event;
        this.$callbacksHolder.onAsyncWidgetFetched(onWidgetFetched.getFetchedModel());
        AsyncWidgetTraceNameProvider asyncWidgetTraceNameProvider = this.$traceWidgetNameProvider;
        if (asyncWidgetTraceNameProvider == null || (provideTraceWidgetName = asyncWidgetTraceNameProvider.provideTraceWidgetName()) == null) {
            return;
        }
        this.this$0.trackPerformance(provideTraceWidgetName, onWidgetFetched.getFetchedModel());
    }
}
