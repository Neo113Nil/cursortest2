package ru.ozon.app.android.favorites.shoppinglistv2.presentation.item;

import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.app.android.action.sheet.AtomActionSheetHandler;
import ru.ozon.app.android.favorites.ui.atomactionsheethandlers.ComparisonActionSheetHandler;
import ru.ozon.app.android.favorites.ui.atomactionsheethandlers.FavoritesListAtomActionSheetHandler;
import ru.ozon.app.android.favorites.ui.shoppinglists.SharedSellerViewModel;
import ru.ozon.uni.atoms.af.AtomAction;

@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"<anonymous>", "", "it", "Lru/ozon/uni/atoms/af/AtomAction;", "invoke", "(Lru/ozon/uni/atoms/af/AtomAction;)Ljava/lang/Boolean;"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
final class ShoppingListsV2ItemViewHolder$recreateActionHandler$1 extends AbstractC7737t implements Function1<AtomAction, Boolean> {
    final /* synthetic */ ShoppingListsV2ItemViewHolder this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ShoppingListsV2ItemViewHolder$recreateActionHandler$1(ShoppingListsV2ItemViewHolder shoppingListsV2ItemViewHolder) {
        super(1);
        this.this$0 = shoppingListsV2ItemViewHolder;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Boolean invoke(AtomAction it) {
        FavoritesListAtomActionSheetHandler favoritesListAtomActionSheetHandler;
        boolean z11;
        ComparisonActionSheetHandler comparisonActionSheetHandler;
        SharedSellerViewModel sharedSellerViewModel;
        Intrinsics.checkNotNullParameter(it, "it");
        if (it instanceof AtomAction.ComposerAction) {
            AtomAction.ComposerAction composerAction = (AtomAction.ComposerAction) it;
            if (AtomActionSheetHandler.SheetAction.INSTANCE.fromValue(composerAction.getId()) == AtomActionSheetHandler.SheetAction.FAVORITE_SELLER_REMOVE) {
                Map<String, String> params = composerAction.getParams();
                String str = params != null ? params.get("sellerId") : null;
                if (str != null) {
                    sharedSellerViewModel = this.this$0.sharedSellerViewModel;
                    sharedSellerViewModel.sendStateChangeEvent(str);
                }
            }
        }
        favoritesListAtomActionSheetHandler = this.this$0.favoritesListsActionHandler;
        if (!favoritesListAtomActionSheetHandler.handle(it)) {
            comparisonActionSheetHandler = this.this$0.comparisonActionSheetHandler;
            if (!comparisonActionSheetHandler.handle(it)) {
                z11 = false;
                return Boolean.valueOf(z11);
            }
        }
        z11 = true;
        return Boolean.valueOf(z11);
    }
}
