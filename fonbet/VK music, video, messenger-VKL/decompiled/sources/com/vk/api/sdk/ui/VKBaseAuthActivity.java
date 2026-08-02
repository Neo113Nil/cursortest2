package com.vk.api.sdk.ui;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;

/* compiled from: VKBaseAuthActivity.kt */
/* loaded from: classes15.dex */
public abstract class VKBaseAuthActivity extends Activity {
    public boolean b;
    public boolean c;

    public abstract Intent a(Uri uri);

    public abstract boolean b(Uri uri);

    public abstract boolean c();

    public final void d(Intent intent, boolean z) {
        String str;
        String str2 = null;
        Uri data = intent != null ? intent.getData() : null;
        if (this.c || data == null) {
            if (z) {
                setResult(-1, a(data));
                finish();
                this.c = false;
                return;
            }
            return;
        }
        boolean c = c();
        Uri.Builder buildUpon = data.buildUpon();
        try {
            str = data.getQueryParameter("scheme");
        } catch (Exception unused) {
            str = null;
        }
        if (str == null) {
            buildUpon.appendQueryParameter("scheme", c ? "space_gray" : "bright_light");
        }
        try {
            str2 = data.getQueryParameter("appearance");
        } catch (Exception unused2) {
        }
        if (str2 == null) {
            buildUpon.appendQueryParameter("appearance", c ? "dark" : "light");
        }
        if (!b(buildUpon.build())) {
            finish();
        } else {
            this.c = true;
            this.b = true;
        }
    }

    @Override // android.app.Activity
    public final void finish() {
        super.finish();
        overridePendingTransition(0, 0);
    }

    @Override // android.app.Activity
    public void onCreate(Bundle bundle) {
        overridePendingTransition(0, 0);
        super.onCreate(bundle);
        this.c = bundle != null ? bundle.getBoolean("VK_waitingForAuthResult", false) : false;
        d(getIntent(), false);
    }

    @Override // android.app.Activity
    public final void onNewIntent(Intent intent) {
        super.onNewIntent(intent);
        d(intent, true);
    }

    @Override // android.app.Activity
    public final void onPause() {
        super.onPause();
        this.b = false;
    }

    @Override // android.app.Activity
    public final void onResume() {
        super.onResume();
        if (!this.c || this.b) {
            return;
        }
        setResult(0);
        finish();
    }

    @Override // android.app.Activity
    public void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putBoolean("VK_waitingForAuthResult", this.c);
    }
}
