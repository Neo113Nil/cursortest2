package com.appsonair.applink.services;

import Ph.P;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LPh/P;", "", "<anonymous>", "(LPh/P;)V"}, k = 3, mv = {1, 7, 1})
@DebugMetadata(c = "com.appsonair.applink.services.AppLinkService$fetchInstallReferrer$1$onInstallReferrerSetupFinished$2", f = "AppLinkService.kt", i = {}, l = {211}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes.dex */
public final class AppLinkService$fetchInstallReferrer$1$onInstallReferrerSetupFinished$2 extends SuspendLambda implements Function2<P, Continuation<? super Unit>, Object> {
    int label;
    final /* synthetic */ AppLinkService this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AppLinkService$fetchInstallReferrer$1$onInstallReferrerSetupFinished$2(AppLinkService appLinkService, Continuation<? super AppLinkService$fetchInstallReferrer$1$onInstallReferrerSetupFinished$2> continuation) {
        super(2, continuation);
        this.this$0 = appLinkService;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
        return new AppLinkService$fetchInstallReferrer$1$onInstallReferrerSetupFinished$2(this.this$0, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    @Nullable
    public final Object invoke(@NotNull P p10, @Nullable Continuation<? super Unit> continuation) {
        return ((AppLinkService$fetchInstallReferrer$1$onInstallReferrerSetupFinished$2) create(p10, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i10 = this.label;
        if (i10 == 0) {
            ResultKt.throwOnFailure(obj);
            AppLinkService appLinkService = this.this$0;
            this.label = 1;
            if (appLinkService.getReferralUsingIp(this) == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
        }
        return Unit.INSTANCE;
    }
}
