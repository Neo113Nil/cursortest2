package ru.ozon.app.android.product.addToCart.presentation;

import androidx.recyclerview.widget.LinearLayoutManager;
import kotlin.Metadata;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.c;
import kotlin.coroutines.jvm.internal.e;
import org.jetbrains.annotations.NotNull;

@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
@e(c = "ru.ozon.app.android.product.addToCart.presentation.RecommendationViewController", f = "RecommendationViewController.kt", l = {101, 53}, m = "addRecShelfToProductCard")
/* loaded from: classes13.dex */
final class RecommendationViewController$addRecShelfToProductCard$1 extends c {
    Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ RecommendationViewController this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    RecommendationViewController$addRecShelfToProductCard$1(RecommendationViewController recommendationViewController, d<? super RecommendationViewController$addRecShelfToProductCard$1> dVar) {
        super(dVar);
        this.this$0 = recommendationViewController;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(@NotNull Object obj) {
        this.result = obj;
        this.label |= LinearLayoutManager.INVALID_OFFSET;
        return this.this$0.addRecShelfToProductCard(null, null, null, this);
    }
}
