package ru.ozon.fintech.features.onboarding.presentation;

import Ae.InterfaceC2395h;
import Ae.InterfaceC2397i;
import Ae.x0;
import C.D;
import Sc.InterfaceC4008j;
import Sc.k;
import Sc.n;
import Sc.s;
import android.content.Context;
import android.graphics.Outline;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewOutlineProvider;
import android.widget.FrameLayout;
import androidx.activity.C;
import androidx.appcompat.widget.AppCompatTextView;
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
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import f3.AbstractC6409a;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.j;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.fintech.features.onboarding.ui.DisclosureItemView;
import ru.ozon.fintech.ui.button.large.FinLargeButtonState;
import u70.C9980b;
import v70.InterfaceC10268b;
import w70.C10445a;
import xe.C10727i;
import xe.M;
import xe.N;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\u0018\u00002\u00020\u00012\u00020\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lru/ozon/fintech/features/onboarding/presentation/DisclosureFragment;", "LE30/c;", "", "<init>", "()V", "onboarding_prodRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class DisclosureFragment extends E30.c {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final y0 f95805a;

    /* renamed from: b, reason: collision with root package name */
    private C9980b f95806b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final String f95807c;

    /* renamed from: d, reason: collision with root package name */
    @NotNull
    private a f95808d;

    public static final class a extends C {
        a() {
            super(true);
        }

        @Override // androidx.activity.C
        public final void handleOnBackPressed() {
            r activity = DisclosureFragment.this.getActivity();
            if (activity != null) {
                activity.finish();
            }
        }
    }

    @kotlin.coroutines.jvm.internal.e(c = "ru.ozon.fintech.features.onboarding.presentation.DisclosureFragment$onViewCreated$$inlined$observe$1", f = "DisclosureFragment.kt", l = {33}, m = "invokeSuspend")
    public static final class b extends j implements Function2<M, kotlin.coroutines.d<? super Unit>, Object> {

        /* renamed from: d, reason: collision with root package name */
        int f95810d;

        /* renamed from: e, reason: collision with root package name */
        private /* synthetic */ Object f95811e;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ InterfaceC2395h f95813g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ DisclosureFragment f95814h;

        @kotlin.coroutines.jvm.internal.e(c = "ru.ozon.fintech.features.onboarding.presentation.DisclosureFragment$onViewCreated$$inlined$observe$1$1", f = "DisclosureFragment.kt", l = {34}, m = "invokeSuspend")
        public static final class a extends j implements Function2<M, kotlin.coroutines.d<? super Unit>, Object> {

            /* renamed from: d, reason: collision with root package name */
            int f95815d;

            /* renamed from: e, reason: collision with root package name */
            final /* synthetic */ InterfaceC2395h f95816e;

            /* renamed from: f, reason: collision with root package name */
            final /* synthetic */ DisclosureFragment f95817f;

            /* renamed from: ru.ozon.fintech.features.onboarding.presentation.DisclosureFragment$b$a$a, reason: collision with other inner class name */
            public static final class C2045a<T> implements InterfaceC2397i {

                /* renamed from: a, reason: collision with root package name */
                final /* synthetic */ DisclosureFragment f95818a;

                public C2045a(DisclosureFragment disclosureFragment) {
                    this.f95818a = disclosureFragment;
                }

                /* JADX WARN: Multi-variable type inference failed */
                @Override // Ae.InterfaceC2397i
                public final Object emit(T t2, kotlin.coroutines.d<? super Unit> dVar) {
                    C9980b c9980b;
                    Pair pair = (Pair) t2;
                    if (pair != null && (c9980b = this.f95818a.f95806b) != null) {
                        c9980b.f100355c.bindState((FinLargeButtonState) pair.e());
                        c9980b.f100354b.bindState((FinLargeButtonState) pair.f());
                    }
                    return Unit.f71690a;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(InterfaceC2395h interfaceC2395h, kotlin.coroutines.d dVar, DisclosureFragment disclosureFragment) {
                super(2, dVar);
                this.f95816e = interfaceC2395h;
                this.f95817f = disclosureFragment;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
                return new a(this.f95816e, dVar, this.f95817f);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(M m11, kotlin.coroutines.d<? super Unit> dVar) {
                return ((a) create(m11, dVar)).invokeSuspend(Unit.f71690a);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
                int i11 = this.f95815d;
                if (i11 == 0) {
                    s.b(obj);
                    C2045a c2045a = new C2045a(this.f95817f);
                    this.f95815d = 1;
                    if (this.f95816e.collect(c2045a, this) == aVar) {
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
        public b(InterfaceC2395h interfaceC2395h, kotlin.coroutines.d dVar, DisclosureFragment disclosureFragment) {
            super(2, dVar);
            this.f95813g = interfaceC2395h;
            this.f95814h = disclosureFragment;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            b bVar = DisclosureFragment.this.new b(this.f95813g, dVar, this.f95814h);
            bVar.f95811e = obj;
            return bVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(M m11, kotlin.coroutines.d<? super Unit> dVar) {
            return ((b) create(m11, dVar)).invokeSuspend(Unit.f71690a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
            int i11 = this.f95810d;
            if (i11 == 0) {
                s.b(obj);
                if (N.f((M) this.f95811e)) {
                    J viewLifecycleOwner = DisclosureFragment.this.getViewLifecycleOwner();
                    Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "getViewLifecycleOwner(...)");
                    AbstractC5434v.b bVar = AbstractC5434v.b.STARTED;
                    a aVar2 = new a(this.f95813g, null, this.f95814h);
                    this.f95810d = 1;
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

    @kotlin.coroutines.jvm.internal.e(c = "ru.ozon.fintech.features.onboarding.presentation.DisclosureFragment$onViewCreated$$inlined$observe$2", f = "DisclosureFragment.kt", l = {33}, m = "invokeSuspend")
    public static final class c extends j implements Function2<M, kotlin.coroutines.d<? super Unit>, Object> {

        /* renamed from: d, reason: collision with root package name */
        int f95819d;

        /* renamed from: e, reason: collision with root package name */
        private /* synthetic */ Object f95820e;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ InterfaceC2395h f95822g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ DisclosureFragment f95823h;

        @kotlin.coroutines.jvm.internal.e(c = "ru.ozon.fintech.features.onboarding.presentation.DisclosureFragment$onViewCreated$$inlined$observe$2$1", f = "DisclosureFragment.kt", l = {34}, m = "invokeSuspend")
        public static final class a extends j implements Function2<M, kotlin.coroutines.d<? super Unit>, Object> {

            /* renamed from: d, reason: collision with root package name */
            int f95824d;

            /* renamed from: e, reason: collision with root package name */
            final /* synthetic */ InterfaceC2395h f95825e;

            /* renamed from: f, reason: collision with root package name */
            final /* synthetic */ DisclosureFragment f95826f;

            /* renamed from: ru.ozon.fintech.features.onboarding.presentation.DisclosureFragment$c$a$a, reason: collision with other inner class name */
            public static final class C2046a<T> implements InterfaceC2397i {

                /* renamed from: a, reason: collision with root package name */
                final /* synthetic */ DisclosureFragment f95827a;

                public C2046a(DisclosureFragment disclosureFragment) {
                    this.f95827a = disclosureFragment;
                }

                /* JADX WARN: Multi-variable type inference failed */
                @Override // Ae.InterfaceC2397i
                public final Object emit(T t2, kotlin.coroutines.d<? super Unit> dVar) {
                    C9980b c9980b;
                    C10445a c10445a = (C10445a) t2;
                    if (c10445a != null && (c9980b = this.f95827a.f95806b) != null) {
                        Integer c11 = c10445a.c();
                        if (c11 != null) {
                            c9980b.f100356d.setImageResource(c11.intValue());
                        }
                        String b11 = c10445a.b();
                        AppCompatTextView appCompatTextView = c9980b.f100359g;
                        appCompatTextView.setText(b11);
                        appCompatTextView.setGravity(c10445a.f());
                        String a11 = c10445a.a();
                        AppCompatTextView appCompatTextView2 = c9980b.f100358f;
                        appCompatTextView2.setText(a11);
                        appCompatTextView2.setGravity(c10445a.e());
                        RecyclerView recycler = c9980b.f100357e;
                        Intrinsics.checkNotNullExpressionValue(recycler, "recycler");
                        com.detmir.recycli.adapters.d.a(recycler, c10445a.d());
                    }
                    return Unit.f71690a;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(InterfaceC2395h interfaceC2395h, kotlin.coroutines.d dVar, DisclosureFragment disclosureFragment) {
                super(2, dVar);
                this.f95825e = interfaceC2395h;
                this.f95826f = disclosureFragment;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
                return new a(this.f95825e, dVar, this.f95826f);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(M m11, kotlin.coroutines.d<? super Unit> dVar) {
                return ((a) create(m11, dVar)).invokeSuspend(Unit.f71690a);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
                int i11 = this.f95824d;
                if (i11 == 0) {
                    s.b(obj);
                    C2046a c2046a = new C2046a(this.f95826f);
                    this.f95824d = 1;
                    if (this.f95825e.collect(c2046a, this) == aVar) {
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
        public c(InterfaceC2395h interfaceC2395h, kotlin.coroutines.d dVar, DisclosureFragment disclosureFragment) {
            super(2, dVar);
            this.f95822g = interfaceC2395h;
            this.f95823h = disclosureFragment;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            c cVar = DisclosureFragment.this.new c(this.f95822g, dVar, this.f95823h);
            cVar.f95820e = obj;
            return cVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(M m11, kotlin.coroutines.d<? super Unit> dVar) {
            return ((c) create(m11, dVar)).invokeSuspend(Unit.f71690a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
            int i11 = this.f95819d;
            if (i11 == 0) {
                s.b(obj);
                if (N.f((M) this.f95820e)) {
                    J viewLifecycleOwner = DisclosureFragment.this.getViewLifecycleOwner();
                    Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "getViewLifecycleOwner(...)");
                    AbstractC5434v.b bVar = AbstractC5434v.b.STARTED;
                    a aVar2 = new a(this.f95822g, null, this.f95823h);
                    this.f95819d = 1;
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

    public static final class d extends ViewOutlineProvider {
        @Override // android.view.ViewOutlineProvider
        public final void getOutline(View view, Outline outline) {
            if (outline != null) {
                if ((view != null ? Integer.valueOf(view.getWidth()) : null) != null) {
                    outline.setRoundRect(0, 0, view.getWidth(), view.getHeight(), D.c(16.0f));
                }
            }
        }
    }

    public static final class e extends AbstractC7737t implements Function0<ComponentCallbacksC5392m> {
        public e() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final ComponentCallbacksC5392m invoke() {
            return DisclosureFragment.this;
        }
    }

    public static final class f extends AbstractC7737t implements Function0<B0> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ e f95829b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(e eVar) {
            super(0);
            this.f95829b = eVar;
        }

        @Override // kotlin.jvm.functions.Function0
        public final B0 invoke() {
            return (B0) this.f95829b.invoke();
        }
    }

    public static final class g extends AbstractC7737t implements Function0<A0> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ Object f95830b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(InterfaceC4008j interfaceC4008j) {
            super(0);
            this.f95830b = interfaceC4008j;
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [Sc.j, java.lang.Object] */
        @Override // kotlin.jvm.functions.Function0
        public final A0 invoke() {
            return ((B0) this.f95830b.getValue()).getViewModelStore();
        }
    }

    public static final class h extends AbstractC7737t implements Function0<AbstractC6409a> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ Object f95831b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public h(InterfaceC4008j interfaceC4008j) {
            super(0);
            this.f95831b = interfaceC4008j;
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [Sc.j, java.lang.Object] */
        @Override // kotlin.jvm.functions.Function0
        public final AbstractC6409a invoke() {
            B0 b02 = (B0) this.f95831b.getValue();
            InterfaceC5431s interfaceC5431s = b02 instanceof InterfaceC5431s ? (InterfaceC5431s) b02 : null;
            return interfaceC5431s != null ? interfaceC5431s.getDefaultViewModelCreationExtras() : AbstractC6409a.C0988a.f62496b;
        }
    }

    public DisclosureFragment() {
        Ca.h hVar = new Ca.h(this, 6);
        InterfaceC4008j a11 = k.a(n.NONE, new f(new e()));
        this.f95805a = b0.b(this, kotlin.jvm.internal.N.b(y70.c.class), new g(a11), new h(a11), hVar);
        this.f95807c = "DisclosureFragment";
        this.f95808d = new a();
    }

    @Override // E30.c
    @NotNull
    /* renamed from: getFragmentName, reason: from getter */
    public final String getF96657c() {
        return this.f95807c;
    }

    @Override // androidx.fragment.app.ComponentCallbacksC5392m
    public final void onAttach(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        r requireActivity = requireActivity();
        Intrinsics.checkNotNullExpressionValue(requireActivity, "requireActivity(...)");
        ((InterfaceC10268b) O30.a.a(O30.c.a(requireActivity)).a(InterfaceC10268b.class)).P0(this);
        super.onAttach(context);
    }

    @Override // E30.c, androidx.fragment.app.ComponentCallbacksC5392m
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        ((y70.c) this.f95805a.getValue()).g0();
    }

    @Override // androidx.fragment.app.ComponentCallbacksC5392m
    @NotNull
    public final View onCreateView(@NotNull LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        Intrinsics.checkNotNullParameter(inflater, "inflater");
        C9980b b11 = C9980b.b(inflater, viewGroup);
        this.f95806b = b11;
        FrameLayout a11 = b11.a();
        Intrinsics.checkNotNullExpressionValue(a11, "getRoot(...)");
        return a11;
    }

    @Override // androidx.fragment.app.ComponentCallbacksC5392m
    public final void onDestroyView() {
        super.onDestroyView();
        this.f95806b = null;
    }

    @Override // E30.c, androidx.fragment.app.ComponentCallbacksC5392m
    public final void onViewCreated(@NotNull View view, Bundle bundle) {
        RecyclerView.n nVar;
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, bundle);
        androidx.activity.J onBackPressedDispatcher = requireActivity().getOnBackPressedDispatcher();
        J viewLifecycleOwner = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "getViewLifecycleOwner(...)");
        onBackPressedDispatcher.h(viewLifecycleOwner, this.f95808d);
        C9980b c9980b = this.f95806b;
        if (c9980b != null) {
            RecyclerView recyclerView = c9980b.f100357e;
            recyclerView.setLayoutManager(new LinearLayoutManager(recyclerView.getContext()));
            H30.r.a(recyclerView);
            DisclosureItemView.INSTANCE.getClass();
            nVar = DisclosureItemView.decoration;
            recyclerView.addItemDecoration(nVar);
        }
        y0 y0Var = this.f95805a;
        y70.c cVar = (y70.c) y0Var.getValue();
        androidx.activity.M activity = getActivity();
        cVar.getClass();
        if (activity instanceof I30.a) {
            ((I30.a) activity).a(true);
        }
        C9980b c9980b2 = this.f95806b;
        if (c9980b2 != null) {
            c9980b2.f100356d.setClipToOutline(true);
        }
        C9980b c9980b3 = this.f95806b;
        if (c9980b3 != null) {
            c9980b3.f100356d.setOutlineProvider(new d());
        }
        x0<Pair<FinLargeButtonState, FinLargeButtonState>> e02 = ((y70.c) y0Var.getValue()).e0();
        J viewLifecycleOwner2 = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner2, "getViewLifecycleOwner(...)");
        C10727i.c(K.a(viewLifecycleOwner2), null, null, new b(e02, null, this), 3);
        x0<C10445a> f02 = ((y70.c) y0Var.getValue()).f0();
        J viewLifecycleOwner3 = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner3, "getViewLifecycleOwner(...)");
        C10727i.c(K.a(viewLifecycleOwner3), null, null, new c(f02, null, this), 3);
    }
}
