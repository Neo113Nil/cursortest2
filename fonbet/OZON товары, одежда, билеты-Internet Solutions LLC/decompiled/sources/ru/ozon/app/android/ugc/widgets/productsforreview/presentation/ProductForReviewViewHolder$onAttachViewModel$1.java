package ru.ozon.app.android.ugc.widgets.productsforreview.presentation;

import Sc.s;
import Wc.a;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.e;
import kotlin.coroutines.jvm.internal.j;
import kotlin.jvm.functions.Function2;
import ru.ozon.app.android.composer.ComposerReferences;

@Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\t\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\n"}, d2 = {"<anonymous>", "", "productId", ""}, k = 3, mv = {2, 0, 0}, xi = 48)
@e(c = "ru.ozon.app.android.ugc.widgets.productsforreview.presentation.ProductForReviewViewHolder$onAttachViewModel$1", f = "ProductForReviewViewHolder.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes2.dex */
final class ProductForReviewViewHolder$onAttachViewModel$1 extends j implements Function2<Long, d<? super Unit>, Object> {
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ ProductForReviewViewHolder this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ProductForReviewViewHolder$onAttachViewModel$1(ProductForReviewViewHolder productForReviewViewHolder, d<? super ProductForReviewViewHolder$onAttachViewModel$1> dVar) {
        super(2, dVar);
        this.this$0 = productForReviewViewHolder;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final d<Unit> create(Object obj, d<?> dVar) {
        ProductForReviewViewHolder$onAttachViewModel$1 productForReviewViewHolder$onAttachViewModel$1 = new ProductForReviewViewHolder$onAttachViewModel$1(this.this$0, dVar);
        productForReviewViewHolder$onAttachViewModel$1.L$0 = obj;
        return productForReviewViewHolder$onAttachViewModel$1;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Long l11, d<? super Unit> dVar) {
        return ((ProductForReviewViewHolder$onAttachViewModel$1) create(l11, dVar)).invokeSuspend(Unit.f71690a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        ComposerReferences composerReferences;
        a aVar = a.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        s.b(obj);
        Long l11 = (Long) this.L$0;
        ProductForReviewVO boundData = this.this$0.getBoundData();
        if (boundData == null) {
            return Unit.f71690a;
        }
        long id2 = boundData.getId();
        if (l11 != null && id2 == l11.longValue()) {
            composerReferences = this.this$0.composerReferences;
            composerReferences.getController().m(l11.longValue());
        }
        return Unit.f71690a;
    }
}
