package ru.ozon.app.android.sellerproducts.sellerProducts.binders.overlay;

import android.view.View;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC7737t;
import ru.ozon.app.android.product.common.wave.WaveView;

@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u0001H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"<anonymous>", "Lru/ozon/app/android/product/common/wave/WaveView;", "kotlin.jvm.PlatformType", "invoke", "()Lru/ozon/app/android/product/common/wave/WaveView;"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
final class ProductOverlayBinder$waveView$2 extends AbstractC7737t implements Function0<WaveView> {
    final /* synthetic */ int $waveId;
    final /* synthetic */ ProductOverlayBinder this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ProductOverlayBinder$waveView$2(ProductOverlayBinder productOverlayBinder, int i11) {
        super(0);
        this.this$0 = productOverlayBinder;
        this.$waveId = i11;
    }

    @Override // kotlin.jvm.functions.Function0
    public final WaveView invoke() {
        View rootView;
        rootView = this.this$0.getRootView();
        return (WaveView) rootView.findViewById(this.$waveId);
    }
}
