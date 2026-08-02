package defpackage;

import androidx.core.app.NotificationCompat;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public abstract class dh3 {
    public static final ff5 a = new ff5(1, gf3.k);
    public static final ff5 b = new ff5(1, gf3.m);
    public static final ff5 c = new ff5(1, gf3.o);
    public static final ff5 d = new ff5(1, gf3.n);
    public static final ff5 e = new ff5(1, gf3.q);
    public static final ff5 f = new ff5(1, gf3.p);
    public static final ff5 g = new ff5(1, gf3.z);
    public static final ff5 h = new ff5(1, gf3.u);
    public static final ff5 i = new ff5(1, gf3.v);
    public static final ff5 j = new ff5(1, gf3.x);
    public static final ff5 k = new ff5(1, gf3.w);
    public static final ff5 l = new ff5(1, gf3.A);
    public static final ff5 m = new ff5(1, gf3.B);
    public static final ff5 n = new ff5(1, gf3.C);
    public static final ff5 o = new ff5(1, gf3.E);
    public static final ff5 p;
    public static final ff5 q;
    public static final ff5 r;
    public static final ff5 s;
    public static final ff5 t;
    public static final ff5 u;
    public static final ff5 v;
    public static final ff5 w;
    public static final ff5 x;

    static {
        ypa.b(new t63(9));
        p = new ff5(1, gf3.J);
        q = new ff5(1, gf3.H);
        r = new ff5(1, gf3.K);
        s = new ff5(1, gf3.L);
        t = new ff5(1, gf3.M);
        u = new ff5(1, zg3.j);
        v = new ff5(1, gf3.D);
        w = new ff5(0, gf3.F);
        x = new ff5(1, gf3.t);
    }

    public static final void a(ryd rydVar, p40 p40Var, tc3 tc3Var, of3 of3Var, int i2) {
        av8 av8Var = (av8) of3Var;
        av8Var.f0(1925803616);
        int i3 = (av8Var.g(rydVar) ? 4 : 2) | i2 | (av8Var.g(p40Var) ? 32 : 16) | (av8Var.i(tc3Var) ? NotificationCompat.FLAG_LOCAL_ONLY : 128);
        if (av8Var.T(i3 & 1, (i3 & 147) != 146)) {
            xy xyVar = (xy) rydVar;
            gb0 a2 = a.a(xyVar.m918getAccessibilityManager());
            gb0 a3 = b.a(xyVar.getAutofill());
            gb0 a4 = d.a(xyVar.getAutofillManager());
            gb0 a5 = c.a(xyVar.getAutofillTree());
            gb0 a6 = e.a(xyVar.m920getClipboardManager());
            gb0 a7 = f.a(xyVar.m919getClipboard());
            gb0 a8 = h.a(xyVar.getDensity());
            gb0 a9 = i.a(xyVar.getFocusOwner());
            gb0 a10 = j.a(xyVar.getFontLoader());
            a10.e = false;
            gb0 a11 = k.a(xyVar.getFontFamilyResolver());
            a11.e = false;
            tol.c(new gb0[]{a2, a3, a4, a5, a6, a7, a8, a9, a10, a11, l.a(xyVar.getHapticFeedBack()), m.a(xyVar.getInputModeManager()), n.a(xyVar.getLayoutDirection()), p.a(xyVar.getTextInputService()), q.a(xyVar.getSoftwareKeyboardController()), r.a(xyVar.getTextToolbar()), s.a(p40Var), t.a(xyVar.getViewConfiguration()), u.a(xyVar.getWindowInfo()), v.a(xyVar.getPointerIconService()), g.a(xyVar.getGraphicsContext()), rhb.a.a(xyVar.getRetainedValuesStore()), o.a(xyVar.getLocaleList())}, tc3Var, av8Var, ((i3 >> 3) & 112) | 8);
        } else {
            av8Var.W();
        }
        eqf u2 = av8Var.u();
        if (u2 != null) {
            u2.d = new ah3(rydVar, p40Var, tc3Var, i2);
        }
    }

    public static final void b(String str) {
        throw new IllegalStateException(("CompositionLocal " + str + " not present").toString());
    }
}
