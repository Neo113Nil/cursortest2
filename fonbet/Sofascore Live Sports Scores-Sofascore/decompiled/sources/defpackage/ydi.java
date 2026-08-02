package defpackage;

import android.content.Context;
import android.view.ViewGroup;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.widget.FrameLayout;
import com.iab.omid.library.adsbynimbus.Omid;
import com.iab.omid.library.adsbynimbus.ScriptInjector;
import com.sofascore.results.R;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Unit;
import kotlin.text.StringsKt;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class ydi implements qyf, lb3 {
    public static final /* synthetic */ int d = 0;

    static {
        ypa.b(zg3.M);
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x0126  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x01bf  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x01e8  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x01dc  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void c(hcd hcdVar, ViewGroup viewGroup, boolean z, pyf pyfVar) {
        xdi xdiVar;
        String sb;
        boolean z2;
        String sb2;
        hcdVar.getClass();
        viewGroup.getClass();
        boolean z3 = viewGroup instanceof lcd;
        lcd lcdVar = z3 ? (lcd) viewGroup : null;
        if (lcdVar == null) {
            Context context = viewGroup.getContext();
            context.getClass();
            lcdVar = new lcd(context);
        }
        WebView webView = new WebView(viewGroup.getContext());
        webView.setId(R.id.nimbus_web_view);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -1, 17);
        if (hcdVar.c() > 0 && hcdVar.g() > 0) {
            layoutParams.height = lcdVar.a(Integer.valueOf(hcdVar.c()));
            layoutParams.width = lcdVar.a(Integer.valueOf(hcdVar.g()));
        }
        webView.setMinimumWidth(Integer.max(0, layoutParams.width));
        webView.setMinimumHeight(Integer.max(0, layoutParams.height));
        webView.setLayoutParams(layoutParams);
        webView.setWebViewClient(ycd.a);
        webView.setHorizontalScrollBarEnabled(false);
        webView.setVerticalScrollBarEnabled(false);
        WebSettings settings = webView.getSettings();
        settings.setJavaScriptEnabled(true);
        settings.setDomStorageEnabled(true);
        ad2 ad2Var = oc3.a;
        settings.setMixedContentMode(0);
        settings.setOffscreenPreRaster(true);
        if (y0l.b("MUTE_AUDIO")) {
            v0l.e(webView, true);
        }
        lcdVar.addView(webView);
        ArrayList arrayList = ovk.a;
        ArrayList arrayList2 = new ArrayList();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            it.next();
        }
        WebView webView2 = (WebView) lcdVar.findViewById(R.id.nimbus_web_view);
        if (webView2 != null) {
            xdiVar = new xdi(lcdVar, hcdVar, arrayList2);
            if (z) {
                lcdVar.d = xdiVar;
            }
            webView2.setTag(R.id.controller, xdiVar);
            mqi mqiVar = njd.i;
            if (!Omid.isActive()) {
                String str = gcd.a;
                Omid.activate(oie.a());
                Unit unit = Unit.a;
                if (!Omid.isActive()) {
                    sb = hcdVar.a();
                    String str2 = "https://local.adsbynimbus.com";
                    if (y0l.b("WEB_MESSAGE_LISTENER")) {
                        v0l.a(webView2, "Adsbynimbus", w9h.b("https://local.adsbynimbus.com"), xdiVar);
                        String id = iie.b.getId();
                        if (id == null) {
                            id = "00000000-0000-0000-0000-000000000000";
                        }
                        boolean isLimitAdTrackingEnabled = iie.b.isLimitAdTrackingEnabled();
                        String str3 = gcd.a;
                        String packageName = viewGroup.getContext().getPackageName();
                        packageName.getClass();
                        StringBuilder s = mz1.s("<script>window.MRAID_ENV={version:\"3.0\",sdk:\"Adsbynimbus\",sdkVersion:\"2.37.0\",appId:\"", packageName, "\",ifa:\"", id, "\",limitAdTracking:");
                        s.append(isLimitAdTrackingEnabled);
                        s.append(',');
                        s.append(dii.c("coppa:false}</script>"));
                        String sb3 = s.toString();
                        int P = StringsKt.P(sb, "<head>", 0, false, 6);
                        if (P < 0) {
                            sb2 = sb3.concat(sb);
                        } else {
                            StringBuilder sb4 = new StringBuilder(sb3.length() + sb.length());
                            int i = P + 6;
                            sb4.insert(0, sb, 0, i).getClass();
                            sb4.insert(i, sb3);
                            StringBuilder insert = sb4.insert(sb3.length() + i, sb, i, sb.length());
                            insert.getClass();
                            sb2 = insert.toString();
                        }
                        sb = sb2;
                    }
                    z2 = !hcdVar.e() || gcd.b == 0;
                    sb.getClass();
                    x40 x40Var = new x40(10, webView2, str2, sb);
                    if (z2) {
                        jtd.a(webView2, new pyn(22, x40Var, webView2));
                    } else {
                        if (!webView2.isLaidOut() || webView2.isLayoutRequested()) {
                            webView2.addOnLayoutChangeListener(new b2(x40Var, 17));
                        } else {
                            x40Var.invoke(webView2);
                        }
                        Unit unit2 = Unit.a;
                    }
                    if (!z3) {
                        viewGroup.addView(lcdVar);
                    }
                }
            }
            StringBuilder sb5 = new StringBuilder();
            sb5.append(ScriptInjector.injectScriptContentIntoHtml((String) njd.i.getValue(), hcdVar.a()));
            sb5.lastIndexOf("</body>");
            Iterator it2 = arrayList2.iterator();
            if (it2.hasNext()) {
                throw lnb.i(it2);
            }
            sb = sb5.toString();
            String str22 = "https://local.adsbynimbus.com";
            if (y0l.b("WEB_MESSAGE_LISTENER")) {
            }
            if (hcdVar.e()) {
            }
            sb.getClass();
            x40 x40Var2 = new x40(10, webView2, str22, sb);
            if (z2) {
            }
            if (!z3) {
            }
        } else {
            xdiVar = null;
        }
        if (xdiVar != null) {
            pyfVar.onAdRendered(xdiVar);
        } else {
            ((pcd) pyfVar).onError(new qcd(4, "Error creating WebView.", null));
        }
    }

    @Override // defpackage.qyf
    public final void a(hcd hcdVar, lcd lcdVar, pyf pyfVar) {
        hcdVar.getClass();
        c(hcdVar, lcdVar, true, pyfVar);
    }

    @Override // defpackage.lb3
    public final void b() {
        qyf.a.put("static", this);
    }
}
