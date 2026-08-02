package ru.ozon.app.android.travel.molecules.viewModel;

import Ae.B0;
import Ae.C2399j;
import Ae.O0;
import Ae.x0;
import androidx.lifecycle.w0;
import kotlin.Metadata;
import kotlin.Pair;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bR\u0016\u0010\n\u001a\u00020\t8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\n\u0010\u000bR&\u0010\u000e\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\t0\r0\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR)\u0010\u0011\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\t0\r0\u00108\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\u0013¨\u0006\u0014"}, d2 = {"Lru/ozon/app/android/travel/molecules/viewModel/ButtonWithInformationV2IsVisibleViewModel;", "Landroidx/lifecycle/w0;", "<init>", "()V", "", "actualVisiblePercent", "", "onVisibilityChanged", "(F)V", "", "skipAnimation", "Z", "LAe/x0;", "Lkotlin/Pair;", "_isLargeButtonVisibleFlow", "LAe/x0;", "LAe/B0;", "isLargeButtonVisibleFlow", "LAe/B0;", "()LAe/B0;", "molecules_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class ButtonWithInformationV2IsVisibleViewModel extends w0 {

    @NotNull
    private final x0<Pair<Boolean, Boolean>> _isLargeButtonVisibleFlow;

    @NotNull
    private final B0<Pair<Boolean, Boolean>> isLargeButtonVisibleFlow;
    private boolean skipAnimation = true;

    public ButtonWithInformationV2IsVisibleViewModel() {
        x0<Pair<Boolean, Boolean>> a11 = O0.a(new Pair(Boolean.FALSE, Boolean.TRUE));
        this._isLargeButtonVisibleFlow = a11;
        this.isLargeButtonVisibleFlow = C2399j.a(a11);
    }

    @NotNull
    public final B0<Pair<Boolean, Boolean>> isLargeButtonVisibleFlow() {
        return this.isLargeButtonVisibleFlow;
    }

    public final void onVisibilityChanged(float actualVisiblePercent) {
        if (actualVisiblePercent == 0.0f) {
            return;
        }
        if (actualVisiblePercent < 1.0f) {
            this.skipAnimation = false;
        }
        this._isLargeButtonVisibleFlow.setValue(new Pair<>(Boolean.valueOf(actualVisiblePercent > 0.75f), Boolean.valueOf(this.skipAnimation)));
    }
}
