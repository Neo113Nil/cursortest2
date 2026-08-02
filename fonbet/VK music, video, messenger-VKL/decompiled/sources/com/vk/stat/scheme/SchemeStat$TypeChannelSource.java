package com.vk.stat.scheme;

import xsna.asp;
import xsna.pmi0;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: SchemeStat.kt */
/* loaded from: classes5.dex */
public final class SchemeStat$TypeChannelSource {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ SchemeStat$TypeChannelSource[] $VALUES;

    @pmi0("channel")
    public static final SchemeStat$TypeChannelSource CHANNEL;

    @pmi0("feed_recomm")
    public static final SchemeStat$TypeChannelSource FEED_RECOMM;

    @pmi0("folder_recomm")
    public static final SchemeStat$TypeChannelSource FOLDER_RECOMM;

    @pmi0("global_search")
    public static final SchemeStat$TypeChannelSource GLOBAL_SEARCH;

    @pmi0("search")
    public static final SchemeStat$TypeChannelSource SEARCH;

    @pmi0("search_recomm")
    public static final SchemeStat$TypeChannelSource SEARCH_RECOMM;

    static {
        SchemeStat$TypeChannelSource schemeStat$TypeChannelSource = new SchemeStat$TypeChannelSource("SEARCH_RECOMM", 0);
        SEARCH_RECOMM = schemeStat$TypeChannelSource;
        SchemeStat$TypeChannelSource schemeStat$TypeChannelSource2 = new SchemeStat$TypeChannelSource("FOLDER_RECOMM", 1);
        FOLDER_RECOMM = schemeStat$TypeChannelSource2;
        SchemeStat$TypeChannelSource schemeStat$TypeChannelSource3 = new SchemeStat$TypeChannelSource("GLOBAL_SEARCH", 2);
        GLOBAL_SEARCH = schemeStat$TypeChannelSource3;
        SchemeStat$TypeChannelSource schemeStat$TypeChannelSource4 = new SchemeStat$TypeChannelSource("SEARCH", 3);
        SEARCH = schemeStat$TypeChannelSource4;
        SchemeStat$TypeChannelSource schemeStat$TypeChannelSource5 = new SchemeStat$TypeChannelSource("FEED_RECOMM", 4);
        FEED_RECOMM = schemeStat$TypeChannelSource5;
        SchemeStat$TypeChannelSource schemeStat$TypeChannelSource6 = new SchemeStat$TypeChannelSource("CHANNEL", 5);
        CHANNEL = schemeStat$TypeChannelSource6;
        SchemeStat$TypeChannelSource[] schemeStat$TypeChannelSourceArr = {schemeStat$TypeChannelSource, schemeStat$TypeChannelSource2, schemeStat$TypeChannelSource3, schemeStat$TypeChannelSource4, schemeStat$TypeChannelSource5, schemeStat$TypeChannelSource6};
        $VALUES = schemeStat$TypeChannelSourceArr;
        $ENTRIES = new asp(schemeStat$TypeChannelSourceArr);
    }

    private SchemeStat$TypeChannelSource(String str, int i) {
    }

    public static SchemeStat$TypeChannelSource valueOf(String str) {
        return (SchemeStat$TypeChannelSource) Enum.valueOf(SchemeStat$TypeChannelSource.class, str);
    }

    public static SchemeStat$TypeChannelSource[] values() {
        return (SchemeStat$TypeChannelSource[]) $VALUES.clone();
    }
}
