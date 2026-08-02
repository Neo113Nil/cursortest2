package com.ironsource.sdk.controller;

import android.content.Context;
import android.text.TextUtils;
import com.ironsource.C4373ie;
import com.ironsource.C4438m8;
import com.ironsource.C4452n4;
import com.ironsource.InterfaceC4349h8;
import com.ironsource.InterfaceC4458na;
import com.ironsource.Jg;
import com.ironsource.gh;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes13.dex */
public class a implements InterfaceC4349h8 {
    private static final String d = "loadWithUrl";
    private static final String e = "sendMessage";
    public static final String f = "removeAdView";
    public static final String g = "webviewAction";
    public static final String h = "handleGetViewVisibility";
    private static final String i = "functionName";
    private static final String j = "functionParams";
    private static final String k = "success";
    private static final String l = "fail";
    public static final String m = "errMsg";
    private static final String n = "%s | unsupported AdViews API";
    private gh a;
    private C4438m8 b = C4438m8.a();
    private Context c;

    /* renamed from: com.ironsource.sdk.controller.a$a, reason: collision with other inner class name */
    public static class C0229a {
        String a;
        JSONObject b;
        String c;
        String d;

        public /* synthetic */ C0229a(int i) {
            this();
        }

        private C0229a() {
        }
    }

    public a(Context context) {
        this.c = context;
    }

    public void a(gh ghVar) {
        this.a = ghVar;
    }

    @Override // com.ironsource.InterfaceC4349h8
    public void a(String str, JSONObject jSONObject) {
        if (this.a == null || TextUtils.isEmpty(str)) {
            return;
        }
        this.a.a(str, jSONObject);
    }

    @Override // com.ironsource.InterfaceC4349h8
    public void a(String str, String str2, String str3) {
        a(str, Jg.a(str2, str3));
    }

    public void a(String str, InterfaceC4458na interfaceC4458na) throws Exception {
        a aVar;
        char c;
        C0229a a = a(str);
        C4373ie c4373ie = new C4373ie();
        try {
            String str2 = a.a;
            switch (str2.hashCode()) {
                case -1384357108:
                    if (str2.equals(f)) {
                        c = 2;
                        break;
                    }
                    c = 65535;
                    break;
                case 691453791:
                    if (str2.equals("sendMessage")) {
                        c = 1;
                        break;
                    }
                    c = 65535;
                    break;
                case 842351363:
                    if (str2.equals("loadWithUrl")) {
                        c = 0;
                        break;
                    }
                    c = 65535;
                    break;
                case 1182065477:
                    if (str2.equals("handleGetViewVisibility")) {
                        c = 3;
                        break;
                    }
                    c = 65535;
                    break;
                case 1491535759:
                    if (str2.equals(g)) {
                        c = 4;
                        break;
                    }
                    c = 65535;
                    break;
                default:
                    c = 65535;
                    break;
            }
            if (c == 0) {
                aVar = this;
                try {
                    this.b.a(aVar, a.b, this.c, a.c, a.d);
                    return;
                } catch (Exception e2) {
                    e = e2;
                    C4452n4.d().a(e);
                    c4373ie.b("errMsg", e.getMessage());
                    String c2 = aVar.b.c(a.b);
                    if (!TextUtils.isEmpty(c2)) {
                        c4373ie.b("adViewId", c2);
                    }
                    interfaceC4458na.a(false, a.d, c4373ie);
                    return;
                }
            }
            if (c == 1) {
                this.b.d(a.b, a.c, a.d);
                return;
            }
            if (c == 2) {
                this.b.c(a.b, a.c, a.d);
                return;
            }
            if (c == 3) {
                this.b.a(a.b, a.c, a.d);
                return;
            }
            if (c == 4) {
                this.b.b(a.b, a.c, a.d);
                return;
            }
            throw new IllegalArgumentException(a.a + " | unsupported AdViews API");
        } catch (Exception e3) {
            e = e3;
            aVar = this;
        }
    }

    private C0229a a(String str) throws JSONException {
        JSONObject jSONObject = new JSONObject(str);
        C0229a c0229a = new C0229a(0);
        c0229a.a = jSONObject.optString("functionName");
        c0229a.b = jSONObject.optJSONObject("functionParams");
        c0229a.c = jSONObject.optString("success");
        c0229a.d = jSONObject.optString("fail");
        return c0229a;
    }
}
