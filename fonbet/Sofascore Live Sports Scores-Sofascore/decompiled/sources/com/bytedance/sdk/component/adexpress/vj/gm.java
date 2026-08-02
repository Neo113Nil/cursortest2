package com.bytedance.sdk.component.adexpress.vj;

import android.webkit.JavascriptInterface;
import java.lang.ref.WeakReference;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public class gm {
    private WeakReference<sf> pcc;

    public gm(sf sfVar) {
        this.pcc = new WeakReference<>(sfVar);
    }

    @JavascriptInterface
    public void adAnalysisData(String str) {
        WeakReference<sf> weakReference = this.pcc;
        if (weakReference == null || weakReference.get() == null) {
            return;
        }
        this.pcc.get();
    }

    @JavascriptInterface
    public String adInfo() {
        WeakReference<sf> weakReference = this.pcc;
        return (weakReference == null || weakReference.get() == null) ? "" : this.pcc.get().adInfo();
    }

    @JavascriptInterface
    public String appInfo() {
        WeakReference<sf> weakReference = this.pcc;
        return (weakReference == null || weakReference.get() == null) ? "" : this.pcc.get().appInfo();
    }

    @JavascriptInterface
    public void changeVideoState(String str) {
        WeakReference<sf> weakReference = this.pcc;
        if (weakReference == null || weakReference.get() == null) {
            return;
        }
        this.pcc.get().changeVideoState(str);
    }

    @JavascriptInterface
    public void clickEvent(String str) {
        WeakReference<sf> weakReference = this.pcc;
        if (weakReference == null || weakReference.get() == null) {
            return;
        }
        this.pcc.get().clickEvent(str);
    }

    @JavascriptInterface
    public void dynamicTrack(String str) {
        WeakReference<sf> weakReference = this.pcc;
        if (weakReference == null || weakReference.get() == null) {
            return;
        }
        this.pcc.get().dynamicTrack(str);
    }

    @JavascriptInterface
    public String getCurrentVideoState() {
        WeakReference<sf> weakReference = this.pcc;
        return (weakReference == null || weakReference.get() == null) ? "" : this.pcc.get().getCurrentVideoState();
    }

    @JavascriptInterface
    public String getData(String str) {
        WeakReference<sf> weakReference = this.pcc;
        return (weakReference == null || weakReference.get() == null) ? "" : this.pcc.get().getData(str);
    }

    @JavascriptInterface
    public String getTemplateInfo() {
        WeakReference<sf> weakReference = this.pcc;
        return (weakReference == null || weakReference.get() == null) ? "" : this.pcc.get().getTemplateInfo();
    }

    @JavascriptInterface
    public void initRenderFinish() {
        WeakReference<sf> weakReference = this.pcc;
        if (weakReference == null || weakReference.get() == null) {
            return;
        }
        this.pcc.get().initRenderFinish();
    }

    @JavascriptInterface
    public void muteVideo(String str) {
        WeakReference<sf> weakReference = this.pcc;
        if (weakReference == null || weakReference.get() == null) {
            return;
        }
        this.pcc.get().muteVideo(str);
    }

    public void pcc(sf sfVar) {
        this.pcc = new WeakReference<>(sfVar);
    }

    @JavascriptInterface
    public void renderDidFinish(String str) {
        WeakReference<sf> weakReference = this.pcc;
        if (weakReference == null || weakReference.get() == null) {
            return;
        }
        this.pcc.get().renderDidFinish(str);
    }

    @JavascriptInterface
    public void requestPauseVideo(String str) {
        WeakReference<sf> weakReference = this.pcc;
        if (weakReference == null || weakReference.get() == null) {
            return;
        }
        this.pcc.get().pcc(str);
    }

    @JavascriptInterface
    public void skipVideo() {
        WeakReference<sf> weakReference = this.pcc;
        if (weakReference == null || weakReference.get() == null) {
            return;
        }
        this.pcc.get().skipVideo();
    }

    @JavascriptInterface
    public void videoFrameChanged(String str) {
        WeakReference<sf> weakReference = this.pcc;
        if (weakReference == null || weakReference.get() == null) {
            return;
        }
        this.pcc.get().videoFrameChanged(str);
    }
}
