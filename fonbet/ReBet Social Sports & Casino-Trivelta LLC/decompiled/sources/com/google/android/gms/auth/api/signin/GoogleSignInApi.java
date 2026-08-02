package com.google.android.gms.auth.api.signin;

import android.content.Intent;
import androidx.annotation.NonNull;
import com.google.android.gms.common.api.f;
import com.google.android.gms.common.api.g;
import com.google.android.gms.common.api.h;

@Deprecated
/* loaded from: classes2.dex */
public interface GoogleSignInApi {

    @NonNull
    public static final String EXTRA_SIGN_IN_ACCOUNT = "signInAccount";

    @NonNull
    Intent getSignInIntent(@NonNull f fVar);

    GoogleSignInResult getSignInResultFromIntent(@NonNull Intent intent);

    @NonNull
    h revokeAccess(@NonNull f fVar);

    @NonNull
    h signOut(@NonNull f fVar);

    @NonNull
    g silentSignIn(@NonNull f fVar);
}
