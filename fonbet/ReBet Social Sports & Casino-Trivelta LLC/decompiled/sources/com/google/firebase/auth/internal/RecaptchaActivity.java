package com.google.firebase.auth.internal;

import K9.a;
import K9.h;
import K9.j;
import a1.C1908a;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.media.session.b;
import android.text.TextUtils;
import android.util.Log;
import androidx.fragment.app.AbstractActivityC2168s;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.internal.p002firebaseauthapi.zza;
import com.google.android.gms.internal.p002firebaseauthapi.zzaeq;
import com.google.android.gms.internal.p002firebaseauthapi.zzaer;
import com.google.android.gms.internal.p002firebaseauthapi.zzaes;
import com.google.android.gms.internal.p002firebaseauthapi.zzafd;
import com.google.android.gms.internal.p002firebaseauthapi.zzagi;
import com.google.android.gms.internal.p002firebaseauthapi.zzagl;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.internal.RecaptchaActivity;
import eb.C4196f;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.List;
import java.util.Locale;
import java.util.UUID;
import lb.AbstractC5433l;
import lb.H;
import lb.b0;
import lb.d0;
import lb.p0;
import lb.r0;
import w.d;
import wb.InterfaceC6736b;

/* loaded from: classes3.dex */
public class RecaptchaActivity extends AbstractActivityC2168s implements zzaes {

    /* renamed from: g, reason: collision with root package name */
    public static final String f37660g = "RecaptchaActivity";

    /* renamed from: h, reason: collision with root package name */
    public static long f37661h;

    /* renamed from: i, reason: collision with root package name */
    public static final d0 f37662i = d0.g();

    /* renamed from: f, reason: collision with root package name */
    public boolean f37663f = false;

    public static /* synthetic */ void A(RecaptchaActivity recaptchaActivity, String str, Task task) {
        if (recaptchaActivity.getPackageManager().resolveActivity(new Intent("android.intent.action.VIEW"), 0) == null) {
            Log.e(f37660g, "Device cannot resolve intent for: android.intent.action.VIEW");
            zzaer.zzb(recaptchaActivity, str);
            return;
        }
        List<ResolveInfo> queryIntentServices = recaptchaActivity.getPackageManager().queryIntentServices(new Intent("android.support.customtabs.action.CustomTabsService"), 0);
        if (queryIntentServices != null && !queryIntentServices.isEmpty()) {
            d a10 = new d.C0946d().a();
            a10.f67200a.addFlags(1073741824);
            a10.f67200a.addFlags(268435456);
            a10.a(recaptchaActivity, (Uri) task.getResult());
            return;
        }
        Intent intent = new Intent("android.intent.action.VIEW", (Uri) task.getResult());
        intent.putExtra("com.android.browser.application_id", str);
        intent.addFlags(1073741824);
        intent.addFlags(268435456);
        recaptchaActivity.startActivity(intent);
    }

    private final boolean B(Intent intent) {
        return C1908a.b(this).d(intent);
    }

    private final void C() {
        f37661h = 0L;
        this.f37663f = false;
        Intent intent = new Intent();
        intent.putExtra("com.google.firebase.auth.internal.EXTRA_CANCELED", true);
        intent.setAction("com.google.firebase.auth.ACTION_RECEIVE_FIREBASE_AUTH_INTENT");
        B(intent);
        f37662i.b(this);
        finish();
    }

    private final Uri.Builder y(Uri.Builder builder, Intent intent, String str, String str2) {
        String stringExtra = intent.getStringExtra("com.google.firebase.auth.KEY_API_KEY");
        String uuid = UUID.randomUUID().toString();
        String stringExtra2 = intent.getStringExtra("com.google.firebase.auth.internal.CLIENT_VERSION");
        String stringExtra3 = intent.getStringExtra("com.google.firebase.auth.internal.FIREBASE_APP_NAME");
        C4196f o10 = C4196f.o(stringExtra3);
        FirebaseAuth firebaseAuth = FirebaseAuth.getInstance(o10);
        p0.b().d(getApplicationContext(), str, uuid, "com.google.firebase.auth.internal.ACTION_SHOW_RECAPTCHA", stringExtra3);
        String a10 = r0.c(getApplicationContext(), o10.r()).a();
        if (TextUtils.isEmpty(a10)) {
            Log.e(f37660g, "Could not generate an encryption key for reCAPTCHA - cancelling flow.");
            z(AbstractC5433l.a("Failed to generate/retrieve public encryption key for reCAPTCHA flow."));
            return null;
        }
        builder.appendQueryParameter("apiKey", stringExtra).appendQueryParameter("authType", "verifyApp").appendQueryParameter("apn", str).appendQueryParameter("hl", !TextUtils.isEmpty(firebaseAuth.m()) ? firebaseAuth.m() : zzafd.zza()).appendQueryParameter("eventId", uuid).appendQueryParameter("v", "X" + stringExtra2).appendQueryParameter("eid", "p").appendQueryParameter("appName", stringExtra3).appendQueryParameter("sha1Cert", str2).appendQueryParameter("publicKey", a10);
        return builder;
    }

    private final void z(Status status) {
        f37661h = 0L;
        this.f37663f = false;
        Intent intent = new Intent();
        b0.c(intent, status);
        intent.setAction("com.google.firebase.auth.ACTION_RECEIVE_FIREBASE_AUTH_INTENT");
        B(intent);
        f37662i.b(this);
        finish();
    }

    @Override // androidx.fragment.app.AbstractActivityC2168s, androidx.activity.ComponentActivity, androidx.core.app.g, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        String action = getIntent().getAction();
        if (!"com.google.firebase.auth.internal.ACTION_SHOW_RECAPTCHA".equals(action) && !"android.intent.action.VIEW".equals(action)) {
            Log.e(f37660g, "Could not do operation - unknown action: " + action);
            C();
            return;
        }
        long a10 = h.c().a();
        if (a10 - f37661h < 30000) {
            Log.e(f37660g, "Could not start operation - already in progress");
            return;
        }
        f37661h = a10;
        if (bundle != null) {
            this.f37663f = bundle.getBoolean("com.google.firebase.auth.internal.KEY_ALREADY_STARTED_RECAPTCHA_FLOW");
        }
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void onNewIntent(Intent intent) {
        super.onNewIntent(intent);
        setIntent(intent);
    }

    @Override // androidx.fragment.app.AbstractActivityC2168s, android.app.Activity
    public void onResume() {
        RecaptchaActivity recaptchaActivity;
        super.onResume();
        if (!"android.intent.action.VIEW".equals(getIntent().getAction())) {
            if (this.f37663f) {
                C();
                return;
            }
            Intent intent = getIntent();
            String packageName = getPackageName();
            try {
                String lowerCase = j.b(a.a(this, packageName)).toLowerCase(Locale.US);
                C4196f o10 = C4196f.o(intent.getStringExtra("com.google.firebase.auth.internal.FIREBASE_APP_NAME"));
                FirebaseAuth firebaseAuth = FirebaseAuth.getInstance(o10);
                if (zzagl.zza(o10)) {
                    recaptchaActivity = this;
                    zza(y(Uri.parse(zzagl.zza(o10.q().b())).buildUpon(), getIntent(), packageName, lowerCase).build(), packageName, firebaseAuth.w0());
                } else {
                    recaptchaActivity = this;
                    new zzaeq(packageName, lowerCase, intent, o10, recaptchaActivity).executeOnExecutor(firebaseAuth.B0(), new Void[0]);
                }
            } catch (PackageManager.NameNotFoundException e10) {
                recaptchaActivity = this;
                Log.e(f37660g, "Could not get package signature: " + packageName + " " + String.valueOf(e10));
                zzaer.zzb(this, packageName);
            }
            recaptchaActivity.f37663f = true;
            return;
        }
        Intent intent2 = getIntent();
        if (intent2.hasExtra("firebaseError")) {
            z(b0.b(intent2.getStringExtra("firebaseError")));
            return;
        }
        if (!intent2.hasExtra("link") || !intent2.hasExtra("eventId")) {
            C();
            return;
        }
        String stringExtra = intent2.getStringExtra("link");
        String g10 = p0.b().g(getApplicationContext(), getPackageName(), intent2.getStringExtra("eventId"));
        if (TextUtils.isEmpty(g10)) {
            Log.e(f37660g, "Failed to find registration for this event - failing to prevent session injection.");
            z(AbstractC5433l.a("Failed to find registration for this reCAPTCHA event"));
        }
        if (intent2.getBooleanExtra("encryptionEnabled", true)) {
            stringExtra = r0.c(getApplicationContext(), C4196f.o(g10).r()).b(stringExtra);
        }
        String queryParameter = Uri.parse(stringExtra).getQueryParameter("recaptchaToken");
        f37661h = 0L;
        this.f37663f = false;
        Intent intent3 = new Intent();
        intent3.putExtra("com.google.firebase.auth.internal.RECAPTCHA_TOKEN", queryParameter);
        intent3.putExtra("com.google.firebase.auth.internal.OPERATION", "com.google.firebase.auth.internal.ACTION_SHOW_RECAPTCHA");
        intent3.setAction("com.google.firebase.auth.ACTION_RECEIVE_FIREBASE_AUTH_INTENT");
        if (B(intent3)) {
            f37662i.b(this);
        } else {
            H.g(getApplicationContext(), queryParameter, "com.google.firebase.auth.internal.ACTION_SHOW_RECAPTCHA");
        }
        finish();
    }

    @Override // androidx.activity.ComponentActivity, androidx.core.app.g, android.app.Activity
    public void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putBoolean("com.google.firebase.auth.internal.KEY_ALREADY_STARTED_RECAPTCHA_FLOW", this.f37663f);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaes
    public final Context zza() {
        return getApplicationContext();
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaes
    public final Uri.Builder zza(Intent intent, String str, String str2) {
        return y(new Uri.Builder().scheme("https").appendPath("__").appendPath("auth").appendPath("handler"), intent, str, str2);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaes
    public final String zza(String str) {
        String zza = zzagi.zza("firebear.identityToolkit");
        if (TextUtils.isEmpty(zza)) {
            return zzagl.zzb(str);
        }
        Log.e(f37660g, "Found hermetic configuration for identityToolkit URL: " + zza);
        return zza;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaes
    public final HttpURLConnection zza(URL url) {
        try {
            return (HttpURLConnection) zza.zza().zza(url, "client-firebase-auth-api");
        } catch (IOException unused) {
            zzaes.zza.c("Error generating connection", new Object[0]);
            return null;
        }
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaes
    public final void zza(String str, Status status) {
        if (status == null) {
            C();
        } else {
            z(status);
        }
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaes
    public final void zza(Uri uri, final String str, InterfaceC6736b interfaceC6736b) {
        b.a(interfaceC6736b.get());
        Tasks.forResult(uri).addOnCompleteListener(new OnCompleteListener() { // from class: lb.J
            @Override // com.google.android.gms.tasks.OnCompleteListener
            public final void onComplete(Task task) {
                RecaptchaActivity.A(RecaptchaActivity.this, str, task);
            }
        });
    }
}
