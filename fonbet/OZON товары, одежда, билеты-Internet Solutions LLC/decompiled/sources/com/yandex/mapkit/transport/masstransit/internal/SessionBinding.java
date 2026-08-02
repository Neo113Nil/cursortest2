package com.yandex.mapkit.transport.masstransit.internal;

import androidx.annotation.NonNull;
import com.yandex.mapkit.transport.masstransit.Session;
import com.yandex.runtime.NativeObject;

/* loaded from: classes9.dex */
public class SessionBinding implements Session {
    private final NativeObject nativeObject;

    protected SessionBinding(NativeObject nativeObject) {
        this.nativeObject = nativeObject;
    }

    @Override // com.yandex.mapkit.transport.masstransit.Session
    public native void cancel();

    @Override // com.yandex.mapkit.transport.masstransit.Session
    public native void retry(@NonNull Session.RouteListener routeListener);
}
