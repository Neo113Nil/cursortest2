package com.iab.omid.library.corpmailru.d;

import android.os.Build;
import com.ironsource.O6;
import com.ironsource.X3;
import org.json.JSONObject;
import ru.ok.android.webrtc.signaling.api.EndpointParameters;

/* loaded from: classes13.dex */
public final class a {
    public static String a() {
        return Build.MANUFACTURER + "; " + Build.MODEL;
    }

    public static String b() {
        return Integer.toString(Build.VERSION.SDK_INT);
    }

    public static String c() {
        return X3.d;
    }

    public static JSONObject d() {
        JSONObject jSONObject = new JSONObject();
        b.a(jSONObject, "deviceType", a());
        b.a(jSONObject, EndpointParameters.Name.OS_VERSION, b());
        b.a(jSONObject, O6.F, c());
        return jSONObject;
    }
}
