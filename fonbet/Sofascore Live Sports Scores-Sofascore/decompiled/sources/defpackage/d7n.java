package defpackage;

import android.webkit.WebView;
import java.util.Date;
import org.json.JSONObject;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public final class d7n {
    public long a;
    public int b;
    public Object c;
    public Object d;

    /* JADX WARN: Multi-variable type inference failed */
    public WebView a() {
        return (WebView) ((f0l) this.d).get();
    }

    public void b(Date date) {
        if (date == null) {
            return;
        }
        JSONObject jSONObject = new JSONObject();
        myn.b(jSONObject, "timestamp", Long.valueOf(date.getTime()));
        nun.a.a(a(), "setLastActivity", jSONObject);
    }
}
