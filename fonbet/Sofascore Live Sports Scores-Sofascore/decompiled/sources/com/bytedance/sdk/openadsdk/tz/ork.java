package com.bytedance.sdk.openadsdk.tz;

import android.content.Context;
import android.hardware.SensorEventListener;
import android.os.Vibrator;
import java.lang.ref.WeakReference;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public class ork {
    public static WeakReference<pcc> pcc;
    protected static final float[] sf = new float[3];
    protected static final float[] gm = new float[3];
    protected static final float[] oo = new float[9];
    protected static final float[] vj = new float[3];

    public static void gm(Context context, SensorEventListener sensorEventListener, int i) {
        if (sensorEventListener == null || context == null) {
            return;
        }
        try {
            WeakReference<pcc> weakReference = pcc;
            if (weakReference != null) {
                weakReference.get();
            }
        } catch (Throwable th) {
            qf.pcc("SensorHub", "startListenLinearAcceleration error", th);
        }
    }

    public static void oo(Context context, SensorEventListener sensorEventListener, int i) {
        if (sensorEventListener == null || context == null) {
            return;
        }
        try {
            WeakReference<pcc> weakReference = pcc;
            if (weakReference != null) {
                weakReference.get();
            }
        } catch (Throwable th) {
            qf.pcc("SensorHub", "startListenRotationVector err", th);
        }
    }

    public static void pcc(Context context, SensorEventListener sensorEventListener, int i) {
        if (sensorEventListener == null || context == null) {
            return;
        }
        try {
            WeakReference<pcc> weakReference = pcc;
            if (weakReference != null) {
                weakReference.get();
            }
        } catch (Throwable th) {
            qf.pcc("SensorHub", "startListenAccelerometer error", th);
        }
    }

    public static void sf(Context context, SensorEventListener sensorEventListener, int i) {
        if (sensorEventListener == null || context == null) {
            return;
        }
        try {
            WeakReference<pcc> weakReference = pcc;
            if (weakReference != null) {
                weakReference.get();
            }
        } catch (Throwable th) {
            qf.pcc("SensorHub", "startListenGyroscope error", th);
        }
    }

    public static void pcc(pcc pccVar) {
        pcc = new WeakReference<>(pccVar);
    }

    public static void pcc(Context context, SensorEventListener sensorEventListener) {
    }

    public static void pcc(Context context, long j) {
        if (context == null) {
            return;
        }
        ((Vibrator) context.getSystemService("vibrator")).vibrate(j);
    }
}
