package com.reactnativepasskey;

import android.app.Activity;
import android.os.Bundle;
import androidx.credentials.Credential;
import androidx.credentials.CredentialManager;
import androidx.credentials.GetCredentialRequest;
import androidx.credentials.GetCredentialResponse;
import androidx.credentials.PublicKeyCredential;
import androidx.credentials.exceptions.GetCredentialException;
import com.facebook.react.bridge.Promise;
import com.facebook.react.bridge.ReactApplicationContext;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: PasskeyModule.kt */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
@DebugMetadata(c = "com.reactnativepasskey.PasskeyModule$get$1", f = "PasskeyModule.kt", i = {}, l = {82}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes8.dex */
final class PasskeyModule$get$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ CredentialManager $credentialManager;
    final /* synthetic */ GetCredentialRequest $getCredentialRequest;
    final /* synthetic */ Promise $promise;
    int label;
    final /* synthetic */ PasskeyModule this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    PasskeyModule$get$1(PasskeyModule passkeyModule, Promise promise, CredentialManager credentialManager, GetCredentialRequest getCredentialRequest, Continuation<? super PasskeyModule$get$1> continuation) {
        super(2, continuation);
        this.this$0 = passkeyModule;
        this.$promise = promise;
        this.$credentialManager = credentialManager;
        this.$getCredentialRequest = getCredentialRequest;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new PasskeyModule$get$1(this.this$0, this.$promise, this.$credentialManager, this.$getCredentialRequest, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((PasskeyModule$get$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        String handleAuthenticationException;
        ReactApplicationContext reactApplicationContext;
        GetCredentialResponse getCredentialResponse;
        Credential credential;
        Bundle data;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        String str = null;
        try {
        } catch (GetCredentialException e) {
            handleAuthenticationException = this.this$0.handleAuthenticationException(e);
            this.$promise.reject(handleAuthenticationException, handleAuthenticationException);
        }
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            reactApplicationContext = this.this$0.getReactApplicationContext();
            Activity currentActivity = reactApplicationContext.getCurrentActivity();
            if (currentActivity == null) {
                getCredentialResponse = null;
                if (getCredentialResponse != null && (credential = getCredentialResponse.getCredential()) != null && (data = credential.getData()) != null) {
                    str = data.getString(PublicKeyCredential.BUNDLE_KEY_AUTHENTICATION_RESPONSE_JSON);
                }
                this.$promise.resolve(str);
                return Unit.INSTANCE;
            }
            CredentialManager credentialManager = this.$credentialManager;
            GetCredentialRequest getCredentialRequest = this.$getCredentialRequest;
            this.label = 1;
            obj = credentialManager.getCredential(currentActivity, getCredentialRequest, this);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
        }
        getCredentialResponse = (GetCredentialResponse) obj;
        if (getCredentialResponse != null) {
            str = data.getString(PublicKeyCredential.BUNDLE_KEY_AUTHENTICATION_RESPONSE_JSON);
        }
        this.$promise.resolve(str);
        return Unit.INSTANCE;
    }
}
