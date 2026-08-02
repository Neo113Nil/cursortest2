package com.vk.music.snippet.api.player;

import xsna.asp;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: SnippetPlayerMode.kt */
/* loaded from: classes3.dex */
public final class SnippetPlayerMode {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ SnippetPlayerMode[] $VALUES;
    public static final SnippetPlayerMode LONGTAP;
    public static final SnippetPlayerMode SNIPPET;

    static {
        SnippetPlayerMode snippetPlayerMode = new SnippetPlayerMode("LONGTAP", 0);
        LONGTAP = snippetPlayerMode;
        SnippetPlayerMode snippetPlayerMode2 = new SnippetPlayerMode("SNIPPET", 1);
        SNIPPET = snippetPlayerMode2;
        SnippetPlayerMode[] snippetPlayerModeArr = {snippetPlayerMode, snippetPlayerMode2};
        $VALUES = snippetPlayerModeArr;
        $ENTRIES = new asp(snippetPlayerModeArr);
    }

    public SnippetPlayerMode() {
        throw null;
    }

    public static SnippetPlayerMode valueOf(String str) {
        return (SnippetPlayerMode) Enum.valueOf(SnippetPlayerMode.class, str);
    }

    public static SnippetPlayerMode[] values() {
        return (SnippetPlayerMode[]) $VALUES.clone();
    }
}
