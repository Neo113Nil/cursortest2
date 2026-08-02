package ru.ozon.app.android.pdp.widgets.cartButtonV5.presentation;

import C.C2702w;
import He.b;
import I1.w;
import W10.c;
import android.content.SharedPreferences;
import androidx.lifecycle.P;
import androidx.lifecycle.w0;
import androidx.lifecycle.x0;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import h3.C6788a;
import java.util.Calendar;
import java.util.Map;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.h;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.action.v2.ActionV2Repository;
import ru.ozon.app.android.cart.common.domain.CartService;
import ru.ozon.app.android.cart.common.domain.CartType;
import ru.ozon.app.android.cart.common.models.CartItemInfo;
import ru.ozon.app.android.pdp.widgets.cartButtonV5.data.CartButtonV5DTO;
import ru.ozon.app.android.pdp.widgets.cartButtonV5.data.CartButtonV5DataResponse;
import ru.ozon.app.android.pdp.widgets.cartButtonV5.data.QuantTypeRepository;
import ru.ozon.app.android.pdp.widgets.cartButtonV5.presentation.CartButtonV5State;
import ru.ozon.app.android.pdp.widgets.cartButtonV5.presentation.CartButtonV5VO;
import ru.ozon.app.android.utils.livedata.BroadcastSingleLiveEvent;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.data.AtomActionDTO;
import ru.ozon.uni.atoms.data.text.TextDTO;
import xe.B0;
import xe.C10720e0;
import xe.C10727i;

@Metadata(d1 = {"\u0000¦\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u0003\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\t\b\u0001\u0018\u0000 a2\u00020\u0001:\u0001aB'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\r\u001a\u00020\fH\u0014¢\u0006\u0004\b\r\u0010\u000eJ\r\u0010\u000f\u001a\u00020\f¢\u0006\u0004\b\u000f\u0010\u000eJ_\u0010\u001c\u001a\u0014\u0012\u0006\u0012\u0004\u0018\u00010\u001b\u0012\u0006\u0012\u0004\u0018\u00010\u001b\u0018\u00010\u001a2\b\u0010\u0011\u001a\u0004\u0018\u00010\u00102\b\u0010\u0012\u001a\u0004\u0018\u00010\u00102\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0016\u001a\u00020\u00152\b\u0010\u0017\u001a\u0004\u0018\u00010\u00102\b\u0010\u0018\u001a\u0004\u0018\u00010\u00102\u0006\u0010\u0019\u001a\u00020\u0015¢\u0006\u0004\b\u001c\u0010\u001dJ\r\u0010\u001e\u001a\u00020\f¢\u0006\u0004\b\u001e\u0010\u000eJ\u001d\u0010#\u001a\u00020\f2\u0006\u0010 \u001a\u00020\u001f2\u0006\u0010\"\u001a\u00020!¢\u0006\u0004\b#\u0010$J\u0015\u0010&\u001a\u00020\f2\u0006\u0010 \u001a\u00020%¢\u0006\u0004\b&\u0010'J\u0015\u0010(\u001a\u00020\f2\u0006\u0010 \u001a\u00020%¢\u0006\u0004\b(\u0010'J\u0015\u0010)\u001a\u00020\f2\u0006\u0010 \u001a\u00020%¢\u0006\u0004\b)\u0010'J)\u0010.\u001a\u00020\f2\u0006\u0010+\u001a\u00020*2\b\b\u0002\u0010,\u001a\u00020\u00132\b\b\u0002\u0010-\u001a\u00020\u0013¢\u0006\u0004\b.\u0010/J\u0017\u00101\u001a\u00020\u00132\u0006\u00100\u001a\u00020\u0010H\u0002¢\u0006\u0004\b1\u00102J\u0017\u00103\u001a\u00020\f2\u0006\u00100\u001a\u00020\u0010H\u0002¢\u0006\u0004\b3\u00104J\u001f\u0010&\u001a\u00020\f2\u0006\u0010 \u001a\u00020%2\u0006\u00105\u001a\u00020\u0010H\u0002¢\u0006\u0004\b&\u00106J\u001b\u00109\u001a\u00020\f2\n\b\u0002\u00108\u001a\u0004\u0018\u000107H\u0002¢\u0006\u0004\b9\u0010:J'\u0010<\u001a\u00020\f2\u0006\u0010 \u001a\u00020%2\u0006\u0010;\u001a\u00020\u001b2\u0006\u00105\u001a\u00020\u0010H\u0002¢\u0006\u0004\b<\u0010=J\u0019\u0010@\u001a\u00020\f2\b\u0010?\u001a\u0004\u0018\u00010>H\u0002¢\u0006\u0004\b@\u0010AJ\u001f\u0010D\u001a\u00020\u001f2\u0006\u0010 \u001a\u00020\u001f2\u0006\u0010C\u001a\u00020BH\u0002¢\u0006\u0004\bD\u0010ER\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010FR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010GR\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010HR\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010IR\u001a\u0010L\u001a\b\u0012\u0004\u0012\u00020K0J8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bL\u0010MR\u001d\u0010?\u001a\b\u0012\u0004\u0012\u00020K0N8\u0006¢\u0006\f\n\u0004\b?\u0010O\u001a\u0004\bP\u0010QR\u0018\u0010S\u001a\u0004\u0018\u00010R8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bS\u0010TR\u0018\u0010U\u001a\u0004\u0018\u00010%8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bU\u0010VR\u0016\u0010W\u001a\u00020\u00138\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bW\u0010XR\u0018\u0010Z\u001a\u0004\u0018\u00010Y8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bZ\u0010[R\u0018\u0010\\\u001a\u0004\u0018\u00010Y8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\\\u0010[R$\u0010^\u001a\u00020\u00132\u0006\u0010]\u001a\u00020\u00138\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\b^\u0010X\u001a\u0004\b_\u0010`¨\u0006b"}, d2 = {"Lru/ozon/app/android/pdp/widgets/cartButtonV5/presentation/CartButtonV5ViewModel;", "Landroidx/lifecycle/w0;", "Lru/ozon/app/android/cart/common/domain/CartService;", "cartService", "Lru/ozon/app/android/action/v2/ActionV2Repository;", "actionV2Repository", "Lru/ozon/app/android/pdp/widgets/cartButtonV5/data/QuantTypeRepository;", "quantTypeRepository", "Landroid/content/SharedPreferences;", "sharedPreferences", "<init>", "(Lru/ozon/app/android/cart/common/domain/CartService;Lru/ozon/app/android/action/v2/ActionV2Repository;Lru/ozon/app/android/pdp/widgets/cartButtonV5/data/QuantTypeRepository;Landroid/content/SharedPreferences;)V", "", "onCleared", "()V", "markAsyncDataShown", "", "firstButtonSku", "firstButtonDeliveryScheme", "", "firstIsForStars", "Lru/ozon/app/android/cart/common/domain/CartType;", "firstCartType", "secondButtonSku", "secondButtonDeliveryScheme", "secondCartType", "Lkotlin/Pair;", "", "getCurrentCartState", "(Ljava/lang/String;Ljava/lang/String;ZLru/ozon/app/android/cart/common/domain/CartType;Ljava/lang/String;Ljava/lang/String;Lru/ozon/app/android/cart/common/domain/CartType;)Lkotlin/Pair;", "releaseDataState", "Lru/ozon/app/android/pdp/widgets/cartButtonV5/presentation/CartButtonV5VO;", "cartVo", "LW10/c;", "trackingData", "fetchData", "(Lru/ozon/app/android/pdp/widgets/cartButtonV5/presentation/CartButtonV5VO;LW10/c;)V", "Lru/ozon/app/android/pdp/widgets/cartButtonV5/presentation/CartButtonV5VO$CartButton;", "addToCart", "(Lru/ozon/app/android/pdp/widgets/cartButtonV5/presentation/CartButtonV5VO$CartButton;)V", "incrementCount", "decrementCount", "Lru/ozon/app/android/pdp/widgets/cartButtonV5/data/CartButtonV5DTO$CartButton$Button$Tooltip;", "tooltip", "isFirst", "isSecond", "showTooltip", "(Lru/ozon/app/android/pdp/widgets/cartButtonV5/data/CartButtonV5DTO$CartButton$Button$Tooltip;ZZ)V", "tooltipKey", "shouldShowTooltip", "(Ljava/lang/String;)Z", "onTooltipShown", "(Ljava/lang/String;)V", "operationId", "(Lru/ozon/app/android/pdp/widgets/cartButtonV5/presentation/CartButtonV5VO$CartButton;Ljava/lang/String;)V", "", "throwable", "revertCartButtonState", "(Ljava/lang/Throwable;)V", "count", "updateCart", "(Lru/ozon/app/android/pdp/widgets/cartButtonV5/presentation/CartButtonV5VO$CartButton;ILjava/lang/String;)V", "Lru/ozon/uni/atoms/data/AtomActionDTO;", "action", "handleInfoDigitalParam", "(Lru/ozon/uni/atoms/data/AtomActionDTO;)V", "Lru/ozon/app/android/pdp/widgets/cartButtonV5/data/CartButtonV5DataResponse;", "model", "updateData", "(Lru/ozon/app/android/pdp/widgets/cartButtonV5/presentation/CartButtonV5VO;Lru/ozon/app/android/pdp/widgets/cartButtonV5/data/CartButtonV5DataResponse;)Lru/ozon/app/android/pdp/widgets/cartButtonV5/presentation/CartButtonV5VO;", "Lru/ozon/app/android/cart/common/domain/CartService;", "Lru/ozon/app/android/action/v2/ActionV2Repository;", "Lru/ozon/app/android/pdp/widgets/cartButtonV5/data/QuantTypeRepository;", "Landroid/content/SharedPreferences;", "Lru/ozon/app/android/utils/livedata/BroadcastSingleLiveEvent;", "Lru/ozon/app/android/pdp/widgets/cartButtonV5/presentation/CartButtonV5State;", "_action", "Lru/ozon/app/android/utils/livedata/BroadcastSingleLiveEvent;", "Landroidx/lifecycle/P;", "Landroidx/lifecycle/P;", "getAction", "()Landroidx/lifecycle/P;", "", "widgetId", "Ljava/lang/Long;", "previewCartButtonState", "Lru/ozon/app/android/pdp/widgets/cartButtonV5/presentation/CartButtonV5VO$CartButton;", "isUpdate", "Z", "Lxe/B0;", "job", "Lxe/B0;", "tooltipJob", AppMeasurementSdk.ConditionalUserProperty.VALUE, "hasAsyncDataShown", "getHasAsyncDataShown", "()Z", "Companion", "pdp_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class CartButtonV5ViewModel extends w0 {

    @NotNull
    private final BroadcastSingleLiveEvent<CartButtonV5State> _action;

    @NotNull
    private final P<CartButtonV5State> action;

    @NotNull
    private final ActionV2Repository actionV2Repository;

    @NotNull
    private final CartService cartService;
    private boolean hasAsyncDataShown;
    private boolean isUpdate;
    private B0 job;
    private CartButtonV5VO.CartButton previewCartButtonState;

    @NotNull
    private final QuantTypeRepository quantTypeRepository;

    @NotNull
    private final SharedPreferences sharedPreferences;
    private B0 tooltipJob;
    private Long widgetId;
    public static final int $stable = 8;

    public CartButtonV5ViewModel(@NotNull CartService cartService, @NotNull ActionV2Repository actionV2Repository, @NotNull QuantTypeRepository quantTypeRepository, @NotNull SharedPreferences sharedPreferences) {
        Intrinsics.checkNotNullParameter(cartService, "cartService");
        Intrinsics.checkNotNullParameter(actionV2Repository, "actionV2Repository");
        Intrinsics.checkNotNullParameter(quantTypeRepository, "quantTypeRepository");
        Intrinsics.checkNotNullParameter(sharedPreferences, "sharedPreferences");
        this.cartService = cartService;
        this.actionV2Repository = actionV2Repository;
        this.quantTypeRepository = quantTypeRepository;
        this.sharedPreferences = sharedPreferences;
        BroadcastSingleLiveEvent<CartButtonV5State> broadcastSingleLiveEvent = new BroadcastSingleLiveEvent<>();
        this._action = broadcastSingleLiveEvent;
        this.action = broadcastSingleLiveEvent;
        this.isUpdate = true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void handleInfoDigitalParam(AtomActionDTO action) {
        Map<String, String> params;
        String str;
        int i11;
        if (action == null || (params = action.getParams()) == null || (str = params.get("infoDigitalModalDeeplink")) == null || (i11 = Calendar.getInstance().get(6)) <= this.sharedPreferences.getInt(str, 0)) {
            return;
        }
        this._action.postValue(new CartButtonV5State.Action(new AtomAction.Move(str, null, null, null, 10, null)));
        SharedPreferences.Editor edit = this.sharedPreferences.edit();
        edit.putInt(str, i11);
        edit.apply();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void onTooltipShown(String tooltipKey) {
        C2702w.e(this.sharedPreferences, tooltipKey, false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void revertCartButtonState(Throwable throwable) {
        CartButtonV5VO.CartButton cartButton;
        if ((throwable instanceof CancellationException) || (cartButton = this.previewCartButtonState) == null) {
            return;
        }
        this._action.postValue(new CartButtonV5State.UpdateButton(cartButton, false));
    }

    static /* synthetic */ void revertCartButtonState$default(CartButtonV5ViewModel cartButtonV5ViewModel, Throwable th2, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            th2 = null;
        }
        cartButtonV5ViewModel.revertCartButtonState(th2);
    }

    private final boolean shouldShowTooltip(String tooltipKey) {
        return this.sharedPreferences.getBoolean(tooltipKey, true);
    }

    public static /* synthetic */ void showTooltip$default(CartButtonV5ViewModel cartButtonV5ViewModel, CartButtonV5DTO.CartButton.Button.Tooltip tooltip, boolean z11, boolean z12, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            z11 = false;
        }
        if ((i11 & 4) != 0) {
            z12 = false;
        }
        cartButtonV5ViewModel.showTooltip(tooltip, z11, z12);
    }

    private final void updateCart(CartButtonV5VO.CartButton cartVo, int count, String operationId) {
        Boolean forStars = cartVo.getToCart().getForStars();
        B0 b02 = this.job;
        if (b02 != null) {
            b02.j(null);
        }
        C6788a a11 = x0.a(this);
        C10720e0 c10720e0 = C10720e0.f105451a;
        this.job = C10727i.c(a11, b.f10879b, null, new CartButtonV5ViewModel$updateCart$1(cartVo, this, count, operationId, forStars, null), 2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:111:0x02af  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x02b7  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x02eb  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x0367  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x03c8  */
    /* JADX WARN: Removed duplicated region for block: B:171:0x033d  */
    /* JADX WARN: Removed duplicated region for block: B:174:0x02b4  */
    /* JADX WARN: Removed duplicated region for block: B:178:0x0265  */
    /* JADX WARN: Removed duplicated region for block: B:189:0x0222  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0205  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0232  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x0258  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0277  */
    /* JADX WARN: Type inference failed for: r0v39 */
    /* JADX WARN: Type inference failed for: r0v4 */
    /* JADX WARN: Type inference failed for: r0v5 */
    /* JADX WARN: Type inference failed for: r2v1 */
    /* JADX WARN: Type inference failed for: r2v2 */
    /* JADX WARN: Type inference failed for: r2v33 */
    /* JADX WARN: Type inference failed for: r5v26 */
    /* JADX WARN: Type inference failed for: r5v3 */
    /* JADX WARN: Type inference failed for: r5v4 */
    /* JADX WARN: Type inference failed for: r6v23 */
    /* JADX WARN: Type inference failed for: r6v4 */
    /* JADX WARN: Type inference failed for: r6v5 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final CartButtonV5VO updateData(CartButtonV5VO cartVo, CartButtonV5DataResponse model) {
        TextDTO title;
        CartButtonV5DTO.CartButton.Button toCart;
        TextDTO title2;
        TextDTO textDTO;
        TextDTO title3;
        TextDTO textDTO2;
        CartButtonV5DTO.CartButton.Button inCart;
        TextDTO title4;
        TextDTO textDTO3;
        CartButtonV5DataResponse.ButtonText firstButton;
        boolean z11;
        CartButtonV5DTO.CartButton.Button copy;
        CartButtonV5DTO.CartButton.Button inCart2;
        CartButtonV5DTO.CartButton.Button button;
        CartButtonV5VO.CartButton copy2;
        CartButtonV5VO.CartButton secondCartButton;
        boolean z12;
        CartButtonV5DTO.CartButton.Button copy3;
        CartButtonV5DTO.CartButton.Button inCart3;
        boolean z13;
        boolean z14;
        CartButtonV5DTO.CartButton.Button copy4;
        CartButtonV5DataResponse.ButtonText secondButton;
        CartButtonV5DTO.CartButton.Button inCart4;
        CartButtonV5DataResponse.ButtonText firstButton2;
        CartButtonV5DataResponse.ButtonText secondButton2;
        CartButtonV5DTO.CartButton.Button toCart2;
        CartButtonV5DataResponse.ButtonText firstButton3;
        CartButtonV5DTO.CartButton.Button inCart5;
        CartButtonV5DTO.CartButton.Button toCart3;
        CartButtonV5DTO.CartButton.Button copy5;
        CartButtonV5DTO.CartButton.Button button2;
        CartButtonV5VO.CartButton copy6;
        CartButtonV5DTO.CartButton.Button copy7;
        CartButtonV5DTO.CartButton.Button copy8;
        CartButtonV5VO.CartButton cartButton = null;
        CartButtonV5DTO.CartButton.Button button3 = null;
        CartButtonV5VO.CartButton cartButton2 = null;
        CartButtonV5DTO.CartButton.Button button4 = null;
        if (model.isTextToSubtitle()) {
            CartButtonV5VO.CartButton cartButton3 = cartVo.getCartButton();
            CartButtonV5DTO.CartButton.Button toCart4 = cartVo.getCartButton().getToCart();
            CartButtonV5DataResponse.ButtonText firstButton4 = model.getFirstButton();
            copy5 = toCart4.copy((r29 & 1) != 0 ? toCart4.backgroundColor : null, (r29 & 2) != 0 ? toCart4.cornerRadius : null, (r29 & 4) != 0 ? toCart4.title : null, (r29 & 8) != 0 ? toCart4.subtitle : null, (r29 & 16) != 0 ? toCart4.icon : null, (r29 & 32) != 0 ? toCart4.isNonIcon : true, (r29 & 64) != 0 ? toCart4.badge : null, (r29 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0 ? toCart4.action : null, (r29 & 256) != 0 ? toCart4.trackingInfo : null, (r29 & UserVerificationMethods.USER_VERIFY_NONE) != 0 ? toCart4.animationSubtitle : firstButton4 != null ? firstButton4.getToCartText() : null, (r29 & UserVerificationMethods.USER_VERIFY_ALL) != 0 ? toCart4.asyncFetchType : null, (r29 & 2048) != 0 ? toCart4.borderColor : null, (r29 & 4096) != 0 ? toCart4.showBorder : false, (r29 & 8192) != 0 ? toCart4.tooltip : null);
            CartButtonV5DTO.CartButton.Button inCart6 = cartVo.getCartButton().getInCart();
            if (inCart6 != null) {
                CartButtonV5DataResponse.ButtonText firstButton5 = model.getFirstButton();
                copy8 = inCart6.copy((r29 & 1) != 0 ? inCart6.backgroundColor : null, (r29 & 2) != 0 ? inCart6.cornerRadius : null, (r29 & 4) != 0 ? inCart6.title : null, (r29 & 8) != 0 ? inCart6.subtitle : null, (r29 & 16) != 0 ? inCart6.icon : null, (r29 & 32) != 0 ? inCart6.isNonIcon : true, (r29 & 64) != 0 ? inCart6.badge : null, (r29 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0 ? inCart6.action : null, (r29 & 256) != 0 ? inCart6.trackingInfo : null, (r29 & UserVerificationMethods.USER_VERIFY_NONE) != 0 ? inCart6.animationSubtitle : firstButton5 != null ? firstButton5.getInCartText() : null, (r29 & UserVerificationMethods.USER_VERIFY_ALL) != 0 ? inCart6.asyncFetchType : null, (r29 & 2048) != 0 ? inCart6.borderColor : null, (r29 & 4096) != 0 ? inCart6.showBorder : false, (r29 & 8192) != 0 ? inCart6.tooltip : null);
                button2 = copy8;
            } else {
                button2 = null;
            }
            copy6 = cartButton3.copy((r32 & 1) != 0 ? cartButton3.cartType : null, (r32 & 2) != 0 ? cartButton3.isInCart : false, (r32 & 4) != 0 ? cartButton3.toCart : copy5, (r32 & 8) != 0 ? cartButton3.inCart : button2, (r32 & 16) != 0 ? cartButton3.additionalButton : null, (r32 & 32) != 0 ? cartButton3.sku : null, (r32 & 64) != 0 ? cartButton3.deliverySchema : null, (r32 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0 ? cartButton3.freeRest : 0, (r32 & 256) != 0 ? cartButton3.minAddToCartQuantity : 0, (r32 & UserVerificationMethods.USER_VERIFY_NONE) != 0 ? cartButton3.inCartQuantity : 0, (r32 & UserVerificationMethods.USER_VERIFY_ALL) != 0 ? cartButton3.multiplicityValue : 0, (r32 & 2048) != 0 ? cartButton3.quantMultiplicityValue : null, (r32 & 4096) != 0 ? cartButton3.otherQuantMultiplicityValue : null, (r32 & 8192) != 0 ? cartButton3.isHowLoader : false, (r32 & 16384) != 0 ? cartButton3.dismissAction : null);
            CartButtonV5VO.CartButton secondCartButton2 = cartVo.getSecondCartButton();
            if (secondCartButton2 != null) {
                CartButtonV5DTO.CartButton.Button toCart5 = cartVo.getSecondCartButton().getToCart();
                CartButtonV5DataResponse.ButtonText secondButton3 = model.getSecondButton();
                copy7 = toCart5.copy((r29 & 1) != 0 ? toCart5.backgroundColor : null, (r29 & 2) != 0 ? toCart5.cornerRadius : null, (r29 & 4) != 0 ? toCart5.title : null, (r29 & 8) != 0 ? toCart5.subtitle : null, (r29 & 16) != 0 ? toCart5.icon : null, (r29 & 32) != 0 ? toCart5.isNonIcon : true, (r29 & 64) != 0 ? toCart5.badge : null, (r29 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0 ? toCart5.action : null, (r29 & 256) != 0 ? toCart5.trackingInfo : null, (r29 & UserVerificationMethods.USER_VERIFY_NONE) != 0 ? toCart5.animationSubtitle : secondButton3 != null ? secondButton3.getToCartText() : null, (r29 & UserVerificationMethods.USER_VERIFY_ALL) != 0 ? toCart5.asyncFetchType : null, (r29 & 2048) != 0 ? toCart5.borderColor : null, (r29 & 4096) != 0 ? toCart5.showBorder : false, (r29 & 8192) != 0 ? toCart5.tooltip : null);
                CartButtonV5DTO.CartButton.Button inCart7 = cartVo.getSecondCartButton().getInCart();
                if (inCart7 != null) {
                    CartButtonV5DataResponse.ButtonText secondButton4 = model.getSecondButton();
                    button3 = inCart7.copy((r29 & 1) != 0 ? inCart7.backgroundColor : null, (r29 & 2) != 0 ? inCart7.cornerRadius : null, (r29 & 4) != 0 ? inCart7.title : null, (r29 & 8) != 0 ? inCart7.subtitle : null, (r29 & 16) != 0 ? inCart7.icon : null, (r29 & 32) != 0 ? inCart7.isNonIcon : true, (r29 & 64) != 0 ? inCart7.badge : null, (r29 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0 ? inCart7.action : null, (r29 & 256) != 0 ? inCart7.trackingInfo : null, (r29 & UserVerificationMethods.USER_VERIFY_NONE) != 0 ? inCart7.animationSubtitle : secondButton4 != null ? secondButton4.getInCartText() : null, (r29 & UserVerificationMethods.USER_VERIFY_ALL) != 0 ? inCart7.asyncFetchType : null, (r29 & 2048) != 0 ? inCart7.borderColor : null, (r29 & 4096) != 0 ? inCart7.showBorder : false, (r29 & 8192) != 0 ? inCart7.tooltip : null);
                }
                cartButton2 = secondCartButton2.copy((r32 & 1) != 0 ? secondCartButton2.cartType : null, (r32 & 2) != 0 ? secondCartButton2.isInCart : false, (r32 & 4) != 0 ? secondCartButton2.toCart : copy7, (r32 & 8) != 0 ? secondCartButton2.inCart : button3, (r32 & 16) != 0 ? secondCartButton2.additionalButton : null, (r32 & 32) != 0 ? secondCartButton2.sku : null, (r32 & 64) != 0 ? secondCartButton2.deliverySchema : null, (r32 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0 ? secondCartButton2.freeRest : 0, (r32 & 256) != 0 ? secondCartButton2.minAddToCartQuantity : 0, (r32 & UserVerificationMethods.USER_VERIFY_NONE) != 0 ? secondCartButton2.inCartQuantity : 0, (r32 & UserVerificationMethods.USER_VERIFY_ALL) != 0 ? secondCartButton2.multiplicityValue : 0, (r32 & 2048) != 0 ? secondCartButton2.quantMultiplicityValue : null, (r32 & 4096) != 0 ? secondCartButton2.otherQuantMultiplicityValue : null, (r32 & 8192) != 0 ? secondCartButton2.isHowLoader : false, (r32 & 16384) != 0 ? secondCartButton2.dismissAction : null);
            }
            return CartButtonV5VO.copy$default(cartVo, 0L, false, 0.0f, copy6, cartButton2, null, null, null, null, 487, null);
        }
        CartButtonV5DTO.CartButton.Button.AsyncFetchType asyncFetchType = cartVo.getCartButton().getToCart().getAsyncFetchType();
        CartButtonV5DTO.CartButton.Button.AsyncFetchType asyncFetchType2 = CartButtonV5DTO.CartButton.Button.AsyncFetchType.TITLE;
        ?? r02 = asyncFetchType == asyncFetchType2;
        CartButtonV5VO.CartButton secondCartButton3 = cartVo.getSecondCartButton();
        ?? r52 = ((secondCartButton3 == null || (toCart3 = secondCartButton3.getToCart()) == null) ? null : toCart3.getAsyncFetchType()) == asyncFetchType2;
        CartButtonV5DTO.CartButton.Button inCart8 = cartVo.getCartButton().getInCart();
        ?? r62 = (inCart8 != null ? inCart8.getAsyncFetchType() : null) == asyncFetchType2;
        CartButtonV5VO.CartButton secondCartButton4 = cartVo.getSecondCartButton();
        ?? r22 = ((secondCartButton4 == null || (inCart5 = secondCartButton4.getInCart()) == null) ? null : inCart5.getAsyncFetchType()) == asyncFetchType2;
        if (r02 == true) {
            CartButtonV5DataResponse.ButtonText firstButton6 = model.getFirstButton();
            if (firstButton6 == null || (title = firstButton6.getToCartText()) == null) {
                title = cartVo.getCartButton().getToCart().getTitle();
            }
        } else {
            title = cartVo.getCartButton().getToCart().getTitle();
        }
        TextDTO textDTO4 = title;
        TextDTO toCartText = (r02 == true || cartVo.getCartButton().getToCart().getAsyncFetchType() == CartButtonV5DTO.CartButton.Button.AsyncFetchType.NO_FETCH_TYPE || (firstButton3 = model.getFirstButton()) == null) ? null : firstButton3.getToCartText();
        if (r52 == true) {
            CartButtonV5DataResponse.ButtonText secondButton5 = model.getSecondButton();
            if (secondButton5 != null) {
                title2 = secondButton5.getToCartText();
            }
            title2 = null;
        } else {
            CartButtonV5VO.CartButton secondCartButton5 = cartVo.getSecondCartButton();
            if (secondCartButton5 != null && (toCart = secondCartButton5.getToCart()) != null) {
                title2 = toCart.getTitle();
            }
            title2 = null;
        }
        if (r52 == false) {
            CartButtonV5VO.CartButton secondCartButton6 = cartVo.getSecondCartButton();
            if (((secondCartButton6 == null || (toCart2 = secondCartButton6.getToCart()) == null) ? null : toCart2.getAsyncFetchType()) != CartButtonV5DTO.CartButton.Button.AsyncFetchType.NO_FETCH_TYPE && (secondButton2 = model.getSecondButton()) != null) {
                textDTO = secondButton2.getToCartText();
                if (r62 == true) {
                    CartButtonV5DTO.CartButton.Button inCart9 = cartVo.getCartButton().getInCart();
                    if (inCart9 != null) {
                        title3 = inCart9.getTitle();
                    }
                    title3 = null;
                } else {
                    CartButtonV5DataResponse.ButtonText firstButton7 = model.getFirstButton();
                    if (firstButton7 == null || (title3 = firstButton7.getInCartText()) == null) {
                        CartButtonV5DTO.CartButton.Button inCart10 = cartVo.getCartButton().getInCart();
                        if (inCart10 != null) {
                            title3 = inCart10.getTitle();
                        }
                        title3 = null;
                    }
                }
                if (r62 == false) {
                    CartButtonV5DTO.CartButton.Button inCart11 = cartVo.getCartButton().getInCart();
                    if ((inCart11 != null ? inCart11.getAsyncFetchType() : null) != CartButtonV5DTO.CartButton.Button.AsyncFetchType.NO_FETCH_TYPE && (firstButton2 = model.getFirstButton()) != null) {
                        textDTO2 = firstButton2.getInCartText();
                        if (r22 == true) {
                            CartButtonV5DataResponse.ButtonText secondButton6 = model.getSecondButton();
                            if (secondButton6 != null) {
                                title4 = secondButton6.getInCartText();
                            }
                            title4 = null;
                        } else {
                            CartButtonV5VO.CartButton secondCartButton7 = cartVo.getSecondCartButton();
                            if (secondCartButton7 != null && (inCart = secondCartButton7.getInCart()) != null) {
                                title4 = inCart.getTitle();
                            }
                            title4 = null;
                        }
                        if (r22 == false) {
                            CartButtonV5VO.CartButton secondCartButton8 = cartVo.getSecondCartButton();
                            if (((secondCartButton8 == null || (inCart4 = secondCartButton8.getInCart()) == null) ? null : inCart4.getAsyncFetchType()) != CartButtonV5DTO.CartButton.Button.AsyncFetchType.NO_FETCH_TYPE && (secondButton = model.getSecondButton()) != null) {
                                textDTO3 = secondButton.getInCartText();
                                CartButtonV5VO.CartButton cartButton4 = cartVo.getCartButton();
                                CartButtonV5DTO.CartButton.Button toCart6 = cartVo.getCartButton().getToCart();
                                firstButton = model.getFirstButton();
                                if ((firstButton == null ? firstButton.getToCartText() : null) == null) {
                                    CartButtonV5DataResponse.ButtonText secondButton7 = model.getSecondButton();
                                    if ((secondButton7 != null ? secondButton7.getToCartText() : null) == null) {
                                        z11 = true;
                                        copy = toCart6.copy((r29 & 1) != 0 ? toCart6.backgroundColor : null, (r29 & 2) != 0 ? toCart6.cornerRadius : null, (r29 & 4) != 0 ? toCart6.title : textDTO4, (r29 & 8) != 0 ? toCart6.subtitle : null, (r29 & 16) != 0 ? toCart6.icon : null, (r29 & 32) != 0 ? toCart6.isNonIcon : z11, (r29 & 64) != 0 ? toCart6.badge : null, (r29 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0 ? toCart6.action : null, (r29 & 256) != 0 ? toCart6.trackingInfo : null, (r29 & UserVerificationMethods.USER_VERIFY_NONE) != 0 ? toCart6.animationSubtitle : toCartText, (r29 & UserVerificationMethods.USER_VERIFY_ALL) != 0 ? toCart6.asyncFetchType : null, (r29 & 2048) != 0 ? toCart6.borderColor : null, (r29 & 4096) != 0 ? toCart6.showBorder : false, (r29 & 8192) != 0 ? toCart6.tooltip : null);
                                        inCart2 = cartVo.getCartButton().getInCart();
                                        if (inCart2 != null) {
                                            if (title3 == null) {
                                                title3 = cartVo.getCartButton().getInCart().getTitle();
                                            }
                                            TextDTO textDTO5 = title3;
                                            CartButtonV5DataResponse.ButtonText firstButton8 = model.getFirstButton();
                                            if ((firstButton8 != null ? firstButton8.getInCartText() : null) == null) {
                                                CartButtonV5DataResponse.ButtonText secondButton8 = model.getSecondButton();
                                                if ((secondButton8 != null ? secondButton8.getInCartText() : null) == null) {
                                                    z14 = true;
                                                    copy4 = inCart2.copy((r29 & 1) != 0 ? inCart2.backgroundColor : null, (r29 & 2) != 0 ? inCart2.cornerRadius : null, (r29 & 4) != 0 ? inCart2.title : textDTO5, (r29 & 8) != 0 ? inCart2.subtitle : null, (r29 & 16) != 0 ? inCart2.icon : null, (r29 & 32) != 0 ? inCart2.isNonIcon : z14, (r29 & 64) != 0 ? inCart2.badge : null, (r29 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0 ? inCart2.action : null, (r29 & 256) != 0 ? inCart2.trackingInfo : null, (r29 & UserVerificationMethods.USER_VERIFY_NONE) != 0 ? inCart2.animationSubtitle : textDTO2, (r29 & UserVerificationMethods.USER_VERIFY_ALL) != 0 ? inCart2.asyncFetchType : null, (r29 & 2048) != 0 ? inCart2.borderColor : null, (r29 & 4096) != 0 ? inCart2.showBorder : false, (r29 & 8192) != 0 ? inCart2.tooltip : null);
                                                    button = copy4;
                                                }
                                            }
                                            z14 = false;
                                            copy4 = inCart2.copy((r29 & 1) != 0 ? inCart2.backgroundColor : null, (r29 & 2) != 0 ? inCart2.cornerRadius : null, (r29 & 4) != 0 ? inCart2.title : textDTO5, (r29 & 8) != 0 ? inCart2.subtitle : null, (r29 & 16) != 0 ? inCart2.icon : null, (r29 & 32) != 0 ? inCart2.isNonIcon : z14, (r29 & 64) != 0 ? inCart2.badge : null, (r29 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0 ? inCart2.action : null, (r29 & 256) != 0 ? inCart2.trackingInfo : null, (r29 & UserVerificationMethods.USER_VERIFY_NONE) != 0 ? inCart2.animationSubtitle : textDTO2, (r29 & UserVerificationMethods.USER_VERIFY_ALL) != 0 ? inCart2.asyncFetchType : null, (r29 & 2048) != 0 ? inCart2.borderColor : null, (r29 & 4096) != 0 ? inCart2.showBorder : false, (r29 & 8192) != 0 ? inCart2.tooltip : null);
                                            button = copy4;
                                        } else {
                                            button = null;
                                        }
                                        copy2 = cartButton4.copy((r32 & 1) != 0 ? cartButton4.cartType : null, (r32 & 2) != 0 ? cartButton4.isInCart : false, (r32 & 4) != 0 ? cartButton4.toCart : copy, (r32 & 8) != 0 ? cartButton4.inCart : button, (r32 & 16) != 0 ? cartButton4.additionalButton : null, (r32 & 32) != 0 ? cartButton4.sku : null, (r32 & 64) != 0 ? cartButton4.deliverySchema : null, (r32 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0 ? cartButton4.freeRest : 0, (r32 & 256) != 0 ? cartButton4.minAddToCartQuantity : 0, (r32 & UserVerificationMethods.USER_VERIFY_NONE) != 0 ? cartButton4.inCartQuantity : 0, (r32 & UserVerificationMethods.USER_VERIFY_ALL) != 0 ? cartButton4.multiplicityValue : 0, (r32 & 2048) != 0 ? cartButton4.quantMultiplicityValue : null, (r32 & 4096) != 0 ? cartButton4.otherQuantMultiplicityValue : null, (r32 & 8192) != 0 ? cartButton4.isHowLoader : false, (r32 & 16384) != 0 ? cartButton4.dismissAction : null);
                                        secondCartButton = cartVo.getSecondCartButton();
                                        if (secondCartButton != null) {
                                            CartButtonV5DTO.CartButton.Button toCart7 = cartVo.getSecondCartButton().getToCart();
                                            if (title2 == null) {
                                                title2 = cartVo.getSecondCartButton().getToCart().getTitle();
                                            }
                                            TextDTO textDTO6 = title2;
                                            CartButtonV5DataResponse.ButtonText firstButton9 = model.getFirstButton();
                                            if ((firstButton9 != null ? firstButton9.getToCartText() : null) == null) {
                                                CartButtonV5DataResponse.ButtonText secondButton9 = model.getSecondButton();
                                                if ((secondButton9 != null ? secondButton9.getToCartText() : null) == null) {
                                                    z12 = true;
                                                    copy3 = toCart7.copy((r29 & 1) != 0 ? toCart7.backgroundColor : null, (r29 & 2) != 0 ? toCart7.cornerRadius : null, (r29 & 4) != 0 ? toCart7.title : textDTO6, (r29 & 8) != 0 ? toCart7.subtitle : null, (r29 & 16) != 0 ? toCart7.icon : null, (r29 & 32) != 0 ? toCart7.isNonIcon : z12, (r29 & 64) != 0 ? toCart7.badge : null, (r29 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0 ? toCart7.action : null, (r29 & 256) != 0 ? toCart7.trackingInfo : null, (r29 & UserVerificationMethods.USER_VERIFY_NONE) != 0 ? toCart7.animationSubtitle : textDTO, (r29 & UserVerificationMethods.USER_VERIFY_ALL) != 0 ? toCart7.asyncFetchType : null, (r29 & 2048) != 0 ? toCart7.borderColor : null, (r29 & 4096) != 0 ? toCart7.showBorder : false, (r29 & 8192) != 0 ? toCart7.tooltip : null);
                                                    inCart3 = cartVo.getSecondCartButton().getInCart();
                                                    if (inCart3 != null) {
                                                        if (title4 == null) {
                                                            title4 = cartVo.getSecondCartButton().getInCart().getTitle();
                                                        }
                                                        TextDTO textDTO7 = title4;
                                                        CartButtonV5DataResponse.ButtonText firstButton10 = model.getFirstButton();
                                                        if ((firstButton10 != null ? firstButton10.getInCartText() : null) == null) {
                                                            CartButtonV5DataResponse.ButtonText secondButton10 = model.getSecondButton();
                                                            if ((secondButton10 != null ? secondButton10.getInCartText() : null) == null) {
                                                                z13 = true;
                                                                button4 = inCart3.copy((r29 & 1) != 0 ? inCart3.backgroundColor : null, (r29 & 2) != 0 ? inCart3.cornerRadius : null, (r29 & 4) != 0 ? inCart3.title : textDTO7, (r29 & 8) != 0 ? inCart3.subtitle : null, (r29 & 16) != 0 ? inCart3.icon : null, (r29 & 32) != 0 ? inCart3.isNonIcon : z13, (r29 & 64) != 0 ? inCart3.badge : null, (r29 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0 ? inCart3.action : null, (r29 & 256) != 0 ? inCart3.trackingInfo : null, (r29 & UserVerificationMethods.USER_VERIFY_NONE) != 0 ? inCart3.animationSubtitle : textDTO3, (r29 & UserVerificationMethods.USER_VERIFY_ALL) != 0 ? inCart3.asyncFetchType : null, (r29 & 2048) != 0 ? inCart3.borderColor : null, (r29 & 4096) != 0 ? inCart3.showBorder : false, (r29 & 8192) != 0 ? inCart3.tooltip : null);
                                                            }
                                                        }
                                                        z13 = false;
                                                        button4 = inCart3.copy((r29 & 1) != 0 ? inCart3.backgroundColor : null, (r29 & 2) != 0 ? inCart3.cornerRadius : null, (r29 & 4) != 0 ? inCart3.title : textDTO7, (r29 & 8) != 0 ? inCart3.subtitle : null, (r29 & 16) != 0 ? inCart3.icon : null, (r29 & 32) != 0 ? inCart3.isNonIcon : z13, (r29 & 64) != 0 ? inCart3.badge : null, (r29 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0 ? inCart3.action : null, (r29 & 256) != 0 ? inCart3.trackingInfo : null, (r29 & UserVerificationMethods.USER_VERIFY_NONE) != 0 ? inCart3.animationSubtitle : textDTO3, (r29 & UserVerificationMethods.USER_VERIFY_ALL) != 0 ? inCart3.asyncFetchType : null, (r29 & 2048) != 0 ? inCart3.borderColor : null, (r29 & 4096) != 0 ? inCart3.showBorder : false, (r29 & 8192) != 0 ? inCart3.tooltip : null);
                                                    }
                                                    cartButton = secondCartButton.copy((r32 & 1) != 0 ? secondCartButton.cartType : null, (r32 & 2) != 0 ? secondCartButton.isInCart : false, (r32 & 4) != 0 ? secondCartButton.toCart : copy3, (r32 & 8) != 0 ? secondCartButton.inCart : button4, (r32 & 16) != 0 ? secondCartButton.additionalButton : null, (r32 & 32) != 0 ? secondCartButton.sku : null, (r32 & 64) != 0 ? secondCartButton.deliverySchema : null, (r32 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0 ? secondCartButton.freeRest : 0, (r32 & 256) != 0 ? secondCartButton.minAddToCartQuantity : 0, (r32 & UserVerificationMethods.USER_VERIFY_NONE) != 0 ? secondCartButton.inCartQuantity : 0, (r32 & UserVerificationMethods.USER_VERIFY_ALL) != 0 ? secondCartButton.multiplicityValue : 0, (r32 & 2048) != 0 ? secondCartButton.quantMultiplicityValue : null, (r32 & 4096) != 0 ? secondCartButton.otherQuantMultiplicityValue : null, (r32 & 8192) != 0 ? secondCartButton.isHowLoader : false, (r32 & 16384) != 0 ? secondCartButton.dismissAction : null);
                                                }
                                            }
                                            z12 = false;
                                            copy3 = toCart7.copy((r29 & 1) != 0 ? toCart7.backgroundColor : null, (r29 & 2) != 0 ? toCart7.cornerRadius : null, (r29 & 4) != 0 ? toCart7.title : textDTO6, (r29 & 8) != 0 ? toCart7.subtitle : null, (r29 & 16) != 0 ? toCart7.icon : null, (r29 & 32) != 0 ? toCart7.isNonIcon : z12, (r29 & 64) != 0 ? toCart7.badge : null, (r29 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0 ? toCart7.action : null, (r29 & 256) != 0 ? toCart7.trackingInfo : null, (r29 & UserVerificationMethods.USER_VERIFY_NONE) != 0 ? toCart7.animationSubtitle : textDTO, (r29 & UserVerificationMethods.USER_VERIFY_ALL) != 0 ? toCart7.asyncFetchType : null, (r29 & 2048) != 0 ? toCart7.borderColor : null, (r29 & 4096) != 0 ? toCart7.showBorder : false, (r29 & 8192) != 0 ? toCart7.tooltip : null);
                                            inCart3 = cartVo.getSecondCartButton().getInCart();
                                            if (inCart3 != null) {
                                            }
                                            cartButton = secondCartButton.copy((r32 & 1) != 0 ? secondCartButton.cartType : null, (r32 & 2) != 0 ? secondCartButton.isInCart : false, (r32 & 4) != 0 ? secondCartButton.toCart : copy3, (r32 & 8) != 0 ? secondCartButton.inCart : button4, (r32 & 16) != 0 ? secondCartButton.additionalButton : null, (r32 & 32) != 0 ? secondCartButton.sku : null, (r32 & 64) != 0 ? secondCartButton.deliverySchema : null, (r32 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0 ? secondCartButton.freeRest : 0, (r32 & 256) != 0 ? secondCartButton.minAddToCartQuantity : 0, (r32 & UserVerificationMethods.USER_VERIFY_NONE) != 0 ? secondCartButton.inCartQuantity : 0, (r32 & UserVerificationMethods.USER_VERIFY_ALL) != 0 ? secondCartButton.multiplicityValue : 0, (r32 & 2048) != 0 ? secondCartButton.quantMultiplicityValue : null, (r32 & 4096) != 0 ? secondCartButton.otherQuantMultiplicityValue : null, (r32 & 8192) != 0 ? secondCartButton.isHowLoader : false, (r32 & 16384) != 0 ? secondCartButton.dismissAction : null);
                                        }
                                        return CartButtonV5VO.copy$default(cartVo, 0L, false, 0.0f, copy2, cartButton, null, null, null, null, 487, null);
                                    }
                                }
                                z11 = false;
                                copy = toCart6.copy((r29 & 1) != 0 ? toCart6.backgroundColor : null, (r29 & 2) != 0 ? toCart6.cornerRadius : null, (r29 & 4) != 0 ? toCart6.title : textDTO4, (r29 & 8) != 0 ? toCart6.subtitle : null, (r29 & 16) != 0 ? toCart6.icon : null, (r29 & 32) != 0 ? toCart6.isNonIcon : z11, (r29 & 64) != 0 ? toCart6.badge : null, (r29 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0 ? toCart6.action : null, (r29 & 256) != 0 ? toCart6.trackingInfo : null, (r29 & UserVerificationMethods.USER_VERIFY_NONE) != 0 ? toCart6.animationSubtitle : toCartText, (r29 & UserVerificationMethods.USER_VERIFY_ALL) != 0 ? toCart6.asyncFetchType : null, (r29 & 2048) != 0 ? toCart6.borderColor : null, (r29 & 4096) != 0 ? toCart6.showBorder : false, (r29 & 8192) != 0 ? toCart6.tooltip : null);
                                inCart2 = cartVo.getCartButton().getInCart();
                                if (inCart2 != null) {
                                }
                                copy2 = cartButton4.copy((r32 & 1) != 0 ? cartButton4.cartType : null, (r32 & 2) != 0 ? cartButton4.isInCart : false, (r32 & 4) != 0 ? cartButton4.toCart : copy, (r32 & 8) != 0 ? cartButton4.inCart : button, (r32 & 16) != 0 ? cartButton4.additionalButton : null, (r32 & 32) != 0 ? cartButton4.sku : null, (r32 & 64) != 0 ? cartButton4.deliverySchema : null, (r32 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0 ? cartButton4.freeRest : 0, (r32 & 256) != 0 ? cartButton4.minAddToCartQuantity : 0, (r32 & UserVerificationMethods.USER_VERIFY_NONE) != 0 ? cartButton4.inCartQuantity : 0, (r32 & UserVerificationMethods.USER_VERIFY_ALL) != 0 ? cartButton4.multiplicityValue : 0, (r32 & 2048) != 0 ? cartButton4.quantMultiplicityValue : null, (r32 & 4096) != 0 ? cartButton4.otherQuantMultiplicityValue : null, (r32 & 8192) != 0 ? cartButton4.isHowLoader : false, (r32 & 16384) != 0 ? cartButton4.dismissAction : null);
                                secondCartButton = cartVo.getSecondCartButton();
                                if (secondCartButton != null) {
                                }
                                return CartButtonV5VO.copy$default(cartVo, 0L, false, 0.0f, copy2, cartButton, null, null, null, null, 487, null);
                            }
                        }
                        textDTO3 = null;
                        CartButtonV5VO.CartButton cartButton42 = cartVo.getCartButton();
                        CartButtonV5DTO.CartButton.Button toCart62 = cartVo.getCartButton().getToCart();
                        firstButton = model.getFirstButton();
                        if ((firstButton == null ? firstButton.getToCartText() : null) == null) {
                        }
                        z11 = false;
                        copy = toCart62.copy((r29 & 1) != 0 ? toCart62.backgroundColor : null, (r29 & 2) != 0 ? toCart62.cornerRadius : null, (r29 & 4) != 0 ? toCart62.title : textDTO4, (r29 & 8) != 0 ? toCart62.subtitle : null, (r29 & 16) != 0 ? toCart62.icon : null, (r29 & 32) != 0 ? toCart62.isNonIcon : z11, (r29 & 64) != 0 ? toCart62.badge : null, (r29 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0 ? toCart62.action : null, (r29 & 256) != 0 ? toCart62.trackingInfo : null, (r29 & UserVerificationMethods.USER_VERIFY_NONE) != 0 ? toCart62.animationSubtitle : toCartText, (r29 & UserVerificationMethods.USER_VERIFY_ALL) != 0 ? toCart62.asyncFetchType : null, (r29 & 2048) != 0 ? toCart62.borderColor : null, (r29 & 4096) != 0 ? toCart62.showBorder : false, (r29 & 8192) != 0 ? toCart62.tooltip : null);
                        inCart2 = cartVo.getCartButton().getInCart();
                        if (inCart2 != null) {
                        }
                        copy2 = cartButton42.copy((r32 & 1) != 0 ? cartButton42.cartType : null, (r32 & 2) != 0 ? cartButton42.isInCart : false, (r32 & 4) != 0 ? cartButton42.toCart : copy, (r32 & 8) != 0 ? cartButton42.inCart : button, (r32 & 16) != 0 ? cartButton42.additionalButton : null, (r32 & 32) != 0 ? cartButton42.sku : null, (r32 & 64) != 0 ? cartButton42.deliverySchema : null, (r32 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0 ? cartButton42.freeRest : 0, (r32 & 256) != 0 ? cartButton42.minAddToCartQuantity : 0, (r32 & UserVerificationMethods.USER_VERIFY_NONE) != 0 ? cartButton42.inCartQuantity : 0, (r32 & UserVerificationMethods.USER_VERIFY_ALL) != 0 ? cartButton42.multiplicityValue : 0, (r32 & 2048) != 0 ? cartButton42.quantMultiplicityValue : null, (r32 & 4096) != 0 ? cartButton42.otherQuantMultiplicityValue : null, (r32 & 8192) != 0 ? cartButton42.isHowLoader : false, (r32 & 16384) != 0 ? cartButton42.dismissAction : null);
                        secondCartButton = cartVo.getSecondCartButton();
                        if (secondCartButton != null) {
                        }
                        return CartButtonV5VO.copy$default(cartVo, 0L, false, 0.0f, copy2, cartButton, null, null, null, null, 487, null);
                    }
                }
                textDTO2 = null;
                if (r22 == true) {
                }
                if (r22 == false) {
                }
                textDTO3 = null;
                CartButtonV5VO.CartButton cartButton422 = cartVo.getCartButton();
                CartButtonV5DTO.CartButton.Button toCart622 = cartVo.getCartButton().getToCart();
                firstButton = model.getFirstButton();
                if ((firstButton == null ? firstButton.getToCartText() : null) == null) {
                }
                z11 = false;
                copy = toCart622.copy((r29 & 1) != 0 ? toCart622.backgroundColor : null, (r29 & 2) != 0 ? toCart622.cornerRadius : null, (r29 & 4) != 0 ? toCart622.title : textDTO4, (r29 & 8) != 0 ? toCart622.subtitle : null, (r29 & 16) != 0 ? toCart622.icon : null, (r29 & 32) != 0 ? toCart622.isNonIcon : z11, (r29 & 64) != 0 ? toCart622.badge : null, (r29 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0 ? toCart622.action : null, (r29 & 256) != 0 ? toCart622.trackingInfo : null, (r29 & UserVerificationMethods.USER_VERIFY_NONE) != 0 ? toCart622.animationSubtitle : toCartText, (r29 & UserVerificationMethods.USER_VERIFY_ALL) != 0 ? toCart622.asyncFetchType : null, (r29 & 2048) != 0 ? toCart622.borderColor : null, (r29 & 4096) != 0 ? toCart622.showBorder : false, (r29 & 8192) != 0 ? toCart622.tooltip : null);
                inCart2 = cartVo.getCartButton().getInCart();
                if (inCart2 != null) {
                }
                copy2 = cartButton422.copy((r32 & 1) != 0 ? cartButton422.cartType : null, (r32 & 2) != 0 ? cartButton422.isInCart : false, (r32 & 4) != 0 ? cartButton422.toCart : copy, (r32 & 8) != 0 ? cartButton422.inCart : button, (r32 & 16) != 0 ? cartButton422.additionalButton : null, (r32 & 32) != 0 ? cartButton422.sku : null, (r32 & 64) != 0 ? cartButton422.deliverySchema : null, (r32 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0 ? cartButton422.freeRest : 0, (r32 & 256) != 0 ? cartButton422.minAddToCartQuantity : 0, (r32 & UserVerificationMethods.USER_VERIFY_NONE) != 0 ? cartButton422.inCartQuantity : 0, (r32 & UserVerificationMethods.USER_VERIFY_ALL) != 0 ? cartButton422.multiplicityValue : 0, (r32 & 2048) != 0 ? cartButton422.quantMultiplicityValue : null, (r32 & 4096) != 0 ? cartButton422.otherQuantMultiplicityValue : null, (r32 & 8192) != 0 ? cartButton422.isHowLoader : false, (r32 & 16384) != 0 ? cartButton422.dismissAction : null);
                secondCartButton = cartVo.getSecondCartButton();
                if (secondCartButton != null) {
                }
                return CartButtonV5VO.copy$default(cartVo, 0L, false, 0.0f, copy2, cartButton, null, null, null, null, 487, null);
            }
        }
        textDTO = null;
        if (r62 == true) {
        }
        if (r62 == false) {
        }
        textDTO2 = null;
        if (r22 == true) {
        }
        if (r22 == false) {
        }
        textDTO3 = null;
        CartButtonV5VO.CartButton cartButton4222 = cartVo.getCartButton();
        CartButtonV5DTO.CartButton.Button toCart6222 = cartVo.getCartButton().getToCart();
        firstButton = model.getFirstButton();
        if ((firstButton == null ? firstButton.getToCartText() : null) == null) {
        }
        z11 = false;
        copy = toCart6222.copy((r29 & 1) != 0 ? toCart6222.backgroundColor : null, (r29 & 2) != 0 ? toCart6222.cornerRadius : null, (r29 & 4) != 0 ? toCart6222.title : textDTO4, (r29 & 8) != 0 ? toCart6222.subtitle : null, (r29 & 16) != 0 ? toCart6222.icon : null, (r29 & 32) != 0 ? toCart6222.isNonIcon : z11, (r29 & 64) != 0 ? toCart6222.badge : null, (r29 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0 ? toCart6222.action : null, (r29 & 256) != 0 ? toCart6222.trackingInfo : null, (r29 & UserVerificationMethods.USER_VERIFY_NONE) != 0 ? toCart6222.animationSubtitle : toCartText, (r29 & UserVerificationMethods.USER_VERIFY_ALL) != 0 ? toCart6222.asyncFetchType : null, (r29 & 2048) != 0 ? toCart6222.borderColor : null, (r29 & 4096) != 0 ? toCart6222.showBorder : false, (r29 & 8192) != 0 ? toCart6222.tooltip : null);
        inCart2 = cartVo.getCartButton().getInCart();
        if (inCart2 != null) {
        }
        copy2 = cartButton4222.copy((r32 & 1) != 0 ? cartButton4222.cartType : null, (r32 & 2) != 0 ? cartButton4222.isInCart : false, (r32 & 4) != 0 ? cartButton4222.toCart : copy, (r32 & 8) != 0 ? cartButton4222.inCart : button, (r32 & 16) != 0 ? cartButton4222.additionalButton : null, (r32 & 32) != 0 ? cartButton4222.sku : null, (r32 & 64) != 0 ? cartButton4222.deliverySchema : null, (r32 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0 ? cartButton4222.freeRest : 0, (r32 & 256) != 0 ? cartButton4222.minAddToCartQuantity : 0, (r32 & UserVerificationMethods.USER_VERIFY_NONE) != 0 ? cartButton4222.inCartQuantity : 0, (r32 & UserVerificationMethods.USER_VERIFY_ALL) != 0 ? cartButton4222.multiplicityValue : 0, (r32 & 2048) != 0 ? cartButton4222.quantMultiplicityValue : null, (r32 & 4096) != 0 ? cartButton4222.otherQuantMultiplicityValue : null, (r32 & 8192) != 0 ? cartButton4222.isHowLoader : false, (r32 & 16384) != 0 ? cartButton4222.dismissAction : null);
        secondCartButton = cartVo.getSecondCartButton();
        if (secondCartButton != null) {
        }
        return CartButtonV5VO.copy$default(cartVo, 0L, false, 0.0f, copy2, cartButton, null, null, null, null, 487, null);
    }

    public final void addToCart(@NotNull CartButtonV5VO.CartButton cartVo) {
        Intrinsics.checkNotNullParameter(cartVo, "cartVo");
        this.previewCartButtonState = cartVo;
        addToCart(cartVo, "addToCart");
    }

    public final void decrementCount(@NotNull CartButtonV5VO.CartButton cartVo) {
        Integer otherQuantMultiplicityValue;
        int multiplicityValue;
        Integer quantMultiplicityValue;
        Intrinsics.checkNotNullParameter(cartVo, "cartVo");
        this.previewCartButtonState = cartVo;
        int inCartQuantity = cartVo.getInCartQuantity();
        if (((cartVo.getQuantMultiplicityValue() == null || ((quantMultiplicityValue = cartVo.getQuantMultiplicityValue()) != null && quantMultiplicityValue.intValue() == 0)) && (cartVo.getOtherQuantMultiplicityValue() == null || ((otherQuantMultiplicityValue = cartVo.getOtherQuantMultiplicityValue()) != null && otherQuantMultiplicityValue.intValue() == 0))) || inCartQuantity == 0) {
            multiplicityValue = inCartQuantity == cartVo.getMinAddToCartQuantity() ? 0 : inCartQuantity - cartVo.getMultiplicityValue();
        } else {
            this.quantTypeRepository.setLastCartType(cartVo.getCartType());
            Integer quantMultiplicityValue2 = cartVo.getQuantMultiplicityValue();
            int intValue = (quantMultiplicityValue2 == null && (quantMultiplicityValue2 = cartVo.getOtherQuantMultiplicityValue()) == null) ? 1 : quantMultiplicityValue2.intValue();
            multiplicityValue = (inCartQuantity / intValue) * intValue;
            if (inCartQuantity <= intValue) {
                multiplicityValue = inCartQuantity - 1;
            } else if (multiplicityValue == inCartQuantity) {
                multiplicityValue -= intValue;
            }
        }
        if (multiplicityValue != 0) {
            updateCart(cartVo, multiplicityValue, "minusButtonClick");
            return;
        }
        B0 b02 = this.job;
        if (b02 != null) {
            b02.j(null);
        }
        C6788a a11 = x0.a(this);
        C10720e0 c10720e0 = C10720e0.f105451a;
        this.job = C10727i.c(a11, b.f10879b, null, new CartButtonV5ViewModel$decrementCount$1(this, cartVo, multiplicityValue, null), 2);
    }

    public final void fetchData(@NotNull CartButtonV5VO cartVo, @NotNull c trackingData) {
        AtomActionDTO asyncAction;
        String link;
        Intrinsics.checkNotNullParameter(cartVo, "cartVo");
        Intrinsics.checkNotNullParameter(trackingData, "trackingData");
        CartButtonV5VO.CartButton cartButton = cartVo.getCartButton();
        if (!this.isUpdate || (asyncAction = cartVo.getAsyncAction()) == null || (link = asyncAction.getLink()) == null) {
            return;
        }
        this.isUpdate = false;
        C6788a a11 = x0.a(this);
        C10720e0 c10720e0 = C10720e0.f105451a;
        C10727i.c(a11, b.f10879b, null, new CartButtonV5ViewModel$fetchData$1$1(cartVo, link, this, trackingData, cartButton, null), 2);
    }

    @NotNull
    public final P<CartButtonV5State> getAction() {
        return this.action;
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x0077  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x008a  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0082  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Pair<Integer, Integer> getCurrentCartState(String firstButtonSku, String firstButtonDeliveryScheme, boolean firstIsForStars, @NotNull CartType firstCartType, String secondButtonSku, String secondButtonDeliveryScheme, @NotNull CartType secondCartType) {
        Integer num;
        Long y02;
        CartItemInfo cartItemInfo;
        int quantity;
        Long y03;
        Intrinsics.checkNotNullParameter(firstCartType, "firstCartType");
        Intrinsics.checkNotNullParameter(secondCartType, "secondCartType");
        Integer num2 = null;
        if (firstIsForStars) {
            return null;
        }
        if (firstButtonSku != null && (y03 = h.y0(firstButtonSku)) != null) {
            CartItemInfo cartItemInfo2 = this.cartService.getCartStateByCartType(firstCartType).getItems().get(Long.valueOf(y03.longValue()));
            int quantity2 = cartItemInfo2 != null ? cartItemInfo2.getQuantity() : 0;
            if (Intrinsics.d(cartItemInfo2 != null ? cartItemInfo2.getSelectedDeliverySchema() : null, firstButtonDeliveryScheme != null ? h.y0(firstButtonDeliveryScheme) : null) && quantity2 != 0) {
                num = Integer.valueOf(quantity2);
                if (secondButtonSku != null && (y02 = h.y0(secondButtonSku)) != null) {
                    cartItemInfo = this.cartService.getCartStateByCartType(secondCartType).getItems().get(Long.valueOf(y02.longValue()));
                    quantity = cartItemInfo != null ? cartItemInfo.getQuantity() : 0;
                    if (Intrinsics.d(cartItemInfo == null ? cartItemInfo.getSelectedDeliverySchema() : null, secondButtonDeliveryScheme == null ? h.y0(secondButtonDeliveryScheme) : null) && quantity != 0) {
                        num2 = Integer.valueOf(quantity);
                    }
                }
                return new Pair<>(num, num2);
            }
        }
        num = null;
        if (secondButtonSku != null) {
            cartItemInfo = this.cartService.getCartStateByCartType(secondCartType).getItems().get(Long.valueOf(y02.longValue()));
            if (cartItemInfo != null) {
            }
            if (Intrinsics.d(cartItemInfo == null ? cartItemInfo.getSelectedDeliverySchema() : null, secondButtonDeliveryScheme == null ? h.y0(secondButtonDeliveryScheme) : null)) {
                num2 = Integer.valueOf(quantity);
            }
        }
        return new Pair<>(num, num2);
    }

    public final boolean getHasAsyncDataShown() {
        return this.hasAsyncDataShown;
    }

    public final void incrementCount(@NotNull CartButtonV5VO.CartButton cartVo) {
        Intrinsics.checkNotNullParameter(cartVo, "cartVo");
        this.previewCartButtonState = cartVo;
        addToCart(cartVo, "plusButtonClick");
    }

    public final void markAsyncDataShown() {
        this.hasAsyncDataShown = true;
    }

    @Override // androidx.lifecycle.w0
    protected void onCleared() {
        super.onCleared();
        this.quantTypeRepository.clear();
    }

    public final void releaseDataState() {
        this.isUpdate = true;
    }

    public final void showTooltip(@NotNull CartButtonV5DTO.CartButton.Button.Tooltip tooltip, boolean isFirst, boolean isSecond) {
        Intrinsics.checkNotNullParameter(tooltip, "tooltip");
        if (shouldShowTooltip(tooltip.getTooltipKey())) {
            B0 b02 = this.tooltipJob;
            if (b02 != null) {
                b02.j(null);
            }
            C6788a a11 = x0.a(this);
            C10720e0 c10720e0 = C10720e0.f105451a;
            this.tooltipJob = C10727i.c(a11, b.f10879b, null, new CartButtonV5ViewModel$showTooltip$1(tooltip, this, isFirst, isSecond, null), 2);
        }
    }

    private final void addToCart(CartButtonV5VO.CartButton cartVo, String operationId) {
        Integer quantMultiplicityValue;
        int inCartQuantity = cartVo.getInCartQuantity();
        Integer otherQuantMultiplicityValue = cartVo.getOtherQuantMultiplicityValue();
        if ((cartVo.getQuantMultiplicityValue() != null && ((quantMultiplicityValue = cartVo.getQuantMultiplicityValue()) == null || quantMultiplicityValue.intValue() != 0)) || (otherQuantMultiplicityValue != null && otherQuantMultiplicityValue.intValue() != 0 && otherQuantMultiplicityValue.intValue() <= inCartQuantity)) {
            this.quantTypeRepository.setLastCartType(cartVo.getCartType());
            Integer quantMultiplicityValue2 = cartVo.getQuantMultiplicityValue();
            int intValue = (quantMultiplicityValue2 == null && (quantMultiplicityValue2 = cartVo.getOtherQuantMultiplicityValue()) == null) ? 1 : quantMultiplicityValue2.intValue();
            if (inCartQuantity != 0) {
                if (intValue > inCartQuantity) {
                    intValue = inCartQuantity + 1;
                } else {
                    intValue = w.a(inCartQuantity, intValue, intValue, intValue);
                    if (cartVo.getFreeRest() <= intValue) {
                        intValue = cartVo.getFreeRest();
                    }
                }
            }
            updateCart(cartVo, intValue, operationId);
            return;
        }
        int minAddToCartQuantity = cartVo.getMinAddToCartQuantity();
        int multiplicityValue = cartVo.getMultiplicityValue() + inCartQuantity;
        if (multiplicityValue >= minAddToCartQuantity) {
            minAddToCartQuantity = multiplicityValue;
        }
        if (cartVo.getFreeRest() - minAddToCartQuantity >= 0) {
            updateCart(cartVo, minAddToCartQuantity, operationId);
        }
    }
}
