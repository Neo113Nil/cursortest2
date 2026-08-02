package ru.ozon.app.android.fresh.common.widgets.molecules.productMedia.presentation;

import android.content.Context;
import android.widget.FrameLayout;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC7737t;

@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lru/ozon/app/android/fresh/common/widgets/molecules/productMedia/presentation/CollageGroupView;", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
final class ProductMediaView$collageGroupView$2 extends AbstractC7737t implements Function0<CollageGroupView> {
    final /* synthetic */ Context $context;
    final /* synthetic */ ProductMediaView this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ProductMediaView$collageGroupView$2(Context context, ProductMediaView productMediaView) {
        super(0);
        this.$context = context;
        this.this$0 = productMediaView;
    }

    @Override // kotlin.jvm.functions.Function0
    public final CollageGroupView invoke() {
        CollageGroupView collageGroupView = new CollageGroupView(this.$context);
        this.this$0.addView(collageGroupView, new FrameLayout.LayoutParams(-1, -1));
        return collageGroupView;
    }
}
