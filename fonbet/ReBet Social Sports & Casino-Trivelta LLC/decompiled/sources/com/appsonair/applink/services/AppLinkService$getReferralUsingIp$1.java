package com.appsonair.applink.services;

import com.twilio.voice.EventKeys;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(k = 3, mv = {1, 7, 1}, xi = 48)
@DebugMetadata(c = "com.appsonair.applink.services.AppLinkService", f = "AppLinkService.kt", i = {0, 1, 1, 1}, l = {250, 254}, m = "getReferralUsingIp", n = {"this", "this", EventKeys.DATA, "dataObject"}, s = {"L$0", "L$0", "L$1", "L$2"})
/* loaded from: classes.dex */
public final class AppLinkService$getReferralUsingIp$1 extends ContinuationImpl {
    Object L$0;
    Object L$1;
    Object L$2;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ AppLinkService this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AppLinkService$getReferralUsingIp$1(AppLinkService appLinkService, Continuation<? super AppLinkService$getReferralUsingIp$1> continuation) {
        super(continuation);
        this.this$0 = appLinkService;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.getReferralUsingIp(this);
    }
}
