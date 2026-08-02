package c1;

import c1.p;
import com.google.common.collect.AbstractC3445z;
import e1.AbstractC4134a;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public final class o {

    /* renamed from: a, reason: collision with root package name */
    public final AbstractC3445z f26773a;

    /* renamed from: c, reason: collision with root package name */
    public p.a f26775c;

    /* renamed from: d, reason: collision with root package name */
    public p.a f26776d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f26777e;

    /* renamed from: b, reason: collision with root package name */
    public final List f26774b = new ArrayList();
    private ByteBuffer[] outputBuffers = new ByteBuffer[0];

    public o(AbstractC3445z abstractC3445z) {
        this.f26773a = abstractC3445z;
        p.a aVar = p.a.f26779e;
        this.f26775c = aVar;
        this.f26776d = aVar;
        this.f26777e = false;
    }

    public p.a a(p.a aVar) {
        if (aVar.equals(p.a.f26779e)) {
            throw new p.b(aVar);
        }
        for (int i10 = 0; i10 < this.f26773a.size(); i10++) {
            p pVar = (p) this.f26773a.get(i10);
            p.a c10 = pVar.c(aVar);
            if (pVar.isActive()) {
                AbstractC4134a.g(!c10.equals(p.a.f26779e));
                aVar = c10;
            }
        }
        this.f26776d = aVar;
        return aVar;
    }

    public void b() {
        this.f26774b.clear();
        this.f26775c = this.f26776d;
        this.f26777e = false;
        for (int i10 = 0; i10 < this.f26773a.size(); i10++) {
            p pVar = (p) this.f26773a.get(i10);
            pVar.flush();
            if (pVar.isActive()) {
                this.f26774b.add(pVar);
            }
        }
        this.outputBuffers = new ByteBuffer[this.f26774b.size()];
        for (int i11 = 0; i11 <= c(); i11++) {
            this.outputBuffers[i11] = ((p) this.f26774b.get(i11)).a();
        }
    }

    public final int c() {
        return this.outputBuffers.length - 1;
    }

    public ByteBuffer d() {
        if (!g()) {
            return p.f26778a;
        }
        ByteBuffer byteBuffer = this.outputBuffers[c()];
        if (byteBuffer.hasRemaining()) {
            return byteBuffer;
        }
        h(p.f26778a);
        return this.outputBuffers[c()];
    }

    public p.a e() {
        return this.f26775c;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o)) {
            return false;
        }
        o oVar = (o) obj;
        if (this.f26773a.size() != oVar.f26773a.size()) {
            return false;
        }
        for (int i10 = 0; i10 < this.f26773a.size(); i10++) {
            if (this.f26773a.get(i10) != oVar.f26773a.get(i10)) {
                return false;
            }
        }
        return true;
    }

    public boolean f() {
        return this.f26777e && ((p) this.f26774b.get(c())).b() && !this.outputBuffers[c()].hasRemaining();
    }

    public boolean g() {
        return !this.f26774b.isEmpty();
    }

    public final void h(ByteBuffer byteBuffer) {
        boolean z10;
        for (boolean z11 = true; z11; z11 = z10) {
            z10 = false;
            int i10 = 0;
            while (i10 <= c()) {
                if (!this.outputBuffers[i10].hasRemaining()) {
                    p pVar = (p) this.f26774b.get(i10);
                    if (!pVar.b()) {
                        ByteBuffer byteBuffer2 = i10 > 0 ? this.outputBuffers[i10 - 1] : byteBuffer.hasRemaining() ? byteBuffer : p.f26778a;
                        long remaining = byteBuffer2.remaining();
                        pVar.d(byteBuffer2);
                        this.outputBuffers[i10] = pVar.a();
                        z10 |= remaining - ((long) byteBuffer2.remaining()) > 0 || this.outputBuffers[i10].hasRemaining();
                    } else if (!this.outputBuffers[i10].hasRemaining() && i10 < c()) {
                        ((p) this.f26774b.get(i10 + 1)).e();
                    }
                }
                i10++;
            }
        }
    }

    public int hashCode() {
        return this.f26773a.hashCode();
    }

    public void i() {
        if (!g() || this.f26777e) {
            return;
        }
        this.f26777e = true;
        ((p) this.f26774b.get(0)).e();
    }

    public void j(ByteBuffer byteBuffer) {
        if (!g() || this.f26777e) {
            return;
        }
        h(byteBuffer);
    }

    public void k() {
        for (int i10 = 0; i10 < this.f26773a.size(); i10++) {
            p pVar = (p) this.f26773a.get(i10);
            pVar.flush();
            pVar.reset();
        }
        this.outputBuffers = new ByteBuffer[0];
        p.a aVar = p.a.f26779e;
        this.f26775c = aVar;
        this.f26776d = aVar;
        this.f26777e = false;
    }
}
