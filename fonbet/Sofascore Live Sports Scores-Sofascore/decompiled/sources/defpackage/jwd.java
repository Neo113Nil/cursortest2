package defpackage;

import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import android.opengl.Matrix;
import android.view.Display;
import com.unity3d.services.UnityAdsConstants;
import com.vungle.ads.internal.protos.Sdk;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public final class jwd implements SensorEventListener {
    public final /* synthetic */ int a;
    public final float[] b;
    public final float[] c;
    public final float[] d;
    public final float[] e;
    public final Display f;
    public boolean g;
    public final Object[] h;

    public jwd(Display display, hwd[] hwdVarArr) {
        this.a = 0;
        this.b = new float[16];
        this.c = new float[16];
        this.d = new float[16];
        this.e = new float[3];
        this.f = display;
        this.h = hwdVarArr;
    }

    @Override // android.hardware.SensorEventListener
    public final void onAccuracyChanged(Sensor sensor, int i) {
        int i2 = this.a;
    }

    @Override // android.hardware.SensorEventListener
    public final void onSensorChanged(SensorEvent sensorEvent) {
        int i = this.a;
        Object[] objArr = this.h;
        float[] fArr = this.e;
        int i2 = 130;
        int i3 = 129;
        int i4 = 0;
        Display display = this.f;
        switch (i) {
            case 0:
                float[] fArr2 = sensorEvent.values;
                float[] fArr3 = this.b;
                SensorManager.getRotationMatrixFromVector(fArr3, fArr2);
                int rotation = display.getRotation();
                float[] fArr4 = this.c;
                if (rotation != 0) {
                    if (rotation == 1) {
                        i2 = 2;
                    } else if (rotation == 2) {
                        i3 = 130;
                        i2 = 129;
                    } else if (rotation != 3) {
                        zzl.s();
                        break;
                    } else {
                        i3 = 1;
                    }
                    System.arraycopy(fArr3, 0, fArr4, 0, fArr4.length);
                    SensorManager.remapCoordinateSystem(fArr4, i2, i3, fArr3);
                }
                SensorManager.remapCoordinateSystem(fArr3, 1, Sdk.SDKError.Reason.MRAID_JS_WRITE_FAILED_VALUE, fArr4);
                SensorManager.getOrientation(fArr4, fArr);
                float f = fArr[2];
                Matrix.rotateM(fArr3, 0, 90.0f, 1.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
                boolean z = this.g;
                float[] fArr5 = this.d;
                if (!z) {
                    en0.k(fArr5, fArr3);
                    this.g = true;
                }
                System.arraycopy(fArr3, 0, fArr4, 0, fArr4.length);
                Matrix.multiplyMM(fArr3, 0, fArr4, 0, fArr5, 0);
                hwd[] hwdVarArr = (hwd[]) objArr;
                while (i4 < 2) {
                    hwdVarArr[i4].a(fArr3, f);
                    i4++;
                }
                break;
            default:
                float[] fArr6 = sensorEvent.values;
                float[] fArr7 = this.b;
                SensorManager.getRotationMatrixFromVector(fArr7, fArr6);
                int rotation2 = display.getRotation();
                float[] fArr8 = this.c;
                if (rotation2 != 0) {
                    if (rotation2 == 1) {
                        i2 = 2;
                    } else if (rotation2 == 2) {
                        i3 = 130;
                        i2 = 129;
                    } else if (rotation2 != 3) {
                        zzl.s();
                        break;
                    } else {
                        i3 = 1;
                    }
                    System.arraycopy(fArr7, 0, fArr8, 0, fArr8.length);
                    SensorManager.remapCoordinateSystem(fArr8, i2, i3, fArr7);
                }
                SensorManager.remapCoordinateSystem(fArr7, 1, Sdk.SDKError.Reason.MRAID_JS_WRITE_FAILED_VALUE, fArr8);
                SensorManager.getOrientation(fArr8, fArr);
                float f2 = fArr[2];
                Matrix.rotateM(fArr7, 0, 90.0f, 1.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
                boolean z2 = this.g;
                float[] fArr9 = this.d;
                if (!z2) {
                    en0.l(fArr9, fArr7);
                    this.g = true;
                }
                System.arraycopy(fArr7, 0, fArr8, 0, fArr8.length);
                Matrix.multiplyMM(fArr7, 0, fArr8, 0, fArr9, 0);
                iwd[] iwdVarArr = (iwd[]) objArr;
                while (i4 < 2) {
                    iwdVarArr[i4].a(fArr7, f2);
                    i4++;
                }
                break;
        }
    }

    public jwd(Display display, iwd[] iwdVarArr) {
        this.a = 1;
        this.b = new float[16];
        this.c = new float[16];
        this.d = new float[16];
        this.e = new float[3];
        this.f = display;
        this.h = iwdVarArr;
    }

    private final void a(Sensor sensor, int i) {
    }

    private final void b(Sensor sensor, int i) {
    }
}
