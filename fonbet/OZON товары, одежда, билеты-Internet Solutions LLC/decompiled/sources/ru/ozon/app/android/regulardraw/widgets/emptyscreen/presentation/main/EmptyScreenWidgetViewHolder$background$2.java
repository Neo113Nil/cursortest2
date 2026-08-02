package ru.ozon.app.android.regulardraw.widgets.emptyscreen.presentation.main;

import android.graphics.drawable.GradientDrawable;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC7737t;
import ru.ozon.app.android.regulardraw.R$color;
import ru.ozon.uni.android.uikit.extensions.ResourceExtKt;

@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Landroid/graphics/drawable/GradientDrawable;", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
final class EmptyScreenWidgetViewHolder$background$2 extends AbstractC7737t implements Function0<GradientDrawable> {
    final /* synthetic */ EmptyScreenWidgetViewHolder this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    EmptyScreenWidgetViewHolder$background$2(EmptyScreenWidgetViewHolder emptyScreenWidgetViewHolder) {
        super(0);
        this.this$0 = emptyScreenWidgetViewHolder;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // kotlin.jvm.functions.Function0
    public final GradientDrawable invoke() {
        GradientDrawable gradientDrawable = new GradientDrawable(GradientDrawable.Orientation.TOP_BOTTOM, new int[]{this.this$0.getContext().getColor(R$color.empty_screen_background_top), this.this$0.getContext().getColor(R$color.empty_screen_background_bottom)});
        gradientDrawable.setCornerRadius(ResourceExtKt.toPxF(24));
        return gradientDrawable;
    }
}
