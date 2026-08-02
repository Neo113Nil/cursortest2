package com.bytedance.sdk.component.pcc;

import android.content.Context;
import android.text.TextUtils;
import android.webkit.WebView;
import defpackage.a70;
import java.util.LinkedHashSet;
import java.util.Set;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public class vy {
    boolean hc;
    vh kj;
    qf oo;
    WebView pcc;
    boolean qf;
    pcc sf;
    Context vj;
    tmg vy;
    boolean wh;
    String gm = "IESJSBridge";
    String ork = "host";
    final Set<String> vh = new LinkedHashSet();
    final Set<String> tmg = new LinkedHashSet();

    public vy(WebView webView) {
        this.pcc = webView;
    }

    private void sf() {
        if (!(this.pcc == null && !this.hc && this.sf == null) && ((!TextUtils.isEmpty(this.gm) || this.pcc == null) && this.oo != null)) {
            return;
        }
        a70.p("Requested arguments aren't set properly when building JsBridge.");
    }

    public jr pcc() {
        sf();
        return new jr(this);
    }

    public vy pcc(String str) {
        this.gm = str;
        return this;
    }

    public vy pcc(ork orkVar) {
        this.oo = qf.pcc(orkVar);
        return this;
    }

    public vy pcc(boolean z) {
        this.wh = z;
        return this;
    }

    public vy pcc(pcc pccVar) {
        this.sf = pccVar;
        return this;
    }

    public vy() {
    }

    public vy sf(boolean z) {
        this.qf = z;
        return this;
    }
}
