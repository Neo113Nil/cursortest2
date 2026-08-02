package ru.ozon.app.android.cart.cartSplitV2.v1.presentation.item;

import Dq.C2878a;
import Pc.a;
import WZ.t;
import android.annotation.SuppressLint;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import h20.InterfaceC6786a;
import j10.h;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import k20.C7473e;
import k20.C7475g;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.C7714v;
import kotlin.collections.K;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.N;
import l20.d;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.tokenized.model.TokenizedTrackingInfo;
import ru.ozon.app.android.action.custom.di.CustomActionHandlersComponentApi;
import ru.ozon.app.android.cart.cartSplitV2.v1.data.CartSplitV2DTO;
import ru.ozon.app.android.cart.cartSplitV2.v1.presentation.decoration.CartSplitRoundedDecoration;
import ru.ozon.app.android.cart.cartSplitV2.v1.presentation.item.CartSplitV2ItemVO;
import ru.ozon.app.android.cart.cartSplitV2.v1.presentation.item.decoration.CartSplitRoundItemSeparatorDecoration;
import ru.ozon.app.android.cart.cartSplitV2.v1.presentation.item.di.CartSplitV2ItemWidgetComponent;
import ru.ozon.app.android.cart.cartSplitV2.v1.presentation.item.di.DaggerCartSplitV2ItemWidgetComponent;
import ru.ozon.app.android.cart.common.di.CartComponentApi;
import ru.ozon.app.android.cart.common.di.CartServiceApi;
import ru.ozon.app.android.cart.common.dynamicElement.DynamicElementDTO;
import ru.ozon.app.android.cart.common.dynamicElement.DynamicElementMapperKt;
import ru.ozon.app.android.cart.common.dynamicElement.DynamicElementVO;
import ru.ozon.app.android.cart.common.product.ProductMapperKt;
import ru.ozon.app.android.cart.common.product.ProductVO;
import ru.ozon.app.android.cart.feature.R$layout;
import ru.ozon.app.android.composer.ComposerReferences;
import ru.ozon.app.android.composer.TrackingInfoMapperKt;
import ru.ozon.app.android.composer.di.composer.RetainComposerComponentApi;
import ru.ozon.app.android.composer.di.composer.RetainComposerPerformanceComponentApi;
import ru.ozon.app.android.composer.di.composer.RetainImagePrefetchComponentApi;
import ru.ozon.app.android.composer.view.ComposerViewExtensionKt;
import ru.ozon.app.android.composer.widgets.base.WidgetViewHolderKt;
import ru.ozon.app.android.composer.widgets.v2.WidgetViewMapper2;
import ru.ozon.app.android.favorites.data.favoritebutton.favoriteproduct.FavoriteProductMolecule;
import ru.ozon.app.android.favorites.ui.di.FavoriteComponentApi;
import ru.ozon.app.android.network.di.NetworkComponentApi;
import ru.ozon.app.android.platform.di.AndroidPlatformComponentApi;
import ru.ozon.app.android.utils.dispatcherprovider.di.CoroutineDispatchersComponentApi;
import ru.ozon.composer.ui.widget.k;
import ru.ozon.composer.ui.widget.l;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.data.AtomActionDTO;
import ru.ozon.uni.atoms.data.AtomActionMapperKt;
import ru.ozon.uni.atoms.data.notification.NotificationDTO;

@Metadata(d1 = {"\u0000ê\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001B\t\b\u0007¢\u0006\u0004\b\u0005\u0010\u0006J+\u0010\u000e\u001a\u00020\u0004*\u00020\u00072\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\fH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u0013\u0010\u000e\u001a\u00020\u0011*\u00020\u0010H\u0002¢\u0006\u0004\b\u000e\u0010\u0012J\u001b\u0010\u000e\u001a\u00020\u0016*\u00020\u00132\u0006\u0010\u0015\u001a\u00020\u0014H\u0002¢\u0006\u0004\b\u000e\u0010\u0017J\u001b\u0010\u000e\u001a\u00020\u0019*\u00020\u00182\u0006\u0010\u0015\u001a\u00020\u0014H\u0002¢\u0006\u0004\b\u000e\u0010\u001aJ\u001b\u0010\u000e\u001a\u00020\u001c*\u00020\u001b2\u0006\u0010\u0015\u001a\u00020\u0014H\u0002¢\u0006\u0004\b\u000e\u0010\u001dJ=\u0010)\u001a\u00020(2\u0006\u0010\u001f\u001a\u00020\u001e2\n\u0010\"\u001a\u00060 j\u0002`!2\u0006\u0010$\u001a\u00020#2\u0010\u0010'\u001a\f\u0012\u0004\u0012\u00020 0%j\u0002`&H\u0016¢\u0006\u0004\b)\u0010*J\u001d\u0010/\u001a\b\u0012\u0004\u0012\u00020.0-2\u0006\u0010,\u001a\u00020+H\u0016¢\u0006\u0004\b/\u00100J!\u00104\u001a\u0004\u0018\u0001032\u0006\u00101\u001a\u00020\u00042\u0006\u00102\u001a\u00020\u0004H\u0016¢\u0006\u0004\b4\u00105J!\u0010:\u001a\b\u0012\u0004\u0012\u00020\u0002092\n\u00108\u001a\u000606j\u0002`7H\u0017¢\u0006\u0004\b:\u0010;R\u0018\u0010=\u001a\u0004\u0018\u00010<8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b=\u0010>R6\u0010B\u001a\u001e\u0012\u0004\u0012\u00020\u0003\u0012\b\u0012\u00060@j\u0002`A\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040-0?8\u0016X\u0096\u0004¢\u0006\f\n\u0004\bB\u0010C\u001a\u0004\bD\u0010ER\u001a\u0010F\u001a\u00020\n8\u0016X\u0096\u0004¢\u0006\f\n\u0004\bF\u0010G\u001a\u0004\bH\u0010IR<\u0010M\u001a$\u0012\u0004\u0012\u00020J\u0012\u0004\u0012\u00020#\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u00020\u00040Kj\b\u0012\u0004\u0012\u00020\u0004`L0?8\u0016X\u0096\u0004¢\u0006\f\n\u0004\bM\u0010C\u001a\u0004\bN\u0010ER \u0010T\u001a\u000e\u0012\n\b\u0001\u0012\u00060Pj\u0002`Q0O8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bR\u0010S¨\u0006U"}, d2 = {"Lru/ozon/app/android/cart/cartSplitV2/v1/presentation/item/CartSplitV2ItemViewMapper;", "Lru/ozon/app/android/composer/widgets/v2/WidgetViewMapper2;", "Lru/ozon/app/android/cart/cartSplitV2/v1/presentation/item/di/CartSplitV2ItemWidgetComponent;", "Lru/ozon/app/android/cart/cartSplitV2/v1/data/CartSplitV2DTO;", "Lru/ozon/app/android/cart/cartSplitV2/v1/presentation/item/CartSplitV2ItemVO;", "<init>", "()V", "Lru/ozon/app/android/cart/cartSplitV2/v1/data/CartSplitV2DTO$Item;", "", "stateId", "", "index", "", "roundBottom", "toVO", "(Lru/ozon/app/android/cart/cartSplitV2/v1/data/CartSplitV2DTO$Item;Ljava/lang/String;IZ)Lru/ozon/app/android/cart/cartSplitV2/v1/presentation/item/CartSplitV2ItemVO;", "Lru/ozon/app/android/cart/cartSplitV2/v1/data/CartSplitV2DTO$Item$Checkbox;", "Lru/ozon/app/android/cart/cartSplitV2/v1/presentation/item/CartSplitV2ItemVO$Checkbox;", "(Lru/ozon/app/android/cart/cartSplitV2/v1/data/CartSplitV2DTO$Item$Checkbox;)Lru/ozon/app/android/cart/cartSplitV2/v1/presentation/item/CartSplitV2ItemVO$Checkbox;", "Lru/ozon/app/android/cart/cartSplitV2/v1/data/CartSplitV2DTO$Item$Controls;", "", "widgetId", "Lru/ozon/app/android/cart/cartSplitV2/v1/presentation/item/CartSplitV2ItemVO$Controls;", "(Lru/ozon/app/android/cart/cartSplitV2/v1/data/CartSplitV2DTO$Item$Controls;J)Lru/ozon/app/android/cart/cartSplitV2/v1/presentation/item/CartSplitV2ItemVO$Controls;", "Lru/ozon/app/android/cart/cartSplitV2/v1/data/CartSplitV2DTO$Item$Controls$RemoveControl;", "Lru/ozon/app/android/cart/cartSplitV2/v1/presentation/item/CartSplitV2ItemVO$Controls$RemoveControl;", "(Lru/ozon/app/android/cart/cartSplitV2/v1/data/CartSplitV2DTO$Item$Controls$RemoveControl;J)Lru/ozon/app/android/cart/cartSplitV2/v1/presentation/item/CartSplitV2ItemVO$Controls$RemoveControl;", "Lru/ozon/app/android/cart/cartSplitV2/v1/data/CartSplitV2DTO$Item$Controls$QuantityControl;", "Lru/ozon/app/android/cart/cartSplitV2/v1/presentation/item/CartSplitV2ItemVO$Controls$QuantityControl;", "(Lru/ozon/app/android/cart/cartSplitV2/v1/data/CartSplitV2DTO$Item$Controls$QuantityControl;J)Lru/ozon/app/android/cart/cartSplitV2/v1/presentation/item/CartSplitV2ItemVO$Controls$QuantityControl;", "Landroid/view/ViewGroup;", "composerRootView", "Lru/ozon/composer/ui/widget/l;", "Lru/ozon/app/android/composer/view/ComposerViewObject;", "viewObject", "Lru/ozon/app/android/composer/ComposerReferences;", "references", "Lj10/h;", "Lru/ozon/app/android/composer/viewmodel/ComposerVoHelper;", "voHelper", "", "constructLayout", "(Landroid/view/ViewGroup;Lru/ozon/composer/ui/widget/l;Lru/ozon/app/android/composer/ComposerReferences;Lj10/h;)V", "Landroid/content/Context;", "context", "", "Landroidx/recyclerview/widget/RecyclerView$n;", "getDecorators", "(Landroid/content/Context;)Ljava/util/List;", "oldItem", "newItem", "", "getPayload", "(Lru/ozon/app/android/cart/cartSplitV2/v1/presentation/item/CartSplitV2ItemVO;Lru/ozon/app/android/cart/cartSplitV2/v1/presentation/item/CartSplitV2ItemVO;)Ljava/lang/Object;", "Lk20/g;", "Lru/ozon/app/android/composer/widgets/v2/di/ComposerWidgetComponentStorage;", "storage", "Lk20/e;", "widgetComponent", "(Lk20/g;)Lk20/e;", "Lru/ozon/app/android/cart/cartSplitV2/v1/data/CartSplitV2DTO$SeparatorConfig;", "itemSeparatorConfig", "Lru/ozon/app/android/cart/cartSplitV2/v1/data/CartSplitV2DTO$SeparatorConfig;", "Lkotlin/Function2;", "Ll20/d;", "Lru/ozon/app/android/composer/view/WidgetInfo;", "mapper", "Lkotlin/jvm/functions/Function2;", "getMapper", "()Lkotlin/jvm/functions/Function2;", "layout", "I", "getLayout", "()Ljava/lang/Integer;", "Landroid/view/View;", "Lru/ozon/composer/ui/widget/k;", "Lru/ozon/app/android/composer/widgets/base/WidgetViewHolder;", "holderProducer", "getHolderProducer", "LPc/a;", "Lh20/a;", "Lru/ozon/app/android/composer/viewmodel/ComposerWidgetViewModel;", "getViewModelWidgetProvider", "()LPc/a;", "viewModelWidgetProvider", "cart_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class CartSplitV2ItemViewMapper extends WidgetViewMapper2<CartSplitV2ItemWidgetComponent, CartSplitV2DTO, CartSplitV2ItemVO> {
    private CartSplitV2DTO.SeparatorConfig itemSeparatorConfig;

    @NotNull
    private final Function2<CartSplitV2DTO, d, List<CartSplitV2ItemVO>> mapper = new CartSplitV2ItemViewMapper$mapper$1(this);
    private final int layout = R$layout.widget_cart_split_v2_item;

    @NotNull
    private final Function2<View, ComposerReferences, k<CartSplitV2ItemVO>> holderProducer = new CartSplitV2ItemViewMapper$holderProducer$1(this);

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v2, types: [kotlin.collections.K] */
    /* JADX WARN: Type inference failed for: r0v3 */
    /* JADX WARN: Type inference failed for: r0v4, types: [java.util.ArrayList] */
    public final CartSplitV2ItemVO toVO(CartSplitV2DTO.Item item, String str, int i11, boolean z11) {
        ?? r02;
        long hashCode = str.hashCode() + i11;
        CartSplitV2DTO.Item.Checkbox checkbox = item.getCheckbox();
        CartSplitV2ItemVO.Checkbox vo = checkbox != null ? toVO(checkbox) : null;
        ProductVO vo2 = ProductMapperKt.toVO(item.getProduct(), hashCode);
        List<DynamicElementDTO> dynamicElements = item.getDynamicElements();
        if (!(dynamicElements instanceof List)) {
            dynamicElements = null;
        }
        if (dynamicElements != null) {
            r02 = new ArrayList();
            Iterator it = dynamicElements.iterator();
            while (it.hasNext()) {
                DynamicElementVO mapToDynamicElementVO = DynamicElementMapperKt.mapToDynamicElementVO(it.next(), hashCode);
                if (mapToDynamicElementVO != null) {
                    r02.add(mapToDynamicElementVO);
                }
            }
        } else {
            r02 = K.f71697a;
        }
        List list = r02;
        CartSplitV2DTO.Item.Controls controls = item.getControls();
        return new CartSplitV2ItemVO(hashCode, vo, vo2, list, controls != null ? toVO(controls, hashCode) : null, z11);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final CartSplitV2ItemWidgetComponent widgetComponent$lambda$0(C7475g c7475g) {
        return DaggerCartSplitV2ItemWidgetComponent.factory().create((FavoriteComponentApi) c7475g.getComponent(FavoriteComponentApi.class), (CustomActionHandlersComponentApi) c7475g.getComponent(CustomActionHandlersComponentApi.class), (NetworkComponentApi) c7475g.getComponent(NetworkComponentApi.class), (RetainImagePrefetchComponentApi) c7475g.getComponent(RetainImagePrefetchComponentApi.class), (RetainComposerPerformanceComponentApi) c7475g.getComponent(RetainComposerPerformanceComponentApi.class), (AndroidPlatformComponentApi) c7475g.getComponent(AndroidPlatformComponentApi.class), (CartComponentApi) c7475g.getComponent(CartComponentApi.class), (CartServiceApi) c7475g.getComponent(CartServiceApi.class), (CoroutineDispatchersComponentApi) c7475g.getComponent(CoroutineDispatchersComponentApi.class), (RetainComposerComponentApi) c7475g.getComponent(RetainComposerComponentApi.class));
    }

    @Override // ru.ozon.app.android.composer.widgets.base.WidgetViewMapper
    public void constructLayout(@NotNull ViewGroup composerRootView, @NotNull l viewObject, @NotNull ComposerReferences references, @NotNull h<l> voHelper) {
        Intrinsics.checkNotNullParameter(composerRootView, "composerRootView");
        Intrinsics.checkNotNullParameter(viewObject, "viewObject");
        Intrinsics.checkNotNullParameter(references, "references");
        Intrinsics.checkNotNullParameter(voHelper, "voHelper");
        ComposerViewExtensionKt.composerRecyclerView(composerRootView).setItemAnimator(null);
        component().getImagePrefetchInfoProviderStorage().addProvider(N.b(CartSplitV2ItemVO.class), component().getImagePrefetchInfoProvider());
    }

    @Override // ru.ozon.composer.ui.widget.g
    @NotNull
    public List<RecyclerView.n> getDecorators(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        return C7714v.b0(new CartSplitRoundedDecoration(), new CartSplitRoundItemSeparatorDecoration(context, this.itemSeparatorConfig));
    }

    @Override // ru.ozon.app.android.composer.widgets.base.WidgetViewMapper
    @NotNull
    /* renamed from: getHolderProducer */
    public Function2<View, ComposerReferences, k<CartSplitV2ItemVO>> mo614getHolderProducer() {
        return this.holderProducer;
    }

    @Override // ru.ozon.composer.ui.widget.g
    @NotNull
    public Integer getLayout() {
        return Integer.valueOf(this.layout);
    }

    @Override // ru.ozon.app.android.composer.widgets.base.WidgetViewMapper
    @NotNull
    public Function2<CartSplitV2DTO, d, List<CartSplitV2ItemVO>> getMapper() {
        return this.mapper;
    }

    @Override // ru.ozon.composer.ui.widget.g
    @NotNull
    public a<? extends InterfaceC6786a> getViewModelWidgetProvider() {
        return component().getViewModelProvider();
    }

    @Override // ru.ozon.app.android.composer.widgets.v2.ViewMapper2
    @SuppressLint({"WidgetViewMapper2WithDaggerComponent"})
    @NotNull
    public C7473e<CartSplitV2ItemWidgetComponent> widgetComponent(@NotNull C7475g storage) {
        Intrinsics.checkNotNullParameter(storage, "storage");
        return new C7473e<>(N.b(CartSplitV2ItemWidgetComponent.class), new C2878a(storage, 5));
    }

    @Override // ru.ozon.composer.ui.widget.g
    public Object getPayload(@NotNull CartSplitV2ItemVO oldItem, @NotNull CartSplitV2ItemVO newItem) {
        Intrinsics.checkNotNullParameter(oldItem, "oldItem");
        Intrinsics.checkNotNullParameter(newItem, "newItem");
        WidgetViewHolderKt.getEMPTY_PAYLOAD();
        return Unit.f71690a;
    }

    private final CartSplitV2ItemVO.Checkbox toVO(CartSplitV2DTO.Item.Checkbox checkbox) {
        boolean isSelected = checkbox.isSelected();
        AtomActionDTO action = checkbox.getAction();
        return new CartSplitV2ItemVO.Checkbox(isSelected, action != null ? AtomActionMapperKt.toAtomAction(action, checkbox.getTrackingInfo()) : null);
    }

    private final CartSplitV2ItemVO.Controls toVO(CartSplitV2DTO.Item.Controls controls, long j11) {
        FavoriteProductMolecule favoriteProduct = controls.getFavoriteProduct();
        CartSplitV2ItemVO.Controls.RemoveControl vo = toVO(controls.getRemove(), j11);
        CartSplitV2DTO.Item.Controls.QuantityControl quantity = controls.getQuantity();
        return new CartSplitV2ItemVO.Controls(favoriteProduct, vo, quantity != null ? toVO(quantity, j11) : null, controls.getBuyInOneClick());
    }

    private final CartSplitV2ItemVO.Controls.RemoveControl toVO(CartSplitV2DTO.Item.Controls.RemoveControl removeControl, long j11) {
        String icon = removeControl.getIcon();
        String tintColor = removeControl.getTintColor();
        AtomActionDTO action = removeControl.getAction();
        AtomAction atomAction = action != null ? AtomActionMapperKt.toAtomAction(action, removeControl.getTrackingInfo()) : null;
        Map<String, TokenizedTrackingInfo> trackingInfo = removeControl.getTrackingInfo();
        return new CartSplitV2ItemVO.Controls.RemoveControl(icon, tintColor, atomAction, trackingInfo != null ? TrackingInfoMapperKt.toTokenizedEvent$default(trackingInfo, Long.valueOf(j11), null, 2, null) : null);
    }

    private final CartSplitV2ItemVO.Controls.QuantityControl toVO(CartSplitV2DTO.Item.Controls.QuantityControl quantityControl, long j11) {
        int intValue;
        int minimum = quantityControl.getMinimum();
        int maximum = quantityControl.getMaximum();
        int current = quantityControl.getCurrent();
        AtomAction atomAction = AtomActionMapperKt.toAtomAction(quantityControl.getAction(), null);
        Integer multiplicity = quantityControl.getMultiplicity();
        int i11 = 1;
        if (multiplicity != null && (intValue = multiplicity.intValue()) >= 1) {
            i11 = intValue;
        }
        Long debounceDelay = quantityControl.getDebounceDelay();
        Map<String, TokenizedTrackingInfo> incrementTrackingInfo = quantityControl.getIncrementTrackingInfo();
        t tokenizedEvent$default = incrementTrackingInfo != null ? TrackingInfoMapperKt.toTokenizedEvent$default(incrementTrackingInfo, Long.valueOf(j11), null, 2, null) : null;
        Map<String, TokenizedTrackingInfo> decrementTrackingInfo = quantityControl.getDecrementTrackingInfo();
        t tokenizedEvent$default2 = decrementTrackingInfo != null ? TrackingInfoMapperKt.toTokenizedEvent$default(decrementTrackingInfo, Long.valueOf(j11), null, 2, null) : null;
        NotificationDTO quantityChangeDisabledNotificationBar = quantityControl.getQuantityChangeDisabledNotificationBar();
        Integer quantSize = quantityControl.getQuantSize();
        return new CartSplitV2ItemVO.Controls.QuantityControl(minimum, maximum, current, atomAction, i11, debounceDelay, tokenizedEvent$default, tokenizedEvent$default2, quantityChangeDisabledNotificationBar, quantSize != null ? quantSize.intValue() : 0);
    }
}
