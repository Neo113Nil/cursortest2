package com.bytedance.sdk.component.vy;

import android.content.Context;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.webkit.ValueCallback;
import android.webkit.WebSettings;
import android.webkit.WebView;
import com.bytedance.sdk.component.vy.qf;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public class wh extends WebView {
    private boolean gm;
    private boolean oo;
    public long pcc;
    private vj qf;
    private final HashSet<String> sf;
    private boolean vj;
    private gm wh;

    public wh(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.sf = new HashSet<>();
        this.pcc = System.currentTimeMillis();
        gm();
    }

    private void gm() {
        WebSettings settings = getSettings();
        settings.setSupportZoom(false);
        settings.setDisplayZoomControls(false);
        settings.setBuiltInZoomControls(false);
        settings.setSupportMultipleWindows(false);
        settings.setAllowFileAccess(false);
        settings.setSavePassword(false);
        setWebViewClient(new qf.pcc());
    }

    @Override // android.webkit.WebView
    public void addJavascriptInterface(Object obj, String str) {
        toString();
        if (this.gm || this.vj) {
            return;
        }
        super.addJavascriptInterface(obj, str);
        this.sf.add(str);
    }

    @Override // android.webkit.WebView
    public void clearCache(boolean z) {
        if (this.gm || this.vj) {
            return;
        }
        super.clearCache(z);
    }

    @Override // android.webkit.WebView
    public void destroy() {
        toString();
        if (this.gm) {
            return;
        }
        this.gm = true;
        pcc();
        ViewParent parent = getParent();
        if (parent instanceof ViewGroup) {
            ((ViewGroup) parent).removeView(this);
        }
        super.destroy();
    }

    @Override // android.webkit.WebView
    public void evaluateJavascript(String str, ValueCallback<String> valueCallback) {
        if (!this.gm && !this.vj) {
            super.evaluateJavascript(str, valueCallback);
        } else if (valueCallback != null) {
            valueCallback.onReceiveValue("");
        }
    }

    @Override // android.webkit.WebView
    public void goBack() {
        if (this.gm || this.vj) {
            return;
        }
        super.goBack();
    }

    @Override // android.webkit.WebView
    public void goBackOrForward(int i) {
        if (this.gm || this.vj) {
            return;
        }
        super.goBackOrForward(i);
    }

    @Override // android.webkit.WebView
    public void goForward() {
        if (this.gm || this.vj) {
            return;
        }
        super.goForward();
    }

    @Override // android.webkit.WebView
    public void loadDataWithBaseURL(String str, String str2, String str3, String str4, String str5) {
        if (this.gm || this.vj) {
            return;
        }
        super.loadDataWithBaseURL(str, str2, str3, str4, str5);
    }

    @Override // android.webkit.WebView
    public void loadUrl(String str) {
        if (this.gm || this.vj) {
            return;
        }
        try {
            super.loadUrl(str);
        } catch (Exception | IncompatibleClassChangeError | NoClassDefFoundError unused) {
        }
    }

    @Override // android.webkit.WebView, android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        toString();
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        toString();
        if (this.oo) {
            destroy();
        }
    }

    @Override // android.webkit.WebView, android.view.View
    public void onDraw(Canvas canvas) {
        if (this.gm || this.vj) {
            return;
        }
        super.onDraw(canvas);
    }

    @Override // android.webkit.WebView, android.widget.AbsoluteLayout, android.view.View
    public void onMeasure(int i, int i2) {
        if (this.gm || this.vj) {
            setMeasuredDimension(0, 0);
        } else {
            super.onMeasure(i, i2);
        }
    }

    @Override // android.webkit.WebView
    public void onPause() {
        if (this.gm || this.vj) {
            return;
        }
        try {
            super.onPause();
        } catch (Exception unused) {
        }
    }

    @Override // android.webkit.WebView
    public void onResume() {
        if (this.gm || this.vj) {
            return;
        }
        try {
            super.onResume();
        } catch (Exception unused) {
        }
    }

    @Override // android.webkit.WebView, android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        vj vjVar = this.qf;
        return (vjVar == null || !vjVar.sf(motionEvent)) ? super.onTouchEvent(motionEvent) : this.qf.pcc(motionEvent);
    }

    @Override // android.webkit.WebView
    public void pauseTimers() {
        if (this.gm || this.vj) {
            return;
        }
        super.pauseTimers();
    }

    public void pcc() {
        if (this.gm) {
            return;
        }
        setOnClickListener(null);
        setOnTouchListener(null);
        setOnScrollChangeListener(null);
        setDownloadListener(null);
        Iterator<String> it = this.sf.iterator();
        while (it.hasNext()) {
            super.removeJavascriptInterface(it.next());
        }
        this.sf.clear();
    }

    @Override // android.webkit.WebView
    public void reload() {
        if (this.gm || this.vj) {
            return;
        }
        super.reload();
    }

    @Override // android.webkit.WebView
    public void removeJavascriptInterface(String str) {
        if (this.gm || this.vj) {
            return;
        }
        super.removeJavascriptInterface(str);
        this.sf.remove(str);
    }

    @Override // android.webkit.WebView
    public void resumeTimers() {
        if (this.gm || this.vj) {
            return;
        }
        super.resumeTimers();
    }

    public void setDestroyOnDetached(boolean z) {
        this.oo = z;
    }

    @Override // android.view.View
    public void setOnTouchListener(View.OnTouchListener onTouchListener) {
        gm gmVar = this.wh;
        if (gmVar == null) {
            super.setOnTouchListener(onTouchListener);
        } else {
            gmVar.pcc(onTouchListener);
            super.setOnTouchListener(this.wh);
        }
    }

    public void setRecycler(boolean z) {
        this.vj = z;
    }

    public void setTouchListenerProxy(gm gmVar) {
        this.wh = gmVar;
    }

    public void setWebEventProxy(vj vjVar) {
        this.qf = vjVar;
    }

    public void sf() {
        if (this.gm) {
            return;
        }
        setOnClickListener(null);
        setOnTouchListener(null);
        setOnScrollChangeListener(null);
        setDownloadListener(null);
    }

    @Override // android.webkit.WebView
    public void stopLoading() {
        if (this.gm || this.vj) {
            return;
        }
        try {
            super.stopLoading();
        } catch (Exception unused) {
        }
    }

    @Override // android.webkit.WebView
    public void loadUrl(String str, Map<String, String> map) {
        if (this.gm || this.vj) {
            return;
        }
        try {
            super.loadUrl(str, map);
        } catch (Exception | IncompatibleClassChangeError | NoClassDefFoundError unused) {
        }
    }

    public wh(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.sf = new HashSet<>();
        this.pcc = System.currentTimeMillis();
        gm();
    }
}
