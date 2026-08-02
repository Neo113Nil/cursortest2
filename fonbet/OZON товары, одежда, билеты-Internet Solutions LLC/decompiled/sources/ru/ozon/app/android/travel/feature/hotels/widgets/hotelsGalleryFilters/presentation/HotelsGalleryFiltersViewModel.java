package ru.ozon.app.android.travel.feature.hotels.widgets.hotelsGalleryFilters.presentation;

import Ae.C2399j;
import Ae.M0;
import Ae.O0;
import Ae.x0;
import androidx.lifecycle.w0;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0001\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bJ\r\u0010\t\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\u0003J\r\u0010\n\u001a\u00020\u0006¢\u0006\u0004\b\n\u0010\u0003J'\u0010\u000f\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\u000b2\b\b\u0002\u0010\u000e\u001a\u00020\u0004¢\u0006\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00040\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u001a\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00040\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0013R\u001a\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00150\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0013R\u0017\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00040\u00178F¢\u0006\u0006\u001a\u0004\b\u0018\u0010\u0019R\u0017\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00040\u00178F¢\u0006\u0006\u001a\u0004\b\u001b\u0010\u0019R\u0017\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u00150\u00178F¢\u0006\u0006\u001a\u0004\b\u001c\u0010\u0019¨\u0006\u001e"}, d2 = {"Lru/ozon/app/android/travel/feature/hotels/widgets/hotelsGalleryFilters/presentation/HotelsGalleryFiltersViewModel;", "Landroidx/lifecycle/w0;", "<init>", "()V", "", "isVisible", "", "updateStickyVisibility", "(Z)V", "startRefresh", "finishRefresh", "", "position", "offset", "fromUserInteraction", "updateScrollState", "(IIZ)V", "LAe/x0;", "_stickyVisibleState", "LAe/x0;", "_isRefreshing", "Lru/ozon/app/android/travel/feature/hotels/widgets/hotelsGalleryFilters/presentation/ScrollState;", "_scrollState", "LAe/M0;", "getStickyVisibleState", "()LAe/M0;", "stickyVisibleState", "isRefreshing", "getScrollState", "scrollState", "hotels_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class HotelsGalleryFiltersViewModel extends w0 {

    @NotNull
    private final x0<Boolean> _isRefreshing;

    @NotNull
    private final x0<ScrollState> _scrollState;

    @NotNull
    private final x0<Boolean> _stickyVisibleState;

    public HotelsGalleryFiltersViewModel() {
        Boolean bool = Boolean.FALSE;
        this._stickyVisibleState = O0.a(bool);
        this._isRefreshing = O0.a(bool);
        int i11 = 0;
        this._scrollState = O0.a(new ScrollState(i11, i11, 3, null));
    }

    public final void finishRefresh() {
        this._isRefreshing.setValue(Boolean.FALSE);
    }

    @NotNull
    public final M0<ScrollState> getScrollState() {
        return C2399j.b(this._scrollState);
    }

    @NotNull
    public final M0<Boolean> getStickyVisibleState() {
        return C2399j.b(this._stickyVisibleState);
    }

    @NotNull
    public final M0<Boolean> isRefreshing() {
        return C2399j.b(this._isRefreshing);
    }

    public final void startRefresh() {
        this._isRefreshing.setValue(Boolean.TRUE);
        this._stickyVisibleState.setValue(Boolean.FALSE);
    }

    public final void updateScrollState(int position, int offset, boolean fromUserInteraction) {
        ScrollState value;
        ScrollState scrollState;
        if (!this._isRefreshing.getValue().booleanValue() && position >= 0 && fromUserInteraction) {
            x0<ScrollState> x0Var = this._scrollState;
            do {
                value = x0Var.getValue();
                scrollState = value;
                if (scrollState.getPosition() != position || scrollState.getOffset() != offset) {
                    scrollState = new ScrollState(position, offset);
                }
            } while (!x0Var.b(value, scrollState));
        }
    }

    public final void updateStickyVisibility(boolean isVisible) {
        if (this._isRefreshing.getValue().booleanValue() || this._stickyVisibleState.getValue().booleanValue() == isVisible) {
            return;
        }
        this._stickyVisibleState.setValue(Boolean.valueOf(isVisible));
    }
}
