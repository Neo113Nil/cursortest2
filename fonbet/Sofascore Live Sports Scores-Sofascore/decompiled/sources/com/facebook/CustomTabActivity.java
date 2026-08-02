package com.facebook;

import android.app.Activity;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Bundle;
import androidx.localbroadcastmanager.content.LocalBroadcastManager;
import kotlin.Metadata;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/facebook/CustomTabActivity;", "Landroid/app/Activity;", "<init>", "()V", "facebook-common_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class CustomTabActivity extends Activity {
    public com.facebook.internal.d a;

    @Override // android.app.Activity
    public final void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        if (i2 == 0) {
            Intent intent2 = new Intent("CustomTabActivity.action_customTabRedirect");
            intent2.putExtra("CustomTabMainActivity.extra_url", getIntent().getDataString());
            LocalBroadcastManager.getInstance(this).sendBroadcast(intent2);
            com.facebook.internal.d dVar = new com.facebook.internal.d(this, 10);
            LocalBroadcastManager.getInstance(this).registerReceiver(dVar, new IntentFilter("CustomTabActivity.action_destroy"));
            this.a = dVar;
        }
    }

    @Override // android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Intent intent = new Intent(this, (Class<?>) CustomTabMainActivity.class);
        intent.setAction("CustomTabActivity.action_customTabRedirect");
        intent.putExtra("CustomTabMainActivity.extra_url", getIntent().getDataString());
        intent.addFlags(603979776);
        startActivityForResult(intent, 2);
    }

    @Override // android.app.Activity
    public final void onDestroy() {
        com.facebook.internal.d dVar = this.a;
        if (dVar != null) {
            LocalBroadcastManager.getInstance(this).unregisterReceiver(dVar);
        }
        super.onDestroy();
    }
}
