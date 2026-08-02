package ru.ozon.app.android.cart.common.presentation;

import Ae.C2399j;
import Ae.M0;
import Ae.O0;
import Ae.x0;
import androidx.lifecycle.w0;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bR\u001a\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00040\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u000bR\u001d\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00040\f8\u0006¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\r\u0010\u000f¨\u0006\u0010"}, d2 = {"Lru/ozon/app/android/cart/common/presentation/TotalVisibilityViewModel;", "Landroidx/lifecycle/w0;", "<init>", "()V", "", "isVisible", "", "notifyVisibility", "(Z)V", "LAe/x0;", "_isVisibleFlow", "LAe/x0;", "LAe/M0;", "isVisibleFlow", "LAe/M0;", "()LAe/M0;", "cart_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class TotalVisibilityViewModel extends w0 {

    @NotNull
    private final x0<Boolean> _isVisibleFlow;

    @NotNull
    private final M0<Boolean> isVisibleFlow;

    public TotalVisibilityViewModel() {
        x0<Boolean> a11 = O0.a(Boolean.FALSE);
        this._isVisibleFlow = a11;
        this.isVisibleFlow = C2399j.b(a11);
    }

    @NotNull
    public final M0<Boolean> isVisibleFlow() {
        return this.isVisibleFlow;
    }

    public final void notifyVisibility(boolean isVisible) {
        this._isVisibleFlow.setValue(Boolean.valueOf(isVisible));
    }
}
