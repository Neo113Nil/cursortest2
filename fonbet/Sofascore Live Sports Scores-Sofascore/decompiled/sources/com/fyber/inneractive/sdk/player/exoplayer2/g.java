package com.fyber.inneractive.sdk.player.exoplayer2;

import android.os.Looper;
import com.fyber.inneractive.sdk.player.controller.b0;
import com.fyber.inneractive.sdk.player.exoplayer2.util.z;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import defpackage.zzl;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArraySet;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public final class g {
    public final com.fyber.inneractive.sdk.player.exoplayer2.trackselection.i a;
    public final com.fyber.inneractive.sdk.player.exoplayer2.trackselection.h b;
    public final f c;
    public final l d;
    public final CopyOnWriteArraySet e;
    public final w f;
    public final v g;
    public boolean h;
    public boolean i;
    public int j;
    public int k;
    public int l;
    public x m;
    public Object n;
    public com.fyber.inneractive.sdk.player.exoplayer2.trackselection.h o;
    public s p;
    public i q;
    public int r;
    public long s;

    public g(a[] aVarArr, com.fyber.inneractive.sdk.player.exoplayer2.trackselection.d dVar, c cVar) {
        int i = z.a;
        if (aVarArr.length <= 0) {
            zzl.s();
            throw null;
        }
        this.a = dVar;
        this.i = false;
        this.j = 1;
        this.e = new CopyOnWriteArraySet();
        com.fyber.inneractive.sdk.player.exoplayer2.trackselection.h hVar = new com.fyber.inneractive.sdk.player.exoplayer2.trackselection.h(new com.fyber.inneractive.sdk.player.exoplayer2.trackselection.b[aVarArr.length]);
        this.b = hVar;
        this.m = x.a;
        this.f = new w();
        this.g = new v();
        int i2 = com.fyber.inneractive.sdk.player.exoplayer2.source.z.d;
        this.o = hVar;
        this.p = s.d;
        f fVar = new f(this, Looper.myLooper() != null ? Looper.myLooper() : Looper.getMainLooper());
        this.c = fVar;
        i iVar = new i(0, 0L);
        this.q = iVar;
        this.d = new l(aVarArr, dVar, cVar, this.i, fVar, iVar, this);
    }

    public final void a(int i, long j) {
        long j2;
        if (i < 0 || (!this.m.c() && i >= this.m.b())) {
            throw new q();
        }
        this.k++;
        this.r = i;
        boolean c = this.m.c();
        long j3 = C.TIME_UNSET;
        if (c) {
            j2 = 1000;
        } else {
            this.m.a(i, this.f, 0L);
            long j4 = j == C.TIME_UNSET ? this.f.e : j;
            w wVar = this.f;
            int i2 = wVar.c;
            long j5 = wVar.g;
            int i3 = b.a;
            long j6 = (j4 == C.TIME_UNSET ? -9223372036854775807L : j4 * 1000) + j5;
            j2 = 1000;
            long j7 = this.m.a(i2, this.g, false).d;
            while (j7 != C.TIME_UNSET && j6 >= j7 && i2 < this.f.d) {
                j6 -= j7;
                i2++;
                j7 = this.m.a(i2, this.g, false).d;
            }
        }
        if (j == C.TIME_UNSET) {
            this.s = 0L;
            this.d.f.obtainMessage(3, new j(this.m, i, C.TIME_UNSET)).sendToTarget();
            return;
        }
        this.s = j;
        l lVar = this.d;
        x xVar = this.m;
        int i4 = b.a;
        if (j != C.TIME_UNSET) {
            j3 = j * j2;
        }
        lVar.f.obtainMessage(3, new j(xVar, i, j3)).sendToTarget();
        Iterator it = this.e.iterator();
        while (it.hasNext()) {
            ((b0) it.next()).getClass();
        }
    }

    public final void a(boolean z) {
        if (this.i != z) {
            this.i = z;
            this.d.f.obtainMessage(1, z ? 1 : 0, 0).sendToTarget();
            Iterator it = this.e.iterator();
            while (it.hasNext()) {
                ((b0) it.next()).a(this.j, z);
            }
        }
    }

    public final void a(e... eVarArr) {
        l lVar = this.d;
        if (lVar.q) {
            return;
        }
        lVar.f.obtainMessage(11, eVarArr).sendToTarget();
    }

    public final int a() {
        if (!this.m.c() && this.k <= 0) {
            return this.m.a(this.q.a, this.g, false).c;
        }
        return this.r;
    }
}
