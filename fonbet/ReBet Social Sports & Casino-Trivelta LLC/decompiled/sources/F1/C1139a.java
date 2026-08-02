package F1;

import f1.AbstractC4231i;
import java.nio.ByteBuffer;
import java.util.List;

/* renamed from: F1.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1139a {

    /* renamed from: a, reason: collision with root package name */
    public AbstractC4231i.e f3302a;

    public final boolean a(AbstractC4231i.d dVar, boolean z10) {
        AbstractC4231i.e eVar;
        AbstractC4231i.b b10;
        int i10 = dVar.f46261a;
        if (i10 == 2 || i10 == 15) {
            return true;
        }
        if (i10 != 3 || z10) {
            return ((i10 != 6 && i10 != 3) || (eVar = this.f3302a) == null || (b10 = AbstractC4231i.b.b(eVar, dVar)) == null || b10.a()) ? false : true;
        }
        return false;
    }

    public void b(ByteBuffer byteBuffer) {
        e(AbstractC4231i.e(byteBuffer));
    }

    public void c() {
        this.f3302a = null;
    }

    public int d(ByteBuffer byteBuffer, boolean z10) {
        List e10 = AbstractC4231i.e(byteBuffer);
        e(e10);
        int size = e10.size() - 1;
        int i10 = 0;
        while (size >= 0 && a((AbstractC4231i.d) e10.get(size), z10)) {
            if (((AbstractC4231i.d) e10.get(size)).f46261a == 6 || ((AbstractC4231i.d) e10.get(size)).f46261a == 3) {
                i10++;
            }
            size--;
        }
        return (i10 > 1 || size + 1 >= 8) ? byteBuffer.limit() : size >= 0 ? ((AbstractC4231i.d) e10.get(size)).f46262b.limit() : byteBuffer.position();
    }

    public final void e(List list) {
        for (int i10 = 0; i10 < list.size(); i10++) {
            if (((AbstractC4231i.d) list.get(i10)).f46261a == 1) {
                this.f3302a = AbstractC4231i.e.a((AbstractC4231i.d) list.get(i10));
            }
        }
    }
}
