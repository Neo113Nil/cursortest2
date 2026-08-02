package r1;

import Z1.r;
import Z1.s;
import kotlin.jvm.functions.Function1;
import l1.C7804W;
import l1.C7807Z;
import l1.C7809a0;
import l1.C7844u;
import l1.C7848y;
import l1.InterfaceC7802U;
import n1.C8408a;
import n1.InterfaceC8412e;
import org.jetbrains.annotations.NotNull;
import r1.k;

/* renamed from: r1.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C9153a {

    /* renamed from: a, reason: collision with root package name */
    private C7848y f82656a;

    /* renamed from: b, reason: collision with root package name */
    private C7844u f82657b;

    /* renamed from: c, reason: collision with root package name */
    private InterfaceC8412e f82658c;

    /* renamed from: d, reason: collision with root package name */
    private long f82659d = 0;

    /* renamed from: e, reason: collision with root package name */
    private int f82660e = 0;

    /* renamed from: f, reason: collision with root package name */
    @NotNull
    private final C8408a f82661f = new C8408a();

    public final void a(int i11, long j11, @NotNull InterfaceC8412e interfaceC8412e, @NotNull s sVar, @NotNull Function1 function1) {
        long j12;
        this.f82658c = interfaceC8412e;
        C7848y c7848y = this.f82656a;
        C7844u c7844u = this.f82657b;
        if (c7848y == null || c7844u == null || ((int) (j11 >> 32)) > c7848y.getWidth() || ((int) (j11 & 4294967295L)) > c7848y.getHeight() || this.f82660e != i11) {
            c7848y = S8.a.b((int) (j11 >> 32), (int) (j11 & 4294967295L), i11);
            c7844u = C7804W.a(c7848y);
            this.f82656a = c7848y;
            this.f82657b = c7844u;
            this.f82660e = i11;
        }
        this.f82659d = j11;
        long b11 = r.b(j11);
        C8408a c8408a = this.f82661f;
        C8408a.C1285a t2 = c8408a.t();
        Z1.d a11 = t2.a();
        s b12 = t2.b();
        InterfaceC7802U c11 = t2.c();
        long d11 = t2.d();
        C8408a.C1285a t11 = c8408a.t();
        t11.j(interfaceC8412e);
        t11.k(sVar);
        t11.i(c7844u);
        t11.l(b11);
        c7844u.save();
        j12 = C7807Z.f72248b;
        InterfaceC8412e.Q(c8408a, j12, 0L, 0L, 0.0f, null, 62);
        ((k.b) function1).invoke(c8408a);
        c7844u.p();
        C8408a.C1285a t12 = c8408a.t();
        t12.j(a11);
        t12.k(b12);
        t12.i(c11);
        t12.l(d11);
        c7848y.c();
    }

    public final void b(@NotNull InterfaceC8412e interfaceC8412e, float f7, C7809a0 c7809a0) {
        C7848y c7848y = this.f82656a;
        if (c7848y != null) {
            InterfaceC8412e.y1(interfaceC8412e, c7848y, 0L, this.f82659d, 0L, 0L, f7, null, c7809a0, 0, 0, 858);
        } else {
            A1.a.b("drawCachedImage must be invoked first before attempting to draw the result into another destination");
            throw null;
        }
    }

    public final C7848y c() {
        return this.f82656a;
    }
}
