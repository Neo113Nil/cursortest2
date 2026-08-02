package com.vk.music.podcast.impl.ui.offlinepage.presentation.feature;

import com.vk.dto.common.DownloadingState;
import com.vk.dto.common.Image;
import com.vk.dto.music.Episode;
import com.vk.dto.music.MusicTrack;
import com.vk.dto.music.Thumb;
import com.vk.music.podcast.impl.ui.offlinepage.presentation.feature.OfflinePodcastEpisodesMviState;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;
import kotlin.NoWhenBranchMatchedException;
import xsna.c5g;
import xsna.di40;
import xsna.hv70;

/* compiled from: OfflinePodcastEpisodesViewStateMapper.kt */
/* loaded from: classes3.dex */
public final class b {
    public static final hv70 a(OfflinePodcastEpisodesMviState offlinePodcastEpisodesMviState) {
        Image image;
        if (!(offlinePodcastEpisodesMviState instanceof OfflinePodcastEpisodesMviState.Content)) {
            if (!(offlinePodcastEpisodesMviState instanceof OfflinePodcastEpisodesMviState.Loading)) {
                throw new NoWhenBranchMatchedException();
            }
            OfflinePodcastEpisodesMviState.Loading loading = (OfflinePodcastEpisodesMviState.Loading) offlinePodcastEpisodesMviState;
            return new hv70.d(loading.b, loading.d);
        }
        OfflinePodcastEpisodesMviState.Content content = (OfflinePodcastEpisodesMviState.Content) offlinePodcastEpisodesMviState;
        String str = content.b;
        OfflinePodcastEpisodesMviState.SortType sortType = content.e;
        List<MusicTrack> list = content.c;
        ArrayList arrayList = new ArrayList(c5g.u(list, 10));
        for (MusicTrack musicTrack : list) {
            String Fb = musicTrack.Fb();
            String str2 = musicTrack.d;
            if (str2 == null) {
                str2 = "";
            }
            String str3 = str2;
            Episode episode = musicTrack.w;
            int seconds = episode != null ? (int) TimeUnit.MILLISECONDS.toSeconds(episode.d) : 0;
            Episode episode2 = musicTrack.w;
            Thumb thumb = (episode2 == null || (image = episode2.f) == null) ? null : new Thumb(image);
            int i = musicTrack.f;
            DownloadingState downloadingState = content.d.get(musicTrack.Fb());
            if (downloadingState == null) {
                downloadingState = musicTrack.J;
            }
            arrayList.add(new hv70.c(Fb, str3, seconds, thumb, i, di40.a(downloadingState)));
        }
        return new hv70.a(str, sortType, arrayList, null, 56);
    }
}
