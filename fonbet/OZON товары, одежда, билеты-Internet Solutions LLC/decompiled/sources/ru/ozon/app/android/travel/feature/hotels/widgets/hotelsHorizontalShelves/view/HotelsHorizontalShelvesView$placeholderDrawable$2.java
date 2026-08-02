package ru.ozon.app.android.travel.feature.hotels.widgets.hotelsHorizontalShelves.view;

import android.content.Context;
import android.graphics.drawable.GradientDrawable;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC7737t;
import ru.ozon.uni.android.uikit.common.StyleParser;
import ru.ozon.uni.android.uikit.extensions.ResourceExtKt;
import ru.ozon.uni.core.UniColors;

@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Landroid/graphics/drawable/GradientDrawable;", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
final class HotelsHorizontalShelvesView$placeholderDrawable$2 extends AbstractC7737t implements Function0<GradientDrawable> {
    final /* synthetic */ Context $context;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    HotelsHorizontalShelvesView$placeholderDrawable$2(Context context) {
        super(0);
        this.$context = context;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // kotlin.jvm.functions.Function0
    public final GradientDrawable invoke() {
        GradientDrawable gradientDrawable = new GradientDrawable();
        Context context = this.$context;
        gradientDrawable.setCornerRadius(ResourceExtKt.toPxF(24, context));
        Integer parseColor = StyleParser.INSTANCE.parseColor(context, UniColors.LAYER_FLOOR_1.getToken());
        gradientDrawable.setColor(parseColor != null ? parseColor.intValue() : 0);
        return gradientDrawable;
    }
}
