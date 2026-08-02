package com.bytedance.sdk.openadsdk.core.ork;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.text.TextUtils;
import android.util.TypedValue;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import com.appsflyer.internal.i;
import com.appsflyer.sdk_base.referrer.Payload;
import com.bytedance.sdk.component.adexpress.oo.vy;
import com.bytedance.sdk.openadsdk.CacheDirFactory;
import com.bytedance.sdk.openadsdk.core.model.of;
import com.bytedance.sdk.openadsdk.core.model.zti;
import com.bytedance.sdk.openadsdk.core.mu;
import com.ironsource.C4427z5;
import com.mbridge.msdk.foundation.download.Command;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import com.unity3d.services.core.network.model.HttpRequest;
import defpackage.p03;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import org.json.JSONArray;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public class vh extends com.bytedance.sdk.openadsdk.core.widget.pcc.wh {
    private static final byte[] tmg = {-119, 80, 78, 71, 13, 10, 26, 10, 0, 0, 0, 13, 73, 72, 68, 82, 0, 0, 0, 1, 0, 0, 0, 1, 8, 6, 0, 0, 0, 31, 21, -60, -119, 0, 0, 0, 10, 73, 68, 65, 84, 120, -100, 99, 96, 96, 96, 96, 0, 0, 0, 3, 0, 1, -2, 60, -79, 0, 0, 0, 0, 73, 69, 78, 68, -82, 66, 96, -126};
    private com.bytedance.sdk.component.adexpress.sf.hc ork;
    public ArrayList<Integer> pcc;
    private final com.bytedance.sdk.openadsdk.core.model.of sf;
    private boolean vh;

    public vh(Context context, mu muVar, com.bytedance.sdk.openadsdk.core.model.of ofVar, com.bytedance.sdk.openadsdk.oo.hc hcVar, com.bytedance.sdk.component.adexpress.sf.hc hcVar2) {
        super(context, muVar, ofVar.esn(), hcVar, false);
        this.vh = false;
        this.pcc = new ArrayList<>();
        this.sf = ofVar;
        this.ork = hcVar2;
        this.vh = com.bytedance.sdk.openadsdk.yt.vj.pcc("inject_data_normal_open", 0) == 1;
    }

    private com.bytedance.sdk.component.adexpress.pcc.sf.pcc gm(String str, vy.pcc pccVar) {
        zti.pcc wh;
        JSONArray gm;
        zti uae = this.sf.uae();
        if (uae == null || (wh = uae.wh()) == null || (gm = wh.gm()) == null || gm.length() <= 0) {
            return null;
        }
        return pcc(gm, str, pccVar);
    }

    private String oo() {
        com.bytedance.sdk.openadsdk.core.model.of ofVar = this.sf;
        if (ofVar == null) {
            return null;
        }
        of.pcc kx = ofVar.kx();
        com.bytedance.sdk.openadsdk.core.model.of ofVar2 = this.sf;
        if (kx != null) {
            return ofVar2.kx().vh();
        }
        if (ofVar2.uae() != null) {
            return "v3";
        }
        return null;
    }

    private com.bytedance.sdk.component.adexpress.pcc.sf.pcc pcc(WebView webView, String str) {
        com.bytedance.sdk.openadsdk.core.model.lu luVar = null;
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        if (str.equals("local://pag_open_icon_id") || str.equals(com.bytedance.sdk.openadsdk.core.ork.sf.gm.pcc)) {
            com.bytedance.sdk.component.adexpress.pcc.sf.pcc pccVar = new com.bytedance.sdk.component.adexpress.pcc.sf.pcc();
            pccVar.pcc(5);
            pccVar.pcc(vj());
            return pccVar;
        }
        of.pcc kx = this.sf.kx();
        if (kx != null && !TextUtils.isEmpty(str) && str.equals(kx.sf())) {
            com.bytedance.sdk.component.adexpress.pcc.sf.pcc pccVar2 = new com.bytedance.sdk.component.adexpress.pcc.sf.pcc();
            pccVar2.pcc(5);
            WebResourceResponse vj = vj(str);
            pccVar2.pcc(vj);
            com.bytedance.sdk.openadsdk.core.vj.pcc.pcc().pcc(vj != null);
            return pccVar2;
        }
        vy.pcc pcc = com.bytedance.sdk.component.adexpress.oo.vy.pcc(str);
        if (jr.sf(this.sf)) {
            com.bytedance.sdk.component.adexpress.pcc.sf.pcc pcc2 = pcc(str, pcc);
            if (pcc2 != null) {
                return pcc2;
            }
            com.bytedance.sdk.component.adexpress.pcc.sf.pcc sf = sf(str, pcc);
            if (sf != null) {
                return sf;
            }
            com.bytedance.sdk.component.adexpress.pcc.sf.pcc gm = gm(str, pcc);
            if (gm != null) {
                return gm;
            }
        }
        if (pcc != vy.pcc.IMAGE) {
            Iterator<com.bytedance.sdk.openadsdk.core.model.lu> it = this.sf.by().iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                com.bytedance.sdk.openadsdk.core.model.lu next = it.next();
                if (!TextUtils.isEmpty(next.pcc()) && !TextUtils.isEmpty(str)) {
                    String pcc3 = next.pcc();
                    if (pcc3.startsWith(HttpRequest.DEFAULT_SCHEME)) {
                        pcc3 = pcc3.replaceFirst(HttpRequest.DEFAULT_SCHEME, "http");
                    }
                    if ((str.startsWith(HttpRequest.DEFAULT_SCHEME) ? str.replaceFirst(HttpRequest.DEFAULT_SCHEME, "http") : str).equals(pcc3)) {
                        luVar = next;
                        break;
                    }
                }
            }
        }
        if (pcc != vy.pcc.IMAGE && luVar == null) {
            return com.bytedance.sdk.component.adexpress.pcc.sf.sf.pcc(str, pcc, "", oo());
        }
        com.bytedance.sdk.component.adexpress.pcc.sf.pcc pccVar3 = new com.bytedance.sdk.component.adexpress.pcc.sf.pcc();
        pccVar3.pcc(5);
        pccVar3.pcc(pcc(str, com.bytedance.sdk.openadsdk.core.ork.sf.gm.pcc(this.sf, str)));
        return pccVar3;
    }

    private WebResourceResponse sf(File file, vy.pcc pccVar, Map<String, String> map) {
        long j;
        long j2;
        long[] pcc;
        long length = file.length();
        long j3 = length - 1;
        if (map == null || map.isEmpty() || (pcc = com.bytedance.sdk.openadsdk.core.ork.sf.sf.pcc(map.get(Command.HTTP_HEADER_RANGE), length)) == null || pcc.length != 2) {
            j = j3;
            j2 = 0;
        } else {
            j2 = pcc[0];
            j = pcc[1];
        }
        HashMap l = i.l("Accept-Ranges", "bytes");
        l.put("Content-Range", String.format("bytes %d-%d/%d", Long.valueOf(j2), Long.valueOf(j), Long.valueOf(length)));
        l.toString();
        WebResourceResponse webResourceResponse = new WebResourceResponse(null, null, null);
        if (webResourceResponse.getResponseHeaders() != null) {
            webResourceResponse.getResponseHeaders().clear();
        }
        webResourceResponse.setResponseHeaders(l);
        webResourceResponse.setStatusCodeAndReasonPhrase(206, "Partial Content");
        webResourceResponse.setMimeType(pccVar.pcc());
        webResourceResponse.setEncoding(C.UTF8_NAME);
        try {
            webResourceResponse.setData(new FileInputStream(file));
            return webResourceResponse;
        } catch (IOException e) {
            e.getMessage();
            return webResourceResponse;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:11:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x004b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private WebResourceResponse vj() {
        InputStream openRawResource;
        int vy = com.bytedance.sdk.openadsdk.core.ork.sf().vy();
        if (vy == 0) {
            return null;
        }
        Resources resources = com.bytedance.sdk.openadsdk.core.lu.pcc().getResources();
        if (resources != null) {
            try {
                TypedValue typedValue = new TypedValue();
                resources.getValueForDensity(vy, 0, typedValue, true);
                CharSequence charSequence = typedValue.string;
                openRawResource = (charSequence == null || !charSequence.toString().endsWith(".xml")) ? resources.openRawResource(vy) : new ByteArrayInputStream(tmg);
            } catch (Resources.NotFoundException e) {
                com.bytedance.sdk.component.utils.lo.gm("ExpressClient", e.toString());
            }
            if (openRawResource == null) {
                return new WebResourceResponse(vy.pcc.IMAGE.pcc(), C.UTF8_NAME, openRawResource);
            }
            return null;
        }
        openRawResource = null;
        if (openRawResource == null) {
        }
    }

    @Override // com.bytedance.sdk.openadsdk.core.widget.pcc.wh, android.webkit.WebViewClient
    public void onPageFinished(WebView webView, String str) {
        this.qf = false;
        super.onPageFinished(webView, str);
    }

    @Override // com.bytedance.sdk.openadsdk.core.widget.pcc.wh, android.webkit.WebViewClient
    public void onPageStarted(WebView webView, String str, Bitmap bitmap) {
        this.kj = false;
        super.onPageStarted(webView, str, bitmap);
        com.bytedance.sdk.component.adexpress.sf.hc hcVar = this.ork;
        if (hcVar != null && hcVar.of() && this.vh) {
            com.bytedance.sdk.component.utils.gbb.pcc(webView, "javascript:window.SDK_INJECT_DATA=" + this.ork.gm());
        }
    }

    @Override // com.bytedance.sdk.openadsdk.core.widget.pcc.wh, android.webkit.WebViewClient
    public WebResourceResponse shouldInterceptRequest(WebView webView, WebResourceRequest webResourceRequest) {
        com.bytedance.sdk.component.adexpress.pcc.sf.pcc pcc;
        try {
            String uri = webResourceRequest.getUrl().toString();
            vy.pcc pcc2 = com.bytedance.sdk.component.adexpress.oo.vy.pcc(uri);
            if (pcc2 == vy.pcc.VIDEO && com.bytedance.sdk.openadsdk.component.reward.gm.kj.pcc(this.sf) && com.bytedance.sdk.openadsdk.component.reward.gm.kj.wh() && (pcc = pcc(uri, pcc2, webResourceRequest.getRequestHeaders())) != null && pcc.pcc() != null) {
                return pcc.pcc();
            }
            webResourceRequest.getUrl().toString();
            webResourceRequest.getRequestHeaders().get(Command.HTTP_HEADER_RANGE);
            return shouldInterceptRequest(webView, uri);
        } catch (Throwable th) {
            com.bytedance.sdk.component.utils.lo.pcc("ExpressClient", "shouldInterceptRequest error1", th);
            return super.shouldInterceptRequest(webView, webResourceRequest);
        }
    }

    private WebResourceResponse oo(String str, vy.pcc pccVar) {
        InputStream sf;
        if (TextUtils.isEmpty(str) || (sf = jr.sf(str)) == null) {
            return null;
        }
        WebResourceResponse webResourceResponse = new WebResourceResponse(pccVar.pcc(), C.UTF8_NAME, sf);
        pcc(webResourceResponse);
        return webResourceResponse;
    }

    private WebResourceResponse vj(String str) {
        InputStream pcc;
        if (TextUtils.isEmpty(str) || (pcc = com.bytedance.sdk.openadsdk.core.vj.pcc.pcc().pcc(str)) == null) {
            return null;
        }
        WebResourceResponse webResourceResponse = new WebResourceResponse("audio/*", C.UTF8_NAME, pcc);
        pcc(webResourceResponse);
        return webResourceResponse;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(13:0|1|2|(2:4|(8:6|7|8|9|(1:13)|(2:17|18)|21|22))|27|7|8|9|(2:11|13)|(3:15|17|18)|21|22|(1:(0))) */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x003c, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x004b, code lost:
    
        com.bytedance.sdk.component.utils.lo.pcc("ExpressClient", "shouldInterceptRequest error2", r0);
     */
    @Override // com.bytedance.sdk.openadsdk.core.widget.pcc.wh, android.webkit.WebViewClient
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public WebResourceResponse shouldInterceptRequest(WebView webView, String str) {
        vh vhVar;
        String str2;
        long currentTimeMillis;
        com.bytedance.sdk.component.adexpress.pcc.sf.pcc pcc;
        long currentTimeMillis2;
        int i;
        try {
            currentTimeMillis = System.currentTimeMillis();
            pcc = pcc(webView, str);
            currentTimeMillis2 = System.currentTimeMillis();
        } catch (Throwable th) {
            th = th;
            vhVar = this;
            str2 = str;
        }
        if (pcc != null) {
            if (pcc.pcc() != null) {
                i = 1;
                str2 = str;
                int i2 = i;
                vhVar = this;
                vhVar.pcc(currentTimeMillis, currentTimeMillis2, str2, i2);
                if (pcc != null && pcc.sf() != 5) {
                    pcc.sf();
                    vhVar.pcc.add(Integer.valueOf(pcc.sf()));
                }
                if (pcc != null && pcc.pcc() != null) {
                    return pcc.pcc();
                }
                return super.shouldInterceptRequest(webView, str2);
            }
        }
        i = 2;
        str2 = str;
        int i22 = i;
        vhVar = this;
        vhVar.pcc(currentTimeMillis, currentTimeMillis2, str2, i22);
        if (pcc != null) {
            pcc.sf();
            vhVar.pcc.add(Integer.valueOf(pcc.sf()));
        }
        if (pcc != null) {
            return pcc.pcc();
        }
        return super.shouldInterceptRequest(webView, str2);
    }

    private boolean sf(Map<String, String> map) {
        String str;
        return (map == null || map.isEmpty() || (str = map.get(Command.HTTP_HEADER_RANGE)) == null || !str.startsWith("bytes=")) ? false : true;
    }

    private WebResourceResponse sf(String str, vy.pcc pccVar, Map<String, String> map) {
        com.bytedance.sdk.openadsdk.core.model.of ofVar = this.sf;
        if (ofVar != null && ofVar.kez() != null) {
            File file = new File(((p03) CacheDirFactory.getICacheDir(this.sf.we())).u(), str);
            if (file.exists() && file.length() > 0) {
                try {
                    return pcc(file, pccVar, map);
                } catch (Throwable th) {
                    th.getMessage();
                }
            }
        }
        return null;
    }

    private com.bytedance.sdk.component.adexpress.pcc.sf.pcc sf(String str, vy.pcc pccVar) {
        zti.pcc wh;
        JSONArray sf;
        zti uae = this.sf.uae();
        if (uae == null || (wh = uae.wh()) == null || (sf = wh.sf()) == null || sf.length() <= 0) {
            return null;
        }
        return pcc(sf, str, pccVar);
    }

    public int pcc() {
        Iterator<Integer> it = this.pcc.iterator();
        while (it.hasNext()) {
            Integer next = it.next();
            if (next.intValue() == 3 || next.intValue() == 2 || next.intValue() == -1) {
                return next.intValue();
            }
        }
        return TextUtils.isEmpty(oo()) ? -1 : 1;
    }

    private com.bytedance.sdk.component.adexpress.pcc.sf.pcc pcc(String str, vy.pcc pccVar, Map<String, String> map) {
        com.bytedance.sdk.openadsdk.core.model.of ofVar = this.sf;
        if (ofVar == null || ofVar.kez() == null || !TextUtils.equals(this.sf.kez().g, str)) {
            return null;
        }
        com.bytedance.sdk.component.adexpress.pcc.sf.pcc pccVar2 = new com.bytedance.sdk.component.adexpress.pcc.sf.pcc();
        pccVar2.pcc(5);
        WebResourceResponse sf = sf(this.sf.kez().a(), pccVar, map);
        if (sf == null) {
            com.bytedance.sdk.openadsdk.component.reward.gm.kj.pcc(0, str, this.sf, map);
            return null;
        }
        pccVar2.pcc(sf);
        com.bytedance.sdk.openadsdk.component.reward.gm.kj.pcc(1, str, this.sf, map);
        return pccVar2;
    }

    private WebResourceResponse pcc(File file, vy.pcc pccVar, Map<String, String> map) {
        if (sf(map)) {
            return sf(file, pccVar, map);
        }
        try {
            FileInputStream fileInputStream = new FileInputStream(file);
            HashMap hashMap = new HashMap();
            long length = file.length();
            hashMap.put("Accept-Ranges", "bytes");
            hashMap.put("Content-Range", String.format("bytes 0-%d/%d", Long.valueOf(length - 1), Long.valueOf(length)));
            WebResourceResponse webResourceResponse = new WebResourceResponse(null, null, null);
            webResourceResponse.setResponseHeaders(map);
            webResourceResponse.setEncoding(C4427z5.O);
            webResourceResponse.setData(fileInputStream);
            webResourceResponse.setStatusCodeAndReasonPhrase(200, Payload.RESPONSE_OK);
            return webResourceResponse;
        } catch (Throwable th) {
            th.getMessage();
            return null;
        }
    }

    private com.bytedance.sdk.component.adexpress.pcc.sf.pcc pcc(String str, vy.pcc pccVar) {
        zti.pcc wh;
        JSONArray pcc;
        zti uae = this.sf.uae();
        if (uae != null && (wh = uae.wh()) != null && (pcc = wh.pcc()) != null && pcc.length() > 0) {
            for (int i = 0; i < pcc.length(); i++) {
                if (TextUtils.equals(com.bytedance.sdk.openadsdk.core.hc.oo.pcc(com.bytedance.sdk.openadsdk.core.settings.vh.sf().gpj(), pcc.optString(i)), str) && pccVar == vy.pcc.IMAGE) {
                    com.bytedance.sdk.component.adexpress.pcc.sf.pcc pccVar2 = new com.bytedance.sdk.component.adexpress.pcc.sf.pcc();
                    pccVar2.pcc(5);
                    pccVar2.pcc(pcc(str, com.bytedance.sdk.component.utils.vj.pcc(str)));
                    return pccVar2;
                }
            }
        }
        return null;
    }

    private com.bytedance.sdk.component.adexpress.pcc.sf.pcc pcc(JSONArray jSONArray, String str, vy.pcc pccVar) {
        if (jSONArray != null && jSONArray.length() > 0) {
            for (int i = 0; i < jSONArray.length(); i++) {
                if (TextUtils.equals(com.bytedance.sdk.openadsdk.core.hc.oo.pcc(com.bytedance.sdk.openadsdk.core.settings.vh.sf().gpj(), jSONArray.optString(i)), str)) {
                    com.bytedance.sdk.component.adexpress.pcc.sf.pcc pccVar2 = new com.bytedance.sdk.component.adexpress.pcc.sf.pcc();
                    pccVar2.pcc(5);
                    pccVar2.pcc(oo(str, pccVar));
                    return pccVar2;
                }
            }
        }
        return null;
    }

    private WebResourceResponse pcc(String str, String str2) {
        WebResourceResponse webResourceResponse = null;
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        try {
            InputStream pcc = com.bytedance.sdk.openadsdk.ork.oo.pcc(str, str2);
            if (pcc == null) {
                return null;
            }
            WebResourceResponse webResourceResponse2 = new WebResourceResponse(vy.pcc.IMAGE.pcc(), C4427z5.O, pcc);
            try {
                pcc(webResourceResponse2);
                return webResourceResponse2;
            } catch (Throwable th) {
                th = th;
                webResourceResponse = webResourceResponse2;
                com.bytedance.sdk.component.utils.lo.pcc("ExpressClient", "get image WebResourceResponse error", th);
                return webResourceResponse;
            }
        } catch (Throwable th2) {
            th = th2;
        }
    }

    private void pcc(long j, long j2, String str, int i) {
        com.bytedance.sdk.openadsdk.oo.hc hcVar = this.wh;
        if (hcVar == null || hcVar.sf() == null) {
            return;
        }
        vy.pcc pcc = com.bytedance.sdk.component.adexpress.oo.vy.pcc(str);
        if (pcc == vy.pcc.HTML) {
            this.wh.sf().pcc(str, j, j2, i);
        } else if (pcc == vy.pcc.JS) {
            this.wh.sf().sf(str, j, j2, i);
        }
    }

    private void pcc(WebResourceResponse webResourceResponse) {
        if (webResourceResponse == null) {
            return;
        }
        HashMap hashMap = new HashMap();
        hashMap.put("Access-Control-Allow-Origin", "*");
        webResourceResponse.setResponseHeaders(hashMap);
    }
}
