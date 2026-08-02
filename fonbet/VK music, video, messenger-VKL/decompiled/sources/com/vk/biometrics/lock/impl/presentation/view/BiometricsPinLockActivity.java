package com.vk.biometrics.lock.impl.presentation.view;

import android.R;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.Window;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.a;
import com.vk.biometrics.lock.api.domain.model.PinLockLaunchMode;
import com.vk.biometrics.lock.impl.presentation.base.mvi.pin.BiometricsLockPinFragment;
import com.vkontakte.android.VKActivity;
import java.util.HashSet;
import xsna.dhr0;
import xsna.e5;
import xsna.fnj;
import xsna.iah0;
import xsna.mnh0;
import xsna.s3q0;
import xsna.tk5;

/* compiled from: BiometricsPinLockActivity.kt */
/* loaded from: classes.dex */
public final class BiometricsPinLockActivity extends VKActivity {
    public static final /* synthetic */ int v = 0;

    @Override // com.vkontakte.android.VKActivity, com.vk.core.ui.themes.ThemableActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        FragmentManager supportFragmentManager = getSupportFragmentManager();
        a b = tk5.b(supportFragmentManager, supportFragmentManager);
        BiometricsLockPinFragment biometricsLockPinFragment = new BiometricsLockPinFragment();
        biometricsLockPinFragment.An(false);
        Bundle bundle2 = new Bundle();
        bundle2.putInt("PIN_LOCK_LAUNCH_MODE_KEY", PinLockLaunchMode.ENTER_PASSWORD.h());
        biometricsLockPinFragment.setArguments(bundle2);
        s3q0 s3q0Var = s3q0.a;
        b.f(R.id.content, biometricsLockPinFragment, null, 1);
        b.k(false);
        Window window = getWindow();
        if (window != null) {
            window.setBackgroundDrawable(new ColorDrawable(dhr0.t.c(com.vkontakte.android.R.attr.vk_ui_background_content)));
            HashSet hashSet = iah0.a;
            if (fnj.d(this)) {
                mnh0.w(window.getDecorView(), true);
            }
        }
        HashSet hashSet2 = iah0.a;
        if (fnj.d(this)) {
            mnh0.w(window.getDecorView(), dhr0.C().b);
        }
        dhr0.r0(this);
        mnh0.c(getOnBackPressedDispatcher(), null, new e5(this, 9), 3);
    }
}
