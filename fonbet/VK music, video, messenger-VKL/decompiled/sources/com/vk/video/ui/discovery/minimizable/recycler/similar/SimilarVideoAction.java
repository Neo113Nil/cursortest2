package com.vk.video.ui.discovery.minimizable.recycler.similar;

import xsna.asp;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: SimilarVideoAction.kt */
/* loaded from: classes7.dex */
public final class SimilarVideoAction {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ SimilarVideoAction[] $VALUES;
    public static final SimilarVideoAction AvatarClick;
    public static final SimilarVideoAction MoreClick;
    public static final SimilarVideoAction OpenVideo;

    static {
        SimilarVideoAction similarVideoAction = new SimilarVideoAction("OpenVideo", 0);
        OpenVideo = similarVideoAction;
        SimilarVideoAction similarVideoAction2 = new SimilarVideoAction("MoreClick", 1);
        MoreClick = similarVideoAction2;
        SimilarVideoAction similarVideoAction3 = new SimilarVideoAction("AvatarClick", 2);
        AvatarClick = similarVideoAction3;
        SimilarVideoAction[] similarVideoActionArr = {similarVideoAction, similarVideoAction2, similarVideoAction3};
        $VALUES = similarVideoActionArr;
        $ENTRIES = new asp(similarVideoActionArr);
    }

    public SimilarVideoAction() {
        throw null;
    }

    public static SimilarVideoAction valueOf(String str) {
        return (SimilarVideoAction) Enum.valueOf(SimilarVideoAction.class, str);
    }

    public static SimilarVideoAction[] values() {
        return (SimilarVideoAction[]) $VALUES.clone();
    }
}
