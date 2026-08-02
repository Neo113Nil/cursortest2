package com.vk.video.playlist.playlistscreen.ui.entity;

import xsna.asp;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: PlaylistScreenViewState.kt */
/* loaded from: classes6.dex */
public final class NotificationsState {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ NotificationsState[] $VALUES;
    public static final NotificationsState ERROR;

    static {
        NotificationsState notificationsState = new NotificationsState("ERROR", 0);
        ERROR = notificationsState;
        NotificationsState[] notificationsStateArr = {notificationsState};
        $VALUES = notificationsStateArr;
        $ENTRIES = new asp(notificationsStateArr);
    }

    public NotificationsState() {
        throw null;
    }

    public static NotificationsState valueOf(String str) {
        return (NotificationsState) Enum.valueOf(NotificationsState.class, str);
    }

    public static NotificationsState[] values() {
        return (NotificationsState[]) $VALUES.clone();
    }
}
