package com.google.android.gms.internal.p000authapi;

import android.content.Context;
import android.content.Intent;
import android.os.Parcelable;
import com.google.android.gms.auth.api.identity.SignInClient;
import com.google.android.gms.auth.api.identity.SignInCredential;
import com.google.android.gms.auth.api.identity.zbv;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.ApiException;
import com.google.android.gms.common.api.GoogleApi;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.safeparcel.SafeParcelableSerializer;
import defpackage.h3n;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zbaq extends GoogleApi implements SignInClient {
    public static final Api m = new Api("Auth.Api.Identity.SignIn.API", new h3n(), new Api.ClientKey());
    public final String l;

    public zbaq(Context context, zbv zbvVar) {
        super(context, m, zbvVar, GoogleApi.Settings.c);
        this.l = zbat.a();
    }

    public final SignInCredential i(Intent intent) {
        if (intent == null) {
            throw new ApiException(Status.g);
        }
        Parcelable.Creator<Status> creator = Status.CREATOR;
        byte[] byteArrayExtra = intent.getByteArrayExtra("status");
        Status status = (Status) (byteArrayExtra == null ? null : SafeParcelableSerializer.a(byteArrayExtra, creator));
        if (status == null) {
            throw new ApiException(Status.i);
        }
        if (!status.Y0()) {
            throw new ApiException(status);
        }
        Parcelable.Creator<SignInCredential> creator2 = SignInCredential.CREATOR;
        byte[] byteArrayExtra2 = intent.getByteArrayExtra("sign_in_credential");
        SignInCredential signInCredential = (SignInCredential) (byteArrayExtra2 != null ? SafeParcelableSerializer.a(byteArrayExtra2, creator2) : null);
        if (signInCredential != null) {
            return signInCredential;
        }
        throw new ApiException(Status.g);
    }
}
