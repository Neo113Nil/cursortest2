package com.vk.profile.community.api.router;

import xsna.asp;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: CommunityMembersSource.kt */
/* loaded from: classes5.dex */
public final class CommunityMembersSource {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ CommunityMembersSource[] $VALUES;
    public static final CommunityMembersSource MARKET;
    public static final CommunityMembersSource MARKETPLACE;

    static {
        CommunityMembersSource communityMembersSource = new CommunityMembersSource("MARKET", 0);
        MARKET = communityMembersSource;
        CommunityMembersSource communityMembersSource2 = new CommunityMembersSource("MARKETPLACE", 1);
        MARKETPLACE = communityMembersSource2;
        CommunityMembersSource[] communityMembersSourceArr = {communityMembersSource, communityMembersSource2};
        $VALUES = communityMembersSourceArr;
        $ENTRIES = new asp(communityMembersSourceArr);
    }

    public CommunityMembersSource() {
        throw null;
    }

    public static CommunityMembersSource valueOf(String str) {
        return (CommunityMembersSource) Enum.valueOf(CommunityMembersSource.class, str);
    }

    public static CommunityMembersSource[] values() {
        return (CommunityMembersSource[]) $VALUES.clone();
    }
}
