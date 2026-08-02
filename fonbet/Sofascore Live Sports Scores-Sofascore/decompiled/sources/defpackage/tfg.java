package defpackage;

import android.content.Context;
import android.graphics.Rect;
import android.view.View;
import android.view.WindowInsets;
import android.widget.LinearLayout;
import androidx.media3.exoplayer.ExoPlayer;
import java.util.LinkedHashMap;
import java.util.Timer;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public final class tfg implements kbg, wag, xgg, fgg, mig {
    public igg A;
    public boolean B;
    public boolean C;
    public boolean D;
    public boolean E;
    public final LinkedHashMap F;
    public blg G;
    public boolean H;
    public final zl1 I;
    public scg J;
    public final Timer K;
    public final g62 L;
    public jfg M;
    public kfg N;
    public final pfg O;
    public final ffg a;
    public final pgg b;
    public final mjg c;
    public final nig d;
    public final nbg e;
    public final tgg f;
    public final Function1 g;
    public final ct8 h;
    public final et8 i;
    public final Function2 j;
    public final Function1 k;
    public final Function1 l;
    public final Function1 m;
    public final Function1 n;
    public Context o;
    public sdg p;
    public LinearLayout q;
    public ahg r;
    public dgg s;
    public sgg t;
    public yeg u;
    public ExoPlayer v;
    public boolean w;
    public boolean x;
    public fhg y;
    public xag z;

    public tfg(ffg ffgVar, pgg pggVar, mjg mjgVar, nig nigVar, nbg nbgVar) {
        tgg tggVar = new tgg(pggVar);
        j9g j9gVar = new j9g(28);
        int i = 2;
        vcg vcgVar = new vcg(i);
        pr1 pr1Var = new pr1(12);
        byte b = 0;
        eee eeeVar = new eee(b, 26);
        j9g j9gVar2 = new j9g(29);
        gfg gfgVar = new gfg(b);
        gfg gfgVar2 = new gfg(1);
        gfg gfgVar3 = new gfg(i);
        pggVar.getClass();
        mjgVar.getClass();
        this.a = ffgVar;
        this.b = pggVar;
        this.c = mjgVar;
        this.d = nigVar;
        this.e = nbgVar;
        this.f = tggVar;
        this.g = j9gVar;
        this.h = vcgVar;
        this.i = pr1Var;
        this.j = eeeVar;
        this.k = j9gVar2;
        this.l = gfgVar;
        this.m = gfgVar2;
        this.n = gfgVar3;
        this.F = tub.i(new Pair(Double.valueOf(0.25d), kig.FIRST_QUARTILE), new Pair(Double.valueOf(0.5d), kig.MIDPOINT), new Pair(Double.valueOf(0.75d), kig.THIRD_QUARTILE));
        this.I = new zl1(5);
        this.K = new Timer("SASNativeVideoAdRenderer progress monitoring timer");
        this.L = ml4.g(0, 7, null);
        this.M = jfg.a;
        this.N = kfg.a;
        this.O = new pfg(this);
    }

    @Override // defpackage.kbg
    public final void a(boolean z, boolean z2) {
        hs4 hs4Var = z45.a;
        xw3.L(s9a.c(rob.a), null, null, new sfg(z, this, z2, null), 3);
        g();
    }

    @Override // defpackage.wag
    public final void b(hdg hdgVar) {
        l(jfg.a);
    }

    @Override // defpackage.kbg
    public final boolean c() {
        return true;
    }

    @Override // defpackage.kbg
    public final Object d(Context context, sq3 sq3Var) {
        rq3 rq3Var = null;
        if (this.B) {
            ogj.k("SASNativeVideoAdRenderer is not designed to support more than one rendering");
            return null;
        }
        this.B = true;
        this.o = context;
        hs4 hs4Var = z45.a;
        return xw3.R(rob.a, new gje(this, context, rq3Var, 28), sq3Var);
    }

    @Override // defpackage.wag
    public final void e() {
        l(jfg.b);
        sdg sdgVar = this.p;
        rq3 rq3Var = null;
        if (sdgVar == null) {
            Intrinsics.i("rootLayout");
            throw null;
        }
        WindowInsets rootWindowInsets = sdgVar.getRootWindowInsets();
        if (rootWindowInsets != null) {
            sdg sdgVar2 = this.p;
            if (sdgVar2 == null) {
                Intrinsics.i("rootLayout");
                throw null;
            }
            sdgVar2.dispatchApplyWindowInsets(rootWindowInsets);
        }
        hs4 hs4Var = z45.a;
        xw3.L(s9a.c(rob.a), null, null, new lfg(this, rq3Var, 4), 3);
    }

    @Override // defpackage.wag
    public final void f() {
        LinearLayout linearLayout = this.q;
        rq3 rq3Var = null;
        if (linearLayout == null) {
            Intrinsics.i("buttonsLayout");
            throw null;
        }
        linearLayout.setPadding(0, 0, 0, 0);
        l(jfg.a);
        hs4 hs4Var = z45.a;
        xw3.L(s9a.c(rob.a), null, null, new lfg(this, rq3Var, 3), 3);
    }

    public final void g() {
        xag xagVar;
        if (this.w && (xagVar = this.z) != null) {
            hs4 hs4Var = z45.a;
            xw3.L(s9a.c(rob.a), null, null, new nfg(this, xagVar, null), 3);
        }
    }

    public final void h() {
        synchronized (this) {
            try {
                if (!this.D) {
                    this.D = true;
                    hs4 hs4Var = z45.a;
                    rq3 rq3Var = null;
                    xw3.L(s9a.c(rob.a), null, null, new lfg(this, rq3Var, 6), 3);
                    a(true, false);
                    xw3.L(s9a.c(z45.a), null, null, new ofg(this, rq3Var, 1), 3);
                    zl1 zl1Var = this.I;
                    zl1Var.b.add(new adg(new hfg(this, 0)));
                    zl1Var.j();
                }
                Unit unit = Unit.a;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void i(blg blgVar) {
        blgVar.getClass();
        this.G = blgVar;
        if (this.H) {
            blgVar = new blg(false, 0.0d, new Rect(0, 0, 0, 0));
        }
        hs4 hs4Var = z45.a;
        r69 r69Var = rob.a;
        rq3 rq3Var = null;
        xw3.L(s9a.c(r69Var), null, null, new lfg(this, rq3Var, 7), 3);
        if (!blgVar.a || blgVar.b < 0.5d) {
            xw3.L(s9a.c(r69Var), null, null, new lfg(this, rq3Var, 8), 3);
        } else {
            xw3.L(s9a.c(r69Var), null, null, new lfg(this, rq3Var, 9), 3);
        }
        g();
    }

    public final void j() {
        hs4 hs4Var = z45.a;
        xw3.L(s9a.c(rob.a), null, null, new v1f(this, null, 10), 3);
    }

    public final void k() {
        xag xagVar;
        xag xagVar2;
        boolean z = this.e.j;
        if (this.M != jfg.b && !z && (xagVar2 = this.z) != null) {
            l(jfg.c);
            tbg tbgVar = ((zag) xagVar2).j;
            if (tbgVar == null) {
                Intrinsics.i("adViewController");
                throw null;
            }
            tbgVar.expandAdView(true);
        }
        Object obj = this.v;
        if (obj == null) {
            Intrinsics.i("exoPlayer");
            throw null;
        }
        ((g51) obj).M(5, 0L);
        if (!z && (xagVar = this.z) != null) {
            kig kigVar = kig.REWIND;
            ExoPlayer exoPlayer = this.v;
            if (exoPlayer == null) {
                Intrinsics.i("exoPlayer");
                throw null;
            }
            ((zag) xagVar).i(kigVar, ((vg6) exoPlayer).getCurrentPosition());
        }
        m(kfg.b);
    }

    public final void l(jfg jfgVar) {
        if (this.M != jfgVar) {
            this.M = jfgVar;
            n();
        }
    }

    public final void m(kfg kfgVar) {
        xag xagVar;
        if (this.N != kfgVar) {
            this.N = kfgVar;
            n();
            int ordinal = kfgVar.ordinal();
            if (ordinal == 1) {
                xag xagVar2 = this.z;
                if (xagVar2 != null) {
                    ((zag) xagVar2).l();
                    return;
                }
                return;
            }
            if ((ordinal == 2 || ordinal == 3) && (xagVar = this.z) != null) {
                ((zag) xagVar).m(false);
            }
        }
    }

    public final void n() {
        nbg nbgVar = this.e;
        lbg lbgVar = nbgVar.m;
        int ordinal = this.M.ordinal();
        int i = 0;
        int i2 = 3;
        int i3 = 2;
        int i4 = 1;
        nig nigVar = this.d;
        rq3 rq3Var = null;
        if (ordinal == 0) {
            ahg ahgVar = this.r;
            if (ahgVar == null) {
                Intrinsics.i("videoCloseController");
                throw null;
            }
            gig gigVar = gig.SMALL;
            ahgVar.d(gigVar);
            int i5 = mfg.a[nbgVar.l.ordinal()];
            ahg ahgVar2 = this.r;
            if (i5 == 1) {
                if (ahgVar2 == null) {
                    Intrinsics.i("videoCloseController");
                    throw null;
                }
                ahgVar2.e();
            } else {
                if (ahgVar2 == null) {
                    Intrinsics.i("videoCloseController");
                    throw null;
                }
                ahgVar2.a();
            }
            if (mfg.b[lbgVar.ordinal()] == 1) {
                if (nigVar != null) {
                    ((pig) nigVar).b();
                }
            } else if (nigVar != null) {
                ((pig) nigVar).d();
            }
            if (nigVar != null) {
                ((pig) nigVar).c(gigVar);
            }
            igg iggVar = this.A;
            if (iggVar != null) {
                xw3.L(iggVar.a, null, null, new ggg(iggVar, rq3Var, i), 3);
            }
            yeg yegVar = this.u;
            if (yegVar != null) {
                ((xeg) yegVar).setMuteButtonSize(gigVar);
            }
            kfg kfgVar = this.N;
            kfg kfgVar2 = kfg.d;
            yeg yegVar2 = this.u;
            if (kfgVar == kfgVar2) {
                if (yegVar2 != null) {
                    ((xeg) yegVar2).a();
                }
                sgg sggVar = this.t;
                if (sggVar != null) {
                    sggVar.b();
                }
            } else if (yegVar2 != null) {
                ((xeg) yegVar2).b();
            } else {
                sgg sggVar2 = this.t;
                if (sggVar2 != null) {
                    xw3.L(sggVar2.b, null, null, new rgg(sggVar2, rq3Var, i4), 3);
                }
            }
        } else if (ordinal == 1) {
            ahg ahgVar3 = this.r;
            if (ahgVar3 == null) {
                Intrinsics.i("videoCloseController");
                throw null;
            }
            gig gigVar2 = gig.REGULAR;
            ahgVar3.d(gigVar2);
            ahg ahgVar4 = this.r;
            if (ahgVar4 == null) {
                Intrinsics.i("videoCloseController");
                throw null;
            }
            ahgVar4.e();
            sgg sggVar3 = this.t;
            if (sggVar3 != null) {
                sggVar3.b();
            }
            if (mfg.b[lbgVar.ordinal()] == 2) {
                if (nigVar != null) {
                    ((pig) nigVar).d();
                }
            } else if (nigVar != null) {
                ((pig) nigVar).b();
            }
            if (nigVar != null) {
                ((pig) nigVar).c(gigVar2);
            }
            yeg yegVar3 = this.u;
            if (yegVar3 != null) {
                ((xeg) yegVar3).setMuteButtonSize(gigVar2);
            }
            if (this.N == kfg.d) {
                igg iggVar2 = this.A;
                if (iggVar2 != null) {
                    xw3.L(iggVar2.a, null, null, new ggg(iggVar2, rq3Var, i), 3);
                }
                yeg yegVar4 = this.u;
                if (yegVar4 != null) {
                    ((xeg) yegVar4).a();
                }
            } else {
                yeg yegVar5 = this.u;
                if (yegVar5 != null) {
                    ((xeg) yegVar5).b();
                }
                igg iggVar3 = this.A;
                if (iggVar3 != null) {
                    xw3.L(iggVar3.a, null, null, new ggg(iggVar3, rq3Var, i4), 3);
                }
            }
        } else {
            if (ordinal != 2) {
                zzl.b();
                return;
            }
            ahg ahgVar5 = this.r;
            if (ahgVar5 == null) {
                Intrinsics.i("videoCloseController");
                throw null;
            }
            ahgVar5.a();
            igg iggVar4 = this.A;
            if (iggVar4 != null) {
                xw3.L(iggVar4.a, null, null, new ggg(iggVar4, rq3Var, i), 3);
            }
            sgg sggVar4 = this.t;
            if (sggVar4 != null) {
                sggVar4.b();
            }
            yeg yegVar6 = this.u;
            if (yegVar6 != null) {
                ((xeg) yegVar6).a();
            }
            if (nigVar != null) {
                ((pig) nigVar).b();
            }
        }
        int ordinal2 = this.N.ordinal();
        if (ordinal2 == 0) {
            dgg dggVar = this.s;
            if (dggVar != null) {
                dggVar.a();
                return;
            } else {
                Intrinsics.i("postVideoLayoutController");
                throw null;
            }
        }
        if (ordinal2 == 1) {
            sgg sggVar5 = this.t;
            if (sggVar5 != null) {
                xw3.L(sggVar5.b, null, null, new rgg(sggVar5, rq3Var, i3), 3);
            }
            dgg dggVar2 = this.s;
            if (dggVar2 != null) {
                dggVar2.a();
                return;
            } else {
                Intrinsics.i("postVideoLayoutController");
                throw null;
            }
        }
        if (ordinal2 == 2) {
            sgg sggVar6 = this.t;
            if (sggVar6 != null) {
                xw3.L(sggVar6.b, null, null, new rgg(sggVar6, rq3Var, i2), 3);
            }
            dgg dggVar3 = this.s;
            if (dggVar3 != null) {
                dggVar3.a();
                return;
            } else {
                Intrinsics.i("postVideoLayoutController");
                throw null;
            }
        }
        if (ordinal2 != 3) {
            zzl.b();
            return;
        }
        sgg sggVar7 = this.t;
        if (sggVar7 != null) {
            xw3.L(sggVar7.b, null, null, new rgg(sggVar7, rq3Var, i2), 3);
        }
        if (nbgVar.i || nbgVar.j) {
            dgg dggVar4 = this.s;
            if (dggVar4 != null) {
                dggVar4.a();
                return;
            } else {
                Intrinsics.i("postVideoLayoutController");
                throw null;
            }
        }
        dgg dggVar5 = this.s;
        if (dggVar5 != null) {
            xw3.L(dggVar5.c, null, null, new cgg(dggVar5, rq3Var, i4), 3);
        } else {
            Intrinsics.i("postVideoLayoutController");
            throw null;
        }
    }

    @Override // defpackage.kbg
    public final void onAdLifecycleConfigured(xag xagVar) {
        xagVar.getClass();
        this.z = xagVar;
        zag zagVar = (zag) xagVar;
        zagVar.t.add(new chf(1, this, tfg.class, "onViewabilityStatusChanged", "onViewabilityStatusChanged$smart_display_sdk_prodRelease(Lcom/equativ/displaysdk/coresdkdisplay/components/viewabilitymanager/SCSViewabilityStatus;)V", 0, 6));
        zagVar.v.add(this);
        this.I.j();
    }

    @Override // defpackage.xgg
    public final void onCloseRequested() {
        xag xagVar = this.z;
        if (xagVar != null) {
            if (this.M == jfg.b) {
                l(jfg.c);
            }
            tbg tbgVar = ((zag) xagVar).j;
            if (tbgVar != null) {
                tbgVar.closeAdView(true);
            } else {
                Intrinsics.i("adViewController");
                throw null;
            }
        }
    }

    @Override // defpackage.mig
    public final void onCustomerFeedbackDialogDismissed(boolean z) {
        xag xagVar;
        this.H = false;
        blg blgVar = this.G;
        if (blgVar != null) {
            i(blgVar);
        }
        if (!z || (xagVar = this.z) == null) {
            return;
        }
        nig nigVar = this.d;
        ((zag) xagVar).n(nigVar != null ? (View) ((pig) nigVar).n.getValue() : null);
    }

    @Override // defpackage.mig
    public final void onCustomerFeedbackDialogShow() {
        this.H = true;
        blg blgVar = this.G;
        if (blgVar != null) {
            i(blgVar);
        }
    }

    @Override // defpackage.kbg
    public final void onDestroy() {
        hs4 hs4Var = z45.a;
        xw3.L(s9a.c(rob.a), null, null, new lfg(this, null, 5), 3);
    }
}
