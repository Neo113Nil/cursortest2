package com.vk.clips.sdk.shared.api.domain;

import xsna.asp;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: MentionsParseMode.kt */
/* loaded from: classes17.dex */
public final class MentionsParseMode {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ MentionsParseMode[] $VALUES;
    public static final MentionsParseMode CLIPS;
    public static final MentionsParseMode DEFAULT;
    public static final MentionsParseMode NONE;

    static {
        MentionsParseMode mentionsParseMode = new MentionsParseMode("CLIPS", 0);
        CLIPS = mentionsParseMode;
        MentionsParseMode mentionsParseMode2 = new MentionsParseMode("DEFAULT", 1);
        DEFAULT = mentionsParseMode2;
        MentionsParseMode mentionsParseMode3 = new MentionsParseMode("NONE", 2);
        NONE = mentionsParseMode3;
        MentionsParseMode[] mentionsParseModeArr = {mentionsParseMode, mentionsParseMode2, mentionsParseMode3};
        $VALUES = mentionsParseModeArr;
        $ENTRIES = new asp(mentionsParseModeArr);
    }

    public MentionsParseMode() {
        throw null;
    }

    public static MentionsParseMode valueOf(String str) {
        return (MentionsParseMode) Enum.valueOf(MentionsParseMode.class, str);
    }

    public static MentionsParseMode[] values() {
        return (MentionsParseMode[]) $VALUES.clone();
    }
}
