package sg;

import java.util.Iterator;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes3.dex */
public abstract class o extends a {

    /* renamed from: a, reason: collision with root package name */
    public final og.a f23664a;

    public o(og.a aVar) {
        this.f23664a = aVar;
    }

    @Override // og.a
    public void c(ug.s encoder, Object obj) {
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        int h10 = h(obj);
        qg.g descriptor = d();
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        ug.s a7 = encoder.a(descriptor);
        Iterator g10 = g(obj);
        for (int i5 = 0; i5 < h10; i5++) {
            a7.o(d(), i5, this.f23664a, g10.next());
        }
        a7.t(descriptor);
    }

    @Override // sg.a
    public void j(rg.a decoder, int i5, Object obj) {
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        m(i5, obj, decoder.u(d(), i5, this.f23664a, null));
    }

    public abstract void m(int i5, Object obj, Object obj2);
}
