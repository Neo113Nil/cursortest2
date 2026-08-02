package v0;

import B1.m0;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import x0.InterfaceC10573B;
import x0.InterfaceC10576E;

/* renamed from: v0.D, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC10159D implements InterfaceC10576E<C10158C> {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final o f101458a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final InterfaceC10573B f101459b;

    /* renamed from: c, reason: collision with root package name */
    private final long f101460c;

    public AbstractC10159D(long j11, boolean z11, o oVar, InterfaceC10573B interfaceC10573B) {
        this.f101458a = oVar;
        this.f101459b = interfaceC10573B;
        this.f101460c = Z1.c.b(z11 ? Z1.b.k(j11) : Integer.MAX_VALUE, z11 ? Integer.MAX_VALUE : Z1.b.j(j11), 5);
    }

    public static C10158C c(v vVar, int i11) {
        o oVar = ((AbstractC10159D) vVar).f101458a;
        Object d11 = oVar.d(i11);
        Object c11 = oVar.c(i11);
        InterfaceC10573B interfaceC10573B = ((AbstractC10159D) vVar).f101459b;
        long j11 = ((AbstractC10159D) vVar).f101460c;
        return vVar.b(i11, d11, c11, interfaceC10573B.Z(i11, j11), j11);
    }

    @Override // x0.InterfaceC10576E
    public final C10158C a(int i11, int i12, int i13, long j11) {
        o oVar = this.f101458a;
        return b(i11, oVar.d(i11), oVar.c(i11), this.f101459b.Z(i11, j11), j11);
    }

    @NotNull
    public abstract C10158C b(int i11, @NotNull Object obj, Object obj2, @NotNull List<? extends m0> list, long j11);

    public final long d() {
        return this.f101460c;
    }

    @NotNull
    public final androidx.compose.foundation.lazy.layout.h e() {
        return this.f101458a.a();
    }
}
