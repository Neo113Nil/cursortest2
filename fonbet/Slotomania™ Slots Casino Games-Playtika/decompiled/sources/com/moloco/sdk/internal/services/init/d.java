package com.moloco.sdk.internal.services.init;

import com.moloco.sdk.Init;
import com.moloco.sdk.acm.recorder.MetricsRecorder;
import com.moloco.sdk.internal.v;
import com.moloco.sdk.publisher.MediationInfo;
import kotlin.coroutines.Continuation;

/* loaded from: classes5.dex */
public interface d {
    public static final a a = a.a;
    public static final long b = 3000;

    public static final class a {
        public static final /* synthetic */ a a = new a();
        public static final long b = 3000;
    }

    Object a(String str, MediationInfo mediationInfo, MetricsRecorder metricsRecorder, Continuation<? super v<Init.SDKInitResponse, j>> continuation);
}
