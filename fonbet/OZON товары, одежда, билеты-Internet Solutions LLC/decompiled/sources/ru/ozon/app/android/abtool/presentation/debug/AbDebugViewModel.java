package ru.ozon.app.android.abtool.presentation.debug;

import Ae.C2399j;
import Ae.C2408n0;
import Ae.M0;
import Ae.O0;
import Ae.x0;
import Sc.o;
import Sc.s;
import Wc.a;
import androidx.lifecycle.w0;
import androidx.lifecycle.z0;
import java.util.Set;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.C7714v;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.e;
import kotlin.coroutines.jvm.internal.j;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.abtool.AbToolNamespace;
import ru.ozon.app.android.abtool.data.repository.AbVariantsDataStoreRepository;
import ru.ozon.app.android.abtool.di.ServiceLocator;
import ru.ozon.tracker.model.TrinityEventEntityKt;
import xe.C10727i;

@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u00002\u00020\u0001:\u0001\u001bB\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\r\u001a\u00020\nH\u0002¢\u0006\u0004\b\r\u0010\fJ\u000f\u0010\u000e\u001a\u00020\nH\u0002¢\u0006\u0004\b\u000e\u0010\fR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u000fR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0010R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u0011R\u001a\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00130\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\u001d\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00130\u00168\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001a¨\u0006\u001c"}, d2 = {"Lru/ozon/app/android/abtool/presentation/debug/AbDebugViewModel;", "Landroidx/lifecycle/w0;", "Lru/ozon/app/android/abtool/presentation/debug/ActionType;", TrinityEventEntityKt.ACTION_TYPE_JSON_NAME, "", "variantsParam", "Lru/ozon/app/android/abtool/data/repository/AbVariantsDataStoreRepository;", "variantsRepository", "<init>", "(Lru/ozon/app/android/abtool/presentation/debug/ActionType;Ljava/lang/String;Lru/ozon/app/android/abtool/data/repository/AbVariantsDataStoreRepository;)V", "", "appendVariants", "()V", "removeVariants", "replaceVariants", "Lru/ozon/app/android/abtool/presentation/debug/ActionType;", "Ljava/lang/String;", "Lru/ozon/app/android/abtool/data/repository/AbVariantsDataStoreRepository;", "LAe/x0;", "Lru/ozon/app/android/abtool/presentation/debug/UiState;", "_state", "LAe/x0;", "LAe/M0;", "state", "LAe/M0;", "getState", "()LAe/M0;", "Factory", "abzone_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class AbDebugViewModel extends w0 {

    @NotNull
    private final x0<UiState> _state;

    @NotNull
    private final ActionType actionType;

    @NotNull
    private final M0<UiState> state;

    @NotNull
    private final String variantsParam;

    @NotNull
    private final AbVariantsDataStoreRepository variantsRepository;

    @Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\"\n\u0002\u0010\u000e\u0010\u0000\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\n"}, d2 = {"<anonymous>", "", "variants", "", ""}, k = 3, mv = {2, 0, 0}, xi = 48)
    @e(c = "ru.ozon.app.android.abtool.presentation.debug.AbDebugViewModel$1", f = "AbDebugViewModel.kt", l = {}, m = "invokeSuspend")
    /* renamed from: ru.ozon.app.android.abtool.presentation.debug.AbDebugViewModel$1, reason: invalid class name */
    static final class AnonymousClass1 extends j implements Function2<Set<? extends String>, d<? super Unit>, Object> {
        /* synthetic */ Object L$0;
        int label;

        AnonymousClass1(d<? super AnonymousClass1> dVar) {
            super(2, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final d<Unit> create(Object obj, d<?> dVar) {
            AnonymousClass1 anonymousClass1 = AbDebugViewModel.this.new AnonymousClass1(dVar);
            anonymousClass1.L$0 = obj;
            return anonymousClass1;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(Set<? extends String> set, d<? super Unit> dVar) {
            return invoke2((Set<String>) set, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object value;
            a aVar = a.COROUTINE_SUSPENDED;
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            s.b(obj);
            Set set = (Set) this.L$0;
            x0 x0Var = AbDebugViewModel.this._state;
            do {
                value = x0Var.getValue();
            } while (!x0Var.b(value, ((UiState) value).copy(C7714v.V(set, ",", null, null, null, 62))));
            return Unit.f71690a;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final Object invoke2(Set<String> set, d<? super Unit> dVar) {
            return ((AnonymousClass1) create(set, dVar)).invokeSuspend(Unit.f71690a);
        }
    }

    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ'\u0010\u000e\u001a\u00028\u0000\"\b\b\u0000\u0010\u000b*\u00020\n2\f\u0010\r\u001a\b\u0012\u0004\u0012\u00028\u00000\fH\u0016¢\u0006\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0010R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0011R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u0012¨\u0006\u0013"}, d2 = {"Lru/ozon/app/android/abtool/presentation/debug/AbDebugViewModel$Factory;", "Landroidx/lifecycle/z0$c;", "Lru/ozon/app/android/abtool/presentation/debug/ActionType;", TrinityEventEntityKt.ACTION_TYPE_JSON_NAME, "", "variantsParam", "Lru/ozon/app/android/abtool/AbToolNamespace;", "namespace", "<init>", "(Lru/ozon/app/android/abtool/presentation/debug/ActionType;Ljava/lang/String;Lru/ozon/app/android/abtool/AbToolNamespace;)V", "Landroidx/lifecycle/w0;", "T", "Ljava/lang/Class;", "modelClass", "create", "(Ljava/lang/Class;)Landroidx/lifecycle/w0;", "Lru/ozon/app/android/abtool/presentation/debug/ActionType;", "Ljava/lang/String;", "Lru/ozon/app/android/abtool/AbToolNamespace;", "abzone_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Factory extends z0.c {

        @NotNull
        private final ActionType actionType;

        @NotNull
        private final AbToolNamespace namespace;

        @NotNull
        private final String variantsParam;

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

        public Factory(@NotNull ActionType actionType, @NotNull String variantsParam, @NotNull AbToolNamespace namespace) {
            Intrinsics.checkNotNullParameter(actionType, "actionType");
            Intrinsics.checkNotNullParameter(variantsParam, "variantsParam");
            Intrinsics.checkNotNullParameter(namespace, "namespace");
            this.actionType = actionType;
            this.variantsParam = variantsParam;
            this.namespace = namespace;
        }

        @Override // androidx.lifecycle.z0.c, androidx.lifecycle.z0.b
        @NotNull
        public <T extends w0> T create(@NotNull Class<T> modelClass) {
            AbVariantsDataStoreRepository abVariantDataStoreRepository;
            Intrinsics.checkNotNullParameter(modelClass, "modelClass");
            ActionType actionType = this.actionType;
            String str = this.variantsParam;
            int i11 = WhenMappings.$EnumSwitchMapping$0[this.namespace.ordinal()];
            if (i11 == 1) {
                abVariantDataStoreRepository = ServiceLocator.INSTANCE.getAbToolHostInteractor().getAbVariantDataStoreRepository();
            } else {
                if (i11 != 2) {
                    throw new o();
                }
                abVariantDataStoreRepository = ServiceLocator.INSTANCE.getAbToolLibsInteractor().getAbVariantDataStoreRepository();
            }
            return new AbDebugViewModel(actionType, str, abVariantDataStoreRepository);
        }
    }

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[ActionType.values().length];
            try {
                iArr[ActionType.APPEND.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[ActionType.REMOVE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[ActionType.REPLACE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public AbDebugViewModel(@NotNull ActionType actionType, @NotNull String variantsParam, @NotNull AbVariantsDataStoreRepository variantsRepository) {
        Intrinsics.checkNotNullParameter(actionType, "actionType");
        Intrinsics.checkNotNullParameter(variantsParam, "variantsParam");
        Intrinsics.checkNotNullParameter(variantsRepository, "variantsRepository");
        this.actionType = actionType;
        this.variantsParam = variantsParam;
        this.variantsRepository = variantsRepository;
        x0<UiState> a11 = O0.a(new UiState(null, 1, null));
        this._state = a11;
        this.state = C2399j.b(a11);
        int i11 = WhenMappings.$EnumSwitchMapping$0[actionType.ordinal()];
        if (i11 == 1) {
            appendVariants();
        } else if (i11 == 2) {
            removeVariants();
        } else {
            if (i11 != 3) {
                throw new o();
            }
            replaceVariants();
        }
        C2399j.C(new C2408n0(variantsRepository.getVariants(), new AnonymousClass1(null)), androidx.lifecycle.x0.a(this));
    }

    private final void appendVariants() {
        C10727i.c(androidx.lifecycle.x0.a(this), null, null, new AbDebugViewModel$appendVariants$1(this, null), 3);
    }

    private final void removeVariants() {
        C10727i.c(androidx.lifecycle.x0.a(this), null, null, new AbDebugViewModel$removeVariants$1(this, null), 3);
    }

    private final void replaceVariants() {
        C10727i.c(androidx.lifecycle.x0.a(this), null, null, new AbDebugViewModel$replaceVariants$1(this, null), 3);
    }

    @NotNull
    public final M0<UiState> getState() {
        return this.state;
    }
}
