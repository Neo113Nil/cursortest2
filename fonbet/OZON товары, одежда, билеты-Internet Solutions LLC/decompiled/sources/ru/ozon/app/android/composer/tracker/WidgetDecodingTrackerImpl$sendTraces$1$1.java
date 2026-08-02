package ru.ozon.app.android.composer.tracker;

import Qj0.A0;
import Qj0.B;
import Qj0.C3884d;
import Qj0.C3885e;
import Qj0.F;
import Qj0.L;
import Qj0.P;
import Qj0.U;
import Qj0.t0;
import Qj0.x0;
import S00.c;
import T00.a;
import T00.e;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.tracker.performance.MetricType;
import ru.ozon.tracker.performance.ObjectTypes;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LQj0/U;", "", "invoke", "(LQj0/U;)V", "<anonymous>"}, k = 3, mv = {2, 0, 0})
/* loaded from: classes6.dex */
final class WidgetDecodingTrackerImpl$sendTraces$1$1 extends AbstractC7737t implements Function1<U, Unit> {
    final /* synthetic */ a $state;
    final /* synthetic */ c $trace;
    final /* synthetic */ WidgetDecodingTrackerImpl this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    WidgetDecodingTrackerImpl$sendTraces$1$1(c cVar, WidgetDecodingTrackerImpl widgetDecodingTrackerImpl, a aVar) {
        super(1);
        this.$trace = cVar;
        this.this$0 = widgetDecodingTrackerImpl;
        this.$state = aVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(U u11) {
        invoke2(u11);
        return Unit.f71690a;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(U runTrace) {
        Sg.a aVar;
        long decodingTimeDelta;
        Sg.a aVar2;
        String i11;
        String f7;
        Intrinsics.checkNotNullParameter(runTrace, "$this$runTrace");
        t0 t0Var = new t0(this.$trace.d());
        int i12 = U.f23535i;
        runTrace.n(t0Var, true);
        runTrace.n(new A0(this.$trace.e()), true);
        runTrace.n(new B(ObjectTypes.WIDGET), true);
        aVar = this.this$0.analyticsScreenStorage;
        Rg.a a11 = aVar.a();
        runTrace.n(new F(String.valueOf(a11 != null ? a11.g() : null)), true);
        runTrace.n(new P(this.$trace.b()), true);
        U.p(runTrace, MetricType.DECODING_TIME_START, 0L, false, 4);
        decodingTimeDelta = this.this$0.getDecodingTimeDelta(this.$trace.a());
        U.p(runTrace, MetricType.DECODING_TIME_END, decodingTimeDelta, false, 4);
        e h11 = this.$state.h();
        if (h11 != null && (f7 = h11.f()) != null) {
            runTrace.n(new C3884d(f7), true);
        }
        String c11 = this.$state.c();
        if (c11 != null) {
            runTrace.n(new C3885e(c11), true);
        }
        String n11 = this.$state.n();
        if (n11 != null) {
            runTrace.n(new x0(n11), true);
        }
        aVar2 = this.this$0.analyticsScreenStorage;
        Rg.a a12 = aVar2.a();
        if (a12 != null && (i11 = a12.i()) != null) {
            runTrace.n(new L(i11), true);
        }
        this.this$0.logPerformance(this.$trace, decodingTimeDelta);
    }
}
