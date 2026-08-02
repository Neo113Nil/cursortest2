package com.ironsource.sdk.controller;

import android.content.Context;
import android.text.TextUtils;
import com.ironsource.C4114he;
import com.ironsource.C4143j8;
import com.ironsource.C4157k4;
import com.ironsource.Gg;
import com.ironsource.InterfaceC4054e8;
import com.ironsource.InterfaceC4199ma;
import com.ironsource.dh;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes4.dex */
public class a implements InterfaceC4054e8 {
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
    private dh a;
    private C4143j8 b = C4143j8.a();
    private Context c;

    public a(Context context) {
        this.c = context;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public void a(String str, InterfaceC4199ma interfaceC4199ma) throws Exception {
        a aVar;
        C1211a a = a(str);
        C4114he c4114he = new C4114he();
        try {
            String str2 = a.a;
            try {
                switch (str2.hashCode()) {
                    case -1384357108:
                        aVar = this;
                        if (str2.equals(f)) {
                            aVar.b.c(a.b, a.c, a.d);
                            return;
                        }
                        try {
                            try {
                                throw new IllegalArgumentException(a.a + " | unsupported AdViews API");
                            } catch (Exception e2) {
                                e = e2;
                                C4157k4.d().a(e);
                                c4114he.b("errMsg", e.getMessage());
                                String c = aVar.b.c(a.b);
                                if (!TextUtils.isEmpty(c)) {
                                    c4114he.b("adViewId", c);
                                }
                                interfaceC4199ma.a(false, a.d, c4114he);
                                return;
                            }
                        } catch (Exception e3) {
                            e = e3;
                        }
                    case 691453791:
                        aVar = this;
                        if (str2.equals("sendMessage")) {
                            aVar.b.d(a.b, a.c, a.d);
                            return;
                        }
                        throw new IllegalArgumentException(a.a + " | unsupported AdViews API");
                    case 842351363:
                        if (str2.equals("loadWithUrl")) {
                            this.b.a(this, a.b, this.c, a.c, a.d);
                            return;
                        }
                        aVar = this;
                        throw new IllegalArgumentException(a.a + " | unsupported AdViews API");
                    case 1182065477:
                        if (str2.equals("handleGetViewVisibility")) {
                            this.b.a(a.b, a.c, a.d);
                            return;
                        }
                        aVar = this;
                        throw new IllegalArgumentException(a.a + " | unsupported AdViews API");
                    case 1491535759:
                        if (str2.equals(g)) {
                            this.b.b(a.b, a.c, a.d);
                            return;
                        }
                        aVar = this;
                        throw new IllegalArgumentException(a.a + " | unsupported AdViews API");
                    default:
                        aVar = this;
                        throw new IllegalArgumentException(a.a + " | unsupported AdViews API");
                }
            } catch (Exception e4) {
                e = e4;
            }
        } catch (Exception e5) {
            e = e5;
            aVar = this;
        }
    }

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    /* renamed from: com.ironsource.sdk.controller.a$a, reason: collision with other inner class name */
    public static class C1211a {
        String a;
        JSONObject b;
        String c;
        String d;

        public /* synthetic */ C1211a(int i) {
            this();
        }

        private C1211a() {
        }
    }

    @Override // com.ironsource.InterfaceC4054e8
    public void a(String str, JSONObject jSONObject) {
        if (this.a == null || TextUtils.isEmpty(str)) {
            return;
        }
        this.a.a(str, jSONObject);
    }

    @Override // com.ironsource.InterfaceC4054e8
    public void a(String str, String str2, String str3) {
        a(str, Gg.a(str2, str3));
    }

    public void a(dh dhVar) {
        this.a = dhVar;
    }

    private C1211a a(String str) throws JSONException {
        JSONObject jSONObject = new JSONObject(str);
        C1211a c1211a = new C1211a(0);
        c1211a.a = jSONObject.optString("functionName");
        c1211a.b = jSONObject.optJSONObject("functionParams");
        c1211a.c = jSONObject.optString("success");
        c1211a.d = jSONObject.optString("fail");
        return c1211a;
    }
}
