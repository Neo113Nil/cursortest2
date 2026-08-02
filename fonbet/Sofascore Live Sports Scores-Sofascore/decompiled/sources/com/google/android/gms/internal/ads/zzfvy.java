package com.google.android.gms.internal.ads;

import android.view.View;
import android.webkit.WebView;
import defpackage.a70;
import defpackage.mxn;
import defpackage.v0l;
import defpackage.y0l;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zzfvy {
    public final zzfwa a;
    public final WebView b;
    public final zzfyb c;
    public final HashMap d;
    public final zzfwo e;

    /* JADX WARN: Multi-variable type inference failed */
    public zzfvy(zzfwa zzfwaVar, WebView webView) {
        HashMap hashMap = new HashMap();
        this.d = hashMap;
        this.e = new zzfwo();
        if (!zzfvk.a.a) {
            a70.r("Method called before OM SDK activation");
            throw null;
        }
        this.a = zzfwaVar;
        this.b = webView;
        zzfyb zzfybVar = this.c;
        if ((zzfybVar == null ? null : (View) zzfybVar.get()) != webView) {
            Iterator it = hashMap.values().iterator();
            while (it.hasNext()) {
                ((zzfvm) it.next()).a(webView);
            }
            this.c = new zzfyb(webView);
        }
        if (!y0l.b("WEB_MESSAGE_LISTENER")) {
            a70.m("The JavaScriptSessionService cannot be supported in this WebView version.");
            throw null;
        }
        v0l.d(this.b, "omidJsSessionService");
        v0l.a(this.b, "omidJsSessionService", new HashSet(Arrays.asList("*")), new mxn(this, 11));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void a(String str) {
        zzfvz zzfvzVar = zzfvz.JAVASCRIPT;
        zzfvq zzfvqVar = new zzfvq(zzfvn.a(zzfvr.DEFINED_BY_JAVASCRIPT, zzfvu.DEFINED_BY_JAVASCRIPT, zzfvzVar, zzfvzVar, false), new zzfvo(this.a, this.b, null, null, zzfvp.HTML), str);
        this.d.put(str, zzfvqVar);
        zzfyb zzfybVar = this.c;
        zzfvqVar.a(zzfybVar == null ? null : (View) zzfybVar.get());
        Iterator it = this.e.a.iterator();
        while (it.hasNext()) {
            zzfvqVar.c((View) ((zzfwn) it.next()).a.get());
        }
        zzfvqVar.d();
    }
}
