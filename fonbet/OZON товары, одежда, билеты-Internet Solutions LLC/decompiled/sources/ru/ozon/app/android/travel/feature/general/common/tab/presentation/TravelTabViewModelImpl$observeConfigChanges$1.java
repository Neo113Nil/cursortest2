package ru.ozon.app.android.travel.feature.general.common.tab.presentation;

import Ae.B0;
import Ae.C;
import Ae.C2380A;
import Ae.C2399j;
import Ae.C2408n0;
import Ae.InterfaceC2395h;
import Ae.InterfaceC2397i;
import Sc.InterfaceC4003e;
import Sc.s;
import Wc.a;
import androidx.lifecycle.V;
import androidx.recyclerview.widget.LinearLayoutManager;
import fd.InterfaceC6511n;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.c;
import kotlin.coroutines.jvm.internal.e;
import kotlin.coroutines.jvm.internal.j;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.C7719a;
import kotlin.jvm.internal.InterfaceC7732n;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.app.android.tabbar.data.TabConfigResponse;
import ru.ozon.app.android.tabbar.data.local.TabConfigCache;
import ru.ozon.app.android.tabbar.domain.TravelTabConfigUpdateDelegate;
import ru.ozon.app.android.tabbar.miniapp.travel.TravelTabConfigMapper;
import ru.ozon.app.android.tabbar.miniapp.travel.TravelTabConfigRepository;
import ru.ozon.app.android.travel.feature.general.common.tab.presentation.TravelTabScreenState;
import ru.ozon.app.android.utils.dispatcherprovider.CoroutineDispatcherProvider;
import xe.M;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lxe/M;", "", "<anonymous>", "(Lxe/M;)V"}, k = 3, mv = {2, 0, 0})
@e(c = "ru.ozon.app.android.travel.feature.general.common.tab.presentation.TravelTabViewModelImpl$observeConfigChanges$1", f = "TravelTabViewModel.kt", l = {89}, m = "invokeSuspend")
/* loaded from: classes3.dex */
final class TravelTabViewModelImpl$observeConfigChanges$1 extends j implements Function2<M, d<? super Unit>, Object> {
    final /* synthetic */ String $miniAppName;
    final /* synthetic */ String $referrerMiniAppName;
    int label;
    final /* synthetic */ TravelTabViewModelImpl this$0;

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u0004*\b\u0012\u0004\u0012\u00020\u00010\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"LAe/i;", "Lru/ozon/app/android/tabbar/data/TabConfigResponse;", "", "error", "", "<anonymous>", "(LAe/i;Ljava/lang/Throwable;)V"}, k = 3, mv = {2, 0, 0})
    @e(c = "ru.ozon.app.android.travel.feature.general.common.tab.presentation.TravelTabViewModelImpl$observeConfigChanges$1$2", f = "TravelTabViewModel.kt", l = {83, 83}, m = "invokeSuspend")
    /* renamed from: ru.ozon.app.android.travel.feature.general.common.tab.presentation.TravelTabViewModelImpl$observeConfigChanges$1$2, reason: invalid class name */
    static final class AnonymousClass2 extends j implements InterfaceC6511n<InterfaceC2397i<? super TabConfigResponse>, Throwable, d<? super Unit>, Object> {
        private /* synthetic */ Object L$0;
        /* synthetic */ Object L$1;
        int label;
        final /* synthetic */ TravelTabViewModelImpl this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass2(TravelTabViewModelImpl travelTabViewModelImpl, d<? super AnonymousClass2> dVar) {
            super(3, dVar);
            this.this$0 = travelTabViewModelImpl;
        }

        @Override // fd.InterfaceC6511n
        public final Object invoke(InterfaceC2397i<? super TabConfigResponse> interfaceC2397i, Throwable th2, d<? super Unit> dVar) {
            AnonymousClass2 anonymousClass2 = new AnonymousClass2(this.this$0, dVar);
            anonymousClass2.L$0 = interfaceC2397i;
            anonymousClass2.L$1 = th2;
            return anonymousClass2.invokeSuspend(Unit.f71690a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:13:0x004b, code lost:
        
            if (r1.emit(r6, r5) == r0) goto L15;
         */
        /* JADX WARN: Code restructure failed: missing block: B:14:0x004d, code lost:
        
            return r0;
         */
        /* JADX WARN: Code restructure failed: missing block: B:16:0x003f, code lost:
        
            if (r6 == r0) goto L15;
         */
        @Override // kotlin.coroutines.jvm.internal.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            InterfaceC2397i interfaceC2397i;
            TravelTabConfigRepository travelTabConfigRepository;
            a aVar = a.COROUTINE_SUSPENDED;
            int i11 = this.label;
            if (i11 == 0) {
                s.b(obj);
                interfaceC2397i = (InterfaceC2397i) this.L$0;
                Lm0.a.f17149a.e((Throwable) this.L$1);
                travelTabConfigRepository = this.this$0.repository;
                this.L$0 = interfaceC2397i;
                this.label = 1;
                obj = travelTabConfigRepository.getDefaultTabConfig(this);
            } else {
                if (i11 != 1) {
                    if (i11 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    s.b(obj);
                    return Unit.f71690a;
                }
                interfaceC2397i = (InterfaceC2397i) this.L$0;
                s.b(obj);
            }
            this.L$0 = null;
            this.label = 2;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, d2 = {"<anonymous>", "", "response", "Lru/ozon/app/android/tabbar/data/TabConfigResponse;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @e(c = "ru.ozon.app.android.travel.feature.general.common.tab.presentation.TravelTabViewModelImpl$observeConfigChanges$1$3", f = "TravelTabViewModel.kt", l = {}, m = "invokeSuspend")
    /* renamed from: ru.ozon.app.android.travel.feature.general.common.tab.presentation.TravelTabViewModelImpl$observeConfigChanges$1$3, reason: invalid class name */
    static final class AnonymousClass3 extends j implements Function2<TabConfigResponse, d<? super Unit>, Object> {
        final /* synthetic */ String $miniAppName;
        /* synthetic */ Object L$0;
        int label;
        final /* synthetic */ TravelTabViewModelImpl this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass3(TravelTabViewModelImpl travelTabViewModelImpl, String str, d<? super AnonymousClass3> dVar) {
            super(2, dVar);
            this.this$0 = travelTabViewModelImpl;
            this.$miniAppName = str;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final d<Unit> create(Object obj, d<?> dVar) {
            AnonymousClass3 anonymousClass3 = new AnonymousClass3(this.this$0, this.$miniAppName, dVar);
            anonymousClass3.L$0 = obj;
            return anonymousClass3;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            TabConfigCache tabConfigCache;
            a aVar = a.COROUTINE_SUSPENDED;
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            s.b(obj);
            TabConfigResponse tabConfigResponse = (TabConfigResponse) this.L$0;
            tabConfigCache = this.this$0.cache;
            tabConfigCache.saveConfig(this.$miniAppName, tabConfigResponse);
            return Unit.f71690a;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(TabConfigResponse tabConfigResponse, d<? super Unit> dVar) {
            return ((AnonymousClass3) create(tabConfigResponse, dVar)).invokeSuspend(Unit.f71690a);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"LAe/i;", "Lru/ozon/app/android/travel/feature/general/common/tab/presentation/TravelTabScreenState$Success;", "", "<anonymous>", "(LAe/i;)V"}, k = 3, mv = {2, 0, 0})
    @e(c = "ru.ozon.app.android.travel.feature.general.common.tab.presentation.TravelTabViewModelImpl$observeConfigChanges$1$5", f = "TravelTabViewModel.kt", l = {}, m = "invokeSuspend")
    /* renamed from: ru.ozon.app.android.travel.feature.general.common.tab.presentation.TravelTabViewModelImpl$observeConfigChanges$1$5, reason: invalid class name */
    static final class AnonymousClass5 extends j implements Function2<InterfaceC2397i<? super TravelTabScreenState.Success>, d<? super Unit>, Object> {
        int label;
        final /* synthetic */ TravelTabViewModelImpl this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass5(TravelTabViewModelImpl travelTabViewModelImpl, d<? super AnonymousClass5> dVar) {
            super(2, dVar);
            this.this$0 = travelTabViewModelImpl;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final d<Unit> create(Object obj, d<?> dVar) {
            return new AnonymousClass5(this.this$0, dVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC2397i<? super TravelTabScreenState.Success> interfaceC2397i, d<? super Unit> dVar) {
            return ((AnonymousClass5) create(interfaceC2397i, dVar)).invokeSuspend(Unit.f71690a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            a aVar = a.COROUTINE_SUSPENDED;
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            s.b(obj);
            this.this$0.getScreenState().setValue(TravelTabScreenState.Loading.INSTANCE);
            return Unit.f71690a;
        }
    }

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    /* renamed from: ru.ozon.app.android.travel.feature.general.common.tab.presentation.TravelTabViewModelImpl$observeConfigChanges$1$6, reason: invalid class name */
    /* synthetic */ class AnonymousClass6 implements InterfaceC2397i, InterfaceC7732n {
        final /* synthetic */ V<TravelTabScreenState> $tmp0;

        AnonymousClass6(V<TravelTabScreenState> v11) {
            this.$tmp0 = v11;
        }

        @Override // Ae.InterfaceC2397i
        public /* bridge */ /* synthetic */ Object emit(Object obj, d dVar) {
            return emit((TravelTabScreenState) obj, (d<? super Unit>) dVar);
        }

        public final boolean equals(Object obj) {
            if ((obj instanceof InterfaceC2397i) && (obj instanceof InterfaceC7732n)) {
                return Intrinsics.d(getFunctionDelegate(), ((InterfaceC7732n) obj).getFunctionDelegate());
            }
            return false;
        }

        @Override // kotlin.jvm.internal.InterfaceC7732n
        public final InterfaceC4003e<?> getFunctionDelegate() {
            return new C7719a(2, this.$tmp0, V.class, "setValue", "setValue(Ljava/lang/Object;)V", 4);
        }

        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }

        public final Object emit(TravelTabScreenState travelTabScreenState, d<? super Unit> dVar) {
            Object invokeSuspend$setValue = TravelTabViewModelImpl$observeConfigChanges$1.invokeSuspend$setValue(this.$tmp0, travelTabScreenState, dVar);
            return invokeSuspend$setValue == a.COROUTINE_SUSPENDED ? invokeSuspend$setValue : Unit.f71690a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    TravelTabViewModelImpl$observeConfigChanges$1(TravelTabViewModelImpl travelTabViewModelImpl, String str, String str2, d<? super TravelTabViewModelImpl$observeConfigChanges$1> dVar) {
        super(2, dVar);
        this.this$0 = travelTabViewModelImpl;
        this.$miniAppName = str;
        this.$referrerMiniAppName = str2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ Object invokeSuspend$setValue(V v11, TravelTabScreenState travelTabScreenState, d dVar) {
        v11.setValue(travelTabScreenState);
        return Unit.f71690a;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final d<Unit> create(Object obj, d<?> dVar) {
        return new TravelTabViewModelImpl$observeConfigChanges$1(this.this$0, this.$miniAppName, this.$referrerMiniAppName, dVar);
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
            final TravelTabViewModelImpl travelTabViewModelImpl = this.this$0;
            final String str = this.$miniAppName;
            final String str2 = this.$referrerMiniAppName;
            final C2408n0 c2408n0 = new C2408n0(new C(new InterfaceC2395h<TabConfigResponse>() { // from class: ru.ozon.app.android.travel.feature.general.common.tab.presentation.TravelTabViewModelImpl$observeConfigChanges$1$invokeSuspend$$inlined$map$1

                @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
                /* renamed from: ru.ozon.app.android.travel.feature.general.common.tab.presentation.TravelTabViewModelImpl$observeConfigChanges$1$invokeSuspend$$inlined$map$1$2, reason: invalid class name */
                public static final class AnonymousClass2<T> implements InterfaceC2397i {
                    final /* synthetic */ String $miniAppName$inlined;
                    final /* synthetic */ String $referrerMiniAppName$inlined;
                    final /* synthetic */ InterfaceC2397i $this_unsafeFlow;
                    final /* synthetic */ TravelTabViewModelImpl this$0;

                    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
                    @e(c = "ru.ozon.app.android.travel.feature.general.common.tab.presentation.TravelTabViewModelImpl$observeConfigChanges$1$invokeSuspend$$inlined$map$1$2", f = "TravelTabViewModel.kt", l = {51, 50}, m = "emit")
                    /* renamed from: ru.ozon.app.android.travel.feature.general.common.tab.presentation.TravelTabViewModelImpl$observeConfigChanges$1$invokeSuspend$$inlined$map$1$2$1, reason: invalid class name */
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

                    public AnonymousClass2(InterfaceC2397i interfaceC2397i, TravelTabViewModelImpl travelTabViewModelImpl, String str, String str2) {
                        this.$this_unsafeFlow = interfaceC2397i;
                        this.this$0 = travelTabViewModelImpl;
                        this.$miniAppName$inlined = str;
                        this.$referrerMiniAppName$inlined = str2;
                    }

                    /* JADX WARN: Code restructure failed: missing block: B:18:0x0062, code lost:
                    
                        if (r8.emit(r9, r0) != r1) goto L23;
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
                        TravelTabConfigRepository travelTabConfigRepository;
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
                                    travelTabConfigRepository = this.this$0.repository;
                                    String str = this.$miniAppName$inlined;
                                    String str2 = this.$referrerMiniAppName$inlined;
                                    anonymousClass1.L$0 = interfaceC2397i2;
                                    anonymousClass1.label = 1;
                                    Object loadTabConfig = travelTabConfigRepository.loadTabConfig(str, str2, anonymousClass1);
                                    if (loadTabConfig != obj3) {
                                        obj2 = loadTabConfig;
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
                    Object collect = InterfaceC2395h.this.collect(new AnonymousClass2(interfaceC2397i, travelTabViewModelImpl, str, str2), dVar);
                    return collect == a.COROUTINE_SUSPENDED ? collect : Unit.f71690a;
                }
            }, new AnonymousClass2(this.this$0, null)), new AnonymousClass3(this.this$0, this.$miniAppName, null));
            final TravelTabViewModelImpl travelTabViewModelImpl2 = this.this$0;
            InterfaceC2395h<TravelTabScreenState.Success> interfaceC2395h = new InterfaceC2395h<TravelTabScreenState.Success>() { // from class: ru.ozon.app.android.travel.feature.general.common.tab.presentation.TravelTabViewModelImpl$observeConfigChanges$1$invokeSuspend$$inlined$map$2

                @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
                /* renamed from: ru.ozon.app.android.travel.feature.general.common.tab.presentation.TravelTabViewModelImpl$observeConfigChanges$1$invokeSuspend$$inlined$map$2$2, reason: invalid class name */
                public static final class AnonymousClass2<T> implements InterfaceC2397i {
                    final /* synthetic */ InterfaceC2397i $this_unsafeFlow;
                    final /* synthetic */ TravelTabViewModelImpl this$0;

                    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
                    @e(c = "ru.ozon.app.android.travel.feature.general.common.tab.presentation.TravelTabViewModelImpl$observeConfigChanges$1$invokeSuspend$$inlined$map$2$2", f = "TravelTabViewModel.kt", l = {50}, m = "emit")
                    /* renamed from: ru.ozon.app.android.travel.feature.general.common.tab.presentation.TravelTabViewModelImpl$observeConfigChanges$1$invokeSuspend$$inlined$map$2$2$1, reason: invalid class name */
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

                    public AnonymousClass2(InterfaceC2397i interfaceC2397i, TravelTabViewModelImpl travelTabViewModelImpl) {
                        this.$this_unsafeFlow = interfaceC2397i;
                        this.this$0 = travelTabViewModelImpl;
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
                        TravelTabConfigMapper travelTabConfigMapper;
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
                                    travelTabConfigMapper = this.this$0.mapper;
                                    TravelTabScreenState.Success success = new TravelTabScreenState.Success(travelTabConfigMapper.map((TabConfigResponse) obj));
                                    anonymousClass1.label = 1;
                                    if (interfaceC2397i.emit(success, anonymousClass1) == aVar) {
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
                public Object collect(InterfaceC2397i<? super TravelTabScreenState.Success> interfaceC2397i, d dVar) {
                    Object collect = InterfaceC2395h.this.collect(new AnonymousClass2(interfaceC2397i, travelTabViewModelImpl2), dVar);
                    return collect == a.COROUTINE_SUSPENDED ? collect : Unit.f71690a;
                }
            };
            coroutineDispatcherProvider = this.this$0.coroutineDispatcherProvider;
            C2380A c2380a = new C2380A(C2399j.B(interfaceC2395h, coroutineDispatcherProvider.getIO()), new AnonymousClass5(this.this$0, null));
            AnonymousClass6 anonymousClass6 = new AnonymousClass6(this.this$0.getScreenState());
            this.label = 1;
            if (c2380a.collect(anonymousClass6, this) == aVar) {
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
        return ((TravelTabViewModelImpl$observeConfigChanges$1) create(m11, dVar)).invokeSuspend(Unit.f71690a);
    }
}
