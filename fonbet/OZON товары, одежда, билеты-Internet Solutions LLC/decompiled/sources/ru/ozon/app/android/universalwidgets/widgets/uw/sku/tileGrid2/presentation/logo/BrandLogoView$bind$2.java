package ru.ozon.app.android.universalwidgets.widgets.uw.sku.tileGrid2.presentation.logo;

import android.graphics.Bitmap;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.uni.android.uikit.extensions.view.ViewExtKt;

@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "result", "Landroid/graphics/Bitmap;", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
final class BrandLogoView$bind$2 extends AbstractC7737t implements Function1<Bitmap, Unit> {
    final /* synthetic */ String $logo;
    final /* synthetic */ BrandLogoView this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    BrandLogoView$bind$2(BrandLogoView brandLogoView, String str) {
        super(1);
        this.this$0 = brandLogoView;
        this.$logo = str;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(Bitmap bitmap) {
        invoke2(bitmap);
        return Unit.f71690a;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(Bitmap result) {
        BrandLogoTransformedBitmapCache brandLogoTransformedBitmapCache;
        Intrinsics.checkNotNullParameter(result, "result");
        brandLogoTransformedBitmapCache = this.this$0.bitmapCache;
        Bitmap orPut = brandLogoTransformedBitmapCache.getOrPut(this.$logo, new BrandLogoView$bind$2$transformed$1(this.this$0, result));
        this.this$0.transformedLogoBitmap = orPut;
        this.this$0.updateSizeIfNeeded(orPut);
        ViewExtKt.show(this.this$0);
    }
}
