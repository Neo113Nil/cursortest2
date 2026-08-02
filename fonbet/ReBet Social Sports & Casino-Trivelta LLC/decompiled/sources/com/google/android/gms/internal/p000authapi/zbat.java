package com.google.android.gms.internal.p000authapi;

import E9.c;
import android.app.Activity;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import androidx.annotation.NonNull;
import com.google.android.gms.auth.api.identity.BeginSignInRequest;
import com.google.android.gms.auth.api.identity.BeginSignInResult;
import com.google.android.gms.auth.api.identity.GetPhoneNumberHintIntentRequest;
import com.google.android.gms.auth.api.identity.GetSignInIntentRequest;
import com.google.android.gms.auth.api.identity.SignInCredential;
import com.google.android.gms.common.Feature;
import com.google.android.gms.common.api.C3117a;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.b;
import com.google.android.gms.common.api.e;
import com.google.android.gms.common.api.f;
import com.google.android.gms.common.api.internal.AbstractC3163x;
import com.google.android.gms.common.api.internal.C3130g;
import com.google.android.gms.common.api.internal.InterfaceC3153s;
import com.google.android.gms.common.internal.AbstractC3191o;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import java.util.Iterator;
import z9.InterfaceC6949c;
import z9.s;

/* loaded from: classes2.dex */
public final class zbat extends e implements InterfaceC6949c {
    private static final C3117a.g zba;
    private static final C3117a.AbstractC0488a zbb;
    private static final C3117a zbc;
    private final String zbd;

    static {
        C3117a.g gVar = new C3117a.g();
        zba = gVar;
        zbak zbakVar = new zbak();
        zbb = zbakVar;
        zbc = new C3117a("Auth.Api.Identity.SignIn.API", zbakVar, gVar);
    }

    public zbat(@NonNull Activity activity, @NonNull s sVar) {
        super(activity, zbc, (C3117a.d) sVar, e.a.f32290c);
        this.zbd = zbaw.zba();
    }

    @Override // z9.InterfaceC6949c
    public final Task<BeginSignInResult> beginSignIn(@NonNull BeginSignInRequest beginSignInRequest) {
        AbstractC3191o.m(beginSignInRequest);
        BeginSignInRequest.a N10 = BeginSignInRequest.N(beginSignInRequest);
        N10.h(this.zbd);
        final BeginSignInRequest a10 = N10.a();
        return doRead(AbstractC3163x.a().d(new Feature("auth_api_credentials_begin_sign_in", 8L)).b(new InterfaceC3153s() { // from class: com.google.android.gms.internal.auth-api.zbas
            @Override // com.google.android.gms.common.api.internal.InterfaceC3153s
            public final /* synthetic */ void accept(Object obj, Object obj2) {
                zbau zbauVar = (zbau) obj;
                ((zbv) zbauVar.getService()).zbc(new zbal(zbat.this, (TaskCompletionSource) obj2), (BeginSignInRequest) AbstractC3191o.m(a10), zbba.zba(zbauVar.getContext()));
            }
        }).c(false).e(1553).a());
    }

    public final String getPhoneNumberFromIntent(Intent intent) {
        if (intent == null) {
            throw new b(Status.f32277h);
        }
        Status status = (Status) c.b(intent, "status", Status.CREATOR);
        if (status == null) {
            throw new b(Status.f32279j);
        }
        if (!status.l()) {
            throw new b(status);
        }
        String stringExtra = intent.getStringExtra("phone_number_hint_result");
        if (stringExtra != null) {
            return stringExtra;
        }
        throw new b(Status.f32277h);
    }

    public final Task<PendingIntent> getPhoneNumberHintIntent(@NonNull final GetPhoneNumberHintIntentRequest getPhoneNumberHintIntentRequest) {
        AbstractC3191o.m(getPhoneNumberHintIntentRequest);
        return doRead(AbstractC3163x.a().d(zbav.zbi).b(new InterfaceC3153s() { // from class: com.google.android.gms.internal.auth-api.zbar
            @Override // com.google.android.gms.common.api.internal.InterfaceC3153s
            public final /* synthetic */ void accept(Object obj, Object obj2) {
                zbat.this.zbb(getPhoneNumberHintIntentRequest, (zbau) obj, (TaskCompletionSource) obj2);
            }
        }).e(1653).a());
    }

    public final SignInCredential getSignInCredentialFromIntent(Intent intent) {
        if (intent == null) {
            throw new b(Status.f32277h);
        }
        Status status = (Status) c.b(intent, "status", Status.CREATOR);
        if (status == null) {
            throw new b(Status.f32279j);
        }
        if (!status.l()) {
            throw new b(status);
        }
        SignInCredential signInCredential = (SignInCredential) c.b(intent, "sign_in_credential", SignInCredential.CREATOR);
        if (signInCredential != null) {
            return signInCredential;
        }
        throw new b(Status.f32277h);
    }

    @Override // z9.InterfaceC6949c
    public final Task<PendingIntent> getSignInIntent(@NonNull GetSignInIntentRequest getSignInIntentRequest) {
        AbstractC3191o.m(getSignInIntentRequest);
        GetSignInIntentRequest.a k10 = GetSignInIntentRequest.k(getSignInIntentRequest);
        k10.f(this.zbd);
        final GetSignInIntentRequest a10 = k10.a();
        return doRead(AbstractC3163x.a().d(zbav.zbg).b(new InterfaceC3153s() { // from class: com.google.android.gms.internal.auth-api.zbaq
            @Override // com.google.android.gms.common.api.internal.InterfaceC3153s
            public final /* synthetic */ void accept(Object obj, Object obj2) {
                zbau zbauVar = (zbau) obj;
                ((zbv) zbauVar.getService()).zbe(new zban(zbat.this, (TaskCompletionSource) obj2), (GetSignInIntentRequest) AbstractC3191o.m(a10), zbba.zba(zbauVar.getContext()));
            }
        }).e(1555).a());
    }

    public final Task<Void> signOut() {
        getApplicationContext().getSharedPreferences("com.google.android.gms.signin", 0).edit().clear().apply();
        Iterator it = f.i().iterator();
        while (it.hasNext()) {
            ((f) it.next()).o();
        }
        C3130g.a();
        return doWrite(AbstractC3163x.a().d(zbav.zbb).b(new InterfaceC3153s() { // from class: com.google.android.gms.internal.auth-api.zbap
            @Override // com.google.android.gms.common.api.internal.InterfaceC3153s
            public final /* synthetic */ void accept(Object obj, Object obj2) {
                zbat.this.zba((zbau) obj, (TaskCompletionSource) obj2);
            }
        }).c(false).e(1554).a());
    }

    public final /* synthetic */ void zba(zbau zbauVar, TaskCompletionSource taskCompletionSource) {
        zbam zbamVar = new zbam(this, taskCompletionSource);
        ((zbv) zbauVar.getService()).zbd(zbamVar, this.zbd, zbba.zba(zbauVar.getContext()));
    }

    public final /* synthetic */ void zbb(GetPhoneNumberHintIntentRequest getPhoneNumberHintIntentRequest, zbau zbauVar, TaskCompletionSource taskCompletionSource) {
        zbao zbaoVar = new zbao(this, taskCompletionSource);
        ((zbv) zbauVar.getService()).zbf(zbaoVar, getPhoneNumberHintIntentRequest, this.zbd, zbba.zba(zbauVar.getContext()));
    }

    public zbat(@NonNull Context context, @NonNull s sVar) {
        super(context, zbc, sVar, e.a.f32290c);
        this.zbd = zbaw.zba();
    }
}
