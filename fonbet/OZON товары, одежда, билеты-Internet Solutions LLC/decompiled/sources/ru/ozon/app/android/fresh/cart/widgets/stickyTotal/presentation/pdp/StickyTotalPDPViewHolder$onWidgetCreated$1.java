package ru.ozon.app.android.fresh.cart.widgets.stickyTotal.presentation.pdp;

import Sc.s;
import Wc.a;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.e;
import kotlin.coroutines.jvm.internal.j;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.text.h;
import ru.ozon.app.android.cart.common.domain.CartState;
import ru.ozon.app.android.cart.common.domain.local.CartSource;
import ru.ozon.app.android.cart.common.models.CartItemInfo;
import ru.ozon.app.android.fresh.cart.ui.molecules.cartPicker.presentation.CartPickerVO;
import ru.ozon.app.android.fresh.cart.widgets.stickyTotal.StickyTotalPDPCountPickerBinder;
import ru.ozon.app.android.fresh.cart.widgets.stickyTotal.presentation.StickyTotalVO;
import ru.ozon.uni.atoms.af.AtomAction;

@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n"}, d2 = {"<anonymous>", "", "cartState", "Lru/ozon/app/android/cart/common/domain/CartState;", "kotlin.jvm.PlatformType"}, k = 3, mv = {2, 0, 0}, xi = 48)
@e(c = "ru.ozon.app.android.fresh.cart.widgets.stickyTotal.presentation.pdp.StickyTotalPDPViewHolder$onWidgetCreated$1", f = "StickyTotalPDPViewHolder.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes12.dex */
final class StickyTotalPDPViewHolder$onWidgetCreated$1 extends j implements Function2<CartState, d<? super Unit>, Object> {
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ StickyTotalPDPViewHolder this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    StickyTotalPDPViewHolder$onWidgetCreated$1(StickyTotalPDPViewHolder stickyTotalPDPViewHolder, d<? super StickyTotalPDPViewHolder$onWidgetCreated$1> dVar) {
        super(2, dVar);
        this.this$0 = stickyTotalPDPViewHolder;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final d<Unit> create(Object obj, d<?> dVar) {
        StickyTotalPDPViewHolder$onWidgetCreated$1 stickyTotalPDPViewHolder$onWidgetCreated$1 = new StickyTotalPDPViewHolder$onWidgetCreated$1(this.this$0, dVar);
        stickyTotalPDPViewHolder$onWidgetCreated$1.L$0 = obj;
        return stickyTotalPDPViewHolder$onWidgetCreated$1;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0027, code lost:
    
        r5 = r19.this$0.getPdpState(r2);
     */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.coroutines.jvm.internal.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        StickyTotalVO.State.Pdp pdpState;
        StickyTotalPDPViewModel stickyTotalPDPViewModel;
        Long y02;
        int i11;
        StickyTotalPDPCountPickerBinder countPickerBinder;
        StickyTotalVO copy;
        AtomAction action;
        Function1 function1;
        a aVar = a.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        s.b(obj);
        CartState cartState = (CartState) this.L$0;
        StickyTotalVO stickyTotalVO = (StickyTotalVO) this.this$0.getBoundData();
        if (stickyTotalVO == null) {
            return Unit.f71690a;
        }
        StickyTotalVO stickyTotalVO2 = (StickyTotalVO) this.this$0.getBoundData();
        if (stickyTotalVO2 == null || pdpState == null) {
            return Unit.f71690a;
        }
        CartPickerVO countPicker = pdpState.getCountPicker();
        Map<String, String> params = countPicker.getQuantity().getChangeQuantityAction().getChangeValueAction().getParams();
        if (params == null && (params = countPicker.getQuantity().getDecrementRemoveAction().getAction().getParams()) == null) {
            return Unit.f71690a;
        }
        stickyTotalPDPViewModel = this.this$0.viewModel;
        String sku = stickyTotalPDPViewModel.getSKU(params);
        if (sku == null || (y02 = h.y0(sku)) == null) {
            return Unit.f71690a;
        }
        CartItemInfo cartItemInfo = cartState.getItems().get(new Long(y02.longValue()));
        int quantity = cartItemInfo != null ? cartItemInfo.getQuantity() : 0;
        i11 = this.this$0.currentQuantity;
        if (i11 != quantity) {
            this.this$0.currentQuantity = quantity;
            boolean z11 = quantity != 0;
            countPickerBinder = this.this$0.getCountPickerBinder();
            StickyTotalVO.State.Pdp copy$default = StickyTotalVO.State.Pdp.copy$default(pdpState, z11, null, null, 0L, countPickerBinder.createNewVO(countPicker, quantity), null, null, null, 238, null);
            StickyTotalPDPViewHolder stickyTotalPDPViewHolder = this.this$0;
            copy = stickyTotalVO.copy((r27 & 1) != 0 ? stickyTotalVO.id : 0L, (r27 & 2) != 0 ? stickyTotalVO.price : null, (r27 & 4) != 0 ? stickyTotalVO.state : copy$default, (r27 & 8) != 0 ? stickyTotalVO.unfavorablePrice : null, (r27 & 16) != 0 ? stickyTotalVO.borderColor : null, (r27 & 32) != 0 ? stickyTotalVO.backgroundColor : null, (r27 & 64) != 0 ? stickyTotalVO.spacers : null, (r27 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0 ? stickyTotalVO.enableAsync : false, (r27 & 256) != 0 ? stickyTotalVO.asyncData : null, (r27 & UserVerificationMethods.USER_VERIFY_NONE) != 0 ? stickyTotalVO.tokenizedEvent : null, (r27 & UserVerificationMethods.USER_VERIFY_ALL) != 0 ? stickyTotalVO.hasRoundedCorners : false, (r27 & 2048) != 0 ? stickyTotalVO.priceDetailsAction : null);
            stickyTotalPDPViewHolder.innerBind(copy);
        } else if (cartState.getSource() == CartSource.REMOTE && (action = pdpState.getAction()) != null) {
            function1 = this.this$0.actionHandler;
            function1.invoke(action);
        }
        return Unit.f71690a;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CartState cartState, d<? super Unit> dVar) {
        return ((StickyTotalPDPViewHolder$onWidgetCreated$1) create(cartState, dVar)).invokeSuspend(Unit.f71690a);
    }
}
