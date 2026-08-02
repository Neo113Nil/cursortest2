package qj0;

import Ae.C2399j;
import Ae.InterfaceC2395h;
import Ae.O0;
import Ae.x0;
import B0.N0;
import Bl0.C2652m;
import D1.InterfaceC2801g;
import P0.D;
import P0.W0;
import P0.p2;
import P0.u2;
import P0.v2;
import S0.A0;
import S0.C3969l;
import S0.C3991w0;
import S0.D1;
import S0.F1;
import S0.InterfaceC3967k;
import S0.InterfaceC3978p0;
import S0.J0;
import S0.Q;
import S0.n1;
import Sc.s;
import android.content.Context;
import androidx.compose.foundation.layout.C5179b;
import androidx.compose.foundation.layout.C5193p;
import androidx.compose.foundation.layout.C5194q;
import androidx.compose.foundation.layout.T;
import androidx.compose.foundation.layout.X;
import androidx.compose.foundation.layout.Y;
import androidx.compose.foundation.layout.a0;
import androidx.compose.ui.e;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import b1.C5503f;
import bj0.C5680b;
import cj0.c;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import e1.InterfaceC6250b;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import t0.p;
import t0.q;
import u0.C9891D;
import u0.E;
import xe.M;

/* renamed from: qj0.g, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C9077g {

    /* renamed from: qj0.g$a */
    static final class a extends AbstractC7737t implements Function1<c.a, Unit> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ InterfaceC9075e<?> f82226b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(InterfaceC9075e<?> interfaceC9075e) {
            super(1);
            this.f82226b = interfaceC9075e;
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(c.a aVar) {
            c.a TrackerBadge = aVar;
            Intrinsics.checkNotNullParameter(TrackerBadge, "$this$TrackerBadge");
            TrackerBadge.c(new C9076f(this.f82226b));
            return Unit.f71690a;
        }
    }

    /* renamed from: qj0.g$b */
    static final class b extends AbstractC7737t implements Function2<InterfaceC3967k, Integer, Unit> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ InterfaceC9075e<?> f82227b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ int f82228c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(InterfaceC9075e<?> interfaceC9075e, int i11) {
            super(2);
            this.f82227b = interfaceC9075e;
            this.f82228c = i11;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(InterfaceC3967k interfaceC3967k, Integer num) {
            num.intValue();
            int e11 = C2652m.e(this.f82228c | 1);
            C9077g.a(this.f82227b, interfaceC3967k, e11);
            return Unit.f71690a;
        }
    }

    @kotlin.coroutines.jvm.internal.e(c = "ru.ozon.tracker.debug.menu.shared.configuration.ui.component.TrackerDebugConfigurationKt$Input$1$1", f = "TrackerDebugConfiguration.kt", l = {96}, m = "invokeSuspend")
    /* renamed from: qj0.g$c */
    static final class c extends kotlin.coroutines.jvm.internal.j implements Function2<M, kotlin.coroutines.d<? super Unit>, Object> {

        /* renamed from: d, reason: collision with root package name */
        int f82229d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ InterfaceC3978p0<x0<String>> f82230e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ Function1<C9073c, Unit> f82231f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ C9073c f82232g;

        @kotlin.coroutines.jvm.internal.e(c = "ru.ozon.tracker.debug.menu.shared.configuration.ui.component.TrackerDebugConfigurationKt$Input$1$1$1", f = "TrackerDebugConfiguration.kt", l = {}, m = "invokeSuspend")
        /* renamed from: qj0.g$c$a */
        static final class a extends kotlin.coroutines.jvm.internal.j implements Function2<String, kotlin.coroutines.d<? super Unit>, Object> {

            /* renamed from: d, reason: collision with root package name */
            /* synthetic */ Object f82233d;

            /* renamed from: e, reason: collision with root package name */
            final /* synthetic */ Function1<C9073c, Unit> f82234e;

            /* renamed from: f, reason: collision with root package name */
            final /* synthetic */ C9073c f82235f;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            a(Function1<? super C9073c, Unit> function1, C9073c c9073c, kotlin.coroutines.d<? super a> dVar) {
                super(2, dVar);
                this.f82234e = function1;
                this.f82235f = c9073c;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
                a aVar = new a(this.f82234e, this.f82235f, dVar);
                aVar.f82233d = obj;
                return aVar;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(String str, kotlin.coroutines.d<? super Unit> dVar) {
                return ((a) create(str, dVar)).invokeSuspend(Unit.f71690a);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
                s.b(obj);
                this.f82234e.invoke(C9073c.b(this.f82235f, (String) this.f82233d));
                return Unit.f71690a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        c(InterfaceC3978p0<x0<String>> interfaceC3978p0, Function1<? super C9073c, Unit> function1, C9073c c9073c, kotlin.coroutines.d<? super c> dVar) {
            super(2, dVar);
            this.f82230e = interfaceC3978p0;
            this.f82231f = function1;
            this.f82232g = c9073c;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            return new c(this.f82230e, this.f82231f, this.f82232g, dVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(M m11, kotlin.coroutines.d<? super Unit> dVar) {
            return ((c) create(m11, dVar)).invokeSuspend(Unit.f71690a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
            int i11 = this.f82229d;
            if (i11 == 0) {
                s.b(obj);
                InterfaceC2395h l11 = C2399j.l(this.f82230e.getValue(), 200L);
                a aVar2 = new a(this.f82231f, this.f82232g, null);
                this.f82229d = 1;
                if (C2399j.h(l11, aVar2, this) == aVar) {
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

    /* renamed from: qj0.g$d */
    static final class d extends AbstractC7737t implements Function1<String, Unit> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ InterfaceC3978p0<String> f82236b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ InterfaceC3978p0<x0<String>> f82237c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(InterfaceC3978p0<String> interfaceC3978p0, InterfaceC3978p0<x0<String>> interfaceC3978p02) {
            super(1);
            this.f82236b = interfaceC3978p0;
            this.f82237c = interfaceC3978p02;
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(String str) {
            String value = str;
            Intrinsics.checkNotNullParameter(value, "value");
            InterfaceC3978p0<String> interfaceC3978p0 = this.f82236b;
            interfaceC3978p0.setValue(value);
            this.f82237c.getValue().tryEmit(interfaceC3978p0.getValue());
            return Unit.f71690a;
        }
    }

    /* renamed from: qj0.g$e */
    static final class e extends AbstractC7737t implements Function2<InterfaceC3967k, Integer, Unit> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ C9073c f82238b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        e(C9073c c9073c) {
            super(2);
            this.f82238b = c9073c;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(InterfaceC3967k interfaceC3967k, Integer num) {
            InterfaceC3967k interfaceC3967k2 = interfaceC3967k;
            if ((num.intValue() & 3) == 2 && interfaceC3967k2.b()) {
                interfaceC3967k2.j();
            } else {
                p2.b(this.f82238b.d(), null, 0L, 0L, 0L, null, 0L, 0, false, 0, 0, ((u2) interfaceC3967k2.m(v2.a())).k(), interfaceC3967k2, 0, 0, 65534);
            }
            return Unit.f71690a;
        }
    }

    /* renamed from: qj0.g$f */
    static final class f extends AbstractC7737t implements Function2<InterfaceC3967k, Integer, Unit> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ InterfaceC3978p0<String> f82239b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ Function1<C9073c, Unit> f82240c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ C9073c f82241d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ InterfaceC3978p0 f82242e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        f(InterfaceC3978p0 interfaceC3978p0, Function1 function1, C9073c c9073c, InterfaceC3978p0 interfaceC3978p02) {
            super(2);
            this.f82239b = interfaceC3978p0;
            this.f82240c = function1;
            this.f82241d = c9073c;
            this.f82242e = interfaceC3978p02;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(InterfaceC3967k interfaceC3967k, Integer num) {
            InterfaceC3967k interfaceC3967k2 = interfaceC3967k;
            if ((num.intValue() & 3) == 2 && interfaceC3967k2.b()) {
                interfaceC3967k2.j();
            } else {
                InterfaceC3978p0<String> interfaceC3978p0 = this.f82239b;
                if (interfaceC3978p0.getValue().length() > 0 && ((Boolean) this.f82242e.getValue()).booleanValue()) {
                    interfaceC3967k2.o(-1643854485);
                    boolean n11 = interfaceC3967k2.n(interfaceC3978p0);
                    Function1<C9073c, Unit> function1 = this.f82240c;
                    boolean n12 = n11 | interfaceC3967k2.n(function1);
                    C9073c c9073c = this.f82241d;
                    boolean n13 = n12 | interfaceC3967k2.n(c9073c);
                    Object C11 = interfaceC3967k2.C();
                    if (n13 || C11 == InterfaceC3967k.a.a()) {
                        C11 = new C9078h(function1, c9073c, interfaceC3978p0);
                        interfaceC3967k2.x(C11);
                    }
                    interfaceC3967k2.k();
                    D.a((Function0) C11, null, false, null, C9072b.f82209a, interfaceC3967k2, 196608, 30);
                }
            }
            return Unit.f71690a;
        }
    }

    /* renamed from: qj0.g$g, reason: collision with other inner class name */
    static final class C1397g extends AbstractC7737t implements Function2<InterfaceC3967k, Integer, Unit> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ C9073c f82243b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ Function1<C9073c, Unit> f82244c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ Function1<C9073c, Unit> f82245d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ int f82246e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        C1397g(C9073c c9073c, Function1<? super C9073c, Unit> function1, Function1<? super C9073c, Unit> function12, int i11) {
            super(2);
            this.f82243b = c9073c;
            this.f82244c = function1;
            this.f82245d = function12;
            this.f82246e = i11;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(InterfaceC3967k interfaceC3967k, Integer num) {
            num.intValue();
            int e11 = C2652m.e(this.f82246e | 1);
            Function1<C9073c, Unit> function1 = this.f82245d;
            C9077g.b(this.f82243b, this.f82244c, function1, interfaceC3967k, e11);
            return Unit.f71690a;
        }
    }

    /* renamed from: qj0.g$h */
    static final class h extends AbstractC7737t implements Function0<InterfaceC3978p0<String>> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ C9073c f82247b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        h(C9073c c9073c) {
            super(0);
            this.f82247b = c9073c;
        }

        @Override // kotlin.jvm.functions.Function0
        public final InterfaceC3978p0<String> invoke() {
            C3991w0 f7;
            f7 = n1.f(this.f82247b.c(), D1.f25195a);
            return f7;
        }
    }

    /* renamed from: qj0.g$i */
    static final class i extends AbstractC7737t implements Function1<Boolean, Unit> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ Function1<C9074d, Unit> f82248b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ C9074d f82249c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ InterfaceC3978p0<Boolean> f82250d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        i(InterfaceC3978p0 interfaceC3978p0, Function1 function1, C9074d c9074d) {
            super(1);
            this.f82248b = function1;
            this.f82249c = c9074d;
            this.f82250d = interfaceC3978p0;
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(Boolean bool) {
            Boolean bool2 = bool;
            bool2.getClass();
            InterfaceC3978p0<Boolean> interfaceC3978p0 = this.f82250d;
            interfaceC3978p0.setValue(bool2);
            this.f82248b.invoke(C9074d.b(this.f82249c, interfaceC3978p0.getValue().booleanValue()));
            return Unit.f71690a;
        }
    }

    /* renamed from: qj0.g$j */
    static final class j extends AbstractC7737t implements Function0<Unit> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ C9074d f82251b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ Function1<C9074d, Unit> f82252c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ InterfaceC3978p0<Boolean> f82253d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        j(InterfaceC3978p0 interfaceC3978p0, Function1 function1, C9074d c9074d) {
            super(0);
            this.f82251b = c9074d;
            this.f82252c = function1;
            this.f82253d = interfaceC3978p0;
        }

        @Override // kotlin.jvm.functions.Function0
        public final Unit invoke() {
            C9074d c9074d = this.f82251b;
            if (!c9074d.a()) {
                this.f82253d.setValue(Boolean.valueOf(!r1.getValue().booleanValue()));
            }
            this.f82252c.invoke(c9074d);
            return Unit.f71690a;
        }
    }

    /* renamed from: qj0.g$k */
    static final class k extends AbstractC7737t implements Function2<InterfaceC3967k, Integer, Unit> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ C9074d f82254b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ Function1<C9074d, Unit> f82255c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ Function1<C9074d, Unit> f82256d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ int f82257e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        k(C9074d c9074d, Function1<? super C9074d, Unit> function1, Function1<? super C9074d, Unit> function12, int i11) {
            super(2);
            this.f82254b = c9074d;
            this.f82255c = function1;
            this.f82256d = function12;
            this.f82257e = i11;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(InterfaceC3967k interfaceC3967k, Integer num) {
            num.intValue();
            int e11 = C2652m.e(this.f82257e | 1);
            Function1<C9074d, Unit> function1 = this.f82256d;
            C9077g.c(this.f82254b, this.f82255c, function1, interfaceC3967k, e11);
            return Unit.f71690a;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(InterfaceC9075e<?> interfaceC9075e, InterfaceC3967k interfaceC3967k, int i11) {
        int i12;
        C3969l u11 = interfaceC3967k.u(126201691);
        if ((i11 & 6) == 0) {
            i12 = ((i11 & 8) == 0 ? u11.n(interfaceC9075e) : u11.F(interfaceC9075e) ? 4 : 2) | i11;
        } else {
            i12 = i11;
        }
        if ((i12 & 3) == 2 && u11.b()) {
            u11.j();
        } else {
            androidx.compose.ui.e j11 = T.j(androidx.compose.ui.e.f40358c0, 0.0f, 4, 0.0f, 0.0f, 13);
            String str = interfaceC9075e.a() ? "System value" : "User value";
            u11.o(-2004550287);
            boolean z11 = (i12 & 14) == 4 || ((i12 & 8) != 0 && u11.F(interfaceC9075e));
            Object C11 = u11.C();
            if (z11 || C11 == InterfaceC3967k.a.a()) {
                C11 = new a(interfaceC9075e);
                u11.x(C11);
            }
            u11.k();
            cj0.b.a(str, j11, (Function1) C11, null, u11, 48, 8);
        }
        J0 m02 = u11.m0();
        if (m02 != null) {
            m02.G(new b(interfaceC9075e, i11));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final void b(C9073c c9073c, Function1<? super C9073c, Unit> function1, Function1<? super C9073c, Unit> function12, InterfaceC3967k interfaceC3967k, int i11) {
        int i12;
        C3969l u11 = interfaceC3967k.u(-405788161);
        if ((i11 & 6) == 0) {
            i12 = (u11.n(c9073c) ? 4 : 2) | i11;
        } else {
            i12 = i11;
        }
        if ((i11 & 48) == 0) {
            i12 |= u11.F(function1) ? 32 : 16;
        }
        if ((i11 & 384) == 0) {
            i12 |= u11.F(function12) ? 256 : UserVerificationMethods.USER_VERIFY_PATTERN;
        }
        if ((i12 & 147) == 146 && u11.b()) {
            u11.j();
        } else {
            u11.o(296587387);
            Object C11 = u11.C();
            if (C11 == InterfaceC3967k.a.a()) {
                C11 = n1.f(O0.a(c9073c.c()), D1.f25195a);
                u11.x(C11);
            }
            InterfaceC3978p0 interfaceC3978p0 = (InterfaceC3978p0) C11;
            u11.k();
            Unit unit = Unit.f71690a;
            u11.o(296590369);
            boolean z11 = (i12 & 112) == 32;
            int i13 = i12 & 14;
            boolean z12 = z11 | (i13 == 4);
            Object C12 = u11.C();
            if (z12 || C12 == InterfaceC3967k.a.a()) {
                C12 = new c(interfaceC3978p0, function1, c9073c, null);
                u11.x(C12);
            }
            u11.k();
            Q.e(u11, unit, (Function2) C12);
            Object[] objArr = new Object[0];
            u11.o(296596672);
            boolean z13 = i13 == 4;
            Object C13 = u11.C();
            if (z13 || C13 == InterfaceC3967k.a.a()) {
                C13 = new h(c9073c);
                u11.x(C13);
            }
            u11.k();
            InterfaceC3978p0 interfaceC3978p02 = (InterfaceC3978p0) C5503f.c(objArr, null, (Function0) C13, u11, 0, 6);
            u11.o(296598786);
            Object C14 = u11.C();
            if (C14 == InterfaceC3967k.a.a()) {
                C14 = p.a();
                u11.x(C14);
            }
            q qVar = (q) C14;
            u11.k();
            InterfaceC3978p0 a11 = t0.i.a(qVar, u11, 6);
            e.a aVar = androidx.compose.ui.e.f40358c0;
            C5194q a12 = C5193p.a(C5179b.g(), InterfaceC6250b.a.k(), u11, 0);
            int I11 = u11.I();
            A0 d11 = u11.d();
            androidx.compose.ui.e f7 = androidx.compose.ui.c.f(u11, aVar);
            Function0 a13 = Fr.g.a(InterfaceC2801g.f5440U, u11);
            if (u11.t()) {
                u11.H(a13);
            } else {
                u11.e();
            }
            Function2 g10 = K00.b.g(u11, a12, u11, d11);
            if (u11.t() || !Intrinsics.d(u11.C(), Integer.valueOf(I11))) {
                Ep.a.d(I11, u11, I11, g10);
            }
            F1.b(u11, f7, InterfaceC2801g.a.f());
            androidx.compose.ui.e e11 = a0.e(C5680b.a(6, u11, aVar, c9073c.e()), 1.0f);
            String str = (String) interfaceC3978p02.getValue();
            boolean K11 = kotlin.text.h.K((String) interfaceC3978p02.getValue());
            N0 n02 = new N0(0, 3, 123);
            u11.o(-636879789);
            boolean n11 = u11.n(interfaceC3978p02);
            Object C15 = u11.C();
            if (n11 || C15 == InterfaceC3967k.a.a()) {
                C15 = new d(interfaceC3978p02, interfaceC3978p0);
                u11.x(C15);
            }
            u11.k();
            W0.a(str, (Function1) C15, e11, false, null, a1.c.c(-191714161, new e(c9073c), u11), a1.c.c(-1631185940, new f(interfaceC3978p02, function12, c9073c, a11), u11), K11, null, n02, null, 0, 0, qVar, null, null, u11, 806879232, 196608, 6, 7298488);
            u11 = u11;
            a(c9073c, u11, i13);
            u11.f();
        }
        J0 m02 = u11.m0();
        if (m02 != null) {
            m02.G(new C1397g(c9073c, function1, function12, i11));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final void c(C9074d c9074d, Function1<? super C9074d, Unit> function1, Function1<? super C9074d, Unit> function12, InterfaceC3967k interfaceC3967k, int i11) {
        int i12;
        Function1<? super C9074d, Unit> function13 = function12;
        C3969l u11 = interfaceC3967k.u(-1967907012);
        if ((i11 & 6) == 0) {
            i12 = (u11.n(c9074d) ? 4 : 2) | i11;
        } else {
            i12 = i11;
        }
        if ((i11 & 48) == 0) {
            i12 |= u11.F(function1) ? 32 : 16;
        }
        if ((i11 & 384) == 0) {
            i12 |= u11.F(function13) ? 256 : UserVerificationMethods.USER_VERIFY_PATTERN;
        }
        if ((i12 & 147) == 146 && u11.b()) {
            u11.j();
        } else {
            e.a aVar = androidx.compose.ui.e.f40358c0;
            androidx.compose.ui.e e11 = a0.e(aVar, 1.0f);
            Y b11 = X.b(C5179b.d(), InterfaceC6250b.a.i(), u11, 54);
            int I11 = u11.I();
            A0 d11 = u11.d();
            androidx.compose.ui.e f7 = androidx.compose.ui.c.f(u11, e11);
            Function0 a11 = Fr.g.a(InterfaceC2801g.f5440U, u11);
            if (u11.t()) {
                u11.H(a11);
            } else {
                u11.e();
            }
            Function2 h11 = Cm.e.h(u11, b11, u11, d11);
            if (u11.t() || !Intrinsics.d(u11.C(), Integer.valueOf(I11))) {
                Ep.a.d(I11, u11, I11, h11);
            }
            F1.b(u11, f7, InterfaceC2801g.a.f());
            C9891D c9891d = C9891D.f99599a;
            androidx.compose.ui.e a12 = c9891d.a(aVar, 0.75f, true);
            C5194q a13 = C5193p.a(C5179b.g(), InterfaceC6250b.a.k(), u11, 0);
            int I12 = u11.I();
            A0 d12 = u11.d();
            androidx.compose.ui.e f11 = androidx.compose.ui.c.f(u11, a12);
            Function0 a14 = InterfaceC2801g.a.a();
            u11.i();
            if (u11.t()) {
                u11.H(a14);
            } else {
                u11.e();
            }
            Function2 g10 = K00.b.g(u11, a13, u11, d12);
            if (u11.t() || !Intrinsics.d(u11.C(), Integer.valueOf(I12))) {
                Ep.a.d(I12, u11, I12, g10);
            }
            F1.b(u11, f11, InterfaceC2801g.a.f());
            int i13 = i12;
            p2.b(c9074d.d(), null, 0L, 0L, 0L, null, 0L, 0, false, 0, 0, ((u2) u11.m(v2.a())).a(), u11, 0, 0, 65534);
            u11 = u11;
            int i14 = i13 & 14;
            a(c9074d, u11, i14);
            u11.f();
            androidx.compose.ui.e a15 = c9891d.a(aVar, 0.25f, true);
            Y b12 = X.b(C5179b.n(8), InterfaceC6250b.a.i(), u11, 54);
            int I13 = u11.I();
            A0 d13 = u11.d();
            androidx.compose.ui.e f12 = androidx.compose.ui.c.f(u11, a15);
            Function0 a16 = InterfaceC2801g.a.a();
            u11.i();
            if (u11.t()) {
                u11.H(a16);
            } else {
                u11.e();
            }
            Function2 h12 = Cm.e.h(u11, b12, u11, d13);
            if (u11.t() || !Intrinsics.d(u11.C(), Integer.valueOf(I13))) {
                Ep.a.d(I13, u11, I13, h12);
            }
            F1.b(u11, f12, InterfaceC2801g.a.f());
            u11.o(2093807727);
            Object C11 = u11.C();
            if (C11 == InterfaceC3967k.a.a()) {
                C11 = n1.f(c9074d.c(), D1.f25195a);
                u11.x(C11);
            }
            InterfaceC3978p0 interfaceC3978p0 = (InterfaceC3978p0) C11;
            u11.k();
            androidx.compose.ui.e a17 = C5680b.a(6, u11, aVar, c9074d.f());
            boolean booleanValue = ((Boolean) interfaceC3978p0.getValue()).booleanValue();
            u11.o(2093814493);
            boolean z11 = ((i13 & 112) == 32) | (i14 == 4);
            Object C12 = u11.C();
            if (z11 || C12 == InterfaceC3967k.a.a()) {
                C12 = new i(interfaceC3978p0, function1, c9074d);
                u11.x(C12);
            }
            u11.k();
            androidx.compose.material3.h.a(booleanValue, (Function1) C12, a17, false, null, u11, 0);
            androidx.compose.ui.e a18 = C5680b.a(6, u11, aVar, c9074d.e());
            u11.o(2093823113);
            boolean z12 = (i14 == 4) | ((i13 & 896) == 256);
            Object C13 = u11.C();
            if (z12 || C13 == InterfaceC3967k.a.a()) {
                function13 = function12;
                C13 = new j(interfaceC3978p0, function13, c9074d);
                u11.x(C13);
            } else {
                function13 = function12;
            }
            u11.k();
            D.a((Function0) C13, a18, false, null, C9072b.f82210b, u11, 196608, 28);
            u11.f();
            u11.f();
        }
        J0 m02 = u11.m0();
        if (m02 != null) {
            m02.G(new k(c9074d, function1, function13, i11));
        }
    }

    public static final void d(@NotNull List configurationItems, @NotNull C9071a reloadAppBadge, @NotNull Function1 onChangedConfiguration, @NotNull Function1 onResetConfiguration, e.a aVar, InterfaceC3967k interfaceC3967k, int i11) {
        e.a aVar2;
        Intrinsics.checkNotNullParameter(configurationItems, "configurationItems");
        Intrinsics.checkNotNullParameter(reloadAppBadge, "reloadAppBadge");
        Intrinsics.checkNotNullParameter(onChangedConfiguration, "onChangedConfiguration");
        Intrinsics.checkNotNullParameter(onResetConfiguration, "onResetConfiguration");
        C3969l u11 = interfaceC3967k.u(-99439253);
        int i12 = i11 | (u11.F(configurationItems) ? 4 : 2) | (u11.n(reloadAppBadge) ? 32 : 16) | (u11.F(onChangedConfiguration) ? 256 : UserVerificationMethods.USER_VERIFY_PATTERN) | (u11.F(onResetConfiguration) ? 2048 : UserVerificationMethods.USER_VERIFY_ALL) | 24576;
        if ((i12 & 9363) == 9362 && u11.b()) {
            u11.j();
            aVar2 = aVar;
        } else {
            e.a aVar3 = androidx.compose.ui.e.f40358c0;
            androidx.compose.ui.e e11 = a0.e(aVar3, 1.0f);
            C5194q a11 = C5193p.a(C5179b.g(), InterfaceC6250b.a.k(), u11, 0);
            int I11 = u11.I();
            A0 d11 = u11.d();
            androidx.compose.ui.e f7 = androidx.compose.ui.c.f(u11, e11);
            Function0 a12 = Fr.g.a(InterfaceC2801g.f5440U, u11);
            if (u11.t()) {
                u11.H(a12);
            } else {
                u11.e();
            }
            Function2 g10 = K00.b.g(u11, a11, u11, d11);
            if (u11.t() || !Intrinsics.d(u11.C(), Integer.valueOf(I11))) {
                Ep.a.d(I11, u11, I11, g10);
            }
            U7.i.b(u11, f7, 1474667150);
            Iterator it = configurationItems.iterator();
            while (it.hasNext()) {
                InterfaceC9075e interfaceC9075e = (InterfaceC9075e) it.next();
                if (interfaceC9075e instanceof C9073c) {
                    u11.o(1498076623);
                    b((C9073c) interfaceC9075e, onChangedConfiguration, onResetConfiguration, u11, (i12 >> 3) & 1008);
                    u11.k();
                } else if (interfaceC9075e instanceof C9074d) {
                    u11.o(1498083440);
                    c((C9074d) interfaceC9075e, onChangedConfiguration, onResetConfiguration, u11, (i12 >> 3) & 1008);
                    u11.k();
                } else {
                    u11.o(-803880200);
                    u11.k();
                }
                E.a(u11, a0.f(androidx.compose.ui.e.f40358c0, 16));
            }
            u11.k();
            u11.o(1474684955);
            if (reloadAppBadge.a()) {
                Context context = (Context) u11.m(AndroidCompositionLocals_androidKt.d());
                androidx.compose.ui.e e12 = a0.e(C5680b.a(6, u11, androidx.compose.ui.e.f40358c0, reloadAppBadge.b()), 1.0f);
                u11.o(1474695078);
                Object C11 = u11.C();
                if (C11 == InterfaceC3967k.a.a()) {
                    C11 = C9081k.f82263b;
                    u11.x(C11);
                }
                Function1 function1 = (Function1) C11;
                u11.k();
                u11.o(1474699810);
                boolean F11 = u11.F(context);
                Object C12 = u11.C();
                if (F11 || C12 == InterfaceC3967k.a.a()) {
                    C12 = new C9082l(context);
                    u11.x(C12);
                }
                u11.k();
                cj0.b.a("Необходимо перезагрузить приложение", e12, function1, (Function0) C12, u11, 390, 0);
            }
            u11.k();
            u11.f();
            aVar2 = aVar3;
        }
        J0 m02 = u11.m0();
        if (m02 != null) {
            m02.G(new C9083m(configurationItems, reloadAppBadge, onChangedConfiguration, onResetConfiguration, aVar2, i11));
        }
    }
}
