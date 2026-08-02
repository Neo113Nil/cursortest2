package androidx.media3.exoplayer.smoothstreaming;

import B1.h;
import D1.e;
import D1.k;
import D1.n;
import Ra.f;
import androidx.media3.exoplayer.smoothstreaming.b;
import androidx.media3.exoplayer.source.C;
import androidx.media3.exoplayer.source.InterfaceC2209j;
import androidx.media3.exoplayer.source.L;
import androidx.media3.exoplayer.source.c0;
import androidx.media3.exoplayer.source.d0;
import androidx.media3.exoplayer.source.m0;
import androidx.media3.exoplayer.trackselection.y;
import b1.P;
import com.google.common.collect.AbstractC3445z;
import e1.AbstractC4134a;
import h1.InterfaceC4403F;
import java.util.ArrayList;
import java.util.List;
import m1.o1;
import q1.t;
import q1.u;
import z1.C6909a;

/* loaded from: classes.dex */
public final class c implements C, d0.a {

    /* renamed from: a, reason: collision with root package name */
    public final b.a f21482a;

    /* renamed from: b, reason: collision with root package name */
    public final InterfaceC4403F f21483b;

    /* renamed from: c, reason: collision with root package name */
    public final n f21484c;

    /* renamed from: d, reason: collision with root package name */
    public final u f21485d;

    /* renamed from: e, reason: collision with root package name */
    public final e f21486e;

    /* renamed from: f, reason: collision with root package name */
    public final t.a f21487f;

    /* renamed from: g, reason: collision with root package name */
    public final k f21488g;

    /* renamed from: h, reason: collision with root package name */
    public final L.a f21489h;

    /* renamed from: i, reason: collision with root package name */
    public final D1.b f21490i;

    /* renamed from: j, reason: collision with root package name */
    public final m0 f21491j;

    /* renamed from: k, reason: collision with root package name */
    public final InterfaceC2209j f21492k;

    /* renamed from: l, reason: collision with root package name */
    public C.a f21493l;

    /* renamed from: m, reason: collision with root package name */
    public C6909a f21494m;

    /* renamed from: n, reason: collision with root package name */
    public d0 f21495n;
    private h[] sampleStreams = q(0);

    public c(C6909a c6909a, b.a aVar, InterfaceC4403F interfaceC4403F, InterfaceC2209j interfaceC2209j, e eVar, u uVar, t.a aVar2, k kVar, L.a aVar3, n nVar, D1.b bVar) {
        this.f21494m = c6909a;
        this.f21482a = aVar;
        this.f21483b = interfaceC4403F;
        this.f21484c = nVar;
        this.f21486e = eVar;
        this.f21485d = uVar;
        this.f21487f = aVar2;
        this.f21488g = kVar;
        this.f21489h = aVar3;
        this.f21490i = bVar;
        this.f21492k = interfaceC2209j;
        this.f21491j = p(c6909a, uVar, aVar);
        this.f21495n = interfaceC2209j.empty();
    }

    public static m0 p(C6909a c6909a, u uVar, b.a aVar) {
        P[] pArr = new P[c6909a.streamElements.length];
        int i10 = 0;
        while (true) {
            C6909a.b[] bVarArr = c6909a.streamElements;
            if (i10 >= bVarArr.length) {
                return new m0(pArr);
            }
            androidx.media3.common.a[] aVarArr = bVarArr[i10].formats;
            androidx.media3.common.a[] aVarArr2 = new androidx.media3.common.a[aVarArr.length];
            for (int i11 = 0; i11 < aVarArr.length; i11++) {
                androidx.media3.common.a aVar2 = aVarArr[i11];
                aVarArr2[i11] = aVar.d(aVar2.b().X(uVar.b(aVar2)).P());
            }
            pArr[i10] = new P(Integer.toString(i10), aVarArr2);
            i10++;
        }
    }

    private static h[] q(int i10) {
        return new h[i10];
    }

    @Override // androidx.media3.exoplayer.source.C, androidx.media3.exoplayer.source.d0
    public boolean b(androidx.media3.exoplayer.k kVar) {
        return this.f21495n.b(kVar);
    }

    @Override // androidx.media3.exoplayer.source.C, androidx.media3.exoplayer.source.d0
    public long d() {
        return this.f21495n.d();
    }

    @Override // androidx.media3.exoplayer.source.C, androidx.media3.exoplayer.source.d0
    public boolean e() {
        return this.f21495n.e();
    }

    @Override // androidx.media3.exoplayer.source.C
    public long f(long j10, o1 o1Var) {
        for (h hVar : this.sampleStreams) {
            if (hVar.f567a == 2) {
                return hVar.f(j10, o1Var);
            }
        }
        return j10;
    }

    @Override // androidx.media3.exoplayer.source.C, androidx.media3.exoplayer.source.d0
    public long g() {
        return this.f21495n.g();
    }

    @Override // androidx.media3.exoplayer.source.C, androidx.media3.exoplayer.source.d0
    public void h(long j10) {
        this.f21495n.h(j10);
    }

    @Override // androidx.media3.exoplayer.source.C
    public long k(long j10) {
        for (h hVar : this.sampleStreams) {
            hVar.W(j10);
        }
        return j10;
    }

    @Override // androidx.media3.exoplayer.source.C
    public long m(y[] yVarArr, boolean[] zArr, c0[] c0VarArr, boolean[] zArr2, long j10) {
        y yVar;
        ArrayList arrayList = new ArrayList();
        for (int i10 = 0; i10 < yVarArr.length; i10++) {
            c0 c0Var = c0VarArr[i10];
            if (c0Var != null) {
                h hVar = (h) c0Var;
                if (yVarArr[i10] == null || !zArr[i10]) {
                    hVar.T();
                    c0VarArr[i10] = null;
                } else {
                    ((b) hVar.H()).b((y) AbstractC4134a.e(yVarArr[i10]));
                    arrayList.add(hVar);
                }
            }
            if (c0VarArr[i10] == null && (yVar = yVarArr[i10]) != null) {
                h o10 = o(yVar, j10);
                arrayList.add(o10);
                c0VarArr[i10] = o10;
                zArr2[i10] = true;
            }
        }
        h[] q10 = q(arrayList.size());
        this.sampleStreams = q10;
        arrayList.toArray(q10);
        this.f21495n = this.f21492k.a(arrayList, com.google.common.collect.L.k(arrayList, new f() { // from class: y1.a
            @Override // Ra.f
            public final Object apply(Object obj) {
                List u10;
                u10 = AbstractC3445z.u(Integer.valueOf(((h) obj).f567a));
                return u10;
            }
        }));
        return j10;
    }

    @Override // androidx.media3.exoplayer.source.C
    public long n() {
        return -9223372036854775807L;
    }

    public final h o(y yVar, long j10) {
        int d10 = this.f21491j.d(yVar.m());
        return new h(this.f21494m.streamElements[d10].f68479a, null, null, this.f21482a.c(this.f21484c, this.f21494m, d10, yVar, this.f21483b, this.f21486e), this, this.f21490i, j10, this.f21485d, this.f21487f, this.f21488g, this.f21489h, false, null);
    }

    @Override // androidx.media3.exoplayer.source.C
    public void r() {
        this.f21484c.a();
    }

    @Override // androidx.media3.exoplayer.source.d0.a
    /* renamed from: s, reason: merged with bridge method [inline-methods] */
    public void j(h hVar) {
        ((C.a) AbstractC4134a.e(this.f21493l)).j(this);
    }

    @Override // androidx.media3.exoplayer.source.C
    public void t(C.a aVar, long j10) {
        this.f21493l = aVar;
        aVar.i(this);
    }

    @Override // androidx.media3.exoplayer.source.C
    public m0 u() {
        return this.f21491j;
    }

    @Override // androidx.media3.exoplayer.source.C
    public void v(long j10, boolean z10) {
        for (h hVar : this.sampleStreams) {
            hVar.v(j10, z10);
        }
    }

    public void w() {
        for (h hVar : this.sampleStreams) {
            hVar.T();
        }
        this.f21493l = null;
    }

    public void x(C6909a c6909a) {
        this.f21494m = c6909a;
        for (h hVar : this.sampleStreams) {
            ((b) hVar.H()).d(c6909a);
        }
        ((C.a) AbstractC4134a.e(this.f21493l)).j(this);
    }
}
