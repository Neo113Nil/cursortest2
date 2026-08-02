package androidx.media3.exoplayer.source;

import androidx.annotation.Nullable;
import androidx.media3.exoplayer.source.i;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import java.io.IOException;
import java.util.ArrayList;
import xsna.das;
import xsna.ewo0;
import xsna.fxc0;
import xsna.xg0;
import xsna.xu1;
import xsna.y2r0;

/* loaded from: classes12.dex */
public final class ClippingMediaSource extends t {
    public final long l;
    public final long m;
    public final boolean n;
    public final ArrayList<androidx.media3.exoplayer.source.b> o;
    public final ewo0.c p;

    @Nullable
    public b q;

    @Nullable
    public IllegalClippingException r;
    public long s;
    public long t;

    public static final class IllegalClippingException extends IOException {
        public final int reason;

        public IllegalClippingException(int i) {
            this(i, C.TIME_UNSET, C.TIME_UNSET);
        }

        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public IllegalClippingException(int i, long j, long j2) {
            super(r0.toString());
            String str;
            StringBuilder sb = new StringBuilder("Illegal clipping: ");
            if (i != 0) {
                if (i == 1) {
                    str = "not seekable to start";
                } else if (i != 2) {
                    str = "unknown";
                } else {
                    fxc0.z((j == C.TIME_UNSET || j2 == C.TIME_UNSET) ? false : true);
                    str = "start exceeds end. Start time: " + j + ", End time: " + j2;
                }
            } else {
                str = "invalid period count";
            }
            sb.append(str);
            this.reason = i;
        }
    }

    public static final class a {
        public final i a;
        public long b;
        public long c;
        public boolean d;
        public boolean e;

        public a(i iVar) {
            iVar.getClass();
            this.a = iVar;
            this.d = true;
            this.c = Long.MIN_VALUE;
        }
    }

    public static final class b extends das {
        public final long c;
        public final long d;
        public final long e;
        public final boolean f;

        public b(ewo0 ewo0Var, long j, long j2) throws IllegalClippingException {
            super(ewo0Var);
            if (j2 != Long.MIN_VALUE && j2 < j) {
                throw new IllegalClippingException(2, j, j2);
            }
            boolean z = false;
            if (ewo0Var.h() != 1) {
                throw new IllegalClippingException(0);
            }
            ewo0.c m = ewo0Var.m(0, new ewo0.c(), 0L);
            long max = Math.max(0L, j);
            if (!m.k && max != 0 && !m.h) {
                throw new IllegalClippingException(1);
            }
            long max2 = j2 == Long.MIN_VALUE ? m.m : Math.max(0L, j2);
            long j3 = m.m;
            long j4 = C.TIME_UNSET;
            if (j3 != C.TIME_UNSET) {
                max2 = max2 > j3 ? j3 : max2;
                if (max > max2) {
                    max = max2;
                }
            }
            this.c = max;
            this.d = max2;
            this.e = max2 != C.TIME_UNSET ? max2 - max : j4;
            if (m.i && (max2 == C.TIME_UNSET || (j3 != C.TIME_UNSET && max2 == j3))) {
                z = true;
            }
            this.f = z;
        }

        @Override // xsna.das, xsna.ewo0
        public final ewo0.b f(int i, ewo0.b bVar, boolean z) {
            this.b.f(0, bVar, z);
            long j = bVar.e - this.c;
            long j2 = this.e;
            long j3 = C.TIME_UNSET;
            if (j2 != C.TIME_UNSET) {
                j3 = j2 - j;
            }
            bVar.h(bVar.a, bVar.b, 0, j3, j, xg0.c, false);
            return bVar;
        }

        @Override // xsna.das, xsna.ewo0
        public final ewo0.c m(int i, ewo0.c cVar, long j) {
            this.b.m(0, cVar, 0L);
            long j2 = cVar.p;
            long j3 = this.c;
            cVar.p = j2 + j3;
            cVar.m = this.e;
            cVar.i = this.f;
            long j4 = cVar.l;
            if (j4 != C.TIME_UNSET) {
                long max = Math.max(j4, j3);
                cVar.l = max;
                long j5 = this.d;
                if (j5 != C.TIME_UNSET) {
                    max = Math.min(max, j5);
                }
                cVar.l = max - j3;
            }
            long j0 = y2r0.j0(j3);
            long j6 = cVar.e;
            if (j6 != C.TIME_UNSET) {
                cVar.e = j6 + j0;
            }
            long j7 = cVar.f;
            if (j7 != C.TIME_UNSET) {
                cVar.f = j7 + j0;
            }
            return cVar;
        }
    }

    public ClippingMediaSource(a aVar) {
        super(aVar.a);
        this.l = aVar.b;
        this.m = aVar.c;
        this.n = aVar.d;
        this.o = new ArrayList<>();
        this.p = new ewo0.c();
    }

    @Override // androidx.media3.exoplayer.source.t
    public final void A(ewo0 ewo0Var) {
        if (this.r != null) {
            return;
        }
        C(ewo0Var);
    }

    public final void C(ewo0 ewo0Var) {
        long j;
        ewo0.c cVar = this.p;
        ewo0Var.n(0, cVar);
        long j2 = cVar.p;
        b bVar = this.q;
        long j3 = this.m;
        ArrayList<androidx.media3.exoplayer.source.b> arrayList = this.o;
        if (bVar == null || arrayList.isEmpty()) {
            j = this.l;
            this.s = j2 + j;
            this.t = j3 != Long.MIN_VALUE ? j2 + j3 : Long.MIN_VALUE;
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                androidx.media3.exoplayer.source.b bVar2 = arrayList.get(i);
                long j4 = this.s;
                long j5 = this.t;
                bVar2.g = j4;
                bVar2.h = j5;
            }
        } else {
            j = this.s - j2;
            j3 = j3 == Long.MIN_VALUE ? Long.MIN_VALUE : this.t - j2;
        }
        try {
            b bVar3 = new b(ewo0Var, j, j3);
            this.q = bVar3;
            s(bVar3);
        } catch (IllegalClippingException e) {
            this.r = e;
            for (int i2 = 0; i2 < arrayList.size(); i2++) {
                arrayList.get(i2).i = this.r;
            }
        }
    }

    @Override // androidx.media3.exoplayer.source.i
    public final void h(h hVar) {
        ArrayList<androidx.media3.exoplayer.source.b> arrayList = this.o;
        fxc0.z(arrayList.remove(hVar));
        this.k.h(((androidx.media3.exoplayer.source.b) hVar).b);
        if (arrayList.isEmpty()) {
            b bVar = this.q;
            bVar.getClass();
            C(bVar.b);
        }
    }

    @Override // androidx.media3.exoplayer.source.i
    public final h m(i.b bVar, xu1 xu1Var, long j) {
        androidx.media3.exoplayer.source.b bVar2 = new androidx.media3.exoplayer.source.b(this.k.m(bVar, xu1Var, j), this.n, this.s, this.t);
        this.o.add(bVar2);
        return bVar2;
    }

    @Override // androidx.media3.exoplayer.source.c, androidx.media3.exoplayer.source.i
    public final void maybeThrowSourceInfoRefreshError() throws IOException {
        IllegalClippingException illegalClippingException = this.r;
        if (illegalClippingException != null) {
            throw illegalClippingException;
        }
        super.maybeThrowSourceInfoRefreshError();
    }

    @Override // androidx.media3.exoplayer.source.c, androidx.media3.exoplayer.source.a
    public final void t() {
        super.t();
        this.r = null;
        this.q = null;
    }
}
