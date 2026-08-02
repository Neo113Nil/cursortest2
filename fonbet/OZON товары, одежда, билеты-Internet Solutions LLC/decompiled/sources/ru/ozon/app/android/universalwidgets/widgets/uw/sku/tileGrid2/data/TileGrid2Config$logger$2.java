package ru.ozon.app.android.universalwidgets.widgets.uw.sku.tileGrid2.data;

import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC7737t;
import ru.ozon.app.android.network.abtool.FeatureChecker;
import ru.ozon.app.android.universalwidgets.widgets.uw.sku.tileGrid2.data.logger.TileGrid2Logger;

@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lru/ozon/app/android/universalwidgets/widgets/uw/sku/tileGrid2/data/logger/TileGrid2Logger;", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
final class TileGrid2Config$logger$2 extends AbstractC7737t implements Function0<TileGrid2Logger> {
    final /* synthetic */ TileGrid2Config this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    TileGrid2Config$logger$2(TileGrid2Config tileGrid2Config) {
        super(0);
        this.this$0 = tileGrid2Config;
    }

    @Override // kotlin.jvm.functions.Function0
    public final TileGrid2Logger invoke() {
        FeatureChecker featureChecker;
        featureChecker = this.this$0.getFeatureChecker();
        return new TileGrid2Logger(featureChecker);
    }
}
