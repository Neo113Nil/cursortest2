package androidx.media3.exoplayer.source;

import androidx.media3.exoplayer.source.D;
import b1.AbstractC2346O;
import b1.z;
import e1.AbstractC4134a;
import h1.InterfaceC4403F;
import java.io.IOException;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* loaded from: classes.dex */
public final class P extends AbstractC2207h {

    /* renamed from: u, reason: collision with root package name */
    public static final b1.z f21557u = new z.c().d("MergingMediaSource").a();

    /* renamed from: k, reason: collision with root package name */
    public final boolean f21558k;

    /* renamed from: l, reason: collision with root package name */
    public final boolean f21559l;

    /* renamed from: m, reason: collision with root package name */
    public final List f21560m;
    private final D[] mediaSources;

    /* renamed from: n, reason: collision with root package name */
    public final ArrayList f21561n;

    /* renamed from: o, reason: collision with root package name */
    public final InterfaceC2209j f21562o;

    /* renamed from: p, reason: collision with root package name */
    public final Map f21563p;

    /* renamed from: q, reason: collision with root package name */
    public final com.google.common.collect.O f21564q;

    /* renamed from: r, reason: collision with root package name */
    public int f21565r;

    /* renamed from: s, reason: collision with root package name */
    public long[][] f21566s;

    /* renamed from: t, reason: collision with root package name */
    public c f21567t;
    private final AbstractC2346O[] timelines;

    public static final class b extends AbstractC2221w {
        private final long[] periodDurationsUs;
        private final long[] windowDurationsUs;

        public b(AbstractC2346O abstractC2346O, Map map) {
            super(abstractC2346O);
            int p10 = abstractC2346O.p();
            this.windowDurationsUs = new long[abstractC2346O.p()];
            AbstractC2346O.c cVar = new AbstractC2346O.c();
            for (int i10 = 0; i10 < p10; i10++) {
                this.windowDurationsUs[i10] = abstractC2346O.n(i10, cVar).f24389m;
            }
            int i11 = abstractC2346O.i();
            this.periodDurationsUs = new long[i11];
            AbstractC2346O.b bVar = new AbstractC2346O.b();
            for (int i12 = 0; i12 < i11; i12++) {
                abstractC2346O.g(i12, bVar, true);
                long longValue = ((Long) AbstractC4134a.e((Long) map.get(bVar.f24355b))).longValue();
                long[] jArr = this.periodDurationsUs;
                longValue = longValue == Long.MIN_VALUE ? bVar.f24357d : longValue;
                jArr[i12] = longValue;
                long j10 = bVar.f24357d;
                if (j10 != -9223372036854775807L) {
                    long[] jArr2 = this.windowDurationsUs;
                    int i13 = bVar.f24356c;
                    jArr2[i13] = jArr2[i13] - (j10 - longValue);
                }
            }
        }

        @Override // androidx.media3.exoplayer.source.AbstractC2221w, b1.AbstractC2346O
        public AbstractC2346O.b g(int i10, AbstractC2346O.b bVar, boolean z10) {
            super.g(i10, bVar, z10);
            bVar.f24357d = this.periodDurationsUs[i10];
            return bVar;
        }

        @Override // androidx.media3.exoplayer.source.AbstractC2221w, b1.AbstractC2346O
        public AbstractC2346O.c o(int i10, AbstractC2346O.c cVar, long j10) {
            long j11;
            super.o(i10, cVar, j10);
            long j12 = this.windowDurationsUs[i10];
            cVar.f24389m = j12;
            if (j12 != -9223372036854775807L) {
                long j13 = cVar.f24388l;
                if (j13 != -9223372036854775807L) {
                    j11 = Math.min(j13, j12);
                    cVar.f24388l = j11;
                    return cVar;
                }
            }
            j11 = cVar.f24388l;
            cVar.f24388l = j11;
            return cVar;
        }
    }

    public static final class c extends IOException {

        /* renamed from: a, reason: collision with root package name */
        public final int f21568a;

        public c(int i10) {
            this.f21568a = i10;
        }
    }

    public static final class d {

        /* renamed from: a, reason: collision with root package name */
        public final D.b f21569a;

        /* renamed from: b, reason: collision with root package name */
        public final C f21570b;

        public d(D.b bVar, C c10) {
            this.f21569a = bVar;
            this.f21570b = c10;
        }
    }

    public P(D... dArr) {
        this(false, dArr);
    }

    @Override // androidx.media3.exoplayer.source.AbstractC2207h, androidx.media3.exoplayer.source.AbstractC2200a
    public void D(InterfaceC4403F interfaceC4403F) {
        super.D(interfaceC4403F);
        for (int i10 = 0; i10 < this.mediaSources.length; i10++) {
            L(Integer.valueOf(i10), this.mediaSources[i10]);
        }
    }

    @Override // androidx.media3.exoplayer.source.AbstractC2207h, androidx.media3.exoplayer.source.AbstractC2200a
    public void F() {
        super.F();
        Arrays.fill(this.timelines, (Object) null);
        this.f21565r = -1;
        this.f21567t = null;
        this.f21561n.clear();
        Collections.addAll(this.f21561n, this.mediaSources);
    }

    public final void M() {
        AbstractC2346O.b bVar = new AbstractC2346O.b();
        for (int i10 = 0; i10 < this.f21565r; i10++) {
            long j10 = -this.timelines[0].f(i10, bVar).o();
            int i11 = 1;
            while (true) {
                AbstractC2346O[] abstractC2346OArr = this.timelines;
                if (i11 < abstractC2346OArr.length) {
                    this.f21566s[i10][i11] = j10 - (-abstractC2346OArr[i11].f(i10, bVar).o());
                    i11++;
                }
            }
        }
    }

    @Override // androidx.media3.exoplayer.source.AbstractC2207h
    /* renamed from: N, reason: merged with bridge method [inline-methods] */
    public D.b H(Integer num, D.b bVar) {
        List list = (List) this.f21560m.get(num.intValue());
        for (int i10 = 0; i10 < list.size(); i10++) {
            if (((d) list.get(i10)).f21569a.equals(bVar)) {
                return ((d) ((List) this.f21560m.get(0)).get(i10)).f21569a;
            }
        }
        return null;
    }

    @Override // androidx.media3.exoplayer.source.AbstractC2207h
    /* renamed from: O, reason: merged with bridge method [inline-methods] */
    public void K(Integer num, D d10, AbstractC2346O abstractC2346O) {
        if (this.f21567t != null) {
            return;
        }
        if (this.f21565r == -1) {
            this.f21565r = abstractC2346O.i();
        } else if (abstractC2346O.i() != this.f21565r) {
            this.f21567t = new c(0);
            return;
        }
        if (this.f21566s.length == 0) {
            this.f21566s = (long[][]) Array.newInstance((Class<?>) Long.TYPE, this.f21565r, this.timelines.length);
        }
        this.f21561n.remove(d10);
        this.timelines[num.intValue()] = abstractC2346O;
        if (this.f21561n.isEmpty()) {
            if (this.f21558k) {
                M();
            }
            AbstractC2346O abstractC2346O2 = this.timelines[0];
            if (this.f21559l) {
                P();
                abstractC2346O2 = new b(abstractC2346O2, this.f21563p);
            }
            E(abstractC2346O2);
        }
    }

    public final void P() {
        AbstractC2346O[] abstractC2346OArr;
        AbstractC2346O.b bVar = new AbstractC2346O.b();
        for (int i10 = 0; i10 < this.f21565r; i10++) {
            int i11 = 0;
            long j10 = Long.MIN_VALUE;
            while (true) {
                abstractC2346OArr = this.timelines;
                if (i11 >= abstractC2346OArr.length) {
                    break;
                }
                long k10 = abstractC2346OArr[i11].f(i10, bVar).k();
                if (k10 != -9223372036854775807L) {
                    long j11 = k10 + this.f21566s[i10][i11];
                    if (j10 == Long.MIN_VALUE || j11 < j10) {
                        j10 = j11;
                    }
                }
                i11++;
            }
            Object m10 = abstractC2346OArr[0].m(i10);
            this.f21563p.put(m10, Long.valueOf(j10));
            Iterator it = this.f21564q.get(m10).iterator();
            while (it.hasNext()) {
                ((C2204e) it.next()).x(0L, j10);
            }
        }
    }

    @Override // androidx.media3.exoplayer.source.D
    public C c(D.b bVar, D1.b bVar2, long j10) {
        int length = this.mediaSources.length;
        C[] cArr = new C[length];
        int b10 = this.timelines[0].b(bVar.f21516a);
        for (int i10 = 0; i10 < length; i10++) {
            D.b a10 = bVar.a(this.timelines[i10].m(b10));
            cArr[i10] = this.mediaSources[i10].c(a10, bVar2, j10 - this.f21566s[b10][i10]);
            ((List) this.f21560m.get(i10)).add(new d(a10, cArr[i10]));
        }
        O o10 = new O(this.f21562o, this.f21566s[b10], cArr);
        if (!this.f21559l) {
            return o10;
        }
        C2204e c2204e = new C2204e(o10, false, 0L, ((Long) AbstractC4134a.e((Long) this.f21563p.get(bVar.f21516a))).longValue());
        this.f21564q.put(bVar.f21516a, c2204e);
        return c2204e;
    }

    @Override // androidx.media3.exoplayer.source.D
    public b1.z d() {
        D[] dArr = this.mediaSources;
        return dArr.length > 0 ? dArr[0].d() : f21557u;
    }

    @Override // androidx.media3.exoplayer.source.D
    public void f(C c10) {
        if (this.f21559l) {
            C2204e c2204e = (C2204e) c10;
            Iterator it = this.f21564q.a().iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                Map.Entry entry = (Map.Entry) it.next();
                if (((C2204e) entry.getValue()).equals(c2204e)) {
                    this.f21564q.remove(entry.getKey(), entry.getValue());
                    break;
                }
            }
            c10 = c2204e.f21716a;
        }
        O o10 = (O) c10;
        for (int i10 = 0; i10 < this.mediaSources.length; i10++) {
            List list = (List) this.f21560m.get(i10);
            C o11 = o10.o(i10);
            int i11 = 0;
            while (true) {
                if (i11 >= list.size()) {
                    break;
                }
                if (((d) list.get(i11)).f21570b.equals(o11)) {
                    list.remove(i11);
                    break;
                }
                i11++;
            }
            this.mediaSources[i10].f(o10.o(i10));
        }
    }

    @Override // androidx.media3.exoplayer.source.D
    public void n(b1.z zVar) {
        this.mediaSources[0].n(zVar);
    }

    @Override // androidx.media3.exoplayer.source.AbstractC2207h, androidx.media3.exoplayer.source.D
    public void q() {
        c cVar = this.f21567t;
        if (cVar != null) {
            throw cVar;
        }
        super.q();
    }

    public P(boolean z10, D... dArr) {
        this(z10, false, dArr);
    }

    public P(boolean z10, boolean z11, D... dArr) {
        this(z10, z11, new C2210k(), dArr);
    }

    public P(boolean z10, boolean z11, InterfaceC2209j interfaceC2209j, D... dArr) {
        this.f21558k = z10;
        this.f21559l = z11;
        this.mediaSources = dArr;
        this.f21562o = interfaceC2209j;
        this.f21561n = new ArrayList(Arrays.asList(dArr));
        this.f21565r = -1;
        this.f21560m = new ArrayList(dArr.length);
        for (int i10 = 0; i10 < dArr.length; i10++) {
            this.f21560m.add(new ArrayList());
        }
        this.timelines = new AbstractC2346O[dArr.length];
        this.f21566s = new long[0][];
        this.f21563p = new HashMap();
        this.f21564q = com.google.common.collect.P.a().a().e();
    }
}
