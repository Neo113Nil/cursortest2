package defpackage;

import android.os.SystemClock;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import java.util.Objects;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class rii {
    public final int a;
    public Object b;
    public int c;
    public int d;
    public boolean e;
    public long f;
    public final /* synthetic */ c40 g;

    public rii(c40 c40Var, int i) {
        this.g = c40Var;
        this.a = i;
    }

    public final void a() {
        long duration;
        c40 c40Var = this.g;
        iij iijVar = (iij) c40Var.f;
        zqi zqiVar = (zqi) c40Var.g;
        vg6 vg6Var = (vg6) c40Var.b;
        mij currentTimeline = vg6Var.getCurrentTimeline();
        Object l = currentTimeline.p() ? null : currentTimeline.l(vg6Var.getCurrentPeriodIndex());
        int currentAdGroupIndex = vg6Var.getCurrentAdGroupIndex();
        int currentAdIndexInAdGroup = vg6Var.getCurrentAdIndexInAdGroup();
        long currentPosition = vg6Var.getCurrentPosition();
        if (l == null || currentAdGroupIndex != -1) {
            duration = currentAdGroupIndex != -1 ? vg6Var.getDuration() : -9223372036854775807L;
        } else {
            currentTimeline.g(l, iijVar);
            currentPosition -= nik.h0(iijVar.e);
            duration = nik.h0(iijVar.d);
        }
        boolean isPlaying = vg6Var.isPlaying();
        if (!isPlaying || duration == C.TIME_UNSET || currentPosition < duration) {
            zqiVar.f(3);
            if (isPlaying && duration != C.TIME_UNSET) {
                zqiVar.a.sendEmptyMessageDelayed(3, (int) Math.ceil((duration - currentPosition) / vg6Var.getPlaybackParameters().a));
            }
            this.e = false;
            return;
        }
        ((tqi) c40Var.e).getClass();
        long elapsedRealtime = SystemClock.elapsedRealtime();
        boolean z = this.e;
        int i = this.a;
        if (z && Objects.equals(l, this.b) && currentAdGroupIndex == this.c && currentAdIndexInAdGroup == this.d) {
            if (elapsedRealtime - this.f >= i) {
                ((mg6) c40Var.d).a(new sii(3, i));
                return;
            }
            return;
        }
        this.e = true;
        this.f = elapsedRealtime;
        this.b = l;
        this.c = currentAdGroupIndex;
        this.d = currentAdIndexInAdGroup;
        zqiVar.f(3);
        zqiVar.a.sendEmptyMessageDelayed(3, i);
    }
}
