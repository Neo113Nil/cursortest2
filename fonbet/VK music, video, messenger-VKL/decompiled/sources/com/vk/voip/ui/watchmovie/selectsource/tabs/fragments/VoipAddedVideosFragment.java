package com.vk.voip.ui.watchmovie.selectsource.tabs.fragments;

import android.content.Context;
import com.vk.voip.ui.watchmovie.selectsource.tabs.fragments.VoipVideoListFragment;
import com.vkontakte.android.R;
import xsna.iid;
import xsna.q0x0;
import xsna.uft0;
import xsna.y0x0;
import xsna.zcw0;

/* compiled from: VoipAddedVideosFragment.kt */
/* loaded from: classes7.dex */
public final class VoipAddedVideosFragment extends VoipVideoListFragment {

    /* compiled from: VoipAddedVideosFragment.kt */
    public static final class a extends VoipVideoListFragment.a<VoipAddedVideosFragment> {
    }

    @Override // com.vk.voip.ui.watchmovie.selectsource.tabs.fragments.VoipVideoListFragment
    public final y0x0 fo(Context context) {
        return new y0x0(R.string.voip_watcth_video_added_empty_description, context, false);
    }

    @Override // com.vk.voip.ui.watchmovie.selectsource.tabs.fragments.VoipVideoListFragment
    public final q0x0 go(uft0 uft0Var, iid iidVar) {
        return new zcw0(uft0Var, iidVar);
    }
}
