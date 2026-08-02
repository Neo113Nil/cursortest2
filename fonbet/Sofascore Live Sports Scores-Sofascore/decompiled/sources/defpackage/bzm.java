package defpackage;

import com.blaze.blazesdk.features.videos.players.ui.a;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class bzm extends ouk {
    public bk7 a;
    public final /* synthetic */ a b;

    public bzm(a aVar) {
        this.b = aVar;
    }

    @Override // defpackage.ouk
    public final void a(int i) {
        a aVar = this.b;
        if (i == 0) {
            bk7 bk7Var = this.a;
            if (bk7Var != null) {
                bk7Var.invoke();
            }
            int i2 = a.I;
            ((w3m) aVar.getViewModel()).getClass();
            return;
        }
        if (i == 1) {
            int i3 = a.I;
            ((w3m) aVar.getViewModel()).getClass();
        } else {
            if (i != 2) {
                return;
            }
            int i4 = a.I;
            ((w3m) aVar.getViewModel()).getClass();
        }
    }

    @Override // defpackage.ouk
    public final void b(int i, float f, int i2) {
        if (i2 > 0) {
            int i3 = a.I;
            w3m w3mVar = (w3m) this.b.getViewModel();
            w3mVar.Q0 = Integer.max(w3mVar.Q0, i + 1);
        }
    }

    @Override // defpackage.ouk
    public final void c(int i) {
        int i2 = a.I;
        a aVar = this.b;
        w3m w3mVar = (w3m) aVar.getViewModel();
        w3mVar.Q0 = Integer.max(w3mVar.Q0, i);
        if (evl.n(aVar.q.e)) {
            w3m.onPageSelected$default((w3m) aVar.getViewModel(), i, false, 2, null);
        } else {
            this.a = new bk7(this, i, 9);
        }
    }
}
