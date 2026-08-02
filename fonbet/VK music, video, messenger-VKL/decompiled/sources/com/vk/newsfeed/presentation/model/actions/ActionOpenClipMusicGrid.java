package com.vk.newsfeed.presentation.model.actions;

import com.vk.core.serialize.Serializer;
import com.vk.dto.common.clips.ClipAudioTemplate;
import com.vk.dto.music.MusicTrack;
import com.vk.feed.core.models.actions.HeaderAction;

/* compiled from: ActionOpenClipMusicGrid.kt */
/* loaded from: classes4.dex */
public final class ActionOpenClipMusicGrid extends HeaderAction {
    public static final Serializer.c<ActionOpenClipMusicGrid> CREATOR = new a();
    public final MusicTrack b;
    public final ClipAudioTemplate c;

    /* compiled from: Serializer.kt */
    public static final class a extends Serializer.c<ActionOpenClipMusicGrid> {
        @Override // com.vk.core.serialize.Serializer.c
        public final ActionOpenClipMusicGrid a(Serializer serializer) {
            Serializer.StreamParcelable G = serializer.G(MusicTrack.class.getClassLoader());
            if (G != null) {
                return new ActionOpenClipMusicGrid((MusicTrack) G, (ClipAudioTemplate) serializer.G(ClipAudioTemplate.class.getClassLoader()));
            }
            throw new IllegalArgumentException("track must not be null");
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new ActionOpenClipMusicGrid[i];
        }
    }

    public ActionOpenClipMusicGrid(MusicTrack musicTrack, ClipAudioTemplate clipAudioTemplate) {
        this.b = musicTrack;
        this.c = clipAudioTemplate;
    }

    @Override // com.vk.core.serialize.Serializer.StreamParcelable
    public final void O7(Serializer serializer) {
        serializer.i0(this.b);
        serializer.i0(this.c);
    }
}
