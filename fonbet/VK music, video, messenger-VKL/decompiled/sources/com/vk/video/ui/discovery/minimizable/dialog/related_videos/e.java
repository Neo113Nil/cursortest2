package com.vk.video.ui.discovery.minimizable.dialog.related_videos;

import com.vk.core.view.components.tabs.VkTabs;
import com.vk.dto.video.VideoSeason;
import java.util.List;
import xsna.vts0;
import xsna.wts0;

/* compiled from: VideoRelatedVideosFragment.kt */
/* loaded from: classes7.dex */
public final class e implements VkTabs.b {
    public final /* synthetic */ VideoRelatedVideosFragment a;
    public final /* synthetic */ List<VideoSeason> b;

    public e(VideoRelatedVideosFragment videoRelatedVideosFragment, List<VideoSeason> list) {
        this.a = videoRelatedVideosFragment;
        this.b = list;
    }

    @Override // com.vk.core.view.components.tabs.VkTabs.b
    public final void c(VkTabs.c cVar) {
        VideoRelatedVideosFragment videoRelatedVideosFragment = this.a;
        wts0 vj = videoRelatedVideosFragment.vj(videoRelatedVideosFragment);
        if (vj != null) {
            vj.T4(new vts0.j.e(this.b.get(cVar.b)));
        }
    }

    @Override // com.vk.core.view.components.tabs.VkTabs.b
    public final void b() {
    }

    @Override // com.vk.core.view.components.tabs.VkTabs.b
    public final void a(VkTabs.c cVar) {
    }
}
