package ru.ozon.app.android.marketing.common.timer;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C7735q;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: Add missing generic type declarations: [R] */
@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
/* synthetic */ class TimerWidgetTicker$createTimer$2<R> extends C7735q implements Function1<R, Unit> {
    TimerWidgetTicker$createTimer$2(Object obj) {
        super(1, obj, Function1.class, "invoke", "invoke(Ljava/lang/Object;)Ljava/lang/Object;", 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(Object obj) {
        invoke2((TimerWidgetTicker$createTimer$2<R>) obj);
        return Unit.f71690a;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(R p02) {
        Intrinsics.checkNotNullParameter(p02, "p0");
        ((Function1) this.receiver).invoke(p02);
    }
}
