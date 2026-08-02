package defpackage;

import android.app.Dialog;
import android.content.Context;
import android.content.Intent;
import android.graphics.Rect;
import android.net.Uri;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.webkit.WebSettings;
import android.webkit.WebView;
import com.adsbynimbus.render.mraid.Host;
import com.iab.omid.library.adsbynimbus.Omid;
import com.iab.omid.library.adsbynimbus.adsession.CreativeType;
import com.ironsource.U3;
import com.sofascore.results.R;
import com.unity3d.ads.BuildConfig;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import org.chromium.support_lib_boundary.WebViewProviderBoundaryInterface;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class xdi extends of implements u0l {
    public final hcd f;
    public boolean g;
    public long h;
    public boolean i;
    public final mqi j;
    public int k;
    public final lcd l;

    /* JADX WARN: Removed duplicated region for block: B:11:0x007a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public xdi(lcd lcdVar, hcd hcdVar, ArrayList arrayList) {
        Object u2gVar;
        Throwable a;
        hcdVar.getClass();
        this.f = hcdVar;
        this.j = ypa.b(new o1i(this, 13));
        try {
            p2g p2gVar = w2g.b;
            mqi mqiVar = njd.i;
        } catch (Throwable th) {
            p2g p2gVar2 = w2g.b;
            u2gVar = new u2g(th);
        }
        if (!Omid.isActive()) {
            String str = gcd.a;
            Omid.activate(oie.a());
            Unit unit = Unit.a;
            if (Omid.isActive()) {
            }
            u2gVar = Unit.a;
            a = w2g.a(u2gVar);
            if (a != null) {
                cjb.a("error initializing OM session: " + a.getMessage());
            }
            this.l = lcdVar;
        }
        CreativeType creativeType = CreativeType.HTML_DISPLAY;
        ArrayList arrayList2 = new ArrayList(k13.r(arrayList, 10));
        Iterator it = arrayList.iterator();
        if (it.hasNext()) {
            if (it.next() != null) {
                throw new ClassCastException();
            }
            throw null;
        }
        njd njdVar = new njd(creativeType, new ArrayList(arrayList2), this);
        this.d.add(njdVar);
        this.c = njdVar;
        u2gVar = Unit.a;
        a = w2g.a(u2gVar);
        if (a != null) {
        }
        this.l = lcdVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.of
    public final void a() {
        if (this.a != 5) {
            b(zf.j);
            lcd lcdVar = this.l;
            WebView webView = (WebView) lcdVar.findViewById(R.id.nimbus_web_view);
            Object[] objArr = 0;
            if (webView != null) {
                if (y0l.b("WEB_MESSAGE_LISTENER")) {
                    v0l.d(webView, "Adsbynimbus");
                }
                ad2 ad2Var = oc3.a;
                hs4 hs4Var = z45.a;
                xw3.L(ad2Var, rob.a, null, new w9g(webView, objArr == true ? 1 : 0, 19), 2);
            }
            Object tag = lcdVar.getTag(R.id.expand_container);
            Dialog dialog = tag instanceof Dialog ? (Dialog) tag : null;
            if (dialog != null) {
                dialog.dismiss();
            }
            lcdVar.setTag(R.id.expand_container, null);
            lcdVar.setTag(R.id.placeholder, null);
            lcdVar.removeAllViews();
            ViewParent parent = lcdVar.getParent();
            ViewGroup viewGroup = parent instanceof ViewGroup ? (ViewGroup) parent : null;
            if (viewGroup != null) {
                ViewGroup viewGroup2 = lcdVar.e == null ? viewGroup : null;
                if (viewGroup2 != null) {
                    viewGroup2.removeView(lcdVar);
                }
            }
        }
    }

    @Override // defpackage.of
    public final View f() {
        return this.l;
    }

    @Override // defpackage.of
    public final int g() {
        return this.k;
    }

    @Override // defpackage.of
    public final void h() {
        this.h = System.currentTimeMillis();
        if (this.k == 0 || this.a != 5) {
            k(100);
        }
    }

    @Override // defpackage.of
    public final void i(int i, Rect rect) {
        WebView webView;
        WebView webView2;
        rect.getClass();
        boolean z = true;
        boolean z2 = i >= Math.max(gcd.b, 1);
        int C = wt3.C(this.a);
        if (C != 0) {
            if (C != 1) {
                if (C != 2) {
                    if (C != 3) {
                        if (C == 4) {
                            return;
                        }
                    } else if (z2) {
                        b(zf.e);
                    }
                } else if (!z2) {
                    b(zf.d);
                }
            } else if (z2) {
                o();
            }
            Host n = n();
            l2f l2fVar = new l2f(rect.width(), rect.height(), rect.left, rect.top);
            n.getClass();
            StringBuilder sb = new StringBuilder();
            if (!Intrinsics.c(n.State, "loading")) {
                if (i == 0 && n.isViewable) {
                    n.isViewable = false;
                    t33.g(sb, U3.i.o, "false");
                    t33.c(sb, i, l2fVar);
                    t33.a(sb, U3.h.V, "false");
                } else if (i <= 0 || n.isViewable) {
                    t33.c(sb, i, l2fVar);
                } else {
                    n.isViewable = true;
                    t33.g(sb, U3.i.o, "true");
                    t33.c(sb, i, l2fVar);
                    t33.a(sb, U3.h.V, "true");
                }
            }
            String sb2 = sb.toString();
            int length = sb2.length();
            lcd lcdVar = this.l;
            if (length > 0 && (webView2 = (WebView) lcdVar.findViewById(R.id.nimbus_web_view)) != null) {
                webView2.evaluateJavascript(sb2, null);
            }
            if (!y0l.b("MUTE_AUDIO") || (webView = (WebView) lcdVar.findViewById(R.id.nimbus_web_view)) == null) {
                return;
            }
            WebView webView3 = this.a != 5 ? webView : null;
            if (webView3 != null) {
                if (i != 0 && this.k != 0) {
                    z = false;
                }
                int i2 = v0l.a;
                if (!y0l.j.b()) {
                    throw y0l.a();
                }
                if (z != ((WebViewProviderBoundaryInterface) v0l.b(webView3).b).isAudioMuted()) {
                    v0l.e(webView3, z);
                }
            }
        }
    }

    @Override // defpackage.of
    public final void k(int i) {
        this.k = i;
        WebView webView = (WebView) this.l.findViewById(R.id.nimbus_web_view);
        if (webView != null) {
            if (this.a == 5) {
                webView = null;
            }
            if (webView != null) {
                w3a.J(webView, i == 0);
            }
        }
    }

    @Override // defpackage.of
    public final void l() {
        if (this.a != 5) {
            ad2 ad2Var = oc3.a;
            WebView webView = (WebView) this.l.findViewById(R.id.nimbus_web_view);
            WebSettings settings = webView != null ? webView.getSettings() : null;
            if (settings == null) {
                return;
            }
            settings.setOffscreenPreRaster(true);
        }
    }

    @Override // defpackage.of
    public final void m() {
        if (this.a != 5) {
            ad2 ad2Var = oc3.a;
            WebView webView = (WebView) this.l.findViewById(R.id.nimbus_web_view);
            WebSettings settings = webView != null ? webView.getSettings() : null;
            if (settings != null) {
                settings.setOffscreenPreRaster(false);
            }
        }
        if (this.a == 3) {
            b(zf.d);
        }
    }

    public final Host n() {
        return (Host) this.j.getValue();
    }

    public final void o() {
        if (this.g) {
            return;
        }
        this.g = true;
        b(zf.b);
    }

    @Override // defpackage.u0l
    public final void onPostMessage(WebView webView, i0l i0lVar, Uri uri, boolean z, mda mdaVar) {
        String sb;
        Object u2gVar;
        s33 s33Var;
        WebView webView2;
        webView.getClass();
        uri.getClass();
        mdaVar.getClass();
        boolean c = Intrinsics.c(i0lVar.a(), U3.i.s);
        lcd lcdVar = this.l;
        if (!c || this.i) {
            String a = i0lVar.a();
            StringBuilder sb2 = new StringBuilder();
            Host n = n();
            if (!ph0.a0(new String[]{"hidden", "loading"}).contains(n.State)) {
                if (a != null) {
                    try {
                        p2g p2gVar = w2g.b;
                        u2gVar = (s33) t33.a.b(s33.Companion.serializer(), a);
                    } catch (Throwable th) {
                        p2g p2gVar2 = w2g.b;
                        u2gVar = new u2g(th);
                    }
                    Throwable a2 = w2g.a(u2gVar);
                    if (a2 != null) {
                        cjb.a(a2.getMessage());
                    }
                    if (u2gVar instanceof u2g) {
                        u2gVar = null;
                    }
                    s33Var = (s33) u2gVar;
                } else {
                    s33Var = null;
                }
                if (s33Var instanceof pj6) {
                    int exposure = lcdVar.getExposure();
                    Rect visibleRect = lcdVar.getVisibleRect();
                    t33.c(sb2, exposure, new l2f(visibleRect.width(), visibleRect.height(), visibleRect.left, visibleRect.top));
                } else if (s33Var instanceof bz2) {
                    c90.d(this);
                } else if (s33Var instanceof qh6) {
                    if (Intrinsics.c(n.PlacementType, "inline") && !Intrinsics.c(n.State, "expanded")) {
                        c90.m(this);
                    }
                } else if (s33Var instanceof rtd) {
                    Uri parse = Uri.parse(((rtd) s33Var).b);
                    parse.getClass();
                    p(parse);
                } else if (s33Var instanceof bck) {
                    a();
                } else if (s33Var instanceof x0g) {
                    if (Intrinsics.c(n.State, "expanded")) {
                        t33.b("invalid state", sb2);
                    } else if (n.ResizeProperties == null) {
                        t33.b("calling resize without setting properties", sb2);
                    } else {
                        a1g a1gVar = n().ResizeProperties;
                        if (a1gVar != null && (webView2 = (WebView) lcdVar.findViewById(R.id.nimbus_web_view)) != null) {
                            webView2.addOnLayoutChangeListener(new ns3(this, webView2));
                            DisplayMetrics displayMetrics = webView2.getResources().getDisplayMetrics();
                            ViewGroup.LayoutParams layoutParams = webView2.getLayoutParams();
                            if (layoutParams == null) {
                                yhk.s("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
                                return;
                            }
                            displayMetrics.getClass();
                            layoutParams.width = iz8.s(displayMetrics, a1gVar.a);
                            layoutParams.height = iz8.s(displayMetrics, a1gVar.b);
                            webView2.setLayoutParams(layoutParams);
                            webView2.setTranslationX(iz8.s(displayMetrics, a1gVar.c));
                            webView2.setTranslationY(iz8.s(displayMetrics, a1gVar.d));
                        }
                    }
                } else if (s33Var instanceof h9h) {
                    wh6 wh6Var = ((h9h) s33Var).b;
                    n.ExpandProperties = wh6Var;
                    bga bgaVar = t33.a;
                    bgaVar.getClass();
                    t33.g(sb2, "ExpandProperties", bgaVar.c(wh6.Companion.serializer(), wh6Var));
                } else if (s33Var instanceof k9h) {
                    mwd mwdVar = ((k9h) s33Var).b;
                    n.OrientationProperties = mwdVar;
                    bga bgaVar2 = t33.a;
                    bgaVar2.getClass();
                    t33.g(sb2, "OrientationProperties", bgaVar2.c(mwd.Companion.serializer(), mwdVar));
                } else if (s33Var instanceof n9h) {
                    a1g a1gVar2 = ((n9h) s33Var).b;
                    ljh ljhVar = n.MaxSize;
                    a1gVar2.getClass();
                    ljhVar.getClass();
                    int i = a1gVar2.a;
                    int i2 = 50 - i;
                    int i3 = ljhVar.a - i;
                    int i4 = a1gVar2.c;
                    if (i2 <= i4 && i4 <= i3) {
                        int i5 = a1gVar2.b;
                        int i6 = 50 - i5;
                        int i7 = ljhVar.b - i5;
                        int i8 = a1gVar2.d;
                        if (i6 <= i8 && i8 <= i7) {
                            n.ResizeProperties = a1gVar2;
                            bga bgaVar3 = t33.a;
                            bgaVar3.getClass();
                            t33.g(sb2, "ResizeProperties", bgaVar3.c(a1g.Companion.serializer(), a1gVar2));
                        }
                    }
                    t33.b("invalid resize properties", sb2);
                } else {
                    if (s33Var instanceof qfi ? true : s33Var instanceof cke ? true : s33Var instanceof cy3) {
                        t33.b("not supported", sb2);
                    } else {
                        t33.b("invalid command", sb2);
                    }
                }
            }
            sb = sb2.toString();
        } else {
            DisplayMetrics displayMetrics2 = lcdVar.getResources().getDisplayMetrics();
            displayMetrics2.getClass();
            l2f l2fVar = new l2f(iz8.C(displayMetrics2, lcdVar.getWidth()), iz8.C(displayMetrics2, lcdVar.getHeight()), iz8.C(displayMetrics2, lcdVar.getLeft()), iz8.C(displayMetrics2, lcdVar.getTop()));
            boolean z2 = lcdVar.b && lcdVar.getGlobalVisibleRect(new Rect());
            StringBuilder sb3 = new StringBuilder();
            this.i = true;
            Host n2 = n();
            n2.CurrentPosition = l2fVar;
            n2.DefaultPosition = l2fVar;
            n2.State = BuildConfig.FLAVOR;
            n2.isViewable = z2;
            t33.f(sb3, l2fVar, true);
            t33.h(BuildConfig.FLAVOR, sb3);
            t33.g(sb3, U3.i.o, String.valueOf(z2));
            t33.e(BuildConfig.FLAVOR, sb3);
            t33.a(sb3, U3.i.s, new String[0]);
            sb = sb3.toString();
        }
        if (sb.length() > 0) {
            webView.evaluateJavascript(sb, null);
        }
    }

    public final boolean p(Uri uri) {
        Object u2gVar;
        uri.getClass();
        if (System.currentTimeMillis() - this.h < 2000) {
            try {
                p2g p2gVar = w2g.b;
                Context context = this.l.getContext();
                Intent intent = new Intent("android.intent.action.VIEW", uri);
                intent.setFlags(268435456);
                context.startActivity(intent);
                hcd hcdVar = this.f;
                zf zfVar = zf.c;
                Object obj = v14.b;
                if (obj == null) {
                    obj = ztj.a;
                }
                hcdVar.getClass();
                obj.getClass();
                ad2 ad2Var = oc3.a;
                hs4 hs4Var = z45.a;
                xw3.L(ad2Var, hq4.c, null, new l0(hcdVar, obj, null, 8), 2);
                b(zfVar);
                u2gVar = Boolean.TRUE;
            } catch (Throwable th) {
                p2g p2gVar2 = w2g.b;
                u2gVar = new u2g(th);
            }
            Object obj2 = Boolean.FALSE;
            if (u2gVar instanceof u2g) {
                u2gVar = obj2;
            }
            if (((Boolean) u2gVar).booleanValue()) {
                return true;
            }
        }
        return false;
    }
}
