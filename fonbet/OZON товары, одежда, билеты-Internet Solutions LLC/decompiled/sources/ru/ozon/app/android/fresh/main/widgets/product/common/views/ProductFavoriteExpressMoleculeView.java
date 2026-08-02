package ru.ozon.app.android.fresh.main.widgets.product.common.views;

import Aw.ViewOnClickListenerC2448a;
import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.animation.AnimationUtils;
import androidx.core.view.Y;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.atoms.v3.holders.buttons.WrappedIconButtonHolderKt;
import ru.ozon.app.android.favorites.data.favoritebutton.favoriteproduct.FavoriteProductMolecule;
import ru.ozon.app.android.favorites.ui.favoritebutton.favoriteproduct.ui.buttonview.FavoriteButton;
import ru.ozon.app.android.fresh.main.databinding.ProductFavoriteExpressButtonBinding;
import ru.ozon.app.android.fresh.main.widgets.product.common.views.ProductFavoriteExpressMoleculeView;
import ru.ozon.app.android.uikit.R$anim;
import ru.ozon.uni.android.uikit.extensions.ResourceExtKt;
import ru.ozon.uni.android.uikit.view.atoms.buttons.icons.SmallIconButtonView;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.data.TestInfo;
import ru.ozon.uni.atoms.data.button.ButtonV3Atom;

@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0002\u0018\u00002\u00020\u0001B'\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\u0012\u0010\u001d\u001a\u00020\u000e2\b\u0010\u001e\u001a\u0004\u0018\u00010\fH\u0016J\b\u0010\u001f\u001a\u00020\u000eH\u0016J\b\u0010 \u001a\u00020\u000eH\u0016J(\u0010!\u001a\u00020\u000e2\b\u0010\u001e\u001a\u0004\u0018\u00010\f2\u0014\u0010\u0017\u001a\u0010\u0012\u0004\u0012\u00020\u0019\u0012\u0004\u0012\u00020\u000e\u0018\u00010\u0018H\u0002J\u0010\u0010\"\u001a\u00020#2\u0006\u0010$\u001a\u00020\rH\u0002R.\u0010\n\u001a\u0016\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u000e\u0018\u00010\u000bX\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R.\u0010\u0013\u001a\u0016\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u000e\u0018\u00010\u000bX\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u0010\"\u0004\b\u0015\u0010\u0012R\u0010\u0010\u0016\u001a\u0004\u0018\u00010\fX\u0082\u000e¢\u0006\u0002\n\u0000R\u001c\u0010\u0017\u001a\u0010\u0012\u0004\u0012\u00020\u0019\u0012\u0004\u0012\u00020\u000e\u0018\u00010\u0018X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u001a\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u001b\u001a\u00020\u001cX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006%"}, d2 = {"Lru/ozon/app/android/fresh/main/widgets/product/common/views/ProductFavoriteExpressMoleculeView;", "Lru/ozon/app/android/favorites/ui/favoritebutton/favoriteproduct/ui/buttonview/FavoriteButton;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "defStyleAttr", "", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "onButtonChanged", "Lkotlin/Function2;", "Lru/ozon/app/android/favorites/data/favoritebutton/favoriteproduct/FavoriteProductMolecule;", "Landroid/view/View;", "", "getOnButtonChanged", "()Lkotlin/jvm/functions/Function2;", "setOnButtonChanged", "(Lkotlin/jvm/functions/Function2;)V", "onLongButtonClick", "getOnLongButtonClick", "setOnLongButtonClick", "currentModel", "actionHandler", "Lkotlin/Function1;", "Lru/ozon/uni/atoms/af/AtomAction;", "iconsPadding", "binding", "Lru/ozon/app/android/fresh/main/databinding/ProductFavoriteExpressButtonBinding;", "bindFavoriteOrGone", "item", "revertAndRebindViewState", "shake", "bindDataOrGone", "onLongClicked", "", "view", "widgets-main_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class ProductFavoriteExpressMoleculeView extends FavoriteButton {
    private Function1<? super AtomAction, Unit> actionHandler;

    @NotNull
    private final ProductFavoriteExpressButtonBinding binding;
    private FavoriteProductMolecule currentModel;
    private final int iconsPadding;
    private Function2<? super FavoriteProductMolecule, ? super View, Unit> onButtonChanged;
    private Function2<? super FavoriteProductMolecule, ? super View, Unit> onLongButtonClick;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ProductFavoriteExpressMoleculeView(@NotNull Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void _init_$lambda$0(ProductFavoriteExpressMoleculeView productFavoriteExpressMoleculeView, View view) {
        productFavoriteExpressMoleculeView.binding.favIcon.callOnClick();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean _init_$lambda$1(ProductFavoriteExpressMoleculeView productFavoriteExpressMoleculeView, View view) {
        Intrinsics.f(view);
        return productFavoriteExpressMoleculeView.onLongClicked(view);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean _init_$lambda$2(ProductFavoriteExpressMoleculeView productFavoriteExpressMoleculeView, View view) {
        Intrinsics.f(view);
        return productFavoriteExpressMoleculeView.onLongClicked(view);
    }

    private final void bindDataOrGone(FavoriteProductMolecule item, Function1<? super AtomAction, Unit> actionHandler) {
        TestInfo testInfo;
        SmallIconButtonView smallIconButtonView = this.binding.favIcon;
        String str = null;
        ButtonV3Atom.SmallIconButton button = item != null ? ProductFavoriteExpressMoleculeViewKt.getButton(item) : null;
        Intrinsics.f(smallIconButtonView);
        WrappedIconButtonHolderKt.bindOrGone(smallIconButtonView, button, actionHandler);
        if (button != null && (testInfo = button.getTestInfo()) != null) {
            str = testInfo.getAutomatizationId();
        }
        smallIconButtonView.setContentDescription(str);
    }

    private final boolean onLongClicked(View view) {
        FavoriteProductMolecule favoriteProductMolecule = this.currentModel;
        if (favoriteProductMolecule == null) {
            return false;
        }
        Function2<FavoriteProductMolecule, View, Unit> onLongButtonClick = getOnLongButtonClick();
        if (onLongButtonClick == null) {
            return true;
        }
        onLongButtonClick.invoke(favoriteProductMolecule, view);
        return true;
    }

    @Override // ru.ozon.app.android.favorites.ui.favoritebutton.favoriteproduct.ui.buttonview.FavoriteButton
    public void bindFavoriteOrGone(FavoriteProductMolecule item) {
        this.currentModel = item;
        ProductFavoriteExpressMoleculeView$bindFavoriteOrGone$1 productFavoriteExpressMoleculeView$bindFavoriteOrGone$1 = new ProductFavoriteExpressMoleculeView$bindFavoriteOrGone$1(this);
        this.actionHandler = productFavoriteExpressMoleculeView$bindFavoriteOrGone$1;
        bindDataOrGone(item, productFavoriteExpressMoleculeView$bindFavoriteOrGone$1);
    }

    public Function2<FavoriteProductMolecule, View, Unit> getOnButtonChanged() {
        return this.onButtonChanged;
    }

    public Function2<FavoriteProductMolecule, View, Unit> getOnLongButtonClick() {
        return this.onLongButtonClick;
    }

    @Override // ru.ozon.app.android.favorites.ui.favoritebutton.favoriteproduct.ui.buttonview.FavoriteButton
    public void revertAndRebindViewState() {
        FavoriteProductMolecule favoriteProductMolecule;
        FavoriteProductMolecule favoriteProductMolecule2 = this.currentModel;
        if (favoriteProductMolecule2 != null) {
            favoriteProductMolecule = FavoriteProductMolecule.copy$default(favoriteProductMolecule2, null, 0L, !favoriteProductMolecule2.isFavorite(), null, null, null, null, 123, null);
            bindDataOrGone(favoriteProductMolecule, this.actionHandler);
        } else {
            favoriteProductMolecule = null;
        }
        this.currentModel = favoriteProductMolecule;
    }

    @Override // ru.ozon.app.android.favorites.ui.favoritebutton.favoriteproduct.ui.buttonview.FavoriteButton
    public void setOnButtonChanged(Function2<? super FavoriteProductMolecule, ? super View, Unit> function2) {
        this.onButtonChanged = function2;
    }

    @Override // ru.ozon.app.android.favorites.ui.favoritebutton.favoriteproduct.ui.buttonview.FavoriteButton
    public void setOnLongButtonClick(Function2<? super FavoriteProductMolecule, ? super View, Unit> function2) {
        this.onLongButtonClick = function2;
    }

    @Override // ru.ozon.app.android.favorites.ui.favoritebutton.favoriteproduct.ui.buttonview.FavoriteButton
    public void shake() {
        this.binding.favIcon.startAnimation(AnimationUtils.loadAnimation(getContext(), R$anim.shake));
    }

    public /* synthetic */ ProductFavoriteExpressMoleculeView(Context context, AttributeSet attributeSet, int i11, int i12, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i12 & 2) != 0 ? null : attributeSet, (i12 & 4) != 0 ? 0 : i11);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ProductFavoriteExpressMoleculeView(@NotNull Context context, AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11, false, 8, null);
        Intrinsics.checkNotNullParameter(context, "context");
        this.iconsPadding = ResourceExtKt.toPx(4);
        ProductFavoriteExpressButtonBinding inflate = ProductFavoriteExpressButtonBinding.inflate(LayoutInflater.from(context), this);
        this.binding = inflate;
        setOnClickListener(new ViewOnClickListenerC2448a(this, 0));
        setOnLongClickListener(new View.OnLongClickListener() { // from class: Aw.b
            @Override // android.view.View.OnLongClickListener
            public final boolean onLongClick(View view) {
                boolean _init_$lambda$1;
                _init_$lambda$1 = ProductFavoriteExpressMoleculeView._init_$lambda$1(ProductFavoriteExpressMoleculeView.this, view);
                return _init_$lambda$1;
            }
        });
        inflate.favIcon.setOnLongClickListener(new View.OnLongClickListener() { // from class: Aw.c
            @Override // android.view.View.OnLongClickListener
            public final boolean onLongClick(View view) {
                boolean _init_$lambda$2;
                _init_$lambda$2 = ProductFavoriteExpressMoleculeView._init_$lambda$2(ProductFavoriteExpressMoleculeView.this, view);
                return _init_$lambda$2;
            }
        });
        int i12 = Y.f42258g;
        if (isLaidOut() && !isLayoutRequested()) {
            SmallIconButtonView favIcon = this.binding.favIcon;
            Intrinsics.checkNotNullExpressionValue(favIcon, "favIcon");
            favIcon.setPadding(this.iconsPadding, this.iconsPadding, this.iconsPadding, this.iconsPadding);
            SmallIconButtonView unFavIcon = this.binding.unFavIcon;
            Intrinsics.checkNotNullExpressionValue(unFavIcon, "unFavIcon");
            unFavIcon.setPadding(this.iconsPadding, this.iconsPadding, this.iconsPadding, this.iconsPadding);
            return;
        }
        addOnLayoutChangeListener(new View.OnLayoutChangeListener() { // from class: ru.ozon.app.android.fresh.main.widgets.product.common.views.ProductFavoriteExpressMoleculeView$special$$inlined$doOnLayout$1
            @Override // android.view.View.OnLayoutChangeListener
            public void onLayoutChange(View view, int left, int top, int right, int bottom, int oldLeft, int oldTop, int oldRight, int oldBottom) {
                Intrinsics.checkNotNullParameter(view, "view");
                view.removeOnLayoutChangeListener(this);
                SmallIconButtonView favIcon2 = ProductFavoriteExpressMoleculeView.this.binding.favIcon;
                Intrinsics.checkNotNullExpressionValue(favIcon2, "favIcon");
                favIcon2.setPadding(ProductFavoriteExpressMoleculeView.this.iconsPadding, ProductFavoriteExpressMoleculeView.this.iconsPadding, ProductFavoriteExpressMoleculeView.this.iconsPadding, ProductFavoriteExpressMoleculeView.this.iconsPadding);
                SmallIconButtonView unFavIcon2 = ProductFavoriteExpressMoleculeView.this.binding.unFavIcon;
                Intrinsics.checkNotNullExpressionValue(unFavIcon2, "unFavIcon");
                unFavIcon2.setPadding(ProductFavoriteExpressMoleculeView.this.iconsPadding, ProductFavoriteExpressMoleculeView.this.iconsPadding, ProductFavoriteExpressMoleculeView.this.iconsPadding, ProductFavoriteExpressMoleculeView.this.iconsPadding);
            }
        });
    }
}
