package ru.ozon.android.messenger.framework.presentation.common.popupmenu.compose;

import B1.U;
import B1.V;
import B1.W;
import B1.Y;
import B1.m0;
import java.util.List;
import java.util.NoSuchElementException;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes10.dex */
final class e implements V {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ n f90825a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ int f90826b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ long f90827c;

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ int f90828d;

    static final class a extends AbstractC7737t implements Function1<m0.a, Unit> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ m0 f90829b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ int f90830c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ int f90831d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ n f90832e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ m0 f90833f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ long f90834g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ int f90835h;

        /* renamed from: i, reason: collision with root package name */
        final /* synthetic */ int f90836i;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(m0 m0Var, int i11, int i12, n nVar, m0 m0Var2, long j11, int i13, int i14) {
            super(1);
            this.f90829b = m0Var;
            this.f90830c = i11;
            this.f90831d = i12;
            this.f90832e = nVar;
            this.f90833f = m0Var2;
            this.f90834g = j11;
            this.f90835h = i13;
            this.f90836i = i14;
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(m0.a aVar) {
            m0.a layout = aVar;
            Intrinsics.checkNotNullParameter(layout, "$this$layout");
            m0 m0Var = this.f90829b;
            int i11 = this.f90830c;
            int i12 = this.f90831d;
            layout.d(m0Var, i11, i12, 0.0f);
            n nVar = this.f90832e;
            long c11 = nVar.c();
            m0 m0Var2 = this.f90833f;
            int u02 = m0Var2.u0();
            int l02 = m0Var2.l0();
            boolean d11 = nVar.d();
            long j11 = this.f90834g;
            int k11 = Z1.b.k(j11);
            int j12 = Z1.b.j(j11);
            int i13 = this.f90836i;
            int i14 = ((int) (c11 & 4294967295L)) + i12 + i13;
            int i15 = (i12 - l02) - i13;
            int i16 = l02 + i14;
            int i17 = this.f90835h;
            if (i16 > j12) {
                i14 = i15 < i17 ? i17 : i15;
            }
            int i18 = (k11 - u02) - i17;
            if (i18 < i17) {
                i18 = i17;
            }
            long a11 = Z1.n.a(d11 ? kotlin.ranges.h.e((i11 + ((int) (c11 >> 32))) - u02, i17, i18) : kotlin.ranges.h.e(i11, i17, i18), i14);
            layout.d(m0Var2, (int) (a11 >> 32), (int) (a11 & 4294967295L), 0.0f);
            return Unit.f71690a;
        }
    }

    e(n nVar, int i11, long j11, int i12) {
        this.f90825a = nVar;
        this.f90826b = i11;
        this.f90827c = j11;
        this.f90828d = i12;
    }

    @Override // B1.V
    /* renamed from: measure-3p2s80s */
    public final W mo2measure3p2s80s(Y Layout, List<? extends U> measurables, long j11) {
        W z02;
        Intrinsics.checkNotNullParameter(Layout, "$this$Layout");
        Intrinsics.checkNotNullParameter(measurables, "measurables");
        n nVar = this.f90825a;
        int c11 = (int) (nVar.c() >> 32);
        int c12 = (int) (nVar.c() & 4294967295L);
        if (c11 < 0 || c12 < 0) {
            Z1.l.a("width(" + c11 + ") and height(" + c12 + ") must be >= 0");
            throw null;
        }
        long i11 = Z1.c.i(c11, c11, c12, c12);
        List<? extends U> list = measurables;
        for (U u11 : list) {
            if (Intrinsics.d(androidx.compose.ui.layout.a.a(u11), "bubble")) {
                m0 a02 = u11.a0(i11);
                int k11 = Z1.b.k(j11) - (this.f90826b * 2);
                if (k11 < 0) {
                    k11 = 0;
                }
                for (U u12 : list) {
                    if (Intrinsics.d(androidx.compose.ui.layout.a.a(u12), "menu")) {
                        m0 a03 = u12.a0(Z1.c.b(k11, 0, 13));
                        int b11 = (int) (nVar.b() >> 32);
                        long j12 = this.f90827c;
                        int b12 = ((int) (nVar.b() & 4294967295L)) - ((int) (j12 & 4294967295L));
                        z02 = Layout.z0(Z1.b.k(j11), Z1.b.j(j11), kotlin.collections.U.c(), new a(a02, b11 - ((int) (j12 >> 32)), b12, nVar, a03, j11, this.f90826b, this.f90828d));
                        return z02;
                    }
                }
                throw new NoSuchElementException("Collection contains no element matching the predicate.");
            }
        }
        throw new NoSuchElementException("Collection contains no element matching the predicate.");
    }
}
