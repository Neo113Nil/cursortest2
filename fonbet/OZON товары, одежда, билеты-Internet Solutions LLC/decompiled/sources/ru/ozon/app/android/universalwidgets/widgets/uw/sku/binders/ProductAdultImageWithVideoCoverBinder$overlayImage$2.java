package ru.ozon.app.android.universalwidgets.widgets.uw.sku.binders;

import android.view.View;
import android.widget.ImageView;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC7737t;
import ru.ozon.app.android.universalwidgets.R$id;

@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u0004\u0018\u00010\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Landroid/widget/ImageView;", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
final class ProductAdultImageWithVideoCoverBinder$overlayImage$2 extends AbstractC7737t implements Function0<ImageView> {
    final /* synthetic */ ProductAdultImageWithVideoCoverBinder this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ProductAdultImageWithVideoCoverBinder$overlayImage$2(ProductAdultImageWithVideoCoverBinder productAdultImageWithVideoCoverBinder) {
        super(0);
        this.this$0 = productAdultImageWithVideoCoverBinder;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // kotlin.jvm.functions.Function0
    public final ImageView invoke() {
        View findViewById;
        findViewById = this.this$0.findViewById(R$id.overlayImage);
        return (ImageView) findViewById;
    }
}
