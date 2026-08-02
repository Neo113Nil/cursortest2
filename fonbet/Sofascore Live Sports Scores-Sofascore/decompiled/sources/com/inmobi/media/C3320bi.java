package com.inmobi.media;

import android.R;
import android.app.Activity;
import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.graphics.Bitmap;
import android.webkit.ConsoleMessage;
import android.webkit.GeolocationPermissions;
import android.webkit.JsPromptResult;
import android.webkit.JsResult;
import android.webkit.WebChromeClient;
import android.webkit.WebView;
import com.inmobi.media.C3320bi;
import defpackage.gyl;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* renamed from: com.inmobi.media.bi, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public class C3320bi extends WebChromeClient {
    public final /* synthetic */ GestureDetectorOnGestureListenerC3889xi a;

    public C3320bi(GestureDetectorOnGestureListenerC3889xi gestureDetectorOnGestureListenerC3889xi) {
        this.a = gestureDetectorOnGestureListenerC3889xi;
    }

    public static final void a(GeolocationPermissions.Callback callback, String str, DialogInterface dialogInterface, int i) {
        callback.invoke(str, true, false);
    }

    public static final void b(GeolocationPermissions.Callback callback, String str, DialogInterface dialogInterface, int i) {
        callback.invoke(str, false, false);
    }

    public static final void c(JsResult jsResult, DialogInterface dialogInterface, int i) {
        jsResult.cancel();
    }

    @Override // android.webkit.WebChromeClient
    public final Bitmap getDefaultVideoPoster() {
        Bitmap defaultVideoPoster = super.getDefaultVideoPoster();
        if (defaultVideoPoster != null) {
            return defaultVideoPoster;
        }
        Bitmap createBitmap = Bitmap.createBitmap(1, 1, Bitmap.Config.ARGB_8888);
        createBitmap.getClass();
        return createBitmap;
    }

    @Override // android.webkit.WebChromeClient
    public final boolean onConsoleMessage(ConsoleMessage consoleMessage) {
        consoleMessage.getClass();
        String str = consoleMessage.message() + " -- From line " + consoleMessage.lineNumber() + " of " + consoleMessage.sourceId();
        InterfaceC3880x9 interfaceC3880x9 = this.a.i;
        if (interfaceC3880x9 == null) {
            return true;
        }
        String str2 = GestureDetectorOnGestureListenerC3889xi.i1;
        str2.getClass();
        ((C3906y9) interfaceC3880x9).c(str2, "Console message:".concat(str));
        return true;
    }

    @Override // android.webkit.WebChromeClient
    public final void onGeolocationPermissionsShowPrompt(final String str, final GeolocationPermissions.Callback callback) {
        str.getClass();
        callback.getClass();
        if (this.a.u.get() != null) {
            final int i = 0;
            AlertDialog.Builder positiveButton = new AlertDialog.Builder((Context) this.a.u.get()).setTitle("Location Permission").setMessage("Allow location access").setPositiveButton(R.string.ok, new DialogInterface.OnClickListener() { // from class: fyl
                @Override // android.content.DialogInterface.OnClickListener
                public final void onClick(DialogInterface dialogInterface, int i2) {
                    switch (i) {
                        case 0:
                            C3320bi.a(callback, str, dialogInterface, i2);
                            break;
                        default:
                            C3320bi.b(callback, str, dialogInterface, i2);
                            break;
                    }
                }
            });
            final int i2 = 1;
            positiveButton.setNegativeButton(R.string.cancel, new DialogInterface.OnClickListener() { // from class: fyl
                @Override // android.content.DialogInterface.OnClickListener
                public final void onClick(DialogInterface dialogInterface, int i22) {
                    switch (i2) {
                        case 0:
                            C3320bi.a(callback, str, dialogInterface, i22);
                            break;
                        default:
                            C3320bi.b(callback, str, dialogInterface, i22);
                            break;
                    }
                }
            }).create().show();
        }
        super.onGeolocationPermissionsShowPrompt(str, callback);
    }

    @Override // android.webkit.WebChromeClient
    public final boolean onJsAlert(WebView webView, String str, String str2, JsResult jsResult) {
        webView.getClass();
        str.getClass();
        str2.getClass();
        jsResult.getClass();
        InterfaceC3880x9 interfaceC3880x9 = this.a.i;
        if (interfaceC3880x9 != null) {
            String str3 = GestureDetectorOnGestureListenerC3889xi.i1;
            str3.getClass();
            ((C3906y9) interfaceC3880x9).a(str3, "jsAlert called with: " + str2 + str);
        }
        if (!this.a.a(jsResult)) {
            return true;
        }
        Activity fullScreenActivity = this.a.getFullScreenActivity();
        if (fullScreenActivity != null) {
            new AlertDialog.Builder(fullScreenActivity).setMessage(str2).setTitle(str).setPositiveButton(R.string.ok, new gyl(jsResult, 0)).setCancelable(false).create().show();
            return true;
        }
        jsResult.cancel();
        return true;
    }

    @Override // android.webkit.WebChromeClient
    public final boolean onJsConfirm(WebView webView, String str, String str2, JsResult jsResult) {
        webView.getClass();
        str.getClass();
        str2.getClass();
        jsResult.getClass();
        InterfaceC3880x9 interfaceC3880x9 = this.a.i;
        if (interfaceC3880x9 != null) {
            String str3 = GestureDetectorOnGestureListenerC3889xi.i1;
            str3.getClass();
            ((C3906y9) interfaceC3880x9).a(str3, "jsConfirm called with: " + str2 + str);
        }
        if (this.a.a(jsResult)) {
            if (this.a.getFullScreenActivity() != null) {
                new AlertDialog.Builder(this.a.getFullScreenActivity()).setMessage(str2).setPositiveButton(R.string.ok, new gyl(jsResult, 1)).setNegativeButton(R.string.cancel, new gyl(jsResult, 2)).create().show();
            } else {
                jsResult.cancel();
            }
        }
        return true;
    }

    @Override // android.webkit.WebChromeClient
    public final boolean onJsPrompt(WebView webView, String str, String str2, String str3, JsPromptResult jsPromptResult) {
        webView.getClass();
        str.getClass();
        str2.getClass();
        str3.getClass();
        jsPromptResult.getClass();
        InterfaceC3880x9 interfaceC3880x9 = this.a.i;
        if (interfaceC3880x9 != null) {
            String str4 = GestureDetectorOnGestureListenerC3889xi.i1;
            str4.getClass();
            ((C3906y9) interfaceC3880x9).a(str4, "jsPrompt called with: " + str2 + str);
        }
        if (!this.a.a(jsPromptResult)) {
            return true;
        }
        if (this.a.getFullScreenActivity() != null) {
            return false;
        }
        jsPromptResult.cancel();
        return true;
    }

    @Override // android.webkit.WebChromeClient
    public final void onProgressChanged(WebView webView, int i) {
        InterfaceC3880x9 interfaceC3880x9 = this.a.i;
        if (interfaceC3880x9 != null) {
            String str = GestureDetectorOnGestureListenerC3889xi.i1;
            str.getClass();
            ((C3906y9) interfaceC3880x9).c(str, "webview progress changed - " + i);
        }
        super.onProgressChanged(webView, i);
    }

    public static final void b(JsResult jsResult, DialogInterface dialogInterface, int i) {
        jsResult.confirm();
    }

    public static final void a(JsResult jsResult, DialogInterface dialogInterface, int i) {
        jsResult.confirm();
    }
}
