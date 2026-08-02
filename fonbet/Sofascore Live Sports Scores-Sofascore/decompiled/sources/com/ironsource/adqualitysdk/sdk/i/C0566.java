package com.ironsource.adqualitysdk.sdk.i;

import android.content.Context;
import android.hardware.Sensor;
import android.hardware.SensorManager;
import android.os.Handler;
import android.os.HandlerThread;
import android.provider.Settings;
import com.ironsource.adqualitysdk.sdk.StringFog;
import com.unity3d.services.UnityAdsConstants;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import org.json.JSONObject;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* renamed from: com.ironsource.adqualitysdk.sdk.i.ฅ, reason: contains not printable characters */
/* loaded from: classes4.dex */
public final class C0566 implements InterfaceC1129 {

    /* renamed from: ﾒ, reason: contains not printable characters */
    public final Context f1856;

    public C0566(Context context) {
        this.f1856 = context;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.InterfaceC1129
    public final String getName() {
        return StringFog.decrypt("l3FoXYj/SYeUeFNZkOVJhw==\n", "9RQAPP6WJvU=\n");
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x00e7  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0127 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0133  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0155  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0175  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0184  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x01b5 A[Catch: Exception -> 0x01e7, TryCatch #3 {Exception -> 0x01e7, blocks: (B:54:0x018c, B:56:0x01b5, B:57:0x01c5, B:59:0x01d2, B:60:0x01e2), top: B:53:0x018c }] */
    /* JADX WARN: Removed duplicated region for block: B:59:0x01d2 A[Catch: Exception -> 0x01e7, TryCatch #3 {Exception -> 0x01e7, blocks: (B:54:0x018c, B:56:0x01b5, B:57:0x01c5, B:59:0x01d2, B:60:0x01e2), top: B:53:0x018c }] */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0186  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x017a  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0156 A[Catch: Exception -> 0x015f, TRY_LEAVE, TryCatch #0 {Exception -> 0x015f, blocks: (B:39:0x0140, B:67:0x0156), top: B:38:0x0140 }] */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00e9  */
    @Override // com.ironsource.adqualitysdk.sdk.i.InterfaceC1129
    /* renamed from: ﾒ */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final C0350 mo221() {
        int i;
        HandlerThread handlerThread;
        Sensor sensor;
        float size;
        Float f;
        boolean z;
        Float valueOf;
        String decrypt;
        int i2;
        ArrayList arrayList = new ArrayList();
        SensorManager sensorManager = (SensorManager) this.f1856.getSystemService(StringFog.decrypt("niJM3D2X\n", "7Ucir1LlKh8=\n"));
        if (sensorManager == null) {
            arrayList.add(60);
            return new C0350(false, arrayList, null, StringFog.decrypt("U+80o7jlnv5u6z21pbem8WH8O7m79rHzZQ==\n", "AIpa0NeX058=\n"));
        }
        Sensor defaultSensor = sensorManager.getDefaultSensor(1);
        Sensor defaultSensor2 = sensorManager.getDefaultSensor(4);
        Sensor defaultSensor3 = sensorManager.getDefaultSensor(6);
        Sensor defaultSensor4 = sensorManager.getDefaultSensor(2);
        if (defaultSensor2 == null) {
            arrayList.add(61);
        }
        if (defaultSensor3 == null) {
            arrayList.add(62);
        }
        CopyOnWriteArrayList copyOnWriteArrayList = new CopyOnWriteArrayList();
        CopyOnWriteArrayList copyOnWriteArrayList2 = new CopyOnWriteArrayList();
        float[] fArr = {Float.NaN};
        CountDownLatch countDownLatch = new CountDownLatch(1);
        HandlerThread handlerThread2 = new HandlerThread(StringFog.decrypt("ybrQyZTeQtrqs+vNjMRC2ti+1diO0l8=\n", "i9+4qOK3Lag=\n"));
        handlerThread2.start();
        Handler handler = new Handler(handlerThread2.getLooper());
        C0572 c0572 = new C0572(copyOnWriteArrayList, copyOnWriteArrayList2, new float[]{Float.NaN}, fArr);
        if (defaultSensor != null) {
            i = 0;
            try {
                sensorManager.registerListener(c0572, defaultSensor, 0, handler);
            } catch (InterruptedException unused) {
                handlerThread = handlerThread2;
                sensor = defaultSensor;
                Thread.currentThread().interrupt();
                sensorManager.unregisterListener(c0572);
                handlerThread.quitSafely();
                double m375 = m375(copyOnWriteArrayList);
                if (copyOnWriteArrayList.isEmpty()) {
                }
                if (copyOnWriteArrayList.isEmpty()) {
                }
                if (size > 0.9f) {
                }
                double m3752 = m375(copyOnWriteArrayList2);
                try {
                    i2 = Settings.System.getInt(this.f1856.getContentResolver(), StringFog.decrypt("OsfzDq4x8Zc7zeYDvzHLhjo=\n", "SaSBa8tfrvU=\n"), -1);
                    if (i2 >= 0) {
                    }
                } catch (Exception unused2) {
                }
            } catch (Throwable th) {
                th = th;
                handlerThread = handlerThread2;
                sensorManager.unregisterListener(c0572);
                handlerThread.quitSafely();
                throw th;
            }
        } else {
            i = 0;
        }
        if (defaultSensor2 != null) {
            sensorManager.registerListener(c0572, defaultSensor2, i, handler);
        }
        if (defaultSensor3 != null) {
            sensorManager.registerListener(c0572, defaultSensor3, i, handler);
        }
        if (defaultSensor4 != null) {
            sensorManager.registerListener(c0572, defaultSensor4, i, handler);
        }
        handlerThread = handlerThread2;
        sensor = defaultSensor;
        try {
            try {
                handler.postDelayed(new RunnableC0571(countDownLatch), 500L);
                countDownLatch.await(600L, TimeUnit.MILLISECONDS);
                sensorManager.unregisterListener(c0572);
            } catch (InterruptedException unused3) {
                Thread.currentThread().interrupt();
                sensorManager.unregisterListener(c0572);
                handlerThread.quitSafely();
                double m3753 = m375(copyOnWriteArrayList);
                if (copyOnWriteArrayList.isEmpty()) {
                }
                if (copyOnWriteArrayList.isEmpty()) {
                    arrayList.add(60);
                }
                if (size > 0.9f) {
                }
                double m37522 = m375(copyOnWriteArrayList2);
                i2 = Settings.System.getInt(this.f1856.getContentResolver(), StringFog.decrypt("OsfzDq4x8Zc7zeYDvzHLhjo=\n", "SaSBa8tfrvU=\n"), -1);
                if (i2 >= 0) {
                }
            }
            handlerThread.quitSafely();
            double m37532 = m375(copyOnWriteArrayList);
            if (copyOnWriteArrayList.isEmpty()) {
                size = 0.0f;
            } else {
                Iterator it = copyOnWriteArrayList.iterator();
                int i3 = 0;
                while (it.hasNext()) {
                    float[] fArr2 = (float[]) it.next();
                    if (Math.abs(fArr2[2]) + Math.abs(fArr2[1]) + Math.abs(fArr2[0]) < 0.05f) {
                        i3++;
                    }
                }
                size = i3 / copyOnWriteArrayList.size();
            }
            if (copyOnWriteArrayList.isEmpty() && sensor != null) {
                arrayList.add(60);
            }
            if (size > 0.9f) {
                arrayList.add(63);
            }
            double m375222 = m375(copyOnWriteArrayList2);
            i2 = Settings.System.getInt(this.f1856.getContentResolver(), StringFog.decrypt("OsfzDq4x8Zc7zeYDvzHLhjo=\n", "SaSBa8tfrvU=\n"), -1);
            if (i2 >= 0) {
                f = Float.valueOf(i2 / 255.0f);
                if (f != null) {
                    arrayList.add(64);
                }
                if (defaultSensor3 == null) {
                }
                if (!Float.isNaN(fArr[0])) {
                }
                JSONObject jSONObject = new JSONObject();
                jSONObject.put(StringFog.decrypt("pJbl7VPX83eokPLtTeTgaqyU6Ota\n", "xfWGiD+ygRg=\n"), m37532);
                jSONObject.put(StringFog.decrypt("woV4AEtmk8/AqmsdUWSS3MA=\n", "pfwKbzgF/L8=\n"), m375222);
                jSONObject.put(StringFog.decrypt("VffwdNlmfYtA/NB64GBm\n", "L5KCG5QJCeI=\n"), size);
                if (f != null) {
                }
                jSONObject.put(StringFog.decrypt("NMmf46hjEh0p2ok=\n", "XKjss9oGYW4=\n"), z);
                if (valueOf != null) {
                }
                decrypt = jSONObject.toString();
                return new C0350(arrayList.isEmpty(), arrayList, decrypt, null);
            }
            f = null;
            if (f != null && f.floatValue() == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                arrayList.add(64);
            }
            z = defaultSensor3 == null;
            valueOf = !Float.isNaN(fArr[0]) ? null : Float.valueOf(fArr[0]);
            try {
                JSONObject jSONObject2 = new JSONObject();
                jSONObject2.put(StringFog.decrypt("pJbl7VPX83eokPLtTeTgaqyU6Ota\n", "xfWGiD+ygRg=\n"), m37532);
                jSONObject2.put(StringFog.decrypt("woV4AEtmk8/AqmsdUWSS3MA=\n", "pfwKbzgF/L8=\n"), m375222);
                jSONObject2.put(StringFog.decrypt("VffwdNlmfYtA/NB64GBm\n", "L5KCG5QJCeI=\n"), size);
                if (f != null) {
                    jSONObject2.put(StringFog.decrypt("tMtBjVFD2wWlyg==\n", "1rko6jk3tWA=\n"), f.floatValue());
                }
                jSONObject2.put(StringFog.decrypt("NMmf46hjEh0p2ok=\n", "XKjss9oGYW4=\n"), z);
                if (valueOf != null) {
                    jSONObject2.put(StringFog.decrypt("fMitJuVXCFJXwK8k5HAVQ3THrTzo\n", "EanKSIAjYTE=\n"), valueOf.floatValue());
                }
                decrypt = jSONObject2.toString();
            } catch (Exception unused4) {
                decrypt = StringFog.decrypt("Xis=\n", "JVYxMBq0aVM=\n");
            }
            return new C0350(arrayList.isEmpty(), arrayList, decrypt, null);
        } catch (Throwable th2) {
            th = th2;
            sensorManager.unregisterListener(c0572);
            handlerThread.quitSafely();
            throw th;
        }
    }

    /* renamed from: ﾒ, reason: contains not printable characters */
    public static double m375(CopyOnWriteArrayList copyOnWriteArrayList) {
        if (copyOnWriteArrayList.size() < 2) {
            return 0.0d;
        }
        double d = 0.0d;
        for (int i = 0; i <= 2; i++) {
            double d2 = 0.0d;
            while (copyOnWriteArrayList.iterator().hasNext()) {
                d2 += ((float[]) r6.next())[i];
            }
            double size = d2 / copyOnWriteArrayList.size();
            double d3 = 0.0d;
            while (copyOnWriteArrayList.iterator().hasNext()) {
                double d4 = ((float[]) r6.next())[i] - size;
                d3 += d4 * d4;
            }
            d += d3 / copyOnWriteArrayList.size();
        }
        return d / 3.0d;
    }
}
