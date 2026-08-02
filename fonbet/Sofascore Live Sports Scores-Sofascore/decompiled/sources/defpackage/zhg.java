package defpackage;

import android.app.ProgressDialog;
import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.graphics.Bitmap;
import android.net.Uri;
import android.net.http.SslError;
import android.os.Bundle;
import android.view.ViewGroup;
import android.webkit.RenderProcessGoneDetail;
import android.webkit.SslErrorHandler;
import android.webkit.WebResourceError;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.facebook.FacebookRequestError;
import com.facebook.internal.k0;
import com.facebook.internal.o0;
import com.facebook.internal.s0;
import com.facebook.o;
import com.facebook.w;
import com.facebook.x;
import com.google.android.gms.internal.ads.zzfxe;
import com.google.android.gms.internal.ads.zzfyc;
import com.google.android.gms.internal.consent_sdk.zzbe;
import com.google.android.gms.internal.consent_sdk.zzbx;
import com.google.android.gms.internal.consent_sdk.zzg;
import java.util.Locale;
import java.util.Objects;
import java.util.regex.Pattern;
import kotlin.jvm.functions.Function1;
import kotlin.text.StringsKt;
import kotlin.text.c;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public final class zhg extends WebViewClient {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ zhg(zzbx zzbxVar) {
        this.a = 2;
        Objects.requireNonNull(zzbxVar);
        this.b = zzbxVar;
    }

    @Override // android.webkit.WebViewClient
    public void onLoadResource(WebView webView, String str) {
        switch (this.a) {
            case 2:
                zzbx zzbxVar = (zzbx) this.b;
                int i = zzbx.d;
                if (str != null && str.startsWith("consent://")) {
                    zzbxVar.b.j(str);
                    break;
                }
                break;
            default:
                super.onLoadResource(webView, str);
                break;
        }
    }

    @Override // android.webkit.WebViewClient
    public void onPageFinished(WebView webView, String str) {
        ProgressDialog progressDialog;
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                super.onPageFinished(webView, str);
                xw3.L(s9a.c(z45.a), null, null, new qdg((eig) obj, null, 2), 3);
                break;
            case 1:
                webView.getClass();
                str.getClass();
                super.onPageFinished(webView, str);
                s0 s0Var = (s0) obj;
                if (!s0Var.j && (progressDialog = s0Var.e) != null) {
                    progressDialog.dismiss();
                }
                FrameLayout frameLayout = s0Var.g;
                if (frameLayout != null) {
                    frameLayout.setBackgroundColor(0);
                }
                e1l e1lVar = s0Var.d;
                if (e1lVar != null) {
                    e1lVar.setVisibility(0);
                }
                ImageView imageView = s0Var.f;
                if (imageView != null) {
                    imageView.setVisibility(0);
                }
                s0Var.k = true;
                break;
            case 2:
                zzbx zzbxVar = (zzbx) obj;
                if (!zzbxVar.c) {
                    zzbxVar.c = true;
                    break;
                }
                break;
            default:
                super.onPageFinished(webView, str);
                break;
        }
    }

    @Override // android.webkit.WebViewClient
    public void onPageStarted(WebView webView, String str, Bitmap bitmap) {
        ProgressDialog progressDialog;
        switch (this.a) {
            case 1:
                webView.getClass();
                str.getClass();
                w wVar = w.a;
                super.onPageStarted(webView, str, bitmap);
                s0 s0Var = (s0) this.b;
                if (!s0Var.j && (progressDialog = s0Var.e) != null) {
                    progressDialog.show();
                    break;
                }
                break;
            default:
                super.onPageStarted(webView, str, bitmap);
                break;
        }
    }

    @Override // android.webkit.WebViewClient
    public void onReceivedError(WebView webView, int i, String str, String str2) {
        int i2 = this.a;
        Object obj = this.b;
        switch (i2) {
            case 1:
                webView.getClass();
                str.getClass();
                str2.getClass();
                super.onReceivedError(webView, i, str, str2);
                ((s0) obj).e(new o(str, i, str2));
                break;
            case 2:
                ng2 ng2Var = ((zzbx) obj).b;
                Locale locale = Locale.US;
                StringBuilder t = dmi.t(i, "WebResourceError(", ", ", str2, "): ");
                t.append(str);
                ((zzbe) ng2Var.g).c(new zzg(2, t.toString()));
                break;
            default:
                super.onReceivedError(webView, i, str, str2);
                break;
        }
    }

    @Override // android.webkit.WebViewClient
    public void onReceivedHttpError(WebView webView, WebResourceRequest webResourceRequest, WebResourceResponse webResourceResponse) {
        String str;
        switch (this.a) {
            case 0:
                super.onReceivedHttpError(webView, webResourceRequest, webResourceResponse);
                eig eigVar = (eig) this.b;
                String str2 = eigVar.e;
                if (str2 != null) {
                    rq3 rq3Var = null;
                    boolean equals = str2.equals(String.valueOf(webResourceRequest != null ? webResourceRequest.getUrl() : null));
                    int i = 1;
                    if (equals) {
                        if (webResourceResponse == null || (str = webResourceResponse.getReasonPhrase()) == null) {
                            str = "unknown error";
                        }
                        xw3.L(s9a.c(z45.a), null, null, new big(eigVar, str, rq3Var, i), 3);
                        break;
                    }
                }
                break;
            default:
                super.onReceivedHttpError(webView, webResourceRequest, webResourceResponse);
                break;
        }
    }

    @Override // android.webkit.WebViewClient
    public void onReceivedSslError(WebView webView, SslErrorHandler sslErrorHandler, SslError sslError) {
        switch (this.a) {
            case 1:
                webView.getClass();
                sslErrorHandler.getClass();
                sslError.getClass();
                super.onReceivedSslError(webView, sslErrorHandler, sslError);
                sslErrorHandler.cancel();
                ((s0) this.b).e(new o(null, -11, null));
                break;
            default:
                super.onReceivedSslError(webView, sslErrorHandler, sslError);
                break;
        }
    }

    @Override // android.webkit.WebViewClient
    public boolean onRenderProcessGone(WebView webView, RenderProcessGoneDetail renderProcessGoneDetail) {
        switch (this.a) {
            case 2:
                if (webView != null) {
                    renderProcessGoneDetail.didCrash();
                    renderProcessGoneDetail.rendererPriorityAtExit();
                    ViewGroup viewGroup = (ViewGroup) webView.getParent();
                    if (viewGroup != null) {
                        viewGroup.removeView(webView);
                    }
                    webView.destroy();
                }
                return true;
            case 3:
                String obj = renderProcessGoneDetail.toString();
                String valueOf = String.valueOf(webView);
                new StringBuilder(String.valueOf(obj).length() + 36 + valueOf.length());
                zzfxe zzfxeVar = (zzfxe) this.b;
                if (zzfxeVar.c() == webView) {
                    zzfxeVar.b = new zzfyc(null);
                }
                webView.destroy();
                return true;
            default:
                return super.onRenderProcessGone(webView, renderProcessGoneDetail);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:55:0x00c5  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00c9  */
    @Override // android.webkit.WebViewClient
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public boolean shouldOverrideUrlLoading(WebView webView, String str) {
        int i;
        int i2 = this.a;
        Object obj = this.b;
        switch (i2) {
            case 1:
                s0 s0Var = (s0) obj;
                webView.getClass();
                str.getClass();
                w wVar = w.a;
                Uri parse = Uri.parse(str);
                boolean z = parse.getPath() != null && Pattern.matches("^/(v\\d+\\.\\d+/)??dialog/.*", parse.getPath());
                if (c.v(str, s0Var.b, false)) {
                    Bundle c = s0Var.c(str);
                    String string = c.getString("error");
                    if (string == null) {
                        string = c.getString("error_type");
                    }
                    String string2 = c.getString("error_msg");
                    if (string2 == null) {
                        string2 = c.getString("error_message");
                    }
                    if (string2 == null) {
                        string2 = c.getString("error_description");
                    }
                    String string3 = c.getString("error_code");
                    if (string3 != null && !k0.A(string3)) {
                        try {
                            i = Integer.parseInt(string3);
                        } catch (NumberFormatException unused) {
                        }
                        if (!k0.A(string) && k0.A(string2) && i == -1) {
                            o0 o0Var = s0Var.c;
                            if (o0Var != null && !s0Var.i) {
                                s0Var.i = true;
                                o0Var.a(c, null);
                                s0Var.dismiss();
                            }
                        } else if (string == null && (string.equals("access_denied") || string.equals("OAuthAccessDeniedException"))) {
                            s0Var.cancel();
                        } else if (i != 4201) {
                            s0Var.cancel();
                        } else {
                            s0Var.e(new x(new FacebookRequestError(i, string, string2), string2));
                        }
                    }
                    i = -1;
                    if (!k0.A(string)) {
                    }
                    if (string == null) {
                    }
                    if (i != 4201) {
                    }
                } else if (c.v(str, "fbconnect://cancel", false)) {
                    s0Var.cancel();
                } else {
                    if (z || StringsKt.J(str, "touch", false)) {
                        return false;
                    }
                    try {
                        s0Var.getContext().startActivity(new Intent("android.intent.action.VIEW", Uri.parse(str)));
                    } catch (ActivityNotFoundException unused2) {
                        return false;
                    }
                }
                return true;
            case 2:
                zzbx zzbxVar = (zzbx) obj;
                int i3 = zzbx.d;
                if (str == null || !str.startsWith("consent://")) {
                    return false;
                }
                zzbxVar.b.j(str);
                return true;
            default:
                return super.shouldOverrideUrlLoading(webView, str);
        }
    }

    public /* synthetic */ zhg(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // android.webkit.WebViewClient
    public void onReceivedError(WebView webView, WebResourceRequest webResourceRequest, WebResourceError webResourceError) {
        String str;
        CharSequence description;
        switch (this.a) {
            case 0:
                super.onReceivedError(webView, webResourceRequest, webResourceError);
                eig eigVar = (eig) this.b;
                String str2 = eigVar.e;
                if (str2 != null) {
                    rq3 rq3Var = null;
                    boolean equals = str2.equals(String.valueOf(webResourceRequest != null ? webResourceRequest.getUrl() : null));
                    int i = 1;
                    if (equals) {
                        if (webResourceError == null || (description = webResourceError.getDescription()) == null || (str = description.toString()) == null) {
                            str = "unknown error";
                        }
                        xw3.L(s9a.c(z45.a), null, null, new big(eigVar, str, rq3Var, i), 3);
                        break;
                    }
                }
                break;
            default:
                super.onReceivedError(webView, webResourceRequest, webResourceError);
                break;
        }
    }

    @Override // android.webkit.WebViewClient
    public boolean shouldOverrideUrlLoading(WebView webView, WebResourceRequest webResourceRequest) {
        Boolean bool;
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                if (webResourceRequest == null) {
                    return false;
                }
                Function1 function1 = ((eig) obj).a;
                if (function1 != null) {
                    String uri = webResourceRequest.getUrl().toString();
                    uri.getClass();
                    bool = (Boolean) function1.invoke(uri);
                } else {
                    bool = null;
                }
                if (bool != null) {
                    return bool.booleanValue();
                }
                return false;
            case 1:
            default:
                return super.shouldOverrideUrlLoading(webView, webResourceRequest);
            case 2:
                String uri2 = webResourceRequest.getUrl().toString();
                zzbx zzbxVar = (zzbx) obj;
                int i2 = zzbx.d;
                if (uri2 == null || !uri2.startsWith("consent://")) {
                    return false;
                }
                zzbxVar.b.j(uri2);
                return true;
        }
    }
}
