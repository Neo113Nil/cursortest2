package com.vk.newsfeed.api.posting.dto;

import ru.ok.android.webrtc.signaling.api.SignalingProtocol;
import xsna.asp;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: PostingPrimaryMode.kt */
/* loaded from: classes3.dex */
public final class PostingPrimaryMode {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ PostingPrimaryMode[] $VALUES;
    public static final PostingPrimaryMode CAROUSEL;
    public static final PostingPrimaryMode GRID;
    private final String value;

    static {
        PostingPrimaryMode postingPrimaryMode = new PostingPrimaryMode("CAROUSEL", 0, "carousel");
        CAROUSEL = postingPrimaryMode;
        PostingPrimaryMode postingPrimaryMode2 = new PostingPrimaryMode(SignalingProtocol.KEY_GRID, 1, "grid");
        GRID = postingPrimaryMode2;
        PostingPrimaryMode[] postingPrimaryModeArr = {postingPrimaryMode, postingPrimaryMode2};
        $VALUES = postingPrimaryModeArr;
        $ENTRIES = new asp(postingPrimaryModeArr);
    }

    public PostingPrimaryMode(String str, int i, String str2) {
        this.value = str2;
    }

    public static zrp<PostingPrimaryMode> h() {
        return $ENTRIES;
    }

    public static PostingPrimaryMode valueOf(String str) {
        return (PostingPrimaryMode) Enum.valueOf(PostingPrimaryMode.class, str);
    }

    public static PostingPrimaryMode[] values() {
        return (PostingPrimaryMode[]) $VALUES.clone();
    }

    public final String i() {
        return this.value;
    }
}
