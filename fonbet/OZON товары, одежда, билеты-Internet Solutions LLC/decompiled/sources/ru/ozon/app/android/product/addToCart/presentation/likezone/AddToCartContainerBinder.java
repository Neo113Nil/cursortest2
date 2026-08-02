package ru.ozon.app.android.product.addToCart.presentation.likezone;

import Ae.C2399j;
import Ae.C2408n0;
import Ae.I;
import Ae.InterfaceC2395h;
import Ae.InterfaceC2397i;
import De.s;
import Sc.InterfaceC4008j;
import WZ.l;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import java.lang.ref.WeakReference;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.h;
import l10.i;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.tokenized.model.TokenizedTrackingInfo;
import ru.ozon.app.android.cart.common.domain.CartService;
import ru.ozon.app.android.cart.common.domain.CartState;
import ru.ozon.app.android.cart.common.domain.CartType;
import ru.ozon.app.android.cart.common.models.CartItemInfo;
import ru.ozon.app.android.network.abtool.FeatureChecker;
import ru.ozon.app.android.product.addToCart.presentation.AddToCartViewStateBinder;
import ru.ozon.app.android.product.addToCart.presentation.likezone.AddToCartContainerView;
import ru.ozon.app.android.product.common.TileThemeConfigVO;
import ru.ozon.app.android.product.utils.AddToCartButtonExtKt;
import ru.ozon.app.android.storefront.data.tiles.addtocart.AddToCartButtonDTO;
import ru.ozon.app.android.storefront.data.tiles.addtocart.likezone.AddToCartContainerDTO;
import ru.ozon.app.android.storefront.data.tiles.addtocart.likezone.FamilyButtonDTO;
import ru.ozon.app.android.utils.LazyUtilsKt;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.data.AtomActionDTO;
import ru.ozon.uni.atoms.data.AtomActionMapperKt;
import ru.ozon.uni.atoms.data.TestInfo;
import ru.ozon.uni.atoms.data.controls.CommonControlSettings;
import xe.C10720e0;
import xe.C10727i;
import xe.E0;
import xe.J;
import xe.M;
import xe.N;
import xe.X0;

@Metadata(d1 = {"\u0000Ä\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0010\u0018\u0000 \u0080\u00012\u00020\u0001:\u0002\u0080\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\r\u001a\u00020\nH\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u000f\u001a\u00020\nH\u0016¢\u0006\u0004\b\u000f\u0010\u000eJ\u0017\u0010\u0012\u001a\u00020\n2\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010¢\u0006\u0004\b\u0012\u0010\u0013J\u0089\u0001\u0010&\u001a\u00020\n2\b\u0010\u0015\u001a\u0004\u0018\u00010\u00142\b\u0010\u0017\u001a\u0004\u0018\u00010\u00162\u0014\u0010\u001a\u001a\u0010\u0012\u0004\u0012\u00020\u0019\u0012\u0004\u0012\u00020\n\u0018\u00010\u00182\b\u0010\u001c\u001a\u0004\u0018\u00010\u001b2\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\u001d2\u000e\u0010 \u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\u001f2\"\u0010#\u001a\u001e\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\"\u0012\u0004\u0012\u00020\"\u0018\u00010!\u0012\u0004\u0012\u00020\n\u0018\u00010\u00182\u0006\u0010%\u001a\u00020$¢\u0006\u0004\b&\u0010'J(\u0010+\u001a\u00020\n2\n\b\u0002\u0010)\u001a\u0004\u0018\u00010(2\n\b\u0002\u0010*\u001a\u0004\u0018\u00010(H\u0082@¢\u0006\u0004\b+\u0010,J7\u0010.\u001a\u00020\n2\b\u0010-\u001a\u0004\u0018\u00010\u00142\b\u0010\u0017\u001a\u0004\u0018\u00010\u00162\b\u0010)\u001a\u0004\u0018\u00010(2\b\u0010*\u001a\u0004\u0018\u00010(H\u0002¢\u0006\u0004\b.\u0010/J!\u00104\u001a\u0002032\u0006\u00101\u001a\u0002002\b\u00102\u001a\u0004\u0018\u00010(H\u0002¢\u0006\u0004\b4\u00105J!\u00109\u001a\u0002082\u0006\u00107\u001a\u0002062\b\u0010*\u001a\u0004\u0018\u00010(H\u0002¢\u0006\u0004\b9\u0010:J'\u0010@\u001a\u00020?2\u0006\u0010;\u001a\u0002002\u0006\u0010=\u001a\u00020<2\u0006\u0010>\u001a\u00020<H\u0002¢\u0006\u0004\b@\u0010AJ'\u0010B\u001a\u00020?2\u0006\u0010;\u001a\u0002062\u0006\u0010=\u001a\u00020<2\u0006\u0010>\u001a\u00020<H\u0002¢\u0006\u0004\bB\u0010CJ3\u0010D\u001a\u00020?2\b\u0010;\u001a\u0004\u0018\u0001002\b\u00102\u001a\u0004\u0018\u00010(2\u0006\u0010=\u001a\u00020<2\u0006\u0010>\u001a\u00020<H\u0002¢\u0006\u0004\bD\u0010EJ3\u0010F\u001a\u00020?2\b\u0010;\u001a\u0004\u0018\u0001062\b\u00102\u001a\u0004\u0018\u00010(2\u0006\u0010=\u001a\u00020<2\u0006\u0010>\u001a\u00020<H\u0002¢\u0006\u0004\bF\u0010GJ\u001f\u0010I\u001a\u00020\n2\u0006\u0010H\u001a\u0002032\u0006\u0010-\u001a\u00020\u0014H\u0002¢\u0006\u0004\bI\u0010JJ\u001f\u0010L\u001a\u00020\n2\u0006\u0010K\u001a\u0002082\u0006\u0010-\u001a\u00020\u0014H\u0002¢\u0006\u0004\bL\u0010MJm\u0010V\u001a\u00020\n2\u0006\u0010=\u001a\u00020<2\u0006\u0010N\u001a\u00020?2\u0006\u0010O\u001a\u00020<2\u0014\u0010Q\u001a\u0010\u0012\u0004\u0012\u00020\"\u0012\u0004\u0012\u00020P\u0018\u00010!2\u0014\u0010R\u001a\u0010\u0012\u0004\u0012\u00020\"\u0012\u0004\u0012\u00020\"\u0018\u00010!2\u0006\u0010S\u001a\u00020\"2\u0006\u0010T\u001a\u00020<2\b\u0010U\u001a\u0004\u0018\u00010\u001bH\u0002¢\u0006\u0004\bV\u0010WJe\u0010X\u001a\u00020\n2\u0006\u0010=\u001a\u00020<2\u0006\u0010N\u001a\u00020?2\u0014\u0010Q\u001a\u0010\u0012\u0004\u0012\u00020\"\u0012\u0004\u0012\u00020P\u0018\u00010!2\u0014\u0010R\u001a\u0010\u0012\u0004\u0012\u00020\"\u0012\u0004\u0012\u00020\"\u0018\u00010!2\u0006\u0010S\u001a\u00020\"2\u0006\u0010T\u001a\u00020<2\b\u0010U\u001a\u0004\u0018\u00010\u001bH\u0002¢\u0006\u0004\bX\u0010YJ\u0015\u0010[\u001a\u0004\u0018\u00010Z*\u00020\u001dH\u0002¢\u0006\u0004\b[\u0010\\J\u0015\u0010^\u001a\u0004\u0018\u00010]*\u00020\u001dH\u0002¢\u0006\u0004\b^\u0010_J9\u0010e\u001a\u00020\"2\u0006\u0010`\u001a\u00020\"2\u0006\u0010a\u001a\u00020<2\u0006\u0010b\u001a\u00020?2\u0006\u0010c\u001a\u00020?2\b\u0010d\u001a\u0004\u0018\u00010\"H\u0002¢\u0006\u0004\be\u0010fR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010gR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010hR\u001e\u0010\u0015\u001a\n\u0012\u0004\u0012\u00020\u0014\u0018\u00010i8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0015\u0010jR\u001e\u0010\u0011\u001a\n\u0012\u0004\u0012\u00020\u0010\u0018\u00010i8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0011\u0010jR\u0018\u0010\u0017\u001a\u0004\u0018\u00010\u00168\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0017\u0010kR\u0018\u0010l\u001a\u0004\u0018\u00010\u001b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bl\u0010mR$\u0010\u001a\u001a\u0010\u0012\u0004\u0012\u00020\u0019\u0012\u0004\u0012\u00020\n\u0018\u00010\u00188\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001a\u0010nR\u001e\u0010 \u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\u001f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b \u0010oR2\u0010#\u001a\u001e\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\"\u0012\u0004\u0012\u00020\"\u0018\u00010!\u0012\u0004\u0012\u00020\n\u0018\u00010\u00188\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b#\u0010nR\u0018\u0010%\u001a\u0004\u0018\u00010$8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b%\u0010pR\u0014\u0010r\u001a\u00020q8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\br\u0010sR$\u0010\u001e\u001a\u0004\u0018\u00010\u001d8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001e\u0010t\u001a\u0004\bu\u0010v\"\u0004\bw\u0010xR\u001b\u0010{\u001a\u00020?8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\by\u0010z\u001a\u0004\b{\u0010|R\u0016\u0010\u007f\u001a\u0004\u0018\u00010\u001b8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b}\u0010~¨\u0006\u0081\u0001"}, d2 = {"Lru/ozon/app/android/product/addToCart/presentation/likezone/AddToCartContainerBinder;", "Lru/ozon/app/android/product/addToCart/presentation/AddToCartViewStateBinder;", "Lru/ozon/app/android/cart/common/domain/CartService;", "cartService", "Lru/ozon/app/android/network/abtool/FeatureChecker;", "featureChecker", "<init>", "(Lru/ozon/app/android/cart/common/domain/CartService;Lru/ozon/app/android/network/abtool/FeatureChecker;)V", "LWZ/l;", "tokenizedAnalytics", "", "init", "(LWZ/l;)V", "subscribe", "()V", TokenizedTrackingInfo.ACTION_UNSUBSCRIBE, "Ll10/i;", "composerContainer", "setup", "(Ll10/i;)V", "Lru/ozon/app/android/product/addToCart/presentation/likezone/AddToCartContainerView;", "buttonContainer", "Lru/ozon/app/android/storefront/data/tiles/addtocart/likezone/AddToCartContainerDTO;", "addToCartContainerDTO", "Lkotlin/Function1;", "Lru/ozon/uni/atoms/af/AtomAction;", "actionHandler", "", "buttonWidgetId", "Lru/ozon/uni/atoms/data/AtomActionDTO;", "recShelfAction", "Lkotlin/Function0;", "onPlusClicked", "", "", "onSuccess", "Lru/ozon/app/android/product/common/TileThemeConfigVO;", "theme", "bind", "(Lru/ozon/app/android/product/addToCart/presentation/likezone/AddToCartContainerView;Lru/ozon/app/android/storefront/data/tiles/addtocart/likezone/AddToCartContainerDTO;Lkotlin/jvm/functions/Function1;Ljava/lang/Long;Lru/ozon/uni/atoms/data/AtomActionDTO;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;Lru/ozon/app/android/product/common/TileThemeConfigVO;)V", "Lru/ozon/app/android/cart/common/models/CartItemInfo;", "personalCartItemInfo", "familyCartItemInfo", "handleCartUpdate", "(Lru/ozon/app/android/cart/common/models/CartItemInfo;Lru/ozon/app/android/cart/common/models/CartItemInfo;Lkotlin/coroutines/d;)Ljava/lang/Object;", "containerView", "bindButtonContainer", "(Lru/ozon/app/android/product/addToCart/presentation/likezone/AddToCartContainerView;Lru/ozon/app/android/storefront/data/tiles/addtocart/likezone/AddToCartContainerDTO;Lru/ozon/app/android/cart/common/models/CartItemInfo;Lru/ozon/app/android/cart/common/models/CartItemInfo;)V", "Lru/ozon/app/android/storefront/data/tiles/addtocart/AddToCartButtonDTO;", "addToCart", "cartItemInfo", "Lru/ozon/app/android/product/addToCart/presentation/likezone/AddToCartContainerView$PersonalCartData;", "getPersonalCartData", "(Lru/ozon/app/android/storefront/data/tiles/addtocart/AddToCartButtonDTO;Lru/ozon/app/android/cart/common/models/CartItemInfo;)Lru/ozon/app/android/product/addToCart/presentation/likezone/AddToCartContainerView$PersonalCartData;", "Lru/ozon/app/android/storefront/data/tiles/addtocart/likezone/FamilyButtonDTO;", "familyButton", "Lru/ozon/app/android/product/addToCart/presentation/likezone/AddToCartContainerView$FamilyCartData;", "getFamilyCartData", "(Lru/ozon/app/android/storefront/data/tiles/addtocart/likezone/FamilyButtonDTO;Lru/ozon/app/android/cart/common/models/CartItemInfo;)Lru/ozon/app/android/product/addToCart/presentation/likezone/AddToCartContainerView$FamilyCartData;", "buttonDTO", "", "currentCount", "maxItems", "", "isPersonalCartCounterPlusEnabled", "(Lru/ozon/app/android/storefront/data/tiles/addtocart/AddToCartButtonDTO;II)Z", "isFamilyCartCounterPlusEnabled", "(Lru/ozon/app/android/storefront/data/tiles/addtocart/likezone/FamilyButtonDTO;II)Z", "isPersonalCartButtonDisabled", "(Lru/ozon/app/android/storefront/data/tiles/addtocart/AddToCartButtonDTO;Lru/ozon/app/android/cart/common/models/CartItemInfo;II)Z", "isFamilyCartButtonDisabled", "(Lru/ozon/app/android/storefront/data/tiles/addtocart/likezone/FamilyButtonDTO;Lru/ozon/app/android/cart/common/models/CartItemInfo;II)Z", "personalCartData", "setPersonalCartListeners", "(Lru/ozon/app/android/product/addToCart/presentation/likezone/AddToCartContainerView$PersonalCartData;Lru/ozon/app/android/product/addToCart/presentation/likezone/AddToCartContainerView;)V", "familyCartData", "setFamilyCartListeners", "(Lru/ozon/app/android/product/addToCart/presentation/likezone/AddToCartContainerView$FamilyCartData;Lru/ozon/app/android/product/addToCart/presentation/likezone/AddToCartContainerView;)V", "isQuantityButtonProvided", "minItems", "Lru/ozon/android/tokenized/model/TokenizedTrackingInfo;", "trackingInfo", "params", "updateCartActionId", "updateCartActionQuantity", "updateCartActionSelectedDeliverySchema", "handleMinusButtonClicked", "(IZILjava/util/Map;Ljava/util/Map;Ljava/lang/String;ILjava/lang/Long;)V", "handlePlusButtonClicked", "(IZLjava/util/Map;Ljava/util/Map;Ljava/lang/String;ILjava/lang/Long;)V", "Lru/ozon/app/android/storefront/data/tiles/addtocart/AddToCartButtonDTO$QuantityButton$UpdateCartAction;", "getUpdateCartActionFromParams", "(Lru/ozon/uni/atoms/data/AtomActionDTO;)Lru/ozon/app/android/storefront/data/tiles/addtocart/AddToCartButtonDTO$QuantityButton$UpdateCartAction;", "Lru/ozon/app/android/storefront/data/tiles/addtocart/likezone/FamilyButtonDTO$QuantityButton$UpdateCartAction;", "getUpdateFamilyCartActionFromParams", "(Lru/ozon/uni/atoms/data/AtomActionDTO;)Lru/ozon/app/android/storefront/data/tiles/addtocart/likezone/FamilyButtonDTO$QuantityButton$UpdateCartAction;", AppMeasurementSdk.ConditionalUserProperty.NAME, "count", "isPlusDisabled", "isButtonDisabled", "automatizationId", "getLocator", "(Ljava/lang/String;IZZLjava/lang/String;)Ljava/lang/String;", "Lru/ozon/app/android/cart/common/domain/CartService;", "Lru/ozon/app/android/network/abtool/FeatureChecker;", "Ljava/lang/ref/WeakReference;", "Ljava/lang/ref/WeakReference;", "Lru/ozon/app/android/storefront/data/tiles/addtocart/likezone/AddToCartContainerDTO;", "containerWidgetId", "Ljava/lang/Long;", "Lkotlin/jvm/functions/Function1;", "Lkotlin/jvm/functions/Function0;", "Lru/ozon/app/android/product/common/TileThemeConfigVO;", "Lxe/M;", "scope", "Lxe/M;", "Lru/ozon/uni/atoms/data/AtomActionDTO;", "getRecShelfAction", "()Lru/ozon/uni/atoms/data/AtomActionDTO;", "setRecShelfAction", "(Lru/ozon/uni/atoms/data/AtomActionDTO;)V", "isLikezoneGradientTransformationEnabled$delegate", "LSc/j;", "isLikezoneGradientTransformationEnabled", "()Z", "getSkuId", "()Ljava/lang/Long;", "skuId", "Companion", "product_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class AddToCartContainerBinder implements AddToCartViewStateBinder {

    @NotNull
    private static final Companion Companion = new Companion(null);
    private Function1<? super AtomAction, Unit> actionHandler;
    private AddToCartContainerDTO addToCartContainerDTO;
    private WeakReference<AddToCartContainerView> buttonContainer;

    @NotNull
    private final CartService cartService;
    private WeakReference<i> composerContainer;
    private Long containerWidgetId;

    @NotNull
    private final FeatureChecker featureChecker;

    /* renamed from: isLikezoneGradientTransformationEnabled$delegate, reason: from kotlin metadata */
    @NotNull
    private final InterfaceC4008j isLikezoneGradientTransformationEnabled;
    private Function0<Unit> onPlusClicked;
    private Function1<? super Map<String, String>, Unit> onSuccess;
    private AtomActionDTO recShelfAction;

    @NotNull
    private final M scope;
    private TileThemeConfigVO theme;

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\t"}, d2 = {"Lru/ozon/app/android/product/addToCart/presentation/likezone/AddToCartContainerBinder$Companion;", "", "<init>", "()V", "LOCATOR_ADD_TO_CART", "", "LOCATOR_ADD_TO_FAMILY_CART", "LOCATOR_BUTTON_DISABLED", "LOCATOR_COUNTER_PLUS_DISABLED", "product_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    private static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    public AddToCartContainerBinder(@NotNull CartService cartService, @NotNull FeatureChecker featureChecker) {
        Intrinsics.checkNotNullParameter(cartService, "cartService");
        Intrinsics.checkNotNullParameter(featureChecker, "featureChecker");
        this.cartService = cartService;
        this.featureChecker = featureChecker;
        C10720e0 c10720e0 = C10720e0.f105451a;
        this.scope = N.a(He.b.f10879b.plus(X0.b()).plus(new AddToCartContainerBinder$special$$inlined$CoroutineExceptionHandler$1(J.f105405n0)));
        this.isLikezoneGradientTransformationEnabled = LazyUtilsKt.unsafeLazy(new AddToCartContainerBinder$isLikezoneGradientTransformationEnabled$2(this));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void bindButtonContainer(AddToCartContainerView containerView, AddToCartContainerDTO addToCartContainerDTO, CartItemInfo personalCartItemInfo, CartItemInfo familyCartItemInfo) {
        AddToCartContainerView addToCartContainerView;
        if (containerView == null) {
            return;
        }
        containerView.setVisibility(addToCartContainerDTO != null ? 0 : 8);
        if (addToCartContainerDTO == null) {
            return;
        }
        AddToCartContainerView.PersonalCartData personalCartData = getPersonalCartData(addToCartContainerDTO.getAddToCart(), personalCartItemInfo);
        AddToCartContainerView.FamilyCartData familyCartData = getFamilyCartData(addToCartContainerDTO.getFamilyButton(), familyCartItemInfo);
        if (Intrinsics.d(personalCartData, containerView.getPrevPersonalCartData()) && Intrinsics.d(familyCartData, containerView.getPrevFamilyCartData())) {
            addToCartContainerView = containerView;
        } else {
            addToCartContainerView = containerView;
            AddToCartContainerView.bind$default(addToCartContainerView, personalCartData, familyCartData, false, 4, null);
        }
        setPersonalCartListeners(personalCartData, addToCartContainerView);
        setFamilyCartListeners(familyCartData, addToCartContainerView);
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0038  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final AddToCartContainerView.FamilyCartData getFamilyCartData(FamilyButtonDTO familyButton, CartItemInfo familyCartItemInfo) {
        int i11;
        CommonControlSettings common;
        TestInfo testInfo;
        FamilyButtonDTO.QuantityButton.UpdateCartAction updateCartAction;
        String str = null;
        if (familyCartItemInfo != null && familyButton.getQuantityButton() != null) {
            Long selectedDeliverySchema = familyCartItemInfo.getSelectedDeliverySchema();
            FamilyButtonDTO.QuantityButton quantityButton = familyButton.getQuantityButton();
            if (Intrinsics.d(selectedDeliverySchema, (quantityButton == null || (updateCartAction = quantityButton.getUpdateCartAction()) == null) ? null : updateCartAction.getSelectedDeliverySchema())) {
                i11 = familyCartItemInfo.getQuantity();
                int i12 = i11;
                FamilyButtonDTO.QuantityButton quantityButton2 = familyButton.getQuantityButton();
                int maxItems = quantityButton2 == null ? quantityButton2.getMaxItems() : Integer.MAX_VALUE;
                boolean isFamilyCartButtonDisabled = isFamilyCartButtonDisabled(familyButton, familyCartItemInfo, i12, maxItems);
                boolean isFamilyCartCounterPlusEnabled = isFamilyCartCounterPlusEnabled(familyButton, i12, maxItems);
                boolean z11 = !isFamilyCartCounterPlusEnabled;
                common = familyButton.getActionButton().getCommon();
                if (common != null && (testInfo = common.getTestInfo()) != null) {
                    str = testInfo.getAutomatizationId();
                }
                return new AddToCartContainerView.FamilyCartData(familyButton, isFamilyCartButtonDisabled, i12, isFamilyCartCounterPlusEnabled, this.theme, isLikezoneGradientTransformationEnabled(), getLocator("AddToFamilyCartButton", i12, z11, isFamilyCartButtonDisabled, str));
            }
        }
        i11 = 0;
        int i122 = i11;
        FamilyButtonDTO.QuantityButton quantityButton22 = familyButton.getQuantityButton();
        if (quantityButton22 == null) {
        }
        boolean isFamilyCartButtonDisabled2 = isFamilyCartButtonDisabled(familyButton, familyCartItemInfo, i122, maxItems);
        boolean isFamilyCartCounterPlusEnabled2 = isFamilyCartCounterPlusEnabled(familyButton, i122, maxItems);
        boolean z112 = !isFamilyCartCounterPlusEnabled2;
        common = familyButton.getActionButton().getCommon();
        if (common != null) {
            str = testInfo.getAutomatizationId();
        }
        return new AddToCartContainerView.FamilyCartData(familyButton, isFamilyCartButtonDisabled2, i122, isFamilyCartCounterPlusEnabled2, this.theme, isLikezoneGradientTransformationEnabled(), getLocator("AddToFamilyCartButton", i122, z112, isFamilyCartButtonDisabled2, str));
    }

    private final String getLocator(String name, int count, boolean isPlusDisabled, boolean isButtonDisabled, String automatizationId) {
        if (automatizationId != null) {
            name = automatizationId;
        }
        StringBuilder sb2 = new StringBuilder(name);
        if (count == 0 && isButtonDisabled) {
            sb2.append("_disabled");
        } else if (isPlusDisabled) {
            sb2.append("_disabled_plus");
        }
        if (count > 0) {
            sb2.append("_" + count);
        }
        String sb3 = sb2.toString();
        Intrinsics.checkNotNullExpressionValue(sb3, "toString(...)");
        return sb3;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0038  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final AddToCartContainerView.PersonalCartData getPersonalCartData(AddToCartButtonDTO addToCart, CartItemInfo cartItemInfo) {
        int i11;
        CommonControlSettings common;
        TestInfo testInfo;
        AddToCartButtonDTO.QuantityButton.UpdateCartAction updateCartAction;
        String str = null;
        if (cartItemInfo != null && addToCart.getQuantityButton() != null) {
            Long selectedDeliverySchema = cartItemInfo.getSelectedDeliverySchema();
            AddToCartButtonDTO.QuantityButton quantityButton = addToCart.getQuantityButton();
            if (Intrinsics.d(selectedDeliverySchema, (quantityButton == null || (updateCartAction = quantityButton.getUpdateCartAction()) == null) ? null : updateCartAction.getSelectedDeliverySchema())) {
                i11 = cartItemInfo.getQuantity();
                int i12 = i11;
                AddToCartButtonDTO.QuantityButton quantityButton2 = addToCart.getQuantityButton();
                int maxItems = quantityButton2 == null ? quantityButton2.getMaxItems() : Integer.MAX_VALUE;
                boolean isPersonalCartButtonDisabled = isPersonalCartButtonDisabled(addToCart, cartItemInfo, i12, maxItems);
                boolean isPersonalCartCounterPlusEnabled = isPersonalCartCounterPlusEnabled(addToCart, i12, maxItems);
                boolean z11 = !isPersonalCartCounterPlusEnabled;
                common = addToCart.getActionButton().getCommon();
                if (common != null && (testInfo = common.getTestInfo()) != null) {
                    str = testInfo.getAutomatizationId();
                }
                return new AddToCartContainerView.PersonalCartData(addToCart, isPersonalCartButtonDisabled, i12, isPersonalCartCounterPlusEnabled, this.theme, isLikezoneGradientTransformationEnabled(), getLocator("AddToCartButton", i12, z11, isPersonalCartButtonDisabled, str));
            }
        }
        i11 = 0;
        int i122 = i11;
        AddToCartButtonDTO.QuantityButton quantityButton22 = addToCart.getQuantityButton();
        if (quantityButton22 == null) {
        }
        boolean isPersonalCartButtonDisabled2 = isPersonalCartButtonDisabled(addToCart, cartItemInfo, i122, maxItems);
        boolean isPersonalCartCounterPlusEnabled2 = isPersonalCartCounterPlusEnabled(addToCart, i122, maxItems);
        boolean z112 = !isPersonalCartCounterPlusEnabled2;
        common = addToCart.getActionButton().getCommon();
        if (common != null) {
            str = testInfo.getAutomatizationId();
        }
        return new AddToCartContainerView.PersonalCartData(addToCart, isPersonalCartButtonDisabled2, i122, isPersonalCartCounterPlusEnabled2, this.theme, isLikezoneGradientTransformationEnabled(), getLocator("AddToCartButton", i122, z112, isPersonalCartButtonDisabled2, str));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Long getSkuId() {
        AddToCartButtonDTO addToCart;
        String skuId;
        AddToCartContainerDTO addToCartContainerDTO = this.addToCartContainerDTO;
        if (addToCartContainerDTO == null || (addToCart = addToCartContainerDTO.getAddToCart()) == null || (skuId = addToCart.getSkuId()) == null) {
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

    /* JADX INFO: Access modifiers changed from: private */
    public final FamilyButtonDTO.QuantityButton.UpdateCartAction getUpdateFamilyCartActionFromParams(AtomActionDTO atomActionDTO) {
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
        return new FamilyButtonDTO.QuantityButton.UpdateCartAction(str, intValue, l11);
    }

    private final Object handleCartUpdate(CartItemInfo cartItemInfo, CartItemInfo cartItemInfo2, kotlin.coroutines.d<? super Unit> dVar) {
        if (cartItemInfo == null) {
            Long skuId = getSkuId();
            cartItemInfo = skuId != null ? this.cartService.getCartStateByCartType(CartType.MAIN_CART).getItems().get(new Long(skuId.longValue())) : null;
        }
        if (cartItemInfo2 == null) {
            Long skuId2 = getSkuId();
            cartItemInfo2 = skuId2 != null ? this.cartService.getCartStateByCartType(CartType.FAMILY_CART).getItems().get(new Long(skuId2.longValue())) : null;
        }
        C10720e0 c10720e0 = C10720e0.f105451a;
        Object f7 = C10727i.f(s.f6650a, new AddToCartContainerBinder$handleCartUpdate$2(this, cartItemInfo, cartItemInfo2, null), dVar);
        return f7 == Wc.a.COROUTINE_SUSPENDED ? f7 : Unit.f71690a;
    }

    static /* synthetic */ Object handleCartUpdate$default(AddToCartContainerBinder addToCartContainerBinder, CartItemInfo cartItemInfo, CartItemInfo cartItemInfo2, kotlin.coroutines.d dVar, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            cartItemInfo = null;
        }
        if ((i11 & 2) != 0) {
            cartItemInfo2 = null;
        }
        return addToCartContainerBinder.handleCartUpdate(cartItemInfo, cartItemInfo2, dVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void handleMinusButtonClicked(int currentCount, boolean isQuantityButtonProvided, int minItems, Map<String, TokenizedTrackingInfo> trackingInfo, Map<String, String> params, String updateCartActionId, int updateCartActionQuantity, Long updateCartActionSelectedDeliverySchema) {
        if (isQuantityButtonProvided) {
            int i11 = currentCount - updateCartActionQuantity;
            C10727i.c(this.scope, null, null, new AddToCartContainerBinder$handleMinusButtonClicked$1(i11 >= minItems, this, updateCartActionId, i11, updateCartActionSelectedDeliverySchema, trackingInfo, params, null), 3);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void handlePlusButtonClicked(int currentCount, boolean isQuantityButtonProvided, Map<String, TokenizedTrackingInfo> trackingInfo, Map<String, String> params, String updateCartActionId, int updateCartActionQuantity, Long updateCartActionSelectedDeliverySchema) {
        C10727i.c(this.scope, null, null, new AddToCartContainerBinder$handlePlusButtonClicked$1(currentCount, this, isQuantityButtonProvided, updateCartActionQuantity, updateCartActionId, updateCartActionSelectedDeliverySchema, trackingInfo, params, null), 3);
    }

    private final boolean isFamilyCartButtonDisabled(FamilyButtonDTO buttonDTO, CartItemInfo cartItemInfo, int currentCount, int maxItems) {
        FamilyButtonDTO.QuantityButton.UpdateCartAction updateCartAction;
        FamilyButtonDTO.ActionButton actionButton;
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
            FamilyButtonDTO.QuantityButton quantityButton = buttonDTO.getQuantityButton();
            if (!Intrinsics.d((quantityButton == null || (updateCartAction = quantityButton.getUpdateCartAction()) == null) ? null : updateCartAction.getSelectedDeliverySchema(), cartItemInfo.getSelectedDeliverySchema())) {
                return true;
            }
        }
        return false;
    }

    private final boolean isFamilyCartCounterPlusEnabled(FamilyButtonDTO buttonDTO, int currentCount, int maxItems) {
        AtomActionDTO action;
        FamilyButtonDTO.QuantityButton.UpdateCartAction updateFamilyCartActionFromParams;
        FamilyButtonDTO.QuantityButton.UpdateCartAction updateCartAction;
        Integer num = null;
        if (currentCount > 0) {
            FamilyButtonDTO.QuantityButton quantityButton = buttonDTO.getQuantityButton();
            if (quantityButton != null && (updateCartAction = quantityButton.getUpdateCartAction()) != null) {
                num = Integer.valueOf(updateCartAction.getQuantity());
            }
        } else {
            CommonControlSettings common = buttonDTO.getActionButton().getCommon();
            if (common != null && (action = common.getAction()) != null && (updateFamilyCartActionFromParams = getUpdateFamilyCartActionFromParams(action)) != null) {
                num = Integer.valueOf(updateFamilyCartActionFromParams.getQuantity());
            }
        }
        return currentCount + (num != null ? num.intValue() : 1) <= maxItems;
    }

    private final boolean isLikezoneGradientTransformationEnabled() {
        return ((Boolean) this.isLikezoneGradientTransformationEnabled.getValue()).booleanValue();
    }

    private final boolean isPersonalCartButtonDisabled(AddToCartButtonDTO buttonDTO, CartItemInfo cartItemInfo, int currentCount, int maxItems) {
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

    private final boolean isPersonalCartCounterPlusEnabled(AddToCartButtonDTO buttonDTO, int currentCount, int maxItems) {
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

    private final void setFamilyCartListeners(final AddToCartContainerView.FamilyCartData familyCartData, AddToCartContainerView containerView) {
        containerView.setFamilyCartListener(new AddToCartContainerView.FamilyCartListener() { // from class: ru.ozon.app.android.product.addToCart.presentation.likezone.AddToCartContainerBinder$setFamilyCartListeners$1
            @Override // ru.ozon.app.android.product.addToCart.presentation.likezone.AddToCartContainerView.FamilyCartListener
            public void onAction(CommonControlSettings commonControlSettings) {
                Function1 function1;
                FamilyButtonDTO.QuantityButton.UpdateCartAction updateFamilyCartActionFromParams;
                Intrinsics.checkNotNullParameter(commonControlSettings, "commonControlSettings");
                AtomActionDTO action = commonControlSettings.getAction();
                if (action == null) {
                    return;
                }
                if (Intrinsics.d(action.getId(), "addToCart")) {
                    updateFamilyCartActionFromParams = AddToCartContainerBinder.this.getUpdateFamilyCartActionFromParams(action);
                    if (updateFamilyCartActionFromParams != null) {
                        onPlusButtonClicked(updateFamilyCartActionFromParams);
                        return;
                    }
                    return;
                }
                function1 = AddToCartContainerBinder.this.actionHandler;
                if (function1 != null) {
                    function1.invoke(AtomActionMapperKt.toAtomAction(action, commonControlSettings.getTrackingInfo()));
                }
            }

            @Override // ru.ozon.app.android.product.addToCart.presentation.likezone.AddToCartContainerView.FamilyCartListener
            public void onMinusButtonClicked(FamilyButtonDTO.QuantityButton.UpdateCartAction updateCartAction) {
                Integer minItems;
                Intrinsics.checkNotNullParameter(updateCartAction, "updateCartAction");
                AddToCartContainerBinder addToCartContainerBinder = AddToCartContainerBinder.this;
                int currentCount = familyCartData.getCurrentCount();
                int i11 = 1;
                boolean z11 = familyCartData.getDto().getQuantityButton() != null;
                FamilyButtonDTO.QuantityButton quantityButton = familyCartData.getDto().getQuantityButton();
                if (quantityButton != null && (minItems = quantityButton.getMinItems()) != null) {
                    i11 = minItems.intValue();
                }
                addToCartContainerBinder.handleMinusButtonClicked(currentCount, z11, i11, familyCartData.getDto().getTrackingInfo(), familyCartData.getDto().getExtendMap(), updateCartAction.getId(), updateCartAction.getQuantity(), updateCartAction.getSelectedDeliverySchema());
            }

            @Override // ru.ozon.app.android.product.addToCart.presentation.likezone.AddToCartContainerView.FamilyCartListener
            public void onPlusButtonClicked(FamilyButtonDTO.QuantityButton.UpdateCartAction updateCartAction) {
                Intrinsics.checkNotNullParameter(updateCartAction, "updateCartAction");
                AddToCartContainerBinder.this.handlePlusButtonClicked(familyCartData.getCurrentCount(), familyCartData.getDto().getQuantityButton() != null, familyCartData.getDto().getTrackingInfo(), familyCartData.getDto().getExtendMap(), updateCartAction.getId(), updateCartAction.getQuantity(), updateCartAction.getSelectedDeliverySchema());
            }
        });
    }

    private final void setPersonalCartListeners(final AddToCartContainerView.PersonalCartData personalCartData, AddToCartContainerView containerView) {
        containerView.setPersonalCartListener(new AddToCartContainerView.PersonalCartListener() { // from class: ru.ozon.app.android.product.addToCart.presentation.likezone.AddToCartContainerBinder$setPersonalCartListeners$1
            @Override // ru.ozon.app.android.product.addToCart.presentation.likezone.AddToCartContainerView.PersonalCartListener
            public void onAction(CommonControlSettings commonControlSettings) {
                Function1 function1;
                AddToCartButtonDTO.QuantityButton.UpdateCartAction updateCartActionFromParams;
                Intrinsics.checkNotNullParameter(commonControlSettings, "commonControlSettings");
                AtomActionDTO action = commonControlSettings.getAction();
                if (action == null) {
                    return;
                }
                if (Intrinsics.d(action.getId(), "addToCart")) {
                    updateCartActionFromParams = AddToCartContainerBinder.this.getUpdateCartActionFromParams(action);
                    if (updateCartActionFromParams != null) {
                        onPlusButtonClicked(updateCartActionFromParams);
                        return;
                    }
                    return;
                }
                function1 = AddToCartContainerBinder.this.actionHandler;
                if (function1 != null) {
                    function1.invoke(AtomActionMapperKt.toAtomAction(action, commonControlSettings.getTrackingInfo()));
                }
            }

            @Override // ru.ozon.app.android.product.addToCart.presentation.likezone.AddToCartContainerView.PersonalCartListener
            public void onMinusButtonClicked(AddToCartButtonDTO.QuantityButton.UpdateCartAction updateCartAction) {
                Integer minItems;
                Intrinsics.checkNotNullParameter(updateCartAction, "updateCartAction");
                AddToCartContainerBinder addToCartContainerBinder = AddToCartContainerBinder.this;
                int currentCount = personalCartData.getCurrentCount();
                int i11 = 1;
                boolean z11 = personalCartData.getDto().getQuantityButton() != null;
                AddToCartButtonDTO.QuantityButton quantityButton = personalCartData.getDto().getQuantityButton();
                if (quantityButton != null && (minItems = quantityButton.getMinItems()) != null) {
                    i11 = minItems.intValue();
                }
                addToCartContainerBinder.handleMinusButtonClicked(currentCount, z11, i11, personalCartData.getDto().getTrackingInfo(), null, updateCartAction.getId(), updateCartAction.getQuantity(), updateCartAction.getSelectedDeliverySchema());
            }

            @Override // ru.ozon.app.android.product.addToCart.presentation.likezone.AddToCartContainerView.PersonalCartListener
            public void onPlusButtonClicked(AddToCartButtonDTO.QuantityButton.UpdateCartAction updateCartAction) {
                Intrinsics.checkNotNullParameter(updateCartAction, "updateCartAction");
                AddToCartContainerBinder.this.handlePlusButtonClicked(personalCartData.getCurrentCount(), personalCartData.getDto().getQuantityButton() != null, personalCartData.getDto().getTrackingInfo(), AddToCartButtonExtKt.getParams(personalCartData.getDto()), updateCartAction.getId(), updateCartAction.getQuantity(), updateCartAction.getSelectedDeliverySchema());
            }
        });
    }

    public final void bind(AddToCartContainerView buttonContainer, AddToCartContainerDTO addToCartContainerDTO, Function1<? super AtomAction, Unit> actionHandler, Long buttonWidgetId, AtomActionDTO recShelfAction, Function0<Unit> onPlusClicked, Function1<? super Map<String, String>, Unit> onSuccess, @NotNull TileThemeConfigVO theme) {
        Intrinsics.checkNotNullParameter(theme, "theme");
        this.buttonContainer = buttonContainer != null ? new WeakReference<>(buttonContainer) : null;
        this.addToCartContainerDTO = addToCartContainerDTO;
        this.actionHandler = actionHandler;
        this.containerWidgetId = buttonWidgetId;
        this.recShelfAction = recShelfAction;
        this.onPlusClicked = onPlusClicked;
        this.onSuccess = onSuccess;
        this.theme = theme;
        Long skuId = getSkuId();
        CartItemInfo cartItemInfo = skuId != null ? this.cartService.getCartStateByCartType(CartType.MAIN_CART).getItems().get(Long.valueOf(skuId.longValue())) : null;
        Long skuId2 = getSkuId();
        bindButtonContainer(buttonContainer, addToCartContainerDTO, cartItemInfo, skuId2 != null ? this.cartService.getCartStateByCartType(CartType.FAMILY_CART).getItems().get(Long.valueOf(skuId2.longValue())) : null);
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
        final I i11 = new I(CartService.DefaultImpls.observeCartStateFlow$default(this.cartService, false, 1, null));
        C2399j.C(new C2408n0(new InterfaceC2395h<CartState>() { // from class: ru.ozon.app.android.product.addToCart.presentation.likezone.AddToCartContainerBinder$subscribe$$inlined$filter$1

            @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
            /* renamed from: ru.ozon.app.android.product.addToCart.presentation.likezone.AddToCartContainerBinder$subscribe$$inlined$filter$1$2, reason: invalid class name */
            public static final class AnonymousClass2<T> implements InterfaceC2397i {
                final /* synthetic */ InterfaceC2397i $this_unsafeFlow;
                final /* synthetic */ AddToCartContainerBinder this$0;

                @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
                @kotlin.coroutines.jvm.internal.e(c = "ru.ozon.app.android.product.addToCart.presentation.likezone.AddToCartContainerBinder$subscribe$$inlined$filter$1$2", f = "AddToCartContainerBinder.kt", l = {50}, m = "emit")
                /* renamed from: ru.ozon.app.android.product.addToCart.presentation.likezone.AddToCartContainerBinder$subscribe$$inlined$filter$1$2$1, reason: invalid class name */
                public static final class AnonymousClass1 extends kotlin.coroutines.jvm.internal.c {
                    int label;
                    /* synthetic */ Object result;

                    public AnonymousClass1(kotlin.coroutines.d dVar) {
                        super(dVar);
                    }

                    @Override // kotlin.coroutines.jvm.internal.a
                    public final Object invokeSuspend(Object obj) {
                        this.result = obj;
                        this.label |= LinearLayoutManager.INVALID_OFFSET;
                        return AnonymousClass2.this.emit(null, this);
                    }
                }

                public AnonymousClass2(InterfaceC2397i interfaceC2397i, AddToCartContainerBinder addToCartContainerBinder) {
                    this.$this_unsafeFlow = interfaceC2397i;
                    this.this$0 = addToCartContainerBinder;
                }

                /* JADX WARN: Removed duplicated region for block: B:15:0x002f  */
                /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
                @Override // Ae.InterfaceC2397i
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final Object emit(Object obj, kotlin.coroutines.d dVar) {
                    AnonymousClass1 anonymousClass1;
                    int i11;
                    AddToCartContainerDTO addToCartContainerDTO;
                    AddToCartButtonDTO addToCart;
                    if (dVar instanceof AnonymousClass1) {
                        anonymousClass1 = (AnonymousClass1) dVar;
                        int i12 = anonymousClass1.label;
                        if ((i12 & LinearLayoutManager.INVALID_OFFSET) != 0) {
                            anonymousClass1.label = i12 - LinearLayoutManager.INVALID_OFFSET;
                            Object obj2 = anonymousClass1.result;
                            Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
                            i11 = anonymousClass1.label;
                            if (i11 != 0) {
                                Sc.s.b(obj2);
                                InterfaceC2397i interfaceC2397i = this.$this_unsafeFlow;
                                addToCartContainerDTO = this.this$0.addToCartContainerDTO;
                                if (((addToCartContainerDTO == null || (addToCart = addToCartContainerDTO.getAddToCart()) == null) ? null : addToCart.getQuantityButton()) != null) {
                                    anonymousClass1.label = 1;
                                    if (interfaceC2397i.emit(obj, anonymousClass1) == aVar) {
                                        return aVar;
                                    }
                                }
                            } else {
                                if (i11 != 1) {
                                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                }
                                Sc.s.b(obj2);
                            }
                            return Unit.f71690a;
                        }
                    }
                    anonymousClass1 = new AnonymousClass1(dVar);
                    Object obj22 = anonymousClass1.result;
                    Wc.a aVar2 = Wc.a.COROUTINE_SUSPENDED;
                    i11 = anonymousClass1.label;
                    if (i11 != 0) {
                    }
                    return Unit.f71690a;
                }
            }

            @Override // Ae.InterfaceC2395h
            public Object collect(InterfaceC2397i<? super CartState> interfaceC2397i, kotlin.coroutines.d dVar) {
                Object collect = InterfaceC2395h.this.collect(new AnonymousClass2(interfaceC2397i, this), dVar);
                return collect == Wc.a.COROUTINE_SUSPENDED ? collect : Unit.f71690a;
            }
        }, new AddToCartContainerBinder$subscribe$2(this, null)), this.scope);
        final I i12 = new I(CartService.DefaultImpls.observeFamilyCartStateFlow$default(this.cartService, false, 1, null));
        C2399j.C(new C2408n0(new InterfaceC2395h<CartState>() { // from class: ru.ozon.app.android.product.addToCart.presentation.likezone.AddToCartContainerBinder$subscribe$$inlined$filter$2

            @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
            /* renamed from: ru.ozon.app.android.product.addToCart.presentation.likezone.AddToCartContainerBinder$subscribe$$inlined$filter$2$2, reason: invalid class name */
            public static final class AnonymousClass2<T> implements InterfaceC2397i {
                final /* synthetic */ InterfaceC2397i $this_unsafeFlow;
                final /* synthetic */ AddToCartContainerBinder this$0;

                @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
                @kotlin.coroutines.jvm.internal.e(c = "ru.ozon.app.android.product.addToCart.presentation.likezone.AddToCartContainerBinder$subscribe$$inlined$filter$2$2", f = "AddToCartContainerBinder.kt", l = {50}, m = "emit")
                /* renamed from: ru.ozon.app.android.product.addToCart.presentation.likezone.AddToCartContainerBinder$subscribe$$inlined$filter$2$2$1, reason: invalid class name */
                public static final class AnonymousClass1 extends kotlin.coroutines.jvm.internal.c {
                    int label;
                    /* synthetic */ Object result;

                    public AnonymousClass1(kotlin.coroutines.d dVar) {
                        super(dVar);
                    }

                    @Override // kotlin.coroutines.jvm.internal.a
                    public final Object invokeSuspend(Object obj) {
                        this.result = obj;
                        this.label |= LinearLayoutManager.INVALID_OFFSET;
                        return AnonymousClass2.this.emit(null, this);
                    }
                }

                public AnonymousClass2(InterfaceC2397i interfaceC2397i, AddToCartContainerBinder addToCartContainerBinder) {
                    this.$this_unsafeFlow = interfaceC2397i;
                    this.this$0 = addToCartContainerBinder;
                }

                /* JADX WARN: Removed duplicated region for block: B:15:0x002f  */
                /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
                @Override // Ae.InterfaceC2397i
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final Object emit(Object obj, kotlin.coroutines.d dVar) {
                    AnonymousClass1 anonymousClass1;
                    int i11;
                    AddToCartContainerDTO addToCartContainerDTO;
                    FamilyButtonDTO familyButton;
                    if (dVar instanceof AnonymousClass1) {
                        anonymousClass1 = (AnonymousClass1) dVar;
                        int i12 = anonymousClass1.label;
                        if ((i12 & LinearLayoutManager.INVALID_OFFSET) != 0) {
                            anonymousClass1.label = i12 - LinearLayoutManager.INVALID_OFFSET;
                            Object obj2 = anonymousClass1.result;
                            Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
                            i11 = anonymousClass1.label;
                            if (i11 != 0) {
                                Sc.s.b(obj2);
                                InterfaceC2397i interfaceC2397i = this.$this_unsafeFlow;
                                addToCartContainerDTO = this.this$0.addToCartContainerDTO;
                                if (((addToCartContainerDTO == null || (familyButton = addToCartContainerDTO.getFamilyButton()) == null) ? null : familyButton.getQuantityButton()) != null) {
                                    anonymousClass1.label = 1;
                                    if (interfaceC2397i.emit(obj, anonymousClass1) == aVar) {
                                        return aVar;
                                    }
                                }
                            } else {
                                if (i11 != 1) {
                                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                }
                                Sc.s.b(obj2);
                            }
                            return Unit.f71690a;
                        }
                    }
                    anonymousClass1 = new AnonymousClass1(dVar);
                    Object obj22 = anonymousClass1.result;
                    Wc.a aVar2 = Wc.a.COROUTINE_SUSPENDED;
                    i11 = anonymousClass1.label;
                    if (i11 != 0) {
                    }
                    return Unit.f71690a;
                }
            }

            @Override // Ae.InterfaceC2395h
            public Object collect(InterfaceC2397i<? super CartState> interfaceC2397i, kotlin.coroutines.d dVar) {
                Object collect = InterfaceC2395h.this.collect(new AnonymousClass2(interfaceC2397i, this), dVar);
                return collect == Wc.a.COROUTINE_SUSPENDED ? collect : Unit.f71690a;
            }
        }, new AddToCartContainerBinder$subscribe$4(this, null)), this.scope);
    }

    @Override // ru.ozon.app.android.product.addToCart.presentation.AddToCartViewStateBinder
    public void unsubscribe() {
        E0.d(this.scope.getCoroutineContext());
    }
}
