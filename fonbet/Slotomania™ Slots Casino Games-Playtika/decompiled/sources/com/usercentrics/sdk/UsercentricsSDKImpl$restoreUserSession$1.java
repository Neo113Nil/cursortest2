package com.usercentrics.sdk;

import com.usercentrics.sdk.core.application.Application;
import com.usercentrics.sdk.errors.NotReadyException;
import com.usercentrics.sdk.errors.RestoreUserSessionDisabledException;
import com.usercentrics.sdk.errors.RestoreUserSessionNotSupportedException;
import com.usercentrics.sdk.errors.UsercentricsException;
import com.usercentrics.sdk.models.common.UsercentricsVariant;
import com.usercentrics.sdk.v2.async.dispatcher.DispatcherScope;
import com.usercentrics.sdk.v2.settings.data.NewSettingsData;
import com.usercentrics.sdk.v2.settings.data.UsercentricsSettings;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: UsercentricsSDKImpl.kt */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Lcom/usercentrics/sdk/v2/async/dispatcher/DispatcherScope;"}, k = 3, mv = {1, 9, 0}, xi = 48)
@DebugMetadata(c = "com.usercentrics.sdk.UsercentricsSDKImpl$restoreUserSession$1", f = "UsercentricsSDKImpl.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes2.dex */
final class UsercentricsSDKImpl$restoreUserSession$1 extends SuspendLambda implements Function2<DispatcherScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ String $controllerId;
    final /* synthetic */ Function1<UsercentricsException, Unit> $onError;
    final /* synthetic */ Function0<Unit> $onSuccessCallback;
    int label;
    final /* synthetic */ UsercentricsSDKImpl this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    UsercentricsSDKImpl$restoreUserSession$1(UsercentricsSDKImpl usercentricsSDKImpl, Function1<? super UsercentricsException, Unit> function1, String str, Function0<Unit> function0, Continuation<? super UsercentricsSDKImpl$restoreUserSession$1> continuation) {
        super(2, continuation);
        this.this$0 = usercentricsSDKImpl;
        this.$onError = function1;
        this.$controllerId = str;
        this.$onSuccessCallback = function0;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new UsercentricsSDKImpl$restoreUserSession$1(this.this$0, this.$onError, this.$controllerId, this.$onSuccessCallback, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(DispatcherScope dispatcherScope, Continuation<? super Unit> continuation) {
        return ((UsercentricsSDKImpl$restoreUserSession$1) create(dispatcherScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Application application;
        Application application2;
        String str;
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        AssertionsKt.assertNotUIThread();
        application = this.this$0.application;
        NewSettingsData settings = application.getSettingsService().getSettings();
        UsercentricsSettings data = settings != null ? settings.getData() : null;
        Boolean boxBoolean = data != null ? Boxing.boxBoolean(data.getConsentXDevice()) : null;
        application2 = this.this$0.application;
        UsercentricsVariant variant = application2.getInitialValuesStrategy().getValue().getVariant();
        if (boxBoolean == null || variant == null) {
            this.$onError.invoke(new NotReadyException());
        } else if (!boxBoolean.booleanValue()) {
            this.$onError.invoke(new RestoreUserSessionDisabledException());
        } else if (variant == UsercentricsVariant.CCPA) {
            this.$onError.invoke(new RestoreUserSessionNotSupportedException(variant.name()));
        } else {
            str = this.this$0.activeControllerId;
            if (Intrinsics.areEqual(str, this.$controllerId)) {
                this.$onSuccessCallback.invoke();
            } else {
                this.this$0.doRestoreUserSession(this.$controllerId, this.$onSuccessCallback, this.$onError);
            }
        }
        return Unit.INSTANCE;
    }
}
