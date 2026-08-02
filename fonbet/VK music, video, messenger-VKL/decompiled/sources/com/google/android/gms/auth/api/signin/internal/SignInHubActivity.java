package com.google.android.gms.auth.api.signin.internal;

import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.os.Bundle;
import android.os.Looper;
import android.util.Log;
import android.view.accessibility.AccessibilityEvent;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.FragmentActivity;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.auth.api.signin.SignInAccount;
import com.google.android.gms.common.annotation.KeepName;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.c;
import java.lang.reflect.Modifier;
import java.util.Set;
import xsna.bsz;
import xsna.csz;
import xsna.f2i;
import xsna.fr70;
import xsna.hrz0;
import xsna.rqz0;
import xsna.wik0;

/* compiled from: com.google.android.gms:play-services-auth@@21.1.1 */
@KeepName
/* loaded from: classes12.dex */
public class SignInHubActivity extends FragmentActivity {
    public static boolean k = false;
    public boolean f = false;
    public SignInConfiguration g;
    public boolean h;
    public int i;
    public Intent j;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.Object, xsna.f5z] */
    public final void O1() {
        bsz supportLoaderManager = getSupportLoaderManager();
        f2i f2iVar = new f2i(this);
        csz cszVar = (csz) supportLoaderManager;
        ?? r2 = cszVar.a;
        csz.c cVar = cszVar.b;
        boolean z = cVar.c;
        wik0<csz.a> wik0Var = cVar.b;
        if (z) {
            throw new IllegalStateException("Called while creating a loader");
        }
        if (Looper.getMainLooper() != Looper.myLooper()) {
            throw new IllegalStateException("initLoader must be called on the main thread");
        }
        csz.a g = wik0Var.g(0);
        if (g == 0) {
            try {
                cVar.c = true;
                Set set = c.b;
                synchronized (set) {
                }
                rqz0 rqz0Var = new rqz0(this, set);
                if (rqz0.class.isMemberClass() && !Modifier.isStatic(rqz0.class.getModifiers())) {
                    throw new IllegalArgumentException("Object returned from onCreateLoader must not be a non-static inner member class: " + rqz0Var);
                }
                csz.a aVar = new csz.a(rqz0Var);
                wik0Var.h(0, aVar);
                cVar.c = false;
                csz.b<D> bVar = new csz.b<>(aVar.l, f2iVar);
                aVar.e(r2, bVar);
                fr70 fr70Var = aVar.n;
                if (fr70Var != null) {
                    aVar.j(fr70Var);
                }
                aVar.m = r2;
                aVar.n = bVar;
            } catch (Throwable th) {
                cVar.c = false;
                throw th;
            }
        } else {
            csz.b<D> bVar2 = new csz.b<>(g.l, f2iVar);
            g.e(r2, bVar2);
            fr70 fr70Var2 = g.n;
            if (fr70Var2 != null) {
                g.j(fr70Var2);
            }
            g.m = r2;
            g.n = bVar2;
        }
        k = false;
    }

    public final void Q1(int i) {
        Status status = new Status(i);
        Intent intent = new Intent();
        intent.putExtra("googleSignInStatus", status);
        setResult(0, intent);
        finish();
        k = false;
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public final boolean dispatchPopulateAccessibilityEvent(@NonNull AccessibilityEvent accessibilityEvent) {
        return true;
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public final void onActivityResult(int i, int i2, @Nullable Intent intent) {
        GoogleSignInAccount googleSignInAccount;
        if (this.f) {
            return;
        }
        setResult(0);
        if (i != 40962) {
            return;
        }
        if (intent != null) {
            SignInAccount signInAccount = (SignInAccount) intent.getParcelableExtra("signInAccount");
            if (signInAccount != null && (googleSignInAccount = signInAccount.c) != null) {
                hrz0 a = hrz0.a(this);
                GoogleSignInOptions googleSignInOptions = this.g.c;
                synchronized (a) {
                    a.a.c(googleSignInAccount, googleSignInOptions);
                    a.b = googleSignInAccount;
                }
                intent.removeExtra("signInAccount");
                intent.putExtra("googleSignInAccount", googleSignInAccount);
                this.h = true;
                this.i = i2;
                this.j = intent;
                O1();
                return;
            }
            if (intent.hasExtra("errorCode")) {
                int intExtra = intent.getIntExtra("errorCode", 8);
                if (intExtra == 13) {
                    intExtra = 12501;
                }
                Q1(intExtra);
                return;
            }
        }
        Q1(8);
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onCreate(@Nullable Bundle bundle) {
        super.onCreate(bundle);
        Intent intent = getIntent();
        String action = intent.getAction();
        if (action == null) {
            Log.e("AuthSignInClient", "Null action");
            Q1(12500);
            return;
        }
        if (action.equals("com.google.android.gms.auth.NO_IMPL")) {
            Log.e("AuthSignInClient", "Action not implemented");
            Q1(12500);
            return;
        }
        if (!action.equals("com.google.android.gms.auth.GOOGLE_SIGN_IN") && !action.equals("com.google.android.gms.auth.APPAUTH_SIGN_IN")) {
            Log.e("AuthSignInClient", "Unknown action: ".concat(String.valueOf(intent.getAction())));
            finish();
            return;
        }
        Bundle bundleExtra = intent.getBundleExtra("config");
        if (bundleExtra == null) {
            Log.e("AuthSignInClient", "Activity started with no configuration.");
            setResult(0);
            finish();
            return;
        }
        SignInConfiguration signInConfiguration = (SignInConfiguration) bundleExtra.getParcelable("config");
        if (signInConfiguration == null) {
            Log.e("AuthSignInClient", "Activity started with invalid configuration.");
            setResult(0);
            finish();
            return;
        }
        this.g = signInConfiguration;
        if (bundle != null) {
            boolean z = bundle.getBoolean("signingInGoogleApiClients");
            this.h = z;
            if (z) {
                this.i = bundle.getInt("signInResultCode");
                Intent intent2 = (Intent) bundle.getParcelable("signInResultData");
                if (intent2 != null) {
                    this.j = intent2;
                    O1();
                    return;
                } else {
                    Log.e("AuthSignInClient", "Sign in result data cannot be null");
                    setResult(0);
                    finish();
                    return;
                }
            }
            return;
        }
        if (k) {
            setResult(0);
            Q1(12502);
            return;
        }
        k = true;
        Intent intent3 = new Intent(action);
        if (action.equals("com.google.android.gms.auth.GOOGLE_SIGN_IN")) {
            intent3.setPackage("com.google.android.gms");
        } else {
            intent3.setPackage(getPackageName());
        }
        intent3.putExtra("config", this.g);
        try {
            startActivityForResult(intent3, 40962);
        } catch (ActivityNotFoundException unused) {
            this.f = true;
            Q1(17);
        }
    }

    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity
    public final void onDestroy() {
        super.onDestroy();
        k = false;
    }

    @Override // androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onSaveInstanceState(@NonNull Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putBoolean("signingInGoogleApiClients", this.h);
        if (this.h) {
            bundle.putInt("signInResultCode", this.i);
            bundle.putParcelable("signInResultData", this.j);
        }
    }
}
