package com.vk.libvideo.adfree.impl.ui;

import android.content.Context;
import android.content.Intent;
import androidx.fragment.app.FragmentActivity;
import com.vk.superapp.ui.miniapp.VKSuperAppBrowserFragment;
import com.vkontakte.android.MainActivity;
import kotlin.LazyThreadSafetyMode;
import xsna.bi;
import xsna.jes;
import xsna.msy;
import xsna.oz50;
import xsna.r3y;
import xsna.rsr;
import xsna.rtg0;
import xsna.vbs;
import xsna.z4d0;

/* compiled from: VideoAdFreeSubscriptionFragment.kt */
/* loaded from: classes18.dex */
public final class VideoAdFreeSubscriptionFragment extends VKSuperAppBrowserFragment implements jes {
    public static final /* synthetic */ int b0 = 0;
    public final Object a0 = msy.a(LazyThreadSafetyMode.NONE, new z4d0(this, 25));

    /* compiled from: VideoAdFreeSubscriptionFragment.kt */
    public static final class a extends bi {
    }

    @Override // com.vk.superapp.ui.miniapp.VKSuperAppBrowserFragment, com.vk.core.fragments.FragmentImpl
    public final boolean a0() {
        com.vk.core.fragments.a aVar;
        vbs Ln = Ln();
        if ((Ln == null || (aVar = Ln.h) == null) ? false : aVar.a0()) {
            return true;
        }
        Context requireContext = requireContext();
        rsr rsrVar = oz50.k;
        oz50.b.d();
        Intent intent = new Intent(requireContext, (Class<?>) MainActivity.class);
        intent.setFlags(268468224);
        startActivity(intent);
        FragmentActivity activity = getActivity();
        if (activity == null) {
            return true;
        }
        activity.finish();
        return true;
    }

    @Override // com.vk.core.fragments.FragmentImpl
    public final void finish() {
        vbs Ln = Ln();
        if ((Ln != null ? Ln.p() : 0) > 1) {
            super.finish();
        } else {
            a0();
        }
    }

    @Override // com.vk.superapp.ui.miniapp.VKSuperAppBrowserFragment, androidx.fragment.app.d, androidx.fragment.app.Fragment
    public final void onStart() {
        super.onStart();
        r3y.a("subscriptionActivated", new rtg0(this, 16));
    }

    @Override // com.vk.superapp.ui.miniapp.VKSuperAppBrowserFragment, com.vk.core.fragments.FragmentImpl, androidx.fragment.app.d, androidx.fragment.app.Fragment
    public final void onStop() {
        super.onStop();
        r3y.c("subscriptionActivated");
    }
}
