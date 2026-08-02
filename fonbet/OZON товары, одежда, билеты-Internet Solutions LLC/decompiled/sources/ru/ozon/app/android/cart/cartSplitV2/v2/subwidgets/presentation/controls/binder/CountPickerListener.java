package ru.ozon.app.android.cart.cartSplitV2.v2.subwidgets.presentation.controls.binder;

import com.google.android.gms.measurement.api.AppMeasurementSdk;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0000\b`\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&J\b\u0010\u0004\u001a\u00020\u0003H&J\b\u0010\u0005\u001a\u00020\u0003H&J\u0010\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\bH&¨\u0006\t"}, d2 = {"Lru/ozon/app/android/cart/cartSplitV2/v2/subwidgets/presentation/controls/binder/CountPickerListener;", "", "onDecreaseQuantity", "", "onIncreaseQuantity", "onKeyboardHided", "onInputValueChanged", AppMeasurementSdk.ConditionalUserProperty.VALUE, "", "cart_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public interface CountPickerListener {
    void onDecreaseQuantity();

    void onIncreaseQuantity();

    void onInputValueChanged(@NotNull String value);

    void onKeyboardHided();
}
