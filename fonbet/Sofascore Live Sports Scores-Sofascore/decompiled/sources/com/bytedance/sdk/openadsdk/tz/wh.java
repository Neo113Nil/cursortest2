package com.bytedance.sdk.openadsdk.tz;

import android.content.Context;
import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import com.ironsource.L6;
import com.ironsource.U3;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import org.json.JSONArray;
import org.json.JSONObject;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public class wh {
    private Context pcc;
    private WeakReference<kj> sf;
    private Map<String, pcc> gm = new HashMap();
    private SensorEventListener oo = new SensorEventListener() { // from class: com.bytedance.sdk.openadsdk.tz.wh.1
        @Override // android.hardware.SensorEventListener
        public void onSensorChanged(SensorEvent sensorEvent) {
            kj oo;
            if (sensorEvent.sensor.getType() != 1 || (oo = wh.this.oo()) == null) {
                return;
            }
            float[] fArr = sensorEvent.values;
            float f = fArr[0];
            float f2 = fArr[1];
            float f3 = fArr[2];
            try {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("x", f);
                jSONObject.put("y", f2);
                jSONObject.put("z", f3);
                oo.pcc("accelerometer_callback", jSONObject);
            } catch (Throwable unused) {
            }
        }

        @Override // android.hardware.SensorEventListener
        public void onAccuracyChanged(Sensor sensor, int i) {
        }
    };
    private SensorEventListener vj = new SensorEventListener() { // from class: com.bytedance.sdk.openadsdk.tz.wh.12
        @Override // android.hardware.SensorEventListener
        public void onSensorChanged(SensorEvent sensorEvent) {
            kj oo;
            if (sensorEvent.sensor.getType() != 4 || (oo = wh.this.oo()) == null) {
                return;
            }
            float degrees = (float) Math.toDegrees(sensorEvent.values[0]);
            float degrees2 = (float) Math.toDegrees(sensorEvent.values[1]);
            float degrees3 = (float) Math.toDegrees(sensorEvent.values[2]);
            try {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("x", degrees);
                jSONObject.put("y", degrees2);
                jSONObject.put("z", degrees3);
                oo.pcc("gyro_callback", jSONObject);
            } catch (Throwable unused) {
            }
        }

        @Override // android.hardware.SensorEventListener
        public void onAccuracyChanged(Sensor sensor, int i) {
        }
    };
    private SensorEventListener wh = new SensorEventListener() { // from class: com.bytedance.sdk.openadsdk.tz.wh.23
        @Override // android.hardware.SensorEventListener
        public void onSensorChanged(SensorEvent sensorEvent) {
            kj oo;
            if (sensorEvent.sensor.getType() != 10 || (oo = wh.this.oo()) == null) {
                return;
            }
            float[] fArr = sensorEvent.values;
            float f = fArr[0];
            float f2 = fArr[1];
            float f3 = fArr[2];
            try {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("x", f);
                jSONObject.put("y", f2);
                jSONObject.put("z", f3);
                oo.pcc("accelerometer_grativityless_callback", jSONObject);
            } catch (Throwable unused) {
            }
        }

        @Override // android.hardware.SensorEventListener
        public void onAccuracyChanged(Sensor sensor, int i) {
        }
    };
    private SensorEventListener qf = new SensorEventListener() { // from class: com.bytedance.sdk.openadsdk.tz.wh.34
        @Override // android.hardware.SensorEventListener
        public void onSensorChanged(SensorEvent sensorEvent) {
            if (sensorEvent.sensor.getType() == 1) {
                float[] fArr = sensorEvent.values;
                float[] fArr2 = ork.sf;
                System.arraycopy(fArr, 0, fArr2, 0, fArr2.length);
            } else if (sensorEvent.sensor.getType() == 2) {
                float[] fArr3 = sensorEvent.values;
                float[] fArr4 = ork.gm;
                System.arraycopy(fArr3, 0, fArr4, 0, fArr4.length);
            }
            float[] fArr5 = ork.oo;
            SensorManager.getRotationMatrix(fArr5, null, ork.sf, ork.gm);
            float[] fArr6 = ork.vj;
            SensorManager.getOrientation(fArr5, fArr6);
            kj oo = wh.this.oo();
            if (oo == null) {
                return;
            }
            float f = fArr6[0];
            float f2 = fArr6[1];
            float f3 = fArr6[2];
            try {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("alpha", f);
                jSONObject.put("beta", f2);
                jSONObject.put("gamma", f3);
                oo.pcc("rotation_vector_callback", jSONObject);
            } catch (Throwable unused) {
            }
        }

        @Override // android.hardware.SensorEventListener
        public void onAccuracyChanged(Sensor sensor, int i) {
        }
    };

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    public interface pcc {
        JSONObject pcc(JSONObject jSONObject) throws Throwable;
    }

    public wh(kj kjVar) {
        this.pcc = kjVar.pcc();
        this.sf = new WeakReference<>(kjVar);
        gm();
    }

    private void gm() {
        this.gm.put("adInfo", new pcc() { // from class: com.bytedance.sdk.openadsdk.tz.wh.45
            @Override // com.bytedance.sdk.openadsdk.tz.wh.pcc
            public JSONObject pcc(JSONObject jSONObject) throws Throwable {
                kj oo = wh.this.oo();
                if (oo == null) {
                    JSONObject jSONObject2 = new JSONObject();
                    jSONObject2.put("code", -1);
                    return jSONObject2;
                }
                JSONObject gpj = oo.gpj();
                if (gpj != null) {
                    gpj.put("code", 1);
                    return gpj;
                }
                JSONObject jSONObject3 = new JSONObject();
                jSONObject3.put("code", -1);
                return jSONObject3;
            }
        });
        this.gm.put("appInfo", new pcc() { // from class: com.bytedance.sdk.openadsdk.tz.wh.56
            @Override // com.bytedance.sdk.openadsdk.tz.wh.pcc
            public JSONObject pcc(JSONObject jSONObject) throws Throwable {
                JSONObject jSONObject2 = new JSONObject();
                jSONObject2.put("code", 1);
                jSONObject2.put("appName", "playable_sdk");
                jSONObject2.put("playableSdkEdition", "6.6.0");
                JSONArray jSONArray = new JSONArray();
                Iterator<String> it = wh.this.pcc().iterator();
                while (it.hasNext()) {
                    jSONArray.put(it.next());
                }
                jSONObject2.put("supportList", jSONArray);
                kj oo = wh.this.oo();
                if (oo != null) {
                    jSONObject2.put("deviceId", oo.qf());
                    jSONObject2.put("netType", oo.dax());
                    jSONObject2.put("innerAppName", oo.oo());
                    jSONObject2.put("appName", oo.vj());
                    jSONObject2.put(U3.j.W, oo.wh());
                    Map<String, String> sf = oo.sf();
                    for (String str : sf.keySet()) {
                        jSONObject2.put(str, sf.get(str));
                    }
                }
                return jSONObject2;
            }
        });
        this.gm.put("playableSDKInfo", new pcc() { // from class: com.bytedance.sdk.openadsdk.tz.wh.62
            @Override // com.bytedance.sdk.openadsdk.tz.wh.pcc
            public JSONObject pcc(JSONObject jSONObject) throws Throwable {
                JSONObject jSONObject2 = new JSONObject();
                jSONObject2.put("code", 1);
                jSONObject2.put("appName", "playable_sdk");
                jSONObject2.put("playableSdkEdition", "6.6.0");
                jSONObject2.put(L6.F, "android");
                return jSONObject2;
            }
        });
        this.gm.put("subscribe_app_ad", new pcc() { // from class: com.bytedance.sdk.openadsdk.tz.wh.63
            @Override // com.bytedance.sdk.openadsdk.tz.wh.pcc
            public JSONObject pcc(JSONObject jSONObject) throws Throwable {
                com.bytedance.sdk.openadsdk.tz.pcc vj = wh.this.vj();
                JSONObject jSONObject2 = new JSONObject();
                if (vj == null) {
                    jSONObject2.put("code", -1);
                    return jSONObject2;
                }
                jSONObject2.put("code", 1);
                return jSONObject2;
            }
        });
        this.gm.put("download_app_ad", new pcc() { // from class: com.bytedance.sdk.openadsdk.tz.wh.64
            @Override // com.bytedance.sdk.openadsdk.tz.wh.pcc
            public JSONObject pcc(JSONObject jSONObject) throws Throwable {
                com.bytedance.sdk.openadsdk.tz.pcc vj = wh.this.vj();
                JSONObject jSONObject2 = new JSONObject();
                if (vj == null) {
                    jSONObject2.put("code", -1);
                    return jSONObject2;
                }
                jSONObject2.put("code", 1);
                return jSONObject2;
            }
        });
        this.gm.put(U3.i.o, new pcc() { // from class: com.bytedance.sdk.openadsdk.tz.wh.2
            @Override // com.bytedance.sdk.openadsdk.tz.wh.pcc
            public JSONObject pcc(JSONObject jSONObject) throws Throwable {
                kj oo = wh.this.oo();
                if (oo == null) {
                    JSONObject jSONObject2 = new JSONObject();
                    jSONObject2.put("code", -1);
                    return jSONObject2;
                }
                JSONObject jSONObject3 = new JSONObject();
                jSONObject3.put("code", 1);
                jSONObject3.put("viewStatus", oo.vy());
                return jSONObject3;
            }
        });
        this.gm.put("getVolume", new pcc() { // from class: com.bytedance.sdk.openadsdk.tz.wh.3
            @Override // com.bytedance.sdk.openadsdk.tz.wh.pcc
            public JSONObject pcc(JSONObject jSONObject) throws Throwable {
                kj oo = wh.this.oo();
                if (oo == null) {
                    JSONObject jSONObject2 = new JSONObject();
                    jSONObject2.put("code", -1);
                    return jSONObject2;
                }
                JSONObject jSONObject3 = new JSONObject();
                jSONObject3.put("code", 1);
                jSONObject3.put("endcard_mute", oo.kj());
                return jSONObject3;
            }
        });
        this.gm.put("getScreenSize", new pcc() { // from class: com.bytedance.sdk.openadsdk.tz.wh.4
            @Override // com.bytedance.sdk.openadsdk.tz.wh.pcc
            public JSONObject pcc(JSONObject jSONObject) throws Throwable {
                kj oo = wh.this.oo();
                if (oo == null) {
                    JSONObject jSONObject2 = new JSONObject();
                    jSONObject2.put("code", -1);
                    return jSONObject2;
                }
                JSONObject lu = oo.lu();
                lu.put("code", 1);
                return lu;
            }
        });
        this.gm.put("start_accelerometer_observer", new pcc() { // from class: com.bytedance.sdk.openadsdk.tz.wh.5
            @Override // com.bytedance.sdk.openadsdk.tz.wh.pcc
            public JSONObject pcc(JSONObject jSONObject) throws Throwable {
                JSONObject jSONObject2 = new JSONObject();
                int i = 2;
                if (jSONObject != null) {
                    try {
                        i = jSONObject.optInt("interval_android", 2);
                    } catch (Throwable th) {
                        qf.pcc("PlayableJsBridge", "invoke start_accelerometer_observer error", th);
                        jSONObject2.put("code", -1);
                        jSONObject2.put("codeMsg", th.toString());
                        return jSONObject2;
                    }
                }
                ork.pcc(wh.this.pcc, wh.this.oo, i);
                jSONObject2.put("code", 1);
                return jSONObject2;
            }
        });
        this.gm.put("close_accelerometer_observer", new pcc() { // from class: com.bytedance.sdk.openadsdk.tz.wh.6
            @Override // com.bytedance.sdk.openadsdk.tz.wh.pcc
            public JSONObject pcc(JSONObject jSONObject) throws Throwable {
                JSONObject jSONObject2 = new JSONObject();
                try {
                    ork.pcc(wh.this.pcc, wh.this.oo);
                    jSONObject2.put("code", 1);
                    return jSONObject2;
                } catch (Throwable th) {
                    qf.pcc("PlayableJsBridge", "invoke close_accelerometer_observer error", th);
                    jSONObject2.put("code", -1);
                    jSONObject2.put("codeMsg", th.toString());
                    return jSONObject2;
                }
            }
        });
        this.gm.put("start_gyro_observer", new pcc() { // from class: com.bytedance.sdk.openadsdk.tz.wh.7
            @Override // com.bytedance.sdk.openadsdk.tz.wh.pcc
            public JSONObject pcc(JSONObject jSONObject) throws Throwable {
                JSONObject jSONObject2 = new JSONObject();
                int i = 2;
                if (jSONObject != null) {
                    try {
                        i = jSONObject.optInt("interval_android", 2);
                    } catch (Throwable th) {
                        qf.pcc("PlayableJsBridge", "invoke start_gyro_observer error", th);
                        jSONObject2.put("code", -1);
                        jSONObject2.put("codeMsg", th.toString());
                        return jSONObject2;
                    }
                }
                ork.sf(wh.this.pcc, wh.this.vj, i);
                jSONObject2.put("code", 1);
                return jSONObject2;
            }
        });
        this.gm.put("close_gyro_observer", new pcc() { // from class: com.bytedance.sdk.openadsdk.tz.wh.8
            @Override // com.bytedance.sdk.openadsdk.tz.wh.pcc
            public JSONObject pcc(JSONObject jSONObject) throws Throwable {
                JSONObject jSONObject2 = new JSONObject();
                try {
                    ork.pcc(wh.this.pcc, wh.this.vj);
                    jSONObject2.put("code", 1);
                    return jSONObject2;
                } catch (Throwable th) {
                    qf.pcc("PlayableJsBridge", "invoke close_gyro_observer error", th);
                    jSONObject2.put("code", -1);
                    jSONObject2.put("codeMsg", th.toString());
                    return jSONObject2;
                }
            }
        });
        this.gm.put("start_accelerometer_grativityless_observer", new pcc() { // from class: com.bytedance.sdk.openadsdk.tz.wh.9
            @Override // com.bytedance.sdk.openadsdk.tz.wh.pcc
            public JSONObject pcc(JSONObject jSONObject) throws Throwable {
                JSONObject jSONObject2 = new JSONObject();
                int i = 2;
                if (jSONObject != null) {
                    try {
                        i = jSONObject.optInt("interval_android", 2);
                    } catch (Throwable th) {
                        qf.pcc("PlayableJsBridge", "invoke start_accelerometer_grativityless_observer error", th);
                        jSONObject2.put("code", -1);
                        jSONObject2.put("codeMsg", th.toString());
                        return jSONObject2;
                    }
                }
                ork.gm(wh.this.pcc, wh.this.wh, i);
                jSONObject2.put("code", 1);
                return jSONObject2;
            }
        });
        this.gm.put("close_accelerometer_grativityless_observer", new pcc() { // from class: com.bytedance.sdk.openadsdk.tz.wh.10
            @Override // com.bytedance.sdk.openadsdk.tz.wh.pcc
            public JSONObject pcc(JSONObject jSONObject) throws Throwable {
                JSONObject jSONObject2 = new JSONObject();
                try {
                    ork.pcc(wh.this.pcc, wh.this.wh);
                    jSONObject2.put("code", 1);
                    return jSONObject2;
                } catch (Throwable th) {
                    qf.pcc("PlayableJsBridge", "invoke close_accelerometer_grativityless_observer error", th);
                    jSONObject2.put("code", -1);
                    jSONObject2.put("codeMsg", th.toString());
                    return jSONObject2;
                }
            }
        });
        this.gm.put("start_rotation_vector_observer", new pcc() { // from class: com.bytedance.sdk.openadsdk.tz.wh.11
            @Override // com.bytedance.sdk.openadsdk.tz.wh.pcc
            public JSONObject pcc(JSONObject jSONObject) throws Throwable {
                JSONObject jSONObject2 = new JSONObject();
                int i = 2;
                if (jSONObject != null) {
                    try {
                        i = jSONObject.optInt("interval_android", 2);
                    } catch (Throwable th) {
                        qf.pcc("PlayableJsBridge", "invoke start_rotation_vector_observer error", th);
                        jSONObject2.put("code", -1);
                        jSONObject2.put("codeMsg", th.toString());
                        return jSONObject2;
                    }
                }
                ork.oo(wh.this.pcc, wh.this.qf, i);
                jSONObject2.put("code", 1);
                return jSONObject2;
            }
        });
        this.gm.put("close_rotation_vector_observer", new pcc() { // from class: com.bytedance.sdk.openadsdk.tz.wh.13
            @Override // com.bytedance.sdk.openadsdk.tz.wh.pcc
            public JSONObject pcc(JSONObject jSONObject) throws Throwable {
                JSONObject jSONObject2 = new JSONObject();
                try {
                    ork.pcc(wh.this.pcc, wh.this.qf);
                    jSONObject2.put("code", 1);
                    return jSONObject2;
                } catch (Throwable th) {
                    qf.pcc("PlayableJsBridge", "invoke close_rotation_vector_observer error", th);
                    jSONObject2.put("code", -1);
                    jSONObject2.put("codeMsg", th.toString());
                    return jSONObject2;
                }
            }
        });
        this.gm.put("device_shake", new pcc() { // from class: com.bytedance.sdk.openadsdk.tz.wh.14
            @Override // com.bytedance.sdk.openadsdk.tz.wh.pcc
            public JSONObject pcc(JSONObject jSONObject) throws Throwable {
                JSONObject jSONObject2 = new JSONObject();
                try {
                    ork.pcc(wh.this.pcc, 300L);
                    jSONObject2.put("code", 1);
                    return jSONObject2;
                } catch (Throwable th) {
                    qf.pcc("PlayableJsBridge", "invoke device_shake error", th);
                    jSONObject2.put("code", -1);
                    jSONObject2.put("codeMsg", th.toString());
                    return jSONObject2;
                }
            }
        });
        this.gm.put("device_shake_short", new pcc() { // from class: com.bytedance.sdk.openadsdk.tz.wh.15
            @Override // com.bytedance.sdk.openadsdk.tz.wh.pcc
            public JSONObject pcc(JSONObject jSONObject) throws Throwable {
                JSONObject jSONObject2 = new JSONObject();
                try {
                    ork.pcc(wh.this.pcc, 150L);
                    jSONObject2.put("code", 1);
                    return jSONObject2;
                } catch (Throwable th) {
                    qf.pcc("PlayableJsBridge", "invoke device_shake error", th);
                    jSONObject2.put("code", -1);
                    jSONObject2.put("codeMsg", th.toString());
                    return jSONObject2;
                }
            }
        });
        this.gm.put("playable_style", new pcc() { // from class: com.bytedance.sdk.openadsdk.tz.wh.16
            @Override // com.bytedance.sdk.openadsdk.tz.wh.pcc
            public JSONObject pcc(JSONObject jSONObject) throws Throwable {
                kj oo = wh.this.oo();
                JSONObject jSONObject2 = new JSONObject();
                if (oo == null) {
                    jSONObject2.put("code", -1);
                    return jSONObject2;
                }
                JSONObject gm = oo.gm();
                gm.put("code", 1);
                return gm;
            }
        });
        this.gm.put("sendReward", new pcc() { // from class: com.bytedance.sdk.openadsdk.tz.wh.17
            @Override // com.bytedance.sdk.openadsdk.tz.wh.pcc
            public JSONObject pcc(JSONObject jSONObject) throws Throwable {
                kj oo = wh.this.oo();
                JSONObject jSONObject2 = new JSONObject();
                if (oo == null) {
                    jSONObject2.put("code", -1);
                    return jSONObject2;
                }
                oo.fum();
                jSONObject2.put("code", 1);
                return jSONObject2;
            }
        });
        this.gm.put("playableInteractionTriggered", new pcc() { // from class: com.bytedance.sdk.openadsdk.tz.wh.18
            @Override // com.bytedance.sdk.openadsdk.tz.wh.pcc
            public JSONObject pcc(JSONObject jSONObject) throws Throwable {
                kj oo = wh.this.oo();
                JSONObject jSONObject2 = new JSONObject();
                if (oo == null) {
                    jSONObject2.put("code", -1);
                    return jSONObject2;
                }
                oo.tz();
                jSONObject2.put("code", 1);
                return jSONObject2;
            }
        });
        this.gm.put("webview_time_track", new pcc() { // from class: com.bytedance.sdk.openadsdk.tz.wh.19
            @Override // com.bytedance.sdk.openadsdk.tz.wh.pcc
            public JSONObject pcc(JSONObject jSONObject) throws Throwable {
                return new JSONObject();
            }
        });
        this.gm.put("playable_event", new pcc() { // from class: com.bytedance.sdk.openadsdk.tz.wh.20
            @Override // com.bytedance.sdk.openadsdk.tz.wh.pcc
            public JSONObject pcc(JSONObject jSONObject) throws Throwable {
                kj oo = wh.this.oo();
                JSONObject jSONObject2 = new JSONObject();
                if (oo == null || jSONObject == null) {
                    jSONObject2.put("code", -1);
                    return jSONObject2;
                }
                oo.sf(jSONObject.optString("event", null), jSONObject.optJSONObject("params"));
                jSONObject2.put("code", 1);
                return jSONObject2;
            }
        });
        this.gm.put("reportAd", new pcc() { // from class: com.bytedance.sdk.openadsdk.tz.wh.21
            @Override // com.bytedance.sdk.openadsdk.tz.wh.pcc
            public JSONObject pcc(JSONObject jSONObject) throws Throwable {
                kj oo = wh.this.oo();
                JSONObject jSONObject2 = new JSONObject();
                if (oo == null) {
                    jSONObject2.put("code", -1);
                    return jSONObject2;
                }
                jSONObject2.put("code", 1);
                return jSONObject2;
            }
        });
        this.gm.put(CampaignEx.JSON_NATIVE_VIDEO_CLOSE, new pcc() { // from class: com.bytedance.sdk.openadsdk.tz.wh.22
            @Override // com.bytedance.sdk.openadsdk.tz.wh.pcc
            public JSONObject pcc(JSONObject jSONObject) throws Throwable {
                kj oo = wh.this.oo();
                JSONObject jSONObject2 = new JSONObject();
                if (oo == null) {
                    jSONObject2.put("code", -1);
                    return jSONObject2;
                }
                jSONObject2.put("code", 1);
                return jSONObject2;
            }
        });
        this.gm.put("openAdLandPageLinks", new pcc() { // from class: com.bytedance.sdk.openadsdk.tz.wh.24
            @Override // com.bytedance.sdk.openadsdk.tz.wh.pcc
            public JSONObject pcc(JSONObject jSONObject) throws Throwable {
                kj oo = wh.this.oo();
                JSONObject jSONObject2 = new JSONObject();
                if (oo == null) {
                    jSONObject2.put("code", -1);
                    return jSONObject2;
                }
                jSONObject2.put("code", 1);
                return jSONObject2;
            }
        });
        this.gm.put("get_viewport", new pcc() { // from class: com.bytedance.sdk.openadsdk.tz.wh.25
            @Override // com.bytedance.sdk.openadsdk.tz.wh.pcc
            public JSONObject pcc(JSONObject jSONObject) throws Throwable {
                kj oo = wh.this.oo();
                JSONObject jSONObject2 = new JSONObject();
                if (oo == null) {
                    jSONObject2.put("code", -1);
                    return jSONObject2;
                }
                JSONObject lo = oo.lo();
                lo.put("code", 1);
                return lo;
            }
        });
        this.gm.put("jssdk_load_finish", new pcc() { // from class: com.bytedance.sdk.openadsdk.tz.wh.26
            @Override // com.bytedance.sdk.openadsdk.tz.wh.pcc
            public JSONObject pcc(JSONObject jSONObject) throws Throwable {
                kj oo = wh.this.oo();
                JSONObject jSONObject2 = new JSONObject();
                if (oo == null) {
                    jSONObject2.put("code", -1);
                    return jSONObject2;
                }
                oo.lq();
                jSONObject2.put("code", 1);
                return jSONObject2;
            }
        });
        this.gm.put("playable_material_render_result", new pcc() { // from class: com.bytedance.sdk.openadsdk.tz.wh.27
            @Override // com.bytedance.sdk.openadsdk.tz.wh.pcc
            public JSONObject pcc(JSONObject jSONObject) throws Throwable {
                kj oo = wh.this.oo();
                JSONObject jSONObject2 = new JSONObject();
                if (oo == null) {
                    jSONObject2.put("code", -1);
                    return jSONObject2;
                }
                oo.vy(jSONObject);
                jSONObject2.put("code", 1);
                return jSONObject2;
            }
        });
        this.gm.put("detect_change_playable_click", new pcc() { // from class: com.bytedance.sdk.openadsdk.tz.wh.28
            @Override // com.bytedance.sdk.openadsdk.tz.wh.pcc
            public JSONObject pcc(JSONObject jSONObject) throws Throwable {
                kj oo = wh.this.oo();
                JSONObject jSONObject2 = new JSONObject();
                if (oo == null) {
                    jSONObject2.put("code", -1);
                    return jSONObject2;
                }
                JSONObject ork = oo.ork();
                ork.put("code", 1);
                return ork;
            }
        });
        this.gm.put("check_camera_permission", new pcc() { // from class: com.bytedance.sdk.openadsdk.tz.wh.29
            @Override // com.bytedance.sdk.openadsdk.tz.wh.pcc
            public JSONObject pcc(JSONObject jSONObject) throws Throwable {
                kj oo = wh.this.oo();
                JSONObject jSONObject2 = new JSONObject();
                if (oo == null) {
                    jSONObject2.put("code", -1);
                    return jSONObject2;
                }
                JSONObject hc = oo.hc();
                hc.put("code", 1);
                return hc;
            }
        });
        this.gm.put("check_external_storage", new pcc() { // from class: com.bytedance.sdk.openadsdk.tz.wh.30
            @Override // com.bytedance.sdk.openadsdk.tz.wh.pcc
            public JSONObject pcc(JSONObject jSONObject) throws Throwable {
                kj oo = wh.this.oo();
                JSONObject jSONObject2 = new JSONObject();
                if (oo == null) {
                    jSONObject2.put("code", -1);
                    return jSONObject2;
                }
                JSONObject gbb = oo.gbb();
                if (gbb.isNull("result")) {
                    gbb.put("code", -1);
                    return gbb;
                }
                gbb.put("code", 1);
                return gbb;
            }
        });
        this.gm.put("playable_open_camera", new pcc() { // from class: com.bytedance.sdk.openadsdk.tz.wh.31
            @Override // com.bytedance.sdk.openadsdk.tz.wh.pcc
            public JSONObject pcc(JSONObject jSONObject) throws Throwable {
                kj oo = wh.this.oo();
                JSONObject jSONObject2 = new JSONObject();
                if (oo == null) {
                    jSONObject2.put("code", -1);
                    return jSONObject2;
                }
                jSONObject2.put("code", 1);
                return jSONObject2;
            }
        });
        this.gm.put("playable_pick_photo", new pcc() { // from class: com.bytedance.sdk.openadsdk.tz.wh.32
            @Override // com.bytedance.sdk.openadsdk.tz.wh.pcc
            public JSONObject pcc(JSONObject jSONObject) throws Throwable {
                kj oo = wh.this.oo();
                JSONObject jSONObject2 = new JSONObject();
                if (oo == null) {
                    jSONObject2.put("code", -1);
                    return jSONObject2;
                }
                jSONObject2.put("code", 1);
                return jSONObject2;
            }
        });
        this.gm.put("playable_download_media_in_photos", new pcc() { // from class: com.bytedance.sdk.openadsdk.tz.wh.33
            @Override // com.bytedance.sdk.openadsdk.tz.wh.pcc
            public JSONObject pcc(JSONObject jSONObject) throws Throwable {
                kj oo = wh.this.oo();
                JSONObject jSONObject2 = new JSONObject();
                if (oo == null) {
                    jSONObject2.put("code", -1);
                    return jSONObject2;
                }
                oo.pcc(jSONObject);
                jSONObject2.put("code", 1);
                return jSONObject2;
            }
        });
        this.gm.put("playable_preventTouchEvent", new pcc() { // from class: com.bytedance.sdk.openadsdk.tz.wh.35
            @Override // com.bytedance.sdk.openadsdk.tz.wh.pcc
            public JSONObject pcc(JSONObject jSONObject) throws Throwable {
                kj oo = wh.this.oo();
                JSONObject jSONObject2 = new JSONObject();
                if (oo == null) {
                    jSONObject2.put("code", -1);
                    return jSONObject2;
                }
                oo.sf(jSONObject);
                jSONObject2.put("code", 1);
                return jSONObject2;
            }
        });
        this.gm.put("playable_settings_info", new pcc() { // from class: com.bytedance.sdk.openadsdk.tz.wh.36
            @Override // com.bytedance.sdk.openadsdk.tz.wh.pcc
            public JSONObject pcc(JSONObject jSONObject) throws Throwable {
                kj oo = wh.this.oo();
                JSONObject jSONObject2 = new JSONObject();
                if (oo == null) {
                    jSONObject2.put("code", -1);
                    return jSONObject2;
                }
                JSONObject jr = oo.jr();
                jr.put("code", 1);
                return jr;
            }
        });
        this.gm.put("playable_load_main_scene", new pcc() { // from class: com.bytedance.sdk.openadsdk.tz.wh.37
            @Override // com.bytedance.sdk.openadsdk.tz.wh.pcc
            public JSONObject pcc(JSONObject jSONObject) throws Throwable {
                kj oo = wh.this.oo();
                JSONObject jSONObject2 = new JSONObject();
                if (oo == null) {
                    jSONObject2.put("code", -1);
                    return jSONObject2;
                }
                oo.of();
                jSONObject2.put("code", 1);
                return jSONObject2;
            }
        });
        this.gm.put("playable_enter_section", new pcc() { // from class: com.bytedance.sdk.openadsdk.tz.wh.38
            @Override // com.bytedance.sdk.openadsdk.tz.wh.pcc
            public JSONObject pcc(JSONObject jSONObject) throws Throwable {
                kj oo = wh.this.oo();
                JSONObject jSONObject2 = new JSONObject();
                if (oo == null) {
                    jSONObject2.put("code", -1);
                    return jSONObject2;
                }
                oo.oo(jSONObject);
                jSONObject2.put("code", 1);
                return jSONObject2;
            }
        });
        this.gm.put("playable_end", new pcc() { // from class: com.bytedance.sdk.openadsdk.tz.wh.39
            @Override // com.bytedance.sdk.openadsdk.tz.wh.pcc
            public JSONObject pcc(JSONObject jSONObject) throws Throwable {
                kj oo = wh.this.oo();
                JSONObject jSONObject2 = new JSONObject();
                if (oo == null) {
                    jSONObject2.put("code", -1);
                    return jSONObject2;
                }
                oo.yt();
                jSONObject2.put("code", 1);
                return jSONObject2;
            }
        });
        this.gm.put("playable_finish_play_playable", new pcc() { // from class: com.bytedance.sdk.openadsdk.tz.wh.40
            @Override // com.bytedance.sdk.openadsdk.tz.wh.pcc
            public JSONObject pcc(JSONObject jSONObject) throws Throwable {
                kj oo = wh.this.oo();
                JSONObject jSONObject2 = new JSONObject();
                if (oo == null) {
                    jSONObject2.put("code", -1);
                    return jSONObject2;
                }
                oo.qy();
                jSONObject2.put("code", 1);
                return jSONObject2;
            }
        });
        this.gm.put("playable_transfrom_module_show", new pcc() { // from class: com.bytedance.sdk.openadsdk.tz.wh.41
            @Override // com.bytedance.sdk.openadsdk.tz.wh.pcc
            public JSONObject pcc(JSONObject jSONObject) throws Throwable {
                kj oo = wh.this.oo();
                JSONObject jSONObject2 = new JSONObject();
                if (oo == null) {
                    jSONObject2.put("code", -1);
                    return jSONObject2;
                }
                oo.jsj();
                jSONObject2.put("code", 1);
                return jSONObject2;
            }
        });
        this.gm.put("playable_transfrom_module_change_color", new pcc() { // from class: com.bytedance.sdk.openadsdk.tz.wh.42
            @Override // com.bytedance.sdk.openadsdk.tz.wh.pcc
            public JSONObject pcc(JSONObject jSONObject) throws Throwable {
                kj oo = wh.this.oo();
                JSONObject jSONObject2 = new JSONObject();
                if (oo == null) {
                    jSONObject2.put("code", -1);
                    return jSONObject2;
                }
                oo.tsz();
                jSONObject2.put("code", 1);
                return jSONObject2;
            }
        });
        this.gm.put("playable_set_scroll_rect", new pcc() { // from class: com.bytedance.sdk.openadsdk.tz.wh.43
            @Override // com.bytedance.sdk.openadsdk.tz.wh.pcc
            public JSONObject pcc(JSONObject jSONObject) throws Throwable {
                kj oo = wh.this.oo();
                JSONObject jSONObject2 = new JSONObject();
                if (oo == null) {
                    jSONObject2.put("code", -1);
                    return jSONObject2;
                }
                jSONObject2.put("code", 1);
                return jSONObject2;
            }
        });
        this.gm.put("playable_click_area", new pcc() { // from class: com.bytedance.sdk.openadsdk.tz.wh.44
            @Override // com.bytedance.sdk.openadsdk.tz.wh.pcc
            public JSONObject pcc(JSONObject jSONObject) throws Throwable {
                kj oo = wh.this.oo();
                JSONObject jSONObject2 = new JSONObject();
                if (oo == null) {
                    jSONObject2.put("code", -1);
                    return jSONObject2;
                }
                oo.vj(jSONObject);
                jSONObject2.put("code", 1);
                return jSONObject2;
            }
        });
        this.gm.put("playable_real_play_start", new pcc() { // from class: com.bytedance.sdk.openadsdk.tz.wh.46
            @Override // com.bytedance.sdk.openadsdk.tz.wh.pcc
            public JSONObject pcc(JSONObject jSONObject) throws Throwable {
                kj oo = wh.this.oo();
                JSONObject jSONObject2 = new JSONObject();
                if (oo == null) {
                    jSONObject2.put("code", -1);
                    return jSONObject2;
                }
                jSONObject2.put("code", 1);
                return jSONObject2;
            }
        });
        this.gm.put("playable_material_first_frame_show", new pcc() { // from class: com.bytedance.sdk.openadsdk.tz.wh.47
            @Override // com.bytedance.sdk.openadsdk.tz.wh.pcc
            public JSONObject pcc(JSONObject jSONObject) throws Throwable {
                kj oo = wh.this.oo();
                JSONObject jSONObject2 = new JSONObject();
                if (oo == null) {
                    jSONObject2.put("code", -1);
                    return jSONObject2;
                }
                oo.mk();
                jSONObject2.put("code", 1);
                return jSONObject2;
            }
        });
        this.gm.put("playable_stuck_check_pong", new pcc() { // from class: com.bytedance.sdk.openadsdk.tz.wh.48
            @Override // com.bytedance.sdk.openadsdk.tz.wh.pcc
            public JSONObject pcc(JSONObject jSONObject) throws Throwable {
                kj oo = wh.this.oo();
                JSONObject jSONObject2 = new JSONObject();
                if (oo == null) {
                    jSONObject2.put("code", -1);
                    return jSONObject2;
                }
                oo.atb();
                jSONObject2.put("code", 1);
                return jSONObject2;
            }
        });
        this.gm.put("playable_material_adnormal_mask", new pcc() { // from class: com.bytedance.sdk.openadsdk.tz.wh.49
            @Override // com.bytedance.sdk.openadsdk.tz.wh.pcc
            public JSONObject pcc(JSONObject jSONObject) throws Throwable {
                kj oo = wh.this.oo();
                JSONObject jSONObject2 = new JSONObject();
                if (oo == null) {
                    jSONObject2.put("code", -1);
                    return jSONObject2;
                }
                oo.wh(jSONObject);
                jSONObject2.put("code", 1);
                return jSONObject2;
            }
        });
        this.gm.put("playable_long_press_panel", new pcc() { // from class: com.bytedance.sdk.openadsdk.tz.wh.50
            @Override // com.bytedance.sdk.openadsdk.tz.wh.pcc
            public JSONObject pcc(JSONObject jSONObject) throws Throwable {
                kj oo = wh.this.oo();
                JSONObject jSONObject2 = new JSONObject();
                if (oo == null) {
                    jSONObject2.put("code", -1);
                    return jSONObject2;
                }
                jSONObject2.put("code", 1);
                return jSONObject2;
            }
        });
        this.gm.put("playable_alpha_player_play", new pcc() { // from class: com.bytedance.sdk.openadsdk.tz.wh.51
            @Override // com.bytedance.sdk.openadsdk.tz.wh.pcc
            public JSONObject pcc(JSONObject jSONObject) throws Throwable {
                kj oo = wh.this.oo();
                JSONObject jSONObject2 = new JSONObject();
                if (oo == null) {
                    jSONObject2.put("code", -1);
                    return jSONObject2;
                }
                jSONObject2.put("code", 1);
                return jSONObject2;
            }
        });
        this.gm.put("playable_transfrom_module_highlight", new pcc() { // from class: com.bytedance.sdk.openadsdk.tz.wh.52
            @Override // com.bytedance.sdk.openadsdk.tz.wh.pcc
            public JSONObject pcc(JSONObject jSONObject) throws Throwable {
                kj oo = wh.this.oo();
                JSONObject jSONObject2 = new JSONObject();
                if (oo == null) {
                    jSONObject2.put("code", -1);
                    return jSONObject2;
                }
                jSONObject2.put("code", 1);
                return jSONObject2;
            }
        });
        this.gm.put("playable_send_click_event", new pcc() { // from class: com.bytedance.sdk.openadsdk.tz.wh.53
            @Override // com.bytedance.sdk.openadsdk.tz.wh.pcc
            public JSONObject pcc(JSONObject jSONObject) throws Throwable {
                kj oo = wh.this.oo();
                JSONObject jSONObject2 = new JSONObject();
                if (oo == null) {
                    jSONObject2.put("code", -1);
                    return jSONObject2;
                }
                jSONObject2.put("code", 1);
                return jSONObject2;
            }
        });
        this.gm.put("playable_query_media_permission_declare", new pcc() { // from class: com.bytedance.sdk.openadsdk.tz.wh.54
            @Override // com.bytedance.sdk.openadsdk.tz.wh.pcc
            public JSONObject pcc(JSONObject jSONObject) throws Throwable {
                kj oo = wh.this.oo();
                JSONObject jSONObject2 = new JSONObject();
                if (oo == null) {
                    jSONObject2.put("code", -1);
                    return jSONObject2;
                }
                JSONObject qf = oo.qf(jSONObject);
                qf.put("code", 1);
                return qf;
            }
        });
        this.gm.put("playable_query_media_permission_enable", new pcc() { // from class: com.bytedance.sdk.openadsdk.tz.wh.55
            @Override // com.bytedance.sdk.openadsdk.tz.wh.pcc
            public JSONObject pcc(JSONObject jSONObject) throws Throwable {
                kj oo = wh.this.oo();
                JSONObject jSONObject2 = new JSONObject();
                if (oo == null) {
                    jSONObject2.put("code", -1);
                    return jSONObject2;
                }
                JSONObject kj = oo.kj(jSONObject);
                kj.put("code", 1);
                return kj;
            }
        });
        this.gm.put("playable_apply_media_permission", new pcc() { // from class: com.bytedance.sdk.openadsdk.tz.wh.57
            @Override // com.bytedance.sdk.openadsdk.tz.wh.pcc
            public JSONObject pcc(JSONObject jSONObject) throws Throwable {
                com.bytedance.sdk.openadsdk.tz.pcc vj = wh.this.vj();
                JSONObject jSONObject2 = new JSONObject();
                if (vj == null) {
                    jSONObject2.put("code", -1);
                    return jSONObject2;
                }
                jSONObject2.put("code", 1);
                return jSONObject2;
            }
        });
        this.gm.put("playable_start_kws", new pcc() { // from class: com.bytedance.sdk.openadsdk.tz.wh.58
            @Override // com.bytedance.sdk.openadsdk.tz.wh.pcc
            public JSONObject pcc(JSONObject jSONObject) throws Throwable {
                com.bytedance.sdk.openadsdk.tz.pcc vj = wh.this.vj();
                JSONObject jSONObject2 = new JSONObject();
                if (vj == null) {
                    jSONObject2.put("code", -1);
                    return jSONObject2;
                }
                jSONObject2.put("code", 1);
                return jSONObject2;
            }
        });
        this.gm.put("playable_close_kws", new pcc() { // from class: com.bytedance.sdk.openadsdk.tz.wh.59
            @Override // com.bytedance.sdk.openadsdk.tz.wh.pcc
            public JSONObject pcc(JSONObject jSONObject) throws Throwable {
                com.bytedance.sdk.openadsdk.tz.pcc vj = wh.this.vj();
                JSONObject jSONObject2 = new JSONObject();
                if (vj == null) {
                    jSONObject2.put("code", -1);
                    return jSONObject2;
                }
                jSONObject2.put("code", 1);
                return jSONObject2;
            }
        });
        this.gm.put("playable_video_preload_task_add", new pcc() { // from class: com.bytedance.sdk.openadsdk.tz.wh.60
            @Override // com.bytedance.sdk.openadsdk.tz.wh.pcc
            public JSONObject pcc(JSONObject jSONObject) throws Throwable {
                com.bytedance.sdk.openadsdk.tz.pcc vj = wh.this.vj();
                JSONObject jSONObject2 = new JSONObject();
                if (vj == null) {
                    jSONObject2.put("code", -1);
                    return jSONObject2;
                }
                jSONObject2.put("code", 1);
                return jSONObject2;
            }
        });
        this.gm.put("playable_video_preload_task_cancel", new pcc() { // from class: com.bytedance.sdk.openadsdk.tz.wh.61
            @Override // com.bytedance.sdk.openadsdk.tz.wh.pcc
            public JSONObject pcc(JSONObject jSONObject) throws Throwable {
                com.bytedance.sdk.openadsdk.tz.pcc vj = wh.this.vj();
                JSONObject jSONObject2 = new JSONObject();
                if (vj == null) {
                    jSONObject2.put("code", -1);
                    return jSONObject2;
                }
                jSONObject2.put("code", 1);
                return jSONObject2;
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public kj oo() {
        WeakReference<kj> weakReference = this.sf;
        if (weakReference == null) {
            return null;
        }
        return weakReference.get();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public com.bytedance.sdk.openadsdk.tz.pcc vj() {
        kj oo = oo();
        if (oo == null) {
            return null;
        }
        return oo.nac();
    }

    public JSONObject pcc(String str, JSONObject jSONObject) {
        try {
            pcc pccVar = this.gm.get(str);
            if (pccVar != null) {
                return pccVar.pcc(jSONObject);
            }
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("code", -1);
            return jSONObject2;
        } catch (Throwable th) {
            qf.pcc("PlayableJsBridge", "invoke error", th);
            return null;
        }
    }

    public void sf() {
        ork.pcc(this.pcc, this.oo);
        ork.pcc(this.pcc, this.vj);
        ork.pcc(this.pcc, this.wh);
        ork.pcc(this.pcc, this.qf);
    }

    public Set<String> pcc() {
        return this.gm.keySet();
    }
}
