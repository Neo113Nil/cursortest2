package ru.ozon.app.android.pdp.widgets.cartButtonV5.presentation;

import Ge.f;
import Sc.r;
import Sc.s;
import Wc.a;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import io.reactivex.AbstractC7094b;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.e;
import kotlin.coroutines.jvm.internal.j;
import kotlin.jvm.functions.Function2;
import kotlin.text.h;
import ru.ozon.app.android.cart.common.domain.CartService;
import ru.ozon.app.android.pdp.widgets.cartButtonV5.data.CartButtonV5DTO;
import ru.ozon.app.android.pdp.widgets.cartButtonV5.presentation.CartButtonV5State;
import ru.ozon.app.android.pdp.widgets.cartButtonV5.presentation.CartButtonV5VO;
import ru.ozon.app.android.utils.livedata.BroadcastSingleLiveEvent;
import ru.ozon.uni.atoms.data.AtomActionDTO;
import ru.ozon.uni.atoms.data.text.TextDTO;
import ru.ozon.uni.atoms.utils.OzonSpannableStringKt;
import xe.M;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lxe/M;", "", "<anonymous>", "(Lxe/M;)V"}, k = 3, mv = {2, 0, 0})
@e(c = "ru.ozon.app.android.pdp.widgets.cartButtonV5.presentation.CartButtonV5ViewModel$decrementCount$1", f = "CartButtonV5ViewModel.kt", l = {210}, m = "invokeSuspend")
/* loaded from: classes13.dex */
final class CartButtonV5ViewModel$decrementCount$1 extends j implements Function2<M, d<? super Unit>, Object> {
    final /* synthetic */ CartButtonV5VO.CartButton $cartVo;
    final /* synthetic */ int $count;
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ CartButtonV5ViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    CartButtonV5ViewModel$decrementCount$1(CartButtonV5ViewModel cartButtonV5ViewModel, CartButtonV5VO.CartButton cartButton, int i11, d<? super CartButtonV5ViewModel$decrementCount$1> dVar) {
        super(2, dVar);
        this.this$0 = cartButtonV5ViewModel;
        this.$cartVo = cartButton;
        this.$count = i11;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final d<Unit> create(Object obj, d<?> dVar) {
        CartButtonV5ViewModel$decrementCount$1 cartButtonV5ViewModel$decrementCount$1 = new CartButtonV5ViewModel$decrementCount$1(this.this$0, this.$cartVo, this.$count, dVar);
        cartButtonV5ViewModel$decrementCount$1.L$0 = obj;
        return cartButtonV5ViewModel$decrementCount$1;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        Object a11;
        BroadcastSingleLiveEvent broadcastSingleLiveEvent;
        CartButtonV5VO.CartButton copy;
        CartService cartService;
        Long l11;
        a aVar = a.COROUTINE_SUSPENDED;
        int i11 = this.label;
        try {
            if (i11 == 0) {
                s.b(obj);
                broadcastSingleLiveEvent = this.this$0._action;
                CartButtonV5DTO.CartButton.AdditionalButton additionalButton = this.$cartVo.getAdditionalButton();
                copy = r7.copy((r32 & 1) != 0 ? r7.cartType : null, (r32 & 2) != 0 ? r7.isInCart : false, (r32 & 4) != 0 ? r7.toCart : null, (r32 & 8) != 0 ? r7.inCart : null, (r32 & 16) != 0 ? r7.additionalButton : additionalButton != null ? CartButtonV5DTO.CartButton.AdditionalButton.copy$default(additionalButton, null, TextDTO.copy$default(this.$cartVo.getAdditionalButton().getPlaceholder(), OzonSpannableStringKt.toOzonSpannableString(String.valueOf(this.$count)), null, null, null, null, null, null, null, null, null, null, null, null, false, null, null, null, null, null, 524286, null), null, null, null, 29, null) : null, (r32 & 32) != 0 ? r7.sku : null, (r32 & 64) != 0 ? r7.deliverySchema : null, (r32 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0 ? r7.freeRest : 0, (r32 & 256) != 0 ? r7.minAddToCartQuantity : 0, (r32 & UserVerificationMethods.USER_VERIFY_NONE) != 0 ? r7.inCartQuantity : this.$count, (r32 & UserVerificationMethods.USER_VERIFY_ALL) != 0 ? r7.multiplicityValue : 0, (r32 & 2048) != 0 ? r7.quantMultiplicityValue : null, (r32 & 4096) != 0 ? r7.otherQuantMultiplicityValue : null, (r32 & 8192) != 0 ? r7.isHowLoader : false, (r32 & 16384) != 0 ? this.$cartVo.dismissAction : null);
                broadcastSingleLiveEvent.postValue(new CartButtonV5State.UpdateButton(copy, false));
                CartButtonV5ViewModel cartButtonV5ViewModel = this.this$0;
                CartButtonV5VO.CartButton cartButton = this.$cartVo;
                int i12 = this.$count;
                r.Companion companion = r.INSTANCE;
                cartService = cartButtonV5ViewModel.cartService;
                String valueOf = String.valueOf(cartButton.getSku());
                l11 = cartButtonV5ViewModel.widgetId;
                String deliverySchema = cartButton.getDeliverySchema();
                Long y02 = deliverySchema != null ? h.y0(deliverySchema) : null;
                Boolean forStars = cartButton.getToCart().getForStars();
                AtomActionDTO action = cartButton.getToCart().getAction();
                AbstractC7094b removeProductFromCart = cartService.removeProductFromCart(valueOf, i12, y02, null, l11, forStars, action != null ? action.getParams() : null);
                this.label = 1;
                if (f.a(removeProductFromCart, this) == aVar) {
                    return aVar;
                }
            } else {
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                s.b(obj);
            }
            a11 = Unit.f71690a;
            r.Companion companion2 = r.INSTANCE;
        } catch (Throwable th2) {
            r.Companion companion3 = r.INSTANCE;
            a11 = s.a(th2);
        }
        CartButtonV5ViewModel cartButtonV5ViewModel2 = this.this$0;
        Throwable b11 = r.b(a11);
        if (b11 != null) {
            cartButtonV5ViewModel2.revertCartButtonState(b11);
        }
        return Unit.f71690a;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(M m11, d<? super Unit> dVar) {
        return ((CartButtonV5ViewModel$decrementCount$1) create(m11, dVar)).invokeSuspend(Unit.f71690a);
    }
}
