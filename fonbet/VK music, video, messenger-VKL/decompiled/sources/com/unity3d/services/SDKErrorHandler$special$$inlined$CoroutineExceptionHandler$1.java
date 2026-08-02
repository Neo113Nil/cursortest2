package com.unity3d.services;

import com.unity3d.services.core.log.DeviceLog;
import kotlin.coroutines.a;
import kotlin.coroutines.d;
import xsna.pvj;

/* compiled from: CoroutineExceptionHandler.kt */
/* loaded from: classes14.dex */
public final class SDKErrorHandler$special$$inlined$CoroutineExceptionHandler$1 extends a implements pvj {
    public SDKErrorHandler$special$$inlined$CoroutineExceptionHandler$1(pvj.a aVar) {
        super(aVar);
    }

    @Override // xsna.pvj
    public void handleException(d dVar, Throwable th) {
        DeviceLog.error("SDKErrorHandler encountered an exception: %s", th);
    }
}
