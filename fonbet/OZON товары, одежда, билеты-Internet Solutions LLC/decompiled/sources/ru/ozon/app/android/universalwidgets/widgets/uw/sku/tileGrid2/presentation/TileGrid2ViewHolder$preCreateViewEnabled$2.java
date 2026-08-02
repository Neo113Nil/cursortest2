package ru.ozon.app.android.universalwidgets.widgets.uw.sku.tileGrid2.presentation;

import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC7737t;
import ru.ozon.app.android.network.abtool.FeatureChecker;
import ru.ozon.app.android.universalwidgets.flags.PrecreateViewsTileGrid2Flag;

@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"<anonymous>", "", "invoke", "()Ljava/lang/Boolean;"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
final class TileGrid2ViewHolder$preCreateViewEnabled$2 extends AbstractC7737t implements Function0<Boolean> {
    final /* synthetic */ TileGrid2ViewHolder this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    TileGrid2ViewHolder$preCreateViewEnabled$2(TileGrid2ViewHolder tileGrid2ViewHolder) {
        super(0);
        this.this$0 = tileGrid2ViewHolder;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // kotlin.jvm.functions.Function0
    public final Boolean invoke() {
        FeatureChecker featureChecker;
        featureChecker = this.this$0.featureChecker;
        return Boolean.valueOf(featureChecker.isEnabled(PrecreateViewsTileGrid2Flag.INSTANCE));
    }
}
