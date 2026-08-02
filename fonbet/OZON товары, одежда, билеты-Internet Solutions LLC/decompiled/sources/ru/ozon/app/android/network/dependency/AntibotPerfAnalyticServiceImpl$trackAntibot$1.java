package ru.ozon.app.android.network.dependency;

import Qj0.U;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.tracker.performance.MetricType;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LQj0/U;", "", "invoke", "(LQj0/U;)V", "<anonymous>"}, k = 3, mv = {2, 0, 0})
/* loaded from: classes12.dex */
final class AntibotPerfAnalyticServiceImpl$trackAntibot$1 extends AbstractC7737t implements Function1<U, Unit> {
    public static final AntibotPerfAnalyticServiceImpl$trackAntibot$1 INSTANCE = new AntibotPerfAnalyticServiceImpl$trackAntibot$1();

    AntibotPerfAnalyticServiceImpl$trackAntibot$1() {
        super(1);
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(U u11) {
        invoke2(u11);
        return Unit.f71690a;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(U beginTrace) {
        Intrinsics.checkNotNullParameter(beginTrace, "$this$beginTrace");
        U.p(beginTrace, MetricType.NETWORK_ANTIBOT_TIME_END, 0L, true, 2);
    }
}
