package defpackage;

import android.os.SystemClock;
import androidx.media3.common.b;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import java.util.ArrayList;
import java.util.List;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class lh extends d71 {
    public final tn4 g;
    public final long h;
    public final long i;
    public final long j;
    public final int k;
    public final int l;
    public final float m;
    public final float n;
    public final hv9 o;
    public final tqi p;
    public float q;
    public int r;
    public int s;
    public long t;
    public j2c u;

    public lh(osj osjVar, int[] iArr, tn4 tn4Var, hv9 hv9Var) {
        super(osjVar, iArr);
        this.g = tn4Var;
        this.h = 10000000L;
        this.i = 25000000L;
        this.j = 25000000L;
        this.k = 1279;
        this.l = 719;
        this.m = 0.7f;
        this.n = 0.75f;
        this.o = hv9.v(hv9Var);
        this.p = tqi.a;
        this.q = 1.0f;
        this.s = 0;
        this.t = C.TIME_UNSET;
    }

    public static void i(ArrayList arrayList, long[] jArr) {
        long j = 0;
        for (long j2 : jArr) {
            j += j2;
        }
        for (int i = 0; i < arrayList.size(); i++) {
            zu9 zu9Var = (zu9) arrayList.get(i);
            if (zu9Var != null) {
                zu9Var.c(new jh(j, jArr[i]));
            }
        }
    }

    public static long k(List list) {
        if (!list.isEmpty()) {
            j2c j2cVar = (j2c) jca.H(list);
            long j = j2cVar.g;
            if (j != C.TIME_UNSET) {
                long j2 = j2cVar.h;
                if (j2 != C.TIME_UNSET) {
                    return j2 - j;
                }
            }
        }
        return C.TIME_UNSET;
    }

    @Override // defpackage.d71, defpackage.nh6
    public final void disable() {
        this.u = null;
    }

    @Override // defpackage.d71, defpackage.nh6
    public final void enable() {
        this.t = C.TIME_UNSET;
        this.u = null;
    }

    @Override // defpackage.d71, defpackage.nh6
    public final int evaluateQueueSize(long j, List list) {
        int i;
        int i2;
        this.p.getClass();
        long elapsedRealtime = SystemClock.elapsedRealtime();
        long j2 = this.t;
        if (j2 != C.TIME_UNSET && elapsedRealtime - j2 < 1000 && (list.isEmpty() || ((j2c) jca.H(list)).equals(this.u))) {
            return list.size();
        }
        this.t = elapsedRealtime;
        this.u = list.isEmpty() ? null : (j2c) jca.H(list);
        if (list.isEmpty()) {
            return 0;
        }
        int size = list.size();
        long F = nik.F(((j2c) list.get(size - 1)).g - j, this.q);
        long j3 = this.j;
        if (F >= j3) {
            k(list);
            b bVar = this.d[j(elapsedRealtime)];
            for (int i3 = 0; i3 < size; i3++) {
                j2c j2cVar = (j2c) list.get(i3);
                b bVar2 = j2cVar.d;
                if (nik.F(j2cVar.g - j, this.q) >= j3 && bVar2.j < bVar.j && (i = bVar2.w) != -1 && i <= this.l && (i2 = bVar2.v) != -1 && i2 <= this.k && i < bVar.w) {
                    return i3;
                }
            }
        }
        return size;
    }

    @Override // defpackage.nh6
    public final int getSelectedIndex() {
        return this.r;
    }

    @Override // defpackage.nh6
    public final Object getSelectionData() {
        return null;
    }

    @Override // defpackage.nh6
    public final int getSelectionReason() {
        return this.s;
    }

    @Override // defpackage.nh6
    public final void h(long j, long j2, long j3, List list, k2c[] k2cVarArr) {
        long k;
        this.p.getClass();
        long elapsedRealtime = SystemClock.elapsedRealtime();
        int i = this.r;
        if (i >= k2cVarArr.length || !k2cVarArr[i].next()) {
            int length = k2cVarArr.length;
            int i2 = 0;
            while (true) {
                if (i2 >= length) {
                    k = k(list);
                    break;
                }
                k2c k2cVar = k2cVarArr[i2];
                if (k2cVar.next()) {
                    k = k2cVar.b() - k2cVar.a();
                    break;
                }
                i2++;
            }
        } else {
            k2c k2cVar2 = k2cVarArr[this.r];
            k = k2cVar2.b() - k2cVar2.a();
        }
        int i3 = this.s;
        if (i3 == 0) {
            this.s = 1;
            this.r = j(elapsedRealtime);
            return;
        }
        int i4 = this.r;
        int e = list.isEmpty() ? -1 : e(((j2c) jca.H(list)).d);
        if (e != -1) {
            i3 = ((j2c) jca.H(list)).e;
            i4 = e;
        }
        int j4 = j(elapsedRealtime);
        if (j4 != i4 && !d(i4, elapsedRealtime)) {
            b[] bVarArr = this.d;
            b bVar = bVarArr[i4];
            b bVar2 = bVarArr[j4];
            long j5 = this.h;
            if (j3 != C.TIME_UNSET) {
                j5 = Math.min((long) ((k != C.TIME_UNSET ? j3 - k : j3) * this.n), j5);
            }
            int i5 = bVar2.j;
            int i6 = bVar.j;
            if ((i5 > i6 && j2 < j5) || (i5 < i6 && j2 >= this.i)) {
                j4 = i4;
            }
        }
        if (j4 != i4) {
            i3 = 3;
        }
        this.s = i3;
        this.r = j4;
    }

    public final int j(long j) {
        long j2;
        tn4 tn4Var = this.g;
        synchronized (tn4Var) {
            j2 = tn4Var.l;
        }
        long j3 = (long) (j2 * this.m);
        this.g.getClass();
        long j4 = (long) (j3 / this.q);
        if (!this.o.isEmpty()) {
            int i = 1;
            while (i < this.o.size() - 1 && ((jh) this.o.get(i)).a < j4) {
                i++;
            }
            jh jhVar = (jh) this.o.get(i - 1);
            jh jhVar2 = (jh) this.o.get(i);
            long j5 = jhVar.a;
            long j6 = jhVar.b;
            j4 = j6 + ((long) (((j4 - j5) / (jhVar2.a - j5)) * (jhVar2.b - j6)));
        }
        int i2 = 0;
        for (int i3 = 0; i3 < this.b; i3++) {
            if (j == Long.MIN_VALUE || !d(i3, j)) {
                if (this.d[i3].j <= j4) {
                    return i3;
                }
                i2 = i3;
            }
        }
        return i2;
    }

    @Override // defpackage.d71, defpackage.nh6
    public final void onPlaybackSpeed(float f) {
        this.q = f;
    }
}
