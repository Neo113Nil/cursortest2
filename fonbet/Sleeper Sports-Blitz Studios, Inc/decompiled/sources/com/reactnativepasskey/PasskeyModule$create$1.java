package com.reactnativepasskey;

import android.app.Activity;
import android.os.Bundle;
import androidx.credentials.CreateCredentialResponse;
import androidx.credentials.CreatePublicKeyCredentialRequest;
import androidx.credentials.CreatePublicKeyCredentialResponse;
import androidx.credentials.CredentialManager;
import androidx.credentials.exceptions.CreateCredentialException;
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
@DebugMetadata(c = "com.reactnativepasskey.PasskeyModule$create$1", f = "PasskeyModule.kt", i = {}, l = {34}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes8.dex */
final class PasskeyModule$create$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ CreatePublicKeyCredentialRequest $createPublicKeyCredentialRequest;
    final /* synthetic */ CredentialManager $credentialManager;
    final /* synthetic */ Promise $promise;
    int label;
    final /* synthetic */ PasskeyModule this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    PasskeyModule$create$1(PasskeyModule passkeyModule, Promise promise, CredentialManager credentialManager, CreatePublicKeyCredentialRequest createPublicKeyCredentialRequest, Continuation<? super PasskeyModule$create$1> continuation) {
        super(2, continuation);
        this.this$0 = passkeyModule;
        this.$promise = promise;
        this.$credentialManager = credentialManager;
        this.$createPublicKeyCredentialRequest = createPublicKeyCredentialRequest;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new PasskeyModule$create$1(this.this$0, this.$promise, this.$credentialManager, this.$createPublicKeyCredentialRequest, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((PasskeyModule$create$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        String handleRegistrationException;
        ReactApplicationContext reactApplicationContext;
        CreateCredentialResponse createCredentialResponse;
        Bundle data;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        String str = null;
        try {
        } catch (CreateCredentialException e) {
            handleRegistrationException = this.this$0.handleRegistrationException(e);
            this.$promise.reject(handleRegistrationException, handleRegistrationException);
        }
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            reactApplicationContext = this.this$0.getReactApplicationContext();
            Activity currentActivity = reactApplicationContext.getCurrentActivity();
            if (currentActivity == null) {
                createCredentialResponse = null;
                if (createCredentialResponse != null && (data = createCredentialResponse.getData()) != null) {
                    str = data.getString(CreatePublicKeyCredentialResponse.BUNDLE_KEY_REGISTRATION_RESPONSE_JSON);
                }
                this.$promise.resolve(str);
                return Unit.INSTANCE;
            }
            CredentialManager credentialManager = this.$credentialManager;
            CreatePublicKeyCredentialRequest createPublicKeyCredentialRequest = this.$createPublicKeyCredentialRequest;
            this.label = 1;
            obj = credentialManager.createCredential(currentActivity, createPublicKeyCredentialRequest, this);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
        }
        createCredentialResponse = (CreateCredentialResponse) obj;
        if (createCredentialResponse != null) {
            str = data.getString(CreatePublicKeyCredentialResponse.BUNDLE_KEY_REGISTRATION_RESPONSE_JSON);
        }
        this.$promise.resolve(str);
        return Unit.INSTANCE;
    }
}
