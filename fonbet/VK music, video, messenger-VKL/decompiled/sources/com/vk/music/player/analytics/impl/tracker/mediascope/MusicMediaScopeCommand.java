package com.vk.music.player.analytics.impl.tracker.mediascope;

import xsna.a0a;
import xsna.asp;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: MusicMediaScopeCommand.kt */
/* loaded from: classes3.dex */
public final class MusicMediaScopeCommand {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ MusicMediaScopeCommand[] $VALUES;
    public static final a Companion;
    private static final String MOBILE_ID = "1";
    private static final String MS_HOST = ".ms.";
    public static final MusicMediaScopeCommand PING;
    private static final String PROJECT_ID = "6";
    private static final String RESERVED_ID = "1";
    private static final String SCHEME = "https://";
    public static final MusicMediaScopeCommand START;
    public static final MusicMediaScopeCommand STOP;
    private final int eventId;

    /* compiled from: MusicMediaScopeCommand.kt */
    public static final class a {
    }

    static {
        MusicMediaScopeCommand musicMediaScopeCommand = new MusicMediaScopeCommand("START", 0, 3);
        START = musicMediaScopeCommand;
        MusicMediaScopeCommand musicMediaScopeCommand2 = new MusicMediaScopeCommand("PING", 1, 4);
        PING = musicMediaScopeCommand2;
        MusicMediaScopeCommand musicMediaScopeCommand3 = new MusicMediaScopeCommand("STOP", 2, 5);
        STOP = musicMediaScopeCommand3;
        MusicMediaScopeCommand[] musicMediaScopeCommandArr = {musicMediaScopeCommand, musicMediaScopeCommand2, musicMediaScopeCommand3};
        $VALUES = musicMediaScopeCommandArr;
        $ENTRIES = new asp(musicMediaScopeCommandArr);
        Companion = new a();
    }

    public MusicMediaScopeCommand(String str, int i, int i2) {
        this.eventId = i2;
    }

    public static MusicMediaScopeCommand valueOf(String str) {
        return (MusicMediaScopeCommand) Enum.valueOf(MusicMediaScopeCommand.class, str);
    }

    public static MusicMediaScopeCommand[] values() {
        return (MusicMediaScopeCommand[]) $VALUES.clone();
    }

    public final String a(int i) {
        return "https://6" + this.eventId + 2 + i + "11.ms." + a0a.d;
    }
}
