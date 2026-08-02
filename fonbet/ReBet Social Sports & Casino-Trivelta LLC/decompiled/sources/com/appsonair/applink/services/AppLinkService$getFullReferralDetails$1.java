package com.appsonair.applink.services;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(k = 3, mv = {1, 7, 1}, xi = 48)
@DebugMetadata(c = "com.appsonair.applink.services.AppLinkService", f = "AppLinkService.kt", i = {0, 0}, l = {307}, m = "getFullReferralDetails", n = {"this", "referLink"}, s = {"L$0", "L$1"})
/* loaded from: classes.dex */
public final class AppLinkService$getFullReferralDetails$1 extends ContinuationImpl {
    Object L$0;
    Object L$1;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ AppLinkService this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AppLinkService$getFullReferralDetails$1(AppLinkService appLinkService, Continuation<? super AppLinkService$getFullReferralDetails$1> continuation) {
        super(continuation);
        this.this$0 = appLinkService;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        Object fullReferralDetails;
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        fullReferralDetails = this.this$0.getFullReferralDetails(null, null, null, this);
        return fullReferralDetails;
    }
}
