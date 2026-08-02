package com.usercentrics.sdk;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* compiled from: UsercentricsInternal.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
@DebugMetadata(c = "com.usercentrics.sdk.UsercentricsInternal", f = "UsercentricsInternal.kt", i = {0, 0, 0}, l = {164}, m = "initializeSDKOffline", n = {"this", "initializeOnlineError", "usercentrics"}, s = {"L$0", "L$1", "L$2"})
/* loaded from: classes5.dex */
final class UsercentricsInternal$initializeSDKOffline$1 extends ContinuationImpl {
    Object L$0;
    Object L$1;
    Object L$2;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ UsercentricsInternal this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    UsercentricsInternal$initializeSDKOffline$1(UsercentricsInternal usercentricsInternal, Continuation<? super UsercentricsInternal$initializeSDKOffline$1> continuation) {
        super(continuation);
        this.this$0 = usercentricsInternal;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object initializeSDKOffline;
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        initializeSDKOffline = this.this$0.initializeSDKOffline(null, this);
        return initializeSDKOffline;
    }
}
