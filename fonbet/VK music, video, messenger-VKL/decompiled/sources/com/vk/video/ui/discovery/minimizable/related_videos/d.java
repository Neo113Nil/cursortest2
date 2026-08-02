package com.vk.video.ui.discovery.minimizable.related_videos;

import com.vk.dto.common.VideoFile;
import com.vk.dto.common.id.UserId;
import com.vk.dto.video.VideoListWithTotalCount;
import com.vk.libvideo.video.queue.api.model.related.VideoRelatedVideosOrder;
import com.vk.video.ui.discovery.minimizable.related_videos.VideoDiscoveryRelatedVideosSourceArgs;
import io.reactivex.rxjava3.core.x;
import io.reactivex.rxjava3.internal.operators.single.a0;
import java.util.ArrayList;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import xsna.drm0;
import xsna.l5t0;
import xsna.m5t0;

/* compiled from: VideoDiscoveryRelatedVideosPagingStateLoader.kt */
/* loaded from: classes7.dex */
public final class d {
    public final m5t0 a;
    public io.reactivex.rxjava3.disposables.c b;
    public io.reactivex.rxjava3.disposables.c c;
    public io.reactivex.rxjava3.disposables.c d;
    public io.reactivex.rxjava3.disposables.c e;

    public d(m5t0 m5t0Var) {
        this.a = m5t0Var;
    }

    public static ArrayList b(List list) {
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            String platform = ((VideoFile) obj).getPlatform();
            if (platform == null || drm0.N(platform)) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    public final void a() {
        io.reactivex.rxjava3.disposables.c cVar = this.c;
        if (cVar != null) {
            cVar.dispose();
        }
        this.c = null;
        io.reactivex.rxjava3.disposables.c cVar2 = this.d;
        if (cVar2 != null) {
            cVar2.dispose();
        }
        this.d = null;
        io.reactivex.rxjava3.disposables.c cVar3 = this.e;
        if (cVar3 != null) {
            cVar3.dispose();
        }
        this.e = null;
    }

    public final x<VideoListWithTotalCount> c(VideoDiscoveryRelatedVideosSourceArgs videoDiscoveryRelatedVideosSourceArgs, int i, int i2, int i3) {
        if (videoDiscoveryRelatedVideosSourceArgs instanceof VideoDiscoveryRelatedVideosSourceArgs.Playlist) {
            return d((VideoDiscoveryRelatedVideosSourceArgs.Playlist) videoDiscoveryRelatedVideosSourceArgs, new l5t0.b(i2, i3), i);
        }
        if (videoDiscoveryRelatedVideosSourceArgs instanceof VideoDiscoveryRelatedVideosSourceArgs.TemporaryPlaylist) {
            return a0.b;
        }
        throw new NoWhenBranchMatchedException();
    }

    public final x<VideoListWithTotalCount> d(VideoDiscoveryRelatedVideosSourceArgs.Playlist playlist, l5t0 l5t0Var, int i) {
        m5t0.a.C3323a c3323a;
        UserId userId = playlist.i;
        String str = playlist.j;
        VideoRelatedVideosOrder videoRelatedVideosOrder = playlist.l;
        boolean z = videoRelatedVideosOrder instanceof VideoRelatedVideosOrder.Reverse;
        String r = playlist.b.r();
        if (videoRelatedVideosOrder instanceof VideoRelatedVideosOrder.Shuffled) {
            VideoRelatedVideosOrder.Shuffled shuffled = (VideoRelatedVideosOrder.Shuffled) videoRelatedVideosOrder;
            c3323a = new m5t0.a.C3323a(Integer.valueOf(shuffled.b), shuffled.c);
        } else {
            c3323a = m5t0.a.C3323a.c;
        }
        return this.a.a(new m5t0.a(i, userId, str, l5t0Var, z, r, c3323a));
    }
}
