package ru.ozon.app.android.product.addToCart.presentation;

import Sc.InterfaceC4008j;
import WZ.l;
import java.lang.ref.WeakReference;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.h;
import l10.i;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.tokenized.model.TokenizedTrackingInfo;
import ru.ozon.app.android.cart.common.domain.CartService;
import ru.ozon.app.android.cart.common.models.CartItemInfo;
import ru.ozon.app.android.network.abtool.FeatureChecker;
import ru.ozon.app.android.product.addToCart.presentation.AddToCartButtonView;
import ru.ozon.app.android.product.common.TileThemeConfigVO;
import ru.ozon.app.android.storefront.data.tiles.addtocart.AddToCartButtonDTO;
import ru.ozon.app.android.utils.LazyUtilsKt;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.data.AtomActionDTO;
import ru.ozon.uni.atoms.data.AtomActionMapperKt;
import ru.ozon.uni.atoms.data.TestInfo;
import ru.ozon.uni.atoms.data.controls.CommonControlSettings;
import xe.C10727i;
import xe.E0;
import xe.H0;
import xe.J;
import xe.M;
import xe.N;
import xe.X0;

@Metadata(d1 = {"\u0000¤\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0010\u0018\u0000 ^2\u00020\u0001:\u0001^B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\r\u001a\u00020\nH\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u000f\u001a\u00020\nH\u0016¢\u0006\u0004\b\u000f\u0010\u000eJ\u0017\u0010\u0012\u001a\u00020\n2\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010¢\u0006\u0004\b\u0012\u0010\u0013J©\u0001\u0010)\u001a\u00020\n2\b\u0010\u0015\u001a\u0004\u0018\u00010\u00142\b\u0010\u0016\u001a\u0004\u0018\u00010\u00142\b\u0010\u0018\u001a\u0004\u0018\u00010\u00172\b\u0010\u0019\u001a\u0004\u0018\u00010\u00172\u0014\u0010\u001c\u001a\u0010\u0012\u0004\u0012\u00020\u001b\u0012\u0004\u0012\u00020\n\u0018\u00010\u001a2\b\u0010\u001e\u001a\u0004\u0018\u00010\u001d2\b\u0010\u001f\u001a\u0004\u0018\u00010\u001d2\n\b\u0002\u0010!\u001a\u0004\u0018\u00010 2\u000e\u0010#\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\"2\"\u0010&\u001a\u001e\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020%\u0012\u0004\u0012\u00020%\u0018\u00010$\u0012\u0004\u0012\u00020\n\u0018\u00010\u001a2\b\u0010(\u001a\u0004\u0018\u00010'¢\u0006\u0004\b)\u0010*Jk\u00100\u001a\u00020\n2\b\u0010+\u001a\u0004\u0018\u00010\u00142\b\u0010,\u001a\u0004\u0018\u00010\u00172\b\u0010.\u001a\u0004\u0018\u00010-2\b\u0010/\u001a\u0004\u0018\u00010\u001d2\u000e\u0010#\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\"2\"\u0010&\u001a\u001e\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020%\u0012\u0004\u0012\u00020%\u0018\u00010$\u0012\u0004\u0012\u00020\n\u0018\u00010\u001aH\u0002¢\u0006\u0004\b0\u00101J'\u00106\u001a\u0002052\u0006\u0010,\u001a\u00020\u00172\u0006\u00103\u001a\u0002022\u0006\u00104\u001a\u000202H\u0002¢\u0006\u0004\b6\u00107J3\u00108\u001a\u0002052\b\u0010,\u001a\u0004\u0018\u00010\u00172\b\u0010.\u001a\u0004\u0018\u00010-2\u0006\u00103\u001a\u0002022\u0006\u00104\u001a\u000202H\u0002¢\u0006\u0004\b8\u00109J{\u0010<\u001a\u00020\n2\u0006\u0010,\u001a\u00020\u00172\u0006\u0010+\u001a\u00020\u00142\u0006\u00103\u001a\u0002022\u0014\u0010;\u001a\u0010\u0012\u0004\u0012\u00020%\u0012\u0004\u0012\u00020:\u0018\u00010$2\b\u0010/\u001a\u0004\u0018\u00010\u001d2\u000e\u0010#\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\"2\"\u0010&\u001a\u001e\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020%\u0012\u0004\u0012\u00020%\u0018\u00010$\u0012\u0004\u0012\u00020\n\u0018\u00010\u001aH\u0002¢\u0006\u0004\b<\u0010=J\u0015\u0010?\u001a\u0004\u0018\u00010>*\u00020 H\u0002¢\u0006\u0004\b?\u0010@J5\u0010D\u001a\u00020\n*\u00020\u00142\u0006\u0010A\u001a\u0002022\u0006\u0010B\u001a\u0002052\u0006\u00108\u001a\u0002052\b\u0010C\u001a\u0004\u0018\u00010%H\u0002¢\u0006\u0004\bD\u0010ER\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010FR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010GR\u001e\u0010\u0015\u001a\n\u0012\u0004\u0012\u00020\u0014\u0018\u00010H8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0015\u0010IR\u001e\u0010\u0016\u001a\n\u0012\u0004\u0012\u00020\u0014\u0018\u00010H8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0016\u0010IR\u001e\u0010\u0011\u001a\n\u0012\u0004\u0012\u00020\u0010\u0018\u00010H8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0011\u0010IR\u0018\u0010\u0018\u001a\u0004\u0018\u00010\u00178\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0018\u0010JR\u0018\u0010\u0019\u001a\u0004\u0018\u00010\u00178\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0019\u0010JR\u0018\u0010\u001e\u001a\u0004\u0018\u00010\u001d8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001e\u0010KR\u0018\u0010\u001f\u001a\u0004\u0018\u00010\u001d8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001f\u0010KR$\u0010\u001c\u001a\u0010\u0012\u0004\u0012\u00020\u001b\u0012\u0004\u0012\u00020\n\u0018\u00010\u001a8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001c\u0010LR\u001e\u0010#\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\"8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b#\u0010MR2\u0010&\u001a\u001e\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020%\u0012\u0004\u0012\u00020%\u0018\u00010$\u0012\u0004\u0012\u00020\n\u0018\u00010\u001a8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b&\u0010LR\u0018\u0010(\u001a\u0004\u0018\u00010'8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b(\u0010NR\u0014\u0010P\u001a\u00020O8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bP\u0010QR$\u0010!\u001a\u0004\u0018\u00010 8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b!\u0010R\u001a\u0004\bS\u0010T\"\u0004\bU\u0010VR\u001b\u0010Y\u001a\u0002058BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bW\u0010X\u001a\u0004\bY\u0010ZR\u0016\u0010]\u001a\u0004\u0018\u00010\u001d8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b[\u0010\\¨\u0006_"}, d2 = {"Lru/ozon/app/android/product/addToCart/presentation/AddToCartButtonsBinder;", "Lru/ozon/app/android/product/addToCart/presentation/AddToCartViewStateBinder;", "Lru/ozon/app/android/cart/common/domain/CartService;", "cartService", "Lru/ozon/app/android/network/abtool/FeatureChecker;", "featureChecker", "<init>", "(Lru/ozon/app/android/cart/common/domain/CartService;Lru/ozon/app/android/network/abtool/FeatureChecker;)V", "LWZ/l;", "tokenizedAnalytics", "", "init", "(LWZ/l;)V", "subscribe", "()V", TokenizedTrackingInfo.ACTION_UNSUBSCRIBE, "Ll10/i;", "composerContainer", "setup", "(Ll10/i;)V", "Lru/ozon/app/android/product/addToCart/presentation/AddToCartButtonView;", "firstButton", "secondButton", "Lru/ozon/app/android/storefront/data/tiles/addtocart/AddToCartButtonDTO;", "firstButtonDTO", "secondButtonDTO", "Lkotlin/Function1;", "Lru/ozon/uni/atoms/af/AtomAction;", "actionHandler", "", "firstButtonWidgetId", "secondButtonWidgetId", "Lru/ozon/uni/atoms/data/AtomActionDTO;", "recShelfAction", "Lkotlin/Function0;", "onPlusClicked", "", "", "onSuccess", "Lru/ozon/app/android/product/common/TileThemeConfigVO$AddToCartButtonConfigVO;", "config", "bindButtons", "(Lru/ozon/app/android/product/addToCart/presentation/AddToCartButtonView;Lru/ozon/app/android/product/addToCart/presentation/AddToCartButtonView;Lru/ozon/app/android/storefront/data/tiles/addtocart/AddToCartButtonDTO;Lru/ozon/app/android/storefront/data/tiles/addtocart/AddToCartButtonDTO;Lkotlin/jvm/functions/Function1;Ljava/lang/Long;Ljava/lang/Long;Lru/ozon/uni/atoms/data/AtomActionDTO;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;Lru/ozon/app/android/product/common/TileThemeConfigVO$AddToCartButtonConfigVO;)V", "view", "buttonDTO", "Lru/ozon/app/android/cart/common/models/CartItemInfo;", "cartItemInfo", "widgetId", "bindButton", "(Lru/ozon/app/android/product/addToCart/presentation/AddToCartButtonView;Lru/ozon/app/android/storefront/data/tiles/addtocart/AddToCartButtonDTO;Lru/ozon/app/android/cart/common/models/CartItemInfo;Ljava/lang/Long;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;)V", "", "currentCount", "maxItems", "", "isPlusEnabled", "(Lru/ozon/app/android/storefront/data/tiles/addtocart/AddToCartButtonDTO;II)Z", "isButtonDisabled", "(Lru/ozon/app/android/storefront/data/tiles/addtocart/AddToCartButtonDTO;Lru/ozon/app/android/cart/common/models/CartItemInfo;II)Z", "Lru/ozon/android/tokenized/model/TokenizedTrackingInfo;", "trackingInfo", "setOnClickListener", "(Lru/ozon/app/android/storefront/data/tiles/addtocart/AddToCartButtonDTO;Lru/ozon/app/android/product/addToCart/presentation/AddToCartButtonView;ILjava/util/Map;Ljava/lang/Long;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;)V", "Lru/ozon/app/android/storefront/data/tiles/addtocart/AddToCartButtonDTO$QuantityButton$UpdateCartAction;", "getUpdateCartActionFromParams", "(Lru/ozon/uni/atoms/data/AtomActionDTO;)Lru/ozon/app/android/storefront/data/tiles/addtocart/AddToCartButtonDTO$QuantityButton$UpdateCartAction;", "count", "isPlusDisabled", "automatizationId", "appendLocator", "(Lru/ozon/app/android/product/addToCart/presentation/AddToCartButtonView;IZZLjava/lang/String;)V", "Lru/ozon/app/android/cart/common/domain/CartService;", "Lru/ozon/app/android/network/abtool/FeatureChecker;", "Ljava/lang/ref/WeakReference;", "Ljava/lang/ref/WeakReference;", "Lru/ozon/app/android/storefront/data/tiles/addtocart/AddToCartButtonDTO;", "Ljava/lang/Long;", "Lkotlin/jvm/functions/Function1;", "Lkotlin/jvm/functions/Function0;", "Lru/ozon/app/android/product/common/TileThemeConfigVO$AddToCartButtonConfigVO;", "Lxe/M;", "scope", "Lxe/M;", "Lru/ozon/uni/atoms/data/AtomActionDTO;", "getRecShelfAction", "()Lru/ozon/uni/atoms/data/AtomActionDTO;", "setRecShelfAction", "(Lru/ozon/uni/atoms/data/AtomActionDTO;)V", "isLikezoneGradientTransformationEnabled$delegate", "LSc/j;", "isLikezoneGradientTransformationEnabled", "()Z", "getSkuId", "()Ljava/lang/Long;", "skuId", "Companion", "product_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class AddToCartButtonsBinder implements AddToCartViewStateBinder {

    @NotNull
    private static final Companion Companion = new Companion(null);
    private Function1<? super AtomAction, Unit> actionHandler;

    @NotNull
    private final CartService cartService;
    private WeakReference<i> composerContainer;
    private TileThemeConfigVO.AddToCartButtonConfigVO config;

    @NotNull
    private final FeatureChecker featureChecker;
    private WeakReference<AddToCartButtonView> firstButton;
    private AddToCartButtonDTO firstButtonDTO;
    private Long firstButtonWidgetId;

    /* renamed from: isLikezoneGradientTransformationEnabled$delegate, reason: from kotlin metadata */
    @NotNull
    private final InterfaceC4008j isLikezoneGradientTransformationEnabled;
    private Function0<Unit> onPlusClicked;
    private Function1<? super Map<String, String>, Unit> onSuccess;
    private AtomActionDTO recShelfAction;

    @NotNull
    private final M scope;
    private WeakReference<AddToCartButtonView> secondButton;
    private AddToCartButtonDTO secondButtonDTO;
    private Long secondButtonWidgetId;

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\b"}, d2 = {"Lru/ozon/app/android/product/addToCart/presentation/AddToCartButtonsBinder$Companion;", "", "<init>", "()V", "LOCATOR_ADD_TO_CART", "", "LOCATOR_BUTTON_DISABLED", "LOCATOR_COUNTER_PLUS_DISABLED", "product_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    private static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    public AddToCartButtonsBinder(@NotNull CartService cartService, @NotNull FeatureChecker featureChecker) {
        Intrinsics.checkNotNullParameter(cartService, "cartService");
        Intrinsics.checkNotNullParameter(featureChecker, "featureChecker");
        this.cartService = cartService;
        this.featureChecker = featureChecker;
        this.scope = N.a(CoroutineContext.Element.a.d(new AddToCartButtonsBinder$special$$inlined$CoroutineExceptionHandler$1(J.f105405n0), (H0) X0.b()));
        this.isLikezoneGradientTransformationEnabled = LazyUtilsKt.unsafeLazy(new AddToCartButtonsBinder$isLikezoneGradientTransformationEnabled$2(this));
    }

    private final void appendLocator(AddToCartButtonView addToCartButtonView, int i11, boolean z11, boolean z12, String str) {
        if (str == null) {
            str = "AddToCartButton";
        }
        StringBuilder sb2 = new StringBuilder(str);
        if (i11 == 0 && z12) {
            sb2.append("_disabled");
        } else if (z11) {
            sb2.append("_disabled_plus");
        }
        if (i11 > 0) {
            sb2.append("_" + i11);
        }
        addToCartButtonView.setContentDescription(sb2.toString());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void bindButton(AddToCartButtonView view, AddToCartButtonDTO buttonDTO, CartItemInfo cartItemInfo, Long widgetId, Function0<Unit> onPlusClicked, Function1<? super Map<String, String>, Unit> onSuccess) {
        int i11;
        TestInfo testInfo;
        Integer prevCount;
        AddToCartButtonDTO.QuantityButton.UpdateCartAction updateCartAction;
        if (view == null) {
            return;
        }
        int i12 = 0;
        view.setVisibility(buttonDTO != null ? 0 : 8);
        if (buttonDTO == null) {
            return;
        }
        String str = null;
        if (cartItemInfo != null && buttonDTO.getQuantityButton() != null) {
            Long selectedDeliverySchema = cartItemInfo.getSelectedDeliverySchema();
            AddToCartButtonDTO.QuantityButton quantityButton = buttonDTO.getQuantityButton();
            if (Intrinsics.d(selectedDeliverySchema, (quantityButton == null || (updateCartAction = quantityButton.getUpdateCartAction()) == null) ? null : updateCartAction.getSelectedDeliverySchema())) {
                i12 = cartItemInfo.getQuantity();
            }
        }
        AddToCartButtonDTO.QuantityButton quantityButton2 = buttonDTO.getQuantityButton();
        int maxItems = quantityButton2 != null ? quantityButton2.getMaxItems() : Integer.MAX_VALUE;
        boolean isButtonDisabled = isButtonDisabled(buttonDTO, cartItemInfo, i12, maxItems);
        boolean isPlusEnabled = isPlusEnabled(buttonDTO, i12, maxItems);
        if (buttonDTO.equals(view.getPrevModel()) && isButtonDisabled == view.getIsDisabled() && (prevCount = view.getPrevCount()) != null && i12 == prevCount.intValue() && isPlusEnabled == view.getIsPlusButtonEnabled()) {
            i11 = i12;
        } else {
            view.bind(buttonDTO, isButtonDisabled, i12, isPlusEnabled, this.config, isLikezoneGradientTransformationEnabled());
            i11 = i12;
            boolean z11 = !isPlusEnabled;
            CommonControlSettings common = buttonDTO.getActionButton().getCommon();
            if (common != null && (testInfo = common.getTestInfo()) != null) {
                str = testInfo.getAutomatizationId();
            }
            appendLocator(view, i11, z11, isButtonDisabled, str);
        }
        setOnClickListener(buttonDTO, view, i11, buttonDTO.getTrackingInfo(), widgetId, onPlusClicked, onSuccess);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Long getSkuId() {
        String skuId;
        AddToCartButtonDTO addToCartButtonDTO = this.firstButtonDTO;
        if (addToCartButtonDTO == null || (skuId = addToCartButtonDTO.getSkuId()) == null) {
            return null;
        }
        return h.y0(skuId);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final AddToCartButtonDTO.QuantityButton.UpdateCartAction getUpdateCartActionFromParams(AtomActionDTO atomActionDTO) {
        String str;
        String str2;
        String str3;
        Integer w02;
        Map<String, String> params = atomActionDTO.getParams();
        Long l11 = null;
        if (params == null || (str = params.get("id")) == null) {
            return null;
        }
        Map<String, String> params2 = atomActionDTO.getParams();
        int intValue = (params2 == null || (str3 = params2.get("quantity")) == null || (w02 = h.w0(str3)) == null) ? 1 : w02.intValue();
        Map<String, String> params3 = atomActionDTO.getParams();
        if (params3 != null && (str2 = params3.get("selectedDeliverySchema")) != null) {
            l11 = h.y0(str2);
        }
        return new AddToCartButtonDTO.QuantityButton.UpdateCartAction(str, intValue, l11);
    }

    private final boolean isButtonDisabled(AddToCartButtonDTO buttonDTO, CartItemInfo cartItemInfo, int currentCount, int maxItems) {
        AddToCartButtonDTO.QuantityButton.UpdateCartAction updateCartAction;
        AddToCartButtonDTO.ActionButton actionButton;
        CommonControlSettings common;
        AtomActionDTO action;
        AddToCartButtonDTO.QuantityButton.UpdateCartAction updateCartActionFromParams;
        if (buttonDTO != null ? Intrinsics.d(buttonDTO.isDisabled(), Boolean.TRUE) : false) {
            return true;
        }
        if (currentCount == 0) {
            if (((buttonDTO == null || (actionButton = buttonDTO.getActionButton()) == null || (common = actionButton.getCommon()) == null || (action = common.getAction()) == null || (updateCartActionFromParams = getUpdateCartActionFromParams(action)) == null) ? 1 : updateCartActionFromParams.getQuantity()) > maxItems) {
                return true;
            }
        }
        if (cartItemInfo != null && buttonDTO != null && buttonDTO.getQuantityButton() != null && cartItemInfo.getQuantity() > 0) {
            AddToCartButtonDTO.QuantityButton quantityButton = buttonDTO.getQuantityButton();
            if (!Intrinsics.d((quantityButton == null || (updateCartAction = quantityButton.getUpdateCartAction()) == null) ? null : updateCartAction.getSelectedDeliverySchema(), cartItemInfo.getSelectedDeliverySchema())) {
                return true;
            }
        }
        return false;
    }

    private final boolean isLikezoneGradientTransformationEnabled() {
        return ((Boolean) this.isLikezoneGradientTransformationEnabled.getValue()).booleanValue();
    }

    private final boolean isPlusEnabled(AddToCartButtonDTO buttonDTO, int currentCount, int maxItems) {
        AtomActionDTO action;
        AddToCartButtonDTO.QuantityButton.UpdateCartAction updateCartActionFromParams;
        AddToCartButtonDTO.QuantityButton.UpdateCartAction updateCartAction;
        Integer num = null;
        if (currentCount > 0) {
            AddToCartButtonDTO.QuantityButton quantityButton = buttonDTO.getQuantityButton();
            if (quantityButton != null && (updateCartAction = quantityButton.getUpdateCartAction()) != null) {
                num = Integer.valueOf(updateCartAction.getQuantity());
            }
        } else {
            CommonControlSettings common = buttonDTO.getActionButton().getCommon();
            if (common != null && (action = common.getAction()) != null && (updateCartActionFromParams = getUpdateCartActionFromParams(action)) != null) {
                num = Integer.valueOf(updateCartActionFromParams.getQuantity());
            }
        }
        return currentCount + (num != null ? num.intValue() : 1) <= maxItems;
    }

    private final void setOnClickListener(final AddToCartButtonDTO buttonDTO, AddToCartButtonView view, final int currentCount, final Map<String, TokenizedTrackingInfo> trackingInfo, final Long widgetId, final Function0<Unit> onPlusClicked, final Function1<? super Map<String, String>, Unit> onSuccess) {
        view.setClickListener(new AddToCartButtonView.AddToCartClickListener() { // from class: ru.ozon.app.android.product.addToCart.presentation.AddToCartButtonsBinder$setOnClickListener$1
            @Override // ru.ozon.app.android.product.addToCart.presentation.AddToCartButtonView.AddToCartClickListener
            public void onAction(CommonControlSettings commonControlSettings) {
                Function1 function1;
                AddToCartButtonDTO.QuantityButton.UpdateCartAction updateCartActionFromParams;
                Intrinsics.checkNotNullParameter(commonControlSettings, "commonControlSettings");
                AtomActionDTO action = commonControlSettings.getAction();
                if (action == null) {
                    return;
                }
                if (Intrinsics.d(action.getId(), "addToCart")) {
                    updateCartActionFromParams = AddToCartButtonsBinder.this.getUpdateCartActionFromParams(action);
                    if (updateCartActionFromParams != null) {
                        onPlusButtonClicked(updateCartActionFromParams);
                        return;
                    }
                    return;
                }
                function1 = AddToCartButtonsBinder.this.actionHandler;
                if (function1 != null) {
                    function1.invoke(AtomActionMapperKt.toAtomAction(action, commonControlSettings.getTrackingInfo()));
                }
            }

            @Override // ru.ozon.app.android.product.addToCart.presentation.AddToCartButtonView.AddToCartClickListener
            public void onMinusButtonClicked(AddToCartButtonDTO.QuantityButton.UpdateCartAction updateCartAction) {
                M m11;
                Intrinsics.checkNotNullParameter(updateCartAction, "updateCartAction");
                m11 = AddToCartButtonsBinder.this.scope;
                C10727i.c(m11, null, null, new AddToCartButtonsBinder$setOnClickListener$1$onMinusButtonClicked$1(buttonDTO, currentCount, updateCartAction, AddToCartButtonsBinder.this, trackingInfo, widgetId, null), 3);
            }

            @Override // ru.ozon.app.android.product.addToCart.presentation.AddToCartButtonView.AddToCartClickListener
            public void onPlusButtonClicked(AddToCartButtonDTO.QuantityButton.UpdateCartAction updateCartAction) {
                M m11;
                Intrinsics.checkNotNullParameter(updateCartAction, "updateCartAction");
                m11 = AddToCartButtonsBinder.this.scope;
                C10727i.c(m11, null, null, new AddToCartButtonsBinder$setOnClickListener$1$onPlusButtonClicked$1(currentCount, widgetId, AddToCartButtonsBinder.this, buttonDTO, onPlusClicked, updateCartAction, trackingInfo, onSuccess, null), 3);
            }
        });
    }

    public final void bindButtons(AddToCartButtonView firstButton, AddToCartButtonView secondButton, AddToCartButtonDTO firstButtonDTO, AddToCartButtonDTO secondButtonDTO, Function1<? super AtomAction, Unit> actionHandler, Long firstButtonWidgetId, Long secondButtonWidgetId, AtomActionDTO recShelfAction, Function0<Unit> onPlusClicked, Function1<? super Map<String, String>, Unit> onSuccess, TileThemeConfigVO.AddToCartButtonConfigVO config) {
        this.firstButton = firstButton != null ? new WeakReference<>(firstButton) : null;
        this.secondButton = secondButton != null ? new WeakReference<>(secondButton) : null;
        this.firstButtonDTO = firstButtonDTO;
        this.secondButtonDTO = secondButtonDTO;
        this.actionHandler = actionHandler;
        this.firstButtonWidgetId = firstButtonWidgetId;
        this.secondButtonWidgetId = secondButtonWidgetId;
        this.recShelfAction = recShelfAction;
        this.onPlusClicked = onPlusClicked;
        this.onSuccess = onSuccess;
        this.config = config;
        Long skuId = getSkuId();
        CartItemInfo cartItemInfo = skuId != null ? this.cartService.getCartState().getItems().get(Long.valueOf(skuId.longValue())) : null;
        bindButton(firstButton, firstButtonDTO, cartItemInfo, firstButtonWidgetId, onPlusClicked, onSuccess);
        bindButton(secondButton, secondButtonDTO, cartItemInfo, secondButtonWidgetId, onPlusClicked, onSuccess);
    }

    public final AtomActionDTO getRecShelfAction() {
        return this.recShelfAction;
    }

    @Override // ru.ozon.app.android.product.addToCart.presentation.AddToCartViewStateBinder
    public void init(@NotNull l tokenizedAnalytics) {
        Intrinsics.checkNotNullParameter(tokenizedAnalytics, "tokenizedAnalytics");
        this.cartService.attach(tokenizedAnalytics);
    }

    public final void setup(i composerContainer) {
        this.composerContainer = composerContainer != null ? new WeakReference<>(composerContainer) : null;
    }

    @Override // ru.ozon.app.android.product.addToCart.presentation.AddToCartViewStateBinder
    public void subscribe() {
        C10727i.c(this.scope, null, null, new AddToCartButtonsBinder$subscribe$1(this, null), 3);
    }

    @Override // ru.ozon.app.android.product.addToCart.presentation.AddToCartViewStateBinder
    public void unsubscribe() {
        E0.d(this.scope.getCoroutineContext());
    }
}
