package com.yandex.runtime.view.internal;

import android.graphics.PointF;
import androidx.annotation.NonNull;
import com.yandex.runtime.NativeObject;
import com.yandex.runtime.view.Surface;

/* loaded from: classes9.dex */
public class SurfaceBinding implements Surface {
    private final NativeObject nativeObject;

    protected SurfaceBinding(NativeObject nativeObject) {
        this.nativeObject = nativeObject;
    }

    @Override // com.yandex.runtime.view.Surface
    @NonNull
    public native PointF getAnchorPoint();

    @Override // com.yandex.runtime.view.Surface
    public native void setAnchorPoint(@NonNull PointF pointF);
}
