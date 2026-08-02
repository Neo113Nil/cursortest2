package ru.ozon.app.android.composer.network.cronet;

import Ja.h;
import Ma.b;
import Ma.d;
import Qj0.C3882b;
import Qj0.C3889i;
import Qj0.U;
import Qj0.t0;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import qj.C9067a;
import ru.ozon.tracker.performance.ServerTimingsParser;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LQj0/U;", "", "invoke", "(LQj0/U;)V", "<anonymous>"}, k = 3, mv = {2, 0, 0})
/* loaded from: classes11.dex */
final class ComposerCronetMetricsListener$onMetricsCollected$1 extends AbstractC7737t implements Function1<U, Unit> {
    final /* synthetic */ C3889i $meta;
    final /* synthetic */ b $metrics;
    final /* synthetic */ d $response;
    final /* synthetic */ ComposerCronetMetricsListener this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ComposerCronetMetricsListener$onMetricsCollected$1(C3889i c3889i, ComposerCronetMetricsListener composerCronetMetricsListener, d dVar, b bVar) {
        super(1);
        this.$meta = c3889i;
        this.this$0 = composerCronetMetricsListener;
        this.$response = dVar;
        this.$metrics = bVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(U u11) {
        invoke2(u11);
        return Unit.f71690a;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(U beginTrace) {
        C9067a c9067a;
        ServerTimingsParser serverTimingParser;
        Intrinsics.checkNotNullParameter(beginTrace, "$this$beginTrace");
        t0 t0Var = new t0(this.$meta.c());
        int i11 = U.f23535i;
        beginTrace.n(t0Var, true);
        c9067a = this.this$0.networkInfoProvider;
        beginTrace.n(new C3882b(C9067a.g(c9067a)), true);
        h d11 = this.$response.d();
        if (d11 != null) {
            this.this$0.putMetric(beginTrace, d11);
        }
        this.this$0.putMetrics(beginTrace, this.$response);
        this.this$0.putTimingMetrics(beginTrace, this.$metrics.a());
        serverTimingParser = this.this$0.getServerTimingParser();
        serverTimingParser.e(this.$response.c(), beginTrace);
    }
}
