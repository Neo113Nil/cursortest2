package com.vk.music.offline.api.exception;

import com.vk.dto.common.id.UserId;

/* compiled from: OfflinePlaylistNotFoundException.kt */
/* loaded from: classes3.dex */
public final class OfflinePlaylistNotFoundException extends RuntimeException {
    private final UserId ownerId;
    private final int playlistId;

    public OfflinePlaylistNotFoundException(int i, UserId userId) {
        super("Playlist " + userId + '_' + i + " not found in offline storage!");
        this.playlistId = i;
        this.ownerId = userId;
    }
}
