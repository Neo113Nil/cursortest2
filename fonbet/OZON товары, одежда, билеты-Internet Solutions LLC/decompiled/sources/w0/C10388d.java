package w0;

import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import x0.InterfaceC10573B;

/* renamed from: w0.d, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
final class C10388d implements M {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final Function2<Z1.d, Z1.b, L> f103254a;

    /* renamed from: b, reason: collision with root package name */
    private long f103255b = Z1.c.b(0, 0, 15);

    /* renamed from: c, reason: collision with root package name */
    private float f103256c;

    /* renamed from: d, reason: collision with root package name */
    private L f103257d;

    /* JADX WARN: Multi-variable type inference failed */
    public C10388d(@NotNull Function2<? super Z1.d, ? super Z1.b, L> function2) {
        this.f103254a = function2;
    }

    @Override // w0.M
    @NotNull
    public final L a(@NotNull InterfaceC10573B interfaceC10573B, long j11) {
        if (this.f103257d != null && Z1.b.e(this.f103255b, j11) && this.f103256c == interfaceC10573B.g()) {
            L l11 = this.f103257d;
            Intrinsics.f(l11);
            return l11;
        }
        this.f103255b = j11;
        this.f103256c = interfaceC10573B.g();
        L l12 = (L) ((C10391g) this.f103254a).invoke(interfaceC10573B, Z1.b.a(j11));
        this.f103257d = l12;
        return l12;
    }
}
