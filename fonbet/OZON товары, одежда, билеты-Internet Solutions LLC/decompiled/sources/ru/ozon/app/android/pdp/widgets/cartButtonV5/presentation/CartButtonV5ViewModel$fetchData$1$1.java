package ru.ozon.app.android.pdp.widgets.cartButtonV5.presentation;

import Sc.s;
import W10.c;
import Wc.a;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.e;
import kotlin.coroutines.jvm.internal.j;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.app.android.action.v2.ActionV2Repository;
import ru.ozon.app.android.action.v2.models.ActionV2Request;
import ru.ozon.app.android.action.v2.models.ActionV2Response;
import ru.ozon.app.android.pdp.widgets.cartButtonV5.data.CartButtonV5AsyncRequest;
import ru.ozon.app.android.pdp.widgets.cartButtonV5.data.CartButtonV5DTO;
import ru.ozon.app.android.pdp.widgets.cartButtonV5.data.CartButtonV5DataResponse;
import ru.ozon.app.android.pdp.widgets.cartButtonV5.presentation.CartButtonV5State;
import ru.ozon.app.android.pdp.widgets.cartButtonV5.presentation.CartButtonV5VO;
import ru.ozon.app.android.utils.livedata.BroadcastSingleLiveEvent;
import ru.ozon.uni.atoms.data.text.TextDTO;
import ru.ozon.uni.atoms.utils.OzonSpannableString;
import xe.M;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lxe/M;", "", "<anonymous>", "(Lxe/M;)V"}, k = 3, mv = {2, 0, 0})
@e(c = "ru.ozon.app.android.pdp.widgets.cartButtonV5.presentation.CartButtonV5ViewModel$fetchData$1$1", f = "CartButtonV5ViewModel.kt", l = {470}, m = "invokeSuspend")
/* loaded from: classes13.dex */
final class CartButtonV5ViewModel$fetchData$1$1 extends j implements Function2<M, d<? super Unit>, Object> {
    final /* synthetic */ String $actionName;
    final /* synthetic */ CartButtonV5VO $cartVo;
    final /* synthetic */ CartButtonV5VO.CartButton $this_with;
    final /* synthetic */ c $trackingData;
    int I$0;
    int I$1;
    int label;
    final /* synthetic */ CartButtonV5ViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    CartButtonV5ViewModel$fetchData$1$1(CartButtonV5VO cartButtonV5VO, String str, CartButtonV5ViewModel cartButtonV5ViewModel, c cVar, CartButtonV5VO.CartButton cartButton, d<? super CartButtonV5ViewModel$fetchData$1$1> dVar) {
        super(2, dVar);
        this.$cartVo = cartButtonV5VO;
        this.$actionName = str;
        this.this$0 = cartButtonV5ViewModel;
        this.$trackingData = cVar;
        this.$this_with = cartButton;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final d<Unit> create(Object obj, d<?> dVar) {
        return new CartButtonV5ViewModel$fetchData$1$1(this.$cartVo, this.$actionName, this.this$0, this.$trackingData, this.$this_with, dVar);
    }

    /* JADX WARN: Code restructure failed: missing block: B:28:0x013f, code lost:
    
        if (kotlin.jvm.internal.Intrinsics.d(r5, r2) != false) goto L75;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x003f, code lost:
    
        if ((r12 != null ? r12.getAsyncFetchType() : null) == ru.ozon.app.android.pdp.widgets.cartButtonV5.data.CartButtonV5DTO.CartButton.Button.AsyncFetchType.SUBTITLE) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x0041, code lost:
    
        r1 = 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x007a, code lost:
    
        if ((r12 != null ? r12.getAsyncFetchType() : null) == ru.ozon.app.android.pdp.widgets.cartButtonV5.data.CartButtonV5DTO.CartButton.Button.AsyncFetchType.SUBTITLE) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:77:0x007c, code lost:
    
        r12 = 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:82:0x007e, code lost:
    
        r12 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:90:0x0096, code lost:
    
        if (((r12 == null || (r12 = r12.getToCart()) == null) ? null : r12.getAsyncFetchType()) == ru.ozon.app.android.pdp.widgets.cartButtonV5.data.CartButtonV5DTO.CartButton.Button.AsyncFetchType.SUBTITLE) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:92:0x0043, code lost:
    
        r1 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:95:0x0055, code lost:
    
        if (r11.$cartVo.getCartButton().getToCart().getAsyncFetchType() == ru.ozon.app.android.pdp.widgets.cartButtonV5.data.CartButtonV5DTO.CartButton.Button.AsyncFetchType.SUBTITLE) goto L16;
     */
    @Override // kotlin.coroutines.jvm.internal.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        int i11;
        int i12;
        ActionV2Repository actionV2Repository;
        int i13;
        BroadcastSingleLiveEvent broadcastSingleLiveEvent;
        boolean z11;
        CartButtonV5VO updateData;
        BroadcastSingleLiveEvent broadcastSingleLiveEvent2;
        BroadcastSingleLiveEvent broadcastSingleLiveEvent3;
        TextDTO toCartText;
        TextDTO toCartText2;
        a aVar = a.COROUTINE_SUSPENDED;
        int i14 = this.label;
        OzonSpannableString ozonSpannableString = null;
        if (i14 == 0) {
            s.b(obj);
            if (this.$cartVo.getCartButton().getIsInCart()) {
                CartButtonV5DTO.CartButton.Button inCart = this.$cartVo.getCartButton().getInCart();
            }
            CartButtonV5VO.CartButton secondCartButton = this.$cartVo.getSecondCartButton();
            if (secondCartButton == null || !secondCartButton.getIsInCart()) {
                CartButtonV5VO.CartButton secondCartButton2 = this.$cartVo.getSecondCartButton();
            } else {
                CartButtonV5DTO.CartButton.Button inCart2 = this.$cartVo.getSecondCartButton().getInCart();
            }
            ActionV2Request actionV2Request = new ActionV2Request(new CartButtonV5AsyncRequest(this.$cartVo.getAsyncAction().getParams()), this.$actionName, false, 4, null);
            actionV2Repository = this.this$0.actionV2Repository;
            c cVar = this.$trackingData;
            this.I$0 = i11;
            this.I$1 = i12;
            this.label = 1;
            Object callActionWithTrackingSuspend = actionV2Repository.callActionWithTrackingSuspend(actionV2Request, cVar, CartButtonV5DataResponse.class, this);
            if (callActionWithTrackingSuspend == aVar) {
                return aVar;
            }
            i13 = i12;
            obj = callActionWithTrackingSuspend;
        } else {
            if (i14 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            i13 = this.I$1;
            i11 = this.I$0;
            s.b(obj);
        }
        ActionV2Response actionV2Response = (ActionV2Response) obj;
        if (actionV2Response.getError() != null || actionV2Response.getData() == null) {
            broadcastSingleLiveEvent = this.this$0._action;
            broadcastSingleLiveEvent.postValue(new CartButtonV5State.HideLoader(i11 != 0, i13 != 0));
            return Unit.f71690a;
        }
        CartButtonV5DataResponse cartButtonV5DataResponse = (CartButtonV5DataResponse) actionV2Response.getData();
        if (cartButtonV5DataResponse != null) {
            CartButtonV5VO.CartButton cartButton = this.$this_with;
            CartButtonV5ViewModel cartButtonV5ViewModel = this.this$0;
            CartButtonV5VO cartButtonV5VO = this.$cartVo;
            OzonSpannableString text = cartButton.getToCart().getTitle().getText();
            CartButtonV5DataResponse.ButtonText firstButton = cartButtonV5DataResponse.getFirstButton();
            if (!Intrinsics.d(text, (firstButton == null || (toCartText2 = firstButton.getToCartText()) == null) ? null : toCartText2.getText())) {
                TextDTO animationSubtitle = cartButton.getToCart().getAnimationSubtitle();
                if ((animationSubtitle != null ? animationSubtitle.getText() : null) != null) {
                    OzonSpannableString text2 = cartButton.getToCart().getAnimationSubtitle().getText();
                    CartButtonV5DataResponse.ButtonText firstButton2 = cartButtonV5DataResponse.getFirstButton();
                    if (firstButton2 != null && (toCartText = firstButton2.getToCartText()) != null) {
                        ozonSpannableString = toCartText.getText();
                    }
                }
                z11 = false;
                updateData = cartButtonV5ViewModel.updateData(cartButtonV5VO, cartButtonV5DataResponse);
                if ((!z11 && i11 == 0) || Intrinsics.d(updateData, cartButtonV5VO)) {
                    broadcastSingleLiveEvent3 = cartButtonV5ViewModel._action;
                    broadcastSingleLiveEvent3.postValue(new CartButtonV5State.HideLoader(i11 != 0, i13 != 0));
                    return Unit.f71690a;
                }
                broadcastSingleLiveEvent2 = cartButtonV5ViewModel._action;
                broadcastSingleLiveEvent2.postValue(new CartButtonV5State.UpdateData(updateData));
            }
            z11 = true;
            updateData = cartButtonV5ViewModel.updateData(cartButtonV5VO, cartButtonV5DataResponse);
            if (!z11) {
            }
            broadcastSingleLiveEvent2 = cartButtonV5ViewModel._action;
            broadcastSingleLiveEvent2.postValue(new CartButtonV5State.UpdateData(updateData));
        }
        return Unit.f71690a;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(M m11, d<? super Unit> dVar) {
        return ((CartButtonV5ViewModel$fetchData$1$1) create(m11, dVar)).invokeSuspend(Unit.f71690a);
    }
}
