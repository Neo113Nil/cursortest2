package t2;

import android.util.SparseArray;
import c1.p;
import e1.AbstractC4134a;
import io.agora.rtc2.video.FaceShapeAreaOptions;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import kotlin.jvm.internal.LongCompanionObject;
import l1.AbstractC5366l;
import t2.InterfaceC6391e;

/* renamed from: t2.s, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C6418s implements InterfaceC6391e {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f65508a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f65509b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f65510c;

    /* renamed from: d, reason: collision with root package name */
    public final SparseArray f65511d;

    /* renamed from: e, reason: collision with root package name */
    public int f65512e;

    /* renamed from: f, reason: collision with root package name */
    public p.a f65513f;

    /* renamed from: g, reason: collision with root package name */
    public int f65514g;

    /* renamed from: h, reason: collision with root package name */
    public long f65515h;

    /* renamed from: i, reason: collision with root package name */
    public long f65516i;

    /* renamed from: j, reason: collision with root package name */
    public long f65517j;

    /* renamed from: k, reason: collision with root package name */
    public long f65518k;

    /* renamed from: l, reason: collision with root package name */
    public long f65519l;
    private c[] mixingBuffers;

    /* renamed from: t2.s$b */
    public static final class b implements InterfaceC6391e.a {

        /* renamed from: a, reason: collision with root package name */
        public final boolean f65520a;

        /* renamed from: b, reason: collision with root package name */
        public final boolean f65521b;

        /* renamed from: c, reason: collision with root package name */
        public final boolean f65522c;

        public b() {
            this(false, true, false);
        }

        @Override // t2.InterfaceC6391e.a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public C6418s create() {
            return new C6418s(this.f65520a, this.f65521b, this.f65522c);
        }

        public b(boolean z10, boolean z11, boolean z12) {
            this.f65520a = z10;
            this.f65521b = z11;
            this.f65522c = z12;
        }
    }

    /* renamed from: t2.s$c */
    public static class c {

        /* renamed from: a, reason: collision with root package name */
        public final ByteBuffer f65523a;

        /* renamed from: b, reason: collision with root package name */
        public final long f65524b;

        /* renamed from: c, reason: collision with root package name */
        public final long f65525c;

        public c(ByteBuffer byteBuffer, long j10, long j11) {
            this.f65523a = byteBuffer;
            this.f65524b = j10;
            this.f65525c = j11;
        }
    }

    /* renamed from: t2.s$d */
    public final class d {

        /* renamed from: a, reason: collision with root package name */
        public long f65526a;

        /* renamed from: b, reason: collision with root package name */
        public final p.a f65527b;

        /* renamed from: c, reason: collision with root package name */
        public final c1.t f65528c;

        /* renamed from: d, reason: collision with root package name */
        public c1.t f65529d;

        public d(p.a aVar, c1.t tVar, long j10) {
            this.f65527b = aVar;
            this.f65528c = tVar;
            this.f65526a = j10;
            this.f65529d = tVar;
        }

        public void a(ByteBuffer byteBuffer, long j10) {
            AbstractC4134a.a(j10 >= this.f65526a);
            byteBuffer.position(byteBuffer.position() + (((int) (j10 - this.f65526a)) * this.f65527b.f26783d));
            this.f65526a = j10;
        }

        public c1.t b() {
            return this.f65529d;
        }

        public long c(ByteBuffer byteBuffer) {
            return this.f65526a + (byteBuffer.remaining() / this.f65527b.f26783d);
        }

        public void d(ByteBuffer byteBuffer, long j10, ByteBuffer byteBuffer2, p.a aVar) {
            AbstractC4134a.a(j10 >= this.f65526a);
            c1.n.f(byteBuffer, this.f65527b, byteBuffer2, aVar, this.f65529d, (int) (j10 - this.f65526a), true, C6418s.this.f65509b);
            this.f65526a = j10;
        }
    }

    @Override // t2.InterfaceC6391e
    public ByteBuffer a() {
        j();
        if (b()) {
            return c1.p.f26778a;
        }
        long j10 = this.f65518k;
        if (this.f65511d.size() == 0) {
            j10 = Math.min(j10, this.f65519l);
        }
        for (int i10 = 0; i10 < this.f65511d.size(); i10++) {
            j10 = Math.min(j10, ((d) this.f65511d.valueAt(i10)).f65526a);
        }
        if (j10 <= this.f65517j) {
            return c1.p.f26778a;
        }
        c cVar = this.mixingBuffers[0];
        long min = Math.min(j10, cVar.f65525c);
        ByteBuffer duplicate = cVar.f65523a.duplicate();
        duplicate.position(((int) (this.f65517j - cVar.f65524b)) * this.f65513f.f26783d).limit(((int) (min - cVar.f65524b)) * this.f65513f.f26783d);
        ByteBuffer order = duplicate.slice().order(ByteOrder.nativeOrder());
        if (min == cVar.f65525c) {
            c[] cVarArr = this.mixingBuffers;
            c cVar2 = cVarArr[1];
            cVarArr[0] = cVar2;
            cVarArr[1] = i(cVar2.f65525c);
        }
        this.f65517j = min;
        m();
        AbstractC5366l.f("AudioMixer", "ProducedOutput", -9223372036854775807L, "bytesOutput=%s", Integer.valueOf(order.remaining()));
        return order;
    }

    @Override // t2.InterfaceC6391e
    public boolean b() {
        j();
        long j10 = this.f65517j;
        if (j10 < this.f65518k) {
            return j10 >= this.f65519l && this.f65511d.size() == 0;
        }
        return true;
    }

    @Override // t2.InterfaceC6391e
    public void c(int i10) {
        j();
        this.f65519l = Math.max(this.f65519l, k(i10).f65526a);
        this.f65511d.delete(i10);
    }

    @Override // t2.InterfaceC6391e
    public int d(p.a aVar, long j10) {
        j();
        if (!l(aVar)) {
            throw new p.b("Can not add source. MixerFormat=" + this.f65513f, aVar);
        }
        long E10 = e1.Z.E(j10 - this.f65515h, aVar.f26780a);
        int i10 = this.f65512e;
        this.f65512e = i10 + 1;
        this.f65511d.append(i10, new d(aVar, this.f65510c ? c1.t.e(aVar.f26781b, this.f65513f.f26781b) : c1.t.d(aVar.f26781b, this.f65513f.f26781b), E10));
        AbstractC5366l.f("AudioMixer", "RegisterNewInputStream", j10, "source(%s):%s", Integer.valueOf(i10), aVar);
        return i10;
    }

    @Override // t2.InterfaceC6391e
    public boolean e(int i10) {
        j();
        return e1.Z.q(this.f65511d, i10);
    }

    @Override // t2.InterfaceC6391e
    public void f(int i10, ByteBuffer byteBuffer) {
        ByteBuffer byteBuffer2;
        j();
        if (byteBuffer.hasRemaining()) {
            d k10 = k(i10);
            if (k10.f65526a >= this.f65516i) {
                return;
            }
            long min = Math.min(k10.c(byteBuffer), this.f65516i);
            if (k10.b().n()) {
                k10.a(byteBuffer, min);
                return;
            }
            long j10 = k10.f65526a;
            long j11 = this.f65517j;
            if (j10 < j11) {
                k10.a(byteBuffer, Math.min(min, j11));
                if (k10.f65526a == min) {
                    return;
                }
            }
            c[] cVarArr = this.mixingBuffers;
            int length = cVarArr.length;
            int i11 = 0;
            while (i11 < length) {
                c cVar = cVarArr[i11];
                long j12 = k10.f65526a;
                if (j12 >= cVar.f65525c) {
                    byteBuffer2 = byteBuffer;
                } else {
                    int i12 = ((int) (j12 - cVar.f65524b)) * this.f65513f.f26783d;
                    ByteBuffer byteBuffer3 = cVar.f65523a;
                    byteBuffer3.position(byteBuffer3.position() + i12);
                    byteBuffer2 = byteBuffer;
                    k10.d(byteBuffer2, Math.min(min, cVar.f65525c), cVar.f65523a, this.f65513f);
                    cVar.f65523a.reset();
                    if (k10.f65526a == min) {
                        return;
                    }
                }
                i11++;
                byteBuffer = byteBuffer2;
            }
        }
    }

    @Override // t2.InterfaceC6391e
    public void g(p.a aVar, int i10, long j10) {
        AbstractC4134a.h(this.f65513f.equals(p.a.f26779e), "Audio mixer already configured.");
        if (i10 == -1) {
            i10 = FaceShapeAreaOptions.FACE_SHAPE_AREA_EYEBROWPOSITION;
        }
        AbstractC4134a.a(i10 > 0);
        if (!c1.n.a(aVar)) {
            throw new p.b("Can not mix to this AudioFormat.", aVar);
        }
        this.f65513f = aVar;
        this.f65514g = (i10 * aVar.f26780a) / 1000;
        this.f65515h = j10;
        AbstractC5366l.f("AudioMixer", "OutputFormat", j10, "%s", aVar);
        this.mixingBuffers = new c[]{i(0L), i(this.f65514g)};
        m();
    }

    public final c i(long j10) {
        ByteBuffer order = ByteBuffer.allocateDirect(this.f65514g * this.f65513f.f26783d).order(ByteOrder.nativeOrder());
        order.mark();
        return new c(order, j10, j10 + this.f65514g);
    }

    public final void j() {
        AbstractC4134a.h(!this.f65513f.equals(p.a.f26779e), "Audio mixer is not configured.");
    }

    public final d k(int i10) {
        AbstractC4134a.h(e1.Z.q(this.f65511d, i10), "Source not found.");
        return (d) this.f65511d.get(i10);
    }

    public boolean l(p.a aVar) {
        j();
        return c1.n.b(aVar, this.f65513f);
    }

    public final void m() {
        this.f65516i = Math.min(this.f65518k, this.f65517j + this.f65514g);
    }

    @Override // t2.InterfaceC6391e
    public void reset() {
        this.f65511d.clear();
        this.f65512e = 0;
        this.f65513f = p.a.f26779e;
        this.f65514g = -1;
        this.mixingBuffers = new c[0];
        this.f65515h = -9223372036854775807L;
        this.f65516i = -1L;
        this.f65517j = 0L;
        this.f65518k = LongCompanionObject.MAX_VALUE;
        this.f65519l = this.f65508a ? Long.MAX_VALUE : 0L;
    }

    public C6418s(boolean z10, boolean z11, boolean z12) {
        this.f65508a = z10;
        this.f65509b = z11;
        this.f65510c = z12;
        this.f65511d = new SparseArray();
        this.f65513f = p.a.f26779e;
        this.f65514g = -1;
        this.mixingBuffers = new c[0];
        this.f65515h = -9223372036854775807L;
        this.f65516i = -1L;
        this.f65518k = LongCompanionObject.MAX_VALUE;
        if (z10) {
            this.f65519l = LongCompanionObject.MAX_VALUE;
        }
    }
}
