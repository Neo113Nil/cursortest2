package com.google.android.libraries.barhopper;

import androidx.annotation.NonNull;
import com.google.android.apps.common.proguard.UsedByNative;

@UsedByNative("jni_common.cc")
/* loaded from: classes9.dex */
public final class MultiScaleDecodingOptions {

    @UsedByNative("jni_common.cc")
    private float[] extraScales = new float[0];

    @UsedByNative("jni_common.cc")
    private int minimumDetectedDimension = 10;

    @UsedByNative("jni_common.cc")
    private boolean skipProcessingIfBarcodeFound = true;

    public final void a(@NonNull float[] fArr) {
        this.extraScales = fArr;
    }

    public final void b(int i11) {
        this.minimumDetectedDimension = i11;
    }

    public final void c(boolean z11) {
        this.skipProcessingIfBarcodeFound = z11;
    }
}
