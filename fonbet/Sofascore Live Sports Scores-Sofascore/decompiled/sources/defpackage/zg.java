package defpackage;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public final class zg implements wf, uf {
    public final /* synthetic */ ah a;

    public zg(ah ahVar) {
        this.a = ahVar;
    }

    @Override // defpackage.uf
    public final void a(vf vfVar) {
        tf tfVar = ((zjo) vfVar).a;
        ah ahVar = this.a;
        ahVar.a.getClass();
        if (ahVar.u == null) {
            ahVar.p = null;
            ahVar.z = new kg(ahVar.e, new long[0]);
            ahVar.x();
        } else {
            int i = tfVar.a;
            if (i == 10 || i == 15) {
                try {
                    ahVar.i(tfVar);
                } catch (RuntimeException e) {
                    ahVar.r(e, "onAdError");
                }
            }
        }
        if (ahVar.w == null) {
            ahVar.w = new jz2(tfVar);
        }
        ahVar.s();
    }

    @Override // defpackage.wf
    public final void c(hoo hooVar) {
        ah ahVar = this.a;
        ahVar.a.getClass();
        try {
            ahVar.h(hooVar);
        } catch (RuntimeException e) {
            ahVar.r(e, "onAdEvent");
        }
    }
}
