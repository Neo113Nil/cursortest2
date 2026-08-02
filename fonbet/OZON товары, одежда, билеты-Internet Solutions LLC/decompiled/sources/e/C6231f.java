package e;

import S0.C3969l;
import S0.InterfaceC3967k;
import S0.InterfaceC3978p0;
import S0.J0;
import S0.M;
import S0.N;
import S0.Q;
import S0.n1;
import androidx.activity.C;
import androidx.activity.J;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;
import org.jetbrains.annotations.NotNull;

/* renamed from: e.f, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C6231f {

    /* renamed from: e.f$a */
    static final class a extends AbstractC7737t implements Function0<Unit> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ d f61688b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ boolean f61689c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(d dVar, boolean z11) {
            super(0);
            this.f61688b = dVar;
            this.f61689c = z11;
        }

        @Override // kotlin.jvm.functions.Function0
        public final Unit invoke() {
            this.f61688b.setEnabled(this.f61689c);
            return Unit.f71690a;
        }
    }

    /* renamed from: e.f$b */
    static final class b extends AbstractC7737t implements Function1<N, M> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ J f61690b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ androidx.lifecycle.J f61691c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ d f61692d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(J j11, androidx.lifecycle.J j12, d dVar) {
            super(1);
            this.f61690b = j11;
            this.f61691c = j12;
            this.f61692d = dVar;
        }

        @Override // kotlin.jvm.functions.Function1
        public final M invoke(N n11) {
            J j11 = this.f61690b;
            androidx.lifecycle.J j12 = this.f61691c;
            d dVar = this.f61692d;
            j11.h(j12, dVar);
            return new C6232g(dVar);
        }
    }

    /* renamed from: e.f$c */
    static final class c extends AbstractC7737t implements Function2<InterfaceC3967k, Integer, Unit> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ boolean f61693b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ Function0<Unit> f61694c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ int f61695d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ int f61696e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(int i11, int i12, boolean z11, Function0 function0) {
            super(2);
            this.f61693b = z11;
            this.f61694c = function0;
            this.f61695d = i11;
            this.f61696e = i12;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(InterfaceC3967k interfaceC3967k, Integer num) {
            num.intValue();
            int i11 = this.f61695d | 1;
            Function0<Unit> function0 = this.f61694c;
            int i12 = this.f61696e;
            C6231f.a(this.f61693b, function0, interfaceC3967k, i11, i12);
            return Unit.f71690a;
        }
    }

    /* renamed from: e.f$d */
    public static final class d extends C {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ InterfaceC3978p0 f61697a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(InterfaceC3978p0 interfaceC3978p0, boolean z11) {
            super(z11);
            this.f61697a = interfaceC3978p0;
        }

        @Override // androidx.activity.C
        public final void handleOnBackPressed() {
            ((Function0) this.f61697a.getValue()).invoke();
        }
    }

    public static final void a(boolean z11, @NotNull Function0<Unit> function0, InterfaceC3967k interfaceC3967k, int i11, int i12) {
        int i13;
        C3969l u11 = interfaceC3967k.u(-361453782);
        int i14 = i12 & 1;
        if (i14 != 0) {
            i13 = i11 | 6;
        } else {
            i13 = (u11.p(z11) ? 4 : 2) | i11;
        }
        if ((i11 & 48) == 0) {
            i13 |= u11.n(function0) ? 32 : 16;
        }
        if ((i13 & 19) == 18 && u11.b()) {
            u11.j();
        } else {
            if (i14 != 0) {
                z11 = true;
            }
            InterfaceC3978p0 l11 = n1.l(function0, u11);
            u11.B(-971159753);
            Object C11 = u11.C();
            if (C11 == InterfaceC3967k.a.a()) {
                C11 = new d(l11, z11);
                u11.x(C11);
            }
            d dVar = (d) C11;
            u11.K();
            u11.B(-971159481);
            boolean n11 = u11.n(dVar) | u11.p(z11);
            Object C12 = u11.C();
            if (n11 || C12 == InterfaceC3967k.a.a()) {
                C12 = new a(dVar, z11);
                u11.x(C12);
            }
            u11.K();
            int i15 = Q.f25307b;
            u11.g((Function0) C12);
            androidx.activity.M a11 = C6235j.a(u11);
            if (a11 == null) {
                throw new IllegalStateException("No OnBackPressedDispatcherOwner was provided via LocalOnBackPressedDispatcherOwner");
            }
            J onBackPressedDispatcher = a11.getOnBackPressedDispatcher();
            androidx.lifecycle.J j11 = (androidx.lifecycle.J) u11.m(AndroidCompositionLocals_androidKt.getLocalLifecycleOwner());
            u11.B(-971159120);
            boolean n12 = u11.n(onBackPressedDispatcher) | u11.n(j11) | u11.n(dVar);
            Object C13 = u11.C();
            if (n12 || C13 == InterfaceC3967k.a.a()) {
                C13 = new b(onBackPressedDispatcher, j11, dVar);
                u11.x(C13);
            }
            u11.K();
            Q.b(j11, onBackPressedDispatcher, (Function1) C13, u11);
        }
        J0 m02 = u11.m0();
        if (m02 != null) {
            m02.G(new c(i11, i12, z11, function0));
        }
    }
}
