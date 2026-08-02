package com.vk.newsfeed.posting.music_picker.domain.model;

import com.vk.newsfeed.posting.music_picker.domain.model.MusicPickerList;
import xsna.epx;
import xsna.fu40;

/* compiled from: MusicPickerPatch.kt */
/* loaded from: classes4.dex */
public final class b implements fu40 {
    public final MusicPickerList.Playlists b;

    public b(MusicPickerList.Playlists playlists) {
        this.b = playlists;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof b) && epx.f(this.b, ((b) obj).b);
    }

    public final int hashCode() {
        return this.b.hashCode();
    }

    public final String toString() {
        return "OpenPlaylists(pickerList=" + this.b + ')';
    }
}
