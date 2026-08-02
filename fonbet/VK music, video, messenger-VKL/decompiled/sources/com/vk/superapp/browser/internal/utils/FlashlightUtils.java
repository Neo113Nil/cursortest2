package com.vk.superapp.browser.internal.utils;

import android.graphics.SurfaceTexture;
import android.hardware.Camera;
import io.reactivex.rxjava3.core.w;
import xsna.asp;
import xsna.xgx0;
import xsna.zrp;

/* compiled from: FlashlightUtils.kt */
/* loaded from: classes6.dex */
public final class FlashlightUtils {
    public static final w a = io.reactivex.rxjava3.schedulers.a.c();
    public static Camera b;
    public static SurfaceTexture c;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: FlashlightUtils.kt */
    public static final class EnableFlashlightResult {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ EnableFlashlightResult[] $VALUES;
        public static final EnableFlashlightResult NO_PERMISSIONS;
        public static final EnableFlashlightResult SUCCESS;

        static {
            EnableFlashlightResult enableFlashlightResult = new EnableFlashlightResult("SUCCESS", 0);
            SUCCESS = enableFlashlightResult;
            EnableFlashlightResult enableFlashlightResult2 = new EnableFlashlightResult("NO_PERMISSIONS", 1);
            NO_PERMISSIONS = enableFlashlightResult2;
            EnableFlashlightResult[] enableFlashlightResultArr = {enableFlashlightResult, enableFlashlightResult2};
            $VALUES = enableFlashlightResultArr;
            $ENTRIES = new asp(enableFlashlightResultArr);
        }

        public EnableFlashlightResult() {
            throw null;
        }

        public static EnableFlashlightResult valueOf(String str) {
            return (EnableFlashlightResult) Enum.valueOf(EnableFlashlightResult.class, str);
        }

        public static EnableFlashlightResult[] values() {
            return (EnableFlashlightResult[]) $VALUES.clone();
        }
    }

    public static void a() {
        try {
            b = Camera.open();
            SurfaceTexture surfaceTexture = new SurfaceTexture(0);
            c = surfaceTexture;
            Camera camera = b;
            if (camera != null) {
                camera.setPreviewTexture(surfaceTexture);
            }
            Camera camera2 = b;
            if (camera2 != null) {
                camera2.startPreview();
            }
        } catch (Throwable th) {
            xgx0.a.getClass();
            xgx0.g("error: " + th);
        }
    }
}
