package com.vk.newsfeed.impl.feedlikes;

import com.vkontakte.android.R;
import java.util.ArrayList;
import xsna.asp;
import xsna.g620;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: FeedLikesFilterView.kt */
/* loaded from: classes4.dex */
public final class FeedLikesFilter {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ FeedLikesFilter[] $VALUES;
    public static final FeedLikesFilter ALL;
    public static final FeedLikesFilter CLIPS;
    public static final FeedLikesFilter COMMENTS;
    public static final a Companion;
    public static final FeedLikesFilter POSTS;
    public static final FeedLikesFilter VIDEOS;
    private final String serverName;
    private final int titleResId;

    /* compiled from: FeedLikesFilterView.kt */
    public static final class a {

        /* compiled from: FeedLikesFilterView.kt */
        /* renamed from: com.vk.newsfeed.impl.feedlikes.FeedLikesFilter$a$a, reason: collision with other inner class name */
        public static final /* synthetic */ class C1380a {
            public static final /* synthetic */ int[] $EnumSwitchMapping$0;

            static {
                int[] iArr = new int[FeedLikesFilter.values().length];
                try {
                    iArr[FeedLikesFilter.CLIPS.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                $EnumSwitchMapping$0 = iArr;
            }
        }

        public static ArrayList a() {
            FeedLikesFilter[] values = FeedLikesFilter.values();
            ArrayList arrayList = new ArrayList();
            for (FeedLikesFilter feedLikesFilter : values) {
                FeedLikesFilter.Companion.getClass();
                if (C1380a.$EnumSwitchMapping$0[feedLikesFilter.ordinal()] == 1 ? g620.f().getExperiments().k() : true) {
                    arrayList.add(feedLikesFilter);
                }
            }
            return arrayList;
        }
    }

    static {
        FeedLikesFilter feedLikesFilter = new FeedLikesFilter("ALL", 0, R.string.feed_reactions_filter_all, null);
        ALL = feedLikesFilter;
        FeedLikesFilter feedLikesFilter2 = new FeedLikesFilter("POSTS", 1, R.string.feed_reactions_filter_post, "post");
        POSTS = feedLikesFilter2;
        FeedLikesFilter feedLikesFilter3 = new FeedLikesFilter("COMMENTS", 2, R.string.feed_reactions_filter_comment, "comment");
        COMMENTS = feedLikesFilter3;
        FeedLikesFilter feedLikesFilter4 = new FeedLikesFilter("CLIPS", 3, R.string.feed_reactions_filter_clips, "clip");
        CLIPS = feedLikesFilter4;
        FeedLikesFilter feedLikesFilter5 = new FeedLikesFilter("VIDEOS", 4, R.string.feed_reactions_filter_video, "video");
        VIDEOS = feedLikesFilter5;
        FeedLikesFilter[] feedLikesFilterArr = {feedLikesFilter, feedLikesFilter2, feedLikesFilter3, feedLikesFilter4, feedLikesFilter5};
        $VALUES = feedLikesFilterArr;
        $ENTRIES = new asp(feedLikesFilterArr);
        Companion = new a();
    }

    public FeedLikesFilter(String str, int i, int i2, String str2) {
        this.titleResId = i2;
        this.serverName = str2;
    }

    public static zrp<FeedLikesFilter> h() {
        return $ENTRIES;
    }

    public static FeedLikesFilter valueOf(String str) {
        return (FeedLikesFilter) Enum.valueOf(FeedLikesFilter.class, str);
    }

    public static FeedLikesFilter[] values() {
        return (FeedLikesFilter[]) $VALUES.clone();
    }

    public final String i() {
        return this.serverName;
    }

    public final int j() {
        return this.titleResId;
    }
}
