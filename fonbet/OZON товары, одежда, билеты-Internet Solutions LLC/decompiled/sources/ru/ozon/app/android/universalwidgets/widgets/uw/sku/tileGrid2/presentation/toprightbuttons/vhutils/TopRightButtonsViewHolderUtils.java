package ru.ozon.app.android.universalwidgets.widgets.uw.sku.tileGrid2.presentation.toprightbuttons.vhutils;

import android.view.ViewGroup;
import jk0.j;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.composer.ComposerReferences;
import ru.ozon.app.android.product.tiles.tilegrid2.presentation.data.TileGrid2CheckBoxVO;
import ru.ozon.app.android.universalwidgets.widgets.uw.sku.tileGrid2.presentation.toprightbuttons.utils.TouchDelegateComposite;
import ru.ozon.composer.ui.widget.k;
import ru.ozon.uni.atoms.af.AtomAction;

@Metadata(d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\b\u0000\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J3\u0010\u0012\u001a\u00060\u0010j\u0002`\u00112\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\f2\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e¢\u0006\u0004\b\u0012\u0010\u0013Je\u0010 \u001a\u00020\u00182\u0006\u0010\u0014\u001a\u00020\u00012\n\u0010\u0015\u001a\u00060\u0010j\u0002`\u00112\u001a\u0010\u001a\u001a\u0016\u0012\u0004\u0012\u00020\u0017\u0012\u0004\u0012\u00020\u0018\u0018\u00010\u0016j\u0004\u0018\u0001`\u00192\u0012\u0010\u001d\u001a\u000e\u0012\u0002\b\u00030\u001bj\u0006\u0012\u0002\b\u0003`\u001c2\u0012\u0010\u001f\u001a\u000e\u0012\u0004\u0012\u00020\u001e\u0012\u0004\u0012\u00020\u00180\u0016¢\u0006\u0004\b \u0010!J\u0015\u0010\"\u001a\u00020\n2\u0006\u0010\u0014\u001a\u00020\u0001¢\u0006\u0004\b\"\u0010#R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010$R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010%¨\u0006&"}, d2 = {"Lru/ozon/app/android/universalwidgets/widgets/uw/sku/tileGrid2/presentation/toprightbuttons/vhutils/TopRightButtonsViewHolderUtils;", "", "Lru/ozon/app/android/universalwidgets/widgets/uw/sku/tileGrid2/presentation/toprightbuttons/vhutils/TopRightButtonViewHolderFactory;", "topRightButtonVhFactory", "Lru/ozon/app/android/universalwidgets/widgets/uw/sku/tileGrid2/presentation/toprightbuttons/vhutils/TopRightButtonsViewHolderBinder;", "topRightButtonsViewHolderBinder", "<init>", "(Lru/ozon/app/android/universalwidgets/widgets/uw/sku/tileGrid2/presentation/toprightbuttons/vhutils/TopRightButtonViewHolderFactory;Lru/ozon/app/android/universalwidgets/widgets/uw/sku/tileGrid2/presentation/toprightbuttons/vhutils/TopRightButtonsViewHolderBinder;)V", "Landroid/view/ViewGroup;", "parent", "", "viewType", "Lru/ozon/app/android/composer/ComposerReferences;", "composerReferences", "Lru/ozon/app/android/universalwidgets/widgets/uw/sku/tileGrid2/presentation/toprightbuttons/utils/TouchDelegateComposite;", "touchDelegateComposite", "Ljk0/j;", "Lru/ozon/app/android/uikit/view/recycler/adapter/lifecycle/LifecycleViewHolder;", "createViewHolder", "(Landroid/view/ViewGroup;ILru/ozon/app/android/composer/ComposerReferences;Lru/ozon/app/android/universalwidgets/widgets/uw/sku/tileGrid2/presentation/toprightbuttons/utils/TouchDelegateComposite;)Ljk0/j;", "model", "vh", "Lkotlin/Function1;", "Lru/ozon/uni/atoms/af/AtomAction;", "", "Lru/ozon/app/android/universalwidgets/widgets/uw/sku/tileGrid2/presentation/toprightbuttons/utils/BuildedActionHandler;", "actionHandler", "Lru/ozon/composer/ui/widget/k;", "Lru/ozon/app/android/composer/widgets/base/WidgetViewHolder;", "widgetViewHolder", "Lru/ozon/app/android/product/tiles/tilegrid2/presentation/data/TileGrid2CheckBoxVO;", "onCheckboxClick", "bindViewHolder", "(Ljava/lang/Object;Ljk0/j;Lkotlin/jvm/functions/Function1;Lru/ozon/composer/ui/widget/k;Lkotlin/jvm/functions/Function1;)V", "getItemViewType", "(Ljava/lang/Object;)I", "Lru/ozon/app/android/universalwidgets/widgets/uw/sku/tileGrid2/presentation/toprightbuttons/vhutils/TopRightButtonViewHolderFactory;", "Lru/ozon/app/android/universalwidgets/widgets/uw/sku/tileGrid2/presentation/toprightbuttons/vhutils/TopRightButtonsViewHolderBinder;", "universalwidgets_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class TopRightButtonsViewHolderUtils {

    @NotNull
    private final TopRightButtonViewHolderFactory topRightButtonVhFactory;

    @NotNull
    private final TopRightButtonsViewHolderBinder topRightButtonsViewHolderBinder;

    public TopRightButtonsViewHolderUtils(@NotNull TopRightButtonViewHolderFactory topRightButtonVhFactory, @NotNull TopRightButtonsViewHolderBinder topRightButtonsViewHolderBinder) {
        Intrinsics.checkNotNullParameter(topRightButtonVhFactory, "topRightButtonVhFactory");
        Intrinsics.checkNotNullParameter(topRightButtonsViewHolderBinder, "topRightButtonsViewHolderBinder");
        this.topRightButtonVhFactory = topRightButtonVhFactory;
        this.topRightButtonsViewHolderBinder = topRightButtonsViewHolderBinder;
    }

    public final void bindViewHolder(@NotNull Object model, @NotNull j vh2, Function1<? super AtomAction, Unit> actionHandler, @NotNull k<?> widgetViewHolder, @NotNull Function1<? super TileGrid2CheckBoxVO, Unit> onCheckboxClick) {
        Intrinsics.checkNotNullParameter(model, "model");
        Intrinsics.checkNotNullParameter(vh2, "vh");
        Intrinsics.checkNotNullParameter(widgetViewHolder, "widgetViewHolder");
        Intrinsics.checkNotNullParameter(onCheckboxClick, "onCheckboxClick");
        this.topRightButtonsViewHolderBinder.bindViewHolder(vh2, model, actionHandler, widgetViewHolder, onCheckboxClick);
    }

    @NotNull
    public final j createViewHolder(@NotNull ViewGroup parent, int viewType, @NotNull ComposerReferences composerReferences, TouchDelegateComposite touchDelegateComposite) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        Intrinsics.checkNotNullParameter(composerReferences, "composerReferences");
        return this.topRightButtonVhFactory.createViewHolder(parent, viewType, composerReferences, touchDelegateComposite);
    }

    public final int getItemViewType(@NotNull Object model) {
        Intrinsics.checkNotNullParameter(model, "model");
        return this.topRightButtonVhFactory.getViewType(model);
    }
}
