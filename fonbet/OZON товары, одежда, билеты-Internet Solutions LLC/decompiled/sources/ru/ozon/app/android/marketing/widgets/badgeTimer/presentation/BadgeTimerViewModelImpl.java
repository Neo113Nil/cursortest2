package ru.ozon.app.android.marketing.widgets.badgeTimer.presentation;

import Bt.C2673b;
import Dp.C2877a;
import Lz.d;
import androidx.lifecycle.V;
import h20.InterfaceC6786a;
import io.reactivex.p;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import mc.C8125a;
import nc.InterfaceC8487b;
import org.jetbrains.annotations.NotNull;
import org.joda.time.DateTime;
import org.joda.time.Duration;
import org.joda.time.Period;
import ru.ozon.app.android.marketing.R$plurals;
import ru.ozon.app.android.marketing.R$string;
import ru.ozon.app.android.uikit.text.StringProvider;
import ru.ozon.app.android.utils.DateUtilsKt;

@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00060\u0001j\u0002`\u00022\u00020\u0003B\t\b\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\b\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u000e\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u000e\u0010\rJ\u0013\u0010\u0011\u001a\u00020\u0010*\u00020\u000fH\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u0013\u0010\u0013\u001a\u00020\u0010*\u00020\u0006H\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0015\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u0015\u0010\u0005J\u000f\u0010\u0016\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u0016\u0010\u0005J\u000f\u0010\u0017\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u0017\u0010\u0005J\u0017\u0010\u0018\u001a\u00020\u000b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0018\u0010\rR\"\u0010\u001a\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00100\u00198\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u0018\u0010\u001f\u001a\u0004\u0018\u00010\u001e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001f\u0010 R\u0014\u0010!\u001a\u00020\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010\"¨\u0006#"}, d2 = {"Lru/ozon/app/android/marketing/widgets/badgeTimer/presentation/BadgeTimerViewModelImpl;", "Lh20/a;", "Lru/ozon/app/android/composer/viewmodel/ComposerWidgetViewModel;", "Lru/ozon/app/android/marketing/widgets/badgeTimer/presentation/BadgeTimerViewModel;", "<init>", "()V", "", "timestampEnd", "getMillisLeft", "(J)J", "millisLeft", "", "onTick", "(J)V", "startTimer", "", "", "toFormattedDate", "(I)Ljava/lang/String;", "toFormattedTime", "(J)Ljava/lang/String;", "stopTimer", "clear", "onCleared", "calculateMillisRemain", "Landroidx/lifecycle/V;", "countdown", "Landroidx/lifecycle/V;", "getCountdown", "()Landroidx/lifecycle/V;", "Lnc/b;", "timerDisposable", "Lnc/b;", "actionEnded", "Ljava/lang/String;", "marketing_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class BadgeTimerViewModelImpl implements InterfaceC6786a, BadgeTimerViewModel {
    private InterfaceC8487b timerDisposable;

    @NotNull
    private final V<String> countdown = new V<>();

    @NotNull
    private final String actionEnded = StringProvider.getString(R$string.marketing_action_ended);

    private final long getMillisLeft(long timestampEnd) {
        return timestampEnd - new DateTime().getMillis();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void onTick(long millisLeft) {
        long seconds = TimeUnit.MILLISECONDS.toSeconds(millisLeft);
        if (seconds <= 0) {
            stopTimer();
        } else if (seconds < 86400) {
            getCountdown().setValue(toFormattedTime(millisLeft));
        } else {
            getCountdown().setValue(toFormattedDate((int) Math.ceil((seconds + 1) / 86400.0f)));
        }
    }

    private final void startTimer(long millisLeft) {
        InterfaceC8487b interfaceC8487b = this.timerDisposable;
        if (interfaceC8487b != null) {
            interfaceC8487b.dispose();
        }
        this.timerDisposable = p.interval(0L, 1L, TimeUnit.SECONDS).map(new d(new BadgeTimerViewModelImpl$startTimer$1(millisLeft), 4)).observeOn(C8125a.a()).subscribe(new C2877a(new BadgeTimerViewModelImpl$startTimer$2(this), 8), new C2673b(new BadgeTimerViewModelImpl$startTimer$3(this), 5));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Long startTimer$lambda$0(Function1 function1, Object p02) {
        Intrinsics.checkNotNullParameter(p02, "p0");
        return (Long) function1.invoke(p02);
    }

    private final String toFormattedDate(int i11) {
        return StringProvider.getQuantityString(R$plurals.marketing_action_days, i11, Integer.valueOf(i11));
    }

    private final String toFormattedTime(long j11) {
        Duration a11 = Duration.a(j11);
        a11.getClass();
        Period period = new Period(a11.getMillis());
        return StringProvider.getString(R$string.bundle_countdown_time, DateUtilsKt.toTwoDigitString(period.u()), DateUtilsKt.toTwoDigitString(period.y()), DateUtilsKt.toTwoDigitString(period.B()));
    }

    @Override // ru.ozon.app.android.marketing.widgets.badgeTimer.presentation.BadgeTimerViewModel
    public void calculateMillisRemain(long timestampEnd) {
        long millisLeft = getMillisLeft(timestampEnd);
        if (millisLeft <= 0) {
            stopTimer();
        } else {
            startTimer(millisLeft);
        }
    }

    @Override // ru.ozon.app.android.marketing.widgets.badgeTimer.presentation.BadgeTimerViewModel
    public void clear() {
        InterfaceC8487b interfaceC8487b = this.timerDisposable;
        if (interfaceC8487b != null) {
            interfaceC8487b.dispose();
        }
    }

    @Override // h20.InterfaceC6786a
    public void onCleared() {
        InterfaceC8487b interfaceC8487b = this.timerDisposable;
        if (interfaceC8487b != null) {
            interfaceC8487b.dispose();
        }
    }

    public void stopTimer() {
        getCountdown().setValue(this.actionEnded);
        InterfaceC8487b interfaceC8487b = this.timerDisposable;
        if (interfaceC8487b != null) {
            interfaceC8487b.dispose();
        }
    }

    @Override // ru.ozon.app.android.marketing.widgets.badgeTimer.presentation.BadgeTimerViewModel
    @NotNull
    public V<String> getCountdown() {
        return this.countdown;
    }
}
