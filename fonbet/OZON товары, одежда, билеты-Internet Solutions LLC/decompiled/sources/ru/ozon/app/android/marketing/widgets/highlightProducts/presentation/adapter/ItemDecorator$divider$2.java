package ru.ozon.app.android.marketing.widgets.highlightProducts.presentation.adapter;

import android.graphics.drawable.GradientDrawable;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC7737t;
import ru.ozon.app.android.marketing.widgets.highlightProducts.presentation.adapter.ItemDecorator;

@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Landroid/graphics/drawable/GradientDrawable;", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
final class ItemDecorator$divider$2 extends AbstractC7737t implements Function0<GradientDrawable> {
    final /* synthetic */ ItemDecorator this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ItemDecorator$divider$2(ItemDecorator itemDecorator) {
        super(0);
        this.this$0 = itemDecorator;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // kotlin.jvm.functions.Function0
    public final GradientDrawable invoke() {
        ItemDecorator.Companion companion;
        ItemDecorator.Companion companion2;
        int dividerColor;
        GradientDrawable gradientDrawable = new GradientDrawable();
        ItemDecorator itemDecorator = this.this$0;
        gradientDrawable.setShape(0);
        companion = ItemDecorator.Companion;
        int dividerSize = companion.getDividerSize();
        companion2 = ItemDecorator.Companion;
        gradientDrawable.setSize(dividerSize, companion2.getDividerSize());
        dividerColor = itemDecorator.getDividerColor();
        gradientDrawable.setColor(dividerColor);
        return gradientDrawable;
    }
}
