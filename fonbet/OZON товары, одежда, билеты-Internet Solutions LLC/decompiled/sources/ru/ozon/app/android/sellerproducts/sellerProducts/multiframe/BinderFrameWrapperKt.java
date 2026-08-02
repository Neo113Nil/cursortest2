package ru.ozon.app.android.sellerproducts.sellerProducts.multiframe;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.sellerproducts.sellerProducts.binders.ProductPropertyBinder;

@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\u001a\u0016\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\b\b\u0002\u0010\u0003\u001a\u00020\u0004H\u0000¨\u0006\u0005"}, d2 = {"asFrameWrapper", "Lru/ozon/app/android/sellerproducts/sellerProducts/multiframe/BinderFrameWrapper;", "Lru/ozon/app/android/sellerproducts/sellerProducts/binders/ProductPropertyBinder;", "frameOrder", "", "sellerproducts_prodGoogleAllVendorsRelease"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class BinderFrameWrapperKt {
    @NotNull
    public static final BinderFrameWrapper asFrameWrapper(@NotNull ProductPropertyBinder productPropertyBinder, int i11) {
        Intrinsics.checkNotNullParameter(productPropertyBinder, "<this>");
        return new BinderFrameWrapper(i11, productPropertyBinder);
    }

    public static /* synthetic */ BinderFrameWrapper asFrameWrapper$default(ProductPropertyBinder productPropertyBinder, int i11, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            i11 = 0;
        }
        return asFrameWrapper(productPropertyBinder, i11);
    }
}
