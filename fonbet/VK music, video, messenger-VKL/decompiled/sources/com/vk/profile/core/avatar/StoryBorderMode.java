package com.vk.profile.core.avatar;

import com.vk.dto.stories.model.LiveFinishedStoriesContainer;
import com.vk.dto.stories.model.StoriesContainer;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import kotlin.Pair;
import xsna.asp;
import xsna.fsk;
import xsna.j5g;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: StoryBorderMode.kt */
/* loaded from: classes5.dex */
public final class StoryBorderMode {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ StoryBorderMode[] $VALUES;
    public static final a Companion;
    public static final StoryBorderMode FINISHED_LIVE;
    public static final StoryBorderMode FINISHED_LIVE_SEEN;
    public static final StoryBorderMode LIVE;
    public static final StoryBorderMode NONE;
    public static final StoryBorderMode STORY_NEW;
    public static final StoryBorderMode STORY_SEEN;
    public static final StoryBorderMode UPLOAD_ERROR;

    /* compiled from: StoryBorderMode.kt */
    public static final class a {
        public static Pair a(int i, List list) {
            int i2 = 0;
            boolean z = i > 0;
            if (list != null) {
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    i2 += ((StoriesContainer) it.next()).Gb().size();
                }
            }
            Object obj = null;
            if (list == null) {
                return new Pair(StoryBorderMode.NONE, null);
            }
            if (i2 > i) {
                StoryBorderMode storyBorderMode = StoryBorderMode.STORY_NEW;
                ListIterator listIterator = list.listIterator(list.size());
                while (true) {
                    if (!listIterator.hasPrevious()) {
                        break;
                    }
                    Object previous = listIterator.previous();
                    if (!((StoriesContainer) previous).Gb().isEmpty()) {
                        obj = previous;
                        break;
                    }
                }
                return new Pair(storyBorderMode, obj);
            }
            if (z) {
                StoryBorderMode storyBorderMode2 = StoryBorderMode.UPLOAD_ERROR;
                Iterator it2 = list.iterator();
                while (true) {
                    if (!it2.hasNext()) {
                        break;
                    }
                    Object next = it2.next();
                    if (((StoriesContainer) next).Cb()) {
                        obj = next;
                        break;
                    }
                }
                return new Pair(storyBorderMode2, obj);
            }
            List<StoriesContainer> list2 = list;
            boolean z2 = list2 instanceof Collection;
            if (!z2 || !list2.isEmpty()) {
                Iterator it3 = list2.iterator();
                while (it3.hasNext()) {
                    if (!((StoriesContainer) it3.next()).Gb().isEmpty()) {
                        StoryBorderMode storyBorderMode3 = StoryBorderMode.STORY_NEW;
                        ListIterator listIterator2 = list.listIterator(list.size());
                        while (true) {
                            if (!listIterator2.hasPrevious()) {
                                break;
                            }
                            Object previous2 = listIterator2.previous();
                            if (!((StoriesContainer) previous2).Gb().isEmpty()) {
                                obj = previous2;
                                break;
                            }
                        }
                        return new Pair(storyBorderMode3, obj);
                    }
                }
            }
            if (!z2 || !list2.isEmpty()) {
                Iterator it4 = list2.iterator();
                while (it4.hasNext()) {
                    if (((StoriesContainer) it4.next()).Eb()) {
                        if (!z2 || !list2.isEmpty()) {
                            Iterator it5 = list2.iterator();
                            while (it5.hasNext()) {
                                if (fsk.A((StoriesContainer) it5.next())) {
                                    StoryBorderMode storyBorderMode4 = StoryBorderMode.LIVE;
                                    Iterator it6 = list2.iterator();
                                    while (true) {
                                        if (!it6.hasNext()) {
                                            break;
                                        }
                                        Object next2 = it6.next();
                                        if (fsk.A((StoriesContainer) next2)) {
                                            obj = next2;
                                            break;
                                        }
                                    }
                                    return new Pair(storyBorderMode4, obj);
                                }
                            }
                        }
                        if (!z2 || !list2.isEmpty()) {
                            for (StoriesContainer storiesContainer : list2) {
                                if ((storiesContainer instanceof LiveFinishedStoriesContainer) && storiesContainer.Cb()) {
                                    StoryBorderMode storyBorderMode5 = StoryBorderMode.FINISHED_LIVE;
                                    Iterator it7 = list2.iterator();
                                    while (true) {
                                        if (!it7.hasNext()) {
                                            break;
                                        }
                                        Object next3 = it7.next();
                                        StoriesContainer storiesContainer2 = (StoriesContainer) next3;
                                        if ((storiesContainer2 instanceof LiveFinishedStoriesContainer) && storiesContainer2.Cb()) {
                                            obj = next3;
                                            break;
                                        }
                                    }
                                    return new Pair(storyBorderMode5, obj);
                                }
                            }
                        }
                        if (!z2 || !list2.isEmpty()) {
                            Iterator it8 = list2.iterator();
                            while (it8.hasNext()) {
                                if (((StoriesContainer) it8.next()) instanceof LiveFinishedStoriesContainer) {
                                    StoryBorderMode storyBorderMode6 = StoryBorderMode.FINISHED_LIVE_SEEN;
                                    Iterator it9 = list2.iterator();
                                    while (true) {
                                        if (!it9.hasNext()) {
                                            break;
                                        }
                                        Object next4 = it9.next();
                                        if (((StoriesContainer) next4) instanceof LiveFinishedStoriesContainer) {
                                            obj = next4;
                                            break;
                                        }
                                    }
                                    return new Pair(storyBorderMode6, obj);
                                }
                            }
                        }
                        if (!z2 || !list2.isEmpty()) {
                            Iterator it10 = list2.iterator();
                            while (it10.hasNext()) {
                                if (((StoriesContainer) it10.next()).Cb()) {
                                    StoryBorderMode storyBorderMode7 = StoryBorderMode.STORY_NEW;
                                    Iterator it11 = list2.iterator();
                                    while (true) {
                                        if (!it11.hasNext()) {
                                            break;
                                        }
                                        Object next5 = it11.next();
                                        if (((StoriesContainer) next5).Cb()) {
                                            obj = next5;
                                            break;
                                        }
                                    }
                                    return new Pair(storyBorderMode7, obj);
                                }
                            }
                        }
                        if (!z2 || !list2.isEmpty()) {
                            Iterator it12 = list2.iterator();
                            while (it12.hasNext()) {
                                if (((StoriesContainer) it12.next()).Cb()) {
                                    return new Pair(StoryBorderMode.NONE, j5g.a0(list));
                                }
                            }
                        }
                        StoryBorderMode storyBorderMode8 = StoryBorderMode.STORY_SEEN;
                        Iterator it13 = list2.iterator();
                        while (true) {
                            if (!it13.hasNext()) {
                                break;
                            }
                            Object next6 = it13.next();
                            if (!((StoriesContainer) next6).Cb()) {
                                obj = next6;
                                break;
                            }
                        }
                        return new Pair(storyBorderMode8, obj);
                    }
                }
            }
            return new Pair(StoryBorderMode.NONE, j5g.a0(list));
        }
    }

    static {
        StoryBorderMode storyBorderMode = new StoryBorderMode("UPLOAD_ERROR", 0);
        UPLOAD_ERROR = storyBorderMode;
        StoryBorderMode storyBorderMode2 = new StoryBorderMode("STORY_SEEN", 1);
        STORY_SEEN = storyBorderMode2;
        StoryBorderMode storyBorderMode3 = new StoryBorderMode("STORY_NEW", 2);
        STORY_NEW = storyBorderMode3;
        StoryBorderMode storyBorderMode4 = new StoryBorderMode("LIVE", 3);
        LIVE = storyBorderMode4;
        StoryBorderMode storyBorderMode5 = new StoryBorderMode("FINISHED_LIVE", 4);
        FINISHED_LIVE = storyBorderMode5;
        StoryBorderMode storyBorderMode6 = new StoryBorderMode("FINISHED_LIVE_SEEN", 5);
        FINISHED_LIVE_SEEN = storyBorderMode6;
        StoryBorderMode storyBorderMode7 = new StoryBorderMode("NONE", 6);
        NONE = storyBorderMode7;
        StoryBorderMode[] storyBorderModeArr = {storyBorderMode, storyBorderMode2, storyBorderMode3, storyBorderMode4, storyBorderMode5, storyBorderMode6, storyBorderMode7};
        $VALUES = storyBorderModeArr;
        $ENTRIES = new asp(storyBorderModeArr);
        Companion = new a();
    }

    public StoryBorderMode() {
        throw null;
    }

    public static StoryBorderMode valueOf(String str) {
        return (StoryBorderMode) Enum.valueOf(StoryBorderMode.class, str);
    }

    public static StoryBorderMode[] values() {
        return (StoryBorderMode[]) $VALUES.clone();
    }
}
