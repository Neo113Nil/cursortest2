package ru.ozon.fintech.preferences.presentation.scanner;

import Ae.InterfaceC2395h;
import Ae.InterfaceC2397i;
import Ae.x0;
import D90.h;
import Sc.InterfaceC4008j;
import Sc.k;
import Sc.n;
import Sc.s;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.core.widget.NestedScrollView;
import androidx.fragment.app.ComponentCallbacksC5392m;
import androidx.fragment.app.b0;
import androidx.fragment.app.r;
import androidx.lifecycle.A0;
import androidx.lifecycle.AbstractC5434v;
import androidx.lifecycle.B0;
import androidx.lifecycle.C5412d0;
import androidx.lifecycle.InterfaceC5431s;
import androidx.lifecycle.J;
import androidx.lifecycle.K;
import androidx.lifecycle.y0;
import androidx.lifecycle.z0;
import f3.AbstractC6409a;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.j;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import xe.C10727i;
import xe.M;
import xe.N;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lru/ozon/fintech/preferences/presentation/scanner/FintechScannerSettingsFragment;", "Landroidx/fragment/app/m;", "<init>", "()V", "fintech-preferences_prodRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class FintechScannerSettingsFragment extends ComponentCallbacksC5392m {

    /* renamed from: a, reason: collision with root package name */
    public z0.b f96912a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final y0 f96913b;

    /* renamed from: c, reason: collision with root package name */
    private v90.f f96914c;

    @kotlin.coroutines.jvm.internal.e(c = "ru.ozon.fintech.preferences.presentation.scanner.FintechScannerSettingsFragment$onViewCreated$$inlined$observe$1", f = "FintechScannerSettingsFragment.kt", l = {33}, m = "invokeSuspend")
    public static final class a extends j implements Function2<M, kotlin.coroutines.d<? super Unit>, Object> {

        /* renamed from: d, reason: collision with root package name */
        int f96915d;

        /* renamed from: e, reason: collision with root package name */
        private /* synthetic */ Object f96916e;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ InterfaceC2395h f96918g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ FintechScannerSettingsFragment f96919h;

        @kotlin.coroutines.jvm.internal.e(c = "ru.ozon.fintech.preferences.presentation.scanner.FintechScannerSettingsFragment$onViewCreated$$inlined$observe$1$1", f = "FintechScannerSettingsFragment.kt", l = {34}, m = "invokeSuspend")
        /* renamed from: ru.ozon.fintech.preferences.presentation.scanner.FintechScannerSettingsFragment$a$a, reason: collision with other inner class name */
        public static final class C2121a extends j implements Function2<M, kotlin.coroutines.d<? super Unit>, Object> {

            /* renamed from: d, reason: collision with root package name */
            int f96920d;

            /* renamed from: e, reason: collision with root package name */
            final /* synthetic */ InterfaceC2395h f96921e;

            /* renamed from: f, reason: collision with root package name */
            final /* synthetic */ FintechScannerSettingsFragment f96922f;

            /* renamed from: ru.ozon.fintech.preferences.presentation.scanner.FintechScannerSettingsFragment$a$a$a, reason: collision with other inner class name */
            public static final class C2122a<T> implements InterfaceC2397i {

                /* renamed from: a, reason: collision with root package name */
                final /* synthetic */ FintechScannerSettingsFragment f96923a;

                public C2122a(FintechScannerSettingsFragment fintechScannerSettingsFragment) {
                    this.f96923a = fintechScannerSettingsFragment;
                }

                /* JADX WARN: Multi-variable type inference failed */
                @Override // Ae.InterfaceC2397i
                public final Object emit(T t2, kotlin.coroutines.d<? super Unit> dVar) {
                    x90.c cVar = (x90.c) t2;
                    FintechScannerSettingsFragment fintechScannerSettingsFragment = this.f96923a;
                    v90.f fVar = fintechScannerSettingsFragment.f96914c;
                    if (fVar != null) {
                        fVar.f102653j.bindState(cVar.b());
                    }
                    v90.f fVar2 = fintechScannerSettingsFragment.f96914c;
                    if (fVar2 != null) {
                        fVar2.f102652i.bindState(cVar.a());
                    }
                    return Unit.f71690a;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C2121a(InterfaceC2395h interfaceC2395h, kotlin.coroutines.d dVar, FintechScannerSettingsFragment fintechScannerSettingsFragment) {
                super(2, dVar);
                this.f96921e = interfaceC2395h;
                this.f96922f = fintechScannerSettingsFragment;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
                return new C2121a(this.f96921e, dVar, this.f96922f);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(M m11, kotlin.coroutines.d<? super Unit> dVar) {
                return ((C2121a) create(m11, dVar)).invokeSuspend(Unit.f71690a);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
                int i11 = this.f96920d;
                if (i11 == 0) {
                    s.b(obj);
                    C2122a c2122a = new C2122a(this.f96922f);
                    this.f96920d = 1;
                    if (this.f96921e.collect(c2122a, this) == aVar) {
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
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(InterfaceC2395h interfaceC2395h, kotlin.coroutines.d dVar, FintechScannerSettingsFragment fintechScannerSettingsFragment) {
            super(2, dVar);
            this.f96918g = interfaceC2395h;
            this.f96919h = fintechScannerSettingsFragment;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            a aVar = FintechScannerSettingsFragment.this.new a(this.f96918g, dVar, this.f96919h);
            aVar.f96916e = obj;
            return aVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(M m11, kotlin.coroutines.d<? super Unit> dVar) {
            return ((a) create(m11, dVar)).invokeSuspend(Unit.f71690a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
            int i11 = this.f96915d;
            if (i11 == 0) {
                s.b(obj);
                if (N.f((M) this.f96916e)) {
                    J viewLifecycleOwner = FintechScannerSettingsFragment.this.getViewLifecycleOwner();
                    Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "getViewLifecycleOwner(...)");
                    AbstractC5434v.b bVar = AbstractC5434v.b.STARTED;
                    C2121a c2121a = new C2121a(this.f96918g, null, this.f96919h);
                    this.f96915d = 1;
                    if (C5412d0.b(viewLifecycleOwner, bVar, c2121a, this) == aVar) {
                        return aVar;
                    }
                }
                return Unit.f71690a;
            }
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            s.b(obj);
            return Unit.f71690a;
        }
    }

    @kotlin.coroutines.jvm.internal.e(c = "ru.ozon.fintech.preferences.presentation.scanner.FintechScannerSettingsFragment$onViewCreated$$inlined$observe$2", f = "FintechScannerSettingsFragment.kt", l = {33}, m = "invokeSuspend")
    public static final class b extends j implements Function2<M, kotlin.coroutines.d<? super Unit>, Object> {

        /* renamed from: d, reason: collision with root package name */
        int f96924d;

        /* renamed from: e, reason: collision with root package name */
        private /* synthetic */ Object f96925e;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ InterfaceC2395h f96927g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ FintechScannerSettingsFragment f96928h;

        @kotlin.coroutines.jvm.internal.e(c = "ru.ozon.fintech.preferences.presentation.scanner.FintechScannerSettingsFragment$onViewCreated$$inlined$observe$2$1", f = "FintechScannerSettingsFragment.kt", l = {34}, m = "invokeSuspend")
        public static final class a extends j implements Function2<M, kotlin.coroutines.d<? super Unit>, Object> {

            /* renamed from: d, reason: collision with root package name */
            int f96929d;

            /* renamed from: e, reason: collision with root package name */
            final /* synthetic */ InterfaceC2395h f96930e;

            /* renamed from: f, reason: collision with root package name */
            final /* synthetic */ FintechScannerSettingsFragment f96931f;

            /* renamed from: ru.ozon.fintech.preferences.presentation.scanner.FintechScannerSettingsFragment$b$a$a, reason: collision with other inner class name */
            public static final class C2123a<T> implements InterfaceC2397i {

                /* renamed from: a, reason: collision with root package name */
                final /* synthetic */ FintechScannerSettingsFragment f96932a;

                public C2123a(FintechScannerSettingsFragment fintechScannerSettingsFragment) {
                    this.f96932a = fintechScannerSettingsFragment;
                }

                /* JADX WARN: Multi-variable type inference failed */
                @Override // Ae.InterfaceC2397i
                public final Object emit(T t2, kotlin.coroutines.d<? super Unit> dVar) {
                    v90.f fVar;
                    x90.b bVar = (x90.b) t2;
                    if (bVar != null && (fVar = this.f96932a.f96914c) != null) {
                        fVar.f102649f.bindState(bVar.f());
                        fVar.f102648e.bindState(bVar.e());
                        fVar.f102647d.bindState(bVar.c());
                        fVar.f102646c.setChecked(bVar.g());
                        fVar.f102651h.bindState(bVar.d());
                        fVar.f102645b.bindState(bVar.a());
                        fVar.f102650g.bindState(bVar.b());
                    }
                    return Unit.f71690a;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(InterfaceC2395h interfaceC2395h, kotlin.coroutines.d dVar, FintechScannerSettingsFragment fintechScannerSettingsFragment) {
                super(2, dVar);
                this.f96930e = interfaceC2395h;
                this.f96931f = fintechScannerSettingsFragment;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
                return new a(this.f96930e, dVar, this.f96931f);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(M m11, kotlin.coroutines.d<? super Unit> dVar) {
                return ((a) create(m11, dVar)).invokeSuspend(Unit.f71690a);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
                int i11 = this.f96929d;
                if (i11 == 0) {
                    s.b(obj);
                    C2123a c2123a = new C2123a(this.f96931f);
                    this.f96929d = 1;
                    if (this.f96930e.collect(c2123a, this) == aVar) {
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
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(InterfaceC2395h interfaceC2395h, kotlin.coroutines.d dVar, FintechScannerSettingsFragment fintechScannerSettingsFragment) {
            super(2, dVar);
            this.f96927g = interfaceC2395h;
            this.f96928h = fintechScannerSettingsFragment;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            b bVar = FintechScannerSettingsFragment.this.new b(this.f96927g, dVar, this.f96928h);
            bVar.f96925e = obj;
            return bVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(M m11, kotlin.coroutines.d<? super Unit> dVar) {
            return ((b) create(m11, dVar)).invokeSuspend(Unit.f71690a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
            int i11 = this.f96924d;
            if (i11 == 0) {
                s.b(obj);
                if (N.f((M) this.f96925e)) {
                    J viewLifecycleOwner = FintechScannerSettingsFragment.this.getViewLifecycleOwner();
                    Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "getViewLifecycleOwner(...)");
                    AbstractC5434v.b bVar = AbstractC5434v.b.STARTED;
                    a aVar2 = new a(this.f96927g, null, this.f96928h);
                    this.f96924d = 1;
                    if (C5412d0.b(viewLifecycleOwner, bVar, aVar2, this) == aVar) {
                        return aVar;
                    }
                }
                return Unit.f71690a;
            }
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            s.b(obj);
            return Unit.f71690a;
        }
    }

    public static final class c extends AbstractC7737t implements Function0<ComponentCallbacksC5392m> {
        public c() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final ComponentCallbacksC5392m invoke() {
            return FintechScannerSettingsFragment.this;
        }
    }

    public static final class d extends AbstractC7737t implements Function0<B0> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ c f96934b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(c cVar) {
            super(0);
            this.f96934b = cVar;
        }

        @Override // kotlin.jvm.functions.Function0
        public final B0 invoke() {
            return (B0) this.f96934b.invoke();
        }
    }

    public static final class e extends AbstractC7737t implements Function0<A0> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ Object f96935b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(InterfaceC4008j interfaceC4008j) {
            super(0);
            this.f96935b = interfaceC4008j;
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [Sc.j, java.lang.Object] */
        @Override // kotlin.jvm.functions.Function0
        public final A0 invoke() {
            return ((B0) this.f96935b.getValue()).getViewModelStore();
        }
    }

    public static final class f extends AbstractC7737t implements Function0<AbstractC6409a> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ Object f96936b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(InterfaceC4008j interfaceC4008j) {
            super(0);
            this.f96936b = interfaceC4008j;
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [Sc.j, java.lang.Object] */
        @Override // kotlin.jvm.functions.Function0
        public final AbstractC6409a invoke() {
            B0 b02 = (B0) this.f96936b.getValue();
            InterfaceC5431s interfaceC5431s = b02 instanceof InterfaceC5431s ? (InterfaceC5431s) b02 : null;
            return interfaceC5431s != null ? interfaceC5431s.getDefaultViewModelCreationExtras() : AbstractC6409a.C0988a.f62496b;
        }
    }

    public FintechScannerSettingsFragment() {
        h hVar = new h(this, 1);
        InterfaceC4008j a11 = k.a(n.NONE, new d(new c()));
        this.f96913b = b0.b(this, kotlin.jvm.internal.N.b(F90.e.class), new e(a11), new f(a11), hVar);
    }

    public static void t(FintechScannerSettingsFragment fintechScannerSettingsFragment, boolean z11) {
        fintechScannerSettingsFragment.v().r0(z11);
    }

    private final F90.e v() {
        return (F90.e) this.f96913b.getValue();
    }

    @Override // androidx.fragment.app.ComponentCallbacksC5392m
    public final void onAttach(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        super.onAttach(context);
        r requireActivity = requireActivity();
        Intrinsics.checkNotNullExpressionValue(requireActivity, "requireActivity(...)");
        ((w90.b) O30.a.a(O30.c.a(requireActivity)).a(w90.b.class)).i(this);
    }

    @Override // androidx.fragment.app.ComponentCallbacksC5392m
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        v().q0();
    }

    @Override // androidx.fragment.app.ComponentCallbacksC5392m
    @NotNull
    public final View onCreateView(@NotNull LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        Intrinsics.checkNotNullParameter(inflater, "inflater");
        v90.f b11 = v90.f.b(inflater, viewGroup);
        this.f96914c = b11;
        NestedScrollView a11 = b11.a();
        Intrinsics.checkNotNullExpressionValue(a11, "getRoot(...)");
        return a11;
    }

    @Override // androidx.fragment.app.ComponentCallbacksC5392m
    public final void onDestroyView() {
        super.onDestroyView();
        this.f96914c = null;
    }

    @Override // androidx.fragment.app.ComponentCallbacksC5392m
    public final void onStart() {
        super.onStart();
        v().onStart();
    }

    @Override // androidx.fragment.app.ComponentCallbacksC5392m
    public final void onStop() {
        super.onStop();
        v().onStop();
    }

    @Override // androidx.fragment.app.ComponentCallbacksC5392m
    public final void onViewCreated(@NotNull View view, Bundle bundle) {
        Intrinsics.checkNotNullParameter(view, "view");
        x0<x90.c> p02 = v().p0();
        J viewLifecycleOwner = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "getViewLifecycleOwner(...)");
        C10727i.c(K.a(viewLifecycleOwner), null, null, new a(p02, null, this), 3);
        x0<x90.b> n02 = v().n0();
        J viewLifecycleOwner2 = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner2, "getViewLifecycleOwner(...)");
        C10727i.c(K.a(viewLifecycleOwner2), null, null, new b(n02, null, this), 3);
        v90.f fVar = this.f96914c;
        if (fVar != null) {
            fVar.f102646c.setOnCheckedChangeListener(new F90.a(this, 0));
        }
    }
}
