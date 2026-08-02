package j6;

import T7.J;
import T7.Y;
import android.content.SharedPreferences;
import com.facebook.GraphRequest;
import com.twilio.voice.EventKeys;
import g6.C4331C;
import g6.C4339K;
import g6.EnumC4340L;
import g6.N;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.ExceptionsKt;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    public static final d f53690a = new d();

    /* renamed from: b, reason: collision with root package name */
    public static final String f53691b = d.class.getCanonicalName();

    /* renamed from: c, reason: collision with root package name */
    public static boolean f53692c;

    public static final void b() {
        try {
            GraphRequest graphRequest = new GraphRequest(null, Intrinsics.stringPlus(C4331C.m(), "/cloudbridge_settings"), null, EnumC4340L.GET, new GraphRequest.b() { // from class: j6.c
                @Override // com.facebook.GraphRequest.b
                public final void a(C4339K c4339k) {
                    d.c(c4339k);
                }
            }, null, 32, null);
            J.a aVar = J.f10993e;
            N n10 = N.APP_EVENTS;
            String str = f53691b;
            if (str == null) {
                throw new NullPointerException("null cannot be cast to non-null type kotlin.String");
            }
            aVar.c(n10, str, " \n\nCreating Graph Request: \n=============\n%s\n\n ", graphRequest);
            graphRequest.l();
        } catch (JSONException e10) {
            J.a aVar2 = J.f10993e;
            N n11 = N.APP_EVENTS;
            String str2 = f53691b;
            if (str2 == null) {
                throw new NullPointerException("null cannot be cast to non-null type kotlin.String");
            }
            aVar2.c(n11, str2, " \n\nGraph Request Exception: \n=============\n%s\n\n ", ExceptionsKt.stackTraceToString(e10));
        }
    }

    public static final void c(C4339K response) {
        Intrinsics.checkNotNullParameter(response, "response");
        f53690a.d(response);
    }

    public static final Map e() {
        if (Y7.a.d(d.class)) {
            return null;
        }
        try {
            SharedPreferences sharedPreferences = C4331C.l().getSharedPreferences("com.facebook.sdk.CloudBridgeSavedCredentials", 0);
            if (sharedPreferences == null) {
                return null;
            }
            o oVar = o.DATASETID;
            String string = sharedPreferences.getString(oVar.b(), null);
            o oVar2 = o.URL;
            String string2 = sharedPreferences.getString(oVar2.b(), null);
            o oVar3 = o.ACCESSKEY;
            String string3 = sharedPreferences.getString(oVar3.b(), null);
            if (string != null && !StringsKt.isBlank(string) && string2 != null && !StringsKt.isBlank(string2) && string3 != null && !StringsKt.isBlank(string3)) {
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                linkedHashMap.put(oVar2.b(), string2);
                linkedHashMap.put(oVar.b(), string);
                linkedHashMap.put(oVar3.b(), string3);
                J.f10993e.c(N.APP_EVENTS, f53691b.toString(), " \n\nLoading Cloudbridge settings from saved Prefs: \n================\n DATASETID: %s\n URL: %s \n ACCESSKEY: %s \n\n ", string, string2, string3);
                return linkedHashMap;
            }
            return null;
        } catch (Throwable th2) {
            Y7.a.b(th2, d.class);
            return null;
        }
    }

    public final void d(C4339K response) {
        boolean z10;
        Intrinsics.checkNotNullParameter(response, "response");
        if (response.b() != null) {
            J.a aVar = J.f10993e;
            N n10 = N.APP_EVENTS;
            String str = f53691b;
            if (str == null) {
                throw new NullPointerException("null cannot be cast to non-null type kotlin.String");
            }
            aVar.c(n10, str, " \n\nGraph Response Error: \n================\nResponse Error: %s\nResponse Error Exception: %s\n\n ", response.b().toString(), String.valueOf(response.b().getException()));
            Map e10 = e();
            if (e10 != null) {
                URL url = new URL(String.valueOf(e10.get(o.URL.b())));
                g gVar = g.f53711a;
                g.d(String.valueOf(e10.get(o.DATASETID.b())), url.getProtocol() + "://" + ((Object) url.getHost()), String.valueOf(e10.get(o.ACCESSKEY.b())));
                f53692c = true;
                return;
            }
            return;
        }
        J.a aVar2 = J.f10993e;
        N n11 = N.APP_EVENTS;
        String TAG = f53691b;
        if (TAG == null) {
            throw new NullPointerException("null cannot be cast to non-null type kotlin.String");
        }
        aVar2.c(n11, TAG, " \n\nGraph Response Received: \n================\n%s\n\n ", response);
        JSONObject c10 = response.c();
        try {
            Y y10 = Y.f11042a;
            Object obj = c10 == null ? null : c10.get(EventKeys.DATA);
            if (obj == null) {
                throw new NullPointerException("null cannot be cast to non-null type org.json.JSONArray");
            }
            Map n12 = Y.n(new JSONObject((String) CollectionsKt.firstOrNull(Y.m((JSONArray) obj))));
            String str2 = (String) n12.get(o.URL.b());
            String str3 = (String) n12.get(o.DATASETID.b());
            String str4 = (String) n12.get(o.ACCESSKEY.b());
            if (str2 == null || str3 == null || str4 == null) {
                Intrinsics.checkNotNullExpressionValue(TAG, "TAG");
                aVar2.b(n11, TAG, "CloudBridge Settings API response doesn't have valid data");
                return;
            }
            try {
                g.d(str3, str2, str4);
                g(n12);
                o oVar = o.ENABLED;
                if (n12.get(oVar.b()) != null) {
                    Object obj2 = n12.get(oVar.b());
                    if (obj2 == null) {
                        throw new NullPointerException("null cannot be cast to non-null type kotlin.Boolean");
                    }
                    z10 = ((Boolean) obj2).booleanValue();
                } else {
                    z10 = false;
                }
                f53692c = z10;
            } catch (MalformedURLException e11) {
                J.a aVar3 = J.f10993e;
                N n13 = N.APP_EVENTS;
                String TAG2 = f53691b;
                Intrinsics.checkNotNullExpressionValue(TAG2, "TAG");
                aVar3.c(n13, TAG2, "CloudBridge Settings API response doesn't have valid url\n %s ", ExceptionsKt.stackTraceToString(e11));
            }
        } catch (NullPointerException e12) {
            J.a aVar4 = J.f10993e;
            N n14 = N.APP_EVENTS;
            String TAG3 = f53691b;
            Intrinsics.checkNotNullExpressionValue(TAG3, "TAG");
            aVar4.c(n14, TAG3, "CloudBridge Settings API response is not a valid json: \n%s ", ExceptionsKt.stackTraceToString(e12));
        } catch (JSONException e13) {
            J.a aVar5 = J.f10993e;
            N n15 = N.APP_EVENTS;
            String TAG4 = f53691b;
            Intrinsics.checkNotNullExpressionValue(TAG4, "TAG");
            aVar5.c(n15, TAG4, "CloudBridge Settings API response is not a valid json: \n%s ", ExceptionsKt.stackTraceToString(e13));
        }
    }

    public final boolean f() {
        return f53692c;
    }

    public final void g(Map map) {
        SharedPreferences sharedPreferences = C4331C.l().getSharedPreferences("com.facebook.sdk.CloudBridgeSavedCredentials", 0);
        if (sharedPreferences == null) {
            return;
        }
        if (map == null) {
            SharedPreferences.Editor edit = sharedPreferences.edit();
            edit.clear();
            edit.apply();
            return;
        }
        o oVar = o.DATASETID;
        Object obj = map.get(oVar.b());
        o oVar2 = o.URL;
        Object obj2 = map.get(oVar2.b());
        o oVar3 = o.ACCESSKEY;
        Object obj3 = map.get(oVar3.b());
        if (obj == null || obj2 == null || obj3 == null) {
            return;
        }
        SharedPreferences.Editor edit2 = sharedPreferences.edit();
        edit2.putString(oVar.b(), obj.toString());
        edit2.putString(oVar2.b(), obj2.toString());
        edit2.putString(oVar3.b(), obj3.toString());
        edit2.apply();
        J.f10993e.c(N.APP_EVENTS, f53691b.toString(), " \n\nSaving Cloudbridge settings from saved Prefs: \n================\n DATASETID: %s\n URL: %s \n ACCESSKEY: %s \n\n ", obj, obj2, obj3);
    }
}
