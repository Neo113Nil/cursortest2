package ru.ozon.app.android.cart.cartSplitV2.v2.subwidgets.presentation.product;

import A00.a;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import j10.h;
import java.util.List;
import k20.C7473e;
import k20.C7475g;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.C7714v;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.N;
import l20.d;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.cart.UtilsKt;
import ru.ozon.app.android.cart.cartSplitV2.v2.data.CartSplitV2ProductDTOV2;
import ru.ozon.app.android.cart.cartSplitV2.v2.data.SeparatorConfig;
import ru.ozon.app.android.cart.cartSplitV2.v2.subwidgets.presentation.CheckboxVO;
import ru.ozon.app.android.cart.cartSplitV2.v2.subwidgets.presentation.decoration.CartSplitV2SeparatorDecoration;
import ru.ozon.app.android.cart.cartSplitV2.v2.subwidgets.presentation.product.productView.ProductV2View;
import ru.ozon.app.android.cart.cartSplitV2.v2.util.extensions.CartExtensionsKt;
import ru.ozon.app.android.cart.cartSplitV2.v2.util.swipeToDelete.view.SwipeableWrapperViewV2;
import ru.ozon.app.android.cart.controls.v3.presentation.ControlsV3VO;
import ru.ozon.app.android.cart.controls.v3.presentation.UpdateControl;
import ru.ozon.app.android.cart.feature.R$id;
import ru.ozon.app.android.composer.ComposerReferences;
import ru.ozon.app.android.composer.view.ComposerViewExtensionKt;
import ru.ozon.app.android.composer.widgets.base.WidgetViewHolderKt;
import ru.ozon.app.android.composer.widgets.v2.WidgetViewMapper2;
import ru.ozon.composer.ui.widget.k;
import ru.ozon.composer.ui.widget.l;
import ru.ozon.uni.R$color;
import ru.ozon.uni.android.uikit.extensions.ResourceExtKt;
import ru.ozon.uni.atoms.data.selectionControls.checkbox.CheckBoxDTO;

@Metadata(d1 = {"\u0000®\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u0000 E2\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001:\u0001EB\t\b\u0007¢\u0006\u0004\b\u0005\u0010\u0006J!\u0010\n\u001a\u0004\u0018\u00010\u00042\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u0019\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011H\u0016¢\u0006\u0004\b\u0014\u0010\u0015J=\u0010 \u001a\u00020\u001f2\u0006\u0010\u0016\u001a\u00020\f2\n\u0010\u0019\u001a\u00060\u0017j\u0002`\u00182\u0006\u0010\u001b\u001a\u00020\u001a2\u0010\u0010\u001e\u001a\f\u0012\u0004\u0012\u00020\u00170\u001cj\u0002`\u001dH\u0016¢\u0006\u0004\b \u0010!J\u001d\u0010&\u001a\b\u0012\u0004\u0012\u00020%0$2\u0006\u0010#\u001a\u00020\"H\u0016¢\u0006\u0004\b&\u0010'J\u001f\u0010)\u001a\u00020\u00112\u0006\u0010\t\u001a\u00020\u00042\u0006\u0010(\u001a\u00020\u0004H\u0016¢\u0006\u0004\b)\u0010*J+\u00100\u001a\u0012\u0012\u0004\u0012\u00020\u00020.j\b\u0012\u0004\u0012\u00020\u0002`/2\n\u0010-\u001a\u00060+j\u0002`,H\u0016¢\u0006\u0004\b0\u00101R(\u00103\u001a\u0010\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020\u0007020$8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b3\u00104\u001a\u0004\b5\u00106R<\u0010:\u001a$\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u001a\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u00020\u000408j\b\u0012\u0004\u0012\u00020\u0004`9078\u0016X\u0096\u0004¢\u0006\f\n\u0004\b:\u0010;\u001a\u0004\b<\u0010=R\u0016\u0010A\u001a\u0004\u0018\u00010>8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b?\u0010@R,\u0010D\u001a\u001a\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020B\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040$078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bC\u0010=¨\u0006F"}, d2 = {"Lru/ozon/app/android/cart/cartSplitV2/v2/subwidgets/presentation/product/CartSplitV2ProductViewMapper;", "Lru/ozon/app/android/composer/widgets/v2/WidgetViewMapper2;", "Lru/ozon/app/android/cart/cartSplitV2/v2/subwidgets/presentation/product/CartSplitV2ProductWidgetComponent;", "Lru/ozon/app/android/cart/cartSplitV2/v2/data/CartSplitV2ProductDTOV2;", "Lru/ozon/app/android/cart/cartSplitV2/v2/subwidgets/presentation/product/CartSplitV2ProductVO;", "<init>", "()V", "LA00/a$J$a;", "update", "oldItem", "handleUpdate", "(LA00/a$J$a;Lru/ozon/app/android/cart/cartSplitV2/v2/subwidgets/presentation/product/CartSplitV2ProductVO;)Lru/ozon/app/android/cart/cartSplitV2/v2/subwidgets/presentation/product/CartSplitV2ProductVO;", "Landroid/view/ViewGroup;", "parent", "Landroid/view/View;", "createView", "(Landroid/view/ViewGroup;)Landroid/view/View;", "", "state", "", "canMap", "(Ljava/lang/Object;)Z", "composerRootView", "Lru/ozon/composer/ui/widget/l;", "Lru/ozon/app/android/composer/view/ComposerViewObject;", "viewObject", "Lru/ozon/app/android/composer/ComposerReferences;", "references", "Lj10/h;", "Lru/ozon/app/android/composer/viewmodel/ComposerVoHelper;", "voHelper", "", "constructLayout", "(Landroid/view/ViewGroup;Lru/ozon/composer/ui/widget/l;Lru/ozon/app/android/composer/ComposerReferences;Lj10/h;)V", "Landroid/content/Context;", "context", "", "Landroidx/recyclerview/widget/RecyclerView$n;", "getDecorators", "(Landroid/content/Context;)Ljava/util/List;", "newItem", "getPayload", "(Lru/ozon/app/android/cart/cartSplitV2/v2/subwidgets/presentation/product/CartSplitV2ProductVO;Lru/ozon/app/android/cart/cartSplitV2/v2/subwidgets/presentation/product/CartSplitV2ProductVO;)Ljava/lang/Object;", "Lk20/g;", "Lru/ozon/app/android/composer/widgets/v2/di/ComposerWidgetComponentStorage;", "storage", "Lk20/e;", "Lru/ozon/app/android/composer/widgets/v2/di/WidgetComponent;", "widgetComponent", "(Lk20/g;)Lk20/e;", "Ljava/lang/Class;", "supportedUpdates", "Ljava/util/List;", "getSupportedUpdates", "()Ljava/util/List;", "Lkotlin/Function2;", "Lru/ozon/composer/ui/widget/k;", "Lru/ozon/app/android/composer/widgets/base/WidgetViewHolder;", "holderProducer", "Lkotlin/jvm/functions/Function2;", "getHolderProducer", "()Lkotlin/jvm/functions/Function2;", "Lru/ozon/app/android/cart/cartSplitV2/v2/data/SeparatorConfig;", "getItemSeparatorConfig", "()Lru/ozon/app/android/cart/cartSplitV2/v2/data/SeparatorConfig;", "itemSeparatorConfig", "Ll20/d;", "getMapper", "mapper", "Companion", "cart_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class CartSplitV2ProductViewMapper extends WidgetViewMapper2<CartSplitV2ProductWidgetComponent, CartSplitV2ProductDTOV2, CartSplitV2ProductVO> {

    @NotNull
    private static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    private static final int DP_16 = ResourceExtKt.toPx(16);

    @NotNull
    private final List<Class<? extends a.J.InterfaceC0007a>> supportedUpdates = C7714v.b0(ProductUpdateKey.class, UpdateControl.class);

    @NotNull
    private final Function2<View, ComposerReferences, k<CartSplitV2ProductVO>> holderProducer = new CartSplitV2ProductViewMapper$holderProducer$1(this);

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lru/ozon/app/android/cart/cartSplitV2/v2/subwidgets/presentation/product/CartSplitV2ProductViewMapper$Companion;", "", "<init>", "()V", "cart_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    private static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    private final SeparatorConfig getItemSeparatorConfig() {
        return component().getMapper().getItemSeparatorConfig();
    }

    @Override // ru.ozon.composer.ui.widget.g, m20.InterfaceC8046a
    public boolean canMap(Object state) {
        return state instanceof CartSplitV2ProductDTOV2;
    }

    @Override // ru.ozon.app.android.composer.widgets.base.WidgetViewMapper
    public void constructLayout(@NotNull ViewGroup composerRootView, @NotNull l viewObject, @NotNull ComposerReferences references, @NotNull h<l> voHelper) {
        Intrinsics.checkNotNullParameter(composerRootView, "composerRootView");
        Intrinsics.checkNotNullParameter(viewObject, "viewObject");
        Intrinsics.checkNotNullParameter(references, "references");
        Intrinsics.checkNotNullParameter(voHelper, "voHelper");
        ComposerViewExtensionKt.composerRecyclerView(composerRootView).setItemAnimator(null);
        component().getImagePrefetchInfoProviderStorage().addProvider(N.b(CartSplitV2ProductVO.class), component().getProductMediaPrefetchInfoProvider());
    }

    @Override // ru.ozon.composer.ui.widget.g
    @NotNull
    public View createView(@NotNull ViewGroup parent) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        Context context = parent.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        ProductV2View productV2View = new ProductV2View(context, null, 0, 6, null);
        productV2View.setId(R$id.splitV2ItemRootCl);
        productV2View.setLayoutParams(UtilsKt.createDefaultMarginLayoutParams());
        int i11 = DP_16;
        productV2View.setPadding(i11, i11, i11, 0);
        productV2View.setBackgroundColor(productV2View.getResources().getColor(R$color.layer_floor_1, productV2View.getContext().getTheme()));
        Context context2 = parent.getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
        SwipeableWrapperViewV2 swipeableWrapperViewV2 = new SwipeableWrapperViewV2(context2, null, 0, 6, null);
        swipeableWrapperViewV2.setContent(productV2View);
        return swipeableWrapperViewV2;
    }

    @Override // ru.ozon.composer.ui.widget.g
    @NotNull
    public List<RecyclerView.n> getDecorators(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        return C7714v.a0(new CartSplitV2SeparatorDecoration(context, getItemSeparatorConfig()));
    }

    @Override // ru.ozon.app.android.composer.widgets.base.WidgetViewMapper
    @NotNull
    /* renamed from: getHolderProducer */
    public Function2<View, ComposerReferences, k<CartSplitV2ProductVO>> mo614getHolderProducer() {
        return this.holderProducer;
    }

    @Override // ru.ozon.app.android.composer.widgets.base.WidgetViewMapper
    @NotNull
    public Function2<CartSplitV2ProductDTOV2, d, List<CartSplitV2ProductVO>> getMapper() {
        return component().getMapper();
    }

    @Override // ru.ozon.composer.ui.widget.g, I00.d
    @NotNull
    public List<Class<? extends a.J.InterfaceC0007a>> getSupportedUpdates() {
        return this.supportedUpdates;
    }

    @Override // ru.ozon.app.android.composer.widgets.v2.ViewMapper2
    @NotNull
    public C7473e<CartSplitV2ProductWidgetComponent> widgetComponent(@NotNull C7475g storage) {
        Intrinsics.checkNotNullParameter(storage, "storage");
        return CartSplitV2ProductWidgetComponent.INSTANCE.create(storage);
    }

    @Override // ru.ozon.composer.ui.widget.g
    @NotNull
    public Object getPayload(@NotNull CartSplitV2ProductVO oldItem, @NotNull CartSplitV2ProductVO newItem) {
        Intrinsics.checkNotNullParameter(oldItem, "oldItem");
        Intrinsics.checkNotNullParameter(newItem, "newItem");
        WidgetViewHolderKt.getEMPTY_PAYLOAD();
        return Unit.f71690a;
    }

    @Override // ru.ozon.app.android.composer.widgets.base.WidgetViewMapper, ru.ozon.composer.ui.widget.g, I00.d
    public CartSplitV2ProductVO handleUpdate(@NotNull a.J.InterfaceC0007a update, @NotNull CartSplitV2ProductVO oldItem) {
        CheckBoxDTO checkbox;
        CheckBoxDTO checkbox2;
        Intrinsics.checkNotNullParameter(update, "update");
        Intrinsics.checkNotNullParameter(oldItem, "oldItem");
        if (!(update instanceof UpdateControl)) {
            CartSplitV2ProductVO state = update instanceof ProductUpdateKey ? ((ProductUpdateKey) update).getState() : null;
            if (state == null || state.getId() != oldItem.getId() || state.equals(oldItem)) {
                return null;
            }
            return state;
        }
        ControlsV3VO.SelectAll selectAll = ((UpdateControl) update).getControlsV3VO().getSelectAll();
        if (selectAll != null && (checkbox = selectAll.getCheckbox()) != null) {
            CheckBoxDTO.CheckboxStatus status = checkbox.getStatus();
            CheckBoxDTO.CheckboxStatus checkboxStatus = CheckBoxDTO.CheckboxStatus.SELECTED;
            boolean z11 = status == checkboxStatus;
            CheckboxVO checkbox3 = oldItem.getCheckbox();
            if (checkbox3 != null && (checkbox2 = checkbox3.getCheckbox()) != null) {
                if (z11 == (checkbox2.getStatus() == checkboxStatus)) {
                    return null;
                }
                return CartExtensionsKt.toInvertCheckBoxState(oldItem);
            }
        }
        return null;
    }
}
