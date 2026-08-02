package ru.ozon.app.android.marketing.widgets.highlightProducts.presentation;

import android.content.Context;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.app.android.marketing.widgets.highlightProducts.presentation.adapter.ItemDecorator;

@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lru/ozon/app/android/marketing/widgets/highlightProducts/presentation/adapter/ItemDecorator;", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
final class HighlightProductsBinder$decorator$2 extends AbstractC7737t implements Function0<ItemDecorator> {
    final /* synthetic */ HighlightProductsBinder this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    HighlightProductsBinder$decorator$2(HighlightProductsBinder highlightProductsBinder) {
        super(0);
        this.this$0 = highlightProductsBinder;
    }

    @Override // kotlin.jvm.functions.Function0
    public final ItemDecorator invoke() {
        Context context;
        context = this.this$0.context;
        Intrinsics.checkNotNullExpressionValue(context, "access$getContext$p(...)");
        return new ItemDecorator(context);
    }
}
