package defpackage;

import android.text.TextUtils;
import android.webkit.ValueCallback;
import android.webkit.WebView;
import com.google.android.gms.ads.internal.util.client.zzo;
import com.google.android.gms.ads.internal.util.zze;
import com.google.android.gms.ads.internal.zzt;
import com.google.android.gms.internal.ads.zzbfw;
import com.google.android.gms.internal.ads.zzbgg;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final /* synthetic */ class smn implements ValueCallback {
    public final /* synthetic */ lv4 a;
    public final /* synthetic */ zzbfw b;
    public final /* synthetic */ WebView c;
    public final /* synthetic */ boolean d;

    public /* synthetic */ smn(lv4 lv4Var, zzbfw zzbfwVar, WebView webView, boolean z) {
        this.a = lv4Var;
        this.b = zzbfwVar;
        this.c = webView;
        this.d = z;
    }

    @Override // android.webkit.ValueCallback
    public final void onReceiveValue(Object obj) {
        zzbgg zzbggVar = (zzbgg) this.a.d;
        zzbfw zzbfwVar = this.b;
        WebView webView = this.c;
        String str = (String) obj;
        boolean z = this.d;
        synchronized (zzbfwVar.g) {
            zzbfwVar.m--;
        }
        try {
            boolean z2 = true;
            if (!TextUtils.isEmpty(str)) {
                String optString = new JSONObject(str).optString("text");
                if (zzbggVar.n || TextUtils.isEmpty(webView.getTitle())) {
                    zzbfwVar.a(optString, z, webView.getX(), webView.getY(), webView.getWidth(), webView.getHeight());
                } else {
                    String title = webView.getTitle();
                    StringBuilder sb = new StringBuilder(String.valueOf(title).length() + 1 + String.valueOf(optString).length());
                    sb.append(title);
                    sb.append("\n");
                    sb.append(optString);
                    zzbfwVar.a(sb.toString(), z, webView.getX(), webView.getY(), webView.getWidth(), webView.getHeight());
                }
            }
            synchronized (zzbfwVar.g) {
                if (zzbfwVar.m != 0) {
                    z2 = false;
                }
            }
            if (z2) {
                zzbggVar.d.a(zzbfwVar);
            }
        } catch (JSONException unused) {
            int i = zze.zza;
            zzo.zzd("Json string may be malformed.");
        } catch (Throwable th) {
            int i2 = zze.zza;
            zzo.zze("Failed to get webview content.", th);
            zzt.zzh().d("ContentFetchTask.processWebViewContent", th);
        }
    }
}
