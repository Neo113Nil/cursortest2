package com.vk.music.playlist.api.di;

import android.content.Context;
import com.vk.di.component.DiUnscopedComponent;
import com.vk.dto.common.id.UserId;

/* compiled from: MusicClickByPlaylistItemHandlerComponent.kt */
/* loaded from: classes3.dex */
public interface MusicClickByPlaylistItemHandlerComponent extends DiUnscopedComponent {
    public static final Companion Companion = Companion.a;

    /* compiled from: MusicClickByPlaylistItemHandlerComponent.kt */
    public static final class Companion {
        public static final /* synthetic */ Companion a = new Companion();
        private static final MusicClickByPlaylistItemHandlerComponent$Companion$STUB$1 STUB = new MusicClickByPlaylistItemHandlerComponent() { // from class: com.vk.music.playlist.api.di.MusicClickByPlaylistItemHandlerComponent$Companion$STUB$1
            @Override // com.vk.music.playlist.api.di.MusicClickByPlaylistItemHandlerComponent
            public final void o8(Context context, UserId userId) {
            }
        };
    }

    void o8(Context context, UserId userId);
}
