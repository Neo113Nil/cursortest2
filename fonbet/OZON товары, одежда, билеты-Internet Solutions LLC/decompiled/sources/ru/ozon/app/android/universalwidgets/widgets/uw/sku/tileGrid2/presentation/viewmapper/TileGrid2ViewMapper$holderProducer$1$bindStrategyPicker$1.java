package ru.ozon.app.android.universalwidgets.widgets.uw.sku.tileGrid2.presentation.viewmapper;

import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC7737t;
import ru.ozon.app.android.universalwidgets.widgets.uw.sku.tileGrid2.presentation.TileGrid2BaseViewBinding;
import ru.ozon.app.android.universalwidgets.widgets.uw.sku.tileGrid2.presentation.logo.BrandLogoDelegate;
import ru.ozon.app.android.universalwidgets.widgets.uw.sku.tileGrid2.presentation.logo.BrandLogoTransformedBitmapCache;

@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lru/ozon/app/android/universalwidgets/widgets/uw/sku/tileGrid2/presentation/logo/BrandLogoDelegate;", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
final class TileGrid2ViewMapper$holderProducer$1$bindStrategyPicker$1 extends AbstractC7737t implements Function0<BrandLogoDelegate> {
    final /* synthetic */ TileGrid2BaseViewBinding $viewBinding;
    final /* synthetic */ TileGrid2ViewMapper this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    TileGrid2ViewMapper$holderProducer$1$bindStrategyPicker$1(TileGrid2BaseViewBinding tileGrid2BaseViewBinding, TileGrid2ViewMapper tileGrid2ViewMapper) {
        super(0);
        this.$viewBinding = tileGrid2BaseViewBinding;
        this.this$0 = tileGrid2ViewMapper;
    }

    @Override // kotlin.jvm.functions.Function0
    public final BrandLogoDelegate invoke() {
        BrandLogoTransformedBitmapCache brandLogoCache;
        TileGrid2BaseViewBinding tileGrid2BaseViewBinding = this.$viewBinding;
        brandLogoCache = this.this$0.getBrandLogoCache();
        return new BrandLogoDelegate(tileGrid2BaseViewBinding, brandLogoCache, this.this$0.component().getAdultHandler());
    }
}
