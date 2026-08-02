package ru.ozon.fintech.features.pinpad.presentation.pinpad;

import Ae.InterfaceC2395h;
import Ae.InterfaceC2397i;
import Al.ViewOnClickListenerC2437a;
import Ey.ViewOnClickListenerC2975b;
import Ez.ViewOnClickListenerC2978b;
import Gw.ViewOnClickListenerC3131a;
import H30.z;
import P70.h;
import Sc.InterfaceC4008j;
import Sc.k;
import Sc.n;
import Sc.o;
import Sc.s;
import android.R;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
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
import androidx.lifecycle.x0;
import androidx.lifecycle.y0;
import f3.AbstractC6409a;
import h3.C6788a;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.j;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.fintech.features.pinpad.presentation.pinpad.pinbutton.PinButtonView;
import xe.C10720e0;
import xe.C10727i;
import xe.M;
import xe.N;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lru/ozon/fintech/features/pinpad/presentation/pinpad/PinPadFragment;", "LE30/c;", "<init>", "()V", "pinpad_prodRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class PinPadFragment extends E30.c {

    /* renamed from: a, reason: collision with root package name */
    private M70.c f96109a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final y0 f96110b;

    /* renamed from: c, reason: collision with root package name */
    private int f96111c;

    /* renamed from: d, reason: collision with root package name */
    @NotNull
    private final String f96112d;

    /* renamed from: e, reason: collision with root package name */
    @NotNull
    private a f96113e;

    public static final class a extends C {
        a() {
            super(true);
        }

        @Override // androidx.activity.C
        public final void handleOnBackPressed() {
            PinPadFragment.this.P().onBackPressed();
        }
    }

    @kotlin.coroutines.jvm.internal.e(c = "ru.ozon.fintech.features.pinpad.presentation.pinpad.PinPadFragment$onViewCreated$$inlined$observe$1", f = "PinPadFragment.kt", l = {33}, m = "invokeSuspend")
    public static final class b extends j implements Function2<M, kotlin.coroutines.d<? super Unit>, Object> {

        /* renamed from: d, reason: collision with root package name */
        int f96115d;

        /* renamed from: e, reason: collision with root package name */
        private /* synthetic */ Object f96116e;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ InterfaceC2395h f96118g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ PinPadFragment f96119h;

        @kotlin.coroutines.jvm.internal.e(c = "ru.ozon.fintech.features.pinpad.presentation.pinpad.PinPadFragment$onViewCreated$$inlined$observe$1$1", f = "PinPadFragment.kt", l = {34}, m = "invokeSuspend")
        public static final class a extends j implements Function2<M, kotlin.coroutines.d<? super Unit>, Object> {

            /* renamed from: d, reason: collision with root package name */
            int f96120d;

            /* renamed from: e, reason: collision with root package name */
            final /* synthetic */ InterfaceC2395h f96121e;

            /* renamed from: f, reason: collision with root package name */
            final /* synthetic */ PinPadFragment f96122f;

            /* renamed from: ru.ozon.fintech.features.pinpad.presentation.pinpad.PinPadFragment$b$a$a, reason: collision with other inner class name */
            public static final class C2068a<T> implements InterfaceC2397i {

                /* renamed from: a, reason: collision with root package name */
                final /* synthetic */ PinPadFragment f96123a;

                public C2068a(PinPadFragment pinPadFragment) {
                    this.f96123a = pinPadFragment;
                }

                @Override // Ae.InterfaceC2397i
                public final Object emit(T t2, kotlin.coroutines.d<? super Unit> dVar) {
                    Q70.d dVar2 = (Q70.d) t2;
                    boolean z11 = dVar2 instanceof Q70.c;
                    PinPadFragment pinPadFragment = this.f96123a;
                    if (z11) {
                        PinPadFragment.O(pinPadFragment, (Q70.c) dVar2);
                    } else if (Intrinsics.d(dVar2, Q70.a.f23013a)) {
                        PinPadFragment.M(pinPadFragment);
                    } else if (Intrinsics.d(dVar2, Q70.b.f23014a)) {
                        PinPadFragment.N(pinPadFragment);
                    } else if (dVar2 != null) {
                        throw new o();
                    }
                    return Unit.f71690a;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(InterfaceC2395h interfaceC2395h, kotlin.coroutines.d dVar, PinPadFragment pinPadFragment) {
                super(2, dVar);
                this.f96121e = interfaceC2395h;
                this.f96122f = pinPadFragment;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
                return new a(this.f96121e, dVar, this.f96122f);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(M m11, kotlin.coroutines.d<? super Unit> dVar) {
                return ((a) create(m11, dVar)).invokeSuspend(Unit.f71690a);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
                int i11 = this.f96120d;
                if (i11 == 0) {
                    s.b(obj);
                    C2068a c2068a = new C2068a(this.f96122f);
                    this.f96120d = 1;
                    if (this.f96121e.collect(c2068a, this) == aVar) {
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
        public b(InterfaceC2395h interfaceC2395h, kotlin.coroutines.d dVar, PinPadFragment pinPadFragment) {
            super(2, dVar);
            this.f96118g = interfaceC2395h;
            this.f96119h = pinPadFragment;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            b bVar = PinPadFragment.this.new b(this.f96118g, dVar, this.f96119h);
            bVar.f96116e = obj;
            return bVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(M m11, kotlin.coroutines.d<? super Unit> dVar) {
            return ((b) create(m11, dVar)).invokeSuspend(Unit.f71690a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
            int i11 = this.f96115d;
            if (i11 == 0) {
                s.b(obj);
                if (N.f((M) this.f96116e)) {
                    J viewLifecycleOwner = PinPadFragment.this.getViewLifecycleOwner();
                    Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "getViewLifecycleOwner(...)");
                    AbstractC5434v.b bVar = AbstractC5434v.b.STARTED;
                    a aVar2 = new a(this.f96118g, null, this.f96119h);
                    this.f96115d = 1;
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
            return PinPadFragment.this;
        }
    }

    public static final class d extends AbstractC7737t implements Function0<B0> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ c f96125b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(c cVar) {
            super(0);
            this.f96125b = cVar;
        }

        @Override // kotlin.jvm.functions.Function0
        public final B0 invoke() {
            return (B0) this.f96125b.invoke();
        }
    }

    public static final class e extends AbstractC7737t implements Function0<A0> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ Object f96126b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(InterfaceC4008j interfaceC4008j) {
            super(0);
            this.f96126b = interfaceC4008j;
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [Sc.j, java.lang.Object] */
        @Override // kotlin.jvm.functions.Function0
        public final A0 invoke() {
            return ((B0) this.f96126b.getValue()).getViewModelStore();
        }
    }

    public static final class f extends AbstractC7737t implements Function0<AbstractC6409a> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ Object f96127b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(InterfaceC4008j interfaceC4008j) {
            super(0);
            this.f96127b = interfaceC4008j;
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [Sc.j, java.lang.Object] */
        @Override // kotlin.jvm.functions.Function0
        public final AbstractC6409a invoke() {
            B0 b02 = (B0) this.f96127b.getValue();
            InterfaceC5431s interfaceC5431s = b02 instanceof InterfaceC5431s ? (InterfaceC5431s) b02 : null;
            return interfaceC5431s != null ? interfaceC5431s.getDefaultViewModelCreationExtras() : AbstractC6409a.C0988a.f62496b;
        }
    }

    public PinPadFragment() {
        P70.a aVar = new P70.a(this, 0);
        InterfaceC4008j a11 = k.a(n.NONE, new d(new c()));
        this.f96110b = b0.b(this, kotlin.jvm.internal.N.b(h.class), new e(a11), new f(a11), aVar);
        this.f96112d = "PinPadFragment";
        this.f96113e = new a();
    }

    public static void A(PinPadFragment pinPadFragment) {
        pinPadFragment.P().K0();
    }

    public static void B(PinPadFragment pinPadFragment) {
        pinPadFragment.P().L0(3);
    }

    public static void C(PinPadFragment pinPadFragment) {
        pinPadFragment.P().M0();
    }

    public static void D(PinPadFragment pinPadFragment) {
        pinPadFragment.P().K0();
    }

    public static void E(PinPadFragment pinPadFragment) {
        pinPadFragment.P().z0();
    }

    public static void F(PinPadFragment pinPadFragment) {
        pinPadFragment.P().L0(9);
    }

    public static void G(PinPadFragment pinPadFragment) {
        h P11 = pinPadFragment.P();
        P11.getClass();
        C6788a a11 = x0.a(P11);
        C10720e0 c10720e0 = C10720e0.f105451a;
        C10727i.c(a11, He.b.f10879b, null, new ru.ozon.fintech.features.pinpad.presentation.pinpad.a(P11, null), 2);
    }

    public static void H(PinPadFragment pinPadFragment) {
        pinPadFragment.P().L0(4);
    }

    public static void I(PinPadFragment pinPadFragment) {
        pinPadFragment.P().L0(0);
    }

    public static void J(PinPadFragment pinPadFragment) {
        pinPadFragment.P().A0();
    }

    public static void K(PinPadFragment pinPadFragment) {
        pinPadFragment.P().L0(8);
    }

    public static final void M(PinPadFragment pinPadFragment) {
        M70.c cVar = pinPadFragment.f96109a;
        if (cVar != null) {
            M70.a aVar = cVar.f17554b;
            ConstraintLayout dboRestrictedContainer = aVar.f17548c;
            Intrinsics.checkNotNullExpressionValue(dboRestrictedContainer, "dboRestrictedContainer");
            z.b(pinPadFragment.f96111c, dboRestrictedContainer);
            aVar.f17547b.setOnClickListener(new Ck.a(pinPadFragment, 4));
        }
    }

    public static final void N(PinPadFragment pinPadFragment) {
        M70.c cVar = pinPadFragment.f96109a;
        if (cVar != null) {
            M70.b bVar = cVar.f17555c;
            ConstraintLayout emptyBankPhoneContainer = bVar.f17551c;
            Intrinsics.checkNotNullExpressionValue(emptyBankPhoneContainer, "emptyBankPhoneContainer");
            z.b(pinPadFragment.f96111c, emptyBankPhoneContainer);
            ImageView icClose = bVar.f17552d;
            Intrinsics.checkNotNullExpressionValue(icClose, "icClose");
            icClose.setVisibility(!pinPadFragment.P().H0() ? 0 : 8);
            icClose.setOnClickListener(new Nt.a(pinPadFragment, 2));
            bVar.f17550b.setOnClickListener(new ViewOnClickListenerC2978b(pinPadFragment, 4));
        }
    }

    public static final void O(PinPadFragment pinPadFragment, Q70.c cVar) {
        M70.c cVar2 = pinPadFragment.f96109a;
        if (cVar2 != null) {
            cVar2.f17554b.f17548c.setVisibility(8);
        }
        M70.c cVar3 = pinPadFragment.f96109a;
        if (cVar3 != null) {
            cVar3.f17555c.f17551c.setVisibility(8);
        }
        M70.c cVar4 = pinPadFragment.f96109a;
        if (cVar4 != null) {
            M70.d dVar = cVar4.f17556d;
            dVar.f17561e.setOnClickListener(new Ar.b(pinPadFragment, 3));
            dVar.f17562f.setOnClickListener(new FG.a(pinPadFragment, 6));
            dVar.f17563g.setOnClickListener(new BC.a(pinPadFragment, 2));
            dVar.f17564h.setOnClickListener(new ViewOnClickListenerC2437a(pinPadFragment, 2));
            dVar.f17565i.setOnClickListener(new ViewOnClickListenerC3131a(pinPadFragment, 2));
            dVar.f17566j.setOnClickListener(new Am.b(pinPadFragment, 4));
            dVar.f17567k.setOnClickListener(new FK.a(pinPadFragment, 4));
            dVar.f17568l.setOnClickListener(new AS.a(pinPadFragment, 5));
            dVar.f17569m.setOnClickListener(new ViewOnClickListenerC2975b(pinPadFragment, 2));
            dVar.f17570n.setOnClickListener(new AU.a(pinPadFragment, 3));
            Ar.c cVar5 = new Ar.c(pinPadFragment, 3);
            PinButtonView keyBack = dVar.f17571o;
            keyBack.setOnClickListener(cVar5);
            Ar.d dVar2 = new Ar.d(pinPadFragment, 3);
            PinButtonView keyBio = dVar.f17572p;
            keyBio.setOnClickListener(dVar2);
            DN.a aVar = new DN.a(pinPadFragment, 3);
            TextView keyLogout = dVar.f17573q;
            keyLogout.setOnClickListener(aVar);
            dVar.f17560d.setOnClickListener(new DN.b(pinPadFragment, 4));
            if (!cVar.d()) {
                if (pinPadFragment.getResources().getConfiguration().smallestScreenWidthDp >= 321) {
                    M70.c cVar6 = pinPadFragment.f96109a;
                    if (cVar6 != null) {
                        cVar6.f17556d.f17574r.setVisibility(0);
                    }
                    M70.c cVar7 = pinPadFragment.f96109a;
                    if (cVar7 != null) {
                        cVar7.f17556d.f17575s.setVisibility(8);
                    }
                } else {
                    M70.c cVar8 = pinPadFragment.f96109a;
                    if (cVar8 != null) {
                        cVar8.f17556d.f17574r.setVisibility(8);
                    }
                    M70.c cVar9 = pinPadFragment.f96109a;
                    if (cVar9 != null) {
                        cVar9.f17556d.f17575s.setVisibility(0);
                    }
                }
            }
            FM.a aVar2 = new FM.a(pinPadFragment, 2);
            ImageView close = dVar.f17558b;
            close.setOnClickListener(aVar2);
            Intrinsics.checkNotNullExpressionValue(close, "close");
            close.setVisibility(cVar.e() ? 0 : 8);
            Intrinsics.checkNotNullExpressionValue(keyBio, "keyBio");
            keyBio.setVisibility(!cVar.b() ? 4 : 0);
            Intrinsics.checkNotNullExpressionValue(keyBack, "keyBack");
            keyBack.setVisibility(!cVar.a() ? 4 : 0);
            Intrinsics.checkNotNullExpressionValue(keyLogout, "keyLogout");
            keyLogout.setVisibility(cVar.f() ? 0 : 4);
            E30.j h11 = cVar.h();
            TextView title = dVar.f17579w;
            if (h11 != null) {
                Intrinsics.checkNotNullExpressionValue(title, "title");
                title.setVisibility(0);
                E30.j h12 = cVar.h();
                Context requireContext = pinPadFragment.requireContext();
                Intrinsics.checkNotNullExpressionValue(requireContext, "requireContext(...)");
                title.setText(E30.k.a(h12, requireContext));
            } else {
                Intrinsics.checkNotNullExpressionValue(title, "title");
                title.setVisibility(8);
            }
            E30.j c11 = cVar.c();
            TextView textView = dVar.f17559c;
            if (c11 != null) {
                textView.setVisibility(0);
                E30.j c12 = cVar.c();
                Context requireContext2 = pinPadFragment.requireContext();
                Intrinsics.checkNotNullExpressionValue(requireContext2, "requireContext(...)");
                textView.setText(E30.k.a(c12, requireContext2));
            } else {
                textView.setVisibility(8);
            }
            dVar.f17578v.bindState(cVar.g());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final h P() {
        return (h) this.f96110b.getValue();
    }

    public static void t(PinPadFragment pinPadFragment) {
        pinPadFragment.P().L0(6);
    }

    public static void u(PinPadFragment pinPadFragment) {
        pinPadFragment.P().L0(1);
    }

    public static void v(PinPadFragment pinPadFragment) {
        pinPadFragment.P().L0(7);
    }

    public static void w(PinPadFragment pinPadFragment) {
        pinPadFragment.P().J0();
    }

    public static void x(PinPadFragment pinPadFragment) {
        pinPadFragment.P().I0();
    }

    public static void y(PinPadFragment pinPadFragment) {
        pinPadFragment.P().L0(2);
    }

    public static void z(PinPadFragment pinPadFragment) {
        pinPadFragment.P().L0(5);
    }

    @Override // E30.c
    @NotNull
    /* renamed from: getFragmentName, reason: from getter */
    public final String getF96112d() {
        return this.f96112d;
    }

    @Override // androidx.fragment.app.ComponentCallbacksC5392m
    public final void onAttach(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        L80.a.a("PINPADER_PERF", "PinPadFragment onAttach");
        r requireActivity = requireActivity();
        Intrinsics.checkNotNullExpressionValue(requireActivity, "requireActivity(...)");
        ((N70.b) O30.a.a(O30.c.a(requireActivity)).a(N70.b.class)).c0(this);
        super.onAttach(context);
        this.f96111c = getResources().getInteger(R.integer.config_shortAnimTime);
        L80.a.a("PINPADER_PERF", "PinPadFragment onAttach 2");
    }

    @Override // E30.c, androidx.fragment.app.ComponentCallbacksC5392m
    public final void onCreate(Bundle bundle) {
        L80.a.a("PINPADER_PERF", "PinPadFragment onCreate");
        super.onCreate(bundle);
        P().O0(getUniqueUuid());
    }

    @Override // androidx.fragment.app.ComponentCallbacksC5392m
    public final View onCreateView(@NotNull LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        Intrinsics.checkNotNullParameter(inflater, "inflater");
        L80.a.a("PINPADER_PERF", "PinPadFragment onCreateView");
        M70.c b11 = M70.c.b(inflater, viewGroup);
        this.f96109a = b11;
        return b11.a();
    }

    @Override // androidx.fragment.app.ComponentCallbacksC5392m
    public final void onDestroyView() {
        super.onDestroyView();
        this.f96109a = null;
        this.f96113e.remove();
    }

    @Override // androidx.fragment.app.ComponentCallbacksC5392m
    public final void onStart() {
        super.onStart();
        P().onStart();
    }

    @Override // E30.c, androidx.fragment.app.ComponentCallbacksC5392m
    public final void onViewCreated(@NotNull View view, Bundle bundle) {
        Intrinsics.checkNotNullParameter(view, "view");
        L80.a.a("PINPADER_PERF", "PinPadFragment onViewCreated");
        P().P0();
        androidx.activity.J onBackPressedDispatcher = requireActivity().getOnBackPressedDispatcher();
        J viewLifecycleOwner = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "getViewLifecycleOwner(...)");
        onBackPressedDispatcher.h(viewLifecycleOwner, this.f96113e);
        Ae.x0<Q70.d> D02 = P().D0();
        J viewLifecycleOwner2 = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner2, "getViewLifecycleOwner(...)");
        C10727i.c(K.a(viewLifecycleOwner2), null, null, new b(D02, null, this), 3);
        super.onViewCreated(view, bundle);
    }
}
