package com.vk.stories.design.view.stats.tabs;

import com.vkontakte.android.R;
import java.util.Iterator;
import java.util.List;
import xsna.asp;
import xsna.e43;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: StoryStatisticsTab.kt */
/* loaded from: classes6.dex */
public final class StoryStatisticsTab {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ StoryStatisticsTab[] $VALUES;
    private static final List<Integer> ALL_POSITIONS;
    public static final a Companion;
    public static final StoryStatisticsTab INFO;
    private static final StoryStatisticsTab INITIAL;
    public static final StoryStatisticsTab STICKERS;
    public static final StoryStatisticsTab VIEWERS;
    private final int descriptionRes;
    private final int iconRes;
    private final int position;

    /* compiled from: StoryStatisticsTab.kt */
    public static final class a {
        public static StoryStatisticsTab a(int i) {
            Object obj;
            Iterator<E> it = StoryStatisticsTab.k().iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj = null;
                    break;
                }
                obj = it.next();
                if (((StoryStatisticsTab) obj).m() == i) {
                    break;
                }
            }
            return (StoryStatisticsTab) obj;
        }
    }

    static {
        StoryStatisticsTab storyStatisticsTab = new StoryStatisticsTab("INFO", 0, 1, R.drawable.vk_icon_graph_outline_24, R.string.story_statistics_tab_info);
        INFO = storyStatisticsTab;
        StoryStatisticsTab storyStatisticsTab2 = new StoryStatisticsTab("VIEWERS", 1, 0, R.drawable.vk_icon_view_outline_24, R.string.story_statistics_tab_viewers);
        VIEWERS = storyStatisticsTab2;
        StoryStatisticsTab storyStatisticsTab3 = new StoryStatisticsTab("STICKERS", 2, 2, R.drawable.vk_icon_sticker_outline_24, R.string.story_statistics_tab_stickers);
        STICKERS = storyStatisticsTab3;
        StoryStatisticsTab[] storyStatisticsTabArr = {storyStatisticsTab, storyStatisticsTab2, storyStatisticsTab3};
        $VALUES = storyStatisticsTabArr;
        $ENTRIES = new asp(storyStatisticsTabArr);
        Companion = new a();
        INITIAL = storyStatisticsTab2;
        ALL_POSITIONS = e43.l(0, 1, 2);
    }

    public StoryStatisticsTab(String str, int i, int i2, int i3, int i4) {
        this.position = i2;
        this.iconRes = i3;
        this.descriptionRes = i4;
    }

    public static zrp<StoryStatisticsTab> k() {
        return $ENTRIES;
    }

    public static StoryStatisticsTab valueOf(String str) {
        return (StoryStatisticsTab) Enum.valueOf(StoryStatisticsTab.class, str);
    }

    public static StoryStatisticsTab[] values() {
        return (StoryStatisticsTab[]) $VALUES.clone();
    }

    public final int j() {
        return this.descriptionRes;
    }

    public final int l() {
        return this.iconRes;
    }

    public final int m() {
        return this.position;
    }
}
