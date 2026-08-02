package defpackage;

import androidx.media3.common.b;
import androidx.media3.exoplayer.ExoPlayer;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.c;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public final class pfg implements wke {
    public final /* synthetic */ tfg a;

    public pfg(tfg tfgVar) {
        this.a = tfgVar;
    }

    @Override // defpackage.wke
    public final void onIsPlayingChanged(boolean z) {
        int i;
        rq3 rq3Var;
        tfg tfgVar = this.a;
        synchronized (tfgVar) {
            try {
                scg scgVar = tfgVar.J;
                i = 1;
                rq3Var = null;
                if (scgVar == null) {
                    scg scgVar2 = new scg(tfgVar, 1);
                    tfgVar.J = scgVar2;
                    tfgVar.K.schedule(scgVar2, 0L, 250L);
                } else if (!z) {
                    scgVar.cancel();
                    tfgVar.J = null;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (!z) {
            hs4 hs4Var = z45.a;
            xw3.L(s9a.c(rob.a), null, null, new lfg(this.a, rq3Var, i), 3);
        }
        if (z) {
            tfg tfgVar2 = this.a;
            if (!tfgVar2.C) {
                tfgVar2.C = true;
                zl1 zl1Var = tfgVar2.I;
                zl1Var.b.add(new adg(new hfg(tfgVar2, 2)));
                zl1Var.j();
            }
        }
        this.a.g();
    }

    @Override // defpackage.wke
    public final void onPlaybackStateChanged(int i) {
        rq3 rq3Var = null;
        tfg tfgVar = this.a;
        if (i == 3) {
            ExoPlayer exoPlayer = tfgVar.v;
            if (exoPlayer == null) {
                Intrinsics.i("exoPlayer");
                throw null;
            }
            if (((vg6) exoPlayer).getDuration() != C.TIME_UNSET) {
                tfgVar.h();
                return;
            } else {
                hs4 hs4Var = z45.a;
                xw3.L(s9a.c(rob.a), null, null, new ofg(tfgVar, rq3Var, 0), 3);
                return;
            }
        }
        if (i != 4) {
            return;
        }
        tfgVar.m(kfg.d);
        if (!tfgVar.E) {
            tfgVar.E = true;
            zl1 zl1Var = tfgVar.I;
            zl1Var.b.add(new adg(new hfg(tfgVar, 1)));
            zl1Var.j();
            mjg mjgVar = tfgVar.c;
            fhg fhgVar = tfgVar.y;
            if (fhgVar == null) {
                Intrinsics.i("videoLayersController");
                throw null;
            }
            rjg b = mjgVar.b(fhgVar.j);
            if (b != null) {
                hkg.T().post(new ojg(b, 1));
            }
            hs4 hs4Var2 = z45.a;
            xw3.L(s9a.c(rob.a), null, null, new lfg(tfgVar, rq3Var, 2), 3);
        }
        if (tfgVar.e.j) {
            tfgVar.k();
        }
    }

    @Override // defpackage.wke
    public final void onPlayerError(dke dkeVar) {
        dkeVar.getClass();
        xw3.L(s9a.c(z45.a), null, null, new gje(this.a, dkeVar, null, 27), 3);
    }

    @Override // defpackage.wke
    public final void onTimelineChanged(mij mijVar, int i) {
        mijVar.getClass();
        if (mijVar.p()) {
            return;
        }
        kij kijVar = new kij();
        mijVar.n(0, kijVar);
        if (nik.h0(kijVar.l) != C.TIME_UNSET) {
            tfg tfgVar = this.a;
            ExoPlayer exoPlayer = tfgVar.v;
            if (exoPlayer == null) {
                Intrinsics.i("exoPlayer");
                throw null;
            }
            if (((vg6) exoPlayer).getPlaybackState() == 3) {
                tfgVar.h();
            }
        }
    }

    @Override // defpackage.wke
    public final void onTracksChanged(uuj uujVar) {
        uujVar.getClass();
        hv9<suj> hv9Var = uujVar.a;
        hv9Var.getClass();
        for (suj sujVar : hv9Var) {
            tfg tfgVar = this.a;
            if (!tfgVar.w) {
                int i = sujVar.a;
                int i2 = 0;
                while (true) {
                    if (i2 < i) {
                        b bVar = sujVar.b.d[i2];
                        bVar.getClass();
                        String str = bVar.o;
                        if (str != null && c.v(str, "audio", false)) {
                            tfgVar.w = true;
                            break;
                        }
                        i2++;
                    }
                }
            }
        }
    }
}
