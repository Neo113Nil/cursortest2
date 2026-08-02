package com.vk.clips.reports.impl.data;

import com.fyber.inneractive.sdk.external.NativeAdContent;
import xsna.asp;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: ClipsReportReason.kt */
/* loaded from: classes16.dex */
public final class ClipsReportReason {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ ClipsReportReason[] $VALUES;
    public static final ClipsReportReason CALLS_FOR_BULLYING;
    public static final ClipsReportReason CHILD_PORNO;
    public static final ClipsReportReason DRUGS;
    public static final ClipsReportReason EXTREMISM;
    public static final ClipsReportReason FRAUD;
    public static final ClipsReportReason HOSTILE_REMARKS;
    public static final ClipsReportReason INCLINATION_TO_SUICIDE;
    public static final ClipsReportReason INSULTS;
    public static final ClipsReportReason MISLEADING;
    public static final ClipsReportReason OTHER;
    public static final ClipsReportReason PORNO;
    public static final ClipsReportReason PROFILE_CLONE;
    public static final ClipsReportReason PROFILE_MINE;
    public static final ClipsReportReason PROSTITUTION;
    public static final ClipsReportReason SPAM;
    public static final ClipsReportReason VIOLENCE_AGAINST_PEOPLE_AND_ANIMALS;
    public static final ClipsReportReason WEAPON;
    private final int id;

    static {
        ClipsReportReason clipsReportReason = new ClipsReportReason("SPAM", 0, 0);
        SPAM = clipsReportReason;
        ClipsReportReason clipsReportReason2 = new ClipsReportReason("WEAPON", 1, 11);
        WEAPON = clipsReportReason2;
        ClipsReportReason clipsReportReason3 = new ClipsReportReason("DRUGS", 2, 4);
        DRUGS = clipsReportReason3;
        ClipsReportReason clipsReportReason4 = new ClipsReportReason("PROSTITUTION", 3, 15);
        PROSTITUTION = clipsReportReason4;
        ClipsReportReason clipsReportReason5 = new ClipsReportReason(NativeAdContent.ViewTag.OTHER, 4, 10);
        OTHER = clipsReportReason5;
        ClipsReportReason clipsReportReason6 = new ClipsReportReason("MISLEADING", 5, 9);
        MISLEADING = clipsReportReason6;
        ClipsReportReason clipsReportReason7 = new ClipsReportReason("FRAUD", 6, 12);
        FRAUD = clipsReportReason7;
        ClipsReportReason clipsReportReason8 = new ClipsReportReason("VIOLENCE_AGAINST_PEOPLE_AND_ANIMALS", 7, 13);
        VIOLENCE_AGAINST_PEOPLE_AND_ANIMALS = clipsReportReason8;
        ClipsReportReason clipsReportReason9 = new ClipsReportReason("INSULTS", 8, 6);
        INSULTS = clipsReportReason9;
        ClipsReportReason clipsReportReason10 = new ClipsReportReason("INCLINATION_TO_SUICIDE", 9, 8);
        INCLINATION_TO_SUICIDE = clipsReportReason10;
        ClipsReportReason clipsReportReason11 = new ClipsReportReason("HOSTILE_REMARKS", 10, 27);
        HOSTILE_REMARKS = clipsReportReason11;
        ClipsReportReason clipsReportReason12 = new ClipsReportReason("EXTREMISM", 11, 2);
        EXTREMISM = clipsReportReason12;
        ClipsReportReason clipsReportReason13 = new ClipsReportReason("CALLS_FOR_BULLYING", 12, 10);
        CALLS_FOR_BULLYING = clipsReportReason13;
        ClipsReportReason clipsReportReason14 = new ClipsReportReason("PORNO", 13, 5);
        PORNO = clipsReportReason14;
        ClipsReportReason clipsReportReason15 = new ClipsReportReason("CHILD_PORNO", 14, 1);
        CHILD_PORNO = clipsReportReason15;
        ClipsReportReason clipsReportReason16 = new ClipsReportReason("PROFILE_CLONE", 15, 21);
        PROFILE_CLONE = clipsReportReason16;
        ClipsReportReason clipsReportReason17 = new ClipsReportReason("PROFILE_MINE", 16, 26);
        PROFILE_MINE = clipsReportReason17;
        ClipsReportReason[] clipsReportReasonArr = {clipsReportReason, clipsReportReason2, clipsReportReason3, clipsReportReason4, clipsReportReason5, clipsReportReason6, clipsReportReason7, clipsReportReason8, clipsReportReason9, clipsReportReason10, clipsReportReason11, clipsReportReason12, clipsReportReason13, clipsReportReason14, clipsReportReason15, clipsReportReason16, clipsReportReason17};
        $VALUES = clipsReportReasonArr;
        $ENTRIES = new asp(clipsReportReasonArr);
    }

    public ClipsReportReason(String str, int i, int i2) {
        this.id = i2;
    }

    public static ClipsReportReason valueOf(String str) {
        return (ClipsReportReason) Enum.valueOf(ClipsReportReason.class, str);
    }

    public static ClipsReportReason[] values() {
        return (ClipsReportReason[]) $VALUES.clone();
    }

    public final int h() {
        return this.id;
    }
}
