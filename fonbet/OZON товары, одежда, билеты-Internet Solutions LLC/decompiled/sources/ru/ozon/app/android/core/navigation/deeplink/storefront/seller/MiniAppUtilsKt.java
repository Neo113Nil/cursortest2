package ru.ozon.app.android.core.navigation.deeplink.storefront.seller;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.h;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0000\u001a\u0010\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\u0000¨\u0006\u0004"}, d2 = {"isSameSellerMiniAppExist", "", "currentMiniApp", "", "main_prodGoogleAllVendorsRelease"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class MiniAppUtilsKt {
    public static final boolean isSameSellerMiniAppExist(@NotNull String currentMiniApp) {
        Intrinsics.checkNotNullParameter(currentMiniApp, "currentMiniApp");
        return h.e0(currentMiniApp, "seller_", false) || h.e0(currentMiniApp, "express_seller_", false);
    }
}
