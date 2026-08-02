package ru.ozon.app.android.abtool.presentation.abvariants;

import Ae.C2399j;
import Ae.C2408n0;
import Ae.InterfaceC2395h;
import Ae.InterfaceC2397i;
import Ae.M0;
import Ae.O0;
import Ae.x0;
import Sc.o;
import Sc.s;
import Wc.a;
import androidx.lifecycle.w0;
import androidx.lifecycle.z0;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.C7714v;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.c;
import kotlin.coroutines.jvm.internal.e;
import kotlin.coroutines.jvm.internal.j;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.h;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.abtool.AbToolNamespace;
import ru.ozon.app.android.abtool.data.repository.AbVariantsDataStoreRepository;
import ru.ozon.app.android.abtool.di.ServiceLocator;
import ru.ozon.app.android.abtool.presentation.abvariants.recycler.VariantItem;
import ru.ozon.app.android.abtool.utils.AbVariantUtils;
import xe.C10727i;

@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u00002\u00020\u0001:\u0001\u001cB\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\t\u001a\u00020\b2\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\t\u0010\nJ\r\u0010\u000b\u001a\u00020\b¢\u0006\u0004\b\u000b\u0010\fJ\u0015\u0010\u000f\u001a\u00020\b2\u0006\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u000f\u0010\u0010J\r\u0010\u0011\u001a\u00020\b¢\u0006\u0004\b\u0011\u0010\fR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0012R\u001a\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00140\u00138\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u001d\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00140\u00178\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001b¨\u0006\u001d"}, d2 = {"Lru/ozon/app/android/abtool/presentation/abvariants/VariantsViewModel;", "Landroidx/lifecycle/w0;", "Lru/ozon/app/android/abtool/data/repository/AbVariantsDataStoreRepository;", "variantsRepository", "<init>", "(Lru/ozon/app/android/abtool/data/repository/AbVariantsDataStoreRepository;)V", "", "input", "", "onVariantsInputChanged", "(Ljava/lang/String;)V", "onAddVariantsClick", "()V", "Lru/ozon/app/android/abtool/presentation/abvariants/recycler/VariantItem;", "variant", "onRemoveVariantClick", "(Lru/ozon/app/android/abtool/presentation/abvariants/recycler/VariantItem;)V", "onClearVariantsClick", "Lru/ozon/app/android/abtool/data/repository/AbVariantsDataStoreRepository;", "LAe/x0;", "Lru/ozon/app/android/abtool/presentation/abvariants/UiState;", "_state", "LAe/x0;", "LAe/M0;", "state", "LAe/M0;", "getState", "()LAe/M0;", "Factory", "abzone_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class VariantsViewModel extends w0 {

    @NotNull
    private final x0<UiState> _state;

    @NotNull
    private final M0<UiState> state;

    @NotNull
    private final AbVariantsDataStoreRepository variantsRepository;

    @Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\n"}, d2 = {"<anonymous>", "", "items", "", "Lru/ozon/app/android/abtool/presentation/abvariants/recycler/VariantItem;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @e(c = "ru.ozon.app.android.abtool.presentation.abvariants.VariantsViewModel$2", f = "VariantsViewModel.kt", l = {}, m = "invokeSuspend")
    /* renamed from: ru.ozon.app.android.abtool.presentation.abvariants.VariantsViewModel$2, reason: invalid class name */
    static final class AnonymousClass2 extends j implements Function2<List<? extends VariantItem>, d<? super Unit>, Object> {
        /* synthetic */ Object L$0;
        int label;

        AnonymousClass2(d<? super AnonymousClass2> dVar) {
            super(2, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final d<Unit> create(Object obj, d<?> dVar) {
            AnonymousClass2 anonymousClass2 = VariantsViewModel.this.new AnonymousClass2(dVar);
            anonymousClass2.L$0 = obj;
            return anonymousClass2;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(List<? extends VariantItem> list, d<? super Unit> dVar) {
            return invoke2((List<VariantItem>) list, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object value;
            a aVar = a.COROUTINE_SUSPENDED;
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            s.b(obj);
            List list = (List) this.L$0;
            x0 x0Var = VariantsViewModel.this._state;
            do {
                value = x0Var.getValue();
            } while (!x0Var.b(value, UiState.copy$default((UiState) value, !list.isEmpty(), null, false, false, list, 14, null)));
            return Unit.f71690a;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final Object invoke2(List<VariantItem> list, d<? super Unit> dVar) {
            return ((AnonymousClass2) create(list, dVar)).invokeSuspend(Unit.f71690a);
        }
    }

    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J'\u0010\n\u001a\u00028\u0000\"\b\b\u0000\u0010\u0007*\u00020\u00062\f\u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00000\bH\u0016¢\u0006\u0004\b\n\u0010\u000bR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\f¨\u0006\r"}, d2 = {"Lru/ozon/app/android/abtool/presentation/abvariants/VariantsViewModel$Factory;", "Landroidx/lifecycle/z0$c;", "Lru/ozon/app/android/abtool/AbToolNamespace;", "namespace", "<init>", "(Lru/ozon/app/android/abtool/AbToolNamespace;)V", "Landroidx/lifecycle/w0;", "T", "Ljava/lang/Class;", "modelClass", "create", "(Ljava/lang/Class;)Landroidx/lifecycle/w0;", "Lru/ozon/app/android/abtool/AbToolNamespace;", "abzone_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Factory extends z0.c {

        @NotNull
        private final AbToolNamespace namespace;

        @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
        public /* synthetic */ class WhenMappings {
            public static final /* synthetic */ int[] $EnumSwitchMapping$0;

            static {
                int[] iArr = new int[AbToolNamespace.values().length];
                try {
                    iArr[AbToolNamespace.DEFAULT.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[AbToolNamespace.PLATFORM_MOBILE.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                $EnumSwitchMapping$0 = iArr;
            }
        }

        public Factory(@NotNull AbToolNamespace namespace) {
            Intrinsics.checkNotNullParameter(namespace, "namespace");
            this.namespace = namespace;
        }

        @Override // androidx.lifecycle.z0.c, androidx.lifecycle.z0.b
        @NotNull
        public <T extends w0> T create(@NotNull Class<T> modelClass) {
            AbVariantsDataStoreRepository abVariantDataStoreRepository;
            Intrinsics.checkNotNullParameter(modelClass, "modelClass");
            int i11 = WhenMappings.$EnumSwitchMapping$0[this.namespace.ordinal()];
            if (i11 == 1) {
                abVariantDataStoreRepository = ServiceLocator.INSTANCE.getAbToolHostInteractor().getAbVariantDataStoreRepository();
            } else {
                if (i11 != 2) {
                    throw new o();
                }
                abVariantDataStoreRepository = ServiceLocator.INSTANCE.getAbToolLibsInteractor().getAbVariantDataStoreRepository();
            }
            return new VariantsViewModel(abVariantDataStoreRepository);
        }
    }

    public VariantsViewModel(@NotNull AbVariantsDataStoreRepository variantsRepository) {
        Intrinsics.checkNotNullParameter(variantsRepository, "variantsRepository");
        this.variantsRepository = variantsRepository;
        x0<UiState> a11 = O0.a(new UiState(false, null, false, false, null, 31, null));
        this._state = a11;
        this.state = C2399j.b(a11);
        final InterfaceC2395h<Set<String>> variants = variantsRepository.getVariants();
        C2399j.C(new C2408n0(new InterfaceC2395h<List<? extends VariantItem>>() { // from class: ru.ozon.app.android.abtool.presentation.abvariants.VariantsViewModel$special$$inlined$map$1

            @Metadata(d1 = {"\u0000\f\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u00012\u0006\u0010\u0002\u001a\u00028\u0000H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"T", "R", AppMeasurementSdk.ConditionalUserProperty.VALUE, "", "emit", "(Ljava/lang/Object;Lkotlin/coroutines/d;)Ljava/lang/Object;", "<anonymous>"}, k = 3, mv = {2, 0, 0})
            /* renamed from: ru.ozon.app.android.abtool.presentation.abvariants.VariantsViewModel$special$$inlined$map$1$2, reason: invalid class name */
            public static final class AnonymousClass2<T> implements InterfaceC2397i {
                final /* synthetic */ InterfaceC2397i $this_unsafeFlow;

                @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
                @e(c = "ru.ozon.app.android.abtool.presentation.abvariants.VariantsViewModel$special$$inlined$map$1$2", f = "VariantsViewModel.kt", l = {223}, m = "emit")
                /* renamed from: ru.ozon.app.android.abtool.presentation.abvariants.VariantsViewModel$special$$inlined$map$1$2$1, reason: invalid class name */
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
                                Set set = (Set) obj;
                                ArrayList arrayList = new ArrayList(C7714v.z(set, 10));
                                Iterator<T> it = set.iterator();
                                while (it.hasNext()) {
                                    arrayList.add(new VariantItem((String) it.next()));
                                }
                                anonymousClass1.label = 1;
                                if (interfaceC2397i.emit(arrayList, anonymousClass1) == aVar) {
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
            public Object collect(@NotNull InterfaceC2397i<? super List<? extends VariantItem>> interfaceC2397i, @NotNull d dVar) {
                Object collect = InterfaceC2395h.this.collect(new AnonymousClass2(interfaceC2397i), dVar);
                return collect == a.COROUTINE_SUSPENDED ? collect : Unit.f71690a;
            }
        }, new AnonymousClass2(null)), androidx.lifecycle.x0.a(this));
    }

    @NotNull
    public final M0<UiState> getState() {
        return this.state;
    }

    public final void onAddVariantsClick() {
        if (this._state.getValue().getIsAddVariantsEnabled()) {
            C10727i.c(androidx.lifecycle.x0.a(this), null, null, new VariantsViewModel$onAddVariantsClick$1(this, null), 3);
        }
    }

    public final void onClearVariantsClick() {
        if (this._state.getValue().getIsClearVariantsEnabled()) {
            C10727i.c(androidx.lifecycle.x0.a(this), null, null, new VariantsViewModel$onClearVariantsClick$1(this, null), 3);
        }
    }

    public final void onRemoveVariantClick(@NotNull VariantItem variant) {
        Intrinsics.checkNotNullParameter(variant, "variant");
        C10727i.c(androidx.lifecycle.x0.a(this), null, null, new VariantsViewModel$onRemoveVariantClick$1(this, variant, null), 3);
    }

    public final void onVariantsInputChanged(String input) {
        x0<UiState> x0Var = this._state;
        while (true) {
            UiState value = x0Var.getValue();
            UiState uiState = value;
            boolean isValidVariants = AbVariantUtils.INSTANCE.isValidVariants(input);
            String str = input;
            if (x0Var.b(value, UiState.copy$default(uiState, false, str, isValidVariants, (input == null || h.K(input) || !isValidVariants) ? false : true, null, 17, null))) {
                return;
            } else {
                input = str;
            }
        }
    }
}
