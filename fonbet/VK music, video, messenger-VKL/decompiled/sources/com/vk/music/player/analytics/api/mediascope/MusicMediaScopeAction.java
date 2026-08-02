package com.vk.music.player.analytics.api.mediascope;

import xsna.asp;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: MusicMediaScopeAction.kt */
/* loaded from: classes3.dex */
public final class MusicMediaScopeAction {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ MusicMediaScopeAction[] $VALUES;
    public static final MusicMediaScopeAction PLAYER;
    public static final MusicMediaScopeAction SECTION;
    private final int id;

    static {
        MusicMediaScopeAction musicMediaScopeAction = new MusicMediaScopeAction("PLAYER", 0, 1);
        PLAYER = musicMediaScopeAction;
        MusicMediaScopeAction musicMediaScopeAction2 = new MusicMediaScopeAction("SECTION", 1, 2);
        SECTION = musicMediaScopeAction2;
        MusicMediaScopeAction[] musicMediaScopeActionArr = {musicMediaScopeAction, musicMediaScopeAction2};
        $VALUES = musicMediaScopeActionArr;
        $ENTRIES = new asp(musicMediaScopeActionArr);
    }

    public MusicMediaScopeAction(String str, int i, int i2) {
        this.id = i2;
    }

    public static MusicMediaScopeAction valueOf(String str) {
        return (MusicMediaScopeAction) Enum.valueOf(MusicMediaScopeAction.class, str);
    }

    public static MusicMediaScopeAction[] values() {
        return (MusicMediaScopeAction[]) $VALUES.clone();
    }

    public final int h() {
        return this.id;
    }
}
