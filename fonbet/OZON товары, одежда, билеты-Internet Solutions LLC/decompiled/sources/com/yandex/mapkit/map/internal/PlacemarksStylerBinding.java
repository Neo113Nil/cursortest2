package com.yandex.mapkit.map.internal;

import android.graphics.PointF;
import androidx.annotation.NonNull;
import com.yandex.mapkit.map.PlacemarksStyler;
import com.yandex.runtime.NativeObject;
import java.util.List;

/* loaded from: classes9.dex */
public class PlacemarksStylerBinding implements PlacemarksStyler {
    private final NativeObject nativeObject;

    protected PlacemarksStylerBinding(NativeObject nativeObject) {
        this.nativeObject = nativeObject;
    }

    @Override // com.yandex.mapkit.map.PlacemarksStyler
    public native boolean isValid();

    @Override // com.yandex.mapkit.map.PlacemarksStyler
    public native void setScaleFunction(@NonNull List<PointF> list);
}
