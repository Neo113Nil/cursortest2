package com.vk.stories.design.view.stats.tabs.viewers.model;

import com.vk.dto.stories.entities.StoryUserProfile;
import xsna.epx;
import xsna.hfz;
import xsna.qoy;
import xsna.s3u0;

/* compiled from: StoryUserViewer.kt */
/* loaded from: classes6.dex */
public final class StoryUserViewer extends StoryUserProfile implements s3u0, hfz {
    public final boolean j0;

    public StoryUserViewer(StoryUserProfile storyUserProfile, boolean z) {
        super(storyUserProfile, storyUserProfile.h0, storyUserProfile.i0);
        this.j0 = z;
    }

    @Override // com.vk.dto.user.UserProfile
    public final boolean equals(Object obj) {
        StoryUserViewer storyUserViewer = obj instanceof StoryUserViewer ? (StoryUserViewer) obj : null;
        return storyUserViewer != null && epx.f(this.c, storyUserViewer.c) && this.h0 == storyUserViewer.h0 && epx.f(this.i0, storyUserViewer.i0) && this.j0 == storyUserViewer.j0;
    }

    @Override // xsna.hfz
    public final Number getItemId() {
        return 0;
    }

    @Override // com.vk.dto.user.UserProfile
    public final int hashCode() {
        int b = qoy.b(Long.hashCode(this.c.b) * 31, 31, this.h0);
        Integer num = this.i0;
        return Boolean.hashCode(this.j0) + ((b + (num != null ? num.hashCode() : 0)) * 31);
    }
}
