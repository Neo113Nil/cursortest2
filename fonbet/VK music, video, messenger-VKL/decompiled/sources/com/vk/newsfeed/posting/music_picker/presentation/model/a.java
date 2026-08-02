package com.vk.newsfeed.posting.music_picker.presentation.model;

import com.vk.dto.music.MusicTrack;
import com.vk.newsfeed.posting.impl.presentation.model.MusicDto;
import com.vk.newsfeed.posting.music_picker.domain.model.MusicPickerList;
import com.vk.newsfeed.posting.music_picker.domain.model.MusicPickerState;
import com.vk.newsfeed.posting.music_picker.presentation.model.MusicPickerListItem;
import com.vkontakte.android.R;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import xsna.c5g;
import xsna.epx;
import xsna.j5g;
import xsna.jq4;
import xsna.s1v;

/* compiled from: MusicPickerViewStateMapper.kt */
/* loaded from: classes4.dex */
public final class a {
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:12:0x004b  */
    /* JADX WARN: Type inference failed for: r1v16 */
    /* JADX WARN: Type inference failed for: r1v17 */
    /* JADX WARN: Type inference failed for: r1v18 */
    /* JADX WARN: Type inference failed for: r1v5 */
    /* JADX WARN: Type inference failed for: r1v6, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r1v9, types: [java.util.ArrayList] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static List a(MusicPickerState musicPickerState, List list, MusicPickerList musicPickerList) {
        ?? r1;
        boolean z = musicPickerList instanceof MusicPickerList.Tracks;
        if (z) {
            MusicPickerList.Tracks tracks = (MusicPickerList.Tracks) musicPickerList;
            if (tracks.h && tracks.c.length() > 0) {
                r1 = Collections.singletonList(new MusicPickerListItem.EmptyListItem(R.string.music_picker_empty_search_list));
                if (list.isEmpty()) {
                    list = null;
                }
                if (list != null) {
                    List<MusicTrack> list2 = list;
                    r1 = new ArrayList(c5g.u(list2, 10));
                    for (MusicTrack musicTrack : list2) {
                        MusicDto b = jq4.b(musicTrack);
                        List<MusicDto> list3 = musicPickerState.f;
                        boolean z2 = false;
                        if (!(list3 instanceof Collection) || !list3.isEmpty()) {
                            Iterator it = list3.iterator();
                            while (true) {
                                if (!it.hasNext()) {
                                    break;
                                }
                                if (s1v.m((MusicDto) it.next(), musicTrack)) {
                                    z2 = true;
                                    break;
                                }
                            }
                        }
                        MusicTrack musicTrack2 = musicPickerState.l;
                        r1.add(new MusicPickerListItem.MusicTrackItem(musicTrack, b, z2, epx.f(musicTrack2 != null ? musicTrack2.Ib() : null, musicTrack.Ib()) ? musicPickerState.k : MusicPickerListItem.MusicTrackItem.PlayingState.None));
                    }
                }
                if (!z && !((MusicPickerList.Tracks) musicPickerList).h) {
                    return j5g.u0((Iterable) r1, Collections.singletonList(MusicPickerListItem.PlaylistsAndAlbumsItem.b));
                }
                if ((musicPickerList instanceof MusicPickerList.SelectedPlaylist) || !musicPickerState.h) {
                    return r1;
                }
                return j5g.u0((Iterable) r1, Collections.singletonList(MusicPickerListItem.SelectPlaylistItem.b));
            }
        }
        r1 = musicPickerList instanceof MusicPickerList.SelectedPlaylist ? Collections.singletonList(new MusicPickerListItem.EmptyListItem(R.string.music_picker_empty_playlist_tracks_list)) : Collections.singletonList(new MusicPickerListItem.EmptyListItem(R.string.music_picker_empty_tracks_list));
        if (list.isEmpty()) {
        }
        if (list != null) {
        }
        if (!z) {
        }
        if (musicPickerList instanceof MusicPickerList.SelectedPlaylist) {
        }
        return r1;
    }
}
