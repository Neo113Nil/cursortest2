package com.vk.newsfeed.impl.fragments;

import com.vk.core.ui.tracking.UiTrackingScreen;
import com.vk.stat.scheme.MobileOfficialAppsCoreNavStat$EventScreen;

/* compiled from: CommentThreadWithBottomMenuBarFragment.kt */
/* loaded from: classes4.dex */
public final class CommentThreadWithBottomMenuBarFragment extends CommentThreadFragment {
    @Override // com.vk.core.fragments.FragmentImpl, xsna.m0q0
    public final void y(UiTrackingScreen uiTrackingScreen) {
        uiTrackingScreen.a = MobileOfficialAppsCoreNavStat$EventScreen.FEED_COMMENT;
    }
}
