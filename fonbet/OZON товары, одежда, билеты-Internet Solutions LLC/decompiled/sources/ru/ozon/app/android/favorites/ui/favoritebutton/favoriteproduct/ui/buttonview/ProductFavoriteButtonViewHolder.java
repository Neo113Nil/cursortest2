package ru.ozon.app.android.favorites.ui.favoritebutton.favoriteproduct.ui.buttonview;

import android.content.Context;
import android.view.View;
import androidx.fragment.app.G;
import androidx.fragment.app.r;
import java.lang.ref.WeakReference;
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
import ru.ozon.app.android.navigation.miniapp.MiniAppExtKt;
import ru.ozon.app.android.utils.AppType;
import ru.ozon.composer.ui.widget.l;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.data.AtomActionDTO;
import ru.ozon.uni.atoms.data.AtomActionMapperKt;

@Metadata(d1 = {"\u0000h\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u001f\u0010\u0013\u001a\u00020\f2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u0011H\u0002¢\u0006\u0004\b\u0013\u0010\u0014J5\u0010\u0017\u001a\u00020\f2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u00112\u0014\u0010\u0016\u001a\u0010\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\f\u0018\u00010\u0015H\u0002¢\u0006\u0004\b\u0017\u0010\u0018J\u0015\u0010\u001a\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\u0019¢\u0006\u0004\b\u001a\u0010\u001bJ)\u0010\u001f\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\n2\b\u0010\u001c\u001a\u0004\u0018\u00010\u000f2\b\u0010\u001e\u001a\u0004\u0018\u00010\u001d¢\u0006\u0004\b\u001f\u0010 J!\u0010#\u001a\u00020\f2\b\u0010\u001c\u001a\u0004\u0018\u00010\u000f2\b\b\u0002\u0010\"\u001a\u00020!¢\u0006\u0004\b#\u0010$J\r\u0010%\u001a\u00020\f¢\u0006\u0004\b%\u0010&J\u0015\u0010'\u001a\u00020\f2\u0006\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b'\u0010(R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010)R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010*R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010+R0\u0010,\u001a\u0010\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\f\u0018\u00010\u00158\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b,\u0010-\u001a\u0004\b.\u0010/\"\u0004\b0\u00101R\u001e\u00103\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u0001028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b3\u00104R\u0018\u00105\u001a\u0004\u0018\u00010\u001d8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b5\u00106R \u00108\u001a\u000e\u0012\u0004\u0012\u000207\u0012\u0004\u0012\u00020\f0\u00158\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b8\u0010-¨\u00069"}, d2 = {"Lru/ozon/app/android/favorites/ui/favoritebutton/favoriteproduct/ui/buttonview/ProductFavoriteButtonViewHolder;", "", "Lru/ozon/app/android/account/adult/presenter/AdultHandler;", "adultHandler", "Lru/ozon/app/android/composer/ComposerReferences;", "references", "Lru/ozon/app/android/utils/AppType;", "appType", "<init>", "(Lru/ozon/app/android/account/adult/presenter/AdultHandler;Lru/ozon/app/android/composer/ComposerReferences;Lru/ozon/app/android/utils/AppType;)V", "Lru/ozon/app/android/favorites/ui/favoritebutton/favoriteproduct/ui/buttonview/FavoriteButton;", "buttonView", "", "setCurrentButtonView", "(Lru/ozon/app/android/favorites/ui/favoritebutton/favoriteproduct/ui/buttonview/FavoriteButton;)V", "Lru/ozon/app/android/favorites/data/favoritebutton/favoriteproduct/FavoriteProductMolecule;", "model", "Landroid/view/View;", "view", "processLongClick", "(Lru/ozon/app/android/favorites/data/favoritebutton/favoriteproduct/FavoriteProductMolecule;Landroid/view/View;)V", "Lkotlin/Function1;", "actionCallback", "processRegularButtonAction", "(Lru/ozon/app/android/favorites/data/favoritebutton/favoriteproduct/FavoriteProductMolecule;Landroid/view/View;Lkotlin/jvm/functions/Function1;)V", "Lru/ozon/app/android/favorites/ui/favoritebutton/favoriteproduct/ui/buttonview/ProductFavoriteMoleculeButtonView;", "attachButton", "(Lru/ozon/app/android/favorites/ui/favoritebutton/favoriteproduct/ui/buttonview/ProductFavoriteMoleculeButtonView;)V", "molecule", "Lru/ozon/composer/ui/widget/l;", "viewItem", "bindButton", "(Lru/ozon/app/android/favorites/ui/favoritebutton/favoriteproduct/ui/buttonview/FavoriteButton;Lru/ozon/app/android/favorites/data/favoritebutton/favoriteproduct/FavoriteProductMolecule;Lru/ozon/composer/ui/widget/l;)V", "", "needShake", "rebindData", "(Lru/ozon/app/android/favorites/data/favoritebutton/favoriteproduct/FavoriteProductMolecule;Z)V", "detachButton", "()V", "changeButton", "(Lru/ozon/app/android/favorites/data/favoritebutton/favoriteproduct/FavoriteProductMolecule;)V", "Lru/ozon/app/android/account/adult/presenter/AdultHandler;", "Lru/ozon/app/android/composer/ComposerReferences;", "Lru/ozon/app/android/utils/AppType;", "onButtonChanged", "Lkotlin/jvm/functions/Function1;", "getOnButtonChanged", "()Lkotlin/jvm/functions/Function1;", "setOnButtonChanged", "(Lkotlin/jvm/functions/Function1;)V", "Ljava/lang/ref/WeakReference;", "currentButtonView", "Ljava/lang/ref/WeakReference;", "currentViewItem", "Lru/ozon/composer/ui/widget/l;", "Lru/ozon/uni/atoms/af/AtomAction;", "actionHandler", "favorites_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class ProductFavoriteButtonViewHolder {

    @NotNull
    private final Function1<AtomAction, Unit> actionHandler;

    @NotNull
    private final AdultHandler adultHandler;

    @NotNull
    private final AppType appType;
    private WeakReference<FavoriteButton> currentButtonView;
    private l currentViewItem;
    private Function1<? super FavoriteProductMolecule, Unit> onButtonChanged;

    @NotNull
    private final ComposerReferences references;

    public ProductFavoriteButtonViewHolder(@NotNull AdultHandler adultHandler, @NotNull ComposerReferences references, @NotNull AppType appType) {
        Intrinsics.checkNotNullParameter(adultHandler, "adultHandler");
        Intrinsics.checkNotNullParameter(references, "references");
        Intrinsics.checkNotNullParameter(appType, "appType");
        this.adultHandler = adultHandler;
        this.references = references;
        this.appType = appType;
        this.actionHandler = new ActionHandler.Builder(references, ProductFavoriteButtonViewHolder$actionHandler$1.INSTANCE, ProductFavoriteButtonViewHolder$actionHandler$2.INSTANCE, new ProductFavoriteButtonViewHolder$actionHandler$3(this)).buildHandler();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void processLongClick(FavoriteProductMolecule model, View view) {
        AtomActionDTO addToListAction;
        AtomAction atomAction;
        r a11 = this.references.getContainer().a();
        String miniAppName = a11 != null ? MiniAppExtKt.getMiniAppName(a11) : null;
        if (Intrinsics.d(miniAppName, "supermarket") || Intrinsics.d(miniAppName, "apparel") || Intrinsics.d(miniAppName, "travel") || this.appType == AppType.SELECT || (addToListAction = model.getAddToListAction()) == null || (atomAction = AtomActionMapperKt.toAtomAction(addToListAction, null)) == null) {
            return;
        }
        processRegularButtonAction(model, view, new ProductFavoriteButtonViewHolder$processLongClick$1(this, atomAction));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void processRegularButtonAction(final FavoriteProductMolecule model, View view, final Function1<? super FavoriteProductMolecule, Unit> actionCallback) {
        Map<String, String> params;
        String str;
        AtomActionDTO action = model.getFavoriteButton().getAction();
        boolean parseBoolean = (action == null || (params = action.getParams()) == null || (str = params.get(FavoriteProductMolecule.IS_ADULT_PARAMS_NAME)) == null) ? false : Boolean.parseBoolean(str);
        AdultHandler adultHandler = this.adultHandler;
        Context context = view.getContext();
        Intrinsics.g(context, "null cannot be cast to non-null type androidx.fragment.app.FragmentActivity");
        G supportFragmentManager = ((r) context).getSupportFragmentManager();
        Intrinsics.checkNotNullExpressionValue(supportFragmentManager, "getSupportFragmentManager(...)");
        AdultHandler.DefaultImpls.showAdultDialog$default(adultHandler, parseBoolean, supportFragmentManager, new AdultListener() { // from class: ru.ozon.app.android.favorites.ui.favoritebutton.favoriteproduct.ui.buttonview.ProductFavoriteButtonViewHolder$processRegularButtonAction$1
            @Override // ru.ozon.app.android.account.adult.ui.AdultListener
            public void onAdultAccept() {
                Function1<FavoriteProductMolecule, Unit> function1 = actionCallback;
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

    public static /* synthetic */ void rebindData$default(ProductFavoriteButtonViewHolder productFavoriteButtonViewHolder, FavoriteProductMolecule favoriteProductMolecule, boolean z11, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            z11 = false;
        }
        productFavoriteButtonViewHolder.rebindData(favoriteProductMolecule, z11);
    }

    private final void setCurrentButtonView(FavoriteButton buttonView) {
        buttonView.setOnLongButtonClick(new ProductFavoriteButtonViewHolder$setCurrentButtonView$1$1(this));
        buttonView.setOnButtonChanged(new ProductFavoriteButtonViewHolder$setCurrentButtonView$1$2(this));
        this.currentButtonView = new WeakReference<>(buttonView);
    }

    public final void attachButton(@NotNull ProductFavoriteMoleculeButtonView buttonView) {
        Intrinsics.checkNotNullParameter(buttonView, "buttonView");
        setCurrentButtonView(buttonView);
    }

    public final void bindButton(@NotNull FavoriteButton buttonView, FavoriteProductMolecule molecule, l viewItem) {
        FavoriteButton favoriteButton;
        Intrinsics.checkNotNullParameter(buttonView, "buttonView");
        setCurrentButtonView(buttonView);
        this.currentViewItem = viewItem;
        WeakReference<FavoriteButton> weakReference = this.currentButtonView;
        if (weakReference == null || (favoriteButton = weakReference.get()) == null) {
            return;
        }
        favoriteButton.bindFavoriteOrGone(molecule);
    }

    public final void changeButton(@NotNull FavoriteProductMolecule model) {
        FavoriteButton favoriteButton;
        Intrinsics.checkNotNullParameter(model, "model");
        WeakReference<FavoriteButton> weakReference = this.currentButtonView;
        if (weakReference != null && (favoriteButton = weakReference.get()) != null) {
            favoriteButton.revertAndRebindViewState();
        }
        Function1<? super FavoriteProductMolecule, Unit> function1 = this.onButtonChanged;
        if (function1 != null) {
            function1.invoke(model);
        }
    }

    public final void detachButton() {
        this.currentButtonView = null;
    }

    public final void rebindData(FavoriteProductMolecule molecule, boolean needShake) {
        FavoriteButton favoriteButton;
        WeakReference<FavoriteButton> weakReference;
        FavoriteButton favoriteButton2;
        if (needShake && (weakReference = this.currentButtonView) != null && (favoriteButton2 = weakReference.get()) != null) {
            favoriteButton2.shake();
        }
        WeakReference<FavoriteButton> weakReference2 = this.currentButtonView;
        if (weakReference2 == null || (favoriteButton = weakReference2.get()) == null) {
            return;
        }
        favoriteButton.bindFavoriteOrGone(molecule);
    }

    public final void setOnButtonChanged(Function1<? super FavoriteProductMolecule, Unit> function1) {
        this.onButtonChanged = function1;
    }
}
