package com.iab.omid.library.vungle.messagelistener;

import android.net.Uri;
import android.webkit.WebView;
import com.iab.omid.library.vungle.utils.d;
import com.iab.omid.library.vungle.utils.g;
import com.iab.omid.library.vungle.utils.i;
import java.util.Arrays;
import java.util.HashSet;
import org.chromium.support_lib_boundary.util.Features;
import org.json.JSONException;
import org.json.JSONObject;
import xsna.mix0;
import xsna.txx;
import xsna.ygx0;
import xsna.zq70;

/* loaded from: classes13.dex */
public class a {
    private static final i c = new i();
    private final WebView a;
    private final b b;

    /* renamed from: com.iab.omid.library.vungle.messagelistener.a$a, reason: collision with other inner class name */
    public class C0194a implements mix0.b {
        public C0194a() {
        }

        @Override // xsna.mix0.b
        public void onPostMessage(WebView webView, ygx0 ygx0Var, Uri uri, boolean z, txx txxVar) {
            a.this.a(ygx0Var.a());
        }
    }

    public a(WebView webView, b bVar) {
        g.a(webView, "WebView is null");
        this.a = webView;
        this.b = bVar;
    }

    public void a() {
        try {
            if (!zq70.C(Features.WEB_MESSAGE_LISTENER)) {
                this.b.onWebMessageListenerUnsupported();
                return;
            }
            try {
                b();
                c.a(this.a, this.b.getListenerName(), new HashSet(Arrays.asList("*")), new C0194a());
            } catch (Exception e) {
                d.a("Error adding WebView listener", e);
                this.b.onWebMessageListenerUnsupported();
            }
        } catch (NoClassDefFoundError unused) {
        }
    }

    public void b() {
        c.a(this.a, this.b.getListenerName());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(String str) {
        try {
            JSONObject jSONObject = new JSONObject(str);
            this.b.onMessageReceived(jSONObject.getString("method"), jSONObject.getJSONObject("data"));
        } catch (JSONException e) {
            d.a("Error parsing JS message", e);
        }
    }
}
