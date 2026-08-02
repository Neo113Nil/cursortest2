package ru.ozon.app.android.regulardraw.widgets.warningTooltip.presentation;

import Ae.C2399j;
import Ae.M0;
import Ae.O0;
import Ae.x0;
import androidx.lifecycle.w0;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0001\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\r\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0003J\r\u0010\u0006\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0003R\u001a\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\nR\u001d\u0010\f\u001a\b\u0012\u0004\u0012\u00020\b0\u000b8\u0006¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, d2 = {"Lru/ozon/app/android/regulardraw/widgets/warningTooltip/presentation/WarningTooltipViewModel;", "Landroidx/lifecycle/w0;", "<init>", "()V", "", "hideTooltip", "onPageRefreshed", "LAe/x0;", "", "_showWarningTooltip", "LAe/x0;", "LAe/M0;", "showWarningTooltip", "LAe/M0;", "getShowWarningTooltip", "()LAe/M0;", "regulardraw_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class WarningTooltipViewModel extends w0 {

    @NotNull
    private final x0<Boolean> _showWarningTooltip;

    @NotNull
    private final M0<Boolean> showWarningTooltip;

    public WarningTooltipViewModel() {
        x0<Boolean> a11 = O0.a(Boolean.TRUE);
        this._showWarningTooltip = a11;
        this.showWarningTooltip = C2399j.b(a11);
    }

    @NotNull
    public final M0<Boolean> getShowWarningTooltip() {
        return this.showWarningTooltip;
    }

    public final void hideTooltip() {
        this._showWarningTooltip.setValue(Boolean.FALSE);
    }

    public final void onPageRefreshed() {
        this._showWarningTooltip.setValue(Boolean.TRUE);
    }
}
