package com.orkestapay.orkestapay.core.googlepay;

import com.orkestapay.orkestapay.client.model.PaymentMethodResponse;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&J\u0010\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u0006H&J\u0010\u0010\u0007\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\tH&J\u0010\u0010\n\u001a\u00020\u00032\u0006\u0010\u000b\u001a\u00020\fH&¨\u0006\r"}, d2 = {"Lcom/orkestapay/orkestapay/core/googlepay/GooglePayCallback;", "", "onCancel", "", "onError", "error", "", "onReady", "isReady", "", "onSuccess", "paymentMethod", "Lcom/orkestapay/orkestapay/client/model/PaymentMethodResponse;", "Orkestapay_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public interface GooglePayCallback {
    void onCancel();

    void onError(@NotNull String error);

    void onReady(boolean isReady);

    void onSuccess(@NotNull PaymentMethodResponse paymentMethod);
}
