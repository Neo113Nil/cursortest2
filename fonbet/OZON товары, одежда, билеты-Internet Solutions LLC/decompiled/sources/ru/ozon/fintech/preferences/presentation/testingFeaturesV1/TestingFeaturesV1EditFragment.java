package ru.ozon.fintech.preferences.presentation.testingFeaturesV1;

import Ae.C0;
import Ae.InterfaceC2395h;
import Ae.InterfaceC2397i;
import Ae.x0;
import B90.C2620w;
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
import v90.h;
import xe.C10727i;
import xe.M;
import xe.N;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lru/ozon/fintech/preferences/presentation/testingFeaturesV1/TestingFeaturesV1EditFragment;", "Landroidx/fragment/app/m;", "<init>", "()V", "fintech-preferences_prodRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class TestingFeaturesV1EditFragment extends ComponentCallbacksC5392m {

    /* renamed from: a, reason: collision with root package name */
    private h f96937a;

    /* renamed from: b, reason: collision with root package name */
    public z0.b f96938b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final y0 f96939c;

    /* renamed from: d, reason: collision with root package name */
    @NotNull
    private a f96940d;

    public static final class a extends C {
        a() {
            super(true);
        }

        @Override // androidx.activity.C
        public final void handleOnBackPressed() {
            TestingFeaturesV1EditFragment.this.y().g0();
        }
    }

    @kotlin.coroutines.jvm.internal.e(c = "ru.ozon.fintech.preferences.presentation.testingFeaturesV1.TestingFeaturesV1EditFragment$onViewCreated$$inlined$observe$1", f = "TestingFeaturesV1EditFragment.kt", l = {33}, m = "invokeSuspend")
    public static final class b extends j implements Function2<M, kotlin.coroutines.d<? super Unit>, Object> {

        /* renamed from: d, reason: collision with root package name */
        int f96942d;

        /* renamed from: e, reason: collision with root package name */
        private /* synthetic */ Object f96943e;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ InterfaceC2395h f96945g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ TestingFeaturesV1EditFragment f96946h;

        @kotlin.coroutines.jvm.internal.e(c = "ru.ozon.fintech.preferences.presentation.testingFeaturesV1.TestingFeaturesV1EditFragment$onViewCreated$$inlined$observe$1$1", f = "TestingFeaturesV1EditFragment.kt", l = {34}, m = "invokeSuspend")
        public static final class a extends j implements Function2<M, kotlin.coroutines.d<? super Unit>, Object> {

            /* renamed from: d, reason: collision with root package name */
            int f96947d;

            /* renamed from: e, reason: collision with root package name */
            final /* synthetic */ InterfaceC2395h f96948e;

            /* renamed from: f, reason: collision with root package name */
            final /* synthetic */ TestingFeaturesV1EditFragment f96949f;

            /* renamed from: ru.ozon.fintech.preferences.presentation.testingFeaturesV1.TestingFeaturesV1EditFragment$b$a$a, reason: collision with other inner class name */
            public static final class C2124a<T> implements InterfaceC2397i {

                /* renamed from: a, reason: collision with root package name */
                final /* synthetic */ TestingFeaturesV1EditFragment f96950a;

                public C2124a(TestingFeaturesV1EditFragment testingFeaturesV1EditFragment) {
                    this.f96950a = testingFeaturesV1EditFragment;
                }

                /* JADX WARN: Multi-variable type inference failed */
                @Override // Ae.InterfaceC2397i
                public final Object emit(T t2, kotlin.coroutines.d<? super Unit> dVar) {
                    G90.c cVar = (G90.c) t2;
                    TestingFeaturesV1EditFragment testingFeaturesV1EditFragment = this.f96950a;
                    h hVar = testingFeaturesV1EditFragment.f96937a;
                    if (hVar != null) {
                        hVar.f102664g.setText(cVar.b());
                    }
                    if (cVar.c()) {
                        h hVar2 = testingFeaturesV1EditFragment.f96937a;
                        if (hVar2 != null) {
                            hVar2.f102665h.setText(cVar.b());
                        }
                        h hVar3 = testingFeaturesV1EditFragment.f96937a;
                        if (hVar3 != null) {
                            hVar3.f102666i.setText(cVar.d());
                        }
                    } else {
                        h hVar4 = testingFeaturesV1EditFragment.f96937a;
                        if (hVar4 != null) {
                            hVar4.f102665h.setText(R.string.fintech_testing_features_v1_current_features_default);
                        }
                        h hVar5 = testingFeaturesV1EditFragment.f96937a;
                        if (hVar5 != null) {
                            hVar5.f102666i.setText(R.string.fintech_testing_features_v1_current_header_default);
                        }
                    }
                    return Unit.f71690a;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(InterfaceC2395h interfaceC2395h, kotlin.coroutines.d dVar, TestingFeaturesV1EditFragment testingFeaturesV1EditFragment) {
                super(2, dVar);
                this.f96948e = interfaceC2395h;
                this.f96949f = testingFeaturesV1EditFragment;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
                return new a(this.f96948e, dVar, this.f96949f);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(M m11, kotlin.coroutines.d<? super Unit> dVar) {
                return ((a) create(m11, dVar)).invokeSuspend(Unit.f71690a);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
                int i11 = this.f96947d;
                if (i11 == 0) {
                    s.b(obj);
                    C2124a c2124a = new C2124a(this.f96949f);
                    this.f96947d = 1;
                    if (this.f96948e.collect(c2124a, this) == aVar) {
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
        public b(InterfaceC2395h interfaceC2395h, kotlin.coroutines.d dVar, TestingFeaturesV1EditFragment testingFeaturesV1EditFragment) {
            super(2, dVar);
            this.f96945g = interfaceC2395h;
            this.f96946h = testingFeaturesV1EditFragment;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            b bVar = TestingFeaturesV1EditFragment.this.new b(this.f96945g, dVar, this.f96946h);
            bVar.f96943e = obj;
            return bVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(M m11, kotlin.coroutines.d<? super Unit> dVar) {
            return ((b) create(m11, dVar)).invokeSuspend(Unit.f71690a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
            int i11 = this.f96942d;
            if (i11 == 0) {
                s.b(obj);
                if (N.f((M) this.f96943e)) {
                    J viewLifecycleOwner = TestingFeaturesV1EditFragment.this.getViewLifecycleOwner();
                    Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "getViewLifecycleOwner(...)");
                    AbstractC5434v.b bVar = AbstractC5434v.b.STARTED;
                    a aVar2 = new a(this.f96945g, null, this.f96946h);
                    this.f96942d = 1;
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

    @kotlin.coroutines.jvm.internal.e(c = "ru.ozon.fintech.preferences.presentation.testingFeaturesV1.TestingFeaturesV1EditFragment$onViewCreated$$inlined$observe$2", f = "TestingFeaturesV1EditFragment.kt", l = {33}, m = "invokeSuspend")
    public static final class c extends j implements Function2<M, kotlin.coroutines.d<? super Unit>, Object> {

        /* renamed from: d, reason: collision with root package name */
        int f96951d;

        /* renamed from: e, reason: collision with root package name */
        private /* synthetic */ Object f96952e;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ C0 f96954g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ TestingFeaturesV1EditFragment f96955h;

        @kotlin.coroutines.jvm.internal.e(c = "ru.ozon.fintech.preferences.presentation.testingFeaturesV1.TestingFeaturesV1EditFragment$onViewCreated$$inlined$observe$2$1", f = "TestingFeaturesV1EditFragment.kt", l = {34}, m = "invokeSuspend")
        public static final class a extends j implements Function2<M, kotlin.coroutines.d<? super Unit>, Object> {

            /* renamed from: d, reason: collision with root package name */
            int f96956d;

            /* renamed from: e, reason: collision with root package name */
            final /* synthetic */ C0 f96957e;

            /* renamed from: f, reason: collision with root package name */
            final /* synthetic */ TestingFeaturesV1EditFragment f96958f;

            /* renamed from: ru.ozon.fintech.preferences.presentation.testingFeaturesV1.TestingFeaturesV1EditFragment$c$a$a, reason: collision with other inner class name */
            public static final class C2125a<T> implements InterfaceC2397i {

                /* renamed from: a, reason: collision with root package name */
                final /* synthetic */ TestingFeaturesV1EditFragment f96959a;

                public C2125a(TestingFeaturesV1EditFragment testingFeaturesV1EditFragment) {
                    this.f96959a = testingFeaturesV1EditFragment;
                }

                /* JADX WARN: Multi-variable type inference failed */
                @Override // Ae.InterfaceC2397i
                public final Object emit(T t2, kotlin.coroutines.d<? super Unit> dVar) {
                    Toast.makeText(this.f96959a.requireActivity().getApplicationContext(), (String) t2, 0).show();
                    return Unit.f71690a;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(C0 c02, kotlin.coroutines.d dVar, TestingFeaturesV1EditFragment testingFeaturesV1EditFragment) {
                super(2, dVar);
                this.f96957e = c02;
                this.f96958f = testingFeaturesV1EditFragment;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
                return new a(this.f96957e, dVar, this.f96958f);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(M m11, kotlin.coroutines.d<? super Unit> dVar) {
                return ((a) create(m11, dVar)).invokeSuspend(Unit.f71690a);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
                int i11 = this.f96956d;
                if (i11 == 0) {
                    s.b(obj);
                    C2125a c2125a = new C2125a(this.f96958f);
                    this.f96956d = 1;
                    if (this.f96957e.collect(c2125a, this) == aVar) {
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
        public c(C0 c02, kotlin.coroutines.d dVar, TestingFeaturesV1EditFragment testingFeaturesV1EditFragment) {
            super(2, dVar);
            this.f96954g = c02;
            this.f96955h = testingFeaturesV1EditFragment;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            c cVar = TestingFeaturesV1EditFragment.this.new c(this.f96954g, dVar, this.f96955h);
            cVar.f96952e = obj;
            return cVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(M m11, kotlin.coroutines.d<? super Unit> dVar) {
            return ((c) create(m11, dVar)).invokeSuspend(Unit.f71690a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
            int i11 = this.f96951d;
            if (i11 == 0) {
                s.b(obj);
                if (N.f((M) this.f96952e)) {
                    J viewLifecycleOwner = TestingFeaturesV1EditFragment.this.getViewLifecycleOwner();
                    Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "getViewLifecycleOwner(...)");
                    AbstractC5434v.b bVar = AbstractC5434v.b.STARTED;
                    a aVar2 = new a(this.f96954g, null, this.f96955h);
                    this.f96951d = 1;
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
            return TestingFeaturesV1EditFragment.this;
        }
    }

    public static final class e extends AbstractC7737t implements Function0<B0> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ d f96961b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(d dVar) {
            super(0);
            this.f96961b = dVar;
        }

        @Override // kotlin.jvm.functions.Function0
        public final B0 invoke() {
            return (B0) this.f96961b.invoke();
        }
    }

    public static final class f extends AbstractC7737t implements Function0<A0> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ Object f96962b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(InterfaceC4008j interfaceC4008j) {
            super(0);
            this.f96962b = interfaceC4008j;
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [Sc.j, java.lang.Object] */
        @Override // kotlin.jvm.functions.Function0
        public final A0 invoke() {
            return ((B0) this.f96962b.getValue()).getViewModelStore();
        }
    }

    public static final class g extends AbstractC7737t implements Function0<AbstractC6409a> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ Object f96963b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(InterfaceC4008j interfaceC4008j) {
            super(0);
            this.f96963b = interfaceC4008j;
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [Sc.j, java.lang.Object] */
        @Override // kotlin.jvm.functions.Function0
        public final AbstractC6409a invoke() {
            B0 b02 = (B0) this.f96963b.getValue();
            InterfaceC5431s interfaceC5431s = b02 instanceof InterfaceC5431s ? (InterfaceC5431s) b02 : null;
            return interfaceC5431s != null ? interfaceC5431s.getDefaultViewModelCreationExtras() : AbstractC6409a.C0988a.f62496b;
        }
    }

    public TestingFeaturesV1EditFragment() {
        B50.e eVar = new B50.e(this, 1);
        InterfaceC4008j a11 = k.a(n.NONE, new e(new d()));
        this.f96939c = b0.b(this, kotlin.jvm.internal.N.b(G90.a.class), new f(a11), new g(a11), eVar);
        this.f96940d = new a();
    }

    public static Unit t(TestingFeaturesV1EditFragment testingFeaturesV1EditFragment) {
        testingFeaturesV1EditFragment.y().i0();
        return Unit.f71690a;
    }

    public static Unit u(TestingFeaturesV1EditFragment testingFeaturesV1EditFragment) {
        testingFeaturesV1EditFragment.y().g0();
        return Unit.f71690a;
    }

    public static Unit v(TestingFeaturesV1EditFragment testingFeaturesV1EditFragment) {
        G90.a y11 = testingFeaturesV1EditFragment.y();
        h hVar = testingFeaturesV1EditFragment.f96937a;
        y11.j0(String.valueOf(hVar != null ? hVar.f102664g.getText() : null));
        return Unit.f71690a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final G90.a y() {
        return (G90.a) this.f96939c.getValue();
    }

    @Override // androidx.fragment.app.ComponentCallbacksC5392m
    public final void onAttach(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        super.onAttach(context);
        r requireActivity = requireActivity();
        Intrinsics.checkNotNullExpressionValue(requireActivity, "requireActivity(...)");
        ((w90.b) O30.a.a(O30.c.a(requireActivity)).a(w90.b.class)).o0(this);
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
        h b11 = h.b(inflater, viewGroup);
        this.f96937a = b11;
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
        onBackPressedDispatcher.h(viewLifecycleOwner, this.f96940d);
        OzonSpannableString ozonSpannableString = OzonSpannableStringKt.toOzonSpannableString("Сбросить");
        UniColors uniColors = UniColors.BLUE_500;
        FinToolbarState finToolbarState = new FinToolbarState("Фичи фронта V1", null, new TextAtom(OzonSpannableStringKt.toOzonSpannableString("Сохранить"), null, uniColors.getToken(), null, null, null, null, 122, null), new B50.f(this, 1), new TextAtom(ozonSpannableString, null, uniColors.getToken(), null, null, null, null, 122, null), new B50.g(this, 2), null, null, null, Integer.valueOf(R.drawable.ic_m_disclosure_back_filled), "graphicTertiary", new C2620w(this, 1), null, null, null, null, 17, 61890, null);
        h hVar = this.f96937a;
        if (hVar != null) {
            hVar.f102667j.bindState(finToolbarState);
        }
        x0<G90.c> f02 = y().f0();
        J viewLifecycleOwner2 = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner2, "getViewLifecycleOwner(...)");
        C10727i.c(K.a(viewLifecycleOwner2), null, null, new b(f02, null, this), 3);
        C0 e02 = y().e0();
        J viewLifecycleOwner3 = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner3, "getViewLifecycleOwner(...)");
        C10727i.c(K.a(viewLifecycleOwner3), null, null, new c(e02, null, this), 3);
    }
}
