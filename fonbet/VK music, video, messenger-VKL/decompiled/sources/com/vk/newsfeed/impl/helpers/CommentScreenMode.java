package com.vk.newsfeed.impl.helpers;

import xsna.asp;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: CommentScreenModeProviderImpl.kt */
/* loaded from: classes4.dex */
public final class CommentScreenMode {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ CommentScreenMode[] $VALUES;
    public static final CommentScreenMode DISCOVERY;
    public static final CommentScreenMode FULLSCREEN_LANDSCAPE;
    public static final CommentScreenMode FULLSCREEN_PORTRAIT;
    private final String screenModeName;

    static {
        CommentScreenMode commentScreenMode = new CommentScreenMode("DISCOVERY", 0, "discovery");
        DISCOVERY = commentScreenMode;
        CommentScreenMode commentScreenMode2 = new CommentScreenMode("FULLSCREEN_LANDSCAPE", 1, "fullscreen_landscape");
        FULLSCREEN_LANDSCAPE = commentScreenMode2;
        CommentScreenMode commentScreenMode3 = new CommentScreenMode("FULLSCREEN_PORTRAIT", 2, "fullscreen_portrait");
        FULLSCREEN_PORTRAIT = commentScreenMode3;
        CommentScreenMode[] commentScreenModeArr = {commentScreenMode, commentScreenMode2, commentScreenMode3};
        $VALUES = commentScreenModeArr;
        $ENTRIES = new asp(commentScreenModeArr);
    }

    public CommentScreenMode(String str, int i, String str2) {
        this.screenModeName = str2;
    }

    public static CommentScreenMode valueOf(String str) {
        return (CommentScreenMode) Enum.valueOf(CommentScreenMode.class, str);
    }

    public static CommentScreenMode[] values() {
        return (CommentScreenMode[]) $VALUES.clone();
    }

    public final String h() {
        return this.screenModeName;
    }
}
