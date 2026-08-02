package ru.ozon.app.android.abtool.presentation;

import Ae.C2399j;
import Ae.C2417s0;
import Ae.InterfaceC2395h;
import Ae.InterfaceC2397i;
import Ae.O0;
import Ae.x0;
import Be.m;
import He.b;
import Sc.InterfaceC4008j;
import Sc.k;
import Sc.s;
import Wc.a;
import androidx.lifecycle.P;
import androidx.lifecycle.w0;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.google.android.gms.actions.SearchIntents;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.measurement.dynamite.ModuleDescriptor;
import com.google.android.gms.fido.u2f.api.common.RegisterRequest;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import fd.InterfaceC6511n;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.C7714v;
import kotlin.collections.K;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.c;
import kotlin.coroutines.jvm.internal.e;
import kotlin.coroutines.jvm.internal.j;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.h;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.abtool.AbToolImpl;
import ru.ozon.app.android.abtool.AbToolNamespace;
import ru.ozon.app.android.abtool.data.mapper.ExperimentMapper;
import ru.ozon.app.android.abtool.di.DiStoreWrapper;
import ru.ozon.app.android.abtool.domain.FeatureDebugModel;
import ru.ozon.app.android.abtool.presentation.experiments.recycler.ExperimentItem;
import ru.ozon.app.android.abtool.presentation.features.recycler.FeatureItem;
import ru.ozon.app.android.abtool.presentation.features.recycler.ListItem;
import ru.ozon.app.android.abtool.presentation.features.recycler.ServiceHeader;
import xe.C10720e0;
import xe.C10727i;
import xe.I;
import xe.M;

@Metadata(d1 = {"\u0000j\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010!\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ'\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\r0\f*\b\u0012\u0004\u0012\u00020\r0\f2\u0006\u0010\u000f\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u0010\u0010\u0011J#\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00130\f2\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\r0\fH\u0002¢\u0006\u0004\b\u0014\u0010\u0015J3\u0010\u001b\u001a\u00020\u001a2\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00130\u00162\u0006\u0010\u0019\u001a\u00020\u00182\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\r0\fH\u0002¢\u0006\u0004\b\u001b\u0010\u001cJ\u0018\u0010\u001e\u001a\u00020\u001a2\u0006\u0010\u001d\u001a\u00020\u0018H\u0082@¢\u0006\u0004\b\u001e\u0010\u001fJ\u0015\u0010\u001d\u001a\u00020\u001a2\u0006\u0010\u001d\u001a\u00020\u0018¢\u0006\u0004\b\u001d\u0010 J\u0015\u0010\"\u001a\u00020\u001a2\u0006\u0010!\u001a\u00020\u0018¢\u0006\u0004\b\"\u0010 J\u001d\u0010%\u001a\u00020\u001a2\u0006\u0010#\u001a\u00020\r2\u0006\u0010$\u001a\u00020\u000e¢\u0006\u0004\b%\u0010&J\u001d\u0010%\u001a\u00020\u001a2\u0006\u0010#\u001a\u00020\r2\u0006\u0010$\u001a\u00020\u0018¢\u0006\u0004\b%\u0010'J\u0019\u0010)\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00130\f0(¢\u0006\u0004\b)\u0010*J\u0015\u0010,\u001a\u00020\u001a2\u0006\u0010+\u001a\u00020\u000e¢\u0006\u0004\b,\u0010-R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010.R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010/R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u00100R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u00101R'\u00108\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002030\f028FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b4\u00105\u001a\u0004\b6\u00107R\u001a\u0010:\u001a\b\u0012\u0004\u0012\u00020\u0018098\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b:\u0010;R\u001a\u0010<\u001a\b\u0012\u0004\u0012\u00020\u000e098\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b<\u0010;R \u0010=\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\r0\f098\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b=\u0010;R \u0010\u0017\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00130\f098\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010;¨\u0006>"}, d2 = {"Lru/ozon/app/android/abtool/presentation/AbToggleViewModel;", "Landroidx/lifecycle/w0;", "Lru/ozon/app/android/abtool/AbToolImpl;", "abTool", "Lru/ozon/app/android/abtool/AbToolNamespace;", "namespace", "Lru/ozon/app/android/abtool/data/mapper/ExperimentMapper;", "experimentsMapper", "Lxe/I;", "dispatcher", "<init>", "(Lru/ozon/app/android/abtool/AbToolImpl;Lru/ozon/app/android/abtool/AbToolNamespace;Lru/ozon/app/android/abtool/data/mapper/ExperimentMapper;Lxe/I;)V", "", "Lru/ozon/app/android/abtool/presentation/features/recycler/FeatureItem;", "", "onlyLocal", "filterByLocalValue", "(Ljava/util/List;Z)Ljava/util/List;", "features", "Lru/ozon/app/android/abtool/presentation/features/recycler/ListItem;", "groupByService", "(Ljava/util/List;)Ljava/util/List;", "", "listItems", "", "serviceName", "", "addServiceSection", "(Ljava/util/List;Ljava/lang/String;Ljava/util/List;)V", SearchIntents.EXTRA_QUERY, "requestFeaturesList", "(Ljava/lang/String;Lkotlin/coroutines/d;)Ljava/lang/Object;", "(Ljava/lang/String;)V", "id", "resetLocal", "featureItem", "newValue", "onLocalValueChanged", "(Lru/ozon/app/android/abtool/presentation/features/recycler/FeatureItem;Z)V", "(Lru/ozon/app/android/abtool/presentation/features/recycler/FeatureItem;Ljava/lang/String;)V", "LAe/h;", "observeListItems", "()LAe/h;", "enabled", "setShowOnlyOverriddenFeatures", "(Z)V", "Lru/ozon/app/android/abtool/AbToolImpl;", "Lru/ozon/app/android/abtool/AbToolNamespace;", "Lru/ozon/app/android/abtool/data/mapper/ExperimentMapper;", "Lxe/I;", "Landroidx/lifecycle/P;", "Lru/ozon/app/android/abtool/presentation/experiments/recycler/ExperimentItem;", "experimentsLiveData$delegate", "LSc/j;", "getExperimentsLiveData", "()Landroidx/lifecycle/P;", "experimentsLiveData", "LAe/x0;", "queryListener", "LAe/x0;", "showOnlyOverridden", "featureItems", "abzone_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class AbToggleViewModel extends w0 {

    @NotNull
    private final AbToolImpl abTool;

    @NotNull
    private final I dispatcher;

    /* renamed from: experimentsLiveData$delegate, reason: from kotlin metadata */
    @NotNull
    private final InterfaceC4008j experimentsLiveData;

    @NotNull
    private final ExperimentMapper experimentsMapper;

    @NotNull
    private final x0<List<FeatureItem>> featureItems;

    @NotNull
    private final x0<List<ListItem>> listItems;

    @NotNull
    private final AbToolNamespace namespace;

    @NotNull
    private final x0<String> queryListener;

    @NotNull
    private final x0<Boolean> showOnlyOverridden;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lxe/M;", "", "<anonymous>", "(Lxe/M;)V"}, k = 3, mv = {2, 0, 0})
    @e(c = "ru.ozon.app.android.abtool.presentation.AbToggleViewModel$1", f = "AbToggleViewModel.kt", l = {RegisterRequest.U2F_V1_CHALLENGE_BYTE_LENGTH}, m = "invokeSuspend")
    /* renamed from: ru.ozon.app.android.abtool.presentation.AbToggleViewModel$1, reason: invalid class name */
    static final class AnonymousClass1 extends j implements Function2<M, d<? super Unit>, Object> {
        int label;

        AnonymousClass1(d<? super AnonymousClass1> dVar) {
            super(2, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final d<Unit> create(Object obj, d<?> dVar) {
            return AbToggleViewModel.this.new AnonymousClass1(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            a aVar = a.COROUTINE_SUSPENDED;
            int i11 = this.label;
            if (i11 == 0) {
                s.b(obj);
                final x0 x0Var = AbToggleViewModel.this.queryListener;
                m Q11 = C2399j.Q(C2399j.l(new InterfaceC2395h<String>() { // from class: ru.ozon.app.android.abtool.presentation.AbToggleViewModel$1$invokeSuspend$$inlined$filter$1

                    @Metadata(d1 = {"\u0000\f\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u00012\u0006\u0010\u0002\u001a\u00028\u0000H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"T", "R", AppMeasurementSdk.ConditionalUserProperty.VALUE, "", "emit", "(Ljava/lang/Object;Lkotlin/coroutines/d;)Ljava/lang/Object;", "<anonymous>"}, k = 3, mv = {2, 0, 0})
                    /* renamed from: ru.ozon.app.android.abtool.presentation.AbToggleViewModel$1$invokeSuspend$$inlined$filter$1$2, reason: invalid class name */
                    public static final class AnonymousClass2<T> implements InterfaceC2397i {
                        final /* synthetic */ InterfaceC2397i $this_unsafeFlow;

                        @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
                        @e(c = "ru.ozon.app.android.abtool.presentation.AbToggleViewModel$1$invokeSuspend$$inlined$filter$1$2", f = "AbToggleViewModel.kt", l = {223}, m = "emit")
                        /* renamed from: ru.ozon.app.android.abtool.presentation.AbToggleViewModel$1$invokeSuspend$$inlined$filter$1$2$1, reason: invalid class name */
                        public static final class AnonymousClass1 extends c {
                            int label;
                            /* synthetic */ Object result;

                            public AnonymousClass1(d dVar) {
                                super(dVar);
                            }

                            @Override // kotlin.coroutines.jvm.internal.a
                            public final Object invokeSuspend(@NotNull Object obj) {
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
                        public final Object emit(Object obj, @NotNull d dVar) {
                            AnonymousClass1 anonymousClass1;
                            int i11;
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
                                        String str = (String) obj;
                                        if (h.K(str) || str.length() >= 3) {
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
                            a aVar2 = a.COROUTINE_SUSPENDED;
                            i11 = anonymousClass1.label;
                            if (i11 != 0) {
                            }
                            return Unit.f71690a;
                        }
                    }

                    @Override // Ae.InterfaceC2395h
                    public Object collect(@NotNull InterfaceC2397i<? super String> interfaceC2397i, @NotNull d dVar) {
                        Object collect = InterfaceC2395h.this.collect(new AnonymousClass2(interfaceC2397i), dVar);
                        return collect == a.COROUTINE_SUSPENDED ? collect : Unit.f71690a;
                    }
                }, 300L), new AbToggleViewModel$1$invokeSuspend$$inlined$flatMapLatest$1(null, AbToggleViewModel.this));
                C10720e0 c10720e0 = C10720e0.f105451a;
                InterfaceC2395h B11 = C2399j.B(Q11, b.f10879b);
                this.label = 1;
                if (C2399j.g(B11, this) == aVar) {
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

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lxe/M;", "", "<anonymous>", "(Lxe/M;)V"}, k = 3, mv = {2, 0, 0})
    @e(c = "ru.ozon.app.android.abtool.presentation.AbToggleViewModel$2", f = "AbToggleViewModel.kt", l = {75}, m = "invokeSuspend")
    /* renamed from: ru.ozon.app.android.abtool.presentation.AbToggleViewModel$2, reason: invalid class name */
    static final class AnonymousClass2 extends j implements Function2<M, d<? super Unit>, Object> {
        int label;

        @Metadata(d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\u0010\u0000\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u0006\u0010\u0005\u001a\u00020\u0006H\n"}, d2 = {"<anonymous>", "", "featureItems", "", "Lru/ozon/app/android/abtool/presentation/features/recycler/FeatureItem;", "onlyLocal", ""}, k = 3, mv = {2, 0, 0}, xi = 48)
        @e(c = "ru.ozon.app.android.abtool.presentation.AbToggleViewModel$2$1", f = "AbToggleViewModel.kt", l = {ModuleDescriptor.MODULE_VERSION}, m = "invokeSuspend")
        /* renamed from: ru.ozon.app.android.abtool.presentation.AbToggleViewModel$2$1, reason: invalid class name */
        static final class AnonymousClass1 extends j implements InterfaceC6511n<List<? extends FeatureItem>, Boolean, d<? super Unit>, Object> {
            /* synthetic */ Object L$0;
            /* synthetic */ boolean Z$0;
            int label;
            final /* synthetic */ AbToggleViewModel this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass1(AbToggleViewModel abToggleViewModel, d<? super AnonymousClass1> dVar) {
                super(3, dVar);
                this.this$0 = abToggleViewModel;
            }

            @Override // fd.InterfaceC6511n
            public /* bridge */ /* synthetic */ Object invoke(List<? extends FeatureItem> list, Boolean bool, d<? super Unit> dVar) {
                return invoke((List<FeatureItem>) list, bool.booleanValue(), dVar);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                a aVar = a.COROUTINE_SUSPENDED;
                int i11 = this.label;
                if (i11 == 0) {
                    s.b(obj);
                    List list = (List) this.L$0;
                    boolean z11 = this.Z$0;
                    AbToggleViewModel abToggleViewModel = this.this$0;
                    List groupByService = abToggleViewModel.groupByService(abToggleViewModel.filterByLocalValue(list, z11));
                    x0 x0Var = this.this$0.listItems;
                    this.label = 1;
                    if (x0Var.emit(groupByService, this) == aVar) {
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

            public final Object invoke(List<FeatureItem> list, boolean z11, d<? super Unit> dVar) {
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, dVar);
                anonymousClass1.L$0 = list;
                anonymousClass1.Z$0 = z11;
                return anonymousClass1.invokeSuspend(Unit.f71690a);
            }
        }

        AnonymousClass2(d<? super AnonymousClass2> dVar) {
            super(2, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final d<Unit> create(Object obj, d<?> dVar) {
            return AbToggleViewModel.this.new AnonymousClass2(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            a aVar = a.COROUTINE_SUSPENDED;
            int i11 = this.label;
            if (i11 == 0) {
                s.b(obj);
                C2417s0 c2417s0 = new C2417s0(AbToggleViewModel.this.featureItems, AbToggleViewModel.this.showOnlyOverridden, new AnonymousClass1(AbToggleViewModel.this, null));
                this.label = 1;
                if (C2399j.g(c2417s0, this) == aVar) {
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
            return ((AnonymousClass2) create(m11, dVar)).invokeSuspend(Unit.f71690a);
        }
    }

    public AbToggleViewModel(@NotNull AbToolImpl abTool, @NotNull AbToolNamespace namespace, @NotNull ExperimentMapper experimentsMapper, @NotNull I dispatcher) {
        Intrinsics.checkNotNullParameter(abTool, "abTool");
        Intrinsics.checkNotNullParameter(namespace, "namespace");
        Intrinsics.checkNotNullParameter(experimentsMapper, "experimentsMapper");
        Intrinsics.checkNotNullParameter(dispatcher, "dispatcher");
        this.abTool = abTool;
        this.namespace = namespace;
        this.experimentsMapper = experimentsMapper;
        this.dispatcher = dispatcher;
        this.experimentsLiveData = k.b(new AbToggleViewModel$experimentsLiveData$2(this));
        this.queryListener = O0.a("");
        this.showOnlyOverridden = O0.a(Boolean.FALSE);
        K k11 = K.f71697a;
        this.featureItems = O0.a(k11);
        this.listItems = O0.a(k11);
        C10727i.c(androidx.lifecycle.x0.a(this), null, null, new AnonymousClass1(null), 3);
        C10727i.c(androidx.lifecycle.x0.a(this), null, null, new AnonymousClass2(null), 3);
    }

    private final void addServiceSection(List<ListItem> listItems, String serviceName, List<FeatureItem> features) {
        listItems.add(new ServiceHeader(serviceName));
        listItems.addAll(features);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final List<FeatureItem> filterByLocalValue(List<FeatureItem> list, boolean z11) {
        if (!z11) {
            return list;
        }
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            if (((FeatureItem) obj).getLocalValue() != null) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final List<ListItem> groupByService(List<FeatureItem> features) {
        List<String> featureServicePriority = DiStoreWrapper.INSTANCE.getConfig().getFeatureServicePriority();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Object obj : features) {
            String serviceName = ((FeatureItem) obj).getFeatureDebugModel().getServiceName();
            Object obj2 = linkedHashMap.get(serviceName);
            if (obj2 == null) {
                obj2 = new ArrayList();
                linkedHashMap.put(serviceName, obj2);
            }
            ((List) obj2).add(obj);
        }
        ArrayList arrayList = new ArrayList();
        for (String str : featureServicePriority) {
            List<FeatureItem> list = (List) linkedHashMap.get(str);
            if (list != null) {
                addServiceSection(arrayList, str, list);
                linkedHashMap.remove(str);
            }
        }
        for (Map.Entry entry : linkedHashMap.entrySet()) {
            addServiceSection(arrayList, (String) entry.getKey(), (List) entry.getValue());
        }
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0098, code lost:
    
        if (r13.emit(r4, r0) != r1) goto L27;
     */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0070 A[LOOP:0: B:18:0x006a->B:20:0x0070, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:25:0x003f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object requestFeaturesList(String str, d<? super Unit> dVar) {
        AbToggleViewModel$requestFeaturesList$1 abToggleViewModel$requestFeaturesList$1;
        int i11;
        x0<List<FeatureItem>> x0Var;
        AbToggleViewModel abToggleViewModel;
        Iterator it;
        if (dVar instanceof AbToggleViewModel$requestFeaturesList$1) {
            abToggleViewModel$requestFeaturesList$1 = (AbToggleViewModel$requestFeaturesList$1) dVar;
            int i12 = abToggleViewModel$requestFeaturesList$1.label;
            if ((i12 & LinearLayoutManager.INVALID_OFFSET) != 0) {
                abToggleViewModel$requestFeaturesList$1.label = i12 - LinearLayoutManager.INVALID_OFFSET;
                Object obj = abToggleViewModel$requestFeaturesList$1.result;
                a aVar = a.COROUTINE_SUSPENDED;
                i11 = abToggleViewModel$requestFeaturesList$1.label;
                if (i11 != 0) {
                    s.b(obj);
                    x0<List<FeatureItem>> x0Var2 = this.featureItems;
                    AbToolImpl abToolImpl = this.abTool;
                    AbToolNamespace abToolNamespace = this.namespace;
                    abToggleViewModel$requestFeaturesList$1.L$0 = this;
                    abToggleViewModel$requestFeaturesList$1.L$1 = x0Var2;
                    abToggleViewModel$requestFeaturesList$1.label = 1;
                    Object featureUiStates$abzone_release = abToolImpl.getFeatureUiStates$abzone_release(str, abToolNamespace, abToggleViewModel$requestFeaturesList$1);
                    if (featureUiStates$abzone_release != aVar) {
                        obj = featureUiStates$abzone_release;
                        x0Var = x0Var2;
                        abToggleViewModel = this;
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
                x0Var = (x0) abToggleViewModel$requestFeaturesList$1.L$1;
                abToggleViewModel = (AbToggleViewModel) abToggleViewModel$requestFeaturesList$1.L$0;
                s.b(obj);
                Iterable iterable = (Iterable) obj;
                ArrayList arrayList = new ArrayList(C7714v.z(iterable, 10));
                it = iterable.iterator();
                while (it.hasNext()) {
                    arrayList.add(new FeatureItem((FeatureDebugModel) it.next(), null, abToggleViewModel.abTool.getFeatureServiceConfig().getIsPlatformOverridesEnabled(), 2, null));
                }
                abToggleViewModel$requestFeaturesList$1.L$0 = null;
                abToggleViewModel$requestFeaturesList$1.L$1 = null;
                abToggleViewModel$requestFeaturesList$1.label = 2;
            }
        }
        abToggleViewModel$requestFeaturesList$1 = new AbToggleViewModel$requestFeaturesList$1(this, dVar);
        Object obj2 = abToggleViewModel$requestFeaturesList$1.result;
        a aVar2 = a.COROUTINE_SUSPENDED;
        i11 = abToggleViewModel$requestFeaturesList$1.label;
        if (i11 != 0) {
        }
        Iterable iterable2 = (Iterable) obj2;
        ArrayList arrayList2 = new ArrayList(C7714v.z(iterable2, 10));
        it = iterable2.iterator();
        while (it.hasNext()) {
        }
        abToggleViewModel$requestFeaturesList$1.L$0 = null;
        abToggleViewModel$requestFeaturesList$1.L$1 = null;
        abToggleViewModel$requestFeaturesList$1.label = 2;
    }

    @NotNull
    public final P<List<ExperimentItem>> getExperimentsLiveData() {
        return (P) this.experimentsLiveData.getValue();
    }

    @NotNull
    public final InterfaceC2395h<List<ListItem>> observeListItems() {
        return this.listItems;
    }

    public final void onLocalValueChanged(@NotNull FeatureItem featureItem, boolean newValue) {
        Intrinsics.checkNotNullParameter(featureItem, "featureItem");
        C10727i.c(androidx.lifecycle.x0.a(this), this.dispatcher, null, new AbToggleViewModel$onLocalValueChanged$1(newValue, featureItem, this, null), 2);
    }

    public final void query(@NotNull String query) {
        Intrinsics.checkNotNullParameter(query, "query");
        this.queryListener.tryEmit(query);
    }

    public final void resetLocal(@NotNull String id2) {
        Intrinsics.checkNotNullParameter(id2, "id");
        C10727i.c(androidx.lifecycle.x0.a(this), this.dispatcher, null, new AbToggleViewModel$resetLocal$1(this, id2, null), 2);
    }

    public final void setShowOnlyOverriddenFeatures(boolean enabled) {
        C10727i.c(androidx.lifecycle.x0.a(this), null, null, new AbToggleViewModel$setShowOnlyOverriddenFeatures$1(this, enabled, null), 3);
    }

    public final void onLocalValueChanged(@NotNull FeatureItem featureItem, @NotNull String newValue) {
        Intrinsics.checkNotNullParameter(featureItem, "featureItem");
        Intrinsics.checkNotNullParameter(newValue, "newValue");
        C10727i.c(androidx.lifecycle.x0.a(this), this.dispatcher, null, new AbToggleViewModel$onLocalValueChanged$2(featureItem, newValue, this, null), 2);
    }
}
