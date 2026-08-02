package com.playtika.pras.sdk.network;

import android.webkit.JavascriptInterface;
import com.playtika.pras.e.h;

/* loaded from: classes7.dex */
public class JSInterface {
    public static final String APP_NAME = "APP";
    private h popupActions;

    public JSInterface(h hVar) {
        this.popupActions = hVar;
    }

    @JavascriptInterface
    public String getInitData() {
        return this.popupActions.getInitData();
    }

    @JavascriptInterface
    public String getOrientation() {
        return this.popupActions.getOrientation();
    }

    @JavascriptInterface
    public boolean isPackageInstalled(String str) {
        return this.popupActions.isPackageInstalled(str);
    }

    @JavascriptInterface
    public boolean isVenmoSupported() {
        return true;
    }

    @JavascriptInterface
    public void loadingCompleted() {
        this.popupActions.loadingCompleted();
        this.popupActions.clearTimer();
    }

    @JavascriptInterface
    public void onBrowserClosed() {
        this.popupActions.onAfterExternalBrowserClosed();
    }

    @JavascriptInterface
    public void onBrowserOpening(String str) {
        this.popupActions.onBeforeExternalBrowserOpened(str);
    }

    @JavascriptInterface
    public void openWebPage(String str) {
        this.popupActions.openWebPage(str);
    }

    @JavascriptInterface
    public void passData(String str) {
        this.popupActions.onResult(str);
    }

    @JavascriptInterface
    public void setKeyboardDoneButtonMode(boolean z) {
        this.popupActions.setDoneButtonKeyboardMode(z);
    }

    @JavascriptInterface
    public void setOrientation(String str) {
        this.popupActions.setOrientation(str);
    }

    @JavascriptInterface
    public void setResult(String str) {
        this.popupActions.setResult(str);
    }

    @JavascriptInterface
    public void setScrollOnKeyboard(boolean z) {
        this.popupActions.setScrollKeyboard(z);
    }
}
