package ru.ozon.app.android.pdp.widgets.cartButtonV5.presentation;

import Ge.f;
import Sc.r;
import Sc.s;
import Wc.a;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import io.reactivex.y;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.e;
import kotlin.coroutines.jvm.internal.j;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.h;
import ru.ozon.app.android.cart.common.data.CartAddItemDTO;
import ru.ozon.app.android.cart.common.domain.CartService;
import ru.ozon.app.android.pdp.widgets.cartButtonV4.CartButtonActionHandler;
import ru.ozon.app.android.pdp.widgets.cartButtonV5.data.CartButtonV5DTO;
import ru.ozon.app.android.pdp.widgets.cartButtonV5.presentation.CartButtonV5State;
import ru.ozon.app.android.pdp.widgets.cartButtonV5.presentation.CartButtonV5VO;
import ru.ozon.app.android.utils.livedata.BroadcastSingleLiveEvent;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.data.AtomActionDTO;
import ru.ozon.uni.atoms.data.text.TextDTO;
import ru.ozon.uni.atoms.utils.OzonSpannableStringKt;
import xe.M;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lxe/M;", "", "<anonymous>", "(Lxe/M;)V"}, k = 3, mv = {2, 0, 0})
@e(c = "ru.ozon.app.android.pdp.widgets.cartButtonV5.presentation.CartButtonV5ViewModel$updateCart$1", f = "CartButtonV5ViewModel.kt", l = {316}, m = "invokeSuspend")
/* loaded from: classes13.dex */
final class CartButtonV5ViewModel$updateCart$1 extends j implements Function2<M, d<? super Unit>, Object> {
    final /* synthetic */ CartButtonV5VO.CartButton $cartVo;
    final /* synthetic */ int $count;
    final /* synthetic */ Boolean $forStars;
    final /* synthetic */ String $operationId;
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ CartButtonV5ViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    CartButtonV5ViewModel$updateCart$1(CartButtonV5VO.CartButton cartButton, CartButtonV5ViewModel cartButtonV5ViewModel, int i11, String str, Boolean bool, d<? super CartButtonV5ViewModel$updateCart$1> dVar) {
        super(2, dVar);
        this.$cartVo = cartButton;
        this.this$0 = cartButtonV5ViewModel;
        this.$count = i11;
        this.$operationId = str;
        this.$forStars = bool;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final d<Unit> create(Object obj, d<?> dVar) {
        CartButtonV5ViewModel$updateCart$1 cartButtonV5ViewModel$updateCart$1 = new CartButtonV5ViewModel$updateCart$1(this.$cartVo, this.this$0, this.$count, this.$operationId, this.$forStars, dVar);
        cartButtonV5ViewModel$updateCart$1.L$0 = obj;
        return cartButtonV5ViewModel$updateCart$1;
    }

    /* JADX WARN: Code restructure failed: missing block: B:30:0x0172, code lost:
    
        if ((r0 != null ? r0.get("showRecoms") : null) != null) goto L53;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v17, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v18 */
    /* JADX WARN: Type inference failed for: r2v2 */
    /* JADX WARN: Type inference failed for: r2v22, types: [ru.ozon.uni.atoms.af.AtomAction] */
    /* JADX WARN: Type inference failed for: r2v25 */
    /* JADX WARN: Type inference failed for: r2v26 */
    /* JADX WARN: Type inference failed for: r2v27 */
    @Override // kotlin.coroutines.jvm.internal.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Object a11;
        ?? r22;
        BroadcastSingleLiveEvent broadcastSingleLiveEvent;
        CartButtonV5VO.CartButton copy;
        CartService cartService;
        Long l11;
        Object b11;
        BroadcastSingleLiveEvent broadcastSingleLiveEvent2;
        CartButtonV5VO.CartButton copy2;
        a aVar = a.COROUTINE_SUSPENDED;
        int i11 = this.label;
        try {
            if (i11 == 0) {
                s.b(obj);
                CartButtonActionHandler.Companion companion = CartButtonActionHandler.INSTANCE;
                AtomActionDTO action = this.$cartVo.getToCart().getAction();
                ?? r23 = companion.parseAdditionalAction(action != null ? action.getParams() : null);
                if (this.$cartVo.getIsInCart()) {
                    r23 = 0;
                }
                if (r23 == 0) {
                    broadcastSingleLiveEvent2 = this.this$0._action;
                    CartButtonV5DTO.CartButton.AdditionalButton additionalButton = this.$cartVo.getAdditionalButton();
                    copy2 = r9.copy((r32 & 1) != 0 ? r9.cartType : null, (r32 & 2) != 0 ? r9.isInCart : true, (r32 & 4) != 0 ? r9.toCart : null, (r32 & 8) != 0 ? r9.inCart : null, (r32 & 16) != 0 ? r9.additionalButton : additionalButton != null ? CartButtonV5DTO.CartButton.AdditionalButton.copy$default(additionalButton, null, TextDTO.copy$default(this.$cartVo.getAdditionalButton().getPlaceholder(), OzonSpannableStringKt.toOzonSpannableString(String.valueOf(this.$count)), null, null, null, null, null, null, null, null, null, null, null, null, false, null, null, null, null, null, 524286, null), null, null, null, 29, null) : null, (r32 & 32) != 0 ? r9.sku : null, (r32 & 64) != 0 ? r9.deliverySchema : null, (r32 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0 ? r9.freeRest : 0, (r32 & 256) != 0 ? r9.minAddToCartQuantity : 0, (r32 & UserVerificationMethods.USER_VERIFY_NONE) != 0 ? r9.inCartQuantity : this.$count, (r32 & UserVerificationMethods.USER_VERIFY_ALL) != 0 ? r9.multiplicityValue : 0, (r32 & 2048) != 0 ? r9.quantMultiplicityValue : null, (r32 & 4096) != 0 ? r9.otherQuantMultiplicityValue : null, (r32 & 8192) != 0 ? r9.isHowLoader : false, (r32 & 16384) != 0 ? this.$cartVo.dismissAction : null);
                    broadcastSingleLiveEvent2.postValue(new CartButtonV5State.UpdateButton(copy2, false));
                }
                this.this$0.handleInfoDigitalParam(this.$cartVo.getToCart().getAction());
                CartButtonV5ViewModel cartButtonV5ViewModel = this.this$0;
                CartButtonV5VO.CartButton cartButton = this.$cartVo;
                int i12 = this.$count;
                String str = this.$operationId;
                Boolean bool = this.$forStars;
                r.Companion companion2 = r.INSTANCE;
                cartService = cartButtonV5ViewModel.cartService;
                String valueOf = String.valueOf(cartButton.getSku());
                l11 = cartButtonV5ViewModel.widgetId;
                String deliverySchema = cartButton.getDeliverySchema();
                Long y02 = deliverySchema != null ? h.y0(deliverySchema) : null;
                AtomActionDTO action2 = cartButton.getToCart().getAction();
                y addProductToCartWithResponseResult$default = CartService.DefaultImpls.addProductToCartWithResponseResult$default(cartService, valueOf, i12, y02, null, l11, str, null, bool, null, action2 != null ? action2.getParams() : null, null, 1344, null);
                this.L$0 = r23;
                this.label = 1;
                b11 = f.b(addProductToCartWithResponseResult$default, this);
                i11 = r23;
                if (b11 == aVar) {
                    return aVar;
                }
            } else {
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ?? r24 = (AtomAction) this.L$0;
                s.b(obj);
                b11 = obj;
                i11 = r24;
            }
            a11 = (CartAddItemDTO) b11;
            r.Companion companion3 = r.INSTANCE;
            r22 = i11;
        } catch (Throwable th2) {
            r.Companion companion4 = r.INSTANCE;
            a11 = s.a(th2);
            r22 = i11;
        }
        AtomAction atomAction = r22;
        String str2 = this.$operationId;
        CartButtonV5ViewModel cartButtonV5ViewModel2 = this.this$0;
        CartButtonV5VO.CartButton cartButton2 = this.$cartVo;
        int i13 = this.$count;
        if (!(a11 instanceof r.b)) {
            CartAddItemDTO cartAddItemDTO = (CartAddItemDTO) a11;
            if (cartAddItemDTO.getSuccess()) {
                if (!Intrinsics.d(str2, "addToCart") || atomAction == null) {
                    Map<String, String> params = cartAddItemDTO.getParams();
                }
                broadcastSingleLiveEvent = cartButtonV5ViewModel2._action;
                Map<String, String> params2 = cartAddItemDTO.getParams();
                boolean z11 = (params2 != null ? params2.get("showRecoms") : null) != null;
                CartButtonV5DTO.CartButton.AdditionalButton additionalButton2 = cartButton2.getAdditionalButton();
                copy = cartButton2.copy((r32 & 1) != 0 ? cartButton2.cartType : null, (r32 & 2) != 0 ? cartButton2.isInCart : true, (r32 & 4) != 0 ? cartButton2.toCart : null, (r32 & 8) != 0 ? cartButton2.inCart : null, (r32 & 16) != 0 ? cartButton2.additionalButton : additionalButton2 != null ? CartButtonV5DTO.CartButton.AdditionalButton.copy$default(additionalButton2, null, TextDTO.copy$default(cartButton2.getAdditionalButton().getPlaceholder(), OzonSpannableStringKt.toOzonSpannableString(String.valueOf(i13)), null, null, null, null, null, null, null, null, null, null, null, null, false, null, null, null, null, null, 524286, null), null, null, null, 29, null) : null, (r32 & 32) != 0 ? cartButton2.sku : null, (r32 & 64) != 0 ? cartButton2.deliverySchema : null, (r32 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0 ? cartButton2.freeRest : 0, (r32 & 256) != 0 ? cartButton2.minAddToCartQuantity : 0, (r32 & UserVerificationMethods.USER_VERIFY_NONE) != 0 ? cartButton2.inCartQuantity : i13, (r32 & UserVerificationMethods.USER_VERIFY_ALL) != 0 ? cartButton2.multiplicityValue : 0, (r32 & 2048) != 0 ? cartButton2.quantMultiplicityValue : null, (r32 & 4096) != 0 ? cartButton2.otherQuantMultiplicityValue : null, (r32 & 8192) != 0 ? cartButton2.isHowLoader : false, (r32 & 16384) != 0 ? cartButton2.dismissAction : atomAction);
                broadcastSingleLiveEvent.postValue(new CartButtonV5State.UpdateButton(copy, z11));
            } else {
                CartButtonV5ViewModel.revertCartButtonState$default(cartButtonV5ViewModel2, null, 1, null);
            }
        }
        CartButtonV5ViewModel cartButtonV5ViewModel3 = this.this$0;
        Throwable b12 = r.b(a11);
        if (b12 != null) {
            cartButtonV5ViewModel3.revertCartButtonState(b12);
        }
        return Unit.f71690a;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(M m11, d<? super Unit> dVar) {
        return ((CartButtonV5ViewModel$updateCart$1) create(m11, dVar)).invokeSuspend(Unit.f71690a);
    }
}
