package com.google.android.gms.auth.api.signin.internal;

import android.content.Intent;
import com.google.android.gms.auth.api.signin.GoogleSignInApi;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.auth.api.signin.GoogleSignInResult;
import com.google.android.gms.common.api.f;
import com.google.android.gms.common.api.g;
import com.google.android.gms.common.api.h;
import x9.AbstractC6806a;

/* loaded from: classes2.dex */
public final class zbd implements GoogleSignInApi {
    private static final GoogleSignInOptions zba(f fVar) {
        return ((zbe) fVar.j(AbstractC6806a.f67959f)).zba();
    }

    @Override // com.google.android.gms.auth.api.signin.GoogleSignInApi
    public final Intent getSignInIntent(f fVar) {
        return zbm.zba(fVar.k(), zba(fVar));
    }

    @Override // com.google.android.gms.auth.api.signin.GoogleSignInApi
    public final GoogleSignInResult getSignInResultFromIntent(Intent intent) {
        return zbm.zbg(intent);
    }

    @Override // com.google.android.gms.auth.api.signin.GoogleSignInApi
    public final h revokeAccess(f fVar) {
        return zbm.zbf(fVar, fVar.k(), false);
    }

    @Override // com.google.android.gms.auth.api.signin.GoogleSignInApi
    public final h signOut(f fVar) {
        return zbm.zbe(fVar, fVar.k(), false);
    }

    @Override // com.google.android.gms.auth.api.signin.GoogleSignInApi
    public final g silentSignIn(f fVar) {
        return zbm.zbd(fVar, fVar.k(), zba(fVar), false);
    }
}
