package com.vk.passkey;

import android.app.Activity;
import android.content.Intent;
import androidx.annotation.Keep;
import androidx.credentials.Credential;
import androidx.credentials.CredentialManager;
import androidx.credentials.GetCredentialRequest;
import androidx.credentials.GetCredentialResponse;
import androidx.credentials.GetPublicKeyCredentialOption;
import androidx.credentials.PublicKeyCredential;
import androidx.credentials.exceptions.GetCredentialCancellationException;
import androidx.credentials.exceptions.GetCredentialException;
import androidx.credentials.exceptions.GetCredentialUnsupportedException;
import androidx.credentials.exceptions.NoCredentialException;
import androidx.credentials.exceptions.publickeycredential.GetPublicKeyCredentialDomException;
import java.util.Collections;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import org.json.JSONArray;
import org.json.JSONObject;
import xsna.b6l;
import xsna.bdn;
import xsna.bm90;
import xsna.ie00;
import xsna.myc0;
import xsna.par0;
import xsna.s3q0;
import xsna.spj;
import xsna.wzs;
import xsna.yvj;
import xsna.zvj;

/* compiled from: PasskeySignInDelegateImpl.kt */
@Keep
/* loaded from: classes4.dex */
public final class PasskeySignInDelegateImpl {
    private final bm90 callback;

    /* compiled from: PasskeySignInDelegateImpl.kt */
    @b6l(c = "com.vk.passkey.PasskeySignInDelegateImpl$signInViaPasskey$1", f = "PasskeySignInDelegateImpl.kt", l = {62}, m = "invokeSuspend")
    public static final class a extends SuspendLambda implements wzs<yvj, spj<? super s3q0>, Object> {
        final /* synthetic */ Activity $activity;
        final /* synthetic */ String $json;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(Activity activity, String str, spj<? super a> spjVar) {
            super(2, spjVar);
            this.$activity = activity;
            this.$json = str;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final spj<s3q0> create(Object obj, spj<?> spjVar) {
            return PasskeySignInDelegateImpl.this.new a(this.$activity, this.$json, spjVar);
        }

        @Override // xsna.wzs
        public final Object invoke(yvj yvjVar, spj<? super s3q0> spjVar) {
            return ((a) create(yvjVar, spjVar)).invokeSuspend(s3q0.a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i = this.label;
            if (i == 0) {
                kotlin.a.a(obj);
                PasskeySignInDelegateImpl passkeySignInDelegateImpl = PasskeySignInDelegateImpl.this;
                Activity activity = this.$activity;
                String str = this.$json;
                this.label = 1;
                if (passkeySignInDelegateImpl.signInViaPasskeyInternal(activity, str, this) == coroutineSingletons) {
                    return coroutineSingletons;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.a.a(obj);
            }
            return s3q0.a;
        }
    }

    /* compiled from: PasskeySignInDelegateImpl.kt */
    @b6l(c = "com.vk.passkey.PasskeySignInDelegateImpl", f = "PasskeySignInDelegateImpl.kt", l = {72}, m = "signInViaPasskeyInternal")
    public static final class b extends ContinuationImpl {
        int label;
        /* synthetic */ Object result;

        public b(spj<? super b> spjVar) {
            super(spjVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return PasskeySignInDelegateImpl.this.signInViaPasskeyInternal(null, null, this);
        }
    }

    public PasskeySignInDelegateImpl(bm90 bm90Var) {
        this.callback = bm90Var;
    }

    private final String formatSignInJson(String str) {
        JSONObject jSONObject = new JSONObject(str);
        JSONObject jSONObject2 = jSONObject.getJSONObject("response");
        jSONObject2.put("clientDataJson", jSONObject2.remove("clientDataJSON"));
        jSONObject.put("response", jSONObject2);
        jSONObject.put("clientExtensionResults", new JSONArray());
        return jSONObject.toString();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:14:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0088  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0027  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object signInViaPasskeyInternal(Activity activity, String str, spj<? super s3q0> spjVar) {
        b bVar;
        int i;
        Credential credential;
        try {
            if (spjVar instanceof b) {
                bVar = (b) spjVar;
                int i2 = bVar.label;
                if ((i2 & Integer.MIN_VALUE) != 0) {
                    bVar.label = i2 - Integer.MIN_VALUE;
                    Object obj = bVar.result;
                    CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                    i = bVar.label;
                    if (i != 0) {
                        kotlin.a.a(obj);
                        CredentialManager create = CredentialManager.Companion.create(activity);
                        GetCredentialRequest getCredentialRequest = new GetCredentialRequest(Collections.singletonList(new GetPublicKeyCredentialOption(str, null, null, 6, null)), null, false, null, false, 30, null);
                        bVar.label = 1;
                        obj = create.getCredential(activity, getCredentialRequest, bVar);
                        if (obj == coroutineSingletons) {
                            return coroutineSingletons;
                        }
                    } else {
                        if (i != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        kotlin.a.a(obj);
                    }
                    credential = ((GetCredentialResponse) obj).getCredential();
                    if (credential instanceof PublicKeyCredential) {
                        IllegalStateException illegalStateException = new IllegalStateException("Wrong return type of passkey data");
                        par0.a.getClass();
                        par0.c("Passkey creads loading - unknown error", illegalStateException);
                        this.callback.a();
                    } else {
                        par0.a.getClass();
                        par0.a("Passkey creads loading - success");
                        this.callback.onSuccess(formatSignInJson(((PublicKeyCredential) credential).getAuthenticationResponseJson()));
                    }
                    return s3q0.a;
                }
            }
            if (i != 0) {
            }
            credential = ((GetCredentialResponse) obj).getCredential();
            if (credential instanceof PublicKeyCredential) {
            }
            return s3q0.a;
        } catch (Exception e) {
            if (e instanceof GetCredentialCancellationException) {
                par0.a.getClass();
                par0.a("Passkey creads loading - cancel");
                this.callback.onCancel();
            } else if (e instanceof NoCredentialException) {
                par0.a.getClass();
                par0.c("Passkey credentials error", e);
                this.callback.b();
            } else if (e instanceof GetPublicKeyCredentialDomException) {
                par0.a.getClass();
                par0.c("Passkey credentials error - DomException, probably user closed passkey window", e);
                this.callback.onCancel();
            } else if (e instanceof GetCredentialUnsupportedException) {
                par0.a.getClass();
                par0.c("Passkey credentials error - passkey unsupported", e);
                this.callback.a();
            } else if (e instanceof GetCredentialException) {
                par0.a.getClass();
                par0.c("Passkey credentials loading - error", e);
                this.callback.a();
            } else {
                par0.a.getClass();
                par0.c("Unknown passkey exception", e);
                this.callback.a();
            }
            return s3q0.a;
        }
        bVar = new b(spjVar);
        Object obj2 = bVar.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = bVar.label;
    }

    public void signInViaPasskey(Activity activity, String str) {
        bdn bdnVar = bdn.a;
        myc0.h(zvj.a(ie00.a), null, null, new a(activity, str, null), 3);
    }

    public void onActivityResult(Activity activity, int i, int i2, Intent intent) {
    }
}
