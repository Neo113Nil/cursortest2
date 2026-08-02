package ru.ozon.app.android.fresh.cart.ui.molecules.cartPicker.presentation;

import android.content.Context;
import android.graphics.drawable.GradientDrawable;
import androidx.core.content.a;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC7737t;
import ru.ozon.app.android.fresh.cart.ui.molecules.cartPicker.data.CartPickerDTO;
import ru.ozon.app.android.fresh.cart.ui.molecules.cartPicker.presentation.CartPickerView;
import ru.ozon.uni.android.uikitsdk.ext.UiExtKt;

@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Landroid/graphics/drawable/GradientDrawable;", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
final class CartPickerView$plusBackgroundDrawable$2 extends AbstractC7737t implements Function0<GradientDrawable> {
    final /* synthetic */ Context $context;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    CartPickerView$plusBackgroundDrawable$2(Context context) {
        super(0);
        this.$context = context;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // kotlin.jvm.functions.Function0
    public final GradientDrawable invoke() {
        CartPickerView.Companion companion;
        GradientDrawable gradientDrawable = new GradientDrawable();
        Context context = this.$context;
        companion = CartPickerView.Companion;
        int color = a.getColor(context, companion.getDefaultBackgroundColor());
        gradientDrawable.setColors(new int[]{color, color});
        gradientDrawable.setCornerRadius(UiExtKt.toPxF(CartPickerDTO.Sizes.SIZE_400.getParams().getCornerRadius()));
        return gradientDrawable;
    }
}
