package defpackage;

import java.util.concurrent.RejectedExecutionException;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class rlo extends klo {
    public qlo p;

    @Override // com.google.android.gms.internal.ads.zzhbr
    public final void k() {
        qlo qloVar = this.p;
        if (qloVar != null) {
            qloVar.q();
        }
    }

    @Override // defpackage.klo
    public final void r(int i) {
        this.l = null;
        if (i == 1) {
            this.p = null;
        }
    }

    @Override // defpackage.klo
    public final void x() {
        qlo qloVar = this.p;
        if (qloVar != null) {
            try {
                qloVar.f.execute(qloVar);
            } catch (RejectedExecutionException e) {
                qloVar.g.e(e);
            }
        }
    }

    @Override // defpackage.klo
    public final void w(int i, Object obj) {
    }
}
