package ru.ozon.app.android.composer.view.performance;

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
import Sg.a;
import T00.e;
import T00.m;
import d20.AbstractC6065b;
import e20.C6283a;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.composer.ui.widget.l;
import ru.ozon.tracker.performance.MetricType;
import ru.ozon.tracker.performance.ObjectTypes;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LQj0/U;", "", "invoke", "(LQj0/U;)V", "<anonymous>"}, k = 3, mv = {2, 0, 0})
/* loaded from: classes6.dex */
final class ComposerScreenPerformanceController$onOverlayMetricsReady$1 extends AbstractC7737t implements Function1<U, Unit> {
    final /* synthetic */ AbstractC6065b<?> $holder;
    final /* synthetic */ l $item;
    final /* synthetic */ C6283a $metrics;
    final /* synthetic */ String $uuid;
    final /* synthetic */ ComposerScreenPerformanceController this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ComposerScreenPerformanceController$onOverlayMetricsReady$1(C6283a c6283a, AbstractC6065b<?> abstractC6065b, ComposerScreenPerformanceController composerScreenPerformanceController, l lVar, String str) {
        super(1);
        this.$metrics = c6283a;
        this.$holder = abstractC6065b;
        this.this$0 = composerScreenPerformanceController;
        this.$item = lVar;
        this.$uuid = str;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(U u11) {
        invoke2(u11);
        return Unit.f71690a;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(U runTrace) {
        a aVar;
        a aVar2;
        String f7;
        String i11;
        Intrinsics.checkNotNullParameter(runTrace, "$this$runTrace");
        U.p(runTrace, MetricType.CREATION_TIME_START, 0L, false, 4);
        U.p(runTrace, MetricType.CREATION_TIME_END, this.$metrics.b(), false, 4);
        U.p(runTrace, MetricType.LAYOUT_TIME_START, 0L, false, 4);
        U.p(runTrace, MetricType.LAYOUT_TIME_END, this.$metrics.a() + this.$metrics.c(), false, 4);
        String simpleName = this.$holder.getClass().getSimpleName();
        Intrinsics.checkNotNullExpressionValue(simpleName, "getSimpleName(...)");
        runTrace.n(new t0(simpleName), true);
        runTrace.n(new B(ObjectTypes.WIDGET), true);
        aVar = this.this$0.analyticsScreenStorage;
        Rg.a a11 = aVar.a();
        runTrace.n(new F(String.valueOf(a11 != null ? a11.g() : null)), true);
        m c11 = this.$item.c().c();
        runTrace.n(new P(String.valueOf(c11.c())), true);
        runTrace.n(new A0(c11.e()), true);
        aVar2 = this.this$0.analyticsScreenStorage;
        Rg.a a12 = aVar2.a();
        if (a12 != null && (i11 = a12.i()) != null) {
            runTrace.n(new L(i11), true);
        }
        T00.a b11 = this.$item.c().b();
        if (b11 != null) {
            e h11 = b11.h();
            if (h11 != null && (f7 = h11.f()) != null) {
                runTrace.n(new C3884d(f7), true);
            }
            String c12 = b11.c();
            if (c12 != null) {
                runTrace.n(new C3885e(c12), true);
            }
            String n11 = b11.n();
            if (n11 != null) {
                runTrace.n(new x0(n11), true);
            }
        }
        this.this$0.logPerformance(this.$uuid, this.$holder, this.$metrics);
    }
}
