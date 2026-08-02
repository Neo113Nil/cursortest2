package coil.compose;

import B1.InterfaceC2547p;
import B1.InterfaceC2552v;
import B1.J;
import B1.U;
import B1.W;
import B1.Y;
import B1.m0;
import B1.t0;
import D1.V;
import Z1.r;
import androidx.compose.ui.e;
import androidx.compose.ui.platform.AbstractC5245f1;
import androidx.compose.ui.platform.C5236c1;
import hd.C6915b;
import i1.InterfaceC6991k;
import k1.C7464j;
import k1.C7465k;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import m5.C8086i;
import n1.InterfaceC8410c;
import org.jetbrains.annotations.NotNull;
import q1.AbstractC8972b;

@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0080\b\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcoil/compose/ContentPainterModifier;", "LB1/J;", "Li1/k;", "Landroidx/compose/ui/platform/f1;", "Lq1/b;", "painter", "Lq1/b;", "coil-compose-base_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes8.dex */
public final /* data */ class ContentPainterModifier extends AbstractC5245f1 implements J, InterfaceC6991k {

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final e1.d f57239b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final InterfaceC2547p f57240c;

    /* renamed from: d, reason: collision with root package name */
    private final float f57241d;

    @NotNull
    private final AbstractC8972b painter;

    static final class a extends AbstractC7737t implements Function1<m0.a, Unit> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ m0 f57242b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(m0 m0Var) {
            super(1);
            this.f57242b = m0Var;
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(m0.a aVar) {
            aVar.h(this.f57242b, 0, 0, 0.0f);
            return Unit.f71690a;
        }
    }

    public ContentPainterModifier(@NotNull AsyncImagePainter asyncImagePainter, @NotNull e1.d dVar, @NotNull InterfaceC2547p interfaceC2547p) {
        super(C5236c1.a());
        this.painter = asyncImagePainter;
        this.f57239b = dVar;
        this.f57240c = interfaceC2547p;
        this.f57241d = 1.0f;
    }

    private final long a(long j11) {
        if (C7464j.g(j11)) {
            return 0L;
        }
        long f40457d = this.painter.getF40457d();
        if (f40457d == 9205357640488583168L) {
            return j11;
        }
        float f7 = C7464j.f(f40457d);
        if (Float.isInfinite(f7) || Float.isNaN(f7)) {
            f7 = C7464j.f(j11);
        }
        float d11 = C7464j.d(f40457d);
        if (Float.isInfinite(d11) || Float.isNaN(d11)) {
            d11 = C7464j.d(j11);
        }
        long a11 = C7465k.a(f7, d11);
        return t0.b(a11, this.f57240c.a(a11, j11));
    }

    private final long b(long j11) {
        float m11;
        int l11;
        float d11;
        boolean i11 = Z1.b.i(j11);
        boolean h11 = Z1.b.h(j11);
        if (!i11 || !h11) {
            boolean z11 = Z1.b.g(j11) && Z1.b.f(j11);
            long f40457d = this.painter.getF40457d();
            if (f40457d != 9205357640488583168L) {
                if (z11 && (i11 || h11)) {
                    m11 = Z1.b.k(j11);
                    l11 = Z1.b.j(j11);
                } else {
                    float f7 = C7464j.f(f40457d);
                    float d12 = C7464j.d(f40457d);
                    if (Float.isInfinite(f7) || Float.isNaN(f7)) {
                        m11 = Z1.b.m(j11);
                    } else {
                        int i12 = C8086i.f74462b;
                        m11 = kotlin.ranges.h.d(f7, Z1.b.m(j11), Z1.b.k(j11));
                    }
                    if (!Float.isInfinite(d12) && !Float.isNaN(d12)) {
                        int i13 = C8086i.f74462b;
                        d11 = kotlin.ranges.h.d(d12, Z1.b.l(j11), Z1.b.j(j11));
                        long a11 = a(C7465k.a(m11, d11));
                        return Z1.b.c(Z1.c.h(C6915b.c(C7464j.f(a11)), j11), 0, Z1.c.g(C6915b.c(C7464j.d(a11)), j11), 0, 10, j11);
                    }
                    l11 = Z1.b.l(j11);
                }
                d11 = l11;
                long a112 = a(C7465k.a(m11, d11));
                return Z1.b.c(Z1.c.h(C6915b.c(C7464j.f(a112)), j11), 0, Z1.c.g(C6915b.c(C7464j.d(a112)), j11), 0, 10, j11);
            }
            if (z11) {
                return Z1.b.c(Z1.b.k(j11), 0, Z1.b.j(j11), 0, 10, j11);
            }
        }
        return j11;
    }

    @Override // B1.J
    public final int A(@NotNull V v11, @NotNull InterfaceC2552v interfaceC2552v, int i11) {
        if (this.painter.getF40457d() == 9205357640488583168L) {
            return interfaceC2552v.T(i11);
        }
        int T11 = interfaceC2552v.T(Z1.b.j(b(Z1.c.b(0, i11, 7))));
        return Math.max(C6915b.c(C7464j.f(a(C7465k.a(T11, i11)))), T11);
    }

    @Override // B1.J
    @NotNull
    public final W D(@NotNull Y y11, @NotNull U u11, long j11) {
        W z02;
        m0 a02 = u11.a0(b(j11));
        z02 = y11.z0(a02.u0(), a02.l0(), kotlin.collections.U.c(), new a(a02));
        return z02;
    }

    @Override // B1.J
    public final int I(@NotNull V v11, @NotNull InterfaceC2552v interfaceC2552v, int i11) {
        if (this.painter.getF40457d() == 9205357640488583168L) {
            return interfaceC2552v.D(i11);
        }
        int D11 = interfaceC2552v.D(Z1.b.k(b(Z1.c.b(i11, 0, 13))));
        return Math.max(C6915b.c(C7464j.d(a(C7465k.a(i11, D11)))), D11);
    }

    @Override // B1.J
    public final int K(@NotNull V v11, @NotNull InterfaceC2552v interfaceC2552v, int i11) {
        if (this.painter.getF40457d() == 9205357640488583168L) {
            return interfaceC2552v.O(i11);
        }
        int O11 = interfaceC2552v.O(Z1.b.k(b(Z1.c.b(i11, 0, 13))));
        return Math.max(C6915b.c(C7464j.d(a(C7465k.a(i11, O11)))), O11);
    }

    @Override // i1.InterfaceC6991k
    public final void draw(@NotNull InterfaceC8410c interfaceC8410c) {
        D1.J j11 = (D1.J) interfaceC8410c;
        long a11 = a(j11.i());
        int i11 = C8086i.f74462b;
        long a12 = r.a(C6915b.c(C7464j.f(a11)), C6915b.c(C7464j.d(a11)));
        long i12 = j11.i();
        long a13 = this.f57239b.a(a12, r.a(C6915b.c(C7464j.f(i12)), C6915b.c(C7464j.d(i12))), j11.getLayoutDirection());
        float f7 = (int) (a13 >> 32);
        float f11 = (int) (a13 & 4294967295L);
        j11.w0().f().g(f7, f11);
        this.painter.m444drawx_KDEd0(interfaceC8410c, a11, this.f57241d, null);
        j11.w0().f().g(-f7, -f11);
        j11.F0();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ContentPainterModifier)) {
            return false;
        }
        ContentPainterModifier contentPainterModifier = (ContentPainterModifier) obj;
        return Intrinsics.d(this.painter, contentPainterModifier.painter) && Intrinsics.d(this.f57239b, contentPainterModifier.f57239b) && Intrinsics.d(this.f57240c, contentPainterModifier.f57240c) && Float.valueOf(this.f57241d).equals(Float.valueOf(contentPainterModifier.f57241d));
    }

    public final int hashCode() {
        return Pk0.b.a(this.f57241d, (this.f57240c.hashCode() + ((this.f57239b.hashCode() + (this.painter.hashCode() * 31)) * 31)) * 31, 31);
    }

    @Override // androidx.compose.ui.e
    @NotNull
    public final androidx.compose.ui.e l0(@NotNull androidx.compose.ui.e eVar) {
        androidx.compose.ui.e l02;
        l02 = super.l0(eVar);
        return l02;
    }

    @Override // androidx.compose.ui.e.b, androidx.compose.ui.e
    public final <R> R t(R r11, @NotNull Function2<? super R, ? super e.b, ? extends R> function2) {
        return function2.invoke(r11, this);
    }

    @NotNull
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("ContentPainterModifier(painter=");
        sb2.append(this.painter);
        sb2.append(", alignment=");
        sb2.append(this.f57239b);
        sb2.append(", contentScale=");
        sb2.append(this.f57240c);
        sb2.append(", alpha=");
        return B4.V.b(this.f57241d, ", colorFilter=null)", sb2);
    }

    @Override // B1.J
    public final int u(@NotNull V v11, @NotNull InterfaceC2552v interfaceC2552v, int i11) {
        if (this.painter.getF40457d() == 9205357640488583168L) {
            return interfaceC2552v.Y(i11);
        }
        int Y11 = interfaceC2552v.Y(Z1.b.j(b(Z1.c.b(0, i11, 7))));
        return Math.max(C6915b.c(C7464j.f(a(C7465k.a(Y11, i11)))), Y11);
    }

    @Override // androidx.compose.ui.e.b, androidx.compose.ui.e
    public final boolean w(@NotNull Function1<? super e.b, Boolean> function1) {
        boolean w11;
        w11 = super.w(function1);
        return w11;
    }
}
