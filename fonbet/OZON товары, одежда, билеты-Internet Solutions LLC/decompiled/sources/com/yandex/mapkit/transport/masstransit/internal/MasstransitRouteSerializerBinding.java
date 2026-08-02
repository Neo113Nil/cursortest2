package com.yandex.mapkit.transport.masstransit.internal;

import androidx.annotation.NonNull;
import com.yandex.mapkit.transport.masstransit.MasstransitRouteSerializer;
import com.yandex.mapkit.transport.masstransit.Route;
import com.yandex.runtime.NativeObject;

/* loaded from: classes9.dex */
public class MasstransitRouteSerializerBinding implements MasstransitRouteSerializer {
    private final NativeObject nativeObject;

    protected MasstransitRouteSerializerBinding(NativeObject nativeObject) {
        this.nativeObject = nativeObject;
    }

    @Override // com.yandex.mapkit.transport.masstransit.MasstransitRouteSerializer
    public native Route load(@NonNull byte[] bArr);

    @Override // com.yandex.mapkit.transport.masstransit.MasstransitRouteSerializer
    @NonNull
    public native byte[] save(@NonNull Route route);
}
