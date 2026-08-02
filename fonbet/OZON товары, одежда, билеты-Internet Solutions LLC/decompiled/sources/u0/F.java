package u0;

import B1.m0;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes.dex */
final class F implements B1.V {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    public static final F f99600a = new F();

    static final class a extends AbstractC7737t implements Function1<m0.a, Unit> {

        /* renamed from: b, reason: collision with root package name */
        public static final a f99601b = new a(1);

        @Override // kotlin.jvm.functions.Function1
        public final /* bridge */ /* synthetic */ Unit invoke(m0.a aVar) {
            return Unit.f71690a;
        }
    }

    @Override // B1.V
    @NotNull
    /* renamed from: measure-3p2s80s */
    public final B1.W mo2measure3p2s80s(@NotNull B1.Y y11, @NotNull List<? extends B1.U> list, long j11) {
        B1.W z02;
        z02 = y11.z0(Z1.b.i(j11) ? Z1.b.k(j11) : 0, Z1.b.h(j11) ? Z1.b.j(j11) : 0, kotlin.collections.U.c(), a.f99601b);
        return z02;
    }
}
