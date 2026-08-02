package ru.ozon.app.android.ugc.core.widgets.productsforreviewV2.presentation;

import S0.M;
import S0.N;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LS0/N;", "LS0/M;", "invoke", "(LS0/N;)LS0/M;", "<anonymous>"}, k = 3, mv = {2, 0, 0})
/* loaded from: classes2.dex */
final class ProductsForReviewV2ComposableKt$ObserveScreenScroll$1$1 extends AbstractC7737t implements Function1<N, M> {
    final /* synthetic */ boolean $isExpanded;
    final /* synthetic */ RecyclerView $recyclerView;
    final /* synthetic */ ProductsForReviewV2ComposableKt$ObserveScreenScroll$scrollListener$1$1 $scrollListener;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ProductsForReviewV2ComposableKt$ObserveScreenScroll$1$1(boolean z11, RecyclerView recyclerView, ProductsForReviewV2ComposableKt$ObserveScreenScroll$scrollListener$1$1 productsForReviewV2ComposableKt$ObserveScreenScroll$scrollListener$1$1) {
        super(1);
        this.$isExpanded = z11;
        this.$recyclerView = recyclerView;
        this.$scrollListener = productsForReviewV2ComposableKt$ObserveScreenScroll$scrollListener$1$1;
    }

    @Override // kotlin.jvm.functions.Function1
    public final M invoke(N DisposableEffect) {
        Intrinsics.checkNotNullParameter(DisposableEffect, "$this$DisposableEffect");
        if (this.$isExpanded) {
            RecyclerView recyclerView = this.$recyclerView;
            if (recyclerView != null) {
                recyclerView.addOnScrollListener(this.$scrollListener);
            }
        } else {
            RecyclerView recyclerView2 = this.$recyclerView;
            if (recyclerView2 != null) {
                recyclerView2.removeOnScrollListener(this.$scrollListener);
            }
        }
        final RecyclerView recyclerView3 = this.$recyclerView;
        final ProductsForReviewV2ComposableKt$ObserveScreenScroll$scrollListener$1$1 productsForReviewV2ComposableKt$ObserveScreenScroll$scrollListener$1$1 = this.$scrollListener;
        return new M() { // from class: ru.ozon.app.android.ugc.core.widgets.productsforreviewV2.presentation.ProductsForReviewV2ComposableKt$ObserveScreenScroll$1$1$invoke$$inlined$onDispose$1
            @Override // S0.M
            public void dispose() {
                RecyclerView recyclerView4 = RecyclerView.this;
                if (recyclerView4 != null) {
                    recyclerView4.removeOnScrollListener(productsForReviewV2ComposableKt$ObserveScreenScroll$scrollListener$1$1);
                }
            }
        };
    }
}
