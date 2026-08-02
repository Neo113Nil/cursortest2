package com.iab.omid.library.smartadserver1.messagelistener;

import android.net.Uri;
import android.webkit.WebView;
import com.iab.omid.library.smartadserver1.utils.d;
import com.iab.omid.library.smartadserver1.utils.g;
import com.iab.omid.library.smartadserver1.utils.i;
import defpackage.i0l;
import defpackage.mda;
import defpackage.u0l;
import defpackage.y0l;
import java.util.Arrays;
import java.util.HashSet;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes4.dex */
public class a {
    private static final i c = new i();
    private final WebView a;
    private final b b;

    /* renamed from: com.iab.omid.library.smartadserver1.messagelistener.a$a, reason: collision with other inner class name */
    public class C0167a implements u0l {
        public C0167a() {
        }

        @Override // defpackage.u0l
        public void onPostMessage(WebView webView, i0l i0lVar, Uri uri, boolean z, mda mdaVar) {
            a.this.a(i0lVar.a());
        }
    }

    public a(WebView webView, b bVar) {
        g.a(webView, "WebView is null");
        this.a = webView;
        this.b = bVar;
    }

    public void a() {
        try {
            if (!y0l.b("WEB_MESSAGE_LISTENER")) {
                this.b.onWebMessageListenerUnsupported();
                return;
            }
            try {
                b();
                c.a(this.a, this.b.getListenerName(), new HashSet(Arrays.asList("*")), new C0167a());
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
