package ru.ozon.app.android.checkoutcomposer.total.sticky.v3.presentation;

import Ae.C2399j;
import Ae.C2406m0;
import Ae.InterfaceC2395h;
import Ae.O0;
import Ae.x0;
import BY.g;
import BY.h;
import He.b;
import Lm0.a;
import androidx.lifecycle.C5415f;
import androidx.lifecycle.w0;
import h20.InterfaceC6786a;
import h3.C6788a;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.C7735q;
import kotlin.jvm.internal.Intrinsics;
import mc.C8125a;
import nc.C8486a;
import nc.InterfaceC8487b;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.cart.common.domain.CartService;
import ru.ozon.app.android.cart.common.domain.CartState;
import ru.ozon.app.android.cart.common.domain.local.CartSource;
import ru.ozon.app.android.composer.widgets.async.data.ComposerAsyncWidgetRepository;
import ru.ozon.app.android.utils.rx.RxExtKt;
import xe.C10720e0;
import xe.C10727i;

@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0001\u0018\u00002\u00020\u00012\u00020\u0002B\u0017\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\n\u001a\u00020\tH\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\f\u001a\u00020\tH\u0016¢\u0006\u0004\b\f\u0010\u000bJ\u0017\u0010\u000f\u001a\u00020\t2\b\u0010\u000e\u001a\u0004\u0018\u00010\r¢\u0006\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0011R\u0018\u0010\u000e\u001a\u0004\u0018\u00010\r8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000e\u0010\u0012R\u0016\u0010\u0014\u001a\u00020\u00138\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\u001c\u0010\u0018\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00170\u00168\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u001d\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00170\u001a8\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001e¨\u0006\u001f"}, d2 = {"Lru/ozon/app/android/checkoutcomposer/total/sticky/v3/presentation/TotalStickyV3ViewModel;", "Landroidx/lifecycle/w0;", "Lh20/a;", "Lru/ozon/app/android/cart/common/domain/CartService;", "cartService", "Lru/ozon/app/android/composer/widgets/async/data/ComposerAsyncWidgetRepository;", "repository", "<init>", "(Lru/ozon/app/android/cart/common/domain/CartService;Lru/ozon/app/android/composer/widgets/async/data/ComposerAsyncWidgetRepository;)V", "", "updateWidget", "()V", "onCleared", "", "asyncData", "setAsyncData", "(Ljava/lang/String;)V", "Lru/ozon/app/android/composer/widgets/async/data/ComposerAsyncWidgetRepository;", "Ljava/lang/String;", "", "needsUpdate", "Z", "LAe/x0;", "Lru/ozon/app/android/checkoutcomposer/total/sticky/v3/presentation/TotalStickyV3UpdateResponse;", "_widgetUpdateFlow", "LAe/x0;", "LAe/h;", "widgetUpdateFlow", "LAe/h;", "getWidgetUpdateFlow", "()LAe/h;", "checkout_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class TotalStickyV3ViewModel extends w0 implements InterfaceC6786a {

    @NotNull
    private final x0<TotalStickyV3UpdateResponse> _widgetUpdateFlow;
    private String asyncData;
    private boolean needsUpdate;

    @NotNull
    private final ComposerAsyncWidgetRepository repository;

    @NotNull
    private final InterfaceC2395h<TotalStickyV3UpdateResponse> widgetUpdateFlow;

    @Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000b\u0010\u0002\u001a\u00070\u0003¢\u0006\u0002\b\u0004H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"<anonymous>", "", "it", "Lru/ozon/app/android/cart/common/domain/CartState;", "Lkotlin/jvm/internal/EnhancedNullability;", "invoke", "(Lru/ozon/app/android/cart/common/domain/CartState;)Ljava/lang/Boolean;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    /* renamed from: ru.ozon.app.android.checkoutcomposer.total.sticky.v3.presentation.TotalStickyV3ViewModel$1, reason: invalid class name */
    static final class AnonymousClass1 extends AbstractC7737t implements Function1<CartState, Boolean> {
        public static final AnonymousClass1 INSTANCE = new AnonymousClass1();

        AnonymousClass1() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Boolean invoke(CartState it) {
            Intrinsics.checkNotNullParameter(it, "it");
            return Boolean.valueOf(it.getSource() == CartSource.REMOTE);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"<anonymous>", "", "it", "Lru/ozon/app/android/cart/common/domain/CartState;", "kotlin.jvm.PlatformType", "invoke", "(Lru/ozon/app/android/cart/common/domain/CartState;)V"}, k = 3, mv = {2, 0, 0}, xi = 48)
    /* renamed from: ru.ozon.app.android.checkoutcomposer.total.sticky.v3.presentation.TotalStickyV3ViewModel$2, reason: invalid class name */
    static final class AnonymousClass2 extends AbstractC7737t implements Function1<CartState, Unit> {
        AnonymousClass2() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(CartState cartState) {
            invoke2(cartState);
            return Unit.f71690a;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(CartState cartState) {
            if (TotalStickyV3ViewModel.this._widgetUpdateFlow.getSubscriptionCount().getValue().intValue() > 0) {
                TotalStickyV3ViewModel.this.updateWidget();
            } else {
                TotalStickyV3ViewModel.this.needsUpdate = true;
            }
        }
    }

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    /* renamed from: ru.ozon.app.android.checkoutcomposer.total.sticky.v3.presentation.TotalStickyV3ViewModel$3, reason: invalid class name */
    /* synthetic */ class AnonymousClass3 extends C7735q implements Function1<Throwable, Unit> {
        AnonymousClass3(Object obj) {
            super(1, obj, a.b.class, "e", "e(Ljava/lang/Throwable;)V", 0);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Throwable th2) {
            invoke2(th2);
            return Unit.f71690a;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(Throwable th2) {
            ((a.b) this.receiver).e(th2);
        }
    }

    public TotalStickyV3ViewModel(@NotNull CartService cartService, @NotNull ComposerAsyncWidgetRepository repository) {
        Intrinsics.checkNotNullParameter(cartService, "cartService");
        Intrinsics.checkNotNullParameter(repository, "repository");
        this.repository = repository;
        x0<TotalStickyV3UpdateResponse> a11 = O0.a(null);
        this._widgetUpdateFlow = a11;
        this.widgetUpdateFlow = new C2406m0(C2399j.b(a11));
        C8486a a12 = C5415f.a(this);
        InterfaceC8487b subscribe = cartService.observeCartState(true).skip(1L).filter(new DF.a(AnonymousClass1.INSTANCE, 5)).observeOn(C8125a.a()).subscribe(new g(new AnonymousClass2(), 4), new h(new AnonymousClass3(a.f17149a), 4));
        Intrinsics.checkNotNullExpressionValue(subscribe, "subscribe(...)");
        RxExtKt.plusAssign(a12, subscribe);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean _init_$lambda$0(Function1 function1, Object p02) {
        Intrinsics.checkNotNullParameter(p02, "p0");
        return ((Boolean) function1.invoke(p02)).booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void updateWidget() {
        String str = this.asyncData;
        if (str == null) {
            return;
        }
        C6788a a11 = androidx.lifecycle.x0.a(this);
        C10720e0 c10720e0 = C10720e0.f105451a;
        C10727i.c(a11, b.f10879b, null, new TotalStickyV3ViewModel$updateWidget$1(this, str, null), 2);
    }

    @NotNull
    public final InterfaceC2395h<TotalStickyV3UpdateResponse> getWidgetUpdateFlow() {
        return this.widgetUpdateFlow;
    }

    @Override // androidx.lifecycle.w0
    public void onCleared() {
        C5415f.a(this).d();
    }

    public final void setAsyncData(String asyncData) {
        this.asyncData = asyncData;
        if (this.needsUpdate) {
            this.needsUpdate = false;
            updateWidget();
        }
    }
}
