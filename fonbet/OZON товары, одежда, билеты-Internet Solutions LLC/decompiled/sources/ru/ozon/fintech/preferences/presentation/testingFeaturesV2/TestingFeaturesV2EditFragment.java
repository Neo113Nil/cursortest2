package ru.ozon.fintech.preferences.presentation.testingFeaturesV2;

import Ae.C0;
import Ae.InterfaceC2395h;
import Ae.InterfaceC2397i;
import Ae.x0;
import Ca.h;
import Sc.InterfaceC4008j;
import Sc.k;
import Sc.n;
import Sc.s;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;
import androidx.activity.C;
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
import ru.ozon.app.android.R;
import ru.ozon.fintech.ui.toolbar.FinToolbarState;
import ru.ozon.uni.atoms.data.texts.TextAtom;
import ru.ozon.uni.atoms.utils.OzonSpannableString;
import ru.ozon.uni.atoms.utils.OzonSpannableStringKt;
import ru.ozon.uni.core.UniColors;
import v90.i;
import xe.C10727i;
import xe.M;
import xe.N;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lru/ozon/fintech/preferences/presentation/testingFeaturesV2/TestingFeaturesV2EditFragment;", "Landroidx/fragment/app/m;", "<init>", "()V", "fintech-preferences_prodRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class TestingFeaturesV2EditFragment extends ComponentCallbacksC5392m {

    /* renamed from: a, reason: collision with root package name */
    private i f96964a;

    /* renamed from: b, reason: collision with root package name */
    public z0.b f96965b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final y0 f96966c;

    /* renamed from: d, reason: collision with root package name */
    @NotNull
    private a f96967d;

    public static final class a extends C {
        a() {
            super(true);
        }

        @Override // androidx.activity.C
        public final void handleOnBackPressed() {
            TestingFeaturesV2EditFragment.this.y().g0();
        }
    }

    @kotlin.coroutines.jvm.internal.e(c = "ru.ozon.fintech.preferences.presentation.testingFeaturesV2.TestingFeaturesV2EditFragment$onViewCreated$$inlined$observe$1", f = "TestingFeaturesV2EditFragment.kt", l = {33}, m = "invokeSuspend")
    public static final class b extends j implements Function2<M, kotlin.coroutines.d<? super Unit>, Object> {

        /* renamed from: d, reason: collision with root package name */
        int f96969d;

        /* renamed from: e, reason: collision with root package name */
        private /* synthetic */ Object f96970e;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ InterfaceC2395h f96972g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ TestingFeaturesV2EditFragment f96973h;

        @kotlin.coroutines.jvm.internal.e(c = "ru.ozon.fintech.preferences.presentation.testingFeaturesV2.TestingFeaturesV2EditFragment$onViewCreated$$inlined$observe$1$1", f = "TestingFeaturesV2EditFragment.kt", l = {34}, m = "invokeSuspend")
        public static final class a extends j implements Function2<M, kotlin.coroutines.d<? super Unit>, Object> {

            /* renamed from: d, reason: collision with root package name */
            int f96974d;

            /* renamed from: e, reason: collision with root package name */
            final /* synthetic */ InterfaceC2395h f96975e;

            /* renamed from: f, reason: collision with root package name */
            final /* synthetic */ TestingFeaturesV2EditFragment f96976f;

            /* renamed from: ru.ozon.fintech.preferences.presentation.testingFeaturesV2.TestingFeaturesV2EditFragment$b$a$a, reason: collision with other inner class name */
            public static final class C2126a<T> implements InterfaceC2397i {

                /* renamed from: a, reason: collision with root package name */
                final /* synthetic */ TestingFeaturesV2EditFragment f96977a;

                public C2126a(TestingFeaturesV2EditFragment testingFeaturesV2EditFragment) {
                    this.f96977a = testingFeaturesV2EditFragment;
                }

                /* JADX WARN: Multi-variable type inference failed */
                @Override // Ae.InterfaceC2397i
                public final Object emit(T t2, kotlin.coroutines.d<? super Unit> dVar) {
                    H90.d dVar2 = (H90.d) t2;
                    TestingFeaturesV2EditFragment testingFeaturesV2EditFragment = this.f96977a;
                    i iVar = testingFeaturesV2EditFragment.f96964a;
                    if (iVar != null) {
                        iVar.f102674g.setText(dVar2.b());
                    }
                    i iVar2 = testingFeaturesV2EditFragment.f96964a;
                    if (iVar2 != null) {
                        iVar2.f102675h.setText(dVar2.c());
                    }
                    i iVar3 = testingFeaturesV2EditFragment.f96964a;
                    if (iVar3 != null) {
                        iVar3.f102676i.setText(dVar2.d());
                    }
                    if (dVar2.e()) {
                        i iVar4 = testingFeaturesV2EditFragment.f96964a;
                        if (iVar4 != null) {
                            iVar4.f102677j.setText(dVar2.f());
                        }
                    } else {
                        i iVar5 = testingFeaturesV2EditFragment.f96964a;
                        if (iVar5 != null) {
                            iVar5.f102677j.setText(R.string.fintech_testing_features_v2_current_state_default);
                        }
                    }
                    return Unit.f71690a;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(InterfaceC2395h interfaceC2395h, kotlin.coroutines.d dVar, TestingFeaturesV2EditFragment testingFeaturesV2EditFragment) {
                super(2, dVar);
                this.f96975e = interfaceC2395h;
                this.f96976f = testingFeaturesV2EditFragment;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
                return new a(this.f96975e, dVar, this.f96976f);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(M m11, kotlin.coroutines.d<? super Unit> dVar) {
                return ((a) create(m11, dVar)).invokeSuspend(Unit.f71690a);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
                int i11 = this.f96974d;
                if (i11 == 0) {
                    s.b(obj);
                    C2126a c2126a = new C2126a(this.f96976f);
                    this.f96974d = 1;
                    if (this.f96975e.collect(c2126a, this) == aVar) {
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
        public b(InterfaceC2395h interfaceC2395h, kotlin.coroutines.d dVar, TestingFeaturesV2EditFragment testingFeaturesV2EditFragment) {
            super(2, dVar);
            this.f96972g = interfaceC2395h;
            this.f96973h = testingFeaturesV2EditFragment;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            b bVar = TestingFeaturesV2EditFragment.this.new b(this.f96972g, dVar, this.f96973h);
            bVar.f96970e = obj;
            return bVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(M m11, kotlin.coroutines.d<? super Unit> dVar) {
            return ((b) create(m11, dVar)).invokeSuspend(Unit.f71690a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
            int i11 = this.f96969d;
            if (i11 == 0) {
                s.b(obj);
                if (N.f((M) this.f96970e)) {
                    J viewLifecycleOwner = TestingFeaturesV2EditFragment.this.getViewLifecycleOwner();
                    Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "getViewLifecycleOwner(...)");
                    AbstractC5434v.b bVar = AbstractC5434v.b.STARTED;
                    a aVar2 = new a(this.f96972g, null, this.f96973h);
                    this.f96969d = 1;
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

    @kotlin.coroutines.jvm.internal.e(c = "ru.ozon.fintech.preferences.presentation.testingFeaturesV2.TestingFeaturesV2EditFragment$onViewCreated$$inlined$observe$2", f = "TestingFeaturesV2EditFragment.kt", l = {33}, m = "invokeSuspend")
    public static final class c extends j implements Function2<M, kotlin.coroutines.d<? super Unit>, Object> {

        /* renamed from: d, reason: collision with root package name */
        int f96978d;

        /* renamed from: e, reason: collision with root package name */
        private /* synthetic */ Object f96979e;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ C0 f96981g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ TestingFeaturesV2EditFragment f96982h;

        @kotlin.coroutines.jvm.internal.e(c = "ru.ozon.fintech.preferences.presentation.testingFeaturesV2.TestingFeaturesV2EditFragment$onViewCreated$$inlined$observe$2$1", f = "TestingFeaturesV2EditFragment.kt", l = {34}, m = "invokeSuspend")
        public static final class a extends j implements Function2<M, kotlin.coroutines.d<? super Unit>, Object> {

            /* renamed from: d, reason: collision with root package name */
            int f96983d;

            /* renamed from: e, reason: collision with root package name */
            final /* synthetic */ C0 f96984e;

            /* renamed from: f, reason: collision with root package name */
            final /* synthetic */ TestingFeaturesV2EditFragment f96985f;

            /* renamed from: ru.ozon.fintech.preferences.presentation.testingFeaturesV2.TestingFeaturesV2EditFragment$c$a$a, reason: collision with other inner class name */
            public static final class C2127a<T> implements InterfaceC2397i {

                /* renamed from: a, reason: collision with root package name */
                final /* synthetic */ TestingFeaturesV2EditFragment f96986a;

                public C2127a(TestingFeaturesV2EditFragment testingFeaturesV2EditFragment) {
                    this.f96986a = testingFeaturesV2EditFragment;
                }

                /* JADX WARN: Multi-variable type inference failed */
                @Override // Ae.InterfaceC2397i
                public final Object emit(T t2, kotlin.coroutines.d<? super Unit> dVar) {
                    Toast.makeText(this.f96986a.requireActivity().getApplicationContext(), (String) t2, 0).show();
                    return Unit.f71690a;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(C0 c02, kotlin.coroutines.d dVar, TestingFeaturesV2EditFragment testingFeaturesV2EditFragment) {
                super(2, dVar);
                this.f96984e = c02;
                this.f96985f = testingFeaturesV2EditFragment;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
                return new a(this.f96984e, dVar, this.f96985f);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(M m11, kotlin.coroutines.d<? super Unit> dVar) {
                return ((a) create(m11, dVar)).invokeSuspend(Unit.f71690a);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
                int i11 = this.f96983d;
                if (i11 == 0) {
                    s.b(obj);
                    C2127a c2127a = new C2127a(this.f96985f);
                    this.f96983d = 1;
                    if (this.f96984e.collect(c2127a, this) == aVar) {
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
        public c(C0 c02, kotlin.coroutines.d dVar, TestingFeaturesV2EditFragment testingFeaturesV2EditFragment) {
            super(2, dVar);
            this.f96981g = c02;
            this.f96982h = testingFeaturesV2EditFragment;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            c cVar = TestingFeaturesV2EditFragment.this.new c(this.f96981g, dVar, this.f96982h);
            cVar.f96979e = obj;
            return cVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(M m11, kotlin.coroutines.d<? super Unit> dVar) {
            return ((c) create(m11, dVar)).invokeSuspend(Unit.f71690a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
            int i11 = this.f96978d;
            if (i11 == 0) {
                s.b(obj);
                if (N.f((M) this.f96979e)) {
                    J viewLifecycleOwner = TestingFeaturesV2EditFragment.this.getViewLifecycleOwner();
                    Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "getViewLifecycleOwner(...)");
                    AbstractC5434v.b bVar = AbstractC5434v.b.STARTED;
                    a aVar2 = new a(this.f96981g, null, this.f96982h);
                    this.f96978d = 1;
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

    public static final class d extends AbstractC7737t implements Function0<ComponentCallbacksC5392m> {
        public d() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final ComponentCallbacksC5392m invoke() {
            return TestingFeaturesV2EditFragment.this;
        }
    }

    public static final class e extends AbstractC7737t implements Function0<B0> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ d f96988b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(d dVar) {
            super(0);
            this.f96988b = dVar;
        }

        @Override // kotlin.jvm.functions.Function0
        public final B0 invoke() {
            return (B0) this.f96988b.invoke();
        }
    }

    public static final class f extends AbstractC7737t implements Function0<A0> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ Object f96989b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(InterfaceC4008j interfaceC4008j) {
            super(0);
            this.f96989b = interfaceC4008j;
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [Sc.j, java.lang.Object] */
        @Override // kotlin.jvm.functions.Function0
        public final A0 invoke() {
            return ((B0) this.f96989b.getValue()).getViewModelStore();
        }
    }

    public static final class g extends AbstractC7737t implements Function0<AbstractC6409a> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ Object f96990b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(InterfaceC4008j interfaceC4008j) {
            super(0);
            this.f96990b = interfaceC4008j;
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [Sc.j, java.lang.Object] */
        @Override // kotlin.jvm.functions.Function0
        public final AbstractC6409a invoke() {
            B0 b02 = (B0) this.f96990b.getValue();
            InterfaceC5431s interfaceC5431s = b02 instanceof InterfaceC5431s ? (InterfaceC5431s) b02 : null;
            return interfaceC5431s != null ? interfaceC5431s.getDefaultViewModelCreationExtras() : AbstractC6409a.C0988a.f62496b;
        }
    }

    public TestingFeaturesV2EditFragment() {
        F70.c cVar = new F70.c(this, 1);
        InterfaceC4008j a11 = k.a(n.NONE, new e(new d()));
        this.f96966c = b0.b(this, kotlin.jvm.internal.N.b(H90.b.class), new f(a11), new g(a11), cVar);
        this.f96967d = new a();
    }

    public static Unit t(TestingFeaturesV2EditFragment testingFeaturesV2EditFragment) {
        H90.b y11 = testingFeaturesV2EditFragment.y();
        i iVar = testingFeaturesV2EditFragment.f96964a;
        String valueOf = String.valueOf(iVar != null ? iVar.f102674g.getText() : null);
        i iVar2 = testingFeaturesV2EditFragment.f96964a;
        String valueOf2 = String.valueOf(iVar2 != null ? iVar2.f102675h.getText() : null);
        i iVar3 = testingFeaturesV2EditFragment.f96964a;
        y11.j0(valueOf, valueOf2, String.valueOf(iVar3 != null ? iVar3.f102676i.getText() : null));
        return Unit.f71690a;
    }

    public static Unit u(TestingFeaturesV2EditFragment testingFeaturesV2EditFragment) {
        testingFeaturesV2EditFragment.y().g0();
        return Unit.f71690a;
    }

    public static Unit v(TestingFeaturesV2EditFragment testingFeaturesV2EditFragment) {
        testingFeaturesV2EditFragment.y().i0();
        return Unit.f71690a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final H90.b y() {
        return (H90.b) this.f96966c.getValue();
    }

    @Override // androidx.fragment.app.ComponentCallbacksC5392m
    public final void onAttach(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        super.onAttach(context);
        r requireActivity = requireActivity();
        Intrinsics.checkNotNullExpressionValue(requireActivity, "requireActivity(...)");
        ((w90.b) O30.a.a(O30.c.a(requireActivity)).a(w90.b.class)).q0(this);
    }

    @Override // androidx.fragment.app.ComponentCallbacksC5392m
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        y().h0();
    }

    @Override // androidx.fragment.app.ComponentCallbacksC5392m
    @NotNull
    public final View onCreateView(@NotNull LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        Intrinsics.checkNotNullParameter(inflater, "inflater");
        i b11 = i.b(inflater, viewGroup);
        this.f96964a = b11;
        ConstraintLayout a11 = b11.a();
        Intrinsics.checkNotNullExpressionValue(a11, "getRoot(...)");
        return a11;
    }

    @Override // androidx.fragment.app.ComponentCallbacksC5392m
    public final void onViewCreated(@NotNull View view, Bundle bundle) {
        Intrinsics.checkNotNullParameter(view, "view");
        androidx.activity.J onBackPressedDispatcher = requireActivity().getOnBackPressedDispatcher();
        J viewLifecycleOwner = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "getViewLifecycleOwner(...)");
        onBackPressedDispatcher.h(viewLifecycleOwner, this.f96967d);
        OzonSpannableString ozonSpannableString = OzonSpannableStringKt.toOzonSpannableString("Сбросить");
        UniColors uniColors = UniColors.BLUE_500;
        FinToolbarState finToolbarState = new FinToolbarState("Фичи фронта V2", null, new TextAtom(OzonSpannableStringKt.toOzonSpannableString("Сохранить"), null, uniColors.getToken(), null, null, null, null, 122, null), new G30.a(this, 1), new TextAtom(ozonSpannableString, null, uniColors.getToken(), null, null, null, null, 122, null), new h(this, 1), null, null, null, Integer.valueOf(R.drawable.ic_m_disclosure_back_filled), "graphicTertiary", new H90.a(this, 0), null, null, null, null, 17, 61890, null);
        i iVar = this.f96964a;
        if (iVar != null) {
            iVar.f102678k.bindState(finToolbarState);
        }
        x0<H90.d> f02 = y().f0();
        J viewLifecycleOwner2 = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner2, "getViewLifecycleOwner(...)");
        C10727i.c(K.a(viewLifecycleOwner2), null, null, new b(f02, null, this), 3);
        C0 e02 = y().e0();
        J viewLifecycleOwner3 = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner3, "getViewLifecycleOwner(...)");
        C10727i.c(K.a(viewLifecycleOwner3), null, null, new c(e02, null, this), 3);
    }
}
