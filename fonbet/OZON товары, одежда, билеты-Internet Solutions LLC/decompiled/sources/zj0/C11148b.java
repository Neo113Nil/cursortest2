package zj0;

import B0.N0;
import Bl0.C2652m;
import D1.InterfaceC2801g;
import J0.P;
import P0.W0;
import S0.A0;
import S0.C3969l;
import S0.F1;
import S0.InterfaceC3967k;
import S0.J0;
import androidx.compose.foundation.layout.C5179b;
import androidx.compose.foundation.layout.C5193p;
import androidx.compose.foundation.layout.C5194q;
import androidx.compose.foundation.layout.T;
import androidx.compose.foundation.layout.a0;
import androidx.compose.ui.e;
import bj0.C5680b;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import dj0.f;
import e1.InterfaceC6250b;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import m3.C8060b;
import org.jetbrains.annotations.NotNull;

/* renamed from: zj0.b, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C11148b {

    /* renamed from: zj0.b$a */
    static final class a extends AbstractC7737t implements Function1<f.a, Unit> {

        /* renamed from: b, reason: collision with root package name */
        public static final a f109308b = new a(1);

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(f.a aVar) {
            f.a TrackerIsland = aVar;
            Intrinsics.checkNotNullParameter(TrackerIsland, "$this$TrackerIsland");
            TrackerIsland.b(C11147a.f109307b);
            return Unit.f71690a;
        }
    }

    /* renamed from: zj0.b$b, reason: collision with other inner class name */
    static final class C2358b extends AbstractC7737t implements Function2<InterfaceC3967k, Integer, Unit> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ Cj0.a f109309b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ Cj0.a f109310c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ Cj0.a f109311d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C2358b(Cj0.a aVar, Cj0.a aVar2, Cj0.a aVar3) {
            super(2);
            this.f109309b = aVar;
            this.f109310c = aVar2;
            this.f109311d = aVar3;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(InterfaceC3967k interfaceC3967k, Integer num) {
            InterfaceC3967k interfaceC3967k2 = interfaceC3967k;
            if ((num.intValue() & 3) == 2 && interfaceC3967k2.b()) {
                interfaceC3967k2.j();
            } else {
                e e11 = a0.e(e.f40358c0, 1.0f);
                C5194q a11 = C5193p.a(C5179b.g(), InterfaceC6250b.a.k(), interfaceC3967k2, 0);
                int I11 = interfaceC3967k2.I();
                A0 d11 = interfaceC3967k2.d();
                e f7 = androidx.compose.ui.c.f(interfaceC3967k2, e11);
                InterfaceC2801g.f5440U.getClass();
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
                Function2 c11 = P.c(interfaceC3967k2, a11, interfaceC3967k2, d11);
                if (interfaceC3967k2.t() || !Intrinsics.d(interfaceC3967k2.C(), Integer.valueOf(I11))) {
                    Nk.a.d(c11, I11, interfaceC3967k2, I11);
                }
                F1.b(interfaceC3967k2, f7, InterfaceC2801g.a.f());
                C11148b.b(this.f109309b, "Metric.type", "PerformanceTrackerEvents.MetricType.TextField", 1, interfaceC3967k2, 3504);
                C11148b.b(this.f109310c, "Metric.value", "PerformanceTrackerEvents.MetricValue.TextField", 3, interfaceC3967k2, 3504);
                C11148b.b(this.f109311d, "Events count", "PerformanceTrackerEvents.MetricCount.TextField", 3, interfaceC3967k2, 3504);
                interfaceC3967k2.f();
            }
            return Unit.f71690a;
        }
    }

    /* renamed from: zj0.b$c */
    static final class c extends AbstractC7737t implements Function2<InterfaceC3967k, Integer, Unit> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ Cj0.a f109312b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ Cj0.a f109313c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ Cj0.a f109314d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(Cj0.a aVar, Cj0.a aVar2, Cj0.a aVar3, int i11) {
            super(2);
            this.f109312b = aVar;
            this.f109313c = aVar2;
            this.f109314d = aVar3;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(InterfaceC3967k interfaceC3967k, Integer num) {
            num.intValue();
            int e11 = C2652m.e(1);
            Cj0.a aVar = this.f109314d;
            C11148b.a(this.f109312b, this.f109313c, aVar, interfaceC3967k, e11);
            return Unit.f71690a;
        }
    }

    public static final void a(@NotNull Cj0.a typeParam, @NotNull Cj0.a valueParam, @NotNull Cj0.a countParam, InterfaceC3967k interfaceC3967k, int i11) {
        Intrinsics.checkNotNullParameter(typeParam, "typeParam");
        Intrinsics.checkNotNullParameter(valueParam, "valueParam");
        Intrinsics.checkNotNullParameter(countParam, "countParam");
        C3969l u11 = interfaceC3967k.u(2090771593);
        if ((((u11.n(typeParam) ? 4 : 2) | i11 | (u11.n(valueParam) ? 32 : 16) | (u11.n(countParam) ? 256 : UserVerificationMethods.USER_VERIFY_PATTERN)) & 147) == 146 && u11.b()) {
            u11.j();
        } else {
            e e11 = a0.e(T.h(e.f40358c0, 16, 0.0f, 2), 1.0f);
            u11.o(1610827978);
            Object C11 = u11.C();
            if (C11 == InterfaceC3967k.a.a()) {
                C11 = a.f109308b;
                u11.x(C11);
            }
            u11.k();
            dj0.e.a(e11, (Function1) C11, a1.c.c(1231742601, new C2358b(typeParam, valueParam, countParam), u11), u11, 438, 0);
        }
        J0 m02 = u11.m0();
        if (m02 != null) {
            m02.G(new c(typeParam, valueParam, countParam, i11));
        }
    }

    public static final void b(Cj0.a aVar, String str, String str2, int i11, InterfaceC3967k interfaceC3967k, int i12) {
        Cj0.a aVar2;
        int i13;
        C3969l c3969l;
        C3969l u11 = interfaceC3967k.u(-1569423151);
        if ((i12 & 6) == 0) {
            aVar2 = aVar;
            i13 = (u11.n(aVar2) ? 4 : 2) | i12;
        } else {
            aVar2 = aVar;
            i13 = i12;
        }
        if ((i12 & 48) == 0) {
            i13 |= u11.n(str) ? 32 : 16;
        }
        if ((i12 & 384) == 0) {
            i13 |= u11.n(str2) ? 256 : UserVerificationMethods.USER_VERIFY_PATTERN;
        }
        if ((i12 & 3072) == 0) {
            i13 |= u11.r(i11) ? 2048 : UserVerificationMethods.USER_VERIFY_ALL;
        }
        if ((i13 & 1171) == 1170 && u11.b()) {
            u11.j();
            c3969l = u11;
        } else {
            c3969l = u11;
            W0.a(aVar2.b(), aVar2.c(), C5680b.a(((i13 >> 3) & 112) | 6, u11, e.f40358c0, str2), false, null, a1.c.c(-1750952981, new zj0.c(str), u11), null, Intrinsics.d(aVar2.d(), Boolean.FALSE), null, new N0(0, i11, 123), null, 0, 0, null, null, null, c3969l, 1572864, 0, 0, 8347576);
        }
        J0 m02 = c3969l.m0();
        if (m02 != null) {
            m02.G(new d(aVar2, str, str2, i11, i12));
        }
    }
}
