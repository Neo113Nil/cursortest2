package ru.ozon.app.android.analytics.performance;

import Qj0.I;
import kotlin.Metadata;
import kotlin.collections.C7705l;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"LQj0/I$b;", "invoke", "()LQj0/I$b;", "<anonymous>"}, k = 3, mv = {2, 0, 0})
/* loaded from: classes6.dex */
final class TravelPerformanceTrackerInterceptor$pageTypes$2 extends AbstractC7737t implements Function0<I.b> {
    public static final TravelPerformanceTrackerInterceptor$pageTypes$2 INSTANCE = new TravelPerformanceTrackerInterceptor$pageTypes$2();

    TravelPerformanceTrackerInterceptor$pageTypes$2() {
        super(0);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // kotlin.jvm.functions.Function0
    public final I.b invoke() {
        String[] elements = {"travel", "pdp_hotel_travel"};
        Intrinsics.checkNotNullParameter(elements, "elements");
        return new I.b(C7705l.j0(elements));
    }
}
