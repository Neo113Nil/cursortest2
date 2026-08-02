package ru.ozon.app.android.fresh.common.widgets.molecules.freshTile;

import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC7737t;
import ru.ozon.app.android.fresh.common.widgets.molecules.freshTile.presentation.FreshTileViewV2;
import ru.ozon.app.android.fresh.common.widgets.molecules.productMedia.presentation.ProductMediaView;

@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u0004\u0018\u00010\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lru/ozon/app/android/fresh/common/widgets/molecules/productMedia/presentation/ProductMediaView;", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
final class FreshTileDelegateV2$onAttach$3 extends AbstractC7737t implements Function0<ProductMediaView> {
    final /* synthetic */ Function0<FreshTileViewV2> $viewProvider;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    FreshTileDelegateV2$onAttach$3(Function0<FreshTileViewV2> function0) {
        super(0);
        this.$viewProvider = function0;
    }

    @Override // kotlin.jvm.functions.Function0
    public final ProductMediaView invoke() {
        return this.$viewProvider.invoke().getProductMediaView();
    }
}
