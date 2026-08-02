package w0;

import B1.m0;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import x0.InterfaceC10573B;
import x0.InterfaceC10575D;
import x0.InterfaceC10576E;

/* loaded from: classes8.dex */
public final class v implements InterfaceC10576E {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final InterfaceC10396l f103305a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final InterfaceC10573B f103306b;

    /* renamed from: c, reason: collision with root package name */
    private final int f103307c;

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ InterfaceC10573B f103308d;

    /* renamed from: e, reason: collision with root package name */
    final /* synthetic */ O f103309e;

    /* renamed from: f, reason: collision with root package name */
    final /* synthetic */ int f103310f;

    /* renamed from: g, reason: collision with root package name */
    final /* synthetic */ int f103311g;

    /* renamed from: h, reason: collision with root package name */
    final /* synthetic */ long f103312h;

    v(InterfaceC10396l interfaceC10396l, InterfaceC10573B interfaceC10573B, int i11, O o11, int i12, int i13, long j11) {
        this.f103308d = interfaceC10573B;
        this.f103309e = o11;
        this.f103310f = i12;
        this.f103311g = i13;
        this.f103312h = j11;
        this.f103305a = interfaceC10396l;
        this.f103306b = interfaceC10573B;
        this.f103307c = i11;
    }

    @Override // x0.InterfaceC10576E
    public final InterfaceC10575D a(int i11, int i12, int i13, long j11) {
        return c(i11, i12, i13, this.f103307c, j11);
    }

    @NotNull
    public final C10378E b(int i11, int i12, long j11) {
        return c(i11, 0, i12, this.f103307c, j11);
    }

    @NotNull
    public final C10378E c(int i11, int i12, int i13, int i14, long j11) {
        int l11;
        InterfaceC10396l interfaceC10396l = this.f103305a;
        Object d11 = interfaceC10396l.d(i11);
        Object c11 = interfaceC10396l.c(i11);
        List<m0> Z11 = this.f103306b.Z(i11, j11);
        if (Z1.b.i(j11)) {
            l11 = Z1.b.m(j11);
        } else {
            if (!Z1.b.h(j11)) {
                throw new IllegalArgumentException("does not have fixed height");
            }
            l11 = Z1.b.l(j11);
        }
        return new C10378E(i11, d11, l11, i14, this.f103308d.getLayoutDirection(), this.f103310f, this.f103311g, Z11, this.f103312h, c11, this.f103309e.p(), j11, i12, i13);
    }

    @NotNull
    public final androidx.compose.foundation.lazy.layout.h d() {
        return this.f103305a.a();
    }
}
