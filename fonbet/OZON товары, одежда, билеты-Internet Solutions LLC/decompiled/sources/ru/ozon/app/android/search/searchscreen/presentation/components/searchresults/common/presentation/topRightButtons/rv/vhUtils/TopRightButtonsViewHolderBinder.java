package ru.ozon.app.android.search.searchscreen.presentation.components.searchresults.common.presentation.topRightButtons.rv.vhUtils;

import jk0.j;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.favorites.data.favoritebutton.favoriteproduct.FavoriteProductMolecule;
import ru.ozon.app.android.search.searchscreen.presentation.components.searchresults.common.presentation.topRightButtons.rv.models.TopRightButtonCheckBox;
import ru.ozon.app.android.search.searchscreen.presentation.components.searchresults.common.presentation.topRightButtons.rv.viewHolders.TopRightButtonProductFavoriteMoleculeViewHolder;
import ru.ozon.app.android.search.searchscreen.presentation.components.searchresults.common.presentation.topRightButtons.rv.viewHolders.TopRightCheckBoxViewHolder;
import ru.ozon.app.android.search.searchscreen.presentation.components.searchresults.common.presentation.topRightButtons.rv.viewHolders.TopRightSmallIconButtonViewHolder;
import ru.ozon.composer.ui.widget.k;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.data.button.ButtonV3Atom;

@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003JQ\u0010\u0010\u001a\u00020\n2\n\u0010\u0006\u001a\u00060\u0004j\u0002`\u00052\u0006\u0010\u0007\u001a\u00020\u00012\u001a\u0010\f\u001a\u0016\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n\u0018\u00010\bj\u0004\u0018\u0001`\u000b2\u0012\u0010\u000f\u001a\u000e\u0012\u0002\b\u00030\rj\u0006\u0012\u0002\b\u0003`\u000e¢\u0006\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, d2 = {"Lru/ozon/app/android/search/searchscreen/presentation/components/searchresults/common/presentation/topRightButtons/rv/vhUtils/TopRightButtonsViewHolderBinder;", "", "<init>", "()V", "Ljk0/j;", "Lru/ozon/app/android/uikit/view/recycler/adapter/lifecycle/LifecycleViewHolder;", "vh", "model", "Lkotlin/Function1;", "Lru/ozon/uni/atoms/af/AtomAction;", "", "Lru/ozon/app/android/search/searchscreen/presentation/components/searchresults/common/presentation/topRightButtons/rv/BuildedActionHandler;", "actionHandler", "Lru/ozon/composer/ui/widget/k;", "Lru/ozon/app/android/composer/widgets/base/WidgetViewHolder;", "widgetViewHolder", "bindViewHolder", "(Ljk0/j;Ljava/lang/Object;Lkotlin/jvm/functions/Function1;Lru/ozon/composer/ui/widget/k;)V", "search_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class TopRightButtonsViewHolderBinder {
    public final void bindViewHolder(@NotNull j vh2, @NotNull Object model, Function1<? super AtomAction, Unit> actionHandler, @NotNull k<?> widgetViewHolder) {
        Intrinsics.checkNotNullParameter(vh2, "vh");
        Intrinsics.checkNotNullParameter(model, "model");
        Intrinsics.checkNotNullParameter(widgetViewHolder, "widgetViewHolder");
        if (vh2 instanceof TopRightSmallIconButtonViewHolder) {
            TopRightSmallIconButtonViewHolder topRightSmallIconButtonViewHolder = (TopRightSmallIconButtonViewHolder) vh2;
            ButtonV3Atom.SmallIconButton smallIconButton = model instanceof ButtonV3Atom.SmallIconButton ? (ButtonV3Atom.SmallIconButton) model : null;
            if (smallIconButton == null) {
                return;
            }
            topRightSmallIconButtonViewHolder.bind(smallIconButton, actionHandler);
            return;
        }
        if (vh2 instanceof TopRightCheckBoxViewHolder) {
            TopRightCheckBoxViewHolder topRightCheckBoxViewHolder = (TopRightCheckBoxViewHolder) vh2;
            TopRightButtonCheckBox topRightButtonCheckBox = model instanceof TopRightButtonCheckBox ? (TopRightButtonCheckBox) model : null;
            if (topRightButtonCheckBox == null) {
                return;
            }
            topRightCheckBoxViewHolder.bind(topRightButtonCheckBox, widgetViewHolder);
            return;
        }
        if (vh2 instanceof TopRightButtonProductFavoriteMoleculeViewHolder) {
            TopRightButtonProductFavoriteMoleculeViewHolder topRightButtonProductFavoriteMoleculeViewHolder = (TopRightButtonProductFavoriteMoleculeViewHolder) vh2;
            FavoriteProductMolecule favoriteProductMolecule = model instanceof FavoriteProductMolecule ? (FavoriteProductMolecule) model : null;
            if (favoriteProductMolecule == null) {
                return;
            }
            topRightButtonProductFavoriteMoleculeViewHolder.bind(favoriteProductMolecule, widgetViewHolder);
        }
    }
}
