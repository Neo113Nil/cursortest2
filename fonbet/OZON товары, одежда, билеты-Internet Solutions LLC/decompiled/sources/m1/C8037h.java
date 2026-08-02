package m1;

import androidx.collection.C;
import androidx.collection.C5145n;
import org.jetbrains.annotations.NotNull;

/* renamed from: m1.h, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C8037h {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private static final C<C8036g> f73967a;

    static {
        int c11 = C8034e.s().c() | (C8034e.s().c() << 6);
        p s11 = C8034e.s();
        C8035f c8035f = new C8035f(s11, s11, 1);
        int c12 = C8034e.s().c() | (C8034e.p().c() << 6);
        C8036g c8036g = new C8036g(C8034e.s(), C8034e.p(), 0);
        int c13 = C8034e.p().c() | (C8034e.s().c() << 6);
        C8036g c8036g2 = new C8036g(C8034e.p(), C8034e.s(), 0);
        int i11 = C5145n.f38723b;
        C<C8036g> c14 = new C<>();
        c14.j(c11, c8035f);
        c14.j(c12, c8036g);
        c14.j(c13, c8036g2);
        f73967a = c14;
    }

    @NotNull
    public static final C<C8036g> a() {
        return f73967a;
    }
}
