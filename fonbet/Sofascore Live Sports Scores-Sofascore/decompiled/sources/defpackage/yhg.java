package defpackage;

import android.content.Context;
import android.graphics.Rect;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import com.unity3d.services.UnityAdsConstants;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import kotlin.text.b;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public final class yhg implements kbg, wag, xgg, mig {
    public blg A;
    public boolean B;
    public long C;
    public float D;
    public boolean E;
    public boolean F;
    public boolean G;
    public final khg a;
    public final pgg b;
    public final mjg c;
    public final nig d;
    public final nbg e;
    public final ct8 f;
    public final et8 g;
    public final Function1 h;
    public final Function1 i;
    public final Function1 j;
    public Context k;
    public boolean l;
    public sdg m;
    public LinearLayout n;
    public RelativeLayout o;
    public final g62 p;
    public mhg q;
    public nhg r;
    public boolean s;
    public xag t;
    public final zl1 u;
    public ahg v;
    public idg w;
    public yeg x;
    public eig y;
    public boolean z;

    public yhg(khg khgVar, pgg pggVar, mjg mjgVar, nig nigVar, nbg nbgVar) {
        mdg mdgVar = new mdg(3, null, 1);
        pr1 pr1Var = new pr1(13);
        gfg gfgVar = new gfg(4);
        gfg gfgVar2 = new gfg(5);
        gfg gfgVar3 = new gfg(6);
        pggVar.getClass();
        mjgVar.getClass();
        this.a = khgVar;
        this.b = pggVar;
        this.c = mjgVar;
        this.d = nigVar;
        this.e = nbgVar;
        this.f = mdgVar;
        this.g = pr1Var;
        this.h = gfgVar;
        this.i = gfgVar2;
        this.j = gfgVar3;
        this.p = ml4.g(0, 7, null);
        this.q = mhg.a;
        this.r = nhg.a;
        this.u = new zl1(5);
        this.D = -1.0f;
        this.E = true;
    }

    @Override // defpackage.kbg
    public final void a(boolean z, boolean z2) {
        n(z);
    }

    @Override // defpackage.wag
    public final void b(hdg hdgVar) {
        m(mhg.a);
    }

    @Override // defpackage.kbg
    public final boolean c() {
        return true;
    }

    @Override // defpackage.kbg
    public final Object d(Context context, sq3 sq3Var) {
        rq3 rq3Var = null;
        if (this.l) {
            ogj.k("SASVpaidAdRenderer is not designed to support more than one rendering");
            return null;
        }
        this.l = true;
        this.k = context;
        hs4 hs4Var = z45.a;
        return xw3.R(rob.a, new v1f(this, context, rq3Var, 12), sq3Var);
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x0037, code lost:
    
        if (r1.intValue() != 0) goto L19;
     */
    @Override // defpackage.wag
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void e() {
        m(mhg.b);
        nbg nbgVar = this.e;
        boolean z = false;
        if (nbgVar.h) {
            int ordinal = this.a.g.ordinal();
            if (ordinal != 0) {
                if (ordinal == 1) {
                    Integer num = (Integer) this.j.invoke(this.k);
                    if (num != null) {
                        if (num.intValue() != 1) {
                        }
                    }
                } else if (ordinal != 2) {
                    zzl.b();
                    return;
                }
            }
            z = true;
        }
        n(z);
        if (nbgVar.f) {
            xag xagVar = this.t;
            if (xagVar != null) {
                ((zag) xagVar).i(kig.PLAYER_EXPAND, this.C);
            }
            xag xagVar2 = this.t;
            if (xagVar2 != null) {
                ((zag) xagVar2).i(kig.FULLSCREEN, this.C);
            }
            RelativeLayout relativeLayout = this.o;
            if (relativeLayout == null) {
                Intrinsics.i("measuredView");
                throw null;
            }
            rjg b = this.c.b(relativeLayout);
            if (b != null) {
                b.b(true);
            }
        }
    }

    @Override // defpackage.wag
    public final void f() {
        LinearLayout linearLayout = this.n;
        if (linearLayout == null) {
            Intrinsics.i("buttonsLayout");
            throw null;
        }
        linearLayout.setPadding(0, 0, 0, 0);
        idg idgVar = this.w;
        if (idgVar == null) {
            Intrinsics.i("fullscreenButton");
            throw null;
        }
        idgVar.getFullscreenButtonView().setPadding(0, 0, 0, 0);
        m(mhg.a);
        n(true);
        if (this.e.f) {
            xag xagVar = this.t;
            if (xagVar != null) {
                ((zag) xagVar).i(kig.PLAYER_COLLAPSE, this.C);
            }
            xag xagVar2 = this.t;
            if (xagVar2 != null) {
                ((zag) xagVar2).i(kig.EXIT_FULLSCREEN, this.C);
            }
            RelativeLayout relativeLayout = this.o;
            if (relativeLayout == null) {
                Intrinsics.i("measuredView");
                throw null;
            }
            rjg b = this.c.b(relativeLayout);
            if (b != null) {
                b.b(false);
            }
        }
    }

    public final void g() {
        xag xagVar = this.t;
        if (xagVar != null) {
            hs4 hs4Var = z45.a;
            xw3.L(s9a.c(rob.a), null, null, new phg(this, xagVar, (rq3) null), 3);
        }
    }

    public final void h(blg blgVar) {
        blgVar.getClass();
        this.A = blgVar;
        int i = 0;
        if (this.B) {
            blgVar = new blg(false, 0.0d, new Rect(0, 0, 0, 0));
        }
        hs4 hs4Var = z45.a;
        r69 r69Var = rob.a;
        rq3 rq3Var = null;
        xw3.L(s9a.c(r69Var), null, null, new qhg(this, rq3Var, i), 3);
        if (this.r != nhg.e) {
            if (!blgVar.a || blgVar.b < 0.5d) {
                xw3.L(s9a.c(r69Var), null, null, new rhg(this, rq3Var, i), 3);
            } else {
                xw3.L(s9a.c(r69Var), null, null, new rhg(this, rq3Var, 1), 3);
            }
        }
        g();
    }

    /* JADX WARN: Can't wrap try/catch for region: R(10:0|1|(2:3|(7:5|6|7|(1:(1:10)(2:16|17))(5:18|(1:20)(1:25)|21|22|(1:24))|11|12|13))|27|6|7|(0)(0)|11|12|13) */
    /* JADX WARN: Removed duplicated region for block: B:18:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object i(String str, sq3 sq3Var) {
        shg shgVar;
        int i;
        if (sq3Var instanceof shg) {
            shgVar = (shg) sq3Var;
            int i2 = shgVar.t;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                shgVar.t = i2 - Integer.MIN_VALUE;
                Object obj = shgVar.r;
                lu3 lu3Var = lu3.a;
                i = shgVar.t;
                if (i != 0) {
                    y6a.M(obj);
                    Float g = b.g(str);
                    this.D = g != null ? g.floatValue() : -1.0f;
                    jeg.d.f(1);
                    g62 g62Var = this.p;
                    shgVar.t = 1;
                    if (g62Var.q(shgVar, null) == lu3Var) {
                        return lu3Var;
                    }
                } else {
                    if (i != 1) {
                        a70.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    y6a.M(obj);
                }
                return Unit.a;
            }
        }
        shgVar = new shg(this, sq3Var);
        Object obj2 = shgVar.r;
        lu3 lu3Var2 = lu3.a;
        i = shgVar.t;
        if (i != 0) {
        }
        return Unit.a;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(10:0|1|(2:3|(7:5|6|7|(1:(1:10)(2:16|17))(4:18|(1:20)|21|(1:23))|11|12|13))|25|6|7|(0)(0)|11|12|13) */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object j(String str, sq3 sq3Var) {
        thg thgVar;
        int i;
        if (sq3Var instanceof thg) {
            thgVar = (thg) sq3Var;
            int i2 = thgVar.t;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                thgVar.t = i2 - Integer.MIN_VALUE;
                Object obj = thgVar.r;
                lu3 lu3Var = lu3.a;
                i = thgVar.t;
                if (i != 0) {
                    y6a.M(obj);
                    if (StringsKt.R(str)) {
                        str = "unknown";
                    }
                    g62 g62Var = this.p;
                    Exception exc = new Exception("Vpaid ad error : ".concat(str));
                    thgVar.t = 1;
                    if (g62Var.q(thgVar, exc) == lu3Var) {
                        return lu3Var;
                    }
                } else {
                    if (i != 1) {
                        a70.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    y6a.M(obj);
                }
                return Unit.a;
            }
        }
        thgVar = new thg(this, sq3Var);
        Object obj2 = thgVar.r;
        lu3 lu3Var2 = lu3.a;
        i = thgVar.t;
        if (i != 0) {
        }
        return Unit.a;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(8:0|1|(2:3|(5:5|6|7|(1:(1:(4:11|12|13|14)(2:17|18))(1:19))(2:23|(3:25|(1:27)|28)(2:30|31))|20))|33|6|7|(0)(0)|20) */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x008a, code lost:
    
        if (r13.q(r0, null) != r1) goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x008c, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x007d, code lost:
    
        if (defpackage.n4o.y(2000, r0) == r1) goto L27;
     */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object k(sq3 sq3Var) {
        uhg uhgVar;
        int i;
        if (sq3Var instanceof uhg) {
            uhgVar = (uhg) sq3Var;
            int i2 = uhgVar.u;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                uhgVar.u = i2 - Integer.MIN_VALUE;
                Object obj = uhgVar.s;
                lu3 lu3Var = lu3.a;
                i = uhgVar.u;
                int i3 = 1;
                if (i != 0) {
                    y6a.M(obj);
                    adg adgVar = new adg(new lhg(this, i3));
                    zl1 zl1Var = this.u;
                    zl1Var.b.add(adgVar);
                    zl1Var.j();
                    RelativeLayout relativeLayout = this.o;
                    if (relativeLayout == null) {
                        Intrinsics.i("measuredView");
                        throw null;
                    }
                    rjg d = this.c.d(relativeLayout, this.a.c, true, false, this.b);
                    if (d != null) {
                        hkg.T().post(new pjg(d, this.e.c, 1));
                    }
                    uhgVar.r = this;
                    uhgVar.u = 1;
                } else {
                    if (i != 1) {
                        if (i == 2) {
                            y6a.M(obj);
                            return Unit.a;
                        }
                        a70.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    this = uhgVar.r;
                    y6a.M(obj);
                }
                g62 g62Var = this.p;
                uhgVar.r = null;
                uhgVar.u = 2;
            }
        }
        uhgVar = new uhg(this, sq3Var);
        Object obj2 = uhgVar.s;
        lu3 lu3Var2 = lu3.a;
        i = uhgVar.u;
        int i32 = 1;
        if (i != 0) {
        }
        g62 g62Var2 = this.p;
        uhgVar.r = null;
        uhgVar.u = 2;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object l(sq3 sq3Var) {
        vhg vhgVar;
        int i;
        if (sq3Var instanceof vhg) {
            vhgVar = (vhg) sq3Var;
            int i2 = vhgVar.u;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                vhgVar.u = i2 - Integer.MIN_VALUE;
                Object obj = vhgVar.s;
                lu3 lu3Var = lu3.a;
                i = vhgVar.u;
                if (i != 0) {
                    y6a.M(obj);
                    xag xagVar = this.t;
                    if (xagVar != null) {
                        ((zag) xagVar).i(kig.START, this.C);
                    }
                    p(true);
                    o(nhg.c);
                    RelativeLayout relativeLayout = this.o;
                    if (relativeLayout == null) {
                        Intrinsics.i("measuredView");
                        throw null;
                    }
                    rjg b = this.c.b(relativeLayout);
                    if (b != null) {
                        hkg.T().post(new qjg(b, this.D, this.E ? UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT : 1.0f));
                    }
                    vhgVar.r = this;
                    vhgVar.u = 1;
                    if (n4o.y(500L, vhgVar) == lu3Var) {
                        return lu3Var;
                    }
                } else {
                    if (i != 1) {
                        a70.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    this = vhgVar.r;
                    y6a.M(obj);
                }
                if (!this.z) {
                    this.z = true;
                    zl1 zl1Var = this.u;
                    zl1Var.b.add(new adg(new lhg(this, 3)));
                    zl1Var.j();
                }
                return Unit.a;
            }
        }
        vhgVar = new vhg(this, sq3Var);
        Object obj2 = vhgVar.s;
        lu3 lu3Var2 = lu3.a;
        i = vhgVar.u;
        if (i != 0) {
        }
        if (!this.z) {
        }
        return Unit.a;
    }

    public final void m(mhg mhgVar) {
        if (this.q != mhgVar) {
            this.q = mhgVar;
            q();
        }
    }

    public final void n(boolean z) {
        hs4 hs4Var = z45.a;
        xw3.L(s9a.c(rob.a), null, null, new xhg(this, z, null, 0), 3);
    }

    public final void o(nhg nhgVar) {
        xag xagVar;
        if (this.r != nhgVar) {
            this.r = nhgVar;
            q();
            int ordinal = nhgVar.ordinal();
            if (ordinal == 2) {
                xag xagVar2 = this.t;
                if (xagVar2 != null) {
                    ((zag) xagVar2).l();
                }
                this.s = true;
                return;
            }
            if ((ordinal == 3 || ordinal == 4) && (xagVar = this.t) != null) {
                ((zag) xagVar).m(false);
            }
        }
    }

    @Override // defpackage.kbg
    public final void onAdLifecycleConfigured(xag xagVar) {
        xagVar.getClass();
        this.t = xagVar;
        zag zagVar = (zag) xagVar;
        zagVar.t.add(new chf(1, this, yhg.class, "onViewabilityStatusChanged", "onViewabilityStatusChanged$smart_display_sdk_prodRelease(Lcom/equativ/displaysdk/coresdkdisplay/components/viewabilitymanager/SCSViewabilityStatus;)V", 0, 7));
        zagVar.v.add(this);
        this.u.j();
    }

    @Override // defpackage.xgg
    public final void onCloseRequested() {
        xag xagVar = this.t;
        if (xagVar != null) {
            if (this.q == mhg.b) {
                m(mhg.c);
            }
            bea.r(xagVar);
        }
    }

    @Override // defpackage.mig
    public final void onCustomerFeedbackDialogDismissed(boolean z) {
        xag xagVar;
        this.B = false;
        blg blgVar = this.A;
        if (blgVar != null) {
            h(blgVar);
        }
        if (!z || (xagVar = this.t) == null) {
            return;
        }
        nig nigVar = this.d;
        ((zag) xagVar).n(nigVar != null ? (View) ((pig) nigVar).n.getValue() : null);
    }

    @Override // defpackage.mig
    public final void onCustomerFeedbackDialogShow() {
        this.B = true;
        blg blgVar = this.A;
        if (blgVar != null) {
            h(blgVar);
        }
    }

    @Override // defpackage.kbg
    public final void onDestroy() {
        xag xagVar;
        int i = 1;
        jeg.d.f(1);
        eig eigVar = this.y;
        rq3 rq3Var = null;
        if (eigVar != null) {
            boolean z = this.s;
            mjg mjgVar = this.c;
            if (z && this.r != nhg.e) {
                adg adgVar = new adg(new lhg(this, 0));
                zl1 zl1Var = this.u;
                zl1Var.b.add(adgVar);
                zl1Var.j();
                RelativeLayout relativeLayout = this.o;
                if (relativeLayout == null) {
                    Intrinsics.i("measuredView");
                    throw null;
                }
                rjg b = mjgVar.b(relativeLayout);
                if (b != null) {
                    hkg.T().post(new ojg(b, 4));
                }
            }
            RelativeLayout relativeLayout2 = this.o;
            if (relativeLayout2 == null) {
                Intrinsics.i("measuredView");
                throw null;
            }
            rjg b2 = mjgVar.b(relativeLayout2);
            if (b2 != null) {
                b2.c();
            }
            hs4 hs4Var = z45.a;
            xw3.L(s9a.c(rob.a), null, null, new qdg(eigVar, rq3Var, i), 3);
        }
        if (this.G && (xagVar = this.t) != null) {
            ((zag) xagVar).g();
        }
        this.t = null;
    }

    public final void p(boolean z) {
        hs4 hs4Var = z45.a;
        xw3.L(s9a.c(rob.a), null, null, new xhg(this, z, null, 1), 3);
    }

    public final void q() {
        nbg nbgVar = this.e;
        lbg lbgVar = nbgVar.m;
        mbg mbgVar = nbgVar.l;
        int ordinal = this.q.ordinal();
        nig nigVar = this.d;
        if (ordinal == 0) {
            ahg ahgVar = this.v;
            if (ahgVar == null) {
                Intrinsics.i("videoCloseController");
                throw null;
            }
            gig gigVar = gig.SMALL;
            ahgVar.d(gigVar);
            int i = ohg.b[mbgVar.ordinal()];
            ahg ahgVar2 = this.v;
            if (i == 1) {
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
            idg idgVar = this.w;
            if (idgVar == null) {
                Intrinsics.i("fullscreenButton");
                throw null;
            }
            idgVar.setFullscreen(false);
            yeg yegVar = this.x;
            if (yegVar != null) {
                ((xeg) yegVar).setMuteButtonSize(gigVar);
            }
            int i2 = ohg.a[this.r.ordinal()];
            yeg yegVar2 = this.x;
            if (i2 == 3) {
                if (yegVar2 != null) {
                    ((xeg) yegVar2).a();
                }
            } else if (yegVar2 != null) {
                ((xeg) yegVar2).b();
            }
            if (ohg.c[lbgVar.ordinal()] == 1) {
                if (nigVar != null) {
                    ((pig) nigVar).b();
                }
            } else if (nigVar != null) {
                ((pig) nigVar).d();
            }
            if (nigVar != null) {
                ((pig) nigVar).c(gigVar);
                return;
            }
            return;
        }
        if (ordinal != 1) {
            if (ordinal != 2) {
                zzl.b();
                return;
            }
            ahg ahgVar3 = this.v;
            if (ahgVar3 == null) {
                Intrinsics.i("videoCloseController");
                throw null;
            }
            ahgVar3.a();
            yeg yegVar3 = this.x;
            if (yegVar3 != null) {
                ((xeg) yegVar3).a();
            }
            if (nigVar != null) {
                ((pig) nigVar).b();
                return;
            }
            return;
        }
        ahg ahgVar4 = this.v;
        if (ahgVar4 == null) {
            Intrinsics.i("videoCloseController");
            throw null;
        }
        gig gigVar2 = gig.REGULAR;
        ahgVar4.d(gigVar2);
        int i3 = ohg.b[mbgVar.ordinal()];
        ahg ahgVar5 = this.v;
        if (i3 == 2) {
            if (ahgVar5 == null) {
                Intrinsics.i("videoCloseController");
                throw null;
            }
            ahgVar5.a();
        } else {
            if (ahgVar5 == null) {
                Intrinsics.i("videoCloseController");
                throw null;
            }
            ahgVar5.e();
        }
        idg idgVar2 = this.w;
        if (idgVar2 == null) {
            Intrinsics.i("fullscreenButton");
            throw null;
        }
        idgVar2.setFullscreen(true);
        yeg yegVar4 = this.x;
        if (yegVar4 != null) {
            ((xeg) yegVar4).setMuteButtonSize(gigVar2);
        }
        nhg nhgVar = this.r;
        nhg nhgVar2 = nhg.e;
        yeg yegVar5 = this.x;
        if (nhgVar == nhgVar2) {
            if (yegVar5 != null) {
                ((xeg) yegVar5).a();
            }
        } else if (yegVar5 != null) {
            ((xeg) yegVar5).b();
        }
        if (ohg.c[lbgVar.ordinal()] == 2) {
            if (nigVar != null) {
                ((pig) nigVar).d();
            }
        } else if (nigVar != null) {
            ((pig) nigVar).b();
        }
        if (nigVar != null) {
            ((pig) nigVar).c(gigVar2);
        }
    }
}
