package ru.ozon.app.android.regulardraw.widgets.morkovskTabbar.v2.presentation.collapsible;

import Ae.M0;
import Ae.O0;
import Ae.x0;
import androidx.lifecycle.w0;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\r\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0003J\r\u0010\u0006\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0003R\u001a\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\nR\u001d\u0010\f\u001a\b\u0012\u0004\u0012\u00020\b0\u000b8\u0006¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\f\u0010\u000e¨\u0006\u000f"}, d2 = {"Lru/ozon/app/android/regulardraw/widgets/morkovskTabbar/v2/presentation/collapsible/CollapsibleBottomContentViewModel;", "Landroidx/lifecycle/w0;", "<init>", "()V", "", "onScrollDown", "onScrollUp", "LAe/x0;", "", "_isCollapsed", "LAe/x0;", "LAe/M0;", "isCollapsed", "LAe/M0;", "()LAe/M0;", "regulardraw_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class CollapsibleBottomContentViewModel extends w0 {

    @NotNull
    private final x0<Boolean> _isCollapsed;

    @NotNull
    private final M0<Boolean> isCollapsed;

    public CollapsibleBottomContentViewModel() {
        x0<Boolean> a11 = O0.a(Boolean.FALSE);
        this._isCollapsed = a11;
        this.isCollapsed = a11;
    }

    @NotNull
    public final M0<Boolean> isCollapsed() {
        return this.isCollapsed;
    }

    public final void onScrollDown() {
        this._isCollapsed.setValue(Boolean.TRUE);
    }

    public final void onScrollUp() {
        this._isCollapsed.setValue(Boolean.FALSE);
    }
}
