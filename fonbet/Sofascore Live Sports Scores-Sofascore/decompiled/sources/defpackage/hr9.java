package defpackage;

import android.content.Context;
import android.os.Looper;
import androidx.media3.exoplayer.ExoPlayer;
import com.google.ads.interactivemedia.v3.impl.JavaScriptMessage$MsgType;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class hr9 {
    public final wi5 a;
    public final Context b;
    public final hjg c;
    public final gr9 d = new gr9(this);
    public final HashMap e;
    public final HashMap f;
    public final iij g;
    public final kij h;
    public boolean i;
    public ale j;
    public List k;
    public ale l;
    public ah m;

    static {
        i6c.a("media3.exoplayer.ima");
    }

    public hr9(Context context, wi5 wi5Var, hjg hjgVar) {
        this.b = context.getApplicationContext();
        this.a = wi5Var;
        this.c = hjgVar;
        av9 av9Var = hv9.b;
        this.k = vvf.e;
        this.e = new HashMap();
        this.f = new HashMap();
        this.g = new iij();
        this.h = new kij();
    }

    public final void a() {
        ah ahVar;
        ale aleVar = this.l;
        if (aleVar == null) {
            return;
        }
        mij currentTimeline = aleVar.getCurrentTimeline();
        if (currentTimeline.p()) {
            return;
        }
        int d = currentTimeline.d(aleVar.getCurrentPeriodIndex(), this.g, this.h, aleVar.getRepeatMode(), aleVar.getShuffleModeEnabled());
        if (d == -1) {
            return;
        }
        iij iijVar = this.g;
        currentTimeline.f(d, iijVar, false);
        Object obj = iijVar.g.a;
        if (obj == null || (ahVar = (ah) this.e.get(obj)) == null || ahVar == this.m) {
            return;
        }
        ahVar.q(nik.h0(((Long) currentTimeline.i(this.h, iijVar, iijVar.c, C.TIME_UNSET).second).longValue()), nik.h0(iijVar.d));
    }

    public final void b() {
        yg ygVar;
        Object obj;
        ah ahVar;
        ah ahVar2 = this.m;
        ale aleVar = this.l;
        ah ahVar3 = null;
        if (aleVar != null) {
            mij currentTimeline = aleVar.getCurrentTimeline();
            if (!currentTimeline.p() && (obj = currentTimeline.f(aleVar.getCurrentPeriodIndex(), this.g, false).g.a) != null && (ahVar = (ah) this.e.get(obj)) != null && this.f.containsValue(ahVar)) {
                ahVar3 = ahVar;
            }
        }
        if (ahVar2 != ahVar3) {
            if (ahVar2 != null) {
                ale aleVar2 = ahVar2.q;
                aleVar2.getClass();
                ahVar2.g.post(new r0(2, ahVar2, aleVar2));
            }
            this.m = ahVar3;
            if (ahVar3 != null) {
                ale aleVar3 = this.l;
                aleVar3.getClass();
                ahVar3.q = aleVar3;
                aleVar3.s(ahVar3);
                boolean playWhenReady = aleVar3.getPlayWhenReady();
                ahVar3.onTimelineChanged(aleVar3.getCurrentTimeline(), 1);
                cjn cjnVar = ahVar3.u;
                if (kg.g.equals(ahVar3.z) || cjnVar == null || !ahVar3.B) {
                    return;
                }
                int d = ahVar3.z.d(nik.T(ah.e(aleVar3, ahVar3.x, ahVar3.f)), nik.T(ahVar3.y));
                if (d != -1 && (ygVar = ahVar3.E) != null && ygVar.a != d) {
                    ahVar3.a.getClass();
                    cjnVar.e(JavaScriptMessage$MsgType.discardAdBreak);
                }
                if (playWhenReady) {
                    cjnVar.e(JavaScriptMessage$MsgType.resume);
                }
            }
        }
    }

    public final void c() {
        ale aleVar = this.l;
        if (aleVar != null) {
            aleVar.z(this.d);
            this.l = null;
            b();
        }
        this.j = null;
        HashMap hashMap = this.f;
        Iterator it = hashMap.values().iterator();
        while (it.hasNext()) {
            ((ah) it.next()).u();
        }
        hashMap.clear();
        HashMap hashMap2 = this.e;
        Iterator it2 = hashMap2.values().iterator();
        while (it2.hasNext()) {
            ((ah) it2.next()).u();
        }
        hashMap2.clear();
    }

    public final void d(ExoPlayer exoPlayer) {
        z1a.E(Looper.myLooper() == Looper.getMainLooper());
        z1a.E(exoPlayer == null || ((vg6) exoPlayer).t == Looper.getMainLooper());
        this.j = exoPlayer;
        this.i = true;
    }
}
