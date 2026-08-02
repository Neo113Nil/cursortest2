package defpackage;

import android.text.TextUtils;
import com.google.firebase.inappmessaging.model.MessageType;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final /* synthetic */ class qw9 implements bt8 {
    public final /* synthetic */ int a;
    public final /* synthetic */ tw9 b;
    public final /* synthetic */ String c;

    public /* synthetic */ qw9(tw9 tw9Var, String str, int i) {
        this.a = i;
        this.b = tw9Var;
        this.c = str;
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x03cb  */
    @Override // defpackage.bt8
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object apply(Object obj) {
        String str;
        String str2;
        sr9 sr9Var;
        wa waVar;
        lw9 wz0Var;
        lw9 lw9Var;
        sr9 sr9Var2;
        sr9 sr9Var3;
        wa waVar2;
        sr9 sr9Var4;
        sr9 sr9Var5;
        int i = this.a;
        String str3 = this.c;
        tw9 tw9Var = this.b;
        int i2 = 3;
        int i3 = 2;
        int i4 = 1;
        switch (i) {
            case 0:
                yi2 yi2Var = (yi2) obj;
                tw9Var.getClass();
                if (!wt3.b(yi2Var.l(), 1)) {
                    if (wt3.b(yi2Var.l(), 2)) {
                        String i5 = yi2Var.j().i();
                        String j = yi2Var.j().j();
                        if (!yi2Var.k()) {
                            c9 c9Var = tw9Var.l;
                            c9Var.b.execute(new r0(i4, c9Var, yi2Var.j().m()));
                        }
                        str = i5;
                        str2 = j;
                    }
                    return j0c.a;
                }
                str = yi2Var.o().i();
                str2 = yi2Var.o().j();
                uhc h = yi2Var.h();
                boolean k = yi2Var.k();
                yi2Var.i();
                z1a.y(h, "FirebaseInAppMessaging content cannot be null.");
                z1a.y(str, "FirebaseInAppMessaging campaign id cannot be null.");
                z1a.y(str2, "FirebaseInAppMessaging campaign name cannot be null.");
                h.toString();
                yih yihVar = new yih(str, str2, k, i2);
                int C = wt3.C(h.l());
                if (C == 0) {
                    ohc h2 = h.h();
                    String i6 = !TextUtils.isEmpty(h2.i()) ? h2.i() : null;
                    if (TextUtils.isEmpty(h2.l())) {
                        sr9Var = null;
                    } else {
                        String l = h2.l();
                        if (TextUtils.isEmpty(l)) {
                            l = null;
                        }
                        if (TextUtils.isEmpty(l)) {
                            a70.p("ImageData model must have an imageUrl");
                            return null;
                        }
                        sr9Var = new sr9(l);
                    }
                    if (h2.n()) {
                        f4a c = dff.c(h2.h());
                        waVar = new wa((String) c.b, (o72) c.c);
                    } else {
                        waVar = null;
                    }
                    n7j d = h2.o() ? dff.d(h2.j()) : null;
                    n7j d2 = h2.p() ? dff.d(h2.m()) : null;
                    if (d2 == null) {
                        a70.p("Banner model must have a title");
                        return null;
                    }
                    if (TextUtils.isEmpty(i6)) {
                        a70.p("Banner model must have a background color");
                        return null;
                    }
                    wz0Var = new wz0(yihVar, d2, d, sr9Var, waVar, i6);
                } else {
                    if (C != 1) {
                        if (C == 2) {
                            whc k2 = h.k();
                            if (TextUtils.isEmpty(k2.j())) {
                                sr9Var3 = null;
                            } else {
                                String j2 = k2.j();
                                if (TextUtils.isEmpty(j2)) {
                                    j2 = null;
                                }
                                if (TextUtils.isEmpty(j2)) {
                                    a70.p("ImageData model must have an imageUrl");
                                    return null;
                                }
                                sr9Var3 = new sr9(j2);
                            }
                            if (k2.k()) {
                                f4a c2 = dff.c(k2.h());
                                waVar2 = new wa((String) c2.b, (o72) c2.c);
                            } else {
                                waVar2 = null;
                            }
                            if (sr9Var3 == null) {
                                a70.p("ImageOnly model must have image data");
                                return null;
                            }
                            at9 at9Var = new at9(yihVar, MessageType.IMAGE_ONLY);
                            at9Var.c = sr9Var3;
                            at9Var.d = waVar2;
                            lw9Var = at9Var;
                        } else if (C != 3) {
                            lw9Var = new cff(new yih(str, str2, k, i2), MessageType.UNSUPPORTED);
                        } else {
                            shc i7 = h.i();
                            n7j d3 = i7.w() ? dff.d(i7.q()) : null;
                            n7j d4 = i7.r() ? dff.d(i7.i()) : null;
                            String h3 = !TextUtils.isEmpty(i7.h()) ? i7.h() : null;
                            wa b = (i7.s() || i7.t()) ? dff.b(i7.m(), i7.n()) : null;
                            wa b2 = (i7.u() || i7.v()) ? dff.b(i7.o(), i7.p()) : null;
                            if (TextUtils.isEmpty(i7.l())) {
                                sr9Var4 = null;
                            } else {
                                String l2 = i7.l();
                                if (TextUtils.isEmpty(l2)) {
                                    l2 = null;
                                }
                                if (TextUtils.isEmpty(l2)) {
                                    a70.p("ImageData model must have an imageUrl");
                                    return null;
                                }
                                sr9Var4 = new sr9(l2);
                            }
                            if (TextUtils.isEmpty(i7.k())) {
                                sr9Var5 = null;
                            } else {
                                String k3 = i7.k();
                                if (TextUtils.isEmpty(k3)) {
                                    k3 = null;
                                }
                                if (TextUtils.isEmpty(k3)) {
                                    a70.p("ImageData model must have an imageUrl");
                                    return null;
                                }
                                sr9Var5 = new sr9(k3);
                            }
                            if (b == null) {
                                a70.p("Card model must have a primary action");
                                return null;
                            }
                            if (b.b == null) {
                                a70.p("Card model must have a primary action button");
                                return null;
                            }
                            if (b2 != null && b2.b == null) {
                                a70.p("Card model secondary action must be null or have a button");
                                return null;
                            }
                            if (d3 == null) {
                                a70.p("Card model must have a title");
                                return null;
                            }
                            if (sr9Var4 == null && sr9Var5 == null) {
                                a70.p("Card model must have at least one image");
                                return null;
                            }
                            if (TextUtils.isEmpty(h3)) {
                                a70.p("Card model must have a background color");
                                return null;
                            }
                            wz0Var = new jk2(yihVar, d3, d4, sr9Var4, sr9Var5, h3, b, b2);
                        }
                        if (!lw9Var.a.equals(MessageType.UNSUPPORTED)) {
                            j1k j1kVar = new j1k();
                            j1kVar.a = lw9Var;
                            j1kVar.b = str3;
                            return g0c.a(j1kVar);
                        }
                        return j0c.a;
                    }
                    yhc m = h.m();
                    String j3 = !TextUtils.isEmpty(m.j()) ? m.j() : null;
                    if (TextUtils.isEmpty(m.m())) {
                        sr9Var2 = null;
                    } else {
                        String m2 = m.m();
                        if (TextUtils.isEmpty(m2)) {
                            m2 = null;
                        }
                        if (TextUtils.isEmpty(m2)) {
                            a70.p("ImageData model must have an imageUrl");
                            return null;
                        }
                        sr9Var2 = new sr9(m2);
                    }
                    wa b3 = m.o() ? dff.b(m.h(), m.i()) : null;
                    n7j d5 = m.p() ? dff.d(m.k()) : null;
                    n7j d6 = m.q() ? dff.d(m.n()) : null;
                    if (d6 == null) {
                        a70.p("Modal model must have a title");
                        return null;
                    }
                    if (b3 != null && b3.b == null) {
                        a70.p("Modal model action must be null or have a button");
                        return null;
                    }
                    if (TextUtils.isEmpty(j3)) {
                        a70.p("Modal model must have a background color");
                        return null;
                    }
                    wz0Var = new gtc(yihVar, d6, d5, sr9Var2, b3, j3);
                }
                lw9Var = wz0Var;
                if (!lw9Var.a.equals(MessageType.UNSUPPORTED)) {
                }
                return j0c.a;
            default:
                yi2 yi2Var2 = (yi2) obj;
                tw9Var.getClass();
                if (yi2Var2.k() || !str3.equals("ON_FOREGROUND")) {
                    return g0c.a(yi2Var2);
                }
                zmf zmfVar = tw9Var.h;
                wu0 wu0Var = tw9Var.i;
                return new p0c(new m0c(0, new ekd(i3, new ekd(i4, new t0c(new l0c(new p0c(new l0c(zmfVar.a(), g0c.a(umf.h()), 2), new xmf(zmfVar, wu0Var, i3), 1), new xmf(zmfVar, wu0Var, i2), 0)), new is8(20)), new v35(new yhh(), i4)), new is8(21)), new nw9(yi2Var2), 1);
        }
    }
}
