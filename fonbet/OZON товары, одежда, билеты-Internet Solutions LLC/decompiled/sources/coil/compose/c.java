package coil.compose;

import B1.InterfaceC2552v;
import B1.InterfaceC2553w;
import B1.U;
import B1.V;
import B1.W;
import B1.Y;
import B1.m0;
import D1.AbstractC2810k0;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes8.dex */
final class c implements V {

    /* renamed from: a, reason: collision with root package name */
    public static final c f57270a = new c();

    static final class a extends AbstractC7737t implements Function1<m0.a, Unit> {

        /* renamed from: b, reason: collision with root package name */
        public static final a f57271b = new a(1);

        @Override // kotlin.jvm.functions.Function1
        public final /* bridge */ /* synthetic */ Unit invoke(m0.a aVar) {
            return Unit.f71690a;
        }
    }

    @Override // B1.V
    public final int maxIntrinsicHeight(@NotNull InterfaceC2553w interfaceC2553w, @NotNull List<? extends InterfaceC2552v> list, int i11) {
        int maxIntrinsicHeight;
        maxIntrinsicHeight = super.maxIntrinsicHeight((AbstractC2810k0) interfaceC2553w, list, i11);
        return maxIntrinsicHeight;
    }

    @Override // B1.V
    public final int maxIntrinsicWidth(@NotNull InterfaceC2553w interfaceC2553w, @NotNull List<? extends InterfaceC2552v> list, int i11) {
        int maxIntrinsicWidth;
        maxIntrinsicWidth = super.maxIntrinsicWidth((AbstractC2810k0) interfaceC2553w, list, i11);
        return maxIntrinsicWidth;
    }

    @Override // B1.V
    @NotNull
    /* renamed from: measure-3p2s80s */
    public final W mo2measure3p2s80s(@NotNull Y y11, @NotNull List<? extends U> list, long j11) {
        W z02;
        z02 = y11.z0(Z1.b.m(j11), Z1.b.l(j11), kotlin.collections.U.c(), a.f57271b);
        return z02;
    }

    @Override // B1.V
    public final int minIntrinsicHeight(@NotNull InterfaceC2553w interfaceC2553w, @NotNull List<? extends InterfaceC2552v> list, int i11) {
        int minIntrinsicHeight;
        minIntrinsicHeight = super.minIntrinsicHeight((AbstractC2810k0) interfaceC2553w, list, i11);
        return minIntrinsicHeight;
    }

    @Override // B1.V
    public final int minIntrinsicWidth(@NotNull InterfaceC2553w interfaceC2553w, @NotNull List<? extends InterfaceC2552v> list, int i11) {
        int minIntrinsicWidth;
        minIntrinsicWidth = super.minIntrinsicWidth((AbstractC2810k0) interfaceC2553w, list, i11);
        return minIntrinsicWidth;
    }
}
