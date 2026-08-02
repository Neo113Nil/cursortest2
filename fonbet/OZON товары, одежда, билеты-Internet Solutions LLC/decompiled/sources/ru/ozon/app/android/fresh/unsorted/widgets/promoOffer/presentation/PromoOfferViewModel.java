package ru.ozon.app.android.fresh.unsorted.widgets.promoOffer.presentation;

import Ae.B0;
import Ae.C0;
import Ae.E0;
import Ae.InterfaceC2395h;
import Ae.InterfaceC2397i;
import Be.AbstractC2635g;
import De.C2862e;
import Ge.n;
import Sc.s;
import WZ.l;
import Wc.a;
import androidx.lifecycle.w0;
import androidx.lifecycle.x0;
import com.google.protobuf.DescriptorProtos$FileOptions;
import h20.InterfaceC6786a;
import io.reactivex.p;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.e;
import kotlin.coroutines.jvm.internal.j;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import mc.C8125a;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.cart.common.domain.CartService;
import ru.ozon.app.android.cart.common.domain.CartState;
import ru.ozon.app.android.cart.common.domain.local.CartSource;
import ru.ozon.app.android.fresh.unsorted.widgets.wholesale.presentation.CartItemParams;
import xe.C10727i;
import xe.H0;
import xe.J;
import xe.M;
import xe.N;
import xe.X0;

@Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0001\u0018\u00002\u00060\u0001j\u0002`\u00022\u00020\u0003:\u0001#B\u001d\b\u0007\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\n\u0010\b\u001a\u00060\u0006j\u0002`\u0007¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\f\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000e\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u000e\u0010\rJ\u0015\u0010\u0011\u001a\u00020\u000b2\u0006\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0013R\u0014\u0010\u0015\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u001a\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00180\u00178\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u0018\u0010\u001c\u001a\u0004\u0018\u00010\u001b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR\u001d\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u00180\u001e8\u0006¢\u0006\f\n\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\"¨\u0006$"}, d2 = {"Lru/ozon/app/android/fresh/unsorted/widgets/promoOffer/presentation/PromoOfferViewModel;", "Lh20/a;", "Lru/ozon/app/android/composer/viewmodel/ComposerWidgetViewModel;", "Landroidx/lifecycle/w0;", "Lru/ozon/app/android/cart/common/domain/CartService;", "cartService", "LWZ/l;", "Lru/ozon/app/android/analytics/modules/tokenized/TokenizedAnalytics;", "tokenizedAnalytics", "<init>", "(Lru/ozon/app/android/cart/common/domain/CartService;LWZ/l;)V", "", "showErrorMessage", "()V", "onCleared", "Lru/ozon/app/android/fresh/unsorted/widgets/wholesale/presentation/CartItemParams;", "params", "addToCart", "(Lru/ozon/app/android/fresh/unsorted/widgets/wholesale/presentation/CartItemParams;)V", "Lru/ozon/app/android/cart/common/domain/CartService;", "Lxe/M;", "scope", "Lxe/M;", "LAe/w0;", "Lru/ozon/app/android/fresh/unsorted/widgets/promoOffer/presentation/PromoOfferViewModel$Action;", "_action", "LAe/w0;", "", "productId", "Ljava/lang/Long;", "LAe/B0;", "actions", "LAe/B0;", "getActions", "()LAe/B0;", "Action", "widgets-unsorted_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class PromoOfferViewModel extends w0 implements InterfaceC6786a {

    @NotNull
    private final Ae.w0<Action> _action;

    @NotNull
    private final B0<Action> actions;

    @NotNull
    private final CartService cartService;
    private Long productId;

    @NotNull
    private final M scope;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lxe/M;", "", "<anonymous>", "(Lxe/M;)V"}, k = 3, mv = {2, 0, 0})
    @e(c = "ru.ozon.app.android.fresh.unsorted.widgets.promoOffer.presentation.PromoOfferViewModel$1", f = "PromoOfferViewModel.kt", l = {DescriptorProtos$FileOptions.RUBY_PACKAGE_FIELD_NUMBER}, m = "invokeSuspend")
    /* renamed from: ru.ozon.app.android.fresh.unsorted.widgets.promoOffer.presentation.PromoOfferViewModel$1, reason: invalid class name */
    static final class AnonymousClass1 extends j implements Function2<M, d<? super Unit>, Object> {
        int label;

        AnonymousClass1(d<? super AnonymousClass1> dVar) {
            super(2, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final d<Unit> create(Object obj, d<?> dVar) {
            return PromoOfferViewModel.this.new AnonymousClass1(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            a aVar = a.COROUTINE_SUSPENDED;
            int i11 = this.label;
            if (i11 == 0) {
                s.b(obj);
                p observeOn = CartService.DefaultImpls.observeCartState$default(PromoOfferViewModel.this.cartService, false, 1, null).observeOn(C8125a.a());
                Intrinsics.checkNotNullExpressionValue(observeOn, "observeOn(...)");
                InterfaceC2395h a11 = n.a(observeOn);
                final PromoOfferViewModel promoOfferViewModel = PromoOfferViewModel.this;
                InterfaceC2397i interfaceC2397i = new InterfaceC2397i() { // from class: ru.ozon.app.android.fresh.unsorted.widgets.promoOffer.presentation.PromoOfferViewModel.1.1
                    @Override // Ae.InterfaceC2397i
                    public /* bridge */ /* synthetic */ Object emit(Object obj2, d dVar) {
                        return emit((CartState) obj2, (d<? super Unit>) dVar);
                    }

                    public final Object emit(CartState cartState, d<? super Unit> dVar) {
                        Long l11 = PromoOfferViewModel.this.productId;
                        if (l11 == null) {
                            return Unit.f71690a;
                        }
                        long longValue = l11.longValue();
                        if (cartState.getSource() != CartSource.REMOTE || !cartState.hasProduct(longValue)) {
                            return Unit.f71690a;
                        }
                        Object emit = PromoOfferViewModel.this._action.emit(Action.AddToCartSuccess.INSTANCE, dVar);
                        return emit == a.COROUTINE_SUSPENDED ? emit : Unit.f71690a;
                    }
                };
                this.label = 1;
                if (((AbstractC2635g) a11).collect(interfaceC2397i, this) == aVar) {
                    return aVar;
                }
            } else {
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                s.b(obj);
            }
            return Unit.f71690a;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(M m11, d<? super Unit> dVar) {
            return ((AnonymousClass1) create(m11, dVar)).invokeSuspend(Unit.f71690a);
        }
    }

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006"}, d2 = {"Lru/ozon/app/android/fresh/unsorted/widgets/promoOffer/presentation/PromoOfferViewModel$Action;", "", "AddToCartSuccess", "AddToCartError", "Lru/ozon/app/android/fresh/unsorted/widgets/promoOffer/presentation/PromoOfferViewModel$Action$AddToCartError;", "Lru/ozon/app/android/fresh/unsorted/widgets/promoOffer/presentation/PromoOfferViewModel$Action$AddToCartSuccess;", "widgets-unsorted_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public interface Action {

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lru/ozon/app/android/fresh/unsorted/widgets/promoOffer/presentation/PromoOfferViewModel$Action$AddToCartError;", "Lru/ozon/app/android/fresh/unsorted/widgets/promoOffer/presentation/PromoOfferViewModel$Action;", "<init>", "()V", "widgets-unsorted_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final class AddToCartError implements Action {

            @NotNull
            public static final AddToCartError INSTANCE = new AddToCartError();

            private AddToCartError() {
            }
        }

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lru/ozon/app/android/fresh/unsorted/widgets/promoOffer/presentation/PromoOfferViewModel$Action$AddToCartSuccess;", "Lru/ozon/app/android/fresh/unsorted/widgets/promoOffer/presentation/PromoOfferViewModel$Action;", "<init>", "()V", "widgets-unsorted_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final class AddToCartSuccess implements Action {

            @NotNull
            public static final AddToCartSuccess INSTANCE = new AddToCartSuccess();

            private AddToCartSuccess() {
            }
        }
    }

    public PromoOfferViewModel(@NotNull CartService cartService, @NotNull l tokenizedAnalytics) {
        Intrinsics.checkNotNullParameter(cartService, "cartService");
        Intrinsics.checkNotNullParameter(tokenizedAnalytics, "tokenizedAnalytics");
        this.cartService = cartService;
        C2862e a11 = N.a(CoroutineContext.Element.a.d(new PromoOfferViewModel$special$$inlined$CoroutineExceptionHandler$1(J.f105405n0, this), (H0) X0.b()));
        this.scope = a11;
        C0 b11 = E0.b(0, 0, null, 7);
        this._action = b11;
        this.actions = b11;
        cartService.attach(tokenizedAnalytics);
        C10727i.c(a11, null, null, new AnonymousClass1(null), 3);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void showErrorMessage() {
        C10727i.c(x0.a(this), null, null, new PromoOfferViewModel$showErrorMessage$1(this, null), 3);
    }

    public final void addToCart(@NotNull CartItemParams params) {
        Intrinsics.checkNotNullParameter(params, "params");
        this.productId = Long.valueOf(params.getSkuId());
        C10727i.c(this.scope, null, null, new PromoOfferViewModel$addToCart$1(this, params, null), 3);
    }

    @NotNull
    public final B0<Action> getActions() {
        return this.actions;
    }

    @Override // androidx.lifecycle.w0
    public void onCleared() {
        xe.E0.d(this.scope.getCoroutineContext());
    }
}
