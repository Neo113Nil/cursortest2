package io.intercom.android.sdk.utilities;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* compiled from: AblyClientUtils.kt */
@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "io.intercom.android.sdk.utilities.AblyClientUtilsKt", f = "AblyClientUtils.kt", i = {}, l = {11}, m = "handleAblyLifecycle", n = {}, s = {})
/* loaded from: classes9.dex */
final class AblyClientUtilsKt$handleAblyLifecycle$1 extends ContinuationImpl {
    int label;
    /* synthetic */ Object result;

    AblyClientUtilsKt$handleAblyLifecycle$1(Continuation<? super AblyClientUtilsKt$handleAblyLifecycle$1> continuation) {
        super(continuation);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return AblyClientUtilsKt.handleAblyLifecycle(null, null, this);
    }
}
