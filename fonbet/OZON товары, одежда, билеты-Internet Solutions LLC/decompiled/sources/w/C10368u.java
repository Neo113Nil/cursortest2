package w;

import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.params.StreamConfigurationMap;
import android.os.Build;
import androidx.annotation.NonNull;
import java.util.HashMap;
import z.C10955m;

/* renamed from: w.u, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C10368u {

    /* renamed from: b, reason: collision with root package name */
    @NonNull
    private final a f103115b;

    /* renamed from: c, reason: collision with root package name */
    @NonNull
    private final String f103116c;

    /* renamed from: a, reason: collision with root package name */
    @NonNull
    private final HashMap f103114a = new HashMap();

    /* renamed from: d, reason: collision with root package name */
    private C10345M f103117d = null;

    /* renamed from: w.u$a */
    public interface a {
    }

    private C10368u(@NonNull CameraCharacteristics cameraCharacteristics, @NonNull String str) {
        if (Build.VERSION.SDK_INT >= 28) {
            this.f103115b = new C10366s(cameraCharacteristics);
        } else {
            this.f103115b = new C10367t(cameraCharacteristics);
        }
        this.f103116c = str;
    }

    @NonNull
    public static C10368u d(@NonNull CameraCharacteristics cameraCharacteristics, @NonNull String str) {
        return new C10368u(cameraCharacteristics, str);
    }

    public final <T> T a(@NonNull CameraCharacteristics.Key<T> key) {
        if (key.equals(CameraCharacteristics.SENSOR_ORIENTATION)) {
            return (T) ((C10367t) this.f103115b).f103113a.get(key);
        }
        synchronized (this) {
            try {
                T t2 = (T) this.f103114a.get(key);
                if (t2 != null) {
                    return t2;
                }
                T t11 = (T) ((C10367t) this.f103115b).f103113a.get(key);
                if (t11 != null) {
                    this.f103114a.put(key, t11);
                }
                return t11;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @NonNull
    public final C10345M b() {
        if (this.f103117d == null) {
            try {
                StreamConfigurationMap streamConfigurationMap = (StreamConfigurationMap) a(CameraCharacteristics.SCALER_STREAM_CONFIGURATION_MAP);
                if (streamConfigurationMap == null) {
                    throw new IllegalArgumentException("StreamConfigurationMap is null!");
                }
                this.f103117d = C10345M.e(streamConfigurationMap, new C10955m(this.f103116c));
            } catch (AssertionError | NullPointerException e11) {
                throw new IllegalArgumentException(e11.getMessage());
            }
        }
        return this.f103117d;
    }

    public final boolean c() {
        CameraCharacteristics.Key key;
        if (Build.VERSION.SDK_INT >= 34) {
            a aVar = this.f103115b;
            key = CameraCharacteristics.CONTROL_AVAILABLE_SETTINGS_OVERRIDES;
            int[] iArr = (int[]) ((C10367t) aVar).f103113a.get(key);
            if (iArr != null) {
                for (int i11 : iArr) {
                    if (i11 == 1) {
                        return true;
                    }
                }
            }
        }
        return false;
    }
}
