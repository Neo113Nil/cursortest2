package com.yandex.mapkit.map.internal;

import com.yandex.mapkit.map.PlacemarkPresentation;
import com.yandex.runtime.NativeObject;

/* loaded from: classes9.dex */
public class PlacemarkPresentationBinding implements PlacemarkPresentation {
    private final NativeObject nativeObject;

    protected PlacemarkPresentationBinding(NativeObject nativeObject) {
        this.nativeObject = nativeObject;
    }

    @Override // com.yandex.mapkit.map.PlacemarkPresentation
    public native boolean isValid();

    @Override // com.yandex.mapkit.map.PlacemarkPresentation
    public native void remove();
}
