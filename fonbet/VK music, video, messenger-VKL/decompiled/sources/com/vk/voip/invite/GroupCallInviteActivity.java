package com.vk.voip.invite;

import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.Window;
import com.vkontakte.android.FragmentWrapperActivity;
import com.vkontakte.android.R;
import xsna.dhr0;
import xsna.fuj0;

/* compiled from: GroupCallInviteActivity.kt */
/* loaded from: classes7.dex */
public final class GroupCallInviteActivity extends FragmentWrapperActivity implements fuj0 {
    @Override // com.vkontakte.android.FragmentWrapperActivity, com.vk.navigation.NavigationDelegateActivity, android.app.Activity
    public final void finish() {
        super.finish();
        overridePendingTransition(0, 0);
    }

    @Override // com.vkontakte.android.FragmentWrapperActivity, com.vk.navigation.NavigationDelegateActivity, com.vkontakte.android.VKActivity, com.vk.core.ui.themes.ThemableActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Window window = getWindow();
        window.getDecorView().setBackground(null);
        window.setBackgroundDrawable(new ColorDrawable(0));
        window.setStatusBarColor(dhr0.t.c(R.attr.vk_ui_header_background));
    }
}
