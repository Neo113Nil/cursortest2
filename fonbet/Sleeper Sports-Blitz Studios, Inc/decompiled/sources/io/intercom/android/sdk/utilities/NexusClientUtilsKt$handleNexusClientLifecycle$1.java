package io.intercom.android.sdk.utilities;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* compiled from: NexusClientUtils.kt */
@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "io.intercom.android.sdk.utilities.NexusClientUtilsKt", f = "NexusClientUtils.kt", i = {}, l = {11}, m = "handleNexusClientLifecycle", n = {}, s = {})
/* loaded from: classes9.dex */
final class NexusClientUtilsKt$handleNexusClientLifecycle$1 extends ContinuationImpl {
    int label;
    /* synthetic */ Object result;

    NexusClientUtilsKt$handleNexusClientLifecycle$1(Continuation<? super NexusClientUtilsKt$handleNexusClientLifecycle$1> continuation) {
        super(continuation);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return NexusClientUtilsKt.handleNexusClientLifecycle(null, null, this);
    }
}
