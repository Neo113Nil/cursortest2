package ru.ozon.app.android.product.utils;

import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C7714v;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.h;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.sellerproducts.sellerProducts.data.model.ProductContainerDTO;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0003\u001a!\u0010\u0004\u001a\u00020\u00032\b\u0010\u0001\u001a\u0004\u0018\u00010\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0000¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"", "ratio", "defaultRatio", "", "computeRatio", "(Ljava/lang/String;Ljava/lang/String;)F", "product_prodGoogleAllVendorsRelease"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class RatioCalculatorKt {
    public static final float computeRatio(String str, @NotNull String defaultRatio) {
        Intrinsics.checkNotNullParameter(defaultRatio, "defaultRatio");
        if (Intrinsics.d(str, "1:1") || str == null) {
            return 1.0f;
        }
        List m11 = h.m(str, new String[]{ProductContainerDTO.RATIO_DELIMITER}, 0, 6);
        if (m11.size() != 2) {
            m11 = null;
        }
        if (m11 == null) {
            return 1.0f;
        }
        String str2 = (String) C7714v.M(m11);
        Float v02 = str2 != null ? h.v0(str2) : null;
        String str3 = (String) C7714v.Q(1, m11);
        Float v03 = str3 != null ? h.v0(str3) : null;
        if (v03 == null || v02 == null) {
            return 1.0f;
        }
        return v03.floatValue() / v02.floatValue();
    }

    public static /* synthetic */ float computeRatio$default(String str, String str2, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            str2 = "1:1";
        }
        return computeRatio(str, str2);
    }
}
