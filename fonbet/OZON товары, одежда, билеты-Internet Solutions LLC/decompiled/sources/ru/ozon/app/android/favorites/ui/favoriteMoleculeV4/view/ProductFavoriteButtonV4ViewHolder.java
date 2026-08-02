package ru.ozon.app.android.favorites.ui.favoriteMoleculeV4.view;

import android.content.Context;
import android.view.View;
import androidx.fragment.app.G;
import androidx.fragment.app.r;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.account.adult.presenter.AdultHandler;
import ru.ozon.app.android.account.adult.ui.AdultListener;
import ru.ozon.app.android.action.ActionHandler;
import ru.ozon.app.android.composer.ComposerReferences;
import ru.ozon.app.android.favorites.data.favoritebutton.favoriteproduct.FavoriteProductMolecule;
import ru.ozon.app.android.favorites.domain.model.FavoriteProductModel;
import ru.ozon.app.android.navigation.miniapp.MiniAppExtKt;
import ru.ozon.composer.ui.widget.l;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.data.AtomActionDTO;
import ru.ozon.uni.atoms.data.AtomActionMapperKt;
import ru.ozon.uni.atoms.data.controls.CommonControlSettings;

@Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u001f\u0010\u0011\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u0011\u0010\u0012J5\u0010\u0015\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000f2\u0014\u0010\u0014\u001a\u0010\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\n\u0018\u00010\u0013H\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\u0015\u0010\u0017\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\u0017\u0010\fJ)\u0010\u001b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\b2\b\u0010\u0018\u001a\u0004\u0018\u00010\r2\b\u0010\u001a\u001a\u0004\u0018\u00010\u0019¢\u0006\u0004\b\u001b\u0010\u001cJ!\u0010\u001f\u001a\u00020\n2\b\u0010\u0018\u001a\u0004\u0018\u00010\r2\b\b\u0002\u0010\u001e\u001a\u00020\u001d¢\u0006\u0004\b\u001f\u0010 J\r\u0010!\u001a\u00020\n¢\u0006\u0004\b!\u0010\"R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010#R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010$R0\u0010%\u001a\u0010\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\n\u0018\u00010\u00138\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b%\u0010&\u001a\u0004\b'\u0010(\"\u0004\b)\u0010*R\u0018\u0010+\u001a\u0004\u0018\u00010\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b+\u0010,R\u0018\u0010-\u001a\u0004\u0018\u00010\u00198\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b-\u0010.R \u00100\u001a\u000e\u0012\u0004\u0012\u00020/\u0012\u0004\u0012\u00020\n0\u00138\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b0\u0010&¨\u00061"}, d2 = {"Lru/ozon/app/android/favorites/ui/favoriteMoleculeV4/view/ProductFavoriteButtonV4ViewHolder;", "", "Lru/ozon/app/android/account/adult/presenter/AdultHandler;", "adultHandler", "Lru/ozon/app/android/composer/ComposerReferences;", "references", "<init>", "(Lru/ozon/app/android/account/adult/presenter/AdultHandler;Lru/ozon/app/android/composer/ComposerReferences;)V", "Lru/ozon/app/android/favorites/ui/favoriteMoleculeV4/view/ProductFavoriteMoleculeV4ButtonView;", "buttonView", "", "setCurrentButtonView", "(Lru/ozon/app/android/favorites/ui/favoriteMoleculeV4/view/ProductFavoriteMoleculeV4ButtonView;)V", "Lru/ozon/app/android/favorites/domain/model/FavoriteProductModel;", "model", "Landroid/view/View;", "view", "processLongClick", "(Lru/ozon/app/android/favorites/domain/model/FavoriteProductModel;Landroid/view/View;)V", "Lkotlin/Function1;", "actionCallback", "processRegularButtonAction", "(Lru/ozon/app/android/favorites/domain/model/FavoriteProductModel;Landroid/view/View;Lkotlin/jvm/functions/Function1;)V", "attachButton", "molecule", "Lru/ozon/composer/ui/widget/l;", "viewItem", "bindButton", "(Lru/ozon/app/android/favorites/ui/favoriteMoleculeV4/view/ProductFavoriteMoleculeV4ButtonView;Lru/ozon/app/android/favorites/domain/model/FavoriteProductModel;Lru/ozon/composer/ui/widget/l;)V", "", "needShake", "rebindData", "(Lru/ozon/app/android/favorites/domain/model/FavoriteProductModel;Z)V", "detachButton", "()V", "Lru/ozon/app/android/account/adult/presenter/AdultHandler;", "Lru/ozon/app/android/composer/ComposerReferences;", "onClick", "Lkotlin/jvm/functions/Function1;", "getOnClick", "()Lkotlin/jvm/functions/Function1;", "setOnClick", "(Lkotlin/jvm/functions/Function1;)V", "currentButtonView", "Lru/ozon/app/android/favorites/ui/favoriteMoleculeV4/view/ProductFavoriteMoleculeV4ButtonView;", "currentViewItem", "Lru/ozon/composer/ui/widget/l;", "Lru/ozon/uni/atoms/af/AtomAction;", "actionHandler", "favorites_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class ProductFavoriteButtonV4ViewHolder {

    @NotNull
    private final Function1<AtomAction, Unit> actionHandler;

    @NotNull
    private final AdultHandler adultHandler;
    private ProductFavoriteMoleculeV4ButtonView currentButtonView;
    private l currentViewItem;
    private Function1<? super FavoriteProductModel, Unit> onClick;

    @NotNull
    private final ComposerReferences references;

    public ProductFavoriteButtonV4ViewHolder(@NotNull AdultHandler adultHandler, @NotNull ComposerReferences references) {
        Intrinsics.checkNotNullParameter(adultHandler, "adultHandler");
        Intrinsics.checkNotNullParameter(references, "references");
        this.adultHandler = adultHandler;
        this.references = references;
        this.actionHandler = new ActionHandler.Builder(references, ProductFavoriteButtonV4ViewHolder$actionHandler$1.INSTANCE, ProductFavoriteButtonV4ViewHolder$actionHandler$2.INSTANCE, new ProductFavoriteButtonV4ViewHolder$actionHandler$3(this)).buildHandler();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void processLongClick(FavoriteProductModel model, View view) {
        AtomActionDTO addToListAction = model.getAddToListAction();
        if (addToListAction != null) {
            AtomAction atomAction = AtomActionMapperKt.toAtomAction(addToListAction, null);
            if (atomAction == null) {
                return;
            }
            r a11 = this.references.getContainer().a();
            String miniAppName = a11 != null ? MiniAppExtKt.getMiniAppName(a11) : null;
            if (miniAppName != null) {
                int hashCode = miniAppName.hashCode();
                if (hashCode != -1339606153) {
                    if (hashCode != -865698022) {
                        if (hashCode == -793554375 && miniAppName.equals("apparel")) {
                            return;
                        }
                    } else if (miniAppName.equals("travel")) {
                        return;
                    }
                } else if (miniAppName.equals("supermarket")) {
                    return;
                }
            }
            processRegularButtonAction(model, view, new ProductFavoriteButtonV4ViewHolder$processLongClick$1(this, atomAction));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void processRegularButtonAction(final FavoriteProductModel model, View view, final Function1<? super FavoriteProductModel, Unit> actionCallback) {
        AtomActionDTO action;
        Map<String, String> params;
        String str;
        CommonControlSettings common = model.getFavoriteButton().getCommon();
        boolean parseBoolean = (common == null || (action = common.getAction()) == null || (params = action.getParams()) == null || (str = params.get(FavoriteProductMolecule.IS_ADULT_PARAMS_NAME)) == null) ? false : Boolean.parseBoolean(str);
        AdultHandler adultHandler = this.adultHandler;
        Context context = view.getContext();
        Intrinsics.g(context, "null cannot be cast to non-null type androidx.fragment.app.FragmentActivity");
        G supportFragmentManager = ((r) context).getSupportFragmentManager();
        Intrinsics.checkNotNullExpressionValue(supportFragmentManager, "getSupportFragmentManager(...)");
        AdultHandler.DefaultImpls.showAdultDialog$default(adultHandler, parseBoolean, supportFragmentManager, new AdultListener() { // from class: ru.ozon.app.android.favorites.ui.favoriteMoleculeV4.view.ProductFavoriteButtonV4ViewHolder$processRegularButtonAction$1
            @Override // ru.ozon.app.android.account.adult.ui.AdultListener
            public void onAdultAccept() {
                Function1<FavoriteProductModel, Unit> function1 = actionCallback;
                if (function1 != null) {
                    function1.invoke(model);
                }
            }

            @Override // ru.ozon.app.android.account.adult.ui.AdultListener
            public void onAdultReject() {
                AdultListener.DefaultImpls.onAdultReject(this);
            }
        }, null, false, 24, null);
    }

    private final void setCurrentButtonView(ProductFavoriteMoleculeV4ButtonView buttonView) {
        buttonView.setOnLongLick(new ProductFavoriteButtonV4ViewHolder$setCurrentButtonView$1$1(this));
        buttonView.setOnClick(new ProductFavoriteButtonV4ViewHolder$setCurrentButtonView$1$2(this));
        this.currentButtonView = buttonView;
    }

    public final void attachButton(@NotNull ProductFavoriteMoleculeV4ButtonView buttonView) {
        Intrinsics.checkNotNullParameter(buttonView, "buttonView");
        setCurrentButtonView(buttonView);
    }

    public final void bindButton(@NotNull ProductFavoriteMoleculeV4ButtonView buttonView, FavoriteProductModel molecule, l viewItem) {
        Intrinsics.checkNotNullParameter(buttonView, "buttonView");
        setCurrentButtonView(buttonView);
        this.currentViewItem = viewItem;
        ProductFavoriteMoleculeV4ButtonView productFavoriteMoleculeV4ButtonView = this.currentButtonView;
        if (productFavoriteMoleculeV4ButtonView != null) {
            productFavoriteMoleculeV4ButtonView.bindFavoriteOrGone(molecule);
        }
    }

    public final void detachButton() {
        this.currentButtonView = null;
    }

    public final Function1<FavoriteProductModel, Unit> getOnClick() {
        return this.onClick;
    }

    public final void rebindData(FavoriteProductModel molecule, boolean needShake) {
        ProductFavoriteMoleculeV4ButtonView productFavoriteMoleculeV4ButtonView;
        if (needShake && (productFavoriteMoleculeV4ButtonView = this.currentButtonView) != null) {
            productFavoriteMoleculeV4ButtonView.shake();
        }
        ProductFavoriteMoleculeV4ButtonView productFavoriteMoleculeV4ButtonView2 = this.currentButtonView;
        if (productFavoriteMoleculeV4ButtonView2 != null) {
            productFavoriteMoleculeV4ButtonView2.bindFavoriteOrGone(molecule);
        }
    }

    public final void setOnClick(Function1<? super FavoriteProductModel, Unit> function1) {
        this.onClick = function1;
    }
}
