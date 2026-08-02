package com.vk.stories.design.view.stats.tabs.viewers.adapter;

import xsna.asp;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: ViewersUserDiffUtilItemCallback.kt */
/* loaded from: classes6.dex */
public final class ViewerPayload {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ ViewerPayload[] $VALUES;
    public static final ViewerPayload AVATAR;
    public static final ViewerPayload FULL_NAME;
    public static final ViewerPayload OPTIONS;
    public static final ViewerPayload REACTION;
    public static final ViewerPayload VIEWING;

    static {
        ViewerPayload viewerPayload = new ViewerPayload("FULL_NAME", 0);
        FULL_NAME = viewerPayload;
        ViewerPayload viewerPayload2 = new ViewerPayload("AVATAR", 1);
        AVATAR = viewerPayload2;
        ViewerPayload viewerPayload3 = new ViewerPayload("REACTION", 2);
        REACTION = viewerPayload3;
        ViewerPayload viewerPayload4 = new ViewerPayload("VIEWING", 3);
        VIEWING = viewerPayload4;
        ViewerPayload viewerPayload5 = new ViewerPayload("OPTIONS", 4);
        OPTIONS = viewerPayload5;
        ViewerPayload[] viewerPayloadArr = {viewerPayload, viewerPayload2, viewerPayload3, viewerPayload4, viewerPayload5};
        $VALUES = viewerPayloadArr;
        $ENTRIES = new asp(viewerPayloadArr);
    }

    public ViewerPayload() {
        throw null;
    }

    public static ViewerPayload valueOf(String str) {
        return (ViewerPayload) Enum.valueOf(ViewerPayload.class, str);
    }

    public static ViewerPayload[] values() {
        return (ViewerPayload[]) $VALUES.clone();
    }
}
