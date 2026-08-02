package ru.ozon.app.android.ugc.widgets.productsforreview.presentation;

import Sc.s;
import Wc.a;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.e;
import kotlin.coroutines.jvm.internal.j;
import kotlin.jvm.functions.Function2;

@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0001H\n"}, d2 = {"<anonymous>", "", "it"}, k = 3, mv = {2, 0, 0}, xi = 48)
@e(c = "ru.ozon.app.android.ugc.widgets.productsforreview.presentation.ProductForReviewViewHolder$onAttachViewModel$2", f = "ProductForReviewViewHolder.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes2.dex */
final class ProductForReviewViewHolder$onAttachViewModel$2 extends j implements Function2<Unit, d<? super Unit>, Object> {
    int label;
    final /* synthetic */ ProductForReviewViewHolder this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ProductForReviewViewHolder$onAttachViewModel$2(ProductForReviewViewHolder productForReviewViewHolder, d<? super ProductForReviewViewHolder$onAttachViewModel$2> dVar) {
        super(2, dVar);
        this.this$0 = productForReviewViewHolder;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final d<Unit> create(Object obj, d<?> dVar) {
        return new ProductForReviewViewHolder$onAttachViewModel$2(this.this$0, dVar);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        a aVar = a.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        s.b(obj);
        this.this$0.showErrorMessage();
        return Unit.f71690a;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Unit unit, d<? super Unit> dVar) {
        return ((ProductForReviewViewHolder$onAttachViewModel$2) create(unit, dVar)).invokeSuspend(Unit.f71690a);
    }
}
