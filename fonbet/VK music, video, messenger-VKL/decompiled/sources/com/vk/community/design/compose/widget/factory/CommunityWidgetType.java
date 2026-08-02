package com.vk.community.design.compose.widget.factory;

import xsna.asp;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: CommunityWidgetType.kt */
/* loaded from: classes17.dex */
public final class CommunityWidgetType {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ CommunityWidgetType[] $VALUES;
    public static final CommunityWidgetType COMPACT_LIST;
    public static final CommunityWidgetType COVER_LIST;
    public static final CommunityWidgetType DONATION;
    public static final CommunityWidgetType LIST;
    public static final CommunityWidgetType MATCH;
    public static final CommunityWidgetType MATCHES;
    public static final CommunityWidgetType TABLE;
    public static final CommunityWidgetType TEXT;
    public static final CommunityWidgetType TILES;

    static {
        CommunityWidgetType communityWidgetType = new CommunityWidgetType("LIST", 0);
        LIST = communityWidgetType;
        CommunityWidgetType communityWidgetType2 = new CommunityWidgetType("COMPACT_LIST", 1);
        COMPACT_LIST = communityWidgetType2;
        CommunityWidgetType communityWidgetType3 = new CommunityWidgetType("COVER_LIST", 2);
        COVER_LIST = communityWidgetType3;
        CommunityWidgetType communityWidgetType4 = new CommunityWidgetType("TABLE", 3);
        TABLE = communityWidgetType4;
        CommunityWidgetType communityWidgetType5 = new CommunityWidgetType("MATCH", 4);
        MATCH = communityWidgetType5;
        CommunityWidgetType communityWidgetType6 = new CommunityWidgetType("MATCHES", 5);
        MATCHES = communityWidgetType6;
        CommunityWidgetType communityWidgetType7 = new CommunityWidgetType("TILES", 6);
        TILES = communityWidgetType7;
        CommunityWidgetType communityWidgetType8 = new CommunityWidgetType("DONATION", 7);
        DONATION = communityWidgetType8;
        CommunityWidgetType communityWidgetType9 = new CommunityWidgetType("TEXT", 8);
        TEXT = communityWidgetType9;
        CommunityWidgetType[] communityWidgetTypeArr = {communityWidgetType, communityWidgetType2, communityWidgetType3, communityWidgetType4, communityWidgetType5, communityWidgetType6, communityWidgetType7, communityWidgetType8, communityWidgetType9};
        $VALUES = communityWidgetTypeArr;
        $ENTRIES = new asp(communityWidgetTypeArr);
    }

    public CommunityWidgetType() {
        throw null;
    }

    public static CommunityWidgetType valueOf(String str) {
        return (CommunityWidgetType) Enum.valueOf(CommunityWidgetType.class, str);
    }

    public static CommunityWidgetType[] values() {
        return (CommunityWidgetType[]) $VALUES.clone();
    }
}
