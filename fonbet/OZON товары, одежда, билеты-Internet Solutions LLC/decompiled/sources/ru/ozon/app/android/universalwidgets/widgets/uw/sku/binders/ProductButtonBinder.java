package ru.ozon.app.android.universalwidgets.widgets.uw.sku.binders;

import Sc.InterfaceC4008j;
import Sc.k;
import Sc.n;
import Vg.c;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import l20.d;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.action.ActionHandler;
import ru.ozon.app.android.cart.ui.CartAtomBinder;
import ru.ozon.app.android.composer.ComposerReferences;
import ru.ozon.app.android.product.binders.ProductPropertyBinder;
import ru.ozon.app.android.product.common.core.ButtonSizeModel;
import ru.ozon.app.android.product.common.core.OffsetModel;
import ru.ozon.app.android.product.common.product.ProductVO;
import ru.ozon.app.android.ugc.core.widgets.reviewGalleryV2.data.ReviewGalleryV2DTO;
import ru.ozon.uni.android.uikit.extensions.view.ViewExtKt;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.data.AtomDTO;
import ru.ozon.uni.atoms.data.button.ButtonV3Atom;
import ru.ozon.uni.atoms.v3.containers.SingleAtom;

@Metadata(d1 = {"\u0000j\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0011\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J!\u0010\f\u001a\u00020\u000b2\b\u0010\b\u001a\u0004\u0018\u00010\u00072\u0006\u0010\n\u001a\u00020\tH\u0002¢\u0006\u0004\b\f\u0010\rJA\u0010\u0018\u001a\u00020\u000b2\u0012\u0010\u0010\u001a\u000e\u0012\u0002\b\u00030\u000ej\u0006\u0012\u0002\b\u0003`\u000f2\u0006\u0010\u0012\u001a\u00020\u00112\n\u0010\u0015\u001a\u00060\u0013j\u0002`\u00142\b\u0010\u0017\u001a\u0004\u0018\u00010\u0016H\u0016¢\u0006\u0004\b\u0018\u0010\u0019J7\u0010\u001f\u001a\u00020\u000b2\u0006\u0010\u001a\u001a\u00020\u00022\n\u0010\u001d\u001a\u00060\u001bj\u0002`\u001c2\u0012\u0010\u001e\u001a\u000e\u0012\u0002\b\u00030\u000ej\u0006\u0012\u0002\b\u0003`\u000fH\u0016¢\u0006\u0004\b\u001f\u0010 J\u000f\u0010!\u001a\u00020\u000bH\u0016¢\u0006\u0004\b!\u0010\"J#\u0010#\u001a\u00020\u000b2\u0012\u0010\u001e\u001a\u000e\u0012\u0002\b\u00030\u000ej\u0006\u0012\u0002\b\u0003`\u000fH\u0016¢\u0006\u0004\b#\u0010$J\u000f\u0010%\u001a\u00020\u000bH\u0016¢\u0006\u0004\b%\u0010\"R\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010&R\u001b\u0010,\u001a\u00020'8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b(\u0010)\u001a\u0004\b*\u0010+R\"\u0010/\u001a\u000e\u0012\u0004\u0012\u00020.\u0012\u0004\u0012\u00020\u000b0-8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b/\u00100¨\u00061"}, d2 = {"Lru/ozon/app/android/universalwidgets/widgets/uw/sku/binders/ProductButtonBinder;", "Lru/ozon/app/android/product/binders/ProductPropertyBinder;", "Lru/ozon/app/android/product/common/product/ProductVO;", "Lru/ozon/app/android/cart/ui/CartAtomBinder;", "cartAtomBinder", "<init>", "(Lru/ozon/app/android/cart/ui/CartAtomBinder;)V", "Lru/ozon/app/android/product/common/core/OffsetModel;", "offsetModel", "Lru/ozon/app/android/product/common/core/ButtonSizeModel;", "buttonSize", "", "updateLp", "(Lru/ozon/app/android/product/common/core/OffsetModel;Lru/ozon/app/android/product/common/core/ButtonSizeModel;)V", "Lru/ozon/composer/ui/widget/k;", "Lru/ozon/app/android/composer/widgets/base/WidgetViewHolder;", "widgetViewHolder", "Lru/ozon/app/android/composer/ComposerReferences;", "composerReferences", "LVg/c;", "Lru/ozon/app/android/action/custom/CustomActionHandlersStore;", "customActionHandlersStore", "Landroid/view/ViewGroup;", "itemView", "init", "(Lru/ozon/composer/ui/widget/k;Lru/ozon/app/android/composer/ComposerReferences;LVg/c;Landroid/view/ViewGroup;)V", ReviewGalleryV2DTO.ReviewGalleryV2Item.ItemsContainerDTO.PRODUCT_FIELD_NAME, "Ll20/d;", "Lru/ozon/app/android/composer/view/WidgetInfo;", "info", "holder", "bind", "(Lru/ozon/app/android/product/common/product/ProductVO;Ll20/d;Lru/ozon/composer/ui/widget/k;)V", "recycle", "()V", "attach", "(Lru/ozon/composer/ui/widget/k;)V", "detach", "Lru/ozon/app/android/cart/ui/CartAtomBinder;", "Lru/ozon/uni/atoms/v3/containers/SingleAtom;", "productSa$delegate", "LSc/j;", "getProductSa", "()Lru/ozon/uni/atoms/v3/containers/SingleAtom;", "productSa", "Lkotlin/Function1;", "Lru/ozon/uni/atoms/af/AtomAction;", "actionHandler", "Lkotlin/jvm/functions/Function1;", "universalwidgets_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class ProductButtonBinder extends ProductPropertyBinder<ProductVO> {
    private Function1<? super AtomAction, Unit> actionHandler;

    @NotNull
    private final CartAtomBinder cartAtomBinder;

    /* renamed from: productSa$delegate, reason: from kotlin metadata */
    @NotNull
    private final InterfaceC4008j productSa;

    public ProductButtonBinder(@NotNull CartAtomBinder cartAtomBinder) {
        Intrinsics.checkNotNullParameter(cartAtomBinder, "cartAtomBinder");
        this.cartAtomBinder = cartAtomBinder;
        this.productSa = k.a(n.NONE, new ProductButtonBinder$productSa$2(this));
    }

    private final SingleAtom getProductSa() {
        return (SingleAtom) this.productSa.getValue();
    }

    private final void updateLp(OffsetModel offsetModel, ButtonSizeModel buttonSize) {
        int i11;
        boolean isWidth140 = buttonSize.isWidth140();
        SingleAtom productSa = getProductSa();
        ViewGroup.LayoutParams layoutParams = productSa.getLayoutParams();
        if (layoutParams == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
        }
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
        boolean z11 = marginLayoutParams instanceof ConstraintLayout.b;
        int i12 = 0;
        if (z11) {
            if (offsetModel != null && offsetModel.getIsSkuGrid2()) {
                marginLayoutParams.bottomMargin = offsetModel.getBottom();
                ((ConstraintLayout.b) marginLayoutParams).f41662z = offsetModel.getBottom();
            }
            ConstraintLayout.b bVar = (ConstraintLayout.b) marginLayoutParams;
            if (isWidth140) {
                i11 = getProductSa().getPaddingStart() + getProductSa().getPaddingEnd() + buttonSize.getWidthButton();
            } else {
                i11 = 0;
            }
            bVar.f41609P = i11;
        }
        if ((!z11 || !isWidth140) && (!z11 || buttonSize.getWidthButton() != -1)) {
            i12 = buttonSize.getWidthButton();
        }
        marginLayoutParams.width = i12;
        productSa.setLayoutParams(marginLayoutParams);
        getProductSa().setClipChildren(buttonSize.getClip());
        getProductSa().setClipToPadding(buttonSize.getClip());
    }

    @Override // ru.ozon.app.android.product.binders.ProductPropertyBinder
    public void attach(@NotNull ru.ozon.composer.ui.widget.k<?> holder) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        super.attach(holder);
        this.cartAtomBinder.init(getProductSa(), getComposerReferences().getTokenizedAnalytics());
        this.cartAtomBinder.setAdultDialogCommitListener(getOnAdultDialogCompleted());
    }

    @Override // ru.ozon.app.android.product.binders.ProductPropertyBinder
    public /* bridge */ /* synthetic */ void bind(ProductVO productVO, d dVar, ru.ozon.composer.ui.widget.k kVar) {
        bind2(productVO, dVar, (ru.ozon.composer.ui.widget.k<?>) kVar);
    }

    @Override // ru.ozon.app.android.product.binders.ProductPropertyBinder
    public void detach() {
        super.detach();
        this.cartAtomBinder.unbind();
        this.cartAtomBinder.setAdultDialogCommitListener(null);
    }

    @Override // ru.ozon.app.android.product.binders.ProductPropertyBinder
    public void init(@NotNull ru.ozon.composer.ui.widget.k<?> widgetViewHolder, @NotNull ComposerReferences composerReferences, @NotNull c customActionHandlersStore, ViewGroup itemView) {
        Intrinsics.checkNotNullParameter(widgetViewHolder, "widgetViewHolder");
        Intrinsics.checkNotNullParameter(composerReferences, "composerReferences");
        Intrinsics.checkNotNullParameter(customActionHandlersStore, "customActionHandlersStore");
        super.init(widgetViewHolder, composerReferences, customActionHandlersStore, itemView);
        this.actionHandler = new ActionHandler.Builder(composerReferences, widgetViewHolder).customActionHandlers(new ProductButtonBinder$init$1(customActionHandlersStore)).buildHandler();
    }

    @Override // ru.ozon.app.android.product.binders.ProductPropertyBinder
    public void recycle() {
        super.recycle();
        getProductSa().onRecycle();
    }

    /* renamed from: bind, reason: avoid collision after fix types in other method */
    public void bind2(@NotNull ProductVO product, @NotNull d info, @NotNull ru.ozon.composer.ui.widget.k<?> holder) {
        Intrinsics.checkNotNullParameter(product, "product");
        Intrinsics.checkNotNullParameter(info, "info");
        Intrinsics.checkNotNullParameter(holder, "holder");
        super.bind((ProductButtonBinder) product, info, holder);
        SingleAtom productSa = getProductSa();
        Function1<? super AtomAction, Unit> function1 = this.actionHandler;
        if (function1 == null) {
            Intrinsics.n("actionHandler");
            throw null;
        }
        productSa.setOnAction(function1);
        ViewExtKt.showOrGoneByPresence(getProductSa(), product.getButton());
        AtomDTO button = product.getButton();
        if (button != null) {
            if (button instanceof ButtonV3Atom.AddToCartAtom) {
                CartAtomBinder cartAtomBinder = this.cartAtomBinder;
                SingleAtom productSa2 = getProductSa();
                Function1<? super AtomAction, Unit> function12 = this.actionHandler;
                if (function12 == null) {
                    Intrinsics.n("actionHandler");
                    throw null;
                }
                cartAtomBinder.bind(productSa2, button, function12, getComposerReferences().getTokenizedAnalytics(), Long.valueOf(product.getId()));
                this.cartAtomBinder.bindAdult(product.getShouldBlur());
            } else {
                SingleAtom.bind$default(getProductSa(), button, false, 2, null);
                SingleAtom productSa3 = getProductSa();
                Function1<? super AtomAction, Unit> function13 = this.actionHandler;
                if (function13 == null) {
                    Intrinsics.n("actionHandler");
                    throw null;
                }
                productSa3.setOnAction(function13);
                this.cartAtomBinder.clear();
            }
            updateLp(product.getOffsetModel(), product.getButtonSizeModel());
        }
    }
}
