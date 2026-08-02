package ru.ozon.app.android.fresh.main.widgets.wiseSkuScroll.presentation;

import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC7737t;
import ru.ozon.app.android.fresh.common.widgets.molecules.freshTile.presentation.FreshTileViewV2;
import ru.ozon.app.android.fresh.main.widgets.wiseSkuScroll.WiseSkuScrollConstants;

@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lru/ozon/app/android/fresh/common/widgets/molecules/freshTile/presentation/FreshTileViewV2;", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
final class WiseSkuScrollViewHolder$mockView$2 extends AbstractC7737t implements Function0<FreshTileViewV2> {
    final /* synthetic */ WiseSkuScrollViewHolder this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    WiseSkuScrollViewHolder$mockView$2(WiseSkuScrollViewHolder wiseSkuScrollViewHolder) {
        super(0);
        this.this$0 = wiseSkuScrollViewHolder;
    }

    @Override // kotlin.jvm.functions.Function0
    public final FreshTileViewV2 invoke() {
        return FreshTileViewV2.Companion.createVertical$default(FreshTileViewV2.INSTANCE, this.this$0.getContext(), Integer.valueOf(WiseSkuScrollConstants.INSTANCE.getFRESH_TILE_WIDTH()), null, null, 12, null);
    }
}
