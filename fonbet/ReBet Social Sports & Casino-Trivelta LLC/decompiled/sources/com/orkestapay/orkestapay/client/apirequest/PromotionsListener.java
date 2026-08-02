package com.orkestapay.orkestapay.client.apirequest;

import com.orkestapay.orkestapay.client.model.PromotionsResponse;
import com.orkestapay.orkestapay.core.networking.OrkestapayError;
import java.util.List;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\u0016\u0010\u0006\u001a\u00020\u00032\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\bH&¨\u0006\n"}, d2 = {"Lcom/orkestapay/orkestapay/client/apirequest/PromotionsListener;", "", "onError", "", "error", "Lcom/orkestapay/orkestapay/core/networking/OrkestapayError;", "onSuccess", "promotions", "", "Lcom/orkestapay/orkestapay/client/model/PromotionsResponse;", "Orkestapay_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public interface PromotionsListener {
    void onError(@NotNull OrkestapayError error);

    void onSuccess(@NotNull List<PromotionsResponse> promotions);
}
