package com.vk.video.ui.discovery.minimizable.playlist.collapsed.views;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import com.vkontakte.android.R;
import xsna.cr6;

/* compiled from: VideoRelatedVideosCollapsedContainerView.kt */
/* loaded from: classes7.dex */
public final class VideoRelatedVideosCollapsedContainerView extends cr6 {
    public final int E;
    public final int F;
    public final int G;
    public final int H;

    public VideoRelatedVideosCollapsedContainerView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        LayoutInflater.from(context).inflate(R.layout.video_playlist_collapsed_container, (ViewGroup) this, true);
        this.E = R.id.playlistCollapsedViewContainer;
        this.F = R.id.playlistCollapsedContainerTitle;
        this.G = R.id.playlistCollapsedContainerSubtitle;
        this.H = R.id.playlistCollapsedContainerIcon;
    }

    @Override // xsna.cr6
    public final boolean Q4() {
        return this.C;
    }

    @Override // xsna.cr6
    public int getContainerViewId() {
        return this.E;
    }

    @Override // xsna.cr6
    public int getIconViewId() {
        return this.H;
    }

    @Override // xsna.cr6
    public int getSubtitleViewId() {
        return this.G;
    }

    @Override // xsna.cr6
    public int getTitleViewId() {
        return this.F;
    }
}
