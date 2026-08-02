package ru.ozon.app.android.universalwidgets.widgets.uw.sku.tileGrid2.presentation;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.favorites.data.favoriteReserveButton.FavoriteReserveButtonMolecule;
import ru.ozon.app.android.favorites.data.favoritebutton.favoriteproduct.model.AnalyticData;
import ru.ozon.app.android.favorites.ui.favoriteReserveButton.delegate.FavoriteReserveButtonDelegate;
import ru.ozon.composer.ui.widget.k;
import ru.ozon.uni.android.controls.buttonV3.ButtonV3View;

@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J#\u0010\n\u001a\u00020\t2\u0012\u0010\b\u001a\u000e\u0012\u0002\b\u00030\u0006j\u0006\u0012\u0002\b\u0003`\u0007H\u0002¢\u0006\u0004\b\n\u0010\u000bJ3\u0010\u0011\u001a\u00020\u00102\u0006\u0010\r\u001a\u00020\f2\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\u0012\u0010\b\u001a\u000e\u0012\u0002\b\u00030\u0006j\u0006\u0012\u0002\b\u0003`\u0007¢\u0006\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0013¨\u0006\u0014"}, d2 = {"Lru/ozon/app/android/universalwidgets/widgets/uw/sku/tileGrid2/presentation/ReserveButtonBinder;", "", "Lru/ozon/app/android/favorites/ui/favoriteReserveButton/delegate/FavoriteReserveButtonDelegate;", "buttonDelegate", "<init>", "(Lru/ozon/app/android/favorites/ui/favoriteReserveButton/delegate/FavoriteReserveButtonDelegate;)V", "Lru/ozon/composer/ui/widget/k;", "Lru/ozon/app/android/composer/widgets/base/WidgetViewHolder;", "widgetViewHolder", "Lru/ozon/app/android/favorites/data/favoritebutton/favoriteproduct/model/AnalyticData;", "buildAnalyticData", "(Lru/ozon/composer/ui/widget/k;)Lru/ozon/app/android/favorites/data/favoritebutton/favoriteproduct/model/AnalyticData;", "Lru/ozon/uni/android/controls/buttonV3/ButtonV3View;", "view", "Lru/ozon/app/android/favorites/data/favoriteReserveButton/FavoriteReserveButtonMolecule;", "molecule", "", "bindButton", "(Lru/ozon/uni/android/controls/buttonV3/ButtonV3View;Lru/ozon/app/android/favorites/data/favoriteReserveButton/FavoriteReserveButtonMolecule;Lru/ozon/composer/ui/widget/k;)V", "Lru/ozon/app/android/favorites/ui/favoriteReserveButton/delegate/FavoriteReserveButtonDelegate;", "universalwidgets_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class ReserveButtonBinder {

    @NotNull
    private final FavoriteReserveButtonDelegate buttonDelegate;

    public ReserveButtonBinder(@NotNull FavoriteReserveButtonDelegate buttonDelegate) {
        Intrinsics.checkNotNullParameter(buttonDelegate, "buttonDelegate");
        this.buttonDelegate = buttonDelegate;
    }

    private final AnalyticData buildAnalyticData(k<?> widgetViewHolder) {
        return new AnalyticData(widgetViewHolder.getTrackingData(), widgetViewHolder.getViewItem());
    }

    public final void bindButton(@NotNull ButtonV3View view, FavoriteReserveButtonMolecule molecule, @NotNull k<?> widgetViewHolder) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(widgetViewHolder, "widgetViewHolder");
        this.buttonDelegate.bindFavoriteReserveButtonOrGone(view, molecule, buildAnalyticData(widgetViewHolder));
    }
}
