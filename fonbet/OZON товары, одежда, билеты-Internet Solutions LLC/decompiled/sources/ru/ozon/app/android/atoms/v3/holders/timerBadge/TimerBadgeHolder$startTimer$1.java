package ru.ozon.app.android.atoms.v3.holders.timerBadge;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import org.joda.time.MutableDateTime;
import org.joda.time.format.b;
import ru.ozon.app.android.uikit.view.atoms.timerBadge.TimerBadgeView;

@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"<anonymous>", "", "it", "", "kotlin.jvm.PlatformType", "invoke", "(Ljava/lang/Long;)V"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
final class TimerBadgeHolder$startTimer$1 extends AbstractC7737t implements Function1<Long, Unit> {
    final /* synthetic */ TimerBadgeHolder this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    TimerBadgeHolder$startTimer$1(TimerBadgeHolder timerBadgeHolder) {
        super(1);
        this.this$0 = timerBadgeHolder;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(Long l11) {
        invoke2(l11);
        return Unit.f71690a;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(Long l11) {
        b bVar;
        MutableDateTime mutableDateTime = this.this$0.timerTime;
        if (mutableDateTime == null) {
            this.this$0.stopTimer();
            return;
        }
        TimerBadgeHolder timerBadgeHolder = this.this$0;
        mutableDateTime.i().h();
        TimerBadgeView containerView = timerBadgeHolder.getContainerView();
        bVar = timerBadgeHolder.timeFormat;
        containerView.setText(bVar.g(timerBadgeHolder.timerTime));
        if (mutableDateTime.getMillis() < 1000) {
            timerBadgeHolder.stopTimer();
        }
    }
}
