package com.vk.clips.viewer.impl.feed.view.list.item.controls.side.shares.fast.config;

import ru.ok.android.webrtc.Privacy;
import xsna.asp;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: ClipsFastShareConfig.kt */
/* loaded from: classes17.dex */
public final class ClipsFastShareConfig$Strategy {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ ClipsFastShareConfig$Strategy[] $VALUES;
    public static final ClipsFastShareConfig$Strategy CHATS;
    public static final ClipsFastShareConfig$Strategy FRIENDS;
    private final String key;

    static {
        ClipsFastShareConfig$Strategy clipsFastShareConfig$Strategy = new ClipsFastShareConfig$Strategy(Privacy.FRIENDS, 0, "friends");
        FRIENDS = clipsFastShareConfig$Strategy;
        ClipsFastShareConfig$Strategy clipsFastShareConfig$Strategy2 = new ClipsFastShareConfig$Strategy("CHATS", 1, "chats");
        CHATS = clipsFastShareConfig$Strategy2;
        ClipsFastShareConfig$Strategy[] clipsFastShareConfig$StrategyArr = {clipsFastShareConfig$Strategy, clipsFastShareConfig$Strategy2};
        $VALUES = clipsFastShareConfig$StrategyArr;
        $ENTRIES = new asp(clipsFastShareConfig$StrategyArr);
    }

    public ClipsFastShareConfig$Strategy(String str, int i, String str2) {
        this.key = str2;
    }

    public static ClipsFastShareConfig$Strategy valueOf(String str) {
        return (ClipsFastShareConfig$Strategy) Enum.valueOf(ClipsFastShareConfig$Strategy.class, str);
    }

    public static ClipsFastShareConfig$Strategy[] values() {
        return (ClipsFastShareConfig$Strategy[]) $VALUES.clone();
    }
}
