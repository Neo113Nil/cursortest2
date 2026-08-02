package com.facebook;

import android.app.Activity;
import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.Uri;
import android.os.Bundle;
import androidx.localbroadcastmanager.content.LocalBroadcastManager;
import defpackage.cw3;
import defpackage.da4;
import defpackage.ea4;
import defpackage.ja4;
import defpackage.wt3;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.Metadata;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/facebook/CustomTabMainActivity;", "Landroid/app/Activity;", "<init>", "()V", "facebook-common_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class CustomTabMainActivity extends Activity {
    public static final /* synthetic */ int c = 0;
    public boolean a = true;
    public com.facebook.internal.d b;

    public final void a(Intent intent, int i) {
        Bundle bundle;
        com.facebook.internal.d dVar = this.b;
        if (dVar != null) {
            LocalBroadcastManager.getInstance(this).unregisterReceiver(dVar);
        }
        if (intent != null) {
            String stringExtra = intent.getStringExtra("CustomTabMainActivity.extra_url");
            if (stringExtra != null) {
                Uri parse = Uri.parse(stringExtra);
                bundle = com.facebook.internal.k0.F(parse.getQuery());
                bundle.putAll(com.facebook.internal.k0.F(parse.getFragment()));
            } else {
                bundle = new Bundle();
            }
            Intent intent2 = getIntent();
            intent2.getClass();
            Intent f = com.facebook.internal.d0.f(intent2, bundle, null);
            if (f != null) {
                intent = f;
            }
            setResult(i, intent);
        } else {
            Intent intent3 = getIntent();
            intent3.getClass();
            setResult(i, com.facebook.internal.d0.f(intent3, null, null));
        }
        finish();
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x00f9  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x010a  */
    @Override // android.app.Activity
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onCreate(Bundle bundle) {
        String stringExtra;
        int i;
        c0 c0Var;
        boolean z;
        Uri a;
        super.onCreate(bundle);
        if ("CustomTabActivity.action_customTabRedirect".equals(getIntent().getAction())) {
            setResult(0);
            finish();
            return;
        }
        if (bundle != null || (stringExtra = getIntent().getStringExtra("CustomTabMainActivity.extra_action")) == null) {
            return;
        }
        Bundle bundleExtra = getIntent().getBundleExtra("CustomTabMainActivity.extra_params");
        String stringExtra2 = getIntent().getStringExtra("CustomTabMainActivity.extra_chromePackage");
        String stringExtra3 = getIntent().getStringExtra("CustomTabMainActivity.extra_targetApp");
        int[] D = wt3.D(2);
        int length = D.length;
        int i2 = 0;
        while (true) {
            if (i2 >= length) {
                i = 1;
                break;
            }
            i = D[i2];
            if (com.appsflyer.internal.i.e(i).equals(stringExtra3)) {
                break;
            } else {
                i2++;
            }
        }
        if (m.a[wt3.C(i)] == 1) {
            c0Var = new com.facebook.internal.y(bundleExtra, stringExtra);
            if (bundleExtra == null) {
                bundleExtra = new Bundle();
            }
            if (stringExtra.equals("oauth")) {
                a = com.facebook.internal.k0.a(com.facebook.internal.k0.q(), bundleExtra, "oauth/authorize");
            } else {
                a = com.facebook.internal.k0.a(com.facebook.internal.k0.q(), bundleExtra, w.d() + "/dialog/" + stringExtra);
            }
            if (!cw3.a.contains(c0Var)) {
                try {
                    c0Var.b = a;
                } catch (Throwable th) {
                    cw3.a(c0Var, th);
                }
            }
        } else {
            c0Var = new c0(bundleExtra, stringExtra);
        }
        if (!cw3.a.contains(c0Var)) {
            try {
                ReentrantLock reentrantLock = com.facebook.login.b.d;
                reentrantLock.lock();
                ja4 ja4Var = com.facebook.login.b.c;
                com.facebook.login.b.c = null;
                reentrantLock.unlock();
                ea4 a2 = new da4(ja4Var).a();
                a2.a.setPackage(stringExtra2);
                try {
                    a2.a(this, (Uri) c0Var.b);
                    z = true;
                } catch (ActivityNotFoundException unused) {
                }
            } catch (Throwable th2) {
                cw3.a(c0Var, th2);
            }
            this.a = false;
            if (z) {
                setResult(0, getIntent().putExtra("CustomTabMainActivity.no_activity_exception", true));
                finish();
                return;
            } else {
                com.facebook.internal.d dVar = new com.facebook.internal.d(this, 11);
                this.b = dVar;
                LocalBroadcastManager.getInstance(this).registerReceiver(dVar, new IntentFilter("CustomTabActivity.action_customTabRedirect"));
                return;
            }
        }
        z = false;
        this.a = false;
        if (z) {
        }
    }

    @Override // android.app.Activity
    public final void onNewIntent(Intent intent) {
        intent.getClass();
        super.onNewIntent(intent);
        if ("CustomTabMainActivity.action_refresh".equals(intent.getAction())) {
            LocalBroadcastManager.getInstance(this).sendBroadcast(new Intent("CustomTabActivity.action_destroy"));
            a(intent, -1);
        } else if ("CustomTabActivity.action_customTabRedirect".equals(intent.getAction())) {
            a(intent, -1);
        }
    }

    @Override // android.app.Activity
    public final void onResume() {
        super.onResume();
        if (this.a) {
            a(null, 0);
        }
        this.a = true;
    }
}
