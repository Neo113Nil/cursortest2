package com.vk.newsfeed.posting.music_picker.domain.model;

import xsna.asp;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: MusicPickerState.kt */
/* loaded from: classes4.dex */
public final class SnippetOnboardingState {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ SnippetOnboardingState[] $VALUES;
    public static final SnippetOnboardingState BOTTOM_SHEET;
    public static final SnippetOnboardingState PENDING_TOOLTIP;
    public static final SnippetOnboardingState TOOLTIP;
    public static final SnippetOnboardingState UNAVAILABLE;

    static {
        SnippetOnboardingState snippetOnboardingState = new SnippetOnboardingState("UNAVAILABLE", 0);
        UNAVAILABLE = snippetOnboardingState;
        SnippetOnboardingState snippetOnboardingState2 = new SnippetOnboardingState("BOTTOM_SHEET", 1);
        BOTTOM_SHEET = snippetOnboardingState2;
        SnippetOnboardingState snippetOnboardingState3 = new SnippetOnboardingState("PENDING_TOOLTIP", 2);
        PENDING_TOOLTIP = snippetOnboardingState3;
        SnippetOnboardingState snippetOnboardingState4 = new SnippetOnboardingState("TOOLTIP", 3);
        TOOLTIP = snippetOnboardingState4;
        SnippetOnboardingState[] snippetOnboardingStateArr = {snippetOnboardingState, snippetOnboardingState2, snippetOnboardingState3, snippetOnboardingState4};
        $VALUES = snippetOnboardingStateArr;
        $ENTRIES = new asp(snippetOnboardingStateArr);
    }

    public SnippetOnboardingState() {
        throw null;
    }

    public static SnippetOnboardingState valueOf(String str) {
        return (SnippetOnboardingState) Enum.valueOf(SnippetOnboardingState.class, str);
    }

    public static SnippetOnboardingState[] values() {
        return (SnippetOnboardingState[]) $VALUES.clone();
    }
}
