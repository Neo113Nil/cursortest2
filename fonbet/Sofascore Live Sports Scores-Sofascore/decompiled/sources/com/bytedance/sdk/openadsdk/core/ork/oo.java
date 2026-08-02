package com.bytedance.sdk.openadsdk.core.ork;

import android.view.ViewGroup;
import androidx.annotation.Nullable;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import java.util.ArrayList;
import java.util.List;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public class oo {
    private static volatile oo gm;
    private static int sf;
    private final List<wh> pcc = new ArrayList();

    public static oo pcc() {
        if (gm == null) {
            synchronized (oo.class) {
                try {
                    if (gm == null) {
                        gm = new oo();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return gm;
    }

    public void gm(wh whVar) {
        if (whVar == null || whVar.getWebView() == null) {
            return;
        }
        if (whVar.getParent() != null) {
            ((ViewGroup) whVar.getParent()).removeView(whVar);
        }
        try {
            whVar.removeAllViews();
            whVar.qf();
            whVar.setWebChromeClient(null);
            whVar.setWebViewClient(null);
            whVar.setDownloadListener(null);
            whVar.setDefaultTextEncodingName(C.UTF8_NAME);
            whVar.setAllowFileAccess(false);
            whVar.setJavaScriptEnabled(true);
            whVar.setCacheMode(-1);
            whVar.setDatabaseEnabled(true);
            whVar.setSupportZoom(false);
            whVar.getWebView().setLayerType(0, null);
            whVar.setBackgroundColor(0);
            whVar.getWebView().setHorizontalScrollBarEnabled(false);
            whVar.getWebView().setHorizontalScrollbarOverlay(false);
            whVar.getWebView().setVerticalScrollBarEnabled(false);
            whVar.getWebView().setVerticalScrollbarOverlay(false);
            com.bytedance.sdk.openadsdk.core.widget.pcc.oo.pcc(whVar);
            whVar.hc();
            whVar.setMixedContentMode(0);
        } catch (Exception unused) {
        }
    }

    public void sf(wh whVar) {
        if (whVar != null) {
            if (this.pcc.size() >= sf) {
                whVar.jr();
            } else {
                if (this.pcc.contains(whVar)) {
                    return;
                }
                gm(whVar);
                this.pcc.add(whVar);
            }
        }
    }

    public void pcc(wh whVar) {
        if (whVar != null) {
            sf(whVar);
        }
    }

    @Nullable
    public wh sf() {
        wh remove;
        if (gm() > 0 && (remove = this.pcc.remove(0)) != null) {
            return remove;
        }
        return null;
    }

    public int gm() {
        return this.pcc.size();
    }
}
