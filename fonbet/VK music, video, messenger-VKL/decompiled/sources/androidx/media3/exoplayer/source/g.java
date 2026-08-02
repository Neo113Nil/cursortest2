package androidx.media3.exoplayer.source;

import android.util.Pair;
import androidx.annotation.Nullable;
import androidx.media3.exoplayer.source.i;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import java.util.Objects;
import xsna.das;
import xsna.ewo0;
import xsna.fxc0;
import xsna.kr10;
import xsna.lxo0;
import xsna.xg0;
import xsna.xu1;

/* compiled from: MaskingMediaSource.java */
/* loaded from: classes12.dex */
public final class g extends t {
    public final boolean l;
    public final ewo0.c m;
    public final ewo0.b n;
    public a o;

    @Nullable
    public f p;
    public boolean q;
    public boolean r;
    public boolean s;

    /* compiled from: MaskingMediaSource.java */
    public static final class a extends das {
        public static final Object e = new Object();

        @Nullable
        public final Object c;

        @Nullable
        public final Object d;

        public a(ewo0 ewo0Var, @Nullable Object obj, @Nullable Object obj2) {
            super(ewo0Var);
            this.c = obj;
            this.d = obj2;
        }

        @Override // xsna.das, xsna.ewo0
        public final int b(Object obj) {
            Object obj2;
            if (e.equals(obj) && (obj2 = this.d) != null) {
                obj = obj2;
            }
            return this.b.b(obj);
        }

        @Override // xsna.das, xsna.ewo0
        public final ewo0.b f(int i, ewo0.b bVar, boolean z) {
            this.b.f(i, bVar, z);
            if (Objects.equals(bVar.b, this.d) && z) {
                bVar.b = e;
            }
            return bVar;
        }

        @Override // xsna.das, xsna.ewo0
        public final Object l(int i) {
            Object l = this.b.l(i);
            return Objects.equals(l, this.d) ? e : l;
        }

        @Override // xsna.das, xsna.ewo0
        public final ewo0.c m(int i, ewo0.c cVar, long j) {
            this.b.m(i, cVar, j);
            if (Objects.equals(cVar.a, this.c)) {
                cVar.a = ewo0.c.q;
            }
            return cVar;
        }
    }

    /* compiled from: MaskingMediaSource.java */
    public static final class b extends ewo0 {
        public final kr10 b;

        public b(kr10 kr10Var) {
            this.b = kr10Var;
        }

        @Override // xsna.ewo0
        public final int b(Object obj) {
            return obj == a.e ? 0 : -1;
        }

        @Override // xsna.ewo0
        public final ewo0.b f(int i, ewo0.b bVar, boolean z) {
            bVar.h(z ? 0 : null, z ? a.e : null, 0, C.TIME_UNSET, 0L, xg0.c, true);
            return bVar;
        }

        @Override // xsna.ewo0
        public final int h() {
            return 1;
        }

        @Override // xsna.ewo0
        public final Object l(int i) {
            return a.e;
        }

        @Override // xsna.ewo0
        public final ewo0.c m(int i, ewo0.c cVar, long j) {
            Object obj = ewo0.c.q;
            cVar.b(this.b, null, C.TIME_UNSET, C.TIME_UNSET, C.TIME_UNSET, false, true, null, 0L, C.TIME_UNSET, 0, 0L);
            cVar.k = true;
            return cVar;
        }

        @Override // xsna.ewo0
        public final int o() {
            return 1;
        }
    }

    public g(i iVar, boolean z) {
        super(iVar);
        this.l = z && iVar.n();
        this.m = new ewo0.c();
        this.n = new ewo0.b();
        ewo0 i = iVar.i();
        if (i == null) {
            this.o = new a(new b(iVar.f()), ewo0.c.q, a.e);
        } else {
            this.o = new a(i, null, null);
            this.s = true;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:12:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x00cc  */
    @Override // androidx.media3.exoplayer.source.t
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void A(ewo0 ewo0Var) {
        long j;
        a aVar;
        f fVar;
        Object obj;
        i.b a2;
        a aVar2;
        if (this.r) {
            a aVar3 = this.o;
            this.o = new a(ewo0Var, aVar3.c, aVar3.d);
            f fVar2 = this.p;
            if (fVar2 != null) {
                D(fVar2.i);
            }
        } else if (ewo0Var.p()) {
            if (this.s) {
                a aVar4 = this.o;
                aVar2 = new a(ewo0Var, aVar4.c, aVar4.d);
            } else {
                aVar2 = new a(ewo0Var, ewo0.c.q, a.e);
            }
            this.o = aVar2;
        } else {
            ewo0.c cVar = this.m;
            ewo0Var.n(0, cVar);
            long j2 = cVar.l;
            Object obj2 = cVar.a;
            f fVar3 = this.p;
            if (fVar3 != null) {
                long j3 = fVar3.c;
                a aVar5 = this.o;
                Object obj3 = fVar3.b.a;
                ewo0.b bVar = this.n;
                aVar5.g(obj3, bVar);
                long j4 = bVar.e + j3;
                this.o.m(0, cVar, 0L);
                if (j4 != cVar.l) {
                    j = j4;
                    Pair<Object, Long> i = ewo0Var.i(this.m, this.n, 0, j);
                    Object obj4 = i.first;
                    long longValue = ((Long) i.second).longValue();
                    if (this.s) {
                        aVar = new a(ewo0Var, obj2, obj4);
                    } else {
                        a aVar6 = this.o;
                        aVar = new a(ewo0Var, aVar6.c, aVar6.d);
                    }
                    this.o = aVar;
                    fVar = this.p;
                    if (fVar != null && D(longValue)) {
                        i.b bVar2 = fVar.b;
                        obj = bVar2.a;
                        if (this.o.d != null && obj.equals(a.e)) {
                            obj = this.o.d;
                        }
                        a2 = bVar2.a(obj);
                        this.s = true;
                        this.r = true;
                        s(this.o);
                        if (a2 != null) {
                            f fVar4 = this.p;
                            fVar4.getClass();
                            fVar4.f(a2);
                            return;
                        }
                        return;
                    }
                }
            }
            j = j2;
            Pair<Object, Long> i2 = ewo0Var.i(this.m, this.n, 0, j);
            Object obj42 = i2.first;
            long longValue2 = ((Long) i2.second).longValue();
            if (this.s) {
            }
            this.o = aVar;
            fVar = this.p;
            if (fVar != null) {
                i.b bVar22 = fVar.b;
                obj = bVar22.a;
                if (this.o.d != null) {
                    obj = this.o.d;
                }
                a2 = bVar22.a(obj);
                this.s = true;
                this.r = true;
                s(this.o);
                if (a2 != null) {
                }
            }
        }
        a2 = null;
        this.s = true;
        this.r = true;
        s(this.o);
        if (a2 != null) {
        }
    }

    @Override // androidx.media3.exoplayer.source.t
    public final void B() {
        if (this.l) {
            return;
        }
        this.q = true;
        y(null, this.k);
    }

    @Override // androidx.media3.exoplayer.source.i
    /* renamed from: C, reason: merged with bridge method [inline-methods] */
    public final f m(i.b bVar, xu1 xu1Var, long j) {
        f fVar = new f(bVar, xu1Var, j);
        fxc0.z(fVar.e == null);
        i iVar = this.k;
        fVar.e = iVar;
        if (!this.r) {
            this.p = fVar;
            if (!this.q) {
                this.q = true;
                y(null, iVar);
            }
            return fVar;
        }
        Object obj = bVar.a;
        if (this.o.d != null && obj.equals(a.e)) {
            obj = this.o.d;
        }
        fVar.f(bVar.a(obj));
        return fVar;
    }

    public final boolean D(long j) {
        f fVar = this.p;
        int b2 = this.o.b(fVar.b.a);
        if (b2 == -1) {
            return false;
        }
        a aVar = this.o;
        ewo0.b bVar = this.n;
        aVar.f(b2, bVar, false);
        long j2 = bVar.d;
        if (j2 != C.TIME_UNSET && j >= j2) {
            j = Math.max(0L, j2 - 1);
        }
        fVar.i = j;
        return true;
    }

    @Override // androidx.media3.exoplayer.source.i
    public final void h(h hVar) {
        f fVar = (f) hVar;
        if (fVar.f != null) {
            i iVar = fVar.e;
            iVar.getClass();
            iVar.h(fVar.f);
        }
        if (hVar == this.p) {
            this.p = null;
        }
    }

    @Override // androidx.media3.exoplayer.source.t, androidx.media3.exoplayer.source.i
    public final void l(kr10 kr10Var) {
        if (this.s) {
            a aVar = this.o;
            ewo0 ewo0Var = aVar.b;
            this.o = new a(ewo0Var instanceof lxo0 ? new lxo0(((lxo0) ewo0Var).b, kr10Var) : new lxo0(ewo0Var, kr10Var), aVar.c, aVar.d);
        } else {
            this.o = new a(new b(kr10Var), ewo0.c.q, a.e);
        }
        this.k.l(kr10Var);
    }

    @Override // androidx.media3.exoplayer.source.c, androidx.media3.exoplayer.source.a
    public final void t() {
        this.r = false;
        this.q = false;
        super.t();
    }

    @Override // androidx.media3.exoplayer.source.t
    @Nullable
    public final i.b z(i.b bVar) {
        Object obj = bVar.a;
        Object obj2 = this.o.d;
        if (obj2 != null && obj2.equals(obj)) {
            obj = a.e;
        }
        return bVar.a(obj);
    }
}
