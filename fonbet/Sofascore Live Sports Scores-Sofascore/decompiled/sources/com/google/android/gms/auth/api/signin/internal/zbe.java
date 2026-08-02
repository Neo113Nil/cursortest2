package com.google.android.gms.auth.api.signin.internal;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.internal.ClientSettings;
import com.google.android.gms.common.internal.GmsClient;
import com.google.android.gms.common.logging.Logger;
import com.google.android.gms.internal.p000authapi.zbat;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zbe extends GmsClient {
    public final GoogleSignInOptions I;

    public zbe(Context context, Looper looper, ClientSettings clientSettings, GoogleSignInOptions googleSignInOptions, GoogleApiClient.ConnectionCallbacks connectionCallbacks, GoogleApiClient.OnConnectionFailedListener onConnectionFailedListener) {
        super(context, looper, 91, clientSettings, connectionCallbacks, onConnectionFailedListener);
        GoogleSignInOptions.Builder builder;
        Set<Scope> set = clientSettings.c;
        if (googleSignInOptions != null) {
            builder = new GoogleSignInOptions.Builder();
            builder.a = new HashSet();
            builder.h = new HashMap();
            builder.a = new HashSet(googleSignInOptions.b);
            builder.b = googleSignInOptions.e;
            builder.c = googleSignInOptions.f;
            builder.d = googleSignInOptions.d;
            builder.e = googleSignInOptions.g;
            builder.f = googleSignInOptions.c;
            builder.g = googleSignInOptions.h;
            builder.h = GoogleSignInOptions.Z0(googleSignInOptions.i);
            builder.i = googleSignInOptions.j;
        } else {
            builder = new GoogleSignInOptions.Builder();
        }
        builder.i = zbat.a();
        if (!set.isEmpty()) {
            for (Scope scope : set) {
                HashSet hashSet = builder.a;
                hashSet.add(scope);
                hashSet.addAll(Arrays.asList(new Scope[0]));
            }
        }
        this.I = builder.a();
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient
    public final IInterface b(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.auth.api.signin.internal.ISignInService");
        return queryLocalInterface instanceof zbs ? (zbs) queryLocalInterface : new zbs(iBinder, "com.google.android.gms.auth.api.signin.internal.ISignInService");
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient
    public final String g() {
        return "com.google.android.gms.auth.api.signin.internal.ISignInService";
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient, com.google.android.gms.common.api.Api.Client
    public final int getMinApkVersion() {
        return 12451000;
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient, com.google.android.gms.common.api.Api.Client
    public final Intent getSignInIntent() {
        Context context = getContext();
        Logger logger = zbm.a;
        Object[] objArr = new Object[0];
        if (logger.c <= 3) {
            logger.a("getSignInIntent()", objArr);
        }
        SignInConfiguration signInConfiguration = new SignInConfiguration(context.getPackageName(), this.I);
        Intent intent = new Intent("com.google.android.gms.auth.GOOGLE_SIGN_IN");
        intent.setPackage(context.getPackageName());
        intent.setClass(context, SignInHubActivity.class);
        Bundle bundle = new Bundle();
        bundle.putParcelable("config", signInConfiguration);
        intent.putExtra("config", bundle);
        return intent;
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient
    public final String h() {
        return "com.google.android.gms.auth.api.signin.service.START";
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient, com.google.android.gms.common.api.Api.Client
    public final boolean providesSignIn() {
        return true;
    }
}
