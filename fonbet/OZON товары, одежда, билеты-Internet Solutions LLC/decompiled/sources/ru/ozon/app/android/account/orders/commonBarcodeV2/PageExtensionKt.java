package ru.ozon.app.android.account.orders.commonBarcodeV2;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.h;

@Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u000b\n\u0002\u0010\u000e\n\u0000\u001a\u000e\u0010\u0000\u001a\u00020\u0001*\u0004\u0018\u00010\u0002H\u0000¨\u0006\u0003"}, d2 = {"isBarcodePage", "", "", "cs-orders_prodGoogleAllVendorsRelease"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class PageExtensionKt {
    public static final boolean isBarcodePage(String str) {
        Intrinsics.checkNotNullExpressionValue("/my/orderlist/barcode", "toString(...)");
        Intrinsics.checkNotNullExpressionValue("/my/deliveryBarcode", "toString(...)");
        return (str != null && h.e0(str, "/my/orderlist/barcode", false)) || (str != null && h.e0(str, "/my/deliveryBarcode", false));
    }
}
