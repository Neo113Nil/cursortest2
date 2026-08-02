package com.vk.pushes.receivers;

import android.app.Activity;
import android.os.Bundle;
import xsna.bpn0;

/* compiled from: NotificationActionsTrampolineActivity.kt */
/* loaded from: classes5.dex */
public final class NotificationActionsTrampolineActivity extends Activity {
    @Override // android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        new c((bpn0) null).a(this, getIntent());
        finish();
    }
}
