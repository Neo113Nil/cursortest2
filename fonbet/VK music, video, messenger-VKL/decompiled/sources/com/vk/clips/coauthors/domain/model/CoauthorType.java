package com.vk.clips.coauthors.domain.model;

import xsna.asp;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: CoauthorType.kt */
/* loaded from: classes16.dex */
public final class CoauthorType {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ CoauthorType[] $VALUES;
    public static final CoauthorType Community;
    public static final CoauthorType Female;
    public static final CoauthorType Male;

    static {
        CoauthorType coauthorType = new CoauthorType("Male", 0);
        Male = coauthorType;
        CoauthorType coauthorType2 = new CoauthorType("Female", 1);
        Female = coauthorType2;
        CoauthorType coauthorType3 = new CoauthorType("Community", 2);
        Community = coauthorType3;
        CoauthorType[] coauthorTypeArr = {coauthorType, coauthorType2, coauthorType3};
        $VALUES = coauthorTypeArr;
        $ENTRIES = new asp(coauthorTypeArr);
    }

    public CoauthorType() {
        throw null;
    }

    public static CoauthorType valueOf(String str) {
        return (CoauthorType) Enum.valueOf(CoauthorType.class, str);
    }

    public static CoauthorType[] values() {
        return (CoauthorType[]) $VALUES.clone();
    }
}
