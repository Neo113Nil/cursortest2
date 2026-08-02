package ru.ozon.fintech.preferences.presentation.camera;

import Ae.InterfaceC2395h;
import Ae.InterfaceC2397i;
import Ae.x0;
import Sc.InterfaceC4008j;
import Sc.k;
import Sc.n;
import Sc.s;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
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
import f3.AbstractC6409a;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.j;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.fintech.ui.button.large.FinLargeButtonView;
import ru.ozon.fintech.ui.toolbar.FinToolbarView;
import xe.C10727i;
import xe.M;
import xe.N;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lru/ozon/fintech/preferences/presentation/camera/FintechCameraSettingsFragment;", "LE30/c;", "<init>", "()V", "fintech-preferences_prodRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class FintechCameraSettingsFragment extends E30.c {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final y0 f96655a;

    /* renamed from: b, reason: collision with root package name */
    private v90.b f96656b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final String f96657c;

    @kotlin.coroutines.jvm.internal.e(c = "ru.ozon.fintech.preferences.presentation.camera.FintechCameraSettingsFragment$onViewCreated$$inlined$observe$1", f = "FintechCameraSettingsFragment.kt", l = {33}, m = "invokeSuspend")
    public static final class a extends j implements Function2<M, kotlin.coroutines.d<? super Unit>, Object> {

        /* renamed from: d, reason: collision with root package name */
        int f96658d;

        /* renamed from: e, reason: collision with root package name */
        private /* synthetic */ Object f96659e;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ InterfaceC2395h f96661g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ FintechCameraSettingsFragment f96662h;

        @kotlin.coroutines.jvm.internal.e(c = "ru.ozon.fintech.preferences.presentation.camera.FintechCameraSettingsFragment$onViewCreated$$inlined$observe$1$1", f = "FintechCameraSettingsFragment.kt", l = {34}, m = "invokeSuspend")
        /* renamed from: ru.ozon.fintech.preferences.presentation.camera.FintechCameraSettingsFragment$a$a, reason: collision with other inner class name */
        public static final class C2104a extends j implements Function2<M, kotlin.coroutines.d<? super Unit>, Object> {

            /* renamed from: d, reason: collision with root package name */
            int f96663d;

            /* renamed from: e, reason: collision with root package name */
            final /* synthetic */ InterfaceC2395h f96664e;

            /* renamed from: f, reason: collision with root package name */
            final /* synthetic */ FintechCameraSettingsFragment f96665f;

            /* renamed from: ru.ozon.fintech.preferences.presentation.camera.FintechCameraSettingsFragment$a$a$a, reason: collision with other inner class name */
            public static final class C2105a<T> implements InterfaceC2397i {

                /* renamed from: a, reason: collision with root package name */
                final /* synthetic */ FintechCameraSettingsFragment f96666a;

                public C2105a(FintechCameraSettingsFragment fintechCameraSettingsFragment) {
                    this.f96666a = fintechCameraSettingsFragment;
                }

                /* JADX WARN: Multi-variable type inference failed */
                @Override // Ae.InterfaceC2397i
                public final Object emit(T t2, kotlin.coroutines.d<? super Unit> dVar) {
                    FinLargeButtonView finLargeButtonView;
                    FinToolbarView finToolbarView;
                    x90.c cVar = (x90.c) t2;
                    FintechCameraSettingsFragment fintechCameraSettingsFragment = this.f96666a;
                    v90.b bVar = fintechCameraSettingsFragment.f96656b;
                    if (bVar != null && (finToolbarView = bVar.f102592p) != null) {
                        finToolbarView.bindState(cVar.b());
                    }
                    v90.b bVar2 = fintechCameraSettingsFragment.f96656b;
                    if (bVar2 != null && (finLargeButtonView = bVar2.f102591o) != null) {
                        finLargeButtonView.bindState(cVar.a());
                    }
                    return Unit.f71690a;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C2104a(InterfaceC2395h interfaceC2395h, kotlin.coroutines.d dVar, FintechCameraSettingsFragment fintechCameraSettingsFragment) {
                super(2, dVar);
                this.f96664e = interfaceC2395h;
                this.f96665f = fintechCameraSettingsFragment;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
                return new C2104a(this.f96664e, dVar, this.f96665f);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(M m11, kotlin.coroutines.d<? super Unit> dVar) {
                return ((C2104a) create(m11, dVar)).invokeSuspend(Unit.f71690a);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
                int i11 = this.f96663d;
                if (i11 == 0) {
                    s.b(obj);
                    C2105a c2105a = new C2105a(this.f96665f);
                    this.f96663d = 1;
                    if (this.f96664e.collect(c2105a, this) == aVar) {
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
        public a(InterfaceC2395h interfaceC2395h, kotlin.coroutines.d dVar, FintechCameraSettingsFragment fintechCameraSettingsFragment) {
            super(2, dVar);
            this.f96661g = interfaceC2395h;
            this.f96662h = fintechCameraSettingsFragment;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            a aVar = FintechCameraSettingsFragment.this.new a(this.f96661g, dVar, this.f96662h);
            aVar.f96659e = obj;
            return aVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(M m11, kotlin.coroutines.d<? super Unit> dVar) {
            return ((a) create(m11, dVar)).invokeSuspend(Unit.f71690a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
            int i11 = this.f96658d;
            if (i11 == 0) {
                s.b(obj);
                if (N.f((M) this.f96659e)) {
                    J viewLifecycleOwner = FintechCameraSettingsFragment.this.getViewLifecycleOwner();
                    Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "getViewLifecycleOwner(...)");
                    AbstractC5434v.b bVar = AbstractC5434v.b.STARTED;
                    C2104a c2104a = new C2104a(this.f96661g, null, this.f96662h);
                    this.f96658d = 1;
                    if (C5412d0.b(viewLifecycleOwner, bVar, c2104a, this) == aVar) {
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

    @kotlin.coroutines.jvm.internal.e(c = "ru.ozon.fintech.preferences.presentation.camera.FintechCameraSettingsFragment$onViewCreated$$inlined$observe$2", f = "FintechCameraSettingsFragment.kt", l = {33}, m = "invokeSuspend")
    public static final class b extends j implements Function2<M, kotlin.coroutines.d<? super Unit>, Object> {

        /* renamed from: d, reason: collision with root package name */
        int f96667d;

        /* renamed from: e, reason: collision with root package name */
        private /* synthetic */ Object f96668e;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ InterfaceC2395h f96670g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ FintechCameraSettingsFragment f96671h;

        @kotlin.coroutines.jvm.internal.e(c = "ru.ozon.fintech.preferences.presentation.camera.FintechCameraSettingsFragment$onViewCreated$$inlined$observe$2$1", f = "FintechCameraSettingsFragment.kt", l = {34}, m = "invokeSuspend")
        public static final class a extends j implements Function2<M, kotlin.coroutines.d<? super Unit>, Object> {

            /* renamed from: d, reason: collision with root package name */
            int f96672d;

            /* renamed from: e, reason: collision with root package name */
            final /* synthetic */ InterfaceC2395h f96673e;

            /* renamed from: f, reason: collision with root package name */
            final /* synthetic */ FintechCameraSettingsFragment f96674f;

            /* renamed from: ru.ozon.fintech.preferences.presentation.camera.FintechCameraSettingsFragment$b$a$a, reason: collision with other inner class name */
            public static final class C2106a<T> implements InterfaceC2397i {

                /* renamed from: a, reason: collision with root package name */
                final /* synthetic */ FintechCameraSettingsFragment f96675a;

                public C2106a(FintechCameraSettingsFragment fintechCameraSettingsFragment) {
                    this.f96675a = fintechCameraSettingsFragment;
                }

                /* JADX WARN: Multi-variable type inference failed */
                @Override // Ae.InterfaceC2397i
                public final Object emit(T t2, kotlin.coroutines.d<? super Unit> dVar) {
                    x90.a aVar = (x90.a) t2;
                    if (aVar != null) {
                        FintechCameraSettingsFragment fintechCameraSettingsFragment = this.f96675a;
                        v90.b bVar = fintechCameraSettingsFragment.f96656b;
                        if (bVar != null) {
                            bVar.f102578b.bindState(aVar.a());
                        }
                        v90.b bVar2 = fintechCameraSettingsFragment.f96656b;
                        if (bVar2 != null) {
                            bVar2.f102579c.bindState(aVar.f());
                        }
                        v90.b bVar3 = fintechCameraSettingsFragment.f96656b;
                        if (bVar3 != null) {
                            bVar3.f102587k.bindState(aVar.h());
                        }
                        v90.b bVar4 = fintechCameraSettingsFragment.f96656b;
                        if (bVar4 != null) {
                            bVar4.f102590n.bindState(aVar.k());
                        }
                        v90.b bVar5 = fintechCameraSettingsFragment.f96656b;
                        if (bVar5 != null) {
                            bVar5.f102588l.bindState(aVar.i());
                        }
                        v90.b bVar6 = fintechCameraSettingsFragment.f96656b;
                        if (bVar6 != null) {
                            bVar6.f102584h.bindState(aVar.m());
                        }
                        v90.b bVar7 = fintechCameraSettingsFragment.f96656b;
                        if (bVar7 != null) {
                            bVar7.f102583g.bindState(aVar.l());
                        }
                        v90.b bVar8 = fintechCameraSettingsFragment.f96656b;
                        if (bVar8 != null) {
                            bVar8.f102589m.bindState(aVar.j());
                        }
                        v90.b bVar9 = fintechCameraSettingsFragment.f96656b;
                        if (bVar9 != null) {
                            bVar9.f102586j.bindState(aVar.g());
                        }
                        v90.b bVar10 = fintechCameraSettingsFragment.f96656b;
                        if (bVar10 != null) {
                            bVar10.f102585i.bindState(aVar.e());
                        }
                        v90.b bVar11 = fintechCameraSettingsFragment.f96656b;
                        if (bVar11 != null) {
                            bVar11.f102581e.bindState(aVar.c());
                        }
                        v90.b bVar12 = fintechCameraSettingsFragment.f96656b;
                        if (bVar12 != null) {
                            bVar12.f102582f.bindState(aVar.d());
                        }
                        v90.b bVar13 = fintechCameraSettingsFragment.f96656b;
                        if (bVar13 != null) {
                            bVar13.f102580d.bindState(aVar.b());
                        }
                    }
                    return Unit.f71690a;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(InterfaceC2395h interfaceC2395h, kotlin.coroutines.d dVar, FintechCameraSettingsFragment fintechCameraSettingsFragment) {
                super(2, dVar);
                this.f96673e = interfaceC2395h;
                this.f96674f = fintechCameraSettingsFragment;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
                return new a(this.f96673e, dVar, this.f96674f);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(M m11, kotlin.coroutines.d<? super Unit> dVar) {
                return ((a) create(m11, dVar)).invokeSuspend(Unit.f71690a);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
                int i11 = this.f96672d;
                if (i11 == 0) {
                    s.b(obj);
                    C2106a c2106a = new C2106a(this.f96674f);
                    this.f96672d = 1;
                    if (this.f96673e.collect(c2106a, this) == aVar) {
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
        public b(InterfaceC2395h interfaceC2395h, kotlin.coroutines.d dVar, FintechCameraSettingsFragment fintechCameraSettingsFragment) {
            super(2, dVar);
            this.f96670g = interfaceC2395h;
            this.f96671h = fintechCameraSettingsFragment;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            b bVar = FintechCameraSettingsFragment.this.new b(this.f96670g, dVar, this.f96671h);
            bVar.f96668e = obj;
            return bVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(M m11, kotlin.coroutines.d<? super Unit> dVar) {
            return ((b) create(m11, dVar)).invokeSuspend(Unit.f71690a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
            int i11 = this.f96667d;
            if (i11 == 0) {
                s.b(obj);
                if (N.f((M) this.f96668e)) {
                    J viewLifecycleOwner = FintechCameraSettingsFragment.this.getViewLifecycleOwner();
                    Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "getViewLifecycleOwner(...)");
                    AbstractC5434v.b bVar = AbstractC5434v.b.STARTED;
                    a aVar2 = new a(this.f96670g, null, this.f96671h);
                    this.f96667d = 1;
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
            return FintechCameraSettingsFragment.this;
        }
    }

    public static final class d extends AbstractC7737t implements Function0<B0> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ c f96677b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(c cVar) {
            super(0);
            this.f96677b = cVar;
        }

        @Override // kotlin.jvm.functions.Function0
        public final B0 invoke() {
            return (B0) this.f96677b.invoke();
        }
    }

    public static final class e extends AbstractC7737t implements Function0<A0> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ Object f96678b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(InterfaceC4008j interfaceC4008j) {
            super(0);
            this.f96678b = interfaceC4008j;
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [Sc.j, java.lang.Object] */
        @Override // kotlin.jvm.functions.Function0
        public final A0 invoke() {
            return ((B0) this.f96678b.getValue()).getViewModelStore();
        }
    }

    public static final class f extends AbstractC7737t implements Function0<AbstractC6409a> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ Object f96679b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(InterfaceC4008j interfaceC4008j) {
            super(0);
            this.f96679b = interfaceC4008j;
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [Sc.j, java.lang.Object] */
        @Override // kotlin.jvm.functions.Function0
        public final AbstractC6409a invoke() {
            B0 b02 = (B0) this.f96679b.getValue();
            InterfaceC5431s interfaceC5431s = b02 instanceof InterfaceC5431s ? (InterfaceC5431s) b02 : null;
            return interfaceC5431s != null ? interfaceC5431s.getDefaultViewModelCreationExtras() : AbstractC6409a.C0988a.f62496b;
        }
    }

    public FintechCameraSettingsFragment() {
        A50.a aVar = new A50.a(this, 6);
        InterfaceC4008j a11 = k.a(n.NONE, new d(new c()));
        this.f96655a = b0.b(this, kotlin.jvm.internal.N.b(z90.e.class), new e(a11), new f(a11), aVar);
        this.f96657c = "CameraSettings";
    }

    @Override // E30.c
    @NotNull
    /* renamed from: getFragmentName, reason: from getter */
    public final String getF96657c() {
        return this.f96657c;
    }

    @Override // androidx.fragment.app.ComponentCallbacksC5392m
    public final void onAttach(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        super.onAttach(context);
        r requireActivity = requireActivity();
        Intrinsics.checkNotNullExpressionValue(requireActivity, "requireActivity(...)");
        ((w90.b) O30.a.a(O30.c.a(requireActivity)).a(w90.b.class)).s(this);
    }

    @Override // E30.c, androidx.fragment.app.ComponentCallbacksC5392m
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        ((z90.e) this.f96655a.getValue()).x0(getUniqueUuid());
    }

    @Override // androidx.fragment.app.ComponentCallbacksC5392m
    @NotNull
    public final View onCreateView(@NotNull LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        Intrinsics.checkNotNullParameter(inflater, "inflater");
        v90.b b11 = v90.b.b(inflater, viewGroup);
        this.f96656b = b11;
        ConstraintLayout a11 = b11.a();
        Intrinsics.checkNotNullExpressionValue(a11, "getRoot(...)");
        return a11;
    }

    @Override // androidx.fragment.app.ComponentCallbacksC5392m
    public final void onDestroyView() {
        super.onDestroyView();
        this.f96656b = null;
    }

    @Override // E30.c, androidx.fragment.app.ComponentCallbacksC5392m
    public final void onViewCreated(@NotNull View view, Bundle bundle) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, bundle);
        y0 y0Var = this.f96655a;
        x0<x90.c> w02 = ((z90.e) y0Var.getValue()).w0();
        J viewLifecycleOwner = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "getViewLifecycleOwner(...)");
        C10727i.c(K.a(viewLifecycleOwner), null, null, new a(w02, null, this), 3);
        x0<x90.a> v02 = ((z90.e) y0Var.getValue()).v0();
        J viewLifecycleOwner2 = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner2, "getViewLifecycleOwner(...)");
        C10727i.c(K.a(viewLifecycleOwner2), null, null, new b(v02, null, this), 3);
    }
}
