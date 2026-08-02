package com.vk.music.snippet.ui.presentation.base.view;

import ru.ok.android.webrtc.signaling.api.SignalingProtocol;
import xsna.asp;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: SnippetTrackItemView.kt */
/* loaded from: classes3.dex */
public final class SnippetTrackItemView$Companion$ButtonAddAction {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ SnippetTrackItemView$Companion$ButtonAddAction[] $VALUES;
    public static final SnippetTrackItemView$Companion$ButtonAddAction ADD;
    public static final SnippetTrackItemView$Companion$ButtonAddAction REMOVE;

    static {
        SnippetTrackItemView$Companion$ButtonAddAction snippetTrackItemView$Companion$ButtonAddAction = new SnippetTrackItemView$Companion$ButtonAddAction("ADD", 0);
        ADD = snippetTrackItemView$Companion$ButtonAddAction;
        SnippetTrackItemView$Companion$ButtonAddAction snippetTrackItemView$Companion$ButtonAddAction2 = new SnippetTrackItemView$Companion$ButtonAddAction(SignalingProtocol.KEY_ROOMS_EVENT_TYPE_REMOVE, 1);
        REMOVE = snippetTrackItemView$Companion$ButtonAddAction2;
        SnippetTrackItemView$Companion$ButtonAddAction[] snippetTrackItemView$Companion$ButtonAddActionArr = {snippetTrackItemView$Companion$ButtonAddAction, snippetTrackItemView$Companion$ButtonAddAction2};
        $VALUES = snippetTrackItemView$Companion$ButtonAddActionArr;
        $ENTRIES = new asp(snippetTrackItemView$Companion$ButtonAddActionArr);
    }

    public SnippetTrackItemView$Companion$ButtonAddAction() {
        throw null;
    }

    public static SnippetTrackItemView$Companion$ButtonAddAction valueOf(String str) {
        return (SnippetTrackItemView$Companion$ButtonAddAction) Enum.valueOf(SnippetTrackItemView$Companion$ButtonAddAction.class, str);
    }

    public static SnippetTrackItemView$Companion$ButtonAddAction[] values() {
        return (SnippetTrackItemView$Companion$ButtonAddAction[]) $VALUES.clone();
    }
}
