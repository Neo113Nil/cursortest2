package com.vk.voip.ui.auth;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import com.facebook.soloader.MinElf;
import com.vk.bridges.di.ImBridgeComponent;
import com.vk.dto.common.id.UserId;
import com.vk.log.L;
import xsna.epx;
import xsna.fkq0;
import xsna.fpf0;
import xsna.k7m;
import xsna.m7m;
import xsna.o0r0;
import xsna.o0w;
import xsna.w8i;

/* compiled from: CallsBridgeTrampolineActivity.kt */
/* loaded from: classes7.dex */
public final class CallsBridgeTrampolineActivity extends Activity implements w8i {
    public static final /* synthetic */ int b = 0;

    @Override // android.app.Activity
    public final void onCreate(Bundle bundle) {
        Parcelable parcelable;
        Object parcelableExtra;
        super.onCreate(bundle);
        if (bundle == null) {
            if (epx.f(getIntent().getAction(), "open_chat")) {
                long longExtra = getIntent().getLongExtra("dialog_id", 0L);
                if (longExtra == 0) {
                    L.l("CallsBridgeTrampolineActivity", "Can't get dialog id from extras or user id isn't valid");
                } else {
                    Context applicationContext = getApplicationContext();
                    o0w b2 = ((ImBridgeComponent) ((k7m) m7m.f(this)).a(fpf0.a(ImBridgeComponent.class))).g5().b();
                    Intent j = o0w.j(b2, applicationContext, null, longExtra, null, null, "voip", b2.D(), null, 100261882);
                    j.setFlags(335544320);
                    applicationContext.startActivity(j);
                }
            } else if (epx.f(getIntent().getAction(), "open_profile")) {
                Intent intent = getIntent();
                if (Build.VERSION.SDK_INT >= 33) {
                    parcelableExtra = intent.getParcelableExtra("user_id", UserId.class);
                    parcelable = (Parcelable) parcelableExtra;
                } else {
                    Parcelable parcelableExtra2 = intent.getParcelableExtra("user_id");
                    if (!(parcelableExtra2 instanceof UserId)) {
                        parcelableExtra2 = null;
                    }
                    parcelable = (UserId) parcelableExtra2;
                }
                UserId userId = (UserId) parcelable;
                if (userId == null || !fkq0.c(userId)) {
                    L.l("CallsBridgeTrampolineActivity", "Can't get user id from extras or user id isn't real");
                } else {
                    ((ImBridgeComponent) ((k7m) m7m.f(this)).a(fpf0.a(ImBridgeComponent.class))).g5().d().m(getApplicationContext(), userId, new o0r0.a(false, null, null, null, null, null, null, false, false, false, false, null, null, null, MinElf.PN_XNUM));
                }
            }
        }
        finish();
    }
}
