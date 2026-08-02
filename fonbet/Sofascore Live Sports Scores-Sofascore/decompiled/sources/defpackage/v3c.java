package defpackage;

import android.os.Handler;
import android.os.SystemClock;
import android.view.Surface;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class v3c implements vqk {
    public final /* synthetic */ b4c b;

    public v3c(b4c b4cVar) {
        this.b = b4cVar;
    }

    @Override // defpackage.vqk
    public final void a() {
        b4c b4cVar = this.b;
        Surface surface = b4cVar.Y0;
        if (surface != null) {
            ro0 ro0Var = b4cVar.I0;
            Handler handler = ro0Var.a;
            if (handler != null) {
                handler.post(new jd(ro0Var, surface, SystemClock.elapsedRealtime(), 6));
            }
            b4cVar.b1 = true;
        }
    }

    @Override // defpackage.vqk
    public final void b() {
        b4c b4cVar = this.b;
        if (b4cVar.Y0 != null) {
            b4cVar.P0(0, 1);
        }
    }

    @Override // defpackage.vqk
    public final void c() {
        zg6 zg6Var = this.b.I;
        if (zg6Var != null) {
            zg6Var.a();
        }
    }

    @Override // defpackage.vqk
    public final void onVideoSizeChanged(zqk zqkVar) {
    }
}
