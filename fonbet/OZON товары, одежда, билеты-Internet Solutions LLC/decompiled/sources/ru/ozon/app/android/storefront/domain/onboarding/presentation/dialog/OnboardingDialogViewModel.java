package ru.ozon.app.android.storefront.domain.onboarding.presentation.dialog;

import androidx.lifecycle.P;
import androidx.lifecycle.V;
import androidx.lifecycle.w0;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.utils.livedata.SingleLiveEvent;

@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\r\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0003J\r\u0010\u0006\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0003R\u0016\u0010\b\u001a\u00020\u00078\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\b\u0010\tR\u001a\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00070\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u001d\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00070\r8\u0006¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, d2 = {"Lru/ozon/app/android/storefront/domain/onboarding/presentation/dialog/OnboardingDialogViewModel;", "Landroidx/lifecycle/w0;", "<init>", "()V", "", "showOnboarding", "onShowComplete", "", "isShown", "Z", "Landroidx/lifecycle/V;", "_shownEvent", "Landroidx/lifecycle/V;", "Landroidx/lifecycle/P;", "shownEvent", "Landroidx/lifecycle/P;", "getShownEvent", "()Landroidx/lifecycle/P;", "onboarding_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class OnboardingDialogViewModel extends w0 {

    @NotNull
    private final V<Boolean> _shownEvent;
    private boolean isShown;

    @NotNull
    private final P<Boolean> shownEvent;

    public OnboardingDialogViewModel() {
        SingleLiveEvent singleLiveEvent = new SingleLiveEvent();
        this._shownEvent = singleLiveEvent;
        this.shownEvent = singleLiveEvent;
    }

    @NotNull
    public final P<Boolean> getShownEvent() {
        return this.shownEvent;
    }

    public final void onShowComplete() {
        this.isShown = true;
    }

    public final void showOnboarding() {
        this._shownEvent.setValue(Boolean.valueOf(this.isShown));
    }
}
