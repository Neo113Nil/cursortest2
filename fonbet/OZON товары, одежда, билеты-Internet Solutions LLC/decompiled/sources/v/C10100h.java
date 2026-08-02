package v;

import G.j;
import android.hardware.camera2.CaptureResult;
import android.os.Build;
import androidx.annotation.NonNull;
import androidx.camera.core.impl.EnumC5116s;
import androidx.camera.core.impl.EnumC5118t;
import androidx.camera.core.impl.EnumC5120u;
import androidx.camera.core.impl.EnumC5122v;
import androidx.camera.core.impl.EnumC5124w;
import androidx.camera.core.impl.EnumC5126x;
import androidx.camera.core.impl.EnumC5128y;
import androidx.camera.core.impl.InterfaceC5130z;
import java.nio.BufferUnderflowException;

/* renamed from: v.h, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C10100h implements InterfaceC5130z {

    /* renamed from: a, reason: collision with root package name */
    private final androidx.camera.core.impl.X0 f101257a;

    /* renamed from: b, reason: collision with root package name */
    private final CaptureResult f101258b;

    public C10100h(@NonNull androidx.camera.core.impl.X0 x02, @NonNull CaptureResult captureResult) {
        this.f101257a = x02;
        this.f101258b = captureResult;
    }

    @Override // androidx.camera.core.impl.InterfaceC5130z
    @NonNull
    public final androidx.camera.core.impl.X0 a() {
        return this.f101257a;
    }

    @Override // androidx.camera.core.impl.InterfaceC5130z
    public final void b(@NonNull j.b bVar) {
        CaptureResult captureResult = this.f101258b;
        super.b(bVar);
        try {
            Integer num = (Integer) captureResult.get(CaptureResult.JPEG_ORIENTATION);
            if (num != null) {
                bVar.m(num.intValue());
            }
        } catch (BufferUnderflowException unused) {
            C.S.k("C2CameraCaptureResult", "Failed to get JPEG orientation.");
        }
        Long l11 = (Long) captureResult.get(CaptureResult.SENSOR_EXPOSURE_TIME);
        if (l11 != null) {
            bVar.f(l11.longValue());
        }
        Float f7 = (Float) captureResult.get(CaptureResult.LENS_APERTURE);
        if (f7 != null) {
            bVar.l(f7.floatValue());
        }
        Integer num2 = (Integer) captureResult.get(CaptureResult.SENSOR_SENSITIVITY);
        if (num2 != null) {
            if (((Integer) captureResult.get(CaptureResult.CONTROL_POST_RAW_SENSITIVITY_BOOST)) != null) {
                num2 = Integer.valueOf(num2.intValue() * ((int) (r2.intValue() / 100.0f)));
            }
            bVar.k(num2.intValue());
        }
        Float f11 = (Float) captureResult.get(CaptureResult.LENS_FOCAL_LENGTH);
        if (f11 != null) {
            bVar.h(f11.floatValue());
        }
        Integer num3 = (Integer) captureResult.get(CaptureResult.CONTROL_AWB_MODE);
        if (num3 != null) {
            j.c cVar = j.c.AUTO;
            if (num3.intValue() == 0) {
                cVar = j.c.MANUAL;
            }
            bVar.n(cVar);
        }
    }

    @Override // androidx.camera.core.impl.InterfaceC5130z
    @NonNull
    public final EnumC5122v c() {
        Integer num = (Integer) this.f101258b.get(CaptureResult.CONTROL_AF_STATE);
        if (num == null) {
            return EnumC5122v.UNKNOWN;
        }
        switch (num.intValue()) {
            case 0:
                break;
            case 1:
            case 3:
                break;
            case 2:
                break;
            case 4:
                break;
            case 5:
                break;
            case 6:
                break;
            default:
                C.S.c("C2CameraCaptureResult", "Undefined af state: " + num);
                break;
        }
        return EnumC5122v.UNKNOWN;
    }

    @Override // androidx.camera.core.impl.InterfaceC5130z
    @NonNull
    public final EnumC5126x d() {
        Integer num = (Integer) this.f101258b.get(CaptureResult.CONTROL_AWB_STATE);
        if (num == null) {
            return EnumC5126x.UNKNOWN;
        }
        int intValue = num.intValue();
        if (intValue == 0) {
            return EnumC5126x.INACTIVE;
        }
        if (intValue == 1) {
            return EnumC5126x.METERING;
        }
        if (intValue == 2) {
            return EnumC5126x.CONVERGED;
        }
        if (intValue == 3) {
            return EnumC5126x.LOCKED;
        }
        C.S.c("C2CameraCaptureResult", "Undefined awb state: " + num);
        return EnumC5126x.UNKNOWN;
    }

    @Override // androidx.camera.core.impl.InterfaceC5130z
    @NonNull
    public final EnumC5118t e() {
        Integer num = (Integer) this.f101258b.get(CaptureResult.CONTROL_AE_STATE);
        if (num == null) {
            return EnumC5118t.UNKNOWN;
        }
        int intValue = num.intValue();
        if (intValue == 0) {
            return EnumC5118t.INACTIVE;
        }
        if (intValue != 1) {
            if (intValue == 2) {
                return EnumC5118t.CONVERGED;
            }
            if (intValue == 3) {
                return EnumC5118t.LOCKED;
            }
            if (intValue == 4) {
                return EnumC5118t.FLASH_REQUIRED;
            }
            if (intValue != 5) {
                C.S.c("C2CameraCaptureResult", "Undefined ae state: " + num);
                return EnumC5118t.UNKNOWN;
            }
        }
        return EnumC5118t.SEARCHING;
    }

    @Override // androidx.camera.core.impl.InterfaceC5130z
    @NonNull
    public final EnumC5128y f() {
        Integer num = (Integer) this.f101258b.get(CaptureResult.FLASH_STATE);
        if (num == null) {
            return EnumC5128y.UNKNOWN;
        }
        int intValue = num.intValue();
        if (intValue == 0 || intValue == 1) {
            return EnumC5128y.NONE;
        }
        if (intValue == 2) {
            return EnumC5128y.READY;
        }
        if (intValue == 3 || intValue == 4) {
            return EnumC5128y.FIRED;
        }
        C.S.c("C2CameraCaptureResult", "Undefined flash state: " + num);
        return EnumC5128y.UNKNOWN;
    }

    @Override // androidx.camera.core.impl.InterfaceC5130z
    @NonNull
    public final CaptureResult g() {
        return this.f101258b;
    }

    @Override // androidx.camera.core.impl.InterfaceC5130z
    public final long getTimestamp() {
        Long l11 = (Long) this.f101258b.get(CaptureResult.SENSOR_TIMESTAMP);
        if (l11 == null) {
            return -1L;
        }
        return l11.longValue();
    }

    @NonNull
    public final EnumC5116s h() {
        Integer num = (Integer) this.f101258b.get(CaptureResult.CONTROL_AE_MODE);
        if (num == null) {
            return EnumC5116s.UNKNOWN;
        }
        int intValue = num.intValue();
        if (intValue == 0) {
            return EnumC5116s.OFF;
        }
        if (intValue == 1) {
            return EnumC5116s.ON;
        }
        if (intValue == 2) {
            return EnumC5116s.ON_AUTO_FLASH;
        }
        if (intValue == 3) {
            return EnumC5116s.ON_ALWAYS_FLASH;
        }
        if (intValue == 4) {
            return EnumC5116s.ON_AUTO_FLASH_REDEYE;
        }
        if (intValue == 5 && Build.VERSION.SDK_INT >= 28) {
            return EnumC5116s.ON_EXTERNAL_FLASH;
        }
        return EnumC5116s.UNKNOWN;
    }

    @NonNull
    public final EnumC5120u i() {
        Integer num = (Integer) this.f101258b.get(CaptureResult.CONTROL_AF_MODE);
        if (num == null) {
            return EnumC5120u.UNKNOWN;
        }
        int intValue = num.intValue();
        if (intValue != 0) {
            if (intValue == 1 || intValue == 2) {
                return EnumC5120u.ON_MANUAL_AUTO;
            }
            if (intValue == 3 || intValue == 4) {
                return EnumC5120u.ON_CONTINUOUS_AUTO;
            }
            if (intValue != 5) {
                C.S.c("C2CameraCaptureResult", "Undefined af mode: " + num);
                return EnumC5120u.UNKNOWN;
            }
        }
        return EnumC5120u.OFF;
    }

    @NonNull
    public final EnumC5124w j() {
        Integer num = (Integer) this.f101258b.get(CaptureResult.CONTROL_AWB_MODE);
        if (num == null) {
            return EnumC5124w.UNKNOWN;
        }
        switch (num.intValue()) {
        }
        return EnumC5124w.UNKNOWN;
    }

    public C10100h(@NonNull CaptureResult captureResult) {
        this(androidx.camera.core.impl.X0.b(), captureResult);
    }
}
