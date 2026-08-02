package androidx.media3.exoplayer.source;

import androidx.media3.common.a;
import androidx.media3.exoplayer.source.C;
import e1.AbstractC4134a;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.IdentityHashMap;
import java.util.List;
import m1.o1;

/* loaded from: classes.dex */
public final class O implements C, C.a {

    /* renamed from: b, reason: collision with root package name */
    public final InterfaceC2209j f21550b;

    /* renamed from: e, reason: collision with root package name */
    public C.a f21553e;

    /* renamed from: f, reason: collision with root package name */
    public m0 f21554f;

    /* renamed from: g, reason: collision with root package name */
    public d0 f21555g;
    private final C[] periods;
    private final boolean[] periodsWithTimeOffsets;

    /* renamed from: c, reason: collision with root package name */
    public final ArrayList f21551c = new ArrayList();

    /* renamed from: d, reason: collision with root package name */
    public final HashMap f21552d = new HashMap();

    /* renamed from: a, reason: collision with root package name */
    public final IdentityHashMap f21549a = new IdentityHashMap();
    private C[] enabledPeriods = new C[0];

    public static final class a extends androidx.media3.exoplayer.trackselection.A {

        /* renamed from: b, reason: collision with root package name */
        public final b1.P f21556b;

        public a(androidx.media3.exoplayer.trackselection.y yVar, b1.P p10) {
            super(yVar);
            this.f21556b = p10;
        }

        @Override // androidx.media3.exoplayer.trackselection.C
        public int c(androidx.media3.common.a aVar) {
            return u().l(this.f21556b.b(aVar));
        }

        @Override // androidx.media3.exoplayer.trackselection.C
        public androidx.media3.common.a e(int i10) {
            return this.f21556b.a(u().f(i10));
        }

        @Override // androidx.media3.exoplayer.trackselection.A
        public boolean equals(Object obj) {
            if (super.equals(obj) && (obj instanceof a)) {
                return this.f21556b.equals(((a) obj).f21556b);
            }
            return false;
        }

        @Override // androidx.media3.exoplayer.trackselection.A
        public int hashCode() {
            return (super.hashCode() * 31) + this.f21556b.hashCode();
        }

        @Override // androidx.media3.exoplayer.trackselection.C
        public b1.P m() {
            return this.f21556b;
        }

        @Override // androidx.media3.exoplayer.trackselection.y
        public androidx.media3.common.a r() {
            return this.f21556b.a(u().q());
        }
    }

    public O(InterfaceC2209j interfaceC2209j, long[] jArr, C... cArr) {
        this.f21550b = interfaceC2209j;
        this.periods = cArr;
        this.f21555g = interfaceC2209j.empty();
        this.periodsWithTimeOffsets = new boolean[cArr.length];
        for (int i10 = 0; i10 < cArr.length; i10++) {
            long j10 = jArr[i10];
            if (j10 != 0) {
                this.periodsWithTimeOffsets[i10] = true;
                this.periods[i10] = new j0(cArr[i10], j10);
            }
        }
    }

    @Override // androidx.media3.exoplayer.source.C, androidx.media3.exoplayer.source.d0
    public boolean b(androidx.media3.exoplayer.k kVar) {
        if (this.f21551c.isEmpty()) {
            return this.f21555g.b(kVar);
        }
        int size = this.f21551c.size();
        for (int i10 = 0; i10 < size; i10++) {
            ((C) this.f21551c.get(i10)).b(kVar);
        }
        return false;
    }

    @Override // androidx.media3.exoplayer.source.C, androidx.media3.exoplayer.source.d0
    public long d() {
        return this.f21555g.d();
    }

    @Override // androidx.media3.exoplayer.source.C, androidx.media3.exoplayer.source.d0
    public boolean e() {
        return this.f21555g.e();
    }

    @Override // androidx.media3.exoplayer.source.C
    public long f(long j10, o1 o1Var) {
        C[] cArr = this.enabledPeriods;
        return (cArr.length > 0 ? cArr[0] : this.periods[0]).f(j10, o1Var);
    }

    @Override // androidx.media3.exoplayer.source.C, androidx.media3.exoplayer.source.d0
    public long g() {
        return this.f21555g.g();
    }

    @Override // androidx.media3.exoplayer.source.C, androidx.media3.exoplayer.source.d0
    public void h(long j10) {
        this.f21555g.h(j10);
    }

    @Override // androidx.media3.exoplayer.source.C.a
    public void i(C c10) {
        this.f21551c.remove(c10);
        if (!this.f21551c.isEmpty()) {
            return;
        }
        int i10 = 0;
        for (C c11 : this.periods) {
            i10 += c11.u().f21832a;
        }
        b1.P[] pArr = new b1.P[i10];
        int i11 = 0;
        int i12 = 0;
        while (true) {
            C[] cArr = this.periods;
            if (i11 >= cArr.length) {
                this.f21554f = new m0(pArr);
                ((C.a) AbstractC4134a.e(this.f21553e)).i(this);
                return;
            }
            m0 u10 = cArr[i11].u();
            int i13 = u10.f21832a;
            int i14 = 0;
            while (i14 < i13) {
                b1.P b10 = u10.b(i14);
                androidx.media3.common.a[] aVarArr = new androidx.media3.common.a[b10.f24395a];
                for (int i15 = 0; i15 < b10.f24395a; i15++) {
                    androidx.media3.common.a a10 = b10.a(i15);
                    a.b b11 = a10.b();
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append(i11);
                    sb2.append(":");
                    String str = a10.f20529a;
                    if (str == null) {
                        str = "";
                    }
                    sb2.append(str);
                    aVarArr[i15] = b11.j0(sb2.toString()).P();
                }
                b1.P p10 = new b1.P(i11 + ":" + b10.f24396b, aVarArr);
                this.f21552d.put(p10, b10);
                pArr[i12] = p10;
                i14++;
                i12++;
            }
            i11++;
        }
    }

    @Override // androidx.media3.exoplayer.source.C
    public long k(long j10) {
        long k10 = this.enabledPeriods[0].k(j10);
        int i10 = 1;
        while (true) {
            C[] cArr = this.enabledPeriods;
            if (i10 >= cArr.length) {
                return k10;
            }
            if (cArr[i10].k(k10) != k10) {
                throw new IllegalStateException("Unexpected child seekToUs result.");
            }
            i10++;
        }
    }

    @Override // androidx.media3.exoplayer.source.C
    public long m(androidx.media3.exoplayer.trackselection.y[] yVarArr, boolean[] zArr, c0[] c0VarArr, boolean[] zArr2, long j10) {
        int[] iArr = new int[yVarArr.length];
        int[] iArr2 = new int[yVarArr.length];
        int i10 = 0;
        for (int i11 = 0; i11 < yVarArr.length; i11++) {
            c0 c0Var = c0VarArr[i11];
            Integer num = c0Var == null ? null : (Integer) this.f21549a.get(c0Var);
            iArr[i11] = num == null ? -1 : num.intValue();
            androidx.media3.exoplayer.trackselection.y yVar = yVarArr[i11];
            if (yVar != null) {
                String str = yVar.m().f24396b;
                iArr2[i11] = Integer.parseInt(str.substring(0, str.indexOf(":")));
            } else {
                iArr2[i11] = -1;
            }
        }
        this.f21549a.clear();
        int length = yVarArr.length;
        c0[] c0VarArr2 = new c0[length];
        c0[] c0VarArr3 = new c0[yVarArr.length];
        androidx.media3.exoplayer.trackselection.y[] yVarArr2 = new androidx.media3.exoplayer.trackselection.y[yVarArr.length];
        ArrayList arrayList = new ArrayList(this.periods.length);
        long j11 = j10;
        int i12 = 0;
        while (i12 < this.periods.length) {
            for (int i13 = i10; i13 < yVarArr.length; i13++) {
                c0VarArr3[i13] = iArr[i13] == i12 ? c0VarArr[i13] : null;
                if (iArr2[i13] == i12) {
                    androidx.media3.exoplayer.trackselection.y yVar2 = (androidx.media3.exoplayer.trackselection.y) AbstractC4134a.e(yVarArr[i13]);
                    yVarArr2[i13] = new a(yVar2, (b1.P) AbstractC4134a.e((b1.P) this.f21552d.get(yVar2.m())));
                } else {
                    yVarArr2[i13] = null;
                }
            }
            int i14 = i12;
            long m10 = this.periods[i12].m(yVarArr2, zArr, c0VarArr3, zArr2, j11);
            if (i14 == 0) {
                j11 = m10;
            } else if (m10 != j11) {
                throw new IllegalStateException("Children enabled at different positions.");
            }
            boolean z10 = false;
            for (int i15 = 0; i15 < yVarArr.length; i15++) {
                if (iArr2[i15] == i14) {
                    c0 c0Var2 = (c0) AbstractC4134a.e(c0VarArr3[i15]);
                    c0VarArr2[i15] = c0VarArr3[i15];
                    this.f21549a.put(c0Var2, Integer.valueOf(i14));
                    z10 = true;
                } else if (iArr[i15] == i14) {
                    AbstractC4134a.g(c0VarArr3[i15] == null);
                }
            }
            if (z10) {
                arrayList.add(this.periods[i14]);
            }
            i12 = i14 + 1;
            i10 = 0;
        }
        int i16 = i10;
        System.arraycopy(c0VarArr2, i16, c0VarArr, i16, length);
        this.enabledPeriods = (C[]) arrayList.toArray(new C[i16]);
        this.f21555g = this.f21550b.a(arrayList, com.google.common.collect.L.k(arrayList, new Ra.f() { // from class: androidx.media3.exoplayer.source.N
            @Override // Ra.f
            public final Object apply(Object obj) {
                List c10;
                c10 = ((C) obj).u().c();
                return c10;
            }
        }));
        return j11;
    }

    @Override // androidx.media3.exoplayer.source.C
    public long n() {
        long j10 = -9223372036854775807L;
        for (C c10 : this.enabledPeriods) {
            long n10 = c10.n();
            if (n10 != -9223372036854775807L) {
                if (j10 == -9223372036854775807L) {
                    for (C c11 : this.enabledPeriods) {
                        if (c11 == c10) {
                            break;
                        }
                        if (c11.k(n10) != n10) {
                            throw new IllegalStateException("Unexpected child seekToUs result.");
                        }
                    }
                    j10 = n10;
                } else if (n10 != j10) {
                    throw new IllegalStateException("Conflicting discontinuities.");
                }
            } else if (j10 != -9223372036854775807L && c10.k(j10) != j10) {
                throw new IllegalStateException("Unexpected child seekToUs result.");
            }
        }
        return j10;
    }

    public C o(int i10) {
        return this.periodsWithTimeOffsets[i10] ? ((j0) this.periods[i10]).a() : this.periods[i10];
    }

    @Override // androidx.media3.exoplayer.source.d0.a
    /* renamed from: p, reason: merged with bridge method [inline-methods] */
    public void j(C c10) {
        ((C.a) AbstractC4134a.e(this.f21553e)).j(this);
    }

    @Override // androidx.media3.exoplayer.source.C
    public void r() {
        for (C c10 : this.periods) {
            c10.r();
        }
    }

    @Override // androidx.media3.exoplayer.source.C
    public void t(C.a aVar, long j10) {
        this.f21553e = aVar;
        Collections.addAll(this.f21551c, this.periods);
        for (C c10 : this.periods) {
            c10.t(this, j10);
        }
    }

    @Override // androidx.media3.exoplayer.source.C
    public m0 u() {
        return (m0) AbstractC4134a.e(this.f21554f);
    }

    @Override // androidx.media3.exoplayer.source.C
    public void v(long j10, boolean z10) {
        for (C c10 : this.enabledPeriods) {
            c10.v(j10, z10);
        }
    }
}
