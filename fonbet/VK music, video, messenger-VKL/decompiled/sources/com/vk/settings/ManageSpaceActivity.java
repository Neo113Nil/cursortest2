package com.vk.settings;

import android.os.Bundle;
import com.vk.core.view.FitSystemWindowsFragmentWrapperFrameLayout;
import com.vkontakte.android.VKActivity;
import xsna.tw3;

/* compiled from: ManageSpaceActivity.kt */
/* loaded from: classes5.dex */
public abstract class ManageSpaceActivity extends VKActivity {
    public abstract void T1();

    @Override // com.vkontakte.android.VKActivity, com.vk.core.ui.themes.ThemableActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        FitSystemWindowsFragmentWrapperFrameLayout fitSystemWindowsFragmentWrapperFrameLayout = new FitSystemWindowsFragmentWrapperFrameLayout(this, 0);
        setContentView(fitSystemWindowsFragmentWrapperFrameLayout);
        fitSystemWindowsFragmentWrapperFrameLayout.post(new tw3(this, 10));
    }
}
