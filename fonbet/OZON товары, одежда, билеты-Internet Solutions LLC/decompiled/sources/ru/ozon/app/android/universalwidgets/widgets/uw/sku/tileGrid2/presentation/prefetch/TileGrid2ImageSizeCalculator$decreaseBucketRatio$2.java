package ru.ozon.app.android.universalwidgets.widgets.uw.sku.tileGrid2.presentation.prefetch;

import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC7737t;
import ru.ozon.app.android.network.abtool.FeatureService;
import ru.ozon.app.android.universalwidgets.flags.TileGrid2ImageBucketRatio;

@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"<anonymous>", "", "invoke", "()Ljava/lang/Float;"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
final class TileGrid2ImageSizeCalculator$decreaseBucketRatio$2 extends AbstractC7737t implements Function0<Float> {
    final /* synthetic */ TileGrid2ImageSizeCalculator this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    TileGrid2ImageSizeCalculator$decreaseBucketRatio$2(TileGrid2ImageSizeCalculator tileGrid2ImageSizeCalculator) {
        super(0);
        this.this$0 = tileGrid2ImageSizeCalculator;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // kotlin.jvm.functions.Function0
    public final Float invoke() {
        FeatureService featureService;
        featureService = this.this$0.featureService;
        return Float.valueOf(featureService.getFloatKey(TileGrid2ImageBucketRatio.INSTANCE));
    }
}
