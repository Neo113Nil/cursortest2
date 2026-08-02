package ru.ozon.app.android.universalwidgets.widgets.uw.sku.scroll.binders;

import android.view.View;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC7737t;
import ru.ozon.app.android.product.common.wave.WaveView;
import ru.ozon.app.android.universalwidgets.R$id;

@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lru/ozon/app/android/product/common/wave/WaveView;", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
final class SkuScrollOverlayBinder$waveView$2 extends AbstractC7737t implements Function0<WaveView> {
    final /* synthetic */ SkuScrollOverlayBinder this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    SkuScrollOverlayBinder$waveView$2(SkuScrollOverlayBinder skuScrollOverlayBinder) {
        super(0);
        this.this$0 = skuScrollOverlayBinder;
    }

    @Override // kotlin.jvm.functions.Function0
    public final WaveView invoke() {
        View findViewById;
        findViewById = this.this$0.findViewById(R$id.waveView);
        return (WaveView) findViewById;
    }
}
