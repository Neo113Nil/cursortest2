package ru.ozon.app.android.fresh.unsorted.widgets.deliveryWidget.v4.presentation;

import Ae.C2399j;
import Ae.C2408n0;
import Ae.InterfaceC2395h;
import Ge.n;
import He.b;
import Sc.s;
import Wc.a;
import androidx.lifecycle.w0;
import androidx.lifecycle.x0;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
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
import ru.ozon.app.android.fresh.unsorted.widgets.deliveryWidget.v4.domain.DeliveryWidgetV4Repository;
import xe.B0;
import xe.C10720e0;
import xe.C10727i;
import xe.E0;
import ze.C11115c;
import ze.h;
import ze.k;

@Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0001\u0018\u00002\u00020\u00012\u00060\u0002j\u0002`\u0003B\u0017\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ&\u0010\u0010\u001a\u00020\u000f2\n\u0010\f\u001a\u00060\nj\u0002`\u000b2\b\b\u0002\u0010\u000e\u001a\u00020\rH\u0082@¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0012\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u0015\u0010\u0016\u001a\u00020\u000f2\u0006\u0010\u0015\u001a\u00020\u0014¢\u0006\u0004\b\u0016\u0010\u0017J\r\u0010\u0018\u001a\u00020\u000f¢\u0006\u0004\b\u0018\u0010\u0013R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR(\u0010\u001d\u001a\u0004\u0018\u00010\u00142\b\u0010\u001c\u001a\u0004\u0018\u00010\u00148\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010 R\u0018\u0010\"\u001a\u0004\u0018\u00010!8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\"\u0010#R\u001a\u0010%\u001a\b\u0012\u0004\u0012\u00020\u00140$8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b%\u0010&R\u001d\u0010(\u001a\b\u0012\u0004\u0012\u00020\u00140'8\u0006¢\u0006\f\n\u0004\b(\u0010)\u001a\u0004\b*\u0010+R\u001e\u0010,\u001a\n\u0018\u00010\nj\u0004\u0018\u0001`\u000b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b,\u0010-¨\u0006."}, d2 = {"Lru/ozon/app/android/fresh/unsorted/widgets/deliveryWidget/v4/presentation/DeliveryWidgetV4ViewModel;", "Landroidx/lifecycle/w0;", "Lh20/a;", "Lru/ozon/app/android/composer/viewmodel/ComposerWidgetViewModel;", "Lru/ozon/app/android/fresh/unsorted/widgets/deliveryWidget/v4/domain/DeliveryWidgetV4Repository;", "repository", "Lru/ozon/app/android/cart/common/domain/CartService;", "cartService", "<init>", "(Lru/ozon/app/android/fresh/unsorted/widgets/deliveryWidget/v4/domain/DeliveryWidgetV4Repository;Lru/ozon/app/android/cart/common/domain/CartService;)V", "Ll20/d;", "Lru/ozon/app/android/composer/view/WidgetInfo;", "info", "", "isTimerUpdate", "", "requestStateChange", "(Ll20/d;ZLkotlin/coroutines/d;)Ljava/lang/Object;", "onCleared", "()V", "Lru/ozon/app/android/fresh/unsorted/widgets/deliveryWidget/v4/presentation/DeliveryWidgetV4VO;", "state", "scheduleUpdate", "(Lru/ozon/app/android/fresh/unsorted/widgets/deliveryWidget/v4/presentation/DeliveryWidgetV4VO;)V", "cancelScheduledWidgetUpdate", "Lru/ozon/app/android/fresh/unsorted/widgets/deliveryWidget/v4/domain/DeliveryWidgetV4Repository;", "getRepository", "()Lru/ozon/app/android/fresh/unsorted/widgets/deliveryWidget/v4/domain/DeliveryWidgetV4Repository;", AppMeasurementSdk.ConditionalUserProperty.VALUE, "currentState", "Lru/ozon/app/android/fresh/unsorted/widgets/deliveryWidget/v4/presentation/DeliveryWidgetV4VO;", "getCurrentState", "()Lru/ozon/app/android/fresh/unsorted/widgets/deliveryWidget/v4/presentation/DeliveryWidgetV4VO;", "Lxe/B0;", "updateTimerJob", "Lxe/B0;", "Lze/h;", "_widgetUpdates", "Lze/h;", "LAe/h;", "widgetUpdates", "LAe/h;", "getWidgetUpdates", "()LAe/h;", "widgetInfoCache", "Ll20/d;", "widgets-unsorted_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class DeliveryWidgetV4ViewModel extends w0 implements InterfaceC6786a {

    @NotNull
    private final h<DeliveryWidgetV4VO> _widgetUpdates;
    private DeliveryWidgetV4VO currentState;

    @NotNull
    private final DeliveryWidgetV4Repository repository;
    private B0 updateTimerJob;
    private d widgetInfoCache;

    @NotNull
    private final InterfaceC2395h<DeliveryWidgetV4VO> widgetUpdates;

    @Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n"}, d2 = {"<anonymous>", "", "it", "Lru/ozon/app/android/cart/common/domain/CartState;", "kotlin.jvm.PlatformType"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @e(c = "ru.ozon.app.android.fresh.unsorted.widgets.deliveryWidget.v4.presentation.DeliveryWidgetV4ViewModel$1", f = "DeliveryWidgetV4ViewModel.kt", l = {DescriptorProtos$FileOptions.PHP_METADATA_NAMESPACE_FIELD_NUMBER}, m = "invokeSuspend")
    /* renamed from: ru.ozon.app.android.fresh.unsorted.widgets.deliveryWidget.v4.presentation.DeliveryWidgetV4ViewModel$1, reason: invalid class name */
    static final class AnonymousClass1 extends j implements Function2<CartState, kotlin.coroutines.d<? super Unit>, Object> {
        int label;

        AnonymousClass1(kotlin.coroutines.d<? super AnonymousClass1> dVar) {
            super(2, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            return DeliveryWidgetV4ViewModel.this.new AnonymousClass1(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            a aVar = a.COROUTINE_SUSPENDED;
            int i11 = this.label;
            if (i11 == 0) {
                s.b(obj);
                d dVar = DeliveryWidgetV4ViewModel.this.widgetInfoCache;
                if (dVar != null) {
                    DeliveryWidgetV4ViewModel deliveryWidgetV4ViewModel = DeliveryWidgetV4ViewModel.this;
                    this.label = 1;
                    if (DeliveryWidgetV4ViewModel.requestStateChange$default(deliveryWidgetV4ViewModel, dVar, false, this, 2, null) == aVar) {
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

    public DeliveryWidgetV4ViewModel(@NotNull DeliveryWidgetV4Repository repository, @NotNull CartService cartService) {
        Intrinsics.checkNotNullParameter(repository, "repository");
        Intrinsics.checkNotNullParameter(cartService, "cartService");
        this.repository = repository;
        C11115c a11 = k.a(-2, 6, null);
        this._widgetUpdates = a11;
        this.widgetUpdates = C2399j.H(a11);
        C2399j.C(new C2408n0(n.a(CartService.DefaultImpls.observeCartStateChanged$default(cartService, null, 1, null)), new AnonymousClass1(null)), x0.a(this));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0070, code lost:
    
        if (r7.n(r9, r0) == r1) goto L27;
     */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0078  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x003d  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object requestStateChange(d dVar, boolean z11, kotlin.coroutines.d<? super Unit> dVar2) {
        DeliveryWidgetV4ViewModel$requestStateChange$1 deliveryWidgetV4ViewModel$requestStateChange$1;
        int i11;
        DeliveryWidgetV4ViewModel deliveryWidgetV4ViewModel;
        DeliveryWidgetV4VO deliveryWidgetV4VO;
        DeliveryWidgetV4VO deliveryWidgetV4VO2;
        if (dVar2 instanceof DeliveryWidgetV4ViewModel$requestStateChange$1) {
            deliveryWidgetV4ViewModel$requestStateChange$1 = (DeliveryWidgetV4ViewModel$requestStateChange$1) dVar2;
            int i12 = deliveryWidgetV4ViewModel$requestStateChange$1.label;
            if ((i12 & LinearLayoutManager.INVALID_OFFSET) != 0) {
                deliveryWidgetV4ViewModel$requestStateChange$1.label = i12 - LinearLayoutManager.INVALID_OFFSET;
                Object obj = deliveryWidgetV4ViewModel$requestStateChange$1.result;
                a aVar = a.COROUTINE_SUSPENDED;
                i11 = deliveryWidgetV4ViewModel$requestStateChange$1.label;
                if (i11 != 0) {
                    s.b(obj);
                    C10720e0 c10720e0 = C10720e0.f105451a;
                    b bVar = b.f10879b;
                    DeliveryWidgetV4ViewModel$requestStateChange$newState$1 deliveryWidgetV4ViewModel$requestStateChange$newState$1 = new DeliveryWidgetV4ViewModel$requestStateChange$newState$1(this, dVar, z11, null);
                    deliveryWidgetV4ViewModel$requestStateChange$1.L$0 = this;
                    deliveryWidgetV4ViewModel$requestStateChange$1.Z$0 = z11;
                    deliveryWidgetV4ViewModel$requestStateChange$1.label = 1;
                    obj = C10727i.f(bVar, deliveryWidgetV4ViewModel$requestStateChange$newState$1, deliveryWidgetV4ViewModel$requestStateChange$1);
                    if (obj != aVar) {
                        deliveryWidgetV4ViewModel = this;
                    }
                    return aVar;
                }
                if (i11 != 1) {
                    if (i11 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    s.b(obj);
                    return Unit.f71690a;
                }
                z11 = deliveryWidgetV4ViewModel$requestStateChange$1.Z$0;
                deliveryWidgetV4ViewModel = (DeliveryWidgetV4ViewModel) deliveryWidgetV4ViewModel$requestStateChange$1.L$0;
                s.b(obj);
                deliveryWidgetV4VO = (DeliveryWidgetV4VO) obj;
                if (deliveryWidgetV4VO != null || deliveryWidgetV4VO.equals(deliveryWidgetV4ViewModel.currentState)) {
                    if (z11) {
                        E0.b(deliveryWidgetV4ViewModel$requestStateChange$1.getContext(), null);
                    }
                    deliveryWidgetV4VO2 = deliveryWidgetV4ViewModel.currentState;
                    if (deliveryWidgetV4VO2 != null) {
                        deliveryWidgetV4ViewModel.scheduleUpdate(deliveryWidgetV4VO2);
                    }
                    return Unit.f71690a;
                }
                deliveryWidgetV4ViewModel.currentState = deliveryWidgetV4VO;
                h<DeliveryWidgetV4VO> hVar = deliveryWidgetV4ViewModel._widgetUpdates;
                deliveryWidgetV4ViewModel$requestStateChange$1.L$0 = null;
                deliveryWidgetV4ViewModel$requestStateChange$1.label = 2;
            }
        }
        deliveryWidgetV4ViewModel$requestStateChange$1 = new DeliveryWidgetV4ViewModel$requestStateChange$1(this, dVar2);
        Object obj2 = deliveryWidgetV4ViewModel$requestStateChange$1.result;
        a aVar2 = a.COROUTINE_SUSPENDED;
        i11 = deliveryWidgetV4ViewModel$requestStateChange$1.label;
        if (i11 != 0) {
        }
        deliveryWidgetV4VO = (DeliveryWidgetV4VO) obj2;
        if (deliveryWidgetV4VO != null) {
        }
        if (z11) {
        }
        deliveryWidgetV4VO2 = deliveryWidgetV4ViewModel.currentState;
        if (deliveryWidgetV4VO2 != null) {
        }
        return Unit.f71690a;
    }

    static /* synthetic */ Object requestStateChange$default(DeliveryWidgetV4ViewModel deliveryWidgetV4ViewModel, d dVar, boolean z11, kotlin.coroutines.d dVar2, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            z11 = false;
        }
        return deliveryWidgetV4ViewModel.requestStateChange(dVar, z11, dVar2);
    }

    public final void cancelScheduledWidgetUpdate() {
        B0 b02 = this.updateTimerJob;
        if (b02 != null) {
            b02.j(null);
        }
        this.updateTimerJob = null;
    }

    public final DeliveryWidgetV4VO getCurrentState() {
        return this.currentState;
    }

    @NotNull
    public final DeliveryWidgetV4Repository getRepository() {
        return this.repository;
    }

    @NotNull
    public final InterfaceC2395h<DeliveryWidgetV4VO> getWidgetUpdates() {
        return this.widgetUpdates;
    }

    @Override // androidx.lifecycle.w0
    public void onCleared() {
        cancelScheduledWidgetUpdate();
    }

    public final void scheduleUpdate(@NotNull DeliveryWidgetV4VO state) {
        Intrinsics.checkNotNullParameter(state, "state");
        this.currentState = state;
        this.widgetInfoCache = state.getWidgetInfo();
        B0 b02 = this.updateTimerJob;
        if (b02 == null || !b02.isActive()) {
            cancelScheduledWidgetUpdate();
            this.updateTimerJob = C10727i.c(x0.a(this), null, null, new DeliveryWidgetV4ViewModel$scheduleUpdate$1(this, null), 3);
        }
    }
}
