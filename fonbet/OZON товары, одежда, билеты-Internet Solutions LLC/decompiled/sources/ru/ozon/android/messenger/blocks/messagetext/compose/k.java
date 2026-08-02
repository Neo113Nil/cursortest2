package ru.ozon.android.messenger.blocks.messagetext.compose;

import B1.U;
import B1.V;
import B1.W;
import B1.Y;
import B1.m0;
import K1.C3422b;
import K1.K;
import K1.M;
import K1.T;
import Z1.s;
import java.util.List;
import java.util.NoSuchElementException;
import kd.C7665d;
import kotlin.Unit;
import kotlin.collections.C7714v;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import u0.C9915y;

/* loaded from: classes10.dex */
final class k implements V {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ C9915y f85841a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ s f85842b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ M f85843c;

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ C3422b f85844d;

    /* renamed from: e, reason: collision with root package name */
    final /* synthetic */ T f85845e;

    static final class a extends AbstractC7737t implements Function1<m0.a, Unit> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ m0 f85846b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ int f85847c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ int f85848d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(int i11, int i12, m0 m0Var) {
            super(1);
            this.f85846b = m0Var;
            this.f85847c = i11;
            this.f85848d = i12;
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(m0.a aVar) {
            m0.a layout = aVar;
            Intrinsics.checkNotNullParameter(layout, "$this$layout");
            layout.h(this.f85846b, this.f85847c, this.f85848d, 0.0f);
            return Unit.f71690a;
        }
    }

    k(C9915y c9915y, s sVar, M m11, C3422b c3422b, T t2) {
        this.f85841a = c9915y;
        this.f85842b = sVar;
        this.f85843c = m11;
        this.f85844d = c3422b;
        this.f85845e = t2;
    }

    @Override // B1.V
    /* renamed from: measure-3p2s80s */
    public final W mo2measure3p2s80s(Y Layout, List<? extends U> measurables, long j11) {
        int A11;
        W z02;
        Intrinsics.checkNotNullParameter(Layout, "$this$Layout");
        Intrinsics.checkNotNullParameter(measurables, "measurables");
        U u11 = (U) C7714v.B0(measurables);
        C9915y c9915y = this.f85841a;
        s sVar = this.f85842b;
        int Y02 = Layout.Y0(androidx.compose.foundation.layout.T.d(c9915y, sVar));
        int Y03 = Layout.Y0(androidx.compose.foundation.layout.T.c(c9915y, sVar));
        int i11 = Y02 + Y03;
        int Y04 = Layout.Y0(c9915y.d()) + Layout.Y0(c9915y.a());
        long c11 = Z1.b.c(0, 0, 0, 0, 10, Z1.c.k(-i11, -Y04, j11));
        K b11 = M.b(this.f85843c, this.f85844d, this.f85845e, 3, true, Integer.MAX_VALUE, c11, null, null, null, 1952);
        boolean z11 = Z1.b.m(j11) == Z1.b.k(j11);
        if (b11.m() <= 1 || z11) {
            A11 = (int) (b11.A() >> 32);
        } else {
            C7665d it = kotlin.ranges.h.o(0, b11.m()).iterator();
            if (!it.hasNext()) {
                throw new NoSuchElementException();
            }
            int b12 = it.b();
            float s11 = b11.s(b12) - b11.r(b12);
            while (it.hasNext()) {
                int b13 = it.b();
                s11 = Math.max(s11, b11.s(b13) - b11.r(b13));
            }
            A11 = (int) Math.ceil(s11);
        }
        int h11 = Z1.c.h(A11 + i11, j11);
        int i12 = h11 - i11;
        int i13 = i12 < 0 ? 0 : i12;
        m0 a02 = u11.a0(Z1.b.c(i13, i13, 0, 0, 12, c11));
        z02 = Layout.z0(h11, Z1.c.g(a02.l0() + Y04, j11), kotlin.collections.U.c(), new a(Y02, Y03, a02));
        return z02;
    }
}
