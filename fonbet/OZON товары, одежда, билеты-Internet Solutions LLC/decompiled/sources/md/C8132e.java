package md;

import Nd.h;
import Nd.s;
import Pd.g;
import Rd.f;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.jvm.internal.InterfaceC7733o;
import kotlin.jvm.internal.Intrinsics;
import nd.C8545j0;
import nd.C8546k;
import nd.g1;
import org.jetbrains.annotations.NotNull;
import td.c0;

/* renamed from: md.e, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C8132e {
    public static final C8545j0 a(@NotNull InterfaceC7733o interfaceC7733o) {
        Intrinsics.checkNotNullParameter(interfaceC7733o, "<this>");
        Metadata metadata = (Metadata) interfaceC7733o.getClass().getAnnotation(Metadata.class);
        if (metadata != null) {
            String[] d12 = metadata.d1();
            if (d12.length == 0) {
                d12 = null;
            }
            if (d12 != null) {
                Pair<f, h> h11 = Rd.h.h(d12, metadata.d2());
                f a11 = h11.a();
                h b11 = h11.b();
                Rd.e eVar = new Rd.e(metadata.mv(), (metadata.xi() & 8) != 0);
                Class<?> cls = interfaceC7733o.getClass();
                s e02 = b11.e0();
                Intrinsics.checkNotNullExpressionValue(e02, "getTypeTable(...)");
                return new C8545j0(C8546k.f76996c, (c0) g1.f(cls, b11, a11, new g(e02), eVar, C8131d.f74727a));
            }
        }
        return null;
    }
}
