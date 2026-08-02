package ru.ozon.app.android.ugc.core.widgets.timerButton.core;

import WZ.l;
import WZ.m;
import WZ.t;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.app.android.ugc.core.widgets.timerButton.presentation.TimerButtonVO;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lru/ozon/app/android/ugc/core/widgets/timerButton/presentation/TimerButtonVO;", "<unused var>", "LWZ/t;", "event", "", "invoke", "(Lru/ozon/app/android/ugc/core/widgets/timerButton/presentation/TimerButtonVO;LWZ/t;)V", "<anonymous>"}, k = 3, mv = {2, 0, 0})
/* loaded from: classes2.dex */
final class TimerButtonComposeWidgetKt$TimerButtonComposeWidget$1$3$2$1$2$1 extends AbstractC7737t implements Function2<TimerButtonVO, t, Unit> {
    final /* synthetic */ l $tokenizedAnalytics;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    TimerButtonComposeWidgetKt$TimerButtonComposeWidget$1$3$2$1$2$1(l lVar) {
        super(2);
        this.$tokenizedAnalytics = lVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Unit invoke(TimerButtonVO timerButtonVO, t tVar) {
        invoke2(timerButtonVO, tVar);
        return Unit.f71690a;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(TimerButtonVO timerButtonVO, t event) {
        Intrinsics.checkNotNullParameter(timerButtonVO, "<unused var>");
        Intrinsics.checkNotNullParameter(event, "event");
        m.c(this.$tokenizedAnalytics, event, null);
    }
}
