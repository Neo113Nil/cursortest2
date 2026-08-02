package defpackage;

import android.os.SystemClock;
import java.util.Objects;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class qii {
    public final int a;
    public Object b;
    public int c;
    public int d;
    public long e;
    public boolean f;
    public long g;
    public final /* synthetic */ c40 h;

    public qii(c40 c40Var, int i) {
        this.h = c40Var;
        this.a = i;
    }

    public final void a() {
        c40 c40Var = this.h;
        zqi zqiVar = (zqi) c40Var.g;
        vg6 vg6Var = (vg6) c40Var.b;
        if (!vg6Var.isPlaying()) {
            if (this.f) {
                zqiVar.f(2);
            }
            this.f = false;
            return;
        }
        mij currentTimeline = vg6Var.getCurrentTimeline();
        Object l = currentTimeline.p() ? null : currentTimeline.l(vg6Var.getCurrentPeriodIndex());
        int currentAdGroupIndex = vg6Var.getCurrentAdGroupIndex();
        int currentAdIndexInAdGroup = vg6Var.getCurrentAdIndexInAdGroup();
        long currentPosition = vg6Var.getCurrentPosition();
        if (l != null && currentAdGroupIndex == -1) {
            currentPosition -= nik.h0(currentTimeline.g(l, (iij) c40Var.f).e);
        }
        ((tqi) c40Var.e).getClass();
        long elapsedRealtime = SystemClock.elapsedRealtime();
        boolean z = this.f;
        int i = this.a;
        if (z && Objects.equals(l, this.b) && currentAdGroupIndex == this.c && currentAdIndexInAdGroup == this.d && currentPosition == this.e) {
            if (elapsedRealtime - this.g >= i) {
                ((mg6) c40Var.d).a(new sii(2, i));
                return;
            }
            return;
        }
        this.f = true;
        this.g = elapsedRealtime;
        this.b = l;
        this.c = currentAdGroupIndex;
        this.d = currentAdIndexInAdGroup;
        this.e = currentPosition;
        zqiVar.f(2);
        zqiVar.a.sendEmptyMessageDelayed(2, i);
    }
}
