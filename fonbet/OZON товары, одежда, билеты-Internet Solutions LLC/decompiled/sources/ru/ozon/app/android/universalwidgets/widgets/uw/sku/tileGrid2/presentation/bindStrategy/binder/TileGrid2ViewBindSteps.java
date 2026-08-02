package ru.ozon.app.android.universalwidgets.widgets.uw.sku.tileGrid2.presentation.bindStrategy.binder;

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.action.sheet.DisposableActionHandler;
import ru.ozon.app.android.product.molecules.countbutton.presentation.CountButtonViewModel;
import ru.ozon.app.android.product.tiles.tilegrid2.presentation.data.TileGrid2VO;

@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\b`\u0018\u00002\u00020\u0001J$\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u00072\b\u0010\b\u001a\u0004\u0018\u00010\tH&J\b\u0010\n\u001a\u00020\u0003H&J\b\u0010\u000b\u001a\u00020\u0003H&J\b\u0010\f\u001a\u00020\u0003H&J\b\u0010\r\u001a\u00020\u0003H&J\b\u0010\u000e\u001a\u00020\u0003H&J\b\u0010\u000f\u001a\u00020\u0003H&J\b\u0010\u0010\u001a\u00020\u0003H&¨\u0006\u0011"}, d2 = {"Lru/ozon/app/android/universalwidgets/widgets/uw/sku/tileGrid2/presentation/bindStrategy/binder/TileGrid2ViewBindSteps;", "", "prepare", "", "vo", "Lru/ozon/app/android/product/tiles/tilegrid2/presentation/data/TileGrid2VO;", "countButtonViewModel", "Lru/ozon/app/android/product/molecules/countbutton/presentation/CountButtonViewModel;", "actionHandler", "Lru/ozon/app/android/action/sheet/DisposableActionHandler;", "bindBackground", "bindGallery", "bindLogo", "bindTopRightButtons", "bindBadges", "bindMainState", "bindCountButton", "universalwidgets_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public interface TileGrid2ViewBindSteps {
    void bindBackground();

    void bindBadges();

    void bindCountButton();

    void bindGallery();

    void bindLogo();

    void bindMainState();

    void bindTopRightButtons();

    void prepare(@NotNull TileGrid2VO vo, CountButtonViewModel countButtonViewModel, DisposableActionHandler actionHandler);
}
