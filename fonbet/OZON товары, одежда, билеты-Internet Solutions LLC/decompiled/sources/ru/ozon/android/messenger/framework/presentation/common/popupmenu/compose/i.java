package ru.ozon.android.messenger.framework.presentation.common.popupmenu.compose;

import B0.C2454a;
import B1.V;
import Bl0.C2652m;
import D1.InterfaceC2801g;
import J0.R2;
import S0.A0;
import S0.C3969l;
import S0.D1;
import S0.F1;
import S0.InterfaceC3967k;
import S0.InterfaceC3978p0;
import S0.J0;
import S0.Q;
import S0.n1;
import Sc.s;
import T7.E;
import a1.C4912a;
import android.view.View;
import android.view.ViewParent;
import android.view.Window;
import androidx.compose.foundation.layout.C5185h;
import androidx.compose.foundation.layout.a0;
import androidx.compose.ui.e;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.ui.platform.K0;
import androidx.recyclerview.widget.m;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import com.google.android.gms.fido.u2f.api.common.RegisterRequest;
import d2.C6030G;
import d2.C6053k;
import d2.InterfaceC6031H;
import e.C6231f;
import e1.InterfaceC6250b;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import m0.C7980b;
import m0.C7984d;
import m0.C8004n;
import m0.C8008p;
import m0.G;
import m0.T0;
import m3.C8060b;
import org.jetbrains.annotations.NotNull;
import ru.ozon.uni.core.repository.UniTheme;
import t0.q;
import xe.M;

/* loaded from: classes10.dex */
public final class i {

    @kotlin.coroutines.jvm.internal.e(c = "ru.ozon.android.messenger.framework.presentation.common.popupmenu.compose.MessageContextMenuPopupKt$MessageContextMenuPopup$1$1", f = "MessageContextMenuPopup.kt", l = {UserVerificationMethods.USER_VERIFY_EYEPRINT, RegisterRequest.U2F_V1_CHALLENGE_BYTE_LENGTH, 66}, m = "invokeSuspend")
    static final class a extends kotlin.coroutines.jvm.internal.j implements Function2<M, kotlin.coroutines.d<? super Unit>, Object> {

        /* renamed from: d, reason: collision with root package name */
        int f90845d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ C7980b<Float, C8008p> f90846e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ T0<Float> f90847f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ C7980b<Float, C8008p> f90848g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ C7980b<Float, C8008p> f90849h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(C7980b<Float, C8008p> c7980b, T0<Float> t02, C7980b<Float, C8008p> c7980b2, C7980b<Float, C8008p> c7980b3, kotlin.coroutines.d<? super a> dVar) {
            super(2, dVar);
            this.f90846e = c7980b;
            this.f90847f = t02;
            this.f90848g = c7980b2;
            this.f90849h = c7980b3;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            return new a(this.f90846e, this.f90847f, this.f90848g, this.f90849h, dVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(M m11, kotlin.coroutines.d<? super Unit> dVar) {
            return ((a) create(m11, dVar)).invokeSuspend(Unit.f71690a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:14:0x0063, code lost:
        
            if (m0.C7980b.f(r6.f90849h, r3, r4, null, r6, 12) == r0) goto L20;
         */
        /* JADX WARN: Code restructure failed: missing block: B:15:0x0065, code lost:
        
            return r0;
         */
        /* JADX WARN: Code restructure failed: missing block: B:18:0x0050, code lost:
        
            if (m0.C7980b.f(r6.f90848g, r3, r4, null, r6, 12) == r0) goto L20;
         */
        /* JADX WARN: Code restructure failed: missing block: B:20:0x003d, code lost:
        
            if (m0.C7980b.f(r11.f90846e, r3, r4, null, r6, 12) == r0) goto L20;
         */
        @Override // kotlin.coroutines.jvm.internal.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            a aVar;
            Wc.a aVar2 = Wc.a.COROUTINE_SUSPENDED;
            int i11 = this.f90845d;
            T0<Float> t02 = this.f90847f;
            if (i11 == 0) {
                s.b(obj);
                Float f7 = new Float(1.0f);
                this.f90845d = 1;
                aVar = this;
            } else if (i11 == 1) {
                s.b(obj);
                aVar = this;
            } else {
                if (i11 != 2) {
                    if (i11 != 3) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    s.b(obj);
                    return Unit.f71690a;
                }
                s.b(obj);
                aVar = this;
                Float f11 = new Float(1.0f);
                aVar.f90845d = 3;
            }
            Float f12 = new Float(1.0f);
            aVar.f90845d = 2;
        }
    }

    static final class b extends AbstractC7737t implements Function2<InterfaceC3967k, Integer, Unit> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ Function0<Unit> f90850b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ n f90851c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ C7980b<Float, C8008p> f90852d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ C7980b<Float, C8008p> f90853e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ Function0<Unit> f90854f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(Function0<Unit> function0, n nVar, C7980b<Float, C8008p> c7980b, C7980b<Float, C8008p> c7980b2, Function0<Unit> function02) {
            super(2);
            this.f90850b = function0;
            this.f90851c = nVar;
            this.f90852d = c7980b;
            this.f90853e = c7980b2;
            this.f90854f = function02;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(InterfaceC3967k interfaceC3967k, Integer num) {
            InterfaceC3967k interfaceC3967k2 = interfaceC3967k;
            if ((num.intValue() & 3) == 2 && interfaceC3967k2.b()) {
                interfaceC3967k2.j();
            } else {
                Function0<Unit> function0 = this.f90850b;
                C6231f.a(false, function0, interfaceC3967k2, 0, 1);
                interfaceC3967k2.o(-279995334);
                Object C11 = interfaceC3967k2.C();
                if (C11 == InterfaceC3967k.a.a()) {
                    C11 = t0.p.a();
                    interfaceC3967k2.x(C11);
                }
                q qVar = (q) C11;
                interfaceC3967k2.k();
                interfaceC3967k2.o(-279993186);
                Object C12 = interfaceC3967k2.C();
                if (C12 == InterfaceC3967k.a.a()) {
                    C12 = n1.f(Z1.m.a(0L), D1.f25195a);
                    interfaceC3967k2.x(C12);
                }
                InterfaceC3978p0 interfaceC3978p0 = (InterfaceC3978p0) C12;
                interfaceC3967k2.k();
                View view = (View) interfaceC3967k2.m(AndroidCompositionLocals_androidKt.h());
                ViewParent parent = view.getParent();
                InterfaceC6031H interfaceC6031H = parent instanceof InterfaceC6031H ? (InterfaceC6031H) parent : null;
                Window window = interfaceC6031H != null ? interfaceC6031H.getWindow() : null;
                interfaceC3967k2.o(-279986795);
                boolean F11 = interfaceC3967k2.F(window);
                Object C13 = interfaceC3967k2.C();
                if (F11 || C13 == InterfaceC3967k.a.a()) {
                    C13 = new j(window, null);
                    interfaceC3967k2.x(C13);
                }
                interfaceC3967k2.k();
                Q.e(interfaceC3967k2, view, (Function2) C13);
                e.a aVar = androidx.compose.ui.e.f40358c0;
                androidx.compose.ui.e d11 = a0.d(aVar);
                interfaceC3967k2.o(-279974809);
                Object C14 = interfaceC3967k2.C();
                if (C14 == InterfaceC3967k.a.a()) {
                    C14 = new k(interfaceC3978p0);
                    interfaceC3967k2.x(C14);
                }
                interfaceC3967k2.k();
                androidx.compose.ui.e b11 = androidx.compose.foundation.i.b(androidx.compose.ui.layout.c.a(d11, new m((Function1) C14, view)), qVar, null, false, null, null, this.f90850b, 28);
                V f7 = C5185h.f(InterfaceC6250b.a.o(), false);
                int I11 = interfaceC3967k2.I();
                A0 d12 = interfaceC3967k2.d();
                androidx.compose.ui.e f11 = androidx.compose.ui.c.f(interfaceC3967k2, b11);
                InterfaceC2801g.f5440U.getClass();
                Function0 a11 = InterfaceC2801g.a.a();
                if (interfaceC3967k2.v() == null) {
                    C8060b.c();
                    throw null;
                }
                interfaceC3967k2.i();
                if (interfaceC3967k2.t()) {
                    interfaceC3967k2.H(a11);
                } else {
                    interfaceC3967k2.e();
                }
                Function2 d13 = C2454a.d(interfaceC3967k2, f7, interfaceC3967k2, d12);
                if (interfaceC3967k2.t() || !Intrinsics.d(interfaceC3967k2.C(), Integer.valueOf(I11))) {
                    Nk.a.d(d13, I11, interfaceC3967k2, I11);
                }
                F1.b(interfaceC3967k2, f11, InterfaceC2801g.a.f());
                V f12 = C5185h.f(InterfaceC6250b.a.o(), false);
                int I12 = interfaceC3967k2.I();
                A0 d14 = interfaceC3967k2.d();
                androidx.compose.ui.e f13 = androidx.compose.ui.c.f(interfaceC3967k2, aVar);
                Function0 a12 = InterfaceC2801g.a.a();
                if (interfaceC3967k2.v() == null) {
                    C8060b.c();
                    throw null;
                }
                interfaceC3967k2.i();
                if (interfaceC3967k2.t()) {
                    interfaceC3967k2.H(a12);
                } else {
                    interfaceC3967k2.e();
                }
                Function2 d15 = C2454a.d(interfaceC3967k2, f12, interfaceC3967k2, d14);
                if (interfaceC3967k2.t() || !Intrinsics.d(interfaceC3967k2.C(), Integer.valueOf(I12))) {
                    Nk.a.d(d15, I12, interfaceC3967k2, I12);
                }
                F1.b(interfaceC3967k2, f13, InterfaceC2801g.a.f());
                float floatValue = this.f90852d.k().floatValue();
                float floatValue2 = this.f90853e.k().floatValue();
                long g10 = ((Z1.m) interfaceC3978p0.getValue()).g();
                interfaceC3967k2.o(-879074867);
                Function0<Unit> function02 = this.f90854f;
                boolean n11 = interfaceC3967k2.n(function02) | interfaceC3967k2.n(function0);
                Object C15 = interfaceC3967k2.C();
                if (n11 || C15 == InterfaceC3967k.a.a()) {
                    C15 = new l(function02, function0);
                    interfaceC3967k2.x(C15);
                }
                interfaceC3967k2.k();
                i.d(this.f90851c, floatValue, floatValue2, g10, (Function0) C15, interfaceC3967k2, 0);
                interfaceC3967k2.f();
                interfaceC3967k2.f();
            }
            return Unit.f71690a;
        }
    }

    static final class c extends AbstractC7737t implements Function2<InterfaceC3967k, Integer, Unit> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ n f90855b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ Function0<Unit> f90856c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ Function0<Unit> f90857d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ int f90858e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(n nVar, Function0<Unit> function0, Function0<Unit> function02, int i11) {
            super(2);
            this.f90855b = nVar;
            this.f90856c = function0;
            this.f90857d = function02;
            this.f90858e = i11;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(InterfaceC3967k interfaceC3967k, Integer num) {
            num.intValue();
            int e11 = C2652m.e(this.f90858e | 1);
            Function0<Unit> function0 = this.f90856c;
            Function0<Unit> function02 = this.f90857d;
            i.b(this.f90855b, function0, function02, interfaceC3967k, e11);
            return Unit.f71690a;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(androidx.compose.ui.e eVar, Function0 function0, InterfaceC3967k interfaceC3967k, int i11) {
        int i12;
        C3969l u11 = interfaceC3967k.u(1075662949);
        if ((i11 & 6) == 0) {
            i12 = (u11.n(eVar) ? 4 : 2) | i11;
        } else {
            i12 = i11;
        }
        if ((i11 & 48) == 0) {
            i12 |= u11.F(function0) ? 32 : 16;
        }
        if ((i12 & 19) == 18 && u11.b()) {
            u11.j();
        } else {
            R2.a(S8.b.c(eVar, 0, A0.h.b(ru.ozon.android.messenger.framework.presentation.common.popupmenu.compose.b.c()), 28), A0.h.b(ru.ozon.android.messenger.framework.presentation.common.popupmenu.compose.b.c()), UniTheme.INSTANCE.getColors(u11, UniTheme.$stable).getLayerFloor2(), 0L, 0.0f, a1.c.c(-751277143, new ru.ozon.android.messenger.framework.presentation.common.popupmenu.compose.c(function0), u11), u11, 1572864, 56);
        }
        J0 m02 = u11.m0();
        if (m02 != null) {
            m02.G(new d(eVar, function0, i11));
        }
    }

    public static final void b(@NotNull n state, @NotNull Function0<Unit> function0, @NotNull Function0<Unit> onCopy, InterfaceC3967k interfaceC3967k, int i11) {
        int i12;
        n nVar;
        Function0<Unit> function02;
        C3969l c3969l;
        Function0<Unit> onDismiss = function0;
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(onDismiss, "onDismiss");
        Intrinsics.checkNotNullParameter(onCopy, "onCopy");
        C3969l u11 = interfaceC3967k.u(-1151397987);
        if ((i11 & 6) == 0) {
            i12 = (u11.n(state) ? 4 : 2) | i11;
        } else {
            i12 = i11;
        }
        if ((i11 & 48) == 0) {
            i12 |= u11.F(onDismiss) ? 32 : 16;
        }
        if ((i11 & 384) == 0) {
            i12 |= u11.F(onCopy) ? 256 : UserVerificationMethods.USER_VERIFY_PATTERN;
        }
        int i13 = i12;
        if ((i13 & 147) == 146 && u11.b()) {
            u11.j();
            nVar = state;
            function02 = onCopy;
            c3969l = u11;
        } else {
            u11.o(-1039698353);
            Object C11 = u11.C();
            if (C11 == InterfaceC3967k.a.a()) {
                C11 = C7984d.a(0.0f);
                u11.x(C11);
            }
            C7980b c7980b = (C7980b) C11;
            Object b11 = Pk0.h.b(u11, -1039696465);
            if (b11 == InterfaceC3967k.a.a()) {
                b11 = C7984d.a(0.0f);
                u11.x(b11);
            }
            C7980b c7980b2 = (C7980b) b11;
            Object b12 = Pk0.h.b(u11, -1039694929);
            if (b12 == InterfaceC3967k.a.a()) {
                b12 = C7984d.a(0.0f);
                u11.x(b12);
            }
            C7980b c7980b3 = (C7980b) b12;
            u11.k();
            T0 d11 = C8004n.d(m.e.DEFAULT_DRAG_ANIMATION_DURATION, 0, G.c(), 2);
            Unit unit = Unit.f71690a;
            u11.o(-1039688426);
            boolean F11 = u11.F(c7980b) | u11.n(d11) | u11.F(c7980b2) | u11.F(c7980b3);
            Object C12 = u11.C();
            if (F11 || C12 == InterfaceC3967k.a.a()) {
                Object aVar = new a(c7980b, d11, c7980b2, c7980b3, null);
                u11.x(aVar);
                C12 = aVar;
            }
            u11.k();
            Q.e(u11, unit, (Function2) C12);
            nVar = state;
            function02 = onCopy;
            onDismiss = function0;
            c3969l = u11;
            C6053k.a(onDismiss, new C6030G(false), a1.c.c(1963397222, new b(function0, state, c7980b2, c7980b3, onCopy), u11), c3969l, ((i13 >> 3) & 14) | 432, 0);
        }
        J0 m02 = c3969l.m0();
        if (m02 != null) {
            m02.G(new c(nVar, onDismiss, function02, i11));
        }
    }

    /* JADX WARN: Type inference failed for: r4v14 */
    /* JADX WARN: Type inference failed for: r4v6 */
    /* JADX WARN: Type inference failed for: r4v7, types: [boolean, int] */
    public static final void d(n nVar, float f7, float f11, long j11, Function0 function0, InterfaceC3967k interfaceC3967k, int i11) {
        int i12;
        ?? r42;
        C3969l u11 = interfaceC3967k.u(-223100757);
        if ((i11 & 6) == 0) {
            i12 = (u11.n(nVar) ? 4 : 2) | i11;
        } else {
            i12 = i11;
        }
        if ((i11 & 48) == 0) {
            i12 |= u11.q(f7) ? 32 : 16;
        }
        if ((i11 & 384) == 0) {
            i12 |= u11.q(f11) ? 256 : UserVerificationMethods.USER_VERIFY_PATTERN;
        }
        if ((i11 & 3072) == 0) {
            i12 |= u11.s(j11) ? 2048 : UserVerificationMethods.USER_VERIFY_ALL;
        }
        if ((i11 & 24576) == 0) {
            i12 |= u11.F(function0) ? 16384 : 8192;
        }
        if ((i12 & 9363) == 9362 && u11.b()) {
            u11.j();
        } else {
            Z1.d dVar = (Z1.d) u11.m(K0.e());
            int Y02 = dVar.Y0(ru.ozon.android.messenger.framework.presentation.common.popupmenu.compose.b.e());
            int Y03 = dVar.Y0(ru.ozon.android.messenger.framework.presentation.common.popupmenu.compose.b.d());
            e.a aVar = androidx.compose.ui.e.f40358c0;
            androidx.compose.ui.e d11 = a0.d(aVar);
            u11.o(162931386);
            boolean r11 = ((i12 & 14) == 4) | u11.r(Y02) | ((i12 & 7168) == 2048) | u11.r(Y03);
            Object C11 = u11.C();
            if (r11 || C11 == InterfaceC3967k.a.a()) {
                r42 = 0;
                C11 = new e(nVar, Y02, j11, Y03);
                u11.x(C11);
            } else {
                r42 = 0;
            }
            V v11 = (V) C11;
            u11.k();
            int I11 = u11.I();
            A0 d12 = u11.d();
            androidx.compose.ui.e f12 = androidx.compose.ui.c.f(u11, d11);
            Function0 a11 = Fr.g.a(InterfaceC2801g.f5440U, u11);
            if (u11.t()) {
                u11.H(a11);
            } else {
                u11.e();
            }
            Function2 f13 = E.f(u11, v11, u11, d12);
            if (u11.t() || !Intrinsics.d(u11.C(), Integer.valueOf(I11))) {
                Ep.a.d(I11, u11, I11, f13);
            }
            F1.b(u11, f12, InterfaceC2801g.a.f());
            androidx.compose.ui.e b11 = androidx.compose.ui.layout.a.b(aVar, "bubble");
            u11.o(1337221505);
            boolean z11 = (i12 & 112) == 32 ? true : r42;
            Object C12 = u11.C();
            if (z11 || C12 == InterfaceC3967k.a.a()) {
                C12 = new f(f7);
                u11.x(C12);
            }
            u11.k();
            androidx.compose.ui.e a12 = androidx.compose.ui.graphics.a.a(b11, (Function1) C12);
            V f14 = C5185h.f(InterfaceC6250b.a.o(), r42);
            int I12 = u11.I();
            A0 d13 = u11.d();
            androidx.compose.ui.e f15 = androidx.compose.ui.c.f(u11, a12);
            Function0 a13 = InterfaceC2801g.a.a();
            u11.i();
            if (u11.t()) {
                u11.H(a13);
            } else {
                u11.e();
            }
            Function2 f16 = E.f(u11, f14, u11, d13);
            if (u11.t() || !Intrinsics.d(u11.C(), Integer.valueOf(I12))) {
                Ep.a.d(I12, u11, I12, f16);
            }
            F1.b(u11, f15, InterfaceC2801g.a.f());
            ((C4912a) nVar.a()).invoke(u11, Integer.valueOf((int) r42));
            u11.f();
            androidx.compose.ui.e b12 = androidx.compose.ui.layout.a.b(aVar, "menu");
            u11.o(1337229718);
            boolean z12 = (i12 & 896) != 256 ? r42 : true;
            Object C13 = u11.C();
            if (z12 || C13 == InterfaceC3967k.a.a()) {
                C13 = new g(f11);
                u11.x(C13);
            }
            u11.k();
            a(androidx.compose.ui.graphics.a.a(b12, (Function1) C13), function0, u11, (i12 >> 9) & 112);
            u11.f();
        }
        J0 m02 = u11.m0();
        if (m02 != null) {
            m02.G(new h(nVar, f7, f11, j11, function0, i11));
        }
    }
}
