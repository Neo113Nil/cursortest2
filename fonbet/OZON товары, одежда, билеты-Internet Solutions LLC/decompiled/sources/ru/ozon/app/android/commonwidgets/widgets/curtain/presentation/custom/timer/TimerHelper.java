package ru.ozon.app.android.commonwidgets.widgets.curtain.presentation.custom.timer;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.common.ui.customcurtain.CurtainCustomVO;
import ru.ozon.app.android.commonwidgets.widgets.curtain.presentation.custom.ShowHelper;
import ru.ozon.app.android.composer.ComposerReferences;
import ru.ozon.uni.atoms.af.AtomAction;

@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0005¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u0010\u001a\u00020\u00072\u0006\u0010\u0011\u001a\u00020\u000fH\u0016J\u0006\u0010\u0012\u001a\u00020\u0007J\u0010\u0010\u0013\u001a\u00020\u00072\u0006\u0010\u0014\u001a\u00020\rH\u0002R\u001c\u0010\n\u001a\u0010\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\r\u0018\u00010\u000bX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u000e\u001a\u0004\u0018\u00010\u000fX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0015"}, d2 = {"Lru/ozon/app/android/commonwidgets/widgets/curtain/presentation/custom/timer/TimerHelper;", "Lru/ozon/app/android/commonwidgets/widgets/curtain/presentation/custom/ShowHelper;", "ref", "Lru/ozon/app/android/composer/ComposerReferences;", "actionHandler", "Lkotlin/Function1;", "Lru/ozon/uni/atoms/af/AtomAction;", "", "<init>", "(Lru/ozon/app/android/composer/ComposerReferences;Lkotlin/jvm/functions/Function1;)V", "timerTicker", "Lru/ozon/app/android/commonwidgets/widgets/curtain/presentation/custom/timer/TimerTicker;", "", "Lru/ozon/app/android/commonwidgets/widgets/curtain/presentation/custom/timer/TimerTick;", "boundData", "Lru/ozon/app/android/common/ui/customcurtain/CurtainCustomVO;", "show", "item", "unbind", "onTick", "tick", "commonwidgets_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class TimerHelper extends ShowHelper {
    private CurtainCustomVO boundData;
    private TimerTicker<Long, TimerTick> timerTicker;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TimerHelper(@NotNull ComposerReferences ref, @NotNull Function1<? super AtomAction, Unit> actionHandler) {
        super(ref, actionHandler);
        Intrinsics.checkNotNullParameter(ref, "ref");
        Intrinsics.checkNotNullParameter(actionHandler, "actionHandler");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void onTick(TimerTick tick) {
        if (tick.getIsFinished()) {
            TimerTicker<Long, TimerTick> timerTicker = this.timerTicker;
            if (timerTicker != null) {
                timerTicker.unbind();
            }
            this.timerTicker = null;
            CurtainCustomVO curtainCustomVO = this.boundData;
            if (curtainCustomVO != null) {
                showCurtain(curtainCustomVO);
                updateVisibility(curtainCustomVO);
            }
        }
    }

    public void show(@NotNull CurtainCustomVO item) {
        Intrinsics.checkNotNullParameter(item, "item");
        this.boundData = item;
        CurtainCustomVO.Condition showCondition = item.getShowCondition();
        Intrinsics.g(showCondition, "null cannot be cast to non-null type ru.ozon.app.android.common.ui.customcurtain.CurtainCustomVO.Condition.Timer");
        long time = ((CurtainCustomVO.Condition.Timer) showCondition).getTime();
        TimerTicker<Long, TimerTick> timerTicker = this.timerTicker;
        if (timerTicker != null) {
            timerTicker.unbind();
        }
        TimerTicker<Long, TimerTick> timerTicker2 = new TimerTicker<>(0L, getRef().getContainer().g(), TimerHelper$show$1.INSTANCE, new TimerHelper$show$2(this), 1, null);
        this.timerTicker = timerTicker2;
        timerTicker2.bind(Long.valueOf(time));
    }

    public final void unbind() {
        TimerTicker<Long, TimerTick> timerTicker = this.timerTicker;
        if (timerTicker != null) {
            timerTicker.unbind();
        }
    }
}
