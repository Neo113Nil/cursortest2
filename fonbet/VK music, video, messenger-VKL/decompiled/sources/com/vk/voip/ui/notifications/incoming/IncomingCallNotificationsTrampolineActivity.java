package com.vk.voip.ui.notifications.incoming;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import com.vk.log.L;
import com.vk.voip.api.di.VoipCallComponent;
import xsna.fpf0;
import xsna.k7m;
import xsna.m7m;
import xsna.psw;
import xsna.w8i;

/* compiled from: IncomingCallNotificationsTrampolineActivity.kt */
/* loaded from: classes7.dex */
public final class IncomingCallNotificationsTrampolineActivity extends Activity implements w8i {
    @Override // android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        L.A("IncomingCallNotificationsTrampolineActivity", "onCreate");
        psw e3 = ((VoipCallComponent) ((k7m) m7m.f(this)).a(fpf0.a(VoipCallComponent.class))).e3();
        setShowWhenLocked(true);
        setTurnScreenOn(true);
        Intent intent = getIntent();
        if (intent != null) {
            e3.a(intent);
        }
        finish();
    }
}
