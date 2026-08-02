package defpackage;

import android.webkit.WebView;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class fln {
    public final WebView a;
    public final l8o b;

    public fln(WebView webView, l8o l8oVar) {
        this.a = webView;
        this.b = l8oVar;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof fln) {
            fln flnVar = (fln) obj;
            return this.a.equals(flnVar.a) && this.b == flnVar.b;
        }
        return false;
    }

    public final int hashCode() {
        return this.b.hashCode() ^ ((this.a.hashCode() ^ 1000003) * 1000003);
    }

    public final String toString() {
        String obj = this.a.toString();
        int length = obj.length();
        String obj2 = this.b.toString();
        StringBuilder sb = new StringBuilder(length + 57 + obj2.length() + 1);
        bf3.v(sb, "JavaScriptWebViewInitComponent{webView=", obj, ", omidInitializer=", obj2);
        sb.append("}");
        return sb.toString();
    }
}
