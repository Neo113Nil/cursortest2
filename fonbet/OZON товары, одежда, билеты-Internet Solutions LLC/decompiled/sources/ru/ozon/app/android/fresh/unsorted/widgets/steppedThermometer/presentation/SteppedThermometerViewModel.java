package ru.ozon.app.android.fresh.unsorted.widgets.steppedThermometer.presentation;

import Ae.C2399j;
import Ae.C2408n0;
import Ae.InterfaceC2395h;
import Ge.n;
import He.b;
import Sc.s;
import Wc.a;
import androidx.lifecycle.w0;
import androidx.lifecycle.x0;
import com.google.protobuf.DescriptorProtos$FileOptions;
import h20.InterfaceC6786a;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.e;
import kotlin.coroutines.jvm.internal.j;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import l20.d;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.cart.common.domain.CartService;
import ru.ozon.app.android.cart.common.domain.CartState;
import ru.ozon.app.android.composer.widgets.async.data.ComposerAsyncWidgetRepository;
import xe.C10720e0;
import xe.C10727i;
import ze.C11115c;
import ze.h;
import ze.k;

@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0001\u0018\u00002\u00020\u00012\u00060\u0002j\u0002`\u0003B\u001f\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u001c\u0010\u0010\u001a\u00020\u000f2\n\u0010\u000e\u001a\u00060\fj\u0002`\rH\u0082@¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0012\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u0019\u0010\u0015\u001a\u00020\u000f2\n\u0010\u0014\u001a\u00060\fj\u0002`\r¢\u0006\u0004\b\u0015\u0010\u0016R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u0017R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u0018R\u001e\u0010\u0014\u001a\n\u0018\u00010\fj\u0004\u0018\u0001`\r8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0014\u0010\u0019R\u001a\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u001b0\u001a8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR\u001d\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u001b0\u001e8\u0006¢\u0006\f\n\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\"¨\u0006#"}, d2 = {"Lru/ozon/app/android/fresh/unsorted/widgets/steppedThermometer/presentation/SteppedThermometerViewModel;", "Landroidx/lifecycle/w0;", "Lh20/a;", "Lru/ozon/app/android/composer/viewmodel/ComposerWidgetViewModel;", "Lru/ozon/app/android/cart/common/domain/CartService;", "cartService", "Lru/ozon/app/android/composer/widgets/async/data/ComposerAsyncWidgetRepository;", "repository", "Lru/ozon/app/android/fresh/unsorted/widgets/steppedThermometer/presentation/SteppedThermometerMapper;", "mapper", "<init>", "(Lru/ozon/app/android/cart/common/domain/CartService;Lru/ozon/app/android/composer/widgets/async/data/ComposerAsyncWidgetRepository;Lru/ozon/app/android/fresh/unsorted/widgets/steppedThermometer/presentation/SteppedThermometerMapper;)V", "Ll20/d;", "Lru/ozon/app/android/composer/view/WidgetInfo;", "info", "", "requestStateChange", "(Ll20/d;Lkotlin/coroutines/d;)Ljava/lang/Object;", "onCleared", "()V", "widgetInfo", "bind", "(Ll20/d;)V", "Lru/ozon/app/android/composer/widgets/async/data/ComposerAsyncWidgetRepository;", "Lru/ozon/app/android/fresh/unsorted/widgets/steppedThermometer/presentation/SteppedThermometerMapper;", "Ll20/d;", "Lze/h;", "Lru/ozon/app/android/fresh/unsorted/widgets/steppedThermometer/presentation/SteppedThermometerVO;", "_widgetUpdates", "Lze/h;", "LAe/h;", "widgetUpdates", "LAe/h;", "getWidgetUpdates", "()LAe/h;", "widgets-unsorted_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class SteppedThermometerViewModel extends w0 implements InterfaceC6786a {

    @NotNull
    private final h<SteppedThermometerVO> _widgetUpdates;

    @NotNull
    private final SteppedThermometerMapper mapper;

    @NotNull
    private final ComposerAsyncWidgetRepository repository;
    private d widgetInfo;

    @NotNull
    private final InterfaceC2395h<SteppedThermometerVO> widgetUpdates;

    @Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n"}, d2 = {"<anonymous>", "", "it", "Lru/ozon/app/android/cart/common/domain/CartState;", "kotlin.jvm.PlatformType"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @e(c = "ru.ozon.app.android.fresh.unsorted.widgets.steppedThermometer.presentation.SteppedThermometerViewModel$1", f = "SteppedThermometerViewModel.kt", l = {DescriptorProtos$FileOptions.OBJC_CLASS_PREFIX_FIELD_NUMBER}, m = "invokeSuspend")
    /* renamed from: ru.ozon.app.android.fresh.unsorted.widgets.steppedThermometer.presentation.SteppedThermometerViewModel$1, reason: invalid class name */
    static final class AnonymousClass1 extends j implements Function2<CartState, kotlin.coroutines.d<? super Unit>, Object> {
        int label;

        AnonymousClass1(kotlin.coroutines.d<? super AnonymousClass1> dVar) {
            super(2, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            return SteppedThermometerViewModel.this.new AnonymousClass1(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            a aVar = a.COROUTINE_SUSPENDED;
            int i11 = this.label;
            if (i11 == 0) {
                s.b(obj);
                d dVar = SteppedThermometerViewModel.this.widgetInfo;
                if (dVar != null) {
                    SteppedThermometerViewModel steppedThermometerViewModel = SteppedThermometerViewModel.this;
                    this.label = 1;
                    if (steppedThermometerViewModel.requestStateChange(dVar, this) == aVar) {
                        return aVar;
                    }
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
        public final Object invoke(CartState cartState, kotlin.coroutines.d<? super Unit> dVar) {
            return ((AnonymousClass1) create(cartState, dVar)).invokeSuspend(Unit.f71690a);
        }
    }

    public SteppedThermometerViewModel(@NotNull CartService cartService, @NotNull ComposerAsyncWidgetRepository repository, @NotNull SteppedThermometerMapper mapper) {
        Intrinsics.checkNotNullParameter(cartService, "cartService");
        Intrinsics.checkNotNullParameter(repository, "repository");
        Intrinsics.checkNotNullParameter(mapper, "mapper");
        this.repository = repository;
        this.mapper = mapper;
        C11115c a11 = k.a(-2, 6, null);
        this._widgetUpdates = a11;
        this.widgetUpdates = C2399j.H(a11);
        C2399j.C(new C2408n0(n.a(CartService.DefaultImpls.observeCartStateChanged$default(cartService, null, 1, null)), new AnonymousClass1(null)), x0.a(this));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object requestStateChange(d dVar, kotlin.coroutines.d<? super Unit> dVar2) {
        String a11 = dVar.c().a();
        if (a11 == null) {
            return Unit.f71690a;
        }
        C10720e0 c10720e0 = C10720e0.f105451a;
        Object f7 = C10727i.f(b.f10879b, new SteppedThermometerViewModel$requestStateChange$2(this, a11, dVar, null), dVar2);
        return f7 == a.COROUTINE_SUSPENDED ? f7 : Unit.f71690a;
    }

    public final void bind(@NotNull d widgetInfo) {
        Intrinsics.checkNotNullParameter(widgetInfo, "widgetInfo");
        this.widgetInfo = widgetInfo;
    }

    @NotNull
    public final InterfaceC2395h<SteppedThermometerVO> getWidgetUpdates() {
        return this.widgetUpdates;
    }

    @Override // androidx.lifecycle.w0
    public void onCleared() {
        super.onCleared();
    }
}
