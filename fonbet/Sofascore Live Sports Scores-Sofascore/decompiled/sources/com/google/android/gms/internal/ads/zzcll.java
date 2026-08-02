package com.google.android.gms.internal.ads;

import android.R;
import android.app.Activity;
import android.app.AlertDialog;
import android.content.Context;
import android.os.Message;
import android.view.View;
import android.view.WindowManager;
import android.webkit.ConsoleMessage;
import android.webkit.GeolocationPermissions;
import android.webkit.JsPromptResult;
import android.webkit.JsResult;
import android.webkit.WebChromeClient;
import android.webkit.WebStorage;
import android.webkit.WebView;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.google.android.gms.ads.internal.util.client.zzo;
import defpackage.bf3;
import defpackage.fn0;
import defpackage.g7j;
import defpackage.n15;
import defpackage.rcb;
import defpackage.stn;
import defpackage.ttn;
import defpackage.wt3;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zzcll extends WebChromeClient {
    public final zzcmi a;

    public zzcll(zzcmi zzcmiVar) {
        this.a = zzcmiVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final Context b(WebView webView) {
        if (!(webView instanceof zzclm)) {
            return webView.getContext();
        }
        zzclm zzclmVar = (zzclm) webView;
        Activity zzj = zzclmVar.zzj();
        return zzj != null ? zzj : zzclmVar.getContext();
    }

    public final boolean a(Context context, String str, String str2, String str3, String str4, JsResult jsResult, JsPromptResult jsPromptResult, boolean z) {
        com.google.android.gms.ads.internal.zzb zzbVar;
        try {
            zzclx zzclxVar = this.a.a.n;
            int i = 2;
            if (zzclxVar != null && (zzbVar = zzclxVar.w) != null && zzbVar != null && !zzbVar.zzb()) {
                StringBuilder sb = new StringBuilder(str.length() + 9 + String.valueOf(str3).length() + 2);
                sb.append("window.");
                sb.append(str);
                sb.append("('");
                sb.append(str3);
                sb.append("')");
                zzbVar.zzc(sb.toString());
                return false;
            }
            com.google.android.gms.ads.internal.zzt.zzc();
            AlertDialog.Builder zzN = com.google.android.gms.ads.internal.util.zzs.zzN(context);
            zzN.setTitle(str2);
            if (!z) {
                zzN.setMessage(str3).setPositiveButton(R.string.ok, new stn(jsResult, 1)).setNegativeButton(R.string.cancel, new stn(jsResult, 0)).setOnCancelListener(new n15(jsResult, i)).create().show();
                return true;
            }
            LinearLayout linearLayout = new LinearLayout(context);
            linearLayout.setOrientation(1);
            TextView textView = new TextView(context);
            textView.setText(str3);
            EditText editText = new EditText(context);
            editText.setText(str4);
            linearLayout.addView(textView);
            linearLayout.addView(editText);
            zzN.setView(linearLayout).setPositiveButton(R.string.ok, new g7j(jsPromptResult, editText)).setNegativeButton(R.string.cancel, new rcb(jsPromptResult, 3)).setOnCancelListener(new n15(jsPromptResult, 3)).create().show();
            return true;
        } catch (WindowManager.BadTokenException e) {
            int i2 = com.google.android.gms.ads.internal.util.zze.zza;
            zzo.zzj("Fail to display Dialog.", e);
            return true;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.webkit.WebChromeClient
    public final void onCloseWindow(WebView webView) {
        if (!(webView instanceof zzclm)) {
            int i = com.google.android.gms.ads.internal.util.zze.zza;
            zzo.zzi("Tried to close a WebView that wasn't an AdWebView.");
            return;
        }
        com.google.android.gms.ads.internal.overlay.zzm zzL = ((zzclm) webView).zzL();
        if (zzL != null) {
            zzL.zza();
        } else {
            int i2 = com.google.android.gms.ads.internal.util.zze.zza;
            zzo.zzi("Tried to close an AdWebView not associated with an overlay.");
        }
    }

    @Override // android.webkit.WebChromeClient
    public final boolean onConsoleMessage(ConsoleMessage consoleMessage) {
        String message = consoleMessage.message();
        String sourceId = consoleMessage.sourceId();
        int lineNumber = consoleMessage.lineNumber();
        int length = String.valueOf(message).length();
        StringBuilder sb = new StringBuilder(wt3.B(length + 6 + String.valueOf(sourceId).length(), 1, String.valueOf(lineNumber).length(), 1));
        bf3.v(sb, "JS: ", message, " (", sourceId);
        String k = fn0.k(lineNumber, ":", ")", sb);
        if (k.contains("Application Cache")) {
            return super.onConsoleMessage(consoleMessage);
        }
        int i = ttn.a[consoleMessage.messageLevel().ordinal()];
        if (i == 1) {
            int i2 = com.google.android.gms.ads.internal.util.zze.zza;
            zzo.zzf(k);
        } else if (i == 2) {
            int i3 = com.google.android.gms.ads.internal.util.zze.zza;
            zzo.zzi(k);
        } else if (i == 3 || i == 4) {
            int i4 = com.google.android.gms.ads.internal.util.zze.zza;
            zzo.zzh(k);
        } else if (i != 5) {
            int i5 = com.google.android.gms.ads.internal.util.zze.zza;
            zzo.zzh(k);
        } else {
            int i6 = com.google.android.gms.ads.internal.util.zze.zza;
            zzo.zzd(k);
        }
        return super.onConsoleMessage(consoleMessage);
    }

    @Override // android.webkit.WebChromeClient
    public final boolean onCreateWindow(WebView webView, boolean z, boolean z2, Message message) {
        WebView.WebViewTransport webViewTransport = (WebView.WebViewTransport) message.obj;
        WebView webView2 = new WebView(webView.getContext());
        zzclx zzclxVar = this.a.a.n;
        if (zzclxVar != null) {
            webView2.setWebViewClient(zzclxVar);
        }
        webViewTransport.setWebView(webView2);
        message.sendToTarget();
        return true;
    }

    @Override // android.webkit.WebChromeClient
    public final void onExceededDatabaseQuota(String str, String str2, long j, long j2, long j3, WebStorage.QuotaUpdater quotaUpdater) {
        long j4 = 5242880 - j3;
        if (j4 <= 0) {
            quotaUpdater.updateQuota(j);
            return;
        }
        if (j == 0) {
            if (j2 > j4 || j2 > 1048576) {
                j2 = 0;
            }
        } else if (j2 == 0) {
            j2 = Math.min(Math.min(131072L, j4) + j, 1048576L);
        } else {
            if (j2 <= Math.min(1048576 - j, j4)) {
                j += j2;
            }
            j2 = j;
        }
        quotaUpdater.updateQuota(j2);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0052  */
    /* JADX WARN: Removed duplicated region for block: B:15:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:16:0x003d  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0039  */
    @Override // android.webkit.WebChromeClient
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onGeolocationPermissionsShowPrompt(String str, GeolocationPermissions.Callback callback) {
        boolean z;
        if (callback == null) {
            return;
        }
        com.google.android.gms.ads.internal.zzt.zzc();
        zzcmi zzcmiVar = this.a;
        if (!com.google.android.gms.ads.internal.util.zzs.zzD(zzcmiVar.getContext(), "android.permission.ACCESS_FINE_LOCATION")) {
            com.google.android.gms.ads.internal.zzt.zzc();
            if (!com.google.android.gms.ads.internal.util.zzs.zzD(zzcmiVar.getContext(), "android.permission.ACCESS_COARSE_LOCATION")) {
                z = false;
                if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().a(zzbjg.Ze)).booleanValue()) {
                    callback.invoke(str, z, true);
                } else {
                    callback.invoke(str, false, true);
                }
                if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().a(zzbjg.af)).booleanValue()) {
                    return;
                }
                int i = com.google.android.gms.ads.internal.util.zze.zza;
                zzo.zzd("AdWebChromeClient.onGeolocationPermissionsShowPrompt()");
                return;
            }
        }
        z = true;
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().a(zzbjg.Ze)).booleanValue()) {
        }
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().a(zzbjg.af)).booleanValue()) {
        }
    }

    @Override // android.webkit.WebChromeClient
    public final void onHideCustomView() {
        com.google.android.gms.ads.internal.overlay.zzm zzL = this.a.a.zzL();
        if (zzL != null) {
            zzL.zzb();
        } else {
            int i = com.google.android.gms.ads.internal.util.zze.zza;
            zzo.zzi("Could not get ad overlay when hiding custom view.");
        }
    }

    @Override // android.webkit.WebChromeClient
    public final boolean onJsAlert(WebView webView, String str, String str2, JsResult jsResult) {
        return a(b(webView), "alert", str, str2, null, jsResult, null, false);
    }

    @Override // android.webkit.WebChromeClient
    public final boolean onJsBeforeUnload(WebView webView, String str, String str2, JsResult jsResult) {
        return a(b(webView), "onBeforeUnload", str, str2, null, jsResult, null, false);
    }

    @Override // android.webkit.WebChromeClient
    public final boolean onJsConfirm(WebView webView, String str, String str2, JsResult jsResult) {
        return a(b(webView), "confirm", str, str2, null, jsResult, null, false);
    }

    @Override // android.webkit.WebChromeClient
    public final boolean onJsPrompt(WebView webView, String str, String str2, String str3, JsPromptResult jsPromptResult) {
        return a(b(webView), "prompt", str, str2, str3, null, jsPromptResult, true);
    }

    @Override // android.webkit.WebChromeClient
    public final void onShowCustomView(View view, int i, WebChromeClient.CustomViewCallback customViewCallback) {
        com.google.android.gms.ads.internal.overlay.zzm zzL = this.a.a.zzL();
        if (zzL != null) {
            zzL.zzw(view, customViewCallback);
            zzL.zzv(i);
        } else {
            int i2 = com.google.android.gms.ads.internal.util.zze.zza;
            zzo.zzi("Could not get ad overlay when showing custom view.");
            customViewCallback.onCustomViewHidden();
        }
    }

    @Override // android.webkit.WebChromeClient
    public final void onShowCustomView(View view, WebChromeClient.CustomViewCallback customViewCallback) {
        onShowCustomView(view, -1, customViewCallback);
    }
}
