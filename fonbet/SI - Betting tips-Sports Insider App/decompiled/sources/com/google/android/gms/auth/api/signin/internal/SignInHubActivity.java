package com.google.android.gms.auth.api.signin.internal;

import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.os.Bundle;
import android.os.Looper;
import android.view.accessibility.AccessibilityEvent;
import androidx.fragment.app.p0;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.auth.api.signin.SignInAccount;
import com.google.android.gms.common.annotation.KeepName;
import com.google.android.gms.common.api.Status;
import d6.j;
import io.sentry.android.core.w0;
import java.lang.reflect.Modifier;
import java.util.Set;
import s.o;
import v1.b;
import v1.d;
import v1.e;
import x5.a;
import x5.c;
import x5.h;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
@KeepName
/* loaded from: classes.dex */
public class SignInHubActivity extends p0 {
    public static boolean E = false;
    public SignInConfiguration A;
    public boolean B;
    public int C;
    public Intent D;

    /* renamed from: z, reason: collision with root package name */
    public boolean f4420z = false;

    @Override // android.app.Activity, android.view.Window.Callback
    public final boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        return true;
    }

    @Override // androidx.fragment.app.p0, e.j, android.app.Activity
    public final void onActivityResult(int i5, int i10, Intent intent) {
        GoogleSignInAccount googleSignInAccount;
        if (this.f4420z) {
            return;
        }
        setResult(0);
        if (i5 != 40962) {
            return;
        }
        if (intent != null) {
            SignInAccount signInAccount = (SignInAccount) intent.getParcelableExtra("signInAccount");
            if (signInAccount != null && (googleSignInAccount = signInAccount.f4413b) != null) {
                h o3 = h.o(this);
                GoogleSignInOptions googleSignInOptions = this.A.f4419b;
                synchronized (o3) {
                    ((a) o3.f25409a).c(googleSignInAccount, googleSignInOptions);
                    o3.f25410b = googleSignInAccount;
                }
                intent.removeExtra("signInAccount");
                intent.putExtra("googleSignInAccount", googleSignInAccount);
                this.B = true;
                this.C = i10;
                this.D = intent;
                t();
                return;
            }
            if (intent.hasExtra("errorCode")) {
                int intExtra = intent.getIntExtra("errorCode", 8);
                if (intExtra == 13) {
                    intExtra = 12501;
                }
                u(intExtra);
                return;
            }
        }
        u(8);
    }

    @Override // androidx.fragment.app.p0, e.j, c0.f, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Intent intent = getIntent();
        String action = intent.getAction();
        if (action == null) {
            w0.d("AuthSignInClient", "Null action");
            u(12500);
            return;
        }
        if (action.equals("com.google.android.gms.auth.NO_IMPL")) {
            w0.d("AuthSignInClient", "Action not implemented");
            u(12500);
            return;
        }
        if (!action.equals("com.google.android.gms.auth.GOOGLE_SIGN_IN") && !action.equals("com.google.android.gms.auth.APPAUTH_SIGN_IN")) {
            w0.d("AuthSignInClient", "Unknown action: ".concat(String.valueOf(intent.getAction())));
            finish();
            return;
        }
        Bundle bundleExtra = intent.getBundleExtra("config");
        if (bundleExtra == null) {
            w0.d("AuthSignInClient", "Activity started with no configuration.");
            setResult(0);
            finish();
            return;
        }
        SignInConfiguration signInConfiguration = (SignInConfiguration) bundleExtra.getParcelable("config");
        if (signInConfiguration == null) {
            w0.d("AuthSignInClient", "Activity started with invalid configuration.");
            setResult(0);
            finish();
            return;
        }
        this.A = signInConfiguration;
        if (bundle != null) {
            boolean z5 = bundle.getBoolean("signingInGoogleApiClients");
            this.B = z5;
            if (z5) {
                this.C = bundle.getInt("signInResultCode");
                Intent intent2 = (Intent) bundle.getParcelable("signInResultData");
                if (intent2 != null) {
                    this.D = intent2;
                    t();
                    return;
                } else {
                    w0.d("AuthSignInClient", "Sign in result data cannot be null");
                    setResult(0);
                    finish();
                    return;
                }
            }
            return;
        }
        if (E) {
            setResult(0);
            u(12502);
            return;
        }
        E = true;
        Intent intent3 = new Intent(action);
        if (action.equals("com.google.android.gms.auth.GOOGLE_SIGN_IN")) {
            intent3.setPackage("com.google.android.gms");
        } else {
            intent3.setPackage(getPackageName());
        }
        intent3.putExtra("config", this.A);
        try {
            startActivityForResult(intent3, 40962);
        } catch (ActivityNotFoundException unused) {
            this.f4420z = true;
            w0.m("AuthSignInClient", "Could not launch sign in Intent. Google Play Service is probably being updated...");
            u(17);
        }
    }

    @Override // androidx.fragment.app.p0, android.app.Activity
    public final void onDestroy() {
        super.onDestroy();
        E = false;
    }

    @Override // e.j, c0.f, android.app.Activity
    public final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putBoolean("signingInGoogleApiClients", this.B);
        if (this.B) {
            bundle.putInt("signInResultCode", this.C);
            bundle.putParcelable("signInResultData", this.D);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v1, types: [androidx.lifecycle.e0, java.lang.Object] */
    public final void t() {
        e a7 = v1.a.a(this);
        r7.a aVar = new r7.a(18, this);
        ?? r22 = a7.f24388a;
        d dVar = a7.f24389b;
        boolean z5 = dVar.f24387c;
        o oVar = dVar.f24386b;
        if (z5) {
            throw new IllegalStateException("Called while creating a loader");
        }
        if (Looper.getMainLooper() != Looper.myLooper()) {
            throw new IllegalStateException("initLoader must be called on the main thread");
        }
        b bVar = (b) oVar.d(0);
        if (bVar == 0) {
            try {
                dVar.f24387c = true;
                Set set = j.f8259a;
                synchronized (set) {
                }
                c cVar = new c(this, set);
                if (c.class.isMemberClass() && !Modifier.isStatic(c.class.getModifiers())) {
                    throw new IllegalArgumentException("Object returned from onCreateLoader must not be a non-static inner member class: " + cVar);
                }
                b bVar2 = new b(cVar);
                oVar.f(0, bVar2);
                dVar.f24387c = false;
                v1.c cVar2 = new v1.c(bVar2.f24380l, aVar);
                bVar2.e(r22, cVar2);
                v1.c cVar3 = bVar2.f24382n;
                if (cVar3 != null) {
                    bVar2.i(cVar3);
                }
                bVar2.f24381m = r22;
                bVar2.f24382n = cVar2;
            } catch (Throwable th2) {
                dVar.f24387c = false;
                throw th2;
            }
        } else {
            v1.c cVar4 = new v1.c(bVar.f24380l, aVar);
            bVar.e(r22, cVar4);
            v1.c cVar5 = bVar.f24382n;
            if (cVar5 != null) {
                bVar.i(cVar5);
            }
            bVar.f24381m = r22;
            bVar.f24382n = cVar4;
        }
        E = false;
    }

    public final void u(int i5) {
        Status status = new Status(i5, null, null, null);
        Intent intent = new Intent();
        intent.putExtra("googleSignInStatus", status);
        setResult(0, intent);
        finish();
        E = false;
    }
}
