package com.bytedance.sdk.openadsdk.core.widget.pcc;

import android.content.MutableContextWrapper;
import android.net.Uri;
import android.os.MessageQueue;
import android.text.TextUtils;
import android.webkit.RenderProcessGoneDetail;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.bytedance.sdk.component.vy.qf;
import com.bytedance.sdk.openadsdk.BuildConfig;
import com.bytedance.sdk.openadsdk.core.lu;
import com.bytedance.sdk.openadsdk.core.mu;
import com.bytedance.sdk.openadsdk.utils.lo;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public class gm implements sf {
    private final AtomicInteger gm;
    private final MessageQueue oo;
    mu pcc;
    private com.bytedance.sdk.component.vy.qf sf;
    private final boolean vj;

    public gm(int i, boolean z, MessageQueue messageQueue) {
        this.gm = new AtomicInteger(i);
        this.vj = z;
        this.oo = messageQueue;
    }

    private void pcc(com.bytedance.sdk.component.vy.qf qfVar) {
        if (qfVar == null || qfVar.getWebView() == null) {
            return;
        }
        try {
            oo.pcc(lu.pcc()).pcc(false).pcc(qfVar.getWebView());
            qfVar.setVerticalScrollBarEnabled(false);
            qfVar.setHorizontalScrollBarEnabled(false);
            oo.pcc(qfVar);
            qfVar.hc();
            qfVar.setUserAgentString(lo.pcc(qfVar.getWebView(), BuildConfig.VERSION_CODE));
            qfVar.setMixedContentMode(0);
            qfVar.setJavaScriptEnabled(true);
            qfVar.setJavaScriptCanOpenWindowsAutomatically(true);
            qfVar.setDomStorageEnabled(true);
            qfVar.setDatabaseEnabled(true);
            qfVar.setCacheMode(-1);
            qfVar.setAllowFileAccess(false);
            qfVar.setSupportZoom(true);
            qfVar.setBuiltInZoomControls(true);
            qfVar.setLayoutAlgorithm(WebSettings.LayoutAlgorithm.NARROW_COLUMNS);
            qfVar.setUseWideViewPort(true);
        } catch (Throwable th) {
            com.bytedance.sdk.component.utils.lo.gm("WebViewPool", th.toString());
        }
    }

    public void sf() {
        if (this.gm.get() <= 0) {
            return;
        }
        Objects.toString(this.gm);
        String oo = com.bytedance.sdk.component.adexpress.pcc.sf.sf.oo(null);
        if (this.vj) {
            String oo2 = com.bytedance.sdk.component.adexpress.pcc.sf.sf.oo("v3");
            if (oo != null && oo.equals(oo2)) {
                return;
            } else {
                oo = oo2;
            }
        }
        if (TextUtils.isEmpty(oo)) {
            return;
        }
        try {
            com.bytedance.sdk.component.vy.qf qfVar = new com.bytedance.sdk.component.vy.qf(new MutableContextWrapper(lu.pcc()), this.vj ? qf.gm.ADS_V3 : qf.gm.ADS);
            this.sf = qfVar;
            if (qfVar.getWebView() == null) {
                return;
            }
            this.sf.setWebViewClient(new WebViewClient() { // from class: com.bytedance.sdk.openadsdk.core.widget.pcc.gm.1
                @Override // android.webkit.WebViewClient
                public boolean onRenderProcessGone(WebView webView, RenderProcessGoneDetail renderProcessGoneDetail) {
                    return true;
                }
            });
            pcc(this.sf);
            Uri build = Uri.parse(oo).buildUpon().appendQueryParameter("isPreLoad", "1").build();
            mu muVar = new mu(this.sf.getContext());
            this.pcc = muVar;
            muVar.sf(this.sf).pcc(this).pcc(this.sf);
            com.bytedance.sdk.component.adexpress.vj.vj.pcc().pcc(this.sf, this.pcc);
            this.sf.a_(build.toString());
        } catch (Exception unused) {
        }
    }

    @Override // com.bytedance.sdk.openadsdk.core.widget.pcc.sf
    public void pcc() {
        MessageQueue messageQueue;
        if (this.vj) {
            com.bytedance.sdk.component.adexpress.vj.vj.pcc().oo(this.sf);
        } else {
            com.bytedance.sdk.component.adexpress.vj.vj.pcc().vj(this.sf);
        }
        try {
            this.gm.get();
            this.gm.decrementAndGet();
            if (this.gm.get() <= 0 || (messageQueue = this.oo) == null) {
                return;
            }
            messageQueue.addIdleHandler(new MessageQueue.IdleHandler() { // from class: com.bytedance.sdk.openadsdk.core.widget.pcc.gm.2
                @Override // android.os.MessageQueue.IdleHandler
                public boolean queueIdle() {
                    new gm(gm.this.gm.get(), gm.this.vj, gm.this.oo).sf();
                    return false;
                }
            });
        } catch (Exception e) {
            e.getMessage();
        }
    }
}
