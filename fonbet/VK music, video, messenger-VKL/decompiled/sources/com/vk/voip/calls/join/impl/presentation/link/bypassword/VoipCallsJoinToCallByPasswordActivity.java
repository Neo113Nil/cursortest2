package com.vk.voip.calls.join.impl.presentation.link.bypassword;

import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import com.vk.voip.calls.join.api.di.VoipCallsJoinRouterComponent;
import com.vkontakte.android.FragmentWrapperActivity;
import xsna.clt0;
import xsna.dlw0;
import xsna.fpf0;
import xsna.fuj0;
import xsna.m7m;
import xsna.zlt;

/* compiled from: VoipCallsJoinToCallByPasswordActivity.kt */
/* loaded from: classes7.dex */
public final class VoipCallsJoinToCallByPasswordActivity extends FragmentWrapperActivity implements fuj0 {
    public static final /* synthetic */ int z = 0;

    @Override // com.vkontakte.android.FragmentWrapperActivity, com.vk.navigation.NavigationDelegateActivity, android.app.Activity
    public final void finish() {
        overridePendingTransition(0, 0);
        super.finish();
    }

    @Override // com.vkontakte.android.FragmentWrapperActivity, com.vk.navigation.NavigationDelegateActivity, com.vkontakte.android.VKActivity, com.vk.core.ui.themes.ThemableActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onCreate(Bundle bundle) {
        String str;
        super.onCreate(bundle);
        getWindow().setBackgroundDrawable(new ColorDrawable(0));
        if (bundle == null) {
            Bundle extras = getIntent().getExtras();
            if (extras == null || (str = extras.getString("vk_join_link")) == null) {
                str = "";
            }
            ((VoipCallsJoinRouterComponent) m7m.a(this).a(fpf0.a(VoipCallsJoinRouterComponent.class))).a().a(this, new dlw0.a(str), new zlt(null, new clt0(this, 7), null, 11));
        }
    }
}
