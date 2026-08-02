package ru.ozon.app.android.ugc.core.widgets.timerButton.presentation;

import Ae.C2399j;
import Ae.M0;
import Ae.O0;
import Ae.x0;
import androidx.lifecycle.w0;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import xe.C10727i;

@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0003\b\u0001\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bR\u001a\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00040\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u000bR\u001d\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00040\f8\u0006¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\u0016\u0010\u0012\u001a\u00020\u00118\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, d2 = {"Lru/ozon/app/android/ugc/core/widgets/timerButton/presentation/TimerButtonViewModel;", "Landroidx/lifecycle/w0;", "<init>", "()V", "", "secondsCountdown", "", "setup", "(I)V", "LAe/x0;", "_secondsLeft", "LAe/x0;", "LAe/M0;", "secondsLeft", "LAe/M0;", "getSecondsLeft", "()LAe/M0;", "", "isInitialized", "Z", "core_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class TimerButtonViewModel extends w0 {

    @NotNull
    private final x0<Integer> _secondsLeft;
    private boolean isInitialized;

    @NotNull
    private final M0<Integer> secondsLeft;

    public TimerButtonViewModel() {
        x0<Integer> a11 = O0.a(0);
        this._secondsLeft = a11;
        this.secondsLeft = C2399j.b(a11);
    }

    @NotNull
    public final M0<Integer> getSecondsLeft() {
        return this.secondsLeft;
    }

    public final void setup(int secondsCountdown) {
        if (this.isInitialized) {
            return;
        }
        this.isInitialized = true;
        this._secondsLeft.setValue(Integer.valueOf(secondsCountdown));
        C10727i.c(androidx.lifecycle.x0.a(this), null, null, new TimerButtonViewModel$setup$1(this, null), 3);
    }
}
