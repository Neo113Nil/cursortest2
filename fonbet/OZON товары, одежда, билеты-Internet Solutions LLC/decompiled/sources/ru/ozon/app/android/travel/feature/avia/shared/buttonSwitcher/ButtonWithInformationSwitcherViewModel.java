package ru.ozon.app.android.travel.feature.avia.shared.buttonSwitcher;

import Ae.B0;
import Ae.C0;
import Ae.C2399j;
import Ae.E0;
import androidx.lifecycle.w0;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import ze.EnumC11113a;

@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bR\u001a\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00040\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u000bR\u001d\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00040\f8\u0006¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, d2 = {"Lru/ozon/app/android/travel/feature/avia/shared/buttonSwitcher/ButtonWithInformationSwitcherViewModel;", "Landroidx/lifecycle/w0;", "<init>", "()V", "", "isVisible", "", "onSwitcherChanged", "(Z)V", "LAe/w0;", "_switcherState", "LAe/w0;", "LAe/B0;", "switcherState", "LAe/B0;", "getSwitcherState", "()LAe/B0;", "avia_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class ButtonWithInformationSwitcherViewModel extends w0 {

    @NotNull
    private final Ae.w0<Boolean> _switcherState;

    @NotNull
    private final B0<Boolean> switcherState;

    public ButtonWithInformationSwitcherViewModel() {
        C0 b11 = E0.b(1, 0, EnumC11113a.DROP_OLDEST, 2);
        this._switcherState = b11;
        this.switcherState = C2399j.a(b11);
    }

    @NotNull
    public final B0<Boolean> getSwitcherState() {
        return this.switcherState;
    }

    public final void onSwitcherChanged(boolean isVisible) {
        this._switcherState.tryEmit(Boolean.valueOf(isVisible));
    }
}
