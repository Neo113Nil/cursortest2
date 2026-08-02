package ru.ozon.app.android.sellerproducts.sellerProducts.binders;

import Sc.InterfaceC4008j;
import Vg.c;
import android.view.ViewGroup;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import l20.d;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.action.ActionHandler;
import ru.ozon.app.android.cart.ui.CartAtomBinder;
import ru.ozon.app.android.composer.ComposerReferences;
import ru.ozon.app.android.sellerproducts.sellerProducts.data.model.ProductVO;
import ru.ozon.app.android.ugc.core.widgets.reviewGalleryV2.data.ReviewGalleryV2DTO;
import ru.ozon.app.android.utils.LazyUtilsKt;
import ru.ozon.composer.ui.widget.k;
import ru.ozon.uni.android.controls.buttonV3.ButtonV3View;
import ru.ozon.uni.android.uikit.extensions.view.ViewExtKt;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.data.AtomDTO;
import ru.ozon.uni.atoms.data.button.ButtonV3Atom;
import ru.ozon.uni.atoms.data.controls.button.ButtonV3DTO;
import ru.ozon.uni.atoms.v3.containers.SingleAtom;
import ru.ozon.uni.atoms.v3.holders.controls.buttonV3.ButtonV3HolderKt;

@Metadata(d1 = {"\u0000n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\f\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\f\u0010\rJ9\u0010\u0017\u001a\u00020\b2\n\u0010\u000f\u001a\u0006\u0012\u0002\b\u00030\u000e2\u0006\u0010\u0011\u001a\u00020\u00102\n\u0010\u0014\u001a\u00060\u0012j\u0002`\u00132\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015H\u0016¢\u0006\u0004\b\u0017\u0010\u0018J+\u0010\u001e\u001a\u00020\b2\u0006\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u001c\u001a\u00020\u001b2\n\u0010\u001d\u001a\u0006\u0012\u0002\b\u00030\u000eH\u0016¢\u0006\u0004\b\u001e\u0010\u001fJ\u001b\u0010 \u001a\u00020\b2\n\u0010\u001d\u001a\u0006\u0012\u0002\b\u00030\u000eH\u0016¢\u0006\u0004\b \u0010!J\u000f\u0010\"\u001a\u00020\bH\u0016¢\u0006\u0004\b\"\u0010#R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010$R\u001b\u0010*\u001a\u00020%8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b&\u0010'\u001a\u0004\b(\u0010)R\u001b\u0010/\u001a\u00020+8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b,\u0010'\u001a\u0004\b-\u0010.R\"\u00102\u001a\u000e\u0012\u0004\u0012\u000201\u0012\u0004\u0012\u00020\b008\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b2\u00103¨\u00064"}, d2 = {"Lru/ozon/app/android/sellerproducts/sellerProducts/binders/ProductButtonBinder;", "Lru/ozon/app/android/sellerproducts/sellerProducts/binders/ProductPropertyBinder;", "Lru/ozon/app/android/cart/ui/CartAtomBinder;", "cartAtomBinder", "<init>", "(Lru/ozon/app/android/cart/ui/CartAtomBinder;)V", "Lru/ozon/uni/atoms/data/AtomDTO;", "button", "", "bindButton", "(Lru/ozon/uni/atoms/data/AtomDTO;)V", "Lru/ozon/uni/atoms/data/controls/button/ButtonV3DTO;", "bindButtonV3", "(Lru/ozon/uni/atoms/data/controls/button/ButtonV3DTO;)V", "Lru/ozon/composer/ui/widget/k;", "widgetViewHolder", "Lru/ozon/app/android/composer/ComposerReferences;", "composerReferences", "LVg/c;", "Lru/ozon/app/android/action/custom/CustomActionHandlersStore;", "customActionHandlersStore", "Landroid/view/ViewGroup;", "itemView", "init", "(Lru/ozon/composer/ui/widget/k;Lru/ozon/app/android/composer/ComposerReferences;LVg/c;Landroid/view/ViewGroup;)V", "Lru/ozon/app/android/sellerproducts/sellerProducts/data/model/ProductVO;", ReviewGalleryV2DTO.ReviewGalleryV2Item.ItemsContainerDTO.PRODUCT_FIELD_NAME, "Ll20/d;", "info", "holder", "bind", "(Lru/ozon/app/android/sellerproducts/sellerProducts/data/model/ProductVO;Ll20/d;Lru/ozon/composer/ui/widget/k;)V", "attach", "(Lru/ozon/composer/ui/widget/k;)V", "detach", "()V", "Lru/ozon/app/android/cart/ui/CartAtomBinder;", "Lru/ozon/uni/atoms/v3/containers/SingleAtom;", "productSa$delegate", "LSc/j;", "getProductSa", "()Lru/ozon/uni/atoms/v3/containers/SingleAtom;", "productSa", "Lru/ozon/uni/android/controls/buttonV3/ButtonV3View;", "buttonV3$delegate", "getButtonV3", "()Lru/ozon/uni/android/controls/buttonV3/ButtonV3View;", "buttonV3", "Lkotlin/Function1;", "Lru/ozon/uni/atoms/af/AtomAction;", "actionHandler", "Lkotlin/jvm/functions/Function1;", "sellerproducts_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class ProductButtonBinder extends ProductPropertyBinder {
    private Function1<? super AtomAction, Unit> actionHandler;

    /* renamed from: buttonV3$delegate, reason: from kotlin metadata */
    @NotNull
    private final InterfaceC4008j buttonV3;

    @NotNull
    private final CartAtomBinder cartAtomBinder;

    /* renamed from: productSa$delegate, reason: from kotlin metadata */
    @NotNull
    private final InterfaceC4008j productSa;

    public ProductButtonBinder(@NotNull CartAtomBinder cartAtomBinder) {
        Intrinsics.checkNotNullParameter(cartAtomBinder, "cartAtomBinder");
        this.cartAtomBinder = cartAtomBinder;
        this.productSa = LazyUtilsKt.unsafeLazy(new ProductButtonBinder$productSa$2(this));
        this.buttonV3 = LazyUtilsKt.unsafeLazy(new ProductButtonBinder$buttonV3$2(this));
    }

    private final void bindButton(AtomDTO button) {
        if (button instanceof ButtonV3Atom.AddToCartAtom) {
            CartAtomBinder cartAtomBinder = this.cartAtomBinder;
            SingleAtom productSa = getProductSa();
            Function1<? super AtomAction, Unit> function1 = this.actionHandler;
            if (function1 == null) {
                Intrinsics.n("actionHandler");
                throw null;
            }
            cartAtomBinder.bind(productSa, button, function1, getComposerReferences().getTokenizedAnalytics(), Long.valueOf(getProduct().getId()));
            this.cartAtomBinder.bindAdult(getProduct().getShouldBlur());
            return;
        }
        SingleAtom.bind$default(getProductSa(), button, false, 2, null);
        SingleAtom productSa2 = getProductSa();
        Function1<? super AtomAction, Unit> function12 = this.actionHandler;
        if (function12 == null) {
            Intrinsics.n("actionHandler");
            throw null;
        }
        productSa2.setOnAction(function12);
        this.cartAtomBinder.clear();
    }

    private final void bindButtonV3(ButtonV3DTO button) {
        ButtonV3View buttonV3 = getButtonV3();
        Function1<? super AtomAction, Unit> function1 = this.actionHandler;
        if (function1 != null) {
            ButtonV3HolderKt.bind(buttonV3, button, function1);
        } else {
            Intrinsics.n("actionHandler");
            throw null;
        }
    }

    private final ButtonV3View getButtonV3() {
        return (ButtonV3View) this.buttonV3.getValue();
    }

    private final SingleAtom getProductSa() {
        return (SingleAtom) this.productSa.getValue();
    }

    @Override // ru.ozon.app.android.sellerproducts.sellerProducts.binders.ProductPropertyBinder
    public void attach(@NotNull k<?> holder) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        super.attach(holder);
        this.cartAtomBinder.init(getProductSa(), getComposerReferences().getTokenizedAnalytics());
        this.cartAtomBinder.setAdultDialogCommitListener(getOnAdultDialogCompleted());
    }

    @Override // ru.ozon.app.android.sellerproducts.sellerProducts.binders.ProductPropertyBinder
    public void bind(@NotNull ProductVO product, @NotNull d info, @NotNull k<?> holder) {
        Intrinsics.checkNotNullParameter(product, "product");
        Intrinsics.checkNotNullParameter(info, "info");
        Intrinsics.checkNotNullParameter(holder, "holder");
        super.bind(product, info, holder);
        ViewExtKt.showOrGoneByPresence(getProductSa(), product.getButton());
        ViewExtKt.showOrGoneByPresence(getButtonV3(), product.getButtonV3());
        ButtonV3DTO buttonV3 = product.getButtonV3();
        if (buttonV3 != null) {
            bindButtonV3(buttonV3);
            return;
        }
        AtomDTO button = product.getButton();
        if (button != null) {
            bindButton(button);
        }
    }

    @Override // ru.ozon.app.android.sellerproducts.sellerProducts.binders.ProductPropertyBinder
    public void detach() {
        super.detach();
        this.cartAtomBinder.unbind();
        this.cartAtomBinder.setAdultDialogCommitListener(null);
    }

    @Override // ru.ozon.app.android.sellerproducts.sellerProducts.binders.ProductPropertyBinder
    public void init(@NotNull k<?> widgetViewHolder, @NotNull ComposerReferences composerReferences, @NotNull c customActionHandlersStore, ViewGroup itemView) {
        Intrinsics.checkNotNullParameter(widgetViewHolder, "widgetViewHolder");
        Intrinsics.checkNotNullParameter(composerReferences, "composerReferences");
        Intrinsics.checkNotNullParameter(customActionHandlersStore, "customActionHandlersStore");
        super.init(widgetViewHolder, composerReferences, customActionHandlersStore, itemView);
        this.actionHandler = new ActionHandler.Builder(composerReferences, widgetViewHolder).customActionHandlers(new ProductButtonBinder$init$1(customActionHandlersStore)).buildHandler();
        SingleAtom productSa = getProductSa();
        Function1<? super AtomAction, Unit> function1 = this.actionHandler;
        if (function1 != null) {
            productSa.setOnAction(function1);
        } else {
            Intrinsics.n("actionHandler");
            throw null;
        }
    }
}
