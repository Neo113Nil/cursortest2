package com.vk.story.viewer.impl.presentation.ideas.ui;

import xsna.asp;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: IdeasStoryAnalytics.kt */
/* loaded from: classes6.dex */
public final class IdeasTeaserEvent {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ IdeasTeaserEvent[] $VALUES;
    public static final IdeasTeaserEvent CLICK_TO_EDIT;
    public static final IdeasTeaserEvent CLICK_TO_HIDE_TEASER;
    public static final IdeasTeaserEvent CLICK_TO_PUBLISH;
    public static final IdeasTeaserEvent VIEW_STORY;

    static {
        IdeasTeaserEvent ideasTeaserEvent = new IdeasTeaserEvent("VIEW_STORY", 0);
        VIEW_STORY = ideasTeaserEvent;
        IdeasTeaserEvent ideasTeaserEvent2 = new IdeasTeaserEvent("CLICK_TO_PUBLISH", 1);
        CLICK_TO_PUBLISH = ideasTeaserEvent2;
        IdeasTeaserEvent ideasTeaserEvent3 = new IdeasTeaserEvent("CLICK_TO_EDIT", 2);
        CLICK_TO_EDIT = ideasTeaserEvent3;
        IdeasTeaserEvent ideasTeaserEvent4 = new IdeasTeaserEvent("CLICK_TO_HIDE_TEASER", 3);
        CLICK_TO_HIDE_TEASER = ideasTeaserEvent4;
        IdeasTeaserEvent[] ideasTeaserEventArr = {ideasTeaserEvent, ideasTeaserEvent2, ideasTeaserEvent3, ideasTeaserEvent4};
        $VALUES = ideasTeaserEventArr;
        $ENTRIES = new asp(ideasTeaserEventArr);
    }

    public IdeasTeaserEvent() {
        throw null;
    }

    public static IdeasTeaserEvent valueOf(String str) {
        return (IdeasTeaserEvent) Enum.valueOf(IdeasTeaserEvent.class, str);
    }

    public static IdeasTeaserEvent[] values() {
        return (IdeasTeaserEvent[]) $VALUES.clone();
    }
}
