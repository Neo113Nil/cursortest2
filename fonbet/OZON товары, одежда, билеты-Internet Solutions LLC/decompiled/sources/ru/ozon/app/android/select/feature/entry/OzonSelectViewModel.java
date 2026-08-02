package ru.ozon.app.android.select.feature.entry;

import Ae.C2399j;
import Ae.M0;
import Ae.O0;
import Ae.x0;
import androidx.lifecycle.w0;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import xe.C10727i;

@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\r\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0003J\r\u0010\u0006\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0003J\r\u0010\u0007\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\u0003J\r\u0010\t\u001a\u00020\b¢\u0006\u0004\b\t\u0010\nR\u0014\u0010\f\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\rR\u001a\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\b0\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u001d\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\b0\u00118\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015¨\u0006\u0016"}, d2 = {"Lru/ozon/app/android/select/feature/entry/OzonSelectViewModel;", "Landroidx/lifecycle/w0;", "<init>", "()V", "", "onSplashEnded", "delayedCloseSplash", "fakeSplashShowed", "", "isFakeSplashShowed", "()Z", "Ljava/util/concurrent/atomic/AtomicBoolean;", "splashScreenExitHandled", "Ljava/util/concurrent/atomic/AtomicBoolean;", "LAe/x0;", "_splashCompletedFlow", "LAe/x0;", "LAe/M0;", "splashCompletedFlow", "LAe/M0;", "getSplashCompletedFlow", "()LAe/M0;", "entry_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class OzonSelectViewModel extends w0 {

    @NotNull
    private final x0<Boolean> _splashCompletedFlow;

    @NotNull
    private final M0<Boolean> splashCompletedFlow;

    @NotNull
    private final AtomicBoolean splashScreenExitHandled = new AtomicBoolean(false);

    public OzonSelectViewModel() {
        x0<Boolean> a11 = O0.a(Boolean.FALSE);
        this._splashCompletedFlow = a11;
        this.splashCompletedFlow = C2399j.b(a11);
    }

    public final void delayedCloseSplash() {
        C10727i.c(androidx.lifecycle.x0.a(this), null, null, new OzonSelectViewModel$delayedCloseSplash$1(this, null), 3);
    }

    public final void fakeSplashShowed() {
        this.splashScreenExitHandled.set(true);
    }

    @NotNull
    public final M0<Boolean> getSplashCompletedFlow() {
        return this.splashCompletedFlow;
    }

    public final boolean isFakeSplashShowed() {
        return this.splashScreenExitHandled.get();
    }

    public final void onSplashEnded() {
        this._splashCompletedFlow.setValue(Boolean.TRUE);
    }
}
