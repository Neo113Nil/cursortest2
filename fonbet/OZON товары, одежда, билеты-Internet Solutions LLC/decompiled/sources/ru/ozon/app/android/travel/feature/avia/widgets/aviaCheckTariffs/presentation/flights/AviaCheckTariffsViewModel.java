package ru.ozon.app.android.travel.feature.avia.widgets.aviaCheckTariffs.presentation.flights;

import Ae.C2406m0;
import Ae.C2417s0;
import Ae.InterfaceC2395h;
import Ae.O0;
import Ae.x0;
import androidx.lifecycle.w0;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.travel.feature.avia.widgets.aviaCheckTariffs.presentation.flights.AviaCheckTariffsVO;

@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0001\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bJ\r\u0010\t\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\u0003R\"\u0010\u000b\u001a\u00020\n8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000b\u0010\f\u001a\u0004\b\u000b\u0010\r\"\u0004\b\u000e\u0010\u000fR\"\u0010\u0010\u001a\u00020\n8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0010\u0010\f\u001a\u0004\b\u0010\u0010\r\"\u0004\b\u0011\u0010\u000fR\"\u0010\u0013\u001a\u00020\u00128\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018R$\u0010\u001a\u001a\u0004\u0018\u00010\u00198\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001d\"\u0004\b\u001e\u0010\u001fR\u001a\u0010!\u001a\b\u0012\u0004\u0012\u00020\n0 8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010\"R\u001c\u0010#\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00040 8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010\"R\u001d\u0010%\u001a\b\u0012\u0004\u0012\u00020\u00040$8\u0006¢\u0006\f\n\u0004\b%\u0010&\u001a\u0004\b'\u0010(¨\u0006)"}, d2 = {"Lru/ozon/app/android/travel/feature/avia/widgets/aviaCheckTariffs/presentation/flights/AviaCheckTariffsViewModel;", "Landroidx/lifecycle/w0;", "<init>", "()V", "Lru/ozon/app/android/travel/feature/avia/widgets/aviaCheckTariffs/presentation/flights/AviaCheckTariffsVO$Content;", "data", "", "bindData", "(Lru/ozon/app/android/travel/feature/avia/widgets/aviaCheckTariffs/presentation/flights/AviaCheckTariffsVO$Content;)V", "onExpand", "", "isFirstScrollEnabled", "Z", "()Z", "setFirstScrollEnabled", "(Z)V", "isCalculateHeight", "setCalculateHeight", "", "cachedHeight", "I", "getCachedHeight", "()I", "setCachedHeight", "(I)V", "", "offerId", "Ljava/lang/String;", "getOfferId", "()Ljava/lang/String;", "setOfferId", "(Ljava/lang/String;)V", "LAe/x0;", "_isExpand", "LAe/x0;", "_widgetState", "LAe/h;", "widgetState", "LAe/h;", "getWidgetState", "()LAe/h;", "avia_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class AviaCheckTariffsViewModel extends w0 {

    @NotNull
    private final x0<Boolean> _isExpand;

    @NotNull
    private final x0<AviaCheckTariffsVO.Content> _widgetState;
    private int cachedHeight;
    private String offerId;

    @NotNull
    private final InterfaceC2395h<AviaCheckTariffsVO.Content> widgetState;
    private boolean isFirstScrollEnabled = true;
    private boolean isCalculateHeight = true;

    public AviaCheckTariffsViewModel() {
        x0<Boolean> a11 = O0.a(Boolean.FALSE);
        this._isExpand = a11;
        x0<AviaCheckTariffsVO.Content> a12 = O0.a(null);
        this._widgetState = a12;
        this.widgetState = new C2417s0(new C2406m0(a12), a11, new AviaCheckTariffsViewModel$widgetState$1(null));
    }

    public final void bindData(@NotNull AviaCheckTariffsVO.Content data) {
        Intrinsics.checkNotNullParameter(data, "data");
        this._widgetState.setValue(data);
    }

    public final int getCachedHeight() {
        return this.cachedHeight;
    }

    public final String getOfferId() {
        return this.offerId;
    }

    @NotNull
    public final InterfaceC2395h<AviaCheckTariffsVO.Content> getWidgetState() {
        return this.widgetState;
    }

    /* renamed from: isFirstScrollEnabled, reason: from getter */
    public final boolean getIsFirstScrollEnabled() {
        return this.isFirstScrollEnabled;
    }

    public final void onExpand() {
        this._isExpand.setValue(Boolean.valueOf(!r0.getValue().booleanValue()));
    }

    public final void setCachedHeight(int i11) {
        this.cachedHeight = i11;
    }

    public final void setCalculateHeight(boolean z11) {
        this.isCalculateHeight = z11;
    }

    public final void setFirstScrollEnabled(boolean z11) {
        this.isFirstScrollEnabled = z11;
    }

    public final void setOfferId(String str) {
        this.offerId = str;
    }
}
