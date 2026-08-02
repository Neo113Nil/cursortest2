package com.vk.stories.design.view.stats.tabs.header;

import com.fyber.inneractive.sdk.external.NativeAdContent;
import xsna.asp;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: StoryStatisticsHeaderDiffUtilItemCallback.kt */
/* loaded from: classes6.dex */
public final class HeaderPayload {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ HeaderPayload[] $VALUES;
    public static final HeaderPayload BUTTON_TEXT;
    public static final HeaderPayload TITLE;

    static {
        HeaderPayload headerPayload = new HeaderPayload(NativeAdContent.ViewTag.AD_TITLE, 0);
        TITLE = headerPayload;
        HeaderPayload headerPayload2 = new HeaderPayload("BUTTON_TEXT", 1);
        BUTTON_TEXT = headerPayload2;
        HeaderPayload[] headerPayloadArr = {headerPayload, headerPayload2};
        $VALUES = headerPayloadArr;
        $ENTRIES = new asp(headerPayloadArr);
    }

    public HeaderPayload() {
        throw null;
    }

    public static HeaderPayload valueOf(String str) {
        return (HeaderPayload) Enum.valueOf(HeaderPayload.class, str);
    }

    public static HeaderPayload[] values() {
        return (HeaderPayload[]) $VALUES.clone();
    }
}
