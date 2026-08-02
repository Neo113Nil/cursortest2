package com.google.android.gms.internal.p000authapi;

import android.app.Activity;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.os.RemoteException;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.auth.api.identity.BeginSignInRequest;
import com.google.android.gms.auth.api.identity.BeginSignInResult;
import com.google.android.gms.auth.api.identity.GetPhoneNumberHintIntentRequest;
import com.google.android.gms.auth.api.identity.GetSignInIntentRequest;
import com.google.android.gms.auth.api.identity.SignInCredential;
import com.google.android.gms.common.Feature;
import com.google.android.gms.common.api.ApiException;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.a;
import com.google.android.gms.common.api.b;
import com.google.android.gms.common.api.c;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.vk.core.preference.Preference;
import java.util.Iterator;
import java.util.Set;
import xsna.d9u;
import xsna.exc0;
import xsna.f5o0;
import xsna.ouf0;
import xsna.pzg0;
import xsna.trz0;
import xsna.vlj0;

/* compiled from: com.google.android.gms:play-services-auth@@21.1.1 */
/* loaded from: classes.dex */
public final class zbaq extends b implements vlj0 {
    private static final a.g zba;
    private static final a.AbstractC0111a zbb;
    private static final a zbc;
    private final String zbd;

    static {
        a.g gVar = new a.g();
        zba = gVar;
        zbal zbalVar = new zbal();
        zbb = zbalVar;
        zbc = new a("Auth.Api.Identity.SignIn.API", zbalVar, gVar);
    }

    public zbaq(@NonNull Activity activity, @NonNull trz0 trz0Var) {
        super(activity, (a<trz0>) zbc, trz0Var, b.a.c);
        this.zbd = zbat.zba();
    }

    @Override // xsna.vlj0
    public final Task<BeginSignInResult> beginSignIn(@NonNull BeginSignInRequest beginSignInRequest) {
        exc0.i(beginSignInRequest);
        BeginSignInRequest.a b = BeginSignInRequest.b(beginSignInRequest);
        b.b(this.zbd);
        final BeginSignInRequest a = b.a();
        f5o0.a a2 = f5o0.a();
        a2.d = new Feature[]{new Feature("auth_api_credentials_begin_sign_in", 8L)};
        a2.a = new ouf0() { // from class: com.google.android.gms.internal.auth-api.zbaj
            /* JADX WARN: Multi-variable type inference failed */
            @Override // xsna.ouf0
            public final void accept(Object obj, Object obj2) {
                zbam zbamVar = new zbam(zbaq.this, (TaskCompletionSource) obj2);
                zbw zbwVar = (zbw) ((zbar) obj).getService();
                BeginSignInRequest beginSignInRequest2 = a;
                exc0.i(beginSignInRequest2);
                zbwVar.zbc(zbamVar, beginSignInRequest2);
            }
        };
        a2.c = true;
        a2.b = false;
        a2.e = 1553;
        return doRead(a2.a());
    }

    @Override // xsna.vlj0
    public final String getPhoneNumberFromIntent(@Nullable Intent intent) throws ApiException {
        if (intent == null) {
            throw new ApiException(Status.h);
        }
        Status status = (Status) pzg0.b(intent, "status", Status.CREATOR);
        if (status == null) {
            throw new ApiException(Status.j);
        }
        if (!status.i()) {
            throw new ApiException(status);
        }
        String stringExtra = intent.getStringExtra("phone_number_hint_result");
        if (stringExtra != null) {
            return stringExtra;
        }
        throw new ApiException(Status.h);
    }

    @Override // xsna.vlj0
    public final Task<PendingIntent> getPhoneNumberHintIntent(@NonNull final GetPhoneNumberHintIntentRequest getPhoneNumberHintIntentRequest) {
        exc0.i(getPhoneNumberHintIntentRequest);
        f5o0.a a = f5o0.a();
        a.d = new Feature[]{zbas.zbh};
        a.a = new ouf0() { // from class: com.google.android.gms.internal.auth-api.zbah
            @Override // xsna.ouf0
            public final void accept(Object obj, Object obj2) {
                zbaq.this.zba(getPhoneNumberHintIntentRequest, (zbar) obj, (TaskCompletionSource) obj2);
            }
        };
        a.e = 1653;
        return doRead(a.a());
    }

    @Override // xsna.vlj0
    public final SignInCredential getSignInCredentialFromIntent(@Nullable Intent intent) throws ApiException {
        if (intent == null) {
            throw new ApiException(Status.h);
        }
        Status status = (Status) pzg0.b(intent, "status", Status.CREATOR);
        if (status == null) {
            throw new ApiException(Status.j);
        }
        if (!status.i()) {
            throw new ApiException(status);
        }
        SignInCredential signInCredential = (SignInCredential) pzg0.b(intent, "sign_in_credential", SignInCredential.CREATOR);
        if (signInCredential != null) {
            return signInCredential;
        }
        throw new ApiException(Status.h);
    }

    @Override // xsna.vlj0
    public final Task<PendingIntent> getSignInIntent(@NonNull GetSignInIntentRequest getSignInIntentRequest) {
        exc0.i(getSignInIntentRequest);
        GetSignInIntentRequest.a b = GetSignInIntentRequest.b(getSignInIntentRequest);
        b.b(this.zbd);
        final GetSignInIntentRequest a = b.a();
        f5o0.a a2 = f5o0.a();
        a2.d = new Feature[]{zbas.zbf};
        a2.a = new ouf0() { // from class: com.google.android.gms.internal.auth-api.zbak
            /* JADX WARN: Multi-variable type inference failed */
            @Override // xsna.ouf0
            public final void accept(Object obj, Object obj2) {
                zbao zbaoVar = new zbao(zbaq.this, (TaskCompletionSource) obj2);
                zbw zbwVar = (zbw) ((zbar) obj).getService();
                GetSignInIntentRequest getSignInIntentRequest2 = a;
                exc0.i(getSignInIntentRequest2);
                zbwVar.zbe(zbaoVar, getSignInIntentRequest2);
            }
        };
        a2.e = 1555;
        return doRead(a2.a());
    }

    @Override // xsna.vlj0
    public final Task<Void> signOut() {
        Preference.h(getApplicationContext(), 0, "com.google.android.gms.signin").edit().clear().apply();
        Set set = c.b;
        synchronized (set) {
        }
        Iterator it = set.iterator();
        while (it.hasNext()) {
            ((c) it.next()).h();
        }
        d9u.a();
        f5o0.a a = f5o0.a();
        a.d = new Feature[]{zbas.zbb};
        a.a = new ouf0() { // from class: com.google.android.gms.internal.auth-api.zbai
            @Override // xsna.ouf0
            public final void accept(Object obj, Object obj2) {
                zbaq.this.zbb((zbar) obj, (TaskCompletionSource) obj2);
            }
        };
        a.c = true;
        a.b = false;
        a.e = 1554;
        return doWrite(a.a());
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final /* synthetic */ void zba(GetPhoneNumberHintIntentRequest getPhoneNumberHintIntentRequest, zbar zbarVar, TaskCompletionSource taskCompletionSource) throws RemoteException {
        ((zbw) zbarVar.getService()).zbd(new zbap(this, taskCompletionSource), getPhoneNumberHintIntentRequest, this.zbd);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final /* synthetic */ void zbb(zbar zbarVar, TaskCompletionSource taskCompletionSource) throws RemoteException {
        ((zbw) zbarVar.getService()).zbf(new zban(this, taskCompletionSource), this.zbd);
    }

    public zbaq(@NonNull Context context, @NonNull trz0 trz0Var) {
        super(context, (a<trz0>) zbc, trz0Var, b.a.c);
        this.zbd = zbat.zba();
    }
}
