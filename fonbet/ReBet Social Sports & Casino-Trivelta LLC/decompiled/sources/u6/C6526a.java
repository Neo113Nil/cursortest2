package u6;

import T7.C1662b;
import T7.Y;
import T7.Z;
import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import com.facebook.GraphRequest;
import g6.C4331C;
import g6.C4357q;
import h6.p;
import java.util.Iterator;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: u6.a, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public class C6526a {

    /* renamed from: g, reason: collision with root package name */
    public static final String f66177g = "u6.a";

    /* renamed from: a, reason: collision with root package name */
    public String f66178a;

    /* renamed from: b, reason: collision with root package name */
    public Uri f66179b;

    /* renamed from: c, reason: collision with root package name */
    public JSONObject f66180c;

    /* renamed from: d, reason: collision with root package name */
    public Bundle f66181d;

    /* renamed from: e, reason: collision with root package name */
    public String f66182e;

    /* renamed from: f, reason: collision with root package name */
    public JSONObject f66183f;

    /* renamed from: u6.a$a, reason: collision with other inner class name */
    public class RunnableC0921a implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Context f66184a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ String f66185b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ b f66186c;

        public RunnableC0921a(Context context, String str, b bVar) {
            this.f66184a = context;
            this.f66185b = str;
            this.f66186c = bVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (Y7.a.d(this)) {
                return;
            }
            try {
                C6526a.e(this.f66184a, this.f66185b, this.f66186c);
            } catch (Throwable th2) {
                Y7.a.b(th2, this);
            }
        }
    }

    /* renamed from: u6.a$b */
    public interface b {
        void a(C6526a c6526a);
    }

    public static C6526a b(String str) {
        if (str == null) {
            return null;
        }
        try {
            JSONObject jSONObject = new JSONObject(str);
            String string = jSONObject.getString("version");
            if (jSONObject.getJSONObject("bridge_args").getString("method").equals("applink") && string.equals("2")) {
                C6526a c6526a = new C6526a();
                JSONObject jSONObject2 = jSONObject.getJSONObject("method_args");
                c6526a.f66180c = jSONObject2;
                if (jSONObject2.has("ref")) {
                    c6526a.f66178a = c6526a.f66180c.getString("ref");
                } else if (c6526a.f66180c.has("referer_data")) {
                    JSONObject jSONObject3 = c6526a.f66180c.getJSONObject("referer_data");
                    if (jSONObject3.has("fb_ref")) {
                        c6526a.f66178a = jSONObject3.getString("fb_ref");
                    }
                }
                if (c6526a.f66180c.has("target_url")) {
                    Uri parse = Uri.parse(c6526a.f66180c.getString("target_url"));
                    c6526a.f66179b = parse;
                    c6526a.f66183f = f(parse);
                }
                if (c6526a.f66180c.has("extras")) {
                    JSONObject jSONObject4 = c6526a.f66180c.getJSONObject("extras");
                    if (jSONObject4.has("deeplink_context")) {
                        JSONObject jSONObject5 = jSONObject4.getJSONObject("deeplink_context");
                        if (jSONObject5.has("promo_code")) {
                            c6526a.f66182e = jSONObject5.getString("promo_code");
                        }
                    }
                }
                c6526a.f66181d = h(c6526a.f66180c);
                return c6526a;
            }
        } catch (C4357q e10) {
            Y.l0(f66177g, "Unable to parse AppLink JSON", e10);
        } catch (JSONException e11) {
            Y.l0(f66177g, "Unable to parse AppLink JSON", e11);
        }
        return null;
    }

    public static void c(Context context, String str, b bVar) {
        Z.m(context, "context");
        Z.m(bVar, "completionHandler");
        if (str == null) {
            str = Y.J(context);
        }
        Z.m(str, "applicationId");
        C4331C.t().execute(new RunnableC0921a(context.getApplicationContext(), str, bVar));
    }

    public static void d(Context context, b bVar) {
        c(context, null, bVar);
    }

    public static void e(Context context, String str, b bVar) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("event", "DEFERRED_APP_LINK");
            Y.F0(jSONObject, C1662b.k(context), p.c(context), C4331C.z(context), context);
            Y.G0(jSONObject, C4331C.l());
            jSONObject.put("application_package_name", context.getPackageName());
            String format = String.format("%s/activities", str);
            C6526a c6526a = null;
            try {
                JSONObject c10 = GraphRequest.B(null, format, jSONObject, null).k().c();
                if (c10 != null) {
                    String optString = c10.optString("applink_args");
                    long optLong = c10.optLong("click_time", -1L);
                    String optString2 = c10.optString("applink_class");
                    String optString3 = c10.optString("applink_url");
                    if (!TextUtils.isEmpty(optString) && (c6526a = b(optString)) != null) {
                        if (optLong != -1) {
                            try {
                                JSONObject jSONObject2 = c6526a.f66180c;
                                if (jSONObject2 != null) {
                                    jSONObject2.put("com.facebook.platform.APPLINK_TAP_TIME_UTC", optLong);
                                }
                                Bundle bundle = c6526a.f66181d;
                                if (bundle != null) {
                                    bundle.putString("com.facebook.platform.APPLINK_TAP_TIME_UTC", Long.toString(optLong));
                                }
                            } catch (JSONException unused) {
                                Y.k0(f66177g, "Unable to put tap time in AppLinkData.arguments");
                            }
                        }
                        if (optString2 != null) {
                            try {
                                JSONObject jSONObject3 = c6526a.f66180c;
                                if (jSONObject3 != null) {
                                    jSONObject3.put("com.facebook.platform.APPLINK_NATIVE_CLASS", optString2);
                                }
                                Bundle bundle2 = c6526a.f66181d;
                                if (bundle2 != null) {
                                    bundle2.putString("com.facebook.platform.APPLINK_NATIVE_CLASS", optString2);
                                }
                            } catch (JSONException unused2) {
                                Y.k0(f66177g, "Unable to put app link class name in AppLinkData.arguments");
                            }
                        }
                        if (optString3 != null) {
                            try {
                                JSONObject jSONObject4 = c6526a.f66180c;
                                if (jSONObject4 != null) {
                                    jSONObject4.put("com.facebook.platform.APPLINK_NATIVE_URL", optString3);
                                }
                                Bundle bundle3 = c6526a.f66181d;
                                if (bundle3 != null) {
                                    bundle3.putString("com.facebook.platform.APPLINK_NATIVE_URL", optString3);
                                }
                            } catch (JSONException unused3) {
                                Y.k0(f66177g, "Unable to put app link URL in AppLinkData.arguments");
                            }
                        }
                    }
                }
            } catch (Exception unused4) {
                Y.k0(f66177g, "Unable to fetch deferred applink from server");
            }
            bVar.a(c6526a);
        } catch (JSONException e10) {
            throw new C4357q("An error occurred while preparing deferred app link", e10);
        }
    }

    public static JSONObject f(Uri uri) {
        if (Y7.a.d(C6526a.class) || uri == null) {
            return null;
        }
        try {
            String queryParameter = uri.getQueryParameter("al_applink_data");
            if (queryParameter == null) {
                return null;
            }
            try {
                return new JSONObject(queryParameter);
            } catch (JSONException unused) {
                return null;
            }
        } catch (Throwable th2) {
            Y7.a.b(th2, C6526a.class);
            return null;
        }
    }

    public static Bundle h(JSONObject jSONObject) {
        Bundle bundle = new Bundle();
        Iterator<String> keys = jSONObject.keys();
        while (keys.hasNext()) {
            String next = keys.next();
            Object obj = jSONObject.get(next);
            if (obj instanceof JSONObject) {
                bundle.putBundle(next, h((JSONObject) obj));
            } else if (obj instanceof JSONArray) {
                JSONArray jSONArray = (JSONArray) obj;
                int i10 = 0;
                if (jSONArray.length() == 0) {
                    bundle.putStringArray(next, new String[0]);
                } else {
                    Object obj2 = jSONArray.get(0);
                    if (obj2 instanceof JSONObject) {
                        Bundle[] bundleArr = new Bundle[jSONArray.length()];
                        while (i10 < jSONArray.length()) {
                            bundleArr[i10] = h(jSONArray.getJSONObject(i10));
                            i10++;
                        }
                        bundle.putParcelableArray(next, bundleArr);
                    } else {
                        if (obj2 instanceof JSONArray) {
                            throw new C4357q("Nested arrays are not supported.");
                        }
                        String[] strArr = new String[jSONArray.length()];
                        while (i10 < jSONArray.length()) {
                            strArr[i10] = jSONArray.get(i10).toString();
                            i10++;
                        }
                        bundle.putStringArray(next, strArr);
                    }
                }
            } else {
                bundle.putString(next, obj.toString());
            }
        }
        return bundle;
    }

    public Uri g() {
        return this.f66179b;
    }
}
