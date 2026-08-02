package defpackage;

import android.content.Context;
import android.hardware.SensorEvent;
import android.hardware.SensorManager;
import android.view.Display;
import android.view.WindowManager;
import com.google.android.gms.internal.ads.zzcid;
import com.google.android.gms.internal.ads.zzgbp;
import com.google.android.gms.internal.ads.zzgbs;
import com.unity3d.services.UnityAdsConstants;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public final class xsn extends zzgbs {
    public final SensorManager a;
    public final Display c;
    public float[] f;
    public zzgbp g;
    public zzcid h;
    public final float[] d = new float[9];
    public final float[] e = new float[9];
    public final Object b = new Object();

    public xsn(Context context) {
        this.a = (SensorManager) context.getSystemService("sensor");
        this.c = ((WindowManager) context.getSystemService("window")).getDefaultDisplay();
    }

    @Override // com.google.android.gms.internal.ads.zzgbs
    public final void a(SensorEvent sensorEvent) {
        float[] fArr = sensorEvent.values;
        if (fArr[0] == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT && fArr[1] == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT && fArr[2] == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
            return;
        }
        synchronized (this.b) {
            try {
                if (this.f == null) {
                    this.f = new float[9];
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        float[] fArr2 = this.d;
        SensorManager.getRotationMatrixFromVector(fArr2, fArr);
        int rotation = this.c.getRotation();
        if (rotation != 1) {
            float[] fArr3 = this.e;
            if (rotation == 2) {
                SensorManager.remapCoordinateSystem(fArr2, 129, 130, fArr3);
            } else if (rotation != 3) {
                System.arraycopy(fArr2, 0, fArr3, 0, 9);
            } else {
                SensorManager.remapCoordinateSystem(fArr2, 130, 1, fArr3);
            }
        } else {
            SensorManager.remapCoordinateSystem(fArr2, 2, 129, this.e);
        }
        float[] fArr4 = this.e;
        float f = fArr4[1];
        fArr4[1] = fArr4[3];
        fArr4[3] = f;
        float f2 = fArr4[2];
        fArr4[2] = fArr4[6];
        fArr4[6] = f2;
        float f3 = fArr4[5];
        fArr4[5] = fArr4[7];
        fArr4[7] = f3;
        synchronized (this.b) {
            System.arraycopy(fArr4, 0, this.f, 0, 9);
        }
        zzcid zzcidVar = this.h;
        if (zzcidVar != null) {
            Object obj = zzcidVar.u;
            synchronized (obj) {
                obj.notifyAll();
            }
        }
    }

    public final void b() {
        if (this.g == null) {
            return;
        }
        this.a.unregisterListener(this);
        this.g.post(new gl5(10));
        this.g = null;
    }

    public final boolean c(float[] fArr) {
        synchronized (this.b) {
            try {
                float[] fArr2 = this.f;
                if (fArr2 == null) {
                    return false;
                }
                System.arraycopy(fArr2, 0, fArr, 0, 9);
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
