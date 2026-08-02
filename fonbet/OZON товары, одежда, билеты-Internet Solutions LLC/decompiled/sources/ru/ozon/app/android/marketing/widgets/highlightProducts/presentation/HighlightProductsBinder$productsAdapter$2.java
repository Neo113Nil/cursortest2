package ru.ozon.app.android.marketing.widgets.highlightProducts.presentation;

import android.content.Context;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.app.android.marketing.databinding.WidgetHighlightProductsBinding;
import ru.ozon.app.android.marketing.widgets.highlightProducts.presentation.adapter.HighlightProductsAdapter;
import ru.ozon.app.android.marketing.widgets.highlightProducts.presentation.adapter.ItemDecorator;

@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lru/ozon/app/android/marketing/widgets/highlightProducts/presentation/adapter/HighlightProductsAdapter;", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
final class HighlightProductsBinder$productsAdapter$2 extends AbstractC7737t implements Function0<HighlightProductsAdapter> {
    final /* synthetic */ HighlightProductsBinder this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    HighlightProductsBinder$productsAdapter$2(HighlightProductsBinder highlightProductsBinder) {
        super(0);
        this.this$0 = highlightProductsBinder;
    }

    @Override // kotlin.jvm.functions.Function0
    public final HighlightProductsAdapter invoke() {
        Context context;
        Function1 function1;
        WidgetHighlightProductsBinding widgetHighlightProductsBinding;
        boolean z11;
        Context context2;
        ItemDecorator decorator;
        context = this.this$0.context;
        Intrinsics.checkNotNullExpressionValue(context, "access$getContext$p(...)");
        function1 = this.this$0.actionHandler;
        HighlightProductsAdapter highlightProductsAdapter = new HighlightProductsAdapter(context, function1);
        HighlightProductsBinder highlightProductsBinder = this.this$0;
        widgetHighlightProductsBinding = highlightProductsBinder.binding;
        z11 = highlightProductsBinder.isMiniWidget;
        highlightProductsAdapter.setIsMiniWidget(z11);
        widgetHighlightProductsBinding.highlightProductsList.setAdapter(highlightProductsAdapter);
        context2 = highlightProductsBinder.context;
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(context2);
        linearLayoutManager.setOrientation(0);
        widgetHighlightProductsBinding.highlightProductsList.setLayoutManager(linearLayoutManager);
        RecyclerView recyclerView = widgetHighlightProductsBinding.highlightProductsList;
        decorator = highlightProductsBinder.getDecorator();
        recyclerView.addItemDecoration(decorator);
        widgetHighlightProductsBinding.highlightProductsList.setItemAnimator(null);
        return highlightProductsAdapter;
    }
}
