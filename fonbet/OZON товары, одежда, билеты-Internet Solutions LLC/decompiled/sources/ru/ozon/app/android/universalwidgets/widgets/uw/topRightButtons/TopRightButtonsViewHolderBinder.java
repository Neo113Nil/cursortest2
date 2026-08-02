package ru.ozon.app.android.universalwidgets.widgets.uw.topRightButtons;

import jk0.j;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.favorites.data.favoritebutton.favoriteproduct.FavoriteProductMolecule;
import ru.ozon.app.android.universalwidgets.widgets.uw.topRightButtons.viewHolders.FavoriteMoleculeViewHolder;
import ru.ozon.app.android.universalwidgets.widgets.uw.topRightButtons.viewHolders.TopRightButtonsSmallIconButtonViewHolder;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.data.button.ButtonV3Atom;

@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003J=\u0010\r\u001a\u00020\n2\n\u0010\u0006\u001a\u00060\u0004j\u0002`\u00052\u0006\u0010\u0007\u001a\u00020\u00012\u001a\u0010\f\u001a\u0016\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n\u0018\u00010\bj\u0004\u0018\u0001`\u000b¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lru/ozon/app/android/universalwidgets/widgets/uw/topRightButtons/TopRightButtonsViewHolderBinder;", "", "<init>", "()V", "Ljk0/j;", "Lru/ozon/app/android/uikit/view/recycler/adapter/lifecycle/LifecycleViewHolder;", "vh", "model", "Lkotlin/Function1;", "Lru/ozon/uni/atoms/af/AtomAction;", "", "Lru/ozon/app/android/universalwidgets/widgets/uw/topRightButtons/BuildedActionHandler;", "actionHandler", "bindViewHolder", "(Ljk0/j;Ljava/lang/Object;Lkotlin/jvm/functions/Function1;)V", "universalwidgets_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class TopRightButtonsViewHolderBinder {
    public final void bindViewHolder(@NotNull j vh2, @NotNull Object model, Function1<? super AtomAction, Unit> actionHandler) {
        Intrinsics.checkNotNullParameter(vh2, "vh");
        Intrinsics.checkNotNullParameter(model, "model");
        if (vh2 instanceof TopRightButtonsSmallIconButtonViewHolder) {
            TopRightButtonsSmallIconButtonViewHolder topRightButtonsSmallIconButtonViewHolder = (TopRightButtonsSmallIconButtonViewHolder) vh2;
            ButtonV3Atom.SmallIconButton smallIconButton = model instanceof ButtonV3Atom.SmallIconButton ? (ButtonV3Atom.SmallIconButton) model : null;
            if (smallIconButton == null) {
                return;
            }
            topRightButtonsSmallIconButtonViewHolder.bind(smallIconButton, actionHandler);
            return;
        }
        if (vh2 instanceof FavoriteMoleculeViewHolder) {
            FavoriteMoleculeViewHolder favoriteMoleculeViewHolder = (FavoriteMoleculeViewHolder) vh2;
            FavoriteProductMolecule favoriteProductMolecule = model instanceof FavoriteProductMolecule ? (FavoriteProductMolecule) model : null;
            if (favoriteProductMolecule == null) {
                return;
            }
            favoriteMoleculeViewHolder.bind(favoriteProductMolecule);
        }
    }
}
