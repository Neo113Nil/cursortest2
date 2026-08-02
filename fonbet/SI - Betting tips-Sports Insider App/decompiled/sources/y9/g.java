package y9;

import java.io.IOException;
import java.nio.channels.WritableByteChannel;
import java.util.ArrayList;
import java.util.Iterator;
import wg.q;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class g extends b {

    /* renamed from: d, reason: collision with root package name */
    public final ArrayList f25749d;

    public g(a aVar, ArrayList arrayList) {
        super(aVar);
        this.f25749d = arrayList;
    }

    public static g j(b bVar, b bVar2) {
        if (bVar2 instanceof g) {
            throw new IllegalArgumentException("The next batch cannot be a MergedEventBatch.");
        }
        if (bVar instanceof g) {
            g gVar = (g) bVar;
            gVar.f25749d.add(bVar2);
            return gVar;
        }
        ArrayList arrayList = new ArrayList(2);
        arrayList.add(bVar);
        arrayList.add(bVar2);
        return new g(bVar.f25740a, arrayList);
    }

    @Override // y9.b
    public final long b() {
        Iterator it = this.f25749d.iterator();
        long j = 0;
        while (it.hasNext()) {
            j += ((b) it.next()).b();
        }
        return j;
    }

    @Override // y9.b
    public final void c() {
        Iterator it = this.f25749d.iterator();
        while (it.hasNext()) {
            ((b) it.next()).c();
        }
    }

    @Override // y9.b
    public final boolean f() {
        return true;
    }

    @Override // y9.b
    public final void g(q qVar) {
        throw new IOException("MergedEventBatch instances do not accept new events!");
    }

    @Override // y9.b
    public final void i(WritableByteChannel writableByteChannel) {
        Iterator it = this.f25749d.iterator();
        while (it.hasNext()) {
            ((b) it.next()).i(writableByteChannel);
        }
    }
}
