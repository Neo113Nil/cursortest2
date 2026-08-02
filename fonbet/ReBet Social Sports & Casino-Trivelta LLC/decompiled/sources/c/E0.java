package c;

import android.content.Context;
import android.content.pm.PackageManager;
import android.hardware.SensorManager;
import android.hardware.camera2.CameraManager;
import android.os.Build;
import android.os.SystemClock;
import android.view.WindowManager;
import com.surt.guardian.core.Configuration;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class E0 {

    /* renamed from: a, reason: collision with root package name */
    public final Context f26404a;

    /* renamed from: b, reason: collision with root package name */
    public final Configuration f26405b;

    /* renamed from: c, reason: collision with root package name */
    public final w0 f26406c;

    public E0(Context context, Configuration config) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(config, "config");
        this.f26404a = context;
        this.f26405b = config;
        this.f26406c = new w0(context);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v14, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r4v15, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v22, types: [java.util.ArrayList] */
    public final Map a() {
        float f10;
        ?? emptyList;
        boolean z10;
        int i10;
        Map mutableMap = MapsKt.toMutableMap(this.f26406c.a());
        if (this.f26405b.getCollectScreenRefreshRate()) {
            try {
                Object systemService = this.f26404a.getSystemService("window");
                Intrinsics.checkNotNull(systemService, "null cannot be cast to non-null type android.view.WindowManager");
                f10 = ((WindowManager) systemService).getDefaultDisplay().getRefreshRate();
            } catch (Exception unused) {
                f10 = 60.0f;
            }
            mutableMap.put("screen_refresh_rate", Float.valueOf(f10));
        }
        if (this.f26405b.getCollectSensorList()) {
            mutableMap.put("available_sensors", b());
            mutableMap.put("sensor_count", Integer.valueOf(b().size()));
        }
        if (this.f26405b.getCollectSystemFeatures()) {
            try {
                emptyList = new ArrayList();
                PackageManager packageManager = this.f26404a.getPackageManager();
                for (Pair pair : CollectionsKt.listOf((Object[]) new Pair[]{TuplesKt.to("android.hardware.nfc", "nfc"), TuplesKt.to("android.hardware.fingerprint", "fingerprint"), TuplesKt.to("android.hardware.camera", "camera"), TuplesKt.to("android.hardware.bluetooth", "bluetooth"), TuplesKt.to("android.hardware.wifi", "wifi"), TuplesKt.to("android.hardware.telephony", "telephony"), TuplesKt.to("android.hardware.location.gps", "gps_hardware")})) {
                    String str = (String) pair.component1();
                    String str2 = (String) pair.component2();
                    if (packageManager.hasSystemFeature(str)) {
                        emptyList.add(str2);
                    }
                }
            } catch (Exception unused2) {
                emptyList = CollectionsKt.emptyList();
            }
            mutableMap.put("system_features", emptyList);
            mutableMap.put("has_nfc", Boolean.valueOf(this.f26404a.getPackageManager().hasSystemFeature("android.hardware.nfc")));
            int i11 = Build.VERSION.SDK_INT;
            mutableMap.put("has_fingerprint", Boolean.valueOf(this.f26404a.getPackageManager().hasSystemFeature("android.hardware.fingerprint")));
            mutableMap.put("has_face_unlock", Boolean.valueOf(i11 >= 29 ? this.f26404a.getPackageManager().hasSystemFeature("android.hardware.biometrics.face") : false));
        }
        if (this.f26405b.getCollectDeviceUptime()) {
            mutableMap.put("device_uptime_ms", Long.valueOf(SystemClock.elapsedRealtime()));
        }
        if (this.f26405b.getCollectDarkModeSetting()) {
            if ((this.f26404a.getResources().getConfiguration().uiMode & 48) == 32) {
                z10 = true;
                mutableMap.put("is_dark_mode", Boolean.valueOf(z10));
            }
            z10 = false;
            mutableMap.put("is_dark_mode", Boolean.valueOf(z10));
        }
        if (this.f26405b.getCollectCameraInfo()) {
            try {
                Object systemService2 = this.f26404a.getSystemService("camera");
                Intrinsics.checkNotNull(systemService2, "null cannot be cast to non-null type android.hardware.camera2.CameraManager");
                i10 = ((CameraManager) systemService2).getCameraIdList().length;
            } catch (Exception unused3) {
                i10 = 0;
            }
            mutableMap.put("camera_count", Integer.valueOf(i10));
            mutableMap.put("has_front_camera", Boolean.valueOf(this.f26404a.getPackageManager().hasSystemFeature("android.hardware.camera.front")));
            mutableMap.put("has_back_camera", Boolean.valueOf(this.f26404a.getPackageManager().hasSystemFeature("android.hardware.camera")));
            mutableMap.put("has_flash", Boolean.valueOf(this.f26404a.getPackageManager().hasSystemFeature("android.hardware.camera.flash")));
        }
        return mutableMap;
    }

    public final List b() {
        try {
            Object systemService = this.f26404a.getSystemService("sensor");
            Intrinsics.checkNotNull(systemService, "null cannot be cast to non-null type android.hardware.SensorManager");
            SensorManager sensorManager = (SensorManager) systemService;
            ArrayList arrayList = new ArrayList();
            for (Map.Entry entry : MapsKt.mapOf(TuplesKt.to(1, "accelerometer"), TuplesKt.to(4, "gyroscope"), TuplesKt.to(2, "magnetometer"), TuplesKt.to(6, "barometer"), TuplesKt.to(8, "proximity"), TuplesKt.to(5, "light"), TuplesKt.to(9, "gravity"), TuplesKt.to(10, "linear_acceleration"), TuplesKt.to(11, "rotation_vector"), TuplesKt.to(19, "step_counter"), TuplesKt.to(18, "step_detector")).entrySet()) {
                int intValue = ((Number) entry.getKey()).intValue();
                String str = (String) entry.getValue();
                if (sensorManager.getDefaultSensor(intValue) != null) {
                    arrayList.add(str);
                }
            }
            return arrayList;
        } catch (Exception unused) {
            return CollectionsKt.emptyList();
        }
    }
}
