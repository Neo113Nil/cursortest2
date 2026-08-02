package com.bytedance.sdk.openadsdk.common;

import android.os.Handler;
import android.os.Message;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.View;
import android.webkit.WebView;
import com.bytedance.sdk.component.utils.tsz;
import com.bytedance.sdk.openadsdk.core.model.of;
import com.bytedance.sdk.openadsdk.utils.rnn;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.regex.Pattern;
import org.json.JSONObject;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public class vj implements tsz.pcc {
    private boolean dax;
    private boolean gbb;
    private WebView gm;
    private int gpj;
    private int hc;
    private long jr;
    private float kj;
    private String lo;
    private final com.bytedance.sdk.component.vy.qf oo;
    private long ork;
    private final of pcc;
    private final boolean sf;
    private oo vj;
    private int vy;
    private String wh = "landingpage";
    private final Handler qf = new tsz(com.bytedance.sdk.openadsdk.core.jr.sf().getLooper(), this);
    private final AtomicBoolean vh = new AtomicBoolean(false);
    private Pattern tmg = null;
    private long lu = -1;
    private final List<Integer> nac = new ArrayList();

    public vj(of ofVar, com.bytedance.sdk.component.vy.qf qfVar, String str, boolean z) {
        this.pcc = ofVar;
        this.oo = qfVar;
        this.sf = z;
        sf();
    }

    private void kj() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("loading_show_interval", SystemClock.elapsedRealtime() - this.lu);
            jSONObject.put("loading_show_timestamp", this.jr);
            WebView webView = this.gm;
            jSONObject.put("arbi_current_url", webView != null ? webView.getUrl() : "");
        } catch (Throwable unused) {
        }
        com.bytedance.sdk.openadsdk.oo.gm.pcc(this.pcc, this.wh, jSONObject);
    }

    private void oo() {
        Handler handler = this.qf;
        if (handler != null) {
            handler.removeCallbacksAndMessages(null);
        }
    }

    private int qf() {
        try {
            return this.gm.copyBackForwardList().getCurrentIndex() + 1;
        } catch (Throwable unused) {
            return 0;
        }
    }

    private void sf() {
        com.bytedance.sdk.component.vy.qf qfVar = this.oo;
        if (qfVar != null) {
            this.gm = qfVar.getWebView();
            View arbitrageLoadingView = this.oo.getArbitrageLoadingView();
            if (arbitrageLoadingView instanceof oo) {
                this.vj = (oo) arbitrageLoadingView;
            }
        }
        this.vy = com.bytedance.sdk.openadsdk.core.settings.vh.sf().yt();
        this.kj = com.bytedance.sdk.openadsdk.core.settings.vh.sf().qy();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void vj() {
        this.gbb = false;
        if (this.vh.getAndSet(true)) {
            return;
        }
        this.ork = SystemClock.elapsedRealtime();
        this.jr = System.currentTimeMillis();
        kj();
        if (this.vj == null) {
            return;
        }
        WebView webView = this.gm;
        if (webView != null) {
            this.lo = webView.getUrl();
        }
        this.vj.setVisibility(0);
        this.vj.pcc(this.pcc);
        this.vj.pcc();
        this.vj.setAlpha(this.kj);
        this.vj.setOnTouchListener(new View.OnTouchListener() { // from class: com.bytedance.sdk.openadsdk.common.vj.3
            @Override // android.view.View.OnTouchListener
            public boolean onTouch(View view, MotionEvent motionEvent) {
                return true;
            }
        });
        oo();
        gm();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean wh() {
        return qf() > 0 && !this.vh.get();
    }

    public void gm(WebView webView, String str, boolean z) {
        this.nac.clear();
        this.dax = z;
        if (z) {
            this.gbb = true;
        }
        this.gpj = qf();
    }

    public void pcc(WebView webView, int i) {
        oo ooVar = this.vj;
        if (ooVar != null) {
            ooVar.pcc(i);
        }
        if (this.dax) {
            if (pcc(i, 30)) {
                pcc(30, webView);
            }
            if (pcc(i, 50)) {
                pcc(50, webView);
            }
            if (pcc(i, 70)) {
                pcc(70, webView);
            }
        }
        if (this.vj == null || i != 100) {
            return;
        }
        pcc(1);
    }

    private void gm() {
        Handler handler = this.qf;
        if (handler != null) {
            handler.sendEmptyMessageDelayed(1, this.vy);
        }
    }

    public void sf(WebView webView, String str, boolean z) {
        if (!z || this.vj == null) {
            return;
        }
        pcc(1);
    }

    public void pcc(String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        this.wh = str;
    }

    public void pcc(WebView webView, String str, boolean z) {
        if (z && wh()) {
            pcc();
        }
    }

    public void pcc(WebView webView, String str) {
        of ofVar = this.pcc;
        if (ofVar == null || !com.bytedance.sdk.component.vy.sf.pcc(ofVar.qy().gm(), str)) {
            return;
        }
        this.hc++;
        com.bytedance.sdk.component.utils.vy.sf().post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.common.vj.1
            @Override // java.lang.Runnable
            public void run() {
                if (vj.this.wh()) {
                    vj.this.pcc();
                }
            }
        });
    }

    public void pcc() {
        if (rnn.wh()) {
            vj();
        } else {
            com.bytedance.sdk.component.utils.vy.sf().post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.common.vj.2
                @Override // java.lang.Runnable
                public void run() {
                    vj.this.vj();
                }
            });
        }
    }

    private void pcc(final int i) {
        WebView webView = this.gm;
        if (webView != null && i == 1) {
            String url = webView.getUrl();
            if (TextUtils.isEmpty(url) || url.equals(this.lo)) {
                return;
            }
        }
        com.bytedance.sdk.component.utils.vy.sf().post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.common.vj.4
            @Override // java.lang.Runnable
            public void run() {
                if (vj.this.vj != null) {
                    vj.this.vh.set(false);
                    vj.this.vj.pcc(vj.this.pcc, vj.this.wh, i, vj.this.lo, vj.this.ork, vj.this.gbb, vj.this.hc, vj.this.jr);
                    vj.this.hc = 0;
                }
            }
        });
        oo();
    }

    @Override // com.bytedance.sdk.component.utils.tsz.pcc
    public void pcc(Message message) {
        if (message.what == 1) {
            pcc(0);
        }
    }

    public void pcc(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 1) {
            this.lu = SystemClock.elapsedRealtime();
        }
    }

    private boolean pcc(int i, int i2) {
        if (i < i2 || this.nac.contains(Integer.valueOf(i2)) || this.gpj < 2) {
            return false;
        }
        this.nac.add(Integer.valueOf(i2));
        return true;
    }

    private void pcc(int i, WebView webView) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("load_progress", i);
            jSONObject.put("progress_timestamp", System.currentTimeMillis());
            jSONObject.put("arbi_current_url", webView.getUrl());
        } catch (Throwable unused) {
        }
        com.bytedance.sdk.openadsdk.oo.gm.sf(this.pcc, this.wh, jSONObject);
    }
}
