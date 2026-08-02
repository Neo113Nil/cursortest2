package com.vk.camera.sdk.impl;

import android.hardware.camera2.CameraCharacteristics;
import com.vk.camera.sdk.impl.CameraException;
import xsna.khu0;

/* compiled from: CameraInfoImpl.kt */
/* loaded from: classes16.dex */
public abstract class c implements khu0 {
    public final int a;
    public final int b;
    public final boolean c;

    /* compiled from: CameraInfoImpl.kt */
    public static final class a extends c {
    }

    /* compiled from: CameraInfoImpl.kt */
    public static final class b extends c {
        public final CameraCharacteristics d;

        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public b(CameraCharacteristics cameraCharacteristics) {
            super(r0, (r2.intValue() == 0 || r2.intValue() != 1) ? 1 : 0, true);
            Integer num = (Integer) cameraCharacteristics.get(CameraCharacteristics.SENSOR_ORIENTATION);
            int intValue = num != null ? num.intValue() : 0;
            Integer num2 = (Integer) cameraCharacteristics.get(CameraCharacteristics.LENS_FACING);
            if (num2 == null) {
                throw new CameraException.Error("Chars doesn't contain facing");
            }
            this.d = cameraCharacteristics;
        }
    }

    public c(int i, int i2, boolean z) {
        this.a = i;
        this.b = i2;
        this.c = z;
    }

    @Override // xsna.khu0
    public final int a() {
        return this.b;
    }

    @Override // xsna.khu0
    public final boolean c() {
        return this.c;
    }

    @Override // xsna.khu0
    public final int getOrientation() {
        return this.a;
    }
}
