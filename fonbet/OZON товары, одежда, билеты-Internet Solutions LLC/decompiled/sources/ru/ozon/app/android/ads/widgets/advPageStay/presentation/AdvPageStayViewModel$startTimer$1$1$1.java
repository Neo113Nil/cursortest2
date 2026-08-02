package ru.ozon.app.android.ads.widgets.advPageStay.presentation;

import Sc.s;
import WZ.l;
import Wc.a;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.e;
import kotlin.coroutines.jvm.internal.j;
import kotlin.jvm.functions.Function2;
import ru.ozon.app.android.ads.widgets.advPageStay.presentation.AdvPageStayVO;
import ru.ozon.app.android.analytics.modules.tokenized.TokenizedAnalyticsExtensionsKt;
import xe.M;
import xe.Y;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lxe/M;", "", "<anonymous>", "(Lxe/M;)V"}, k = 3, mv = {2, 0, 0})
@e(c = "ru.ozon.app.android.ads.widgets.advPageStay.presentation.AdvPageStayViewModel$startTimer$1$1$1", f = "AdvPageStayViewModel.kt", l = {24}, m = "invokeSuspend")
/* loaded from: classes11.dex */
final class AdvPageStayViewModel$startTimer$1$1$1 extends j implements Function2<M, d<? super Unit>, Object> {
    final /* synthetic */ AdvPageStayVO.AdvEvent $event;
    int label;
    final /* synthetic */ AdvPageStayViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    AdvPageStayViewModel$startTimer$1$1$1(AdvPageStayVO.AdvEvent advEvent, AdvPageStayViewModel advPageStayViewModel, d<? super AdvPageStayViewModel$startTimer$1$1$1> dVar) {
        super(2, dVar);
        this.$event = advEvent;
        this.this$0 = advPageStayViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final d<Unit> create(Object obj, d<?> dVar) {
        return new AdvPageStayViewModel$startTimer$1$1$1(this.$event, this.this$0, dVar);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        boolean z11;
        l lVar;
        a aVar = a.COROUTINE_SUSPENDED;
        int i11 = this.label;
        if (i11 == 0) {
            s.b(obj);
            long millis = TimeUnit.MILLISECONDS.toMillis(this.$event.getDelayMS());
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
        z11 = this.this$0.isPaused;
        if (!z11) {
            lVar = this.this$0.tokenizedAnalytics;
            TokenizedAnalyticsExtensionsKt.processAnyEvents$default(lVar, this.$event.getTokenizedEvent(), null, 2, null);
        }
        return Unit.f71690a;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(M m11, d<? super Unit> dVar) {
        return ((AdvPageStayViewModel$startTimer$1$1$1) create(m11, dVar)).invokeSuspend(Unit.f71690a);
    }
}
