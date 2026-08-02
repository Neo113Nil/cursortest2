package ru.ozon.app.android.composer.widgets.v2.onboarding.presentation.dialog;

import android.os.CountDownTimer;
import androidx.lifecycle.P;
import androidx.lifecycle.V;
import androidx.lifecycle.w0;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.cart.common.dynamicElement.DynamicElementDTO;
import ru.ozon.app.android.utils.livedata.SingleLiveEvent;

@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0001\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0007\u0010\bR\u0018\u0010\n\u001a\u0004\u0018\u00010\t8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\n\u0010\u000bR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR\u001d\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\r0\u00108\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014¨\u0006\u0015"}, d2 = {"Lru/ozon/app/android/composer/widgets/v2/onboarding/presentation/dialog/OnboardingDialogViewModel;", "Landroidx/lifecycle/w0;", "<init>", "()V", "", "time", "", "startTimer", "(Ljava/lang/Long;)V", "Landroid/os/CountDownTimer;", DynamicElementDTO.TIMER, "Landroid/os/CountDownTimer;", "Landroidx/lifecycle/V;", "", "_timerEndEvent", "Landroidx/lifecycle/V;", "Landroidx/lifecycle/P;", "timerEndEvent", "Landroidx/lifecycle/P;", "getTimerEndEvent", "()Landroidx/lifecycle/P;", "composer_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class OnboardingDialogViewModel extends w0 {

    @NotNull
    private final V<Boolean> _timerEndEvent;
    private CountDownTimer timer;

    @NotNull
    private final P<Boolean> timerEndEvent;

    public OnboardingDialogViewModel() {
        SingleLiveEvent singleLiveEvent = new SingleLiveEvent();
        this._timerEndEvent = singleLiveEvent;
        this.timerEndEvent = singleLiveEvent;
    }

    @NotNull
    public final P<Boolean> getTimerEndEvent() {
        return this.timerEndEvent;
    }

    public final void startTimer(final Long time) {
        if (time == null) {
            return;
        }
        final long millis = TimeUnit.SECONDS.toMillis(1L);
        this.timer = new CountDownTimer(time, this, millis) { // from class: ru.ozon.app.android.composer.widgets.v2.onboarding.presentation.dialog.OnboardingDialogViewModel$startTimer$1
            final /* synthetic */ OnboardingDialogViewModel this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(time.longValue(), millis);
                this.this$0 = this;
            }

            @Override // android.os.CountDownTimer
            public void onFinish() {
                V v11;
                v11 = this.this$0._timerEndEvent;
                v11.setValue(Boolean.TRUE);
            }

            @Override // android.os.CountDownTimer
            public void onTick(long millisUntilFinished) {
            }
        }.start();
    }
}
