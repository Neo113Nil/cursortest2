package com.vk.clips.viewer.edit.presentation.model.coauthors;

import xsna.asp;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: CoauthorsBannerVS.kt */
/* loaded from: classes17.dex */
public final class CoauthorsBannerVS {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ CoauthorsBannerVS[] $VALUES;
    public static final CoauthorsBannerVS ClosedClip;
    public static final CoauthorsBannerVS ClosedGroupWithCoauthors;
    public static final CoauthorsBannerVS ClosedGroupWithoutCoauthors;
    public static final CoauthorsBannerVS ClosedProfileWithCoauthors;
    public static final CoauthorsBannerVS ClosedProfileWithoutCoauthors;
    public static final CoauthorsBannerVS None;

    static {
        CoauthorsBannerVS coauthorsBannerVS = new CoauthorsBannerVS("ClosedProfileWithoutCoauthors", 0);
        ClosedProfileWithoutCoauthors = coauthorsBannerVS;
        CoauthorsBannerVS coauthorsBannerVS2 = new CoauthorsBannerVS("ClosedProfileWithCoauthors", 1);
        ClosedProfileWithCoauthors = coauthorsBannerVS2;
        CoauthorsBannerVS coauthorsBannerVS3 = new CoauthorsBannerVS("ClosedGroupWithoutCoauthors", 2);
        ClosedGroupWithoutCoauthors = coauthorsBannerVS3;
        CoauthorsBannerVS coauthorsBannerVS4 = new CoauthorsBannerVS("ClosedGroupWithCoauthors", 3);
        ClosedGroupWithCoauthors = coauthorsBannerVS4;
        CoauthorsBannerVS coauthorsBannerVS5 = new CoauthorsBannerVS("ClosedClip", 4);
        ClosedClip = coauthorsBannerVS5;
        CoauthorsBannerVS coauthorsBannerVS6 = new CoauthorsBannerVS("None", 5);
        None = coauthorsBannerVS6;
        CoauthorsBannerVS[] coauthorsBannerVSArr = {coauthorsBannerVS, coauthorsBannerVS2, coauthorsBannerVS3, coauthorsBannerVS4, coauthorsBannerVS5, coauthorsBannerVS6};
        $VALUES = coauthorsBannerVSArr;
        $ENTRIES = new asp(coauthorsBannerVSArr);
    }

    public CoauthorsBannerVS() {
        throw null;
    }

    public static CoauthorsBannerVS valueOf(String str) {
        return (CoauthorsBannerVS) Enum.valueOf(CoauthorsBannerVS.class, str);
    }

    public static CoauthorsBannerVS[] values() {
        return (CoauthorsBannerVS[]) $VALUES.clone();
    }
}
