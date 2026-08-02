package defpackage;

import com.mbridge.msdk.playercommon.exoplayer2.C;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class pvb extends mij {
    public final h6c b;

    public pvb(h6c h6cVar) {
        this.b = h6cVar;
    }

    @Override // defpackage.mij
    public final int b(Object obj) {
        return obj == nvb.e ? 0 : -1;
    }

    @Override // defpackage.mij
    public final iij f(int i, iij iijVar, boolean z) {
        iijVar.f(z ? 0 : null, z ? nvb.e : null, 0, C.TIME_UNSET, 0L, kg.g, true);
        return iijVar;
    }

    @Override // defpackage.mij
    public final int h() {
        return 1;
    }

    @Override // defpackage.mij
    public final Object l(int i) {
        return nvb.e;
    }

    @Override // defpackage.mij
    public final kij m(int i, kij kijVar, long j) {
        kijVar.b(kij.p, this.b, null, C.TIME_UNSET, C.TIME_UNSET, C.TIME_UNSET, false, true, null, 0L, C.TIME_UNSET, 0, 0, 0L);
        kijVar.j = true;
        return kijVar;
    }

    @Override // defpackage.mij
    public final int o() {
        return 1;
    }
}
