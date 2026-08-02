package defpackage;

import androidx.compose.runtime.e;
import com.unity3d.services.UnityAdsConstants;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class cej {
    public final yaj a;
    public final yaj b;
    public final e1d c;
    public final e1d d;
    public final e1d e;
    public final e1d f;
    public final t32 g;

    public cej() {
        yaj yajVar = new yaj();
        this.a = yajVar;
        this.b = yajVar;
        f7a f7aVar = f7a.k;
        this.c = e.e(null, f7aVar);
        this.d = e.e(null, f7aVar);
        this.e = e.e(null, f7aVar);
        this.f = e.f(new p75(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT));
        this.g = new t32();
    }

    public final long a(long j) {
        oqf oqfVar;
        dma e = e();
        oqf oqfVar2 = oqf.e;
        if (e != null) {
            if (e.f()) {
                dma b = b();
                oqfVar = b != null ? b.p(e, true) : null;
            } else {
                oqfVar = oqfVar2;
            }
            if (oqfVar != null) {
                oqfVar2 = oqfVar;
            }
        }
        return r4a.t(j, oqfVar2);
    }

    public final dma b() {
        return (dma) ((eoh) this.e).getValue();
    }

    public final aej c() {
        return (aej) this.b.getValue();
    }

    public final int d(long j, boolean z) {
        aej c = c();
        if (c == null) {
            return -1;
        }
        if (z) {
            j = a(j);
        }
        return c.b.g(r4a.v(this, j));
    }

    public final dma e() {
        return (dma) ((eoh) this.c).getValue();
    }

    public final boolean f(long j) {
        aej c = c();
        if (c == null) {
            return false;
        }
        long v = r4a.v(this, a(j));
        int e = c.b.e(Float.intBitsToFloat((int) (4294967295L & v)));
        int i = (int) (v >> 32);
        return Float.intBitsToFloat(i) >= c.f(e) && Float.intBitsToFloat(i) <= c.g(e);
    }
}
