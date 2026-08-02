package ru.ozon.app.android.travel.feature.entry.fragment;

import Ae.B0;
import Ae.C2399j;
import Ae.InterfaceC2395h;
import Ae.InterfaceC2397i;
import Ae.x0;
import Sc.s;
import Wc.a;
import androidx.recyclerview.widget.LinearLayoutManager;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.c;
import kotlin.coroutines.jvm.internal.e;
import kotlin.coroutines.jvm.internal.j;
import kotlin.jvm.functions.Function2;
import ru.ozon.app.android.tabbar.data.RemoteTabConfig;
import ru.ozon.app.android.tabbar.data.TabConfigResponse;
import ru.ozon.app.android.tabbar.domain.TravelTabConfigUpdateDelegate;
import ru.ozon.app.android.travel.feature.entry.data.OzonTravelTabConfigMapper;
import ru.ozon.app.android.travel.feature.entry.data.OzonTravelTabConfigRepository;
import ru.ozon.app.android.utils.dispatcherprovider.CoroutineDispatcherProvider;
import xe.M;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lxe/M;", "", "<anonymous>", "(Lxe/M;)V"}, k = 3, mv = {2, 0, 0})
@e(c = "ru.ozon.app.android.travel.feature.entry.fragment.OzonTravelFragmentViewModelImpl$loadTabConfig$1", f = "OzonTravelFragmentViewModel.kt", l = {59}, m = "invokeSuspend")
/* loaded from: classes3.dex */
final class OzonTravelFragmentViewModelImpl$loadTabConfig$1 extends j implements Function2<M, d<? super Unit>, Object> {
    int label;
    final /* synthetic */ OzonTravelFragmentViewModelImpl this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    OzonTravelFragmentViewModelImpl$loadTabConfig$1(OzonTravelFragmentViewModelImpl ozonTravelFragmentViewModelImpl, d<? super OzonTravelFragmentViewModelImpl$loadTabConfig$1> dVar) {
        super(2, dVar);
        this.this$0 = ozonTravelFragmentViewModelImpl;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final d<Unit> create(Object obj, d<?> dVar) {
        return new OzonTravelFragmentViewModelImpl$loadTabConfig$1(this.this$0, dVar);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        TravelTabConfigUpdateDelegate travelTabConfigUpdateDelegate;
        CoroutineDispatcherProvider coroutineDispatcherProvider;
        a aVar = a.COROUTINE_SUSPENDED;
        int i11 = this.label;
        if (i11 == 0) {
            s.b(obj);
            travelTabConfigUpdateDelegate = this.this$0.configUpdateDelegate;
            final B0<Unit> updates = travelTabConfigUpdateDelegate.getUpdates();
            final OzonTravelFragmentViewModelImpl ozonTravelFragmentViewModelImpl = this.this$0;
            final InterfaceC2395h<TabConfigResponse> interfaceC2395h = new InterfaceC2395h<TabConfigResponse>() { // from class: ru.ozon.app.android.travel.feature.entry.fragment.OzonTravelFragmentViewModelImpl$loadTabConfig$1$invokeSuspend$$inlined$map$1

                @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
                /* renamed from: ru.ozon.app.android.travel.feature.entry.fragment.OzonTravelFragmentViewModelImpl$loadTabConfig$1$invokeSuspend$$inlined$map$1$2, reason: invalid class name */
                public static final class AnonymousClass2<T> implements InterfaceC2397i {
                    final /* synthetic */ InterfaceC2397i $this_unsafeFlow;
                    final /* synthetic */ OzonTravelFragmentViewModelImpl this$0;

                    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
                    @e(c = "ru.ozon.app.android.travel.feature.entry.fragment.OzonTravelFragmentViewModelImpl$loadTabConfig$1$invokeSuspend$$inlined$map$1$2", f = "OzonTravelFragmentViewModel.kt", l = {51, 50}, m = "emit")
                    /* renamed from: ru.ozon.app.android.travel.feature.entry.fragment.OzonTravelFragmentViewModelImpl$loadTabConfig$1$invokeSuspend$$inlined$map$1$2$1, reason: invalid class name */
                    public static final class AnonymousClass1 extends c {
                        Object L$0;
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

                    public AnonymousClass2(InterfaceC2397i interfaceC2397i, OzonTravelFragmentViewModelImpl ozonTravelFragmentViewModelImpl) {
                        this.$this_unsafeFlow = interfaceC2397i;
                        this.this$0 = ozonTravelFragmentViewModelImpl;
                    }

                    /* JADX WARN: Code restructure failed: missing block: B:18:0x005e, code lost:
                    
                        if (r7.emit(r8, r0) != r1) goto L23;
                     */
                    /* JADX WARN: Removed duplicated region for block: B:20:0x003a  */
                    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
                    @Override // Ae.InterfaceC2397i
                    /*
                        Code decompiled incorrectly, please refer to instructions dump.
                    */
                    public final Object emit(Object obj, d dVar) {
                        AnonymousClass1 anonymousClass1;
                        int i11;
                        OzonTravelTabConfigRepository ozonTravelTabConfigRepository;
                        InterfaceC2397i interfaceC2397i;
                        if (dVar instanceof AnonymousClass1) {
                            anonymousClass1 = (AnonymousClass1) dVar;
                            int i12 = anonymousClass1.label;
                            if ((i12 & LinearLayoutManager.INVALID_OFFSET) != 0) {
                                anonymousClass1.label = i12 - LinearLayoutManager.INVALID_OFFSET;
                                Object obj2 = anonymousClass1.result;
                                Object obj3 = a.COROUTINE_SUSPENDED;
                                i11 = anonymousClass1.label;
                                if (i11 != 0) {
                                    s.b(obj2);
                                    InterfaceC2397i interfaceC2397i2 = this.$this_unsafeFlow;
                                    ozonTravelTabConfigRepository = this.this$0.tabConfigRepository;
                                    anonymousClass1.L$0 = interfaceC2397i2;
                                    anonymousClass1.label = 1;
                                    Object tabConfig = ozonTravelTabConfigRepository.getTabConfig(anonymousClass1);
                                    if (tabConfig != obj3) {
                                        obj2 = tabConfig;
                                        interfaceC2397i = interfaceC2397i2;
                                    }
                                    return obj3;
                                }
                                if (i11 != 1) {
                                    if (i11 != 2) {
                                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                    }
                                    s.b(obj2);
                                    return Unit.f71690a;
                                }
                                InterfaceC2397i interfaceC2397i3 = (InterfaceC2397i) anonymousClass1.L$0;
                                s.b(obj2);
                                interfaceC2397i = interfaceC2397i3;
                                anonymousClass1.L$0 = null;
                                anonymousClass1.label = 2;
                            }
                        }
                        anonymousClass1 = new AnonymousClass1(dVar);
                        Object obj22 = anonymousClass1.result;
                        Object obj32 = a.COROUTINE_SUSPENDED;
                        i11 = anonymousClass1.label;
                        if (i11 != 0) {
                        }
                        anonymousClass1.L$0 = null;
                        anonymousClass1.label = 2;
                    }
                }

                @Override // Ae.InterfaceC2395h
                public Object collect(InterfaceC2397i<? super TabConfigResponse> interfaceC2397i, d dVar) {
                    Object collect = InterfaceC2395h.this.collect(new AnonymousClass2(interfaceC2397i, ozonTravelFragmentViewModelImpl), dVar);
                    return collect == a.COROUTINE_SUSPENDED ? collect : Unit.f71690a;
                }
            };
            final OzonTravelFragmentViewModelImpl ozonTravelFragmentViewModelImpl2 = this.this$0;
            InterfaceC2395h<RemoteTabConfig> interfaceC2395h2 = new InterfaceC2395h<RemoteTabConfig>() { // from class: ru.ozon.app.android.travel.feature.entry.fragment.OzonTravelFragmentViewModelImpl$loadTabConfig$1$invokeSuspend$$inlined$map$2

                @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
                /* renamed from: ru.ozon.app.android.travel.feature.entry.fragment.OzonTravelFragmentViewModelImpl$loadTabConfig$1$invokeSuspend$$inlined$map$2$2, reason: invalid class name */
                public static final class AnonymousClass2<T> implements InterfaceC2397i {
                    final /* synthetic */ InterfaceC2397i $this_unsafeFlow;
                    final /* synthetic */ OzonTravelFragmentViewModelImpl this$0;

                    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
                    @e(c = "ru.ozon.app.android.travel.feature.entry.fragment.OzonTravelFragmentViewModelImpl$loadTabConfig$1$invokeSuspend$$inlined$map$2$2", f = "OzonTravelFragmentViewModel.kt", l = {50}, m = "emit")
                    /* renamed from: ru.ozon.app.android.travel.feature.entry.fragment.OzonTravelFragmentViewModelImpl$loadTabConfig$1$invokeSuspend$$inlined$map$2$2$1, reason: invalid class name */
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

                    public AnonymousClass2(InterfaceC2397i interfaceC2397i, OzonTravelFragmentViewModelImpl ozonTravelFragmentViewModelImpl) {
                        this.$this_unsafeFlow = interfaceC2397i;
                        this.this$0 = ozonTravelFragmentViewModelImpl;
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
                        OzonTravelTabConfigMapper ozonTravelTabConfigMapper;
                        if (dVar instanceof AnonymousClass1) {
                            anonymousClass1 = (AnonymousClass1) dVar;
                            int i12 = anonymousClass1.label;
                            if ((i12 & LinearLayoutManager.INVALID_OFFSET) != 0) {
                                anonymousClass1.label = i12 - LinearLayoutManager.INVALID_OFFSET;
                                Object obj2 = anonymousClass1.result;
                                a aVar = a.COROUTINE_SUSPENDED;
                                i11 = anonymousClass1.label;
                                if (i11 != 0) {
                                    s.b(obj2);
                                    InterfaceC2397i interfaceC2397i = this.$this_unsafeFlow;
                                    ozonTravelTabConfigMapper = this.this$0.tabConfigMapper;
                                    RemoteTabConfig map = ozonTravelTabConfigMapper.map((TabConfigResponse) obj);
                                    anonymousClass1.label = 1;
                                    if (interfaceC2397i.emit(map, anonymousClass1) == aVar) {
                                        return aVar;
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
                        a aVar2 = a.COROUTINE_SUSPENDED;
                        i11 = anonymousClass1.label;
                        if (i11 != 0) {
                        }
                        return Unit.f71690a;
                    }
                }

                @Override // Ae.InterfaceC2395h
                public Object collect(InterfaceC2397i<? super RemoteTabConfig> interfaceC2397i, d dVar) {
                    Object collect = InterfaceC2395h.this.collect(new AnonymousClass2(interfaceC2397i, ozonTravelFragmentViewModelImpl2), dVar);
                    return collect == a.COROUTINE_SUSPENDED ? collect : Unit.f71690a;
                }
            };
            coroutineDispatcherProvider = this.this$0.dispatcherProvider;
            InterfaceC2395h B11 = C2399j.B(interfaceC2395h2, coroutineDispatcherProvider.getIO());
            final OzonTravelFragmentViewModelImpl ozonTravelFragmentViewModelImpl3 = this.this$0;
            InterfaceC2397i interfaceC2397i = new InterfaceC2397i() { // from class: ru.ozon.app.android.travel.feature.entry.fragment.OzonTravelFragmentViewModelImpl$loadTabConfig$1.3
                @Override // Ae.InterfaceC2397i
                public /* bridge */ /* synthetic */ Object emit(Object obj2, d dVar) {
                    return emit((RemoteTabConfig) obj2, (d<? super Unit>) dVar);
                }

                public final Object emit(RemoteTabConfig remoteTabConfig, d<? super Unit> dVar) {
                    x0 x0Var;
                    OzonTravelFragmentViewModelImpl.this.tabConfig = remoteTabConfig;
                    x0Var = OzonTravelFragmentViewModelImpl.this._tabConfigFlow;
                    Object emit = x0Var.emit(remoteTabConfig, dVar);
                    return emit == a.COROUTINE_SUSPENDED ? emit : Unit.f71690a;
                }
            };
            this.label = 1;
            if (B11.collect(interfaceC2397i, this) == aVar) {
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
        return ((OzonTravelFragmentViewModelImpl$loadTabConfig$1) create(m11, dVar)).invokeSuspend(Unit.f71690a);
    }
}
