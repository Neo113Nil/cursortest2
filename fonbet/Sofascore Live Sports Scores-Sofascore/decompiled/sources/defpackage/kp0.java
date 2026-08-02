package defpackage;

import android.media.AudioTrack;
import android.os.Handler;
import android.os.Looper;
import com.google.android.gms.internal.ads.zzfm;
import com.google.android.gms.internal.ads.zztd;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class kp0 {
    public final Handler a;
    public final Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ kp0(zztd zztdVar) {
        this.c = zztdVar;
        Handler p = zzfm.p();
        this.a = p;
        jp0 jp0Var = new jp0(this, 2);
        this.b = jp0Var;
        zztdVar.a.registerStreamEventCallback(new m10(p, 8), jp0Var);
    }

    public void a() {
        ((lp0) this.c).a.unregisterStreamEventCallback((jp0) this.b);
        this.a.removeCallbacksAndMessages(null);
    }

    public void b(AudioTrack audioTrack) {
        audioTrack.unregisterStreamEventCallback((jp0) this.b);
        this.a.removeCallbacksAndMessages(null);
    }

    public /* synthetic */ void c() {
        ((zztd) this.c).a.unregisterStreamEventCallback((jp0) this.b);
        this.a.removeCallbacksAndMessages(null);
    }

    public kp0(lp0 lp0Var) {
        this.c = lp0Var;
        Handler q = nik.q(null);
        this.a = q;
        jp0 jp0Var = new jp0(this, 0);
        this.b = jp0Var;
        lp0Var.a.registerStreamEventCallback(new ip0(q, 0), jp0Var);
    }

    public kp0(on4 on4Var) {
        this.c = on4Var;
        this.a = new Handler(Looper.myLooper());
        this.b = new jp0(this, 1);
    }
}
