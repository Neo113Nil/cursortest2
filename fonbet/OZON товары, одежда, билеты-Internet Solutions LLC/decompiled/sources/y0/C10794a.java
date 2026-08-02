package y0;

import java.util.concurrent.CancellationException;
import k1.C7459e;
import org.jetbrains.annotations.NotNull;
import r0.EnumC9142v;
import w1.InterfaceC10406a;

/* renamed from: y0.a, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
final class C10794a implements InterfaceC10406a {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final b0 f105732a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final EnumC9142v f105733b;

    public C10794a(@NotNull b0 b0Var, @NotNull EnumC9142v enumC9142v) {
        this.f105732a = b0Var;
        this.f105733b = enumC9142v;
    }

    @Override // w1.InterfaceC10406a
    public final Object O(long j11, long j12, @NotNull kotlin.coroutines.d<? super Z1.w> dVar) {
        return Z1.w.a(this.f105733b == EnumC9142v.Vertical ? Z1.w.b(0.0f, 0.0f, 2, j12) : Z1.w.b(0.0f, 0.0f, 1, j12));
    }

    @Override // w1.InterfaceC10406a
    public final long f0(int i11, long j11, long j12) {
        if (i11 != 2) {
            return 0L;
        }
        if ((this.f105733b == EnumC9142v.Horizontal ? C7459e.g(j12) : C7459e.h(j12)) == 0.0f) {
            return 0L;
        }
        throw new CancellationException("Scroll cancelled");
    }

    @Override // w1.InterfaceC10406a
    /* renamed from: onPreScroll-OzD1aCk */
    public final long mo12onPreScrollOzD1aCk(long j11, int i11) {
        if (i11 != 1) {
            return 0L;
        }
        b0 b0Var = this.f105732a;
        if (Math.abs(b0Var.s()) <= 1.0E-6d) {
            return 0L;
        }
        float s11 = b0Var.s() * b0Var.D();
        float g10 = ((b0Var.z().g() + b0Var.z().getPageSize()) * (-Math.signum(b0Var.s()))) + s11;
        if (b0Var.s() > 0.0f) {
            g10 = s11;
            s11 = g10;
        }
        EnumC9142v enumC9142v = EnumC9142v.Horizontal;
        EnumC9142v enumC9142v2 = this.f105733b;
        float f7 = -b0Var.c(-kotlin.ranges.h.d(enumC9142v2 == enumC9142v ? C7459e.g(j11) : C7459e.h(j11), s11, g10));
        float g11 = enumC9142v2 == enumC9142v ? f7 : C7459e.g(j11);
        if (enumC9142v2 != EnumC9142v.Vertical) {
            f7 = C7459e.h(j11);
        }
        return (Float.floatToRawIntBits(g11) << 32) | (Float.floatToRawIntBits(f7) & 4294967295L);
    }
}
