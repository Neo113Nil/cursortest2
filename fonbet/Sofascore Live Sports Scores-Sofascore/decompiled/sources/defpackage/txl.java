package defpackage;

import android.app.Activity;
import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.provider.Settings;
import com.unity3d.services.UnityAdsConstants;
import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public final class txl implements SensorEventListener {
    public final /* synthetic */ Activity a;
    public final /* synthetic */ Function1 b;
    public final /* synthetic */ e1d c;

    public txl(Activity activity, Function1 function1, e1d e1dVar) {
        this.a = activity;
        this.b = function1;
        this.c = e1dVar;
    }

    @Override // android.hardware.SensorEventListener
    public final void onSensorChanged(SensorEvent sensorEvent) {
        if (sensorEvent == null) {
            return;
        }
        Activity activity = this.a;
        activity.getClass();
        try {
            if (Settings.System.getInt(activity.getContentResolver(), "accelerometer_rotation") == 1) {
                float[] fArr = sensorEvent.values;
                float f = fArr[0];
                float f2 = fArr[1];
                float abs = Math.abs(fArr[2]);
                e1d e1dVar = this.c;
                mpl mplVar = abs > 5.0f ? (mpl) e1dVar.getValue() : (Math.abs(f) >= Math.abs(f2) || f2 <= UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) ? (Math.abs(f) >= Math.abs(f2) || f2 >= UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) ? (Math.abs(f) <= Math.abs(f2) || f <= UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) ? (Math.abs(f) <= Math.abs(f2) || f >= UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) ? (mpl) e1dVar.getValue() : mpl.ReverseLandscape : mpl.Landscape : mpl.ReversePortrait : mpl.Portrait;
                if (mplVar != ((mpl) e1dVar.getValue())) {
                    boolean z = ((mpl) e1dVar.getValue()) == mpl.Unknown;
                    e1dVar.setValue(mplVar);
                    if (z) {
                        return;
                    }
                    this.b.invoke(mplVar);
                }
            }
        } catch (Settings.SettingNotFoundException e) {
            e.printStackTrace();
        }
    }

    @Override // android.hardware.SensorEventListener
    public final void onAccuracyChanged(Sensor sensor, int i) {
    }
}
