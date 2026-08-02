package defpackage;

import androidx.media3.exoplayer.ExoPlayer;
import com.unity3d.services.UnityAdsConstants;
import java.util.Iterator;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public final class nfg extends hoi implements Function2 {
    public final /* synthetic */ int r;
    public final /* synthetic */ xag s;
    public final /* synthetic */ tfg t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ nfg(xag xagVar, tfg tfgVar, rq3 rq3Var, int i) {
        super(2, rq3Var);
        this.r = i;
        this.s = xagVar;
        this.t = tfgVar;
    }

    @Override // defpackage.h21
    public final rq3 create(Object obj, rq3 rq3Var) {
        int i = this.r;
        tfg tfgVar = this.t;
        xag xagVar = this.s;
        switch (i) {
            case 0:
                return new nfg(xagVar, tfgVar, rq3Var, 0);
            case 1:
                return new nfg(xagVar, tfgVar, rq3Var, 1);
            case 2:
                return new nfg(tfgVar, xagVar, rq3Var);
            default:
                return new nfg(xagVar, tfgVar, rq3Var, 3);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        ku3 ku3Var = (ku3) obj;
        rq3 rq3Var = (rq3) obj2;
        switch (this.r) {
        }
        return ((nfg) create(ku3Var, rq3Var)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.h21
    public final Object invokeSuspend(Object obj) {
        boolean z;
        int i = this.r;
        tfg tfgVar = this.t;
        xag xagVar = this.s;
        switch (i) {
            case 0:
                lu3 lu3Var = lu3.a;
                y6a.M(obj);
                zag zagVar = (zag) xagVar;
                zagVar.h();
                kig kigVar = kig.START;
                ExoPlayer exoPlayer = tfgVar.v;
                if (exoPlayer == null) {
                    Intrinsics.i("exoPlayer");
                    throw null;
                }
                zagVar.i(kigVar, ((vg6) exoPlayer).getCurrentPosition());
                mjg mjgVar = tfgVar.c;
                fhg fhgVar = tfgVar.y;
                if (fhgVar == null) {
                    Intrinsics.i("videoLayersController");
                    throw null;
                }
                rjg b = mjgVar.b(fhgVar.j);
                if (b != null) {
                    hkg.T().post(new ojg(b, 8));
                    if (tfgVar.v == null) {
                        Intrinsics.i("exoPlayer");
                        throw null;
                    }
                    float duration = ((vg6) r7).getDuration() / 1000.0f;
                    ExoPlayer exoPlayer2 = tfgVar.v;
                    if (exoPlayer2 == null) {
                        Intrinsics.i("exoPlayer");
                        throw null;
                    }
                    vg6 vg6Var = (vg6) exoPlayer2;
                    vg6Var.j0();
                    hkg.T().post(new qjg(b, duration, vg6Var.c0));
                }
                return Unit.a;
            case 1:
                lu3 lu3Var2 = lu3.a;
                y6a.M(obj);
                kig kigVar2 = kig.COMPLETE;
                ExoPlayer exoPlayer3 = tfgVar.v;
                if (exoPlayer3 == null) {
                    Intrinsics.i("exoPlayer");
                    throw null;
                }
                ((zag) xagVar).i(kigVar2, ((vg6) exoPlayer3).getCurrentPosition());
                return Unit.a;
            case 2:
                lu3 lu3Var3 = lu3.a;
                y6a.M(obj);
                ExoPlayer exoPlayer4 = tfgVar.v;
                if (exoPlayer4 == null) {
                    Intrinsics.i("exoPlayer");
                    throw null;
                }
                vg6 vg6Var2 = (vg6) exoPlayer4;
                vg6Var2.j0();
                if (vg6Var2.c0 > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                    Object obj2 = tfgVar.v;
                    if (obj2 == null) {
                        Intrinsics.i("exoPlayer");
                        throw null;
                    }
                    if (((g51) obj2).isPlaying()) {
                        z = true;
                        if (!z && !tfgVar.x) {
                            tfgVar.x = true;
                            Iterator it = ((zag) xagVar).w.iterator();
                            while (it.hasNext()) {
                                ((vag) it.next()).a();
                            }
                        } else if (!z && tfgVar.x) {
                            tfgVar.x = false;
                            ((zag) xagVar).g();
                        }
                        return Unit.a;
                    }
                }
                z = false;
                if (!z) {
                }
                if (!z) {
                    tfgVar.x = false;
                    ((zag) xagVar).g();
                }
                return Unit.a;
            default:
                lu3 lu3Var4 = lu3.a;
                y6a.M(obj);
                kig kigVar3 = kig.LOADED;
                ExoPlayer exoPlayer5 = tfgVar.v;
                if (exoPlayer5 == null) {
                    Intrinsics.i("exoPlayer");
                    throw null;
                }
                ((zag) xagVar).i(kigVar3, ((vg6) exoPlayer5).getCurrentPosition());
                return Unit.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public nfg(tfg tfgVar, xag xagVar, rq3 rq3Var) {
        super(2, rq3Var);
        this.r = 2;
        this.t = tfgVar;
        this.s = xagVar;
    }
}
