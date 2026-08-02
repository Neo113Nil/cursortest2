package defpackage;

import android.content.Context;
import android.graphics.Rect;
import android.view.View;
import android.view.ViewTreeObserver;
import android.view.WindowInsets;
import android.webkit.WebView;
import android.widget.LinearLayout;
import com.blaze.blazesdk.data_source.BlazeDataSourcePersonalizedType;
import java.io.Serializable;
import java.net.MalformedURLException;
import java.net.URL;
import kotlin.Pair;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public final class tdg implements kbg, View.OnAttachStateChangeListener, ViewTreeObserver.OnPreDrawListener, wag, mig {
    public final jdg a;
    public final pgg b;
    public final mjg c;
    public final nig d;
    public final nbg e;
    public final qcg f;
    public final Function2 g;
    public final Function1 h;
    public final ct8 i;
    public final ct8 j;
    public final ct8 k;
    public Context l;
    public kcg m;
    public sdg n;
    public LinearLayout o;
    public eig p;
    public xag q;
    public veg r;
    public blg s;
    public boolean t;
    public adg u;
    public ndg v;

    public tdg(jdg jdgVar, pgg pggVar, mjg mjgVar, nig nigVar, nbg nbgVar, qcg qcgVar) {
        byte b = 0;
        eee eeeVar = new eee(b, 25);
        mme mmeVar = new mme(jdgVar, 29);
        int i = 3;
        rq3 rq3Var = null;
        mdg mdgVar = new mdg(i, rq3Var, b);
        vcg vcgVar = new vcg(1);
        bx bxVar = new bx(i, rq3Var, 8);
        pggVar.getClass();
        mjgVar.getClass();
        qcgVar.getClass();
        this.a = jdgVar;
        this.b = pggVar;
        this.c = mjgVar;
        this.d = nigVar;
        this.e = nbgVar;
        this.f = qcgVar;
        this.g = eeeVar;
        this.h = mmeVar;
        this.i = mdgVar;
        this.j = vcgVar;
        this.k = bxVar;
        this.v = ndg.a;
    }

    @Override // defpackage.wag
    public final void b(hdg hdgVar) {
        this.v = ndg.a;
        i();
    }

    @Override // defpackage.kbg
    public final boolean c() {
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:61:0x00ba, code lost:
    
        if (r13 == r1) goto L56;
     */
    /* JADX WARN: Removed duplicated region for block: B:15:0x019c A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:17:0x019d  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0197  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x010c  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x01a1  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0054  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0027  */
    @Override // defpackage.kbg
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object d(Context context, sq3 sq3Var) {
        rdg rdgVar;
        int i;
        eig eigVar;
        String str;
        String str2;
        Pair pair;
        tdg tdgVar;
        eig eigVar2;
        String str3;
        tdg tdgVar2;
        eig eigVar3;
        r69 r69Var;
        m1f m1fVar;
        tdg tdgVar3;
        sdg sdgVar;
        if (sq3Var instanceof rdg) {
            rdgVar = (rdg) sq3Var;
            int i2 = rdgVar.v;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                rdgVar.v = i2 - Integer.MIN_VALUE;
                Object obj = rdgVar.t;
                lu3 lu3Var = lu3.a;
                i = rdgVar.v;
                rq3 rq3Var = null;
                if (i != 0) {
                    y6a.M(obj);
                    if (this.p != null) {
                        ogj.k("SASHtmlAdRenderer is not designed to support more than one rendering");
                        return null;
                    }
                    this.l = context;
                    sdg sdgVar2 = new sdg(0, context, this);
                    this.n = sdgVar2;
                    sdgVar2.setFocusable(true);
                    sdg sdgVar3 = this.n;
                    if (sdgVar3 == null) {
                        Intrinsics.i("rootLayout");
                        throw null;
                    }
                    sdgVar3.setFocusableInTouchMode(true);
                    sdg sdgVar4 = this.n;
                    if (sdgVar4 == null) {
                        Intrinsics.i("rootLayout");
                        throw null;
                    }
                    sdgVar4.setOnFocusChangeListener(new jr2(this, 7));
                    this.o = new LinearLayout(context);
                    nbg nbgVar = this.e;
                    kcg kcgVar = (kcg) this.j.invoke(context, new Integer(nbgVar.d), new Integer(nbgVar.c));
                    this.m = kcgVar;
                    if (kcgVar == null) {
                        Intrinsics.i("closeController");
                        throw null;
                    }
                    kcgVar.g = this;
                    nig nigVar = this.d;
                    if (nigVar != null) {
                        ((pig) nigVar).o = this;
                    }
                    mme mmeVar = new mme(this, 28);
                    rdgVar.r = this;
                    rdgVar.v = 1;
                    obj = this.i.invoke(context, mmeVar, rdgVar);
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            if (i != 3) {
                                if (i != 4) {
                                    a70.r("call to 'resume' before 'invoke' with coroutine");
                                    return null;
                                }
                                tdgVar3 = rdgVar.r;
                                y6a.M(obj);
                                sdgVar = tdgVar3.n;
                                if (sdgVar == null) {
                                    return sdgVar;
                                }
                                Intrinsics.i("rootLayout");
                                throw null;
                            }
                            eigVar3 = rdgVar.s;
                            tdgVar2 = rdgVar.r;
                            y6a.M(obj);
                            eigVar3.c.addOnAttachStateChangeListener(tdgVar2);
                            Function2 function2 = tdgVar2.g;
                            qcg qcgVar = tdgVar2.f;
                            veg vegVar = (veg) function2.invoke(eigVar3, tdgVar2);
                            qcgVar.getClass();
                            String str4 = (String) qcgVar.c.b;
                            str4.getClass();
                            vegVar.getClass();
                            vegVar.a("window.mraidbridge.setEnv('8.6.1','" + str4 + "','',false,false);");
                            vegVar.a("window.mraidbridge.setPlacementType('" + tdgVar2.e.a.a + "');");
                            vegVar.a("window.mraidbridge.notifyReadyEvent();");
                            tdgVar2.r = vegVar;
                            eigVar3.c.getViewTreeObserver().addOnPreDrawListener(tdgVar2);
                            tdgVar2.p = eigVar3;
                            hs4 hs4Var = z45.a;
                            r69Var = rob.a;
                            m1fVar = new m1f(tdgVar2, eigVar3, rq3Var, 11);
                            rdgVar.r = tdgVar2;
                            rdgVar.s = null;
                            rdgVar.v = 4;
                            if (xw3.R(r69Var, m1fVar, rdgVar) != lu3Var) {
                                tdgVar3 = tdgVar2;
                                sdgVar = tdgVar3.n;
                                if (sdgVar == null) {
                                }
                            }
                            return lu3Var;
                        }
                        eigVar2 = rdgVar.s;
                        tdgVar = rdgVar.r;
                        y6a.M(obj);
                        pair = (Pair) obj;
                        tdg tdgVar4 = tdgVar;
                        eigVar = eigVar2;
                        this = tdgVar4;
                        String str5 = (String) pair.a;
                        str3 = ((gbg) this.h.invoke((String) pair.b)).a;
                        if (str3 == null) {
                            Intrinsics.i("processedAdMarkup");
                            throw null;
                        }
                        rdgVar.r = this;
                        rdgVar.s = eigVar;
                        rdgVar.v = 3;
                        if (eigVar.b(str5, str3, rdgVar) != lu3Var) {
                            eig eigVar4 = eigVar;
                            tdgVar2 = this;
                            eigVar3 = eigVar4;
                            eigVar3.c.addOnAttachStateChangeListener(tdgVar2);
                            Function2 function22 = tdgVar2.g;
                            qcg qcgVar2 = tdgVar2.f;
                            veg vegVar2 = (veg) function22.invoke(eigVar3, tdgVar2);
                            qcgVar2.getClass();
                            String str42 = (String) qcgVar2.c.b;
                            str42.getClass();
                            vegVar2.getClass();
                            vegVar2.a("window.mraidbridge.setEnv('8.6.1','" + str42 + "','',false,false);");
                            vegVar2.a("window.mraidbridge.setPlacementType('" + tdgVar2.e.a.a + "');");
                            vegVar2.a("window.mraidbridge.notifyReadyEvent();");
                            tdgVar2.r = vegVar2;
                            eigVar3.c.getViewTreeObserver().addOnPreDrawListener(tdgVar2);
                            tdgVar2.p = eigVar3;
                            hs4 hs4Var2 = z45.a;
                            r69Var = rob.a;
                            m1fVar = new m1f(tdgVar2, eigVar3, rq3Var, 11);
                            rdgVar.r = tdgVar2;
                            rdgVar.s = null;
                            rdgVar.v = 4;
                            if (xw3.R(r69Var, m1fVar, rdgVar) != lu3Var) {
                            }
                        }
                        return lu3Var;
                    }
                    this = rdgVar.r;
                    y6a.M(obj);
                }
                eigVar = (eig) obj;
                jdg jdgVar = this.a;
                str = jdgVar.a;
                str2 = jdgVar.b;
                if (str2 == null && str2.length() != 0) {
                    String str6 = jdgVar.b;
                    rdgVar.r = this;
                    rdgVar.s = eigVar;
                    rdgVar.v = 2;
                    obj = this.g(str6, rdgVar);
                    if (obj != lu3Var) {
                        tdgVar = this;
                        eigVar2 = eigVar;
                        pair = (Pair) obj;
                        tdg tdgVar42 = tdgVar;
                        eigVar = eigVar2;
                        this = tdgVar42;
                        String str52 = (String) pair.a;
                        str3 = ((gbg) this.h.invoke((String) pair.b)).a;
                        if (str3 == null) {
                        }
                    }
                    return lu3Var;
                }
                if (str != null || str.length() == 0) {
                    throw new geg("Both htmlContent and scriptUrl parameters are null or empty");
                }
                pair = new Pair(eigVar.d, str);
                String str522 = (String) pair.a;
                str3 = ((gbg) this.h.invoke((String) pair.b)).a;
                if (str3 == null) {
                }
            }
        }
        rdgVar = new rdg(this, sq3Var);
        Object obj2 = rdgVar.t;
        lu3 lu3Var2 = lu3.a;
        i = rdgVar.v;
        rq3 rq3Var2 = null;
        if (i != 0) {
        }
        eigVar = (eig) obj2;
        jdg jdgVar2 = this.a;
        str = jdgVar2.a;
        str2 = jdgVar2.b;
        if (str2 == null) {
        }
        if (str != null) {
        }
        throw new geg("Both htmlContent and scriptUrl parameters are null or empty");
    }

    @Override // defpackage.wag
    public final void e() {
        this.v = ndg.b;
        i();
        sdg sdgVar = this.n;
        if (sdgVar == null) {
            Intrinsics.i("rootLayout");
            throw null;
        }
        WindowInsets rootWindowInsets = sdgVar.getRootWindowInsets();
        if (rootWindowInsets != null) {
            sdg sdgVar2 = this.n;
            if (sdgVar2 != null) {
                sdgVar2.dispatchApplyWindowInsets(rootWindowInsets);
            } else {
                Intrinsics.i("rootLayout");
                throw null;
            }
        }
    }

    @Override // defpackage.wag
    public final void f() {
        this.v = ndg.a;
        i();
        LinearLayout linearLayout = this.o;
        if (linearLayout != null) {
            linearLayout.setPadding(0, 0, 0, 0);
        } else {
            Intrinsics.i("buttonsLayout");
            throw null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x007d A[Catch: MalformedURLException -> 0x008f, TryCatch #0 {MalformedURLException -> 0x008f, blocks: (B:11:0x002b, B:12:0x0050, B:14:0x0057, B:18:0x0065, B:21:0x006b, B:22:0x007c, B:23:0x007d, B:24:0x008e, B:25:0x005d, B:29:0x0039), top: B:7:0x0023 }] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Serializable g(String str, sq3 sq3Var) {
        pdg pdgVar;
        int i;
        String[] strArr;
        String str2;
        String str3;
        String C;
        try {
            if (sq3Var instanceof pdg) {
                pdgVar = (pdg) sq3Var;
                int i2 = pdgVar.v;
                if ((i2 & Integer.MIN_VALUE) != 0) {
                    pdgVar.v = i2 - Integer.MIN_VALUE;
                    Object obj = pdgVar.t;
                    lu3 lu3Var = lu3.a;
                    i = pdgVar.v;
                    if (i != 0) {
                        y6a.M(obj);
                        URL url = new URL(str);
                        String[] strArr2 = new String[1];
                        ct8 ct8Var = this.k;
                        pdgVar.r = str;
                        pdgVar.s = strArr2;
                        pdgVar.v = 1;
                        obj = ct8Var.invoke(url, strArr2, pdgVar);
                        if (obj == lu3Var) {
                            return lu3Var;
                        }
                        strArr = strArr2;
                    } else {
                        if (i != 1) {
                            a70.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        strArr = pdgVar.s;
                        str = pdgVar.r;
                        y6a.M(obj);
                    }
                    str2 = (String) obj;
                    str3 = strArr[0];
                    if (str3 != null || (C = tz9.C(str3)) == null) {
                        C = tz9.C(str);
                    }
                    if (str2 != null) {
                        throw new geg("Cannot get HTML contents for scriptUrl: " + str);
                    }
                    if (C != null) {
                        return new Pair(C, str2);
                    }
                    throw new geg("Cannot get base URL for scriptUrl: " + str);
                }
            }
            if (i != 0) {
            }
            str2 = (String) obj;
            str3 = strArr[0];
            if (str3 != null) {
            }
            C = tz9.C(str);
            if (str2 != null) {
            }
        } catch (MalformedURLException unused) {
            throw new geg(dmi.q("Invalid URL for scriptUrl: ", str));
        }
        pdgVar = new pdg(this, sq3Var);
        Object obj2 = pdgVar.t;
        lu3 lu3Var2 = lu3.a;
        i = pdgVar.v;
    }

    public final void h(blg blgVar) {
        String str;
        blgVar.getClass();
        this.s = blgVar;
        if (this.t) {
            blgVar = new blg(false, 0.0d, new Rect(0, 0, 0, 0));
        }
        boolean z = blgVar.a;
        hs4 hs4Var = z45.a;
        xw3.L(s9a.c(rob.a), null, null, new hje(this, null, 3), 3);
        veg vegVar = this.r;
        if (vegVar != null) {
            Rect rect = blgVar.c;
            double d = z ? blgVar.b * 100.0d : 0.0d;
            if (d > 0.0d) {
                float f = vegVar.a.c.getContext().getResources().getDisplayMetrics().density;
                str = me4.i(lnb.s(wzb.b(rect.left / f), wzb.b(rect.top / f), "{x:", ",y:", ",width:"), wzb.b(rect.width() / f), ",height:", wzb.b(rect.height() / f), "}");
            } else {
                str = "null";
            }
            vegVar.a("window.mraidbridge.onExposureChanged(" + d + BlazeDataSourcePersonalizedType.STRING_SEPARATOR + str + ",[]);");
        }
        kcg kcgVar = this.m;
        if (z) {
            if (kcgVar == null) {
                Intrinsics.i("closeController");
                throw null;
            }
            if (kcgVar.a > 0) {
                kcgVar.d.g();
            }
            if (kcgVar.b > 0) {
                kcgVar.e.g();
                return;
            }
            return;
        }
        if (kcgVar == null) {
            Intrinsics.i("closeController");
            throw null;
        }
        bo4 bo4Var = kcgVar.d;
        rcg rcgVar = (rcg) bo4Var.e;
        rcg rcgVar2 = rcg.b;
        if (rcgVar == rcgVar2) {
            bo4Var.e = rcg.c;
        }
        bo4 bo4Var2 = kcgVar.e;
        if (((rcg) bo4Var2.e) == rcgVar2) {
            bo4Var2.e = rcg.c;
        }
    }

    public final void i() {
        lbg lbgVar = this.e.m;
        int ordinal = this.v.ordinal();
        int i = 1;
        nig nigVar = this.d;
        rq3 rq3Var = null;
        if (ordinal == 0) {
            kcg kcgVar = this.m;
            if (kcgVar == null) {
                Intrinsics.i("closeController");
                throw null;
            }
            hs4 hs4Var = z45.a;
            xw3.L(s9a.c(rob.a), null, null, new jcg(kcgVar, rq3Var, 0), 3);
            if (odg.a[lbgVar.ordinal()] == 1) {
                if (nigVar != null) {
                    ((pig) nigVar).b();
                }
            } else if (nigVar != null) {
                ((pig) nigVar).d();
            }
            if (nigVar != null) {
                ((pig) nigVar).c(gig.SMALL);
                return;
            }
            return;
        }
        if (ordinal != 1) {
            zzl.b();
            return;
        }
        kcg kcgVar2 = this.m;
        if (kcgVar2 == null) {
            Intrinsics.i("closeController");
            throw null;
        }
        hs4 hs4Var2 = z45.a;
        xw3.L(s9a.c(rob.a), null, null, new jcg(kcgVar2, rq3Var, i), 3);
        if (odg.a[lbgVar.ordinal()] == 2) {
            if (nigVar != null) {
                ((pig) nigVar).d();
            }
        } else if (nigVar != null) {
            ((pig) nigVar).b();
        }
        if (nigVar != null) {
            ((pig) nigVar).c(gig.REGULAR);
        }
    }

    @Override // defpackage.kbg
    public final void onAdLifecycleConfigured(xag xagVar) {
        xagVar.getClass();
        this.q = xagVar;
        veg vegVar = this.r;
        if (vegVar != null) {
            vegVar.b = xagVar;
            zag zagVar = (zag) xagVar;
            zagVar.t.add(new chf(1, this, tdg.class, "onViewabilityStatusChanged", "onViewabilityStatusChanged$smart_display_sdk_prodRelease(Lcom/equativ/displaysdk/coresdkdisplay/components/viewabilitymanager/SCSViewabilityStatus;)V", 0, 5));
            zagVar.u = new gme(25, vegVar, this);
            zagVar.v.add(this);
            adg adgVar = this.u;
            if (adgVar != null) {
                adgVar.a();
            }
        }
    }

    @Override // defpackage.mig
    public final void onCustomerFeedbackDialogDismissed(boolean z) {
        xag xagVar;
        this.t = false;
        blg blgVar = this.s;
        if (blgVar != null) {
            h(blgVar);
        }
        if (!z || (xagVar = this.q) == null) {
            return;
        }
        nig nigVar = this.d;
        ((zag) xagVar).n(nigVar != null ? (View) ((pig) nigVar).n.getValue() : null);
    }

    @Override // defpackage.mig
    public final void onCustomerFeedbackDialogShow() {
        this.t = true;
        blg blgVar = this.s;
        if (blgVar != null) {
            h(blgVar);
        }
    }

    @Override // defpackage.kbg
    public final void onDestroy() {
        jeg.d.f(1);
        eig eigVar = this.p;
        rq3 rq3Var = null;
        if (eigVar != null) {
            WebView webView = eigVar.c;
            webView.getViewTreeObserver().removeOnPreDrawListener(this);
            rjg b = this.c.b(webView);
            if (b != null) {
                b.c();
            }
            hs4 hs4Var = z45.a;
            xw3.L(s9a.c(rob.a), null, null, new qdg(eigVar, rq3Var, 0), 3);
        }
        this.q = null;
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public final boolean onPreDraw() {
        eig eigVar = this.p;
        if (eigVar != null) {
            WebView webView = eigVar.c;
            webView.getLocationOnScreen(new int[2]);
            Context context = webView.getContext();
            context.getClass();
            Rect b = fdg.b(context, false, false);
            float f = webView.getContext().getResources().getDisplayMetrics().density;
            int i = (int) ((r2[0] - b.left) / f);
            int i2 = (int) ((r2[1] - b.top) / f);
            int width = (int) (webView.getWidth() / f);
            int height = (int) (webView.getHeight() / f);
            veg vegVar = this.r;
            if (vegVar != null) {
                vegVar.a(me4.i(lnb.s(i, i2, "window.mraidbridge.setCurrentPosition(", BlazeDataSourcePersonalizedType.STRING_SEPARATOR, BlazeDataSourcePersonalizedType.STRING_SEPARATOR), width, BlazeDataSourcePersonalizedType.STRING_SEPARATOR, height, ");"));
            }
            veg vegVar2 = this.r;
            if (vegVar2 != null) {
                vegVar2.a(me4.i(lnb.s(i, i2, "window.mraidbridge.setDefaultPosition(", BlazeDataSourcePersonalizedType.STRING_SEPARATOR, BlazeDataSourcePersonalizedType.STRING_SEPARATOR), width, BlazeDataSourcePersonalizedType.STRING_SEPARATOR, height, ");"));
            }
        }
        return true;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        view.getClass();
        adg adgVar = new adg(new kdg(this, 0));
        adgVar.a();
        this.u = adgVar;
        eig eigVar = this.p;
        if (eigVar != null) {
            WebView webView = eigVar.c;
            rjg b = this.c.b(webView);
            if (b != null) {
                hkg.T().post(new ojg(b, 8));
            }
            webView.removeOnAttachStateChangeListener(this);
        }
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        view.getClass();
    }

    @Override // defpackage.kbg
    public final void a(boolean z, boolean z2) {
    }
}
