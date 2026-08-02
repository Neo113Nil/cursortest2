package com.orkestapay.orkestapay.core.clicktopay;

import android.content.Context;
import android.content.Intent;
import com.orkestapay.orkestapay.client.model.clicktopay.ClickToPay;
import com.orkestapay.orkestapay.client.model.clicktopay.ClickToPayStyle;
import com.orkestapay.orkestapay.core.networking.CoreConfig;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J(\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\f2\u0006\u0010\r\u001a\u00020\u000eR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u000f"}, d2 = {"Lcom/orkestapay/orkestapay/core/clicktopay/ClickToPayClient;", "", "coreConfig", "Lcom/orkestapay/orkestapay/core/networking/CoreConfig;", "(Lcom/orkestapay/orkestapay/core/networking/CoreConfig;)V", "openClickToPayCheckout", "", "context", "Landroid/content/Context;", "clickToPay", "Lcom/orkestapay/orkestapay/client/model/clicktopay/ClickToPay;", "style", "Lcom/orkestapay/orkestapay/client/model/clicktopay/ClickToPayStyle;", "callback", "Lcom/orkestapay/orkestapay/core/clicktopay/ClickToPayListener;", "Orkestapay_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class ClickToPayClient {

    @NotNull
    private final CoreConfig coreConfig;

    public ClickToPayClient(@NotNull CoreConfig coreConfig) {
        Intrinsics.checkNotNullParameter(coreConfig, "coreConfig");
        this.coreConfig = coreConfig;
    }

    public final void openClickToPayCheckout(@NotNull Context context, @NotNull ClickToPay clickToPay, @Nullable ClickToPayStyle style, @NotNull ClickToPayListener callback) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(clickToPay, "clickToPay");
        Intrinsics.checkNotNullParameter(callback, "callback");
        WebviewActivity.INSTANCE.setListener(callback);
        Intent intent = new Intent(context, (Class<?>) WebviewActivity.class);
        intent.putExtra(WebviewActivity.CLICK_TO_PAY, clickToPay);
        intent.putExtra("MERCHANT_ID", this.coreConfig.getMerchantId());
        intent.putExtra(WebviewActivity.PUBLIC_KEY, this.coreConfig.getPublicKey());
        intent.putExtra(WebviewActivity.URL, this.coreConfig.getEnvironment().getCheckoutUrl());
        if (style != null) {
            intent.putExtra(WebviewActivity.STYLE, style);
        }
        context.startActivity(intent);
    }
}
