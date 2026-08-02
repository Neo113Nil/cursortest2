package com.vk.voip.ui.watchmovie.selectsource.tabs.fragments;

import android.content.Context;
import com.vk.voip.ui.watchmovie.selectsource.tabs.fragments.VoipVideoListFragment;
import com.vkontakte.android.R;
import xsna.iid;
import xsna.og0;
import xsna.q0x0;
import xsna.uft0;
import xsna.y0x0;

/* compiled from: VoipRecommendedVideosFragment.kt */
/* loaded from: classes7.dex */
public final class VoipRecommendedVideosFragment extends VoipVideoListFragment {

    /* compiled from: VoipRecommendedVideosFragment.kt */
    public static final class a extends VoipVideoListFragment.a<VoipRecommendedVideosFragment> {
    }

    @Override // com.vk.voip.ui.watchmovie.selectsource.tabs.fragments.VoipVideoListFragment
    public final y0x0 fo(Context context) {
        return new y0x0(R.string.empty_list, context, false);
    }

    @Override // com.vk.voip.ui.watchmovie.selectsource.tabs.fragments.VoipVideoListFragment
    public final q0x0 go(uft0 uft0Var, iid iidVar) {
        return new og0(uft0Var, iidVar);
    }
}
