package com.unity3d.services.core.extensions;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import ru.ok.android.webrtc.stat.call.internal.ConnectivityTracker;
import xsna.b6l;
import xsna.spj;

/* compiled from: TaskExtensions.kt */
@b6l(c = "com.unity3d.services.core.extensions.TaskExtensionsKt", f = "TaskExtensions.kt", l = {17, 30}, m = "withRetry")
/* loaded from: classes14.dex */
public final class TaskExtensionsKt$withRetry$1<T> extends ContinuationImpl {
    double D$0;
    int I$0;
    int I$1;
    int I$2;
    long J$0;
    Object L$0;
    Object L$1;
    Object L$2;
    int label;
    /* synthetic */ Object result;

    public TaskExtensionsKt$withRetry$1(spj<? super TaskExtensionsKt$withRetry$1> spjVar) {
        super(spjVar);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return TaskExtensionsKt.withRetry(0L, 0, ConnectivityTracker.DEFAULT_UPLINK_BITRATE, null, null, this);
    }
}
