package t2;

import android.media.MediaCodec;
import android.media.metrics.LogSessionId;
import androidx.media3.common.a;
import c1.p;
import com.google.common.collect.AbstractC3445z;
import e1.AbstractC4134a;
import java.nio.ByteBuffer;
import java.util.Objects;
import l1.AbstractC5366l;
import t2.InterfaceC6391e;
import t2.InterfaceC6399i;

/* renamed from: t2.f, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C6393f extends M0 {

    /* renamed from: e, reason: collision with root package name */
    public final InterfaceC6399i f65305e;

    /* renamed from: f, reason: collision with root package name */
    public final p.a f65306f;

    /* renamed from: g, reason: collision with root package name */
    public final k1.f f65307g;

    /* renamed from: h, reason: collision with root package name */
    public final k1.f f65308h;

    /* renamed from: i, reason: collision with root package name */
    public final C6387c f65309i;

    /* renamed from: j, reason: collision with root package name */
    public final C6389d f65310j;

    /* renamed from: k, reason: collision with root package name */
    public final androidx.media3.common.a f65311k;

    /* renamed from: l, reason: collision with root package name */
    public boolean f65312l;

    /* renamed from: m, reason: collision with root package name */
    public long f65313m;

    public C6393f(androidx.media3.common.a aVar, androidx.media3.common.a aVar2, V0 v02, E e10, AbstractC3445z abstractC3445z, InterfaceC6391e.a aVar3, InterfaceC6399i.b bVar, I0 i02, A0 a02, LogSessionId logSessionId) {
        super(aVar, i02);
        c1.v vVar = new c1.v();
        C6387c c6387c = new C6387c(aVar3, new AbstractC3445z.a().k(abstractC3445z).a(vVar).m());
        this.f65309i = c6387c;
        this.f65311k = aVar2;
        C6389d j10 = c6387c.j(e10, aVar2);
        p.a f10 = c6387c.f();
        AbstractC4134a.g(!f10.equals(p.a.f26779e));
        a.b bVar2 = new a.b();
        String str = v02.f65179b;
        androidx.media3.common.a P10 = bVar2.y0(str == null ? (String) AbstractC4134a.e(aVar.f20543o) : str).z0(f10.f26780a).T(f10.f26781b).s0(f10.f26782c).U(aVar2.f20539k).P();
        InterfaceC6399i d10 = bVar.d(P10.b().y0(M0.j(P10, i02.i(1))).P(), logSessionId);
        this.f65305e = d10;
        p.a aVar4 = new p.a(d10.e());
        if (aVar4.f26780a != f10.f26780a) {
            c6387c.k();
            vVar.j(aVar4.f26780a);
            j10 = c6387c.j(e10, aVar2);
            f10 = c6387c.f();
        }
        this.f65310j = j10;
        this.f65306f = f10;
        this.f65307g = new k1.f(0);
        this.f65308h = new k1.f(0);
        a02.c(s(v02, P10, d10.l()));
    }

    public static V0 s(V0 v02, androidx.media3.common.a aVar, androidx.media3.common.a aVar2) {
        return Objects.equals(aVar.f20543o, aVar2.f20543o) ? v02 : v02.a().b(aVar2.f20543o).a();
    }

    @Override // t2.M0
    public k1.f l() {
        this.f65308h.f54108d = this.f65305e.j();
        k1.f fVar = this.f65308h;
        if (fVar.f54108d == null) {
            return null;
        }
        fVar.f54110f = ((MediaCodec.BufferInfo) AbstractC4134a.e(this.f65305e.h())).presentationTimeUs;
        this.f65308h.n(1);
        return this.f65308h;
    }

    @Override // t2.M0
    public androidx.media3.common.a m() {
        return this.f65305e.getOutputFormat();
    }

    @Override // t2.M0
    public boolean n() {
        return this.f65305e.b();
    }

    @Override // t2.M0
    public boolean p() {
        ByteBuffer e10 = this.f65309i.e();
        if (!this.f65305e.f(this.f65307g)) {
            return false;
        }
        if (this.f65309i.g()) {
            AbstractC5366l.e("AudioGraph", "OutputEnded", Long.MIN_VALUE);
            w();
            return false;
        }
        if (!e10.hasRemaining()) {
            return false;
        }
        t(e10);
        return true;
    }

    @Override // t2.M0
    public void q() {
        this.f65309i.k();
        this.f65305e.release();
    }

    @Override // t2.M0
    public void r() {
        this.f65305e.i(false);
    }

    public final void t(ByteBuffer byteBuffer) {
        ByteBuffer byteBuffer2 = (ByteBuffer) AbstractC4134a.e(this.f65307g.f54108d);
        int limit = byteBuffer.limit();
        byteBuffer.limit(Math.min(limit, byteBuffer.position() + byteBuffer2.capacity()));
        byteBuffer2.put(byteBuffer);
        this.f65307g.f54110f = v();
        this.f65313m += byteBuffer2.position();
        this.f65307g.n(0);
        this.f65307g.q();
        byteBuffer.limit(limit);
        this.f65305e.c(this.f65307g);
    }

    @Override // t2.M0
    /* renamed from: u, reason: merged with bridge method [inline-methods] */
    public C6389d k(E e10, androidx.media3.common.a aVar, int i10) {
        if (this.f65312l) {
            return this.f65309i.j(e10, aVar);
        }
        this.f65312l = true;
        AbstractC4134a.g(aVar.equals(this.f65311k));
        return this.f65310j;
    }

    public final long v() {
        long j10 = this.f65313m;
        p.a aVar = this.f65306f;
        return ((j10 / aVar.f26783d) * 1000000) / aVar.f26780a;
    }

    public final void w() {
        AbstractC4134a.g(((ByteBuffer) AbstractC4134a.e(this.f65307g.f54108d)).position() == 0);
        this.f65307g.f54110f = v();
        this.f65307g.e(4);
        this.f65307g.q();
        this.f65305e.c(this.f65307g);
    }
}
