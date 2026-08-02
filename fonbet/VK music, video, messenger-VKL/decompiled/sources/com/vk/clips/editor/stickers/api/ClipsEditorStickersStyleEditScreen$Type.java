package com.vk.clips.editor.stickers.api;

import xsna.asp;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: ClipsEditorStickersStyleEditScreen.kt */
/* loaded from: classes16.dex */
public final class ClipsEditorStickersStyleEditScreen$Type {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ ClipsEditorStickersStyleEditScreen$Type[] $VALUES;
    public static final ClipsEditorStickersStyleEditScreen$Type HASHTAG;
    public static final ClipsEditorStickersStyleEditScreen$Type MENTION;
    public static final ClipsEditorStickersStyleEditScreen$Type TEXT;

    static {
        ClipsEditorStickersStyleEditScreen$Type clipsEditorStickersStyleEditScreen$Type = new ClipsEditorStickersStyleEditScreen$Type("HASHTAG", 0);
        HASHTAG = clipsEditorStickersStyleEditScreen$Type;
        ClipsEditorStickersStyleEditScreen$Type clipsEditorStickersStyleEditScreen$Type2 = new ClipsEditorStickersStyleEditScreen$Type("MENTION", 1);
        MENTION = clipsEditorStickersStyleEditScreen$Type2;
        ClipsEditorStickersStyleEditScreen$Type clipsEditorStickersStyleEditScreen$Type3 = new ClipsEditorStickersStyleEditScreen$Type("TEXT", 2);
        TEXT = clipsEditorStickersStyleEditScreen$Type3;
        ClipsEditorStickersStyleEditScreen$Type[] clipsEditorStickersStyleEditScreen$TypeArr = {clipsEditorStickersStyleEditScreen$Type, clipsEditorStickersStyleEditScreen$Type2, clipsEditorStickersStyleEditScreen$Type3};
        $VALUES = clipsEditorStickersStyleEditScreen$TypeArr;
        $ENTRIES = new asp(clipsEditorStickersStyleEditScreen$TypeArr);
    }

    public ClipsEditorStickersStyleEditScreen$Type() {
        throw null;
    }

    public static ClipsEditorStickersStyleEditScreen$Type valueOf(String str) {
        return (ClipsEditorStickersStyleEditScreen$Type) Enum.valueOf(ClipsEditorStickersStyleEditScreen$Type.class, str);
    }

    public static ClipsEditorStickersStyleEditScreen$Type[] values() {
        return (ClipsEditorStickersStyleEditScreen$Type[]) $VALUES.clone();
    }
}
