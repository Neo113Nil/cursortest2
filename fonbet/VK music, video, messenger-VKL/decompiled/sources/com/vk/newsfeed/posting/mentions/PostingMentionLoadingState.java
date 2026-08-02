package com.vk.newsfeed.posting.mentions;

import xsna.asp;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: PostingMentionState.kt */
/* loaded from: classes4.dex */
public final class PostingMentionLoadingState {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ PostingMentionLoadingState[] $VALUES;
    public static final PostingMentionLoadingState EMPTY;
    public static final PostingMentionLoadingState ERROR;
    public static final PostingMentionLoadingState LOADED_BY_ID;
    public static final PostingMentionLoadingState LOADED_BY_QUERY;
    public static final PostingMentionLoadingState LOADING;

    static {
        PostingMentionLoadingState postingMentionLoadingState = new PostingMentionLoadingState("LOADING", 0);
        LOADING = postingMentionLoadingState;
        PostingMentionLoadingState postingMentionLoadingState2 = new PostingMentionLoadingState("LOADED_BY_ID", 1);
        LOADED_BY_ID = postingMentionLoadingState2;
        PostingMentionLoadingState postingMentionLoadingState3 = new PostingMentionLoadingState("LOADED_BY_QUERY", 2);
        LOADED_BY_QUERY = postingMentionLoadingState3;
        PostingMentionLoadingState postingMentionLoadingState4 = new PostingMentionLoadingState("EMPTY", 3);
        EMPTY = postingMentionLoadingState4;
        PostingMentionLoadingState postingMentionLoadingState5 = new PostingMentionLoadingState("ERROR", 4);
        ERROR = postingMentionLoadingState5;
        PostingMentionLoadingState[] postingMentionLoadingStateArr = {postingMentionLoadingState, postingMentionLoadingState2, postingMentionLoadingState3, postingMentionLoadingState4, postingMentionLoadingState5};
        $VALUES = postingMentionLoadingStateArr;
        $ENTRIES = new asp(postingMentionLoadingStateArr);
    }

    public PostingMentionLoadingState() {
        throw null;
    }

    public static PostingMentionLoadingState valueOf(String str) {
        return (PostingMentionLoadingState) Enum.valueOf(PostingMentionLoadingState.class, str);
    }

    public static PostingMentionLoadingState[] values() {
        return (PostingMentionLoadingState[]) $VALUES.clone();
    }
}
