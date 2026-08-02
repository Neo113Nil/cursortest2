package ru.ozon.app.android.account.orders.commonBarcode.presentation.fullwidth;

import Sc.s;
import Wc.a;
import android.content.Context;
import android.graphics.drawable.Drawable;
import androidx.appcompat.widget.AppCompatImageView;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.e;
import kotlin.coroutines.jvm.internal.j;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.app.android.account.orders.commonBarcode.presentation.fullwidth.CommonBarcodeFullWidthViewHolder;
import ru.ozon.app.android.cs_orders.databinding.WidgetCommonBarcodeFullWidthBinding;
import ru.ozon.uni.android.uikit.extensions.ThemeExtKt;
import xe.M;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lxe/M;", "", "<anonymous>", "(Lxe/M;)V"}, k = 3, mv = {2, 0, 0})
@e(c = "ru.ozon.app.android.account.orders.commonBarcode.presentation.fullwidth.CommonBarcodeFullWidthViewHolder$setBarcode$1", f = "CommonBarcodeFullWidthViewHolder.kt", l = {55}, m = "invokeSuspend")
/* loaded from: classes11.dex */
final class CommonBarcodeFullWidthViewHolder$setBarcode$1 extends j implements Function2<M, d<? super Unit>, Object> {
    final /* synthetic */ String $code;
    int label;
    final /* synthetic */ CommonBarcodeFullWidthViewHolder this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    CommonBarcodeFullWidthViewHolder$setBarcode$1(CommonBarcodeFullWidthViewHolder commonBarcodeFullWidthViewHolder, String str, d<? super CommonBarcodeFullWidthViewHolder$setBarcode$1> dVar) {
        super(2, dVar);
        this.this$0 = commonBarcodeFullWidthViewHolder;
        this.$code = str;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final d<Unit> create(Object obj, d<?> dVar) {
        return new CommonBarcodeFullWidthViewHolder$setBarcode$1(this.this$0, this.$code, dVar);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        CommonBarcodeFullWidthViewModel commonBarcodeFullWidthViewModel;
        WidgetCommonBarcodeFullWidthBinding widgetCommonBarcodeFullWidthBinding;
        a aVar = a.COROUTINE_SUSPENDED;
        int i11 = this.label;
        if (i11 == 0) {
            s.b(obj);
            commonBarcodeFullWidthViewModel = this.this$0.viewModel;
            String str = this.$code;
            Context context = this.this$0.getContext();
            this.label = 1;
            obj = commonBarcodeFullWidthViewModel.createBarcodeDrawable(str, context, this);
            if (obj == aVar) {
                return aVar;
            }
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            s.b(obj);
        }
        Drawable drawable = (Drawable) obj;
        widgetCommonBarcodeFullWidthBinding = this.this$0.binding;
        AppCompatImageView appCompatImageView = widgetCommonBarcodeFullWidthBinding.barcodeIv;
        Context context2 = appCompatImageView.getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
        int horizontal_dark_margins = ThemeExtKt.isDarkThemeActive(context2) ? CommonBarcodeFullWidthViewHolder.INSTANCE.getHORIZONTAL_DARK_MARGINS() : CommonBarcodeFullWidthViewHolder.INSTANCE.getHORIZONTAL_LIGHT_MARGINS();
        CommonBarcodeFullWidthViewHolder.Companion companion = CommonBarcodeFullWidthViewHolder.INSTANCE;
        int vertical_margins = companion.getVERTICAL_MARGINS();
        Context context3 = appCompatImageView.getContext();
        Intrinsics.checkNotNullExpressionValue(context3, "getContext(...)");
        appCompatImageView.setPadding(horizontal_dark_margins, vertical_margins, ThemeExtKt.isDarkThemeActive(context3) ? companion.getHORIZONTAL_DARK_MARGINS() : companion.getHORIZONTAL_LIGHT_MARGINS(), companion.getVERTICAL_MARGINS());
        appCompatImageView.setImageDrawable(drawable);
        return Unit.f71690a;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(M m11, d<? super Unit> dVar) {
        return ((CommonBarcodeFullWidthViewHolder$setBarcode$1) create(m11, dVar)).invokeSuspend(Unit.f71690a);
    }
}
