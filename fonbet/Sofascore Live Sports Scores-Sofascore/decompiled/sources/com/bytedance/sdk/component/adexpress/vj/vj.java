package com.bytedance.sdk.component.adexpress.vj;

import android.content.Context;
import android.content.MutableContextWrapper;
import android.text.TextUtils;
import android.webkit.WebView;
import androidx.annotation.Nullable;
import com.bytedance.sdk.component.utils.lo;
import com.bytedance.sdk.component.utils.mk;
import com.bytedance.sdk.component.vy.qf;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public class vj {
    private static int kj = 10;
    private static final byte[] vj = new byte[0];
    private static volatile vj vy = null;
    private static int wh = 10;
    private final AtomicBoolean qf = new AtomicBoolean(false);
    private List<qf> pcc = new ArrayList();
    private List<qf> sf = new ArrayList();
    private Map<Integer, gm> gm = new HashMap();
    private Map<Integer, oo> oo = new HashMap();

    private vj() {
        com.bytedance.sdk.component.adexpress.pcc.pcc.gm gm = com.bytedance.sdk.component.adexpress.pcc.pcc.pcc.pcc().gm();
        if (gm != null) {
            wh = gm.ork();
            kj = gm.vh();
        }
    }

    private void vy(qf qfVar) {
        if (qfVar == null) {
            return;
        }
        if (mk.sf(qfVar.getScene())) {
            mk.pcc(qfVar);
            return;
        }
        if (this.pcc.size() >= wh) {
            try {
                Context context = qfVar.getContext();
                if (context instanceof MutableContextWrapper) {
                    ((MutableContextWrapper) context).setBaseContext(context.getApplicationContext());
                }
                qfVar.jr();
                return;
            } catch (Throwable th) {
                th.getMessage();
                return;
            }
        }
        if (this.pcc.contains(qfVar)) {
            return;
        }
        try {
            Context context2 = qfVar.getContext();
            if (context2 instanceof MutableContextWrapper) {
                ((MutableContextWrapper) context2).setBaseContext(context2.getApplicationContext());
                qfVar.setRecycler(true);
                this.pcc.add(qfVar);
                gm();
            }
        } catch (Throwable th2) {
            gm();
            th2.getMessage();
        }
    }

    public void gm(qf qfVar) {
        if (qfVar == null) {
            return;
        }
        if (mk.sf(qfVar.getScene())) {
            mk.pcc(qfVar);
            return;
        }
        if (this.sf.size() >= kj) {
            try {
                Context context = qfVar.getContext();
                if (context instanceof MutableContextWrapper) {
                    ((MutableContextWrapper) context).setBaseContext(context.getApplicationContext());
                }
                qfVar.jr();
                return;
            } catch (Throwable th) {
                th.getMessage();
                return;
            }
        }
        if (this.sf.contains(qfVar)) {
            return;
        }
        try {
            Context context2 = qfVar.getContext();
            if (context2 instanceof MutableContextWrapper) {
                ((MutableContextWrapper) context2).setBaseContext(context2.getApplicationContext());
                qfVar.setRecycler(true);
                this.sf.add(qfVar);
                oo();
            }
        } catch (Throwable th2) {
            oo();
            th2.getMessage();
        }
    }

    public void kj(qf qfVar) {
        WebView webView;
        gm gmVar;
        lo.pcc("WebViewPool", "updateTTAndroidObject: express jsb recycle webview will not remove javascript interfaceSDK_INJECT_GLOBAL");
        if (qfVar == null || (webView = qfVar.getWebView()) == null || (gmVar = this.gm.get(Integer.valueOf(webView.hashCode()))) == null) {
            return;
        }
        gmVar.pcc(null);
    }

    public void oo(qf qfVar) {
        if (qfVar == null) {
            return;
        }
        mk.gm(qfVar);
        qfVar.b_("SDK_INJECT_GLOBAL");
        qf(qfVar);
        gm(qfVar);
    }

    public void pcc(WebView webView, com.bytedance.sdk.component.pcc.lo loVar, String str) {
        if (webView == null || loVar == null || TextUtils.isEmpty(str)) {
            return;
        }
        oo ooVar = this.oo.get(Integer.valueOf(webView.hashCode()));
        if (ooVar != null) {
            ooVar.pcc(loVar);
        } else {
            ooVar = new oo(loVar);
            this.oo.put(Integer.valueOf(webView.hashCode()), ooVar);
        }
        lo.pcc("WebViewPool", "registerJavascriptInterfaceForJsB2: jsb 3.0 register javascript interface every time".concat(String.valueOf(str)));
        webView.addJavascriptInterface(ooVar, str);
    }

    public void qf(qf qfVar) {
        WebView webView;
        if (qfVar == null || (webView = qfVar.getWebView()) == null) {
            return;
        }
        gm gmVar = this.gm.get(Integer.valueOf(webView.hashCode()));
        if (gmVar != null) {
            gmVar.pcc(null);
        }
        lo.pcc("WebViewPool", "unRegisterJavascriptInterface: express jsb recycle webview will remove javascript interfaceSDK_INJECT_GLOBAL");
        qfVar.b_("SDK_INJECT_GLOBAL");
    }

    public void sf() {
        for (qf qfVar : this.pcc) {
            if (qfVar != null) {
                try {
                    Context context = qfVar.getContext();
                    if (context instanceof MutableContextWrapper) {
                        ((MutableContextWrapper) context).setBaseContext(context.getApplicationContext());
                    }
                    qfVar.jr();
                } catch (Throwable th) {
                    th.getMessage();
                }
            }
        }
        this.pcc.clear();
        for (qf qfVar2 : this.sf) {
            if (qfVar2 != null) {
                try {
                    Context context2 = qfVar2.getContext();
                    if (context2 instanceof MutableContextWrapper) {
                        ((MutableContextWrapper) context2).setBaseContext(context2.getApplicationContext());
                    }
                    qfVar2.jr();
                } catch (Throwable th2) {
                    th2.getMessage();
                }
            }
        }
        this.sf.clear();
    }

    public void vj(qf qfVar) {
        if (qfVar == null) {
            return;
        }
        mk.gm(qfVar);
        qfVar.b_("SDK_INJECT_GLOBAL");
        qf(qfVar);
        vy(qfVar);
    }

    public boolean wh(qf qfVar) {
        if (qfVar == null) {
            return false;
        }
        try {
            Context context = qfVar.getContext();
            if (context instanceof MutableContextWrapper) {
                ((MutableContextWrapper) context).setBaseContext(context.getApplicationContext());
            }
            qfVar.jr();
            return true;
        } catch (Throwable th) {
            th.getMessage();
            return true;
        }
    }

    public int oo() {
        return this.sf.size();
    }

    public qf pcc(Context context, String str) {
        qf.gm gmVar = qf.gm.ADS_V4;
        if (!mk.sf(gmVar)) {
            return null;
        }
        if (!com.bytedance.sdk.component.adexpress.oo.vj.pcc(str) || mk.pcc(gmVar) > 1) {
            return mk.pcc(context, null, 0, gmVar);
        }
        return null;
    }

    public void pcc(qf qfVar) {
        if (qfVar == null) {
            return;
        }
        mk.gm(qfVar);
        qfVar.b_("SDK_INJECT_GLOBAL");
        qf(qfVar);
        if (mk.sf(qfVar.getScene())) {
            mk.pcc(qfVar);
            return;
        }
        try {
            Context context = qfVar.getContext();
            if (context instanceof MutableContextWrapper) {
                ((MutableContextWrapper) context).setBaseContext(context.getApplicationContext());
            }
            qfVar.jr();
        } catch (Throwable th) {
            th.getMessage();
        }
    }

    public void pcc(qf qfVar, sf sfVar) {
        WebView webView;
        if (qfVar == null || sfVar == null || (webView = qfVar.getWebView()) == null) {
            return;
        }
        gm gmVar = this.gm.get(Integer.valueOf(webView.hashCode()));
        if (gmVar != null) {
            gmVar.pcc(sfVar);
        } else {
            gmVar = new gm(sfVar);
            this.gm.put(Integer.valueOf(webView.hashCode()), gmVar);
        }
        lo.pcc("WebViewPool", "registerJavascriptInterface: express jsb recycle webview will register javascript interface every timeSDK_INJECT_GLOBAL");
        qfVar.pcc(gmVar, "SDK_INJECT_GLOBAL");
    }

    public static vj pcc() {
        if (vy == null) {
            synchronized (vj.class) {
                try {
                    if (vy == null) {
                        vy = new vj();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return vy;
    }

    public void pcc(WebView webView, String str) {
        lo.pcc("WebViewPool", "unRegisterJavascriptInterfaceForJsB2: jsb 3.0 recycle webview will remove javascript interface".concat(String.valueOf(str)));
        if (webView == null || TextUtils.isEmpty(str)) {
            return;
        }
        oo ooVar = this.oo.get(Integer.valueOf(webView.hashCode()));
        if (ooVar != null) {
            ooVar.pcc(null);
        }
        webView.removeJavascriptInterface(str);
    }

    @Nullable
    public qf gm(Context context, String str) {
        qf.gm gmVar = qf.gm.ADS;
        if (mk.sf(gmVar)) {
            if (!com.bytedance.sdk.component.adexpress.oo.vj.pcc(str) || mk.pcc(gmVar) > 1) {
                return mk.pcc(context, null, 0, gmVar);
            }
            return null;
        }
        if (gm() <= 0) {
            return null;
        }
        if (com.bytedance.sdk.component.adexpress.oo.vj.pcc(str) && gm() <= 1) {
            gm();
            return null;
        }
        qf remove = this.pcc.remove(0);
        if (remove == null) {
            return null;
        }
        try {
            Context context2 = remove.getContext();
            if (context2 instanceof MutableContextWrapper) {
                ((MutableContextWrapper) context2).setBaseContext(context.getApplicationContext());
                remove.setRecycler(false);
                gm();
            }
            return remove;
        } catch (Throwable unused) {
            gm();
            return null;
        }
    }

    public void pcc(int i) {
        synchronized (vj) {
            wh = i;
        }
    }

    @Nullable
    public qf sf(Context context, String str) {
        qf.gm gmVar = qf.gm.ADS_V3;
        if (mk.sf(gmVar)) {
            if (!com.bytedance.sdk.component.adexpress.oo.vj.pcc(str) || mk.pcc(gmVar) > 1) {
                return mk.pcc(context, null, 0, gmVar);
            }
            return null;
        }
        if (oo() <= 0) {
            return null;
        }
        if (com.bytedance.sdk.component.adexpress.oo.vj.pcc(str) && oo() <= 1) {
            oo();
            return null;
        }
        qf remove = this.sf.remove(0);
        if (remove == null) {
            return null;
        }
        try {
            Context context2 = remove.getContext();
            if (context2 instanceof MutableContextWrapper) {
                ((MutableContextWrapper) context2).setBaseContext(context.getApplicationContext());
                remove.setRecycler(false);
                oo();
            }
            return remove;
        } catch (Throwable unused) {
            oo();
            return null;
        }
    }

    public int gm() {
        return this.pcc.size();
    }

    public void sf(qf qfVar) {
        if (qfVar == null) {
            return;
        }
        mk.oo(qfVar);
        kj(qfVar);
        if (mk.sf(qfVar.getScene())) {
            mk.sf(qfVar);
            return;
        }
        try {
            Context context = qfVar.getContext();
            if (context instanceof MutableContextWrapper) {
                ((MutableContextWrapper) context).setBaseContext(context.getApplicationContext());
            }
            qfVar.jr();
        } catch (Throwable th) {
            th.getMessage();
        }
    }

    public void sf(qf qfVar, sf sfVar) {
        WebView webView;
        if (qfVar == null || sfVar == null || (webView = qfVar.getWebView()) == null) {
            return;
        }
        gm gmVar = this.gm.get(Integer.valueOf(webView.hashCode()));
        if (gmVar != null) {
            lo.pcc("WebViewPool", "registerOnceJavascriptInterface: express jsb recycle webview will not register javascript interface in reuse webviewSDK_INJECT_GLOBAL");
            gmVar.pcc(sfVar);
        } else {
            gm gmVar2 = new gm(sfVar);
            this.gm.put(Integer.valueOf(webView.hashCode()), gmVar2);
            lo.pcc("WebViewPool", "registerOnceJavascriptInterface: express jsb recycle webview will register once javascript interfaceSDK_INJECT_GLOBAL");
            qfVar.pcc(gmVar2, "SDK_INJECT_GLOBAL");
        }
    }

    public void sf(WebView webView, com.bytedance.sdk.component.pcc.lo loVar, String str) {
        if (webView == null || loVar == null || TextUtils.isEmpty(str)) {
            return;
        }
        oo ooVar = this.oo.get(Integer.valueOf(webView.hashCode()));
        if (ooVar != null) {
            lo.pcc("WebViewPool", "registerOnceJavascriptInterfaceForJsB2: jsb 3.0 will not register javascript interface in reuse webview".concat(String.valueOf(str)));
            ooVar.pcc(loVar);
        } else {
            lo.pcc("WebViewPool", "registerOnceJavascriptInterfaceForJsB2: jsb 3.0 register once javascript interface in created webview".concat(String.valueOf(str)));
            oo ooVar2 = new oo(loVar);
            this.oo.put(Integer.valueOf(webView.hashCode()), ooVar2);
            webView.addJavascriptInterface(ooVar2, str);
        }
    }

    public void sf(WebView webView, String str) {
        oo ooVar;
        lo.pcc("WebViewPool", "updateWebViewBridge: jsb 3.0 recycle webview will not remove javascript interface".concat(String.valueOf(str)));
        if (webView == null || TextUtils.isEmpty(str) || (ooVar = this.oo.get(Integer.valueOf(webView.hashCode()))) == null) {
            return;
        }
        ooVar.pcc(null);
    }

    public void sf(int i) {
        synchronized (vj) {
            kj = i;
        }
    }
}
