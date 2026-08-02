package com.unity3d.ads.core.extensions;

import kotlin.coroutines.EmptyCoroutineContext;
import kotlinx.coroutines.channels.BufferOverflow;
import xsna.gzs;
import xsna.ksr;
import xsna.s3q0;
import xsna.spj;
import xsna.tya;
import xsna.wzs;

/* compiled from: FlowExtensions.kt */
/* loaded from: classes14.dex */
public final class FlowExtensionsKt {
    public static final <T> ksr<T> timeoutAfter(ksr<? extends T> ksrVar, long j, boolean z, wzs<? super gzs<s3q0>, ? super spj<? super s3q0>, ? extends Object> wzsVar) {
        return new tya(new FlowExtensionsKt$timeoutAfter$1(j, z, wzsVar, ksrVar, null), EmptyCoroutineContext.b, -2, BufferOverflow.SUSPEND);
    }

    public static /* synthetic */ ksr timeoutAfter$default(ksr ksrVar, long j, boolean z, wzs wzsVar, int i, Object obj) {
        if ((i & 2) != 0) {
            z = true;
        }
        return timeoutAfter(ksrVar, j, z, wzsVar);
    }
}
