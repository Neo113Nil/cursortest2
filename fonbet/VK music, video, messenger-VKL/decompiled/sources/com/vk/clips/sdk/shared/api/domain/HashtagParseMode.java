package com.vk.clips.sdk.shared.api.domain;

import xsna.asp;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: HashtagParseMode.kt */
/* loaded from: classes17.dex */
public final class HashtagParseMode {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ HashtagParseMode[] $VALUES;
    public static final HashtagParseMode CLIPS;
    public static final HashtagParseMode DEFAULT;
    public static final HashtagParseMode NONE;

    static {
        HashtagParseMode hashtagParseMode = new HashtagParseMode("CLIPS", 0);
        CLIPS = hashtagParseMode;
        HashtagParseMode hashtagParseMode2 = new HashtagParseMode("DEFAULT", 1);
        DEFAULT = hashtagParseMode2;
        HashtagParseMode hashtagParseMode3 = new HashtagParseMode("NONE", 2);
        NONE = hashtagParseMode3;
        HashtagParseMode[] hashtagParseModeArr = {hashtagParseMode, hashtagParseMode2, hashtagParseMode3};
        $VALUES = hashtagParseModeArr;
        $ENTRIES = new asp(hashtagParseModeArr);
    }

    public HashtagParseMode() {
        throw null;
    }

    public static HashtagParseMode valueOf(String str) {
        return (HashtagParseMode) Enum.valueOf(HashtagParseMode.class, str);
    }

    public static HashtagParseMode[] values() {
        return (HashtagParseMode[]) $VALUES.clone();
    }
}
