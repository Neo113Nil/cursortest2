package ru.ozon.app.android.cart.common.domain.delegate;

import Ae.InterfaceC2395h;
import java.util.Map;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\bf\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\u0005\u001a\u00020\u0002H&¢\u0006\u0004\b\u0005\u0010\u0004J\u0017\u0010\b\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0006H&¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\n\u001a\u00020\u0002H&¢\u0006\u0004\b\n\u0010\u0004J\u000f\u0010\u000b\u001a\u00020\u0002H&¢\u0006\u0004\b\u000b\u0010\u0004J\u000f\u0010\r\u001a\u00020\fH&¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u000f\u001a\u00020\fH&¢\u0006\u0004\b\u000f\u0010\u000eJ\u000f\u0010\u0010\u001a\u00020\fH&¢\u0006\u0004\b\u0010\u0010\u000eR \u0010\u0015\u001a\u000e\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u00010\u00118&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0014R\u001a\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\f0\u00168&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0017\u0010\u0018R\u0014\u0010\u001b\u001a\u00020\f8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u001a\u0010\u000e¨\u0006\u001c"}, d2 = {"Lru/ozon/app/android/cart/common/domain/delegate/CartModeManager;", "", "", "setCartViewMode", "()V", "saveCartMode", "Lru/ozon/app/android/cart/common/domain/delegate/ResetCartModesReason;", "reason", "resetCartModes", "(Lru/ozon/app/android/cart/common/domain/delegate/ResetCartModesReason;)V", "stopResetCartModes", "resetState", "", "enabledCartModes", "()Z", "enabledResetPerAction", "enableResetForPartialClose", "", "", "getDefaultRequestParams", "()Ljava/util/Map;", "defaultRequestParams", "LAe/h;", "getProcessingResetAction", "()LAe/h;", "processingResetAction", "getNeedSetCartViewMode", "needSetCartViewMode", "cart_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public interface CartModeManager {
    boolean enableResetForPartialClose();

    boolean enabledCartModes();

    boolean enabledResetPerAction();

    @NotNull
    Map<String, Object> getDefaultRequestParams();

    boolean getNeedSetCartViewMode();

    @NotNull
    InterfaceC2395h<Boolean> getProcessingResetAction();

    void resetCartModes(@NotNull ResetCartModesReason reason);

    void resetState();

    void saveCartMode();

    void setCartViewMode();

    void stopResetCartModes();
}
