package k3;

import com.google.common.collect.AbstractC5880y;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import k3.e;

/* loaded from: classes.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    private final AbstractC5880y<e> f70378a;

    /* renamed from: b, reason: collision with root package name */
    private final ArrayList f70379b = new ArrayList();

    /* renamed from: c, reason: collision with root package name */
    private ByteBuffer[] f70380c = new ByteBuffer[0];

    /* renamed from: d, reason: collision with root package name */
    private boolean f70381d;

    public d(AbstractC5880y<e> abstractC5880y) {
        this.f70378a = abstractC5880y;
        e.a aVar = e.a.f70383e;
        this.f70381d = false;
    }

    private int c() {
        return this.f70380c.length - 1;
    }

    private void g(ByteBuffer byteBuffer) {
        boolean z11;
        for (boolean z12 = true; z12; z12 = z11) {
            z11 = false;
            int i11 = 0;
            while (i11 <= c()) {
                if (!this.f70380c[i11].hasRemaining()) {
                    ArrayList arrayList = this.f70379b;
                    e eVar = (e) arrayList.get(i11);
                    if (!eVar.a()) {
                        ByteBuffer byteBuffer2 = i11 > 0 ? this.f70380c[i11 - 1] : byteBuffer.hasRemaining() ? byteBuffer : e.f70382a;
                        long remaining = byteBuffer2.remaining();
                        eVar.b(byteBuffer2);
                        this.f70380c[i11] = eVar.d();
                        z11 |= remaining - ((long) byteBuffer2.remaining()) > 0 || this.f70380c[i11].hasRemaining();
                    } else if (!this.f70380c[i11].hasRemaining() && i11 < c()) {
                        ((e) arrayList.get(i11 + 1)).c();
                    }
                }
                i11++;
            }
        }
    }

    public final e.a a(e.a aVar) throws e.b {
        if (aVar.equals(e.a.f70383e)) {
            throw new e.b(aVar);
        }
        int i11 = 0;
        while (true) {
            AbstractC5880y<e> abstractC5880y = this.f70378a;
            if (i11 >= abstractC5880y.size()) {
                return aVar;
            }
            e eVar = abstractC5880y.get(i11);
            e.a e11 = eVar.e(aVar);
            if (eVar.isActive()) {
                G10.a.h(!e11.equals(e.a.f70383e));
                aVar = e11;
            }
            i11++;
        }
    }

    public final void b() {
        ArrayList arrayList = this.f70379b;
        arrayList.clear();
        this.f70381d = false;
        int i11 = 0;
        while (true) {
            AbstractC5880y<e> abstractC5880y = this.f70378a;
            if (i11 >= abstractC5880y.size()) {
                break;
            }
            e eVar = abstractC5880y.get(i11);
            eVar.flush();
            if (eVar.isActive()) {
                arrayList.add(eVar);
            }
            i11++;
        }
        this.f70380c = new ByteBuffer[arrayList.size()];
        for (int i12 = 0; i12 <= c(); i12++) {
            this.f70380c[i12] = ((e) arrayList.get(i12)).d();
        }
    }

    public final ByteBuffer d() {
        if (!f()) {
            return e.f70382a;
        }
        ByteBuffer byteBuffer = this.f70380c[c()];
        if (byteBuffer.hasRemaining()) {
            return byteBuffer;
        }
        g(e.f70382a);
        return this.f70380c[c()];
    }

    public final boolean e() {
        return this.f70381d && ((e) this.f70379b.get(c())).a() && !this.f70380c[c()].hasRemaining();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        AbstractC5880y<e> abstractC5880y = this.f70378a;
        if (abstractC5880y.size() != dVar.f70378a.size()) {
            return false;
        }
        for (int i11 = 0; i11 < abstractC5880y.size(); i11++) {
            if (abstractC5880y.get(i11) != dVar.f70378a.get(i11)) {
                return false;
            }
        }
        return true;
    }

    public final boolean f() {
        return !this.f70379b.isEmpty();
    }

    public final void h() {
        if (!f() || this.f70381d) {
            return;
        }
        this.f70381d = true;
        ((e) this.f70379b.get(0)).c();
    }

    public final int hashCode() {
        return this.f70378a.hashCode();
    }

    public final void i(ByteBuffer byteBuffer) {
        if (!f() || this.f70381d) {
            return;
        }
        g(byteBuffer);
    }

    public final void j() {
        int i11 = 0;
        while (true) {
            AbstractC5880y<e> abstractC5880y = this.f70378a;
            if (i11 >= abstractC5880y.size()) {
                this.f70380c = new ByteBuffer[0];
                e.a aVar = e.a.f70383e;
                this.f70381d = false;
                return;
            } else {
                e eVar = abstractC5880y.get(i11);
                eVar.flush();
                eVar.reset();
                i11++;
            }
        }
    }
}
