package ru.ozon.app.android.product.addToCart.presentation;

import android.content.Context;
import android.graphics.drawable.Drawable;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00070\u0001¢\u0006\u0002\b\u0002H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "Landroid/graphics/drawable/Drawable;", "Lkotlin/jvm/internal/EnhancedNullability;", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
final class AddToCartButtonView$plusDrawable$2 extends AbstractC7737t implements Function0<Drawable> {
    final /* synthetic */ Context $context;
    final /* synthetic */ AddToCartButtonView this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    AddToCartButtonView$plusDrawable$2(Context context, AddToCartButtonView addToCartButtonView) {
        super(0);
        this.$context = context;
        this.this$0 = addToCartButtonView;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // kotlin.jvm.functions.Function0
    public final Drawable invoke() {
        int i11;
        Context context = this.$context;
        i11 = this.this$0.plusDrawableRes;
        Drawable drawable = androidx.core.content.a.getDrawable(context, i11);
        Intrinsics.f(drawable);
        return drawable.mutate();
    }
}
