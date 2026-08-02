package ru.ozon.app.android.checkoutcomposer.total.sticky.v2.presentation;

import DM.i;
import GH.b;
import Lm0.a;
import androidx.lifecycle.C5415f;
import androidx.lifecycle.P;
import androidx.lifecycle.w0;
import androidx.lifecycle.x0;
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
import ru.ozon.app.android.utils.livedata.SingleLiveEvent;
import ru.ozon.app.android.utils.rx.RxExtKt;
import xe.C10720e0;
import xe.C10727i;

@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0001\u0018\u00002\u00020\u00012\u00020\u0002B\u0019\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\n\u001a\u00020\tH\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\f\u001a\u00020\tH\u0016¢\u0006\u0004\b\f\u0010\u000bJ\u0017\u0010\u000f\u001a\u00020\t2\b\u0010\u000e\u001a\u0004\u0018\u00010\r¢\u0006\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0011R\u0018\u0010\u000e\u001a\u0004\u0018\u00010\r8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000e\u0010\u0012R\u0016\u0010\u0014\u001a\u00020\u00138\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\u001a\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00170\u00168\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u001d\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00170\u001a8\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001e¨\u0006\u001f"}, d2 = {"Lru/ozon/app/android/checkoutcomposer/total/sticky/v2/presentation/TotalStickyV2ViewModel;", "Landroidx/lifecycle/w0;", "Lh20/a;", "Lru/ozon/app/android/cart/common/domain/CartService;", "cartService", "Lru/ozon/app/android/composer/widgets/async/data/ComposerAsyncWidgetRepository;", "repository", "<init>", "(Lru/ozon/app/android/cart/common/domain/CartService;Lru/ozon/app/android/composer/widgets/async/data/ComposerAsyncWidgetRepository;)V", "", "updateWidget", "()V", "onCleared", "", "asyncData", "setAsyncData", "(Ljava/lang/String;)V", "Lru/ozon/app/android/composer/widgets/async/data/ComposerAsyncWidgetRepository;", "Ljava/lang/String;", "", "needsUpdate", "Z", "Lru/ozon/app/android/utils/livedata/SingleLiveEvent;", "Lru/ozon/app/android/checkoutcomposer/total/sticky/v2/presentation/TotalStickyV2UpdateResponse;", "_widgetUpdate", "Lru/ozon/app/android/utils/livedata/SingleLiveEvent;", "Landroidx/lifecycle/P;", "widgetUpdate", "Landroidx/lifecycle/P;", "getWidgetUpdate", "()Landroidx/lifecycle/P;", "checkout_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class TotalStickyV2ViewModel extends w0 implements InterfaceC6786a {

    @NotNull
    private final SingleLiveEvent<TotalStickyV2UpdateResponse> _widgetUpdate;
    private String asyncData;
    private boolean needsUpdate;

    @NotNull
    private final ComposerAsyncWidgetRepository repository;

    @NotNull
    private final P<TotalStickyV2UpdateResponse> widgetUpdate;

    @Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000b\u0010\u0002\u001a\u00070\u0003¢\u0006\u0002\b\u0004H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"<anonymous>", "", "it", "Lru/ozon/app/android/cart/common/domain/CartState;", "Lkotlin/jvm/internal/EnhancedNullability;", "invoke", "(Lru/ozon/app/android/cart/common/domain/CartState;)Ljava/lang/Boolean;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    /* renamed from: ru.ozon.app.android.checkoutcomposer.total.sticky.v2.presentation.TotalStickyV2ViewModel$1, reason: invalid class name */
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
    /* renamed from: ru.ozon.app.android.checkoutcomposer.total.sticky.v2.presentation.TotalStickyV2ViewModel$2, reason: invalid class name */
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
            if (TotalStickyV2ViewModel.this.getWidgetUpdate().hasActiveObservers()) {
                TotalStickyV2ViewModel.this.updateWidget();
            } else {
                TotalStickyV2ViewModel.this.needsUpdate = true;
            }
        }
    }

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    /* renamed from: ru.ozon.app.android.checkoutcomposer.total.sticky.v2.presentation.TotalStickyV2ViewModel$3, reason: invalid class name */
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

    public TotalStickyV2ViewModel(@NotNull CartService cartService, @NotNull ComposerAsyncWidgetRepository repository) {
        Intrinsics.checkNotNullParameter(cartService, "cartService");
        Intrinsics.checkNotNullParameter(repository, "repository");
        this.repository = repository;
        SingleLiveEvent<TotalStickyV2UpdateResponse> singleLiveEvent = new SingleLiveEvent<>();
        this._widgetUpdate = singleLiveEvent;
        this.widgetUpdate = singleLiveEvent;
        C8486a a11 = C5415f.a(this);
        InterfaceC8487b subscribe = cartService.observeCartState(true).skip(1L).filter(new GH.a(AnonymousClass1.INSTANCE, 6)).observeOn(C8125a.a()).subscribe(new i(new AnonymousClass2(), 7), new b(new AnonymousClass3(a.f17149a), 7));
        Intrinsics.checkNotNullExpressionValue(subscribe, "subscribe(...)");
        RxExtKt.plusAssign(a11, subscribe);
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
        C6788a a11 = x0.a(this);
        C10720e0 c10720e0 = C10720e0.f105451a;
        C10727i.c(a11, He.b.f10879b, null, new TotalStickyV2ViewModel$updateWidget$1(this, str, null), 2);
    }

    @NotNull
    public final P<TotalStickyV2UpdateResponse> getWidgetUpdate() {
        return this.widgetUpdate;
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
