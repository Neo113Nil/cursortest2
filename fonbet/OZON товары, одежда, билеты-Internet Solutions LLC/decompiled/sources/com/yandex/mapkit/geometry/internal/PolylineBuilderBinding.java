package com.yandex.mapkit.geometry.internal;

import androidx.annotation.NonNull;
import com.yandex.mapkit.geometry.Point;
import com.yandex.mapkit.geometry.Polyline;
import com.yandex.mapkit.geometry.PolylineBuilder;
import com.yandex.runtime.NativeObject;

/* loaded from: classes9.dex */
public class PolylineBuilderBinding implements PolylineBuilder {
    private final NativeObject nativeObject;

    protected PolylineBuilderBinding(NativeObject nativeObject) {
        this.nativeObject = nativeObject;
    }

    @Override // com.yandex.mapkit.geometry.PolylineBuilder
    public native void append(@NonNull Point point);

    @Override // com.yandex.mapkit.geometry.PolylineBuilder
    public native void append(@NonNull Polyline polyline);

    @Override // com.yandex.mapkit.geometry.PolylineBuilder
    @NonNull
    public native Polyline build();
}
