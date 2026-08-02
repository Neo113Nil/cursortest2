package com.google.android.gms.auth.api.signin.internal;

import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.os.Bundle;
import android.os.Looper;
import android.view.accessibility.AccessibilityEvent;
import androidx.fragment.app.FragmentActivity;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.auth.api.signin.SignInAccount;
import com.google.android.gms.common.annotation.KeepName;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.Status;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import defpackage.a70;
import defpackage.egb;
import defpackage.ewm;
import defpackage.fgb;
import defpackage.ggb;
import defpackage.gz8;
import defpackage.hgb;
import defpackage.igb;
import defpackage.u6b;
import defpackage.zwh;
import java.lang.reflect.Modifier;
import java.util.Set;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@KeepName
/* loaded from: classes.dex */
public class SignInHubActivity extends FragmentActivity {
    public static boolean m = false;
    public boolean h = false;
    public SignInConfiguration i;
    public boolean j;
    public int k;
    public Intent l;

    @Override // android.app.Activity, android.view.Window.Callback
    public final boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        return true;
    }

    public final void m() {
        igb a = egb.a(this);
        ewm ewmVar = new ewm(this, 1);
        u6b u6bVar = a.a;
        hgb hgbVar = a.b;
        boolean z = hgbVar.c;
        zwh zwhVar = hgbVar.b;
        if (z) {
            a70.r("Called while creating a loader");
            return;
        }
        if (Looper.getMainLooper() != Looper.myLooper()) {
            a70.r("initLoader must be called on the main thread");
            return;
        }
        zwhVar.getClass();
        fgb fgbVar = (fgb) gz8.C(zwhVar, 0);
        if (fgbVar == null) {
            try {
                hgbVar.c = true;
                Set set = GoogleApiClient.a;
                synchronized (set) {
                }
                zbc zbcVar = new zbc(this, set);
                if (zbc.class.isMemberClass() && !Modifier.isStatic(zbc.class.getModifiers())) {
                    throw new IllegalArgumentException("Object returned from onCreateLoader must not be a non-static inner member class: " + zbcVar);
                }
                fgb fgbVar2 = new fgb(zbcVar);
                zwhVar.d(0, fgbVar2);
                hgbVar.c = false;
                ggb ggbVar = new ggb(fgbVar2.l, ewmVar);
                fgbVar2.e(u6bVar, ggbVar);
                ggb ggbVar2 = fgbVar2.n;
                if (ggbVar2 != null) {
                    fgbVar2.i(ggbVar2);
                }
                fgbVar2.m = u6bVar;
                fgbVar2.n = ggbVar;
            } catch (Throwable th) {
                hgbVar.c = false;
                throw th;
            }
        } else {
            ggb ggbVar3 = new ggb(fgbVar.l, ewmVar);
            fgbVar.e(u6bVar, ggbVar3);
            ggb ggbVar4 = fgbVar.n;
            if (ggbVar4 != null) {
                fgbVar.i(ggbVar4);
            }
            fgbVar.m = u6bVar;
            fgbVar.n = ggbVar3;
        }
        m = false;
    }

    public final void n(int i) {
        Status status = new Status(i, null, null, null);
        Intent intent = new Intent();
        intent.putExtra("googleSignInStatus", status);
        setResult(0, intent);
        finish();
        m = false;
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public final void onActivityResult(int i, int i2, Intent intent) {
        GoogleSignInAccount googleSignInAccount;
        if (this.h) {
            return;
        }
        setResult(0);
        if (i != 40962) {
            return;
        }
        if (intent != null) {
            SignInAccount signInAccount = (SignInAccount) intent.getParcelableExtra("signInAccount");
            if (signInAccount != null && (googleSignInAccount = signInAccount.b) != null) {
                zbn a = zbn.a(this);
                GoogleSignInOptions googleSignInOptions = this.i.b;
                synchronized (a) {
                    a.a.c(googleSignInAccount, googleSignInOptions);
                }
                intent.removeExtra("signInAccount");
                intent.putExtra("googleSignInAccount", googleSignInAccount);
                this.j = true;
                this.k = i2;
                this.l = intent;
                m();
                return;
            }
            if (intent.hasExtra(IronSourceConstants.EVENTS_ERROR_CODE)) {
                int intExtra = intent.getIntExtra(IronSourceConstants.EVENTS_ERROR_CODE, 8);
                if (intExtra == 13) {
                    intExtra = 12501;
                }
                n(intExtra);
                return;
            }
        }
        n(8);
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Intent intent = getIntent();
        String action = intent.getAction();
        if (action == null) {
            n(12500);
            return;
        }
        if (action.equals("com.google.android.gms.auth.NO_IMPL")) {
            n(12500);
            return;
        }
        if (!action.equals("com.google.android.gms.auth.GOOGLE_SIGN_IN") && !action.equals("com.google.android.gms.auth.APPAUTH_SIGN_IN")) {
            "Unknown action: ".concat(String.valueOf(intent.getAction()));
            finish();
            return;
        }
        Bundle bundleExtra = intent.getBundleExtra("config");
        if (bundleExtra == null) {
            setResult(0);
            finish();
            return;
        }
        SignInConfiguration signInConfiguration = (SignInConfiguration) bundleExtra.getParcelable("config");
        if (signInConfiguration == null) {
            setResult(0);
            finish();
            return;
        }
        this.i = signInConfiguration;
        if (bundle != null) {
            boolean z = bundle.getBoolean("signingInGoogleApiClients");
            this.j = z;
            if (z) {
                this.k = bundle.getInt("signInResultCode");
                Intent intent2 = (Intent) bundle.getParcelable("signInResultData");
                if (intent2 == null) {
                    setResult(0);
                    finish();
                    return;
                } else {
                    this.l = intent2;
                    m();
                    return;
                }
            }
            return;
        }
        if (m) {
            setResult(0);
            n(12502);
            return;
        }
        m = true;
        Intent intent3 = new Intent(action);
        if (action.equals("com.google.android.gms.auth.GOOGLE_SIGN_IN")) {
            intent3.setPackage("com.google.android.gms");
        } else {
            intent3.setPackage(getPackageName());
        }
        intent3.putExtra("config", this.i);
        try {
            startActivityForResult(intent3, 40962);
        } catch (ActivityNotFoundException unused) {
            this.h = true;
            n(17);
        }
    }

    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity
    public final void onDestroy() {
        super.onDestroy();
        m = false;
    }

    @Override // androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putBoolean("signingInGoogleApiClients", this.j);
        if (this.j) {
            bundle.putInt("signInResultCode", this.k);
            bundle.putParcelable("signInResultData", this.l);
        }
    }
}
