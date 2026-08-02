package com.vk.voip.ui.join.directly.withpreview;

import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import com.vkontakte.android.FragmentWrapperActivity;
import xsna.fuj0;

/* compiled from: JoinCallActivity.kt */
/* loaded from: classes7.dex */
public final class JoinCallActivity extends FragmentWrapperActivity implements fuj0 {
    @Override // com.vkontakte.android.FragmentWrapperActivity, com.vk.navigation.NavigationDelegateActivity, android.app.Activity
    public final void finish() {
        overridePendingTransition(0, 0);
        super.finish();
    }

    @Override // com.vkontakte.android.FragmentWrapperActivity, com.vk.navigation.NavigationDelegateActivity, com.vkontakte.android.VKActivity, com.vk.core.ui.themes.ThemableActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        getWindow().setBackgroundDrawable(new ColorDrawable(0));
    }
}
