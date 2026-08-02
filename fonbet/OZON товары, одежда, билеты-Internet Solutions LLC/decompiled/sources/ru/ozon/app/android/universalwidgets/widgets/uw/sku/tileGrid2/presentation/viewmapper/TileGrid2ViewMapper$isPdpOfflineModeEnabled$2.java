package ru.ozon.app.android.universalwidgets.widgets.uw.sku.tileGrid2.presentation.viewmapper;

import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC7737t;
import ru.ozon.app.android.pdp.flags.PdpOfflineModeFlag;

@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"<anonymous>", "", "invoke", "()Ljava/lang/Boolean;"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
final class TileGrid2ViewMapper$isPdpOfflineModeEnabled$2 extends AbstractC7737t implements Function0<Boolean> {
    final /* synthetic */ TileGrid2ViewMapper this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    TileGrid2ViewMapper$isPdpOfflineModeEnabled$2(TileGrid2ViewMapper tileGrid2ViewMapper) {
        super(0);
        this.this$0 = tileGrid2ViewMapper;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // kotlin.jvm.functions.Function0
    public final Boolean invoke() {
        return Boolean.valueOf(this.this$0.component().getFeatureChecker().isEnabled(PdpOfflineModeFlag.INSTANCE));
    }
}
