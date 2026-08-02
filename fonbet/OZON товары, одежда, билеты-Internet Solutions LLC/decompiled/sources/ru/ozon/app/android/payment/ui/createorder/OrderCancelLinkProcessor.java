package ru.ozon.app.android.payment.ui.createorder;

import kotlin.Metadata;
import kotlin.text.h;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\u0018\u0000 \u00072\u00020\u0001:\u0001\u0007B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0014\u0010\u0004\u001a\u0004\u0018\u00010\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005H\u0016¨\u0006\b"}, d2 = {"Lru/ozon/app/android/payment/ui/createorder/OrderCancelLinkProcessor;", "Lru/ozon/app/android/payment/ui/createorder/CancelLinkProcessor;", "<init>", "()V", "transform", "", "link", "Companion", "payment_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class OrderCancelLinkProcessor implements CancelLinkProcessor {
    @Override // ru.ozon.app.android.payment.ui.createorder.CancelLinkProcessor
    public String transform(String link) {
        if (link != null) {
            return h.X(link, "clearBackStack=true", "clearBackStack=false", false);
        }
        return null;
    }
}
