package com.fyber.inneractive.sdk.util;

import android.text.TextUtils;
import com.fyber.inneractive.sdk.config.IAConfigManager;
import com.iab.omid.library.fyber.ScriptInjector;
import xsna.jh;

/* loaded from: classes12.dex */
public final class d implements Runnable {
    public final /* synthetic */ Object[] a = null;
    public final /* synthetic */ com.fyber.inneractive.sdk.web.e b;

    public d(com.fyber.inneractive.sdk.web.e eVar) {
        this.b = eVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.fyber.inneractive.sdk.web.e eVar = this.b;
        Object[] objArr = this.a;
        eVar.getClass();
        long currentTimeMillis = System.currentTimeMillis();
        String str = eVar.g;
        if (eVar.h) {
            com.fyber.inneractive.sdk.web.i iVar = eVar.l;
            String str2 = eVar.i;
            String str3 = eVar.j;
            com.fyber.inneractive.sdk.web.i1 i1Var = (com.fyber.inneractive.sdk.web.i1) iVar;
            i1Var.getClass();
            StringBuilder sb = new StringBuilder("<html><title>DigitalTurbine Ad</title><head><link rel=\"icon\" href=\"data:,\">");
            boolean z = false;
            if (TextUtils.isEmpty(str)) {
                IAlog.a("loadHtml called with an empty HTML!", new Object[0]);
            } else {
                if (i1Var.F) {
                    String b = o.b("ia_js_load_monitor.txt");
                    if (!TextUtils.isEmpty(b)) {
                        sb.append(b);
                    }
                }
                sb.append("<script> window.iaPreCachedAd = true; </script>");
                IAConfigManager iAConfigManager = IAConfigManager.N;
                boolean a = iAConfigManager.t.b.a(false, "use_js_inline");
                if (!a || iAConfigManager.E.b == null) {
                    sb.append("<script src=\"https://cdn2.inner-active.mobi/client/ia-js-tags/dt-mraid-video-controller.js\"></script>");
                } else {
                    sb.append("<script type=\"text/javascript\">");
                    sb.append(iAConfigManager.E.b);
                    sb.append("</script>");
                }
                if (!TextUtils.isEmpty(str2)) {
                    sb.append(str2);
                }
                sb.append("<script>var prevWindowOnError = window.onerror; window.onerror = function(err) {if (typeof prevWindowOnError === 'function') {prevWindowOnError.apply();} console.log('WINDOW.ONERROR Javascript Error: ' + err);};</script></head><style>body{text-align:center !important;margin:0;padding:0;}");
                if (!TextUtils.isEmpty(str3)) {
                    sb.append(str3);
                }
                sb.append("</style><body id=\"iaBody\">");
                if (i1Var.B && i1Var.m()) {
                    if (!a || iAConfigManager.E.c == null) {
                        sb.append("<link rel=\"stylesheet\" href=\"https://cdn2.inner-active.mobi/IA-JSTag/Production/centering_v1.css\">");
                    } else {
                        sb.append("<style type=\"text/css\">");
                        sb.append(iAConfigManager.E.c);
                        sb.append("</style>");
                    }
                    if (!a || iAConfigManager.E.d == null) {
                        sb.append("<script src=\"https://cdn2.inner-active.mobi/IA-JSTag/Production/centering_v1.js\"></script>");
                    } else {
                        sb.append("<script type=\"text/javascript\">");
                        sb.append(iAConfigManager.E.d);
                        sb.append("</script>");
                    }
                }
                String b2 = o.b("ia_mraid_bridge.txt");
                if (!TextUtils.isEmpty(b2)) {
                    jh.f(sb, "<div id='iaScriptBr' style='display:none;'>", b2, "</div>");
                    if (IAlog.a >= 2) {
                        sb.append("<script type=\"text/javascript\">window.mraidbridge.loggingEnabled = true;</script>");
                    }
                }
                sb.append(str);
                sb.append("</body></html>");
                com.fyber.inneractive.sdk.measurement.e eVar2 = i1Var.H;
                if (eVar2 != null) {
                    com.fyber.inneractive.sdk.flow.x xVar = i1Var.s;
                    if (xVar != null) {
                        com.fyber.inneractive.sdk.response.e eVar3 = xVar.b;
                        if (eVar3 != null && eVar3.G) {
                            z = true;
                        }
                        String sb2 = sb.toString();
                        if (z) {
                            StringBuilder sb3 = new StringBuilder();
                            if (!TextUtils.isEmpty(eVar2.c)) {
                                sb3.append(eVar2.c);
                            }
                            if (!TextUtils.isEmpty(eVar2.d)) {
                                sb3.append(eVar2.d);
                            }
                            sb2 = ScriptInjector.injectScriptContentIntoHtml(sb3.toString(), sb2);
                        }
                        str = !TextUtils.isEmpty(eVar2.b) ? ScriptInjector.injectScriptContentIntoHtml(eVar2.b, sb2) : sb2;
                    }
                } else {
                    str = sb.toString();
                }
            }
            str = null;
        }
        com.fyber.inneractive.sdk.web.i iVar2 = eVar.l;
        iVar2.getClass();
        IAlog.a("%sbuild html string took %d msec", IAlog.a(iVar2), Long.valueOf(System.currentTimeMillis() - currentTimeMillis));
        com.fyber.inneractive.sdk.web.e eVar4 = this.b;
        if (eVar4.f) {
            return;
        }
        eVar4.c = new e(eVar4, str);
        eVar4.a().post(this.b.c);
    }
}
