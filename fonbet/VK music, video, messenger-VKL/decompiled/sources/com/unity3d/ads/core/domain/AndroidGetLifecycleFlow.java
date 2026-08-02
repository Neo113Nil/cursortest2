package com.unity3d.ads.core.domain;

import android.app.Application;
import android.content.Context;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlinx.coroutines.channels.BufferOverflow;
import xsna.ksr;
import xsna.rsr;
import xsna.tya;

/* compiled from: AndroidGetLifecycleFlow.kt */
/* loaded from: classes14.dex */
public final class AndroidGetLifecycleFlow {
    private final Context applicationContext;

    public AndroidGetLifecycleFlow(Context context) {
        this.applicationContext = context;
    }

    public final ksr<LifecycleEvent> invoke() {
        if (this.applicationContext instanceof Application) {
            return rsr.h(new tya(new AndroidGetLifecycleFlow$invoke$2(this, null), EmptyCoroutineContext.b, -2, BufferOverflow.SUSPEND), Integer.MAX_VALUE);
        }
        throw new IllegalArgumentException("Application context is required");
    }
}
