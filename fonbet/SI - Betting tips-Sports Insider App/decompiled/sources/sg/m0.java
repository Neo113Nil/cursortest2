package sg;

import java.util.Iterator;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes3.dex */
public abstract class m0 extends a {
    @Override // og.a
    public final void c(ug.s encoder, Object obj) {
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        h(obj);
        g0 descriptor = ((h0) this).f23637a;
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        ug.s a7 = encoder.a(descriptor);
        Iterator g10 = g(obj);
        int i5 = 0;
        while (g10.hasNext()) {
            Map.Entry entry = (Map.Entry) g10.next();
            Object key = entry.getKey();
            Object value = entry.getValue();
            int i10 = i5 + 1;
            a7.o(descriptor, i5, e1.f23623a, key);
            i5 += 2;
            a7.o(descriptor, i10, tg.o.f23954a, value);
        }
        a7.t(descriptor);
    }

    @Override // sg.a
    public final void j(rg.a decoder, int i5, Object obj) {
        Map builder = (Map) obj;
        tg.o oVar = tg.o.f23954a;
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        Intrinsics.checkNotNullParameter(builder, "builder");
        e1 e1Var = e1.f23623a;
        g0 g0Var = ((h0) this).f23637a;
        Object u10 = decoder.u(g0Var, i5, e1Var, null);
        int z5 = decoder.z(g0Var);
        if (z5 != i5 + 1) {
            throw new IllegalArgumentException(androidx.appcompat.widget.c1.j(i5, "Value must follow key in a map, index for key: ", ", returned index for value: ", z5).toString());
        }
        builder.put(u10, (!builder.containsKey(u10) || (tg.o.f23955b.f22166b instanceof qg.f)) ? decoder.u(g0Var, z5, oVar, null) : decoder.u(g0Var, z5, oVar, kotlin.collections.n0.d(builder, u10)));
    }
}
