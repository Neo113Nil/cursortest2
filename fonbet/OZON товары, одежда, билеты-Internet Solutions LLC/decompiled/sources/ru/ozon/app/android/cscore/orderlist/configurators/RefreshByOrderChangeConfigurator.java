package ru.ozon.app.android.cscore.orderlist.configurators;

import A00.a;
import Ae.C2399j;
import Ae.C2408n0;
import Ae.InterfaceC2395h;
import Ae.InterfaceC2397i;
import B90.C2600b;
import Pc.a;
import Sc.s;
import android.net.Uri;
import android.os.Bundle;
import androidx.lifecycle.J;
import androidx.lifecycle.K;
import androidx.lifecycle.w0;
import androidx.lifecycle.z0;
import androidx.recyclerview.widget.LinearLayoutManager;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.c;
import kotlin.coroutines.jvm.internal.e;
import kotlin.jvm.internal.Intrinsics;
import l10.InterfaceC7851b;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.account.orders.OrderListChangeStateViewModel;
import ru.ozon.app.android.composer.ConfiguratorReferences;
import ru.ozon.app.android.composer.universalscreen.view.ComposerScreenConfig;

@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0007\u0018\u0000 \u001b2\u00020\u0001:\u0001\u001bB\u0017\b\u0007\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\b\u0010\tJ\u001b\u0010\f\u001a\u00020\u00072\n\u0010\u000b\u001a\u0006\u0012\u0002\b\u00030\nH\u0002¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000e\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\u000e\u0010\tJ\u000f\u0010\u000f\u001a\u00020\u0007H\u0014¢\u0006\u0004\b\u000f\u0010\tJ\u0017\u0010\u0012\u001a\u00020\u00072\u0006\u0010\u0011\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0012\u0010\u0013R\u001a\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u0014R\u0016\u0010\u0016\u001a\u00020\u00158\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u0018\u0010\u0019\u001a\u0004\u0018\u00010\u00188\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0019\u0010\u001a¨\u0006\u001c"}, d2 = {"Lru/ozon/app/android/cscore/orderlist/configurators/RefreshByOrderChangeConfigurator;", "Lru/ozon/app/android/composer/universalscreen/view/ComposerScreenConfig$PageConfigurator;", "LPc/a;", "Lru/ozon/app/android/account/orders/OrderListChangeStateViewModel;", "provider", "<init>", "(LPc/a;)V", "", "subscribeLoadCompletedEvents", "()V", "LA00/a$o;", "event", "cachePage", "(LA00/a$o;)V", "changeDeliveryTimeResultListener", "onComposerInitialized", "Landroidx/lifecycle/J;", "owner", "onResume", "(Landroidx/lifecycle/J;)V", "LPc/a;", "", "localLastUpdateTime", "J", "", "currentUrl", "Ljava/lang/String;", "Companion", "csma_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class RefreshByOrderChangeConfigurator extends ComposerScreenConfig.PageConfigurator {
    private String currentUrl;
    private long localLastUpdateTime;

    @NotNull
    private final a<OrderListChangeStateViewModel> provider;
    public static final int $stable = 8;

    public RefreshByOrderChangeConfigurator(@NotNull a<OrderListChangeStateViewModel> provider) {
        Intrinsics.checkNotNullParameter(provider, "provider");
        this.provider = provider;
        this.localLastUpdateTime = System.currentTimeMillis();
    }

    private final void cachePage(a.o<?> event) {
        this.currentUrl = event.f().f().c();
    }

    private final void changeDeliveryTimeResultListener() {
        getContainer().j().getParentFragmentManager().n1("update_order_details_result", getContainer().g(), new C2600b(this));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void changeDeliveryTimeResultListener$lambda$1(RefreshByOrderChangeConfigurator refreshByOrderChangeConfigurator, String str, Bundle result) {
        ConfiguratorReferences references;
        InterfaceC7851b controller;
        Intrinsics.checkNotNullParameter(str, "<unused var>");
        Intrinsics.checkNotNullParameter(result, "result");
        if (!result.getBoolean("update_order_details_key") || (references = refreshByOrderChangeConfigurator.getReferences()) == null || (controller = references.getController()) == null) {
            return;
        }
        InterfaceC7851b.a.a(controller, null, null, null, null, 15);
    }

    private final void subscribeLoadCompletedEvents() {
        InterfaceC7851b controller;
        final InterfaceC2395h<A00.a> eventsFlow;
        ConfiguratorReferences references = getReferences();
        if (references == null || (controller = references.getController()) == null || (eventsFlow = controller.getEventsFlow()) == null) {
            return;
        }
        C2399j.C(new C2408n0(new InterfaceC2395h<Object>() { // from class: ru.ozon.app.android.cscore.orderlist.configurators.RefreshByOrderChangeConfigurator$subscribeLoadCompletedEvents$$inlined$filterIsInstance$1

            @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
            /* renamed from: ru.ozon.app.android.cscore.orderlist.configurators.RefreshByOrderChangeConfigurator$subscribeLoadCompletedEvents$$inlined$filterIsInstance$1$2, reason: invalid class name */
            public static final class AnonymousClass2<T> implements InterfaceC2397i {
                final /* synthetic */ InterfaceC2397i $this_unsafeFlow;

                @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
                @e(c = "ru.ozon.app.android.cscore.orderlist.configurators.RefreshByOrderChangeConfigurator$subscribeLoadCompletedEvents$$inlined$filterIsInstance$1$2", f = "RefreshByOrderChangeConfigurator.kt", l = {50}, m = "emit")
                /* renamed from: ru.ozon.app.android.cscore.orderlist.configurators.RefreshByOrderChangeConfigurator$subscribeLoadCompletedEvents$$inlined$filterIsInstance$1$2$1, reason: invalid class name */
                public static final class AnonymousClass1 extends c {
                    int label;
                    /* synthetic */ Object result;

                    public AnonymousClass1(d dVar) {
                        super(dVar);
                    }

                    @Override // kotlin.coroutines.jvm.internal.a
                    public final Object invokeSuspend(Object obj) {
                        this.result = obj;
                        this.label |= LinearLayoutManager.INVALID_OFFSET;
                        return AnonymousClass2.this.emit(null, this);
                    }
                }

                public AnonymousClass2(InterfaceC2397i interfaceC2397i) {
                    this.$this_unsafeFlow = interfaceC2397i;
                }

                /* JADX WARN: Removed duplicated region for block: B:15:0x002f  */
                /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
                @Override // Ae.InterfaceC2397i
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final Object emit(Object obj, d dVar) {
                    AnonymousClass1 anonymousClass1;
                    int i11;
                    if (dVar instanceof AnonymousClass1) {
                        anonymousClass1 = (AnonymousClass1) dVar;
                        int i12 = anonymousClass1.label;
                        if ((i12 & LinearLayoutManager.INVALID_OFFSET) != 0) {
                            anonymousClass1.label = i12 - LinearLayoutManager.INVALID_OFFSET;
                            Object obj2 = anonymousClass1.result;
                            Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
                            i11 = anonymousClass1.label;
                            if (i11 != 0) {
                                s.b(obj2);
                                InterfaceC2397i interfaceC2397i = this.$this_unsafeFlow;
                                if (obj instanceof a.o) {
                                    anonymousClass1.label = 1;
                                    if (interfaceC2397i.emit(obj, anonymousClass1) == aVar) {
                                        return aVar;
                                    }
                                }
                            } else {
                                if (i11 != 1) {
                                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                }
                                s.b(obj2);
                            }
                            return Unit.f71690a;
                        }
                    }
                    anonymousClass1 = new AnonymousClass1(dVar);
                    Object obj22 = anonymousClass1.result;
                    Wc.a aVar2 = Wc.a.COROUTINE_SUSPENDED;
                    i11 = anonymousClass1.label;
                    if (i11 != 0) {
                    }
                    return Unit.f71690a;
                }
            }

            @Override // Ae.InterfaceC2395h
            public Object collect(InterfaceC2397i<? super Object> interfaceC2397i, d dVar) {
                Object collect = InterfaceC2395h.this.collect(new AnonymousClass2(interfaceC2397i), dVar);
                return collect == Wc.a.COROUTINE_SUSPENDED ? collect : Unit.f71690a;
            }
        }, new RefreshByOrderChangeConfigurator$subscribeLoadCompletedEvents$1(this)), K.a(getOwner()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ Object subscribeLoadCompletedEvents$cachePage(RefreshByOrderChangeConfigurator refreshByOrderChangeConfigurator, a.o oVar, d dVar) {
        refreshByOrderChangeConfigurator.cachePage(oVar);
        return Unit.f71690a;
    }

    @Override // ru.ozon.app.android.composer.universalscreen.view.ComposerScreenConfig.PageConfigurator
    protected void onComposerInitialized() {
        subscribeLoadCompletedEvents();
        changeDeliveryTimeResultListener();
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public void onResume(@NotNull J owner) {
        InterfaceC7851b controller;
        Uri parse;
        Intrinsics.checkNotNullParameter(owner, "owner");
        OrderListChangeStateViewModel orderListChangeStateViewModel = (OrderListChangeStateViewModel) new z0(getContainer().j(), new z0.c() { // from class: ru.ozon.app.android.cscore.orderlist.configurators.RefreshByOrderChangeConfigurator$onResume$$inlined$viewModel$1
            @Override // androidx.lifecycle.z0.c, androidx.lifecycle.z0.b
            public <T extends w0> T create(Class<T> modelClass) {
                Pc.a aVar;
                Intrinsics.checkNotNullParameter(modelClass, "modelClass");
                aVar = RefreshByOrderChangeConfigurator.this.provider;
                OrderListChangeStateViewModel orderListChangeStateViewModel2 = (OrderListChangeStateViewModel) aVar.get();
                Intrinsics.g(orderListChangeStateViewModel2, "null cannot be cast to non-null type T of ru.ozon.app.android.utils.lifecycle.ViewModelExtKt.vmFactory.<no name provided>.create");
                return orderListChangeStateViewModel2;
            }
        }).a(OrderListChangeStateViewModel.class);
        String str = this.currentUrl;
        if (!Intrinsics.d((str == null || (parse = Uri.parse(str)) == null) ? null : parse.getQueryParameter("notification"), "payment_failed") && this.localLastUpdateTime < orderListChangeStateViewModel.getLastUpdateTime()) {
            this.localLastUpdateTime = orderListChangeStateViewModel.getLastUpdateTime();
            ConfiguratorReferences references = getReferences();
            if (references == null || (controller = references.getController()) == null) {
                return;
            }
            InterfaceC7851b.a.a(controller, null, null, null, null, 15);
        }
    }
}
