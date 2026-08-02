package ru.ozon.app.android.storefront.stories.playstories.presentation.fullscreen.allstories;

import Xc.a;
import Xc.b;
import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"Lru/ozon/app/android/storefront/stories/playstories/presentation/fullscreen/allstories/StoryType;", "", "<init>", "(Ljava/lang/String;I)V", "SET_OF_STORIES", "FROM_LINK", "FROM_LINK_WITHOUT_TRANSITION", "storefront_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class StoryType {
    private static final /* synthetic */ a $ENTRIES;
    private static final /* synthetic */ StoryType[] $VALUES;
    public static final StoryType SET_OF_STORIES = new StoryType("SET_OF_STORIES", 0);
    public static final StoryType FROM_LINK = new StoryType("FROM_LINK", 1);
    public static final StoryType FROM_LINK_WITHOUT_TRANSITION = new StoryType("FROM_LINK_WITHOUT_TRANSITION", 2);

    private static final /* synthetic */ StoryType[] $values() {
        return new StoryType[]{SET_OF_STORIES, FROM_LINK, FROM_LINK_WITHOUT_TRANSITION};
    }

    static {
        StoryType[] $values = $values();
        $VALUES = $values;
        $ENTRIES = b.a($values);
    }

    private StoryType(String str, int i11) {
    }

    public static StoryType valueOf(String str) {
        return (StoryType) Enum.valueOf(StoryType.class, str);
    }

    public static StoryType[] values() {
        return (StoryType[]) $VALUES.clone();
    }
}
