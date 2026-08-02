package com.vk.video.ui.discovery.minimizable.related_videos;

import com.vk.dto.video.VideoSeason;
import com.vk.video.ui.discovery.minimizable.related_videos.VideoDiscoveryRelatedVideosSource;
import com.vk.video.ui.discovery.minimizable.related_videos.h;
import com.vk.video.ui.discovery.minimizable.related_videos.o;
import java.util.Iterator;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import xsna.j5g;
import xsna.mct0;

/* compiled from: VideoDiscoveryRelatedVideosState.kt */
/* loaded from: classes7.dex */
public final class i {
    public static final int a(h.a aVar) {
        o oVar = aVar.g;
        int i = aVar.c;
        VideoDiscoveryRelatedVideosSource videoDiscoveryRelatedVideosSource = aVar.h;
        if (!(videoDiscoveryRelatedVideosSource instanceof VideoDiscoveryRelatedVideosSource.TemporaryPlaylist) && !(videoDiscoveryRelatedVideosSource instanceof VideoDiscoveryRelatedVideosSource.Playlist)) {
            throw new NoWhenBranchMatchedException();
        }
        List<VideoSeason> list = videoDiscoveryRelatedVideosSource.b8().q;
        if (!(oVar instanceof o.a)) {
            throw new NoWhenBranchMatchedException();
        }
        Iterator<VideoSeason> it = list.iterator();
        int i2 = 0;
        while (true) {
            if (!it.hasNext()) {
                i2 = -1;
                break;
            }
            VideoSeason next = it.next();
            mct0 f = p.f(oVar, aVar.a);
            if (f != null && next.b == f.a) {
                break;
            }
            i2++;
        }
        if (!list.isEmpty() && i2 >= 0 && i != -1) {
            Iterator it2 = j5g.H0(list, i2).iterator();
            while (it2.hasNext()) {
                i += ((VideoSeason) it2.next()).d;
            }
        }
        return i;
    }
}
