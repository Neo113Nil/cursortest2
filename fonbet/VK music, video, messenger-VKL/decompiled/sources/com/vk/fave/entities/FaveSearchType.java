package com.vk.fave.entities;

import com.vk.stat.scheme.MobileOfficialAppsCoreNavStat$EventScreen;
import com.vkontakte.android.R;
import xsna.asp;
import xsna.qsq;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: FaveSearchType.kt */
/* loaded from: classes18.dex */
public final class FaveSearchType implements qsq {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ FaveSearchType[] $VALUES;
    public static final a Companion;
    public static final FaveSearchType FAVE_COMMUNITY;
    public static final FaveSearchType FAVE_PEOPLE;
    private final MobileOfficialAppsCoreNavStat$EventScreen screen;
    private final int searchHint;
    private final String serverName;
    private final int titleId;

    /* compiled from: FaveSearchType.kt */
    public static final class a {
    }

    static {
        FaveSearchType faveSearchType = new FaveSearchType("FAVE_PEOPLE", 0, R.string.fave_people_title, "users", R.string.search_people, MobileOfficialAppsCoreNavStat$EventScreen.FAVE_PEOPLE);
        FAVE_PEOPLE = faveSearchType;
        FaveSearchType faveSearchType2 = new FaveSearchType("FAVE_COMMUNITY", 1, R.string.fave_community_title, "groups", R.string.search_communities, MobileOfficialAppsCoreNavStat$EventScreen.FAVE_GROUPS);
        FAVE_COMMUNITY = faveSearchType2;
        FaveSearchType[] faveSearchTypeArr = {faveSearchType, faveSearchType2};
        $VALUES = faveSearchTypeArr;
        $ENTRIES = new asp(faveSearchTypeArr);
        Companion = new a();
    }

    public FaveSearchType(String str, int i, int i2, String str2, int i3, MobileOfficialAppsCoreNavStat$EventScreen mobileOfficialAppsCoreNavStat$EventScreen) {
        this.titleId = i2;
        this.serverName = str2;
        this.searchHint = i3;
        this.screen = mobileOfficialAppsCoreNavStat$EventScreen;
    }

    public static FaveSearchType valueOf(String str) {
        return (FaveSearchType) Enum.valueOf(FaveSearchType.class, str);
    }

    public static FaveSearchType[] values() {
        return (FaveSearchType[]) $VALUES.clone();
    }

    @Override // xsna.qsq
    public final String h() {
        return this.serverName;
    }

    public final MobileOfficialAppsCoreNavStat$EventScreen i() {
        return this.screen;
    }

    public final int j() {
        return this.searchHint;
    }
}
