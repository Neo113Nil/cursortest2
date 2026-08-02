package ci;

import Zh.p;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public interface d {
    void B(bi.f fVar, int i10, p pVar, Object obj);

    void C(bi.f fVar, int i10, p pVar, Object obj);

    void F(bi.f fVar, int i10, boolean z10);

    void G(bi.f fVar, int i10, String str);

    void b(bi.f fVar);

    void e(bi.f fVar, int i10, long j10);

    void f(bi.f fVar, int i10, int i11);

    void k(bi.f fVar, int i10, double d10);

    void l(bi.f fVar, int i10, char c10);

    default boolean m(bi.f descriptor, int i10) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        return true;
    }

    void n(bi.f fVar, int i10, byte b10);

    void p(bi.f fVar, int i10, float f10);

    f r(bi.f fVar, int i10);

    void x(bi.f fVar, int i10, short s10);
}
