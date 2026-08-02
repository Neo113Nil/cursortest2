package ru.ozon.app.android.universalwidgets.widgets.uw.sku.skugrid2.presentation;

import A00.a;
import kotlin.Metadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.app.android.common.events.AtomButtonUpdate;
import ru.ozon.app.android.product.common.product.ProductVO;
import ru.ozon.app.android.product.common.product.ProductVOKt;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"LA00/a$J$a;", "update", "Lru/ozon/app/android/product/common/product/ProductVO;", "oldVO", "invoke", "(LA00/a$J$a;Lru/ozon/app/android/product/common/product/ProductVO;)Lru/ozon/app/android/product/common/product/ProductVO;", "<anonymous>"}, k = 3, mv = {2, 0, 0})
/* loaded from: classes7.dex */
final class SkuGrid2ViewMapper$updateConsumer$1 extends AbstractC7737t implements Function2<a.J.InterfaceC0007a, ProductVO, ProductVO> {
    public static final SkuGrid2ViewMapper$updateConsumer$1 INSTANCE = new SkuGrid2ViewMapper$updateConsumer$1();

    SkuGrid2ViewMapper$updateConsumer$1() {
        super(2);
    }

    @Override // kotlin.jvm.functions.Function2
    public final ProductVO invoke(a.J.InterfaceC0007a update, ProductVO oldVO) {
        Intrinsics.checkNotNullParameter(update, "update");
        Intrinsics.checkNotNullParameter(oldVO, "oldVO");
        return update instanceof AtomButtonUpdate ? ProductVOKt.updateButtonIfNeeded(oldVO, (AtomButtonUpdate) update) : oldVO;
    }
}
