package ru.ozon.app.android.cart.checkoutPrefetch.presentation.viewModel;

import Ae.C;
import Ae.C2399j;
import Ae.C2408n0;
import Ae.InterfaceC2397i;
import Ge.n;
import He.b;
import Sc.s;
import Wc.a;
import android.content.Context;
import androidx.lifecycle.P;
import androidx.lifecycle.w0;
import androidx.lifecycle.x0;
import fd.InterfaceC6511n;
import h20.InterfaceC6786a;
import h3.C6788a;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.e;
import kotlin.coroutines.jvm.internal.j;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.cart.checkoutPrefetch.presentation.CheckoutPrefetchStateUpdate;
import ru.ozon.app.android.cart.checkoutPrefetch.presentation.vo.CheckoutPrefetchVO;
import ru.ozon.app.android.cart.common.domain.CartService;
import ru.ozon.app.android.cart.common.domain.CartState;
import ru.ozon.app.android.checkout.prefetch.CheckoutPrefetchController;
import ru.ozon.app.android.composer.widgets.async.data.ComposerAsyncWidgetRepository;
import ru.ozon.app.android.utils.livedata.SingleLiveEvent;
import xe.C10720e0;
import xe.C10727i;

@Metadata(d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0001\u0018\u00002\u00020\u00012\u00060\u0002j\u0002`\u0003B!\b\u0007\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\r\u001a\u00020\fH\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u000f\u001a\u00020\fH\u0016¢\u0006\u0004\b\u000f\u0010\u000eJ\u001d\u0010\u0014\u001a\u00020\f2\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u0012¢\u0006\u0004\b\u0014\u0010\u0015J\r\u0010\u0016\u001a\u00020\f¢\u0006\u0004\b\u0016\u0010\u000eR\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u0017R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u0018R\u0018\u0010\u0019\u001a\u0004\u0018\u00010\u00108\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u0018\u0010\u001c\u001a\u0004\u0018\u00010\u001b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR\u0016\u0010\u001f\u001a\u00020\u001e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001f\u0010 R\u001a\u0010#\u001a\b\u0012\u0004\u0012\u00020\"0!8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010$R\u001d\u0010&\u001a\b\u0012\u0004\u0012\u00020\"0%8\u0006¢\u0006\f\n\u0004\b&\u0010'\u001a\u0004\b(\u0010)¨\u0006*"}, d2 = {"Lru/ozon/app/android/cart/checkoutPrefetch/presentation/viewModel/CheckoutPrefetchViewModel;", "Landroidx/lifecycle/w0;", "Lh20/a;", "Lru/ozon/app/android/composer/viewmodel/ComposerWidgetViewModel;", "Lru/ozon/app/android/cart/common/domain/CartService;", "cartService", "Lru/ozon/app/android/checkout/prefetch/CheckoutPrefetchController;", "prefetchController", "Lru/ozon/app/android/composer/widgets/async/data/ComposerAsyncWidgetRepository;", "repository", "<init>", "(Lru/ozon/app/android/cart/common/domain/CartService;Lru/ozon/app/android/checkout/prefetch/CheckoutPrefetchController;Lru/ozon/app/android/composer/widgets/async/data/ComposerAsyncWidgetRepository;)V", "", "updateWidget", "()V", "onCleared", "Lru/ozon/app/android/cart/checkoutPrefetch/presentation/vo/CheckoutPrefetchVO;", "vo", "Landroid/content/Context;", "context", "prefetchCheckout", "(Lru/ozon/app/android/cart/checkoutPrefetch/presentation/vo/CheckoutPrefetchVO;Landroid/content/Context;)V", "updateWidgetIfNeed", "Lru/ozon/app/android/checkout/prefetch/CheckoutPrefetchController;", "Lru/ozon/app/android/composer/widgets/async/data/ComposerAsyncWidgetRepository;", "prevPrefetchVO", "Lru/ozon/app/android/cart/checkoutPrefetch/presentation/vo/CheckoutPrefetchVO;", "", "currentPageUrl", "Ljava/lang/String;", "", "needsUpdate", "Z", "Lru/ozon/app/android/utils/livedata/SingleLiveEvent;", "Lru/ozon/app/android/cart/checkoutPrefetch/presentation/CheckoutPrefetchStateUpdate;", "_widgetUpdate", "Lru/ozon/app/android/utils/livedata/SingleLiveEvent;", "Landroidx/lifecycle/P;", "widgetUpdate", "Landroidx/lifecycle/P;", "getWidgetUpdate", "()Landroidx/lifecycle/P;", "cart_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class CheckoutPrefetchViewModel extends w0 implements InterfaceC6786a {

    @NotNull
    private final SingleLiveEvent<CheckoutPrefetchStateUpdate> _widgetUpdate;
    private String currentPageUrl;
    private boolean needsUpdate;

    @NotNull
    private final CheckoutPrefetchController prefetchController;
    private CheckoutPrefetchVO prevPrefetchVO;

    @NotNull
    private final ComposerAsyncWidgetRepository repository;

    @NotNull
    private final P<CheckoutPrefetchStateUpdate> widgetUpdate;

    @Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n"}, d2 = {"<anonymous>", "", "it", "Lru/ozon/app/android/cart/common/domain/CartState;", "kotlin.jvm.PlatformType"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @e(c = "ru.ozon.app.android.cart.checkoutPrefetch.presentation.viewModel.CheckoutPrefetchViewModel$1", f = "CheckoutPrefetchViewModel.kt", l = {}, m = "invokeSuspend")
    /* renamed from: ru.ozon.app.android.cart.checkoutPrefetch.presentation.viewModel.CheckoutPrefetchViewModel$1, reason: invalid class name */
    static final class AnonymousClass1 extends j implements Function2<CartState, d<? super Unit>, Object> {
        int label;

        AnonymousClass1(d<? super AnonymousClass1> dVar) {
            super(2, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final d<Unit> create(Object obj, d<?> dVar) {
            return CheckoutPrefetchViewModel.this.new AnonymousClass1(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            a aVar = a.COROUTINE_SUSPENDED;
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            s.b(obj);
            if (CheckoutPrefetchViewModel.this.getWidgetUpdate().hasActiveObservers()) {
                CheckoutPrefetchViewModel.this.updateWidget();
            } else {
                CheckoutPrefetchViewModel.this.needsUpdate = true;
            }
            return Unit.f71690a;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CartState cartState, d<? super Unit> dVar) {
            return ((AnonymousClass1) create(cartState, dVar)).invokeSuspend(Unit.f71690a);
        }
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0006\u001a\u00020\u0005*\u0010\u0012\f\u0012\n \u0002*\u0004\u0018\u00010\u00010\u00010\u00002\u0006\u0010\u0004\u001a\u00020\u0003H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"LAe/i;", "Lru/ozon/app/android/cart/common/domain/CartState;", "kotlin.jvm.PlatformType", "", "it", "", "<anonymous>", "(LAe/i;Ljava/lang/Throwable;)V"}, k = 3, mv = {2, 0, 0})
    @e(c = "ru.ozon.app.android.cart.checkoutPrefetch.presentation.viewModel.CheckoutPrefetchViewModel$2", f = "CheckoutPrefetchViewModel.kt", l = {}, m = "invokeSuspend")
    /* renamed from: ru.ozon.app.android.cart.checkoutPrefetch.presentation.viewModel.CheckoutPrefetchViewModel$2, reason: invalid class name */
    static final class AnonymousClass2 extends j implements InterfaceC6511n<InterfaceC2397i<? super CartState>, Throwable, d<? super Unit>, Object> {
        /* synthetic */ Object L$0;
        int label;

        AnonymousClass2(d<? super AnonymousClass2> dVar) {
            super(3, dVar);
        }

        @Override // fd.InterfaceC6511n
        public final Object invoke(InterfaceC2397i<? super CartState> interfaceC2397i, Throwable th2, d<? super Unit> dVar) {
            AnonymousClass2 anonymousClass2 = new AnonymousClass2(dVar);
            anonymousClass2.L$0 = th2;
            return anonymousClass2.invokeSuspend(Unit.f71690a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            a aVar = a.COROUTINE_SUSPENDED;
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            s.b(obj);
            Lm0.a.f17149a.e((Throwable) this.L$0);
            return Unit.f71690a;
        }
    }

    public CheckoutPrefetchViewModel(@NotNull CartService cartService, @NotNull CheckoutPrefetchController prefetchController, @NotNull ComposerAsyncWidgetRepository repository) {
        Intrinsics.checkNotNullParameter(cartService, "cartService");
        Intrinsics.checkNotNullParameter(prefetchController, "prefetchController");
        Intrinsics.checkNotNullParameter(repository, "repository");
        this.prefetchController = prefetchController;
        this.repository = repository;
        SingleLiveEvent<CheckoutPrefetchStateUpdate> singleLiveEvent = new SingleLiveEvent<>();
        this._widgetUpdate = singleLiveEvent;
        this.widgetUpdate = singleLiveEvent;
        C2399j.C(new C(new C2408n0(n.a(CartService.DefaultImpls.observeCartStateChanged$default(cartService, null, 1, null)), new AnonymousClass1(null)), new AnonymousClass2(null)), x0.a(this));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void updateWidget() {
        String asyncData;
        CheckoutPrefetchVO checkoutPrefetchVO = this.prevPrefetchVO;
        if (checkoutPrefetchVO == null || (asyncData = checkoutPrefetchVO.getAsyncData()) == null) {
            return;
        }
        C6788a a11 = x0.a(this);
        C10720e0 c10720e0 = C10720e0.f105451a;
        C10727i.c(a11, b.f10879b, null, new CheckoutPrefetchViewModel$updateWidget$1(this, asyncData, null), 2);
    }

    @NotNull
    public final P<CheckoutPrefetchStateUpdate> getWidgetUpdate() {
        return this.widgetUpdate;
    }

    @Override // androidx.lifecycle.w0
    public void onCleared() {
    }

    public final void prefetchCheckout(@NotNull CheckoutPrefetchVO vo, @NotNull Context context) {
        Intrinsics.checkNotNullParameter(vo, "vo");
        Intrinsics.checkNotNullParameter(context, "context");
        String link = vo.getAction().getLink();
        if (link == null || vo.equals(this.prevPrefetchVO)) {
            return;
        }
        this.prevPrefetchVO = vo;
        this.prefetchController.prefetch(link, vo.getAction().getParams(), context, x0.a(this), vo.getReferer());
        this.currentPageUrl = vo.getReferer();
    }

    public final void updateWidgetIfNeed() {
        if (this.needsUpdate) {
            this.needsUpdate = false;
            updateWidget();
        }
    }
}
