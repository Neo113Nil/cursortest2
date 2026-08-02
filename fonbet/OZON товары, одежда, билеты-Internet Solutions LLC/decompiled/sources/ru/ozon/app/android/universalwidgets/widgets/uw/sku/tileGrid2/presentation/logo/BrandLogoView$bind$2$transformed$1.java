package ru.ozon.app.android.universalwidgets.widgets.uw.sku.tileGrid2.presentation.logo;

import android.graphics.Bitmap;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC7737t;

@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Landroid/graphics/Bitmap;", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
final class BrandLogoView$bind$2$transformed$1 extends AbstractC7737t implements Function0<Bitmap> {
    final /* synthetic */ Bitmap $result;
    final /* synthetic */ BrandLogoView this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    BrandLogoView$bind$2$transformed$1(BrandLogoView brandLogoView, Bitmap bitmap) {
        super(0);
        this.this$0 = brandLogoView;
        this.$result = bitmap;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // kotlin.jvm.functions.Function0
    public final Bitmap invoke() {
        BrandLogoTransformation brandLogoTransformation;
        brandLogoTransformation = this.this$0.transformLogo;
        return brandLogoTransformation.invoke(this.$result);
    }
}
