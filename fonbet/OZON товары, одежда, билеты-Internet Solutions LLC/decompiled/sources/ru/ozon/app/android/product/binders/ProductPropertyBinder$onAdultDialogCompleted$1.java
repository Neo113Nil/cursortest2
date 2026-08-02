package ru.ozon.app.android.product.binders;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC7737t;
import ru.ozon.app.android.storefront.domain.events.OnAdultDialogSubmited;

@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
final class ProductPropertyBinder$onAdultDialogCompleted$1 extends AbstractC7737t implements Function0<Unit> {
    final /* synthetic */ ProductPropertyBinder<Product> this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ProductPropertyBinder$onAdultDialogCompleted$1(ProductPropertyBinder<Product> productPropertyBinder) {
        super(0);
        this.this$0 = productPropertyBinder;
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.f71690a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2() {
        this.this$0.getComposerReferences().getController().update(new OnAdultDialogSubmited(null, 1, 0 == true ? 1 : 0));
    }
}
