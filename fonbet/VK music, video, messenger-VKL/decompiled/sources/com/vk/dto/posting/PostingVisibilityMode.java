package com.vk.dto.posting;

import ru.ok.android.webrtc.Privacy;
import xsna.asp;
import xsna.lhg;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: PostingVisibilityMode.kt */
/* loaded from: classes18.dex */
public final class PostingVisibilityMode {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ PostingVisibilityMode[] $VALUES;
    public static final PostingVisibilityMode ALL;
    public static final PostingVisibilityMode BEST_FRIENDS;
    public static final a Companion;
    public static final PostingVisibilityMode FRIENDS;
    public static final PostingVisibilityMode LISTS_FRIENDS;
    public static final PostingVisibilityMode ONLY_ME;
    public static final PostingVisibilityMode UNAVAILABLE_FRIENDS;
    public static final PostingVisibilityMode UNAVAILABLE_FRIENDS_AND_FRIENDS_LISTS;
    public static final PostingVisibilityMode UNAVAILABLE_FRIENDS_AND_FRIENDS_OF_FRIENDS;
    private final int id;

    /* compiled from: PostingVisibilityMode.kt */
    public static final class a {
        public static PostingVisibilityMode a(int i) {
            PostingVisibilityMode postingVisibilityMode;
            PostingVisibilityMode[] values = PostingVisibilityMode.values();
            int length = values.length;
            int i2 = 0;
            while (true) {
                if (i2 >= length) {
                    postingVisibilityMode = null;
                    break;
                }
                postingVisibilityMode = values[i2];
                if (postingVisibilityMode.h() == i) {
                    break;
                }
                i2++;
            }
            if (postingVisibilityMode != null) {
                return postingVisibilityMode;
            }
            throw new IllegalArgumentException(lhg.a(i, "unknown id: "));
        }
    }

    static {
        PostingVisibilityMode postingVisibilityMode = new PostingVisibilityMode("ALL", 0, 0);
        ALL = postingVisibilityMode;
        PostingVisibilityMode postingVisibilityMode2 = new PostingVisibilityMode(Privacy.FRIENDS, 1, 1);
        FRIENDS = postingVisibilityMode2;
        PostingVisibilityMode postingVisibilityMode3 = new PostingVisibilityMode("BEST_FRIENDS", 2, 2);
        BEST_FRIENDS = postingVisibilityMode3;
        PostingVisibilityMode postingVisibilityMode4 = new PostingVisibilityMode("ONLY_ME", 3, 3);
        ONLY_ME = postingVisibilityMode4;
        PostingVisibilityMode postingVisibilityMode5 = new PostingVisibilityMode("LISTS_FRIENDS", 4, 4);
        LISTS_FRIENDS = postingVisibilityMode5;
        PostingVisibilityMode postingVisibilityMode6 = new PostingVisibilityMode("UNAVAILABLE_FRIENDS_AND_FRIENDS_OF_FRIENDS", 5, 5);
        UNAVAILABLE_FRIENDS_AND_FRIENDS_OF_FRIENDS = postingVisibilityMode6;
        PostingVisibilityMode postingVisibilityMode7 = new PostingVisibilityMode("UNAVAILABLE_FRIENDS", 6, 6);
        UNAVAILABLE_FRIENDS = postingVisibilityMode7;
        PostingVisibilityMode postingVisibilityMode8 = new PostingVisibilityMode("UNAVAILABLE_FRIENDS_AND_FRIENDS_LISTS", 7, 7);
        UNAVAILABLE_FRIENDS_AND_FRIENDS_LISTS = postingVisibilityMode8;
        PostingVisibilityMode[] postingVisibilityModeArr = {postingVisibilityMode, postingVisibilityMode2, postingVisibilityMode3, postingVisibilityMode4, postingVisibilityMode5, postingVisibilityMode6, postingVisibilityMode7, postingVisibilityMode8};
        $VALUES = postingVisibilityModeArr;
        $ENTRIES = new asp(postingVisibilityModeArr);
        Companion = new a();
    }

    public PostingVisibilityMode(String str, int i, int i2) {
        this.id = i2;
    }

    public static PostingVisibilityMode valueOf(String str) {
        return (PostingVisibilityMode) Enum.valueOf(PostingVisibilityMode.class, str);
    }

    public static PostingVisibilityMode[] values() {
        return (PostingVisibilityMode[]) $VALUES.clone();
    }

    public final int h() {
        return this.id;
    }
}
