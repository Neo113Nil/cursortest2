package com.vk.voip.ui.actions.menu.fragments;

import android.os.Bundle;
import android.view.View;
import com.vk.voip.ui.utils.ContextHolderFragment;
import java.util.concurrent.TimeUnit;
import xsna.kyc;

/* compiled from: VoipMainMenuFragmentBase.kt */
/* loaded from: classes7.dex */
public class VoipMainMenuFragmentBase extends ContextHolderFragment {
    public static final /* synthetic */ int O = 0;

    @Override // com.vk.core.fragments.FragmentImpl, androidx.fragment.app.d, androidx.fragment.app.Fragment
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        postponeEnterTransition(750L, TimeUnit.MILLISECONDS);
    }

    @Override // com.vk.core.fragments.FragmentImpl, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        view.postDelayed(new kyc(this, 11), 100L);
    }
}
