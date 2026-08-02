package ru.ozon.app.android.composer.view.performance.vhlisteners;

import Qj0.U;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.tracker.performance.MetricType;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LQj0/U;", "", "invoke", "(LQj0/U;)V", "<anonymous>"}, k = 3, mv = {2, 0, 0})
/* loaded from: classes6.dex */
public final class ViewHoldersRumTrackerImpl$onLayoutStart$$inlined$onTrace$1 extends AbstractC7737t implements Function1<U, Unit> {
    final /* synthetic */ String $traceId;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ViewHoldersRumTrackerImpl$onLayoutStart$$inlined$onTrace$1(String str) {
        super(1);
        this.$traceId = str;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(U u11) {
        invoke2(u11);
        return Unit.f71690a;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(U beginTrace) {
        Intrinsics.checkNotNullParameter(beginTrace, "$this$beginTrace");
        U.p(beginTrace, MetricType.LAYOUT_TIME_START, 0L, false, 2);
    }
}
