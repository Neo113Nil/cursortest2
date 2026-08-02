package sg;

import java.util.Iterator;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes3.dex */
public abstract class a implements og.a {
    @Override // og.a
    public Object a(rg.b decoder) {
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        return i(decoder);
    }

    public abstract Object e();

    public abstract int f(Object obj);

    public abstract Iterator g(Object obj);

    public abstract int h(Object obj);

    public final Object i(rg.b decoder) {
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        Object e7 = e();
        int f6 = f(e7);
        rg.a w10 = decoder.w(d());
        while (true) {
            int z5 = w10.z(d());
            if (z5 == -1) {
                w10.g(d());
                return l(e7);
            }
            j(w10, z5 + f6, e7);
        }
    }

    public abstract void j(rg.a aVar, int i5, Object obj);

    public abstract Object k(Object obj);

    public abstract Object l(Object obj);
}
