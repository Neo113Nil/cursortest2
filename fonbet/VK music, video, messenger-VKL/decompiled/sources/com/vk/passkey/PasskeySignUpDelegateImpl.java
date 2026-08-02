package com.vk.passkey;

import android.app.Activity;
import android.content.Intent;
import androidx.annotation.Keep;
import androidx.credentials.CreatePublicKeyCredentialRequest;
import androidx.credentials.CreatePublicKeyCredentialResponse;
import androidx.credentials.CredentialManager;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import org.json.JSONArray;
import org.json.JSONObject;
import xsna.b6l;
import xsna.bdn;
import xsna.cm90;
import xsna.ie00;
import xsna.myc0;
import xsna.par0;
import xsna.s3q0;
import xsna.spj;
import xsna.wzs;
import xsna.yvj;
import xsna.zvj;

/* compiled from: PasskeySignUpDelegateImpl.kt */
@Keep
/* loaded from: classes4.dex */
public final class PasskeySignUpDelegateImpl {
    private final cm90 callback;

    /* compiled from: PasskeySignUpDelegateImpl.kt */
    @b6l(c = "com.vk.passkey.PasskeySignUpDelegateImpl$registerPasskey$1", f = "PasskeySignUpDelegateImpl.kt", l = {61}, m = "invokeSuspend")
    public static final class a extends SuspendLambda implements wzs<yvj, spj<? super s3q0>, Object> {
        final /* synthetic */ Activity $activity;
        final /* synthetic */ String $passkeyJson;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(Activity activity, String str, spj<? super a> spjVar) {
            super(2, spjVar);
            this.$activity = activity;
            this.$passkeyJson = str;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final spj<s3q0> create(Object obj, spj<?> spjVar) {
            return PasskeySignUpDelegateImpl.this.new a(this.$activity, this.$passkeyJson, spjVar);
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
                PasskeySignUpDelegateImpl passkeySignUpDelegateImpl = PasskeySignUpDelegateImpl.this;
                Activity activity = this.$activity;
                String str = this.$passkeyJson;
                this.label = 1;
                if (passkeySignUpDelegateImpl.registerPasskeyInternal(activity, str, this) == coroutineSingletons) {
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

    /* compiled from: PasskeySignUpDelegateImpl.kt */
    @b6l(c = "com.vk.passkey.PasskeySignUpDelegateImpl", f = "PasskeySignUpDelegateImpl.kt", l = {69}, m = "registerPasskeyInternal")
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
            return PasskeySignUpDelegateImpl.this.registerPasskeyInternal(null, null, this);
        }
    }

    public PasskeySignUpDelegateImpl(cm90 cm90Var) {
        this.callback = cm90Var;
    }

    private final String formatRegistrationJson(String str) {
        JSONObject jSONObject = new JSONObject(str);
        JSONObject jSONObject2 = jSONObject.getJSONObject("response");
        jSONObject2.put("clientDataJson", jSONObject2.remove("clientDataJSON"));
        jSONObject.put("response", jSONObject2);
        jSONObject.put("clientExtensionResults", new JSONArray());
        return jSONObject.toString();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't wrap try/catch for region: R(10:0|1|(2:3|(7:5|6|7|(1:(1:10)(2:16|17))(3:18|19|(1:21))|11|12|13))|32|6|7|(0)(0)|11|12|13) */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x00bc, code lost:
    
        xsna.par0.a.getClass();
        xsna.par0.a("Cancel passkey creds creation");
        r17.callback.onCancel();
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0035, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x009e, code lost:
    
        if ((r0.getDomError() instanceof androidx.credentials.exceptions.domerrors.NotAllowedError) != false) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x00a0, code lost:
    
        xsna.par0.a.getClass();
        xsna.par0.c("Cancel passkey creds creation", r0);
        r17.callback.onCancel();
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x00ae, code lost:
    
        xsna.par0.a.getClass();
        xsna.par0.c("Error of passkey creds creation", r0);
        r17.callback.a(r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0033, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x008a, code lost:
    
        xsna.par0.a.getClass();
        xsna.par0.c("Error of passkey creds creation", r0);
        r17.callback.a(r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0031, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x007a, code lost:
    
        xsna.par0.a.getClass();
        xsna.par0.c("Unknown passkey creation error", r0);
        r17.callback.a(r0);
     */
    /* JADX WARN: Removed duplicated region for block: B:18:0x003f  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x002b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object registerPasskeyInternal(Activity activity, String str, spj<? super s3q0> spjVar) {
        b bVar;
        int i;
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
                    CreatePublicKeyCredentialRequest createPublicKeyCredentialRequest = new CreatePublicKeyCredentialRequest(str, null, false, null, false, 30, null);
                    bVar.label = 1;
                    obj = create.createCredential(activity, createPublicKeyCredentialRequest, bVar);
                    if (obj == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    kotlin.a.a(obj);
                }
                par0.a.getClass();
                par0.a("Success passkey creds creation");
                this.callback.onSuccess(formatRegistrationJson(((CreatePublicKeyCredentialResponse) obj).getRegistrationResponseJson()));
                return s3q0.a;
            }
        }
        bVar = new b(spjVar);
        Object obj2 = bVar.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = bVar.label;
        if (i != 0) {
        }
        par0.a.getClass();
        par0.a("Success passkey creds creation");
        this.callback.onSuccess(formatRegistrationJson(((CreatePublicKeyCredentialResponse) obj2).getRegistrationResponseJson()));
        return s3q0.a;
    }

    public void registerPasskey(Activity activity, String str) {
        bdn bdnVar = bdn.a;
        myc0.h(zvj.a(ie00.a), null, null, new a(activity, str, null), 3);
    }

    public void onActivityResult(Activity activity, int i, int i2, Intent intent) {
    }
}
