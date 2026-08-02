package ru.ozon.app.android.fresh.main.widgets.product.scroll.presentation;

import A00.a;
import kotlin.Metadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.app.android.common.events.AtomButtonUpdate;
import ru.ozon.app.android.fresh.main.widgets.product.common.ProductWidgetVO;
import ru.ozon.app.android.fresh.main.widgets.product.common.events.OnAdultDialogSubmited;
import ru.ozon.app.android.fresh.main.widgets.product.common.events.OnAdultProductUpdateKt;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"LA00/a$J$a;", "update", "Lru/ozon/app/android/fresh/main/widgets/product/common/ProductWidgetVO;", "oldVO", "invoke", "(LA00/a$J$a;Lru/ozon/app/android/fresh/main/widgets/product/common/ProductWidgetVO;)Lru/ozon/app/android/fresh/main/widgets/product/common/ProductWidgetVO;", "<anonymous>"}, k = 3, mv = {2, 0, 0})
/* loaded from: classes6.dex */
final class ScrollViewMapper$updateConsumer$1 extends AbstractC7737t implements Function2<a.J.InterfaceC0007a, ProductWidgetVO, ProductWidgetVO> {
    final /* synthetic */ ScrollViewMapper this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ScrollViewMapper$updateConsumer$1(ScrollViewMapper scrollViewMapper) {
        super(2);
        this.this$0 = scrollViewMapper;
    }

    @Override // kotlin.jvm.functions.Function2
    public final ProductWidgetVO invoke(a.J.InterfaceC0007a update, ProductWidgetVO oldVO) {
        ProductWidgetVO updateProducts;
        Intrinsics.checkNotNullParameter(update, "update");
        Intrinsics.checkNotNullParameter(oldVO, "oldVO");
        if (update instanceof AtomButtonUpdate) {
            updateProducts = this.this$0.updateProducts((AtomButtonUpdate) update, oldVO);
            return updateProducts;
        }
        if (update instanceof OnAdultDialogSubmited) {
            return OnAdultProductUpdateKt.updateProductByAdultDialogSubmitedEvent(oldVO, (OnAdultDialogSubmited) update);
        }
        return null;
    }
}
