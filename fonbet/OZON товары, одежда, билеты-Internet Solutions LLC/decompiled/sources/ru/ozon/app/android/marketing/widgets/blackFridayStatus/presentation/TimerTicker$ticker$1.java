package ru.ozon.app.android.marketing.widgets.blackFridayStatus.presentation;

import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.app.android.cart.common.dynamicElement.DynamicElementDTO;

/* JADX INFO: Add missing generic type declarations: [R, T] */
@Metadata(d1 = {"\u0000\u0014\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\u0010\u0000\u001a\u0002H\u0001\"\b\b\u0000\u0010\u0001*\u00020\u0002\"\b\b\u0001\u0010\u0003*\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u0002H\u0003H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"<anonymous>", "R", "", "T", "<unused var>", "", DynamicElementDTO.TIMER, "invoke", "(JLjava/lang/Object;)Ljava/lang/Object;"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
final class TimerTicker$ticker$1<R, T> extends AbstractC7737t implements Function2<Long, T, R> {
    final /* synthetic */ TimerTicker<T, R> this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    TimerTicker$ticker$1(TimerTicker<T, R> timerTicker) {
        super(2);
        this.this$0 = timerTicker;
    }

    public final R invoke(long j11, T timer) {
        Function1 function1;
        Intrinsics.checkNotNullParameter(timer, "timer");
        function1 = ((TimerTicker) this.this$0).transform;
        return (R) function1.invoke(timer);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Object invoke(Long l11, Object obj) {
        return invoke(l11.longValue(), (long) obj);
    }
}
