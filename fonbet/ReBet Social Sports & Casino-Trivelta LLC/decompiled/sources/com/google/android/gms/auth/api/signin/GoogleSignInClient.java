package com.google.android.gms.auth.api.signin;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import androidx.annotation.NonNull;
import com.google.android.gms.auth.api.signin.internal.zbm;
import com.google.android.gms.common.AbstractC3175h;
import com.google.android.gms.common.GoogleApiAvailability;
import com.google.android.gms.common.api.e;
import com.google.android.gms.common.api.internal.C3118a;
import com.google.android.gms.common.internal.AbstractC3190n;
import com.google.android.gms.dynamite.DynamiteModule;
import com.google.android.gms.tasks.Task;
import x9.AbstractC6806a;

@Deprecated
/* loaded from: classes2.dex */
public class GoogleSignInClient extends e {
    private static final zba zbb = new zba(null);
    static int zba = 1;

    public GoogleSignInClient(@NonNull Activity activity, GoogleSignInOptions googleSignInOptions) {
        super(activity, AbstractC6806a.f67955b, googleSignInOptions, new C3118a());
    }

    private final synchronized int zba() {
        int i10;
        try {
            i10 = zba;
            if (i10 == 1) {
                Context applicationContext = getApplicationContext();
                GoogleApiAvailability r10 = GoogleApiAvailability.r();
                int j10 = r10.j(applicationContext, AbstractC3175h.f32612a);
                if (j10 == 0) {
                    i10 = 4;
                    zba = 4;
                } else if (r10.d(applicationContext, j10, null) != null || DynamiteModule.a(applicationContext, "com.google.android.gms.auth.api.fallback") == 0) {
                    i10 = 2;
                    zba = 2;
                } else {
                    i10 = 3;
                    zba = 3;
                }
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return i10;
    }

    @NonNull
    public Intent getSignInIntent() {
        Context applicationContext = getApplicationContext();
        int zba2 = zba();
        int i10 = zba2 - 1;
        if (zba2 != 0) {
            return i10 != 2 ? i10 != 3 ? zbm.zbc(applicationContext, (GoogleSignInOptions) getApiOptions()) : zbm.zba(applicationContext, (GoogleSignInOptions) getApiOptions()) : zbm.zbb(applicationContext, (GoogleSignInOptions) getApiOptions());
        }
        throw null;
    }

    @NonNull
    public Task<Void> revokeAccess() {
        return AbstractC3190n.b(zbm.zbf(asGoogleApiClient(), getApplicationContext(), zba() == 3));
    }

    @NonNull
    public Task<Void> signOut() {
        return AbstractC3190n.b(zbm.zbe(asGoogleApiClient(), getApplicationContext(), zba() == 3));
    }

    @NonNull
    public Task<GoogleSignInAccount> silentSignIn() {
        return AbstractC3190n.a(zbm.zbd(asGoogleApiClient(), getApplicationContext(), (GoogleSignInOptions) getApiOptions(), zba() == 3), zbb);
    }

    public GoogleSignInClient(@NonNull Context context, GoogleSignInOptions googleSignInOptions) {
        super(context, AbstractC6806a.f67955b, googleSignInOptions, new e.a.C0490a().c(new C3118a()).a());
    }
}
