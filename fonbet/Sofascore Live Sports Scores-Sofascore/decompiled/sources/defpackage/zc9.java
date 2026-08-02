package defpackage;

import androidx.media3.common.DrmInitData;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import java.util.List;
import java.util.Map;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class zc9 extends ed9 {
    public final int d;
    public final long e;
    public final boolean f;
    public final boolean g;
    public final long h;
    public final boolean i;
    public final int j;
    public final long k;
    public final int l;
    public final long m;
    public final long n;
    public final boolean o;
    public final boolean p;
    public final DrmInitData q;
    public final hv9 r;
    public final hv9 s;
    public final lv9 t;
    public final long u;
    public final yc9 v;
    public final hv9 w;
    public final wc9 x;

    public zc9(int i, String str, List list, long j, boolean z, long j2, boolean z2, int i2, long j3, int i3, long j4, long j5, boolean z3, boolean z4, boolean z5, DrmInitData drmInitData, List list2, List list3, yc9 yc9Var, Map map, List list4, wc9 wc9Var) {
        super(str, list, z3);
        long j6;
        this.d = i;
        this.h = j2;
        this.g = z;
        this.i = z2;
        this.j = i2;
        this.k = j3;
        this.l = i3;
        this.m = j4;
        this.n = j5;
        this.o = z4;
        this.p = z5;
        this.q = drmInitData;
        this.r = hv9.v(list2);
        this.s = hv9.v(list3);
        this.t = lv9.f(map);
        this.w = hv9.v(list4);
        this.x = wc9Var;
        if (!list3.isEmpty()) {
            uc9 uc9Var = (uc9) jca.H(list3);
            j6 = uc9Var.e + uc9Var.c;
            this.u = j6;
        } else if (list2.isEmpty()) {
            this.u = 0L;
            j6 = 0;
        } else {
            wc9 wc9Var2 = (wc9) jca.H(list2);
            j6 = wc9Var2.e + wc9Var2.c;
            this.u = j6;
        }
        this.e = j != C.TIME_UNSET ? j >= 0 ? Math.min(j6, j) : Math.max(0L, j6 + j) : C.TIME_UNSET;
        this.f = j >= 0;
        this.v = yc9Var;
    }

    @Override // defpackage.b38
    public final Object copy(List list) {
        return this;
    }
}
