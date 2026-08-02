package defpackage;

import android.net.Uri;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import java.util.Collections;
import java.util.List;
import java.util.UUID;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class dih extends mij {
    public static final Object n = new Object();
    public final long b;
    public final long c;
    public final long d;
    public final long e;
    public final long f;
    public final long g;
    public final boolean h;
    public final boolean i;
    public final boolean j;
    public final Object k;
    public final h6c l;
    public final u5c m;

    static {
        b78 b78Var = new b78();
        p5c p5cVar = new p5c(0);
        List list = Collections.EMPTY_LIST;
        av9 av9Var = hv9.b;
        vvf vvfVar = vvf.e;
        s5c s5cVar = new s5c();
        z5c z5cVar = z5c.a;
        Uri uri = Uri.EMPTY;
        z1a.E(((Uri) p5cVar.c) == null || ((UUID) p5cVar.b) != null);
        if (uri != null) {
            new v5c(uri, null, ((UUID) p5cVar.b) != null ? new q5c(p5cVar) : null, null, list, null, vvfVar, C.TIME_UNSET);
        }
        new m5c(b78Var);
        new u5c(s5cVar);
        q6c q6cVar = q6c.D;
    }

    public dih(long j, long j2, long j3, long j4, long j5, long j6, boolean z, boolean z2, boolean z3, wxf wxfVar, h6c h6cVar, u5c u5cVar) {
        this.b = j;
        this.c = j2;
        this.d = j3;
        this.e = j4;
        this.f = j5;
        this.g = j6;
        this.h = z;
        this.i = z2;
        this.j = z3;
        this.k = wxfVar;
        h6cVar.getClass();
        this.l = h6cVar;
        this.m = u5cVar;
    }

    @Override // defpackage.mij
    public final int b(Object obj) {
        return n != obj ? -1 : 0;
    }

    @Override // defpackage.mij
    public final iij f(int i, iij iijVar, boolean z) {
        z1a.v(i, 1);
        Object obj = z ? n : null;
        long j = -this.f;
        iijVar.getClass();
        iijVar.f(null, obj, 0, this.d, j, kg.g, false);
        return iijVar;
    }

    @Override // defpackage.mij
    public final int h() {
        return 1;
    }

    @Override // defpackage.mij
    public final Object l(int i) {
        z1a.v(i, 1);
        return n;
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x002a, code lost:
    
        if (r1 > r3) goto L10;
     */
    @Override // defpackage.mij
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final kij m(int i, kij kijVar, long j) {
        long j2;
        z1a.v(i, 1);
        long j3 = this.g;
        boolean z = this.i;
        if (z && !this.j && j != 0) {
            long j4 = this.e;
            if (j4 != C.TIME_UNSET) {
                j3 += j;
            }
            j2 = -9223372036854775807L;
            kijVar.b(kij.p, this.l, this.k, this.b, this.c, C.TIME_UNSET, this.h, z, this.m, j2, this.e, 0, 0, this.f);
            return kijVar;
        }
        j2 = j3;
        kijVar.b(kij.p, this.l, this.k, this.b, this.c, C.TIME_UNSET, this.h, z, this.m, j2, this.e, 0, 0, this.f);
        return kijVar;
    }

    @Override // defpackage.mij
    public final int o() {
        return 1;
    }
}
