package com.vk.feed.design.compose.posting.preview.spinner;

import xsna.asp;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: PostingVkSpinnerDefault.kt */
/* loaded from: classes18.dex */
public final class PostingSpinnerState {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ PostingSpinnerState[] $VALUES;
    public static final PostingSpinnerState Done;
    public static final PostingSpinnerState Error;
    public static final PostingSpinnerState Loading;

    static {
        PostingSpinnerState postingSpinnerState = new PostingSpinnerState("Error", 0);
        Error = postingSpinnerState;
        PostingSpinnerState postingSpinnerState2 = new PostingSpinnerState("Loading", 1);
        Loading = postingSpinnerState2;
        PostingSpinnerState postingSpinnerState3 = new PostingSpinnerState("Done", 2);
        Done = postingSpinnerState3;
        PostingSpinnerState[] postingSpinnerStateArr = {postingSpinnerState, postingSpinnerState2, postingSpinnerState3};
        $VALUES = postingSpinnerStateArr;
        $ENTRIES = new asp(postingSpinnerStateArr);
    }

    public PostingSpinnerState() {
        throw null;
    }

    public static PostingSpinnerState valueOf(String str) {
        return (PostingSpinnerState) Enum.valueOf(PostingSpinnerState.class, str);
    }

    public static PostingSpinnerState[] values() {
        return (PostingSpinnerState[]) $VALUES.clone();
    }
}
