package com.moloco.sdk.internal.services.bidtoken;

import com.moloco.sdk.acm.recorder.MetricsRecorder;
import kotlin.coroutines.Continuation;

/* loaded from: classes7.dex */
public interface y {
    public static final a a = a.a;

    public static final class a {
        public static final /* synthetic */ a a = new a();

        public final y a() {
            z c;
            c = A.c();
            return c;
        }
    }

    Object a(MetricsRecorder metricsRecorder, Continuation<? super k> continuation);
}
