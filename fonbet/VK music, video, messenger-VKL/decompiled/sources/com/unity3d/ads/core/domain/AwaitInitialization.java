package com.unity3d.ads.core.domain;

import com.unity3d.ads.core.data.model.InitializationState;
import xsna.spj;

/* compiled from: AwaitInitialization.kt */
/* loaded from: classes14.dex */
public interface AwaitInitialization {

    /* compiled from: AwaitInitialization.kt */
    public static final class DefaultImpls {
        public static /* synthetic */ Object invoke$default(AwaitInitialization awaitInitialization, long j, spj spjVar, int i, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: invoke");
            }
            if ((i & 1) != 0) {
                j = Long.MAX_VALUE;
            }
            return awaitInitialization.invoke(j, spjVar);
        }
    }

    Object invoke(long j, spj<? super InitializationState> spjVar);
}
