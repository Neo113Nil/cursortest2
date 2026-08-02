package com.iab.omid.library.ironsrc.utils;

import android.os.Build;
import com.ironsource.O6;
import com.ironsource.X3;
import org.json.JSONObject;
import ru.ok.android.webrtc.signaling.api.EndpointParameters;

/* loaded from: classes13.dex */
public final class b {
    public static String a() {
        return Build.MANUFACTURER + "; " + Build.MODEL;
    }

    public static String b() {
        return X3.d;
    }

    public static String c() {
        return Integer.toString(Build.VERSION.SDK_INT);
    }

    public static JSONObject d() {
        JSONObject jSONObject = new JSONObject();
        c.a(jSONObject, "deviceType", a());
        c.a(jSONObject, EndpointParameters.Name.OS_VERSION, c());
        c.a(jSONObject, O6.F, b());
        return jSONObject;
    }
}
