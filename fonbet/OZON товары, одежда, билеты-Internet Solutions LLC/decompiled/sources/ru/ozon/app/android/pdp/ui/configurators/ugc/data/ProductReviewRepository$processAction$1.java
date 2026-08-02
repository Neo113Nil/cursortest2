package ru.ozon.app.android.pdp.ui.configurators.ugc.data;

import Sc.r;
import Wc.a;
import androidx.recyclerview.widget.LinearLayoutManager;
import kotlin.Metadata;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.c;
import kotlin.coroutines.jvm.internal.e;
import org.jetbrains.annotations.NotNull;

@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
@e(c = "ru.ozon.app.android.pdp.ui.configurators.ugc.data.ProductReviewRepository", f = "ProductReviewRepository.kt", l = {57}, m = "processAction-0E7RQCE")
/* loaded from: classes13.dex */
final class ProductReviewRepository$processAction$1 extends c {
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ ProductReviewRepository this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ProductReviewRepository$processAction$1(ProductReviewRepository productReviewRepository, d<? super ProductReviewRepository$processAction$1> dVar) {
        super(dVar);
        this.this$0 = productReviewRepository;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(@NotNull Object obj) {
        this.result = obj;
        this.label |= LinearLayoutManager.INVALID_OFFSET;
        Object m874processAction0E7RQCE = this.this$0.m874processAction0E7RQCE(null, null, this);
        return m874processAction0E7RQCE == a.COROUTINE_SUSPENDED ? m874processAction0E7RQCE : r.a(m874processAction0E7RQCE);
    }
}
