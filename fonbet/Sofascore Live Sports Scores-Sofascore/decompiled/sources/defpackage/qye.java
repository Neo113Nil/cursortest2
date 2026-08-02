package defpackage;

import com.mbridge.msdk.playercommon.exoplayer2.C;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class qye extends nn8 {
    public final /* synthetic */ int c = 0;
    public final Object d;

    public qye(mij mijVar, kg kgVar) {
        super(mijVar);
        z1a.E(mijVar.h() == 1);
        z1a.E(mijVar.o() == 1);
        this.d = kgVar;
    }

    @Override // defpackage.nn8, defpackage.mij
    public final iij f(int i, iij iijVar, boolean z) {
        int i2 = this.c;
        mij mijVar = this.b;
        Object obj = this.d;
        switch (i2) {
            case 0:
                iij f = mijVar.f(i, iijVar, z);
                if (mijVar.m(f.c, (kij) obj, 0L).a()) {
                    f.f(iijVar.a, iijVar.b, iijVar.c, iijVar.d, iijVar.e, kg.g, true);
                } else {
                    f.f = true;
                }
                return f;
            default:
                mijVar.f(i, iijVar, z);
                long j = iijVar.d;
                if (j == C.TIME_UNSET) {
                    j = ((kg) obj).d;
                }
                iijVar.f(iijVar.a, iijVar.b, iijVar.c, j, iijVar.e, (kg) obj, iijVar.f);
                return iijVar;
        }
    }

    public qye(mij mijVar) {
        super(mijVar);
        this.d = new kij();
    }
}
