package c1;

import android.util.SparseArray;
import c1.p;
import e1.AbstractC4134a;
import java.nio.ByteBuffer;

/* loaded from: classes.dex */
public final class s extends r {

    /* renamed from: i, reason: collision with root package name */
    public final SparseArray f26792i = new SparseArray();

    @Override // c1.p
    public void d(ByteBuffer byteBuffer) {
        t tVar = (t) AbstractC4134a.i((t) this.f26792i.get(this.f26785b.f26781b));
        int remaining = byteBuffer.remaining() / this.f26785b.f26783d;
        ByteBuffer l10 = l(this.f26786c.f26783d * remaining);
        n.f(byteBuffer, this.f26785b, l10, this.f26786c, tVar, remaining, false, true);
        l10.flip();
    }

    @Override // c1.r
    public p.a h(p.a aVar) {
        if (aVar.f26782c != 2) {
            throw new p.b(aVar);
        }
        t tVar = (t) this.f26792i.get(aVar.f26781b);
        if (tVar != null) {
            return tVar.l() ? p.a.f26779e : new p.a(aVar.f26780a, tVar.j(), 2);
        }
        throw new p.b("No mixing matrix for input channel count", aVar);
    }

    public void m(t tVar) {
        this.f26792i.put(tVar.h(), tVar);
    }
}
