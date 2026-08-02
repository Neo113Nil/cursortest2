package ru.ozon.app.android.marketing.widgets.ladderActions.presentation;

import Ae.C2399j;
import Ae.C2408n0;
import Ge.n;
import Sc.s;
import Tl.b;
import Wc.a;
import androidx.lifecycle.P;
import androidx.lifecycle.V;
import androidx.lifecycle.w0;
import androidx.lifecycle.x0;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.e;
import kotlin.coroutines.jvm.internal.j;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.h;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.cart.common.domain.CartService;
import ru.ozon.app.android.cart.common.domain.CartState;
import ru.ozon.app.android.cart.common.models.CartItemInfo;
import ru.ozon.app.android.marketing.widgets.ladderActions.core.LadderActionsUpdateButtonKey;
import ru.ozon.uni.atoms.af.AtomAction;
import xe.C10727i;

@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0001\u0018\u0000 \u00172\u00020\u0001:\u0001\u0017B\u0011\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001f\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u00062\b\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\u000b\u0010\fR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\rR\u001a\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R\u001d\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u000f0\u00128\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016¨\u0006\u0018"}, d2 = {"Lru/ozon/app/android/marketing/widgets/ladderActions/presentation/LadderActionsViewModel;", "Landroidx/lifecycle/w0;", "Lru/ozon/app/android/cart/common/domain/CartService;", "cartService", "<init>", "(Lru/ozon/app/android/cart/common/domain/CartService;)V", "Lru/ozon/uni/atoms/af/AtomAction$Click;", "action", "", "widgetId", "", "onButtonClicked", "(Lru/ozon/uni/atoms/af/AtomAction$Click;Ljava/lang/Long;)V", "Lru/ozon/app/android/cart/common/domain/CartService;", "Landroidx/lifecycle/V;", "Lru/ozon/app/android/marketing/widgets/ladderActions/core/LadderActionsUpdateButtonKey;", "_update", "Landroidx/lifecycle/V;", "Landroidx/lifecycle/P;", "update", "Landroidx/lifecycle/P;", "getUpdate", "()Landroidx/lifecycle/P;", "Companion", "marketing_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class LadderActionsViewModel extends w0 {

    @NotNull
    private final V<LadderActionsUpdateButtonKey> _update;

    @NotNull
    private final CartService cartService;

    @NotNull
    private final P<LadderActionsUpdateButtonKey> update;

    @NotNull
    private static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    @Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n"}, d2 = {"<anonymous>", "", "cartState", "Lru/ozon/app/android/cart/common/domain/CartState;", "kotlin.jvm.PlatformType"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @e(c = "ru.ozon.app.android.marketing.widgets.ladderActions.presentation.LadderActionsViewModel$1", f = "LadderActionsViewModel.kt", l = {}, m = "invokeSuspend")
    /* renamed from: ru.ozon.app.android.marketing.widgets.ladderActions.presentation.LadderActionsViewModel$1, reason: invalid class name */
    static final class AnonymousClass1 extends j implements Function2<CartState, d<? super Unit>, Object> {
        /* synthetic */ Object L$0;
        int label;

        AnonymousClass1(d<? super AnonymousClass1> dVar) {
            super(2, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final d<Unit> create(Object obj, d<?> dVar) {
            AnonymousClass1 anonymousClass1 = LadderActionsViewModel.this.new AnonymousClass1(dVar);
            anonymousClass1.L$0 = obj;
            return anonymousClass1;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            String skuId;
            a aVar = a.COROUTINE_SUSPENDED;
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            s.b(obj);
            CartState cartState = (CartState) this.L$0;
            LadderActionsUpdateButtonKey ladderActionsUpdateButtonKey = (LadderActionsUpdateButtonKey) LadderActionsViewModel.this._update.getValue();
            CartItemInfo cartItemInfo = cartState.getItems().get((ladderActionsUpdateButtonKey == null || (skuId = ladderActionsUpdateButtonKey.getSkuId()) == null) ? null : h.y0(skuId));
            if (cartItemInfo == null && ladderActionsUpdateButtonKey != null) {
                LadderActionsViewModel.this._update.setValue(LadderActionsUpdateButtonKey.copy$default(ladderActionsUpdateButtonKey, null, 0, false, 3, null));
            }
            if (cartItemInfo != null && (ladderActionsUpdateButtonKey == null || ladderActionsUpdateButtonKey.getQuantity() != cartItemInfo.getQuantity())) {
                LadderActionsViewModel.this._update.setValue(ladderActionsUpdateButtonKey != null ? LadderActionsUpdateButtonKey.copy$default(ladderActionsUpdateButtonKey, null, cartItemInfo.getQuantity(), true, 1, null) : null);
            }
            return Unit.f71690a;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CartState cartState, d<? super Unit> dVar) {
            return ((AnonymousClass1) create(cartState, dVar)).invokeSuspend(Unit.f71690a);
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\t"}, d2 = {"Lru/ozon/app/android/marketing/widgets/ladderActions/presentation/LadderActionsViewModel$Companion;", "", "<init>", "()V", "SKU_ID", "", "QUANTITY", "DELIVERY_SCHEMA", "ADD_TO_CART_ACTION_ID", "marketing_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    private static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    public LadderActionsViewModel(@NotNull CartService cartService) {
        Intrinsics.checkNotNullParameter(cartService, "cartService");
        this.cartService = cartService;
        V<LadderActionsUpdateButtonKey> v11 = new V<>();
        this._update = v11;
        this.update = v11;
        C2399j.C(new C2408n0(n.a(CartService.DefaultImpls.observeCartState$default(cartService, false, 1, null)), new AnonymousClass1(null)), x0.a(this));
    }

    @NotNull
    public final P<LadderActionsUpdateButtonKey> getUpdate() {
        return this.update;
    }

    public final void onButtonClicked(@NotNull AtomAction.Click action, Long widgetId) {
        Map<String, String> params;
        String str;
        Map<String, String> params2;
        String str2;
        Integer w02;
        String str3;
        if (!b.i(action, "action", "addToCart") || (params = action.getParams()) == null || (str = params.get("id")) == null || (params2 = action.getParams()) == null || (str2 = params2.get("quantity")) == null || (w02 = h.w0(str2)) == null) {
            return;
        }
        int intValue = w02.intValue();
        Map<String, String> params3 = action.getParams();
        Long y02 = (params3 == null || (str3 = params3.get("selectedDeliverySchema")) == null) ? null : h.y0(str3);
        this._update.setValue(new LadderActionsUpdateButtonKey(str, intValue, true));
        C10727i.c(x0.a(this), null, null, new LadderActionsViewModel$onButtonClicked$1(this, str, intValue, y02, widgetId, null), 3);
    }
}
