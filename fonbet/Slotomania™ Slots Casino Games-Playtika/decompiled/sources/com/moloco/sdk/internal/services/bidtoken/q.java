package com.moloco.sdk.internal.services.bidtoken;

import com.moloco.sdk.acm.recorder.MetricsRecorder;
import com.moloco.sdk.service_locator.a;
import kotlin.Result;
import kotlin.coroutines.Continuation;

/* loaded from: classes7.dex */
public interface q {
    public static final a a = a.a;

    public static final class a {
        public static final /* synthetic */ a a = new a();

        public final q a() {
            return new r(a.h.a.i(), o.a.a(), com.moloco.sdk.internal.services.encryption.a.a.a(), com.moloco.sdk.internal.services.bidtoken.providers.l.a.a());
        }
    }

    Object a(MetricsRecorder metricsRecorder, String str, f fVar, Continuation<? super Result<String>> continuation);
}
