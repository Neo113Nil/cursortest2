package com.vk.newsfeed.posting.music_picker.domain.model;

import com.vk.newsfeed.posting.music_picker.domain.model.MusicPickerList;
import xsna.epx;
import xsna.fu40;

/* compiled from: MusicPickerPatch.kt */
/* loaded from: classes4.dex */
public final class a implements fu40 {
    public final MusicPickerList.SelectedPlaylist b;

    public a(MusicPickerList.SelectedPlaylist selectedPlaylist) {
        this.b = selectedPlaylist;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof a) && epx.f(this.b, ((a) obj).b);
    }

    public final int hashCode() {
        return this.b.hashCode();
    }

    public final String toString() {
        return "OpenPlaylist(pickerList=" + this.b + ')';
    }
}
