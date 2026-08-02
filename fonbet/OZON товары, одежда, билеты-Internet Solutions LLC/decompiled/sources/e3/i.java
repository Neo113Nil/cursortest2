package e3;

import Bl0.C2652m;
import S0.C3969l;
import S0.InterfaceC3967k;
import S0.InterfaceC3978p0;
import S0.J0;
import S0.M;
import S0.N;
import S0.Q;
import S0.n1;
import androidx.lifecycle.AbstractC5434v;
import androidx.lifecycle.G;
import androidx.lifecycle.J;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import e3.i;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes8.dex */
public final class i {

    static final class a extends AbstractC7737t implements Function1<N, M> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ J f61904b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ o f61905c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ Function1<o, n> f61906d;

        /* renamed from: e3.i$a$a, reason: collision with other inner class name */
        public /* synthetic */ class C0971a {

            /* renamed from: a, reason: collision with root package name */
            public static final /* synthetic */ int[] f61907a;

            static {
                int[] iArr = new int[AbstractC5434v.a.values().length];
                try {
                    iArr[AbstractC5434v.a.ON_RESUME.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[AbstractC5434v.a.ON_PAUSE.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                f61907a = iArr;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        a(J j11, o oVar, Function1<? super o, ? extends n> function1) {
            super(1);
            this.f61904b = j11;
            this.f61905c = oVar;
            this.f61906d = function1;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r0v0, types: [androidx.lifecycle.I, e3.h] */
        @Override // kotlin.jvm.functions.Function1
        public final M invoke(N n11) {
            final kotlin.jvm.internal.M m11 = new kotlin.jvm.internal.M();
            final o oVar = this.f61905c;
            final Function1<o, n> function1 = this.f61906d;
            ?? r02 = new G() { // from class: e3.h
                /* JADX WARN: Type inference failed for: r2v4, types: [T, java.lang.Object] */
                @Override // androidx.lifecycle.G
                public final void onStateChanged(J j11, AbstractC5434v.a aVar) {
                    int i11 = i.a.C0971a.f61907a[aVar.ordinal()];
                    kotlin.jvm.internal.M m12 = m11;
                    if (i11 == 1) {
                        m12.f71787a = function1.invoke(o.this);
                    } else {
                        if (i11 != 2) {
                            return;
                        }
                        n nVar = (n) m12.f71787a;
                        if (nVar != null) {
                            nVar.runPauseOrOnDisposeEffect();
                        }
                        m12.f71787a = null;
                    }
                }
            };
            J j11 = this.f61904b;
            j11.getLifecycle().a(r02);
            return new j(j11, r02, m11);
        }
    }

    static final class b extends AbstractC7737t implements Function2<InterfaceC3967k, Integer, Unit> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ J f61908b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ o f61909c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ Function1<o, n> f61910d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ int f61911e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        b(J j11, o oVar, Function1<? super o, ? extends n> function1, int i11) {
            super(2);
            this.f61908b = j11;
            this.f61909c = oVar;
            this.f61910d = function1;
            this.f61911e = i11;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(InterfaceC3967k interfaceC3967k, Integer num) {
            num.intValue();
            int e11 = C2652m.e(this.f61911e | 1);
            Function1<o, n> function1 = this.f61910d;
            i.c(this.f61908b, this.f61909c, function1, interfaceC3967k, e11);
            return Unit.f71690a;
        }
    }

    static final class c extends AbstractC7737t implements Function1<N, M> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ J f61912b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ p f61913c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ Function1<p, q> f61914d;

        public /* synthetic */ class a {

            /* renamed from: a, reason: collision with root package name */
            public static final /* synthetic */ int[] f61915a;

            static {
                int[] iArr = new int[AbstractC5434v.a.values().length];
                try {
                    iArr[AbstractC5434v.a.ON_START.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[AbstractC5434v.a.ON_STOP.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                f61915a = iArr;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        c(J j11, p pVar, Function1<? super p, ? extends q> function1) {
            super(1);
            this.f61912b = j11;
            this.f61913c = pVar;
            this.f61914d = function1;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r0v0, types: [androidx.lifecycle.I, e3.l] */
        @Override // kotlin.jvm.functions.Function1
        public final M invoke(N n11) {
            final kotlin.jvm.internal.M m11 = new kotlin.jvm.internal.M();
            final p pVar = this.f61913c;
            final Function1<p, q> function1 = this.f61914d;
            ?? r02 = new G() { // from class: e3.l
                /* JADX WARN: Type inference failed for: r2v4, types: [T, java.lang.Object] */
                @Override // androidx.lifecycle.G
                public final void onStateChanged(J j11, AbstractC5434v.a aVar) {
                    int i11 = i.c.a.f61915a[aVar.ordinal()];
                    kotlin.jvm.internal.M m12 = m11;
                    if (i11 == 1) {
                        m12.f71787a = function1.invoke(p.this);
                    } else {
                        if (i11 != 2) {
                            return;
                        }
                        q qVar = (q) m12.f71787a;
                        if (qVar != null) {
                            qVar.runStopOrDisposeEffect();
                        }
                        m12.f71787a = null;
                    }
                }
            };
            J j11 = this.f61912b;
            j11.getLifecycle().a(r02);
            return new m(j11, r02, m11);
        }
    }

    static final class d extends AbstractC7737t implements Function2<InterfaceC3967k, Integer, Unit> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ J f61916b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ p f61917c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ Function1<p, q> f61918d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ int f61919e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        d(J j11, p pVar, Function1<? super p, ? extends q> function1, int i11) {
            super(2);
            this.f61916b = j11;
            this.f61917c = pVar;
            this.f61918d = function1;
            this.f61919e = i11;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(InterfaceC3967k interfaceC3967k, Integer num) {
            num.intValue();
            int e11 = C2652m.e(this.f61919e | 1);
            Function1<p, q> function1 = this.f61918d;
            i.e(this.f61916b, this.f61917c, function1, interfaceC3967k, e11);
            return Unit.f71690a;
        }
    }

    public static final void a(@NotNull AbstractC5434v.a aVar, J j11, @NotNull Function0 function0, InterfaceC3967k interfaceC3967k, int i11) {
        C3969l u11 = interfaceC3967k.u(-709389590);
        int i12 = i11 | 16;
        if ((i11 & 384) == 0) {
            i12 |= u11.F(function0) ? 256 : UserVerificationMethods.USER_VERIFY_PATTERN;
        }
        if ((i12 & 147) == 146 && u11.b()) {
            u11.j();
        } else {
            u11.Q0();
            if ((i11 & 1) == 0 || u11.w0()) {
                j11 = (J) u11.m(r.a());
            } else {
                u11.j();
            }
            u11.j0();
            if (aVar == AbstractC5434v.a.ON_DESTROY) {
                throw new IllegalArgumentException("LifecycleEventEffect cannot be used to listen for Lifecycle.Event.ON_DESTROY, since Compose disposes of the composition before ON_DESTROY observers are invoked.");
            }
            InterfaceC3978p0 l11 = n1.l(function0, u11);
            boolean n11 = u11.n(l11) | u11.F(j11);
            Object C11 = u11.C();
            if (n11 || C11 == InterfaceC3967k.a.a()) {
                C11 = new e(j11, aVar, l11);
                u11.x(C11);
            }
            Q.c(j11, (Function1) C11, u11);
        }
        J0 m02 = u11.m0();
        if (m02 != null) {
            m02.G(new f(aVar, j11, function0, i11));
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:40:0x0060, code lost:
    
        if ((r14 & 2) != 0) goto L40;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void b(l20.c cVar, J j11, @NotNull Function1 function1, InterfaceC3967k interfaceC3967k, int i11, int i12) {
        int i13;
        C3969l u11 = interfaceC3967k.u(1220373486);
        if ((i11 & 6) == 0) {
            i13 = (u11.F(cVar) ? 4 : 2) | i11;
        } else {
            i13 = i11;
        }
        if ((i11 & 48) == 0) {
            i13 |= ((i12 & 2) == 0 && u11.F(j11)) ? 32 : 16;
        }
        if ((i11 & 384) == 0) {
            i13 |= u11.F(function1) ? 256 : UserVerificationMethods.USER_VERIFY_PATTERN;
        }
        if ((i13 & 147) == 146 && u11.b()) {
            u11.j();
        } else {
            u11.Q0();
            if ((i11 & 1) == 0 || u11.w0()) {
                if ((i12 & 2) != 0) {
                    j11 = (J) u11.m(r.a());
                    i13 &= -113;
                }
                u11.j0();
                boolean n11 = u11.n(cVar) | u11.n(j11);
                Object C11 = u11.C();
                if (n11 || C11 == InterfaceC3967k.a.a()) {
                    C11 = new o(j11.getLifecycle());
                    u11.x(C11);
                }
                c(j11, (o) C11, function1, u11, (i13 & 896) | ((i13 >> 3) & 14));
            } else {
                u11.j();
            }
        }
        J j12 = j11;
        J0 m02 = u11.m0();
        if (m02 != null) {
            m02.G(new g(cVar, j12, function1, i11, i12));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void c(J j11, o oVar, Function1<? super o, ? extends n> function1, InterfaceC3967k interfaceC3967k, int i11) {
        int i12;
        C3969l u11 = interfaceC3967k.u(912823238);
        if ((i11 & 6) == 0) {
            i12 = (u11.F(j11) ? 4 : 2) | i11;
        } else {
            i12 = i11;
        }
        if ((i11 & 48) == 0) {
            i12 |= u11.F(oVar) ? 32 : 16;
        }
        if ((i11 & 384) == 0) {
            i12 |= u11.F(function1) ? 256 : UserVerificationMethods.USER_VERIFY_PATTERN;
        }
        if ((i12 & 147) == 146 && u11.b()) {
            u11.j();
        } else {
            boolean F11 = ((i12 & 896) == 256) | u11.F(oVar) | u11.F(j11);
            Object C11 = u11.C();
            if (F11 || C11 == InterfaceC3967k.a.a()) {
                C11 = new a(j11, oVar, function1);
                u11.x(C11);
            }
            Q.b(j11, oVar, (Function1) C11, u11);
        }
        J0 m02 = u11.m0();
        if (m02 != null) {
            m02.G(new b(j11, oVar, function1, i11));
        }
    }

    public static final void d(l20.c cVar, J j11, @NotNull Function1 function1, InterfaceC3967k interfaceC3967k, int i11) {
        C3969l u11 = interfaceC3967k.u(-1408314671);
        int i12 = (u11.F(cVar) ? 4 : 2) | i11 | (u11.F(j11) ? 32 : 16) | (u11.F(function1) ? 256 : UserVerificationMethods.USER_VERIFY_PATTERN);
        if ((i12 & 147) == 146 && u11.b()) {
            u11.j();
        } else {
            u11.Q0();
            if ((i11 & 1) != 0 && !u11.w0()) {
                u11.j();
            }
            u11.j0();
            boolean n11 = u11.n(cVar) | u11.n(j11);
            Object C11 = u11.C();
            if (n11 || C11 == InterfaceC3967k.a.a()) {
                C11 = new p(j11.getLifecycle());
                u11.x(C11);
            }
            e(j11, (p) C11, function1, u11, (i12 & 896) | ((i12 >> 3) & 14));
        }
        J0 m02 = u11.m0();
        if (m02 != null) {
            m02.G(new k(cVar, j11, function1, i11));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void e(J j11, p pVar, Function1<? super p, ? extends q> function1, InterfaceC3967k interfaceC3967k, int i11) {
        int i12;
        C3969l u11 = interfaceC3967k.u(228371534);
        if ((i11 & 6) == 0) {
            i12 = (u11.F(j11) ? 4 : 2) | i11;
        } else {
            i12 = i11;
        }
        if ((i11 & 48) == 0) {
            i12 |= u11.F(pVar) ? 32 : 16;
        }
        if ((i11 & 384) == 0) {
            i12 |= u11.F(function1) ? 256 : UserVerificationMethods.USER_VERIFY_PATTERN;
        }
        if ((i12 & 147) == 146 && u11.b()) {
            u11.j();
        } else {
            boolean F11 = ((i12 & 896) == 256) | u11.F(pVar) | u11.F(j11);
            Object C11 = u11.C();
            if (F11 || C11 == InterfaceC3967k.a.a()) {
                C11 = new c(j11, pVar, function1);
                u11.x(C11);
            }
            Q.b(j11, pVar, (Function1) C11, u11);
        }
        J0 m02 = u11.m0();
        if (m02 != null) {
            m02.G(new d(j11, pVar, function1, i11));
        }
    }
}
