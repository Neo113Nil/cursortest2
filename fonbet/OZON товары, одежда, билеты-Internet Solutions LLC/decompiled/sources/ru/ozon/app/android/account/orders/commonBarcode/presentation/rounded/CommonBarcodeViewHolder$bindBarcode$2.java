package ru.ozon.app.android.account.orders.commonBarcode.presentation.rounded;

import Sc.s;
import Wc.a;
import android.content.Context;
import android.graphics.drawable.Drawable;
import com.google.android.material.imageview.ShapeableImageView;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.e;
import kotlin.coroutines.jvm.internal.j;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.app.android.cs_orders.databinding.WidgetCommonBarcodeBinding;
import ru.ozon.uni.android.uikit.extensions.ThemeExtKt;
import xe.M;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00070\u0001¢\u0006\u0002\b\u0002*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lxe/M;", "Lcom/google/android/material/imageview/ShapeableImageView;", "Lkotlin/jvm/internal/EnhancedNullability;", "<anonymous>", "(Lxe/M;)Lcom/google/android/material/imageview/ShapeableImageView;"}, k = 3, mv = {2, 0, 0})
@e(c = "ru.ozon.app.android.account.orders.commonBarcode.presentation.rounded.CommonBarcodeViewHolder$bindBarcode$2", f = "CommonBarcodeViewHolder.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes11.dex */
final class CommonBarcodeViewHolder$bindBarcode$2 extends j implements Function2<M, d<? super ShapeableImageView>, Object> {
    final /* synthetic */ Drawable $barcode;
    int label;
    final /* synthetic */ CommonBarcodeViewHolder this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    CommonBarcodeViewHolder$bindBarcode$2(CommonBarcodeViewHolder commonBarcodeViewHolder, Drawable drawable, d<? super CommonBarcodeViewHolder$bindBarcode$2> dVar) {
        super(2, dVar);
        this.this$0 = commonBarcodeViewHolder;
        this.$barcode = drawable;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final d<Unit> create(Object obj, d<?> dVar) {
        return new CommonBarcodeViewHolder$bindBarcode$2(this.this$0, this.$barcode, dVar);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        WidgetCommonBarcodeBinding widgetCommonBarcodeBinding;
        a aVar = a.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        s.b(obj);
        widgetCommonBarcodeBinding = this.this$0.binding;
        ShapeableImageView shapeableImageView = widgetCommonBarcodeBinding.barcodeIv;
        Drawable drawable = this.$barcode;
        Context context = shapeableImageView.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        int horizontal_dark_margins = ThemeExtKt.isDarkThemeActive(context) ? CommonBarcodeViewHolder.INSTANCE.getHORIZONTAL_DARK_MARGINS() : CommonBarcodeViewHolder.INSTANCE.getHORIZONTAL_LIGHT_MARGINS();
        Context context2 = shapeableImageView.getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
        shapeableImageView.setPadding(horizontal_dark_margins, 0, ThemeExtKt.isDarkThemeActive(context2) ? CommonBarcodeViewHolder.INSTANCE.getHORIZONTAL_DARK_MARGINS() : CommonBarcodeViewHolder.INSTANCE.getHORIZONTAL_LIGHT_MARGINS(), 0);
        shapeableImageView.setImageDrawable(drawable);
        return shapeableImageView;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(M m11, d<? super ShapeableImageView> dVar) {
        return ((CommonBarcodeViewHolder$bindBarcode$2) create(m11, dVar)).invokeSuspend(Unit.f71690a);
    }
}
