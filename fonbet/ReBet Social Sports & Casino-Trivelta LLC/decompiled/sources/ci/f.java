package ci;

import Zh.p;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public interface f {
    void E(int i10);

    void H(String str);

    gi.e a();

    d c(bi.f fVar);

    void g(double d10);

    void h(byte b10);

    default void i(p serializer, Object obj) {
        Intrinsics.checkNotNullParameter(serializer, "serializer");
        serializer.serialize(this, obj);
    }

    default d j(bi.f descriptor, int i10) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        return c(descriptor);
    }

    void o(bi.f fVar, int i10);

    default void q(p serializer, Object obj) {
        Intrinsics.checkNotNullParameter(serializer, "serializer");
        if (serializer.getDescriptor().b()) {
            i(serializer, obj);
        } else if (obj == null) {
            u();
        } else {
            A();
            i(serializer, obj);
        }
    }

    void s(long j10);

    f t(bi.f fVar);

    void u();

    void v(short s10);

    void w(boolean z10);

    void y(float f10);

    void z(char c10);

    default void A() {
    }
}
