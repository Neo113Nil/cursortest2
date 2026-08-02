package com.vk.profile.community.members.api;

import ru.ok.android.webrtc.Privacy;
import xsna.asp;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: CommunityMembersFilter.kt */
/* loaded from: classes5.dex */
public final class CommunityMembersFilter {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ CommunityMembersFilter[] $VALUES;
    public static final CommunityMembersFilter ALL;
    public static final CommunityMembersFilter DONUT;
    public static final CommunityMembersFilter FRIENDS;
    public static final CommunityMembersFilter UNSURE;

    static {
        CommunityMembersFilter communityMembersFilter = new CommunityMembersFilter("ALL", 0);
        ALL = communityMembersFilter;
        CommunityMembersFilter communityMembersFilter2 = new CommunityMembersFilter(Privacy.FRIENDS, 1);
        FRIENDS = communityMembersFilter2;
        CommunityMembersFilter communityMembersFilter3 = new CommunityMembersFilter("UNSURE", 2);
        UNSURE = communityMembersFilter3;
        CommunityMembersFilter communityMembersFilter4 = new CommunityMembersFilter("DONUT", 3);
        DONUT = communityMembersFilter4;
        CommunityMembersFilter[] communityMembersFilterArr = {communityMembersFilter, communityMembersFilter2, communityMembersFilter3, communityMembersFilter4};
        $VALUES = communityMembersFilterArr;
        $ENTRIES = new asp(communityMembersFilterArr);
    }

    public CommunityMembersFilter() {
        throw null;
    }

    public static CommunityMembersFilter valueOf(String str) {
        return (CommunityMembersFilter) Enum.valueOf(CommunityMembersFilter.class, str);
    }

    public static CommunityMembersFilter[] values() {
        return (CommunityMembersFilter[]) $VALUES.clone();
    }
}
