package com.vk.voip.ui.notifications.ongoing;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import com.vk.voip.api.di.VoipCallComponent;
import xsna.fpf0;
import xsna.k7m;
import xsna.ko80;
import xsna.m7m;
import xsna.w8i;

/* compiled from: OngoingCallNotificationsTrampolineActivity.kt */
/* loaded from: classes7.dex */
public final class OngoingCallNotificationsTrampolineActivity extends Activity implements w8i {
    @Override // android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        ko80 Yc = ((VoipCallComponent) ((k7m) m7m.f(this)).a(fpf0.a(VoipCallComponent.class))).Yc();
        Intent intent = getIntent();
        if (intent != null) {
            Yc.a(intent);
        }
        finish();
    }
}
