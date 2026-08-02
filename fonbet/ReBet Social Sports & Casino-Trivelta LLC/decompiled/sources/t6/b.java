package t6;

import T7.Y;
import android.content.SharedPreferences;
import android.view.View;
import g6.C4331C;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public final class b {

    /* renamed from: c, reason: collision with root package name */
    public static SharedPreferences f65694c;

    /* renamed from: a, reason: collision with root package name */
    public static final b f65692a = new b();

    /* renamed from: b, reason: collision with root package name */
    public static final Map f65693b = new LinkedHashMap();

    /* renamed from: d, reason: collision with root package name */
    public static final AtomicBoolean f65695d = new AtomicBoolean(false);

    public static final void a(String pathID, String predictedEvent) {
        if (Y7.a.d(b.class)) {
            return;
        }
        try {
            Intrinsics.checkNotNullParameter(pathID, "pathID");
            Intrinsics.checkNotNullParameter(predictedEvent, "predictedEvent");
            if (!f65695d.get()) {
                f65692a.c();
            }
            Map map = f65693b;
            map.put(pathID, predictedEvent);
            SharedPreferences sharedPreferences = f65694c;
            if (sharedPreferences == null) {
                Intrinsics.throwUninitializedPropertyAccessException("shardPreferences");
                throw null;
            }
            SharedPreferences.Editor edit = sharedPreferences.edit();
            Y y10 = Y.f11042a;
            edit.putString("SUGGESTED_EVENTS_HISTORY", Y.m0(MapsKt.toMap(map))).apply();
        } catch (Throwable th2) {
            Y7.a.b(th2, b.class);
        }
    }

    public static final String b(View view, String text) {
        if (Y7.a.d(b.class)) {
            return null;
        }
        try {
            Intrinsics.checkNotNullParameter(view, "view");
            Intrinsics.checkNotNullParameter(text, "text");
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put("text", text);
                JSONArray jSONArray = new JSONArray();
                while (view != null) {
                    jSONArray.put(view.getClass().getSimpleName());
                    view = l6.f.j(view);
                }
                jSONObject.put("classname", jSONArray);
            } catch (JSONException unused) {
            }
            Y y10 = Y.f11042a;
            return Y.I0(jSONObject.toString());
        } catch (Throwable th2) {
            Y7.a.b(th2, b.class);
            return null;
        }
    }

    public static final String d(String pathID) {
        if (Y7.a.d(b.class)) {
            return null;
        }
        try {
            Intrinsics.checkNotNullParameter(pathID, "pathID");
            Map map = f65693b;
            if (map.containsKey(pathID)) {
                return (String) map.get(pathID);
            }
            return null;
        } catch (Throwable th2) {
            Y7.a.b(th2, b.class);
            return null;
        }
    }

    public final void c() {
        String str = "";
        if (Y7.a.d(this)) {
            return;
        }
        try {
            AtomicBoolean atomicBoolean = f65695d;
            if (atomicBoolean.get()) {
                return;
            }
            SharedPreferences sharedPreferences = C4331C.l().getSharedPreferences("com.facebook.internal.SUGGESTED_EVENTS_HISTORY", 0);
            Intrinsics.checkNotNullExpressionValue(sharedPreferences, "FacebookSdk.getApplicationContext()\n            .getSharedPreferences(CLICKED_PATH_STORE, Context.MODE_PRIVATE)");
            f65694c = sharedPreferences;
            Map map = f65693b;
            Y y10 = Y.f11042a;
            SharedPreferences sharedPreferences2 = f65694c;
            if (sharedPreferences2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("shardPreferences");
                throw null;
            }
            String string = sharedPreferences2.getString("SUGGESTED_EVENTS_HISTORY", "");
            if (string != null) {
                str = string;
            }
            map.putAll(Y.i0(str));
            atomicBoolean.set(true);
        } catch (Throwable th2) {
            Y7.a.b(th2, this);
        }
    }
}
