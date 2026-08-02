package ru.ozon.app.android.composer.network.redirect;

import L00.j;
import N00.a;
import Qj0.C3882b;
import Qj0.C3883c;
import Qj0.Q;
import Qj0.U;
import Qj0.t0;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import qj.C9067a;
import ru.ozon.tracker.performance.MetricType;
import ru.ozon.tracker.performance.ServerTimingsParser;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LQj0/U;", "", "invoke", "(LQj0/U;)V", "<anonymous>"}, k = 3, mv = {2, 0, 0})
/* loaded from: classes11.dex */
final class ComposerRedirectListener$onRedirectCompleted$1 extends AbstractC7737t implements Function1<U, Unit> {
    final /* synthetic */ a $metrics;
    final /* synthetic */ j $response;
    final /* synthetic */ ComposerRedirectListener this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ComposerRedirectListener$onRedirectCompleted$1(j jVar, ComposerRedirectListener composerRedirectListener, a aVar) {
        super(1);
        this.$response = jVar;
        this.this$0 = composerRedirectListener;
        this.$metrics = aVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(U u11) {
        invoke2(u11);
        return Unit.f71690a;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(U beginTrace) {
        ServerTimingsParser serverTimingsParser;
        C9067a c9067a;
        Intrinsics.checkNotNullParameter(beginTrace, "$this$beginTrace");
        t0 t0Var = new t0(this.$response.h().j());
        int i11 = U.f23535i;
        beginTrace.n(t0Var, true);
        if (this.$response.f() == null) {
            beginTrace.n(new Q(999), true);
        } else {
            beginTrace.n(new Q(this.$response.b()), true);
        }
        String str = this.$response.c().get("content-type");
        if (str != null) {
            beginTrace.n(new C3883c(str), true);
        }
        serverTimingsParser = this.this$0.getServerTimingsParser();
        serverTimingsParser.e(this.$response.c().toMultimap(), beginTrace);
        c9067a = this.this$0.networkInfoProvider;
        beginTrace.n(new C3882b(C9067a.g(c9067a)), true);
        U.p(beginTrace, MetricType.TOTAL_TIME_START, this.$metrics.m(), false, 4);
        U.p(beginTrace, MetricType.REQUEST_PREPARE_TIME_START, this.$metrics.m(), false, 4);
        U.p(beginTrace, MetricType.REQUEST_PREPARE_TIME_END, this.$metrics.l(), false, 4);
        U.p(beginTrace, MetricType.DNS_TIME_START, this.$metrics.f(), false, 4);
        U.p(beginTrace, MetricType.DNS_TIME_END, this.$metrics.e(), false, 4);
        U.p(beginTrace, MetricType.TLS_TIME_START, this.$metrics.u(), false, 4);
        U.p(beginTrace, MetricType.TLS_TIME_END, this.$metrics.t(), false, 4);
        U.p(beginTrace, MetricType.TCP_TIME_START, this.$metrics.s(), false, 4);
        U.p(beginTrace, MetricType.TCP_TIME_END, this.$metrics.r(), false, 4);
        U.p(beginTrace, MetricType.TIME_TO_FIRST_BYTE_START, this.$metrics.x(), false, 4);
        U.p(beginTrace, MetricType.TIME_TO_FIRST_BYTE_END, this.$metrics.w(), false, 4);
        U.p(beginTrace, MetricType.TIME_TO_LAST_BYTE_START, this.$metrics.z(), false, 4);
        U.p(beginTrace, MetricType.TIME_TO_LAST_BYTE_END, this.$metrics.y(), false, 4);
        U.p(beginTrace, MetricType.SERVER_TIME_START, this.$metrics.q(), false, 4);
        U.p(beginTrace, MetricType.SERVER_TIME_END, this.$metrics.p(), false, 4);
        U.p(beginTrace, MetricType.RESPONSE_TIME_START, this.$metrics.o(), false, 4);
        U.p(beginTrace, MetricType.RESPONSE_TIME_END, this.$metrics.n(), false, 4);
        U.p(beginTrace, MetricType.ADDITIONAL_REQUESTS_TIME_START, this.$metrics.c(), false, 4);
        U.p(beginTrace, MetricType.ADDITIONAL_REQUESTS_TIME_END, this.$metrics.b(), false, 4);
        U.p(beginTrace, MetricType.ENCODED_SIZE, this.$metrics.g(), false, 4);
        U.p(beginTrace, MetricType.DECODED_SIZE, this.$metrics.d(), false, 4);
        U.p(beginTrace, MetricType.TRANSFER_SIZE, this.$metrics.v(), false, 4);
        U.p(beginTrace, MetricType.NETWORK_LB_REDIRECT_TIME_START, this.$metrics.k(), false, 4);
        U.p(beginTrace, MetricType.NETWORK_LB_REDIRECT_TIME_END, this.$metrics.j(), false, 4);
        U.p(beginTrace, MetricType.NETWORK_ANTIBOT_TIME_START, this.$metrics.i(), false, 4);
        U.p(beginTrace, MetricType.NETWORK_ANTIBOT_TIME_END, this.$metrics.h(), false, 4);
    }
}
