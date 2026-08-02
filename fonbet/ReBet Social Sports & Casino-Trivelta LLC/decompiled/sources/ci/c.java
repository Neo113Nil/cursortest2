package ci;

import Zh.InterfaceC1900a;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public interface c {

    /* renamed from: a, reason: collision with root package name */
    public static final a f27857a = a.f27858a;

    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ a f27858a = new a();
    }

    static /* synthetic */ Object u(c cVar, bi.f fVar, int i10, InterfaceC1900a interfaceC1900a, Object obj, int i11, Object obj2) {
        if (obj2 != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: decodeSerializableElement");
        }
        if ((i11 & 8) != 0) {
            obj = null;
        }
        return cVar.i(fVar, i10, interfaceC1900a, obj);
    }

    double B(bi.f fVar, int i10);

    Object C(bi.f fVar, int i10, InterfaceC1900a interfaceC1900a, Object obj);

    short D(bi.f fVar, int i10);

    int F(bi.f fVar, int i10);

    gi.e a();

    void b(bi.f fVar);

    int e(bi.f fVar);

    long g(bi.f fVar, int i10);

    default int h(bi.f descriptor) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        return -1;
    }

    Object i(bi.f fVar, int i10, InterfaceC1900a interfaceC1900a, Object obj);

    byte l(bi.f fVar, int i10);

    e m(bi.f fVar, int i10);

    float o(bi.f fVar, int i10);

    default boolean q() {
        return false;
    }

    char r(bi.f fVar, int i10);

    String s(bi.f fVar, int i10);

    boolean t(bi.f fVar, int i10);
}
