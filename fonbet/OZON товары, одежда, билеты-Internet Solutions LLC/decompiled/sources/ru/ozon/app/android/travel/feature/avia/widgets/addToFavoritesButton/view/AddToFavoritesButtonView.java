package ru.ozon.app.android.travel.feature.avia.widgets.addToFavoritesButton.view;

import Am.C2438a;
import android.content.Context;
import android.widget.FrameLayout;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.N;
import kotlin.reflect.m;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.favorites.domain.model.FavoriteProductModel;
import ru.ozon.app.android.favorites.ui.favoriteMoleculeV4.view.ProductFavoriteMoleculeV4ButtonView;
import ru.ozon.app.android.travel.feature.avia.widgets.addToFavoritesButton.presentation.AddToFavoritesButtonVI;
import ru.ozon.app.android.travel.utils.delegate.PreCreationViewPoolDelegate;
import ru.ozon.uni.android.controls.buttonV3.IconButtonV3View;
import ru.ozon.uni.android.uikit.extensions.view.ViewExtKt;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.v3.holders.controls.buttonV3.IconButtonV3HolderKt;

@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0001\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J>\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u00112\u0012\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u000f0\u00132\u0018\u0010\u0015\u001a\u0014\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u0017\u0012\u0004\u0012\u00020\u000f0\u0016J\u0006\u0010\u0018\u001a\u00020\u0007R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u001b\u0010\b\u001a\u00020\t8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\n\u0010\u000b¨\u0006\u0019"}, d2 = {"Lru/ozon/app/android/travel/feature/avia/widgets/addToFavoritesButton/view/AddToFavoritesButtonView;", "Landroid/widget/FrameLayout;", "context", "Landroid/content/Context;", "<init>", "(Landroid/content/Context;)V", "favoriteButtonView", "Lru/ozon/app/android/favorites/ui/favoriteMoleculeV4/view/ProductFavoriteMoleculeV4ButtonView;", "iconButtonView", "Lru/ozon/uni/android/controls/buttonV3/IconButtonV3View;", "getIconButtonView", "()Lru/ozon/uni/android/controls/buttonV3/IconButtonV3View;", "iconButtonView$delegate", "Lru/ozon/app/android/travel/utils/delegate/PreCreationViewPoolDelegate;", "bind", "", "item", "Lru/ozon/app/android/travel/feature/avia/widgets/addToFavoritesButton/presentation/AddToFavoritesButtonVI$ButtonType;", "onAction", "Lkotlin/Function1;", "Lru/ozon/uni/atoms/af/AtomAction;", "onFavoriteButtonBind", "Lkotlin/Function2;", "Lru/ozon/app/android/favorites/domain/model/FavoriteProductModel;", "getFavoriteButtonView", "avia_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class AddToFavoritesButtonView extends FrameLayout {
    static final /* synthetic */ m<Object>[] $$delegatedProperties = {C2438a.c(AddToFavoritesButtonView.class, "iconButtonView", "getIconButtonView()Lru/ozon/uni/android/controls/buttonV3/IconButtonV3View;", 0)};
    public static final int $stable = (IconButtonV3View.$stable | PreCreationViewPoolDelegate.$stable) | ProductFavoriteMoleculeV4ButtonView.$stable;

    @NotNull
    private final ProductFavoriteMoleculeV4ButtonView favoriteButtonView;

    /* renamed from: iconButtonView$delegate, reason: from kotlin metadata */
    @NotNull
    private final PreCreationViewPoolDelegate iconButtonView;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AddToFavoritesButtonView(@NotNull Context context) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
        ProductFavoriteMoleculeV4ButtonView productFavoriteMoleculeV4ButtonView = new ProductFavoriteMoleculeV4ButtonView(context, null, 0, 6, null);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2);
        layoutParams.gravity = 17;
        productFavoriteMoleculeV4ButtonView.setLayoutParams(layoutParams);
        this.favoriteButtonView = productFavoriteMoleculeV4ButtonView;
        Context context2 = getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
        this.iconButtonView = new PreCreationViewPoolDelegate(context2, N.b(IconButtonV3View.class), new AddToFavoritesButtonView$special$$inlined$preCreationViewPool$default$1(this), new AddToFavoritesButtonView$special$$inlined$preCreationViewPool$default$2());
        addView(productFavoriteMoleculeV4ButtonView);
        addView(getIconButtonView());
    }

    private final IconButtonV3View getIconButtonView() {
        return (IconButtonV3View) this.iconButtonView.getValue(this, $$delegatedProperties[0]);
    }

    public final void bind(AddToFavoritesButtonVI.ButtonType item, @NotNull Function1<? super AtomAction, Unit> onAction, @NotNull Function2<? super ProductFavoriteMoleculeV4ButtonView, ? super FavoriteProductModel, Unit> onFavoriteButtonBind) {
        Intrinsics.checkNotNullParameter(onAction, "onAction");
        Intrinsics.checkNotNullParameter(onFavoriteButtonBind, "onFavoriteButtonBind");
        if (item instanceof AddToFavoritesButtonVI.ButtonType.FavoriteButton) {
            ViewExtKt.show(this.favoriteButtonView);
            onFavoriteButtonBind.invoke(this.favoriteButtonView, ((AddToFavoritesButtonVI.ButtonType.FavoriteButton) item).getFavoriteButton());
            ViewExtKt.gone(getIconButtonView());
        } else if (item instanceof AddToFavoritesButtonVI.ButtonType.IconButton) {
            IconButtonV3HolderKt.bind(getIconButtonView(), ((AddToFavoritesButtonVI.ButtonType.IconButton) item).getIconButton(), onAction);
            ViewExtKt.gone(this.favoriteButtonView);
        } else {
            ViewExtKt.gone(getIconButtonView());
            ViewExtKt.gone(this.favoriteButtonView);
        }
    }

    @NotNull
    public final ProductFavoriteMoleculeV4ButtonView getFavoriteButtonView() {
        return this.favoriteButtonView;
    }
}
