package defpackage;

import androidx.media3.exoplayer.ExoPlayer;
import com.unity3d.services.UnityAdsConstants;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public final class sfg extends hoi implements Function2 {
    public final /* synthetic */ boolean r;
    public final /* synthetic */ tfg s;
    public final /* synthetic */ boolean t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public sfg(boolean z, tfg tfgVar, boolean z2, rq3 rq3Var) {
        super(2, rq3Var);
        this.r = z;
        this.s = tfgVar;
        this.t = z2;
    }

    @Override // defpackage.h21
    public final rq3 create(Object obj, rq3 rq3Var) {
        return new sfg(this.r, this.s, this.t, rq3Var);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((sfg) create((ku3) obj, (rq3) obj2)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.h21
    public final Object invokeSuspend(Object obj) {
        kig kigVar;
        lu3 lu3Var = lu3.a;
        y6a.M(obj);
        tfg tfgVar = this.s;
        ExoPlayer exoPlayer = tfgVar.v;
        boolean z = this.r;
        if (z) {
            if (exoPlayer == null) {
                Intrinsics.i("exoPlayer");
                throw null;
            }
            ((vg6) exoPlayer).setVolume(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
            kigVar = kig.MUTE;
        } else {
            if (exoPlayer == null) {
                Intrinsics.i("exoPlayer");
                throw null;
            }
            ((vg6) exoPlayer).setVolume(1.0f);
            kigVar = kig.UNMUTE;
        }
        yeg yegVar = tfgVar.u;
        if (yegVar != null) {
            ((xeg) yegVar).setMuted(z);
        }
        ExoPlayer exoPlayer2 = tfgVar.v;
        if (exoPlayer2 == null) {
            Intrinsics.i("exoPlayer");
            throw null;
        }
        long currentPosition = ((vg6) exoPlayer2).getCurrentPosition();
        if (this.t) {
            mjg mjgVar = tfgVar.c;
            fhg fhgVar = tfgVar.y;
            if (fhgVar == null) {
                Intrinsics.i("videoLayersController");
                throw null;
            }
            rjg b = mjgVar.b(fhgVar.j);
            if (b != null) {
                ExoPlayer exoPlayer3 = tfgVar.v;
                if (exoPlayer3 == null) {
                    Intrinsics.i("exoPlayer");
                    throw null;
                }
                vg6 vg6Var = (vg6) exoPlayer3;
                vg6Var.j0();
                hkg.T().post(new pjg(b, vg6Var.c0, 0));
            }
            zl1 zl1Var = tfgVar.I;
            zl1Var.b.add(new adg(new rfg(tfgVar, kigVar, currentPosition, 0)));
            zl1Var.j();
        }
        return Unit.a;
    }
}
