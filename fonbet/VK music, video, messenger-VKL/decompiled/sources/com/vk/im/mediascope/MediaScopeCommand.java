package com.vk.im.mediascope;

import xsna.asp;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: MediaScopeCommand.kt */
/* loaded from: classes2.dex */
public final class MediaScopeCommand {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ MediaScopeCommand[] $VALUES;
    public static final MediaScopeCommand PING;
    public static final MediaScopeCommand START;
    public static final MediaScopeCommand STOP;

    static {
        MediaScopeCommand mediaScopeCommand = new MediaScopeCommand("START", 0);
        START = mediaScopeCommand;
        MediaScopeCommand mediaScopeCommand2 = new MediaScopeCommand("STOP", 1);
        STOP = mediaScopeCommand2;
        MediaScopeCommand mediaScopeCommand3 = new MediaScopeCommand("PING", 2);
        PING = mediaScopeCommand3;
        MediaScopeCommand[] mediaScopeCommandArr = {mediaScopeCommand, mediaScopeCommand2, mediaScopeCommand3};
        $VALUES = mediaScopeCommandArr;
        $ENTRIES = new asp(mediaScopeCommandArr);
    }

    public MediaScopeCommand() {
        throw null;
    }

    public static MediaScopeCommand valueOf(String str) {
        return (MediaScopeCommand) Enum.valueOf(MediaScopeCommand.class, str);
    }

    public static MediaScopeCommand[] values() {
        return (MediaScopeCommand[]) $VALUES.clone();
    }
}
