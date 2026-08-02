package com.reactnativepasskey;

import android.content.Context;
import androidx.credentials.CreatePublicKeyCredentialRequest;
import androidx.credentials.CredentialManager;
import androidx.credentials.GetCredentialRequest;
import androidx.credentials.GetPublicKeyCredentialOption;
import androidx.credentials.exceptions.CreateCredentialCancellationException;
import androidx.credentials.exceptions.CreateCredentialException;
import androidx.credentials.exceptions.CreateCredentialInterruptedException;
import androidx.credentials.exceptions.CreateCredentialProviderConfigurationException;
import androidx.credentials.exceptions.CreateCredentialUnknownException;
import androidx.credentials.exceptions.CreateCredentialUnsupportedException;
import androidx.credentials.exceptions.GetCredentialCancellationException;
import androidx.credentials.exceptions.GetCredentialException;
import androidx.credentials.exceptions.GetCredentialInterruptedException;
import androidx.credentials.exceptions.GetCredentialProviderConfigurationException;
import androidx.credentials.exceptions.GetCredentialUnknownException;
import androidx.credentials.exceptions.GetCredentialUnsupportedException;
import androidx.credentials.exceptions.NoCredentialException;
import androidx.credentials.exceptions.publickeycredential.CreatePublicKeyCredentialDomException;
import androidx.credentials.exceptions.publickeycredential.GetPublicKeyCredentialDomException;
import com.facebook.internal.NativeProtocol;
import com.facebook.react.bridge.BaseJavaModule;
import com.facebook.react.bridge.Promise;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.nimbusds.jose.jwk.JWKParameterNames;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.Dispatchers;

/* compiled from: PasskeyModule.kt */
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\b\u0010\b\u001a\u00020\tH\u0016J(\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\t2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\u0011H\u0007J\u0010\u0010\u0012\u001a\u00020\t2\u0006\u0010\u0013\u001a\u00020\u0014H\u0002J0\u0010\u0015\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\t2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0016\u001a\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\u0011H\u0007J\u0010\u0010\u0017\u001a\u00020\t2\u0006\u0010\u0013\u001a\u00020\u0018H\u0002R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0019"}, d2 = {"Lcom/reactnativepasskey/PasskeyModule;", "Lcom/facebook/react/bridge/ReactContextBaseJavaModule;", "reactContext", "Lcom/facebook/react/bridge/ReactApplicationContext;", "<init>", "(Lcom/facebook/react/bridge/ReactApplicationContext;)V", "mainScope", "Lkotlinx/coroutines/CoroutineScope;", "getName", "", "create", "", "requestJson", "forcePlatformKey", "", "forceSecurityKey", BaseJavaModule.METHOD_TYPE_PROMISE, "Lcom/facebook/react/bridge/Promise;", "handleRegistrationException", JWKParameterNames.RSA_EXPONENT, "Landroidx/credentials/exceptions/CreateCredentialException;", "get", "preferImmediatelyAvailableCredentials", "handleAuthenticationException", "Landroidx/credentials/exceptions/GetCredentialException;", "react-native-passkey_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class PasskeyModule extends ReactContextBaseJavaModule {
    private final CoroutineScope mainScope;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PasskeyModule(ReactApplicationContext reactContext) {
        super(reactContext);
        Intrinsics.checkNotNullParameter(reactContext, "reactContext");
        this.mainScope = CoroutineScopeKt.CoroutineScope(Dispatchers.getDefault());
    }

    @Override // com.facebook.react.bridge.NativeModule
    public String getName() {
        return "Passkey";
    }

    @ReactMethod
    public final void create(String requestJson, boolean forcePlatformKey, boolean forceSecurityKey, Promise promise) {
        Intrinsics.checkNotNullParameter(requestJson, "requestJson");
        Intrinsics.checkNotNullParameter(promise, "promise");
        CredentialManager.Companion companion = CredentialManager.INSTANCE;
        Context applicationContext = getReactApplicationContext().getApplicationContext();
        Intrinsics.checkNotNullExpressionValue(applicationContext, "getApplicationContext(...)");
        BuildersKt__Builders_commonKt.launch$default(this.mainScope, null, null, new PasskeyModule$create$1(this, promise, companion.create(applicationContext), new CreatePublicKeyCredentialRequest(requestJson, null, false, null, false, 30, null), null), 3, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final String handleRegistrationException(CreateCredentialException e) {
        e.printStackTrace();
        if (e instanceof CreatePublicKeyCredentialDomException) {
            return String.valueOf(e.getErrorMessage());
        }
        if (e instanceof CreateCredentialCancellationException) {
            return "UserCancelled";
        }
        if (e instanceof CreateCredentialInterruptedException) {
            return "Interrupted";
        }
        if (e instanceof CreateCredentialProviderConfigurationException) {
            return "NotConfigured";
        }
        if (e instanceof CreateCredentialUnknownException) {
            return NativeProtocol.ERROR_UNKNOWN_ERROR;
        }
        if (e instanceof CreateCredentialUnsupportedException) {
            return "NotSupported";
        }
        return String.valueOf(e.getErrorMessage());
    }

    @ReactMethod
    public final void get(String requestJson, boolean forcePlatformKey, boolean forceSecurityKey, boolean preferImmediatelyAvailableCredentials, Promise promise) {
        Intrinsics.checkNotNullParameter(requestJson, "requestJson");
        Intrinsics.checkNotNullParameter(promise, "promise");
        CredentialManager.Companion companion = CredentialManager.INSTANCE;
        Context applicationContext = getReactApplicationContext().getApplicationContext();
        Intrinsics.checkNotNullExpressionValue(applicationContext, "getApplicationContext(...)");
        BuildersKt__Builders_commonKt.launch$default(this.mainScope, null, null, new PasskeyModule$get$1(this, promise, companion.create(applicationContext), new GetCredentialRequest(CollectionsKt.listOf(new GetPublicKeyCredentialOption(requestJson, null, null, 6, null)), null, false, null, preferImmediatelyAvailableCredentials, 14, null), null), 3, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final String handleAuthenticationException(GetCredentialException e) {
        e.printStackTrace();
        if (e instanceof GetPublicKeyCredentialDomException) {
            return String.valueOf(e.getErrorMessage());
        }
        if (e instanceof GetCredentialCancellationException) {
            return "UserCancelled";
        }
        if (e instanceof GetCredentialInterruptedException) {
            return "Interrupted";
        }
        if (e instanceof GetCredentialProviderConfigurationException) {
            return "NotConfigured";
        }
        if (e instanceof GetCredentialUnknownException) {
            return NativeProtocol.ERROR_UNKNOWN_ERROR;
        }
        if (e instanceof GetCredentialUnsupportedException) {
            return "NotSupported";
        }
        if (e instanceof NoCredentialException) {
            return "NoCredentials";
        }
        return String.valueOf(e.getErrorMessage());
    }
}
