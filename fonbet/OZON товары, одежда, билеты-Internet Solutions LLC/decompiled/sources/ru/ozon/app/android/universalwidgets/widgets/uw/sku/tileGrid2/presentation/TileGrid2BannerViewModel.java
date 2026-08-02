package ru.ozon.app.android.universalwidgets.widgets.uw.sku.tileGrid2.presentation;

import WZ.e;
import WZ.t;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.product.tiles.tilegrid2.presentation.data.TileGrid2BannerVO;
import ru.ozon.app.android.product.tiles.tilegrid2.presentation.multibutton.data.TileGrid2BannerSeparatedButtonVO;

@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\b`\u0018\u00002\u00020\u0001JG\u0010\r\u001a\u00020\u000b2\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0005\u001a\u00020\u00042$\u0010\f\u001a \u0012\b\u0012\u00060\u0007j\u0002`\b\u0012\f\u0012\n\u0018\u00010\tj\u0004\u0018\u0001`\n\u0012\u0004\u0012\u00020\u000b0\u0006H&¢\u0006\u0004\b\r\u0010\u000eJ?\u0010\u000f\u001a\u00020\u000b2\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022$\u0010\f\u001a \u0012\b\u0012\u00060\u0007j\u0002`\b\u0012\f\u0012\n\u0018\u00010\tj\u0004\u0018\u0001`\n\u0012\u0004\u0012\u00020\u000b0\u0006H&¢\u0006\u0004\b\u000f\u0010\u0010J\u0019\u0010\u0011\u001a\u00020\u000b2\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H&¢\u0006\u0004\b\u0011\u0010\u0012J\u0019\u0010\u0014\u001a\u00020\u000b2\b\u0010\u0003\u001a\u0004\u0018\u00010\u0013H&¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0016\u001a\u00020\u000bH&¢\u0006\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, d2 = {"Lru/ozon/app/android/universalwidgets/widgets/uw/sku/tileGrid2/presentation/TileGrid2BannerViewModel;", "", "Lru/ozon/app/android/product/tiles/tilegrid2/presentation/data/TileGrid2BannerVO;", "item", "", "mostlyVisible", "Lkotlin/Function2;", "LWZ/t;", "Lru/ozon/app/android/analytics/modules/tokenized/TokenizedEvent;", "LWZ/e;", "Lru/ozon/app/android/analytics/modules/tokenized/CustomParamsModifier;", "", "trackComposerAnalytics", "widgetVisibilityChanged", "(Lru/ozon/app/android/product/tiles/tilegrid2/presentation/data/TileGrid2BannerVO;ZLkotlin/jvm/functions/Function2;)V", "bannerImageLoaded", "(Lru/ozon/app/android/product/tiles/tilegrid2/presentation/data/TileGrid2BannerVO;Lkotlin/jvm/functions/Function2;)V", "bannerClicked", "(Lru/ozon/app/android/product/tiles/tilegrid2/presentation/data/TileGrid2BannerVO;)V", "Lru/ozon/app/android/product/tiles/tilegrid2/presentation/multibutton/data/TileGrid2BannerSeparatedButtonVO;", "separatedButtonClicked", "(Lru/ozon/app/android/product/tiles/tilegrid2/presentation/multibutton/data/TileGrid2BannerSeparatedButtonVO;)V", "onRefresh", "()V", "universalwidgets_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public interface TileGrid2BannerViewModel {
    void bannerClicked(TileGrid2BannerVO item);

    void bannerImageLoaded(TileGrid2BannerVO item, @NotNull Function2<? super t, ? super e, Unit> trackComposerAnalytics);

    void onRefresh();

    void separatedButtonClicked(TileGrid2BannerSeparatedButtonVO item);

    void widgetVisibilityChanged(TileGrid2BannerVO item, boolean mostlyVisible, @NotNull Function2<? super t, ? super e, Unit> trackComposerAnalytics);
}
