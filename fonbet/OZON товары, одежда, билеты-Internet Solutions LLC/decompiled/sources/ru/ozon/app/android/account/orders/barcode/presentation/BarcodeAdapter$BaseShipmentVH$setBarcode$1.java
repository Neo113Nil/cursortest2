package ru.ozon.app.android.account.orders.barcode.presentation;

import Sc.s;
import Wc.a;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.ViewGroup;
import android.widget.ImageView;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.e;
import kotlin.coroutines.jvm.internal.j;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.app.android.account.orders.barcode.presentation.BarcodeAdapter;
import ru.ozon.app.android.barcodecache.drawable.BarcodeDrawableCache;
import ru.ozon.uni.android.uikit.extensions.ThemeExtKt;
import ru.ozon.uni.android.uikit.extensions.view.ViewExtKt;
import xe.M;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lxe/M;", "", "<anonymous>", "(Lxe/M;)V"}, k = 3, mv = {2, 0, 0})
@e(c = "ru.ozon.app.android.account.orders.barcode.presentation.BarcodeAdapter$BaseShipmentVH$setBarcode$1", f = "BarcodeAdapter.kt", l = {116}, m = "invokeSuspend")
/* loaded from: classes11.dex */
final class BarcodeAdapter$BaseShipmentVH$setBarcode$1 extends j implements Function2<M, d<? super Unit>, Object> {
    final /* synthetic */ String $code;
    final /* synthetic */ ImageView $view;
    int label;
    final /* synthetic */ BarcodeAdapter.BaseShipmentVH this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    BarcodeAdapter$BaseShipmentVH$setBarcode$1(ImageView imageView, BarcodeAdapter.BaseShipmentVH baseShipmentVH, String str, d<? super BarcodeAdapter$BaseShipmentVH$setBarcode$1> dVar) {
        super(2, dVar);
        this.$view = imageView;
        this.this$0 = baseShipmentVH;
        this.$code = str;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final d<Unit> create(Object obj, d<?> dVar) {
        return new BarcodeAdapter$BaseShipmentVH$setBarcode$1(this.$view, this.this$0, this.$code, dVar);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        BarcodeDrawableCache barcodeDrawableCache;
        BarcodeAdapter.BaseShipmentVH.Companion companion;
        BarcodeAdapter.BaseShipmentVH.Companion companion2;
        BarcodeAdapter.BaseShipmentVH.Companion companion3;
        BarcodeAdapter.BaseShipmentVH.Companion companion4;
        a aVar = a.COROUTINE_SUSPENDED;
        int i11 = this.label;
        if (i11 == 0) {
            s.b(obj);
            ImageView imageView = this.$view;
            Context context = imageView.getContext();
            Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
            if (ThemeExtKt.isDarkThemeActive(context)) {
                companion = BarcodeAdapter.BaseShipmentVH.Companion;
                int dark_theme_vertical_padding = companion.getDARK_THEME_VERTICAL_PADDING();
                companion2 = BarcodeAdapter.BaseShipmentVH.Companion;
                ViewExtKt.updatePadding$default(imageView, 0, dark_theme_vertical_padding, 0, companion2.getDARK_THEME_VERTICAL_PADDING(), 5, null);
                ViewGroup.LayoutParams layoutParams = imageView.getLayoutParams();
                if (layoutParams == null) {
                    throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
                }
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
                companion3 = BarcodeAdapter.BaseShipmentVH.Companion;
                int dark_theme_horizontal_margin = companion3.getDARK_THEME_HORIZONTAL_MARGIN();
                companion4 = BarcodeAdapter.BaseShipmentVH.Companion;
                marginLayoutParams.setMargins(dark_theme_horizontal_margin, marginLayoutParams.topMargin, companion4.getDARK_THEME_HORIZONTAL_MARGIN(), marginLayoutParams.bottomMargin);
                imageView.setLayoutParams(marginLayoutParams);
            } else {
                ViewExtKt.updatePadding$default(imageView, 0, 0, 0, 0, 5, null);
                ViewGroup.LayoutParams layoutParams2 = imageView.getLayoutParams();
                if (layoutParams2 == null) {
                    throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
                }
                ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) layoutParams2;
                marginLayoutParams2.setMargins(0, marginLayoutParams2.topMargin, 0, marginLayoutParams2.bottomMargin);
                imageView.setLayoutParams(marginLayoutParams2);
            }
            barcodeDrawableCache = this.this$0.barcodeDrawableCache;
            String str = this.$code;
            Context context2 = this.$view.getContext();
            Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
            this.label = 1;
            obj = barcodeDrawableCache.getBarcodeDrawable(str, context2, this);
            if (obj == aVar) {
                return aVar;
            }
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            s.b(obj);
        }
        this.$view.setImageDrawable((Drawable) obj);
        return Unit.f71690a;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(M m11, d<? super Unit> dVar) {
        return ((BarcodeAdapter$BaseShipmentVH$setBarcode$1) create(m11, dVar)).invokeSuspend(Unit.f71690a);
    }
}
