package com.yandex.mapkit.transport.masstransit.internal;

import androidx.annotation.NonNull;
import com.yandex.mapkit.transport.masstransit.SummarySession;
import com.yandex.runtime.NativeObject;

/* loaded from: classes9.dex */
public class SummarySessionBinding implements SummarySession {
    private final NativeObject nativeObject;

    protected SummarySessionBinding(NativeObject nativeObject) {
        this.nativeObject = nativeObject;
    }

    @Override // com.yandex.mapkit.transport.masstransit.SummarySession
    public native void cancel();

    @Override // com.yandex.mapkit.transport.masstransit.SummarySession
    public native void retry(@NonNull SummarySession.SummaryListener summaryListener);
}
