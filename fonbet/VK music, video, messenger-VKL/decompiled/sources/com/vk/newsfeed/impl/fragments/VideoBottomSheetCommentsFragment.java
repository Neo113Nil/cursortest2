package com.vk.newsfeed.impl.fragments;

import android.view.View;
import com.vk.toggle.b;
import com.vk.toggle.features.VideoFeatures;
import xsna.c9c0;
import xsna.lfg;
import xsna.mdg;
import xsna.u3g0;

/* compiled from: VideoBottomSheetCommentsFragment.kt */
/* loaded from: classes4.dex */
public class VideoBottomSheetCommentsFragment extends BottomSheetCommentsFragment {
    @Override // com.vk.newsfeed.impl.fragments.BottomSheetCommentsFragment
    public void Uo() {
        super.Uo();
        u3g0 u3g0Var = this.X;
        if (u3g0Var != null) {
            VideoFeatures videoFeatures = VideoFeatures.VIDEO_NO_VIDEO_COMMENT_ATTACH;
            videoFeatures.getClass();
            if (b.A.a(videoFeatures)) {
                u3g0Var.l();
            }
        }
    }

    @Override // com.vk.newsfeed.impl.fragments.BottomSheetCommentsFragment
    public final void Vo(View view) {
        if (getResources().getConfiguration().orientation == 2) {
            return;
        }
        super.Vo(view);
    }

    @Override // com.vk.newsfeed.impl.fragments.PostViewFragment, com.vk.newsfeed.impl.fragments.BaseCommentsFragment, com.vk.core.fragments.BaseFragment, com.vk.core.fragments.FragmentImpl, androidx.fragment.app.Fragment
    public final void onDestroy() {
        super.onDestroy();
        c9c0 Co = Co();
        if (Co != null) {
            ((com.vk.newsfeed.impl.presenters.b) Co).onDestroy();
        }
        lfg lfgVar = this.C0;
        if (lfgVar == null) {
            lfgVar = null;
        }
        lfgVar.onDestroy();
        mdg mdgVar = this.S;
        if (mdgVar != null) {
            mdgVar.onDestroy();
        }
    }
}
