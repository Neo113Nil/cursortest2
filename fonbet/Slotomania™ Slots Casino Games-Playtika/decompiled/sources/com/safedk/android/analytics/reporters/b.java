package com.safedk.android.analytics.reporters;

import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import com.safedk.android.SafeDK;
import com.safedk.android.utils.e;
import com.safedk.android.utils.n;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes7.dex */
public abstract class b {
    public static final String a = "exceptions";
    public static final String b = "type";
    public static final String c = "message";
    public static final String d = "lines";
    public static final String e = "proguard_map_uuid";
    private static final String g = "build_params";
    private static final String h = "crash_stacktrace";
    private static final String i = "threads_traces";
    private static final String j = "is_low_memory";
    protected Context f;

    public b() {
        this.f = null;
        if (SafeDK.getInstance() != null) {
            this.f = SafeDK.getInstance().m();
        }
    }

    public b(Context context) {
        this.f = null;
        this.f = context;
    }

    protected JSONObject a(Throwable th, boolean z) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put(g, n.a(a()));
        jSONObject.put(j, e.b(this.f));
        jSONObject.put(h, a(th));
        if (z) {
            JSONArray jSONArray = new JSONArray();
            for (Map.Entry<Thread, StackTraceElement[]> entry : Thread.getAllStackTraces().entrySet()) {
                jSONArray.put(a(entry.getKey(), entry.getValue()));
            }
            jSONObject.put(i, jSONArray);
        }
        String proguardMD5 = SafeDK.getProguardMD5();
        if (!TextUtils.isEmpty(proguardMD5)) {
            jSONObject.put(e, proguardMD5);
        }
        return jSONObject;
    }

    private Bundle a() {
        Bundle bundle = new Bundle();
        a(Build.class, "", bundle);
        a(Build.VERSION.class, "VERSION", bundle);
        return bundle;
    }

    private void a(Class<?> cls, String str, Bundle bundle) {
        StringBuilder sb = new StringBuilder();
        for (Field field : cls.getFields()) {
            StringBuilder sb2 = new StringBuilder();
            if (str != null && str.length() > 0) {
                sb2.append(str);
                sb2.append('.');
            }
            sb2.append(field.getName());
            try {
                Object obj = field.get(null);
                if (obj != null) {
                    if (field.getType().isArray()) {
                        bundle.putParcelableArrayList(sb2.toString(), (ArrayList) Arrays.asList(obj));
                    } else {
                        bundle.putString(sb2.toString(), obj.toString());
                    }
                }
            } catch (IllegalAccessException e2) {
                sb.append("N/A");
            } catch (IllegalArgumentException e3) {
                sb.append("N/A");
            } catch (Exception e4) {
            }
        }
    }

    protected JSONObject a(Throwable th) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        JSONArray jSONArray = new JSONArray();
        jSONObject.put(a, jSONArray);
        a(th, jSONArray);
        for (Throwable cause = th.getCause(); cause != null; cause = cause.getCause()) {
            a(cause, jSONArray);
        }
        return jSONObject;
    }

    private void a(Throwable th, JSONArray jSONArray) throws JSONException {
        if (th == null) {
            return;
        }
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("type", th.getClass());
        jSONObject.put("message", th.getMessage());
        a(jSONObject, th.getStackTrace());
        jSONArray.put(jSONObject);
    }

    private void a(JSONObject jSONObject, StackTraceElement[] stackTraceElementArr) throws JSONException {
        JSONArray jSONArray = new JSONArray();
        for (StackTraceElement stackTraceElement : stackTraceElementArr) {
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("c", stackTraceElement.getClassName());
            jSONObject2.put("m", stackTraceElement.getMethodName());
            jSONObject2.put("f", stackTraceElement.getFileName());
            jSONObject2.put("l", stackTraceElement.getLineNumber());
            jSONObject2.put("n", stackTraceElement.isNativeMethod());
            jSONArray.put(jSONObject2);
        }
        jSONObject.put(d, jSONArray);
    }

    protected JSONObject a(Thread thread, StackTraceElement[] stackTraceElementArr) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("name", thread.getName());
        a(jSONObject, stackTraceElementArr);
        return jSONObject;
    }
}
