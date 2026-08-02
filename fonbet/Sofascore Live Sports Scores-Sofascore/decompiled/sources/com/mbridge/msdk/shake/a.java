package com.mbridge.msdk.shake;

import android.content.Context;
import android.hardware.Sensor;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import android.text.TextUtils;
import com.ironsource.U3;
import com.mbridge.msdk.foundation.controller.c;
import com.mbridge.msdk.foundation.same.report.metrics.d;
import com.mbridge.msdk.foundation.tools.q0;
import org.json.JSONObject;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes4.dex */
public class a {
    private SensorManager a;

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    public static class b {
        static a a = new a();
    }

    private static void a(Context context, String str) {
        if (context != null) {
            try {
                if (TextUtils.isEmpty(str)) {
                    return;
                }
                JSONObject jSONObject = new JSONObject();
                jSONObject.put(U3.i.W, "2000106");
                if (!TextUtils.isEmpty(com.mbridge.msdk.foundation.same.a.V)) {
                    jSONObject.put("b", com.mbridge.msdk.foundation.same.a.V);
                }
                if (!TextUtils.isEmpty(com.mbridge.msdk.foundation.same.a.g)) {
                    jSONObject.put(com.mbridge.msdk.foundation.controller.a.q, com.mbridge.msdk.foundation.same.a.g);
                }
                jSONObject.put("reason", str);
                d.b().a(jSONObject);
            } catch (Throwable th) {
                q0.b("NativeShakeManager", th.getMessage());
            }
        }
    }

    public void b(SensorEventListener sensorEventListener) {
        SensorManager sensorManager = this.a;
        if (sensorManager != null) {
            try {
                sensorManager.unregisterListener(sensorEventListener);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    private a() {
    }

    public void a(SensorEventListener sensorEventListener) {
        a(sensorEventListener, null, 2);
    }

    public void a(SensorEventListener sensorEventListener, Sensor sensor, int i) {
        Context d = c.n().d();
        if (d != null) {
            try {
                SensorManager sensorManager = this.a;
                if (sensorManager == null) {
                    sensorManager = (SensorManager) d.getSystemService("sensor");
                    this.a = sensorManager;
                }
                if (sensor == null) {
                    sensor = sensorManager.getDefaultSensor(1);
                }
                this.a.registerListener(sensorEventListener, sensor, i);
            } catch (Exception e) {
                e.printStackTrace();
                a(d, e.getMessage());
            }
        }
    }

    public static a a() {
        return b.a;
    }
}
